package com.p2082ss.android.ugc.aweme.pendant;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.pendant.a */
public abstract class AbstractC62753a implements AbstractC62809n {

    /* renamed from: t */
    public static final C62757d f142242t = new C62757d((byte) 0);

    /* renamed from: a */
    public final float f142243a;

    /* renamed from: b */
    public final boolean f142244b;

    /* renamed from: c */
    public final TextView f142245c;

    /* renamed from: d */
    public final TextView f142246d;

    /* renamed from: e */
    public boolean f142247e;

    /* renamed from: f */
    public final float f142248f;

    /* renamed from: g */
    public boolean f142249g;

    /* renamed from: h */
    public boolean f142250h;

    /* renamed from: i */
    public boolean f142251i;

    /* renamed from: j */
    public boolean f142252j;

    /* renamed from: k */
    public boolean f142253k;

    /* renamed from: l */
    public boolean f142254l;

    /* renamed from: m */
    public final Context f142255m;

    /* renamed from: n */
    public final View f142256n;

    /* renamed from: o */
    public final View f142257o;

    /* renamed from: p */
    public final View f142258p;

    /* renamed from: q */
    public final View f142259q;

    /* renamed from: r */
    public final View f142260r;

    /* renamed from: s */
    public final C62795i f142261s;

    /* renamed from: u */
    private final float f142262u;

    /* renamed from: v */
    private final float f142263v;

    /* renamed from: w */
    private AnimatorSet f142264w;

    static {
        Covode.recordClassIndex(73576);
    }

    /* renamed from: c */
    public abstract void mo100717c();

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$d */
    public static final class C62757d {
        static {
            Covode.recordClassIndex(73580);
        }

        private C62757d() {
        }

        public /* synthetic */ C62757d(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo100716b() {
        this.f142256n.setVisibility(8);
        if (this.f142251i) {
            mo100717c();
        }
    }

    /* renamed from: a */
    public void mo100713a() {
        if (!this.f142249g && this.f142252j) {
            this.f142256n.setVisibility(0);
            if (this.f142250h) {
                this.f142257o.setVisibility(8);
                this.f142258p.setVisibility(0);
                return;
            }
            this.f142257o.setVisibility(0);
            this.f142258p.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo100718d() {
        if (this.f142252j && !this.f142250h) {
            if (this.f142244b) {
                this.f142259q.setVisibility(0);
            } else {
                this.f142259q.setVisibility(4);
            }
            this.f142250h = true;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f142264w = animatorSet;
            animatorSet.playSequentially(mo100760c(false), m113123d(false), mo100759b(false));
            animatorSet.addListener(new C62758e(this));
            animatorSet.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$e */
    public static final class C62758e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC62753a f142269a;

        static {
            Covode.recordClassIndex(73581);
        }

        C62758e(AbstractC62753a aVar) {
            this.f142269a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f142269a.mo100715a(false);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f142269a.mo100715a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$b */
    static final class View$OnClickListenerC62755b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f142267a;

        static {
            Covode.recordClassIndex(73578);
        }

        View$OnClickListenerC62755b(AbstractC89171a aVar) {
            this.f142267a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f142267a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$c */
    static final class View$OnClickListenerC62756c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f142268a;

        static {
            Covode.recordClassIndex(73579);
        }

        View$OnClickListenerC62756c(AbstractC89171a aVar) {
            this.f142268a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f142268a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$f */
    public static final class C62759f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC62753a f142270a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f142271b;

        static {
            Covode.recordClassIndex(73582);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f142270a.f142254l = false;
            AbstractC89171a aVar = this.f142271b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f142270a.f142254l = true;
        }

        C62759f(AbstractC62753a aVar, AbstractC89171a aVar2) {
            this.f142270a = aVar;
            this.f142271b = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$h */
    public static final class C62761h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC62753a f142275a;

        /* renamed from: b */
        final /* synthetic */ boolean f142276b;

        static {
            Covode.recordClassIndex(73584);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f142276b) {
                this.f142275a.mo100717c();
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (!this.f142276b) {
                this.f142275a.f142257o.setVisibility(8);
                this.f142275a.f142260r.setVisibility(8);
                this.f142275a.f142258p.setVisibility(0);
                if (this.f142275a.f142258p instanceof LottieAnimationView) {
                    ((LottieAnimationView) this.f142275a.f142258p).mo5826a();
                }
                this.f142275a.mo100717c();
            }
        }

        C62761h(AbstractC62753a aVar, boolean z) {
            this.f142275a = aVar;
            this.f142276b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$a */
    static final class View$OnClickListenerC62754a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f142265a;

        /* renamed from: b */
        final /* synthetic */ AbstractC62753a f142266b;

        static {
            Covode.recordClassIndex(73577);
        }

        View$OnClickListenerC62754a(AbstractC89171a aVar, AbstractC62753a aVar2) {
            this.f142265a = aVar;
            this.f142266b = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f142265a.invoke();
            this.f142266b.mo100716b();
            this.f142266b.f142249g = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$l */
    public static final class C62765l extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC62753a f142284a;

        /* renamed from: b */
        final /* synthetic */ boolean f142285b;

        static {
            Covode.recordClassIndex(73588);
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            if (!this.f142285b && !this.f142284a.f142244b) {
                this.f142284a.f142259q.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            if (this.f142285b) {
                this.f142284a.f142259q.setVisibility(0);
            }
        }

        C62765l(AbstractC62753a aVar, boolean z) {
            this.f142284a = aVar;
            this.f142285b = z;
        }
    }

    /* renamed from: a */
    public final void mo100715a(boolean z) {
        AbstractC89171a<C89391z> aVar;
        if (this.f142253k && !z && (aVar = this.f142261s.f142370h) != null) {
            aVar.invoke();
        }
        this.f142253k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.pendant.a$g */
    public static final class C62760g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC62753a f142272a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89235b f142273b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89235b f142274c;

        static {
            Covode.recordClassIndex(73583);
        }

        C62760g(AbstractC62753a aVar, C89233z.C89235b bVar, C89233z.C89235b bVar2) {
            this.f142272a = aVar;
            this.f142273b = bVar;
            this.f142274c = bVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f142272a.f142256n;
            float f = this.f142273b.element;
            float f2 = this.f142274c.element;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setTranslationX(f + (f2 * ((Float) animatedValue).floatValue()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.pendant.a$i */
    public static final class C62762i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC62753a f142277a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89235b f142278b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89235b f142279c;

        static {
            Covode.recordClassIndex(73585);
        }

        C62762i(AbstractC62753a aVar, C89233z.C89235b bVar, C89233z.C89235b bVar2) {
            this.f142277a = aVar;
            this.f142278b = bVar;
            this.f142279c = bVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f142277a.f142256n;
            float f = this.f142278b.element;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setTranslationX(f - (((Float) animatedValue).floatValue() * this.f142279c.element));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$j */
    public static final class C62763j extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC62753a f142280a;

        /* renamed from: b */
        final /* synthetic */ boolean f142281b;

        static {
            Covode.recordClassIndex(73586);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f142281b) {
                this.f142280a.f142257o.setVisibility(0);
                if (this.f142280a.f142247e) {
                    AbstractC62753a aVar = this.f142280a;
                    List<String> list = aVar.f142261s.f142372j;
                    if (list != null && list.size() == 3) {
                        aVar.f142260r.setVisibility(0);
                    }
                }
                this.f142280a.f142258p.setVisibility(8);
            }
        }

        C62763j(AbstractC62753a aVar, boolean z) {
            this.f142280a = aVar;
            this.f142281b = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.pendant.a$k */
    public static final class C62764k implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC62753a f142282a;

        /* renamed from: b */
        final /* synthetic */ float f142283b;

        static {
            Covode.recordClassIndex(73587);
        }

        C62764k(AbstractC62753a aVar, float f) {
            this.f142282a = aVar;
            this.f142283b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f142282a.f142256n;
            float f = this.f142283b;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setTranslationX(f + (((Float) animatedValue).floatValue() * this.f142282a.f142243a));
        }
    }

    /* renamed from: a */
    private static Integer m113120a(String str) {
        int parseColor;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (C89361p.m154874b(str, "0x", false)) {
            parseColor = Color.parseColor(C89361p.m154869a(str, "0x", "#", true));
        } else if (!C89361p.m154874b(str, "#", false)) {
            parseColor = Color.parseColor("#".concat(String.valueOf(str)));
        } else {
            parseColor = Color.parseColor(str);
        }
        return Integer.valueOf(parseColor);
    }

    /* renamed from: d */
    private final ValueAnimator m113123d(boolean z) {
        float translationX;
        ValueAnimator ofFloat;
        C89233z.C89235b bVar = new C89233z.C89235b();
        if (z) {
            translationX = -this.f142262u;
        } else {
            translationX = this.f142256n.getTranslationX();
        }
        bVar.element = translationX;
        C89233z.C89235b bVar2 = new C89233z.C89235b();
        bVar2.element = this.f142243a + this.f142262u;
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        ofFloat.addUpdateListener(new C62762i(this, bVar, bVar2));
        ofFloat.addListener(new C62763j(this, z));
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    /* renamed from: b */
    private final Animator mo100759b(boolean z) {
        ValueAnimator ofFloat;
        float f;
        ObjectAnimator ofFloat2;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        C89233z.C89235b bVar = new C89233z.C89235b();
        if (z) {
            f = 0.0f;
        } else {
            f = -this.f142263v;
        }
        bVar.element = f;
        C89233z.C89235b bVar2 = new C89233z.C89235b();
        bVar2.element = this.f142263v;
        ofFloat.addListener(new C62761h(this, z));
        ofFloat.addUpdateListener(new C62760g(this, bVar, bVar2));
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(200L);
        if (z) {
            ofFloat2 = ObjectAnimator.ofFloat(this.f142259q, "alpha", 1.0f, 0.0f);
        } else {
            ofFloat2 = ObjectAnimator.ofFloat(this.f142259q, "alpha", 0.0f, 1.0f);
        }
        C89219l.m154716b(ofFloat2, "");
        ofFloat2.setDuration(150L);
        if (z) {
            animatorSet.playSequentially(ofFloat2, ofFloat);
        } else {
            animatorSet.playSequentially(ofFloat, ofFloat2);
        }
        return animatorSet;
    }

    /* renamed from: c */
    private final Animator mo100760c(boolean z) {
        float translationX;
        ValueAnimator ofFloat;
        ObjectAnimator ofFloat2;
        if (z) {
            translationX = this.f142243a;
        } else {
            translationX = this.f142256n.getTranslationX();
        }
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        ofFloat.addUpdateListener(new C62764k(this, translationX));
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            ofFloat2 = ObjectAnimator.ofFloat(this.f142259q, "alpha", 0.0f, 1.0f);
        } else {
            ofFloat2 = ObjectAnimator.ofFloat(this.f142259q, "alpha", 1.0f, 0.0f);
        }
        C89219l.m154716b(ofFloat2, "");
        ofFloat2.setDuration(150L);
        ofFloat2.addListener(new C62765l(this, z));
        animatorSet.playTogether(ofFloat2, ofFloat);
        return animatorSet;
    }

    @Override // com.p2082ss.android.ugc.aweme.pendant.AbstractC62809n
    /* renamed from: a */
    public final void mo100714a(AbstractC89171a<C89391z> aVar) {
        if (!this.f142249g && this.f142252j && this.f142250h) {
            this.f142250h = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f142264w = animatorSet;
            animatorSet.addListener(new C62759f(this, aVar));
            animatorSet.playSequentially(mo100759b(true), m113123d(true), mo100760c(true));
            animatorSet.start();
        }
    }

    public AbstractC62753a(Context context, View view, View view2, View view3, View view4, View view5, C62795i iVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view3, "");
        C89219l.m154721d(view4, "");
        C89219l.m154721d(view5, "");
        C89219l.m154721d(iVar, "");
        this.f142255m = context;
        this.f142256n = view;
        this.f142257o = view2;
        this.f142258p = view3;
        this.f142259q = view4;
        this.f142260r = view5;
        this.f142261s = iVar;
        this.f142262u = C13628n.m24520b(context, 90.0f);
        this.f142263v = C13628n.m24520b(context, 36.0f);
        this.f142243a = C13628n.m24520b(context, 10.0f);
        this.f142244b = iVar.f142363a;
        TextView textView = (TextView) view5.findViewById(R.id.a1i);
        this.f142245c = textView;
        TextView textView2 = (TextView) view5.findViewById(R.id.a1h);
        this.f142246d = textView2;
        this.f142248f = C13628n.m24520b(context, 22.0f);
        AbstractC89171a<C89391z> aVar = iVar.f142365c;
        if (aVar != null) {
            view2.setOnClickListener(new View$OnClickListenerC62755b(aVar));
            view3.setOnClickListener(new View$OnClickListenerC62756c(aVar));
        }
        AbstractC89171a<C89391z> aVar2 = iVar.f142366d;
        if (aVar2 != null) {
            view4.setOnClickListener(new View$OnClickListenerC62754a(aVar2, this));
        }
        List<String> list = iVar.f142372j;
        if (list == null || list.size() != 3) {
            view5.setVisibility(8);
            return;
        }
        Drawable background = view5.getBackground();
        if (background instanceof GradientDrawable) {
            iVar.f142372j.get(0);
            iVar.f142372j.get(1);
            Integer a = m113120a(iVar.f142372j.get(0));
            if (a != null) {
                ((GradientDrawable) background).setColor(a.intValue());
            }
            Integer a2 = m113120a(iVar.f142372j.get(1));
            if (a2 != null) {
                ((GradientDrawable) background).setStroke((int) C13628n.m24520b(view5.getContext(), 1.0f), a2.intValue());
            }
        }
        Integer a3 = m113120a(iVar.f142372j.get(2));
        if (a3 != null) {
            int intValue = a3.intValue();
            textView.setTextColor(intValue);
            textView2.setTextColor(intValue);
        }
    }
}
