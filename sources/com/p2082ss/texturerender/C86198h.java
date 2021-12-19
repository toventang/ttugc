package com.p2082ss.texturerender;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.texturerender.h */
public final class C86198h implements AbstractC86187b {

    /* renamed from: a */
    int f192319a;

    /* renamed from: b */
    ReentrantLock f192320b = new ReentrantLock();

    /* renamed from: c */
    private AbstractC86170a f192321c = new C86194d((byte) 0);

    /* renamed from: d */
    private AbstractC86199a f192322d;

    /* renamed from: e */
    private int f192323e;

    /* renamed from: com.ss.texturerender.h$a */
    public interface AbstractC86199a {
        static {
            Covode.recordClassIndex(101342);
        }

        /* renamed from: a */
        void mo136512a(AbstractC86187b bVar);
    }

    static {
        Covode.recordClassIndex(101341);
    }

    @Override // com.p2082ss.texturerender.AbstractC86187b
    /* renamed from: e */
    public final int mo136495e() {
        return this.f192323e;
    }

    @Override // com.p2082ss.texturerender.AbstractC86187b
    /* renamed from: d */
    public final void mo136494d() {
        this.f192320b.unlock();
    }

    @Override // com.p2082ss.texturerender.AbstractC86187b
    /* renamed from: c */
    public final int mo136493c() {
        if (!this.f192320b.isHeldByCurrentThread()) {
            this.f192320b.lock();
            return this.f192319a;
        }
        throw new AndroidRuntimeException("Dead lock!!");
    }

    @Override // com.p2082ss.texturerender.AbstractC86170a
    /* renamed from: a */
    public final int mo136466a() {
        int a = this.f192321c.mo136466a();
        C86203l.m148116a("ITexture", this + " add ref " + a);
        return a;
    }

    @Override // com.p2082ss.texturerender.AbstractC86170a
    /* renamed from: b */
    public final int mo136467b() {
        int b = this.f192321c.mo136467b();
        C86203l.m148116a("ITexture", this + " dec ref " + b);
        if (b == 1) {
            this.f192322d.mo136512a(this);
            return 0;
        } else if (b > 0) {
            return 0;
        } else {
            throw new RuntimeException(new Exception("reference idx " + (b - 1) + " app abort!!"));
        }
    }

    public C86198h(int i, int i2, AbstractC86199a aVar) {
        C86203l.m148116a("ITexture", "new texture = ".concat(String.valueOf(i)));
        this.f192319a = i;
        this.f192322d = aVar;
        this.f192323e = i2;
    }
}
