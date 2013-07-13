package com.yaozq.helloandroid.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.yaozq.helloandroid.HelloAndroidActivity;

public class HelloAndroidTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {
	//要被测试的activity
	private HelloAndroidActivity mActivity;
    private TextView mView;
    private String resourceString;
    
	public HelloAndroidTest() {//构造器，Android测试框架所必须的
	      super("com.yaozq.helloandroid", HelloAndroidActivity.class);
	}
	
	@Override
    protected void setUp() throws Exception {//初始测试环境
        super.setUp();
        mActivity = this.getActivity();
        mView = (TextView) mActivity.findViewById(com.yaozq.helloandroid.R.id.textview);
        resourceString = mActivity.getString(com.yaozq.helloandroid.R.string.hello);
    }
	
	public void testText() {//测试字符串资源
		assertEquals(resourceString,(String)mView.getText());
	}
	
	public void testPreconditions() {//测试条件，只运行一次，主要用来检查要被测试的程序是否被整成初始化
		assertNotNull(mView);
	}
}
