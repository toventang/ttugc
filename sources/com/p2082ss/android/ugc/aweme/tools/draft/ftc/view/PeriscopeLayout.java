package com.p2082ss.android.ugc.aweme.tools.draft.ftc.view;

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
import com.p2082ss.android.ugc.aweme.performance.AbstractC62844h;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.utils.C80211af;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.PeriscopeLayout */
public class PeriscopeLayout extends FrameLayout {

    /* renamed from: a */
    int f175966a;

    /* renamed from: b */
    int f175967b;

    /* renamed from: c */
    FrameLayout.LayoutParams f175968c;

    /* renamed from: d */
    Drawable[] f175969d = new Drawable[2];

    /* renamed from: e */
    public Random f175970e = new Random();

    /* renamed from: f */
    Queue<ImageView> f175971f = new LinkedList();

    /* renamed from: g */
    int f175972g;

    /* renamed from: h */
    int f175973h;

    /* renamed from: i */
    int f175974i;

    /* renamed from: j */
    public int f175975j;

    /* renamed from: k */
    public Handler f175976k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    public Runnable f175977l = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.PeriscopeLayout.RunnableC783491 */

        static {
            Covode.recordClassIndex(91470);
        }

        public final void run() {
            ImageView imageView;
            float b;
            float f;
            MethodCollector.m26663i(9809);
            PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
            if (periscopeLayout.f175971f.isEmpty()) {
                ImageView imageView2 = new ImageView(periscopeLayout.getContext());
                imageView2.setLayoutParams(periscopeLayout.f175968c);
                periscopeLayout.addView(imageView2);
                imageView = imageView2;
            } else {
                imageView = periscopeLayout.f175971f.poll();
            }
            Drawable[] drawableArr = periscopeLayout.f175969d;
            int i = periscopeLayout.f175979n;
            periscopeLayout.f175979n = i + 1;
            imageView.setImageDrawable(drawableArr[i & 1]);
            if (periscopeLayout.f175985t == -1.0f) {
                periscopeLayout.f175985t = periscopeLayout.f175981p;
                float f2 = periscopeLayout.f175982q;
                periscopeLayout.f175986u = periscopeLayout.f175982q;
                if (periscopeLayout.f175978m) {
                    periscopeLayout.f175985t = (((float) periscopeLayout.f175967b) - periscopeLayout.f175985t) - periscopeLayout.f175986u;
                    f2 = (((float) periscopeLayout.f175967b) - f2) - periscopeLayout.f175986u;
                }
                periscopeLayout.f175987v = new PointF(periscopeLayout.f175985t, ((float) (periscopeLayout.f175966a - periscopeLayout.f175972g)) - periscopeLayout.f175983r);
                periscopeLayout.f175988w = new PointF(f2, periscopeLayout.f175980o);
                if (periscopeLayout.f175978m) {
                    f = ((float) periscopeLayout.f175973h) - periscopeLayout.f175986u;
                } else {
                    f = (float) (periscopeLayout.f175967b - periscopeLayout.f175973h);
                }
                periscopeLayout.f175989x = new PointF(f, ((float) (periscopeLayout.f175966a - periscopeLayout.f175972g)) - periscopeLayout.f175984s);
            }
            C80211af afVar = new C80211af(periscopeLayout.f175987v, periscopeLayout.f175988w);
            Object[] objArr = new Object[2];
            objArr[0] = periscopeLayout.f175989x;
            if (periscopeLayout.f175978m) {
                b = (((float) periscopeLayout.f175967b) - periscopeLayout.f175986u) - C13628n.m24520b(periscopeLayout.getContext(), (float) (periscopeLayout.f175970e.nextInt(30) + 12));
            } else {
                b = C13628n.m24520b(periscopeLayout.getContext(), (float) (periscopeLayout.f175970e.nextInt(30) + 12));
            }
            objArr[1] = new PointF(b, 0.0f);
            ValueAnimator ofObject = ValueAnimator.ofObject(afVar, objArr);
            C78351a aVar = new C78351a(imageView);
            ofObject.addUpdateListener(aVar);
            ofObject.setTarget(imageView);
            imageView.setTag(R.id.ek5, aVar);
            ofObject.setDuration((long) periscopeLayout.f175975j);
            imageView.setTag(ofObject);
            ofObject.start();
            if (PeriscopeLayout.this.f175976k != null) {
                PeriscopeLayout.this.f175976k.postDelayed(this, (long) PeriscopeLayout.this.f175974i);
            }
            MethodCollector.m26664o(9809);
        }
    };

    /* renamed from: m */
    boolean f175978m;

    /* renamed from: n */
    int f175979n = 0;

    /* renamed from: o */
    float f175980o;

    /* renamed from: p */
    float f175981p;

    /* renamed from: q */
    float f175982q;

    /* renamed from: r */
    float f175983r;

    /* renamed from: s */
    float f175984s;

    /* renamed from: t */
    float f175985t = -1.0f;

    /* renamed from: u */
    float f175986u = -1.0f;

    /* renamed from: v */
    PointF f175987v;

    /* renamed from: w */
    PointF f175988w;

    /* renamed from: x */
    PointF f175989x;

    static {
        Covode.recordClassIndex(91469);
    }

    /* renamed from: a */
    public final void mo122242a() {
        C62845i.m113256a(new AbstractC62844h() {
            /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.PeriscopeLayout.C783502 */

            /* renamed from: a */
            final /* synthetic */ int f175991a = 3000;

            /* renamed from: b */
            final /* synthetic */ int f175992b = 800;

            static {
                Covode.recordClassIndex(91471);
            }

            @Override // com.p2082ss.android.ugc.aweme.performance.AbstractC62844h
            /* renamed from: a */
            public final void mo85806a() {
                PeriscopeLayout.this.f175975j = this.f175991a;
                PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
                periscopeLayout.f175974i = this.f175992b;
                periscopeLayout.f175976k.removeCallbacksAndMessages(null);
                periscopeLayout.f175976k.postDelayed(periscopeLayout.f175977l, (long) (periscopeLayout.f175970e.nextInt(4) * 100));
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f175976k.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo122243a(View view) {
        C78351a aVar;
        if (view.getTag() != null) {
            this.f175971f.add(view);
            ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
            if (valueAnimator != null) {
                valueAnimator.setTarget(null);
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            if ((view.getTag(R.id.ek5) instanceof C78351a) && (aVar = (C78351a) view.getTag(R.id.ek5)) != null) {
                aVar.f175994a = null;
            }
            view.setAlpha(0.0f);
            view.setScaleX(0.3f);
            view.setScaleY(0.3f);
            view.setRotation(0.0f);
            view.setTag(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.PeriscopeLayout$a */
    public class C78351a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public View f175994a;

        /* renamed from: c */
        private int f175996c;

        /* renamed from: d */
        private int f175997d;

        static {
            Covode.recordClassIndex(91472);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f175994a;
            if (view != null && view.getTag() != null) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                this.f175994a.setX(pointF.x);
                this.f175994a.setY(pointF.y);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.7f) {
                    float f = animatedFraction / 0.7f;
                    this.f175994a.setAlpha(0.7f * f);
                    float f2 = (f * 0.3f) + 0.3f;
                    this.f175994a.setScaleX(f2);
                    this.f175994a.setScaleY(f2);
                } else if (((double) animatedFraction) <= 0.8d) {
                    this.f175994a.setAlpha(0.7f);
                    this.f175994a.setScaleX(0.6f);
                    this.f175994a.setScaleY(0.6f);
                } else if (animatedFraction <= 1.0f) {
                    float f3 = (animatedFraction - 0.8f) / 0.2f;
                    this.f175994a.setAlpha((1.0f - f3) * 0.7f);
                    float f4 = (f3 * 0.1f) + 0.6f;
                    this.f175994a.setScaleX(f4);
                    this.f175994a.setScaleY(f4);
                    if (((double) (1.0f - animatedFraction)) < 1.0E-10d) {
                        PeriscopeLayout.this.mo122243a(this.f175994a);
                        return;
                    }
                }
                if (animatedFraction <= 0.5f) {
                    this.f175994a.setRotation((animatedFraction / 0.5f) * 20.0f * ((float) this.f175996c));
                } else {
                    this.f175994a.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * ((float) this.f175997d)) + ((float) (this.f175996c * 20)));
                }
            }
        }

        public C78351a(View view) {
            int i;
            this.f175994a = view;
            int i2 = 1;
            if (PeriscopeLayout.this.f175970e.nextBoolean()) {
                i = 1;
            } else {
                i = -1;
            }
            this.f175996c = i;
            this.f175997d = !PeriscopeLayout.this.f175970e.nextBoolean() ? -1 : i2;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7769);
        super.onMeasure(i, i2);
        this.f175967b = getMeasuredWidth();
        this.f175966a = getMeasuredHeight();
        boolean z = true;
        if (C0792v.m2768e(this) != 1) {
            z = false;
        }
        this.f175978m = z;
        this.f175985t = -1.0f;
        MethodCollector.m26664o(7769);
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(7595);
        Drawable drawable = getResources().getDrawable(2131233023);
        Drawable drawable2 = getResources().getDrawable(2131233024);
        Drawable[] drawableArr = this.f175969d;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        this.f175972g = drawable.getIntrinsicHeight();
        this.f175973h = drawable.getIntrinsicWidth();
        this.f175968c = new FrameLayout.LayoutParams(this.f175973h, this.f175972g);
        this.f175980o = C13628n.m24520b(getContext(), 51.0f);
        this.f175981p = C13628n.m24520b(getContext(), 48.0f);
        this.f175982q = C13628n.m24520b(getContext(), 20.0f);
        this.f175983r = C13628n.m24520b(getContext(), 8.0f);
        this.f175984s = C13628n.m24520b(getContext(), 2.0f);
        MethodCollector.m26664o(7595);
    }
}
