package com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2839b.C44384a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2839b.C44385b;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2840vh.ShipToBarHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter */
public final class AddressAdapter extends AbstractC34489c<Object> {

    /* renamed from: d */
    public final AbstractC1204m f103499d;

    static {
        Covode.recordClassIndex(52718);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$UnReachableTitleViewHolder */
    public final class UnReachableTitleViewHolder extends JediSimpleViewHolder<C44385b> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ AddressAdapter f103513f;

        static {
            Covode.recordClassIndex(52723);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void cc_() {
            super.cc_();
            View view = this.itemView;
            C89219l.m154716b(view, "");
            C44998a.C44999a.m87685a(view, false);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44385b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnReachableTitleViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
                r4.f103513f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558958(0x7f0d022e, float:1.8743246E38)
                r0 = 0
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter.UnReachableTitleViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$AddressViewHolder */
    public final class AddressViewHolder extends JediSimpleViewHolder<C44457d> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ AddressAdapter f103500f;

        /* renamed from: g */
        private final AbstractC89244h f103501g;

        static {
            Covode.recordClassIndex(52719);
        }

        /* renamed from: m */
        public final AddressSelectViewModel mo63351m() {
            return (AddressSelectViewModel) this.f103501g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$AddressViewHolder$a */
        public static final class C44386a extends AbstractC89220m implements AbstractC89171a<AddressSelectViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f103502a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f103503b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f103504c;

            static {
                Covode.recordClassIndex(52720);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44386a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f103502a = jediViewHolder;
                this.f103503b = cVar;
                this.f103504c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter.AddressViewHolder.C44386a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_delivery_page_address_AddressAdapter$AddressViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m87107xe64bb3b3(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$AddressViewHolder$b */
        public static final class C44387b extends AbstractView$OnClickListenerC80259bp {

            /* renamed from: a */
            final /* synthetic */ long f103505a = 700;

            /* renamed from: b */
            final /* synthetic */ AddressViewHolder f103506b;

            /* renamed from: c */
            final /* synthetic */ Address f103507c;

            /* renamed from: d */
            final /* synthetic */ C44457d f103508d;

            static {
                Covode.recordClassIndex(52721);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                if (view != null) {
                    this.f103506b.mo63351m().mo75421a(this.f103508d);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44387b(AddressViewHolder addressViewHolder, Address address, C44457d dVar) {
                super(700);
                this.f103506b = addressViewHolder;
                this.f103507c = address;
                this.f103508d = dVar;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44457d dVar) {
            C44457d dVar2 = dVar;
            String str = "";
            C89219l.m154721d(dVar2, str);
            View view = this.itemView;
            C89219l.m154716b(view, str);
            boolean z = true;
            if (this.f48794i == this.f103500f.getItemCount() - 1) {
                z = false;
            }
            C44998a.C44999a.m87685a(view, z);
            Address address = dVar2.f103650b;
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard");
            AddressInfoCard addressInfoCard = (AddressInfoCard) view2;
            String a = address.mo73871a(StringSet.name);
            if (a == null) {
                a = str;
            }
            addressInfoCard.setNameText(a);
            String a2 = address.mo73871a("phone");
            if (a2 == null) {
                a2 = str;
            }
            addressInfoCard.setPhoneText(a2);
            String a3 = address.mo73871a("email");
            if (a3 == null) {
                a3 = str;
            }
            addressInfoCard.setEmailText(a3);
            addressInfoCard.setAddressDetailText(address.mo73873b());
            addressInfoCard.setRegionText(Address.m86475a(address));
            String a4 = address.mo73871a("zipcode");
            if (a4 != null) {
                str = a4;
            }
            addressInfoCard.setZipcodeText(str);
            addressInfoCard.setHasPrefix(false);
            addressInfoCard.setSuffixType(3);
            addressInfoCard.setReachable(dVar2.f103649a);
            addressInfoCard.setOnClickListener(new C44387b(this, address, dVar2));
            addressInfoCard.setClickable(dVar2.f103649a);
            AbstractC88412b unused = selectSubscribe(mo63351m(), C44396a.f103521a, new C20370ah(), new C44388c(addressInfoCard, this, address, dVar2));
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$AddressViewHolder$c */
        static final class C44388c extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C44457d>, C44457d, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AddressInfoCard f103509a;

            /* renamed from: b */
            final /* synthetic */ AddressViewHolder f103510b;

            /* renamed from: c */
            final /* synthetic */ Address f103511c;

            /* renamed from: d */
            final /* synthetic */ C44457d f103512d;

            static {
                Covode.recordClassIndex(52722);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44388c(AddressInfoCard addressInfoCard, AddressViewHolder addressViewHolder, Address address, C44457d dVar) {
                super(2);
                this.f103509a = addressInfoCard;
                this.f103510b = addressViewHolder;
                this.f103511c = address;
                this.f103512d = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C44457d> jediSimpleViewHolder, C44457d dVar) {
                String str;
                boolean z;
                Address address;
                C44457d dVar2 = dVar;
                C89219l.m154721d(jediSimpleViewHolder, "");
                RadioButton radioButton = (RadioButton) this.f103509a.mo9603b(R.id.ddr);
                C89219l.m154716b(radioButton, "");
                if (dVar2 == null || (address = dVar2.f103650b) == null) {
                    str = null;
                } else {
                    str = address.f101187a;
                }
                if (!C89219l.m154714a((Object) str, (Object) this.f103511c.f101187a) || !dVar2.f103649a) {
                    z = false;
                } else {
                    z = true;
                }
                radioButton.setChecked(z);
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AddressViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
                r4.f103500f = r5
                com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard r3 = new com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard
                android.content.Context r2 = r6.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r2, r0)
                r1 = 0
                r0 = 6
                r3.<init>(r2, r1, r0)
                r4.<init>(r3)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressSelectViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$AddressViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$AddressViewHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r4.f103501g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter.AddressViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter, android.view.ViewGroup):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((AbstractC34491d) this).f81477a.mo33895b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$b */
    static final class C44390b extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C44390b f103515a = new C44390b();

        static {
            Covode.recordClassIndex(52725);
        }

        C44390b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new ShipToBarHolder(viewGroup2, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$d */
    static final class C44392d extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ AddressAdapter f103517a;

        static {
            Covode.recordClassIndex(52727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44392d(AddressAdapter addressAdapter) {
            super(1);
            this.f103517a = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new AddressViewHolder(this.f103517a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$f */
    static final class C44394f extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ AddressAdapter f103519a;

        static {
            Covode.recordClassIndex(52729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44394f(AddressAdapter addressAdapter) {
            super(1);
            this.f103519a = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new UnReachableTitleViewHolder(this.f103519a, viewGroup2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressAdapter(AbstractC1204m mVar) {
        super(mVar, (C1445j.AbstractC1451e) null, 6);
        C89219l.m154721d(mVar, "");
        this.f103499d = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$a */
    static final class C44389a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddressAdapter f103514a;

        static {
            Covode.recordClassIndex(52724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44389a(AddressAdapter addressAdapter) {
            super(1);
            this.f103514a = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f103514a.mo33762a(num.intValue()) instanceof C44384a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$c */
    static final class C44391c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddressAdapter f103516a;

        static {
            Covode.recordClassIndex(52726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44391c(AddressAdapter addressAdapter) {
            super(1);
            this.f103516a = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f103516a.mo33762a(num.intValue()) instanceof C44457d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.page.address.AddressAdapter$e */
    static final class C44393e extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddressAdapter f103518a;

        static {
            Covode.recordClassIndex(52728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44393e(AddressAdapter addressAdapter) {
            super(1);
            this.f103518a = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f103518a.mo33762a(num.intValue()) instanceof C44385b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: a */
    public final void mo60935a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, ?>> gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC20638g unused = gVar.mo33893a(new C44389a(this), null, C44390b.f103515a);
        AbstractC20638g unused2 = gVar.mo33893a(new C44391c(this), null, new C44392d(this));
        AbstractC20638g unused3 = gVar.mo33893a(new C44393e(this), null, new C44394f(this));
    }
}
