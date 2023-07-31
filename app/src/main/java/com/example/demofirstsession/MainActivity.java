package com.example.demofirstsession;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView  postRecyclerview,storyRecyclerview;
AdapterPost adapterpost;
AdapterStory adapterstory;
    List<Post> Posts;
    List<Story>stories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recyclerview);
        postRecyclerview=findViewById(R.id.rv_post);
        creatpost();
        adapterpost= new AdapterPost(Posts);
        postRecyclerview.setAdapter(adapterpost);
      RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
      postRecyclerview.setLayoutManager(layoutManager);



        storyRecyclerview=findViewById(R.id.story);
        createstory();
        adapterstory= new AdapterStory(stories);
        storyRecyclerview.setAdapter(adapterstory);
        RecyclerView.LayoutManager layoutManager1= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);;
       storyRecyclerview.setLayoutManager(layoutManager1);
    }


    void creatpost(){
Posts = new ArrayList<>();
for (int i=0;i<100;++i){
Posts.add(new Post(1,R.drawable.asemphoto2,"5","4","وَأَن لَّيْسَ لِلإِنسَانِ إِلاَّ مَا سَعَى (٤٠)وَأَنَّ سَعْيَهُ سَوْفَ يُرَى  (٤١)ثُمَّ يُجْزَاهُ الْجَزَاء الأَوْفَى(٤٢)وَأَنَّ إِلَى رَبِّكَ الْمُنتَهَى(٤٣)" , "Asem Hisham"," 13 December 2021"));
}

    }
    void createstory(){

stories=new ArrayList<>();
for (int i=0;i<100;i+=3){
    stories.add(new Story("Asem Hisham",R.drawable.asemphoto2,R.drawable.asemphoto2));
    stories.add(new Story("Mahmoud Abdelhakam",R.drawable.hakmo2,R.drawable.hakom));
    stories.add(new Story("Mohamed Elattar",R.drawable.elattar2,R.drawable.design));
}
    }
}