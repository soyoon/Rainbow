package com.nexters.rainbow.rainbowcouple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.nexters.rainbow.rainbowcouple.bill.list.BillListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 2016. 1. 16. 최초 접속 시 api로 데이터 가져온 뒤 db에 저장하는 (동기화) 작업 필요
        // TODO: 2016. 1. 16. 내부 DB에 마지막으로 저장된 bill Id와 비교 해서 저장 할 것. (idea?)
        /* 임시 테스트용 첫 화면. 리스트 뷰 */
        BillListFragment billListFragment = BillListFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainContentPanel, billListFragment, billListFragment.getFragmentTag())
                .commitAllowingStateLoss();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return (item.getItemId() == R.id.action_settings) ? Boolean.TRUE : super.onOptionsItemSelected(item);
    }
}
