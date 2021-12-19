package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Application;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.android.ecommerce.p159e.C2773a;
import com.bytedance.android.ecommerce.p163i.AbstractC2801b;
import com.bytedance.android.ecommerce.p164j.AbstractC2813k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.router.SmartRouter;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ag */
public final class C68984ag implements AbstractC69693h {

    /* renamed from: b */
    public static final C68985a f154318b = new C68985a((byte) 0);

    /* renamed from: a */
    public final Aweme f154319a;

    /* renamed from: c */
    private final String f154320c;

    /* renamed from: d */
    private final Integer f154321d;

    static {
        Covode.recordClassIndex(81298);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.ex6;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "promote";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_fire;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return R.drawable.bis;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ag$a */
    public static final class C68985a {
        static {
            Covode.recordClassIndex(81299);
        }

        private C68985a() {
        }

        public /* synthetic */ C68985a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        if (this.f154319a.getHasPromoteEntry() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ag$b */
    public static final class C68986b implements AbstractC27645k<PromoteEntryCheck> {

        /* renamed from: a */
        final /* synthetic */ C68984ag f154322a;

        /* renamed from: b */
        final /* synthetic */ Context f154323b;

        /* renamed from: c */
        final /* synthetic */ String f154324c;

        static {
            Covode.recordClassIndex(81300);
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
            C89219l.m154721d(th, "");
            new C79459a(this.f154323b).mo123050a(R.string.dck).mo123053a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
            if (r9 != null) goto L_0x007f;
         */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onSuccess(com.p2082ss.android.ugc.aweme.feed.model.PromoteEntryCheck r9) {
            /*
            // Method dump skipped, instructions count: 195
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68984ag.C68986b.onSuccess(java.lang.Object):void");
        }

        C68986b(C68984ag agVar, Context context, String str) {
            this.f154322a = agVar;
            this.f154323b = context;
            this.f154324c = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ag$d */
    static final class C68988d implements AbstractC2813k {

        /* renamed from: a */
        final /* synthetic */ Context f154326a;

        static {
            Covode.recordClassIndex(81302);
        }

        C68988d(Context context) {
            this.f154326a = context;
        }

        @Override // com.bytedance.android.ecommerce.p164j.AbstractC2813k
        /* renamed from: a */
        public final void mo7407a(String str) {
            C89219l.m154716b(str, "");
            if (!C89361p.m154874b(str, "aweme://webview/", false)) {
                SmartRouter.buildRoute(this.f154326a, "aweme://webview/").withParam("url", str).open();
            } else {
                SmartRouter.buildRoute(this.f154326a, str).open();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        MethodCollector.m26663i(6073);
        C89219l.m154721d(imageView, "");
        Integer num = this.f154321d;
        if (num != null) {
            imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), num.intValue()));
            MethodCollector.m26664o(6073);
            return;
        }
        MethodCollector.m26664o(6073);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ag$c */
    static final class C68987c implements AbstractC2801b {

        /* renamed from: a */
        public static final C68987c f154325a = new C68987c();

        static {
            Covode.recordClassIndex(81301);
        }

        C68987c() {
        }

        @Override // com.bytedance.android.ecommerce.p163i.AbstractC2801b
        /* renamed from: a */
        public final void mo7380a(String str, JSONObject jSONObject) {
            C39162r.m79461a(str, jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (!mo61923f()) {
            Application a = C17879g.m33104a();
            C89219l.m154716b(a, "");
            Context applicationContext = a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            new C79459a(applicationContext).mo123052a(this.f154319a.getPromoteToast()).mo123053a();
        } else {
            C2773a.C2774a aVar = new C2773a.C2774a(C17879g.m33104a());
            aVar.f8345l = C68987c.f154325a;
            aVar.f8350q = new C68988d(context);
            aVar.f8335b = "https://fp22-normal-useast1a.tiktokv.com";
            C2773a a2 = aVar.mo7355a();
            C89219l.m154716b(a2, "");
            C2732a.f8145a.mo7360a(a2);
            ShareDependService a3 = ShareDependService.C68822a.m121324a();
            String aid = this.f154319a.getAid();
            C89219l.m154716b(aid, "");
            C27646l.m55298a(a3.mo109322a(aid, "video"), new C68986b(this, context, "video"), ExecutorC34605m.f81660a);
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        int accountType = curUser.getAccountType();
        int i = 0;
        if (curUser.getCommerceUserInfo() != null) {
            i = curUser.getCommerceUserInfo().getPromotePayType();
        }
        C33744d dVar = new C33744d();
        dVar.mo59983a("group_id", this.f154319a.getAid()).mo59980a("user_account_type", accountType).mo59980a("promote_version", i).mo59980a("video_status", mo61923f() ? 1 : 0);
        if (!mo61923f()) {
            dVar.mo59983a("unavailable_reason", this.f154319a.getPromoteToastKey());
        }
        C39162r.m79460a("Promote_video_entrance_click", dVar.f79943a);
    }

    public C68984ag(Aweme aweme, String str, Integer num) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154319a = aweme;
        this.f154320c = str;
        this.f154321d = num;
    }
}
