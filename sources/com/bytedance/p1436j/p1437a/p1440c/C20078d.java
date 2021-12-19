package com.bytedance.p1436j.p1437a.p1440c;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16672w;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import com.lynx.tasm.p2055d.C28751a;
import com.lynx.tasm.p2056e.C28770c;
import com.lynx.tasm.utils.C28928l;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.j.a.c.d */
public final class C20078d {

    /* renamed from: a */
    public static final AtomicBoolean f47797a = new AtomicBoolean(false);

    /* renamed from: b */
    public static boolean f47798b;

    /* renamed from: c */
    public static C28770c.AbstractC28772a f47799c;

    /* renamed from: d */
    static ConcurrentHashMap<String, Typeface> f47800d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static AbstractC16584o f47801e;

    /* renamed from: f */
    public static final C20078d f47802f = new C20078d();

    private C20078d() {
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC16584o m38032a() {
        AbstractC16584o oVar = f47801e;
        if (oVar == null) {
            C89219l.m154710a("token");
        }
        return oVar;
    }

    static {
        Covode.recordClassIndex(23586);
    }

    /* renamed from: com.bytedance.j.a.c.d$a */
    public static final class C20079a extends C28770c.AbstractC28772a {
        static {
            Covode.recordClassIndex(23587);
        }

        /* renamed from: com.bytedance.j.a.c.d$a$b */
        static final class C20081b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

            /* renamed from: a */
            public static final C20081b f47804a = new C20081b();

            static {
                Covode.recordClassIndex(23589);
            }

            C20081b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Throwable th) {
                C89219l.m154719c(th, "");
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.j.a.c.d$a$a */
        static final class C20080a extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

            /* renamed from: a */
            final /* synthetic */ String f47803a;

            static {
                Covode.recordClassIndex(23588);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20080a(String str) {
                super(1);
                this.f47803a = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[Catch:{ Exception -> 0x0070 }] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.ies.bullet.service.base.C16610ap r6) {
                /*
                // Method dump skipped, instructions count: 123
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1436j.p1437a.p1440c.C20078d.C20079a.C20080a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: c */
        private static Typeface m38033c(AbstractC28520j jVar, C28751a.EnumC28752a aVar, String str) {
            Typeface typeface = null;
            if (TextUtils.isEmpty(str) || aVar == C28751a.EnumC28752a.LOCAL) {
                return null;
            }
            if (str == null) {
                C89219l.m154707a();
            }
            int a = C89361p.m154888a((CharSequence) str, "base64,", 0, false, 6);
            if (!C89361p.m154874b(str, "data:", false) || a == -1) {
                return null;
            }
            String substring = str.substring(a + 7);
            C89219l.m154709a((Object) substring, "");
            try {
                typeface = C28928l.m57943a(jVar, Base64.decode(substring, 0));
                return typeface;
            } catch (Exception e) {
                m57584a(jVar, e.getMessage());
                return typeface;
            }
        }

        @Override // com.lynx.tasm.p2056e.C28770c.AbstractC28772a
        /* renamed from: a */
        public final Typeface mo33430a(AbstractC28520j jVar, C28751a.EnumC28752a aVar, String str) {
            Object b;
            if (str == null || str.length() == 0) {
                return null;
            }
            AbstractC16672w wVar = (AbstractC16672w) C20078d.m38032a().mo25790b_(AbstractC16672w.class);
            if (wVar == null || (b = wVar.mo26463b()) == null || !(b instanceof Typeface)) {
                IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) C20078d.m38032a().mo25790b_(IResourceLoaderService.class);
                if (iResourceLoaderService != null) {
                    C16667j jVar2 = new C16667j();
                    jVar2.f39851s = C20078d.m38032a();
                    jVar2.mo26454d("sub_source");
                    iResourceLoaderService.loadAsync(str, jVar2, new C20080a(str), C20081b.f47804a);
                }
                Typeface typeface = C20078d.f47800d.get(str);
                if (typeface == null) {
                    return m38033c(jVar, aVar, str);
                }
                return typeface;
            }
            LLog.m56860b("LynxKit", "get typeface from preload service");
            return (Typeface) b;
        }
    }

    /* renamed from: com.bytedance.j.a.c.d$b */
    public static final class C20082b implements C28573r.AbstractC28574a {

        /* renamed from: a */
        public static final C20082b f47805a = new C20082b();

        static {
            Covode.recordClassIndex(23590);
        }

        C20082b() {
        }

        @Override // com.lynx.tasm.behavior.shadow.text.C28573r.AbstractC28574a
        /* renamed from: a */
        public final Typeface mo14647a(String str, int i) {
            return C28573r.m57140a(C20083e.m38036a().getAssets(), str, i, "font/");
        }
    }
}
