package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20526p;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel */
public final class EditDonationStickerViewModel extends BaseJediViewModel<EditDonationStickerState> {

    /* renamed from: a */
    public C1213t<Boolean> f159231a;

    /* renamed from: b */
    private final AbstractC89244h f159232b = C89250i.m154773a((AbstractC89171a) C71099c.f159235a);

    static {
        Covode.recordClassIndex(83598);
    }

    /* renamed from: a */
    public final C1213t<Float> mo112367a() {
        return (C1213t) this.f159232b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel$c */
    static final class C71099c extends AbstractC89220m implements AbstractC89171a<C1213t<Float>> {

        /* renamed from: a */
        public static final C71099c f159235a = new C71099c();

        static {
            Covode.recordClassIndex(83601);
        }

        C71099c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Float> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: b */
    public final void mo112370b() {
        mo33689c(C71097a.f159233a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditDonationStickerState(null, false, 3, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel$b */
    static final class C71098b extends AbstractC89220m implements AbstractC89172b<EditDonationStickerState, EditDonationStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f159234a;

        static {
            Covode.recordClassIndex(83600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71098b(boolean z) {
            super(1);
            this.f159234a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditDonationStickerState invoke(EditDonationStickerState editDonationStickerState) {
            EditDonationStickerState editDonationStickerState2 = editDonationStickerState;
            C89219l.m154721d(editDonationStickerState2, "");
            return EditDonationStickerState.copy$default(editDonationStickerState2, null, this.f159234a, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel$a */
    static final class C71097a extends AbstractC89220m implements AbstractC89172b<EditDonationStickerState, EditDonationStickerState> {

        /* renamed from: a */
        public static final C71097a f159233a = new C71097a();

        static {
            Covode.recordClassIndex(83599);
        }

        C71097a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditDonationStickerState invoke(EditDonationStickerState editDonationStickerState) {
            EditDonationStickerState editDonationStickerState2 = editDonationStickerState;
            C89219l.m154721d(editDonationStickerState2, "");
            return EditDonationStickerState.copy$default(editDonationStickerState2, new C20526p(), false, 2, null);
        }
    }

    /* renamed from: a */
    public final void mo112368a(float f) {
        mo112367a().setValue(Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo112369a(boolean z) {
        mo33689c(new C71098b(z));
        C1213t<Boolean> tVar = this.f159231a;
        if (tVar != null && (!C89219l.m154714a(tVar.getValue(), Boolean.valueOf(z)))) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }
}
