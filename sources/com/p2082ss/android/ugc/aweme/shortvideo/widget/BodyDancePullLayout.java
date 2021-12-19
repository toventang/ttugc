package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.BodyDancePullLayout */
public class BodyDancePullLayout extends PullUpLayout {

    /* renamed from: f */
    private float f166741f;

    static {
        Covode.recordClassIndex(86990);
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f166741f = motionEvent.getY();
            return false;
        } else if (motionEvent.getAction() != 2 || Math.abs(this.f166741f - motionEvent.getY()) <= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop())) {
            return false;
        } else {
            return true;
        }
    }

    public BodyDancePullLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
