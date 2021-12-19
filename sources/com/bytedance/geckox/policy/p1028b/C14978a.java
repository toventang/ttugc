package com.bytedance.geckox.policy.p1028b;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.geckox.policy.b.a */
public final class C14978a {

    /* renamed from: a */
    public static Map<String, UpdatePackage> f36587a;

    /* renamed from: b */
    public static Map<String, UpdatePackage> f36588b;

    /* renamed from: c */
    public C14905e f36589c;

    static {
        Covode.recordClassIndex(17115);
    }

    /* renamed from: a */
    public static void m27578a(String str, UpdatePackage updatePackage) {
        if (f36587a == null) {
            f36587a = new ConcurrentHashMap();
        }
        f36587a.put(str, updatePackage);
    }

    /* renamed from: a */
    public final void mo24191a(final String str, final Map<String, List<CheckRequestBodyModel.TargetChannel>> map, final OptionCheckUpdateParams optionCheckUpdateParams) {
        GlobalConfigSettings e = C14930f.m27473a().mo24034e();
        if (e != null && e.getReqMeta() != null && e.getReqMeta().getLazy() != null) {
            this.f36589c.f36404c.execute(new Runnable() {
                /* class com.bytedance.geckox.policy.p1028b.C14978a.RunnableC149791 */

                static {
                    Covode.recordClassIndex(17116);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
                    com.bytedance.geckox.p1022i.C14957a.m27542a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:63:0x01bd, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:64:0x01be, code lost:
                    if (r5 != null) goto L_0x01c0;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c0, code lost:
                    r5.mo24042a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c3, code lost:
                    com.bytedance.geckox.p1022i.C14957a.m27543a("lazy update finished");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ca, code lost:
                    throw r1;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:68:0x01cb, code lost:
                    if (r5 != null) goto L_0x01cd;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:69:0x01cd, code lost:
                    r5.mo24042a();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d0, code lost:
                    com.bytedance.geckox.p1022i.C14957a.m27543a("lazy update finished");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d7, code lost:
                    return;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x01b9 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 472
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.policy.p1028b.C14978a.RunnableC149791.run():void");
                }
            });
        }
    }
}
