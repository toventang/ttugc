package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import com.airbnb.lottie.p096b.C2034a;
import com.airbnb.lottie.p098d.C2042a;
import com.airbnb.lottie.p098d.C2043b;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p102c.C2091b;
import com.airbnb.lottie.p104g.C2139a;
import com.airbnb.lottie.p104g.C2142b;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p105h.C2176q;
import com.airbnb.lottie.p106i.C2189c;
import com.airbnb.lottie.p106i.Choreographer$FrameCallbackC2190d;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: com.airbnb.lottie.g */
public class C2122g extends Drawable implements Animatable, Drawable.Callback {

    /* renamed from: y */
    private static final String f6387y = C2122g.class.getSimpleName();

    /* renamed from: A */
    private final Set<Object> f6388A;

    /* renamed from: B */
    private final ArrayList<AbstractC2138a> f6389B;

    /* renamed from: C */
    private boolean f6390C;

    /* renamed from: D */
    private int f6391D;

    /* renamed from: E */
    private boolean f6392E;

    /* renamed from: F */
    private final ValueAnimator.AnimatorUpdateListener f6393F;

    /* renamed from: G */
    private int f6394G;

    /* renamed from: H */
    private WeakReference<LottieAnimationView> f6395H;

    /* renamed from: a */
    public C2044e f6396a;

    /* renamed from: b */
    public final Choreographer$FrameCallbackC2190d f6397b;

    /* renamed from: c */
    public float f6398c;

    /* renamed from: d */
    boolean f6399d;

    /* renamed from: e */
    public boolean f6400e;

    /* renamed from: f */
    C2043b f6401f;

    /* renamed from: g */
    public String f6402g;

    /* renamed from: h */
    AbstractC2038c f6403h;

    /* renamed from: i */
    public C2042a f6404i;

    /* renamed from: j */
    public C2033b f6405j;

    /* renamed from: k */
    public C2217r f6406k;

    /* renamed from: l */
    public boolean f6407l;

    /* renamed from: m */
    public C2091b f6408m;

    /* renamed from: n */
    boolean f6409n;

    /* renamed from: o */
    public C2139a f6410o;

    /* renamed from: p */
    public C2034a f6411p;

    /* renamed from: q */
    public boolean f6412q;

    /* renamed from: r */
    public float f6413r;

    /* renamed from: s */
    public Object f6414s;

    /* renamed from: t */
    public boolean f6415t;

    /* renamed from: u */
    Animator.AnimatorListener f6416u;

    /* renamed from: v */
    Bitmap f6417v;

    /* renamed from: w */
    public int f6418w;

    /* renamed from: x */
    public int f6419x;

    /* renamed from: z */
    private final Matrix f6420z = new Matrix();

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.g$a */
    public interface AbstractC2138a {
        static {
            Covode.recordClassIndex(2333);
        }

        /* renamed from: a */
        void mo6048a();
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getAlpha() {
        return this.f6391D;
    }

    /* renamed from: a */
    public final void mo6011a(boolean z) {
        if (this.f6407l != z) {
            int i = Build.VERSION.SDK_INT;
            this.f6407l = z;
            if (this.f6396a != null) {
                mo6016c();
            }
        }
    }

    /* renamed from: a */
    public final <T> void mo6010a(final C2104e eVar, final T t, final C2204c<T> cVar) {
        if (this.f6408m == null) {
            this.f6389B.add(new AbstractC2138a() {
                /* class com.airbnb.lottie.C2122g.C21314 */

                static {
                    Covode.recordClassIndex(2326);
                }

                @Override // com.airbnb.lottie.C2122g.AbstractC2138a
                /* renamed from: a */
                public final void mo6048a() {
                    C2122g.this.mo6010a(eVar, t, cVar);
                }
            });
            return;
        }
        if (eVar.f6358a != null) {
            eVar.f6358a.mo5899a(t, cVar);
        } else {
            List<C2104e> a = m6613a(eVar);
            for (int i = 0; i < a.size(); i++) {
                a.get(i).f6358a.mo5899a(t, cVar);
            }
            if (a.isEmpty()) {
                return;
            }
        }
        invalidateSelf();
        if (t == AbstractC2206k.f6591A) {
            mo6017c(this.f6397b.mo6101d());
        }
    }

    /* renamed from: a */
    public final boolean mo6012a(C2044e eVar) {
        C2044e eVar2 = this.f6396a;
        return eVar2 == null || eVar2 != eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6009a(LottieAnimationView lottieAnimationView) {
        if (C2144d.C2145a.f6479a && C2144d.C2145a.f6482d) {
            this.f6415t = true;
            this.f6395H = new WeakReference<>(lottieAnimationView);
            Context context = lottieAnimationView.getContext();
            DisplayMetrics displayMetrics = null;
            if (context != null) {
                displayMetrics = context.getResources().getDisplayMetrics();
            }
            this.f6411p = new C2034a(this, displayMetrics);
            C21357 r1 = new Animator.AnimatorListener() {
                /* class com.airbnb.lottie.C2122g.C21357 */

                static {
                    Covode.recordClassIndex(2330);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    float k;
                    C2122g.this.f6412q = true;
                    C2122g gVar = C2122g.this;
                    if (gVar.f6397b.f6537a > 0.0f) {
                        k = C2122g.this.f6397b.mo6112j();
                    } else {
                        k = C2122g.this.f6397b.mo6113k();
                    }
                    gVar.f6413r = k;
                }
            };
            this.f6416u = r1;
            this.f6397b.addListener(r1);
        }
    }

    /* renamed from: d */
    public final void mo6019d() {
        mo6037l();
        invalidateSelf();
    }

    public boolean isRunning() {
        return mo6025g();
    }

    static {
        Covode.recordClassIndex(2317);
    }

    /* renamed from: t */
    private boolean m6622t() {
        LottieAnimationView n = mo6039n();
        if (n == null || n.getDrawable() != this) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo6025g() {
        Choreographer$FrameCallbackC2190d dVar = this.f6397b;
        if (dVar == null) {
            return false;
        }
        return dVar.isRunning();
    }

    /* renamed from: j */
    public final void mo6035j() {
        C2144d.m6682b(this);
        this.f6389B.clear();
        this.f6397b.mo6105g();
    }

    /* renamed from: n */
    public final LottieAnimationView mo6039n() {
        WeakReference<LottieAnimationView> weakReference = this.f6395H;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: s */
    private Context m6621s() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo6016c() {
        this.f6408m = new C2091b(this, C2176q.m6746a(this.f6396a), this.f6396a.f6143g, this.f6396a);
        if (C2144d.C2145a.f6479a) {
            mo6040o();
        }
    }

    /* renamed from: e */
    public final void mo6023e() {
        C2144d.m6681a(this);
        if (this.f6408m == null) {
            this.f6389B.add(new AbstractC2138a() {
                /* class com.airbnb.lottie.C2122g.C21368 */

                static {
                    Covode.recordClassIndex(2331);
                }

                @Override // com.airbnb.lottie.C2122g.AbstractC2138a
                /* renamed from: a */
                public final void mo6048a() {
                    C2122g.this.mo6023e();
                }
            });
        } else {
            this.f6397b.mo6104f();
        }
    }

    /* renamed from: f */
    public final void mo6024f() {
        C2144d.m6684d(this);
        if (this.f6408m == null) {
            this.f6389B.add(new AbstractC2138a() {
                /* class com.airbnb.lottie.C2122g.C21379 */

                static {
                    Covode.recordClassIndex(2332);
                }

                @Override // com.airbnb.lottie.C2122g.AbstractC2138a
                /* renamed from: a */
                public final void mo6048a() {
                    C2122g.this.mo6024f();
                }
            });
        } else {
            this.f6397b.mo6109h();
        }
    }

    public int getIntrinsicHeight() {
        C2044e eVar = this.f6396a;
        if (eVar == null) {
            return -1;
        }
        return (int) (((float) eVar.f6144h.height()) * this.f6398c);
    }

    public int getIntrinsicWidth() {
        C2044e eVar = this.f6396a;
        if (eVar == null) {
            return -1;
        }
        return (int) (((float) eVar.f6144h.width()) * this.f6398c);
    }

    /* renamed from: h */
    public final boolean mo6030h() {
        if (this.f6406k != null || this.f6396a.f6141e.mo2184b() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo6036k() {
        C2044e eVar = this.f6396a;
        if (eVar != null) {
            String str = this.f6402g;
            if (str != null) {
                eVar.f6148l = str;
            }
            AbstractC2038c cVar = this.f6403h;
            if (cVar != null) {
                this.f6396a.f6148l = cVar.getClass().getName();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo6037l() {
        mo6004a();
        if (this.f6397b.isRunning()) {
            this.f6397b.cancel();
        }
        this.f6396a = null;
        this.f6408m = null;
        this.f6401f = null;
        this.f6397b.mo6103e();
    }

    public void start() {
        if (C2144d.C2145a.f6479a) {
            Drawable.Callback callback = getCallback();
            if ((callback instanceof View) && !((View) callback).isInEditMode()) {
                mo6023e();
                return;
            }
            return;
        }
        mo6023e();
    }

    public void stop() {
        if (C2144d.f6474a) {
            hashCode();
            isVisible();
            C2144d.m6678a();
        }
        this.f6389B.clear();
        Choreographer$FrameCallbackC2190d dVar = this.f6397b;
        dVar.mo6099c(true);
        dVar.mo6084b(dVar.mo6110i());
    }

    /* renamed from: p */
    private boolean m6618p() {
        C2044e eVar = this.f6396a;
        if (eVar == null || getBounds().isEmpty() || eVar.f6144h.isEmpty() || m6612a(getBounds()) == m6612a(eVar.f6144h)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private void m6619q() {
        C2044e eVar;
        if (!C2144d.C2145a.f6479a && (eVar = this.f6396a) != null) {
            float f = this.f6398c;
            setBounds(0, 0, (int) (((float) eVar.f6144h.width()) * f), (int) (((float) this.f6396a.f6144h.height()) * f));
        }
    }

    /* renamed from: u */
    private void m6623u() {
        LottieAnimationView lottieAnimationView;
        if (this.f6415t) {
            this.f6415t = false;
            WeakReference<LottieAnimationView> weakReference = this.f6395H;
            if (!(weakReference == null || (lottieAnimationView = weakReference.get()) == null)) {
                lottieAnimationView.mo5838f();
            }
            C2034a aVar = this.f6411p;
            if (aVar != null) {
                aVar.mo5933b();
                this.f6411p.mo5932a();
            }
            if (this.f6417v != null) {
                this.f6417v = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo6004a() {
        if (this.f6415t) {
            C2034a aVar = this.f6411p;
            if (aVar != null) {
                aVar.mo5933b();
                this.f6411p.mo5932a();
            }
            this.f6417v = null;
            C2043b bVar = this.f6401f;
            if (bVar != null) {
                bVar.mo5940b();
                return;
            }
            return;
        }
        C2043b bVar2 = this.f6401f;
        if (bVar2 != null) {
            bVar2.mo5939a();
        }
    }

    /* renamed from: i */
    public final void mo6031i() {
        C2144d.m6683c(this);
        if (this.f6415t) {
            C2034a aVar = this.f6411p;
            if (aVar != null) {
                aVar.mo5933b();
                this.f6411p.mo5932a();
            }
            this.f6417v = null;
        }
        this.f6389B.clear();
        this.f6397b.cancel();
    }

    /* renamed from: m */
    public final boolean mo6038m() {
        boolean z;
        if (!this.f6415t || !m6622t() || !isRunning()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f6412q) {
            if (!z) {
                this.f6412q = false;
            } else if (this.f6397b.f6538b == this.f6413r) {
                return false;
            } else {
                this.f6412q = false;
            }
        }
        return z;
    }

    /* renamed from: o */
    public final void mo6040o() {
        C2091b bVar;
        if (C2144d.C2145a.f6479a && C2144d.C2145a.f6482d && this.f6415t && (bVar = this.f6408m) != null) {
            int c = bVar.mo5970c();
            int d = this.f6408m.mo5971d();
            int i = 1500750;
            if (C2144d.C2149e.f6504a) {
                i = 1000500;
            }
            if (c > 0 && d > 0 && c * d >= i) {
                m6623u();
            }
        }
    }

    public C2122g() {
        Choreographer$FrameCallbackC2190d dVar = new Choreographer$FrameCallbackC2190d();
        this.f6397b = dVar;
        this.f6398c = 1.0f;
        this.f6388A = new HashSet();
        this.f6389B = new ArrayList<>();
        this.f6399d = false;
        this.f6400e = false;
        this.f6390C = true;
        this.f6391D = 255;
        this.f6392E = false;
        C21231 r1 = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.airbnb.lottie.C2122g.C21231 */

            static {
                Covode.recordClassIndex(2318);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MethodCollector.m26663i(13213);
                C2142b.m6676b(C2122g.this);
                if (C2122g.this.f6408m != null) {
                    C2122g gVar = C2122g.this;
                    if (C2144d.f6474a) {
                        if (C2144d.f6478e == null) {
                            C2144d.f6478e = new Random();
                        }
                        if (((double) C2144d.f6478e.nextFloat()) < 0.01d) {
                            gVar.hashCode();
                            gVar.isVisible();
                        }
                    }
                    if (C2144d.C2145a.f6479a && C2122g.this.mo6038m()) {
                        C2034a aVar = C2122g.this.f6411p;
                        aVar.f6109d = Float.valueOf(C2122g.this.f6397b.mo6101d());
                        aVar.f6106a.invalidateSelf();
                        if (aVar.f6108c == null) {
                            aVar.f6108c = C2189c.m6768a(aVar.f6106a);
                        }
                        aVar.f6108c.post(aVar.f6110e);
                        MethodCollector.m26664o(13213);
                        return;
                    } else if (C2122g.this.f6415t) {
                        synchronized (C2122g.this.f6414s) {
                            try {
                                C2122g.this.f6408m.mo5963a(C2122g.this.f6397b.mo6101d());
                            } finally {
                                MethodCollector.m26664o(13213);
                            }
                        }
                        return;
                    } else {
                        C2122g.this.f6408m.mo5963a(C2122g.this.f6397b.mo6101d());
                    }
                }
                MethodCollector.m26664o(13213);
            }
        };
        this.f6393F = r1;
        this.f6394G = 0;
        this.f6412q = false;
        this.f6414s = new Object();
        this.f6415t = false;
        this.f6417v = null;
        this.f6418w = 0;
        this.f6419x = 0;
        dVar.addUpdateListener(r1);
        if (C2144d.f6474a) {
            hashCode();
            C2144d.m6678a();
        }
    }

    /* renamed from: b */
    public final void mo6013b() {
        this.f6397b.mo6096a(this.f6396a);
        mo6017c(this.f6397b.getAnimatedFraction());
        mo6020d(this.f6398c);
        m6619q();
        Iterator it = new ArrayList(this.f6389B).iterator();
        while (it.hasNext()) {
            AbstractC2138a aVar = (AbstractC2138a) it.next();
            if (aVar != null) {
                aVar.mo6048a();
            }
            it.remove();
        }
        this.f6389B.clear();
        this.f6396a.mo5944a(this.f6409n);
    }

    public void invalidateSelf() {
        Drawable.Callback callback = getCallback();
        if (C2144d.C2145a.f6479a || this.f6415t) {
            if (!this.f6399d) {
                this.f6399d = true;
                if (callback != null) {
                    try {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            callback.invalidateDrawable(this);
                            if (C2144d.f6474a) {
                                C2142b.m6677c(this);
                            }
                        } else if (callback instanceof View) {
                            ((View) callback).postInvalidate();
                            if (C2144d.f6474a) {
                                C2142b.m6677c(this);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } else if (callback != null) {
            callback.invalidateDrawable(this);
            if (C2144d.f6474a) {
                C2142b.m6677c(this);
            }
        }
    }

    /* renamed from: r */
    private C2043b m6620r() {
        Context s;
        MethodCollector.m26663i(13560);
        if (getCallback() == null) {
            MethodCollector.m26664o(13560);
            return null;
        }
        C2043b bVar = this.f6401f;
        if (bVar != null && (!((s = m6621s()) == null && bVar.f6133a == null) && !bVar.f6133a.equals(s) && !this.f6392E)) {
            if (this.f6415t) {
                this.f6401f.mo5940b();
            } else {
                this.f6401f.mo5939a();
            }
            this.f6401f = null;
        }
        if (this.f6401f == null) {
            if (this.f6415t) {
                synchronized (this.f6414s) {
                    try {
                        if (this.f6401f == null) {
                            C2144d.C2149e.m6700a(m6621s());
                            this.f6401f = new C2043b(getCallback(), this.f6402g, this.f6403h, this.f6396a.f6139c);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(13560);
                        throw th;
                    }
                }
            } else {
                C2144d.C2149e.m6700a(m6621s());
                this.f6401f = new C2043b(getCallback(), this.f6402g, this.f6403h, this.f6396a.f6139c);
            }
        }
        C2043b bVar2 = this.f6401f;
        MethodCollector.m26664o(13560);
        return bVar2;
    }

    /* renamed from: a */
    private static float m6612a(Rect rect) {
        return ((float) rect.width()) / ((float) rect.height());
    }

    /* renamed from: d */
    public final void mo6020d(float f) {
        this.f6398c = f;
        m6619q();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void setAlpha(int i) {
        this.f6391D = i;
        if (C2144d.C2145a.f6479a) {
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private List<C2104e> m6613a(C2104e eVar) {
        if (this.f6408m == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f6408m.mo5898a(eVar, 0, arrayList, new C2104e(new String[0]));
        return arrayList;
    }

    /* renamed from: b */
    public final void mo6014b(final float f) {
        C2044e eVar = this.f6396a;
        if (eVar == null) {
            this.f6389B.add(new AbstractC2138a() {
                /* class com.airbnb.lottie.C2122g.C212713 */

                static {
                    Covode.recordClassIndex(2322);
                }

                @Override // com.airbnb.lottie.C2122g.AbstractC2138a
                /* renamed from: a */
                public final void mo6048a() {
                    C2122g.this.mo6014b(f);
                }
            });
            return;
        }
        float f2 = eVar.f6145i;
        mo6015b((int) (f2 + (f * (this.f6396a.f6146j - f2))));
    }

    /* renamed from: d */
    public final void mo6021d(int i) {
        this.f6397b.setRepeatCount(i);
    }

    /* renamed from: b */
    private void m6614b(Canvas canvas) {
        MethodCollector.m26663i(13496);
        if (this.f6415t) {
            synchronized (this.f6414s) {
                try {
                    if (!m6618p()) {
                        m6616d(canvas);
                    } else {
                        m6617e(canvas);
                    }
                } finally {
                    MethodCollector.m26664o(13496);
                }
            }
        } else if (!m6618p()) {
            m6616d(canvas);
            MethodCollector.m26664o(13496);
        } else {
            m6617e(canvas);
            MethodCollector.m26664o(13496);
        }
    }

    /* renamed from: c */
    private float m6615c(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f6396a.f6144h.width()), ((float) canvas.getHeight()) / ((float) this.f6396a.f6144h.height()));
    }

    /* renamed from: d */
    private void m6616d(Canvas canvas) {
        if (this.f6408m != null) {
            int i = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.f6396a.f6144h.width());
            float height = ((float) bounds.height()) / ((float) this.f6396a.f6144h.height());
            if (this.f6390C) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    float f = 1.0f / min;
                    width /= f;
                    height /= f;
                    if (f > 1.0f) {
                        i = canvas.save();
                        float width2 = ((float) bounds.width()) / 2.0f;
                        float height2 = ((float) bounds.height()) / 2.0f;
                        float f2 = width2 * min;
                        float f3 = min * height2;
                        canvas.translate(width2 - f2, height2 - f3);
                        canvas.scale(f, f, f2, f3);
                    }
                }
            }
            this.f6420z.reset();
            this.f6420z.preScale(width, height);
            this.f6408m.mo5896a(canvas, this.f6420z, this.f6391D);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e */
    private void m6617e(Canvas canvas) {
        float f;
        if (this.f6408m != null) {
            float f2 = this.f6398c;
            float c = m6615c(canvas);
            if (f2 > c) {
                f = this.f6398c / c;
            } else {
                c = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.f6396a.f6144h.width()) / 2.0f;
                float height = ((float) this.f6396a.f6144h.height()) / 2.0f;
                float f3 = width * c;
                float f4 = height * c;
                float f5 = this.f6398c;
                canvas.translate((width * f5) - f3, (f5 * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f6420z.reset();
            this.f6420z.preScale(c, c);
            this.f6408m.mo5896a(canvas, this.f6420z, this.f6391D);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: a */
    public final Bitmap mo6003a(String str) {
        String str2;
        C2043b r = m6620r();
        if (r == null) {
            return null;
        }
        if (!C2144d.C2145a.f6479a) {
            return r.mo5938a(str);
        }
        try {
            return r.mo5938a(str);
        } catch (IllegalStateException e) {
            Drawable.Callback callback = getCallback();
            if (callback == null || !(callback instanceof LottieAnimationView)) {
                str2 = null;
            } else {
                str2 = ((LottieAnimationView) callback).getAnimationName();
            }
            if (this.f6400e || C2144d.C2145a.f6488j || (C2144d.C2145a.f6479a && !C2144d.f6474a)) {
                return null;
            }
            throw new IllegalStateException("animName:" + str2 + " message:" + e.getMessage());
        }
    }

    /* renamed from: c */
    public final void mo6017c(final float f) {
        C2044e eVar = this.f6396a;
        if (eVar == null) {
            this.f6389B.add(new AbstractC2138a() {
                /* class com.airbnb.lottie.C2122g.C21303 */

                static {
                    Covode.recordClassIndex(2325);
                }

                @Override // com.airbnb.lottie.C2122g.AbstractC2138a
                /* renamed from: a */
                public final void mo6048a() {
                    C2122g.this.mo6017c(f);
                }
            });
            return;
        }
        float f2 = eVar.f6145i;
        mo6018c((int) (f2 + (f * (this.f6396a.f6146j - f2))));
    }

    /* renamed from: a */
    public final void mo6005a(final float f) {
        C2044e eVar = this.f6396a;
        if (eVar == null) {
            this.f6389B.add(new AbstractC2138a() {
                /* class com.airbnb.lottie.C2122g.C212511 */

                static {
                    Covode.recordClassIndex(2320);
                }

                @Override // com.airbnb.lottie.C2122g.AbstractC2138a
                /* renamed from: a */
                public final void mo6048a() {
                    C2122g.this.mo6005a(f);
                }
            });
            return;
        }
        float f2 = eVar.f6145i;
        mo6006a((int) (f2 + (f * (this.f6396a.f6146j - f2))));
    }

    /* renamed from: b */
    public final void mo6015b(final int i) {
        if (this.f6396a == null) {
            this.f6389B.add(new AbstractC2138a() {
                /* class com.airbnb.lottie.C2122g.C212612 */

                static {
                    Covode.recordClassIndex(2321);
                }

                @Override // com.airbnb.lottie.C2122g.AbstractC2138a
                /* renamed from: a */
                public final void mo6048a() {
                    C2122g.this.mo6015b(i);
                }
            });
        } else {
            this.f6397b.mo6098c(i);
        }
    }

    /* renamed from: c */
    public final void mo6018c(final int i) {
        if (this.f6396a == null) {
            this.f6389B.add(new AbstractC2138a() {
                /* class com.airbnb.lottie.C2122g.C21292 */

                static {
                    Covode.recordClassIndex(2324);
                }

                @Override // com.airbnb.lottie.C2122g.AbstractC2138a
                /* renamed from: a */
                public final void mo6048a() {
                    C2122g.this.mo6018c(i);
                }
            });
        } else {
            this.f6397b.mo6094a(i);
        }
    }

    public void draw(Canvas canvas) {
        float f;
        this.f6399d = false;
        if (C2144d.C2145a.f6479a) {
            mo6008a(canvas);
        } else {
            C2041d.m6462b("Drawable#draw");
            if (this.f6408m != null) {
                float f2 = this.f6398c;
                float c = m6615c(canvas);
                if (f2 > c) {
                    f = this.f6398c / c;
                    if (f > 1.0f) {
                        canvas.save();
                        float width = ((float) this.f6396a.f6144h.width()) / 2.0f;
                        float height = ((float) this.f6396a.f6144h.height()) / 2.0f;
                        float f3 = width * c;
                        float f4 = height * c;
                        float f5 = this.f6398c;
                        canvas.translate((width * f5) - f3, (f5 * height) - f4);
                        canvas.scale(f, f, f3, f4);
                    }
                } else {
                    c = f2;
                    f = 1.0f;
                }
                this.f6420z.reset();
                this.f6420z.preScale(c, c);
                this.f6408m.mo5896a(canvas, this.f6420z, this.f6391D);
                C2041d.m6463c("Drawable#draw");
                if (f > 1.0f) {
                    canvas.restore();
                }
            }
        }
        if (C2142b.f6470c) {
            C2139a aVar = this.f6410o;
            if (aVar != null) {
                aVar.mo6056a();
            }
            if (C2142b.f6468a != null) {
                C2142b.f6468a.mo6056a();
            }
        }
    }

    /* renamed from: a */
    public final void mo6006a(final int i) {
        if (this.f6396a == null) {
            this.f6389B.add(new AbstractC2138a() {
                /* class com.airbnb.lottie.C2122g.C212410 */

                static {
                    Covode.recordClassIndex(2319);
                }

                @Override // com.airbnb.lottie.C2122g.AbstractC2138a
                /* renamed from: a */
                public final void mo6048a() {
                    C2122g.this.mo6006a(i);
                }
            });
        } else {
            this.f6397b.mo6097b(i);
        }
    }

    /* renamed from: a */
    public final void mo6008a(Canvas canvas) {
        C2041d.m6462b("Drawable#draw");
        if (this.f6408m != null) {
            C2041d.m6462b("Drawable#draw");
            if (this.f6400e || C2144d.C2145a.f6488j) {
                try {
                    m6614b(canvas);
                } catch (Throwable unused) {
                }
            } else {
                m6614b(canvas);
            }
            C2041d.m6463c("Drawable#draw");
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    public final void mo6007a(final int i, final int i2) {
        if (this.f6396a == null) {
            this.f6389B.add(new AbstractC2138a() {
                /* class com.airbnb.lottie.C2122g.C212814 */

                static {
                    Covode.recordClassIndex(2323);
                }

                @Override // com.airbnb.lottie.C2122g.AbstractC2138a
                /* renamed from: a */
                public final void mo6048a() {
                    C2122g.this.mo6007a(i, i2);
                }
            });
        } else {
            this.f6397b.mo6095a(i, i2);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }
}
