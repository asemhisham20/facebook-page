package com.example.demofirstsession;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPost extends RecyclerView.Adapter<AdapterPost.postViewHolder>{
    List<Post> posts;
    AdapterPost(List<Post>posts){
        this.posts=posts;
    }

    @NonNull
    @Override
    public postViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
View view= LayoutInflater.from(parent.getContext())
        .inflate(R.layout.activity_main,parent,false);
        postViewHolder postViewHolder= new postViewHolder(view);

        return postViewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull postViewHolder holder, int position) {
Post post= posts.get(position);
        holder.tv_name.setText(post.getNameText());
        holder.tv_time.setText(post.getDateText());
        holder.tv_post.setText(post.getPostText());
        holder.tv_comments.setText(post.getCommentButton()+" comments");
        holder.tv_likes.setText(post.getLikeButton()+ " likes");
    }

    @Override
    public int getItemCount() {
        return posts==null?0:posts.size();
    }

    class postViewHolder extends RecyclerView.ViewHolder{
TextView tv_name,tv_time,tv_likes,tv_comments,tv_post;
ImageView profilepicture;
        public postViewHolder(View postview){
            super(postview);
            tv_name=postview.findViewById(R.id.usernameTextView);
            tv_time=postview.findViewById(R.id.date);
            tv_post=postview.findViewById(R.id.postImageView);
            tv_comments=postview.findViewById(R.id.commentcount);
            tv_likes=postview.findViewById(R.id.likeCountTextView);
            profilepicture=postview.findViewById(R.id.profileimage);
        }
    }


}
