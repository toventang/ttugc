package com.bytedance.creativex.recorder.filter.p945d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.filter.d.c */
public final class C14248c implements AbstractC14254d {

    /* renamed from: d */
    public static final C14249a f34545d = new C14249a((byte) 0);

    /* renamed from: a */
    ValueAnimator f34546a;

    /* renamed from: b */
    public AbstractC14255e f34547b;

    /* renamed from: c */
    public boolean f34548c;

    static {
        Covode.recordClassIndex(16317);
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.d.c$a */
    public static final class C14249a {
        static {
            Covode.recordClassIndex(16318);
        }

        private C14249a() {
        }

        public /* synthetic */ C14249a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.p945d.AbstractC14254d
    /* renamed from: a */
    public final void mo23000a() {
        ValueAnimator valueAnimator = this.f34546a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f34546a = null;
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.d.c$d */
    static final class C14252d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14248c f34552a;

        /* renamed from: b */
        final /* synthetic */ float f34553b;

        static {
            Covode.recordClassIndex(16321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14252d(C14248c cVar, float f) {
            super(0);
            this.f34552a = cVar;
            this.f34553b = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC14255e eVar = this.f34552a.f34547b;
            if (eVar != null) {
                float f = this.f34553b;
                eVar.mo22998a(f, C14248c.m25989b(f));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.d.c$e */
    static final class C14253e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14248c f34554a;

        /* renamed from: b */
        final /* synthetic */ float f34555b;

        /* renamed from: c */
        final /* synthetic */ float f34556c;

        /* renamed from: d */
        final /* synthetic */ int f34557d;

        static {
            Covode.recordClassIndex(16322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14253e(C14248c cVar, float f, float f2, int i) {
            super(0);
            this.f34554a = cVar;
            this.f34555b = f;
            this.f34556c = f2;
            this.f34557d = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            boolean z;
            float[] fArr;
            float f;
            EnumC14257g gVar;
            float abs;
            C14248c cVar = this.f34554a;
            float f2 = this.f34555b;
            float f3 = this.f34556c;
            int i = this.f34557d;
            if (Math.signum(f3) == Math.signum(f2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                fArr = new float[2];
                fArr[0] = f3;
                f = 0.0f;
            } else {
                fArr = new float[2];
                fArr[0] = f3;
                if (f2 >= 1.0E-5f) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
            }
            fArr[1] = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            C89219l.m154716b(ofFloat, "");
            if (z) {
                gVar = EnumC14257g.NONE;
                abs = ((float) i) * Math.abs(f3);
            } else {
                if (f2 >= 1.0E-5f) {
                    gVar = EnumC14257g.LEFT;
                } else {
                    gVar = EnumC14257g.RIGHT;
                }
                abs = ((float) i) * (1.0f - Math.abs(f3));
            }
            long min = Math.min((long) (((float) ((long) abs)) / ((Math.abs(f2) / 1000.0f) / 2.0f)), 400L);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(min);
            ofFloat.addUpdateListener(new C14250b(cVar));
            ofFloat.addListener(new C14251c(cVar, gVar));
            ofFloat.start();
            cVar.f34546a = ofFloat;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.d.c$c */
    public static final class C14251c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C14248c f34550a;

        /* renamed from: b */
        final /* synthetic */ EnumC14257g f34551b;

        static {
            Covode.recordClassIndex(16320);
        }

        public final void onAnimationStart(Animator animator) {
            this.f34550a.f34548c = true;
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC14255e eVar = this.f34550a.f34547b;
            if (eVar != null) {
                eVar.mo22999a(this.f34551b);
            }
            this.f34550a.f34548c = false;
        }

        C14251c(C14248c cVar, EnumC14257g gVar) {
            this.f34550a = cVar;
            this.f34551b = gVar;
        }
    }

    /* renamed from: a */
    private final void m25988a(AbstractC89171a<C89391z> aVar) {
        if (!this.f34548c) {
            aVar.invoke();
        }
    }

    /* renamed from: b */
    public static EnumC14256f m25989b(float f) {
        if (f < 1.0E-5f) {
            return EnumC14256f.LEFT;
        }
        return EnumC14256f.RIGHT;
    }

    @Override // com.bytedance.creativex.recorder.filter.p945d.AbstractC14254d
    /* renamed from: a */
    public final void mo23001a(float f) {
        m25988a(new C14252d(this, f));
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.d.c$b */
    static final class C14250b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C14248c f34549a;

        static {
            Covode.recordClassIndex(16319);
        }

        C14250b(C14248c cVar) {
            this.f34549a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC14255e eVar = this.f34549a.f34547b;
            if (eVar != null) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                eVar.mo22998a(floatValue, C14248c.m25989b(((Float) animatedValue2).floatValue()));
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.p945d.AbstractC14254d
    /* renamed from: a */
    public final void mo23003a(AbstractC14255e eVar) {
        C89219l.m154721d(eVar, "");
        this.f34547b = eVar;
    }

    @Override // com.bytedance.creativex.recorder.filter.p945d.AbstractC14254d
    /* renamed from: a */
    public final void mo23002a(float f, float f2, int i) {
        m25988a(new C14253e(this, f, f2, i));
    }
}
