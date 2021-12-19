package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3225b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3225b.C55796b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.c */
public final class C55798c extends AbstractC55795a<IMContact> {

    /* renamed from: b */
    public static final C55799a f127224b = new C55799a((byte) 0);

    /* renamed from: c */
    private final C55796b f127225c;

    static {
        Covode.recordClassIndex(65584);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b.c$a */
    public static final class C55799a {
        static {
            Covode.recordClassIndex(65585);
        }

        private C55799a() {
        }

        public /* synthetic */ C55799a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C55798c m101582a(C55732c cVar) {
            C89219l.m154721d(cVar, "");
            return new C55798c(cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55798c(C55732c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
        this.f127225c = C55796b.C55797a.m101580a(cVar);
    }

    /* renamed from: a */
    public final boolean mo92659a(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        return this.f127225c.mo92658a(iMContact);
    }
}
