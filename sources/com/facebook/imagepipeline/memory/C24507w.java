package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24115k;
import com.facebook.common.p1836h.C24117a;

/* renamed from: com.facebook.imagepipeline.memory.w */
public final class C24507w extends AbstractC24115k {

    /* renamed from: a */
    private final AbstractC24503s f58217a;

    /* renamed from: b */
    private C24117a<AbstractC24502r> f58218b;

    /* renamed from: c */
    private int f58219c;

    static {
        Covode.recordClassIndex(28651);
    }

    @Override // com.facebook.common.p1835g.AbstractC24115k
    /* renamed from: b */
    public final int mo39692b() {
        return this.f58219c;
    }

    /* renamed from: com.facebook.imagepipeline.memory.w$a */
    public static class C24508a extends RuntimeException {
        static {
            Covode.recordClassIndex(28652);
        }

        public C24508a() {
            super("OutputStream no longer valid");
        }
    }

    /* renamed from: d */
    private void m46839d() {
        if (!C24117a.m45710a((C24117a<?>) this.f58218b)) {
            throw new C24508a();
        }
    }

    /* renamed from: c */
    public final C24505u mo39691a() {
        m46839d();
        return new C24505u(this.f58218b, this.f58219c);
    }

    @Override // java.io.OutputStream, java.io.Closeable, com.facebook.common.p1835g.AbstractC24115k, java.lang.AutoCloseable
    public final void close() {
        C24117a.m45712c(this.f58218b);
        this.f58218b = null;
        this.f58219c = -1;
        super.close();
    }

    public C24507w(AbstractC24503s sVar) {
        this(sVar, sVar.f58212g[0]);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public C24507w(AbstractC24503s sVar, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        AbstractC24503s sVar2 = (AbstractC24503s) C24091i.m45617a(sVar);
        this.f58217a = sVar2;
        this.f58219c = 0;
        this.f58218b = C24117a.m45707a(sVar2.mo39664a(i), sVar2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        m46839d();
        int i3 = this.f58219c + i2;
        m46839d();
        if (i3 > this.f58218b.mo39695a().getSize()) {
            AbstractC24502r rVar = (AbstractC24502r) this.f58217a.mo39664a(i3);
            this.f58218b.mo39695a().copy(0, rVar, 0, this.f58219c);
            this.f58218b.close();
            this.f58218b = C24117a.m45707a(rVar, this.f58217a);
        }
        this.f58218b.mo39695a().write(this.f58219c, bArr, i, i2);
        this.f58219c += i2;
    }
}
