package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3840m.C71977b;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a.animationInterpolatorC74267a;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76337f;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.tools.view.style.StyleView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p */
public final class C76374p implements AbstractC76330b {

    /* renamed from: d */
    public static final C76375a f171562d = new C76375a((byte) 0);

    /* renamed from: a */
    public View f171563a;

    /* renamed from: b */
    public final View f171564b;

    /* renamed from: c */
    public final View f171565c;

    /* renamed from: e */
    private final float f171566e;

    /* renamed from: f */
    private final animationInterpolatorC74267a f171567f = new animationInterpolatorC74267a(0.3f, 0.0f, 0.9f, 0.6f);

    /* renamed from: g */
    private final animationInterpolatorC74267a f171568g = new animationInterpolatorC74267a(0.0f, 0.4f, 0.2f, 1.0f);

    /* renamed from: h */
    private final animationInterpolatorC74267a f171569h = new animationInterpolatorC74267a(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: i */
    private boolean f171570i;

    /* renamed from: j */
    private boolean f171571j;

    /* renamed from: k */
    private final View f171572k;

    /* renamed from: l */
    private final int f171573l;

    static {
        Covode.recordClassIndex(89329);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$a */
    public static final class C76375a {
        static {
            Covode.recordClassIndex(89330);
        }

        /* renamed from: a */
        public static boolean m133861a(int i) {
            return i == 1 || i == 2;
        }

        private C76375a() {
        }

        public /* synthetic */ C76375a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76330b
    /* renamed from: a */
    public final boolean mo120049a() {
        return this.f171571j;
    }

    /* renamed from: b */
    private final float m133852b() {
        if (this.f171564b.getHeight() > 0) {
            return (float) this.f171564b.getHeight();
        }
        return this.f171572k.getResources().getDimension(R.dimen.t0);
    }

    /* renamed from: c */
    private final AnimatorSet m133855c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f171564b, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(210L);
        ofFloat.setInterpolator(this.f171568g);
        ofFloat.setStartDelay(90);
        ofFloat.addListener(new C76379e(this));
        View view = this.f171563a;
        if (view == null) {
            C89219l.m154710a("searchStickerView");
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(90L);
        ofFloat2.setInterpolator(this.f171567f);
        ofFloat2.addListener(new C76380f(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f171565c.getHeight(), (int) m133852b());
        ofInt.setDuration(300L);
        ofInt.setInterpolator(this.f171569h);
        ofInt.addUpdateListener(new C76381g(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
        return animatorSet;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$c */
    public static final class C76377c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C76374p f171575a;

        static {
            Covode.recordClassIndex(89332);
        }

        C76377c(C76374p pVar) {
            this.f171575a = pVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f171575a.f171564b.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$d */
    public static final class C76378d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C76374p f171576a;

        static {
            Covode.recordClassIndex(89333);
        }

        C76378d(C76374p pVar) {
            this.f171576a = pVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C76374p.m133851a(this.f171576a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$e */
    public static final class C76379e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C76374p f171577a;

        static {
            Covode.recordClassIndex(89334);
        }

        C76379e(C76374p pVar) {
            this.f171577a = pVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f171577a.f171564b.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$f */
    public static final class C76380f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C76374p f171578a;

        static {
            Covode.recordClassIndex(89335);
        }

        C76380f(C76374p pVar) {
            this.f171578a = pVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C76374p.m133851a(this.f171578a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$h */
    public static final class C76382h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C76374p f171580a;

        static {
            Covode.recordClassIndex(89337);
        }

        C76382h(C76374p pVar) {
            this.f171580a = pVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C76374p.m133851a(this.f171580a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$k */
    public static final class C76385k extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C76374p f171583a;

        static {
            Covode.recordClassIndex(89340);
        }

        C76385k(C76374p pVar) {
            this.f171583a = pVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f171583a.f171564b.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$l */
    public static final class C76386l extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C76374p f171584a;

        static {
            Covode.recordClassIndex(89341);
        }

        C76386l(C76374p pVar) {
            this.f171584a = pVar;
        }

        public final void onAnimationStart(Animator animator) {
            C76374p.m133851a(this.f171584a).setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76330b
    /* renamed from: a */
    public final void mo120047a(View view) {
        C89219l.m154721d(view, "");
        this.f171563a = view;
    }

    /* renamed from: a */
    public static final /* synthetic */ View m133851a(C76374p pVar) {
        View view = pVar.f171563a;
        if (view == null) {
            C89219l.m154710a("searchStickerView");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$b */
    static final class View$OnClickListenerC76376b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchStickerViewContainer f171574a;

        static {
            Covode.recordClassIndex(89331);
        }

        View$OnClickListenerC76376b(SearchStickerViewContainer searchStickerViewContainer) {
            this.f171574a = searchStickerViewContainer;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f171574a.mo120006b();
            this.f171574a.mo120001a(new AbstractC76337f.C76339b("click_icon"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$g */
    public static final class C76381g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C76374p f171579a;

        static {
            Covode.recordClassIndex(89336);
        }

        C76381g(C76374p pVar) {
            this.f171579a = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f171579a.f171565c.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f171579a.f171565c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$i */
    static final class C76383i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C76374p f171581a;

        static {
            Covode.recordClassIndex(89338);
        }

        C76383i(C76374p pVar) {
            this.f171581a = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f171581a.f171565c.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f171581a.f171565c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$j */
    static final class C76384j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C76374p f171582a;

        static {
            Covode.recordClassIndex(89339);
        }

        C76384j(C76374p pVar) {
            this.f171582a = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f171582a.f171565c.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f171582a.f171565c.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$m */
    public static final class C76387m implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C76374p f171585a;

        static {
            Covode.recordClassIndex(89342);
        }

        C76387m(C76374p pVar) {
            this.f171585a = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f171585a.f171565c.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f171585a.f171565c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.p$n */
    static final class C76388n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C76374p f171586a;

        static {
            Covode.recordClassIndex(89343);
        }

        C76388n(C76374p pVar) {
            this.f171586a = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f171586a.f171565c.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            this.f171586a.f171565c.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    private final void m133854b(boolean z) {
        if (!z) {
            this.f171572k.setVisibility(8);
        } else if (this.f171573l == 2) {
            this.f171572k.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76330b
    /* renamed from: a */
    public final void mo120046a(int i) {
        this.f171570i = true;
        int i2 = this.f171573l;
        if (i2 == 1) {
            m133853b(i).start();
            this.f171571j = true;
        } else if (i2 != 2) {
        } else {
            if (this.f171571j) {
                ValueAnimator ofInt = ValueAnimator.ofInt(this.f171565c.getHeight(), i);
                ofInt.setDuration(300L);
                ofInt.setInterpolator(this.f171569h);
                ofInt.addUpdateListener(new C76388n(this));
                C89219l.m154716b(ofInt, "");
                ofInt.start();
                return;
            }
            m133854b(false);
            m133853b(i).start();
            this.f171571j = true;
        }
    }

    /* renamed from: b */
    private final AnimatorSet m133853b(int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f171564b, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(90L);
        ofFloat.setInterpolator(this.f171567f);
        ofFloat.addListener(new C76385k(this));
        View view = this.f171563a;
        if (view == null) {
            C89219l.m154710a("searchStickerView");
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(210L);
        ofFloat2.setStartDelay(90);
        ofFloat2.setInterpolator(this.f171568g);
        ofFloat2.addListener(new C76386l(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f171565c.getHeight(), i);
        ofInt.setDuration(300L);
        ofInt.setInterpolator(this.f171569h);
        ofInt.addUpdateListener(new C76387m(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
        return animatorSet;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76330b
    /* renamed from: a */
    public final void mo120048a(boolean z) {
        boolean z2 = this.f171570i;
        if (z2 || this.f171571j) {
            int i = this.f171573l;
            if (i == 1) {
                if (z) {
                    this.f171564b.setVisibility(0);
                    this.f171564b.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f171564b, "alpha", 0.0f, 1.0f);
                    ofFloat.setDuration(210L);
                    ofFloat.setInterpolator(this.f171568g);
                    ofFloat.setStartDelay(90);
                    View view = this.f171563a;
                    if (view == null) {
                        C89219l.m154710a("searchStickerView");
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                    ofFloat2.setDuration(90L);
                    ofFloat2.setInterpolator(this.f171567f);
                    ofFloat2.addListener(new C76382h(this));
                    ValueAnimator ofInt = ValueAnimator.ofInt(this.f171565c.getHeight(), (int) m133852b());
                    ofInt.setDuration(300L);
                    ofInt.setInterpolator(this.f171569h);
                    ofInt.addUpdateListener(new C76383i(this));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofInt, ofFloat, ofFloat2);
                    animatorSet.start();
                } else {
                    m133855c().start();
                }
                this.f171571j = false;
            } else if (i == 2) {
                if (!z) {
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(this.f171565c.getHeight(), (int) m133852b());
                    ofInt2.setDuration(300L);
                    ofInt2.setInterpolator(this.f171569h);
                    ofInt2.addUpdateListener(new C76384j(this));
                    C89219l.m154716b(ofInt2, "");
                    ofInt2.start();
                    this.f171571j = true;
                } else if (z2) {
                    m133854b(true);
                    m133855c().start();
                    this.f171571j = false;
                } else {
                    m133854b(true);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f171564b, "alpha", 0.0f, 1.0f);
                    ofFloat3.setDuration(210L);
                    ofFloat3.setInterpolator(this.f171568g);
                    ofFloat3.setStartDelay(90);
                    ofFloat3.addListener(new C76377c(this));
                    View view2 = this.f171563a;
                    if (view2 == null) {
                        C89219l.m154710a("searchStickerView");
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
                    ofFloat4.setDuration(90L);
                    ofFloat4.setInterpolator(this.f171567f);
                    ofFloat4.addListener(new C76378d(this));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ofFloat3, ofFloat4);
                    animatorSet2.start();
                    this.f171571j = false;
                }
            }
            this.f171570i = false;
        }
    }

    public C76374p(View view, View view2, View view3, int i) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view3, "");
        this.f171572k = view;
        this.f171564b = view2;
        this.f171565c = view3;
        this.f171573l = i;
        float dimension = view.getResources().getDimension(R.dimen.rt);
        this.f171566e = dimension;
        StyleView styleView = (StyleView) view.findViewById(R.id.c6y);
        TextView textView = (TextView) view.findViewById(R.id.e_e);
        textView.setText(C71977b.f161303i);
        C89219l.m154716b(styleView, "");
        ViewGroup.LayoutParams layoutParams = styleView.getLayoutParams();
        if (i == 1) {
            m133854b(false);
        } else if (i == 2) {
            C89219l.m154716b(textView, "");
            textView.setVisibility(0);
            layoutParams.width = (int) dimension;
            styleView.setLayoutParams(layoutParams);
            m133854b(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76330b
    /* renamed from: a */
    public final AbstractC76331c mo120045a(ActivityC0945e eVar, ViewGroup viewGroup, AbstractC76125l.C76127b bVar, AbstractC76125l.C76126a aVar, AbstractC76329a aVar2, C75574j jVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(jVar, "");
        SearchStickerViewContainer searchStickerViewContainer = new SearchStickerViewContainer(eVar, viewGroup, bVar, aVar2, this.f171573l, jVar);
        this.f171572k.setOnClickListener(new View$OnClickListenerC76376b(searchStickerViewContainer));
        return searchStickerViewContainer;
    }
}
