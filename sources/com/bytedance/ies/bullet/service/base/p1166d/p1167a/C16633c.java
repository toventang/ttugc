package com.bytedance.ies.bullet.service.base.p1166d.p1167a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16590ab;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.bullet.service.base.d.a.c */
public final class C16633c {

    /* renamed from: b */
    public static final AbstractC89244h f39795b = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C16635b.f39799a);

    /* renamed from: c */
    public static final C16634a f39796c = new C16634a((byte) 0);

    /* renamed from: a */
    public final List<AbstractC16590ab> f39797a = new ArrayList();

    /* renamed from: d */
    private final List<AbstractC16590ab> f39798d = new ArrayList();

    /* renamed from: com.bytedance.ies.bullet.service.base.d.a.c$a */
    public static final class C16634a {
        static {
            Covode.recordClassIndex(19071);
        }

        /* renamed from: a */
        public static C16633c m30876a() {
            return (C16633c) C16633c.f39795b.getValue();
        }

        private C16634a() {
        }

        public /* synthetic */ C16634a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.base.d.a.c$b */
    static final class C16635b extends AbstractC89220m implements AbstractC89171a<C16633c> {

        /* renamed from: a */
        public static final C16635b f39799a = new C16635b();

        static {
            Covode.recordClassIndex(19072);
        }

        C16635b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16633c invoke() {
            return new C16633c();
        }
    }

    /* renamed from: a */
    public final List<AbstractC16590ab> mo26399a() {
        return C89070n.m154584g((Iterable) this.f39797a);
    }

    static {
        Covode.recordClassIndex(19070);
    }
}
