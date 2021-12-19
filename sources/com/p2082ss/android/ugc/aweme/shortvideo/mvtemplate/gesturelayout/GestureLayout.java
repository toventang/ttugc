package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.core.p037h.C0792v;
import androidx.p048g.p049a.p050a.C0995b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3845a.C72296a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72306d;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72307e;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72357f;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout */
public class GestureLayout extends AbstractC72299b implements AbstractC72352c {

    /* renamed from: A */
    private static final Property<C72291a, PointF> f162015A = new Property<C72291a, PointF>(PointF.class, "translations") {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.C7227812 */

        static {
            Covode.recordClassIndex(84945);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(C72291a aVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(C72291a aVar, PointF pointF) {
            C72291a aVar2 = aVar;
            PointF pointF2 = pointF;
            aVar2.f162055c = pointF2.x;
            aVar2.f162056d = pointF2.y;
            aVar2.mo114549a();
        }
    };

    /* renamed from: z */
    private static final Property<C72291a, float[]> f162016z = new Property<C72291a, float[]>(float[].class, "nonTranslations") {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.C7227711 */

        static {
            Covode.recordClassIndex(84944);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(C72291a aVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(C72291a aVar, float[] fArr) {
            C72291a aVar2 = aVar;
            float[] fArr2 = fArr;
            System.arraycopy(fArr2, 0, aVar2.f162054b, 0, fArr2.length);
            aVar2.mo114549a();
        }
    };

    /* renamed from: B */
    private TimeInterpolator f162017B = new C0995b();

    /* renamed from: m */
    public C72292a f162018m = new C72292a(getContext(), new C72292a.GestureDetector$OnDoubleTapListenerC72293a() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.C722751 */

        static {
            Covode.recordClassIndex(84942);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        /* renamed from: b */
        private void m127502b() {
            GestureLayout.this.f162022q = 0.0f;
            GestureLayout.this.f162023r = false;
            GestureLayout.this.f162024s = 0.0f;
            GestureLayout.this.f162025t = 0.0f;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        /* renamed from: a */
        public final void mo114521a() {
            super.mo114521a();
            m127502b();
            GestureLayout.this.mo114507a((float) ((int) GestureLayout.this.f162022q));
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        public final void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        public final boolean onDown(MotionEvent motionEvent) {
            if (GestureLayout.this.getChildCount() == 0) {
                return false;
            }
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (GestureLayout.this.f162019n == null) {
                return true;
            }
            GestureLayout.this.f162019n.mo114584a();
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        /* renamed from: a */
        public final void mo114522a(int i) {
            super.mo114522a(i);
            int i2 = (int) GestureLayout.this.f162022q;
            m127502b();
            GestureLayout.this.f162018m.f162063d = true;
            GestureLayout.this.mo114507a((float) i2);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72292a.GestureDetector$OnDoubleTapListenerC72293a
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            GestureLayout gestureLayout = GestureLayout.this;
            float f3 = -f;
            float f4 = -f2;
            gestureLayout.f162024s += f3;
            gestureLayout.f162025t += f4;
            if (!gestureLayout.f162023r && gestureLayout.f162025t > Math.abs(gestureLayout.f162024s)) {
                gestureLayout.f162023r = true;
                gestureLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (gestureLayout.f162023r) {
                gestureLayout.f162022q += f4;
                Matrix matrix = new Matrix(gestureLayout.f162027v);
                matrix.postTranslate(f3, f4);
                float min = 1.0f - Math.min(1.0f, Math.abs(gestureLayout.f162022q) / (new RectF(0.0f, 0.0f, (float) gestureLayout.getWidth(), (float) gestureLayout.getHeight()).height() * 1.0f));
                gestureLayout.f162026u = min;
                if (gestureLayout.f162019n != null) {
                    gestureLayout.f162019n.mo114585a(min);
                }
                float min2 = ((Math.min(1.0f, Math.abs(gestureLayout.f162022q) / (new RectF(0.0f, 0.0f, (float) gestureLayout.getWidth(), (float) gestureLayout.getHeight()).height() * 1.0f)) * -0.5f) + 1.0f) / C72307e.m127522a(gestureLayout.f162027v);
                matrix.postScale(min2, min2, motionEvent2.getX(), motionEvent2.getY());
                gestureLayout.setImageMatrix(matrix);
            }
            return true;
        }
    });

    /* renamed from: n */
    public AbstractC72318e f162019n;

    /* renamed from: o */
    public AbstractC72319f f162020o;

    /* renamed from: p */
    public RectF f162021p;

    /* renamed from: q */
    public float f162022q;

    /* renamed from: r */
    public boolean f162023r;

    /* renamed from: s */
    public float f162024s;

    /* renamed from: t */
    public float f162025t;

    /* renamed from: u */
    float f162026u = 1.0f;

    /* renamed from: v */
    public Matrix f162027v = new Matrix();

    /* renamed from: w */
    public AnimatorSet f162028w;

    /* renamed from: x */
    public Runnable f162029x;

    /* renamed from: y */
    public C72291a f162030y;

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c
    /* renamed from: a */
    public final void mo114506a() {
    }

    public TimeInterpolator getInterpolator() {
        return this.f162017B;
    }

    /* renamed from: b */
    private void m127493b() {
        Runnable runnable = this.f162029x;
        if (runnable != null) {
            runnable.run();
        }
    }

    private Animator getAlphaToFullTransparentAnimator() {
        return m127492b(0.0f);
    }

    public RectF getBaseOriginDisplayRect() {
        if (this.f162021p != null) {
            return new RectF(this.f162021p);
        }
        return null;
    }

    static {
        Covode.recordClassIndex(84941);
    }

    /* access modifiers changed from: protected */
    public ValueAnimator getDefaultDisappearFallbackAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.C722792 */

            static {
                Covode.recordClassIndex(84946);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GestureLayout.this.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                GestureLayout.this.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout$a */
    public static class C72291a {

        /* renamed from: a */
        public final Matrix f162053a = new Matrix();

        /* renamed from: b */
        final float[] f162054b;

        /* renamed from: c */
        float f162055c;

        /* renamed from: d */
        float f162056d;

        /* renamed from: e */
        private final GestureLayout f162057e;

        /* renamed from: f */
        private final RectF f162058f;

        /* renamed from: g */
        private final RectF f162059g = new RectF();

        static {
            Covode.recordClassIndex(84958);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo114549a() {
            this.f162053a.setValues(this.f162054b);
            this.f162053a.mapRect(this.f162059g, this.f162058f);
            this.f162053a.postTranslate(this.f162055c - this.f162059g.centerX(), this.f162056d - this.f162059g.centerY());
            this.f162057e.setImageMatrix(new Matrix(this.f162053a));
        }

        C72291a(GestureLayout gestureLayout, float[] fArr) {
            this.f162057e = gestureLayout;
            this.f162058f = new RectF(gestureLayout.getBaseOriginDisplayRect());
            this.f162054b = (float[]) fArr.clone();
            mo114549a();
        }
    }

    public void setGestureCallback(AbstractC72319f fVar) {
        this.f162020o = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c
    public void setGestureListener(AbstractC72357f fVar) {
        this.f162019n = fVar;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.f162017B = timeInterpolator;
    }

    public void setImageMatrix(Matrix matrix) {
        this.f162027v = matrix;
        invalidate();
    }

    /* renamed from: b */
    private Animator m127492b(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f162026u, f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.C722803 */

            static {
                Covode.recordClassIndex(84947);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (GestureLayout.this.f162019n != null) {
                    GestureLayout.this.f162019n.mo114585a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        return ofFloat;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C72292a aVar = this.f162018m;
        C89219l.m154721d(motionEvent, "");
        if (aVar.f162064e) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            aVar.f162063d = false;
            aVar.f162065f = false;
        }
        if (aVar.f162063d) {
            if (!aVar.f162065f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                GestureDetector gestureDetector = aVar.f162061b;
                if (gestureDetector == null) {
                    C89219l.m154715b();
                }
                gestureDetector.onTouchEvent(obtain);
                ScaleGestureDetector scaleGestureDetector = aVar.f162060a;
                if (scaleGestureDetector == null) {
                    C89219l.m154715b();
                }
                scaleGestureDetector.onTouchEvent(obtain);
                aVar.f162065f = true;
            }
            return false;
        }
        GestureDetector gestureDetector2 = aVar.f162061b;
        if (gestureDetector2 == null) {
            C89219l.m154715b();
        }
        boolean onTouchEvent = gestureDetector2.onTouchEvent(motionEvent);
        aVar.f162066g = MotionEvent.obtain(motionEvent);
        ScaleGestureDetector scaleGestureDetector2 = aVar.f162060a;
        if (scaleGestureDetector2 == null) {
            C89219l.m154715b();
        }
        scaleGestureDetector2.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            C72292a.GestureDetector$OnDoubleTapListenerC72293a aVar2 = aVar.f162062c;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            aVar2.mo114521a();
        }
        if (motionEvent.getActionMasked() == 6) {
            C72292a.GestureDetector$OnDoubleTapListenerC72293a aVar3 = aVar.f162062c;
            if (aVar3 == null) {
                C89219l.m154715b();
            }
            aVar3.mo114522a(motionEvent.getPointerId(0));
        }
        return onTouchEvent;
    }

    /* renamed from: a */
    public final void mo114507a(float f) {
        AbstractC72318e eVar;
        if (f > 0.0f && Math.abs(f) > ((float) getHeight()) * 0.2f && (eVar = this.f162019n) != null) {
            eVar.mo114586b();
        } else if (f != 0.0f) {
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofObject = ValueAnimator.ofObject(new C72306d(), new Matrix(this.f162027v), new Matrix(new Matrix()));
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.C722814 */

                static {
                    Covode.recordClassIndex(84948);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    GestureLayout.this.setImageMatrix(new Matrix((Matrix) valueAnimator.getAnimatedValue()));
                }
            });
            animatorSet.playTogether(ofObject, m127492b(1.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.C722825 */

                static {
                    Covode.recordClassIndex(84949);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            animatorSet.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c
    /* renamed from: a */
    public final void mo114508a(int i, int i2) {
        this.f162021p = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        if (getWidth() > 0 && getHeight() > 0) {
            m127493b();
        }
    }

    public GestureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final Matrix mo114505a(Rect rect, AbstractC72320g gVar) {
        float f;
        float f2;
        int width = getWidth();
        int height = getHeight();
        int width2 = (int) this.f162021p.width();
        int height2 = (int) this.f162021p.height();
        if (C72322i.m127538a(width, height, width2, height2)) {
            f = (float) height;
            f2 = (float) height2;
        } else {
            f = (float) width;
            f2 = (float) width2;
        }
        float f3 = f / f2;
        int i = width2 / 2;
        int i2 = height2 / 2;
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f3, (float) i, (float) i2);
        matrix.postTranslate((float) ((width / 2) - i), (float) ((height / 2) - i2));
        RectF rectF = new RectF(0.0f, 0.0f, (float) width2, (float) height2);
        matrix.mapRect(rectF, rectF);
        return gVar.mo114582a(rectF, rect);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72299b
    /* renamed from: a */
    public final boolean mo114511a(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.concat(this.f162027v);
        boolean a = super.mo114511a(canvas, view, j);
        canvas.restore();
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0041, code lost:
        if (r7 == null) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo114504a(android.graphics.Matrix r10, android.graphics.Matrix r11, com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3845a.C72296a r12) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.mo114504a(android.graphics.Matrix, android.graphics.Matrix, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a):android.animation.Animator");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72299b
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f162021p != null && getWidth() > 0 && getHeight() > 0) {
            m127493b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c
    /* renamed from: a */
    public final void mo114509a(Rect rect, Rect rect2, AbstractC72320g gVar, C72296a aVar) {
        this.f162029x = new Runnable(rect, rect2, gVar, aVar, null, 0.0f) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.RunnableC722836 */

            /* renamed from: a */
            final /* synthetic */ Rect f162037a;

            /* renamed from: b */
            final /* synthetic */ Rect f162038b;

            /* renamed from: c */
            final /* synthetic */ AbstractC72320g f162039c;

            /* renamed from: d */
            final /* synthetic */ C72296a f162040d;

            /* renamed from: e */
            final /* synthetic */ int[] f162041e = null;

            /* renamed from: f */
            final /* synthetic */ float f162042f = 0.0f;

            static {
                Covode.recordClassIndex(84950);
            }

            public final void run() {
                boolean z;
                boolean z2;
                boolean z3;
                GestureLayout.this.f162029x = null;
                if (GestureLayout.this.f162021p == null || GestureLayout.this.f162021p.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                Rect rect = this.f162037a;
                if (rect == null || rect.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Rect rect2 = this.f162038b;
                if (rect2 == null || rect2.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z || z2 || z3) {
                    GestureLayout.this.f162028w = new AnimatorSet();
                    GestureLayout.this.f162028w.addListener(new AnimatorListenerAdapter() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.RunnableC722836.C722841 */

                        static {
                            Covode.recordClassIndex(84951);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            GestureLayout.this.f162028w = null;
                        }
                    });
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.RunnableC722836.C722852 */

                        static {
                            Covode.recordClassIndex(84952);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (GestureLayout.this.f162019n != null) {
                                GestureLayout.this.f162019n.mo114585a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                            GestureLayout.this.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    GestureLayout.this.f162028w.playTogether(ofFloat);
                    GestureLayout.this.f162028w.setInterpolator(GestureLayout.this.getInterpolator());
                    GestureLayout.this.f162028w.setDuration(200L);
                    GestureLayout.this.f162028w.start();
                    return;
                }
                int[] iArr = new int[2];
                GestureLayout.this.getLocationOnScreen(iArr);
                this.f162037a.offset(-iArr[0], -iArr[1]);
                this.f162038b.offset(-iArr[0], -iArr[1]);
                Animator a = GestureLayout.this.mo114504a(new Matrix(GestureLayout.this.mo114505a(this.f162037a, this.f162039c)), new Matrix(GestureLayout.this.f162027v), this.f162040d);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.RunnableC722836.C722863 */

                    static {
                        Covode.recordClassIndex(84953);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (GestureLayout.this.f162019n != null) {
                            GestureLayout.this.f162019n.mo114585a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    }
                });
                C72296a aVar = this.f162040d;
                if (aVar != null) {
                    ofFloat2.setDuration(aVar.f162081i);
                    ofFloat2.setInterpolator(this.f162040d.f162076d);
                }
                ArrayList arrayList = new ArrayList();
                Rect rect3 = new Rect(this.f162037a);
                int[] iArr2 = this.f162041e;
                if (iArr2 != null) {
                    if (iArr2.length == 4) {
                        rect3.left += this.f162041e[0];
                        rect3.top += this.f162041e[1];
                        rect3.right -= this.f162041e[2];
                        rect3.bottom -= this.f162041e[3];
                    } else {
                        throw new IllegalArgumentException("maskInsetPixel length must equal 4");
                    }
                }
                arrayList.add(GestureLayout.this.mo114567a(rect3, this.f162038b, this.f162042f, false));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                C72296a aVar2 = this.f162040d;
                if (aVar2 != null) {
                    animatorSet.setDuration(aVar2.f162080h);
                    animatorSet.setInterpolator(this.f162040d.f162075c);
                }
                GestureLayout.this.f162028w = new AnimatorSet();
                GestureLayout.this.f162028w.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.RunnableC722836.C722874 */

                    static {
                        Covode.recordClassIndex(84954);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        GestureLayout.this.f162028w = null;
                    }
                });
                GestureLayout.this.f162028w.playTogether(a, animatorSet, ofFloat2);
                GestureLayout.this.f162028w.setInterpolator(GestureLayout.this.getInterpolator());
                if (this.f162040d == null) {
                    GestureLayout.this.f162028w.setDuration(200L);
                }
                GestureLayout.this.f162028w.start();
            }

            {
                this.f162037a = r3;
                this.f162038b = r4;
                this.f162039c = r5;
                this.f162040d = r6;
            }
        };
        if (this.f162021p != null && getWidth() > 0 && getHeight() > 0) {
            this.f162029x.run();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.AbstractC72352c
    /* renamed from: a */
    public final void mo114510a(Rect rect, Rect rect2, AbstractC72320g gVar, C72296a aVar, final AbstractC89171a<C89391z> aVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!C0792v.m2791y(this)) {
            aVar2.invoke();
            return;
        }
        RectF rectF = this.f162021p;
        if (rectF == null || rectF.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (rect == null || rect.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rect2 == null || rect2.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || z2 || z3) {
            ValueAnimator defaultDisappearFallbackAnimator = getDefaultDisappearFallbackAnimator();
            defaultDisappearFallbackAnimator.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.C722887 */

                static {
                    Covode.recordClassIndex(84955);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    aVar2.invoke();
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            this.f162028w = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.C722898 */

                static {
                    Covode.recordClassIndex(84956);
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    GestureLayout.this.f162028w = null;
                }
            });
            this.f162028w.playTogether(defaultDisappearFallbackAnimator, getAlphaToFullTransparentAnimator());
            this.f162028w.setInterpolator(getInterpolator());
            this.f162028w.setDuration(200L);
            this.f162028w.start();
            return;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.offset(-iArr[0], -iArr[1]);
        rect2.offset(-iArr[0], -iArr[1]);
        Animator a = mo114504a(new Matrix(this.f162027v), new Matrix(mo114505a(rect, gVar)), aVar);
        Animator a2 = mo114567a(new Rect(rect), rect2, 0.0f, true);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(a2);
        if (aVar != null) {
            animatorSet2.setDuration(aVar.f162080h);
            animatorSet2.setInterpolator(aVar.f162075c);
        }
        Animator alphaToFullTransparentAnimator = getAlphaToFullTransparentAnimator();
        if (aVar != null) {
            alphaToFullTransparentAnimator.setDuration(aVar.f162081i);
            alphaToFullTransparentAnimator.setInterpolator(aVar.f162076d);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f162028w = animatorSet3;
        animatorSet3.playTogether(a, animatorSet2, alphaToFullTransparentAnimator);
        this.f162028w.setInterpolator(getInterpolator());
        if (aVar == null) {
            this.f162028w.setDuration(200L);
        }
        this.f162028w.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout.C722909 */

            static {
                Covode.recordClassIndex(84957);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GestureLayout.this.f162028w = null;
                aVar2.invoke();
            }
        });
        this.f162028w.start();
    }
}
