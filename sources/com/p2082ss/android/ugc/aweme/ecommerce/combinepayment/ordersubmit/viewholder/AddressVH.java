package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43740a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoData;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.C43852f;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AddressVH */
public final class AddressVH extends JediSimpleViewHolder<C43740a> implements AbstractC33974au {

    /* renamed from: f */
    public final View f102329f;

    /* renamed from: g */
    private final AbstractC89244h f102330g;

    /* renamed from: j */
    private String f102331j;

    static {
        Covode.recordClassIndex(52182);
    }

    /* renamed from: m */
    public final OrderSubmitViewModel mo63351m() {
        return (OrderSubmitViewModel) this.f102330g.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        C44998a.C44999a.m87685a(this.f102329f, true);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AddressVH$a */
    public static final class C43900a extends AbstractC89220m implements AbstractC89171a<OrderSubmitViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f102332a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f102333b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f102334c;

        static {
            Covode.recordClassIndex(52183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43900a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f102332a = jediViewHolder;
            this.f102333b = cVar;
            this.f102334c = cVar2;
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AddressVH.C43900a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_AddressVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86803xd6930a44(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressVH(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f102329f = view;
        AbstractC89277c a = C89204ab.m154669a(OrderSubmitViewModel.class);
        this.f102330g = C89250i.m154773a((AbstractC89171a) new C43900a(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AddressVH$c */
    public static final class C43902c extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102339a = 700;

        /* renamed from: b */
        final /* synthetic */ View f102340b;

        /* renamed from: c */
        final /* synthetic */ AddressVH f102341c;

        /* renamed from: d */
        final /* synthetic */ C43740a f102342d;

        static {
            Covode.recordClassIndex(52185);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                C43732h.m86726a("add_new_shipping", this.f102341c.mo63351m().mo74424j(), null, null, null, null, null, null, null, null, 1020);
                this.f102341c.mo63351m().mo74404a(this.f102340b.getContext());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43902c(View view, AddressVH addressVH, C43740a aVar) {
            super(700);
            this.f102340b = view;
            this.f102341c = addressVH;
            this.f102342d = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.AddressVH$b */
    public static final class C43901b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102335a = 700;

        /* renamed from: b */
        final /* synthetic */ View f102336b;

        /* renamed from: c */
        final /* synthetic */ AddressVH f102337c;

        /* renamed from: d */
        final /* synthetic */ C43740a f102338d;

        static {
            Covode.recordClassIndex(52184);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            C43852f schemaInfo;
            if (view != null) {
                C43732h.m86726a("edit_shipping", this.f102337c.mo63351m().mo74424j(), null, null, null, null, null, null, null, null, 1020);
                OrderSubmitViewModel m = this.f102337c.mo63351m();
                Context context = this.f102336b.getContext();
                m.f101796r = "next";
                m.f101803y = true;
                String i = m.mo74423i();
                BillInfoData billInfoData = m.f101789k;
                if (billInfoData == null || (schemaInfo = billInfoData.getSchemaInfo()) == null) {
                    str = null;
                } else {
                    str = schemaInfo.f102192b;
                }
                if (context != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (i != null) {
                        linkedHashMap.put("trackParams", i);
                    }
                    linkedHashMap.put("is_select_mode", true);
                    if (str == null || str.length() == 0) {
                        str = "aweme://ec/address/list";
                    }
                    C45264j.m87843a(context, str, linkedHashMap, false).open();
                }
                m.mo33687b_(OrderSubmitViewModel.C43704q.f101863a);
                m.f101765B = true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43901b(View view, AddressVH addressVH, C43740a aVar) {
            super(700);
            this.f102336b = view;
            this.f102337c = addressVH;
            this.f102338d = aVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C43740a aVar) {
        String str;
        C43740a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        if (aVar2.f101960f) {
            str = "edit_shipping";
        } else {
            str = "add_new_shipping";
        }
        if (!C89219l.m154714a((Object) str, (Object) this.f102331j)) {
            C43732h.m86727a(str, mo63351m().mo74424j(), (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 1020);
            this.f102331j = str;
        }
        View view = this.f102329f;
        if (aVar2.f101960f) {
            AddressInfoCard addressInfoCard = (AddressInfoCard) view.findViewById(R.id.bdc);
            C89219l.m154716b(addressInfoCard, "");
            addressInfoCard.setVisibility(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.cso);
            C89219l.m154716b(constraintLayout, "");
            constraintLayout.setVisibility(8);
            ((AddressInfoCard) view.findViewById(R.id.bdc)).setNameText(aVar2.f101955a);
            ((AddressInfoCard) view.findViewById(R.id.bdc)).setPhoneText(aVar2.f101956b);
            ((AddressInfoCard) view.findViewById(R.id.bdc)).setEmailText(aVar2.f101961g);
            ((AddressInfoCard) view.findViewById(R.id.bdc)).setRegionText(aVar2.f101957c);
            ((AddressInfoCard) view.findViewById(R.id.bdc)).setAddressDetailText(aVar2.f101958d);
            ((AddressInfoCard) view.findViewById(R.id.bdc)).setZipcodeText(aVar2.f101959e);
            if (C89219l.m154714a((Object) aVar2.f101964j, (Object) false)) {
                ((AddressInfoCard) view.findViewById(R.id.bdc)).setHintText(aVar2.f101962h);
            } else {
                ((AddressInfoCard) view.findViewById(R.id.bdc)).setHintText("");
            }
            AddressInfoCard addressInfoCard2 = (AddressInfoCard) view.findViewById(R.id.bdc);
            C89219l.m154716b(addressInfoCard2, "");
            addressInfoCard2.setOnClickListener(new C43901b(view, this, aVar2));
            return;
        }
        AddressInfoCard addressInfoCard3 = (AddressInfoCard) view.findViewById(R.id.bdc);
        C89219l.m154716b(addressInfoCard3, "");
        addressInfoCard3.setVisibility(8);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.cso);
        C89219l.m154716b(constraintLayout2, "");
        constraintLayout2.setVisibility(0);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) view.findViewById(R.id.cso);
        C89219l.m154716b(constraintLayout3, "");
        constraintLayout3.setOnClickListener(new C43902c(view, this, aVar2));
    }
}
