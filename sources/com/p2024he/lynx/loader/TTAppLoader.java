package com.p2024he.lynx.loader;

import android.content.ContextWrapper;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.he.lynx.loader.TTAppLoader */
public final class TTAppLoader {
    private long _ptr;
    public final Loader impl;

    static {
        Covode.recordClassIndex(33792);
    }

    private static native void nativeCleanup();

    public static native void nativeReject(long j, String str);

    public static native void nativeResolve(long j, ByteBuffer byteBuffer);

    public static native void nativeResolveBytes(long j, byte[] bArr, int i, int i2);

    public static native void nativeResolveFile(long j, String str);

    public final native void setup(String str, int i);

    public final void cleanup() {
        MethodCollector.m26663i(37);
        this._ptr = 0;
        nativeCleanup();
        MethodCollector.m26664o(37);
    }

    public TTAppLoader(Loader loader) {
        this.impl = loader;
    }

    private byte[] reflectedLoadSync(String str) {
        return this.impl.loadSync(str);
    }

    public final Uri loadMedia(String str) {
        return this.impl.loadMedia(str);
    }

    private String reflectedLoadMedia(String str) {
        Uri loadMedia = this.impl.loadMedia(str);
        if (loadMedia == null) {
            return null;
        }
        return loadMedia.toString();
    }

    public final void setup(ContextWrapper contextWrapper) {
        MethodCollector.m26663i(32);
        setup(null, 0);
        MethodCollector.m26664o(32);
    }

    /* renamed from: com.he.lynx.loader.TTAppLoader$ResolverImpl */
    static final class ResolverImpl implements Resolver {

        /* renamed from: id */
        final long f65821id;
        final String path;
        boolean resolved;

        static {
            Covode.recordClassIndex(33793);
        }

        @Override // com.p2024he.lynx.loader.Resolver
        public final void reject(IOException iOException) {
            MethodCollector.m26663i(892);
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeReject(this.f65821id, iOException.getMessage());
                MethodCollector.m26664o(892);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("request has been resolved");
            MethodCollector.m26664o(892);
            throw runtimeException;
        }

        @Override // com.p2024he.lynx.loader.Resolver
        public final void resolve(File file) {
            MethodCollector.m26663i(889);
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeResolveFile(this.f65821id, file.getPath());
                MethodCollector.m26664o(889);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("request has been resolved");
            MethodCollector.m26664o(889);
            throw runtimeException;
        }

        @Override // com.p2024he.lynx.loader.Resolver
        public final void resolve(ByteBuffer byteBuffer) {
            MethodCollector.m26663i(886);
            if (!this.resolved) {
                this.resolved = true;
                if (byteBuffer.isDirect()) {
                    TTAppLoader.nativeResolve(this.f65821id, byteBuffer);
                    MethodCollector.m26664o(886);
                    return;
                }
                byte[] array = byteBuffer.array();
                TTAppLoader.nativeResolveBytes(this.f65821id, array, 0, array.length);
                MethodCollector.m26664o(886);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("request has been resolved");
            MethodCollector.m26664o(886);
            throw runtimeException;
        }

        ResolverImpl(String str, long j) {
            this.path = str;
            this.f65821id = j;
        }

        @Override // com.p2024he.lynx.loader.Resolver
        public final void resolve(byte[] bArr, int i, int i2) {
            MethodCollector.m26663i(880);
            if (!this.resolved) {
                this.resolved = true;
                TTAppLoader.nativeResolveBytes(this.f65821id, bArr, i, i2);
                MethodCollector.m26664o(880);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("request has been resolved");
            MethodCollector.m26664o(880);
            throw runtimeException;
        }
    }

    private void reflectedLoad(String str, long j) {
        this.impl.load(str, new ResolverImpl(str, j));
    }

    private void reflectedLoadUrl(String str, long j) {
        this.impl.loadUrl(str, new ResolverImpl(str, j));
    }

    private void reflectedPostUrl(String str, byte[] bArr, String str2, long j) {
        try {
            this.impl.getClass().getDeclaredMethod(UGCMonitor.TYPE_POST, String.class, byte[].class, String.class, Resolver.class).invoke(this.impl, str, bArr, str2, new ResolverImpl(str, j));
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
