package com.bytedance.frameworks.baselib.network.http.p988d.p989a;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import okhttp3.AbstractC90186m;
import okhttp3.AbstractC90202u;
import okhttp3.C90180j;
import okhttp3.C90182k;
import okhttp3.C90208y;
import okhttp3.EnumC90035af;
import okhttp3.EnumC90211z;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.g */
public final class C14711g {

    /* renamed from: a */
    public static AbstractC14713a f35782a;

    /* renamed from: c */
    private static int f35783c;

    /* renamed from: b */
    private C90208y f35784b;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.g$a */
    public interface AbstractC14713a {
        static {
            Covode.recordClassIndex(16810);
        }

        /* renamed from: a */
        void mo23716a(C90208y.C90210a aVar);
    }

    static {
        Covode.recordClassIndex(16808);
    }

    /* renamed from: a */
    public final C90208y mo23715a() {
        MethodCollector.m26663i(8989);
        synchronized (C14731e.class) {
            try {
                C90208y yVar = this.f35784b;
                if (yVar != null) {
                    int i = f35783c;
                    if (i > 0 && i < 4) {
                        C90208y.C90210a b = yVar.mo145086b();
                        m26937a(b);
                        b.mo145103d();
                    }
                    return this.f35784b;
                }
                C90208y.C90210a aVar = new C90208y.C90210a();
                int i2 = f35783c;
                if (i2 > 0 && i2 < 4) {
                    m26937a(aVar);
                }
                aVar.f204949s = new C90180j(15, 180000, TimeUnit.MILLISECONDS);
                aVar.mo145088a(15000, TimeUnit.MILLISECONDS);
                aVar.mo145098b(15000, TimeUnit.MILLISECONDS);
                aVar.mo145102c(15000, TimeUnit.MILLISECONDS);
                aVar.mo145100b(new AbstractC90202u() {
                    /* class com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14711g.C147121 */

                    static {
                        Covode.recordClassIndex(16809);
                    }

                    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|(1:4)(1:5)|(1:7)|8|9|10|(3:12|13|24)(1:26)|(1:(1:22))) */
                    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
                        r4 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
                        if (r5 != null) goto L_0x0037;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                        r2 = r4.getMessage();
                        r3 = new java.lang.StringBuilder();
                        r0 = r3.append(r5.getAddress().getHostAddress()).append("|");
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
                    public final okhttp3.C90029ac intercept(okhttp3.AbstractC90202u.AbstractC90203a r7) {
                        /*
                        // Method dump skipped, instructions count: 103
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14711g.C147121.intercept(okhttp3.u$a):okhttp3.ac");
                    }
                });
                aVar.mo145094a(C14715i.m26941a());
                aVar.mo145093a(AbstractC90186m.f204834a);
                aVar.mo145096a(new C14714h());
                aVar.mo145096a(new C14719l());
                C90208y.C90210a b2 = m26938b(aVar);
                b2.f204952v = true;
                AbstractC14713a aVar2 = f35782a;
                if (aVar2 != null) {
                    aVar2.mo23716a(b2);
                }
                C90208y d = b2.mo145103d();
                this.f35784b = d;
                MethodCollector.m26664o(8989);
                return d;
            } finally {
                MethodCollector.m26664o(8989);
            }
        }
    }

    /* renamed from: a */
    public static void m26936a(int i) {
        if (i > 0 && f35783c == 0) {
            f35783c = i;
        }
    }

    /* renamed from: a */
    private static void m26937a(C90208y.C90210a aVar) {
        if (aVar != null) {
            ArrayList arrayList = new ArrayList();
            int i = f35783c;
            if (i == 1) {
                arrayList.add(EnumC90211z.HTTP_2);
            } else if (i == 2) {
                arrayList.add(EnumC90211z.SPDY_3);
            } else if (i != 3) {
                arrayList.add(EnumC90211z.HTTP_2);
                arrayList.add(EnumC90211z.SPDY_3);
            }
            f35783c = 4;
            arrayList.add(EnumC90211z.HTTP_1_1);
            aVar.mo145089a(Collections.unmodifiableList(arrayList));
        }
    }

    /* renamed from: b */
    private static C90208y.C90210a m26938b(C90208y.C90210a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 22) {
            try {
                SSLContext instance = SSLContext.getInstance("TLSv1.2");
                instance.init(null, null, null);
                aVar.mo145090a(new C14730s(instance.getSocketFactory()));
                C90182k b = new C90182k.C90183a(C90182k.f204799b).mo145004a(EnumC90035af.TLS_1_2).mo145007b();
                ArrayList arrayList = new ArrayList();
                arrayList.add(b);
                arrayList.add(C90182k.f204800c);
                arrayList.add(C90182k.f204801d);
                aVar.mo145099b(arrayList);
            } catch (Exception unused) {
            }
        }
        return aVar;
    }
}
