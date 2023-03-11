package com.suai.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.suai.myapplication.adapter.CourseAdapter;
import com.suai.myapplication.model.Course;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView coursesRecycler;
    CourseAdapter courseAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "java_2", "Человек без сознания", "#424345", "test"));
        courseList.add(new Course(2, "handymen", "Человек не дышит", "#9FA52D", "test"));
        courseList.add(new Course(3, "inordinate", "Что-то застряло в горле", "#C03A3A", "test"));
        courseList.add(new Course(4, "blood", "Кровь \nне останавливается", "#6A2C59", "test"));
        courseList.add(new Course(5, "trauma", "Травма какой-либо части\n тела", "#15138D", "test"));
        courseList.add(new Course(6, "hogged", "Ожог или тепловое\n излучение", "#5F2D2D", "test"));
        courseList.add(new Course(7, "smoothening", "Отморожение и воздействие\n низких температур", "#2E0837", "test"));
        courseList.add(new Course(8, "contravention", "Съел/выпил \nчто-то не то", "#926D00", "test"));

        try {
            setCourseRecycler(courseList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressLint("WrongViewCast")
    private void setCourseRecycler(List<Course> courseList) throws IOException {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        coursesRecycler = findViewById(R.id.courseRecycler);
        coursesRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        coursesRecycler.setAdapter(courseAdapter);


    }
}