package com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.router.view.AbstractC45290a;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.C45421d;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.b */
public final class C45391b extends AbstractC45390a implements IEventCenter.AbstractC45375b {

    /* renamed from: a */
    public final C45421d f105786a;

    /* renamed from: b */
    private SkuPanelState f105787b;

    static {
        Covode.recordClassIndex(53865);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: a */
    public final void mo76505a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: b */
    public final void mo76507b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: d */
    public final void mo76509d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.b.b$a */
    static final class RunnableC45392a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45391b f105788a;

        static {
            Covode.recordClassIndex(53866);
        }

        RunnableC45392a(C45391b bVar) {
            this.f105788a = bVar;
        }

        public final void run() {
            this.f105788a.f105786a.dismissAllowingStateLoss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: c */
    public final void mo76508c() {
        EventCenter.m87158a().mo75481b("ec_sku_panel_close", this);
        SkuPanelStarter.m87954a(this.f105787b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45391b(C45421d dVar) {
        super(dVar);
        C89219l.m154721d(dVar, "");
        this.f105786a = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: a */
    public final void mo76506a(View view) {
        C89219l.m154721d(view, "");
        EventCenter.m87158a().mo75480a("ec_sku_panel_close", this);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a
    /* renamed from: a */
    public final View mo76504a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        if (this.f105786a.getActivity() == null) {
            return null;
        }
        AbstractC45290a i = mo76360i();
        if (i == null) {
            return i;
        }
        i.mo76363a(this.f105786a);
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (C89219l.m154714a((Object) str, (Object) "ec_sku_panel_close")) {
            try {
                SkuPanelState skuPanelState = (SkuPanelState) C80342dg.m139301a(str2, SkuPanelState.class);
                this.f105787b = skuPanelState;
                if (skuPanelState == null) {
                    return;
                }
                if (skuPanelState.getJumpOSP()) {
                    SkuPanelStarter.m87954a(this.f105787b);
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC45392a(this), 450);
                    return;
                }
                this.f105786a.dismissAllowingStateLoss();
            } catch (Exception e) {
                C22708a.m42802a((Throwable) e);
            }
        }
    }
}
