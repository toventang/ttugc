package com.bytedance.geckox.policy.p1030d;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.p1026m.AbstractC14969a;
import com.bytedance.geckox.p1026m.C14972c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.geckox.policy.d.c */
public final class C14988c {

    /* renamed from: a */
    public static ConcurrentHashMap<String, Long> f36613a = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static AtomicLong f36614f = new AtomicLong(System.currentTimeMillis());

    /* renamed from: b */
    public AbstractC14989a f36615b;

    /* renamed from: c */
    private AtomicBoolean f36616c;

    /* renamed from: d */
    private boolean f36617d;

    /* renamed from: e */
    private String f36618e;

    /* renamed from: com.bytedance.geckox.policy.d.c$a */
    public interface AbstractC14989a {
        static {
            Covode.recordClassIndex(17126);
        }

        /* renamed from: a */
        void mo24018a();
    }

    static {
        Covode.recordClassIndex(17125);
    }

    /* renamed from: com.bytedance.geckox.policy.d.c$b */
    class C14990b extends AbstractC14969a<Long> {
        static {
            Covode.recordClassIndex(17127);
        }

        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: a */
        public final int mo24079a() {
            return 1;
        }

        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: b */
        public final void mo24080b() {
            if (C14988c.f36613a.contains(Long.valueOf(((Long) this.f36561c).longValue())) && C14988c.this.f36615b != null) {
                C14988c.this.f36615b.mo24018a();
            }
        }

        private C14990b() {
        }

        /* synthetic */ C14990b(C14988c cVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo24202a() {
        if (!this.f36616c.get() && f36613a.containsKey(this.f36618e)) {
            f36613a.remove(this.f36618e, Long.valueOf(f36613a.get(this.f36618e).longValue()));
        } else if (this.f36616c.get()) {
            f36613a.remove(this.f36618e);
        }
    }

    /* renamed from: b */
    public final void mo24203b() {
        if (!this.f36616c.get() && this.f36617d && System.currentTimeMillis() - f36614f.get() <= 1800000) {
            C14990b bVar = new C14990b(this, (byte) 0);
            long currentTimeMillis = System.currentTimeMillis();
            bVar.f36561c = Long.valueOf(currentTimeMillis);
            C14972c.m27567a().mo24089a(bVar, 60000);
            f36613a.put(this.f36618e, Long.valueOf(currentTimeMillis));
            C14957a.m27543a(this.f36618e + ">>gecko update request retry hit", null);
        } else if (this.f36616c.get()) {
            f36614f.set(System.currentTimeMillis());
        }
    }

    public C14988c(boolean z, boolean z2, String str, AbstractC14989a aVar) {
        this.f36616c = new AtomicBoolean(z);
        this.f36617d = z2;
        this.f36618e = str;
        this.f36615b = aVar;
    }
}
