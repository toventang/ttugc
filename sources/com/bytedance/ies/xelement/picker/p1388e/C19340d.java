package com.bytedance.ies.xelement.picker.p1388e;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.p1389f.C19347a;
import com.bytedance.ies.xelement.picker.view.WheelView;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ies.xelement.picker.e.d */
public final class C19340d extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    private final WheelView f45750a;

    static {
        Covode.recordClassIndex(22128);
    }

    public C19340d(WheelView wheelView) {
        this.f45750a = wheelView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WheelView wheelView = this.f45750a;
        wheelView.mo30814a();
        wheelView.f45785d = wheelView.f45784c.scheduleWithFixedDelay(new C19347a(wheelView, f2), 0, 5, TimeUnit.MILLISECONDS);
        return true;
    }
}
