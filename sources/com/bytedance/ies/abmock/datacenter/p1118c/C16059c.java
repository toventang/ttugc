package com.bytedance.ies.abmock.datacenter.p1118c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16075f;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bytedance.ies.abmock.datacenter.c.c */
public final class C16059c {

    /* renamed from: a */
    public static boolean f38682a;

    /* renamed from: b */
    public static C28022o f38683b;

    static {
        Covode.recordClassIndex(18330);
    }

    /* renamed from: com.bytedance.ies.abmock.datacenter.c.c$1 */
    public static /* synthetic */ class C160601 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38684a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.abmock.datacenter.p1118c.C16059c.C160601.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m29729a(C28022o oVar) {
        C28022o a = oVar.mo46697i();
        Iterator<String> it = a.f65804a.keySet().iterator();
        Map<String, ConfigItem> map = C16075f.f38715a;
        while (it.hasNext()) {
            String next = it.next();
            if (map != null && map.containsKey(next)) {
                it.remove();
            }
        }
        C16063e.f38688a.mo25483a(a);
    }

    /* renamed from: c */
    public static void m29732c(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C16057a.f38676a.mo25459b(str, c.mo46689c());
            } else if (oVar.mo46802b(str)) {
                C16057a.f38676a.mo25459b(str, (String) null);
            } else {
                C16057a.f38676a.mo25462c(str);
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: d */
    public static void m29733d(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C16057a.f38676a.mo25458b(str, c.mo46693f());
            } else {
                C16057a.f38676a.mo25462c(str);
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: e */
    public static void m29734e(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C16057a.f38676a.mo25455b(str, c.mo46690d());
            } else {
                C16057a.f38676a.mo25462c(str);
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: f */
    public static void m29735f(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C16057a.f38676a.mo25456b(str, c.mo46691e());
            } else {
                C16057a.f38676a.mo25462c(str);
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: h */
    public static void m29737h(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C16057a.f38676a.mo25459b(str, c.toString());
            } else if (oVar.mo46802b(str)) {
                C16057a.f38676a.mo25459b(str, (String) null);
            } else {
                C16057a.f38676a.mo25462c(str);
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: a */
    public static void m29730a(C28022o oVar, String str) {
        int i;
        try {
            C28025r d = oVar.mo46804d(str);
            if (d == null) {
                C16057a.f38676a.mo25462c(str);
            } else if (d.f65806a instanceof Boolean) {
                C16057a aVar = C16057a.f38676a;
                if (d.mo46695h()) {
                    i = 1;
                } else {
                    i = 0;
                }
                aVar.mo25457b(str, i);
            } else {
                C16057a.f38676a.mo25457b(str, d.mo46694g());
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: b */
    public static void m29731b(C28022o oVar, String str) {
        boolean z;
        try {
            C28025r d = oVar.mo46804d(str);
            if (d == null) {
                C16057a.f38676a.mo25462c(str);
            } else if (d.f65806a instanceof Number) {
                C16057a aVar = C16057a.f38676a;
                if (d.mo46694g() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo25460b(str, z);
            } else {
                C16057a.f38676a.mo25460b(str, d.mo46695h());
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }

    /* renamed from: g */
    public static void m29736g(C28022o oVar, String str) {
        try {
            AbstractC28019l c = oVar.mo46803c(str);
            if (c != null) {
                C16057a.f38676a.mo25452a(str, (String[]) C16057a.f38676a.mo25449a().mo46667a(c, String[].class));
            } else if (oVar.mo46802b(str)) {
                C16057a.f38676a.mo25452a(str, (String[]) null);
            } else {
                C16057a.f38676a.mo25462c(str);
            }
        } catch (Throwable th) {
            C13468b.m24209a(th + "  , key: " + str);
        }
    }
}
