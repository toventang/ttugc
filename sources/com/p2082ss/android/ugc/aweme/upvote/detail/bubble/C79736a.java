package com.p2082ss.android.ugc.aweme.upvote.detail.bubble;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1706a.p1707a.C22971a;
import com.p2082ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView;
import com.p2082ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.p2082ss.android.ugc.aweme.upvote.detail.bubble.C79744b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79711e;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88502d;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.a */
public final class C79736a {

    /* renamed from: e */
    public static final int f178908e;

    /* renamed from: f */
    public static final C79738b f178909f = new C79738b((byte) 0);

    /* renamed from: a */
    public boolean f178910a;

    /* renamed from: b */
    public AbstractC89172b<? super View, C89391z> f178911b;

    /* renamed from: c */
    public final FrameLayout f178912c;

    /* renamed from: d */
    public final UpvoteListViewModel f178913d;

    /* renamed from: g */
    private final AbstractC89244h f178914g = C89250i.m154773a((AbstractC89171a) new C79741d(this));

    /* renamed from: h */
    private final C88411a f178915h = new C88411a();

    /* renamed from: i */
    private final AbstractC89244h f178916i = C89250i.m154773a((AbstractC89171a) new C79739c(this));

    /* renamed from: j */
    private int f178917j;

    /* renamed from: k */
    private String f178918k;

    /* renamed from: l */
    private String f178919l;

    /* renamed from: a */
    public final C79737a mo123333a() {
        return (C79737a) this.f178914g.getValue();
    }

    /* renamed from: b */
    public final AnimatorSet mo123335b() {
        return (AnimatorSet) this.f178916i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.a$b */
    public static final class C79738b {
        static {
            Covode.recordClassIndex(92961);
        }

        private C79738b() {
        }

        public /* synthetic */ C79738b(byte b) {
            this();
        }
    }

    /* renamed from: d */
    public final void mo123337d() {
        if (this.f178919l != null) {
            if (mo123335b().isRunning() || this.f178910a) {
                mo123334a(false);
            }
        }
    }

    /* renamed from: e */
    public final void mo123338e() {
        if (this.f178919l != null && !this.f178910a && !mo123335b().isRunning()) {
            mo123336c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.a$d */
    static final class C79741d extends AbstractC89220m implements AbstractC89171a<C79737a> {

        /* renamed from: a */
        final /* synthetic */ C79736a f178924a;

        static {
            Covode.recordClassIndex(92964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79741d(C79736a aVar) {
            super(0);
            this.f178924a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C79737a invoke() {
            View findViewById = this.f178924a.f178912c.findViewById(R.id.f9v);
            C89219l.m154716b(findViewById, "");
            View findViewById2 = this.f178924a.f178912c.findViewById(R.id.f9w);
            C89219l.m154716b(findViewById2, "");
            return new C79737a((UpvoteBubbleView) findViewById, (UpvoteBubbleView) findViewById2);
        }
    }

    static {
        Covode.recordClassIndex(92959);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f178908e = C89241a.m154730a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics()));
    }

    /* renamed from: g */
    private final void m138579g() {
        mo123333a().f178920a.getBubbleTouchArea().setOnClickListener(new View$OnClickListenerC79742e(this));
        mo123333a().f178921b.getBubbleTouchArea().setClickable(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.a$c */
    static final class C79739c extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C79736a f178922a;

        static {
            Covode.recordClassIndex(92962);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79739c(C79736a aVar) {
            super(0);
            this.f178922a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnimatorSet invoke() {
            C79737a a = this.f178922a.mo123333a();
            C89219l.m154721d(a, "");
            AnimatorSet animatorSet = new AnimatorSet();
            float translationY = a.f178920a.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new C79744b.C79747c(a, translationY));
            ofFloat.addListener(new C79744b.C79748d(a, translationY));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setDuration(200L);
            ofFloat2.setStartDelay(150);
            ofFloat2.addUpdateListener(new C79744b.C79749e(a, translationY));
            ofFloat2.addListener(new C79744b.C79750f(a, translationY));
            animatorSet.setInterpolator(C22971a.m43307c());
            animatorSet.play(ofFloat);
            animatorSet.play(ofFloat2);
            animatorSet.addListener(new C79740a(this));
            return animatorSet;
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.a$c$a */
        public static final class C79740a implements Animator.AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C79739c f178923a;

            static {
                Covode.recordClassIndex(92963);
            }

            public final void onAnimationCancel(Animator animator) {
                C89219l.m154719c(animator, "");
            }

            public final void onAnimationRepeat(Animator animator) {
                C89219l.m154719c(animator, "");
            }

            public final void onAnimationStart(Animator animator) {
                C89219l.m154719c(animator, "");
            }

            public C79740a(C79739c cVar) {
                this.f178923a = cVar;
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154719c(animator, "");
                C79736a aVar = this.f178923a.f178922a;
                C79737a a = aVar.mo123333a();
                UpvoteBubbleView upvoteBubbleView = a.f178920a;
                a.f178920a = a.f178921b;
                a.f178921b = upvoteBubbleView;
                aVar.mo123339f();
                aVar.mo123336c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.a$f */
    public static final class C79743f implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C79736a f178926a;

        static {
            Covode.recordClassIndex(92966);
        }

        C79743f(C79736a aVar) {
            this.f178926a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f178926a.f178910a = false;
            List<C79714h> list = this.f178926a.f178913d.f178880a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (T t : list) {
                    String text = t.getText();
                    if (!(text == null || text.length() == 0 || t.getBubbleHidden())) {
                        this.f178926a.mo123335b().start();
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo123336c() {
        if (this.f178912c.isAttachedToWindow() && !this.f178910a) {
            this.f178910a = true;
            AbstractC88412b cN_ = C88925a.m154165a(C88502d.f200771a).mo142936a(3000, TimeUnit.MILLISECONDS).mo142941b(C88925a.m154180b(C88946a.f201991c)).mo142937a(C88391a.m153580a(C88392a.f200660a)).mo142938a(new C79743f(this)).cN_();
            C89219l.m154716b(cN_, "");
            C88934a.m154195a(cN_, this.f178915h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo123339f() {
        String text;
        C79711e value = this.f178913d.mo123317a().getValue();
        if (value != null) {
            C89219l.m154716b(value, "");
            m138579g();
            while (this.f178917j < this.f178913d.f178880a.size()) {
                C79714h hVar = this.f178913d.f178880a.get(this.f178917j);
                if (value.getHasMore() && this.f178917j == this.f178913d.f178880a.size() - 5) {
                    UpvoteListViewModel.m138544a(this.f178913d, null, null, value.getCursor(), 3);
                }
                this.f178917j++;
                if (!hVar.getBubbleHidden() && (text = hVar.getText()) != null && text.length() != 0) {
                    C79744b.m138590a(mo123333a().f178921b, hVar);
                    return;
                }
            }
            C79744b.m138591a(mo123333a().f178921b, value.getUpvotes(), (int) value.getTotal());
            this.f178917j = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.a$e */
    public static final class View$OnClickListenerC79742e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79736a f178925a;

        static {
            Covode.recordClassIndex(92965);
        }

        View$OnClickListenerC79742e(C79736a aVar) {
            this.f178925a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89172b<? super View, C89391z> bVar = this.f178925a.f178911b;
            if (bVar != null) {
                C89219l.m154716b(view, "");
                bVar.invoke(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo123334a(boolean z) {
        this.f178915h.mo142944a();
        mo123335b().cancel();
        this.f178910a = false;
        if (z) {
            this.f178919l = null;
        }
    }

    /* renamed from: a */
    private final void m138577a(C79711e eVar) {
        this.f178919l = this.f178913d.f178881b;
        this.f178917j = 0;
        C79744b.m138591a(mo123333a().f178920a, eVar.getUpvotes(), (int) eVar.getTotal());
        mo123333a().f178920a.setAlpha(1.0f);
        mo123333a().f178921b.setAlpha(0.0f);
        mo123339f();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.a$a */
    public static final class C79737a {

        /* renamed from: a */
        public UpvoteBubbleView f178920a;

        /* renamed from: b */
        public UpvoteBubbleView f178921b;

        static {
            Covode.recordClassIndex(92960);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C79737a)) {
                return false;
            }
            C79737a aVar = (C79737a) obj;
            return C89219l.m154714a(this.f178920a, aVar.f178920a) && C89219l.m154714a(this.f178921b, aVar.f178921b);
        }

        public final int hashCode() {
            UpvoteBubbleView upvoteBubbleView = this.f178920a;
            int i = 0;
            int hashCode = (upvoteBubbleView != null ? upvoteBubbleView.hashCode() : 0) * 31;
            UpvoteBubbleView upvoteBubbleView2 = this.f178921b;
            if (upvoteBubbleView2 != null) {
                i = upvoteBubbleView2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "BubbleGroup(curBubble=" + this.f178920a + ", nextBubble=" + this.f178921b + ")";
        }

        public C79737a(UpvoteBubbleView upvoteBubbleView, UpvoteBubbleView upvoteBubbleView2) {
            C89219l.m154721d(upvoteBubbleView, "");
            C89219l.m154721d(upvoteBubbleView2, "");
            this.f178920a = upvoteBubbleView;
            this.f178921b = upvoteBubbleView2;
        }
    }

    public C79736a(FrameLayout frameLayout, UpvoteListViewModel upvoteListViewModel) {
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(upvoteListViewModel, "");
        this.f178912c = frameLayout;
        this.f178913d = upvoteListViewModel;
    }

    /* renamed from: a */
    public static /* synthetic */ void m138578a(C79736a aVar, boolean z, boolean z2) {
        C79711e value;
        if (!aVar.f178913d.mo123322c() && (value = aVar.f178913d.mo123317a().getValue()) != null) {
            C89219l.m154716b(value, "");
            if (!z2 && !aVar.mo123335b().isRunning() && !aVar.f178910a) {
                if (aVar.f178919l == null) {
                    aVar.m138577a(value);
                }
                aVar.mo123336c();
            }
            if (!z || !C89219l.m154714a((Object) aVar.f178918k, (Object) aVar.f178913d.f178881b)) {
                aVar.f178918k = aVar.f178913d.f178881b;
                if (z2) {
                    aVar.mo123334a(true);
                    aVar.m138577a(value);
                    aVar.mo123336c();
                }
            }
        }
    }
}
