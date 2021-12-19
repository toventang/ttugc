package com.p2082ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.utils.q */
final /* synthetic */ class View$OnTouchListenerC34733q implements View.OnTouchListener {

    /* renamed from: a */
    static final View.OnTouchListener f82023a = new View$OnTouchListenerC34733q();

    static {
        Covode.recordClassIndex(41725);
    }

    private View$OnTouchListenerC34733q() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MethodCollector.m26663i(11062);
        Context context = view.getContext();
        int action = motionEvent.getAction();
        if (action == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.s);
            loadAnimation.setFillAfter(true);
            view.startAnimation(loadAnimation);
        } else if (action == 1 || action == 3) {
            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.t);
            loadAnimation2.setFillAfter(true);
            view.startAnimation(loadAnimation2);
        }
        MethodCollector.m26664o(11062);
        return false;
    }
}
