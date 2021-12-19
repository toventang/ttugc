package com.p2082ss.android.ugc.tools.utils.p4361a;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.utils.a.a */
public abstract class AbstractC84880a {

    /* renamed from: h */
    public static final C84881a f189699h = new C84881a((byte) 0);

    /* renamed from: a */
    public MotionEvent f189700a;

    /* renamed from: b */
    public MotionEvent f189701b;

    /* renamed from: c */
    public float f189702c;

    /* renamed from: d */
    public float f189703d;

    /* renamed from: e */
    public boolean f189704e;

    /* renamed from: f */
    public long f189705f;

    /* renamed from: g */
    public final Context f189706g;

    static {
        Covode.recordClassIndex(98874);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo129680a(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo129682b(int i, MotionEvent motionEvent);

    /* renamed from: com.ss.android.ugc.tools.utils.a.a$a */
    public static final class C84881a {
        static {
            Covode.recordClassIndex(98875);
        }

        private C84881a() {
        }

        public /* synthetic */ C84881a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo129679a() {
        MotionEvent motionEvent = this.f189700a;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f189700a = null;
        }
        MotionEvent motionEvent2 = this.f189701b;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.f189701b = null;
        }
        this.f189704e = false;
    }

    public AbstractC84880a(Context context) {
        C89219l.m154721d(context, "");
        this.f189706g = context;
    }

    /* renamed from: a */
    public final boolean mo129681a(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction() & 255;
        if (!this.f189704e) {
            mo129680a(action, motionEvent);
            return true;
        }
        mo129682b(action, motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo129683b(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        MotionEvent motionEvent2 = this.f189700a;
        MotionEvent motionEvent3 = this.f189701b;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
            this.f189701b = null;
        }
        this.f189701b = MotionEvent.obtain(motionEvent);
        long eventTime = motionEvent.getEventTime();
        if (motionEvent2 == null) {
            C89219l.m154715b();
        }
        this.f189705f = eventTime - motionEvent2.getEventTime();
        this.f189702c = motionEvent.getPressure(motionEvent.getActionIndex());
        this.f189703d = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }
}
