package com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45808b;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.b.a */
public final class C45806a {

    /* renamed from: b */
    public static final C45807a f106719b = new C45807a((byte) 0);

    /* renamed from: a */
    public final C45808b.C45809a f106720a;

    static {
        Covode.recordClassIndex(54325);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.b.a$a */
    public static final class C45807a {
        static {
            Covode.recordClassIndex(54326);
        }

        private C45807a() {
        }

        public /* synthetic */ C45807a(byte b) {
            this();
        }
    }

    public C45806a(String str) {
        C89219l.m154721d(str, "");
        this.f106720a = C45808b.f106721a.mo77120a(str);
    }

    /* renamed from: d */
    private static Boolean m88418d(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        C89219l.m154716b(lowerCase, "");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3569038) {
            if (hashCode == 97196323 && lowerCase.equals("false")) {
                return false;
            }
            return null;
        } else if (lowerCase.equals("true")) {
            return true;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d6, code lost:
        r2 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d6 A[EDGE_INSN: B:52:0x00d6->B:47:0x00d6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo77114a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a.mo77114a(java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5 A[EDGE_INSN: B:39:0x00c5->B:37:0x00c5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo77118b(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a.mo77118b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public final long mo77119c(String str) {
        C89219l.m154721d(str, "");
        Long l = 0L;
        Class cls = Long.TYPE;
        C45808b.C45809a aVar = this.f106720a;
        while (true) {
            if (aVar == null) {
                break;
            }
            Object obj = C45808b.f106721a.mo77121a(aVar).get(str);
            Long l2 = null;
            if (obj != null) {
                if (C89219l.m154714a(cls, obj.getClass())) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
                    l2 = (Long) obj;
                } else if (C89219l.m154714a(cls, String.class)) {
                    String obj2 = obj.toString();
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                    l2 = (Long) obj2;
                } else if (C89219l.m154714a(cls, Boolean.TYPE)) {
                    m88418d(obj.toString());
                } else if (C89219l.m154714a(cls, Integer.TYPE)) {
                    C89361p.m154863e(obj.toString());
                } else if (C89219l.m154714a(cls, Long.TYPE)) {
                    Long g = C89361p.m154865g(obj.toString());
                    if ((g instanceof Long) && g != null) {
                        l2 = g;
                    }
                } else if (C89219l.m154714a(cls, Double.TYPE)) {
                    C89361p.m154862d(obj.toString());
                } else if (C89219l.m154714a(cls, Float.TYPE)) {
                    C89361p.m154861c(obj.toString());
                } else if (C89219l.m154714a(cls, Object.class)) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
                    l2 = (Long) obj;
                } else {
                    throw new RuntimeException(cls.getName() + " is not VALID.");
                }
            }
            if (C89219l.m154714a((Object) l2, (Object) "#$&*REMOVED*&$#")) {
                break;
            } else if (l2 != null) {
                l = l2;
                break;
            } else {
                aVar = aVar.f106728a;
            }
        }
        return l.longValue();
    }

    /* renamed from: a */
    public final void mo77115a(String str, int i) {
        C89219l.m154721d(str, "");
        Integer valueOf = Integer.valueOf(i);
        C45808b bVar = C45808b.f106721a;
        C45808b.C45809a aVar = this.f106720a;
        if (aVar == null) {
            C89219l.m154715b();
        }
        bVar.mo77121a(aVar).put(str, valueOf);
    }

    /* renamed from: a */
    public final void mo77116a(String str, long j) {
        C89219l.m154721d(str, "");
        Long valueOf = Long.valueOf(j);
        C45808b bVar = C45808b.f106721a;
        C45808b.C45809a aVar = this.f106720a;
        if (aVar == null) {
            C89219l.m154715b();
        }
        bVar.mo77121a(aVar).put(str, valueOf);
    }

    /* renamed from: a */
    public final void mo77117a(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        if (!z) {
            if (str2 != null) {
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                str2 = str2.toLowerCase();
                C89219l.m154716b(str2, "");
            } else {
                str2 = null;
            }
        }
        C45808b bVar = C45808b.f106721a;
        C45808b.C45809a aVar = this.f106720a;
        if (aVar == null) {
            C89219l.m154715b();
        }
        Map<String, Object> a = bVar.mo77121a(aVar);
        if (str2 == null) {
            a.remove(str);
        } else {
            a.put(str, str2);
        }
    }
}
