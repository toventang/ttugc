package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.core.p037h.C0769d;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.p240a.AbstractC4152e;
import com.bytedance.android.livesdk.chatroom.p488c.C7404u;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ao */
public final class GestureDetector$OnDoubleTapListenerC7760ao implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a */
    C0769d f19256a;

    /* renamed from: b */
    ScaleGestureDetector f19257b;

    /* renamed from: c */
    boolean f19258c;

    /* renamed from: d */
    int f19259d;

    /* renamed from: e */
    int f19260e;

    /* renamed from: f */
    int f19261f;

    /* renamed from: g */
    int f19262g;

    /* renamed from: h */
    boolean f19263h;

    /* renamed from: i */
    MotionEvent f19264i;

    /* renamed from: j */
    private float f19265j = 1.0f;

    /* renamed from: k */
    private EnumC7761a f19266k = EnumC7761a.BEF_GESTURE_TYPE_PAN;

    /* renamed from: l */
    private Context f19267l;

    static {
        Covode.recordClassIndex(8555);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: b */
    private C7404u.C7405a m15803b() {
        MotionEvent motionEvent = this.f19264i;
        if (motionEvent != null) {
            return mo14020a(motionEvent, true);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m15802a() {
        List<C11672a> b;
        AbstractC4152e e = C4217d.m10322e();
        if (e == null || (b = e.mo9847b(C4147a.f11584b)) == null || b.size() <= 0) {
            return false;
        }
        for (C11672a aVar : b) {
            List<String> list = aVar.f27902j;
            if (list != null && list.size() > 0) {
                return list.contains("TouchGes");
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ao$a */
    public enum EnumC7761a {
        BEF_GESTURE_TYPE_UNKNOWN,
        BEF_GESTURE_TYPE_TAP,
        BEF_GESTURE_TYPE_PAN,
        BEF_GESTURE_TYPE_ROTATE,
        BEF_GESTURE_TYPE_SCALE,
        BEF_GESTURE_TYPE_LONG_PRESS;

        static {
            Covode.recordClassIndex(8556);
        }
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f19265j = 1.0f;
    }

    /* renamed from: a */
    private static Context m15800a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f19266k = EnumC7761a.BEF_GESTURE_TYPE_TAP;
        if (this.f19264i != null) {
            m15801a(201, m15803b());
            this.f19264i = null;
        }
        m15801a(206, mo14020a(motionEvent, false));
        return false;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f19266k = EnumC7761a.BEF_GESTURE_TYPE_SCALE;
        if (this.f19264i != null) {
            m15801a(201, m15803b());
            this.f19264i = null;
        }
        C7404u.C7405a aVar = new C7404u.C7405a();
        aVar.f18353g = scaleGestureDetector.getScaleFactor() / this.f19265j;
        aVar.f18352f = 3.0f;
        m15801a(205, aVar);
        this.f19265j = scaleGestureDetector.getScaleFactor();
        return false;
    }

    public GestureDetector$OnDoubleTapListenerC7760ao(Context context) {
        this.f19267l = context;
        this.f19259d = m15800a(context).getResources().getDisplayMetrics().widthPixels;
        this.f19260e = m15800a(context).getResources().getDisplayMetrics().heightPixels;
        C0769d dVar = new C0769d(context, this);
        this.f19256a = dVar;
        dVar.mo2891a();
        this.f19256a.mo2892a(this);
        this.f19257b = new ScaleGestureDetector(context, this);
    }

    /* renamed from: a */
    static void m15801a(int i, C7404u.C7405a aVar) {
        if (aVar != null) {
            C6779a.m14563a().mo13053a(new C7404u(i, aVar));
        } else {
            C3854a.m9453a(6, "EffectGestureDetector", "notifyTouchEvent event is null, action: ".concat(String.valueOf(i)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C7404u.C7405a mo14020a(MotionEvent motionEvent, boolean z) {
        EnumC7761a aVar;
        C7404u.C7405a aVar2 = new C7404u.C7405a();
        aVar2.f18348b = motionEvent.getX() / ((float) this.f19259d);
        aVar2.f18349c = motionEvent.getY() / ((float) this.f19260e);
        if (z && (aVar = this.f19266k) != null) {
            aVar2.f18347a = aVar.ordinal();
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r4 != 6) goto L_0x007e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdk.chatroom.p488c.C7404u.C7405a mo14019a(android.view.MotionEvent r6, long r7) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p499ui.GestureDetector$OnDoubleTapListenerC7760ao.mo14019a(android.view.MotionEvent, long):com.bytedance.android.livesdk.chatroom.c.u$a");
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f19263h) {
            this.f19263h = false;
        }
        this.f19266k = EnumC7761a.BEF_GESTURE_TYPE_PAN;
        if (this.f19264i != null) {
            m15801a(201, m15803b());
            this.f19264i = null;
        }
        C7404u.C7405a a = mo14020a(motionEvent2, false);
        a.f18350d = f / ((float) this.f19259d);
        a.f18351e = f2 / ((float) this.f19260e);
        a.f18352f = 1.0f;
        m15801a(203, a);
        return true;
    }
}
