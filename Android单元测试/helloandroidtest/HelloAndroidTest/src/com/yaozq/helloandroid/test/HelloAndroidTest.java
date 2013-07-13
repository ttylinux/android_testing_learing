package com.yaozq.helloandroid.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.yaozq.helloandroid.HelloAndroidActivity;

public class HelloAndroidTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {
	//Ҫ�����Ե�activity
	private HelloAndroidActivity mActivity;
    private TextView mView;
    private String resourceString;
    
	public HelloAndroidTest() {//��������Android���Կ���������
	      super("com.yaozq.helloandroid", HelloAndroidActivity.class);
	}
	
	@Override
    protected void setUp() throws Exception {//��ʼ���Ի���
        super.setUp();
        mActivity = this.getActivity();
        mView = (TextView) mActivity.findViewById(com.yaozq.helloandroid.R.id.textview);
        resourceString = mActivity.getString(com.yaozq.helloandroid.R.string.hello);
    }
	
	public void testText() {//�����ַ�����Դ
		assertEquals(resourceString,(String)mView.getText());
	}
	
	public void testPreconditions() {//����������ֻ����һ�Σ���Ҫ�������Ҫ�����Եĳ����Ƿ����ɳ�ʼ��
		assertNotNull(mView);
	}
}
