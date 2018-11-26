package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    int translationState = 0;
    int translationStateCount = 6;

    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        //旋转
        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转
                // rotation 轴心旋转  rotationX x轴旋转 rotationY y轴旋转

                switch (translationState) {
                    case 0:
                        imageView.animate().rotation(180F);
                        break;
                    case 1:
                        imageView.animate().rotation(0F);
                        break;
                    case 2:
                        imageView.animate().rotationX(180F);
                        break;
                    case 3:
                        imageView.animate().rotationX(0F);
                        break;
                    case 4:
                        imageView.animate().rotationY(180F);
                        break;
                    case 5:
                        imageView.animate().rotationY(0F);
                        break;
                }
                translationState += 1;
                if (translationState == translationStateCount) {
                    translationState = 0;
                }
            }
        });
    }
}