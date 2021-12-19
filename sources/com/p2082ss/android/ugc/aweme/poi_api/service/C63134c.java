package com.p2082ss.android.ugc.aweme.poi_api.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18115a;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18119c;
import com.bytedance.ies.ugc.aweme.plugin.p1266b.EnumC18124b;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18126b;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18127c;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.p2082ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.p2082ss.android.ugc.aweme.poi_api.p3560a.C63129a;
import java.util.LinkedHashMap;
import java.util.Objects;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.poi_api.service.c */
public final class C63134c {

    /* renamed from: a */
    public static final IPluginService f143475a = AabPluginServiceImpl.m114069d();

    /* renamed from: b */
    public static final AbstractC18127c f143476b = new C63138d();

    /* renamed from: c */
    public static final AbstractC18126b f143477c = C63136b.f143487a;

    /* renamed from: d */
    public static final C63134c f143478d = new C63134c();

    /* renamed from: e */
    private static boolean f143479e;

    /* renamed from: f */
    private static IPoiService f143480f = new PoiServiceEmptyImpl();

    /* renamed from: com.ss.android.ugc.aweme.poi_api.service.c$d */
    public static final class C63138d implements AbstractC18127c {
        static {
            Covode.recordClassIndex(74352);
        }

        C63138d() {
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18127c
        /* renamed from: a */
        public final void mo28883a(boolean z) {
            C63134c.m114158a(Boolean.valueOf(z), "install start", null, null, null);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18127c
        /* renamed from: b */
        public final void mo28885b(boolean z) {
            C63134c.m114158a(Boolean.valueOf(z), "installing", null, null, null);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18127c
        /* renamed from: c */
        public final void mo28886c(boolean z) {
            C63134c.m114158a(Boolean.valueOf(z), "install end", null, null, null);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18127c
        /* renamed from: a */
        public final void mo28882a(int i) {
            if (i == -1) {
                C63134c.m114158a(null, "Permission Dialog Result", null, null, "showPermissionDialog: clicked OK");
            } else {
                C63134c.m114158a(null, "Permission Dialog Result", null, null, "showPermissionDialog: clicked cancel");
            }
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18127c
        /* renamed from: a */
        public final void mo28884a(boolean z, long j, long j2) {
            C63134c.m114158a(Boolean.valueOf(z), "downloading", Long.valueOf(j), Long.valueOf(j2), null);
        }
    }

    private C63134c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.poi_api.service.c$b */
    static final class C63136b implements AbstractC18126b {

        /* renamed from: a */
        public static final C63136b f143487a = new C63136b();

        static {
            Covode.recordClassIndex(74350);
        }

        C63136b() {
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18126b
        /* renamed from: a */
        public final void mo28881a() {
            C63134c.m114159a("RETRY");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.poi_api.service.c$c */
    public static final class C63137c<T> implements ServiceProvider {

        /* renamed from: a */
        final /* synthetic */ Class f143488a;

        static {
            Covode.recordClassIndex(74351);
        }

        C63137c(Class cls) {
            this.f143488a = cls;
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final /* synthetic */ Object get() {
            Object newInstance = this.f143488a.newInstance();
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi_api.service.IPoiService");
            return newInstance;
        }
    }

    /* renamed from: c */
    public final void mo101479c() {
        m114161d();
        m114157a().mo101464f();
    }

    /* renamed from: d */
    private static boolean m114161d() {
        IPluginService iPluginService = f143475a;
        if (iPluginService == null) {
            return false;
        }
        iPluginService.mo28893c().mo28895a(C17867d.m33078a());
        return true;
    }

    static {
        Covode.recordClassIndex(74348);
    }

    /* renamed from: b */
    public static boolean m114160b() {
        IPluginService iPluginService = f143475a;
        if (iPluginService == null) {
            return false;
        }
        if (!iPluginService.mo28892b()) {
            return true;
        }
        if (iPluginService.mo28890a("com.ss.android.ugc.aweme.poi")) {
            if (!f143479e) {
                f143479e = m114161d();
            }
            if (f143479e) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static IPoiService m114157a() {
        Object obj;
        if (!m114160b()) {
            return new PoiServiceEmptyImpl();
        }
        IPoiService iPoiService = (IPoiService) ServiceManager.get().getService(C63133b.f143474a);
        if (iPoiService instanceof PoiServiceEmptyImpl) {
            try {
                obj = C89379q.m157068constructorimpl(Class.forName("com.ss.android.ugc.aweme.poi.service.PoiServiceImpl"));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157073isFailureimpl(obj)) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null) {
                ServiceManager.get().bind(C63133b.f143474a, new C63137c(cls)).asSingleton();
            }
            iPoiService = (IPoiService) ServiceManager.get().getService(C63133b.f143474a);
        }
        C89219l.m154716b(iPoiService, "");
        return iPoiService;
    }

    /* renamed from: com.ss.android.ugc.aweme.poi_api.service.c$e */
    public static final class C63139e implements AbstractC18125a {

        /* renamed from: a */
        final /* synthetic */ String f143489a;

        static {
            Covode.recordClassIndex(74353);
        }

        C63139e(String str) {
            this.f143489a = str;
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
        /* renamed from: a */
        public final void mo28879a(String str, int i) {
            C89219l.m154721d(str, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("result", "failed");
            linkedHashMap.put("error_code", String.valueOf(i));
            linkedHashMap.put("request_from", this.f143489a);
            C39162r.m79460a("poi_install_result", linkedHashMap);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
        /* renamed from: a */
        public final void mo28880a(String str, boolean z) {
            C89219l.m154721d(str, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("result", "succeed");
            linkedHashMap.put("request_from", this.f143489a);
            C39162r.m79460a("poi_install_result", linkedHashMap);
            C63134c.f143478d.mo101479c();
            C63134c.m114157a().mo101454a("POI_INSTALL_SUCCEED_CALLBACK");
        }
    }

    /* renamed from: a */
    public static void m114159a(String str) {
        C89219l.m154721d(str, "");
        if (!m114160b() && C63129a.m114087a().f143468a) {
            C18119c.C18120a aVar = new C18119c.C18120a();
            aVar.f43150a = "com.ss.android.ugc.aweme.poi";
            aVar.f43152c = true;
            aVar.f43154e = f143477c;
            C18115a.C18116a a = new C18115a.C18116a().mo28874a(1);
            a.f43126a = false;
            a.f43135j = f143476b;
            a.f43132g = EnumC18124b.REPLACE;
            aVar.f43155f = a.mo28875a();
            aVar.f43153d = new C63139e(str);
            f143475a.mo28889a(aVar.mo28877a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi_api.service.c$a */
    public static final class C63135a implements AbstractC18125a {

        /* renamed from: a */
        final /* synthetic */ String f143481a;

        /* renamed from: b */
        final /* synthetic */ Context f143482b;

        /* renamed from: c */
        final /* synthetic */ Aweme f143483c;

        /* renamed from: d */
        final /* synthetic */ String f143484d;

        /* renamed from: e */
        final /* synthetic */ String f143485e;

        /* renamed from: f */
        private boolean f143486f = true;

        static {
            Covode.recordClassIndex(74349);
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
        /* renamed from: a */
        public final void mo28879a(String str, int i) {
            C89219l.m154721d(str, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("result", "failed");
            linkedHashMap.put("error_code", String.valueOf(i));
            linkedHashMap.put("request_from", this.f143481a);
            C39162r.m79460a("poi_install_result", linkedHashMap);
            this.f143486f = false;
        }

        @Override // com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18125a
        /* renamed from: a */
        public final void mo28880a(String str, boolean z) {
            C89219l.m154721d(str, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("result", "succeed");
            linkedHashMap.put("request_from", this.f143481a);
            C39162r.m79460a("poi_install_result", linkedHashMap);
            C63134c.f143478d.mo101479c();
            if (this.f143486f) {
                C63134c.m114157a().mo101450a().mo101473a(this.f143482b, this.f143483c, this.f143484d, this.f143485e);
            }
        }

        public C63135a(String str, Context context, Aweme aweme, String str2, String str3) {
            this.f143481a = str;
            this.f143482b = context;
            this.f143483c = aweme;
            this.f143484d = str2;
            this.f143485e = str3;
        }
    }

    /* renamed from: a */
    public static void m114158a(Boolean bool, String str, Long l, Long l2, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bool != null) {
            linkedHashMap.put("is_silent", String.valueOf(bool.booleanValue()));
        }
        linkedHashMap.put("state", str);
        if (l != null) {
            linkedHashMap.put("bytes_downloaded", String.valueOf(l.longValue()));
        }
        if (l2 != null) {
            linkedHashMap.put("total_bytes_to_download", String.valueOf(l2.longValue()));
        }
        if (str2 != null) {
            linkedHashMap.put("permission_dialog_result", str2.toString());
        }
        C39162r.m79460a("poi_df_state_change", linkedHashMap);
    }
}
