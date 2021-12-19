package com.bytedance.lynx.hybrid.p1524j;

import com.bytedance.covode.number.Covode;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.j.c */
public final class C21210c {

    /* renamed from: a */
    public static AbstractC21208a f50331a;

    /* renamed from: b */
    public static final C21210c f50332b = new C21210c();

    private C21210c() {
    }

    static {
        Covode.recordClassIndex(24826);
    }

    /* renamed from: a */
    public static void m39924a(String str, EnumC21209b bVar, String str2) {
        int i;
        C89219l.m154719c(str, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str2, "");
        try {
            AbstractC21208a aVar = f50331a;
            if (aVar == null) {
                int i2 = C21211d.f50333a[bVar.ordinal()];
                i = 0;
            } else {
                aVar.mo34820a(str, bVar, C21212e.f50334a + '_' + str2);
                i = C89391z.f203057a;
            }
            C89379q.m157068constructorimpl(i);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    /* renamed from: a */
    private static void m39926a(Throwable th, String str, String str2) {
        int i;
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        try {
            AbstractC21208a aVar = f50331a;
            if (aVar == null) {
                th.getMessage();
                i = 0;
            } else {
                aVar.mo34821a(th, str, C21212e.f50334a + '_' + str2);
                i = C89391z.f203057a;
            }
            C89379q.m157068constructorimpl(i);
        } catch (Throwable th2) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th2));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m39925a(String str, EnumC21209b bVar, String str2, int i) {
        if ((i & 2) != 0) {
            bVar = EnumC21209b.I;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        m39924a(str, bVar, str2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39927a(Throwable th, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = C21212e.f50334a;
        }
        m39926a(th, str, str2);
    }
}
