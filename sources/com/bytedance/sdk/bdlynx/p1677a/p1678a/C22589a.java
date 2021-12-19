package com.bytedance.sdk.bdlynx.p1677a.p1678a;

import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1677a.p1679b.AbstractC22606a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.sdk.bdlynx.a.a.a */
public final class C22589a {

    /* renamed from: a */
    public static final C22589a f53375a = new C22589a();

    /* renamed from: b */
    private static final AbstractC89244h f53376b = C89250i.m154773a((AbstractC89171a) C22590a.f53377a);

    /* renamed from: a */
    public static AbstractC22606a m42626a() {
        return (AbstractC22606a) f53376b.getValue();
    }

    private C22589a() {
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.a$a */
    static final class C22590a extends AbstractC89220m implements AbstractC89171a<AbstractC22606a> {

        /* renamed from: a */
        public static final C22590a f53377a = new C22590a();

        static {
            Covode.recordClassIndex(26406);
        }

        C22590a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC22606a invoke() {
            return BdpManager.getInst().getService(AbstractC22606a.class);
        }
    }

    static {
        Covode.recordClassIndex(26405);
    }
}
