package com.podcopic.animationlib.library.attention;

import android.view.View;


import com.nineoldandroids.animation.ObjectAnimator;
import com.podcopic.animationlib.library.BaseViewAnimator;

public class Tada extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"scaleX",1,0.9f,0.9f,1.1f,1.1f,1.1f,1.1f,1.1f,1.1f,1),
                ObjectAnimator.ofFloat(target,"scaleY",1,0.9f,0.9f,1.1f,1.1f,1.1f,1.1f,1.1f,1.1f,1),
                ObjectAnimator.ofFloat(target,"rotation",0 ,-3 , -3, 3, -3, 3, -3,3,-3,0)
        );
    }
}