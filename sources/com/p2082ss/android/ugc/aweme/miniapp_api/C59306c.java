package com.p2082ss.android.ugc.aweme.miniapp_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18115a;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18119c;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.p2082ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.c */
public final class C59306c {
    static {
        Covode.recordClassIndex(69684);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.c$a */
    public static class C59307a implements AbstractC18125a {

        /* renamed from: a */
        private Runnable f135515a;

        static {
            Covode.recordClassIndex(69685);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
        /* renamed from: a */
        public final void mo28879a(String str, int i) {
        }

        public C59307a(Runnable runnable) {
            this.f135515a = runnable;
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
        /* renamed from: a */
        public final void mo28880a(String str, boolean z) {
            IPluginService d = AabPluginServiceImpl.m114069d();
            if (d != null) {
                d.mo28893c();
                d.mo28893c().mo28895a(C17867d.m33078a());
                Runnable runnable = this.f135515a;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m109002a(boolean z, Runnable runnable) {
        if (AabPluginServiceImpl.m114069d() == null) {
            return false;
        }
        if (!z) {
            return m109001a("com.ss.android.ugc.i18n.miniapp", Arrays.asList("com.ss.android.ugc.aweme.rn_kit"), false, runnable);
        }
        return m109001a("com.ss.android.ugc.i18n.miniapp_so", Arrays.asList("com.ss.android.ugc.aweme.rn_kit", "com.ss.android.ugc.i18n.miniapp"), false, runnable);
    }

    /* renamed from: a */
    public static boolean m109001a(String str, List<String> list, boolean z, Runnable runnable) {
        IPluginService d = AabPluginServiceImpl.m114069d();
        if (d == null || !d.mo28892b()) {
            return false;
        }
        C18119c.C18120a aVar = new C18119c.C18120a();
        aVar.f43150a = str;
        aVar.f43152c = z;
        aVar.f43153d = new C59307a(runnable);
        C18115a.C18116a aVar2 = new C18115a.C18116a();
        aVar2.f43126a = true;
        aVar2.f43127b = true;
        aVar2.f43128c = true;
        aVar2.f43129d = true;
        aVar2.f43130e = false;
        aVar2.f43133h = list;
        aVar.f43155f = aVar2.mo28875a();
        d.mo28889a(aVar.mo28877a());
        return true;
    }
}
