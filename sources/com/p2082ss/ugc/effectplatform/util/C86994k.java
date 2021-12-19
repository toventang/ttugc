package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4519d.p4520a.p4528c.C88030c;
import p4519d.p4520a.p4528c.C88034f;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4530d.p4531a.C88049f;
import p4519d.p4520a.p4530d.p4531a.C88050g;
import p4519d.p4520a.p4530d.p4531a.C88051h;
import p4519d.p4520a.p4530d.p4531a.EnumC88052i;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.util.k */
public final class C86994k {

    /* renamed from: a */
    public static final C86994k f196153a = new C86994k();

    private C86994k() {
    }

    static {
        Covode.recordClassIndex(102760);
    }

    /* renamed from: b */
    public static String m150674b(String str) {
        int a;
        if (str == null || (a = C89361p.m154885a((CharSequence) str, C88045d.f199951a)) < 0) {
            return null;
        }
        String substring = str.substring(0, a);
        C89219l.m154709a((Object) substring, "");
        return substring;
    }

    /* renamed from: c */
    public static boolean m150676c(String str) {
        if (str == null) {
            return false;
        }
        boolean g = C88045d.m153119g(str);
        if (!g && C88045d.m153118f(str)) {
            C88060b.m153136a("FileUtils", "remove file: " + str + " failed!", null);
            m150672a(str, str + "_dirty", true);
        }
        return g;
    }

    /* renamed from: a */
    public static long m150669a(String str) {
        C88049f c;
        long j;
        if (str == null || (c = C88045d.m153113c(str)) == null) {
            return 0;
        }
        if (c.f199965g == EnumC88052i.Directory) {
            List<C88049f> a = C88045d.m153105a(str);
            if (a == null) {
                return 0;
            }
            long j2 = 0;
            for (T t : a) {
                if (t.f199965g == EnumC88052i.Directory) {
                    j = m150669a(t.f199960b.f199967a);
                } else {
                    Long l = t.f199964f;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                }
                j2 += j;
            }
            return j2;
        }
        Long l2 = c.f199964f;
        if (l2 != null) {
            return l2.longValue();
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m150671a(C88051h hVar) {
        if (hVar == null) {
            return false;
        }
        boolean c = C88045d.m153114c(hVar);
        if (!c && C88045d.m153110b(hVar)) {
            C88060b.m153136a("FileUtils", "remove file: " + hVar.f199967a + " failed!", null);
            m150672a(hVar.f199967a, hVar.f199967a + "_dirty", true);
        }
        return c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|18|19|20|21) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m150675b(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r4, r0)
            p4600h.p4611f.p4613b.C89219l.m154719c(r5, r0)
            boolean r0 = p4600h.p4622m.C89361p.m154870a(r4)
            r3 = 0
            if (r0 != 0) goto L_0x0015
            boolean r0 = p4600h.p4622m.C89361p.m154870a(r5)
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            return r3
        L_0x0016:
            java.lang.String r0 = "_tmp"
            java.lang.String r2 = m150670a(r5, r0)
            r1 = 1
            if (r2 == 0) goto L_0x0025
            boolean r0 = p4600h.p4622m.C89361p.m154870a(r2)
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            return r3
        L_0x0026:
            p4519d.p4520a.p4530d.p4531a.C88045d.m153119g(r2)     // Catch:{ Exception -> 0x003a }
            p4519d.p4520a.p4530d.p4531a.C88045d.m153112b(r4, r2)     // Catch:{ Exception -> 0x003a }
            boolean r0 = m150672a(r2, r5, r3)     // Catch:{ Exception -> 0x003a }
            if (r0 == 0) goto L_0x0033
            return r1
        L_0x0033:
            p4519d.p4520a.p4530d.p4531a.C88045d.m153119g(r2)     // Catch:{ Exception -> 0x003a }
            p4519d.p4520a.p4530d.p4531a.C88045d.m153119g(r5)     // Catch:{ Exception -> 0x003a }
            return r3
        L_0x003a:
            r0 = move-exception
            p4519d.p4520a.p4530d.p4531a.C88045d.m153119g(r2)     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            p4519d.p4520a.p4530d.p4531a.C88045d.m153119g(r5)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.util.C86994k.m150675b(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static String m150670a(String str, String str2) {
        C89219l.m154719c(str2, "");
        if (str == null) {
            return null;
        }
        if (C89361p.m154876c(str, C88045d.f199951a, false)) {
            return C89361p.m154823b(str, 1) + str2 + C88045d.f199951a;
        }
        return str + str2;
    }

    /* renamed from: a */
    public static boolean m150672a(String str, String str2, boolean z) {
        C89219l.m154719c(str2, "");
        if (str == null) {
            return false;
        }
        if (C88045d.m153108a(str, str2)) {
            return true;
        }
        if (z) {
            return C88045d.m153107a(new C88051h(str), new C88051h(str2));
        }
        return false;
    }

    /* renamed from: a */
    public static long m150668a(C88044c cVar, C88050g gVar, long j, AbstractC89183m<? super Integer, ? super Long, C89391z> mVar) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(gVar, "");
        byte[] bArr = new byte[8192];
        int a = cVar.mo140022a(bArr, 8192);
        long j2 = 0;
        while (a > 0) {
            gVar.mo139998a(bArr, 0, a);
            j2 += (long) a;
            if (j2 < j && j > 0 && mVar != null) {
                mVar.invoke(Integer.valueOf((int) ((((float) j2) / ((float) j)) * 100.0f)), Long.valueOf(j));
            }
            a = cVar.mo140022a(bArr, 8192);
        }
        if (mVar != null) {
            mVar.invoke(100, Long.valueOf(j));
        }
        gVar.mo139999c();
        gVar.mo139996a();
        return j2;
    }

    /* renamed from: b */
    public static String m150673b(C88044c cVar, C88050g gVar, long j, AbstractC89183m<? super Integer, ? super Long, C89391z> mVar) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(gVar, "");
        C88034f fVar = new C88034f();
        byte[] bArr = new byte[8192];
        int a = cVar.mo140022a(bArr, 8192);
        long j2 = 0;
        while (a > 0) {
            gVar.mo139998a(bArr, 0, a);
            j2 += (long) a;
            fVar.mo142603a(bArr, a);
            if (j2 < j && j > 0 && mVar != null) {
                mVar.invoke(Integer.valueOf((int) ((((float) j2) / ((float) j)) * 100.0f)), Long.valueOf(j));
            }
            a = cVar.mo140022a(bArr, 8192);
        }
        if (mVar != null) {
            mVar.invoke(100, Long.valueOf(j));
        }
        byte[] b = fVar.mo142608b();
        gVar.mo139999c();
        gVar.mo139996a();
        return C88030c.m153082a(b);
    }
}
