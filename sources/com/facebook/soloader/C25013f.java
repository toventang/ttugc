package com.facebook.soloader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: com.facebook.soloader.f */
public final class C25013f implements Closeable {

    /* renamed from: a */
    private final FileOutputStream f59351a;

    /* renamed from: b */
    private final FileLock f59352b;

    static {
        Covode.recordClassIndex(30345);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            FileLock fileLock = this.f59352b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f59351a.close();
        }
    }

    C25013f(File file) {
        MethodCollector.m26663i(9741);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f59351a = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f59352b = lock;
            MethodCollector.m26664o(9741);
        } catch (Throwable th) {
            this.f59351a.close();
            MethodCollector.m26664o(9741);
            throw th;
        }
    }
}
