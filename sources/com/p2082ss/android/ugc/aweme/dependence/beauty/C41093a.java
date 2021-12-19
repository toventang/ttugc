package com.p2082ss.android.ugc.aweme.dependence.beauty;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.dependence.beauty.a */
public final class C41093a {

    /* renamed from: a */
    public static AbstractC41094a f96055a;

    /* renamed from: b */
    public static final C41093a f96056b = new C41093a();

    /* renamed from: com.ss.android.ugc.aweme.dependence.beauty.a$a */
    public interface AbstractC41094a {
        static {
            Covode.recordClassIndex(48964);
        }

        /* renamed from: a */
        void mo22694a(String str, String str2);

        /* renamed from: a */
        void mo22695a(String str, Throwable th);

        /* renamed from: b */
        void mo22696b(String str, String str2);

        /* renamed from: c */
        void mo22697c(String str, String str2);

        /* renamed from: d */
        void mo22698d(String str, String str2);
    }

    private C41093a() {
    }

    static {
        Covode.recordClassIndex(48963);
    }

    /* renamed from: a */
    public static void m82762a(String str) {
        AbstractC41094a aVar = f96055a;
        if (aVar != null) {
            aVar.mo22696b("BeautyLog", str);
        }
    }

    /* renamed from: b */
    public static void m82764b(String str) {
        AbstractC41094a aVar = f96055a;
        if (aVar != null) {
            aVar.mo22697c("BeautyLog", str);
        }
    }

    /* renamed from: c */
    public static void m82765c(String str) {
        AbstractC41094a aVar = f96055a;
        if (aVar != null) {
            aVar.mo22698d("BeautyLog", str);
        }
    }

    /* renamed from: a */
    public static void m82763a(Throwable th) {
        AbstractC41094a aVar = f96055a;
        if (aVar != null) {
            aVar.mo22695a("BeautyLog", th);
        } else if (th != null) {
            th.getMessage();
        }
    }
}
