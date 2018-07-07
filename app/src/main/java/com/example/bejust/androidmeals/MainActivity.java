package com.example.bejust.androidmeals;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class MainActivity extends AppCompatActivity {
    private EditText mSearchField;
    private ImageButton mSearchButton;
    private RecyclerView mResultList;
    private DatabaseReference MealsDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MealsDatabase = FirebaseDatabase.getInstance().getReference("meals");
        mSearchField = (EditText)findViewById(R.id.search_field);
        mSearchButton = (ImageButton)findViewById(R.id.search_btn);
        mResultList = (RecyclerView)findViewById(R.id.resultList);
        mResultList.setHasFixedSize(true);
        mResultList.setLayoutManager(new LinearLayoutManager(this));

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String searchText = mSearchField.getText().toString();

                firebaseMealSearch(searchText);
            }
        });
    }

    private void firebaseMealSearch(String searchText) {

        Toast.makeText(MainActivity.this,"Started Search", Toast.LENGTH_LONG).show();

        Query firebaseSearchQuery = MealsDatabase.orderByChild("strMeal").startAt(searchText).endAt(searchText + "\uf8ff");

        FirebaseRecyclerAdapter<Meal,MealsViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Meal, MealsViewHolder>(Meal.class,
                R.layout.list_layout,MealsViewHolder.class,firebaseSearchQuery) {

            @Override
            protected void populateViewHolder(MealsViewHolder viewHolder, Meal model, int position) {
                viewHolder.setDetails(getApplicationContext(),model.getstrMeal(), model.getstrCategory(), model.getstrArea(), model.getstrTags(),model.getstrYoutube(), model.getstrMealThumb(),model.getstrInstructions(),model.getstrIngredient1());

            }
        };
        mResultList.setAdapter(firebaseRecyclerAdapter);
    }

    public static class MealsViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public MealsViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
        }

        public void setDetails(Context ctx, String mealName, String mealCategory, String mealArea, String mealTags, String mealYoutube, String mealImage, String mealInstructions, String mealIngredient1) {
            TextView meal_name = (TextView)mView.findViewById(R.id.mealName);
            TextView meal_category = (TextView)mView.findViewById(R.id.mealCategory);
            TextView meal_area = (TextView)mView.findViewById(R.id.mealArea);
            TextView meal_tags = (TextView)mView.findViewById(R.id.mealTags);
            TextView meal_youtube = (TextView)mView.findViewById(R.id.mealYoutube);
            ImageView meal_image = (ImageView)mView.findViewById(R.id.mealImage);
            TextView meal_instructions = (TextView)mView.findViewById(R.id.mealInstructions);
            TextView meal_ingredients = (TextView)mView.findViewById(R.id.mealIngredients);

            meal_name.setText(mealName);
            meal_category.setText(mealCategory);
            meal_area.setText(mealArea);
            meal_tags.setText(mealTags);
            meal_youtube.setText(mealYoutube);
            meal_instructions.setText(mealInstructions);
            meal_ingredients.setText(mealIngredient1);
            Glide.with(ctx).load(mealImage).into(meal_image);
        }

    }
}
