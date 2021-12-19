package com.airbnb.epoxy;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.epoxy.i */
public final class C1939i implements AbstractC1921ak {

    /* renamed from: a */
    private final String f5805a;

    /* renamed from: b */
    private long f5806b;

    /* renamed from: c */
    private String f5807c;

    static {
        Covode.recordClassIndex(2130);
    }

    /* renamed from: b */
    private void m6163b() {
        this.f5806b = -1;
        this.f5807c = null;
    }

    @Override // com.airbnb.epoxy.AbstractC1921ak
    /* renamed from: a */
    public final void mo5700a() {
        if (this.f5806b != -1) {
            C1764a.m5928a(this.f5807c + ": %.3fms", new Object[]{Float.valueOf(((float) (System.nanoTime() - this.f5806b)) / 1000000.0f)});
            m6163b();
            return;
        }
        throw new IllegalStateException("Timer was not started");
    }

    C1939i(String str) {
        this.f5805a = str;
        m6163b();
    }

    @Override // com.airbnb.epoxy.AbstractC1921ak
    /* renamed from: a */
    public final void mo5701a(String str) {
        if (this.f5806b == -1) {
            this.f5806b = System.nanoTime();
            this.f5807c = str;
            return;
        }
        throw new IllegalStateException("Timer was already started");
    }
}
