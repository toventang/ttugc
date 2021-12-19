package com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35501a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.DetailViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.p2757dg.C41472d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.i */
public final class C35578i implements AbstractC1214u<Boolean>, AbstractC47430d {

    /* renamed from: a */
    Challenge f83897a;

    /* renamed from: b */
    C35583j f83898b;

    /* renamed from: c */
    public boolean f83899c;

    /* renamed from: d */
    public boolean f83900d;

    /* renamed from: e */
    boolean f83901e;

    /* renamed from: f */
    public final View f83902f;

    /* renamed from: g */
    final ChallengeDetailParam f83903g;

    /* renamed from: h */
    private final C47426a f83904h;

    /* renamed from: i */
    private C41472d f83905i;

    /* renamed from: j */
    private final CheckableImageView f83906j;

    /* renamed from: k */
    private final TextView f83907k;

    static {
        Covode.recordClassIndex(42802);
    }

    /* renamed from: d */
    private final void m72679d() {
        this.f83901e = !this.f83901e;
    }

    /* renamed from: a */
    public final void mo62586a() {
        int i;
        CheckableImageView checkableImageView = this.f83906j;
        if (this.f83901e) {
            i = R.drawable.b2e;
        } else {
            i = 2131233168;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: b */
    public final void mo62590b() {
        int i;
        TextView textView = this.f83907k;
        if (textView != null) {
            if (this.f83901e) {
                i = R.string.pf;
            } else {
                i = R.string.p_;
            }
            textView.setText(i);
        }
        C41472d dVar = this.f83905i;
        if (dVar != null && !this.f83901e && dVar.isShowing()) {
            dVar.dismiss();
        }
        if (this.f83901e) {
            this.f83900d = true;
        }
    }

    /* renamed from: c */
    public final void mo62591c() {
        C47426a aVar = this.f83904h;
        Object[] objArr = new Object[3];
        objArr[0] = 3;
        Challenge challenge = this.f83897a;
        if (challenge == null) {
            C89219l.m154710a("mData");
        }
        objArr[1] = challenge.getCid();
        objArr[2] = Integer.valueOf(1 ^ (this.f83901e ? 1 : 0));
        aVar.mo57616a(objArr);
        m72679d();
        this.f83906j.mo98607b();
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: e_ */
    public final void mo62592e_(Exception exc) {
        C51423a.m95790a((Throwable) exc);
        m72679d();
        mo62586a();
        mo62590b();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(Boolean bool) {
        C41472d dVar = this.f83905i;
        if (dVar != null && dVar.isShowing()) {
            dVar.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62587a(BaseResponse baseResponse) {
        Challenge challenge = this.f83897a;
        if (challenge == null) {
            C89219l.m154710a("mData");
        }
        challenge.setCollectStatus(this.f83901e ? 1 : 0);
        if (this.f83901e) {
            this.f83899c = true;
        }
        Challenge challenge2 = this.f83897a;
        if (challenge2 == null) {
            C89219l.m154710a("mData");
        }
        AbstractC81915c.m141874a(new C35501a(challenge2));
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62589a(String str) {
        if (str != null) {
            new C23144b(this.f83902f).mo37635a(str).mo37637b();
        }
    }

    /* renamed from: a */
    public final void mo62588a(Challenge challenge, C35583j jVar) {
        C89219l.m154721d(challenge, "");
        C89219l.m154721d(jVar, "");
        this.f83897a = challenge;
        this.f83898b = jVar;
        boolean z = true;
        if (challenge.getCollectStatus() != 1) {
            z = false;
        }
        this.f83901e = z;
        mo62586a();
        mo62590b();
    }

    public C35578i(View view, CheckableImageView checkableImageView, TextView textView, ChallengeDetailParam challengeDetailParam) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(checkableImageView, "");
        this.f83902f = view;
        this.f83906j = checkableImageView;
        this.f83907k = textView;
        this.f83903g = challengeDetailParam;
        C47426a aVar = new C47426a();
        this.f83904h = aVar;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.C35578i.View$OnClickListenerC355791 */

            /* renamed from: a */
            final /* synthetic */ C35578i f83908a;

            /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.i$1$a */
            final /* synthetic */ class C35581a implements AbstractC34543f {

                /* renamed from: a */
                private final /* synthetic */ AbstractC89171a f83909a;

                static {
                    Covode.recordClassIndex(42805);
                }

                C35581a(AbstractC89171a aVar) {
                    this.f83909a = aVar;
                }

                @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                /* renamed from: a */
                public final /* synthetic */ void mo57673a() {
                    C89219l.m154716b(this.f83909a.invoke(), "");
                }

                @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                /* renamed from: b */
                public final void mo57674b() {
                }
            }

            static {
                Covode.recordClassIndex(42803);
            }

            {
                this.f83908a = r1;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                ClickAgent.onClick(view);
                C35578i iVar = this.f83908a;
                if (iVar.f83901e) {
                    str = "cancel_favourite_challenge";
                } else {
                    str = "favourite_challenge";
                }
                C33744d a = new C33744d().mo59983a("enter_from", "challenge");
                Challenge challenge = iVar.f83897a;
                if (challenge == null) {
                    C89219l.m154710a("mData");
                }
                C33744d a2 = a.mo59983a("tag_id", challenge.getCid());
                Challenge challenge2 = iVar.f83897a;
                if (challenge2 == null) {
                    C89219l.m154710a("mData");
                }
                C33744d a3 = a2.mo59983a("challenge_id", challenge2.getCid());
                C35583j jVar = iVar.f83898b;
                if (jVar == null) {
                    C89219l.m154710a("mHeaderParam");
                }
                C33744d a4 = a3.mo59983a("process_id", jVar.f83915e);
                ChallengeDetailParam challengeDetailParam = iVar.f83903g;
                if (challengeDetailParam != null) {
                    str2 = challengeDetailParam.getParentTagId();
                } else {
                    str2 = null;
                }
                C39162r.m79460a(str, a4.mo59983a("parent_tag_id", str2).f79943a);
                C35583j jVar2 = iVar.f83898b;
                if (jVar2 == null) {
                    C89219l.m154710a("mHeaderParam");
                }
                boolean equals = TextUtils.equals(jVar2.f83914d, "search_result");
                C35583j jVar3 = iVar.f83898b;
                if (jVar3 == null) {
                    C89219l.m154710a("mHeaderParam");
                }
                boolean equals2 = TextUtils.equals(jVar3.f83914d, "general_search");
                if ((equals || equals2) && !iVar.f83901e) {
                    IChallengeDetailLegacyService a5 = ChallengeDetailLegacyServiceImpl.m72544a();
                    Challenge challenge3 = iVar.f83897a;
                    if (challenge3 == null) {
                        C89219l.m154710a("mData");
                    }
                    a5.mo57212a("search_favourite", "challenge", challenge3.getCid(), equals);
                }
                this.f83908a.f83899c = false;
                this.f83908a.f83900d = false;
                if (!C31575b.m65865g().isLogin()) {
                    C58957c.m108320a(C34729o.m70962d(this.f83908a.f83902f), "challenge", "click_favorite_challenge", (Bundle) null, new C35581a(new AbstractC89171a<C89391z>(this.f83908a) {
                        /* class com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.C35578i.View$OnClickListenerC355791.C355801 */

                        static {
                            Covode.recordClassIndex(42804);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            ((C35578i) this.receiver).mo62591c();
                            return C89391z.f203057a;
                        }
                    }));
                } else {
                    this.f83908a.mo62591c();
                }
            }
        });
        checkableImageView.setOnStateChangeListener(new CheckableImageView.AbstractC61078a(this) {
            /* class com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.C35578i.C355822 */

            /* renamed from: a */
            final /* synthetic */ C35578i f83910a;

            static {
                Covode.recordClassIndex(42806);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
            public final void bX_() {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f83910a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
            /* renamed from: a */
            public final void mo62594a(int i) {
                if (i == 1) {
                    this.f83910a.mo62586a();
                    this.f83910a.mo62590b();
                }
            }
        });
        aVar.mo67839a_(this);
        Activity d = C34729o.m70962d(view);
        Objects.requireNonNull(d, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        NextLiveData<Boolean> nextLiveData = ((DetailViewModel) C1181ae.m3881a((ActivityC0945e) d, (C1175ad.AbstractC1177b) null).mo3983a(DetailViewModel.class)).f96065a;
        Activity d2 = C34729o.m70962d(view);
        Objects.requireNonNull(d2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        nextLiveData.observe((ActivityC0945e) d2, this);
    }
}
