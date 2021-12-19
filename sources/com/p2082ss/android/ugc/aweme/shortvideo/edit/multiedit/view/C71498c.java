package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.p036g.C0692e;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.C1465n;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2363ba.C34412d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70096q;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3826a.C71420a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71433b;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c */
public final class C71498c extends C71497b {

    /* renamed from: A */
    private float f160224A;

    /* renamed from: B */
    private float f160225B;

    /* renamed from: k */
    public View f160226k;

    /* renamed from: l */
    public View f160227l;

    /* renamed from: m */
    public View f160228m;

    /* renamed from: n */
    public TextView f160229n;

    /* renamed from: o */
    public RecyclerView f160230o;

    /* renamed from: p */
    public int f160231p;

    /* renamed from: q */
    public int f160232q;

    /* renamed from: r */
    public ValueAnimator f160233r;

    /* renamed from: s */
    public C0692e<Integer, Integer> f160234s;

    /* renamed from: t */
    public AnimatorSet f160235t;

    /* renamed from: u */
    public View f160236u;

    /* renamed from: v */
    public C71420a f160237v;

    /* renamed from: w */
    private View f160238w;

    /* renamed from: x */
    private View f160239x;

    /* renamed from: y */
    private View f160240y;

    /* renamed from: z */
    private float f160241z = 1.0f;

    static {
        Covode.recordClassIndex(84039);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: f */
    public final void mo113211f() {
        mo113217l().mo111145c();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: k */
    public final void mo113216k() {
        C71420a aVar = this.f160237v;
        if (aVar == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        aVar.f160034k.mo113054a();
    }

    /* renamed from: r */
    private final void m126353r() {
        View view = this.f160240y;
        if (view == null) {
            C89219l.m154710a("singleEditLayout");
        }
        view.setVisibility(0);
        View view2 = this.f160227l;
        if (view2 == null) {
            C89219l.m154710a("ivSave");
        }
        view2.setVisibility(8);
        View view3 = this.f160228m;
        if (view3 == null) {
            C89219l.m154710a("ivCancel");
        }
        view3.setVisibility(8);
        TextView textView = this.f160229n;
        if (textView == null) {
            C89219l.m154710a("singleEditTitle");
        }
        textView.setVisibility(4);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: h */
    public final void mo113213h() {
        m126354s();
        C71420a aVar = this.f160237v;
        if (aVar == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        aVar.f157927d = true;
        TextView textView = this.f160229n;
        if (textView == null) {
            C89219l.m154710a("singleEditTitle");
        }
        textView.setVisibility(8);
        mo113207c();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: i */
    public final void mo113214i() {
        View view = this.f160226k;
        if (view == null) {
            C89219l.m154710a("animTabDot");
        }
        view.setVisibility(0);
        mo113218m().setVisibility(0);
        mo113219n().setVisibility(0);
        View view2 = this.f160238w;
        if (view2 == null) {
            C89219l.m154710a("ivDelete");
        }
        view2.setVisibility(8);
        View view3 = this.f160239x;
        if (view3 == null) {
            C89219l.m154710a("tvVideoSegmentDes");
        }
        view3.setVisibility(0);
        mo113220o().setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$e */
    static final class ViewTreeObserver$OnPreDrawListenerC71503e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C71498c f160246a;

        static {
            Covode.recordClassIndex(84044);
        }

        ViewTreeObserver$OnPreDrawListenerC71503e(C71498c cVar) {
            this.f160246a = cVar;
        }

        public final boolean onPreDraw() {
            ValueAnimator valueAnimator = this.f160246a.f160233r;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                int a = C71498c.m126347a(this.f160246a).mo110979a(C71498c.m126348b(this.f160246a), C71498c.m126347a(this.f160246a).f157925b);
                if (a == -1) {
                    C71498c.m126349c(this.f160246a).setVisibility(8);
                } else {
                    if (C71498c.m126349c(this.f160246a).getVisibility() == 8) {
                        C71498c.m126349c(this.f160246a).setVisibility(0);
                    }
                    C71498c.m126349c(this.f160246a).setX(((float) a) - ((float) (C71498c.m126349c(this.f160246a).getMeasuredWidth() / 2)));
                }
            }
            return true;
        }
    }

    /* renamed from: s */
    private final void m126354s() {
        View view = this.f160227l;
        if (view == null) {
            C89219l.m154710a("ivSave");
        }
        view.setVisibility(8);
        View view2 = this.f160228m;
        if (view2 == null) {
            C89219l.m154710a("ivCancel");
        }
        view2.setVisibility(8);
        View view3 = this.f160240y;
        if (view3 == null) {
            C89219l.m154710a("singleEditLayout");
        }
        view3.setVisibility(8);
        RecyclerView recyclerView = this.f160230o;
        if (recyclerView == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        recyclerView.setVisibility(0);
        TextView textView = this.f160229n;
        if (textView == null) {
            C89219l.m154710a("singleEditTitle");
        }
        textView.setVisibility(4);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: g */
    public final void mo113212g() {
        m126353r();
        RecyclerView recyclerView = this.f160230o;
        if (recyclerView == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        recyclerView.setVisibility(8);
        View view = this.f160227l;
        if (view == null) {
            C89219l.m154710a("ivSave");
        }
        view.setVisibility(0);
        View view2 = this.f160228m;
        if (view2 == null) {
            C89219l.m154710a("ivCancel");
        }
        view2.setVisibility(0);
        TextView textView = this.f160229n;
        if (textView == null) {
            C89219l.m154710a("singleEditTitle");
        }
        textView.setVisibility(0);
        C71420a aVar = this.f160237v;
        if (aVar == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        aVar.f157927d = false;
        View view3 = this.f160240y;
        if (view3 == null) {
            C89219l.m154710a("singleEditLayout");
        }
        view3.setVisibility(0);
        mo113207c();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: j */
    public final void mo113215j() {
        View view = this.f160226k;
        if (view == null) {
            C89219l.m154710a("animTabDot");
        }
        view.setVisibility(4);
        mo113218m().setVisibility(4);
        mo113219n().setVisibility(4);
        C71420a aVar = this.f160237v;
        if (aVar == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        if (aVar.mo111340a().size() == 1) {
            View view2 = this.f160238w;
            if (view2 == null) {
                C89219l.m154710a("ivDelete");
            }
            view2.setAlpha(0.5f);
        } else {
            View view3 = this.f160238w;
            if (view3 == null) {
                C89219l.m154710a("ivDelete");
            }
            view3.setAlpha(1.0f);
        }
        View view4 = this.f160238w;
        if (view4 == null) {
            C89219l.m154710a("ivDelete");
        }
        view4.setVisibility(0);
        mo113220o().setVisibility(0);
        View view5 = this.f160239x;
        if (view5 == null) {
            C89219l.m154710a("tvVideoSegmentDes");
        }
        view5.setVisibility(4);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$g */
    public static final class ViewTreeObserver$OnPreDrawListenerC71506g implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C71498c f160253a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f160254b;

        /* renamed from: c */
        final /* synthetic */ AnimatorListenerAdapter f160255c;

        /* renamed from: d */
        final /* synthetic */ int f160256d;

        static {
            Covode.recordClassIndex(84047);
        }

        public final boolean onPreDraw() {
            View rootView = C71498c.m126348b(this.f160253a).getRootView();
            C89219l.m154716b(rootView, "");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f160253a.f160234s == null) {
                return false;
            }
            RecyclerView b = C71498c.m126348b(this.f160253a);
            ArrayList arrayList = new ArrayList();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.play(ObjectAnimator.ofFloat(b, "alpha", 0.0f, 1.0f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(300L);
            animatorSet2.play(ObjectAnimator.ofFloat(C71498c.m126350d(this.f160253a), "alpha", 1.0f, 0.0f));
            animatorSet2.play(ObjectAnimator.ofFloat(C71498c.m126351e(this.f160253a), "alpha", 1.0f, 0.0f));
            animatorSet2.play(ObjectAnimator.ofFloat(C71498c.m126352f(this.f160253a), "alpha", 1.0f, 0.0f));
            arrayList.add(animatorSet2);
            arrayList.add(animatorSet);
            C71498c cVar = this.f160253a;
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            animatorSet3.addListener(new C71507a(this, arrayList));
            cVar.f160235t = animatorSet3;
            AnimatorSet animatorSet4 = this.f160253a.f160235t;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
            C71498c.m126347a(this.f160253a).f157925b = this.f160256d;
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$g$a */
        public static final class C71507a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC71506g f160257a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f160258b;

            static {
                Covode.recordClassIndex(84048);
            }

            public final void onAnimationEnd(Animator animator) {
                AnimatorListenerAdapter animatorListenerAdapter;
                C89219l.m154721d(animator, "");
                super.onAnimationEnd(animator);
                if (this.f160257a.f160254b != null && !this.f160257a.f160254b.isFinishing() && (animatorListenerAdapter = this.f160257a.f160255c) != null) {
                    animatorListenerAdapter.onAnimationEnd(animator);
                }
            }

            C71507a(ViewTreeObserver$OnPreDrawListenerC71506g gVar, ArrayList arrayList) {
                this.f160257a = gVar;
                this.f160258b = arrayList;
            }
        }

        ViewTreeObserver$OnPreDrawListenerC71506g(C71498c cVar, ActivityC0945e eVar, AnimatorListenerAdapter animatorListenerAdapter, int i) {
            this.f160253a = cVar;
            this.f160254b = eVar;
            this.f160255c = animatorListenerAdapter;
            this.f160256d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$f */
    public static final class ViewTreeObserver$OnPreDrawListenerC71504f implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C71498c f160247a;

        /* renamed from: b */
        final /* synthetic */ int f160248b;

        /* renamed from: c */
        final /* synthetic */ ActivityC0945e f160249c;

        /* renamed from: d */
        final /* synthetic */ AnimatorListenerAdapter f160250d;

        static {
            Covode.recordClassIndex(84045);
        }

        public final boolean onPreDraw() {
            RecyclerView.ViewHolder f;
            View rootView = C71498c.m126348b(this.f160247a).getRootView();
            C89219l.m154716b(rootView, "");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            RecyclerView.ViewHolder f2 = C71498c.m126348b(this.f160247a).mo4451f(this.f160248b);
            RecyclerView b = C71498c.m126348b(this.f160247a);
            int i = this.f160248b;
            C0692e<Integer, Integer> a = C34412d.m70402a(b);
            F f3 = a.f2750a;
            if (f3 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(f3, "");
            Integer num = null;
            if (C89219l.m154703a(i, f3.intValue()) >= 0) {
                S s = a.f2751b;
                if (s == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(s, "");
                if (C89219l.m154703a(i, s.intValue()) <= 0) {
                    RecyclerView.AbstractC1350a adapter = b.getAdapter();
                    if (adapter == null || (num = Integer.valueOf(adapter.getItemCount())) == null) {
                        C89219l.m154715b();
                    }
                    if (i < num.intValue() && i >= 0 && (f = b.mo4451f(i)) != null && f.itemView != null) {
                        int[] iArr = new int[2];
                        f.itemView.getLocationInWindow(iArr);
                        int i2 = iArr[0];
                        int i3 = iArr[1];
                        int i4 = iArr[0];
                        View view = f.itemView;
                        C89219l.m154716b(view, "");
                        int width = i4 + view.getWidth();
                        int i5 = iArr[1];
                        View view2 = f.itemView;
                        C89219l.m154716b(view2, "");
                        new Rect(i2, i3, width, i5 + view2.getHeight());
                        if (f2 != null) {
                            C71498c cVar = this.f160247a;
                            View view3 = f2.itemView;
                            C89219l.m154716b(view3, "");
                            cVar.f160236u = view3;
                            C71498c cVar2 = this.f160247a;
                            cVar2.f160234s = C34412d.m70402a(C71498c.m126348b(cVar2));
                            RecyclerView b2 = C71498c.m126348b(this.f160247a);
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.setDuration(300L);
                            animatorSet.play(ObjectAnimator.ofFloat(b2, "alpha", 1.0f, 0.0f));
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.setDuration(300L);
                            animatorSet2.play(ObjectAnimator.ofFloat(C71498c.m126350d(this.f160247a), "alpha", 0.0f, 1.0f));
                            animatorSet2.play(ObjectAnimator.ofFloat(C71498c.m126351e(this.f160247a), "alpha", 0.0f, 1.0f));
                            animatorSet2.play(ObjectAnimator.ofFloat(C71498c.m126352f(this.f160247a), "alpha", 0.0f, 1.0f));
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(animatorSet);
                            arrayList.add(animatorSet2);
                            C71498c cVar3 = this.f160247a;
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            animatorSet3.playTogether(arrayList);
                            animatorSet3.addListener(new C71505a(this, arrayList));
                            cVar3.f160235t = animatorSet3;
                            AnimatorSet animatorSet4 = this.f160247a.f160235t;
                            if (animatorSet4 != null) {
                                animatorSet4.start();
                            }
                        }
                    }
                }
            }
            return false;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$f$a */
        public static final class C71505a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC71504f f160251a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f160252b;

            static {
                Covode.recordClassIndex(84046);
            }

            public final void onAnimationEnd(Animator animator) {
                AnimatorListenerAdapter animatorListenerAdapter;
                C89219l.m154721d(animator, "");
                super.onAnimationEnd(animator);
                if (this.f160251a.f160249c != null && !this.f160251a.f160249c.isFinishing() && (animatorListenerAdapter = this.f160251a.f160250d) != null) {
                    animatorListenerAdapter.onAnimationEnd(animator);
                }
            }

            C71505a(ViewTreeObserver$OnPreDrawListenerC71504f fVar, ArrayList arrayList) {
                this.f160251a = fVar;
                this.f160252b = arrayList;
            }
        }

        ViewTreeObserver$OnPreDrawListenerC71504f(C71498c cVar, int i, ActivityC0945e eVar, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f160247a = cVar;
            this.f160248b = i;
            this.f160249c = eVar;
            this.f160250d = animatorListenerAdapter;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C71420a m126347a(C71498c cVar) {
        C71420a aVar = cVar.f160237v;
        if (aVar == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecyclerView m126348b(C71498c cVar) {
        RecyclerView recyclerView = cVar.f160230o;
        if (recyclerView == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m126349c(C71498c cVar) {
        View view = cVar.f160226k;
        if (view == null) {
            C89219l.m154710a("animTabDot");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ TextView m126350d(C71498c cVar) {
        TextView textView = cVar.f160229n;
        if (textView == null) {
            C89219l.m154710a("singleEditTitle");
        }
        return textView;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m126351e(C71498c cVar) {
        View view = cVar.f160228m;
        if (view == null) {
            C89219l.m154710a("ivCancel");
        }
        return view;
    }

    /* renamed from: f */
    public static final /* synthetic */ View m126352f(C71498c cVar) {
        View view = cVar.f160227l;
        if (view == null) {
            C89219l.m154710a("ivSave");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$b */
    static final class C71500b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C71498c f160243a;

        static {
            Covode.recordClassIndex(84041);
        }

        C71500b(C71498c cVar) {
            this.f160243a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c = C71498c.m126349c(this.f160243a);
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$c */
    static final class C71501c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C71498c f160244a;

        static {
            Covode.recordClassIndex(84042);
        }

        C71501c(C71498c cVar) {
            this.f160244a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c = C71498c.m126349c(this.f160244a);
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113197a(VideoSegment videoSegment) {
        C71420a aVar = this.f160237v;
        if (aVar == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        aVar.mo111342a(videoSegment);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: b */
    public final void mo113202b(C0692e<Float, Float> eVar) {
        C89219l.m154721d(eVar, "");
        mo113217l().mo111133a(eVar, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113191a(View.OnClickListener onClickListener) {
        super.mo113191a(onClickListener);
        View view = this.f160238w;
        if (view == null) {
            C89219l.m154710a("ivDelete");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.f160227l;
        if (view2 == null) {
            C89219l.m154710a("ivSave");
        }
        view2.setOnClickListener(onClickListener);
        View view3 = this.f160228m;
        if (view3 == null) {
            C89219l.m154710a("ivCancel");
        }
        view3.setOnClickListener(onClickListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: b */
    public final void mo113204b(VideoSegment videoSegment) {
        C71420a aVar = this.f160237v;
        if (aVar == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        aVar.mo111346b(videoSegment);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$a */
    static final class C71499a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C71498c f160242a;

        static {
            Covode.recordClassIndex(84040);
        }

        C71499a(C71498c cVar) {
            this.f160242a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c;
            float f;
            int a = C71498c.m126347a(this.f160242a).mo110979a(C71498c.m126348b(this.f160242a), this.f160242a.f160231p);
            int a2 = C71498c.m126347a(this.f160242a).mo110979a(C71498c.m126348b(this.f160242a), this.f160242a.f160232q);
            if (a == -1 && a2 == -1) {
                C71498c.m126349c(this.f160242a).setTranslationX(0.0f);
                C71498c.m126349c(this.f160242a).setVisibility(4);
                return;
            }
            if (a < 0 || a2 < 0) {
                C71498c.m126349c(this.f160242a).setVisibility(0);
                c = C71498c.m126349c(this.f160242a);
                if (a2 == -1) {
                    f = (float) a;
                } else {
                    f = (float) a2;
                }
            } else {
                C71498c.m126349c(this.f160242a).setVisibility(0);
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                f = (((Float) animatedValue).floatValue() * ((float) (a2 - a))) + ((float) a);
                c = C71498c.m126349c(this.f160242a);
            }
            c.setX(f - ((float) (C71498c.m126349c(this.f160242a).getMeasuredWidth() / 2)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113199a(List<? extends VideoSegment> list) {
        C71420a aVar = this.f160237v;
        if (aVar == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        if (!C84904k.m145909a(list)) {
            aVar.mo111343a((List<VideoSegment>) list);
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$d */
    static final class C71502d implements C70582z.AbstractC70584b {

        /* renamed from: a */
        final /* synthetic */ C71498c f160245a;

        static {
            Covode.recordClassIndex(84043);
        }

        C71502d(C71498c cVar) {
            this.f160245a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z.AbstractC70584b
        /* renamed from: a */
        public final void mo110976a(int i, String str) {
            AbstractC71433b bVar = this.f160245a.f160218g;
            if (bVar != null) {
                bVar.mo113041a(i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113190a(int i, int i2) {
        if (i != i2) {
            RecyclerView recyclerView = this.f160230o;
            if (recyclerView == null) {
                C89219l.m154710a("videoRecyclerView");
            }
            recyclerView.mo4435d(i2);
            C71420a aVar = this.f160237v;
            if (aVar == null) {
                C89219l.m154710a("videoSegmentAdapter");
            }
            if (i == aVar.f157925b) {
                this.f160231p = i;
                this.f160232q = i2;
                ValueAnimator valueAnimator = this.f160233r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(500L);
                ofFloat.addUpdateListener(new C71499a(this));
                this.f160233r = ofFloat;
                ofFloat.start();
            } else {
                return;
            }
        }
        C71420a aVar2 = this.f160237v;
        if (aVar2 == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        aVar2.f157925b = i2;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113201a(boolean z, int i) {
        ValueAnimator valueAnimator = this.f160233r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(100L);
            ofFloat.addUpdateListener(new C71500b(this));
            this.f160233r = ofFloat;
        } else {
            C71420a aVar = this.f160237v;
            if (aVar == null) {
                C89219l.m154710a("videoSegmentAdapter");
            }
            RecyclerView recyclerView = this.f160230o;
            if (recyclerView == null) {
                C89219l.m154710a("videoRecyclerView");
            }
            int a = aVar.mo110979a(recyclerView, i);
            View view = this.f160226k;
            if (view == null) {
                C89219l.m154710a("animTabDot");
            }
            float f = (float) a;
            View view2 = this.f160226k;
            if (view2 == null) {
                C89219l.m154710a("animTabDot");
            }
            view.setX(f - ((float) (view2.getMeasuredWidth() / 2)));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setDuration(100L);
            ofFloat2.addUpdateListener(new C71501c(this));
            this.f160233r = ofFloat2;
            C71420a aVar2 = this.f160237v;
            if (aVar2 == null) {
                C89219l.m154710a("videoSegmentAdapter");
            }
            aVar2.f157925b = i;
        }
        ValueAnimator valueAnimator2 = this.f160233r;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: b */
    public final void mo113203b(ActivityC0945e eVar, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f160241z = 1.0f;
        this.f160224A = 0.0f;
        this.f160225B = 0.0f;
        RecyclerView recyclerView = this.f160230o;
        if (recyclerView == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        recyclerView.mo4413b(i);
        RecyclerView recyclerView2 = this.f160230o;
        if (recyclerView2 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        C0792v.m2768e(recyclerView2);
        m126353r();
        RecyclerView recyclerView3 = this.f160230o;
        if (recyclerView3 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        View rootView = recyclerView3.getRootView();
        C89219l.m154716b(rootView, "");
        rootView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC71504f(this, i, eVar, animatorListenerAdapter));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113193a(ActivityC0945e eVar, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        m126354s();
        if (this.f160234s == null) {
            animatorListenerAdapter.onAnimationEnd(null);
            return;
        }
        RecyclerView recyclerView = this.f160230o;
        if (recyclerView == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        View rootView = recyclerView.getRootView();
        C89219l.m154716b(rootView, "");
        rootView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC71506g(this, eVar, animatorListenerAdapter, i));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113194a(ActivityC0945e eVar, View view, boolean z) {
        if (eVar != null && view != null) {
            super.mo113194a(eVar, view, z);
            View findViewById = view.findViewById(R.id.bry);
            C89219l.m154716b(findViewById, "");
            this.f160238w = findViewById;
            View findViewById2 = view.findViewById(R.id.erv);
            C89219l.m154716b(findViewById2, "");
            this.f160239x = findViewById2;
            View findViewById3 = view.findViewById(R.id.ju);
            C89219l.m154716b(findViewById3, "");
            this.f160226k = findViewById3;
            View findViewById4 = view.findViewById(R.id.fbs);
            C89219l.m154716b(findViewById4, "");
            this.f160230o = (RecyclerView) findViewById4;
            View findViewById5 = view.findViewById(R.id.e1c);
            C89219l.m154716b(findViewById5, "");
            this.f160229n = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.e1_);
            C89219l.m154716b(findViewById6, "");
            this.f160240y = findViewById6;
            View findViewById7 = view.findViewById(R.id.bs9);
            C89219l.m154716b(findViewById7, "");
            this.f160227l = findViewById7;
            View findViewById8 = view.findViewById(R.id.brw);
            C89219l.m154716b(findViewById8, "");
            this.f160228m = findViewById8;
            View findViewById9 = view.findViewById(R.id.fbs);
            C89219l.m154716b(findViewById9, "");
            this.f160230o = (RecyclerView) findViewById9;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.C71497b, com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view.AbstractC71496a
    /* renamed from: a */
    public final void mo113196a(ActivityC0945e eVar, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        if (videoEditViewModel == null) {
            C89219l.m154715b();
        }
        if (cutMultiVideoViewModel == null) {
            C89219l.m154715b();
        }
        if (list == null) {
            C89219l.m154715b();
        }
        this.f160237v = new C71420a(videoEditViewModel, cutMultiVideoViewModel, list);
        C71420a aVar = this.f160237v;
        if (aVar == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        C1465n nVar = new C1465n(new C70096q(aVar));
        RecyclerView recyclerView = this.f160230o;
        if (recyclerView == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        nVar.mo4979a(recyclerView);
        RecyclerView recyclerView2 = this.f160230o;
        if (recyclerView2 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        recyclerView2.setLayoutManager(new MultiEditRecyleViewLayoutManager(eVar));
        RecyclerView recyclerView3 = this.f160230o;
        if (recyclerView3 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        C71420a aVar2 = this.f160237v;
        if (aVar2 == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        recyclerView3.setAdapter(aVar2);
        C71420a aVar3 = this.f160237v;
        if (aVar3 == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        aVar3.f157926c = new C71502d(this);
        RecyclerView recyclerView4 = this.f160230o;
        if (recyclerView4 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        C1434i iVar = new C1434i();
        iVar.f4468j = 300;
        iVar.f4470l = 300;
        iVar.f4469k = 300;
        iVar.f4467i = 300;
        recyclerView4.setItemAnimator(iVar);
        RecyclerView recyclerView5 = this.f160230o;
        if (recyclerView5 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        recyclerView5.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC71503e(this));
        RecyclerView recyclerView6 = this.f160230o;
        if (recyclerView6 == null) {
            C89219l.m154710a("videoRecyclerView");
        }
        C71420a aVar4 = this.f160237v;
        if (aVar4 == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        recyclerView6.setAdapter(aVar4);
        C71420a aVar5 = this.f160237v;
        if (aVar5 == null) {
            C89219l.m154710a("videoSegmentAdapter");
        }
        aVar5.notifyDataSetChanged();
    }
}
