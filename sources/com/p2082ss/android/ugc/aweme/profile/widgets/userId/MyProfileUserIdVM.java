package com.p2082ss.android.ugc.aweme.profile.widgets.userId;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.MyProfileUserIdVM */
public final class MyProfileUserIdVM extends AssemViewModel<C65197a> {
    static {
        Covode.recordClassIndex(76668);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C65197a mo20674f() {
        return new C65197a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.MyProfileUserIdVM$a */
    public static final class C65196a extends AbstractC89220m implements AbstractC89172b<C65197a, C65197a> {

        /* renamed from: a */
        final /* synthetic */ boolean f147110a;

        static {
            Covode.recordClassIndex(76669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65196a(boolean z) {
            super(1);
            this.f147110a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C65197a invoke(C65197a aVar) {
            C89219l.m154721d(aVar, "");
            return new C65197a(this.f147110a);
        }
    }

    /* renamed from: a */
    public final void mo104364a(boolean z) {
        mo20662a(new C65196a(z));
    }
}
