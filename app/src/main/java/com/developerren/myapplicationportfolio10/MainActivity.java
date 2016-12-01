package com.developerren.myapplicationportfolio10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_movies,btn_stock,btn_reader,btn_news,btn_graduation_design;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        
    }

    private void initViews() {
        btn_movies= (Button) findViewById(R.id.btn_portfolio_moives);
        btn_stock= (Button) findViewById(R.id.btn_portfolio_stock);
        btn_news= (Button) findViewById(R.id.btn_portfolio_news);
        btn_graduation_design= (Button) findViewById(R.id.btn_portfolio_graduation_design);
        btn_movies.setOnClickListener(this);
        btn_stock.setOnClickListener(this);
        btn_reader.setOnClickListener(this);
        btn_news.setOnClickListener(this);
        btn_graduation_design.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View view) {
        if (view != null) {
            switch (view.getId()){
                case R.id.btn_portfolio_moives:
                    Toast.makeText(MainActivity.this, "启动应用: "+btn_movies.getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_portfolio_stock:
                    Toast.makeText(MainActivity.this, "启动应用: "+btn_stock.getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_portfolio_reader:
                    Toast.makeText(MainActivity.this, "启动应用: "+btn_reader.getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_portfolio_news:
                    Toast.makeText(MainActivity.this, "启动应用: "+btn_news.getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_portfolio_graduation_design:
                    Toast.makeText(MainActivity.this, "启动应用: "+btn_graduation_design.getText(), Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }
        }
 
    }
}
