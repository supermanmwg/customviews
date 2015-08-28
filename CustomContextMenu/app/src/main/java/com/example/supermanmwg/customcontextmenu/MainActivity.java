package com.example.supermanmwg.customcontextmenu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


/**
 * 上下文菜单演示Demo
 *
 * @author CodingMyWorld 2011-8-27 下午03:22:39
 */
public class MainActivity extends Activity implements View.OnClickListener {
    private static final String TAG = "SampleContextMenuActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 显示列表
        setContentView(R.layout.activity_main);
        TextView mTextView = (TextView) findViewById(R.id.text);
        mTextView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        AlertDisplay();
    }

    public void AlertDisplay()

    {

        LayoutInflater factory = LayoutInflater.from(this);

        final View textEntryView = factory.inflate(R.layout.context, null);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setInverseBackgroundForced(true);

        alert.setView(textEntryView);

        AlertDialog loginPrompt = alert.create();


        alert.show();
    }

}
