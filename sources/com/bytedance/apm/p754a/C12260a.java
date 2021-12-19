package com.bytedance.apm.p754a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.bytedance.apm.a.a */
public final class C12260a {

    /* renamed from: a */
    public static volatile AbstractC12269f f29538a;

    static {
        Covode.recordClassIndex(13996);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (r4.exists() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        m22037a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x006a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m22035a(java.util.List<java.lang.String> r8) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p754a.C12260a.m22035a(java.util.List):java.lang.String");
    }

    /* renamed from: a */
    private static boolean m22037a(File file) {
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ac A[SYNTHETIC, Splitter:B:60:0x01ac] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22036a(java.lang.String r12, long r13, long r15, java.lang.String r17, final com.bytedance.apm.p754a.AbstractC12267d r18) {
        /*
        // Method dump skipped, instructions count: 437
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p754a.C12260a.m22036a(java.lang.String, long, long, java.lang.String, com.bytedance.apm.a.d):void");
    }
}
