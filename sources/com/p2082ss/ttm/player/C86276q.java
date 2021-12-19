package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ss.ttm.player.q */
public final class C86276q {
    static {
        Covode.recordClassIndex(101453);
    }

    /* renamed from: a */
    public static void m148501a(String str) {
        File file = new File(str);
        if (file.exists()) {
            m148502a(file);
        }
    }

    /* renamed from: a */
    private static boolean m148502a(File file) {
        MethodCollector.m26663i(3404);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(3404);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(3404);
        return delete;
    }

    /* renamed from: a */
    private static void m148500a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(3487);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                MethodCollector.m26664o(3487);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[SYNTHETIC, Splitter:B:25:0x006d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m148499a(android.content.Context r8, java.lang.String r9, java.lang.StringBuilder r10) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttm.player.C86276q.m148499a(android.content.Context, java.lang.String, java.lang.StringBuilder):java.lang.String");
    }
}
