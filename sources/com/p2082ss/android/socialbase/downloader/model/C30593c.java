package com.p2082ss.android.socialbase.downloader.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.ss.android.socialbase.downloader.model.c */
public final class C30593c implements Closeable {

    /* renamed from: a */
    public BufferedOutputStream f72999a;

    /* renamed from: b */
    public FileDescriptor f73000b;

    /* renamed from: c */
    private RandomAccessFile f73001c;

    static {
        Covode.recordClassIndex(37125);
    }

    /* renamed from: a */
    public final void mo54804a() {
        BufferedOutputStream bufferedOutputStream = this.f72999a;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
        FileDescriptor fileDescriptor = this.f73000b;
        if (fileDescriptor != null) {
            fileDescriptor.sync();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C30535g.m62556a(this.f73001c, this.f72999a);
    }

    /* renamed from: a */
    public final void mo54805a(long j) {
        this.f73001c.seek(j);
    }

    /* renamed from: b */
    public final void mo54807b(long j) {
        this.f73001c.setLength(j);
    }

    /* renamed from: a */
    public final void mo54806a(byte[] bArr, int i) {
        MethodCollector.m26663i(7319);
        this.f72999a.write(bArr, 0, i);
        MethodCollector.m26664o(7319);
    }

    public C30593c(File file, int i) {
        MethodCollector.m26663i(7317);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f73001c = randomAccessFile;
            this.f73000b = randomAccessFile.getFD();
            if (i > 0) {
                if (i < 8192) {
                    i = 8192;
                } else if (i > 131072) {
                    i = 131072;
                }
                this.f72999a = new BufferedOutputStream(new FileOutputStream(this.f73001c.getFD()), i);
                MethodCollector.m26664o(7317);
                return;
            }
            this.f72999a = new BufferedOutputStream(new FileOutputStream(this.f73001c.getFD()));
            MethodCollector.m26664o(7317);
        } catch (IOException e) {
            BaseException baseException = new BaseException(1039, e);
            MethodCollector.m26664o(7317);
            throw baseException;
        }
    }
}
