package com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.router.view.AbstractC45290a;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.a */
public final class C44353a extends AbstractC44374g implements IEventCenter.AbstractC45375b {

    /* renamed from: a */
    private DeliveryPanelStarter.PackedDeliverySelectResult f103458a = new DeliveryPanelStarter.PackedDeliverySelectResult();

    static {
        Covode.recordClassIndex(52685);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: a */
    public final void mo75397a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: a */
    public final void mo75398a(Dialog dialog) {
        C89219l.m154721d(dialog, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: b */
    public final void mo75399b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: c */
    public final void mo75400c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: e */
    public final void mo75402e() {
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: d */
    public final void mo75401d() {
        DeliveryPanelStarter.m87060a(this.f103458a);
        EventCenter.m87158a().mo75481b("ec_delivery_panel_close", this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44353a(C44294a aVar, DeliveryPanelViewModel deliveryPanelViewModel) {
        super(aVar, deliveryPanelViewModel);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(deliveryPanelViewModel, "");
        this.f105515j = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a.AbstractC44374g
    /* renamed from: a */
    public final View mo75396a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        EventCenter.m87158a().mo75480a("ec_delivery_panel_close", this);
        if (this.f103482c.getActivity() == null) {
            return null;
        }
        AbstractC45290a i = mo76360i();
        if (i == null) {
            return i;
        }
        i.mo76363a(this.f103482c);
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (str.hashCode() == -1860001485 && str.equals("ec_delivery_panel_close")) {
            this.f103458a = (DeliveryPanelStarter.PackedDeliverySelectResult) C33039i.m67674a(str2, DeliveryPanelStarter.PackedDeliverySelectResult.class);
            this.f103482c.dismiss();
        }
    }
}
