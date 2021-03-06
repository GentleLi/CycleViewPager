package me.codeboy.android.cycleviewpager.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import me.codeboy.android.cycleviewpager.CycleViewPager;
import me.codeboy.android.cycleviewpager.example.util.ViewFactory;

/**
 * 普通模式，不循环
 * 
 * @author YD
 *
 */
public class NoCycleTextView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cycleviewpager_cycle_textview);

		List<View> views = new ArrayList<View>();
		for (int i = 0; i < 4; i++) {
			views.add(ViewFactory.getImageView(this, "Hello " + i, "title" + i));
		}

		CycleViewPager cycleViewPager = (CycleViewPager) getFragmentManager()
				.findFragmentById(R.id.cycleViewPager);
		cycleViewPager.setData(views);
	}
}