package com.p2082ss.android.ugc.aweme.p3043g.p3044a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89279e;

/* renamed from: com.ss.android.ugc.aweme.g.a.d */
public final class C52832d implements AbstractC52855f {

    /* renamed from: g */
    public static final AbstractC89172b<View, AbstractC89183m<C52842g, C52842g, C89391z>> f121551g = C52838e.f121573a;

    /* renamed from: h */
    public static final AbstractC89172b<View, AbstractC89183m<Integer, Integer, C89391z>> f121552h = C52836d.f121571a;

    /* renamed from: i */
    public static final C52835c f121553i = new C52835c((byte) 0);

    /* renamed from: a */
    public final ImageView f121554a;

    /* renamed from: b */
    public final TextView f121555b;

    /* renamed from: c */
    public final C52834b f121556c = new C52834b((byte) 0);

    /* renamed from: d */
    public final AbstractC89279e<Integer> f121557d;

    /* renamed from: e */
    public final Context f121558e;

    /* renamed from: f */
    public final ViewGroup f121559f;

    /* renamed from: j */
    private ValueAnimator f121560j;

    /* renamed from: k */
    private final AbstractC89244h f121561k;

    /* renamed from: l */
    private final AbstractC89244h f121562l;

    /* renamed from: m */
    private final AbstractC89244h f121563m;

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$c */
    static final class C52835c {
        static {
            Covode.recordClassIndex(62235);
        }

        private C52835c() {
        }

        public /* synthetic */ C52835c(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.g.a.d$b */
    public static final class C52834b {

        /* renamed from: a */
        public final List<AbstractC89183m<Float, Float, C89391z>> f121568a;

        /* renamed from: b */
        public float f121569b;

        /* renamed from: c */
        public final float f121570c;

        static {
            Covode.recordClassIndex(62234);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C52834b) && Float.compare(this.f121570c, ((C52834b) obj).f121570c) == 0;
            }
            return true;
        }

        public final String toString() {
            return "AnimationTracker(defaultCursor=" + this.f121570c + ")";
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f121570c);
        }

        private C52834b() {
            this.f121570c = 0.0f;
            this.f121568a = new ArrayList();
            this.f121569b = 0.0f;
        }

        public /* synthetic */ C52834b(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo88492a(float f) {
            Iterator<T> it = this.f121568a.iterator();
            while (it.hasNext()) {
                it.next().invoke(Float.valueOf(this.f121569b), Float.valueOf(f));
            }
            this.f121569b = f;
        }
    }

    static {
        Covode.recordClassIndex(62232);
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$m */
    static final class C52849m extends AbstractC89220m implements AbstractC89171a<C52840f> {

        /* renamed from: a */
        final /* synthetic */ C52832d f121588a;

        static {
            Covode.recordClassIndex(62249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52849m(C52832d dVar) {
            super(0);
            this.f121588a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52840f invoke() {
            ViewGroup.LayoutParams layoutParams = this.f121588a.f121559f.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return new C52840f(((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((Number) ((AbstractC89172b) this.f121588a.f121557d).invoke(Integer.valueOf((int) R.dimen.ij))).intValue(), C52832d.f121552h.invoke(this.f121588a.f121559f), this.f121588a.f121556c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$l */
    static final class C52848l extends AbstractC89220m implements AbstractC89171a<C52843h> {

        /* renamed from: a */
        final /* synthetic */ C52832d f121587a;

        static {
            Covode.recordClassIndex(62248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52848l(C52832d dVar) {
            super(0);
            this.f121587a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52843h invoke() {
            C52842g gVar = new C52842g(this.f121587a.f121554a.getMeasuredWidth(), this.f121587a.f121554a.getMeasuredHeight());
            Integer valueOf = Integer.valueOf((int) R.dimen.ie);
            return new C52843h(gVar, new C52842g(((Number) ((AbstractC89172b) this.f121587a.f121557d).invoke(valueOf)).intValue(), ((Number) ((AbstractC89172b) this.f121587a.f121557d).invoke(valueOf)).intValue()), C52832d.f121551g.invoke(this.f121587a.f121554a), this.f121587a.f121556c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$n */
    static final class C52850n extends AbstractC89220m implements AbstractC89171a<C52843h> {

        /* renamed from: a */
        final /* synthetic */ C52832d f121589a;

        static {
            Covode.recordClassIndex(62250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52850n(C52832d dVar) {
            super(0);
            this.f121589a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52843h invoke() {
            return new C52843h(new C52842g(this.f121589a.f121559f.getMeasuredWidth(), this.f121589a.f121559f.getMeasuredHeight()), new C52842g(((Number) ((AbstractC89172b) this.f121589a.f121557d).invoke(Integer.valueOf((int) R.dimen.ik))).intValue(), ((Number) ((AbstractC89172b) this.f121589a.f121557d).invoke(Integer.valueOf((int) R.dimen.ii))).intValue()), C52832d.f121551g.invoke(this.f121589a.f121559f), this.f121589a.f121556c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$a */
    static class C52833a<T> {

        /* renamed from: a */
        public T f121564a;

        /* renamed from: b */
        public final T f121565b;

        /* renamed from: c */
        public final T f121566c;

        /* renamed from: d */
        public AbstractC89183m<? super T, ? super T, C89391z> f121567d;

        static {
            Covode.recordClassIndex(62233);
        }

        /* renamed from: a */
        public final void mo88491a(T t) {
            this.f121567d.invoke(this.f121564a, t);
            this.f121564a = t;
        }

        public C52833a(T t, T t2, AbstractC89183m<? super T, ? super T, C89391z> mVar, T t3) {
            C89219l.m154721d(mVar, "");
            this.f121565b = t;
            this.f121566c = t2;
            this.f121567d = mVar;
            this.f121564a = t3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$d */
    static final class C52836d extends AbstractC89220m implements AbstractC89172b<View, AbstractC89183m<? super Integer, ? super Integer, ? extends C89391z>> {

        /* renamed from: a */
        public static final C52836d f121571a = new C52836d();

        static {
            Covode.recordClassIndex(62236);
        }

        C52836d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC89183m<? super Integer, ? super Integer, ? extends C89391z> invoke(View view) {
            final View view2 = view;
            C89219l.m154721d(view2, "");
            return new AbstractC89183m<Integer, Integer, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.p3043g.p3044a.C52832d.C52836d.C528371 */

                static {
                    Covode.recordClassIndex(62237);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(Integer num, Integer num2) {
                    num.intValue();
                    int intValue = num2.intValue();
                    View view = view2;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = intValue;
                    view.setLayoutParams(marginLayoutParams);
                    return C89391z.f203057a;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$e */
    static final class C52838e extends AbstractC89220m implements AbstractC89172b<View, AbstractC89183m<? super C52842g, ? super C52842g, ? extends C89391z>> {

        /* renamed from: a */
        public static final C52838e f121573a = new C52838e();

        static {
            Covode.recordClassIndex(62238);
        }

        C52838e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC89183m<? super C52842g, ? super C52842g, ? extends C89391z> invoke(View view) {
            final View view2 = view;
            C89219l.m154721d(view2, "");
            return new AbstractC89183m<C52842g, C52842g, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.p3043g.p3044a.C52832d.C52838e.C528391 */

                static {
                    Covode.recordClassIndex(62239);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(C52842g gVar, C52842g gVar2) {
                    C52842g gVar3 = gVar2;
                    C89219l.m154721d(gVar, "");
                    C89219l.m154721d(gVar3, "");
                    View view = view2;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = gVar3.f121576a;
                    layoutParams.height = gVar3.f121577b;
                    view.setLayoutParams(layoutParams);
                    return C89391z.f203057a;
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52851e
    /* renamed from: a */
    public final void mo88482a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        m97696a(1.0f, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52855f
    /* renamed from: c */
    public final void mo88484c(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        m97696a(0.0f, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.g.a.d$i */
    public static final class C52845i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C52832d f121579a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f121580b;

        /* renamed from: c */
        final /* synthetic */ float f121581c;

        static {
            Covode.recordClassIndex(62245);
        }

        C52845i(C52832d dVar, AbstractC89171a aVar, float f) {
            this.f121579a = dVar;
            this.f121580b = aVar;
            this.f121581c = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52834b bVar = this.f121579a.f121556c;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            bVar.mo88492a(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$j */
    public static final class C52846j implements Animator.AnimatorListener {

        /* renamed from: a */
        public TextUtils.TruncateAt f121582a = TextUtils.TruncateAt.END;

        /* renamed from: b */
        final /* synthetic */ ValueAnimator f121583b;

        /* renamed from: c */
        final /* synthetic */ C52832d f121584c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f121585d;

        /* renamed from: e */
        final /* synthetic */ float f121586e;

        static {
            Covode.recordClassIndex(62246);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f121584c.f121555b.setEllipsize(this.f121582a);
            this.f121583b.removeAllUpdateListeners();
            this.f121583b.removeListener(this);
            this.f121585d.invoke();
        }

        public final void onAnimationStart(Animator animator) {
            TextUtils.TruncateAt ellipsize = this.f121584c.f121555b.getEllipsize();
            C89219l.m154716b(ellipsize, "");
            this.f121582a = ellipsize;
            this.f121584c.f121555b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f121584c.f121555b.setEllipsize(this.f121582a);
            this.f121583b.removeAllUpdateListeners();
            this.f121583b.removeListener(this);
            this.f121584c.f121556c.mo88492a(this.f121586e);
            this.f121585d.invoke();
        }

        C52846j(ValueAnimator valueAnimator, C52832d dVar, AbstractC89171a aVar, float f) {
            this.f121583b = valueAnimator;
            this.f121584c = dVar;
            this.f121585d = aVar;
            this.f121586e = f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$k */
    static final /* synthetic */ class C52847k extends C89217j implements AbstractC89172b<Integer, Integer> {
        static {
            Covode.recordClassIndex(62247);
        }

        C52847k(Resources resources) {
            super(1, resources, Resources.class, "getDimensionPixelSize", "getDimensionPixelSize(I)I", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(((Resources) this.receiver).getDimensionPixelSize(num.intValue()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52851e
    /* renamed from: b */
    public final void mo88483b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        ValueAnimator valueAnimator = this.f121560j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            int i = Build.VERSION.SDK_INT;
            valueAnimator.pause();
        }
        aVar.invoke();
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$g */
    static final class C52842g {

        /* renamed from: a */
        public final int f121576a;

        /* renamed from: b */
        public final int f121577b;

        static {
            Covode.recordClassIndex(62242);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C52842g)) {
                return false;
            }
            C52842g gVar = (C52842g) obj;
            return this.f121576a == gVar.f121576a && this.f121577b == gVar.f121577b;
        }

        public final int hashCode() {
            return (this.f121576a * 31) + this.f121577b;
        }

        public final String toString() {
            return "Size(width=" + this.f121576a + ", height=" + this.f121577b + ")";
        }

        public C52842g(int i, int i2) {
            this.f121576a = i;
            this.f121577b = i2;
        }
    }

    public C52832d(Context context, ViewGroup viewGroup) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        this.f121558e = context;
        this.f121559f = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.e6x);
        C89219l.m154716b(findViewById, "");
        this.f121554a = (ImageView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.e6w);
        C89219l.m154716b(findViewById2, "");
        this.f121555b = (TextView) findViewById2;
        this.f121557d = new C52847k(context.getResources());
        this.f121561k = C89250i.m154773a((AbstractC89171a) new C52850n(this));
        this.f121562l = C89250i.m154773a((AbstractC89171a) new C52849m(this));
        this.f121563m = C89250i.m154773a((AbstractC89171a) new C52848l(this));
    }

    /* renamed from: a */
    private final void m97696a(float f, AbstractC89171a<C89391z> aVar) {
        float f2 = this.f121556c.f121569b;
        if (f2 != f) {
            ValueAnimator valueAnimator = this.f121560j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                this.f121561k.getValue();
                this.f121563m.getValue();
                this.f121562l.getValue();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.f121560j = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setRepeatCount(0);
                    ofFloat.setDuration(300L);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.addUpdateListener(new C52845i(this, aVar, f));
                    ofFloat.addListener(new C52846j(ofFloat, this, aVar, f));
                    ofFloat.start();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$h */
    static final class C52843h extends C52833a<C52842g> {
        static {
            Covode.recordClassIndex(62243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52843h(C52842g gVar, C52842g gVar2, AbstractC89183m<? super C52842g, ? super C52842g, C89391z> mVar, C52834b bVar) {
            super(gVar, gVar2, mVar, gVar);
            C89219l.m154721d(gVar, "");
            C89219l.m154721d(gVar2, "");
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(bVar, "");
            bVar.f121568a.add(new AbstractC89183m<Float, Float, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3043g.p3044a.C52832d.C52843h.C528441 */

                /* renamed from: a */
                final /* synthetic */ C52843h f121578a;

                static {
                    Covode.recordClassIndex(62244);
                }

                {
                    this.f121578a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(Float f, Float f2) {
                    f.floatValue();
                    float floatValue = f2.floatValue();
                    C52843h hVar = this.f121578a;
                    T t = hVar.f121566c;
                    T t2 = this.f121578a.f121565b;
                    C89219l.m154721d(t2, "");
                    C52842g gVar = new C52842g(t.f121576a - t2.f121576a, t.f121577b - t2.f121577b);
                    C52842g gVar2 = new C52842g((int) (((float) gVar.f121576a) * floatValue), (int) (((float) gVar.f121577b) * floatValue));
                    T t3 = this.f121578a.f121565b;
                    C89219l.m154721d(t3, "");
                    hVar.mo88491a(new C52842g(gVar2.f121576a + t3.f121576a, gVar2.f121577b + t3.f121577b));
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$f */
    static final class C52840f extends C52833a<Integer> {
        static {
            Covode.recordClassIndex(62240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52840f(int i, int i2, AbstractC89183m<? super Integer, ? super Integer, C89391z> mVar, C52834b bVar) {
            super(Integer.valueOf(i), Integer.valueOf(i2), mVar, Integer.valueOf(i));
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(bVar, "");
            bVar.f121568a.add(new AbstractC89183m<Float, Float, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3043g.p3044a.C52832d.C52840f.C528411 */

                /* renamed from: a */
                final /* synthetic */ C52840f f121575a;

                static {
                    Covode.recordClassIndex(62241);
                }

                {
                    this.f121575a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ C89391z invoke(Float f, Float f2) {
                    f.floatValue();
                    float floatValue = f2.floatValue();
                    C52840f fVar = this.f121575a;
                    fVar.mo88491a(Integer.valueOf(((int) (((float) (fVar.f121566c.intValue() - this.f121575a.f121565b.intValue())) * floatValue)) + this.f121575a.f121565b.intValue()));
                    return C89391z.f203057a;
                }
            });
        }
    }
}
