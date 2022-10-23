package com.example.resistorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

//declaring components
    Button clear, Black, Brown, Red, Orange, Yellow, Green, Blue, Violet, Grey, White, Gold , Silver;
    Button calculate;
    TextView resistanceSum;
    TextView  input1, input2, input3;
    String temp = "";
    int result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        calculate = findViewById(R.id.btnCalc);
        clear = findViewById(R.id.btnReset);
        resistanceSum = findViewById(R.id.tvSum);

        //buttons
        Black = findViewById(R.id.btnBlack);
        Brown = findViewById(R.id.btnBrown);
        Red = findViewById(R.id.btnRed);
        Orange = findViewById(R.id.btnOrange);
        Yellow = findViewById(R.id.btnYellow);
        Green = findViewById(R.id.btnGreen);
        Blue = findViewById(R.id.btnBlue);
        Violet = findViewById(R.id.btnViolet);
        Grey = findViewById(R.id.btnGrey);
        White = findViewById(R.id.btnWhite);



        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);

//clear button function
        clear.setOnClickListener(view -> {
            input1.setBackgroundColor(Color.parseColor("#efefef"));
            input2.setBackgroundColor(Color.parseColor("#efefef"));
            input3.setBackgroundColor(Color.parseColor("#efefef"));
            resistanceSum.setText("Resistance value");
            temp = "";

        });




        Brown.setOnClickListener(view -> {
            int color1 = ((ColorDrawable) input1.getBackground()).getColor();
            int color2 = ((ColorDrawable) input2.getBackground()).getColor();
            int color3 = ((ColorDrawable) input3.getBackground()).getColor();

            if (color1 == Color.parseColor("#efefef")) {
                temp = temp + "1";
                input1.setBackgroundColor(Color.parseColor("#6C2D19"));
            } else if (color2 == Color.parseColor("#efefef")) {
                temp = temp + "1";
                input2.setBackgroundColor(Color.parseColor("#6C2D19"));
            } else if (color3 == Color.parseColor("#efefef")) {
                result = Integer.parseInt(temp);
                input3.setBackgroundColor(Color.parseColor("#6C2D19"));


            }

            calculate.setOnClickListener(View -> {
                resistanceSum.setText(String.valueOf(result * 10) + "M Ω Ohm +- 5%");

            });


        });


        Black.setOnClickListener(view -> {
            int color1 = ((ColorDrawable) input1.getBackground()).getColor();
            int color2 = ((ColorDrawable) input2.getBackground()).getColor();
            int color3 = ((ColorDrawable) input3.getBackground()).getColor();

            if (color1 == Color.parseColor("#efefef")) {
                temp = temp + "0";
                input1.setBackgroundColor(Color.parseColor("#0C0C0C"));
            } else if (color2 == Color.parseColor("#efefef")) {
                temp = temp + "0";
                input2.setBackgroundColor(Color.parseColor("#0C0C0C"));
            } else if (color3 == Color.parseColor("#efefef")) {
                result = Integer.parseInt(temp);
                input3.setBackgroundColor(Color.parseColor("#0C0C0C"));

            }
            calculate.setOnClickListener(View -> {
                resistanceSum.setText(String.valueOf(result * 1) + "M Ω Ohm +- 5%");

            });
        });


        Red.setOnClickListener(view -> {
            int color1 = ((ColorDrawable) input1.getBackground()).getColor();
            int color2 = ((ColorDrawable) input2.getBackground()).getColor();
            int color3 = ((ColorDrawable) input3.getBackground()).getColor();

            if (color1 == Color.parseColor("#efefef")) {
                temp = temp + "2";
                input1.setBackgroundColor(Color.parseColor("#D30808"));
            } else if (color2 == Color.parseColor("#efefef")) {
                temp = temp + "2";
                input2.setBackgroundColor(Color.parseColor("#D30808"));
            } else if (color3 == Color.parseColor("#efefef")) {
                result = Integer.parseInt(temp);
                input3.setBackgroundColor(Color.parseColor("#D30808"));

            }
            calculate.setOnClickListener(View -> {
                resistanceSum.setText(String.valueOf(result * 100) + "M Ω Ohm  +- 5%");

            });


        });

//
        Orange.setOnClickListener(view -> {
            int color1 = ((ColorDrawable) input1.getBackground()).getColor();
            int color2 = ((ColorDrawable) input2.getBackground()).getColor();
            int color3 = ((ColorDrawable) input3.getBackground()).getColor();

            if (color1 == Color.parseColor("#efefef")) {
                temp = temp + "3";
                input1.setBackgroundColor(Color.parseColor("#FF5722"));
            } else if (color2 == Color.parseColor("#efefef")) {
                temp = temp + "3";
                input2.setBackgroundColor(Color.parseColor("#FF5722"));
            } else if (color3 == Color.parseColor("#efefef")) {
                result = Integer.parseInt(temp);

                input3.setBackgroundColor(Color.parseColor("#FF5722"));

            }
            calculate.setOnClickListener(View -> {
                resistanceSum.setText(String.valueOf(result * 1) + "K Ω Ohm +- 5%");

            });
        });
//
        Yellow.setOnClickListener(view -> {
            int color1 = ((ColorDrawable) input1.getBackground()).getColor();
            int color2 = ((ColorDrawable) input2.getBackground()).getColor();
            int color3 = ((ColorDrawable) input3.getBackground()).getColor();

            if (color1 == Color.parseColor("#efefef")) {
                temp = temp + "4";
                input1.setBackgroundColor(Color.parseColor("#FFEB3B"));
            } else if (color2 == Color.parseColor("#efefef")) {
                temp = temp + "4";
                input2.setBackgroundColor(Color.parseColor("#FFEB3B"));
            } else if (color3 == Color.parseColor("#efefef")) {
                result = Integer.parseInt(temp);

                input3.setBackgroundColor(Color.parseColor("#FFEB3B"));

            }
            calculate.setOnClickListener(View -> {
                resistanceSum.setText(String.valueOf(result * 10) + "K Ω Ohm +- 5%");

            });

        });
//

        Green.setOnClickListener(view -> {
            int color1 = ((ColorDrawable) input1.getBackground()).getColor();
            int color2 = ((ColorDrawable) input2.getBackground()).getColor();
            int color3 = ((ColorDrawable) input3.getBackground()).getColor();

            if (color1 == Color.parseColor("#efefef")) {
                temp = temp + "5";
                input1.setBackgroundColor(Color.parseColor("#4CAF50"));
            } else if (color2 == Color.parseColor("#efefef")) {
                temp = temp + "5";
                input2.setBackgroundColor(Color.parseColor("#4CAF50"));
            } else if (color3 == Color.parseColor("#efefef")) {
                result = Integer.parseInt(temp);

                input3.setBackgroundColor(Color.parseColor("#4CAF50"));

            }

            calculate.setOnClickListener(View -> {
                resistanceSum.setText(String.valueOf(result * 100) + "K Ω Ohm +-5%");

            });

        });

        Blue.setOnClickListener(view -> {
            int color1 = ((ColorDrawable) input1.getBackground()).getColor();
            int color2 = ((ColorDrawable) input2.getBackground()).getColor();
            int color3 = ((ColorDrawable) input3.getBackground()).getColor();

            if (color1 == Color.parseColor("#efefef")) {
                temp = temp + "6";
                input1.setBackgroundColor(Color.parseColor("#2196F3"));
            } else if (color2 == Color.parseColor("#efefef")) {
                temp = temp + "6";
                input2.setBackgroundColor(Color.parseColor("#2196F3"));
            } else if (color3 == Color.parseColor("#efefef")) {
                result = Integer.parseInt(temp);

                input3.setBackgroundColor(Color.parseColor("#2196F3"));

            }
            calculate.setOnClickListener(View -> {
                resistanceSum.setText(String.valueOf(result * 1) + "K Ω Ohm +-5%");

            });

        });

        Violet.setOnClickListener(view -> {
            int color1 = ((ColorDrawable) input1.getBackground()).getColor();
            int color2 = ((ColorDrawable) input2.getBackground()).getColor();
            int color3 = ((ColorDrawable) input3.getBackground()).getColor();

            if (color1 == Color.parseColor("#efefef")) {
                temp = temp + "7";
                input1.setBackgroundColor(Color.parseColor("#673AB7"));
            } else if (color2 == Color.parseColor("#efefef")) {
                temp = temp + "7";
                input2.setBackgroundColor(Color.parseColor("#673AB7"));
            } else if (color3 == Color.parseColor("#efefef")) {
                result = Integer.parseInt(temp);

                input3.setBackgroundColor(Color.parseColor("#673AB7"));

            }
            calculate.setOnClickListener(View -> {
                resistanceSum.setText(String.valueOf(result * 10) + "K Ω Ohm +-5%");

            });

        });

        Grey.setOnClickListener(view -> {
            int color1 = ((ColorDrawable) input1.getBackground()).getColor();
            int color2 = ((ColorDrawable) input2.getBackground()).getColor();
            int color3 = ((ColorDrawable) input3.getBackground()).getColor();

            if (color1 == Color.parseColor("#efefef")) {
                temp = temp + "8";
                input1.setBackgroundColor(Color.parseColor("#777272"));
            } else if (color2 == Color.parseColor("#efefef")) {
                temp = temp + "8";
                input2.setBackgroundColor(Color.parseColor("#777272"));
            } else if (color3 == Color.parseColor("#efefef")) {
                result = Integer.parseInt(temp);

                input3.setBackgroundColor(Color.parseColor("#777272"));

            }
            calculate.setOnClickListener(View -> {
                resistanceSum.setText(String.valueOf(result * 100) + "K Ω Ohm +-5%");

            });

        });

        White.setOnClickListener(view -> {
            int color1 = ((ColorDrawable) input1.getBackground()).getColor();
            int color2 = ((ColorDrawable) input2.getBackground()).getColor();
            int color3 = ((ColorDrawable) input3.getBackground()).getColor();

            if (color1 == Color.parseColor("#efefef")) {
                temp = temp + "9";
                input1.setBackgroundColor(Color.parseColor("#F6F4F4"));
            } else if (color2 == Color.parseColor("#efefef")) {
                temp = temp + "9";
                input2.setBackgroundColor(Color.parseColor("#F6F4F4"));
            } else if (color3 == Color.parseColor("#efefef")) {
                result = Integer.parseInt(temp);

                input3.setBackgroundColor(Color.parseColor("#F6F4F4"));

            }
            calculate.setOnClickListener(View -> {
                resistanceSum.setText(String.valueOf(result * 1) + "K Ω Ohm +-5%");

            });
        });



    }
}