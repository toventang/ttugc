package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1722h.C23160g;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.experiment.C47008he;
import com.p2082ss.android.ugc.aweme.feed.C49704j;
import com.p2082ss.android.ugc.aweme.feed.api.RecommendNotInterestedApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50323k;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50531ag;
import com.p2082ss.android.ugc.aweme.follow.NewFollowButton;
import com.p2082ss.android.ugc.aweme.metrics.C59205aa;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59246k;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.x */
public final class C50467x {

    /* renamed from: h */
    public static final C50470a f116564h = new C50470a((byte) 0);

    /* renamed from: a */
    public View f116565a;

    /* renamed from: b */
    public NewFollowButton f116566b;

    /* renamed from: c */
    public TuxButton f116567c;

    /* renamed from: d */
    DataCenter f116568d;

    /* renamed from: e */
    public Aweme f116569e;

    /* renamed from: f */
    boolean f116570f;

    /* renamed from: g */
    public final Context f116571g;

    /* renamed from: i */
    private final AbstractC89244h f116572i;

    static {
        Covode.recordClassIndex(59603);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C23160g mo85712a() {
        return (C23160g) this.f116572i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.x$a */
    public static final class C50470a {
        static {
            Covode.recordClassIndex(59606);
        }

        private C50470a() {
        }

        public /* synthetic */ C50470a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.x$f */
    static final class C50475f extends AbstractC89220m implements AbstractC89171a<C23160g> {

        /* renamed from: a */
        final /* synthetic */ C50467x f116583a;

        static {
            Covode.recordClassIndex(59611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50475f(C50467x xVar) {
            super(0);
            this.f116583a = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23160g invoke() {
            return new C23160g(this.f116583a.f116571g);
        }
    }

    /* renamed from: b */
    public final void mo85713b() {
        if (this.f116569e != null) {
            View view = this.f116565a;
            if (view != null) {
                view.setVisibility(8);
            }
            NewFollowButton newFollowButton = this.f116566b;
            if (newFollowButton != null) {
                newFollowButton.setVisibility(8);
            }
            TuxButton tuxButton = this.f116567c;
            if (tuxButton != null) {
                tuxButton.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.x$e */
    static final class RunnableC50474e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50467x f116582a;

        static {
            Covode.recordClassIndex(59610);
        }

        RunnableC50474e(C50467x xVar) {
            this.f116582a = xVar;
        }

        public final void run() {
            AnimatorSet animatorSet = new AnimatorSet();
            C50467x xVar = this.f116582a;
            AnimatorSet.Builder play = animatorSet.play(xVar.mo85711a(0, xVar.f116566b, 131.0f, 270.0f));
            C50467x xVar2 = this.f116582a;
            play.with(xVar2.mo85711a(0, xVar2.f116567c, 131.0f, 0.0f));
            animatorSet.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.x$d */
    static final class RunnableC50473d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50467x f116580a;

        /* renamed from: b */
        final /* synthetic */ FollowStatus f116581b;

        static {
            Covode.recordClassIndex(59609);
        }

        RunnableC50473d(C50467x xVar, FollowStatus followStatus) {
            this.f116580a = xVar;
            this.f116581b = followStatus;
        }

        public final void run() {
            String str;
            String str2;
            TuxButton tuxButton;
            NewFollowButton newFollowButton = this.f116580a.f116566b;
            if (newFollowButton != null) {
                newFollowButton.mo73175a(this.f116581b.followStatus, this.f116581b.followerStatus);
            }
            NewFollowButton newFollowButton2 = this.f116580a.f116566b;
            if (newFollowButton2 != null) {
                newFollowButton2.setButtonVariant(2);
            }
            Aweme aweme = this.f116580a.f116569e;
            String str3 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (!C50531ag.m94720a(str)) {
                C50467x xVar = this.f116580a;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.play(xVar.mo85711a(0, xVar.f116566b, 131.0f, 270.0f)).with(xVar.mo85711a(2, xVar.f116567c, 1.0f, 0.0f));
                animatorSet.start();
                TuxButton tuxButton2 = xVar.f116567c;
                if (!(tuxButton2 == null || tuxButton2.getWidth() != 0 || (tuxButton = xVar.f116567c) == null)) {
                    tuxButton.setVisibility(8);
                }
            }
            C50467x xVar2 = this.f116580a;
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(xVar2.mo85711a(1, xVar2.f116565a, 48.0f, 0.0f)).with(xVar2.mo85711a(2, xVar2.f116565a, 1.0f, 0.0f));
            animatorSet2.setStartDelay(500);
            animatorSet2.addListener(new C50472c(xVar2));
            animatorSet2.start();
            Aweme aweme2 = this.f116580a.f116569e;
            C50323k.EnumC50324a aVar = C50323k.EnumC50324a.FOLLOW;
            Aweme aweme3 = this.f116580a.f116569e;
            if (aweme3 != null) {
                str2 = aweme3.getAid();
            } else {
                str2 = null;
            }
            C50476y.m94635a(aweme2, aVar, C50531ag.m94721b(str2));
            Aweme aweme4 = this.f116580a.f116569e;
            if (aweme4 != null) {
                str3 = aweme4.getAid();
            }
            C50531ag.m94722c(str3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.x$c */
    public static final class C50472c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C50467x f116578a;

        /* renamed from: b */
        final /* synthetic */ long f116579b = 500;

        static {
            Covode.recordClassIndex(59608);
        }

        C50472c(C50467x xVar) {
            this.f116578a = xVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f116578a.f116565a;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.x$b */
    public static final class C50471b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50467x f116575a;

        /* renamed from: b */
        final /* synthetic */ View f116576b;

        /* renamed from: c */
        final /* synthetic */ int f116577c;

        static {
            Covode.recordClassIndex(59607);
        }

        C50471b(C50467x xVar, View view, int i) {
            this.f116575a = xVar;
            this.f116576b = view;
            this.f116577c = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = this.f116576b;
            int i = this.f116577c;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (i == 0) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
            } else if (i == 1) {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, floatValue, system2.getDisplayMetrics()));
            } else if (i == 2) {
                view.setAlpha(floatValue);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public C50467x(View view, Context context) {
        View view2;
        NewFollowButton newFollowButton;
        TuxButton tuxButton;
        NewFollowButton newFollowButton2;
        C89219l.m154721d(context, "");
        this.f116571g = context;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            view2 = view.findViewById(R.id.dnb);
        } else {
            view2 = null;
        }
        this.f116565a = view2;
        if (view != null) {
            newFollowButton = (NewFollowButton) view.findViewById(R.id.xm);
        } else {
            newFollowButton = null;
        }
        this.f116566b = newFollowButton;
        if (view != null) {
            tuxButton = (TuxButton) view.findViewById(R.id.yf);
        } else {
            tuxButton = null;
        }
        this.f116567c = tuxButton;
        NewFollowButton newFollowButton3 = this.f116566b;
        if (newFollowButton3 != null) {
            newFollowButton3.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50467x.View$OnClickListenerC504681 */

                /* renamed from: a */
                final /* synthetic */ C50467x f116573a;

                static {
                    Covode.recordClassIndex(59604);
                }

                {
                    this.f116573a = r1;
                }

                public final void onClick(View view) {
                    Aweme aweme;
                    String str;
                    ClickAgent.onClick(view);
                    C50467x xVar = this.f116573a;
                    if (view != null && (aweme = xVar.f116569e) != null && !aweme.isDelete()) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            xVar.mo85712a().mo37653b();
                        } else {
                            xVar.mo85712a().mo37652a();
                        }
                        if (xVar.f116568d != null) {
                            User author = aweme.getAuthor();
                            C89219l.m154716b(author, "");
                            if (author.getFollowStatus() == 0) {
                                C49672ag agVar = new C49672ag(12, aweme);
                                if (C50531ag.m94720a(aweme.getAid())) {
                                    str = "expand_card";
                                } else {
                                    str = "small_card";
                                }
                                agVar.f114328n = str;
                                DataCenter dataCenter = xVar.f116568d;
                                if (dataCenter != null) {
                                    dataCenter.mo60191a("feed_internal_event", agVar);
                                }
                            }
                        }
                    }
                }
            });
        }
        TuxButton tuxButton2 = this.f116567c;
        if (tuxButton2 != null) {
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50467x.View$OnClickListenerC504692 */

                /* renamed from: a */
                final /* synthetic */ C50467x f116574a;

                static {
                    Covode.recordClassIndex(59605);
                }

                {
                    this.f116574a = r1;
                }

                public final void onClick(View view) {
                    Aweme aweme;
                    String str;
                    String str2;
                    AwemeRawAd awemeRawAd;
                    ClickAgent.onClick(view);
                    C50467x xVar = this.f116574a;
                    if (view != null && xVar.f116565a != null && (aweme = xVar.f116569e) != null) {
                        C50531ag.m94722c(aweme.getAid());
                        C49704j jVar = new C49704j(aweme, "homepage_hot", "small_card");
                        new C79459a(C17867d.m33078a()).mo123050a(R.string.fc5).mo123053a();
                        AbstractC81915c.m141874a(new C49677e(jVar.f114388a, jVar.f114389b, C49677e.f114337e));
                        C59256u o = new C59256u().mo96749g(jVar.f114388a).mo96834a(jVar.f114389b).mo96837o(jVar.f114390c);
                        o.f135352b = C59256u.EnumC59257a.DISLIKE;
                        C59256u a = o.mo96832a(jVar.f114388a.getAuthor());
                        User author = jVar.f114388a.getAuthor();
                        String str3 = "";
                        C89219l.m154716b(author, str3);
                        C59256u s = a.mo96841s(author.getRequestId());
                        s.f135350a = C59256u.EnumC59259c.ITEM;
                        s.mo96837o(jVar.f114390c).mo96792f();
                        C59246k a2 = new C59246k().mo96749g(jVar.f114388a).mo96814a(jVar.f114389b);
                        a2.f135237c = "small_card";
                        a2.f135236b = C59208ac.m108758a(jVar.f114388a);
                        a2.f135235a = C59208ac.m108771e(jVar.f114388a);
                        a2.f135239e = C59208ac.m108773g(jVar.f114388a);
                        a2.f135244t = C59205aa.m108754a(jVar.f114388a);
                        a2.mo96792f();
                        RecommendNotInterestedApi.SyncNotInterestedApi syncNotInterestedApi = (RecommendNotInterestedApi.SyncNotInterestedApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RecommendNotInterestedApi.SyncNotInterestedApi.class);
                        String aid = jVar.f114388a.getAid();
                        C89219l.m154716b(aid, str3);
                        HashMap hashMap = new HashMap();
                        String authorUid = jVar.f114388a.getAuthorUid();
                        C89219l.m154716b(authorUid, str3);
                        hashMap.put("author_id", authorUid);
                        hashMap.put("channel_id", String.valueOf(C33721c.m69041a(jVar.f114389b)));
                        Aweme aweme2 = jVar.f114388a;
                        if (!aweme2.isAd() || (awemeRawAd = aweme2.getAwemeRawAd()) == null) {
                            str = str3;
                            str2 = str;
                        } else {
                            C89219l.m154716b(awemeRawAd, str3);
                            String valueOf = String.valueOf(awemeRawAd.getAdId().longValue());
                            str2 = String.valueOf(awemeRawAd.getCreativeId().longValue());
                            str = awemeRawAd.getLogExtra();
                            C89219l.m154716b(str, str3);
                            str3 = valueOf;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            hashMap.put("ad_id", str3);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            hashMap.put("creative_id", str2);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            hashMap.put("log_extra", str);
                        }
                        syncNotInterestedApi.dislikeRecommend(aid, hashMap).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(C49704j.C49706b.f114391a, C49704j.C49707c.f114392a);
                    }
                }
            });
        }
        if (!(C47008he.m90282a() != 1 || (newFollowButton2 = this.f116566b) == null || this.f116567c == null || this.f116565a == null)) {
            ViewGroup.LayoutParams layoutParams2 = newFollowButton2.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            TuxButton tuxButton3 = this.f116567c;
            layoutParams = tuxButton3 != null ? tuxButton3.getLayoutParams() : layoutParams;
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.removeRule(21);
            layoutParams3.addRule(20);
            layoutParams4.removeRule(20);
            layoutParams4.addRule(21);
        }
        this.f116572i = C89250i.m154773a((AbstractC89171a) new C50475f(this));
    }

    /* renamed from: a */
    public final ValueAnimator mo85711a(int i, View view, float f, float f2) {
        if (view == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new C50471b(this, view, i));
        return ofFloat;
    }
}
