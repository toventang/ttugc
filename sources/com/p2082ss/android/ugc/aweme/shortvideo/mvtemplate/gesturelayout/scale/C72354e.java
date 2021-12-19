package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.e */
public final class C72354e {

    /* renamed from: u */
    static final float f162201u = 0.67f;

    /* renamed from: v */
    public static final C72355a f162202v = new C72355a((byte) 0);

    /* renamed from: x */
    private static final String f162203x = "ScaleGestureDetector";

    /* renamed from: a */
    public boolean f162204a;

    /* renamed from: b */
    MotionEvent f162205b;

    /* renamed from: c */
    public final Vector2D f162206c = new Vector2D();

    /* renamed from: d */
    public float f162207d;

    /* renamed from: e */
    public float f162208e;

    /* renamed from: f */
    public float f162209f;

    /* renamed from: g */
    public float f162210g;

    /* renamed from: h */
    public float f162211h;

    /* renamed from: i */
    public float f162212i;

    /* renamed from: j */
    float f162213j;

    /* renamed from: k */
    float f162214k;

    /* renamed from: l */
    float f162215l;

    /* renamed from: m */
    float f162216m;

    /* renamed from: n */
    float f162217n;

    /* renamed from: o */
    public long f162218o;

    /* renamed from: p */
    boolean f162219p;

    /* renamed from: q */
    int f162220q;

    /* renamed from: r */
    int f162221r;

    /* renamed from: s */
    boolean f162222s;

    /* renamed from: t */
    final AbstractC72356b f162223t;

    /* renamed from: w */
    private MotionEvent f162224w;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.e$b */
    public interface AbstractC72356b {
        static {
            Covode.recordClassIndex(85025);
        }

        /* renamed from: a */
        boolean mo114633a(View view, C72354e eVar);

        /* renamed from: b */
        boolean mo114634b(View view, C72354e eVar);

        /* renamed from: c */
        void mo114635c(View view, C72354e eVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.e$a */
    public static final class C72355a {
        static {
            Covode.recordClassIndex(85024);
        }

        private C72355a() {
        }

        public /* synthetic */ C72355a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(85023);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo114637a() {
        MotionEvent motionEvent = this.f162205b;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f162205b = null;
        }
        MotionEvent motionEvent2 = this.f162224w;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.f162224w = null;
        }
        this.f162204a = false;
        this.f162220q = -1;
        this.f162221r = -1;
        this.f162219p = false;
    }

    public C72354e(AbstractC72356b bVar) {
        C89219l.m154721d(bVar, "");
        this.f162223t = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo114638a(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.f162224w;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f162224w = MotionEvent.obtain(motionEvent);
        this.f162213j = -1.0f;
        this.f162214k = -1.0f;
        this.f162215l = -1.0f;
        this.f162206c.set(0.0f, 0.0f);
        MotionEvent motionEvent3 = this.f162205b;
        if (motionEvent3 == null) {
            C89219l.m154715b();
        }
        int findPointerIndex = motionEvent3.findPointerIndex(this.f162220q);
        int findPointerIndex2 = motionEvent3.findPointerIndex(this.f162221r);
        int findPointerIndex3 = motionEvent.findPointerIndex(this.f162220q);
        int findPointerIndex4 = motionEvent.findPointerIndex(this.f162221r);
        if (findPointerIndex < 0 || findPointerIndex2 < 0 || findPointerIndex3 < 0 || findPointerIndex4 < 0) {
            this.f162219p = true;
            new Throwable();
            if (this.f162204a) {
                this.f162223t.mo114635c(view, this);
                return;
            }
            return;
        }
        float x = motionEvent3.getX(findPointerIndex);
        float y = motionEvent3.getY(findPointerIndex);
        float x2 = motionEvent3.getX(findPointerIndex2);
        float y2 = motionEvent3.getY(findPointerIndex2);
        float x3 = motionEvent.getX(findPointerIndex3);
        float y3 = motionEvent.getY(findPointerIndex3);
        float x4 = motionEvent.getX(findPointerIndex4) - x3;
        float y4 = motionEvent.getY(findPointerIndex4) - y3;
        this.f162206c.set(x4, y4);
        this.f162209f = x2 - x;
        this.f162210g = y2 - y;
        this.f162211h = x4;
        this.f162212i = y4;
        this.f162207d = x3 + (x4 * 0.5f);
        this.f162208e = y3 + (y4 * 0.5f);
        this.f162218o = motionEvent.getEventTime() - motionEvent3.getEventTime();
        this.f162216m = motionEvent.getPressure(findPointerIndex3) + motionEvent.getPressure(findPointerIndex4);
        this.f162217n = motionEvent3.getPressure(findPointerIndex) + motionEvent3.getPressure(findPointerIndex2);
    }

    /* renamed from: a */
    static int m127584a(MotionEvent motionEvent, int i, int i2) {
        int pointerCount = motionEvent.getPointerCount();
        int findPointerIndex = motionEvent.findPointerIndex(i);
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (!(i3 == i2 || i3 == findPointerIndex)) {
                return i3;
            }
        }
        return -1;
    }
}
