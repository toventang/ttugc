package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.l */
public final class C1456l extends RecyclerView.AbstractC1361h implements RecyclerView.AbstractC1370m {

    /* renamed from: t */
    private static final int[] f4791t = {16842919};

    /* renamed from: u */
    private static final int[] f4792u = new int[0];

    /* renamed from: A */
    private int f4793A;

    /* renamed from: B */
    private final int[] f4794B = new int[2];

    /* renamed from: C */
    private final int[] f4795C = new int[2];

    /* renamed from: D */
    private final Runnable f4796D;

    /* renamed from: E */
    private final RecyclerView.AbstractC1371n f4797E;

    /* renamed from: a */
    final int f4798a;

    /* renamed from: b */
    public final StateListDrawable f4799b;

    /* renamed from: c */
    public final Drawable f4800c;

    /* renamed from: d */
    public final StateListDrawable f4801d;

    /* renamed from: e */
    public final Drawable f4802e;

    /* renamed from: f */
    int f4803f;

    /* renamed from: g */
    int f4804g;

    /* renamed from: h */
    float f4805h;

    /* renamed from: i */
    int f4806i;

    /* renamed from: j */
    int f4807j;

    /* renamed from: k */
    float f4808k;

    /* renamed from: l */
    int f4809l;

    /* renamed from: m */
    int f4810m;

    /* renamed from: n */
    RecyclerView f4811n;

    /* renamed from: o */
    boolean f4812o;

    /* renamed from: p */
    boolean f4813p;

    /* renamed from: q */
    int f4814q;

    /* renamed from: r */
    final ValueAnimator f4815r;

    /* renamed from: s */
    int f4816s;

    /* renamed from: v */
    private final int f4817v;

    /* renamed from: w */
    private final int f4818w;

    /* renamed from: x */
    private final int f4819x;

    /* renamed from: y */
    private final int f4820y;

    /* renamed from: z */
    private final int f4821z;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: a */
    public final void mo4750a(boolean z) {
    }

    /* renamed from: c */
    private void m4953c() {
        this.f4811n.removeCallbacks(this.f4796D);
    }

    /* renamed from: a */
    private boolean m4948a() {
        if (C0792v.m2768e(this.f4811n) == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(1594);
    }

    /* renamed from: b */
    private void m4950b() {
        int i = this.f4816s;
        if (i != 0) {
            if (i == 3) {
                this.f4815r.cancel();
            } else {
                return;
            }
        }
        this.f4816s = 1;
        ValueAnimator valueAnimator = this.f4815r;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4815r.setDuration(500L);
        this.f4815r.setStartDelay(0);
        this.f4815r.start();
    }

    /* renamed from: androidx.recyclerview.widget.l$a */
    class C1459a extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f4825b;

        static {
            Covode.recordClassIndex(1597);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f4825b = true;
        }

        C1459a() {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f4825b) {
                this.f4825b = false;
            } else if (((Float) C1456l.this.f4815r.getAnimatedValue()).floatValue() == 0.0f) {
                C1456l.this.f4816s = 0;
                C1456l.this.mo4961a(0);
            } else {
                C1456l.this.f4816s = 2;
                C1456l.this.f4811n.invalidate();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$b */
    class C1460b implements ValueAnimator.AnimatorUpdateListener {
        static {
            Covode.recordClassIndex(1598);
        }

        C1460b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1456l.this.f4799b.setAlpha(floatValue);
            C1456l.this.f4800c.setAlpha(floatValue);
            C1456l.this.f4811n.invalidate();
        }
    }

    /* renamed from: b */
    private void m4951b(int i) {
        m4953c();
        this.f4811n.postDelayed(this.f4796D, (long) i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4961a(int r4) {
        /*
            r3 = this;
            r2 = 2
            if (r4 != r2) goto L_0x0032
            int r0 = r3.f4814q
            if (r0 == r2) goto L_0x0011
            android.graphics.drawable.StateListDrawable r1 = r3.f4799b
            int[] r0 = androidx.recyclerview.widget.C1456l.f4791t
            r1.setState(r0)
            r3.m4953c()
        L_0x0011:
            r3.m4950b()
        L_0x0014:
            int r0 = r3.f4814q
            if (r0 != r2) goto L_0x0029
            if (r4 == r2) goto L_0x0026
            android.graphics.drawable.StateListDrawable r1 = r3.f4799b
            int[] r0 = androidx.recyclerview.widget.C1456l.f4792u
            r1.setState(r0)
            r0 = 1200(0x4b0, float:1.682E-42)
            r3.m4951b(r0)
        L_0x0026:
            r3.f4814q = r4
            return
        L_0x0029:
            r0 = 1
            if (r4 != r0) goto L_0x0026
            r0 = 1500(0x5dc, float:2.102E-42)
            r3.m4951b(r0)
            goto L_0x0026
        L_0x0032:
            if (r4 != 0) goto L_0x0011
            androidx.recyclerview.widget.RecyclerView r0 = r3.f4811n
            r0.invalidate()
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1456l.mo4961a(int):void");
    }

    /* renamed from: a */
    private boolean m4949a(float f, float f2) {
        if (m4948a()) {
            if (f > ((float) this.f4818w)) {
                return false;
            }
        } else if (f < ((float) (this.f4809l - this.f4818w))) {
            return false;
        }
        int i = this.f4804g;
        int i2 = this.f4803f;
        if (f2 < ((float) (i - (i2 / 2))) || f2 > ((float) (i + (i2 / 2)))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m4952b(float f, float f2) {
        if (f2 < ((float) (this.f4810m - this.f4820y))) {
            return false;
        }
        int i = this.f4807j;
        int i2 = this.f4806i;
        if (f < ((float) (i - (i2 / 2))) || f > ((float) (i + (i2 / 2)))) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: a */
    public final boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4814q;
        if (i == 1) {
            boolean a = m4949a(motionEvent.getX(), motionEvent.getY());
            boolean b = m4952b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a) {
                if (!b) {
                    return false;
                }
            } else if (!b) {
                if (a) {
                    this.f4793A = 2;
                    this.f4805h = (float) ((int) motionEvent.getY());
                }
                mo4961a(2);
            }
            this.f4793A = 1;
            this.f4808k = (float) ((int) motionEvent.getX());
            mo4961a(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: b */
    public final void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4814q != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = m4949a(motionEvent.getX(), motionEvent.getY());
                boolean b = m4952b(motionEvent.getX(), motionEvent.getY());
                if (!a) {
                    if (!b) {
                        return;
                    }
                } else if (!b) {
                    if (a) {
                        this.f4793A = 2;
                        this.f4805h = (float) ((int) motionEvent.getY());
                    }
                    mo4961a(2);
                }
                this.f4793A = 1;
                this.f4808k = (float) ((int) motionEvent.getX());
                mo4961a(2);
            } else if (motionEvent.getAction() == 1 && this.f4814q == 2) {
                this.f4805h = 0.0f;
                this.f4808k = 0.0f;
                mo4961a(1);
                this.f4793A = 0;
            } else if (motionEvent.getAction() == 2 && this.f4814q == 2) {
                m4950b();
                if (this.f4793A == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.f4795C;
                    int i = this.f4817v;
                    iArr[0] = i;
                    iArr[1] = this.f4809l - i;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f4807j) - max) >= 2.0f) {
                        int a2 = m4947a(this.f4808k, max, iArr, this.f4811n.computeHorizontalScrollRange(), this.f4811n.computeHorizontalScrollOffset(), this.f4809l);
                        if (a2 != 0) {
                            this.f4811n.scrollBy(a2, 0);
                        }
                        this.f4808k = max;
                    }
                }
                if (this.f4793A == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.f4794B;
                    int i2 = this.f4817v;
                    iArr2[0] = i2;
                    iArr2[1] = this.f4810m - i2;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y));
                    if (Math.abs(((float) this.f4804g) - max2) >= 2.0f) {
                        int a3 = m4947a(this.f4805h, max2, iArr2, this.f4811n.computeVerticalScrollRange(), this.f4811n.computeVerticalScrollOffset(), this.f4810m);
                        if (a3 != 0) {
                            this.f4811n.scrollBy(0, a3);
                        }
                        this.f4805h = max2;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        if (this.f4809l != this.f4811n.getWidth() || this.f4810m != this.f4811n.getHeight()) {
            this.f4809l = this.f4811n.getWidth();
            this.f4810m = this.f4811n.getHeight();
            mo4961a(0);
        } else if (this.f4816s != 0) {
            if (this.f4812o) {
                int i = this.f4809l;
                int i2 = this.f4818w;
                int i3 = i - i2;
                int i4 = this.f4804g;
                int i5 = this.f4803f;
                int i6 = i4 - (i5 / 2);
                this.f4799b.setBounds(0, 0, i2, i5);
                this.f4800c.setBounds(0, 0, this.f4819x, this.f4810m);
                if (m4948a()) {
                    this.f4800c.draw(canvas);
                    canvas.translate((float) this.f4818w, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f4799b.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.f4818w), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f4800c.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f4799b.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.f4813p) {
                int i7 = this.f4810m;
                int i8 = this.f4820y;
                int i9 = i7 - i8;
                int i10 = this.f4807j;
                int i11 = this.f4806i;
                int i12 = i10 - (i11 / 2);
                this.f4801d.setBounds(0, 0, i11, i8);
                this.f4802e.setBounds(0, 0, this.f4809l, this.f4821z);
                canvas.translate(0.0f, (float) i9);
                this.f4802e.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.f4801d.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    /* renamed from: a */
    private static int m4947a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    C1456l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4815r = ofFloat;
        this.f4816s = 0;
        this.f4796D = new Runnable() {
            /* class androidx.recyclerview.widget.C1456l.RunnableC14571 */

            static {
                Covode.recordClassIndex(1595);
            }

            public final void run() {
                C1456l lVar = C1456l.this;
                int i = lVar.f4816s;
                if (i == 1) {
                    lVar.f4815r.cancel();
                } else if (i != 2) {
                    return;
                }
                lVar.f4816s = 3;
                lVar.f4815r.setFloatValues(((Float) lVar.f4815r.getAnimatedValue()).floatValue(), 0.0f);
                lVar.f4815r.setDuration(500L);
                lVar.f4815r.start();
            }
        };
        C14582 r1 = new RecyclerView.AbstractC1371n() {
            /* class androidx.recyclerview.widget.C1456l.C14582 */

            static {
                Covode.recordClassIndex(1596);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                boolean z;
                boolean z2;
                C1456l lVar = C1456l.this;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int computeVerticalScrollRange = lVar.f4811n.computeVerticalScrollRange();
                int i3 = lVar.f4810m;
                if (computeVerticalScrollRange - i3 <= 0 || lVar.f4810m < lVar.f4798a) {
                    z = false;
                } else {
                    z = true;
                }
                lVar.f4812o = z;
                int computeHorizontalScrollRange = lVar.f4811n.computeHorizontalScrollRange();
                int i4 = lVar.f4809l;
                if (computeHorizontalScrollRange - i4 <= 0 || lVar.f4809l < lVar.f4798a) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                lVar.f4813p = z2;
                if (lVar.f4812o || lVar.f4813p) {
                    if (lVar.f4812o) {
                        float f = (float) i3;
                        lVar.f4804g = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                        lVar.f4803f = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                    }
                    if (lVar.f4813p) {
                        float f2 = (float) i4;
                        lVar.f4807j = (int) ((f2 * (((float) computeHorizontalScrollOffset) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                        lVar.f4806i = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                    }
                    if (lVar.f4814q == 0 || lVar.f4814q == 1) {
                        lVar.mo4961a(1);
                    }
                } else if (lVar.f4814q != 0) {
                    lVar.mo4961a(0);
                }
            }
        };
        this.f4797E = r1;
        this.f4799b = stateListDrawable;
        this.f4800c = drawable;
        this.f4801d = stateListDrawable2;
        this.f4802e = drawable2;
        this.f4818w = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4819x = Math.max(i, drawable.getIntrinsicWidth());
        this.f4820y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4821z = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4798a = i2;
        this.f4817v = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1459a());
        ofFloat.addUpdateListener(new C1460b());
        RecyclerView recyclerView2 = this.f4811n;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo4425c(this);
                this.f4811n.mo4417b((RecyclerView.AbstractC1370m) this);
                this.f4811n.mo4418b(r1);
                m4953c();
            }
            this.f4811n = recyclerView;
            if (recyclerView != null) {
                recyclerView.mo4402a((RecyclerView.AbstractC1361h) this);
                this.f4811n.mo4404a((RecyclerView.AbstractC1370m) this);
                this.f4811n.mo4405a(r1);
            }
        }
    }
}
