package com.jinke.www.smartlock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dsm.xiaodi.biz.sdk.servercore.ServerUnit;
import com.jinke.www.mylibrary.Test;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test.getString();
        ServerUnit.getInstance().uploadOperatorLog(new ServerUnit.OnServerUnitListener() {
            @Override
            public void success(List list, String s) {


            }

            @Override
            public void failure(String s, int i) {

            }
        });
    }
}
