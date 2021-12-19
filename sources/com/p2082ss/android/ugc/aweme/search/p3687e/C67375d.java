package com.p2082ss.android.ugc.aweme.search.p3687e;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.resource.config.C21275a;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.EnumC21280f;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.p1537b.C21353c;
import com.p2082ss.android.ugc.aweme.search.C67431f;
import com.p2082ss.android.ugc.aweme.util.C80121a;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.e.d */
public final class C67375d {

    /* renamed from: a */
    public static final C67375d f150947a = new C67375d();

    /* renamed from: b */
    private static final AbstractC89244h f150948b = C89250i.m154773a((AbstractC89171a) C67380e.f150954a);

    /* renamed from: c */
    private static final AbstractC89244h f150949c = C89250i.m154773a((AbstractC89171a) C67381f.f150955a);

    /* renamed from: a */
    static Keva m119419a() {
        return (Keva) f150948b.getValue();
    }

    /* renamed from: d */
    private static C80121a m119422d() {
        return (C80121a) f150949c.getValue();
    }

    private C67375d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.e.d$e */
    static final class C67380e extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C67380e f150954a = new C67380e();

        static {
            Covode.recordClassIndex(79010);
        }

        C67380e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return C67431f.m119465a("search_common");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.e.d$f */
    static final class C67381f extends AbstractC89220m implements AbstractC89171a<C80121a> {

        /* renamed from: a */
        public static final C67381f f150955a = new C67381f();

        static {
            Covode.recordClassIndex(79011);
        }

        C67381f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80121a invoke() {
            return new C80121a(TimeUnit.SECONDS.toMillis(10));
        }
    }

    /* renamed from: e */
    private static IResourceService m119423e() {
        return (IResourceService) C21353c.C21354a.m40102a().mo34954a(IResourceService.class);
    }

    static {
        Covode.recordClassIndex(79005);
    }

    /* renamed from: c */
    static boolean m119421c() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long b = C67382e.m119426b();
        long j = m119419a().getLong("easter_egg_lynx_timestamp", -1);
        long j2 = m119419a().getLong("easter_egg_video_timestamp", -1);
        if (j < 0 || j2 < 0 || elapsedRealtime < j || elapsedRealtime < j2 || elapsedRealtime - j >= b || elapsedRealtime - j2 >= b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo106291b() {
        if (C67382e.m119425a() && m119423e() != null) {
            C81631k kVar = C81631k.f182525a;
            C89219l.m154716b(kVar, "");
            String c = kVar.mo125297c();
            String c2 = C67382e.m119427c();
            String d = C67382e.m119428d();
            C89219l.m154716b(c, "");
            if (c.length() != 0 && c2.length() != 0 && d.length() != 0 && !m119421c() && !m119422d().mo123577a()) {
                m119420a(c, d, c2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.e.d$b */
    public static final class C67377b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        public static final C67377b f150951a = new C67377b();

        static {
            Covode.recordClassIndex(79007);
        }

        C67377b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.e.d$d */
    public static final class C67379d extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        public static final C67379d f150953a = new C67379d();

        static {
            Covode.recordClassIndex(79009);
        }

        C67379d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.e.d$a */
    public static final class C67376a extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        public static final C67376a f150950a = new C67376a();

        static {
            Covode.recordClassIndex(79006);
        }

        C67376a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            boolean z;
            C21294e eVar2 = eVar;
            String str = "";
            C89219l.m154721d(eVar2, str);
            try {
                String str2 = eVar2.f50547n;
                if (str2 != null) {
                    str = str2;
                }
                z = new File(str).exists();
            } catch (SecurityException unused) {
                z = false;
            }
            if (z) {
                C67375d.m119419a().storeLong("easter_egg_lynx_timestamp", SystemClock.elapsedRealtime());
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.e.d$c */
    public static final class C67378c extends AbstractC89220m implements AbstractC89172b<C21294e, C89391z> {

        /* renamed from: a */
        public static final C67378c f150952a = new C67378c();

        static {
            Covode.recordClassIndex(79008);
        }

        C67378c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21294e eVar) {
            boolean z;
            C21294e eVar2 = eVar;
            String str = "";
            C89219l.m154721d(eVar2, str);
            try {
                String str2 = eVar2.f50547n;
                if (str2 != null) {
                    str = str2;
                }
                z = new File(str).exists();
            } catch (SecurityException unused) {
                z = false;
            }
            if (z) {
                C67375d.m119419a().storeLong("easter_egg_video_timestamp", SystemClock.elapsedRealtime());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static void m119420a(String str, String str2, String str3) {
        IResourceService e = m119423e();
        if (e != null) {
            C21284j jVar = new C21284j(str);
            C21275a aVar = new C21275a(true);
            aVar.mo34878a(C89070n.m154524c(EnumC21280f.GECKO));
            jVar.mo34886a(aVar);
            jVar.f50514e = 2;
            jVar.mo34887a(str2);
            e.loadAsync("", jVar, C67376a.f150950a, C67377b.f150951a);
        }
        IResourceService e2 = m119423e();
        if (e2 != null) {
            C21284j jVar2 = new C21284j(str);
            C21275a aVar2 = new C21275a(true);
            aVar2.mo34878a(C89070n.m154524c(EnumC21280f.GECKO));
            jVar2.mo34886a(aVar2);
            jVar2.f50514e = 2;
            jVar2.mo34887a(str3);
            e2.loadAsync("", jVar2, C67378c.f150952a, C67379d.f150953a);
        }
    }
}
