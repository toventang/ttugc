package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.installations.b */
public final class C27827b {

    /* renamed from: a */
    private final FileChannel f65372a;

    /* renamed from: b */
    private final FileLock f65373b;

    static {
        Covode.recordClassIndex(33416);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46512a() {
        try {
            this.f65373b.release();
            this.f65372a.close();
        } catch (IOException unused) {
        }
    }

    private C27827b(FileChannel fileChannel, FileLock fileLock) {
        this.f65372a = fileChannel;
        this.f65373b = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[SYNTHETIC, Splitter:B:18:0x0032] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.installations.C27827b m55671a(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException | Error -> 0x0036 }
            java.io.File r0 = com.p2082ss.android.ugc.aweme.lancet.C58016d.f132222c     // Catch:{ IOException | Error -> 0x0036 }
            if (r0 == 0) goto L_0x000b
            boolean r0 = com.p2082ss.android.ugc.aweme.lancet.C58016d.f132224e     // Catch:{ IOException | Error -> 0x0036 }
            if (r0 != 0) goto L_0x0011
        L_0x000b:
            java.io.File r0 = r4.getFilesDir()     // Catch:{ IOException | Error -> 0x0036 }
            com.p2082ss.android.ugc.aweme.lancet.C58016d.f132222c = r0     // Catch:{ IOException | Error -> 0x0036 }
        L_0x0011:
            java.io.File r0 = com.p2082ss.android.ugc.aweme.lancet.C58016d.f132222c     // Catch:{ IOException | Error -> 0x0036 }
            r2.<init>(r0, r5)     // Catch:{ IOException | Error -> 0x0036 }
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException | Error -> 0x0036 }
            java.lang.String r0 = "rw"
            r1.<init>(r2, r0)     // Catch:{ IOException | Error -> 0x0036 }
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch:{ IOException | Error -> 0x0036 }
            java.nio.channels.FileLock r1 = r2.lock()     // Catch:{ IOException | Error -> 0x0030 }
            com.google.firebase.installations.b r0 = new com.google.firebase.installations.b     // Catch:{ IOException | Error -> 0x002b }
            r0.<init>(r2, r1)     // Catch:{ IOException | Error -> 0x002b }
            return r0
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.release()
        L_0x0030:
            if (r2 == 0) goto L_0x0037
            r2.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0037
        L_0x0036:
            r0 = r3
        L_0x0037:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C27827b.m55671a(android.content.Context, java.lang.String):com.google.firebase.installations.b");
    }
}
