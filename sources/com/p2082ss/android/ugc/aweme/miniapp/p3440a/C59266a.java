package com.p2082ss.android.ugc.aweme.miniapp.p3440a;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.p1291a.C18411b;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.Arrays;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.miniapp.a.a */
public final class C59266a {

    /* renamed from: a */
    public static final C59266a f135480a = new C59266a();

    private C59266a() {
    }

    static {
        Covode.recordClassIndex(69632);
    }

    /* renamed from: a */
    public static String m108964a(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            C28025r d = ((C28022o) C80342dg.m139300a().mo46670a(str, C28022o.class)).mo46804d("resso_label");
            C89219l.m154716b(d, "");
            return d.mo46689c();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static C89378p<Long, Integer> m108966b(String str) {
        C28022o f;
        C28022o a = C59267b.m108967a();
        int i = 0;
        long j = Long.MAX_VALUE;
        if (a != null) {
            try {
                if (a.mo46802b(str) && (f = a.mo46807f(str)) != null) {
                    C28025r d = f.mo46804d("show_interval_in_millSeconds");
                    if (d != null) {
                        j = d.mo46693f();
                    } else {
                        j = 0;
                    }
                    C28025r d2 = f.mo46804d("max_finish_count");
                    if (d2 != null) {
                        i = d2.mo46694g();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new C89378p<>(Long.valueOf(j), Integer.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m108965a(android.content.Context r10, java.lang.String r11) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r10, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r11, r0)
            com.google.gson.o r1 = com.p2082ss.android.ugc.aweme.miniapp.p3440a.C59267b.m108967a()
            r4 = 0
            r9 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L_0x0042
            boolean r0 = r1.mo46802b(r11)     // Catch:{ Exception -> 0x003e }
            if (r0 == 0) goto L_0x0042
            com.google.gson.o r1 = r1.mo46807f(r11)     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0042
            java.lang.String r0 = "show_interval_in_millSeconds"
            com.google.gson.r r0 = r1.mo46804d(r0)     // Catch:{ Exception -> 0x003e }
            if (r0 == 0) goto L_0x003b
            long r7 = r0.mo46693f()     // Catch:{ Exception -> 0x003e }
        L_0x002e:
            java.lang.String r0 = "max_finish_count"
            com.google.gson.r r0 = r1.mo46804d(r0)     // Catch:{ Exception -> 0x003e }
            if (r0 == 0) goto L_0x0042
            int r6 = r0.mo46694g()     // Catch:{ Exception -> 0x003e }
            goto L_0x0043
        L_0x003b:
            r7 = 0
            goto L_0x002e
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0042:
            r6 = 0
        L_0x0043:
            com.ss.android.ugc.aweme.miniapp.a.c r0 = m108963a(r11, r10)
            if (r0 == 0) goto L_0x005a
            long r4 = r0.f135485b
            int r3 = r0.f135484a
        L_0x004d:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r4
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x005c
            if (r3 >= r6) goto L_0x005c
            r0 = 1
            return r0
        L_0x005a:
            r3 = 0
            goto L_0x004d
        L_0x005c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.miniapp.p3440a.C59266a.m108965a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static C59268c m108963a(String str, Context context) {
        boolean z;
        Object obj;
        long j;
        int i = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String a = C1764a.m5928a("resso_exp_%s", Arrays.copyOf(new Object[]{g.getCurUserId()}, 1));
        C89219l.m154716b(a, "");
        try {
            Object a2 = C18411b.m34269a(context).mo29433a(a);
            if (!(a2 instanceof Map)) {
                a2 = null;
            }
            Map map = (Map) a2;
            if (map != null) {
                obj = map.get(str);
            } else {
                obj = null;
            }
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map2 = (Map) obj;
            if (map2 != null) {
                Object obj2 = map2.get("lifetime_finished_count");
                if (!(obj2 instanceof Double)) {
                    obj2 = null;
                }
                Double d = (Double) obj2;
                if (d != null) {
                    i = (int) d.doubleValue();
                }
                Object obj3 = map2.get("last_finished_time");
                if (!(obj3 instanceof Double)) {
                    obj3 = null;
                }
                Double d2 = (Double) obj3;
                if (d2 != null) {
                    j = (long) d2.doubleValue();
                } else {
                    j = 0;
                }
                return new C59268c(i, j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
