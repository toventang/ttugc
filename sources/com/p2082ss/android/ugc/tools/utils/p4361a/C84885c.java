package com.p2082ss.android.ugc.tools.utils.p4361a;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.utils.a.c */
public final class C84885c extends AbstractC84888d {

    /* renamed from: i */
    public float f189714i;

    /* renamed from: j */
    public float f189715j;

    /* renamed from: q */
    private boolean f189716q;

    /* renamed from: r */
    private final AbstractC84886a f189717r;

    /* renamed from: com.ss.android.ugc.tools.utils.a.c$a */
    public interface AbstractC84886a {
        static {
            Covode.recordClassIndex(98880);
        }

        /* renamed from: a */
        boolean mo23088a(C84885c cVar);

        /* renamed from: b */
        void mo23089b(C84885c cVar);

        /* renamed from: c */
        boolean mo23090c(C84885c cVar);
    }

    /* renamed from: com.ss.android.ugc.tools.utils.a.c$b */
    public static class C84887b implements AbstractC84886a {
        static {
            Covode.recordClassIndex(98881);
        }

        @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.AbstractC84886a
        /* renamed from: a */
        public boolean mo23088a(C84885c cVar) {
            C89219l.m154721d(cVar, "");
            return false;
        }

        @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.AbstractC84886a
        /* renamed from: b */
        public void mo23089b(C84885c cVar) {
            C89219l.m154721d(cVar, "");
        }

        @Override // com.p2082ss.android.ugc.tools.utils.p4361a.C84885c.AbstractC84886a
        /* renamed from: c */
        public boolean mo23090c(C84885c cVar) {
            C89219l.m154721d(cVar, "");
            return true;
        }
    }

    static {
        Covode.recordClassIndex(98879);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84880a
    /* renamed from: a */
    public final void mo129679a() {
        super.mo129679a();
        this.f189716q = false;
    }

    /* renamed from: b */
    public final float mo129684b() {
        return (float) (Math.atan2((double) this.f189722l, (double) this.f189721k) - Math.atan2((double) this.f189724n, (double) this.f189723m));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84880a, com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84888d
    /* renamed from: b */
    public final void mo129683b(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        super.mo129683b(motionEvent);
        m145824d(motionEvent);
    }

    /* renamed from: d */
    private final void m145824d(MotionEvent motionEvent) {
        int i;
        int pointerCount = motionEvent.getPointerCount();
        if ((motionEvent.getAction() & 255) == 6) {
            i = motionEvent.getActionIndex();
        } else {
            i = -1;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (i != i2) {
                f += motionEvent.getX(i2);
                f2 += motionEvent.getY(i2);
            }
        }
        float f3 = (float) pointerCount;
        this.f189714i = f / f3;
        this.f189715j = f2 / f3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84885c(Context context, AbstractC84886a aVar) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f189717r = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84880a, com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84888d
    /* renamed from: a */
    public final void mo129680a(int i, MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (i != 2) {
            if (i == 5) {
                mo129679a();
                this.f189700a = MotionEvent.obtain(motionEvent);
                this.f189705f = 0;
                mo129683b(motionEvent);
                boolean c = mo129685c(motionEvent);
                this.f189716q = c;
                if (!c) {
                    this.f189704e = this.f189717r.mo23090c(this);
                }
            }
        } else if (this.f189716q) {
            boolean c2 = mo129685c(motionEvent);
            this.f189716q = c2;
            if (!c2) {
                this.f189704e = this.f189717r.mo23090c(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84880a, com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84888d
    /* renamed from: b */
    public final void mo129682b(int i, MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (i == 2) {
            mo129683b(motionEvent);
            if (this.f189702c / this.f189703d > 0.67f && this.f189717r.mo23088a(this)) {
                MotionEvent motionEvent2 = this.f189700a;
                if (motionEvent2 == null) {
                    C89219l.m154715b();
                }
                motionEvent2.recycle();
                this.f189700a = MotionEvent.obtain(motionEvent);
            }
        } else if (i == 3) {
            if (!this.f189716q) {
                this.f189717r.mo23089b(this);
            }
            mo129679a();
        } else if (i == 6) {
            mo129683b(motionEvent);
            if (!this.f189716q) {
                this.f189717r.mo23089b(this);
            }
            mo129679a();
        }
    }
}
