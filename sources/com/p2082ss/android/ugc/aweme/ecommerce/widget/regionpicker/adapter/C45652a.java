package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.adapter.a */
final /* synthetic */ class C45652a extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f106271a = new C45652a();

    static {
        Covode.recordClassIndex(54152);
    }

    C45652a() {
        super(DistrictPickerState.class, "selectedDistrict", "getSelectedDistrict()Lcom/ss/android/ugc/aweme/ecommerce/widget/regionpicker/model/District;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((DistrictPickerState) obj).getSelectedDistrict();
    }
}
