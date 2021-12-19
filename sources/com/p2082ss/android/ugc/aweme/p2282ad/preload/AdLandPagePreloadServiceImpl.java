package com.p2082ss.android.ugc.aweme.p2282ad.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.p1777x.p1780c.C23697c;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.settings.C68722a;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl */
public final class AdLandPagePreloadServiceImpl implements IAdLandPagePreloadService {

    /* renamed from: f */
    public static final AdLandPagePreloadServiceImpl f79286f = C33359b.f79295a;

    /* renamed from: g */
    public static final C33358a f79287g = new C33358a((byte) 0);

    /* renamed from: a */
    public final String f79288a = "preload_land_page_analytics";

    /* renamed from: b */
    public final String f79289b = "premem_land_page_analytics";

    /* renamed from: c */
    public String f79290c = "";

    /* renamed from: d */
    public String f79291d = "";

    /* renamed from: e */
    public final Keva f79292e = Keva.getRepo("commercial_preload_land_page_name");

    /* renamed from: h */
    private final String f79293h = "\"/** adInfo **/\"";

    /* renamed from: i */
    private final String f79294i = "commercial_preload_land_page_name";

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: e */
    public final String mo59388e() {
        return "ad_commerce";
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl$a */
    public static final class C33358a {
        static {
            Covode.recordClassIndex(40203);
        }

        private C33358a() {
        }

        public /* synthetic */ C33358a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl$b */
    static final class C33359b {

        /* renamed from: a */
        static final AdLandPagePreloadServiceImpl f79295a = new AdLandPagePreloadServiceImpl();

        /* renamed from: b */
        public static final C33359b f79296b = new C33359b();

        private C33359b() {
        }

        static {
            Covode.recordClassIndex(40204);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: a */
    public final AbstractC33368e mo59376a() {
        return C33369f.f79310b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: b */
    public final String mo59381b() {
        return this.f79291d;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: d */
    public final boolean mo59387d() {
        return C68722a.m121157a();
    }

    static {
        Covode.recordClassIndex(40202);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: c */
    public final void mo59385c() {
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33367d c = C33113b.m67828c();
        if (c != null) {
            c.mo59396a();
        }
    }

    /* renamed from: f */
    public static IAdLandPagePreloadService m68380f() {
        MethodCollector.m26663i(7629);
        Object a = C81908b.m141854a(IAdLandPagePreloadService.class, false);
        if (a != null) {
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) a;
            MethodCollector.m26664o(7629);
            return iAdLandPagePreloadService;
        }
        if (C81908b.f183126I == null) {
            synchronized (IAdLandPagePreloadService.class) {
                try {
                    if (C81908b.f183126I == null) {
                        C81908b.f183126I = new AdLandPagePreloadServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7629);
                    throw th;
                }
            }
        }
        AdLandPagePreloadServiceImpl adLandPagePreloadServiceImpl = (AdLandPagePreloadServiceImpl) C81908b.f183126I;
        MethodCollector.m26664o(7629);
        return adLandPagePreloadServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl$c */
    static final class CallableC33360c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AdLandPagePreloadServiceImpl f79297a;

        /* renamed from: b */
        final /* synthetic */ String f79298b;

        static {
            Covode.recordClassIndex(40205);
        }

        CallableC33360c(AdLandPagePreloadServiceImpl adLandPagePreloadServiceImpl, String str) {
            this.f79297a = adLandPagePreloadServiceImpl;
            this.f79298b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r3 = this;
                com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r2 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.m33635a()
                if (r2 == 0) goto L_0x0051
                com.ss.android.ugc.aweme.ad.b.b r1 = com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b.C33114a.f78704a
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                com.ss.android.ugc.aweme.ad.b.c r0 = com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b.m67826a()
                java.lang.String r0 = r0.mo58935b()
                com.bytedance.ies.ugc.aweme.network.e r0 = r2.mo28817b(r0)
                com.bytedance.ies.ugc.aweme.network.f r1 = r0.mo28832d()
                java.lang.Class<com.ss.android.ugc.aweme.ad.network.CommonApi> r0 = com.p2082ss.android.ugc.aweme.p2282ad.network.CommonApi.class
                java.lang.Object r1 = r1.mo28858a(r0)
                com.ss.android.ugc.aweme.ad.network.CommonApi r1 = (com.p2082ss.android.ugc.aweme.p2282ad.network.CommonApi) r1
                if (r1 == 0) goto L_0x0051
                java.lang.String r0 = r3.f79298b
                com.bytedance.retrofit2.b r0 = r1.doGet(r0)
                if (r0 == 0) goto L_0x0051
                com.bytedance.retrofit2.u r0 = r0.execute()
                if (r0 == 0) goto L_0x0051
                T r2 = r0.f52262b
                java.lang.String r2 = (java.lang.String) r2
            L_0x0039:
                boolean r0 = com.bytedance.p1777x.p1780c.C23697c.m44781a(r2)
                if (r0 != 0) goto L_0x004e
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f79297a
                r0.f79290c = r2
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f79297a
                com.bytedance.keva.Keva r1 = r0.f79292e
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f79297a
                java.lang.String r0 = r0.f79288a
                r1.storeString(r0, r2)
            L_0x004e:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0051:
                r2 = 0
                goto L_0x0039
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl.CallableC33360c.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl$d */
    static final class CallableC33361d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AdLandPagePreloadServiceImpl f79299a;

        /* renamed from: b */
        final /* synthetic */ String f79300b;

        static {
            Covode.recordClassIndex(40206);
        }

        CallableC33361d(AdLandPagePreloadServiceImpl adLandPagePreloadServiceImpl, String str) {
            this.f79299a = adLandPagePreloadServiceImpl;
            this.f79300b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r3 = this;
                com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r2 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.m33635a()
                if (r2 == 0) goto L_0x0051
                com.ss.android.ugc.aweme.ad.b.b r1 = com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b.C33114a.f78704a
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                com.ss.android.ugc.aweme.ad.b.c r0 = com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b.m67826a()
                java.lang.String r0 = r0.mo58935b()
                com.bytedance.ies.ugc.aweme.network.e r0 = r2.mo28817b(r0)
                com.bytedance.ies.ugc.aweme.network.f r1 = r0.mo28832d()
                java.lang.Class<com.ss.android.ugc.aweme.ad.network.CommonApi> r0 = com.p2082ss.android.ugc.aweme.p2282ad.network.CommonApi.class
                java.lang.Object r1 = r1.mo28858a(r0)
                com.ss.android.ugc.aweme.ad.network.CommonApi r1 = (com.p2082ss.android.ugc.aweme.p2282ad.network.CommonApi) r1
                if (r1 == 0) goto L_0x0051
                java.lang.String r0 = r3.f79300b
                com.bytedance.retrofit2.b r0 = r1.doGet(r0)
                if (r0 == 0) goto L_0x0051
                com.bytedance.retrofit2.u r0 = r0.execute()
                if (r0 == 0) goto L_0x0051
                T r2 = r0.f52262b
                java.lang.String r2 = (java.lang.String) r2
            L_0x0039:
                boolean r0 = com.bytedance.p1777x.p1780c.C23697c.m44781a(r2)
                if (r0 != 0) goto L_0x004e
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f79299a
                r0.f79291d = r2
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f79299a
                com.bytedance.keva.Keva r1 = r0.f79292e
                com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl r0 = r3.f79299a
                java.lang.String r0 = r0.f79289b
                r1.storeString(r0, r2)
            L_0x004e:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0051:
                r2 = 0
                goto L_0x0039
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl.CallableC33361d.call():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: b */
    public final JSONObject mo59383b(String str) {
        return C33366c.m68418a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: a */
    public final void mo59380a(String str) {
        if (!C23697c.m44781a(str)) {
            C33363b.m68416a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: b */
    public final String mo59382b(Long l) {
        return "lynx_h5_" + l + "_";
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: a */
    public final String mo59377a(Long l) {
        if (l == null || l.longValue() <= 0) {
            return null;
        }
        return this.f79292e.getString(String.valueOf(l), "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: c */
    public final int mo59384c(String str) {
        if (C89219l.m154714a((Object) str, (Object) "0da04670c45fcb4f5dee6049f06a9d77") || C89219l.m154714a((Object) str, (Object) "a1a15b782e3ee8a25247561a91a99835")) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33117e b = C33113b.m67827b();
            if (b != null) {
                return b.mo58989s();
            }
            return 40;
        }
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33117e b2 = C33113b.m67827b();
        if (b2 != null) {
            return b2.mo58988r();
        }
        return 40;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: d */
    public final void mo59386d(String str) {
        if (C23697c.m44781a(str)) {
            this.f79292e.storeString(this.f79288a, "");
        } else if (C23697c.m44781a(this.f79290c)) {
            C1731i.m5640b(new CallableC33360c(this, str), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: e */
    public final void mo59389e(String str) {
        if (C23697c.m44781a(str)) {
            this.f79292e.storeString(this.f79289b, "");
        } else if (C23697c.m44781a(this.f79291d)) {
            C1731i.m5640b(new CallableC33361d(this, str), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: a */
    public final void mo59378a(AwemeRawAd awemeRawAd) {
        C89219l.m154721d(awemeRawAd, "");
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33367d c = C33113b.m67828c();
        if (c != null) {
            c.mo59398a(awemeRawAd);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: f */
    public final String mo59390f(String str) {
        String str2;
        C89219l.m154721d(str, "");
        if (C23697c.m44781a(this.f79290c)) {
            str2 = this.f79292e.getString(this.f79288a, "");
        } else {
            str2 = this.f79290c;
            if (str2 == null) {
                C89219l.m154715b();
            }
        }
        if (C23697c.m44781a(str2)) {
            C89219l.m154716b(str2, "");
            return str2;
        }
        C89219l.m154716b(str2, "");
        return C89361p.m154869a(str2, this.f79293h, str, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: g */
    public final String mo59391g(String str) {
        C89219l.m154721d(str, "");
        switch (str.hashCode()) {
            case -895866265:
                if (str.equals("splash")) {
                    return "cca47107bfcbdb211d88f3385aeede40";
                }
                return null;
            case 3138974:
                if (str.equals("feed")) {
                    return "cca47107bfcbdb211d88f3385aeede40";
                }
                return null;
            case 862628038:
                if (str.equals("lynx_feed")) {
                    return "a1a15b782e3ee8a25247561a91a99835";
                }
                return null;
            case 1856444385:
                if (str.equals("flutter_feed")) {
                    return "";
                }
                return null;
            case 2012743738:
                if (str.equals("dynamic_ad_feed")) {
                    return "a20813e75cff1b482e289722d8e7422b";
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: a */
    public final long mo59375a(long j, long j2) {
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33367d c = C33113b.m67828c();
        if (c != null) {
            return c.mo59395a(j, j2);
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService
    /* renamed from: a */
    public final void mo59379a(Long l, String str) {
        if (l != null && l.longValue() > 0 && !C23697c.m44781a(str)) {
            this.f79292e.storeString(String.valueOf(l), str);
        }
    }
}
