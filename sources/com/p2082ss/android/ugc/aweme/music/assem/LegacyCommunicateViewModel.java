package com.p2082ss.android.ugc.aweme.music.assem;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel */
public final class LegacyCommunicateViewModel extends AssemViewModel<C60343a> {

    /* renamed from: j */
    public AbstractC63985aq.AbstractC63987b f137513j;

    /* renamed from: k */
    public String f137514k;

    /* renamed from: l */
    public boolean f137515l;

    static {
        Covode.recordClassIndex(70883);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C60343a mo20674f() {
        return new C60343a();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f137513j = null;
        this.f137514k = null;
        this.f137515l = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel$a */
    static final class C60336a extends AbstractC89220m implements AbstractC89172b<C60343a, C60343a> {

        /* renamed from: a */
        public static final C60336a f137516a = new C60336a();

        static {
            Covode.recordClassIndex(70884);
        }

        C60336a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60343a invoke(C60343a aVar) {
            C60343a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C60343a.m110054a(aVar2, new C12776a(null), null, 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel$b */
    static final class C60337b extends AbstractC89220m implements AbstractC89172b<C60343a, C60343a> {

        /* renamed from: a */
        public static final C60337b f137517a = new C60337b();

        static {
            Covode.recordClassIndex(70885);
        }

        C60337b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60343a invoke(C60343a aVar) {
            C60343a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C60343a.m110054a(aVar2, null, new C12776a(null), 1);
        }
    }
}
