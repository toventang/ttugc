package com.bytedance.creativex.recorder.gesture.api;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.p2082ss.android.vesdk.C85392bf;

/* renamed from: com.bytedance.creativex.recorder.gesture.api.d */
public abstract class AbstractC14318d extends VideoRecordGestureLayout.AbstractC14313b {

    /* renamed from: com.bytedance.creativex.recorder.gesture.api.d$a */
    public static class C14319a extends AbstractC14318d {
        static {
            Covode.recordClassIndex(16392);
        }
    }

    static {
        Covode.recordClassIndex(16391);
    }

    /* renamed from: a */
    public void mo23103a(C85392bf bfVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
    /* renamed from: f */
    public final void mo23068f(MotionEvent motionEvent) {
        mo23104g(motionEvent);
    }

    /* renamed from: g */
    public final void mo23104g(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int pointerCount = motionEvent.getPointerCount();
        C85392bf bfVar = new C85392bf();
        if (action == 0) {
            bfVar.f191161b = C85392bf.EnumC85393a.BEGAN;
            m26119a(bfVar, motionEvent, 0);
            mo23103a(bfVar, motionEvent);
        } else if (action == 1) {
            bfVar.f191161b = C85392bf.EnumC85393a.ENDED;
            m26119a(bfVar, motionEvent, 0);
            mo23103a(bfVar, motionEvent);
        } else if (action == 2) {
            bfVar.f191161b = C85392bf.EnumC85393a.MOVED;
            for (int i = 0; i < pointerCount; i++) {
                m26119a(bfVar, motionEvent, i);
                mo23103a(bfVar, motionEvent);
            }
        } else if (action == 3) {
            bfVar.f191161b = C85392bf.EnumC85393a.CANCELED;
            m26119a(bfVar, motionEvent, 0);
            mo23103a(bfVar, motionEvent);
        } else if (action == 5) {
            bfVar.f191161b = C85392bf.EnumC85393a.BEGAN;
            m26119a(bfVar, motionEvent, (motionEvent.getAction() & 65280) >> 8);
            mo23103a(bfVar, motionEvent);
        } else if (action == 6) {
            bfVar.f191161b = C85392bf.EnumC85393a.ENDED;
            m26119a(bfVar, motionEvent, (motionEvent.getAction() & 65280) >> 8);
            mo23103a(bfVar, motionEvent);
        }
    }

    /* renamed from: a */
    private static void m26119a(C85392bf bfVar, MotionEvent motionEvent, int i) {
        int pointerId = motionEvent.getPointerId(i);
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        bfVar.f191164e = motionEvent.getPressure(i);
        bfVar.f191160a = pointerId;
        bfVar.f191162c = x;
        bfVar.f191163d = y;
        bfVar.f191165f = 30.0f;
    }
}
