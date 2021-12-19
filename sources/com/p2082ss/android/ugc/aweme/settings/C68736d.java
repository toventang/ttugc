package com.p2082ss.android.ugc.aweme.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.settings.d */
public final class C68736d {

    /* renamed from: a */
    public static final int f153759a = 2;

    /* renamed from: b */
    public static Integer f153760b;

    /* renamed from: c */
    public static final C68736d f153761c = new C68736d();

    /* renamed from: d */
    private static File f153762d;

    private C68736d() {
    }

    static {
        Covode.recordClassIndex(81005);
    }

    /* renamed from: com.ss.android.ugc.aweme.settings.d$a */
    public static final class RunnableC68737a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f153763a;

        static {
            Covode.recordClassIndex(81006);
        }

        public RunnableC68737a(Context context) {
            this.f153763a = context;
        }

        public final void run() {
            MethodCollector.m26663i(4149);
            int a = SettingsManager.m29616a().mo25394a("covode_config", 2);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(C68736d.m121170b(this.f153763a)));
                dataOutputStream.writeInt(a);
                dataOutputStream.close();
                MethodCollector.m26664o(4149);
            } catch (Throwable unused) {
                MethodCollector.m26664o(4149);
            }
        }
    }

    /* renamed from: b */
    public static File m121170b(Context context) {
        File c = m121171c(context);
        f153762d = new File(c, "covode_enable");
        if (c.exists()) {
            c.mkdir();
        }
        File file = f153762d;
        Objects.requireNonNull(file, "null cannot be cast to non-null type java.io.File");
        return file;
    }

    /* renamed from: c */
    private static File m121171c(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|10) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0029 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m121169a(android.content.Context r5) {
        /*
            r4 = 3382(0xd36, float:4.739E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            int r3 = com.p2082ss.android.ugc.aweme.settings.C68736d.f153759a
            java.io.File r0 = m121170b(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0015
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        L_0x0015:
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ all -> 0x0029 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
            java.io.File r0 = com.p2082ss.android.ugc.aweme.settings.C68736d.f153762d     // Catch:{ all -> 0x0029 }
            r1.<init>(r0)     // Catch:{ all -> 0x0029 }
            r2.<init>(r1)     // Catch:{ all -> 0x0029 }
            int r3 = r2.readInt()     // Catch:{ all -> 0x0029 }
            r2.close()     // Catch:{ all -> 0x0029 }
            goto L_0x0034
        L_0x0029:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.m29616a()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "covode_config"
            r0 = 2
            int r3 = r2.mo25394a(r1, r0)     // Catch:{ all -> 0x0034 }
        L_0x0034:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.settings.C68736d.m121169a(android.content.Context):int");
    }
}
