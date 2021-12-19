package com.bytedance.scene.p1623e;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.scene.e.c */
public class C22178c extends FrameLayout {

    /* renamed from: a */
    private boolean f52421a = true;

    static {
        Covode.recordClassIndex(25982);
    }

    public void setTouchEnabled(boolean z) {
        this.f52421a = z;
    }

    public C22178c(Context context) {
        super(context);
        MethodCollector.m26663i(3732);
        MethodCollector.m26664o(3732);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f52421a) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
