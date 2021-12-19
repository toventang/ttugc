package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.effectplatform.EffectPlatform;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.al */
public final class C71046al {
    static {
        Covode.recordClassIndex(83544);
    }

    /* renamed from: a */
    public static final String m125454a() {
        StringBuilder sb = new StringBuilder();
        File file = EffectPlatform.f108129c;
        C89219l.m154716b(file, "");
        return sb.append(file.getAbsolutePath()).append(File.separator).append(System.currentTimeMillis()).append("-pin.json").toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.nio.ByteBuffer m125455a(java.lang.String r5) {
        /*
            r4 = 0
            if (r5 != 0) goto L_0x0004
            return r4
        L_0x0004:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0026, all -> 0x001f }
            java.lang.String r0 = "r"
            r3.<init>(r5, r0)     // Catch:{ Exception -> 0x0026, all -> 0x001f }
            long r1 = r3.length()     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            int r0 = (int) r1     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            byte[] r4 = new byte[r0]     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r3.readFully(r4)     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r3.close()
            goto L_0x002d
        L_0x0019:
            r0 = move-exception
            r4 = r3
            goto L_0x0020
        L_0x001c:
            r0 = r4
            r4 = r3
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
        L_0x0020:
            if (r4 == 0) goto L_0x0025
            r4.close()
        L_0x0025:
            throw r0
        L_0x0026:
            r0 = r4
        L_0x0027:
            if (r4 == 0) goto L_0x002c
            r4.close()
        L_0x002c:
            r4 = r0
        L_0x002d:
            if (r4 == 0) goto L_0x0038
            int r0 = r4.length
        L_0x0030:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r0.put(r4)
            return r0
        L_0x0038:
            r0 = 0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71046al.m125455a(java.lang.String):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public static final void m125456a(String str, ByteBuffer byteBuffer) {
        MethodCollector.m26663i(5671);
        if (str == null || byteBuffer == null) {
            MethodCollector.m26664o(5671);
            return;
        }
        FileChannel fileChannel = null;
        try {
            fileChannel = new FileOutputStream(str).getChannel();
            fileChannel.write(byteBuffer);
        } catch (Exception unused) {
            if (fileChannel == null) {
                MethodCollector.m26664o(5671);
                return;
            }
        } catch (Throwable th) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            MethodCollector.m26664o(5671);
            throw th;
        }
        fileChannel.close();
        MethodCollector.m26664o(5671);
    }
}
