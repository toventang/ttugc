package com.p2082ss.texturerender;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.texturerender.d */
public final class C86194d implements AbstractC86170a {

    /* renamed from: a */
    private AtomicInteger f192318a;

    static {
        Covode.recordClassIndex(101337);
    }

    @Override // com.p2082ss.texturerender.AbstractC86170a
    /* renamed from: a */
    public final int mo136466a() {
        return this.f192318a.getAndIncrement();
    }

    @Override // com.p2082ss.texturerender.AbstractC86170a
    /* renamed from: b */
    public final int mo136467b() {
        return this.f192318a.getAndDecrement();
    }

    private C86194d() {
        this.f192318a = new AtomicInteger(0);
    }

    public C86194d(byte b) {
        this();
    }
}
