package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.core.p037h.C0792v;
import androidx.p048g.p049a.p050a.C0995b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72299b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72320g;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3845a.C72296a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72301a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72302b;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72306d;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72307e;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout */
public final class ScaleGestureLayout extends AbstractC72299b implements AbstractC72352c {

    /* renamed from: E */
    public static final C72326a f162120E = new C72326a((byte) 0);

    /* renamed from: A */
    public final C0995b f162121A;

    /* renamed from: B */
    public AbstractC72357f f162122B;

    /* renamed from: C */
    int f162123C;

    /* renamed from: D */
    int f162124D;

    /* renamed from: F */
    private Runnable f162125F;

    /* renamed from: G */
    private final C72306d f162126G;

    /* renamed from: H */
    private final C72337g f162127H;

    /* renamed from: I */
    private final C72343a f162128I;

    /* renamed from: m */
    public Matrix f162129m;

    /* renamed from: n */
    RectF f162130n;

    /* renamed from: o */
    public Rect f162131o;

    /* renamed from: p */
    public boolean f162132p;

    /* renamed from: q */
    public final OverScroller f162133q;

    /* renamed from: r */
    public boolean f162134r;

    /* renamed from: s */
    boolean f162135s;

    /* renamed from: t */
    Animator f162136t;

    /* renamed from: u */
    Animator f162137u;

    /* renamed from: v */
    public AnimatorSet f162138v;

    /* renamed from: w */
    float f162139w;

    /* renamed from: x */
    float f162140x;

    /* renamed from: y */
    public float f162141y;

    /* renamed from: z */
    float f162142z;

    static {
        Covode.recordClassIndex(84992);
    }

    public ScaleGestureLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$a */
    public static final class C72326a {
        static {
            Covode.recordClassIndex(84994);
        }

        private C72326a() {
        }

        public /* synthetic */ C72326a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72299b
    /* renamed from: a */
    public final boolean mo114511a(Canvas canvas, View view, long j) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(view, "");
        canvas.save();
        canvas.concat(this.f162129m);
        boolean a = super.mo114511a(canvas, view, j);
        canvas.restore();
        return a;
    }

    /* access modifiers changed from: package-private */
    public final RectF getCurrentDisplayRectF() {
        RectF rectF = new RectF(this.f162130n);
        this.f162129m.mapRect(rectF);
        return rectF;
    }

    /* renamed from: b */
    public final void mo114597b() {
        this.f162139w = 0.0f;
        this.f162140x = 0.0f;
        this.f162141y = 1.0f;
        this.f162142z = 1.0f;
        this.f162134r = false;
        this.f162135s = false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public final void computeScroll() {
        if (this.f162133q.computeScrollOffset()) {
            int i = this.f162123C;
            int i2 = this.f162124D;
            int currX = this.f162133q.getCurrX();
            int currY = this.f162133q.getCurrY();
            this.f162123C = currX;
            this.f162124D = currY;
            mo114595a((float) (currX - i), (float) (currY - i2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c
    /* renamed from: a */
    public final void mo114506a() {
        this.f162129m.reset();
        this.f162136t = null;
        this.f162138v = null;
        this.f162137u = null;
        mo114597b();
        invalidate();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$b */
    static final class RunnableC72327b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScaleGestureLayout f162144a;

        /* renamed from: b */
        final /* synthetic */ Rect f162145b;

        /* renamed from: c */
        final /* synthetic */ Rect f162146c;

        /* renamed from: d */
        final /* synthetic */ AbstractC72320g f162147d;

        /* renamed from: e */
        final /* synthetic */ C72296a f162148e;

        /* renamed from: f */
        final /* synthetic */ int[] f162149f = null;

        /* renamed from: g */
        final /* synthetic */ float f162150g = 0.0f;

        static {
            Covode.recordClassIndex(84995);
        }

        RunnableC72327b(ScaleGestureLayout scaleGestureLayout, Rect rect, Rect rect2, AbstractC72320g gVar, C72296a aVar, int[] iArr, float f) {
            this.f162144a = scaleGestureLayout;
            this.f162145b = rect;
            this.f162146c = rect2;
            this.f162147d = gVar;
            this.f162148e = aVar;
        }

        public final void run() {
            boolean z;
            boolean z2;
            boolean z3;
            Rect rect;
            Rect rect2 = this.f162144a.f162131o;
            if (rect2 != null) {
                z = rect2.isEmpty();
            } else {
                z = true;
            }
            Rect rect3 = this.f162145b;
            if (rect3 != null) {
                z2 = rect3.isEmpty();
            } else {
                z2 = true;
            }
            Rect rect4 = this.f162146c;
            if (rect4 != null) {
                z3 = rect4.isEmpty();
            } else {
                z3 = true;
            }
            if (z || z2 || z3) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new C72328a(this));
                this.f162144a.f162138v = new AnimatorSet();
                AnimatorSet animatorSet = this.f162144a.f162138v;
                if (animatorSet != null) {
                    animatorSet.addListener(new C72330c(this, ofFloat));
                    animatorSet.playTogether(ofFloat);
                    animatorSet.setInterpolator(this.f162144a.f162121A);
                    animatorSet.setDuration(200L);
                    animatorSet.start();
                    return;
                }
                return;
            }
            Rect rect5 = this.f162145b;
            if (rect5 != null && (rect = this.f162146c) != null) {
                int[] iArr = new int[2];
                this.f162144a.getLocationOnScreen(iArr);
                rect5.offset(-iArr[0], -iArr[1]);
                rect.offset(-iArr[0], -iArr[1]);
                AnimatorSet a = C72301a.m127515a(new Matrix(C72301a.m127516a(this.f162145b, this.f162144a.getWidth(), this.f162144a.getHeight(), this.f162144a.f162131o, this.f162147d)), new Matrix(), this.f162144a.f162131o, this.f162148e, new C72332e(this));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new C72329b(this));
                ofFloat2.setDuration(this.f162148e.f162081i);
                ofFloat2.setInterpolator(this.f162148e.f162076d);
                Rect rect6 = new Rect(this.f162145b);
                int[] iArr2 = this.f162149f;
                if (iArr2 != null) {
                    if (iArr2.length == 4) {
                        rect6.left += iArr2[0];
                        rect6.top += iArr2[1];
                        rect6.right -= iArr2[2];
                        rect6.bottom -= iArr2[3];
                    } else {
                        throw new IllegalArgumentException("maskInsetPixel length must equal 4".toString());
                    }
                }
                Animator a2 = this.f162144a.mo114567a(rect6, this.f162146c, this.f162150g, false);
                a2.setDuration(this.f162148e.f162080h);
                a2.setInterpolator(this.f162148e.f162075c);
                this.f162144a.f162138v = new AnimatorSet();
                AnimatorSet animatorSet2 = this.f162144a.f162138v;
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new C72331d(this, a, a2, ofFloat2));
                    animatorSet2.playTogether(a, a2, ofFloat2);
                    animatorSet2.setInterpolator(this.f162144a.f162121A);
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$b$c */
        public static final class C72330c extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ RunnableC72327b f162153a;

            /* renamed from: b */
            final /* synthetic */ ValueAnimator f162154b;

            static {
                Covode.recordClassIndex(84998);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f162153a.f162144a.f162138v = null;
            }

            C72330c(RunnableC72327b bVar, ValueAnimator valueAnimator) {
                this.f162153a = bVar;
                this.f162154b = valueAnimator;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$b$e */
        static final class C72332e extends AbstractC89220m implements AbstractC89172b<Matrix, C89391z> {

            /* renamed from: a */
            final /* synthetic */ RunnableC72327b f162159a;

            static {
                Covode.recordClassIndex(85000);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C72332e(RunnableC72327b bVar) {
                super(1);
                this.f162159a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Matrix matrix) {
                Matrix matrix2 = matrix;
                C89219l.m154721d(matrix2, "");
                this.f162159a.f162144a.f162129m = matrix2;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$b$b */
        static final class C72329b implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ RunnableC72327b f162152a;

            static {
                Covode.recordClassIndex(84997);
            }

            C72329b(RunnableC72327b bVar) {
                this.f162152a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbstractC72357f fVar;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (fVar = this.f162152a.f162144a.f162122B) != null) {
                    fVar.mo114585a(((Number) animatedValue).floatValue());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$b$a */
        static final class C72328a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ RunnableC72327b f162151a;

            static {
                Covode.recordClassIndex(84996);
            }

            C72328a(RunnableC72327b bVar) {
                this.f162151a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue instanceof Float) {
                    AbstractC72357f fVar = this.f162151a.f162144a.f162122B;
                    if (fVar != null) {
                        fVar.mo114585a(((Number) animatedValue).floatValue());
                    }
                    this.f162151a.f162144a.setAlpha(((Number) animatedValue).floatValue());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$b$d */
        public static final class C72331d extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ RunnableC72327b f162155a;

            /* renamed from: b */
            final /* synthetic */ AnimatorSet f162156b;

            /* renamed from: c */
            final /* synthetic */ Animator f162157c;

            /* renamed from: d */
            final /* synthetic */ ValueAnimator f162158d;

            static {
                Covode.recordClassIndex(84999);
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                super.onAnimationEnd(animator);
                this.f162155a.f162144a.mo114597b();
                this.f162155a.f162144a.f162129m.reset();
                C0792v.m2764c(this.f162155a.f162144a);
                this.f162155a.f162144a.f162138v = null;
            }

            C72331d(RunnableC72327b bVar, AnimatorSet animatorSet, Animator animator, ValueAnimator valueAnimator) {
                this.f162155a = bVar;
                this.f162156b = animatorSet;
                this.f162157c = animator;
                this.f162158d = valueAnimator;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$g */
    public static final class C72337g implements AbstractC72351b {

        /* renamed from: a */
        final /* synthetic */ ScaleGestureLayout f162170a;

        static {
            Covode.recordClassIndex(85005);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72351b
        /* renamed from: d */
        public final void mo114619d(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C72337g(ScaleGestureLayout scaleGestureLayout) {
            this.f162170a = scaleGestureLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72351b
        /* renamed from: a */
        public final boolean mo114611a(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            AbstractC72357f fVar = this.f162170a.f162122B;
            if (fVar == null) {
                return true;
            }
            fVar.mo114584a();
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72351b
        /* renamed from: a */
        public final boolean mo114613a(C72354e eVar) {
            C89219l.m154721d(eVar, "");
            boolean z = false;
            this.f162170a.getParent().requestDisallowInterceptTouchEvent(false);
            if (this.f162170a.f162141y >= 1.0f) {
                z = true;
                AbstractC72357f fVar = this.f162170a.f162122B;
                if (fVar != null) {
                    fVar.mo114639c();
                }
            }
            return z;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72351b
        /* renamed from: a */
        public final void mo114610a(C84882b bVar) {
            C89219l.m154721d(bVar, "");
            if (this.f162170a.f162132p) {
                this.f162170a.f162132p = false;
                return;
            }
            ScaleGestureLayout scaleGestureLayout = this.f162170a;
            if (scaleGestureLayout.f162141y > 1.0f) {
                return;
            }
            if (scaleGestureLayout.f162140x <= 0.0f || Math.abs(scaleGestureLayout.f162140x) <= ((float) scaleGestureLayout.getHeight()) * 0.2f) {
                Animator animator = scaleGestureLayout.f162137u;
                if (animator == null || !animator.isRunning()) {
                    Animator a = scaleGestureLayout.mo114593a(new Matrix(scaleGestureLayout.f162129m), new Matrix());
                    a.addListener(new C72340j(scaleGestureLayout));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a, scaleGestureLayout.mo114592a(1.0f));
                    animatorSet.start();
                    scaleGestureLayout.f162137u = animatorSet;
                    return;
                }
                return;
            }
            AbstractC72357f fVar = scaleGestureLayout.f162122B;
            if (fVar != null) {
                fVar.mo114586b();
            }
            scaleGestureLayout.mo114597b();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72351b
        /* renamed from: c */
        public final boolean mo114617c(MotionEvent motionEvent) {
            ViewParent parent;
            C89219l.m154721d(motionEvent, "");
            if (motionEvent.getPointerCount() > 2) {
                this.f162170a.getParent().requestDisallowInterceptTouchEvent(true);
            }
            AnimatorSet animatorSet = this.f162170a.f162138v;
            if (animatorSet != null && animatorSet.isRunning()) {
                return false;
            }
            if (this.f162170a.f162141y > 1.0f && (parent = this.f162170a.getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.f162170a.f162133q.forceFinished(true);
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72351b
        /* renamed from: b */
        public final void mo114614b(C72354e eVar) {
            C89378p<Float, Float> a;
            C89219l.m154721d(eVar, "");
            this.f162170a.f162132p = true;
            AbstractC72357f fVar = this.f162170a.f162122B;
            if (fVar != null) {
                fVar.mo114640d();
            }
            ScaleGestureLayout scaleGestureLayout = this.f162170a;
            if (scaleGestureLayout.f162141y >= 1.0f) {
                Animator animator = scaleGestureLayout.f162136t;
                if (animator == null || !animator.isRunning()) {
                    Animator animator2 = scaleGestureLayout.f162137u;
                    if ((animator2 == null || !animator2.isRunning()) && scaleGestureLayout.f162133q.isFinished() && (a = scaleGestureLayout.mo114594a(scaleGestureLayout.getCurrentDisplayRectF())) != null) {
                        Matrix matrix = new Matrix(scaleGestureLayout.f162129m);
                        matrix.postTranslate(a.getFirst().floatValue(), a.getSecond().floatValue());
                        Animator a2 = scaleGestureLayout.mo114593a(new Matrix(scaleGestureLayout.f162129m), matrix);
                        a2.start();
                        scaleGestureLayout.f162136t = a2;
                        return;
                    }
                    return;
                }
                return;
            }
            Animator animator3 = scaleGestureLayout.f162137u;
            if (animator3 == null || !animator3.isRunning()) {
                Animator a3 = scaleGestureLayout.mo114593a(scaleGestureLayout.f162129m, new Matrix());
                a3.addListener(new C72341k(scaleGestureLayout));
                a3.start();
                scaleGestureLayout.f162137u = a3;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72351b
        /* renamed from: c */
        public final boolean mo114618c(C72354e eVar) {
            float min;
            C89219l.m154721d(eVar, "");
            if (eVar.f162215l == -1.0f) {
                if (eVar.f162213j == -1.0f) {
                    float f = eVar.f162211h;
                    float f2 = eVar.f162212i;
                    eVar.f162213j = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
                }
                float f3 = eVar.f162213j;
                if (eVar.f162214k == -1.0f) {
                    float f4 = eVar.f162209f;
                    float f5 = eVar.f162210g;
                    eVar.f162214k = (float) Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
                }
                eVar.f162215l = f3 / eVar.f162214k;
            }
            float f6 = eVar.f162215l;
            float f7 = eVar.f162207d;
            float f8 = eVar.f162208e;
            if (Float.isNaN(f6) || Float.isInfinite(f6)) {
                return false;
            }
            ScaleGestureLayout scaleGestureLayout = this.f162170a;
            if (f6 == 1.0f) {
                return true;
            }
            float a = C72307e.m127522a(scaleGestureLayout.f162129m);
            if (f6 < 1.0f) {
                min = Math.max(0.7f / a, f6);
            } else {
                min = Math.min(10.0f / a, f6);
            }
            C89378p<Float, Float> b = scaleGestureLayout.mo114596b(f7, f8);
            scaleGestureLayout.f162129m.postScale(min, min, b.getFirst().floatValue(), b.getSecond().floatValue());
            scaleGestureLayout.f162141y = C72307e.m127522a(scaleGestureLayout.f162129m);
            scaleGestureLayout.invalidate();
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72351b
        /* renamed from: b */
        public final boolean mo114615b(MotionEvent motionEvent) {
            Animator animator;
            Matrix matrix;
            Animator animator2;
            C89219l.m154721d(motionEvent, "");
            ScaleGestureLayout scaleGestureLayout = this.f162170a;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            AnimatorSet animatorSet = scaleGestureLayout.f162138v;
            if ((animatorSet == null || !animatorSet.isRunning()) && ((animator = scaleGestureLayout.f162136t) == null || !animator.isRunning())) {
                Animator animator3 = scaleGestureLayout.f162137u;
                if (!(animator3 == null || !animator3.isRunning() || (animator2 = scaleGestureLayout.f162137u) == null)) {
                    animator2.cancel();
                }
                float f = 3.0f;
                if (C72302b.m127519c(scaleGestureLayout.f162141y, 3.0f)) {
                    matrix = new Matrix();
                } else {
                    if (scaleGestureLayout.f162141y * 3.0f > 3.0f) {
                        f = 3.0f / scaleGestureLayout.f162141y;
                    }
                    matrix = new Matrix(scaleGestureLayout.f162129m);
                    C89378p<Float, Float> b = scaleGestureLayout.mo114596b(x, y);
                    matrix.postScale(f, f, b.getFirst().floatValue(), b.getSecond().floatValue());
                    RectF rectF = new RectF(scaleGestureLayout.f162130n);
                    matrix.mapRect(rectF);
                    C89378p<Float, Float> a = scaleGestureLayout.mo114594a(rectF);
                    if (a != null) {
                        matrix.postTranslate(a.getFirst().floatValue(), a.getSecond().floatValue());
                    }
                }
                Animator a2 = scaleGestureLayout.mo114593a(new Matrix(scaleGestureLayout.f162129m), matrix);
                a2.start();
                scaleGestureLayout.f162137u = a2;
            }
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72351b
        /* renamed from: a */
        public final boolean mo114612a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            Animator animator;
            AnimatorSet animatorSet;
            boolean z;
            boolean z2;
            C89219l.m154721d(motionEvent, "");
            C89219l.m154721d(motionEvent2, "");
            ScaleGestureLayout scaleGestureLayout = this.f162170a;
            Animator animator2 = scaleGestureLayout.f162136t;
            if ((animator2 == null || !animator2.isRunning()) && (((animator = scaleGestureLayout.f162137u) == null || !animator.isRunning()) && ((animatorSet = scaleGestureLayout.f162138v) == null || !animatorSet.isRunning()))) {
                RectF currentDisplayRectF = scaleGestureLayout.getCurrentDisplayRectF();
                if (currentDisplayRectF.width() >= ((float) scaleGestureLayout.getWidth()) || currentDisplayRectF.height() >= ((float) scaleGestureLayout.getHeight())) {
                    float f3 = -Math.max(currentDisplayRectF.right - ((float) scaleGestureLayout.getWidth()), 0.0f);
                    float max = Math.max(0.0f - currentDisplayRectF.left, 0.0f);
                    float f4 = -Math.max(currentDisplayRectF.bottom - ((float) scaleGestureLayout.getHeight()), 0.0f);
                    float max2 = Math.max(0.0f - currentDisplayRectF.top, 0.0f);
                    if (!C72302b.m127517a(f3, 0.0f) || !C72302b.m127517a(max, 0.0f) || !C72302b.m127517a(f4, 0.0f) || !C72302b.m127517a(max2, 0.0f)) {
                        if ((f <= 0.0f || max <= 0.0f) && (f >= 0.0f || f3 >= 0.0f)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if ((f2 <= 0.0f || max2 <= 0.0f) && (f2 >= 0.0f || f4 >= 0.0f)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z || z2) {
                            scaleGestureLayout.f162123C = 0;
                            scaleGestureLayout.f162124D = 0;
                            scaleGestureLayout.f162133q.fling(0, 0, (int) f, (int) f2, (int) f3, (int) max, (int) f4, (int) max2);
                            C0792v.m2764c(scaleGestureLayout);
                        }
                    }
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00f6  */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72351b
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo114616b(android.view.MotionEvent r12, android.view.MotionEvent r13, float r14, float r15) {
            /*
            // Method dump skipped, instructions count: 659
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout.C72337g.mo114616b(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$j */
    public static final class C72340j extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ScaleGestureLayout f162174a;

        static {
            Covode.recordClassIndex(85008);
        }

        C72340j(ScaleGestureLayout scaleGestureLayout) {
            this.f162174a = scaleGestureLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f162174a.mo114597b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$k */
    public static final class C72341k extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ScaleGestureLayout f162175a;

        static {
            Covode.recordClassIndex(85009);
        }

        C72341k(ScaleGestureLayout scaleGestureLayout) {
            this.f162175a = scaleGestureLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f162175a.mo114597b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c
    public final void setGestureListener(AbstractC72357f fVar) {
        C89219l.m154721d(fVar, "");
        this.f162122B = fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$d */
    public static final class C72334d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ScaleGestureLayout f162161a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f162162b;

        /* renamed from: c */
        final /* synthetic */ ValueAnimator f162163c;

        static {
            Covode.recordClassIndex(85002);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f162161a.f162138v = null;
            this.f162162b.invoke();
        }

        C72334d(ScaleGestureLayout scaleGestureLayout, AbstractC89171a aVar, ValueAnimator valueAnimator) {
            this.f162161a = scaleGestureLayout;
            this.f162162b = aVar;
            this.f162163c = valueAnimator;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$e */
    public static final class C72335e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ScaleGestureLayout f162164a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f162165b;

        /* renamed from: c */
        final /* synthetic */ AnimatorSet f162166c;

        /* renamed from: d */
        final /* synthetic */ Animator f162167d;

        /* renamed from: e */
        final /* synthetic */ Animator f162168e;

        static {
            Covode.recordClassIndex(85003);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f162164a.f162138v = null;
            this.f162165b.invoke();
        }

        C72335e(ScaleGestureLayout scaleGestureLayout, AbstractC89171a aVar, AnimatorSet animatorSet, Animator animator, Animator animator2) {
            this.f162164a = scaleGestureLayout;
            this.f162165b = aVar;
            this.f162166c = animatorSet;
            this.f162167d = animator;
            this.f162168e = animator2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$f */
    static final class C72336f extends AbstractC89220m implements AbstractC89172b<Matrix, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ScaleGestureLayout f162169a;

        static {
            Covode.recordClassIndex(85004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72336f(ScaleGestureLayout scaleGestureLayout) {
            super(1);
            this.f162169a = scaleGestureLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Matrix matrix) {
            Matrix matrix2 = matrix;
            C89219l.m154721d(matrix2, "");
            this.f162169a.f162129m = matrix2;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$h */
    public static final class C72338h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScaleGestureLayout f162171a;

        static {
            Covode.recordClassIndex(85006);
        }

        C72338h(ScaleGestureLayout scaleGestureLayout) {
            this.f162171a = scaleGestureLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC72357f fVar;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (fVar = this.f162171a.f162122B) != null) {
                fVar.mo114585a(((Number) animatedValue).floatValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Animator mo114592a(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f162142z, f);
        ofFloat.addUpdateListener(new C72338h(this));
        C89219l.m154716b(ofFloat, "");
        return ofFloat;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$c */
    static final class C72333c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScaleGestureLayout f162160a;

        static {
            Covode.recordClassIndex(85001);
        }

        C72333c(ScaleGestureLayout scaleGestureLayout) {
            this.f162160a = scaleGestureLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScaleGestureLayout scaleGestureLayout = this.f162160a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            scaleGestureLayout.setScaleX(((Float) animatedValue).floatValue());
            ScaleGestureLayout scaleGestureLayout2 = this.f162160a;
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            scaleGestureLayout2.setScaleY(((Float) animatedValue2).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout$i */
    public static final class C72339i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f162172a;

        /* renamed from: b */
        final /* synthetic */ ScaleGestureLayout f162173b;

        static {
            Covode.recordClassIndex(85007);
        }

        C72339i(ValueAnimator valueAnimator, ScaleGestureLayout scaleGestureLayout) {
            this.f162172a = valueAnimator;
            this.f162173b = scaleGestureLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Matrix) {
                this.f162173b.f162129m = (Matrix) animatedValue;
                ScaleGestureLayout scaleGestureLayout = this.f162173b;
                scaleGestureLayout.f162141y = C72307e.m127522a(scaleGestureLayout.f162129m);
                C0792v.m2764c(this.f162173b);
            }
            this.f162172a.setInterpolator(this.f162173b.f162121A);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p4600h.C89378p<java.lang.Float, java.lang.Float> mo114594a(android.graphics.RectF r6) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout.mo114594a(android.graphics.RectF):h.p");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        if (r8 != false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c
    /* renamed from: a */
    public final void mo114508a(int i, int i2) {
        this.f162131o = new Rect(0, 0, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Animator mo114593a(Matrix matrix, Matrix matrix2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(this.f162126G, matrix, matrix2);
        ofObject.addUpdateListener(new C72339i(ofObject, this));
        C89219l.m154716b(ofObject, "");
        return ofObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C89378p<Float, Float> mo114596b(float f, float f2) {
        RectF currentDisplayRectF = getCurrentDisplayRectF();
        if (C72302b.m127520d(f, currentDisplayRectF.left)) {
            f = currentDisplayRectF.left;
        } else if (C72302b.m127518b(f, currentDisplayRectF.right)) {
            f = currentDisplayRectF.right;
        }
        if (C72302b.m127520d(f2, currentDisplayRectF.top)) {
            f2 = currentDisplayRectF.top;
        } else if (C72302b.m127518b(f2, currentDisplayRectF.bottom)) {
            f2 = currentDisplayRectF.bottom;
        }
        return new C89378p<>(Float.valueOf(f), Float.valueOf(f2));
    }

    /* renamed from: a */
    public final void mo114595a(float f, float f2) {
        if (!C72302b.m127517a(f, 0.0f) || !C72302b.m127517a(f2, 0.0f)) {
            this.f162129m.postTranslate(f, f2);
            invalidate();
        }
    }

    private /* synthetic */ ScaleGestureLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ScaleGestureLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f162129m = new Matrix();
        this.f162133q = new OverScroller(context);
        this.f162141y = 1.0f;
        this.f162142z = 1.0f;
        this.f162121A = new C0995b();
        this.f162126G = new C72306d();
        post(new Runnable(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.ScaleGestureLayout.RunnableC723251 */

            /* renamed from: a */
            final /* synthetic */ ScaleGestureLayout f162143a;

            static {
                Covode.recordClassIndex(84993);
            }

            {
                this.f162143a = r1;
            }

            public final void run() {
                float f;
                ScaleGestureLayout scaleGestureLayout = this.f162143a;
                float width = (float) scaleGestureLayout.getWidth();
                float height = (float) this.f162143a.getHeight();
                Rect rect = scaleGestureLayout.f162131o;
                if (rect != null) {
                    float width2 = (float) rect.width();
                    Rect rect2 = scaleGestureLayout.f162131o;
                    if (rect2 != null) {
                        float height2 = (float) rect2.height();
                        float f2 = width2 / height2;
                        float f3 = width / height;
                        float f4 = 0.0f;
                        if (f2 > f3) {
                            float f5 = (height2 / width2) * width;
                            float f6 = (height - f5) / 2.0f;
                            f = f6;
                            height = f6 + f5;
                        } else {
                            if (f2 < f3) {
                                float f7 = f2 * height;
                                float f8 = (width - f7) / 2.0f;
                                f4 = f8;
                                width = f8 + f7;
                            }
                            f = 0.0f;
                        }
                        scaleGestureLayout.f162130n = new RectF(f4, f, width, height);
                    }
                }
            }
        });
        C72337g gVar = new C72337g(this);
        this.f162127H = gVar;
        this.f162128I = new C72343a(context, gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72299b
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Runnable runnable;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f162131o != null && getWidth() > 0 && getHeight() > 0 && this.f162129m.isIdentity() && (runnable = this.f162125F) != null) {
            runnable.run();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c
    /* renamed from: a */
    public final void mo114509a(Rect rect, Rect rect2, AbstractC72320g gVar, C72296a aVar) {
        Runnable runnable;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(aVar, "");
        this.f162125F = new RunnableC72327b(this, rect, rect2, gVar, aVar, null, 0.0f);
        if (this.f162131o != null && getWidth() > 0 && getHeight() > 0 && (runnable = this.f162125F) != null) {
            runnable.run();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c
    /* renamed from: a */
    public final void mo114510a(Rect rect, Rect rect2, AbstractC72320g gVar, C72296a aVar, AbstractC89171a<C89391z> aVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        if (!C0792v.m2791y(this)) {
            aVar2.invoke();
            return;
        }
        Rect rect3 = this.f162131o;
        if (rect3 != null) {
            z = rect3.isEmpty();
        } else {
            z = true;
        }
        if (rect != null) {
            z2 = rect.isEmpty();
        } else {
            z2 = true;
        }
        if (rect2 != null) {
            z3 = rect2.isEmpty();
        } else {
            z3 = true;
        }
        if (z || z2 || z3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new C72333c(this));
            AnimatorSet animatorSet = new AnimatorSet();
            this.f162138v = animatorSet;
            animatorSet.addListener(new C72334d(this, aVar2, ofFloat));
            animatorSet.playTogether(ofFloat, mo114592a(0.0f));
            animatorSet.setInterpolator(this.f162121A);
            animatorSet.setDuration(200L);
            animatorSet.start();
        } else if (rect != null && rect2 != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            rect.offset(-iArr[0], -iArr[1]);
            rect2.offset(-iArr[0], -iArr[1]);
            AnimatorSet a = C72301a.m127515a(new Matrix(this.f162129m), new Matrix(C72301a.m127516a(rect, getWidth(), getHeight(), this.f162131o, gVar)), this.f162131o, aVar, new C72336f(this));
            Animator a2 = mo114567a(new Rect(rect), rect2, 0.0f, true);
            a2.setDuration(aVar.f162080h);
            a2.setInterpolator(aVar.f162075c);
            Animator a3 = mo114592a(0.0f);
            a3.setDuration(aVar.f162080h);
            a3.setInterpolator(aVar.f162075c);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f162138v = animatorSet2;
            animatorSet2.addListener(new C72335e(this, aVar2, a, a2, a3));
            animatorSet2.playTogether(a, a2, a3);
            animatorSet2.setInterpolator(this.f162121A);
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }
}
