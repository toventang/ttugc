package com.bytedance.lynx.hybrid;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1519e.C21182b;
import com.bytedance.lynx.hybrid.p1519e.C21187d;
import com.bytedance.lynx.hybrid.p1524j.C21210c;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import com.lynx.tasm.p2055d.C28751a;
import com.lynx.tasm.p2056e.C28770c;
import com.lynx.tasm.utils.C28928l;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.j */
public final class C21205j {

    /* renamed from: a */
    public static boolean f50319a;

    /* renamed from: b */
    static ConcurrentHashMap<String, Typeface> f50320b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final C21205j f50321c = new C21205j();

    /* renamed from: d */
    private static final AtomicBoolean f50322d = new AtomicBoolean(false);

    /* renamed from: e */
    private static C28770c.AbstractC28772a f50323e;

    /* renamed from: com.bytedance.lynx.hybrid.j$a */
    public static final class C21206a extends C28770c.AbstractC28772a {
        static {
            Covode.recordClassIndex(24822);
        }

        C21206a() {
        }

        /* renamed from: c */
        private static Typeface m39919c(AbstractC28520j jVar, C28751a.EnumC28752a aVar, String str) {
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

        /* JADX WARNING: Removed duplicated region for block: B:37:0x007c A[Catch:{ Exception -> 0x0091 }] */
        @Override // com.lynx.tasm.p2056e.C28770c.AbstractC28772a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.graphics.Typeface mo33430a(com.lynx.tasm.behavior.AbstractC28520j r7, com.lynx.tasm.p2055d.C28751a.EnumC28752a r8, java.lang.String r9) {
            /*
            // Method dump skipped, instructions count: 201
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.C21205j.C21206a.mo33430a(com.lynx.tasm.behavior.j, com.lynx.tasm.d.a$a, java.lang.String):android.graphics.Typeface");
        }
    }

    private C21205j() {
    }

    /* renamed from: a */
    private static void m39917a() {
        C21206a aVar = new C21206a();
        f50323e = aVar;
        C28770c.m57583a(aVar);
        C28573r.m57143a(C21207b.f50324a);
    }

    static {
        Covode.recordClassIndex(24821);
    }

    /* renamed from: a */
    public static void m39918a(C21182b bVar) {
        C89219l.m154719c(bVar, "");
        if (f50319a || f50322d.compareAndSet(false, true)) {
            try {
                m39917a();
                C21214k.m39932a(bVar);
                LynxEnv b = LynxEnv.m56706b();
                C89219l.m154709a((Object) b, "");
                if (b.mo48573f()) {
                    f50319a = true;
                } else {
                    f50322d.set(false);
                    throw new RuntimeException("Lynx so Init Failed");
                }
            } catch (Throwable th) {
                f50322d.set(false);
                C21210c.m39927a(th, "LynxKit Init Failed", (String) null, 4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.j$b */
    public static final class C21207b implements C28573r.AbstractC28574a {

        /* renamed from: a */
        public static final C21207b f50324a = new C21207b();

        static {
            Covode.recordClassIndex(24823);
        }

        C21207b() {
        }

        @Override // com.lynx.tasm.behavior.shadow.text.C28573r.AbstractC28574a
        /* renamed from: a */
        public final Typeface mo14647a(String str, int i) {
            return C28573r.m57140a(C21187d.m39885a().getAssets(), str, i, "font/");
        }
    }
}
