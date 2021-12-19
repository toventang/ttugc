package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.p2863a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.a.i */
final /* synthetic */ class C45643i extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f106253a = new C45643i();

    static {
        Covode.recordClassIndex(54140);
    }

    C45643i() {
        super(DistrictPickerWrapperState.class, "selectedRegions", "getSelectedRegions()Ljava/util/List;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((DistrictPickerWrapperState) obj).getSelectedRegions();
    }
}
