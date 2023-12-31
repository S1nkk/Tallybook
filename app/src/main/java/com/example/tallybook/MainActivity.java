package com.example.tallybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String judge;
    public double fake_num;
    public double num;
    public String fake_price;
    public double price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化文字
        TextView mainView = findViewById(R.id.tempView);
        TextView SecnView = findViewById(R.id.SecView);
        TextView tempV = findViewById(R.id.BeforeVIew);
        //变量定义




        //按钮响应
        Button but1 = findViewById(R.id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append("1");
            }
        });

        Button but2 = findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append("2");
            }
        });
        Button but3 = findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append("3");
            }
        });
        Button but4 = findViewById(R.id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append("4");
            }
        });
        Button but5 = findViewById(R.id.button5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append("5");
            }
        });
        Button but6 = findViewById(R.id.button6);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append("6");
            }
        });
        Button but7 = findViewById(R.id.button7);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append("7");
            }
        });
        Button but8 = findViewById(R.id.button8);
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append("8");
            }
        });
        Button but9 = findViewById(R.id.button9);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append("9");
            }
        });
        Button but0 = findViewById(R.id.button0);
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append("0");
            }
        });
        Button butdot = findViewById(R.id.buttondot);
        butdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.append(".");
            }
        });
        Button butcon = findViewById(R.id.buttonconfirm);
        butcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jud;
                judge = mainView.getText().toString();
                Toast.makeText(MainActivity.this, judge, Toast.LENGTH_SHORT).show();
                fake_num = Double.parseDouble(judge);
                if(fake_num>5)
                {
                    num = fake_num;
                    fake_num=0;
                    tempV.append("已输入：数量："+num);

                }
                else if (fake_num<5)
                {
                    price = fake_num;
                    fake_num=0;
                    tempV.append("已输入：单价："+price);
                }

                if(num!=0&&price!=0)
                {
                    SecnView.setText("单价："+price+"\n数量："+num+"\n当日总价："+price*num);
                    num = 0;
                    price = 0;

                    tempV.setText("");
                }
                mainView.setText("");
            }
            ;
        });
        Button butdel = findViewById(R.id.buttondel);
        butdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainView.setText("");

            }
        }
        );
    }
}