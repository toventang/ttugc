package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.qrcode.view.ProgressDialogC66468a;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69123a;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69320l;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.g */
public final class C69050g extends C69037c {

    /* renamed from: c */
    public final Aweme f154446c;

    /* renamed from: d */
    public final String f154447d;

    /* renamed from: e */
    public final boolean f154448e;

    /* renamed from: f */
    public final int f154449f;

    /* renamed from: g */
    public final PrivacyCert f154450g;

    /* renamed from: h */
    private final String f154451h;

    static {
        Covode.recordClassIndex(81364);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69037c, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        return this.f154446c.getAwemeControl().canShare();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.g$a */
    static final class CallableC69051a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C69050g f154452a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f154453b;

        static {
            Covode.recordClassIndex(81365);
        }

        CallableC69051a(C69050g gVar, SharePackage sharePackage) {
            this.f154452a = gVar;
            this.f154453b = sharePackage;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String replaceAll;
            String str = this.f154453b.f155487d;
            ShareInfo shareInfo = this.f154452a.f154446c.getShareInfo();
            if (shareInfo == null) {
                return "";
            }
            String shareUrl = shareInfo.getShareUrl();
            if (TextUtils.isEmpty(shareUrl) || shareUrl.contains("utm_source")) {
                replaceAll = shareUrl.replaceAll("utm_source=\\w*_?\\w?", "utm_source=".concat("copy_link"));
            } else {
                C29844g gVar = new C29844g(shareUrl);
                gVar.mo52130a("utm_source", "copy_link");
                gVar.mo52130a("utm_campaign", "client_share");
                gVar.mo52130a("utm_medium", "android");
                gVar.mo52130a("app", "tiktok");
                gVar.mo52130a("iid", AppLog.getInstallId());
                replaceAll = gVar.mo52126a();
            }
            shareInfo.setShareUrl(replaceAll);
            String shareUrl2 = shareInfo.getShareUrl();
            if (C80580in.m139687c()) {
                return shareUrl2;
            }
            return C69320l.m122518a(str, "copy_link", shareUrl2).cL_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.g$b */
    static final class C69052b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C69050g f154454a;

        /* renamed from: b */
        final /* synthetic */ ProgressDialogC66468a f154455b;

        /* renamed from: c */
        final /* synthetic */ Context f154456c;

        static {
            Covode.recordClassIndex(81366);
        }

        C69052b(C69050g gVar, ProgressDialogC66468a aVar, Context context) {
            this.f154454a = gVar;
            this.f154455b = aVar;
            this.f154456c = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            ProgressDialogC66468a aVar = this.f154455b;
            if (aVar != null) {
                aVar.dismiss();
            }
            if (this.f154454a.f154447d.length() != 0) {
                str = this.f154454a.f154447d + ' ' + str;
            }
            C69050g gVar = this.f154454a;
            C89219l.m154716b(str, "");
            gVar.mo109523a(str, this.f154456c, this.f154454a.f154450g);
            if (!this.f154454a.f154448e) {
                new C79459a(this.f154456c).mo123050a(this.f154454a.f154449f).mo123053a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69037c, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        Aweme aweme;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (!C69123a.m122222a(this, context, this.f154446c, this.f154451h) || !this.f154446c.getAwemeControl().canShare()) {
            return;
        }
        if ((this.f154446c.getAwemeType() != 13 || C69011av.m121895a(this.f154446c, context)) && (aweme = this.f154446c) != null && aweme.getShareInfo() != null) {
            C89219l.m154721d(this.f154446c, "");
            ProgressDialogC66468a a = ProgressDialogC66468a.m118220a(context, context.getResources().getString(R.string.bde));
            a.mo105414a();
            AbstractC88924h.m154136a((Callable) new CallableC69051a(this, sharePackage)).mo143204b(C88925a.m154180b(C88946a.f201991c)).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143202b(new C69052b(this, a, context));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C69050g(Aweme aweme, String str, String str2, boolean z, int i, PrivacyCert privacyCert) {
        super(str, false);
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(privacyCert, "");
        this.f154446c = aweme;
        this.f154451h = str;
        this.f154447d = str2;
        this.f154448e = z;
        this.f154449f = i;
        this.f154450g = privacyCert;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C69050g(com.p2082ss.android.ugc.aweme.feed.model.Aweme r8, java.lang.String r9, java.lang.String r10, boolean r11, int r12, com.bytedance.bpea.basics.PrivacyCert r13, int r14) {
        /*
            r7 = this;
            r2 = r9
            r4 = r11
            r5 = r12
            r0 = r14 & 2
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x000a
            r2 = r3
        L_0x000a:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0025
        L_0x000e:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0014
            r0 = 0
            r4 = 0
        L_0x0014:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x001e
            r0 = 2131822759(0x7f1108a7, float:1.9278298E38)
            r5 = 2131822759(0x7f1108a7, float:1.9278298E38)
        L_0x001e:
            r0 = r7
            r1 = r8
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0025:
            r3 = r10
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69050g.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean, int, com.bytedance.bpea.basics.PrivacyCert, int):void");
    }
}
