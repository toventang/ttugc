package com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel */
public final class AddressSelectViewModel extends JediViewModel<AddressSelectState> {
    static {
        Covode.recordClassIndex(52731);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AddressSelectState mo23027d() {
        return new AddressSelectState(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel$a */
    static final class C44395a extends AbstractC89220m implements AbstractC89172b<AddressSelectState, AddressSelectState> {

        /* renamed from: a */
        final /* synthetic */ C44457d f103520a;

        static {
            Covode.recordClassIndex(52732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44395a(C44457d dVar) {
            super(1);
            this.f103520a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AddressSelectState invoke(AddressSelectState addressSelectState) {
            AddressSelectState addressSelectState2 = addressSelectState;
            C89219l.m154721d(addressSelectState2, "");
            return addressSelectState2.copy(this.f103520a);
        }
    }

    /* renamed from: a */
    public final void mo75421a(C44457d dVar) {
        mo33689c(new C44395a(dVar));
    }
}
