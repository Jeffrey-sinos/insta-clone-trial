package com.example.instaclone;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView rvUsers, rvPosts;
    private UserAdapter userAdapter;
    private PostAdapter postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Set up Users RecyclerView
        rvUsers = findViewById(R.id.rvUsers);
        rvUsers.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<User> userList = new ArrayList<>();
        userList.add(new User("John_maina", R.drawable.profile));
        userList.add(new User("JR", R.drawable.ic_profile));
        userAdapter = new UserAdapter(userList);
        rvUsers.setAdapter(userAdapter);

        // Set up Posts RecyclerView
        rvPosts = findViewById(R.id.rvPosts);
        rvPosts.setLayoutManager(new LinearLayoutManager(this));
        List<Post> postList = new ArrayList<>();
        postList.add(new Post("JR", R.drawable.ic_profile, R.drawable.vacation));
        postList.add(new Post("John_maina", R.drawable.profile, R.drawable.fine_dining));
        postAdapter = new PostAdapter(postList);
        rvPosts.setAdapter(postAdapter);
    }
}