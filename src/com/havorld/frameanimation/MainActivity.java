package com.havorld.frameanimation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

/**
 * 
 * @author Havorld
 * ���͵�ַ:http://blog.csdn.net/xiaohao0724/article/details/54582965
 */
public class MainActivity extends Activity implements OnClickListener {

	private ImageView imageView;
	private AnimationDrawable animationDrawable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		imageView = (ImageView) findViewById(R.id.imageView);
		findViewById(R.id.start).setOnClickListener(this);
		findViewById(R.id.stop).setOnClickListener(this);

		// setXml2FrameAnim1();
		// setXml2FrameAnim2();
		setSrc2FrameAnim();
	}

	/**
	 * ͨ��XML���֡��������һ
	 */
	private void setXml2FrameAnim1() {

		// �Ѷ�����Դ����ΪimageView�ı���,Ҳ��ֱ����XML��������
		imageView.setBackgroundResource(R.drawable.frame_anim);
		animationDrawable = (AnimationDrawable) imageView.getBackground();
	}

	/**
	 * ͨ��XML���֡����������
	 */
	private void setXml2FrameAnim2() {

		// ͨ����֡��������Դ�ļ����AnimationDrawableʾ��
		animationDrawable = (AnimationDrawable) getResources().getDrawable(
				R.drawable.frame_anim);
		imageView.setBackground(animationDrawable);
	}

	/**
	 * ͨ���������֡��������
	 */
	private void setSrc2FrameAnim() {

		animationDrawable = new AnimationDrawable();
		// ΪAnimationDrawable��Ӷ���֡
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img00), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img01), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img02), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img03), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img04), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img05), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img06), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img07), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img08), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img09), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img10), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img11), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img12), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img13), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img14), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img15), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img16), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img17), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img18), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img19), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img20), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img21), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img22), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img23), 50);
		animationDrawable.addFrame(
				getResources().getDrawable(R.drawable.img24), 50);
		// ����Ϊѭ������
		animationDrawable.setOneShot(false);
		imageView.setBackground(animationDrawable);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.start:
			if (animationDrawable != null && !animationDrawable.isRunning()) {
				animationDrawable.start();
			}
			break;
		case R.id.stop:
			if (animationDrawable != null && animationDrawable.isRunning()) {
				animationDrawable.stop();
			}
			break;

		default:
			break;
		}
	}

}
