package com.bytedance.geckox.policy.p1027a;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.p1026m.AbstractC14969a;
import com.bytedance.geckox.p1026m.C14972c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.policy.a.a */
public final class C14975a {

    /* renamed from: a */
    public AbstractC14977b f36582a;

    /* renamed from: b */
    public AtomicBoolean f36583b = new AtomicBoolean(false);

    /* renamed from: c */
    private int f36584c;

    /* renamed from: d */
    private int f36585d;

    static {
        Covode.recordClassIndex(17112);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.geckox.policy.a.a$a */
    public class C14976a extends AbstractC14969a {
        static {
            Covode.recordClassIndex(17113);
        }

        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: a */
        public final int mo24079a() {
            return 2;
        }

        @Override // com.bytedance.geckox.p1026m.AbstractC14969a
        /* renamed from: b */
        public final void mo24080b() {
            C14975a.this.f36582a.mo24190a();
            C14975a.this.mo24188a();
        }

        private C14976a() {
        }

        /* synthetic */ C14976a(C14975a aVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo24188a() {
        int i = this.f36584c + 1;
        this.f36584c = i;
        long floor = (long) Math.floor((Math.random() + 0.5d) * Math.pow(2.0d, (double) Math.min(i - 2, 8)) * 5.0d);
        this.f36585d = (int) (((long) this.f36585d) + floor);
        C14957a.m27543a("EB retry counts:" + this.f36584c + ",next retry delay:" + floor + "s,total delay:" + this.f36585d + "s");
        if (this.f36585d > 5115) {
            mo24189b();
            return;
        }
        C14972c.m27567a().mo24089a(new C14976a(this, (byte) 0), floor * 1000);
    }

    /* renamed from: b */
    public final void mo24189b() {
        if (this.f36583b.get()) {
            C14957a.m27543a("EB retry stops,retry counts:" + this.f36584c + ",total delay:" + this.f36585d + "s");
            this.f36584c = 0;
            C14972c.m27567a().mo24088a(2);
            this.f36583b.set(false);
        }
    }

    public C14975a(AbstractC14977b bVar) {
        this.f36582a = bVar;
    }
}
