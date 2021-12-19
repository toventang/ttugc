package com.p2082ss.android.ugc.tools.utils.p4361a;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.utils.a.b */
public final class C84882b extends AbstractC84880a {

    /* renamed from: j */
    public static final C84883a f189707j = new C84883a((byte) 0);

    /* renamed from: o */
    private static final PointF f189708o = new PointF();

    /* renamed from: i */
    public PointF f189709i = new PointF();

    /* renamed from: k */
    private PointF f189710k;

    /* renamed from: l */
    private PointF f189711l;

    /* renamed from: m */
    private final PointF f189712m = new PointF();

    /* renamed from: n */
    private final AbstractC84884b f189713n;

    /* renamed from: com.ss.android.ugc.tools.utils.a.b$b */
    public interface AbstractC84884b {
        static {
            Covode.recordClassIndex(98878);
        }

        /* renamed from: a */
        boolean mo23091a(C84882b bVar);

        /* renamed from: a */
        boolean mo23092a(C84882b bVar, float f, float f2);

        /* renamed from: b */
        void mo23093b(C84882b bVar);
    }

    /* renamed from: com.ss.android.ugc.tools.utils.a.b$a */
    public static final class C84883a {
        static {
            Covode.recordClassIndex(98877);
        }

        private C84883a() {
        }

        public /* synthetic */ C84883a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(98876);
    }

    /* renamed from: c */
    private static PointF m145817c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = (float) pointerCount;
        return new PointF(f / f3, f2 / f3);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84880a
    /* renamed from: b */
    public final void mo129683b(MotionEvent motionEvent) {
        PointF pointF;
        C89219l.m154721d(motionEvent, "");
        super.mo129683b(motionEvent);
        MotionEvent motionEvent2 = this.f189700a;
        this.f189710k = m145817c(motionEvent);
        if (motionEvent2 == null) {
            C89219l.m154715b();
        }
        this.f189711l = m145817c(motionEvent2);
        if (motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = f189708o;
        } else {
            PointF pointF2 = this.f189710k;
            if (pointF2 == null) {
                C89219l.m154715b();
            }
            float f = pointF2.x;
            PointF pointF3 = this.f189711l;
            if (pointF3 == null) {
                C89219l.m154715b();
            }
            float f2 = f - pointF3.x;
            PointF pointF4 = this.f189710k;
            if (pointF4 == null) {
                C89219l.m154715b();
            }
            float f3 = pointF4.y;
            PointF pointF5 = this.f189711l;
            if (pointF5 == null) {
                C89219l.m154715b();
            }
            pointF = new PointF(f2, f3 - pointF5.y);
        }
        this.f189709i = pointF;
        this.f189712m.x += this.f189709i.x;
        this.f189712m.y += this.f189709i.y;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84882b(Context context, AbstractC84884b bVar) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        this.f189713n = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84880a
    /* renamed from: a */
    public final void mo129680a(int i, MotionEvent motionEvent) {
        float x;
        C89219l.m154721d(motionEvent, "");
        if (i == 0) {
            mo129679a();
            this.f189712m.x = 0.0f;
            this.f189712m.y = 0.0f;
            this.f189700a = MotionEvent.obtain(motionEvent);
            this.f189705f = 0;
            mo129683b(motionEvent);
        } else if (i == 2) {
            AbstractC84884b bVar = this.f189713n;
            MotionEvent motionEvent2 = this.f189700a;
            float f = -1.0f;
            if (motionEvent2 == null) {
                x = -1.0f;
            } else {
                x = motionEvent2.getX();
            }
            MotionEvent motionEvent3 = this.f189700a;
            if (motionEvent3 != null) {
                f = motionEvent3.getY();
            }
            this.f189704e = bVar.mo23092a(this, x, f);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84880a
    /* renamed from: b */
    public final void mo129682b(int i, MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
            } else if (this.f189700a != null) {
                mo129683b(motionEvent);
                if (this.f189702c / this.f189703d > 0.67f && this.f189713n.mo23091a(this)) {
                    MotionEvent motionEvent2 = this.f189700a;
                    if (motionEvent2 == null) {
                        C89219l.m154715b();
                    }
                    motionEvent2.recycle();
                    this.f189700a = MotionEvent.obtain(motionEvent);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        this.f189713n.mo23093b(this);
        mo129679a();
    }
}
