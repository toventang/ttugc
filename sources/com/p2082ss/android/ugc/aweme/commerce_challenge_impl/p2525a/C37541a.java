package com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2525a;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2522a.AbstractC37537a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2523b.C37538a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2526b.C37549a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.view.CommerceRemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.p2082ss.android.ugc.aweme.discover.model.CommerceChallengeBanner;
import com.p2082ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.a.a */
public final class C37541a implements AbstractC37540a {

    /* renamed from: e */
    public static final C37542a f88711e = new C37542a((byte) 0);

    /* renamed from: a */
    public CommerceRemoteImageView f88712a;

    /* renamed from: b */
    public Context f88713b;

    /* renamed from: c */
    C37538a f88714c;

    /* renamed from: d */
    public Challenge f88715d;

    /* renamed from: f */
    private View f88716f;

    /* renamed from: g */
    private CheckableImageView f88717g;

    /* renamed from: h */
    private TextView f88718h;

    /* renamed from: i */
    private ViewStub f88719i;

    /* renamed from: j */
    private TextView f88720j;

    /* renamed from: k */
    private View f88721k;

    /* renamed from: l */
    private ViewStub f88722l;

    /* renamed from: m */
    private View f88723m;

    /* renamed from: n */
    private TextView f88724n;

    /* renamed from: o */
    private View f88725o;

    /* renamed from: p */
    private TextView f88726p;

    /* renamed from: q */
    private ViewStub f88727q;

    /* renamed from: r */
    private View f88728r;

    /* renamed from: s */
    private TextView f88729s;

    /* renamed from: t */
    private ViewStub f88730t;

    /* renamed from: u */
    private View f88731u;

    /* renamed from: v */
    private TextView f88732v;

    /* renamed from: w */
    private String f88733w;

    /* renamed from: x */
    private List<? extends Aweme> f88734x;

    static {
        Covode.recordClassIndex(44938);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.a.a$a */
    public static final class C37542a {
        static {
            Covode.recordClassIndex(44939);
        }

        private C37542a() {
        }

        public /* synthetic */ C37542a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m75713a(Challenge challenge) {
            if (challenge == null || TextUtils.isEmpty(challenge.getLinkText()) || TextUtils.isEmpty(challenge.getLinkAction())) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static boolean m75714b(Challenge challenge) {
            if (challenge == null || TextUtils.isEmpty(challenge.getRuleDetailDesc()) || TextUtils.isEmpty(challenge.getRuleDetailDesc())) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public static String m75715c(Challenge challenge) {
            C89219l.m154721d(challenge, "");
            if (!m75716d(challenge)) {
                return "";
            }
            ChallengeDisclaimer challengeDisclaimer = challenge.getChallengeDisclaimer();
            C89219l.m154716b(challengeDisclaimer, "");
            String content = challengeDisclaimer.getContent();
            C89219l.m154716b(content, "");
            return content;
        }

        /* renamed from: d */
        public static boolean m75716d(Challenge challenge) {
            ChallengeDisclaimer challengeDisclaimer;
            if (challenge != null && (challengeDisclaimer = challenge.getChallengeDisclaimer()) != null && !TextUtils.isEmpty(challengeDisclaimer.getTitle()) && !TextUtils.isEmpty(challengeDisclaimer.getContent())) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static String m75711a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (str.length() != 0) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("bundle_webview_background", str2).build().toString();
            }
            C89219l.m154716b(str, "");
            return str;
        }

        /* renamed from: a */
        public static String m75712a(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (str.length() != 0) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("commerce_enter_from", str2).appendQueryParameter("challenge_id", str3).build().toString();
            }
            C89219l.m154716b(str, "");
            return str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a
    /* renamed from: a */
    public final void mo65366a(View view) {
        this.f88716f = view;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.a.a$b */
    public static final class C37543b extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C37541a f88735a;

        static {
            Covode.recordClassIndex(44940);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37543b(C37541a aVar) {
            this.f88735a = aVar;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onIntermediateImageFailed(String str, Throwable th) {
            super.onIntermediateImageFailed(str, th);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
            AbstractC24457f fVar2 = fVar;
            CommerceRemoteImageView commerceRemoteImageView = this.f88735a.f88712a;
            if (commerceRemoteImageView != null) {
                commerceRemoteImageView.mo65407b(fVar2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            AbstractC24457f fVar2 = fVar;
            CommerceRemoteImageView commerceRemoteImageView = this.f88735a.f88712a;
            if (commerceRemoteImageView != null) {
                commerceRemoteImageView.mo65407b(fVar2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a
    /* renamed from: a */
    public final void mo65369a(TextView textView) {
        this.f88718h = textView;
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m75696a(C37541a aVar) {
        Context context = aVar.f88713b;
        if (context == null) {
            C89219l.m154710a("mContext");
        }
        return context;
    }

    /* renamed from: b */
    public static final /* synthetic */ Challenge m75698b(C37541a aVar) {
        Challenge challenge = aVar.f88715d;
        if (challenge == null) {
            C89219l.m154710a("mChallenge");
        }
        return challenge;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a
    /* renamed from: c */
    public final void mo65373c(ViewStub viewStub) {
        this.f88727q = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.mv);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a
    /* renamed from: d */
    public final void mo65374d(ViewStub viewStub) {
        this.f88730t = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.mu);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a
    /* renamed from: a */
    public final void mo65365a(float f) {
        boolean z;
        TextView textView = this.f88724n;
        if (textView != null) {
            if (((double) f) <= 0.9d) {
                z = true;
            } else {
                z = false;
            }
            textView.setClickable(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a
    /* renamed from: b */
    public final void mo65372b(ViewStub viewStub) {
        this.f88722l = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.mt);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.a.a$f */
    static final class View$OnClickListenerC37547f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37541a f88740a;

        static {
            Covode.recordClassIndex(44944);
        }

        View$OnClickListenerC37547f(C37541a aVar) {
            this.f88740a = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            AbstractC37537a a = C37549a.m75717a();
            if (a != null) {
                Context a2 = C37541a.m75696a(this.f88740a);
                HTCMissionModule htcMissionModule = C37541a.m75698b(this.f88740a).getHtcMissionModule();
                if (htcMissionModule != null) {
                    str = htcMissionModule.getOpenUrl();
                } else {
                    str = null;
                }
                a.mo65361a(a2, str, false);
            }
            C37541a.m75697a(C37541a.m75698b(this.f88740a).getHtcMissionModule(), false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a
    /* renamed from: a */
    public final void mo65367a(ViewStub viewStub) {
        this.f88719i = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.n1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.a.a$c */
    static final class View$OnClickListenerC37544c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37541a f88736a;

        /* renamed from: b */
        final /* synthetic */ CommerceChallengeBanner f88737b;

        static {
            Covode.recordClassIndex(44941);
        }

        View$OnClickListenerC37544c(C37541a aVar, CommerceChallengeBanner commerceChallengeBanner) {
            this.f88736a = aVar;
            this.f88737b = commerceChallengeBanner;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88736a.mo65397a("banner_click");
            AbstractC37537a a = C37549a.m75717a();
            if (a == null) {
                C89219l.m154715b();
            }
            if (!a.mo65361a(C37541a.m75696a(this.f88736a), this.f88737b.getOpenUrl(), false)) {
                AbstractC37537a a2 = C37549a.m75717a();
                if (a2 == null) {
                    C89219l.m154715b();
                }
                a2.mo65360a(C37541a.m75696a(this.f88736a), C37542a.m75712a(this.f88737b.getWebUrl(), "challenge_banner", C37541a.m75698b(this.f88736a).getCid()), "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.a.a$d */
    static final class View$OnClickListenerC37545d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37541a f88738a;

        static {
            Covode.recordClassIndex(44942);
        }

        View$OnClickListenerC37545d(C37541a aVar) {
            this.f88738a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("click_contest_page", new C33744d().mo59983a("tag_id", C37541a.m75698b(this.f88738a).getCid()).mo59983a("page_type", "challenge").mo59983a("enter_from", "challenge").f79943a);
            AbstractC37537a a = C37549a.m75717a();
            if (a != null) {
                Context a2 = C37541a.m75696a(this.f88738a);
                Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                a.mo65356a((ActivityC0945e) a2);
            }
        }
    }

    /* renamed from: b */
    public final void mo65398b(String str) {
        String str2;
        MobClick labelName = MobClick.obtain().setEventName(str).setLabelName("challenge");
        Challenge challenge = this.f88715d;
        if (challenge == null) {
            C89219l.m154710a("mChallenge");
        }
        C39162r.onEvent(labelName.setValue(challenge.getCid()).setJsonObject(new C33743c().mo59976a("link_type", "web_link").mo59977a()));
        Challenge challenge2 = this.f88715d;
        if (challenge2 == null) {
            C89219l.m154710a("mChallenge");
        }
        User author = challenge2.getAuthor();
        if (author != null) {
            str2 = author.getUid();
        } else {
            str2 = "";
        }
        C33744d a = new C33744d().mo59983a("author_id", str2);
        Challenge challenge3 = this.f88715d;
        if (challenge3 == null) {
            C89219l.m154710a("mChallenge");
        }
        C39162r.m79460a(str, a.mo59983a("tag_id", challenge3.getCid()).mo59983a("link_type", "web_link").mo59983a("enter_from", "challenge").f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.a.a$e */
    static final class View$OnClickListenerC37546e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37541a f88739a;

        static {
            Covode.recordClassIndex(44943);
        }

        View$OnClickListenerC37546e(C37541a aVar) {
            this.f88739a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88739a.mo65398b("click_link");
            AbstractC37537a a = C37549a.m75717a();
            if (a != null) {
                a.mo65358a("click_link", C37541a.m75698b(this.f88739a).getCid());
            }
            if (C37541a.m75698b(this.f88739a).isLinkActionAsOpenUrl()) {
                AbstractC37537a a2 = C37549a.m75717a();
                if (a2 != null) {
                    Context a3 = C37541a.m75696a(this.f88739a);
                    String linkAction = C37541a.m75698b(this.f88739a).getLinkAction();
                    C89219l.m154716b(linkAction, "");
                    a2.mo65361a(a3, C89361p.m154869a(linkAction, "aweme://", "sslocal://", false), true);
                    return;
                }
                return;
            }
            AbstractC37537a a4 = C37549a.m75717a();
            if (a4 != null) {
                Context a5 = C37541a.m75696a(this.f88739a);
                String linkAction2 = C37541a.m75698b(this.f88739a).getLinkAction();
                C89219l.m154716b(linkAction2, "");
                a4.mo65360a(a5, C37542a.m75712a(C37542a.m75711a(linkAction2, "ffffff"), "challenge_link", C37541a.m75698b(this.f88739a).getCid()), C37541a.m75698b(this.f88739a).getLinkTitle());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.a.a$g */
    static final class View$OnClickListenerC37548g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37541a f88741a;

        /* renamed from: b */
        final /* synthetic */ String f88742b;

        /* renamed from: c */
        final /* synthetic */ String f88743c;

        static {
            Covode.recordClassIndex(44945);
        }

        View$OnClickListenerC37548g(C37541a aVar, String str, String str2) {
            this.f88741a = aVar;
            this.f88742b = str;
            this.f88743c = str2;
        }

        public final void onClick(View view) {
            AbstractC37537a a;
            ClickAgent.onClick(view);
            AbstractC37537a a2 = C37549a.m75717a();
            if ((a2 == null || !a2.mo65359a(C37541a.m75696a(this.f88741a), this.f88742b)) && ((a = C37549a.m75717a()) == null || !a.mo65361a(C37541a.m75696a(this.f88741a), this.f88742b, true))) {
                AbstractC37537a a3 = C37549a.m75717a();
                if (a3 != null) {
                    Context a4 = C37541a.m75696a(this.f88741a);
                    String str = this.f88743c;
                    C89219l.m154716b(str, "");
                    if (!a3.mo65360a(a4, C37542a.m75712a(C37542a.m75711a(str, "ffffff"), "challenge_transform_button", C37541a.m75698b(this.f88741a).getCid()), "")) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C37541a aVar = this.f88741a;
            C33744d dVar = new C33744d();
            Challenge challenge = aVar.f88715d;
            if (challenge == null) {
                C89219l.m154710a("mChallenge");
            }
            C33744d a5 = dVar.mo59983a("tag_id", challenge.getCid());
            C37538a aVar2 = aVar.f88714c;
            if (aVar2 == null) {
                C89219l.m154710a("mHeaderParam");
            }
            C39162r.m79460a("click_variable_button", a5.mo59983a("enter_from", aVar2.f88707b).mo59983a("page_type", "challenge").f79943a);
            AbstractC37537a a6 = C37549a.m75717a();
            if (a6 != null) {
                Challenge challenge2 = aVar.f88715d;
                if (challenge2 == null) {
                    C89219l.m154710a("mChallenge");
                }
                a6.mo65358a("click_variable_button", challenge2.getCid());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a
    /* renamed from: a */
    public final void mo65371a(CheckableImageView checkableImageView) {
        this.f88717g = checkableImageView;
    }

    /* renamed from: a */
    public final void mo65397a(String str) {
        C33744d dVar = new C33744d();
        Challenge challenge = this.f88715d;
        if (challenge == null) {
            C89219l.m154710a("mChallenge");
        }
        C39162r.m79460a(str, dVar.mo59983a("tag_id", challenge.getCid()).mo59983a("enter_from", "challenge").f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a
    /* renamed from: a */
    public final void mo65368a(FrameLayout frameLayout, C37538a aVar) {
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(aVar, "");
        Context context = frameLayout.getContext();
        C89219l.m154716b(context, "");
        this.f88713b = context;
        this.f88714c = aVar;
    }

    /* renamed from: a */
    public static void m75697a(HTCMissionModule hTCMissionModule, boolean z) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        Integer num;
        TcmConfig i;
        User a;
        if (z) {
            str = "mission_label_show";
        } else {
            str = "mission_label_click";
        }
        C33744d dVar = new C33744d();
        Integer num2 = null;
        if (hTCMissionModule != null) {
            str2 = hTCMissionModule.getMissionId();
        } else {
            str2 = null;
        }
        C33744d a2 = dVar.mo59983a("mission_id", str2);
        if (hTCMissionModule != null) {
            bool = hTCMissionModule.isEligibleUser();
        } else {
            bool = null;
        }
        String str4 = "0";
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            str3 = "1";
        } else {
            str3 = str4;
        }
        C33744d a3 = a2.mo59983a("eligibility", str3);
        if (hTCMissionModule != null) {
            num = hTCMissionModule.getMissionLabelType();
        } else {
            num = null;
        }
        C33744d a4 = a3.mo59982a("status", num).mo59983a("current_page", "1");
        AbstractC37537a a5 = C37549a.m75717a();
        if (!(a5 == null || (a = a5.mo65355a()) == null)) {
            num2 = Integer.valueOf(a.getFollowerCount());
        }
        C33744d a6 = a4.mo59982a("creator_followers", num2);
        ITcmService j = TcmServiceImpl.m135859j();
        if (j == null || (i = j.mo121266i()) == null || !i.isTcmCreator()) {
            str4 = "1";
        }
        C39162r.m79460a(str, a6.mo59983a("creator_type", str4).f79943a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v68, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2524c.AbstractC37540a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65370a(com.p2082ss.android.ugc.aweme.discover.model.Challenge r13, java.lang.String r14, java.util.List<? extends com.p2082ss.android.ugc.aweme.feed.model.Aweme> r15) {
        /*
        // Method dump skipped, instructions count: 946
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2525a.C37541a.mo65370a(com.ss.android.ugc.aweme.discover.model.Challenge, java.lang.String, java.util.List):void");
    }
}
