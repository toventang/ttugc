package com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2857vh;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2849a.C44675a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44772b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.C45349j;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.trill.R;
import dmt.viewpager.DmtRtlViewPager;
import dmt.viewpager.DmtViewPager;
import java.util.LinkedHashMap;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpHeaderVH */
public final class SemiPdpHeaderVH extends JediSimpleViewHolder<C44772b> implements AbstractC33974au {

    /* renamed from: f */
    public int f105708f;

    /* renamed from: g */
    public C44675a f105709g;

    /* renamed from: j */
    public final View f105710j;

    /* renamed from: k */
    private final AbstractC89244h f105711k;

    static {
        Covode.recordClassIndex(53826);
    }

    /* renamed from: m */
    public final SemiPdpViewModel mo63351m() {
        return (SemiPdpViewModel) this.f105711k.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        C44998a.C44999a.m87685a(this.f105710j, false);
        AbstractC88412b unused = selectSubscribe(mo63351m(), C45373a.f105733a, new C20370ah(), new C45370e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpHeaderVH$a */
    public static final class C45366a extends AbstractC89220m implements AbstractC89171a<SemiPdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f105712a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f105713b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105714c;

        static {
            Covode.recordClassIndex(53827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45366a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f105712a = jediViewHolder;
            this.f105713b = cVar;
            this.f105714c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2857vh.SemiPdpHeaderVH.C45366a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_semipdp_vh_SemiPdpHeaderVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87937x9b12bf78(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemiPdpHeaderVH(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f105710j = view;
        AbstractC89277c a = C89204ab.m154669a(SemiPdpViewModel.class);
        this.f105711k = C89250i.m154773a((AbstractC89171a) new C45366a(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpHeaderVH$c */
    static final class C45368c extends AbstractC89220m implements AbstractC89172b<Image, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SemiPdpHeaderVH f105717a;

        /* renamed from: b */
        final /* synthetic */ C44772b f105718b;

        static {
            Covode.recordClassIndex(53829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45368c(SemiPdpHeaderVH semiPdpHeaderVH, C44772b bVar) {
            super(1);
            this.f105717a = semiPdpHeaderVH;
            this.f105718b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Image image) {
            String str;
            Image image2 = image;
            C89219l.m154721d(image2, "");
            C45349j a = this.f105717a.mo63351m().mo76402a();
            if (a != null) {
                if (this.f105717a.mo63351m().f105583d) {
                    str = "full_screen";
                } else {
                    str = "half_screen";
                }
                String uri = image2.getUri();
                if (uri == null) {
                    uri = "";
                }
                C89219l.m154721d(str, "");
                C89219l.m154721d(uri, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("photo_id", uri);
                linkedHashMap.put("page_show_type", str);
                a.mo76429b("tiktokec_product_detail_page_photo_click", linkedHashMap);
            }
            this.f105717a.mo63351m().f105587k = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpHeaderVH$d */
    public static final class C45369d implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ View f105719a;

        /* renamed from: b */
        final /* synthetic */ SemiPdpHeaderVH f105720b;

        /* renamed from: c */
        final /* synthetic */ C44772b f105721c;

        static {
            Covode.recordClassIndex(53830);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            String str;
            String str2;
            this.f105720b.f105708f = i;
            TuxTextView tuxTextView = (TuxTextView) this.f105719a.findViewById(R.id.bmy);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(C45563h.m88111a(String.valueOf(i + 1), String.valueOf(this.f105721c.f104456a.size())));
            Image image = this.f105721c.f104456a.get(i);
            if (image != null) {
                this.f105720b.mo63351m().f105589m.add(image);
                C45349j a = this.f105720b.mo63351m().mo76402a();
                if (a != null) {
                    if (this.f105720b.mo63351m().f105583d) {
                        str = "full_screen";
                    } else {
                        str = "half_screen";
                    }
                    String uri = image.getUri();
                    if (uri == null) {
                        uri = "";
                    }
                    if (this.f105720b.mo63351m().f105584e) {
                        str2 = "viewer";
                    } else {
                        str2 = "main";
                    }
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(uri, "");
                    C89219l.m154721d(str2, "");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("photo_id", uri);
                    linkedHashMap.put("page_show_type", str);
                    linkedHashMap.put("photo_show_type", str2);
                    a.mo76429b("tiktokec_product_detail_page_photo_glide", linkedHashMap);
                }
            }
        }

        C45369d(View view, SemiPdpHeaderVH semiPdpHeaderVH, C44772b bVar) {
            this.f105719a = view;
            this.f105720b = semiPdpHeaderVH;
            this.f105721c = bVar;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C44772b bVar) {
        boolean z;
        C44772b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        View view = this.f105710j;
        List<Image> list = bVar2.f104456a;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DmtRtlViewPager dmtRtlViewPager = (DmtRtlViewPager) view.findViewById(R.id.aal);
            C89219l.m154716b(dmtRtlViewPager, "");
            dmtRtlViewPager.setVisibility(8);
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(R.id.aam);
            C89219l.m154716b(appCompatImageView, "");
            appCompatImageView.setVisibility(0);
            return;
        }
        DmtRtlViewPager dmtRtlViewPager2 = (DmtRtlViewPager) view.findViewById(R.id.aal);
        C89219l.m154716b(dmtRtlViewPager2, "");
        dmtRtlViewPager2.setVisibility(0);
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view3.findViewById(R.id.aam);
        C89219l.m154716b(appCompatImageView2, "");
        appCompatImageView2.setVisibility(8);
        List<Image> list2 = bVar2.f104456a;
        DmtRtlViewPager dmtRtlViewPager3 = (DmtRtlViewPager) view.findViewById(R.id.aal);
        C89219l.m154716b(dmtRtlViewPager3, "");
        C44675a aVar = new C44675a(list2, dmtRtlViewPager3, "semi_pdp_head");
        this.f105709g = aVar;
        aVar.f104239a = mo63351m().f105583d;
        C44675a aVar2 = this.f105709g;
        if (aVar2 != null) {
            aVar2.f104242d = new C45367b(this, bVar2);
        }
        C44675a aVar3 = this.f105709g;
        if (aVar3 != null) {
            aVar3.f104240b = new C45368c(this, bVar2);
        }
        DmtViewPager dmtViewPager = (DmtViewPager) view.findViewById(R.id.aal);
        C89219l.m154716b(dmtViewPager, "");
        dmtViewPager.setAdapter(this.f105709g);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.bmy);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(C45563h.m88111a(String.valueOf(this.f105708f + 1), String.valueOf(bVar2.f104456a.size())));
        mo63351m().f105589m.add(bVar2.f104456a.get(0));
        DmtViewPager dmtViewPager2 = (DmtViewPager) view.findViewById(R.id.aal);
        C89219l.m154716b(dmtViewPager2, "");
        dmtViewPager2.setCurrentItem(this.f105708f);
        ((DmtViewPager) view.findViewById(R.id.aal)).setOnPageChangeListener(new C45369d(view, this, bVar2));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpHeaderVH$b */
    static final class C45367b extends AbstractC89220m implements AbstractC89183m<Boolean, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SemiPdpHeaderVH f105715a;

        /* renamed from: b */
        final /* synthetic */ C44772b f105716b;

        static {
            Covode.recordClassIndex(53828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45367b(SemiPdpHeaderVH semiPdpHeaderVH, C44772b bVar) {
            super(2);
            this.f105715a = semiPdpHeaderVH;
            this.f105716b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            this.f105715a.mo63351m().f105584e = booleanValue;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.vh.SemiPdpHeaderVH$e */
    static final class C45370e extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C44772b>, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SemiPdpHeaderVH f105722a;

        static {
            Covode.recordClassIndex(53831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45370e(SemiPdpHeaderVH semiPdpHeaderVH) {
            super(2);
            this.f105722a = semiPdpHeaderVH;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C44772b> jediSimpleViewHolder, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(jediSimpleViewHolder, "");
            C44675a aVar = this.f105722a.f105709g;
            if (aVar != null) {
                aVar.f104239a = booleanValue;
            }
            return C89391z.f203057a;
        }
    }
}
