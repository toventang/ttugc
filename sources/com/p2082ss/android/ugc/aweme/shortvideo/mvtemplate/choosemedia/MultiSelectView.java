package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.p1951a.C26557c;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView */
public final class MultiSelectView extends CardView implements View.OnClickListener {

    /* renamed from: e */
    public final ImageView f161407e;

    /* renamed from: f */
    public final TuxTextView f161408f;

    /* renamed from: g */
    public boolean f161409g;

    /* renamed from: h */
    public int f161410h;

    /* renamed from: i */
    public int f161411i;

    /* renamed from: j */
    public int f161412j;

    /* renamed from: k */
    public Drawable f161413k;

    /* renamed from: l */
    public Drawable f161414l;

    /* renamed from: m */
    public boolean f161415m;

    /* renamed from: n */
    public int f161416n;

    /* renamed from: o */
    public int f161417o;

    /* renamed from: p */
    public final C26557c f161418p;

    /* renamed from: q */
    private AbstractC72036a f161419q;

    /* renamed from: r */
    private ValueAnimator f161420r;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView$a */
    public interface AbstractC72036a {
        static {
            Covode.recordClassIndex(84690);
        }

        /* renamed from: a */
        void mo90100a(boolean z);
    }

    static {
        Covode.recordClassIndex(84688);
    }

    public MultiSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final AbstractC72036a getOnModeChangeListener() {
        return this.f161419q;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f161409g = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f161409g = false;
    }

    /* renamed from: a */
    private final void m127122a() {
        if (this.f161420r == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new C72037b(this));
            this.f161420r = ofFloat;
        }
    }

    public final void setOnModeChangeListener(AbstractC72036a aVar) {
        this.f161419q = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (!this.f161415m) {
            m127122a();
            ValueAnimator valueAnimator = this.f161420r;
            if (valueAnimator == null) {
                C89219l.m154715b();
            }
            if (!valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f161420r;
                if (valueAnimator2 == null) {
                    C89219l.m154715b();
                }
                valueAnimator2.start();
                return;
            }
            return;
        }
        m127122a();
        ValueAnimator valueAnimator3 = this.f161420r;
        if (valueAnimator3 == null) {
            C89219l.m154715b();
        }
        if (!valueAnimator3.isRunning()) {
            ValueAnimator valueAnimator4 = this.f161420r;
            if (valueAnimator4 == null) {
                C89219l.m154715b();
            }
            valueAnimator4.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView$b */
    public static final class C72037b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MultiSelectView f161422a;

        static {
            Covode.recordClassIndex(84691);
        }

        C72037b(MultiSelectView multiSelectView) {
            this.f161422a = multiSelectView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (!this.f161422a.f161415m) {
                float f = 1.0f - animatedFraction;
                this.f161422a.f161408f.setAlpha(f);
                ViewGroup.LayoutParams layoutParams = this.f161422a.getLayoutParams();
                layoutParams.width = (int) (((float) this.f161422a.f161417o) + (((float) (this.f161422a.f161416n - this.f161422a.f161417o)) * f));
                MultiSelectView multiSelectView = this.f161422a;
                multiSelectView.setLayoutParams(layoutParams);
                Integer a = C26557c.m52581a(animatedFraction, Integer.valueOf(multiSelectView.f161411i), Integer.valueOf(multiSelectView.f161410h));
                C89219l.m154716b(a, "");
                multiSelectView.setCardBackgroundColor(a.intValue());
                if (animatedFraction == 1.0f) {
                    this.f161422a.f161415m = true;
                    this.f161422a.f161407e.setImageDrawable(this.f161422a.f161413k);
                    this.f161422a.postDelayed(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView.C72037b.RunnableC720381 */

                        /* renamed from: a */
                        final /* synthetic */ C72037b f161423a;

                        static {
                            Covode.recordClassIndex(84692);
                        }

                        {
                            this.f161423a = r1;
                        }

                        public final void run() {
                            AbstractC72036a onModeChangeListener;
                            if (this.f161423a.f161422a.f161409g && (onModeChangeListener = this.f161423a.f161422a.getOnModeChangeListener()) != null) {
                                onModeChangeListener.mo90100a(this.f161423a.f161422a.f161415m);
                            }
                        }
                    }, 50);
                    return;
                }
                return;
            }
            this.f161422a.f161408f.setAlpha(animatedFraction);
            ViewGroup.LayoutParams layoutParams2 = this.f161422a.getLayoutParams();
            layoutParams2.width = (int) (((float) this.f161422a.f161417o) + (((float) (this.f161422a.f161416n - this.f161422a.f161417o)) * animatedFraction));
            MultiSelectView multiSelectView2 = this.f161422a;
            multiSelectView2.setLayoutParams(layoutParams2);
            Integer a2 = C26557c.m52581a(animatedFraction, Integer.valueOf(multiSelectView2.f161410h), Integer.valueOf(multiSelectView2.f161411i));
            C89219l.m154716b(a2, "");
            multiSelectView2.setCardBackgroundColor(a2.intValue());
            if (animatedFraction == 1.0f) {
                this.f161422a.f161415m = false;
                this.f161422a.f161407e.setImageDrawable(this.f161422a.f161414l);
                this.f161422a.postDelayed(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView.C72037b.RunnableC720392 */

                    /* renamed from: a */
                    final /* synthetic */ C72037b f161424a;

                    static {
                        Covode.recordClassIndex(84693);
                    }

                    {
                        this.f161424a = r1;
                    }

                    public final void run() {
                        AbstractC72036a onModeChangeListener;
                        if (this.f161424a.f161422a.f161409g && (onModeChangeListener = this.f161424a.f161422a.getOnModeChangeListener()) != null) {
                            onModeChangeListener.mo90100a(this.f161424a.f161422a.f161415m);
                        }
                    }
                }, 50);
            }
        }
    }

    private /* synthetic */ MultiSelectView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MultiSelectView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8654);
        ImageView imageView = new ImageView(context);
        this.f161407e = imageView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        this.f161408f = tuxTextView;
        this.f161418p = new C26557c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pw, R.attr.a60, R.attr.a61, R.attr.a62, R.attr.a63}, 0, 0);
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f161412j = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f161410h = obtainStyledAttributes.getColor(1, 0);
        this.f161411i = obtainStyledAttributes.getColor(3, 0);
        this.f161413k = obtainStyledAttributes.getDrawable(2);
        this.f161414l = obtainStyledAttributes.getDrawable(4);
        obtainStyledAttributes.recycle();
        int i = this.f161412j;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        imageView.setImageDrawable(this.f161414l);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(53);
        tuxTextView.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int i2 = this.f161412j;
        C89219l.m154721d(context, "");
        int i3 = Build.VERSION.SDK_INT;
        layoutParams.setMarginStart(i2);
        tuxTextView.setLayoutParams(layoutParams);
        tuxTextView.setText(tuxTextView.getResources().getString(R.string.d51));
        if (C78099c.m136517a(context)) {
            tuxTextView.setPadding(this.f161412j / 2, 0, 0, 0);
        } else {
            tuxTextView.setPadding(0, 0, this.f161412j / 2, 0);
        }
        tuxTextView.setTextColor(C0643b.m2378c(tuxTextView.getContext(), R.color.bx));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(imageView);
        addView(tuxTextView);
        setOnClickListener(this);
        setClipChildren(false);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView.ViewTreeObserver$OnGlobalLayoutListenerC720351 */

            /* renamed from: a */
            final /* synthetic */ MultiSelectView f161421a;

            static {
                Covode.recordClassIndex(84689);
            }

            public final void onGlobalLayout() {
                this.f161421a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                MultiSelectView multiSelectView = this.f161421a;
                multiSelectView.f161416n = multiSelectView.getMeasuredWidth();
                MultiSelectView multiSelectView2 = this.f161421a;
                multiSelectView2.f161417o = multiSelectView2.f161407e.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = this.f161421a.f161408f.getLayoutParams();
                layoutParams.width = this.f161421a.f161416n - this.f161421a.f161412j;
                this.f161421a.f161408f.setLayoutParams(layoutParams);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f161421a = r1;
            }
        });
        MethodCollector.m26664o(8654);
    }
}
