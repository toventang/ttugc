package com.bytedance.ies.xelement.pickview.p1393c;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1394d.C19395a;
import com.bytedance.ies.xelement.pickview.p1395e.C19398a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ies.xelement.pickview.c.a */
public final class C19393a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    private final C19398a f45905a;

    static {
        Covode.recordClassIndex(22188);
    }

    public C19393a(C19398a aVar) {
        this.f45905a = aVar;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C19398a aVar = this.f45905a;
        aVar.mo30915a();
        aVar.f45944d = aVar.f45943c.scheduleWithFixedDelay(new C19395a(aVar, f2), 0, 5, TimeUnit.MILLISECONDS);
        return true;
    }
}
