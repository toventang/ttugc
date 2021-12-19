package com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b */
public class C44517b extends AppCompatImageView {

    /* renamed from: A */
    public RunnableC44528g f103822A = new RunnableC44528g();

    /* renamed from: B */
    public RectF f103823B;

    /* renamed from: C */
    public Runnable f103824C;

    /* renamed from: D */
    public View.OnLongClickListener f103825D;

    /* renamed from: E */
    public AbstractC44526e f103826E;

    /* renamed from: F */
    int f103827F = 0;

    /* renamed from: G */
    public Runnable f103828G = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.RunnableC445192 */

        static {
            Covode.recordClassIndex(52869);
        }

        public final void run() {
            if (C44517b.this.f103852f != null) {
                C44517b.this.f103852f.onClick(C44517b.this);
            }
        }
    };

    /* renamed from: H */
    private int f103829H;

    /* renamed from: I */
    private int f103830I;

    /* renamed from: J */
    private int f103831J;

    /* renamed from: K */
    private int f103832K = 500;

    /* renamed from: L */
    private Matrix f103833L = new Matrix();

    /* renamed from: M */
    private Matrix f103834M = new Matrix();

    /* renamed from: N */
    private GestureDetector f103835N;

    /* renamed from: O */
    private ScaleGestureDetector f103836O;

    /* renamed from: P */
    private ImageView.ScaleType f103837P;

    /* renamed from: Q */
    private boolean f103838Q;

    /* renamed from: R */
    private boolean f103839R;

    /* renamed from: S */
    private boolean f103840S;

    /* renamed from: T */
    private boolean f103841T;

    /* renamed from: U */
    private PointF f103842U = new PointF();

    /* renamed from: V */
    private C44516a f103843V;

    /* renamed from: W */
    private long f103844W;

    /* renamed from: a */
    public int f103845a;

    /* renamed from: aa */
    private ScaleGestureDetector.OnScaleGestureListener f103846aa = new ScaleGestureDetector.OnScaleGestureListener() {
        /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.ScaleGestureDetector$OnScaleGestureListenerC445181 */

        static {
            Covode.recordClassIndex(52868);
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            boolean z = false;
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            C44517b.this.f103861o *= scaleFactor;
            C44517b bVar = C44517b.this;
            if (bVar.f103861o > 1.0f) {
                z = true;
            }
            bVar.f103856j = z;
            C44517b.this.f103850d.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            C44517b.this.mo75553a();
            if (C44517b.this.f103826E != null) {
                C44517b.this.f103826E.mo75544a(C44517b.this.f103861o);
            }
            return true;
        }
    };

    /* renamed from: ab */
    private GestureDetector.OnGestureListener f103847ab = new GestureDetector.SimpleOnGestureListener() {
        /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.C445203 */

        static {
            Covode.recordClassIndex(52870);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (C44517b.this.f103825D != null) {
                C44517b.this.f103825D.onLongClick(C44517b.this);
            }
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            C44517b bVar = C44517b.this;
            bVar.postDelayed(bVar.f103828G, 250);
            return false;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            C44517b.this.f103854h = false;
            C44517b.this.f103853g = false;
            C44517b.this.f103857k = false;
            C44517b bVar = C44517b.this;
            bVar.removeCallbacks(bVar.f103828G);
            return false;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            float f;
            C44517b.this.f103822A.mo75595b();
            float width = C44517b.this.f103868v.left + (C44517b.this.f103868v.width() / 2.0f);
            float height = C44517b.this.f103868v.top + (C44517b.this.f103868v.height() / 2.0f);
            C44517b.this.f103871y.set(width, height);
            C44517b.this.f103872z.set(width, height);
            C44517b.this.f103862p = 0;
            C44517b.this.f103863q = 0;
            float f2 = 1.0f;
            if (C44517b.this.f103856j) {
                f = C44517b.this.f103861o;
                if (C44517b.this.f103826E != null) {
                    C44517b.this.f103826E.mo75544a(1.0f);
                }
            } else {
                f = C44517b.this.f103861o;
                f2 = C44517b.this.f103848b;
                if (C44517b.this.f103826E != null) {
                    C44517b.this.f103826E.mo75544a(C44517b.this.f103848b);
                }
                C44517b.this.f103871y.set(motionEvent.getX(), motionEvent.getY());
            }
            C44517b.this.f103851e.reset();
            C44517b.this.f103851e.postTranslate(-C44517b.this.f103867u.left, -C44517b.this.f103867u.top);
            C44517b.this.f103851e.postTranslate(C44517b.this.f103872z.x, C44517b.this.f103872z.y);
            C44517b.this.f103851e.postTranslate(-C44517b.this.f103864r, -C44517b.this.f103865s);
            C44517b.this.f103851e.postRotate(C44517b.this.f103860n, C44517b.this.f103872z.x, C44517b.this.f103872z.y);
            C44517b.this.f103851e.postScale(f2, f2, C44517b.this.f103871y.x, C44517b.this.f103871y.y);
            C44517b.this.f103851e.postTranslate((float) C44517b.this.f103862p, (float) C44517b.this.f103863q);
            C44517b.this.f103851e.mapRect(C44517b.this.f103869w, C44517b.this.f103867u);
            C44517b bVar = C44517b.this;
            bVar.mo75554a(bVar.f103869w);
            C44517b bVar2 = C44517b.this;
            bVar2.f103856j = !bVar2.f103856j;
            C44517b.this.f103822A.mo75592a(f, f2);
            C44517b.this.f103822A.mo75591a();
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float f3;
            float f4;
            int i;
            float f5;
            int i2;
            int i3;
            int i4;
            float f6;
            int i5;
            int i6;
            int i7;
            int i8;
            if (C44517b.this.f103853g) {
                return false;
            }
            if ((!C44517b.this.f103858l && !C44517b.this.f103859m) || C44517b.this.f103822A.f103882a) {
                return false;
            }
            if (((float) Math.round(C44517b.this.f103868v.left)) >= C44517b.this.f103866t.left || ((float) Math.round(C44517b.this.f103868v.right)) <= C44517b.this.f103866t.right) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if (((float) Math.round(C44517b.this.f103868v.top)) >= C44517b.this.f103866t.top || ((float) Math.round(C44517b.this.f103868v.bottom)) <= C44517b.this.f103866t.bottom) {
                f4 = 0.0f;
            } else {
                f4 = f2;
            }
            if (C44517b.this.f103857k || C44517b.this.f103860n % 90.0f != 0.0f) {
                float f7 = (float) (((int) (C44517b.this.f103860n / 90.0f)) * 90);
                float f8 = C44517b.this.f103860n % 90.0f;
                if (f8 > 45.0f) {
                    f7 += 90.0f;
                } else if (f8 < -45.0f) {
                    f7 -= 90.0f;
                }
                C44517b.this.f103822A.mo75596b((int) C44517b.this.f103860n, (int) f7);
                C44517b.this.f103860n = f7;
            }
            C44517b bVar = C44517b.this;
            bVar.mo75554a(bVar.f103868v);
            RunnableC44528g gVar = C44517b.this.f103822A;
            if (f3 < 0.0f) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            gVar.f103889h = i;
            if (f3 > 0.0f) {
                f5 = Math.abs(C44517b.this.f103868v.left);
            } else {
                f5 = C44517b.this.f103868v.right - C44517b.this.f103866t.right;
            }
            int i9 = (int) f5;
            if (f3 < 0.0f) {
                i9 = Integer.MAX_VALUE - i9;
            }
            if (f3 < 0.0f) {
                i2 = i9;
            } else {
                i2 = 0;
            }
            if (f3 < 0.0f) {
                i3 = Integer.MAX_VALUE;
            } else {
                i3 = i9;
            }
            if (f3 < 0.0f) {
                i9 = Integer.MAX_VALUE - i2;
            }
            if (f4 < 0.0f) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = 0;
            }
            gVar.f103890i = i4;
            if (f4 > 0.0f) {
                f6 = Math.abs(C44517b.this.f103868v.top);
            } else {
                f6 = C44517b.this.f103868v.bottom - C44517b.this.f103866t.bottom;
            }
            int i10 = (int) f6;
            if (f4 < 0.0f) {
                i10 = Integer.MAX_VALUE - i10;
            }
            if (f4 < 0.0f) {
                i5 = i10;
            } else {
                i5 = 0;
            }
            if (f4 < 0.0f) {
                i6 = Integer.MAX_VALUE;
            } else {
                i6 = i10;
            }
            if (f4 < 0.0f) {
                i10 = Integer.MAX_VALUE - i5;
            }
            if (f3 == 0.0f) {
                i2 = 0;
                i3 = 0;
            }
            if (f4 == 0.0f) {
                i5 = 0;
                i6 = 0;
            }
            OverScroller overScroller = gVar.f103884c;
            int i11 = gVar.f103889h;
            int i12 = gVar.f103890i;
            int i13 = (int) f3;
            int i14 = (int) f4;
            if (Math.abs(i9) < C44517b.this.f103849c * 2) {
                i7 = 0;
            } else {
                i7 = C44517b.this.f103849c;
            }
            if (Math.abs(i10) < C44517b.this.f103849c * 2) {
                i8 = 0;
            } else {
                i8 = C44517b.this.f103849c;
            }
            overScroller.fling(i11, i12, i13, i14, i2, i3, i5, i6, i7, i8);
            C44517b.this.f103822A.mo75591a();
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (C44517b.this.f103822A.f103882a) {
                C44517b.this.f103822A.mo75595b();
            }
            if (C44517b.this.mo75555a(f)) {
                if (f < 0.0f && C44517b.this.f103868v.left - f > C44517b.this.f103866t.left) {
                    f = C44517b.this.f103868v.left;
                }
                if (f > 0.0f && C44517b.this.f103868v.right - f < C44517b.this.f103866t.right) {
                    f = C44517b.this.f103868v.right - C44517b.this.f103866t.right;
                }
                C44517b.this.f103850d.postTranslate(-f, 0.0f);
                C44517b bVar = C44517b.this;
                bVar.f103862p = (int) (((float) bVar.f103862p) - f);
            } else if (C44517b.this.f103858l || C44517b.this.f103853g || C44517b.this.f103854h) {
                C44517b.this.mo75557b();
                if (!C44517b.this.f103853g) {
                    if (f < 0.0f && C44517b.this.f103868v.left - f > C44517b.this.f103870x.left) {
                        C44517b bVar2 = C44517b.this;
                        f = bVar2.mo75552a(bVar2.f103868v.left - C44517b.this.f103870x.left, f);
                    }
                    if (f > 0.0f && C44517b.this.f103868v.right - f < C44517b.this.f103870x.right) {
                        C44517b bVar3 = C44517b.this;
                        f = bVar3.mo75552a(bVar3.f103868v.right - C44517b.this.f103870x.right, f);
                    }
                }
                C44517b bVar4 = C44517b.this;
                bVar4.f103862p = (int) (((float) bVar4.f103862p) - f);
                C44517b.this.f103850d.postTranslate(-f, 0.0f);
                C44517b.this.f103854h = true;
            }
            if (C44517b.this.mo75558b(f2)) {
                if (f2 < 0.0f && C44517b.this.f103868v.top - f2 > C44517b.this.f103866t.top) {
                    f2 = C44517b.this.f103868v.top;
                }
                if (f2 > 0.0f && C44517b.this.f103868v.bottom - f2 < C44517b.this.f103866t.bottom) {
                    f2 = C44517b.this.f103868v.bottom - C44517b.this.f103866t.bottom;
                }
                C44517b.this.f103850d.postTranslate(0.0f, -f2);
                C44517b bVar5 = C44517b.this;
                bVar5.f103863q = (int) (((float) bVar5.f103863q) - f2);
            } else if (C44517b.this.f103859m || C44517b.this.f103854h || C44517b.this.f103853g) {
                C44517b.this.mo75557b();
                if (!C44517b.this.f103853g) {
                    if (f2 < 0.0f && C44517b.this.f103868v.top - f2 > C44517b.this.f103870x.top) {
                        C44517b bVar6 = C44517b.this;
                        f2 = bVar6.mo75556b(bVar6.f103868v.top - C44517b.this.f103870x.top, f2);
                    }
                    if (f2 > 0.0f && C44517b.this.f103868v.bottom - f2 < C44517b.this.f103870x.bottom) {
                        C44517b bVar7 = C44517b.this;
                        f2 = bVar7.mo75556b(bVar7.f103868v.bottom - C44517b.this.f103870x.bottom, f2);
                    }
                }
                C44517b.this.f103850d.postTranslate(0.0f, -f2);
                C44517b bVar8 = C44517b.this;
                bVar8.f103863q = (int) (((float) bVar8.f103863q) - f2);
                C44517b.this.f103854h = true;
            }
            C44517b.this.mo75553a();
            return true;
        }
    };

    /* renamed from: b */
    public float f103848b;

    /* renamed from: c */
    public int f103849c;

    /* renamed from: d */
    public Matrix f103850d = new Matrix();

    /* renamed from: e */
    public Matrix f103851e = new Matrix();

    /* renamed from: f */
    public View.OnClickListener f103852f;

    /* renamed from: g */
    public boolean f103853g;

    /* renamed from: h */
    public boolean f103854h;

    /* renamed from: i */
    public boolean f103855i = false;

    /* renamed from: j */
    public boolean f103856j;

    /* renamed from: k */
    public boolean f103857k;

    /* renamed from: l */
    public boolean f103858l;

    /* renamed from: m */
    public boolean f103859m;

    /* renamed from: n */
    public float f103860n;

    /* renamed from: o */
    public float f103861o = 1.0f;

    /* renamed from: p */
    public int f103862p;

    /* renamed from: q */
    public int f103863q;

    /* renamed from: r */
    public float f103864r;

    /* renamed from: s */
    public float f103865s;

    /* renamed from: t */
    public RectF f103866t = new RectF();

    /* renamed from: u */
    public RectF f103867u = new RectF();

    /* renamed from: v */
    public RectF f103868v = new RectF();

    /* renamed from: w */
    public RectF f103869w = new RectF();

    /* renamed from: x */
    public RectF f103870x = new RectF();

    /* renamed from: y */
    public PointF f103871y = new PointF();

    /* renamed from: z */
    public PointF f103872z = new PointF();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b$a */
    public interface AbstractC44522a {
        static {
            Covode.recordClassIndex(52872);
        }

        /* renamed from: a */
        float mo75589a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b$e */
    public interface AbstractC44526e {
        static {
            Covode.recordClassIndex(52876);
        }

        /* renamed from: a */
        void mo75544a(float f);
    }

    static {
        Covode.recordClassIndex(52867);
    }

    public int getDefaultAnimaDuring() {
        return 340;
    }

    public int getAnimaDuring() {
        return this.f103845a;
    }

    public float getMaxScale() {
        return this.f103848b;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b$b */
    public class C44523b implements AbstractC44522a {
        static {
            Covode.recordClassIndex(52873);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.AbstractC44522a
        /* renamed from: a */
        public final float mo75589a() {
            return C44517b.this.f103868v.bottom;
        }

        public C44523b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b$f */
    public class C44527f implements AbstractC44522a {
        static {
            Covode.recordClassIndex(52877);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.AbstractC44522a
        /* renamed from: a */
        public final float mo75589a() {
            return C44517b.this.f103868v.top;
        }

        public C44527f() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b$g */
    public class RunnableC44528g implements Runnable {

        /* renamed from: a */
        boolean f103882a;

        /* renamed from: b */
        OverScroller f103883b;

        /* renamed from: c */
        OverScroller f103884c;

        /* renamed from: d */
        Scroller f103885d;

        /* renamed from: e */
        Scroller f103886e;

        /* renamed from: f */
        Scroller f103887f;

        /* renamed from: g */
        AbstractC44522a f103888g;

        /* renamed from: h */
        int f103889h;

        /* renamed from: i */
        int f103890i;

        /* renamed from: j */
        int f103891j;

        /* renamed from: k */
        int f103892k;

        /* renamed from: l */
        RectF f103893l = new RectF();

        /* renamed from: m */
        animationInterpolatorC44524c f103894m;

        static {
            Covode.recordClassIndex(52878);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo75591a() {
            this.f103882a = true;
            m87259d();
        }

        /* renamed from: d */
        private void m87259d() {
            if (this.f103882a) {
                C44517b.this.post(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo75595b() {
            C44517b.this.removeCallbacks(this);
            this.f103883b.abortAnimation();
            this.f103885d.abortAnimation();
            this.f103884c.abortAnimation();
            this.f103887f.abortAnimation();
            this.f103882a = false;
        }

        /* renamed from: c */
        private void m87258c() {
            C44517b.this.f103850d.reset();
            C44517b.this.f103850d.postTranslate(-C44517b.this.f103867u.left, -C44517b.this.f103867u.top);
            C44517b.this.f103850d.postTranslate(C44517b.this.f103872z.x, C44517b.this.f103872z.y);
            C44517b.this.f103850d.postTranslate(-C44517b.this.f103864r, -C44517b.this.f103865s);
            C44517b.this.f103850d.postRotate(C44517b.this.f103860n, C44517b.this.f103872z.x, C44517b.this.f103872z.y);
            C44517b.this.f103850d.postScale(C44517b.this.f103861o, C44517b.this.f103861o, C44517b.this.f103871y.x, C44517b.this.f103871y.y);
            C44517b.this.f103850d.postTranslate((float) C44517b.this.f103862p, (float) C44517b.this.f103863q);
            C44517b.this.mo75553a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x01b3, code lost:
            if (r2 != false) goto L_0x016e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 481
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.RunnableC44528g.run():void");
        }

        RunnableC44528g() {
            this.f103894m = new animationInterpolatorC44524c(C44517b.this, (byte) 0);
            Context context = C44517b.this.getContext();
            this.f103883b = new OverScroller(context, this.f103894m);
            this.f103885d = new Scroller(context, this.f103894m);
            this.f103884c = new OverScroller(context, this.f103894m);
            this.f103886e = new Scroller(context, this.f103894m);
            this.f103887f = new Scroller(context, this.f103894m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo75596b(int i, int i2) {
            this.f103887f.startScroll(i, 0, i2 - i, 0, C44517b.this.f103845a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo75592a(float f, float f2) {
            this.f103885d.startScroll((int) (f * 10000.0f), 0, (int) ((f2 - f) * 10000.0f), 0, C44517b.this.f103845a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo75594a(int i, int i2) {
            this.f103891j = 0;
            this.f103892k = 0;
            this.f103883b.startScroll(0, 0, i, i2, C44517b.this.f103845a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo75593a(float f, float f2, float f3, float f4, int i, AbstractC44522a aVar) {
            this.f103886e.startScroll((int) (f * 10000.0f), (int) (f2 * 10000.0f), (int) (f3 * 10000.0f), (int) (f4 * 10000.0f), i);
            this.f103888g = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b$d */
    public class C44525d implements AbstractC44522a {
        static {
            Covode.recordClassIndex(52875);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.AbstractC44522a
        /* renamed from: a */
        public final float mo75589a() {
            return (C44517b.this.f103868v.top + C44517b.this.f103868v.bottom) / 2.0f;
        }

        public C44525d() {
        }
    }

    /* renamed from: i */
    private void m87241i() {
        m87240h();
        float f = -this.f103868v.top;
        this.f103863q = (int) (((float) this.f103863q) + f);
        this.f103850d.postTranslate(0.0f, f);
        mo75553a();
        m87244l();
    }

    /* renamed from: j */
    private void m87242j() {
        m87240h();
        float f = this.f103866t.bottom - this.f103868v.bottom;
        this.f103863q = (int) (((float) this.f103863q) + f);
        this.f103850d.postTranslate(0.0f, f);
        mo75553a();
        m87244l();
    }

    /* renamed from: c */
    public final void mo75559c() {
        this.f103850d.reset();
        mo75553a();
        this.f103861o = 1.0f;
        this.f103862p = 0;
        this.f103863q = 0;
    }

    /* renamed from: h */
    private void m87240h() {
        if (this.f103868v.width() < this.f103866t.width()) {
            float width = this.f103866t.width() / this.f103868v.width();
            this.f103861o = width;
            this.f103850d.postScale(width, width, this.f103842U.x, this.f103842U.y);
            mo75553a();
            m87244l();
        }
    }

    /* renamed from: k */
    private void m87243k() {
        this.f103850d.postScale(this.f103866t.width() / this.f103868v.width(), this.f103866t.height() / this.f103868v.height(), this.f103842U.x, this.f103842U.y);
        mo75553a();
        m87244l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b$4 */
    public static /* synthetic */ class C445214 {

        /* renamed from: a */
        static final /* synthetic */ int[] f103876a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 52871(0xce87, float:7.4088E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.C445214.f103876a = r2
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.C445214.f103876a     // Catch:{ NoSuchFieldError -> 0x0023 }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.C445214.f103876a     // Catch:{ NoSuchFieldError -> 0x002e }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.C445214.f103876a     // Catch:{ NoSuchFieldError -> 0x0039 }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.C445214.f103876a     // Catch:{ NoSuchFieldError -> 0x0044 }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.C445214.f103876a     // Catch:{ NoSuchFieldError -> 0x004f }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r2 = com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.C445214.f103876a     // Catch:{ NoSuchFieldError -> 0x005a }
                android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.C445214.<clinit>():void");
        }
    }

    /* renamed from: e */
    private void mo75600e() {
        if (this.f103838Q && this.f103839R) {
            Drawable drawable = getDrawable();
            int a = m87230a(drawable);
            int b = m87233b(drawable);
            float f = (float) a;
            if (f > this.f103866t.width() || ((float) b) > this.f103866t.height()) {
                float width = f / this.f103868v.width();
                float height = ((float) b) / this.f103868v.height();
                if (width <= height) {
                    width = height;
                }
                this.f103861o = width;
                this.f103850d.postScale(width, width, this.f103842U.x, this.f103842U.y);
                mo75553a();
                m87244l();
            }
        }
    }

    /* renamed from: f */
    private void m87238f() {
        if (this.f103868v.width() < this.f103866t.width() || this.f103868v.height() < this.f103866t.height()) {
            float width = this.f103866t.width() / this.f103868v.width();
            float height = this.f103866t.height() / this.f103868v.height();
            if (width <= height) {
                width = height;
            }
            this.f103861o = width;
            this.f103850d.postScale(width, width, this.f103842U.x, this.f103842U.y);
            mo75553a();
            m87244l();
        }
    }

    /* renamed from: g */
    private void m87239g() {
        if (this.f103868v.width() > this.f103866t.width() || this.f103868v.height() > this.f103866t.height()) {
            float width = this.f103866t.width() / this.f103868v.width();
            float height = this.f103866t.height() / this.f103868v.height();
            if (width >= height) {
                width = height;
            }
            this.f103861o = width;
            this.f103850d.postScale(width, width, this.f103842U.x, this.f103842U.y);
            mo75553a();
            m87244l();
        }
    }

    /* renamed from: l */
    private void m87244l() {
        Drawable drawable = getDrawable();
        this.f103867u.set(0.0f, 0.0f, (float) m87230a(drawable), (float) m87233b(drawable));
        this.f103833L.set(this.f103834M);
        this.f103833L.mapRect(this.f103867u);
        this.f103864r = this.f103867u.width() / 2.0f;
        this.f103865s = this.f103867u.height() / 2.0f;
        this.f103861o = 1.0f;
        this.f103862p = 0;
        this.f103863q = 0;
        this.f103850d.reset();
    }

    public C44516a getInfo() {
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        m87231a(this, iArr);
        rectF.set(((float) iArr[0]) + this.f103868v.left, ((float) iArr[1]) + this.f103868v.top, ((float) iArr[0]) + this.f103868v.right, ((float) iArr[1]) + this.f103868v.bottom);
        return new C44516a(rectF, this.f103868v, this.f103866t, this.f103867u, this.f103842U, this.f103861o, this.f103860n, this.f103837P);
    }

    /* renamed from: a */
    public final void mo75553a() {
        boolean z;
        this.f103834M.set(this.f103833L);
        this.f103834M.postConcat(this.f103850d);
        setImageMatrix(this.f103834M);
        this.f103850d.mapRect(this.f103868v, this.f103867u);
        boolean z2 = true;
        if (this.f103868v.width() > this.f103866t.width()) {
            z = true;
        } else {
            z = false;
        }
        this.f103858l = z;
        if (this.f103868v.height() <= this.f103866t.height()) {
            z2 = false;
        }
        this.f103859m = z2;
    }

    /* renamed from: b */
    public final void mo75557b() {
        float f;
        float f2;
        float f3;
        float f4;
        if (!this.f103854h) {
            RectF rectF = this.f103866t;
            RectF rectF2 = this.f103868v;
            RectF rectF3 = this.f103870x;
            if (rectF.left > rectF2.left) {
                f = rectF.left;
            } else {
                f = rectF2.left;
            }
            if (rectF.right < rectF2.right) {
                f2 = rectF.right;
            } else {
                f2 = rectF2.right;
            }
            if (f > f2) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            if (rectF.top > rectF2.top) {
                f3 = rectF.top;
            } else {
                f3 = rectF2.top;
            }
            if (rectF.bottom < rectF2.bottom) {
                f4 = rectF.bottom;
            } else {
                f4 = rectF2.bottom;
            }
            if (f3 > f4) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                rectF3.set(f, f3, f2, f4);
            }
        }
    }

    /* renamed from: d */
    private void mo75599d() {
        float f;
        if (this.f103838Q && this.f103839R) {
            this.f103833L.reset();
            this.f103850d.reset();
            this.f103856j = false;
            Drawable drawable = getDrawable();
            int width = getWidth();
            int height = getHeight();
            int a = m87230a(drawable);
            int b = m87233b(drawable);
            float f2 = (float) a;
            float f3 = (float) b;
            this.f103867u.set(0.0f, 0.0f, f2, f3);
            int i = (width - a) / 2;
            int i2 = (height - b) / 2;
            float f4 = 1.0f;
            if (a > width) {
                f = ((float) width) / f2;
            } else {
                f = 1.0f;
            }
            if (b > height) {
                f4 = ((float) height) / f3;
            }
            if (f >= f4) {
                f = f4;
            }
            this.f103833L.reset();
            this.f103833L.postTranslate((float) i, (float) i2);
            this.f103833L.postScale(f, f, this.f103842U.x, this.f103842U.y);
            this.f103833L.mapRect(this.f103867u);
            this.f103864r = this.f103867u.width() / 2.0f;
            this.f103865s = this.f103867u.height() / 2.0f;
            this.f103871y.set(this.f103842U);
            this.f103872z.set(this.f103871y);
            mo75553a();
            switch (C445214.f103876a[this.f103837P.ordinal()]) {
                case 1:
                    mo75600e();
                    break;
                case 2:
                    m87238f();
                    break;
                case 3:
                    m87239g();
                    break;
                case 4:
                    m87240h();
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    m87241i();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    m87242j();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    m87243k();
                    break;
            }
            this.f103840S = true;
            if (this.f103843V != null && System.currentTimeMillis() - this.f103844W < ((long) this.f103832K)) {
                m87232a(this.f103843V);
            }
            this.f103843V = null;
            if (b > a * 3) {
                this.f103850d.postTranslate(0.0f, -this.f103868v.top);
                this.f103863q = (int) (((float) this.f103863q) - this.f103868v.top);
                mo75553a();
            }
        }
    }

    public void setAnimaDuring(int i) {
        this.f103845a = i;
    }

    public void setMaxAnimFromWaiteTime(int i) {
        this.f103832K = i;
    }

    public void setMaxScale(float f) {
        this.f103848b = f;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f103825D = onLongClickListener;
    }

    public void setOnScaleListener(AbstractC44526e eVar) {
        this.f103826E = eVar;
    }

    public void setAdjustViewBounds(boolean z) {
        super.setAdjustViewBounds(z);
        this.f103841T = z;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f103822A.f103894m.f103878a = interpolator;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f103852f = onClickListener;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.a.b$c  reason: invalid class name */
    class animationInterpolatorC44524c implements Interpolator {

        /* renamed from: a */
        public Interpolator f103878a;

        static {
            Covode.recordClassIndex(52874);
        }

        private animationInterpolatorC44524c() {
            this.f103878a = new DecelerateInterpolator();
        }

        public final float getInterpolation(float f) {
            Interpolator interpolator = this.f103878a;
            if (interpolator != null) {
                return interpolator.getInterpolation(f);
            }
            return f;
        }

        /* synthetic */ animationInterpolatorC44524c(C44517b bVar, byte b) {
            this();
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f103853g) {
            return true;
        }
        return mo75555a((float) i);
    }

    public boolean canScrollVertically(int i) {
        if (this.f103853g) {
            return true;
        }
        return mo75558b((float) i);
    }

    public void draw(Canvas canvas) {
        RectF rectF = this.f103823B;
        if (rectF != null) {
            canvas.clipRect(rectF);
            this.f103823B = null;
        }
        super.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int i) {
        Drawable drawable;
        try {
            drawable = getResources().getDrawable(i);
        } catch (Exception unused) {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        ImageView.ScaleType scaleType2 = this.f103837P;
        this.f103837P = scaleType;
        if (scaleType2 != scaleType) {
            mo75599d();
        }
    }

    /* renamed from: a */
    private static int m87230a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth > 0) {
            return intrinsicWidth;
        }
        int minimumWidth = drawable.getMinimumWidth();
        if (minimumWidth <= 0) {
            return drawable.getBounds().width();
        }
        return minimumWidth;
    }

    /* renamed from: b */
    private static int m87233b(Drawable drawable) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            return intrinsicHeight;
        }
        int minimumHeight = drawable.getMinimumHeight();
        if (minimumHeight <= 0) {
            return drawable.getBounds().height();
        }
        return minimumHeight;
    }

    /* renamed from: b */
    private boolean m87234b(RectF rectF) {
        if (Math.abs(((float) Math.round(rectF.top)) - ((this.f103866t.height() - rectF.height()) / 2.0f)) < 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m87235c(RectF rectF) {
        if (Math.abs(((float) Math.round(rectF.left)) - ((this.f103866t.width() - rectF.width()) / 2.0f)) < 1.0f) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable == null) {
            this.f103838Q = false;
        } else if ((drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) || ((drawable.getMinimumWidth() > 0 && drawable.getMinimumHeight() > 0) || (drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0))) {
            if (!this.f103838Q) {
                this.f103838Q = true;
            }
            mo75599d();
        }
    }

    /* renamed from: a */
    private void m87232a(C44516a aVar) {
        AbstractC44522a dVar;
        if (this.f103840S) {
            mo75559c();
            C44516a info = getInfo();
            float width = aVar.f103815b.width() / info.f103815b.width();
            float height = aVar.f103815b.height() / info.f103815b.height();
            if (width >= height) {
                width = height;
            }
            float width2 = aVar.f103814a.left + (aVar.f103814a.width() / 2.0f);
            float height2 = aVar.f103814a.top + (aVar.f103814a.height() / 2.0f);
            this.f103850d.reset();
            this.f103850d.postTranslate(-this.f103867u.left, -this.f103867u.top);
            this.f103850d.postTranslate(width2 - (this.f103867u.width() / 2.0f), height2 - (this.f103867u.height() / 2.0f));
            this.f103850d.postScale(width, width, width2, height2);
            this.f103850d.postRotate(aVar.f103820g, width2, height2);
            mo75553a();
            this.f103871y.set(width2, height2);
            this.f103872z.set(width2, height2);
            this.f103822A.mo75594a((int) (this.f103842U.x - width2), (int) (this.f103842U.y - height2));
            this.f103822A.mo75592a(width, 1.0f);
            this.f103822A.mo75596b((int) aVar.f103820g, 0);
            if (aVar.f103816c.width() < aVar.f103815b.width() || aVar.f103816c.height() < aVar.f103815b.height()) {
                float width3 = aVar.f103816c.width() / aVar.f103815b.width();
                float height3 = aVar.f103816c.height() / aVar.f103815b.height();
                if (width3 > 1.0f) {
                    width3 = 1.0f;
                }
                if (height3 > 1.0f) {
                    height3 = 1.0f;
                }
                if (aVar.f103821h == ImageView.ScaleType.FIT_START) {
                    dVar = new C44527f();
                } else if (aVar.f103821h == ImageView.ScaleType.FIT_END) {
                    dVar = new C44523b();
                } else {
                    dVar = new C44525d();
                }
                this.f103822A.mo75593a(width3, height3, 1.0f - width3, 1.0f - height3, this.f103845a / 3, dVar);
                this.f103851e.setScale(width3, height3, (this.f103868v.left + this.f103868v.right) / 2.0f, dVar.mo75589a());
                this.f103851e.mapRect(this.f103822A.f103893l, this.f103868v);
                this.f103823B = this.f103822A.f103893l;
            }
            this.f103822A.mo75591a();
            return;
        }
        this.f103843V = aVar;
        this.f103844W = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final boolean mo75558b(float f) {
        if (this.f103868v.height() <= this.f103866t.height()) {
            return false;
        }
        if (f < 0.0f && ((float) Math.round(this.f103868v.top)) - f >= this.f103866t.top) {
            return false;
        }
        if (f <= 0.0f || ((float) Math.round(this.f103868v.bottom)) - f > this.f103866t.bottom) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r1 != 6) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo75554a(RectF rectF) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        int i2 = 0;
        if (rectF.width() <= this.f103866t.width()) {
            if (!m87235c(rectF)) {
                i = -((int) (((this.f103866t.width() - rectF.width()) / 2.0f) - rectF.left));
            }
            i = 0;
        } else {
            if (rectF.left > this.f103866t.left) {
                f = rectF.left;
                f2 = this.f103866t.left;
            } else {
                if (rectF.right < this.f103866t.right) {
                    f = rectF.right;
                    f2 = this.f103866t.right;
                }
                i = 0;
            }
            i = (int) (f - f2);
        }
        if (rectF.height() > this.f103866t.height()) {
            if (rectF.top > this.f103866t.top) {
                f3 = rectF.top;
                f4 = this.f103866t.top;
            } else if (rectF.bottom < this.f103866t.bottom) {
                f3 = rectF.bottom;
                f4 = this.f103866t.bottom;
            }
            i2 = (int) (f3 - f4);
        } else if (!m87234b(rectF)) {
            i2 = -((int) (((this.f103866t.height() - rectF.height()) / 2.0f) - rectF.top));
        }
        if (i != 0 || i2 != 0) {
            if (!this.f103822A.f103884c.isFinished()) {
                this.f103822A.f103884c.abortAnimation();
            }
            this.f103822A.mo75594a(-i, -i2);
        }
    }

    /* renamed from: a */
    public final boolean mo75555a(float f) {
        if (this.f103868v.width() <= this.f103866t.width()) {
            return false;
        }
        if (f < 0.0f && ((float) Math.round(this.f103868v.left)) - f >= this.f103866t.left) {
            return false;
        }
        if (f <= 0.0f || ((float) Math.round(this.f103868v.right)) - f > this.f103866t.right) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final float mo75552a(float f, float f2) {
        return f2 * (Math.abs(Math.abs(f) - ((float) this.f103831J)) / ((float) this.f103831J));
    }

    /* renamed from: a */
    private static void m87231a(View view, int[] iArr) {
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() != 16908290) {
                iArr[0] = iArr[0] - view2.getScrollX();
                iArr[1] = iArr[1] - view2.getScrollY();
                iArr[0] = iArr[0] + view2.getLeft();
                iArr[1] = iArr[1] + view2.getTop();
                parent = view2.getParent();
            } else {
                return;
            }
        }
        iArr[0] = (int) (((float) iArr[0]) + 0.5f);
        iArr[1] = (int) (((float) iArr[1]) + 0.5f);
    }

    /* renamed from: b */
    public final float mo75556b(float f, float f2) {
        return f2 * (Math.abs(Math.abs(f) - ((float) this.f103831J)) / ((float) this.f103831J));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f103838Q) {
            super.onMeasure(i, i2);
            return;
        }
        Drawable drawable = getDrawable();
        int a = m87230a(drawable);
        int b = m87233b(drawable);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        if (layoutParams.width != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || a <= size) : mode == 0) {
            size = a;
        }
        if (layoutParams.height != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || b <= size2) : mode2 == 0) {
            size2 = b;
        }
        if (this.f103841T) {
            float f = (float) a;
            float f2 = (float) b;
            float f3 = (float) size;
            float f4 = (float) size2;
            if (f / f2 != f3 / f4) {
                float f5 = f4 / f2;
                float f6 = f3 / f;
                if (f5 >= f6) {
                    f5 = f6;
                }
                if (layoutParams.width != -1) {
                    size = (int) (f * f5);
                }
                if (layoutParams.height != -1) {
                    size2 = (int) (f2 * f5);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    public C44517b(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (this.f103837P == null) {
            this.f103837P = ImageView.ScaleType.CENTER_INSIDE;
        }
        this.f103835N = new GestureDetector(getContext(), this.f103847ab);
        this.f103836O = new ScaleGestureDetector(getContext(), this.f103846aa);
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (30.0f * f);
        this.f103830I = i;
        this.f103849c = i;
        this.f103831J = (int) (f * 140.0f);
        this.f103829H = 35;
        this.f103845a = 340;
        this.f103848b = 2.0f;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f103866t.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f103842U.set((float) (i / 2), (float) (i2 / 2));
        if (!this.f103839R) {
            this.f103839R = true;
            mo75599d();
        }
    }
}
