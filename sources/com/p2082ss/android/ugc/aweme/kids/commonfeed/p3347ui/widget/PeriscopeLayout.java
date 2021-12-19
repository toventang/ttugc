package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.p037h.C0792v;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.utils.C80211af;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.PeriscopeLayout */
public class PeriscopeLayout extends FrameLayout {

    /* renamed from: a */
    int f131221a;

    /* renamed from: b */
    int f131222b;

    /* renamed from: c */
    FrameLayout.LayoutParams f131223c;

    /* renamed from: d */
    Drawable[] f131224d = new Drawable[2];

    /* renamed from: e */
    public Random f131225e = new Random();

    /* renamed from: f */
    Queue<ImageView> f131226f = new LinkedList();

    /* renamed from: g */
    int f131227g;

    /* renamed from: h */
    int f131228h;

    /* renamed from: i */
    int f131229i;

    /* renamed from: j */
    public int f131230j;

    /* renamed from: k */
    public Handler f131231k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    public Runnable f131232l = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.PeriscopeLayout.RunnableC575161 */

        static {
            Covode.recordClassIndex(67458);
        }

        public final void run() {
            ImageView imageView;
            float b;
            float f;
            MethodCollector.m26663i(8599);
            PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
            if (periscopeLayout.f131226f.isEmpty()) {
                ImageView imageView2 = new ImageView(periscopeLayout.getContext());
                imageView2.setLayoutParams(periscopeLayout.f131223c);
                periscopeLayout.addView(imageView2);
                imageView = imageView2;
            } else {
                imageView = periscopeLayout.f131226f.poll();
            }
            Drawable[] drawableArr = periscopeLayout.f131224d;
            int i = periscopeLayout.f131234n;
            periscopeLayout.f131234n = i + 1;
            imageView.setImageDrawable(drawableArr[i & 1]);
            if (periscopeLayout.f131240t == -1.0f) {
                periscopeLayout.f131240t = periscopeLayout.f131236p;
                float f2 = periscopeLayout.f131237q;
                periscopeLayout.f131241u = periscopeLayout.f131237q;
                if (periscopeLayout.f131233m) {
                    periscopeLayout.f131240t = (((float) periscopeLayout.f131222b) - periscopeLayout.f131240t) - periscopeLayout.f131241u;
                    f2 = (((float) periscopeLayout.f131222b) - f2) - periscopeLayout.f131241u;
                }
                periscopeLayout.f131242v = new PointF(periscopeLayout.f131240t, ((float) (periscopeLayout.f131221a - periscopeLayout.f131227g)) - periscopeLayout.f131238r);
                periscopeLayout.f131243w = new PointF(f2, periscopeLayout.f131235o);
                if (periscopeLayout.f131233m) {
                    f = ((float) periscopeLayout.f131228h) - periscopeLayout.f131241u;
                } else {
                    f = (float) (periscopeLayout.f131222b - periscopeLayout.f131228h);
                }
                periscopeLayout.f131244x = new PointF(f, ((float) (periscopeLayout.f131221a - periscopeLayout.f131227g)) - periscopeLayout.f131239s);
            }
            C80211af afVar = new C80211af(periscopeLayout.f131242v, periscopeLayout.f131243w);
            Object[] objArr = new Object[2];
            objArr[0] = periscopeLayout.f131244x;
            if (periscopeLayout.f131233m) {
                b = (((float) periscopeLayout.f131222b) - periscopeLayout.f131241u) - C13628n.m24520b(periscopeLayout.getContext(), (float) (periscopeLayout.f131225e.nextInt(30) + 12));
            } else {
                b = C13628n.m24520b(periscopeLayout.getContext(), (float) (periscopeLayout.f131225e.nextInt(30) + 12));
            }
            objArr[1] = new PointF(b, 0.0f);
            ValueAnimator ofObject = ValueAnimator.ofObject(afVar, objArr);
            C57518a aVar = new C57518a(imageView);
            ofObject.addUpdateListener(aVar);
            ofObject.setTarget(imageView);
            imageView.setTag(R.id.eek, aVar);
            ofObject.setDuration((long) periscopeLayout.f131230j);
            imageView.setTag(ofObject);
            ofObject.start();
            if (PeriscopeLayout.this.f131231k != null) {
                PeriscopeLayout.this.f131231k.postDelayed(this, (long) PeriscopeLayout.this.f131229i);
            }
            MethodCollector.m26664o(8599);
        }
    };

    /* renamed from: m */
    boolean f131233m;

    /* renamed from: n */
    int f131234n = 0;

    /* renamed from: o */
    float f131235o;

    /* renamed from: p */
    float f131236p;

    /* renamed from: q */
    float f131237q;

    /* renamed from: r */
    float f131238r;

    /* renamed from: s */
    float f131239s;

    /* renamed from: t */
    float f131240t = -1.0f;

    /* renamed from: u */
    float f131241u = -1.0f;

    /* renamed from: v */
    PointF f131242v;

    /* renamed from: w */
    PointF f131243w;

    /* renamed from: x */
    PointF f131244x;

    static {
        Covode.recordClassIndex(67457);
    }

    /* renamed from: c */
    public final void mo94816c() {
        this.f131231k.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    public final void mo94815b() {
        mo94813a();
        mo94816c();
        this.f131231k.removeCallbacks(this.f131232l);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f131231k.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo94813a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            mo94814a(getChildAt(i));
        }
    }

    /* renamed from: a */
    public final void mo94814a(View view) {
        C57518a aVar;
        if (view.getTag() != null) {
            this.f131226f.add(view);
            ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
            if (valueAnimator != null) {
                valueAnimator.setTarget(null);
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            if ((view.getTag(R.id.eek) instanceof C57518a) && (aVar = (C57518a) view.getTag(R.id.eek)) != null) {
                aVar.f131249a = null;
            }
            view.setAlpha(0.0f);
            view.setScaleX(0.3f);
            view.setScaleY(0.3f);
            view.setRotation(0.0f);
            view.setTag(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.PeriscopeLayout$a */
    public class C57518a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public View f131249a;

        /* renamed from: c */
        private int f131251c;

        /* renamed from: d */
        private int f131252d;

        static {
            Covode.recordClassIndex(67460);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f131249a;
            if (view != null && view.getTag() != null) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                this.f131249a.setX(pointF.x);
                this.f131249a.setY(pointF.y);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.7f) {
                    float f = animatedFraction / 0.7f;
                    this.f131249a.setAlpha(0.7f * f);
                    float f2 = (f * 0.3f) + 0.3f;
                    this.f131249a.setScaleX(f2);
                    this.f131249a.setScaleY(f2);
                } else if (((double) animatedFraction) <= 0.8d) {
                    this.f131249a.setAlpha(0.7f);
                    this.f131249a.setScaleX(0.6f);
                    this.f131249a.setScaleY(0.6f);
                } else if (animatedFraction <= 1.0f) {
                    float f3 = (animatedFraction - 0.8f) / 0.2f;
                    this.f131249a.setAlpha((1.0f - f3) * 0.7f);
                    float f4 = (f3 * 0.1f) + 0.6f;
                    this.f131249a.setScaleX(f4);
                    this.f131249a.setScaleY(f4);
                    if (((double) (1.0f - animatedFraction)) < 1.0E-10d) {
                        PeriscopeLayout.this.mo94814a(this.f131249a);
                        return;
                    }
                }
                if (animatedFraction <= 0.5f) {
                    this.f131249a.setRotation((animatedFraction / 0.5f) * 20.0f * ((float) this.f131251c));
                } else {
                    this.f131249a.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * ((float) this.f131252d)) + ((float) (this.f131251c * 20)));
                }
            }
        }

        public C57518a(View view) {
            int i;
            this.f131249a = view;
            int i2 = 1;
            if (PeriscopeLayout.this.f131225e.nextBoolean()) {
                i = 1;
            } else {
                i = -1;
            }
            this.f131251c = i;
            this.f131252d = !PeriscopeLayout.this.f131225e.nextBoolean() ? -1 : i2;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7078);
        super.onMeasure(i, i2);
        this.f131222b = getMeasuredWidth();
        this.f131221a = getMeasuredHeight();
        boolean z = true;
        if (C0792v.m2768e(this) != 1) {
            z = false;
        }
        this.f131233m = z;
        this.f131240t = -1.0f;
        MethodCollector.m26664o(7078);
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(7077);
        Drawable drawable = getResources().getDrawable(2131233023);
        Drawable drawable2 = getResources().getDrawable(2131233024);
        Drawable[] drawableArr = this.f131224d;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        this.f131227g = drawable.getIntrinsicHeight();
        this.f131228h = drawable.getIntrinsicWidth();
        this.f131223c = new FrameLayout.LayoutParams(this.f131228h, this.f131227g);
        this.f131235o = C13628n.m24520b(getContext(), 51.0f);
        this.f131236p = C13628n.m24520b(getContext(), 48.0f);
        this.f131237q = C13628n.m24520b(getContext(), 20.0f);
        this.f131238r = C13628n.m24520b(getContext(), 8.0f);
        this.f131239s = C13628n.m24520b(getContext(), 2.0f);
        MethodCollector.m26664o(7077);
    }
}
