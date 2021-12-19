package com.bytedance.ttnet.p1704e;

import com.bytedance.covode.number.Covode;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.bytedance.ttnet.e.b */
public final class C22950b {

    /* renamed from: a */
    public String f54256a;

    /* renamed from: b */
    public int f54257b;

    /* renamed from: c */
    public String f54258c = UUID.randomUUID().toString();

    /* renamed from: d */
    public CountDownLatch f54259d = new CountDownLatch(1);

    /* renamed from: e */
    public C22951c f54260e;

    static {
        Covode.recordClassIndex(26863);
    }

    public C22950b(String str, int i) {
        this.f54256a = str;
        this.f54257b = i;
    }
}
