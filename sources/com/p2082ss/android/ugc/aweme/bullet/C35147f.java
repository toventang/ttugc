package com.p2082ss.android.ugc.aweme.bullet;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16205f;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18115a;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18119c;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.p2082ss.android.ugc.aweme.net.C61303a;
import com.p2082ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.f */
public final class C35147f implements AbstractC16205f {

    /* renamed from: a */
    public static final C35147f f82938a = new C35147f();

    /* renamed from: b */
    private static boolean f82939b;

    /* renamed from: c */
    private static final boolean f82940c = C89219l.m154714a((Object) C61303a.m110972a(), (Object) "arm64-v8a");

    /* renamed from: d */
    private static final IPluginService f82941d = AabPluginServiceImpl.m114069d();

    /* renamed from: com.ss.android.ugc.aweme.bullet.f$a */
    public static final class C35148a implements AbstractC18125a {
        static {
            Covode.recordClassIndex(42303);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
        /* renamed from: a */
        public final void mo28879a(String str, int i) {
            C89219l.m154721d(str, "");
        }

        C35148a() {
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
        /* renamed from: a */
        public final void mo28880a(String str, boolean z) {
            C89219l.m154721d(str, "");
            C35147f.m71916c();
        }
    }

    private C35147f() {
    }

    static {
        Covode.recordClassIndex(42302);
    }

    /* renamed from: c */
    public static boolean m71916c() {
        IPluginService iPluginService = f82941d;
        if (iPluginService != null) {
            iPluginService.mo28893c().mo28895a(C17867d.m33078a());
            try {
                if (!f82940c) {
                    iPluginService.mo28891a("com.ss.android.ugc.aweme.rn_kit", "gnustl_shared");
                    iPluginService.mo28891a("com.ss.android.ugc.aweme.rn_kit", "icu_common");
                }
                iPluginService.mo28891a("com.ss.android.ugc.aweme.rn_kit", "jsc");
                iPluginService.mo28891a("com.ss.android.ugc.aweme.rn_kit", "reactnativejni");
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16205f
    /* renamed from: a */
    public final void mo25758a() {
        C18119c.C18120a aVar = new C18119c.C18120a();
        aVar.f43150a = "com.ss.android.ugc.aweme.rn_kit";
        aVar.f43152c = true;
        C18115a.C18116a aVar2 = new C18115a.C18116a();
        aVar2.f43126a = false;
        aVar.f43155f = aVar2.mo28875a();
        aVar.f43153d = new C35148a();
        C18119c a = aVar.mo28877a();
        IPluginService iPluginService = f82941d;
        if (iPluginService != null) {
            iPluginService.mo28889a(a);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16205f
    /* renamed from: b */
    public final boolean mo25760b() {
        IPluginService iPluginService = f82941d;
        if (iPluginService == null) {
            return false;
        }
        if (!iPluginService.mo28892b()) {
            return true;
        }
        if (iPluginService.mo28890a("com.ss.android.ugc.aweme.rn_kit")) {
            if (!f82939b) {
                f82939b = m71916c();
            }
            if (f82939b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16205f
    /* renamed from: a */
    public final boolean mo25759a(EnumC16723b bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154719c(bVar, "");
        return false;
    }
}
