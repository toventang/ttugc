package com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2840vh;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.C44348a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2839b.C44384a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.EnumC44478a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder */
public final class ShipToBarHolder extends JediSimpleViewHolder<C44384a> implements AbstractC33974au {

    /* renamed from: g */
    public static final C44459b f103653g = new C44459b((byte) 0);

    /* renamed from: f */
    public final boolean f103654f;

    /* renamed from: j */
    private final AbstractC89244h f103655j;

    static {
        Covode.recordClassIndex(52802);
    }

    /* renamed from: m */
    public final DeliveryPanelViewModel mo63351m() {
        return (DeliveryPanelViewModel) this.f103655j.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder$b */
    public static final class C44459b {
        static {
            Covode.recordClassIndex(52804);
        }

        private C44459b() {
        }

        public /* synthetic */ C44459b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C44998a.C44999a.m87685a(view, true);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder$a */
    public static final class C44458a extends AbstractC89220m implements AbstractC89171a<DeliveryPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f103656a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f103657b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f103658c;

        static {
            Covode.recordClassIndex(52803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44458a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f103656a = jediViewHolder;
            this.f103657b = cVar;
            this.f103658c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2840vh.ShipToBarHolder.C44458a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_delivery_vh_ShipToBarHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87147x897e521(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public /* synthetic */ ShipToBarHolder(ViewGroup viewGroup) {
        this(viewGroup, true);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder$c */
    public static final class C44460c extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f103659a = 700;

        /* renamed from: b */
        final /* synthetic */ ShipToBarHolder f103660b;

        static {
            Covode.recordClassIndex(52805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44460c(ShipToBarHolder shipToBarHolder) {
            super(700);
            this.f103660b = shipToBarHolder;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                ShipToBarHolder shipToBarHolder = this.f103660b;
                shipToBarHolder.withState(shipToBarHolder.mo63351m(), new C44461a(this));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder$c$a */
        static final class C44461a extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C44460c f103661a;

            static {
                Covode.recordClassIndex(52806);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44461a(C44460c cVar) {
                super(1);
                this.f103661a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
                DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
                C89219l.m154721d(deliveryPanelState2, "");
                EnumC44478a aVar = EnumC44478a.PUSH_AREA_PAGE;
                for (T t : deliveryPanelState2.getAddressRenderData()) {
                    if ((t instanceof C44457d) && t != null) {
                        aVar = EnumC44478a.PUSH_ADDRESS_PAGE;
                    }
                }
                this.f103661a.f103660b.mo63351m().mo75477a(aVar);
                if (this.f103661a.f103660b.mo63351m().f103666a instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
                    View view = this.f103661a.f103660b.itemView;
                    C89219l.m154716b(view, "");
                    C44720k a = C44720k.C44721a.m87476a(view.getContext());
                    if (a != null) {
                        a.mo75872b("ship_to", (Boolean) null);
                    }
                }
                C44348a.m87067a("ship_to", "confirm", null, null, null);
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder$e */
    static final class C44463e extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f103664a;

        static {
            Covode.recordClassIndex(52808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44463e(C89233z.C89238e eVar) {
            super(1);
            this.f103664a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
            List<? extends Region> list2 = list;
            C89219l.m154721d(list2, "");
            this.f103664a.element = (T) C89070n.m154551a(C89070n.m154584g((Iterable) list2), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C444641.f103665a, 30);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder$d */
    static final class C44462d extends AbstractC89220m implements AbstractC89172b<C44457d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ShipToBarHolder f103662a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f103663b;

        static {
            Covode.recordClassIndex(52807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44462d(ShipToBarHolder shipToBarHolder, C89233z.C89238e eVar) {
            super(1);
            this.f103662a = shipToBarHolder;
            this.f103663b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C44457d dVar) {
            T t;
            C44457d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C89233z.C89238e eVar = this.f103663b;
            if (dVar2.f103649a) {
                t = (T) Address.m86475a(dVar2.f103650b);
            } else {
                if (this.f103662a.f103654f) {
                    View view = this.f103662a.itemView;
                    C89219l.m154716b(view, "");
                    t = (T) view.getContext().getString(R.string.bfn);
                } else {
                    t = "";
                }
                C89219l.m154716b(t, "");
            }
            eVar.element = t;
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C44384a aVar) {
        int i;
        C44384a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        T t = (T) view.getContext().getString(R.string.bfn);
        C89219l.m154716b(t, "");
        eVar.element = t;
        aVar2.mo75410a(new C44462d(this, eVar));
        C44463e eVar2 = new C44463e(eVar);
        C89219l.m154721d(eVar2, "");
        List<Region> b = aVar2.mo75411b();
        if (b != null) {
            eVar2.invoke(b);
        }
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.kr);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(eVar.element);
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        view3.setOnClickListener(new C44460c(this));
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        view4.setClickable(this.f103654f);
        boolean z = this.f103654f;
        View view5 = this.itemView;
        C89219l.m154716b(view5, "");
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) view5.findViewById(R.id.b7x);
        C89219l.m154716b(autoRTLImageView, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        autoRTLImageView.setVisibility(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShipToBarHolder(android.view.ViewGroup r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558960(0x7f0d0230, float:1.874325E38)
            r0 = 0
            android.view.View r0 = com.C1764a.m5927a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            r4.f103654f = r6
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipToBarHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r4.f103655j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2840vh.ShipToBarHolder.<init>(android.view.ViewGroup, boolean):void");
    }
}
