package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34598e;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49748e;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.C49926a;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.C68900c;
import com.p2082ss.android.ugc.aweme.share.C69500w;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.share.p3767m.AbstractC69313f;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69585e;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69583c;
import com.p2082ss.android.ugc.aweme.sharer.C69653n;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.share.C85155a;
import com.p2082ss.android.ugc.trill.share.base.C85162b;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p078c.p080b.C1756d;
import p078c.p080b.C1757e;
import p078c.p083d.C1762a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.j */
public class C69070j implements AbstractC69693h {

    /* renamed from: h */
    public static final C69071a f154482h = new C69071a((byte) 0);

    /* renamed from: a */
    public final AbstractC49748e f154483a = new C69077e(this);

    /* renamed from: b */
    public boolean f154484b = true;

    /* renamed from: c */
    public Uri f154485c;

    /* renamed from: d */
    public final Activity f154486d;

    /* renamed from: e */
    public final Aweme f154487e;

    /* renamed from: f */
    public final String f154488f;

    /* renamed from: g */
    public final String f154489g;

    /* renamed from: i */
    private final String f154490i;

    static {
        Covode.recordClassIndex(81384);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "save";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_arrow_to_bottom;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return R.raw.icon_arrow_down_to_line;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$a */
    public static final class C69071a {
        static {
            Covode.recordClassIndex(81385);
        }

        private C69071a() {
        }

        public /* synthetic */ C69071a(byte b) {
            this();
        }
    }

    /* renamed from: h */
    private static boolean m122034h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$b */
    public static final class C69072b implements AbstractC69313f {

        /* renamed from: a */
        final /* synthetic */ C69070j f154491a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f154492b;

        /* renamed from: c */
        final /* synthetic */ String f154493c;

        static {
            Covode.recordClassIndex(81386);
        }

        @Override // com.p2082ss.android.ugc.aweme.share.p3767m.AbstractC69313f
        /* renamed from: b */
        public final void mo109541b() {
            C69500w.C69501a.m122716a(this.f154491a.f154487e.getAid(), this.f154491a.f154487e.getAuthorUid(), this.f154493c, this.f154491a.f154489g, "cancel");
        }

        @Override // com.p2082ss.android.ugc.aweme.share.p3767m.AbstractC69313f
        /* renamed from: a */
        public final void mo109540a() {
            this.f154491a.mo109539a(this.f154492b);
            C69500w.C69501a.m122716a(this.f154491a.f154487e.getAid(), this.f154491a.f154487e.getAuthorUid(), this.f154493c, this.f154491a.f154489g, "download");
        }

        C69072b(C69070j jVar, SharePackage sharePackage, String str) {
            this.f154491a = jVar;
            this.f154492b = sharePackage;
            this.f154493c = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$c */
    public static final class CallableC69073c<V> implements Callable {

        /* renamed from: a */
        public static final CallableC69073c f154494a = new CallableC69073c();

        static {
            Covode.recordClassIndex(81387);
        }

        CallableC69073c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (C58071d.m104915i()) {
                C34598e g = C34597d.m70640g();
                if (g.mo61048a("japan_share_download_dot", -1) != 1) {
                    g.mo61056b("japan_share_download_dot", 1);
                }
            }
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        if (!C68909c.m121606b() || !C68909c.m121605a()) {
            return R.string.fdv;
        }
        return R.string.buj;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShareInfo = this.f154487e.getAwemeACLShareInfo();
        if (awemeACLShareInfo == null || (downloadGeneral = awemeACLShareInfo.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$f */
    public static final class C69078f extends C49926a {

        /* renamed from: a */
        final /* synthetic */ C69070j f154501a;

        /* renamed from: b */
        final /* synthetic */ boolean f154502b;

        /* renamed from: c */
        final /* synthetic */ boolean f154503c = false;

        /* renamed from: d */
        final /* synthetic */ Aweme f154504d;

        /* renamed from: e */
        final /* synthetic */ String f154505e;

        /* renamed from: f */
        final /* synthetic */ Context f154506f;

        /* renamed from: g */
        final /* synthetic */ String f154507g;

        static {
            Covode.recordClassIndex(81392);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.C49926a, com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
        /* renamed from: a */
        public final void mo84975a() {
            super.mo84975a();
            if (this.f154503c) {
                C39162r.m79460a("download_without_logo_status", new C33744d().mo59983a("download_result", "fail").mo59983a("group_id", this.f154504d.getAid()).mo59983a("author_id", C59208ac.m108758a(this.f154504d)).mo59983a("enter_from", this.f154505e).f79943a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$f$a */
        static final class CallableC69079a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C69078f f154508a;

            /* renamed from: b */
            final /* synthetic */ String f154509b;

            static {
                Covode.recordClassIndex(81393);
            }

            CallableC69079a(C69078f fVar, String str) {
                this.f154508a = fVar;
                this.f154509b = str;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                MethodCollector.m26663i(3897);
                try {
                    this.f154508a.f154501a.f154485c = C1757e.m5905b(this.f154508a.f154506f, new File(this.f154509b).getName());
                    if (this.f154508a.f154501a.f154485c == null) {
                        this.f154508a.f154501a.f154485c = C1757e.m5906b(this.f154508a.f154506f, new File(this.f154509b).getName(), "video/mp4");
                        if (this.f154508a.f154501a.f154485c != null) {
                            ContentResolver contentResolver = this.f154508a.f154506f.getContentResolver();
                            Uri uri = this.f154508a.f154501a.f154485c;
                            if (uri == null) {
                                C89219l.m154715b();
                            }
                            C1756d.m5894a(new FileInputStream(this.f154509b), contentResolver.openOutputStream(uri, "w"));
                        }
                        String a = C1762a.m5918a(this.f154508a.f154506f, this.f154508a.f154501a.f154485c);
                        if (a != null) {
                            C1757e.m5912c(this.f154508a.f154506f, a);
                        }
                    }
                } catch (Exception e) {
                    this.f154508a.f154501a.f154484b = false;
                    C22708a.m42803a((Throwable) e, "open share video failed");
                }
                C89391z zVar = C89391z.f203057a;
                MethodCollector.m26664o(3897);
                return zVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$f$d */
        public static final class C69082d extends C69692g {

            /* renamed from: a */
            final /* synthetic */ C69078f f154512a;

            static {
                Covode.recordClassIndex(81396);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C69082d(C69078f fVar) {
                this.f154512a = fVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60845a(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                C51648a aVar = C51648a.f118980a;
                String str = this.f154512a.f154505e;
                C89219l.m154716b(str, "");
                aVar.mo87304a(3, str, "download", context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b, com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g
            /* renamed from: a */
            public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(context, "");
                C33744d a = new C33744d().mo59983a("group_id", this.f154512a.f154504d.getAid()).mo59983a("author_id", C59208ac.m108758a(this.f154512a.f154504d)).mo59983a("enter_from", this.f154512a.f154505e).mo59983a("is_downloaded_share_window", "1").mo59983a("platform", bVar.mo109548a()).mo59983a("share_form", "video_form");
                ShareInfo shareInfo = this.f154512a.f154504d.getShareInfo();
                C89219l.m154716b(shareInfo, "");
                String shareUrl = shareInfo.getShareUrl();
                if (shareUrl == null) {
                    shareUrl = this.f154512a.f154504d.getShareUrl();
                }
                C39162r.m79460a("share_video", a.mo59983a("share_url", shareUrl).mo59986a(C50560y.m94792b(FeedParamProvider.C49809a.m93270a(context).getPreviousPage(), FeedParamProvider.C49809a.m93270a(context).getFromGroupId())).f79943a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.C49926a, com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
        /* renamed from: a */
        public final void mo84976a(String str) {
            Context b;
            String str2;
            if (!this.f154502b) {
                boolean exists = new File(str).exists();
                C17867d.m33078a();
                if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132253e = C85155a.m146411a();
                }
                if (C58029j.f132253e) {
                    C33830n.m70668a("aweme_share_monitor", new C33743c().mo59976a("filePath", str).mo59976a("share_platform", "download").mo59976a("fileLength", String.valueOf(new File(str).length())).mo59976a("fileExist", String.valueOf(exists)).mo59977a());
                }
            }
            if (this.f154503c) {
                C33744d dVar = new C33744d();
                if (TextUtils.isEmpty(str)) {
                    str2 = "fail";
                } else {
                    str2 = "success";
                }
                C39162r.m79460a("download_without_logo_status", dVar.mo59983a("download_result", str2).mo59983a("group_id", this.f154504d.getAid()).mo59983a("author_id", C59208ac.m108758a(this.f154504d)).mo59983a("enter_from", this.f154505e).f79943a);
            }
            if (TextUtils.isEmpty(str) || (b = mo84977b()) == null) {
                return;
            }
            if (C80620e.m139781c(b) != 0) {
                C22708a.m42802a((Throwable) new IllegalStateException("try to download video, but no permission"));
            } else {
                C1731i.m5640b(new CallableC69079a(this, str), C1731i.f5562a).mo5534a(new C69080b(this), C1731i.f5564c, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$f$b */
        static final class C69080b<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ C69078f f154510a;

            static {
                Covode.recordClassIndex(81394);
            }

            C69080b(C69078f fVar) {
                this.f154510a = fVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1 A[Catch:{ Exception -> 0x0174 }] */
            @Override // p077b.AbstractC1729g
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object then(p077b.C1731i r13) {
                /*
                // Method dump skipped, instructions count: 381
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69070j.C69078f.C69080b.then(b.i):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$f$c */
        public static final class C69081c extends AbstractC69585e {

            /* renamed from: a */
            final /* synthetic */ AbstractC69581b f154511a;

            static {
                Covode.recordClassIndex(81395);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69081c(AbstractC69581b bVar, AbstractC69581b bVar2) {
                super(bVar2);
                this.f154511a = bVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
            /* renamed from: a */
            public final boolean mo61913a(AbstractC69645h hVar, Context context) {
                C89219l.m154721d(hVar, "");
                C89219l.m154721d(context, "");
                AbstractC69581b a = C69583c.m122807a("facebook_story", null);
                if (a == null || !(hVar instanceof C69653n) || !a.mo109557b(context)) {
                    return this.f154511a.mo61913a(hVar, context);
                }
                return a.mo61913a(hVar, context);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69078f(C69070j jVar, boolean z, boolean z2, Aweme aweme, String str, Context context, String str2, Context context2) {
            super(context2);
            this.f154501a = jVar;
            this.f154502b = z;
            this.f154504d = aweme;
            this.f154505e = str;
            this.f154506f = context;
            this.f154507g = str2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShareInfo = this.f154487e.getAwemeACLShareInfo();
        if (awemeACLShareInfo == null || (downloadGeneral = awemeACLShareInfo.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2 || !C58071d.m104915i() || C34597d.m70640g().mo61048a("japan_share_download_dot", -1) == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$e */
    static final class C69077e implements AbstractC49748e {

        /* renamed from: a */
        final /* synthetic */ C69070j f154500a;

        static {
            Covode.recordClassIndex(81391);
        }

        C69077e(C69070j jVar) {
            this.f154500a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49748e
        /* renamed from: g */
        public final String mo84304g(boolean z) {
            return this.f154500a.f154488f;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$d */
    public static final class C69074d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C69070j f154495a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f154496b;

        static {
            Covode.recordClassIndex(81388);
        }

        C69074d(C69070j jVar, SharePackage sharePackage) {
            this.f154495a = jVar;
            this.f154496b = sharePackage;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (!C80214ai.m139043a(iVar)) {
                return null;
            }
            final int i = this.f154496b.f155492i.getInt("page_type");
            C69011av.m121890a(this.f154495a.f154486d, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69070j.C69074d.C690751 */

                /* renamed from: a */
                final /* synthetic */ C69074d f154497a;

                static {
                    Covode.recordClassIndex(81389);
                }

                {
                    this.f154497a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    ExecutorC34605m.f81660a.mo61064a(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69070j.C69074d.C690751.RunnableC690761 */

                        /* renamed from: a */
                        final /* synthetic */ C690751 f154499a;

                        static {
                            Covode.recordClassIndex(81390);
                        }

                        {
                            this.f154499a = r1;
                        }

                        public final void run() {
                            boolean z;
                            boolean z2;
                            C69070j jVar = this.f154499a.f154497a.f154495a;
                            Aweme aweme = this.f154499a.f154497a.f154495a.f154487e;
                            Activity activity = this.f154499a.f154497a.f154495a.f154486d;
                            int i = i;
                            String str = this.f154499a.f154497a.f154495a.f154488f;
                            Aweme aweme2 = this.f154499a.f154497a.f154495a.f154487e;
                            C89219l.m154721d(aweme2, "");
                            SharePrefCache inst = SharePrefCache.inst();
                            C89219l.m154716b(inst, "");
                            C33594aj<Boolean> isPrivateAvailable = inst.getIsPrivateAvailable();
                            C89219l.m154716b(isPrivateAvailable, "");
                            Boolean c = isPrivateAvailable.mo59941c();
                            boolean d = C80636z.m139819d(aweme2);
                            if (aweme2.getAuthor() != null) {
                                IAccountUserService g = C31575b.m65865g();
                                C89219l.m154716b(g, "");
                                String curUserId = g.getCurUserId();
                                User author = aweme2.getAuthor();
                                C89219l.m154716b(author, "");
                                if (C13627m.m24499a(curUserId, author.getUid())) {
                                    z = true;
                                    C89219l.m154716b(c, "");
                                    if (c.booleanValue() || !d || !z) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    jVar.mo109538a(aweme, activity, i, str, z2);
                                }
                            }
                            z = false;
                            C89219l.m154716b(c, "");
                            if (c.booleanValue()) {
                            }
                            z2 = false;
                            jVar.mo109538a(aweme, activity, i, str, z2);
                        }
                    }, 500);
                    return C89391z.f203057a;
                }
            });
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    /* renamed from: a */
    private static Integer m122033a(Aweme aweme) {
        ACLCommonShare downloadGeneral;
        ACLCommonShare downloadMaskPanel;
        if (C89219l.m154714a((Object) C68900c.f154110a, (Object) "long_press_download")) {
            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            if (awemeACLShareInfo == null || (downloadMaskPanel = awemeACLShareInfo.getDownloadMaskPanel()) == null) {
                return null;
            }
            return Integer.valueOf(downloadMaskPanel.getCode());
        }
        AwemeACLShare awemeACLShareInfo2 = aweme.getAwemeACLShareInfo();
        if (awemeACLShareInfo2 == null || (downloadGeneral = awemeACLShareInfo2.getDownloadGeneral()) == null) {
            return null;
        }
        return Integer.valueOf(downloadGeneral.getCode());
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    /* renamed from: a */
    public final void mo109539a(SharePackage sharePackage) {
        Integer a = m122033a(this.f154487e);
        if (a != null && a.intValue() == 0) {
            C1731i.m5640b(CallableC69073c.f154494a, C1731i.f5562a).mo5534a(new C69074d(this, sharePackage), C1731i.f5564c, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ee  */
    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61915a(android.content.Context r6, com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage r7) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69070j.mo61915a(android.content.Context, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }

    public C69070j(Activity activity, Aweme aweme, String str, String str2, String str3) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f154486d = activity;
        this.f154487e = aweme;
        this.f154488f = str;
        this.f154489g = str2;
        this.f154490i = str3;
    }

    /* renamed from: a */
    public final void mo109538a(Aweme aweme, Context context, int i, String str, boolean z) {
        String str2;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C68909c.m121604a(str);
        C68909c.f154162j = i;
        AbstractC49748e eVar = this.f154483a;
        if (eVar != null) {
            str2 = eVar.mo84304g(true);
        } else {
            str2 = str;
        }
        C85162b bVar = new C85162b(context, false, i, "download");
        C89219l.m154716b(str2, "");
        bVar.mo130086a(str2);
        bVar.mo130089b(this.f154489g);
        bVar.mo130091c(this.f154490i);
        bVar.mo130085a(new C69078f(this, z, false, aweme, str2, context, str, context));
        C68900c.m121589a(str, aweme);
        bVar.mo130084a(aweme, "download_action", false);
    }
}
