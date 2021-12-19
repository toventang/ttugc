package com.p2082ss.android.ugc.aweme.feed.widget;

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
import com.p2082ss.android.ugc.aweme.base.p2379ui.p2380a.C34669b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.p2380a.C34670c;
import com.p2082ss.android.ugc.aweme.performance.AbstractC62844h;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.utils.C80211af;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout */
public class PeriscopeLayout extends FrameLayout {

    /* renamed from: a */
    int f116692a;

    /* renamed from: b */
    int f116693b;

    /* renamed from: c */
    FrameLayout.LayoutParams f116694c;

    /* renamed from: d */
    Drawable[] f116695d;

    /* renamed from: e */
    public Random f116696e = new Random();

    /* renamed from: f */
    Queue<ImageView> f116697f;

    /* renamed from: g */
    int f116698g;

    /* renamed from: h */
    int f116699h;

    /* renamed from: i */
    int f116700i;

    /* renamed from: j */
    public int f116701j;

    /* renamed from: k */
    public Handler f116702k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    Runnable f116703l = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.feed.widget.PeriscopeLayout.RunnableC505031 */

        static {
            Covode.recordClassIndex(59648);
        }

        public final void run() {
            ImageView imageView;
            float b;
            float f;
            MethodCollector.m26663i(4715);
            PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
            if (periscopeLayout.f116697f.isEmpty()) {
                ImageView imageView2 = new ImageView(periscopeLayout.getContext());
                imageView2.setLayoutParams(periscopeLayout.f116694c);
                periscopeLayout.addView(imageView2);
                imageView = imageView2;
            } else {
                imageView = periscopeLayout.f116697f.poll();
            }
            Drawable[] drawableArr = periscopeLayout.f116695d;
            int i = periscopeLayout.f116705n;
            periscopeLayout.f116705n = i + 1;
            imageView.setImageDrawable(drawableArr[i & 1]);
            if (periscopeLayout.f116711t == -1.0f) {
                periscopeLayout.f116711t = periscopeLayout.f116707p;
                float f2 = periscopeLayout.f116708q;
                periscopeLayout.f116712u = periscopeLayout.f116708q;
                if (periscopeLayout.f116704m) {
                    periscopeLayout.f116711t = (((float) periscopeLayout.f116693b) - periscopeLayout.f116711t) - periscopeLayout.f116712u;
                    f2 = (((float) periscopeLayout.f116693b) - f2) - periscopeLayout.f116712u;
                }
                periscopeLayout.f116713v = new PointF(periscopeLayout.f116711t, ((float) (periscopeLayout.f116692a - periscopeLayout.f116698g)) - periscopeLayout.f116709r);
                periscopeLayout.f116714w = new PointF(f2, periscopeLayout.f116706o);
                if (periscopeLayout.f116704m) {
                    f = ((float) periscopeLayout.f116699h) - periscopeLayout.f116712u;
                } else {
                    f = (float) (periscopeLayout.f116693b - periscopeLayout.f116699h);
                }
                periscopeLayout.f116715x = new PointF(f, ((float) (periscopeLayout.f116692a - periscopeLayout.f116698g)) - periscopeLayout.f116710s);
            }
            C80211af afVar = new C80211af(periscopeLayout.f116713v, periscopeLayout.f116714w);
            Object[] objArr = new Object[2];
            objArr[0] = periscopeLayout.f116715x;
            if (periscopeLayout.f116704m) {
                b = (((float) periscopeLayout.f116693b) - periscopeLayout.f116712u) - C13628n.m24520b(periscopeLayout.getContext(), (float) (periscopeLayout.f116696e.nextInt(30) + 12));
            } else {
                b = C13628n.m24520b(periscopeLayout.getContext(), (float) (periscopeLayout.f116696e.nextInt(30) + 12));
            }
            objArr[1] = new PointF(b, 0.0f);
            ValueAnimator ofObject = ValueAnimator.ofObject(afVar, objArr);
            C50505a aVar = new C50505a(imageView);
            ofObject.addUpdateListener(aVar);
            ofObject.setTarget(imageView);
            imageView.setTag(R.id.eek, aVar);
            ofObject.setDuration((long) periscopeLayout.f116701j);
            imageView.setTag(ofObject);
            int i2 = C34670c.f81924b;
            C89219l.m154721d(ofObject, "");
            C89219l.m154721d(imageView, "");
            if (!C34669b.m70814b(i2)) {
                imageView.setVisibility(8);
            } else if (C34669b.m70813a(i2)) {
                ofObject.start();
            }
            if (PeriscopeLayout.this.f116702k != null) {
                PeriscopeLayout.this.f116702k.postDelayed(this, (long) PeriscopeLayout.this.f116700i);
            }
            MethodCollector.m26664o(4715);
        }
    };

    /* renamed from: m */
    boolean f116704m;

    /* renamed from: n */
    int f116705n = 0;

    /* renamed from: o */
    float f116706o;

    /* renamed from: p */
    float f116707p;

    /* renamed from: q */
    float f116708q;

    /* renamed from: r */
    float f116709r;

    /* renamed from: s */
    float f116710s;

    /* renamed from: t */
    float f116711t = -1.0f;

    /* renamed from: u */
    float f116712u = -1.0f;

    /* renamed from: v */
    PointF f116713v;

    /* renamed from: w */
    PointF f116714w;

    /* renamed from: x */
    PointF f116715x;

    static {
        Covode.recordClassIndex(59647);
    }

    /* renamed from: f */
    private void m94681f() {
        this.f116702k.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo85799a() {
        C62845i.m113256a(new AbstractC62844h() {
            /* class com.p2082ss.android.ugc.aweme.feed.widget.PeriscopeLayout.C505042 */

            /* renamed from: a */
            final /* synthetic */ int f116717a = 3000;

            /* renamed from: b */
            final /* synthetic */ int f116718b = 800;

            static {
                Covode.recordClassIndex(59649);
            }

            @Override // com.p2082ss.android.ugc.aweme.performance.AbstractC62844h
            /* renamed from: a */
            public final void mo85806a() {
                PeriscopeLayout.this.f116701j = this.f116717a;
                PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
                periscopeLayout.f116700i = this.f116718b;
                periscopeLayout.f116702k.removeCallbacksAndMessages(null);
                periscopeLayout.f116702k.postDelayed(periscopeLayout.f116703l, (long) (periscopeLayout.f116696e.nextInt(4) * 100));
            }
        });
    }

    /* renamed from: b */
    public final void mo85801b() {
        m94681f();
        this.f116702k.removeCallbacks(this.f116703l);
        m94680e();
    }

    /* renamed from: c */
    public final void mo85802c() {
        m94680e();
        m94681f();
        this.f116702k.removeCallbacks(this.f116703l);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f116702k.removeCallbacksAndMessages(null);
    }

    /* renamed from: e */
    private void m94680e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            mo85800a(getChildAt(i));
        }
    }

    /* renamed from: d */
    private void m94679d() {
        this.f116697f = new LinkedList();
        this.f116695d = new Drawable[2];
        Drawable drawable = getResources().getDrawable(2131233150);
        Drawable drawable2 = getResources().getDrawable(2131233151);
        Drawable[] drawableArr = this.f116695d;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        this.f116698g = drawable.getIntrinsicHeight();
        this.f116699h = drawable.getIntrinsicWidth();
        this.f116694c = new FrameLayout.LayoutParams(this.f116699h, this.f116698g);
        this.f116706o = C13628n.m24520b(getContext(), 51.0f);
        this.f116707p = C13628n.m24520b(getContext(), 48.0f);
        this.f116708q = C13628n.m24520b(getContext(), 20.0f);
        this.f116709r = C13628n.m24520b(getContext(), 8.0f);
        this.f116710s = C13628n.m24520b(getContext(), 2.0f);
    }

    public PeriscopeLayout(Context context) {
        super(context);
        MethodCollector.m26663i(5259);
        m94679d();
        MethodCollector.m26664o(5259);
    }

    /* renamed from: a */
    public final void mo85800a(View view) {
        C50505a aVar;
        if (view.getTag() != null) {
            this.f116697f.add(view);
            ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
            if (valueAnimator != null) {
                valueAnimator.setTarget(null);
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            if ((view.getTag(R.id.eek) instanceof C50505a) && (aVar = (C50505a) view.getTag(R.id.eek)) != null) {
                aVar.f116720a = null;
            }
            view.setAlpha(0.0f);
            view.setScaleX(0.3f);
            view.setScaleY(0.3f);
            view.setRotation(0.0f);
            view.setTag(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout$a */
    public class C50505a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public View f116720a;

        /* renamed from: c */
        private int f116722c;

        /* renamed from: d */
        private int f116723d;

        static {
            Covode.recordClassIndex(59650);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f116720a;
            if (view != null && view.getTag() != null) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                this.f116720a.setX(pointF.x);
                this.f116720a.setY(pointF.y);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.7f) {
                    float f = animatedFraction / 0.7f;
                    this.f116720a.setAlpha(0.7f * f);
                    float f2 = (f * 0.3f) + 0.3f;
                    this.f116720a.setScaleX(f2);
                    this.f116720a.setScaleY(f2);
                } else if (((double) animatedFraction) <= 0.8d) {
                    this.f116720a.setAlpha(0.7f);
                    this.f116720a.setScaleX(0.6f);
                    this.f116720a.setScaleY(0.6f);
                } else if (animatedFraction <= 1.0f) {
                    float f3 = (animatedFraction - 0.8f) / 0.2f;
                    this.f116720a.setAlpha((1.0f - f3) * 0.7f);
                    float f4 = (f3 * 0.1f) + 0.6f;
                    this.f116720a.setScaleX(f4);
                    this.f116720a.setScaleY(f4);
                    if (((double) (1.0f - animatedFraction)) < 1.0E-10d) {
                        PeriscopeLayout.this.mo85800a(this.f116720a);
                        return;
                    }
                }
                if (animatedFraction <= 0.5f) {
                    this.f116720a.setRotation((animatedFraction / 0.5f) * 20.0f * ((float) this.f116722c));
                } else {
                    this.f116720a.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * ((float) this.f116723d)) + ((float) (this.f116722c * 20)));
                }
            }
        }

        public C50505a(View view) {
            int i;
            this.f116720a = view;
            int i2 = 1;
            if (PeriscopeLayout.this.f116696e.nextBoolean()) {
                i = 1;
            } else {
                i = -1;
            }
            this.f116722c = i;
            this.f116723d = !PeriscopeLayout.this.f116696e.nextBoolean() ? -1 : i2;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(6685);
        super.onMeasure(i, i2);
        this.f116693b = getMeasuredWidth();
        this.f116692a = getMeasuredHeight();
        boolean z = true;
        if (C0792v.m2768e(this) != 1) {
            z = false;
        }
        this.f116704m = z;
        this.f116711t = -1.0f;
        MethodCollector.m26664o(6685);
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(5452);
        m94679d();
        MethodCollector.m26664o(5452);
    }
}
