package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter */
public final class RegionAdapter extends AbstractC34489c<Object> {

    /* renamed from: d */
    public final AbstractC1204m f106254d;

    static {
        Covode.recordClassIndex(54141);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$IndicatorViewHolder */
    public final class IndicatorViewHolder extends JediSimpleViewHolder<String> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ RegionAdapter f106266f;

        static {
            Covode.recordClassIndex(54147);
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
        public final /* synthetic */ void mo33817a(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(str2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public IndicatorViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
                r4.f106266f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558964(0x7f0d0234, float:1.8743259E38)
                r0 = 0
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter.IndicatorViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$DistrictViewHolder */
    public final class DistrictViewHolder extends JediSimpleViewHolder<District> implements AbstractC33974au {

        /* renamed from: f */
        final /* synthetic */ RegionAdapter f106255f;

        /* renamed from: g */
        private final AbstractC89244h f106256g;

        static {
            Covode.recordClassIndex(54142);
        }

        /* renamed from: m */
        public final DistrictPickerViewModel mo63351m() {
            return (DistrictPickerViewModel) this.f106256g.getValue();
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

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$DistrictViewHolder$a */
        public static final class C45644a extends AbstractC89220m implements AbstractC89171a<DistrictPickerViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f106257a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f106258b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f106259c;

            static {
                Covode.recordClassIndex(54143);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45644a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f106257a = jediViewHolder;
                this.f106258b = cVar;
                this.f106259c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter.DistrictViewHolder.C45644a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_adapter_RegionAdapter$DistrictViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m88163xf092fe01(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$DistrictViewHolder$b */
        public static final class C45645b extends AbstractView$OnClickListenerC80259bp {

            /* renamed from: a */
            final /* synthetic */ long f106260a = 700;

            /* renamed from: b */
            final /* synthetic */ DistrictViewHolder f106261b;

            /* renamed from: c */
            final /* synthetic */ District f106262c;

            static {
                Covode.recordClassIndex(54144);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                if (view != null) {
                    DistrictPickerViewModel m = this.f106261b.mo63351m();
                    District district = this.f106262c;
                    C89219l.m154721d(district, "");
                    m.mo33689c(new DistrictPickerViewModel.C45661d(district));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C45645b(DistrictViewHolder districtViewHolder, District district) {
                super(700);
                this.f106261b = districtViewHolder;
                this.f106262c = district;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$DistrictViewHolder$c */
        static final class C45646c extends AbstractC89220m implements AbstractC89172b<DistrictPickerState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ DistrictViewHolder f106263a;

            /* renamed from: b */
            final /* synthetic */ District f106264b;

            static {
                Covode.recordClassIndex(54145);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45646c(DistrictViewHolder districtViewHolder, District district) {
                super(1);
                this.f106263a = districtViewHolder;
                this.f106264b = district;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(DistrictPickerState districtPickerState) {
                String str;
                DistrictPickerState districtPickerState2 = districtPickerState;
                C89219l.m154721d(districtPickerState2, "");
                View view = this.f106263a.itemView;
                C89219l.m154716b(view, "");
                RadioButton radioButton = (RadioButton) view.findViewById(R.id.ddr);
                C89219l.m154716b(radioButton, "");
                District selectedDistrict = districtPickerState2.getSelectedDistrict();
                if (selectedDistrict != null) {
                    str = selectedDistrict.f106273b;
                } else {
                    str = null;
                }
                radioButton.setChecked(C89219l.m154714a((Object) str, (Object) this.f106264b.f106273b));
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
        /* renamed from: a */
        public final /* synthetic */ void mo33817a(District district) {
            int i;
            District district2 = district;
            C89219l.m154721d(district2, "");
            View view = this.itemView;
            C89219l.m154716b(view, "");
            boolean z = true;
            int i2 = 0;
            if (this.f48794i == this.f106255f.getItemCount() - 1) {
                z = false;
            }
            C44998a.C44999a.m87685a(view, z);
            withState(mo63351m(), new C45646c(this, district2));
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            RadioButton radioButton = (RadioButton) view2.findViewById(R.id.ddr);
            C89219l.m154716b(radioButton, "");
            if (mo63351m().mo76863b()) {
                i = 8;
            } else {
                i = 0;
            }
            radioButton.setVisibility(i);
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) view3.findViewById(R.id.b7x);
            C89219l.m154716b(autoRTLImageView, "");
            if (!mo63351m().mo76863b()) {
                i2 = 8;
            }
            autoRTLImageView.setVisibility(i2);
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            TuxTextView tuxTextView = (TuxTextView) view4.findViewById(R.id.c2j);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(district2.f106272a);
            View view5 = this.itemView;
            C89219l.m154716b(view5, "");
            view5.setOnClickListener(new C45645b(this, district2));
            AbstractC88412b unused = selectSubscribe(mo63351m(), C45652a.f106271a, new C20370ah(), new C45647d(district2));
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$DistrictViewHolder$d */
        static final class C45647d extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<District>, District, C89391z> {

            /* renamed from: a */
            final /* synthetic */ District f106265a;

            static {
                Covode.recordClassIndex(54146);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45647d(District district) {
                super(2);
                this.f106265a = district;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<District> jediSimpleViewHolder, District district) {
                String str;
                JediSimpleViewHolder<District> jediSimpleViewHolder2 = jediSimpleViewHolder;
                District district2 = district;
                C89219l.m154721d(jediSimpleViewHolder2, "");
                View view = jediSimpleViewHolder2.itemView;
                C89219l.m154716b(view, "");
                RadioButton radioButton = (RadioButton) view.findViewById(R.id.ddr);
                C89219l.m154716b(radioButton, "");
                if (district2 != null) {
                    str = district2.f106273b;
                } else {
                    str = null;
                }
                radioButton.setChecked(C89219l.m154714a((Object) str, (Object) this.f106265a.f106273b));
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DistrictViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
                r4.f106255f = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131558965(0x7f0d0235, float:1.874326E38)
                r0 = 0
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                r4.<init>(r0)
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$DistrictViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$DistrictViewHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r4.f106256g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter.DistrictViewHolder.<init>(com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter, android.view.ViewGroup):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((AbstractC34491d) this).f81477a.mo33895b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$b */
    static final class C45649b extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ RegionAdapter f106268a;

        static {
            Covode.recordClassIndex(54149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45649b(RegionAdapter regionAdapter) {
            super(1);
            this.f106268a = regionAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new IndicatorViewHolder(this.f106268a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$d */
    static final class C45651d extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ RegionAdapter f106270a;

        static {
            Covode.recordClassIndex(54151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45651d(RegionAdapter regionAdapter) {
            super(1);
            this.f106270a = regionAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new DistrictViewHolder(this.f106270a, viewGroup2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegionAdapter(AbstractC1204m mVar) {
        super(mVar, (C1445j.AbstractC1451e) null, 6);
        C89219l.m154721d(mVar, "");
        this.f106254d = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$a */
    static final class C45648a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ RegionAdapter f106267a;

        static {
            Covode.recordClassIndex(54148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45648a(RegionAdapter regionAdapter) {
            super(1);
            this.f106267a = regionAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f106267a.mo33762a(num.intValue()) instanceof String);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.RegionAdapter$c */
    static final class C45650c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ RegionAdapter f106269a;

        static {
            Covode.recordClassIndex(54150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45650c(RegionAdapter regionAdapter) {
            super(1);
            this.f106269a = regionAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f106269a.mo33762a(num.intValue()) instanceof District);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: a */
    public final void mo60935a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, ?>> gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC20638g unused = gVar.mo33893a(new C45648a(this), null, new C45649b(this));
        AbstractC20638g unused2 = gVar.mo33893a(new C45650c(this), null, new C45651d(this));
    }
}
