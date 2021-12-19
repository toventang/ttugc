package com.facebook.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14714h;
import okhttp3.AbstractC90202u;
import okhttp3.C90208y;

/* renamed from: com.facebook.net.a */
public class C24890a {

    /* renamed from: a */
    private static C90208y f59082a;

    static {
        Covode.recordClassIndex(29083);
    }

    /* renamed from: a */
    public static C90208y m47718a() {
        MethodCollector.m26663i(6228);
        synchronized (C24890a.class) {
            try {
                C90208y yVar = f59082a;
                if (yVar != null) {
                    return yVar;
                }
                C90208y.C90210a aVar = new C90208y.C90210a();
                aVar.mo145096a(new C14714h());
                aVar.f204936f.add(new AbstractC90202u() {
                    /* class com.facebook.net.C24890a.C248911 */

                    static {
                        Covode.recordClassIndex(29084);
                    }

                    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|(1:4)(1:5)|(1:7)|8|9|10|(3:12|13|24)(1:26)|(1:(1:22))) */
                    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
                        r4 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
                        if (r1 != null) goto L_0x0037;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                        r2 = r4.getMessage();
                        r3 = new java.lang.StringBuilder();
                        r0 = r3.append(r1.getAddress().getHostAddress()).append("|");
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
                        if (r2 == null) goto L_0x0054;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
                        r2 = "null";
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
                        r0.append(r2);
                        com.bytedance.common.utility.reflect.Reflect.m24529on(r4).set("detailMessage", r3.toString());
                     */
                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
                    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[SYNTHETIC, Splitter:B:12:0x001e] */
                    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
                    @Override // okhttp3.AbstractC90202u
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final okhttp3.C90029ac intercept(okhttp3.AbstractC90202u.AbstractC90203a r6) {
                        /*
                        // Method dump skipped, instructions count: 103
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.C24890a.C248911.intercept(okhttp3.u$a):okhttp3.ac");
                    }
                });
                C90208y d = aVar.mo145103d();
                f59082a = d;
                MethodCollector.m26664o(6228);
                return d;
            } finally {
                MethodCollector.m26664o(6228);
            }
        }
    }
}
