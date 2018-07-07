package com.example.bejust.androidmeals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private EditText mSearchField;
    private ImageButton mSearchButton;
    private RecyclerView mResultList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchField = (EditText)findViewById(R.id.search_field);
        mSearchButton = (ImageButton)findViewById(R.id.search_btn);

        mResultList = (RecyclerView)findViewById(R.id.resultList);
    }

    public class MealsViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public MealsViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
        }
        
    }
}
