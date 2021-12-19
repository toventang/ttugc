package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43743d;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.AbstractC44324b;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.C44321a;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.view.CouponTag;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PlatformCouponVH */
public final class PlatformCouponVH extends JediSimpleViewHolder<C43743d> implements IEventCenter.AbstractC45375b, IEventCenter.AbstractC45375b {

    /* renamed from: f */
    public final View f102380f;

    /* renamed from: g */
    private final AbstractC89244h f102381g;

    static {
        Covode.recordClassIndex(52200);
    }

    /* renamed from: m */
    public final OrderSubmitViewModel mo63351m() {
        return (OrderSubmitViewModel) this.f102381g.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        C44998a.C44999a.m87685a(this.f102380f, true);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PlatformCouponVH$a */
    public static final class C43914a extends AbstractC89220m implements AbstractC89171a<OrderSubmitViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f102382a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f102383b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f102384c;

        static {
            Covode.recordClassIndex(52201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43914a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f102382a = jediViewHolder;
            this.f102383b = cVar;
            this.f102384c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PlatformCouponVH.C43914a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_PlatformCouponVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86820x8d6b89cf(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlatformCouponVH(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f102380f = view;
        AbstractC89277c a = C89204ab.m154669a(OrderSubmitViewModel.class);
        this.f102381g = C89250i.m154773a((AbstractC89171a) new C43914a(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.PlatformCouponVH$b */
    public static final class C43915b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102385a = 700;

        /* renamed from: b */
        final /* synthetic */ View f102386b;

        /* renamed from: c */
        final /* synthetic */ PlatformCouponVH f102387c;

        /* renamed from: d */
        final /* synthetic */ C43743d f102388d;

        static {
            Covode.recordClassIndex(52202);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            Object obj;
            if (view != null) {
                PlatformCouponVH platformCouponVH = this.f102387c;
                EventCenter.m87158a().mo75480a("ec_voucher_confirm", platformCouponVH);
                EventCenter.m87158a().mo75480a("ec_voucher_click_cover", platformCouponVH);
                EventCenter.m87158a().mo75480a("ec_voucher_page_close", platformCouponVH);
                C43732h.m86726a("discounts", this.f102387c.mo63351m().mo74424j(), "1", null, null, null, null, null, null, null, 1016);
                Context context = this.f102386b.getContext();
                C89219l.m154716b(context, "");
                HashMap<String, Object> hashMap = this.f102387c.mo63351m().f101769F;
                String str = null;
                if (hashMap != null) {
                    obj = hashMap.get("entrance_info");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = obj;
                }
                HashMap<String, Object> hashMap2 = this.f102387c.mo63351m().f101769F;
                VoucherInfo voucherInfo = this.f102388d.f101976a;
                C89219l.m154721d(context, "");
                AbstractC44324b.C44325a.m87050a(context, 2, "order_submit", 3, str, hashMap2, voucherInfo, 2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43915b(View view, PlatformCouponVH platformCouponVH, C43743d dVar) {
            super(700);
            this.f102386b = view;
            this.f102387c = platformCouponVH;
            this.f102388d = dVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C43743d dVar) {
        List<Voucher> vouchers;
        C43743d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        View view = this.f102380f;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.d2h);
        C89219l.m154716b(relativeLayout, "");
        relativeLayout.setOnClickListener(new C43915b(view, this, dVar2));
        VoucherInfo voucherInfo = dVar2.f101976a;
        Voucher voucher = null;
        if (!(voucherInfo == null || (vouchers = voucherInfo.getVouchers()) == null)) {
            Iterator<T> it = vouchers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next.getSelected(), (Object) true)) {
                    voucher = next;
                    break;
                }
            }
            voucher = voucher;
        }
        if (voucher != null) {
            CouponTag couponTag = (CouponTag) view.findViewById(R.id.d2j);
            C89219l.m154716b(couponTag, "");
            couponTag.setVisibility(0);
            ((CouponTag) view.findViewById(R.id.d2j)).setText(voucher.getDiscountText());
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.an2);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        } else {
            CouponTag couponTag2 = (CouponTag) view.findViewById(R.id.d2j);
            C89219l.m154716b(couponTag2, "");
            couponTag2.setVisibility(8);
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.an2);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
        }
        C43732h.m86727a("discounts", mo63351m().mo74424j(), "1", (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 1016);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int hashCode = str.hashCode();
        if (hashCode != 440904974) {
            if (hashCode != 882422714) {
                if (hashCode == 1943991438 && str.equals("ec_voucher_confirm")) {
                    try {
                        C44321a a = C44321a.C44322a.m87047a(str2);
                        if (a != null) {
                            OrderSubmitViewModel m = mo63351m();
                            List<Voucher> list = a.f103367c;
                            Voucher voucher = null;
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    T next = it.next();
                                    if (C89219l.m154714a((Object) next.getSelected(), (Object) true)) {
                                        voucher = next;
                                        break;
                                    }
                                }
                                voucher = voucher;
                            }
                            m.mo74411a(voucher);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C22708a.m42802a(th);
                        return;
                    }
                } else {
                    return;
                }
            } else if (!str.equals("ec_voucher_page_close")) {
                return;
            }
        } else if (!str.equals("ec_voucher_click_cover")) {
            return;
        }
        IEventCenter a2 = EventCenter.m87158a();
        a2.mo75481b("ec_voucher_confirm", this);
        a2.mo75481b("ec_voucher_click_cover", this);
        a2.mo75481b("ec_voucher_page_close", this);
    }
}
