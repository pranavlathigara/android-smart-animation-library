package com.podcopic.animationlib.library.bouncing_in;

import android.view.View;
import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class BounceIn extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",0,1, 1 ,1),
                ObjectAnimator.ofFloat(target,"scaleX",0.3f,1.05f,0.9f,1),
                ObjectAnimator.ofFloat(target,"scaleY",0.3f,1.05f,0.9f,1)
        );
    }
}