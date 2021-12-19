package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ttnet.org.chromium.net.impl.g */
final class C87596g implements ReadableByteChannel {

    /* renamed from: a */
    private final InputStream f198927a;

    /* renamed from: b */
    private final AtomicBoolean f198928b = new AtomicBoolean(true);

    static {
        Covode.recordClassIndex(103578);
    }

    public final boolean isOpen() {
        return this.f198928b.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f198928b.compareAndSet(true, false)) {
            this.f198927a.close();
        }
    }

    private C87596g(InputStream inputStream) {
        this.f198927a = inputStream;
    }

    /* renamed from: a */
    static ReadableByteChannel m152310a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        return new C87596g(inputStream);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        int read;
        MethodCollector.m26663i(5561);
        if (byteBuffer.hasArray()) {
            read = this.f198927a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read > 0) {
                byteBuffer.position(byteBuffer.position() + read);
            }
        } else {
            byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.f198927a.available(), 4096), byteBuffer.remaining()))];
            read = this.f198927a.read(bArr);
            if (read > 0) {
                byteBuffer.put(bArr, 0, read);
            }
        }
        MethodCollector.m26664o(5561);
        return read;
    }
}
