package com.p2082ss.android.ugc.aweme.ecommerce.address.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter */
public final class AddressAdapter extends AbstractC34489c<Object> {

    /* renamed from: d */
    public final AbstractC1204m f101489d;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$a */
    public static final class C43521a {
        static {
            Covode.recordClassIndex(51758);
        }
    }

    static {
        Covode.recordClassIndex(51749);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddAddressBarHolder */
    public final class AddAddressBarHolder extends JediSimpleViewHolder<C43521a> implements AbstractC33974au {

        /* renamed from: f */
        final AbstractC89244h f101490f;

        /* renamed from: g */
        final /* synthetic */ AddressAdapter f101491g;

        static {
            Covode.recordClassIndex(51750);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void cc_() {
            super.cc_();
            View view = this.itemView;
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            C0792v.m2746a(view, C17177c.m31711c(view2.getContext()));
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddAddressBarHolder$a */
        public static final class C43515a extends AbstractC89220m implements AbstractC89171a<AddressListViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f101492a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f101493b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f101494c;

            static {
                Covode.recordClassIndex(51751);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43515a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f101492a = jediViewHolder;
                this.f101493b = cVar;
                this.f101494c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter.AddAddressBarHolder.C43515a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_address_list_AddressAdapter$AddAddressBarHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86572x6a3d0934(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddAddressBarHolder$b */
        public static final class C43516b extends AbstractView$OnClickListenerC80259bp {

            /* renamed from: a */
            final /* synthetic */ long f101495a = 700;

            /* renamed from: b */
            final /* synthetic */ AddAddressBarHolder f101496b;

            static {
                Covode.recordClassIndex(51752);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43516b(AddAddressBarHolder addAddressBarHolder) {
                super(700);
                this.f101496b = addAddressBarHolder;
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                if (view != null) {
                    ((AddressListViewModel) this.f101496b.f101490f.getValue()).mo74033b();
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C43521a aVar) {
            C89219l.m154721d(aVar, "");
            View view = this.itemView;
            C89219l.m154716b(view, "");
            boolean z = true;
            if (this.f48794i == this.f101491g.getItemCount() - 1) {
                z = false;
            }
            C44998a.C44999a.m87685a(view, z);
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view2.setOnClickListener(new C43516b(this));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AddAddressBarHolder(com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
                r4.f101491g = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558934(0x7f0d0216, float:1.8743198E38)
                r0 = 0
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                r4.<init>(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddAddressBarHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddAddressBarHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r4.f101490f = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter.AddAddressBarHolder.<init>(com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddressViewHolder */
    public final class AddressViewHolder extends JediSimpleViewHolder<C44457d> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ AddressAdapter f101497f;

        /* renamed from: g */
        private final AbstractC89244h f101498g;

        static {
            Covode.recordClassIndex(51753);
        }

        /* renamed from: m */
        public final AddressListViewModel mo63351m() {
            return (AddressListViewModel) this.f101498g.getValue();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddressViewHolder$a */
        public static final class C43517a extends AbstractC89220m implements AbstractC89171a<AddressListViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f101499a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f101500b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f101501c;

            static {
                Covode.recordClassIndex(51754);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43517a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f101499a = jediViewHolder;
                this.f101500b = cVar;
                this.f101501c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter.AddressViewHolder.C43517a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_address_list_AddressAdapter$AddressViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m86577x79a432d(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddressViewHolder$d */
        public static final class C43520d extends AbstractView$OnClickListenerC80259bp {

            /* renamed from: a */
            final /* synthetic */ long f101512a = 700;

            /* renamed from: b */
            final /* synthetic */ AddressViewHolder f101513b;

            /* renamed from: c */
            final /* synthetic */ Address f101514c;

            /* renamed from: d */
            final /* synthetic */ C44457d f101515d;

            static {
                Covode.recordClassIndex(51757);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                if (view != null) {
                    this.f101513b.mo63351m().mo74031a(this.f101515d.f103650b);
                    this.f101513b.mo74010a(this.f101514c.mo73872a(), "edit");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43520d(AddressViewHolder addressViewHolder, Address address, C44457d dVar) {
                super(700);
                this.f101513b = addressViewHolder;
                this.f101514c = address;
                this.f101515d = dVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddressViewHolder$c */
        public static final class C43519c extends AbstractView$OnClickListenerC80259bp {

            /* renamed from: a */
            final /* synthetic */ long f101507a = 700;

            /* renamed from: b */
            final /* synthetic */ AddressInfoCard f101508b;

            /* renamed from: c */
            final /* synthetic */ AddressViewHolder f101509c;

            /* renamed from: d */
            final /* synthetic */ Address f101510d;

            /* renamed from: e */
            final /* synthetic */ C44457d f101511e;

            static {
                Covode.recordClassIndex(51756);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                String hintText;
                if (view != null && (hintText = this.f101508b.getHintText()) != null && hintText.length() != 0) {
                    this.f101509c.mo74010a(this.f101510d.mo73872a(), "other");
                    this.f101509c.mo63351m().mo74031a(this.f101511e.f103650b);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43519c(AddressInfoCard addressInfoCard, AddressViewHolder addressViewHolder, Address address, C44457d dVar) {
                super(700);
                this.f101508b = addressInfoCard;
                this.f101509c = addressViewHolder;
                this.f101510d = address;
                this.f101511e = dVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddressViewHolder$b */
        public static final class C43518b extends AbstractView$OnClickListenerC80259bp {

            /* renamed from: a */
            final /* synthetic */ long f101502a = 700;

            /* renamed from: b */
            final /* synthetic */ AddressInfoCard f101503b;

            /* renamed from: c */
            final /* synthetic */ AddressViewHolder f101504c;

            /* renamed from: d */
            final /* synthetic */ Address f101505d;

            /* renamed from: e */
            final /* synthetic */ C44457d f101506e;

            static {
                Covode.recordClassIndex(51755);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                if (view != null) {
                    this.f101504c.mo74010a(this.f101505d.mo73872a(), "other");
                    String hintText = this.f101503b.getHintText();
                    if (hintText == null || hintText.length() == 0) {
                        AddressListViewModel m = this.f101504c.mo63351m();
                        Address address = this.f101506e.f103650b;
                        C89219l.m154721d(address, "");
                        m.mo33689c(new AddressListViewModel.C43537b(address));
                        return;
                    }
                    this.f101504c.mo63351m().mo74031a(this.f101506e.f103650b);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43518b(AddressInfoCard addressInfoCard, AddressViewHolder addressViewHolder, Address address, C44457d dVar) {
                super(700);
                this.f101503b = addressInfoCard;
                this.f101504c = addressViewHolder;
                this.f101505d = address;
                this.f101506e = dVar;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(C44457d dVar) {
            boolean z;
            String str;
            C44457d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            View view = this.itemView;
            C89219l.m154716b(view, "");
            if (this.f48794i != this.f101497f.getItemCount() - 1) {
                z = true;
            } else {
                z = false;
            }
            C44998a.C44999a.m87685a(view, z);
            Address address = dVar2.f103650b;
            View view2 = this.itemView;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard");
            AddressInfoCard addressInfoCard = (AddressInfoCard) view2;
            addressInfoCard.setUiMode("show_all");
            String a = address.mo73871a(StringSet.name);
            if (a == null) {
                a = "";
            }
            addressInfoCard.setNameText(a);
            String a2 = address.mo73871a("phone");
            if (a2 == null) {
                a2 = "";
            }
            addressInfoCard.setPhoneText(a2);
            String a3 = address.mo73871a("email");
            if (a3 == null) {
                a3 = "";
            }
            addressInfoCard.setEmailText(a3);
            addressInfoCard.setAddressDetailText(address.mo73873b());
            addressInfoCard.setRegionText(Address.m86475a(address));
            String a4 = address.mo73871a("zipcode");
            if (a4 == null) {
                a4 = "";
            }
            addressInfoCard.setZipcodeText(a4);
            addressInfoCard.setHasPrefix(false);
            addressInfoCard.setSuffixType(1);
            addressInfoCard.setDefault(address.mo73872a());
            if (C89219l.m154714a((Object) dVar2.f103652d, (Object) false)) {
                str = dVar2.f103651c;
            } else {
                str = "";
            }
            addressInfoCard.setHintText(str);
            addressInfoCard.setPaddingVertical(22);
            AddressListViewModel m = mo63351m();
            if (((Boolean) m.f101538b.mo23374a(m, AddressListViewModel.f101537a[0])).booleanValue()) {
                addressInfoCard.setOnClickListener(new C43518b(addressInfoCard, this, address, dVar2));
            } else {
                addressInfoCard.setOnClickListener(new C43519c(addressInfoCard, this, address, dVar2));
            }
            TuxTextView tuxTextView = (TuxTextView) addressInfoCard.mo9603b(R.id.aqv);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setOnClickListener(new C43520d(this, address, dVar2));
            boolean a5 = address.mo73872a();
            int i = this.f48794i - 1;
            Boolean bool = dVar2.f103652d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C43544a.f101548a);
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "shipping_info");
            linkedHashMap.put("module_name", "address");
            if (bool != null) {
                bool.booleanValue();
                linkedHashMap.put("is_valid", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            linkedHashMap.put("is_default", Integer.valueOf(a5 ? 1 : 0));
            linkedHashMap.put("rank", Integer.valueOf(i));
            C45544c.m88082a("tiktokec_module_show", linkedHashMap);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AddressViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
                r4.f101497f = r5
                com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard r3 = new com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard
                android.content.Context r2 = r6.getContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r2, r0)
                r1 = 0
                r0 = 6
                r3.<init>(r2, r1, r0)
                r4.<init>(r3)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddressViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$AddressViewHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r4.f101498g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter.AddressViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter, android.view.ViewGroup):void");
        }

        /* renamed from: a */
        public final void mo74010a(boolean z, String str) {
            int i = this.f48794i - 1;
            Boolean bool = ((C44457d) aQ_()).f103652d;
            C89219l.m154721d(str, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C43544a.f101548a);
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "shipping_info");
            linkedHashMap.put("module_name", "address");
            if (bool != null) {
                bool.booleanValue();
                linkedHashMap.put("is_valid", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            linkedHashMap.put("is_default", Integer.valueOf(z ? 1 : 0));
            linkedHashMap.put("rank", Integer.valueOf(i));
            linkedHashMap.put("click_area", str);
            C45544c.m88082a("tiktokec_module_click", linkedHashMap);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((AbstractC34491d) this).f81477a.mo33895b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$c */
    static final class C43523c extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ AddressAdapter f101517a;

        static {
            Covode.recordClassIndex(51760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43523c(AddressAdapter addressAdapter) {
            super(1);
            this.f101517a = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new AddressViewHolder(this.f101517a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$e */
    static final class C43525e extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ AddressAdapter f101519a;

        static {
            Covode.recordClassIndex(51762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43525e(AddressAdapter addressAdapter) {
            super(1);
            this.f101519a = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new AddAddressBarHolder(this.f101519a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$b */
    static final class C43522b extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddressAdapter f101516a;

        static {
            Covode.recordClassIndex(51759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43522b(AddressAdapter addressAdapter) {
            super(1);
            this.f101516a = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f101516a.mo33762a(num.intValue()) instanceof C44457d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter$d */
    static final class C43524d extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddressAdapter f101518a;

        static {
            Covode.recordClassIndex(51761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43524d(AddressAdapter addressAdapter) {
            super(1);
            this.f101518a = addressAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f101518a.mo33762a(num.intValue()) instanceof C43521a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressAdapter(AbstractC1204m mVar) {
        super(mVar, new C43572d(), 4);
        C89219l.m154721d(mVar, "");
        this.f101489d = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: a */
    public final void mo60935a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, ?>> gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC20638g unused = gVar.mo33893a(new C43522b(this), null, new C43523c(this));
        AbstractC20638g unused2 = gVar.mo33893a(new C43524d(this), null, new C43525e(this));
    }
}
