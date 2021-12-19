package com.bytedance.geckox.buffer.p1014a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p1019f.AbstractC14933a;
import java.io.OutputStream;

/* renamed from: com.bytedance.geckox.buffer.a.b */
public final class C14890b extends OutputStream {

    /* renamed from: a */
    public UpdatePackage f36366a;

    /* renamed from: b */
    public long f36367b;

    /* renamed from: c */
    public long f36368c;

    /* renamed from: d */
    private AbstractC14888a f36369d;

    /* renamed from: e */
    private AbstractC14933a f36370e;

    static {
        Covode.recordClassIndex(17001);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    private C14890b(AbstractC14888a aVar) {
        MethodCollector.m26663i(4646);
        this.f36369d = aVar;
        MethodCollector.m26664o(4646);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f36369d.mo23971a(i);
        m27343a(4);
    }

    /* renamed from: a */
    private void m27343a(int i) {
        long j = this.f36368c + ((long) i);
        this.f36368c = j;
        AbstractC14933a aVar = this.f36370e;
        if (aVar != null) {
            aVar.mo24047a(this.f36366a, this.f36367b, j);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f36369d.mo23972a(bArr);
        m27343a(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f36369d.mo23968a(bArr, i, i2);
        m27343a(i2);
    }

    public C14890b(AbstractC14888a aVar, AbstractC14933a aVar2, UpdatePackage updatePackage, long j) {
        this(aVar);
        this.f36370e = aVar2;
        this.f36366a = updatePackage;
        this.f36367b = j;
    }
}
