package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.i */
public final class C24491i implements AbstractC24502r, Closeable {

    /* renamed from: a */
    private ByteBuffer f58196a;

    /* renamed from: b */
    private final int f58197b;

    /* renamed from: c */
    private final long f58198c = ((long) System.identityHashCode(this));

    static {
        Covode.recordClassIndex(28635);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public final int getSize() {
        return this.f58197b;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public final long getUniqueId() {
        return this.f58198c;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public final synchronized ByteBuffer getByteBuffer() {
        ByteBuffer byteBuffer;
        MethodCollector.m26663i(4748);
        byteBuffer = this.f58196a;
        MethodCollector.m26664o(4748);
        return byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.facebook.imagepipeline.memory.AbstractC24502r
    public final synchronized void close() {
        MethodCollector.m26663i(4423);
        this.f58196a = null;
        MethodCollector.m26664o(4423);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public final synchronized boolean isClosed() {
        MethodCollector.m26663i(4424);
        if (this.f58196a == null) {
            MethodCollector.m26664o(4424);
            return true;
        }
        MethodCollector.m26664o(4424);
        return false;
    }

    public C24491i(int i) {
        this.f58196a = ByteBuffer.allocateDirect(i);
        this.f58197b = i;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public final synchronized byte read(int i) {
        boolean z;
        boolean z2;
        byte b;
        MethodCollector.m26663i(4548);
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
        if (i >= this.f58197b) {
            z3 = false;
        }
        C24091i.m45620a(z3);
        b = this.f58196a.get(i);
        MethodCollector.m26664o(4548);
        return b;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public final synchronized int write(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int a;
        MethodCollector.m26663i(4537);
        C24091i.m45617a(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        a = C24504t.m46821a(i, i3, this.f58197b);
        C24504t.m46822a(i, bArr.length, i2, a, this.f58197b);
        this.f58196a.position(i);
        this.f58196a.put(bArr, i2, a);
        MethodCollector.m26664o(4537);
        return a;
    }

    /* renamed from: a */
    private void m46787a(int i, AbstractC24502r rVar, int i2, int i3) {
        if (rVar instanceof C24491i) {
            C24091i.m45622b(!isClosed());
            C24091i.m45622b(!rVar.isClosed());
            C24504t.m46822a(i, rVar.getSize(), i2, i3, this.f58197b);
            this.f58196a.position(i);
            rVar.getByteBuffer().position(i2);
            byte[] bArr = new byte[i3];
            this.f58196a.get(bArr, 0, i3);
            rVar.getByteBuffer().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public final void copy(int i, AbstractC24502r rVar, int i2, int i3) {
        MethodCollector.m26663i(4620);
        C24091i.m45617a(rVar);
        if (rVar.getUniqueId() == getUniqueId()) {
            Long.toHexString(getUniqueId());
            Long.toHexString(rVar.getUniqueId());
            C24091i.m45620a(false);
        }
        if (rVar.getUniqueId() < getUniqueId()) {
            synchronized (rVar) {
                try {
                    synchronized (this) {
                        try {
                            m46787a(i, rVar, i2, i3);
                        } finally {
                            MethodCollector.m26664o(4620);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(4620);
                }
            }
            return;
        }
        synchronized (this) {
            try {
                synchronized (rVar) {
                    try {
                        m46787a(i, rVar, i2, i3);
                    } finally {
                        MethodCollector.m26664o(4620);
                    }
                }
            } finally {
                MethodCollector.m26664o(4620);
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24502r
    public final synchronized int read(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int a;
        MethodCollector.m26663i(4545);
        C24091i.m45617a(bArr);
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45622b(z);
        a = C24504t.m46821a(i, i3, this.f58197b);
        C24504t.m46822a(i, bArr.length, i2, a, this.f58197b);
        this.f58196a.position(i);
        this.f58196a.get(bArr, i2, a);
        MethodCollector.m26664o(4545);
        return a;
    }
}
