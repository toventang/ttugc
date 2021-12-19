package com.bytedance.provider;

import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.provider.e */
public class C21738e implements AbstractC21735d {

    /* renamed from: b */
    private final AbstractC89244h f51507b = C89250i.m154773a((AbstractC89171a) new C21739a(this));

    /* renamed from: c */
    private final String f51508c;

    static {
        Covode.recordClassIndex(25382);
    }

    @Override // com.bytedance.provider.AbstractC21735d
    /* renamed from: a */
    public C21741g mo35380a() {
        return (C21741g) this.f51507b.getValue();
    }

    /* renamed from: com.bytedance.provider.e$a */
    static final class C21739a extends AbstractC89220m implements AbstractC89171a<C21741g> {

        /* renamed from: a */
        final /* synthetic */ C21738e f51509a;

        static {
            Covode.recordClassIndex(25383);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21739a(C21738e eVar) {
            super(0);
            this.f51509a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C21741g invoke() {
            return new C21741g(this.f51509a);
        }
    }

    public C21738e(String str) {
        C89219l.m154719c(str, "");
        this.f51508c = str;
    }
}
