package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnMulti, btnDiv, btnBS, btnC, btnCE, btnEqual, btnTrans;
    String express = "";
    String expressTmp = "";
    int num1, num2;
    String operator;
    TextView tvEnter, tvTemp;
    int res = 0;
    boolean isEnterNum = false;
    boolean isFirstNum = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEnterNum) {
                    addCharacter("1");
                } else {
                    express = "1";
                    isEnterNum = true;
                }
                tvEnter.setText(express);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEnterNum) {
                    addCharacter("2");
                } else {
                    express = "2";
                    isEnterNum = true;
                }
                tvEnter.setText(express);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEnterNum) {
                    addCharacter("3");
                } else {
                    express = "3";
                    isEnterNum = true;
                }
                tvEnter.setText(express);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEnterNum) {
                    addCharacter("4");
                } else {
                    express = "4";
                    isEnterNum = true;
                }
                tvEnter.setText(express);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEnterNum) {
                    addCharacter("5");
                } else {
                    express = "5";
                    isEnterNum = true;
                }
                tvEnter.setText(express);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEnterNum) {
                    addCharacter("6");
                } else {
                    express = "6";
                    isEnterNum = true;
                }
                tvEnter.setText(express);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEnterNum) {
                    addCharacter("7");
                } else {
                    express = "7";
                    isEnterNum = true;
                }
                tvEnter.setText(express);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEnterNum) {
                    addCharacter("8");
                } else {
                    express = "8";
                    isEnterNum = true;
                }
                tvEnter.setText(express);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEnterNum) {
                    addCharacter("9");
                } else {
                    express = "9";
                    isEnterNum = true;
                }
                tvEnter.setText(express);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEnterNum) {
                    addCharacter("0");
                } else {
                    express = "0";
                    isEnterNum = true;
                }
                tvEnter.setText(express);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = 0;
                express = "";
                expressTmp = "";
                tvTemp.setText("");
                tvEnter.setText("0");
                isEnterNum = false;
                isFirstNum = true;
            }
        });
        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                express = "";
                tvEnter.setText("0");
                isEnterNum = false;
            }
        });
        btnBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!express.isEmpty()) {
                    express = express.substring(0, express.length() - 1);
                    tvEnter.setText(express);
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!express.isEmpty()) {
                    if (isEnterNum) {
                        if (isFirstNum) {
                            num1 = Integer.parseInt(express);
                            res = num1;
                        } else {
                            num2 = Integer.parseInt(express);
                            res = calculate(num1, num2, operator);
                            num1 = res;
                        }
                        operator = "+";
                        express = res + "";
                        expressTmp = res + " + ";
                        tvEnter.setText(express);
                        tvTemp.setText(expressTmp);
                    } else {
                        char[] arr = expressTmp.toCharArray();
                        arr[expressTmp.length() - 2] = '+';
                        expressTmp = String.valueOf(arr);
                        tvTemp.setText(expressTmp);
                        operator = "+";
                    }
                    isEnterNum = false;
                    isFirstNum = false;
                }

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!express.isEmpty()) {
                    if (isEnterNum) {
                        if (isFirstNum) {
                            num1 = Integer.parseInt(express);
                            res = num1;
                        } else {
                            num2 = Integer.parseInt(express);
                            res = calculate(num1, num2, operator);
                            num1 = res;
                        }
                        operator = "-";
                        express = res + "";
                        expressTmp = res + " - ";
                        tvEnter.setText(express);
                        tvTemp.setText(expressTmp);
                    } else {
                        char[] arr = expressTmp.toCharArray();
                        arr[expressTmp.length() - 2] = '-';
                        expressTmp = String.valueOf(arr);
                        tvTemp.setText(expressTmp);
                        operator = "-";
                    }
                    isEnterNum = false;
                    isFirstNum = false;
                }

            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!express.isEmpty()) {
                    if (isEnterNum) {
                        if (isFirstNum) {
                            num1 = Integer.parseInt(express);
                            res = num1;
                        } else {
                            num2 = Integer.parseInt(express);
                            res = calculate(num1, num2, operator);
                            num1 = res;
                        }
                        operator = "x";
                        express = res + "";
                        expressTmp = res + " x ";
                        tvEnter.setText(express);
                        tvTemp.setText(expressTmp);
                    } else {
                        char[] arr = expressTmp.toCharArray();
                        arr[expressTmp.length() - 2] = 'x';
                        expressTmp = String.valueOf(arr);
                        tvTemp.setText(expressTmp);
                        operator = "x";
                    }
                    isEnterNum = false;
                    isFirstNum = false;
                }

            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!express.isEmpty()) {
                    if (isEnterNum) {
                        int tmp = Integer.parseInt(express);
                        if (tmp == 0) {
                            tvEnter.setText("Cannot divide by zero");
                        } else {
                            if (isFirstNum) {
                                num1 = tmp;
                                res = num1;
                            } else {
                                num2 = tmp;
                                res = calculate(num1, num2, operator);
                                num1 = res;
                            }
                            operator = "/";
                            express = res + "";
                            expressTmp = res + " / ";
                            tvEnter.setText(express);
                            tvTemp.setText(expressTmp);
                        }
                    } else {
                        char[] arr = expressTmp.toCharArray();
                        arr[expressTmp.length() - 2] = '/';
                        expressTmp = String.valueOf(arr);
                        tvTemp.setText(expressTmp);
                        operator = "/";
                    }
                    isEnterNum = false;
                    isFirstNum = false;
                }

            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!express.isEmpty()) {
                    if (isEnterNum) {
                        if (isFirstNum) {
                            res = Integer.parseInt(express);
                            tvTemp.setText(res + " = ");
                        } else {
                            num2 = Integer.parseInt(express);
                            res = calculate(num1, num2, operator);
                            express = res + "";
                            expressTmp = num1 + " " + operator + " " + num2 + " = ";
                            tvTemp.setText(expressTmp);
                            tvEnter.setText(express);
                        }
                    } else {
                        res = calculate(num1, num1, operator);
                        express = res + "";
                        expressTmp = num1 + " " + operator + " " + num1 + " = ";
                        tvTemp.setText(expressTmp);
                        tvEnter.setText(express);
                    }
                    isEnterNum = true;
                    isFirstNum = true;
                }
            }
        });
        btnTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!express.isEmpty()) {
                    if (isEnterNum) {
                        express = "-" + express;
                        tvEnter.setText(express);
                    }
                }
            }
        });
    }

    int calculate(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }

    void addCharacter(String s) {
        express += s;
    }

    void mapping() {
        tvEnter = findViewById(R.id.tvEnter);
        tvTemp = findViewById(R.id.tvTemp);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        btnBS = findViewById(R.id.btnBS);
        btnC = findViewById(R.id.btnC);
        btnCE = findViewById(R.id.btnCE);
        btnEqual = findViewById(R.id.btnEqual);
        btnTrans = findViewById(R.id.btnTrans);
    }
}