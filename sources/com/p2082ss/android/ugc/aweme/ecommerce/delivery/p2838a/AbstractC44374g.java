package com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2838a;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.a.g */
public abstract class AbstractC44374g extends AbstractC45271m {

    /* renamed from: c */
    public final C44294a f103482c;

    /* renamed from: d */
    public final DeliveryPanelViewModel f103483d;

    static {
        Covode.recordClassIndex(52706);
    }

    /* renamed from: a */
    public abstract View mo75396a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo75397a();

    /* renamed from: a */
    public abstract void mo75398a(Dialog dialog);

    /* renamed from: b */
    public abstract void mo75399b();

    /* renamed from: c */
    public abstract void mo75400c();

    /* renamed from: d */
    public abstract void mo75401d();

    /* renamed from: e */
    public abstract void mo75402e();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC44374g(C44294a aVar, DeliveryPanelViewModel deliveryPanelViewModel) {
        super(null, aVar, 1);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(deliveryPanelViewModel, "");
        this.f103482c = aVar;
        this.f103483d = deliveryPanelViewModel;
    }
}
