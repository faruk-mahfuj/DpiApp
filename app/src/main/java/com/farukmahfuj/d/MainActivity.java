package com.farukmahfuj.d;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.d.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CheckBox sixty_three, sixty_five, sixty_six, sixty_seven, sixty_eight, sixty_nine, seventy, seventy_one, seventy_two, seventy_three, seventy_four, seventy_five,
            seventy_six, seventy_seven, seventy_eight, seventy_nine, eighty, eighty_two, eighty_three, eighty_four, eighty_five, eighty_six, eighty_seven,
            eighty_eight, eighty_nine, ninety, ninety_one, ninety_two, ninety_three, ninety_four, ninety_five, ninety_six, ninety_seven, ninety_eight, ninety_nine, hundred,
            one_hundred_one, one_hundred_two, one_hundred_three, one_hundred_four, one_hundred_five, one_hundred_six, one_hundred_seven, one_hundred_eight, one, two, three,
            four, five, six, seven, eight, nine, eleven, twelve, thirteen, fourteen, fifteen, seventeen, eighteen;
    private TextView result;
    private ArrayList<String> mresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tvid);
        String text = "Student Attendance";

        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fcsMain = new ForegroundColorSpan(Color.rgb(237,
                28,
                36
        ));

        ss.setSpan(fcsMain, 0, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);

//        ----------------------------->>>
//                <<<-----------------------
//                        --------------->>>


        sixty_three = findViewById(R.id.sixty_three);
        sixty_five = findViewById(R.id.sixty_five);
        sixty_six = findViewById(R.id.sixty_six);
        sixty_seven = findViewById(R.id.sixty_seven);
        sixty_eight = findViewById(R.id.sixty_eight);
        sixty_nine = findViewById(R.id.sixty_nine);
        seventy = findViewById(R.id.seventy);
        seventy_one = findViewById(R.id.seventy_one);
        seventy_two = findViewById(R.id.seventy_two);
        seventy_three = findViewById(R.id.seventy_three);
        seventy_four = findViewById(R.id.seventy_four);
        seventy_five = findViewById(R.id.seventy_five);
        seventy_six = findViewById(R.id.seventy_six);
        seventy_seven = findViewById(R.id.seventy_seven);
        seventy_eight = findViewById(R.id.seventy_eight);
        seventy_nine = findViewById(R.id.seventy_nine);
        eighty = findViewById(R.id.eighty);
        eighty_two = findViewById(R.id.eighty_two);
        eighty_three = findViewById(R.id.eighty_three);
        eighty_four = findViewById(R.id.eighty_four);
        eighty_five = findViewById(R.id.eighty_five);
        eighty_six = findViewById(R.id.eighty_six);
        eighty_seven = findViewById(R.id.eighty_seven);
        eighty_eight = findViewById(R.id.eighty_eight);
        eighty_nine = findViewById(R.id.eighty_nine);
        ninety = findViewById(R.id.ninety);
        ninety_one = findViewById(R.id.ninety_one);
        ninety_two = findViewById(R.id.ninety_two);
        ninety_three = findViewById(R.id.ninety_three);
        ninety_four = findViewById(R.id.ninety_four);
        ninety_five = findViewById(R.id.ninety_five);
        ninety_six = findViewById(R.id.ninety_six);
        ninety_seven = findViewById(R.id.ninety_seven);
        ninety_eight = findViewById(R.id.ninety_eight);
        ninety_nine = findViewById(R.id.ninety_nine);
        hundred = findViewById(R.id.hundred);
        one_hundred_one = findViewById(R.id.one_hundred_one);
        one_hundred_two = findViewById(R.id.one_hundred_two);
        one_hundred_three = findViewById(R.id.one_hundred_three);
        one_hundred_four = findViewById(R.id.one_hundred_four);
        one_hundred_five = findViewById(R.id.one_hundred_five);
        one_hundred_six = findViewById(R.id.one_hundred_six);
        one_hundred_seven = findViewById(R.id.one_hundred_seven);
        one_hundred_eight = findViewById(R.id.one_hundred_eight);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        eleven = findViewById(R.id.eleven);
        twelve = findViewById(R.id.twelve);
        thirteen = findViewById(R.id.thirteen);
        fourteen = findViewById(R.id.fourteen);
        fifteen = findViewById(R.id.fifteen);
        seventeen = findViewById(R.id.seventeen);
        eighteen = findViewById(R.id.eighteen);


        Button result_btn = findViewById(R.id.result_btn);
        Button share_btn = findViewById(R.id.share_btn);
        result = findViewById(R.id.result);

        mresult = new ArrayList<>();
        result.setEnabled(false);


//        ----------------------------->>>
//                <<<-----------------------
//                        --------------->>>

        sixty_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sixty_three.isChecked())
                    mresult.add("2116-402-63");
                else
                    mresult.remove("2116-402-63");
            }
        });

        sixty_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sixty_five.isChecked())
                    mresult.add("2116-402-65");
                else
                    mresult.remove("2116-402-65");
            }
        });

        sixty_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sixty_six.isChecked())
                    mresult.add("2116-402-66");
                else
                    mresult.remove("2116-402-66");
            }
        });

        sixty_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sixty_seven.isChecked())
                    mresult.add("2116-402-67");
                else
                    mresult.remove("2116-402-67");
            }
        });

        sixty_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sixty_eight.isChecked())
                    mresult.add("2116-402-68");
                else
                    mresult.remove("2116-402-68");
            }
        });

        sixty_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sixty_nine.isChecked())
                    mresult.add("2116-402-69");
                else
                    mresult.remove("2116-402-69");
            }
        });

        seventy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventy.isChecked())
                    mresult.add("2116-402-70");
                else
                    mresult.remove("2116-402-70");
            }
        });

        seventy_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventy_one.isChecked())
                    mresult.add("2116-402-71");
                else
                    mresult.remove("2116-402-71");
            }
        });

        seventy_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventy_two.isChecked())
                    mresult.add("2116-402-72");
                else
                    mresult.remove("2116-402-72");
            }
        });

        seventy_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventy_three.isChecked())
                    mresult.add("2116-402-73");
                else
                    mresult.remove("2116-402-73");
            }
        });

        seventy_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventy_four.isChecked())
                    mresult.add("2116-402-74");
                else
                    mresult.remove("2116-402-74");
            }
        });

        seventy_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventy_five.isChecked())
                    mresult.add("2116-402-75");
                else
                    mresult.remove("2116-402-75");
            }
        });

        seventy_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventy_six.isChecked())
                    mresult.add("2116-402-76");
                else
                    mresult.remove("2116-402-76");
            }
        });

        seventy_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventy_seven.isChecked())
                    mresult.add("2116-402-77");
                else
                    mresult.remove("2116-402-77");
            }
        });

        seventy_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventy_eight.isChecked())
                    mresult.add("2116-402-78");
                else
                    mresult.remove("2116-402-78");
            }
        });

        seventy_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventy_nine.isChecked())
                    mresult.add("2116-402-79");
                else
                    mresult.remove("2116-402-79");
            }
        });

        eighty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eighty.isChecked())
                    mresult.add("2116-402-80");
                else
                    mresult.remove("2116-402-80");
            }
        });

        eighty_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eighty_two.isChecked())
                    mresult.add("2116-402-82");
                else
                    mresult.remove("2116-402-82");
            }
        });

        eighty_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eighty_three.isChecked())
                    mresult.add("2116-402-83");
                else
                    mresult.remove("2116-402-83");
            }
        });

        eighty_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eighty_four.isChecked())
                    mresult.add("2116-402-84");
                else
                    mresult.remove("2116-402-84");
            }
        });

        eighty_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eighty_five.isChecked())
                    mresult.add("2116-402-85");
                else
                    mresult.remove("2116-402-85");
            }
        });

        eighty_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eighty_six.isChecked())
                    mresult.add("2116-402-86");
                else
                    mresult.remove("2116-402-86");
            }
        });

        eighty_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eighty_seven.isChecked())
                    mresult.add("2116-402-87");
                else
                    mresult.remove("2116-402-87");
            }
        });

        eighty_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eighty_eight.isChecked())
                    mresult.add("2116-402-88");
                else
                    mresult.remove("2116-402-88");
            }
        });

        eighty_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eighty_nine.isChecked())
                    mresult.add("2116-402-89");
                else
                    mresult.remove("2116-402-89");
            }
        });

        ninety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninety.isChecked())
                    mresult.add("2116-402-90");
                else
                    mresult.remove("2116-402-90");
            }
        });

        ninety_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninety_one.isChecked())
                    mresult.add("2116-402-91");
                else
                    mresult.remove("2116-402-91");
            }
        });

        ninety_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninety_two.isChecked())
                    mresult.add("2116-402-92");
                else
                    mresult.remove("2116-402-92");
            }
        });

        ninety_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninety_three.isChecked())
                    mresult.add("2116-402-93");
                else
                    mresult.remove("2116-402-93");
            }
        });

        ninety_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninety_four.isChecked())
                    mresult.add("2116-402-94");
                else
                    mresult.remove("2116-402-94");
            }
        });

        ninety_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninety_five.isChecked())
                    mresult.add("2116-402-95");
                else
                    mresult.remove("2116-402-95");
            }
        });

        ninety_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninety_six.isChecked())
                    mresult.add("2116-402-96");
                else
                    mresult.remove("2116-402-96");
            }
        });

        ninety_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninety_seven.isChecked())
                    mresult.add("2116-402-97");
                else
                    mresult.remove("2116-402-97");
            }
        });

        ninety_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninety_eight.isChecked())
                    mresult.add("2116-402-98");
                else
                    mresult.remove("2116-402-98");
            }
        });

        ninety_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ninety_nine.isChecked())
                    mresult.add("2116-402-99");
                else
                    mresult.remove("2116-402-99");
            }
        });

        hundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hundred.isChecked())
                    mresult.add("2116-402-100");
                else
                    mresult.remove("2116-402-100");
            }
        });

        one_hundred_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one_hundred_one.isChecked())
                    mresult.add("2116-402-101");
                else
                    mresult.remove("2116-402-101");
            }
        });

        one_hundred_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one_hundred_two.isChecked())
                    mresult.add("2116-402-102");
                else
                    mresult.remove("2116-402-102");
            }
        });

        one_hundred_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one_hundred_three.isChecked())
                    mresult.add("2116-402-103");
                else
                    mresult.remove("2116-402-103");
            }
        });

        one_hundred_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one_hundred_four.isChecked())
                    mresult.add("2116-402-104");
                else
                    mresult.remove("2116-402-104");
            }
        });

        one_hundred_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one_hundred_five.isChecked())
                    mresult.add("2116-402-105");
                else
                    mresult.remove("2116-402-105");
            }
        });

        one_hundred_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one_hundred_six.isChecked())
                    mresult.add("2116-402-106");
                else
                    mresult.remove("2116-402-106");
            }
        });

        one_hundred_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one_hundred_seven.isChecked())
                    mresult.add("2116-402-107");
                else
                    mresult.remove("2116-402-107");
            }
        });

        one_hundred_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one_hundred_eight.isChecked())
                    mresult.add("2116-402-108");
                else
                    mresult.remove("2116-402-108");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (one.isChecked())
                    mresult.add("2116-402-01");
                else
                    mresult.remove("2116-402-01");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (two.isChecked())
                    mresult.add("2116-402-02");
                else
                    mresult.remove("2116-402-02");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (three.isChecked())
                    mresult.add("2116-402-03");
                else
                    mresult.remove("2116-402-03");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (four.isChecked())
                    mresult.add("2116-402-04");
                else
                    mresult.remove("2116-402-04");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (five.isChecked())
                    mresult.add("2116-402-05");
                else
                    mresult.remove("2116-402-05");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (six.isChecked())
                    mresult.add("2116-402-06");
                else
                    mresult.remove("2116-402-06");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seven.isChecked())
                    mresult.add("2116-402-07");
                else
                    mresult.remove("2116-402-07");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eight.isChecked())
                    mresult.add("2116-402-08");
                else
                    mresult.remove("2116-402-08");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nine.isChecked())
                    mresult.add("2116-402-09");
                else
                    mresult.remove("2116-402-09");
            }
        });

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eleven.isChecked())
                    mresult.add("2116-402-11");
                else
                    mresult.remove("2116-402-11");
            }
        });

        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (twelve.isChecked())
                    mresult.add("2116-402-12");
                else
                    mresult.remove("2116-402-12");
            }
        });

        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thirteen.isChecked())
                    mresult.add("2116-402-13");
                else
                    mresult.remove("2116-402-13");
            }
        });

        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fourteen.isChecked())
                    mresult.add("2116-402-14");
                else
                    mresult.remove("2116-402-14");
            }
        });

        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fifteen.isChecked())
                    mresult.add("2116-402-15");
                else
                    mresult.remove("2116-402-15");
            }
        });

        seventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seventeen.isChecked())
                    mresult.add("2116-402-17");
                else
                    mresult.remove("2116-402-17");
            }
        });

        eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eighteen.isChecked())
                    mresult.add("2116-402-18");
                else
                    mresult.remove("2116-402-18");
            }
        });






//        ----------------------------->>>
//                <<<-----------------------
//                        --------------->>>

        result_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : mresult)
                    stringBuilder.append(s).append("\n");

                result.setText(stringBuilder.toString());
                result.setEnabled(false);
            }
        });


//        ----------------------------->>>
//                <<<-----------------------
//                        --------------->>>

        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String share_btn = result.getText().toString();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain ");
                sendIntent.putExtra(Intent.EXTRA_TEXT, share_btn);
                startActivity(sendIntent);
            }
        });

    }
}