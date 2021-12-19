package com.p2082ss.android.ugc.aweme.external;

import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.IDonationService;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82792i;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82779f;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82772c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.f */
public final class C47162f implements IDonationService {
    static {
        Covode.recordClassIndex(55766);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.f$a */
    public static final class C47163a implements AbstractC82792i {

        /* renamed from: a */
        final /* synthetic */ IDonationService.OnDonationOrgChangeListener f109786a;

        static {
            Covode.recordClassIndex(55767);
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82792i
        /* renamed from: a */
        public final void mo79550a() {
            this.f109786a.onDismiss();
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82792i
        /* renamed from: b */
        public final void mo79552b() {
            this.f109786a.onShow();
        }

        C47163a(IDonationService.OnDonationOrgChangeListener onDonationOrgChangeListener) {
            this.f109786a = onDonationOrgChangeListener;
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82792i
        /* renamed from: a */
        public final void mo79551a(AbstractC82771b bVar) {
            C89219l.m154721d(bVar, "");
            IDonationService.OrganizationModel organizationModel = new IDonationService.OrganizationModel(bVar.getName(), bVar.getDesc(), bVar.getIcon(), bVar.getDetailUrl(), bVar.getDonateLink(), bVar.getNgoId());
            if (bVar instanceof C82772c) {
                organizationModel.setAddTime(bVar.getAddTime());
            }
            this.f109786a.onOrgSelected(organizationModel);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IDonationService
    public final DialogInterface$OnCancelListenerC0944d getSelectDonationDialog(IDonationService.OnDonationOrgChangeListener onDonationOrgChangeListener) {
        C89219l.m154721d(onDonationOrgChangeListener, "");
        C82779f fVar = new C82779f();
        fVar.f185045a = new C47163a(onDonationOrgChangeListener);
        return fVar;
    }
}
