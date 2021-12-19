package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.address.api.AddressApi;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43478j;
import com.p2082ss.android.ugc.aweme.ecommerce.address.p2820a.C43340a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.C43587b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder */
public final class RegionInputItemViewHolder extends JediSimpleViewHolder<C43340a> implements AbstractC33974au {

    /* renamed from: f */
    public final AbstractC0952i f101445f;

    /* renamed from: g */
    private final AbstractC89244h f101446g;

    static {
        Covode.recordClassIndex(51730);
    }

    /* renamed from: m */
    public final AddressEditViewModel mo63351m() {
        return (AddressEditViewModel) this.f101446g.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$c */
    static final class C43503c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ RegionInputItemViewHolder f101456a;

        static {
            Covode.recordClassIndex(51735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43503c(RegionInputItemViewHolder regionInputItemViewHolder) {
            super(0);
            this.f101456a = regionInputItemViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo74006a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo74006a() {
            Object obj = ((C43340a) this.f101456a.aQ_()).f101149b;
            if (!(obj instanceof List)) {
                obj = null;
            }
            if (obj != null) {
                View view = this.f101456a.itemView;
                C89219l.m154716b(view, "");
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.efx);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(RegionInputItemViewHolder.m86553c(obj));
                return;
            }
            View view2 = this.f101456a.itemView;
            C89219l.m154716b(view2, "");
            TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.efx);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$b */
    public static final class C43500b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f101450a = 700;

        /* renamed from: b */
        final /* synthetic */ RegionInputItemViewHolder f101451b;

        /* renamed from: c */
        final /* synthetic */ String f101452c;

        /* renamed from: d */
        final /* synthetic */ C43503c f101453d;

        static {
            Covode.recordClassIndex(51732);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$b$a */
        static final class C43501a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C43500b f101454a;

            static {
                Covode.recordClassIndex(51733);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43501a(C43500b bVar) {
                super(0);
                this.f101454a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f101454a.f101451b.mo63351m();
                String a = AddressEditViewModel.m86484a(((C43340a) this.f101454a.f101451b.aQ_()).f101148a.f101204i, ((C43340a) this.f101454a.f101451b.aQ_()).f101149b);
                if (a != null) {
                    View view = this.f101454a.f101451b.itemView;
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
                    ((InputItem) view).mo74092a(a);
                    ((C43340a) this.f101454a.f101451b.aQ_()).f101150c = a;
                }
                C43478j jVar = this.f101454a.f101451b.mo63351m().f101255l;
                if (jVar != null) {
                    jVar.f101403b = SystemClock.elapsedRealtime();
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            if (view != null && this.f101452c != null) {
                C43478j jVar = this.f101451b.mo63351m().f101255l;
                if (jVar != null) {
                    jVar.mo73997a(true, "next", this.f101451b.mo63351m().mo73967g());
                }
                String str2 = this.f101452c;
                AbstractC0952i iVar = this.f101451b.f101445f;
                if (this.f101451b.mo63351m().f101260q == null) {
                    str = "add";
                } else {
                    str = "edit";
                }
                C43587b.C43588a.m86626a(false, str2, Integer.MAX_VALUE, iVar, str, new C43501a(this), new C43502b(this), null, 129);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$b$b */
        static final class C43502b extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C43500b f101455a;

            static {
                Covode.recordClassIndex(51734);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43502b(C43500b bVar) {
                super(1);
                this.f101455a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
                C89219l.m154721d(list, "");
                if (!C89219l.m154714a((Object) RegionInputItemViewHolder.m86553c(list), (Object) RegionInputItemViewHolder.m86553c(((C43340a) this.f101455a.f101451b.aQ_()).f101149b))) {
                    this.f101455a.f101451b.mo63351m().f101251e = true;
                }
                Object obj = ((C43340a) this.f101455a.f101451b.aQ_()).f101149b;
                ((C43340a) this.f101455a.f101451b.aQ_()).f101149b = list;
                this.f101455a.f101453d.mo74006a();
                if (!this.f101455a.f101451b.mo63351m().f101259p || !(!C89219l.m154714a(((C43340a) this.f101455a.f101451b.aQ_()).f101149b, obj))) {
                    View view = this.f101455a.f101451b.itemView;
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
                    ((InputItem) view).mo74091a();
                } else {
                    View view2 = this.f101455a.f101451b.itemView;
                    Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
                    View view3 = this.f101455a.f101451b.itemView;
                    C89219l.m154716b(view3, "");
                    ((InputItem) view2).mo74092a(((InputItem) view3).getContext().getString(R.string.bi2));
                    this.f101455a.f101451b.mo63351m().f101259p = false;
                }
                C43478j jVar = this.f101455a.f101451b.mo63351m().f101255l;
                if (jVar != null) {
                    jVar.f101403b = SystemClock.elapsedRealtime();
                }
                return C89391z.f203057a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43500b(RegionInputItemViewHolder regionInputItemViewHolder, String str, C43503c cVar) {
            super(700);
            this.f101451b = regionInputItemViewHolder;
            this.f101452c = str;
            this.f101453d = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$d */
    public static final class C43504d extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f101457a = 700;

        /* renamed from: b */
        final /* synthetic */ RegionInputItemViewHolder f101458b;

        static {
            Covode.recordClassIndex(51736);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$d$a */
        static final class C43505a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C43504d f101459a;

            static {
                Covode.recordClassIndex(51737);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43505a(C43504d dVar) {
                super(0);
                this.f101459a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f101459a.f101458b.mo63351m();
                String a = AddressEditViewModel.m86484a(((C43340a) this.f101459a.f101458b.aQ_()).f101148a.f101204i, ((C43340a) this.f101459a.f101458b.aQ_()).f101149b);
                if (a != null) {
                    View view = this.f101459a.f101458b.itemView;
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
                    ((InputItem) view).mo74092a(a);
                    ((C43340a) this.f101459a.f101458b.aQ_()).f101150c = a;
                }
                C43478j jVar = this.f101459a.f101458b.mo63351m().f101255l;
                if (jVar != null) {
                    jVar.f101403b = SystemClock.elapsedRealtime();
                }
                return C89391z.f203057a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43504d(RegionInputItemViewHolder regionInputItemViewHolder) {
            super(700);
            this.f101458b = regionInputItemViewHolder;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$d$b */
        static final class C43506b extends AbstractC89220m implements AbstractC89172b<List<? extends Region>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C43504d f101460a;

            static {
                Covode.recordClassIndex(51738);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43506b(C43504d dVar) {
                super(1);
                this.f101460a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends Region> list) {
                String str;
                List<? extends Region> list2 = list;
                C89219l.m154721d(list2, "");
                AddressEditViewModel m = this.f101460a.f101458b.mo63351m();
                Region region = (Region) list2.get(0);
                C89219l.m154721d(region, "");
                Region region2 = m.f101247a;
                if (region2 != null) {
                    str = region2.f101210b;
                } else {
                    str = null;
                }
                if (!C89219l.m154714a((Object) str, (Object) region.f101210b)) {
                    m.mo33689c(AddressEditViewModel.C43414w.f101305a);
                    AbstractC88412b a = AddressApi.C43341a.m86459a(region).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AddressEditViewModel.C43415x(m, region), new AddressEditViewModel.C43418y(m));
                    C89219l.m154716b(a, "");
                    m.mo33680a(a);
                }
                C43478j jVar = this.f101460a.f101458b.mo63351m().f101255l;
                if (jVar != null) {
                    jVar.f101403b = SystemClock.elapsedRealtime();
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            if (view != null) {
                C43478j jVar = this.f101458b.mo63351m().f101255l;
                if (jVar != null) {
                    jVar.mo73997a(true, "next", this.f101458b.mo63351m().mo73967g());
                }
                AbstractC0952i iVar = this.f101458b.f101445f;
                if (this.f101458b.mo63351m().f101260q == null) {
                    str = "add";
                } else {
                    str = "edit";
                }
                C43587b.C43588a.m86626a(false, null, 1, iVar, str, new C43505a(this), new C43506b(this), null, 131);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$a */
    public static final class C43499a extends AbstractC89220m implements AbstractC89171a<AddressEditViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f101447a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f101448b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f101449c;

        static {
            Covode.recordClassIndex(51731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43499a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f101447a = jediViewHolder;
            this.f101448b = cVar;
            this.f101449c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder.C43499a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_address_edit_viewholder_RegionInputItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86556xef5ee2d1(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$e */
    public static final class C43507e extends AbstractC89220m implements AbstractC89172b<String, CharSequence> {

        /* renamed from: a */
        public static final C43507e f101461a = new C43507e();

        static {
            Covode.recordClassIndex(51739);
        }

        C43507e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            return str2;
        }
    }

    /* renamed from: c */
    public static String m86553c(Object obj) {
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<Region> list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Region region : list) {
            String str = region.f101209a;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C43507e.f101461a, 30);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C43340a aVar) {
        C43340a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
        InputItem inputItem = (InputItem) view;
        inputItem.setTitle(aVar2.f101148a.f101202g);
        TuxTextView tuxTextView = (TuxTextView) inputItem.mo74090a(R.id.efx);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setHint(aVar2.f101148a.f101198c);
        String str = aVar2.f101150c;
        if (str != null) {
            inputItem.mo74092a(str);
        } else {
            inputItem.mo74091a();
        }
        String str2 = aVar2.f101148a.f101199d;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            String str3 = null;
            if (hashCode != -934795532) {
                if (hashCode == 367869605 && str2.equals("districts")) {
                    Region region = mo63351m().f101247a;
                    if (region == null || (str3 = region.f101210b) == null) {
                        View view2 = this.itemView;
                        C89219l.m154716b(view2, "");
                        C45573n.m88123a(view2, 0);
                    } else {
                        View view3 = this.itemView;
                        C89219l.m154716b(view3, "");
                        C45573n.m88123a(view3, -2);
                    }
                    C43503c cVar = new C43503c(this);
                    cVar.mo74006a();
                    View view4 = this.itemView;
                    C89219l.m154716b(view4, "");
                    FrameLayout frameLayout = (FrameLayout) view4.findViewById(R.id.acz);
                    C89219l.m154716b(frameLayout, "");
                    frameLayout.setOnClickListener(new C43500b(this, str3, cVar));
                }
            } else if (str2.equals("region")) {
                View view5 = this.itemView;
                C89219l.m154716b(view5, "");
                C45573n.m88123a(view5, -2);
                Object obj = ((C43340a) aQ_()).f101149b;
                if (obj instanceof Region) {
                    str3 = obj;
                }
                Region region2 = (Region) str3;
                if (region2 != null) {
                    View view6 = this.itemView;
                    C89219l.m154716b(view6, "");
                    TuxTextView tuxTextView2 = (TuxTextView) view6.findViewById(R.id.efx);
                    C89219l.m154716b(tuxTextView2, "");
                    tuxTextView2.setText(region2.f101209a);
                } else {
                    View view7 = this.itemView;
                    C89219l.m154716b(view7, "");
                    TuxTextView tuxTextView3 = (TuxTextView) view7.findViewById(R.id.efx);
                    C89219l.m154716b(tuxTextView3, "");
                    tuxTextView3.setText("");
                }
                View view8 = this.itemView;
                C89219l.m154716b(view8, "");
                FrameLayout frameLayout2 = (FrameLayout) view8.findViewById(R.id.acz);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.setOnClickListener(new C43504d(this));
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RegionInputItemViewHolder(android.view.ViewGroup r5, androidx.fragment.app.AbstractC0952i r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558947(0x7f0d0223, float:1.8743224E38)
            r0 = 0
            android.view.View r0 = com.C1764a.m5927a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            r4.f101445f = r6
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r4.f101446g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder.<init>(android.view.ViewGroup, androidx.fragment.app.i):void");
    }
}
