package br.sp.senac.appcardviewti93;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listaCartoes;
    int imagemCafe[] = {R.drawable.cafeteria};
    String nomeCafe[] = {"Café Badilico"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaCartoes = findViewById(R.id.listaCartoes);


    }

    public class CustomAdpter extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemCafe.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            return null;
        }
    }

}
