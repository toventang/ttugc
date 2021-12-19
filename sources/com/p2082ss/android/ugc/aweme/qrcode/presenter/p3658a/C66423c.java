package com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.anywheredoor_api.p2121b.C29731a;
import com.p2082ss.android.anywheredoor_api.service.IAnyDoorService;
import com.p2082ss.android.ugc.aweme.CQrcodeService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3444a.C59311a;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3444a.C59313b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import com.p2082ss.android.ugc.aweme.p2759di.CommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66376a;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66378b;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66379c;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66381e;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66382f;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66384g;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66385h;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66386i;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66387j;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66388k;
import com.p2082ss.android.ugc.aweme.qrcode.p3656e.C66400b;
import com.p2082ss.android.ugc.aweme.qrcode.p3656e.C66401c;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66449b;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66451d;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66421b;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66446m;
import com.p2082ss.android.ugc.aweme.service.IEtDebugService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.c */
public final class C66423c implements C66421b.AbstractC66422a, AbstractC66449b {

    /* renamed from: a */
    ActivityC17312a f149326a;

    /* renamed from: b */
    public AbstractC66451d f149327b;

    /* renamed from: c */
    public boolean f149328c;

    /* renamed from: d */
    public String f149329d;

    /* renamed from: e */
    public boolean f149330e;

    /* renamed from: f */
    C66421b f149331f;

    /* renamed from: g */
    public C66435h f149332g = new C66435h();

    /* renamed from: h */
    boolean f149333h;

    /* renamed from: i */
    public boolean f149334i;

    /* renamed from: j */
    boolean f149335j;

    /* renamed from: k */
    QrCodeScanService f149336k = QrCodeScanImpl.m118122b();

    /* renamed from: l */
    List<AbstractC66380d> f149337l;

    /* renamed from: m */
    List<AbstractC66380d> f149338m;

    /* renamed from: n */
    private C66445l f149339n = new C66445l();

    static {
        Covode.recordClassIndex(77957);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66450c
    /* renamed from: a */
    public final void mo105352a(final boolean z, final int i, final String str, final int i2) {
        IAnyDoorService a;
        if (!this.f149326a.isDestroyed()) {
            IEtDebugService iEtDebugService = (IEtDebugService) ServiceManager.get().getService(IEtDebugService.class);
            if (i2 == 2) {
                iEtDebugService.mo106967a(str, this.f149326a);
            } else if (!C58939a.m108263a() || (a = C29731a.m59910a()) == null || !a.interceptScanResult(this.f149326a, str)) {
                if (CQrcodeService.m65222b().mo57031a()) {
                    String a2 = C66401c.m118095a(str) ? C66400b.m118092a(str) : str;
                    if (!TextUtils.isEmpty(a2) && a2.contains("tt_deeplink:")) {
                        if (CommerceServiceImpl.m83407a().mo60112a((Context) this.f149326a, a2.replace("tt_deeplink:", ""), false)) {
                            C39162r.onEventV3("deeplink_preview_success");
                            return;
                        }
                        C39162r.onEventV3("deeplink_preview_error_toast_show");
                        CQrcodeService.m65222b().mo57030a(this.f149326a);
                        this.f149326a.finish();
                        return;
                    }
                }
                this.f149328c = z;
                if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132253e = m118150c();
                }
                if (!C58029j.f132253e) {
                    new C23144b(this.f149326a).mo37640e(R.string.dcq).mo37637b();
                    return;
                }
                C59311a.C59312a aVar = new C59311a.C59312a();
                aVar.f135523a = "qrCode";
                aVar.f135525c = str;
                C59311a a3 = aVar.mo96909a();
                C59313b bVar = new C59313b();
                bVar.f135527a = a3;
                AbstractC81915c.m141874a(bVar);
                C1731i.m5640b(new Callable<String>() {
                    /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66423c.CallableC664274 */

                    static {
                        Covode.recordClassIndex(77961);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ String call() {
                        C66423c.this.f149327b.mo105372d();
                        return null;
                    }
                }, C1731i.f5564c).mo5534a(new AbstractC1729g<String, C66430a>() {
                    /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66423c.C664263 */

                    static {
                        Covode.recordClassIndex(77960);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                    @Override // p077b.AbstractC1729g
                    public final /* synthetic */ C66430a then(C1731i<String> iVar) {
                        String str = str;
                        if (C66401c.m118095a(str)) {
                            str = C66400b.m118092a(str);
                        }
                        return new C66430a(str);
                    }
                }, C1731i.f5562a, null).mo5534a(new AbstractC1729g<C66430a, String>() {
                    /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66423c.C664252 */

                    static {
                        Covode.recordClassIndex(77959);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
                    @Override // p077b.AbstractC1729g
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ java.lang.String then(p077b.C1731i<com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66423c.C66430a> r10) {
                        /*
                        // Method dump skipped, instructions count: 396
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66423c.C664252.then(b.i):java.lang.Object");
                    }
                }, C1731i.f5564c, null);
                Vibrator vibrator = (Vibrator) m118148a(this.f149326a, "vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200);
                }
            } else {
                this.f149326a.finish();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo105353a(Context context, int i, final String str, String str2, String str3, Map<String, Object> map) {
        String str4;
        Uri parse;
        if (TextUtils.isEmpty(str2) || (parse = Uri.parse(str2)) == null) {
            str4 = "";
        } else {
            str4 = parse.getQueryParameter("sec_uid");
            if (!TextUtils.isEmpty(str4)) {
                C80517gw.m139563a().mo123773a(str, str4);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i == 8) {
                                this.f149336k.mo105345b(context, str, str3);
                                return true;
                            } else if (i == 9) {
                                IExternalService a = AVExternalServiceImpl.m113114a();
                                if (!a.publishService().checkIsAlreadyPublished(this.f149326a)) {
                                    new C23144b(this.f149326a).mo37640e(R.string.f94).mo37637b();
                                    this.f149327b.mo105368a();
                                    return true;
                                }
                                final String b = C36132v.m73608b(str2, "grade_key");
                                if (!a.configService().avsettingsConfig().needLoginBeforeRecord()) {
                                    mo105350a(str, b);
                                } else {
                                    this.f149330e = true;
                                    C58957c.m108320a(this.f149326a, "scan", "click_my_qr", (Bundle) null, new AbstractC34543f() {
                                        /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66423c.C664285 */

                                        static {
                                            Covode.recordClassIndex(77962);
                                        }

                                        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                                        /* renamed from: a */
                                        public final void mo57673a() {
                                            C66423c.this.mo105350a(str, b);
                                        }

                                        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                                        /* renamed from: b */
                                        public final void mo57674b() {
                                            C66423c.this.f149327b.mo105373e();
                                            C66423c.this.f149327b.mo105374f();
                                        }
                                    });
                                }
                                return true;
                            } else if (i != 16) {
                                if (i == 17) {
                                    this.f149336k.mo105341a(context, C27404ap.m54809a(str));
                                    if (!TextUtils.isEmpty(str)) {
                                        C39162r.m79460a("enter_prop_detail", new C33744d().mo59983a("enter_from", "scan").mo59983a("prop_id", str).f79943a);
                                    }
                                    return true;
                                } else if (i == 23) {
                                    CommerceChallengeServiceImpl.m75741e().mo65386a(str);
                                } else if (i != 51) {
                                    switch (i) {
                                        case 29:
                                            break;
                                        case 30:
                                            IExternalService a2 = AVExternalServiceImpl.m113114a();
                                            if (!a2.publishService().checkIsAlreadyPublished(this.f149326a)) {
                                                new C79459a(this.f149326a).mo123050a(R.string.f94).mo123053a();
                                                this.f149327b.mo105368a();
                                                return true;
                                            }
                                            if (!a2.configService().avsettingsConfig().needLoginBeforeRecord()) {
                                                mo105349a(str);
                                            } else {
                                                this.f149330e = true;
                                                C58957c.m108320a(this.f149326a, "scan", "click_my_qr", (Bundle) null, new AbstractC34543f() {
                                                    /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66423c.C664296 */

                                                    static {
                                                        Covode.recordClassIndex(77963);
                                                    }

                                                    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                                                    /* renamed from: a */
                                                    public final void mo57673a() {
                                                        C66423c.this.mo105349a(str);
                                                    }

                                                    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                                                    /* renamed from: b */
                                                    public final void mo57674b() {
                                                        C66423c.this.f149327b.mo105373e();
                                                        C66423c.this.f149327b.mo105374f();
                                                    }
                                                });
                                            }
                                            return true;
                                        case 31:
                                            break;
                                        case 32:
                                            SmartRouter.buildRoute(context, "//ads/preview").withParam("url", str2).open();
                                            return true;
                                        case 33:
                                            ActivityC17312a aVar = this.f149326a;
                                            AbstractC66451d dVar = this.f149327b;
                                            C66432e eVar = new C66432e(this);
                                            C89219l.m154721d(aVar, "");
                                            C89219l.m154721d(str2, "");
                                            C89219l.m154721d(dVar, "");
                                            C89219l.m154721d(eVar, "");
                                            AVExternalServiceImpl.m113114a().ttepAbilityService().downloadEffectAndJumpShootPage(aVar, new C66446m.C66447a(aVar), str2, new C66446m.C66448b(dVar), eVar);
                                            return true;
                                        default:
                                            return false;
                                    }
                                } else {
                                    SmartRouter.buildRoute(context, "//qna/detail").withParam("id", str).withParam("enter_from", str3).open();
                                    return true;
                                }
                            }
                        }
                        String str5 = null;
                        if (!C31575b.m65865g().isLogin()) {
                            new C79459a(this.f149326a).mo123050a(R.string.h52).mo123053a();
                            return true;
                        }
                        ActivityC17312a aVar2 = this.f149326a;
                        if (aVar2 != null && !aVar2.isDestroyed() && !TextUtils.isEmpty(str)) {
                            User user = new User();
                            if (!TextUtils.isEmpty(str2)) {
                                String queryParameter = Uri.parse(str2).getQueryParameter("u_code");
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    try {
                                        str5 = String.valueOf(Long.parseLong(queryParameter, 23));
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (map != null && (map.get("anchor_sec_uid") instanceof String)) {
                                user.setSecUid((String) map.get("anchor_sec_uid"));
                            }
                            if (i == 31) {
                                user.setUid(str);
                            } else {
                                try {
                                    user.roomId = Long.parseLong(str);
                                } catch (Exception unused2) {
                                }
                            }
                            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                            enterRoomConfig.f28233c.f28293J = str3;
                            enterRoomConfig.f28232b.f28246C = str5;
                            LiveOuterService.m107269s().mo95835i().mo105593a(this.f149326a, user, enterRoomConfig);
                        }
                        return true;
                    }
                    m118149a("enter_personal_detail", this.f149328c, "user_id", str);
                    if (context != null) {
                        SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", str).withParam("sec_user_id", str4).withParam("enter_from", str3).open();
                    }
                    return true;
                }
                m118149a("enter_music_detail", this.f149328c, "music_id", str);
                this.f149336k.mo105345b(context, str, str3);
                return true;
            }
            m118149a("enter_tag_detail", this.f149328c, "tag_id", str);
            this.f149336k.mo105346c(context, str, str3);
            return true;
        }
        this.f149336k.mo105340a(context, str, str3);
        m118149a("video_play", this.f149328c, "group_id", str);
        return true;
    }

    /* renamed from: c */
    private static boolean m118150c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66450c
    /* renamed from: b */
    public final void mo105354b() {
        C66421b bVar = this.f149331f;
        if (bVar != null) {
            if (bVar.f149324b != null) {
                bVar.f149324b.mo62188b();
            }
            bVar.f149323a = null;
        }
        this.f149327b = null;
        this.f149326a = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66450c
    /* renamed from: a */
    public final void mo105348a() {
        this.f149337l = new ArrayList();
        C664241 r3 = new AbstractC66376a.AbstractC66377a() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66423c.C664241 */

            static {
                Covode.recordClassIndex(77958);
            }

            @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66376a.AbstractC66377a
            /* renamed from: a */
            public final boolean mo105308a(int i, String str, String str2, Map<String, Object> map) {
                C66423c cVar = C66423c.this;
                return cVar.mo105353a(cVar.f149326a, i, str, str2, "scan", map);
            }
        };
        this.f149337l.add(C66378b.f149286b);
        this.f149337l.add(new C66379c(r3));
        this.f149337l.add(new C66384g(r3));
        this.f149337l.add(new C66385h(r3, this.f149326a));
        this.f149337l.add(new C66386i(r3));
        ArrayList arrayList = new ArrayList();
        this.f149338m = arrayList;
        arrayList.add(C66378b.f149286b);
        this.f149338m.add(new C66387j());
        this.f149338m.add(new C66382f());
        this.f149338m.add(new C66381e(r3));
        this.f149338m.add(new C66388k(this.f149326a));
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.c$a */
    static class C66430a {

        /* renamed from: a */
        public final String f149355a;

        static {
            Covode.recordClassIndex(77964);
        }

        C66430a(String str) {
            this.f149355a = str;
        }
    }

    /* renamed from: a */
    public final void mo105349a(String str) {
        ActivityC17312a aVar = this.f149326a;
        if (aVar != null && !aVar.isDestroyed() && !TextUtils.isEmpty(str)) {
            this.f149334i = true;
            this.f149336k.mo105342a(str, this.f149326a, new C66434g(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66450c
    /* renamed from: a */
    public final void mo105351a(boolean z) {
        ActivityC17312a aVar = this.f149326a;
        if (aVar != null && !aVar.isDestroyed()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC66431d(this, z));
            if (z) {
                this.f149327b.mo105368a();
            }
        }
    }

    public C66423c(ActivityC17312a aVar, AbstractC66451d dVar) {
        this.f149326a = aVar;
        this.f149327b = dVar;
    }

    /* renamed from: a */
    private static Object m118148a(ActivityC17312a aVar, String str) {
        Object obj;
        MethodCollector.m26663i(1462);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = aVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = aVar.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = aVar.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(1462);
                }
            }
        } else {
            obj = aVar.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public final void mo105350a(String str, String str2) {
        ActivityC17312a aVar = this.f149326a;
        if (aVar != null && !aVar.isDestroyed()) {
            this.f149334i = true;
            try {
                this.f149336k.mo105343a(str, str2, this.f149326a, AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera(), new C66433f(this));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m118149a(String str, boolean z, String str2, String str3) {
        String str4;
        C33744d a = new C33744d().mo59983a("enter_from", "scan");
        if (z) {
            str4 = "scan_album";
        } else {
            str4 = "scan_cam";
        }
        C39162r.m79460a(str, a.mo59983a("enter_method", str4).mo59983a(str2, str3).f79943a);
    }
}
