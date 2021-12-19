package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.m */
public final class C58864m implements AbstractC58857g {

    /* renamed from: a */
    private AtomicInteger f134000a = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(69178);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58857g
    /* renamed from: a */
    public final int mo96278a() {
        return this.f134000a.getAndIncrement();
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58857g
    /* renamed from: b */
    public final int mo96279b() {
        return this.f134000a.getAndDecrement();
    }
}
