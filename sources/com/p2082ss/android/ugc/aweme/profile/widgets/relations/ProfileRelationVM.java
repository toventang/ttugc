package com.p2082ss.android.ugc.aweme.profile.widgets.relations;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.ProfileRelationVM */
public final class ProfileRelationVM extends AssemViewModel<C65170a> {
    static {
        Covode.recordClassIndex(76639);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C65170a mo20674f() {
        return new C65170a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.ProfileRelationVM$a */
    static final class C65169a extends AbstractC89220m implements AbstractC89172b<C65170a, C65170a> {

        /* renamed from: a */
        final /* synthetic */ int f147064a;

        /* renamed from: b */
        final /* synthetic */ int f147065b;

        /* renamed from: c */
        final /* synthetic */ long f147066c;

        static {
            Covode.recordClassIndex(76640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65169a(int i, int i2, long j) {
            super(1);
            this.f147064a = i;
            this.f147065b = i2;
            this.f147066c = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C65170a invoke(C65170a aVar) {
            C89219l.m154721d(aVar, "");
            return new C65170a(this.f147064a, this.f147065b, this.f147066c);
        }
    }
}
