package com.bytedance.apm.battery.p762d;

import com.bytedance.apm.battery.p762d.p763a.AbstractC12335b;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.apm.battery.d.c */
public abstract class AbstractC12339c<T extends AbstractC12335b> implements AbstractC12343g {

    /* renamed from: a */
    public String f29734a;

    /* renamed from: b */
    long f29735b;

    /* renamed from: c */
    boolean f29736c;

    /* renamed from: d */
    ConcurrentHashMap<Integer, T> f29737d = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(14144);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo20067a(T t, long j, long j2);

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: b */
    public void mo20068b() {
        this.f29736c = false;
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: c */
    public void mo20069c() {
        this.f29736c = true;
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: m_ */
    public final void mo20081m_() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f29737d.size() != 0) {
            long j = this.f29735b;
            if (currentTimeMillis - j >= 600000) {
                mo20065a(j, currentTimeMillis);
            }
        }
        this.f29735b = currentTimeMillis;
    }

    AbstractC12339c(String str) {
        this.f29734a = str;
        this.f29736c = ActivityLifeObserver.getInstance().isForeground();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20065a(long j, long j2) {
        Iterator<Map.Entry<Integer, T>> it = this.f29737d.entrySet().iterator();
        while (it.hasNext()) {
            T value = it.next().getValue();
            if (0 < value.f29724e && value.f29724e < value.f29723d) {
                it.remove();
            } else if (0 < value.f29724e && value.f29724e < j) {
                it.remove();
            } else if (j2 >= value.f29723d) {
                mo20067a(value, j, j2);
            }
        }
    }
}
