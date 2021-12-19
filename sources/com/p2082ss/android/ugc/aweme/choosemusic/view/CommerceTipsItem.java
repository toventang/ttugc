package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
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

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem */
public final class CommerceTipsItem extends LinearLayout {

    /* renamed from: a */
    private View f84843a;

    /* renamed from: b */
    private ValueAnimator f84844b;

    /* renamed from: c */
    private HashMap f84845c;

    static {
        Covode.recordClassIndex(43190);
    }

    public CommerceTipsItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m73338a(int i) {
        if (this.f84845c == null) {
            this.f84845c = new HashMap();
        }
        View view = (View) this.f84845c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f84845c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.f84844b;
    }

    public final View getUnderView() {
        return this.f84843a;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f84844b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.f84844b = valueAnimator;
    }

    public final void setUnderView(View view) {
        this.f84843a = view;
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem$a */
    static final class View$OnClickListenerC35948a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommerceTipsItem f84846a;

        static {
            Covode.recordClassIndex(43191);
        }

        View$OnClickListenerC35948a(CommerceTipsItem commerceTipsItem) {
            this.f84846a = commerceTipsItem;
        }

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem$a$b */
        public static final class C35950b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC35948a f84850a;

            /* renamed from: b */
            final /* synthetic */ ViewGroup.MarginLayoutParams f84851b;

            /* renamed from: c */
            final /* synthetic */ int f84852c;

            static {
                Covode.recordClassIndex(43193);
            }

            public final void onAnimationStart(Animator animator) {
                View underView = this.f84850a.f84846a.getUnderView();
                if (underView != null) {
                    ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
                    layoutParams.height = underView.getMeasuredHeight() + this.f84850a.f84846a.getHeight() + this.f84851b.topMargin + this.f84851b.bottomMargin;
                    underView.setLayoutParams(layoutParams);
                }
            }

            C35950b(View$OnClickListenerC35948a aVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
                this.f84850a = aVar;
                this.f84851b = marginLayoutParams;
                this.f84852c = i;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem$a$a */
        static final class C35949a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC35948a f84847a;

            /* renamed from: b */
            final /* synthetic */ ViewGroup.MarginLayoutParams f84848b;

            /* renamed from: c */
            final /* synthetic */ int f84849c;

            static {
                Covode.recordClassIndex(43192);
            }

            C35949a(View$OnClickListenerC35948a aVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
                this.f84847a = aVar;
                this.f84848b = marginLayoutParams;
                this.f84849c = i;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View underView;
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                CommerceTipsItem commerceTipsItem = this.f84847a.f84846a;
                float f = 0.0f;
                if (floatValue >= 0.0f && floatValue <= 200.0f) {
                    f = 1.0f - (floatValue / 200.0f);
                }
                commerceTipsItem.setAlpha(f);
                if (floatValue >= 100.0f && floatValue <= 300.0f && (underView = this.f84847a.f84846a.getUnderView()) != null) {
                    float height = ((floatValue - 100.0f) / 200.0f) * (((float) this.f84847a.f84846a.getHeight()) + ((float) this.f84848b.topMargin) + ((float) this.f84848b.bottomMargin));
                    ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = this.f84849c - ((int) height);
                    underView.setLayoutParams(marginLayoutParams);
                }
            }
        }

        public final void onClick(View view) {
            ViewGroup.LayoutParams layoutParams;
            ClickAgent.onClick(view);
            C60822a.C60823a.m110419a("show_commerce_tips", (Object) false, "music_sp");
            ViewGroup.LayoutParams layoutParams2 = this.f84846a.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            View underView = this.f84846a.getUnderView();
            if (underView != null) {
                layoutParams = underView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            CommerceTipsItem commerceTipsItem = this.f84846a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 300.0f);
            ofFloat.addUpdateListener(new C35949a(this, marginLayoutParams, i));
            ofFloat.addListener(new C35950b(this, marginLayoutParams, i));
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new LinearInterpolator());
            commerceTipsItem.setCurrentAnimator(ofFloat);
            ValueAnimator currentAnimator = this.f84846a.getCurrentAnimator();
            if (currentAnimator != null) {
                currentAnimator.start();
            }
        }
    }

    private /* synthetic */ CommerceTipsItem(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceTipsItem(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4154);
        View.inflate(context, R.layout.bic, this);
        setOrientation(1);
        ((ImageView) m73338a(R.id.aa1)).setOnClickListener(new View$OnClickListenerC35948a(this));
        TuxTextView tuxTextView = (TuxTextView) m73338a(R.id.aa0);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(getContext().getString(R.string.anb));
        setLayerType(1, null);
        MethodCollector.m26664o(4154);
    }
}
