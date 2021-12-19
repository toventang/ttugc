package com.bytedance.p969f.p970a.p971a.p972a;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h;
import com.p2082ss.android.vesdk.C85392bf;

/* renamed from: com.bytedance.f.a.a.a.a */
public abstract class AbstractC14537a extends GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b {
    static {
        Covode.recordClassIndex(16624);
    }

    @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
    /* renamed from: e */
    public void mo23381e(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int pointerCount = motionEvent.getPointerCount();
        C85392bf bfVar = new C85392bf();
        if (action == 0) {
            bfVar.f191161b = C85392bf.EnumC85393a.BEGAN;
            m26551a(bfVar, motionEvent, 0);
        } else if (action == 1) {
            bfVar.f191161b = C85392bf.EnumC85393a.ENDED;
            m26551a(bfVar, motionEvent, 0);
        } else if (action == 2) {
            bfVar.f191161b = C85392bf.EnumC85393a.MOVED;
            for (int i = 0; i < pointerCount; i++) {
                m26551a(bfVar, motionEvent, i);
            }
        } else if (action == 3) {
            bfVar.f191161b = C85392bf.EnumC85393a.CANCELED;
            m26551a(bfVar, motionEvent, 0);
        } else if (action == 5) {
            bfVar.f191161b = C85392bf.EnumC85393a.BEGAN;
            m26551a(bfVar, motionEvent, (motionEvent.getAction() & 65280) >> 8);
        } else if (action == 6) {
            bfVar.f191161b = C85392bf.EnumC85393a.ENDED;
            m26551a(bfVar, motionEvent, (motionEvent.getAction() & 65280) >> 8);
        }
    }

    /* renamed from: a */
    private static void m26551a(C85392bf bfVar, MotionEvent motionEvent, int i) {
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
