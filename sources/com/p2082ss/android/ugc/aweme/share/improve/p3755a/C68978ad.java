package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.C49926a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.share.base.C85162b;
import com.p2082ss.android.ugc.trill.share.base.C85177e;
import java.io.File;
import java.io.FileInputStream;
import p078c.p080b.C1756d;
import p078c.p080b.C1757e;
import p078c.p083d.C1762a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ad */
public final class C68978ad implements AbstractC69693h {

    /* renamed from: a */
    public final Aweme f154307a;

    /* renamed from: b */
    public final String f154308b;

    /* renamed from: c */
    private final int f154309c;

    static {
        Covode.recordClassIndex(81292);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fdy;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "save_no_watermark";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return 2131233794;
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
    /* renamed from: f */
    public final boolean mo61923f() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return 2131233807;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ad$a */
    public static final class C68979a extends C49926a {

        /* renamed from: a */
        final /* synthetic */ C68978ad f154310a;

        /* renamed from: b */
        final /* synthetic */ Context f154311b;

        static {
            Covode.recordClassIndex(81293);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.C49926a, com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
        /* renamed from: a */
        public final void mo84975a() {
            super.mo84975a();
            C39162r.m79460a("download_without_logo_status", new C33744d().mo59983a("download_result", "fail").mo59983a("group_id", this.f154310a.f154307a.getAid()).mo59983a("author_id", C59208ac.m108758a(this.f154310a.f154307a)).mo59983a("enter_from", this.f154310a.f154308b).f79943a);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.C49926a, com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b
        /* renamed from: a */
        public final void mo84976a(String str) {
            String str2;
            MethodCollector.m26663i(5915);
            C89219l.m154721d(str, "");
            C33744d dVar = new C33744d();
            if (TextUtils.isEmpty(str)) {
                str2 = "fail";
            } else {
                str2 = "success";
            }
            C39162r.m79460a("download_without_logo_status", dVar.mo59983a("download_result", str2).mo59983a("group_id", this.f154310a.f154307a.getAid()).mo59983a("author_id", C59208ac.m108758a(this.f154310a.f154307a)).mo59983a("enter_from", this.f154310a.f154308b).f79943a);
            if (TextUtils.isEmpty(str)) {
                MethodCollector.m26664o(5915);
                return;
            }
            Context b = mo84977b();
            if (b != null) {
                try {
                    Uri b2 = C1757e.m5905b(b, new File(str).getName());
                    if (b2 == null) {
                        b2 = C1757e.m5906b(b, new File(str).getName(), "video/mp4");
                        C1756d.m5894a(new FileInputStream(str), b.getContentResolver().openOutputStream(b2, "w"));
                    }
                    String a = C1762a.m5918a(b, b2);
                    if (a != null) {
                        C1757e.m5912c(b, a);
                    }
                    if (b2 != null && !C68909c.m121607b("download")) {
                        new C79459a(b).mo123050a(R.string.h7o).mo123053a();
                    }
                    MethodCollector.m26664o(5915);
                } catch (Exception unused) {
                    MethodCollector.m26664o(5915);
                }
            } else {
                MethodCollector.m26664o(5915);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68979a(C68978ad adVar, Context context, Context context2) {
            super(context2);
            this.f154310a = adVar;
            this.f154311b = context;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ad$b */
    static final class C68980b implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C68978ad f154312a;

        /* renamed from: b */
        final /* synthetic */ C85162b f154313b;

        /* renamed from: c */
        final /* synthetic */ Context f154314c;

        static {
            Covode.recordClassIndex(81294);
        }

        C68980b(C68978ad adVar, C85162b bVar, Context context) {
            this.f154312a = adVar;
            this.f154313b = bVar;
            this.f154314c = context;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            if (iArr != null && iArr.length != 0) {
                if (iArr[0] == 0) {
                    C68978ad.m121698a(this.f154313b, this.f154314c, this.f154312a.f154307a);
                    return;
                }
                Activity a = C69124b.m122223a(this.f154314c);
                if (a != null) {
                    ShareDependService.C68822a.m121324a().mo109328a(a);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        C39162r.m79460a("download_without_logo", new C33744d().mo59983a("action_type", "click").mo59983a("group_id", this.f154307a.getAid()).mo59983a("author_id", C59208ac.m108758a(this.f154307a)).mo59983a("enter_from", this.f154308b).f79943a);
        C85162b bVar = new C85162b(context, false, this.f154309c, "download_no_watermark");
        bVar.mo130085a(new C68979a(this, context, context));
        if (C80620e.m139781c(C69124b.m122223a(context)) == 0) {
            m121698a(bVar, context, this.f154307a);
        } else {
            C35444b.m72473a(C69124b.m122223a(context), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C68980b(this, bVar, context));
        }
    }

    /* renamed from: a */
    public static void m121698a(C85162b bVar, Context context, Aweme aweme) {
        if (C85177e.m146466b(context, aweme)) {
            bVar.mo130084a(aweme, "no_watermark", true);
        }
    }

    public C68978ad(Aweme aweme, String str, int i) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154307a = aweme;
        this.f154308b = str;
        this.f154309c = i;
    }
}
