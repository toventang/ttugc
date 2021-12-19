package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1836h.C24117a;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.u */
public final class C24505u implements AbstractC24111h {

    /* renamed from: a */
    C24117a<AbstractC24502r> f58213a;

    /* renamed from: b */
    private final int f58214b;

    static {
        Covode.recordClassIndex(28649);
    }

    /* renamed from: e */
    private synchronized void m46823e() {
        MethodCollector.m26663i(5851);
        if (!mo39677d()) {
            MethodCollector.m26664o(5851);
        } else {
            AbstractC24111h.C24112a aVar = new AbstractC24111h.C24112a();
            MethodCollector.m26664o(5851);
            throw aVar;
        }
    }

    @Override // com.facebook.common.p1835g.AbstractC24111h
    /* renamed from: a */
    public final synchronized int mo39673a() {
        int i;
        MethodCollector.m26663i(5205);
        m46823e();
        i = this.f58214b;
        MethodCollector.m26664o(5205);
        return i;
    }

    @Override // com.facebook.common.p1835g.AbstractC24111h
    /* renamed from: b */
    public final synchronized long mo39675b() {
        long nativePtr;
        MethodCollector.m26663i(5482);
        m46823e();
        nativePtr = this.f58213a.mo39695a().getNativePtr();
        MethodCollector.m26664o(5482);
        return nativePtr;
    }

    @Override // com.facebook.common.p1835g.AbstractC24111h
    /* renamed from: c */
    public final synchronized ByteBuffer mo39676c() {
        ByteBuffer byteBuffer;
        MethodCollector.m26663i(5591);
        byteBuffer = this.f58213a.mo39695a().getByteBuffer();
        MethodCollector.m26664o(5591);
        return byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.m26663i(5717);
        C24117a.m45712c(this.f58213a);
        this.f58213a = null;
        MethodCollector.m26664o(5717);
    }

    @Override // com.facebook.common.p1835g.AbstractC24111h
    /* renamed from: d */
    public final synchronized boolean mo39677d() {
        MethodCollector.m26663i(5593);
        if (!C24117a.m45710a((C24117a<?>) this.f58213a)) {
            MethodCollector.m26664o(5593);
            return true;
        }
        MethodCollector.m26664o(5593);
        return false;
    }

    @Override // com.facebook.common.p1835g.AbstractC24111h
    /* renamed from: a */
    public final synchronized byte mo39672a(int i) {
        boolean z;
        byte read;
        MethodCollector.m26663i(5268);
        m46823e();
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        if (i >= this.f58214b) {
            z2 = false;
        }
        C24091i.m45620a(z2);
        read = this.f58213a.mo39695a().read(i);
        MethodCollector.m26664o(5268);
        return read;
    }

    public C24505u(C24117a<AbstractC24502r> aVar, int i) {
        boolean z;
        C24091i.m45617a(aVar);
        if (i < 0 || i > aVar.mo39695a().getSize()) {
            z = false;
        } else {
            z = true;
        }
        C24091i.m45620a(z);
        this.f58213a = aVar.clone();
        this.f58214b = i;
    }

    @Override // com.facebook.common.p1835g.AbstractC24111h
    /* renamed from: a */
    public final synchronized int mo39674a(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int read;
        MethodCollector.m26663i(5367);
        m46823e();
        if (i + i3 <= this.f58214b) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        read = this.f58213a.mo39695a().read(i, bArr, i2, i3);
        MethodCollector.m26664o(5367);
        return read;
    }
}
