package com.suai.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.suai.myapplication.adapter.CourseAdapter;
import com.suai.myapplication.model.Course;

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
        courseList.add(new Course(1,"java_2", "Человек без сознания","#424345", "Обморок - потеря сознания,\n" +
                "        но не более 2 минут!"+ "\n1. Проверить наличие дыхания!\n" +
                "                2. Если человек дышит - обеспечить проходимость дыхательных путей:\n" +
                "        \nперевести в “стабильное боковое пложение;”\n" +
                "        \nили удержать приподнятым подбородок;\n"+"\nЧЕЛОВЕК НЕ ПРИШЕЛ В СЕБЯ - вызвать СКОРУЮ!\n" +
                "\nЧеловек вернулся в сознание - напоить крепким,\n сладким чаем."));
        courseList.add(new Course(2,"handymen", "Человек не дышит","#9FA52D","НЕМЕДЛЕННО ПРИСТУПАЙТЕ \nК СЕРДЕЧНО-ЛЕГОЧНОЙ РЕАНИМАЦИИ"+ "\n1. Позвони в скорую;\n" +
                "    \n2. 30 нажатий на грудную клетку пострадавшего \nпрямыми руками;\n" +
                "    \n3. 2 искуственных вдоха."+"\nРеанимацию можно прекратить:\n" +
                "    \n1. Если прибыла скорая помощь;\n" +
                "    \n2. Если появились явные признаки жизни;\n" +
                "    \n3. В случае усталости, необходимо подмениться \n" +
                "       \n для продолжения реанимации."));
        courseList.add(new Course(3,"inordinate", "Что-то застряло в горле","#C03A3A","ДЛЯ ОКАЗАНИЯ ПОМОЩИ У ВАС 3-5 МИНУТ!\n"+"\n1.Ударьте несколько раз раскрытой ладонью\n в межлопаточную область.\n" +
                "    \n2. В случае отсутствия эффекта встаньте за спиной \nу пострадавшего," +
                "    обхватите его \nруками, чтобы руки были сложены в замок \nи находились" +
                "   у пострадавшего над \nподложечной областью.\n"+"\nЕсли больной без сознания, \nпереверните его на спину и \nрезко надавите на подложечную область."));
        courseList.add(new Course(4,"blood", "Кровь \nне останавливается","#6A2C59","test"));
        courseList.add(new Course(5,"trauma", "Травма какой-либо части\n тела","#15138D","test"));
        courseList.add(new Course(6,"hogged", "Ожог или тепловое\n излучение","#5F2D2D","test"));
        courseList.add(new Course(7,"smoothening", "Отморожение и воздействие\n низких температур","#2E0837","test"));
        courseList.add(new Course(8,"contravention", "Съел/выпил \nчто-то не то","#926D00","test"));

        setCourseRecycler(courseList);
    }

    @SuppressLint("WrongViewCast")
    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL, false);

        coursesRecycler = findViewById(R.id.courseRecycler);
        coursesRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        coursesRecycler.setAdapter(courseAdapter);
    }
}