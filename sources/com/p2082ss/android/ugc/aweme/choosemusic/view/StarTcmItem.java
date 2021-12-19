package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60822a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem */
public final class StarTcmItem extends LinearLayout {

    /* renamed from: a */
    private View f84854a;

    /* renamed from: b */
    private ValueAnimator f84855b;

    /* renamed from: c */
    private HashMap f84856c;

    static {
        Covode.recordClassIndex(43196);
    }

    public StarTcmItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m73340a(int i) {
        if (this.f84856c == null) {
            this.f84856c = new HashMap();
        }
        View view = (View) this.f84856c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f84856c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.f84855b;
    }

    public final View getUnderView() {
        return this.f84854a;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f84855b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.f84855b = valueAnimator;
    }

    public final void setUnderView(View view) {
        this.f84854a = view;
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a */
    static final class View$OnClickListenerC35952a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StarTcmItem f84857a;

        static {
            Covode.recordClassIndex(43197);
        }

        View$OnClickListenerC35952a(StarTcmItem starTcmItem) {
            this.f84857a = starTcmItem;
        }

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a$b */
        public static final class C35954b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC35952a f84861a;

            /* renamed from: b */
            final /* synthetic */ ViewGroup.MarginLayoutParams f84862b;

            /* renamed from: c */
            final /* synthetic */ int f84863c;

            static {
                Covode.recordClassIndex(43199);
            }

            public final void onAnimationStart(Animator animator) {
                View underView = this.f84861a.f84857a.getUnderView();
                if (underView != null) {
                    ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
                    layoutParams.height = underView.getMeasuredHeight() + this.f84861a.f84857a.getHeight() + this.f84862b.topMargin + this.f84862b.bottomMargin;
                    underView.setLayoutParams(layoutParams);
                }
            }

            C35954b(View$OnClickListenerC35952a aVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
                this.f84861a = aVar;
                this.f84862b = marginLayoutParams;
                this.f84863c = i;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a$a */
        static final class C35953a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC35952a f84858a;

            /* renamed from: b */
            final /* synthetic */ ViewGroup.MarginLayoutParams f84859b;

            /* renamed from: c */
            final /* synthetic */ int f84860c;

            static {
                Covode.recordClassIndex(43198);
            }

            C35953a(View$OnClickListenerC35952a aVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
                this.f84858a = aVar;
                this.f84859b = marginLayoutParams;
                this.f84860c = i;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View underView;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                StarTcmItem starTcmItem = this.f84858a.f84857a;
                float f = 0.0f;
                if (floatValue >= 0.0f && floatValue <= 200.0f) {
                    f = 1.0f - (floatValue / 200.0f);
                }
                starTcmItem.setAlpha(f);
                if (floatValue >= 100.0f && floatValue <= 300.0f && (underView = this.f84858a.f84857a.getUnderView()) != null) {
                    float height = ((floatValue - 100.0f) / 200.0f) * (((float) this.f84858a.f84857a.getHeight()) + ((float) this.f84859b.topMargin) + ((float) this.f84859b.bottomMargin));
                    ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = this.f84860c - ((int) height);
                    underView.setLayoutParams(marginLayoutParams);
                }
            }
        }

        public final void onClick(View view) {
            ViewGroup.LayoutParams layoutParams;
            ClickAgent.onClick(view);
            C60822a.C60823a.m110419a("show_tcm_info", (Object) false, "music_sp");
            ViewGroup.LayoutParams layoutParams2 = this.f84857a.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            View underView = this.f84857a.getUnderView();
            if (underView != null) {
                layoutParams = underView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            StarTcmItem starTcmItem = this.f84857a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 300.0f);
            ofFloat.addUpdateListener(new C35953a(this, marginLayoutParams, i));
            ofFloat.addListener(new C35954b(this, marginLayoutParams, i));
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new LinearInterpolator());
            starTcmItem.setCurrentAnimator(ofFloat);
            ValueAnimator currentAnimator = this.f84857a.getCurrentAnimator();
            if (currentAnimator != null) {
                currentAnimator.start();
            }
        }
    }

    private /* synthetic */ StarTcmItem(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StarTcmItem(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(637);
        View.inflate(context, R.layout.bj9, this);
        setOrientation(1);
        ((ImageView) m73340a(R.id.efb)).setOnClickListener(new View$OnClickListenerC35952a(this));
        String string = getContext().getString(R.string.fze);
        C89219l.m154716b(string, "");
        String string2 = getContext().getString(R.string.fzd);
        C89219l.m154716b(string2, "");
        SpannableString spannableString = new SpannableString(getContext().getString(R.string.fzd, string));
        spannableString.setSpan(new StyleSpan(1), C89361p.m154888a((CharSequence) string2, "%s", 0, false, 6), C89361p.m154888a((CharSequence) string2, "%s", 0, false, 6) + string.length(), 33);
        ((ImageView) m73340a(R.id.e68)).setImageResource(2131232687);
        TuxTextView tuxTextView = (TuxTextView) m73340a(R.id.e69);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(spannableString);
        setLayerType(1, null);
        MethodCollector.m26664o(637);
    }
}
