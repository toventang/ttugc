package com.bytedance.covode.number;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.covode.number.a */
public final class C13809a {

    /* renamed from: a */
    public final LinkedBlockingQueue<Integer> f33576a = new LinkedBlockingQueue<>(120000);

    /* renamed from: b */
    public final LinkedBlockingQueue<Short> f33577b = new LinkedBlockingQueue<>(120000);

    /* renamed from: c */
    final boolean f33578c;

    static {
        Covode.recordClassIndex(15854);
    }

    public C13809a() {
        boolean z;
        if (new Random().nextInt(10000) <= 10) {
            z = true;
        } else {
            z = false;
        }
        this.f33578c = z;
    }
}
