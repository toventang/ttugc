package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imageutils.C24658b;
import java.io.Closeable;
import java.nio.ByteBuffer;

public class NativeMemoryChunk implements AbstractC24502r, Closeable {
    private boolean mIsClosed;
    private final long mNativePtr;
    private final int mSize;

    /* renamed from: com_facebook_imagepipeline_memory_NativeMemoryChunk_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m46719xd42f05fb(String str, String str2) {
        return 0;
    }

    private static native long nativeAllocate(int i);

    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeFree(long j);

    private static native void nativeMemcpy(long j, long j2, int i);

    private static native byte nativeReadByte(long j);

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public long getNativePtr() {
        return this.mNativePtr;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public int getSize() {
        return this.mSize;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public long getUniqueId() {
        return this.mNativePtr;
    }

    public NativeMemoryChunk() {
        this.mIsClosed = true;
    }

    static {
        Covode.recordClassIndex(28615);
        C24658b.m47175a("imagepipeline");
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public synchronized boolean isClosed() {
        boolean z;
        MethodCollector.m26663i(4137);
        z = this.mIsClosed;
        MethodCollector.m26664o(4137);
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.facebook.imagepipeline.memory.AbstractC24502r
    public synchronized void close() {
        MethodCollector.m26663i(4086);
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
        MethodCollector.m26664o(4086);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        if (!isClosed()) {
            m46719xd42f05fb("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public NativeMemoryChunk(int i) {
        boolean z;
        MethodCollector.m26663i(4082);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        this.mSize = i;
        this.mNativePtr = nativeAllocate(i);
        this.mIsClosed = false;
        MethodCollector.m26664o(4082);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public synchronized byte read(int i) {
        boolean z;
        boolean z2;
        byte nativeReadByte;
        MethodCollector.m26663i(4153);
        boolean z3 = true;
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24091i.m45620a(z2);
        if (i >= this.mSize) {
            z3 = false;
        }
        C24091i.m45620a(z3);
        nativeReadByte = nativeReadByte(this.mNativePtr + ((long) i));
        MethodCollector.m26664o(4153);
        return nativeReadByte;
    }

    private void doCopy(int i, AbstractC24502r rVar, int i2, int i3) {
        MethodCollector.m26663i(4169);
        if (rVar instanceof NativeMemoryChunk) {
            C24091i.m45622b(!isClosed());
            C24091i.m45622b(!rVar.isClosed());
            C24504t.m46822a(i, rVar.getSize(), i2, i3, this.mSize);
            nativeMemcpy(rVar.getNativePtr() + ((long) i2), this.mNativePtr + ((long) i), i3);
            MethodCollector.m26664o(4169);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        MethodCollector.m26664o(4169);
        throw illegalArgumentException;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int a;
        MethodCollector.m26663i(4144);
        C24091i.m45617a(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        a = C24504t.m46821a(i, i3, this.mSize);
        C24504t.m46822a(i, bArr.length, i2, a, this.mSize);
        nativeCopyFromByteArray(this.mNativePtr + ((long) i), bArr, i2, a);
        MethodCollector.m26664o(4144);
        return a;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int a;
        MethodCollector.m26663i(4148);
        C24091i.m45617a(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        a = C24504t.m46821a(i, i3, this.mSize);
        C24504t.m46822a(i, bArr.length, i2, a, this.mSize);
        nativeCopyToByteArray(this.mNativePtr + ((long) i), bArr, i2, a);
        MethodCollector.m26664o(4148);
        return a;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public void copy(int i, AbstractC24502r rVar, int i2, int i3) {
        MethodCollector.m26663i(4158);
        C24091i.m45617a(rVar);
        if (rVar.getUniqueId() == getUniqueId()) {
            m46719xd42f05fb("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(rVar)) + " which share the same address " + Long.toHexString(this.mNativePtr));
            C24091i.m45620a(false);
        }
        if (rVar.getUniqueId() < getUniqueId()) {
            synchronized (rVar) {
                try {
                    synchronized (this) {
                        try {
                            doCopy(i, rVar, i2, i3);
                        } finally {
                            MethodCollector.m26664o(4158);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(4158);
                }
            }
            return;
        }
        synchronized (this) {
            try {
                synchronized (rVar) {
                    try {
                        doCopy(i, rVar, i2, i3);
                    } finally {
                        MethodCollector.m26664o(4158);
                    }
                }
            } finally {
                MethodCollector.m26664o(4158);
            }
        }
    }
}
