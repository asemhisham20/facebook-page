package com.example.demofirstsession;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
public class AdapterStory extends RecyclerView.Adapter<AdapterStory.StoryViewHolder> {
    List<Story> Stories;

    AdapterStory(List<Story>stories){
        this.Stories=stories;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_story,parent,false);

        return new StoryViewHolder(view);
    }



    @Override
    public void onBindViewHolder(StoryViewHolder holder, int position) {
        Story story= Stories.get(position);
        holder.nametext1.setText(story.name);
        holder.storyImage.setImageResource(story.storyImageId);
        holder.profileImage.setImageResource(story.profileImageid);

    }

    @Override
    public int getItemCount() {
        return Stories==null?0:Stories.size();
    }

    class StoryViewHolder extends RecyclerView.ViewHolder{
       TextView nametext1;
       ImageView storyImage,profileImage;
        public StoryViewHolder(View storyview){
            super(storyview);
            nametext1=storyview.findViewById(R.id.nametext);
            storyImage=storyview.findViewById(R.id.shika);
            profileImage=storyview.findViewById(R.id.asem);

        }
    }




}
