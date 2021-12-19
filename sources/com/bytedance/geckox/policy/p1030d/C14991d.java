package com.bytedance.geckox.policy.p1030d;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.statistic.model.C15039a;
import com.bytedance.p1603q.p1604a.C21930e;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.geckox.policy.d.d */
public final class C14991d {

    /* renamed from: a */
    private static ConcurrentHashMap<String, Long> f36620a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private boolean f36621b;

    /* renamed from: c */
    private String f36622c;

    /* renamed from: d */
    private C15039a f36623d;

    static {
        Covode.recordClassIndex(17128);
    }

    /* renamed from: b */
    public final void mo24205b() {
        f36620a.put(this.f36622c, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public final void mo24204a() {
        if (this.f36621b && f36620a.containsKey(this.f36622c)) {
            if (System.currentTimeMillis() - f36620a.get(this.f36622c).longValue() > 600000) {
                f36620a.remove(this.f36622c);
                return;
            }
            C14957a.m27543a(this.f36622c + ":gecko update request control-throttle hit", null);
            this.f36623d.f36724h = 1;
            this.f36623d.f36725i = 600;
            throw new C21930e(600, "repeat gecko update request", new Throwable("Only one request with the same parameters is allowed in 600s"));
        }
    }

    public C14991d(boolean z, String str, C15039a aVar) {
        this.f36621b = z;
        this.f36622c = str;
        this.f36623d = aVar;
    }
}
