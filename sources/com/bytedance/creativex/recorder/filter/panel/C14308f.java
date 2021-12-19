package com.bytedance.creativex.recorder.filter.panel;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.creativex.recorder.filter.panel.f */
final /* synthetic */ class C14308f extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f34657a = new C14308f();

    static {
        Covode.recordClassIndex(16379);
    }

    C14308f() {
        super(FilterPanelState.class, "selectedFilter", "getSelectedFilter()Lcom/ss/android/ugc/aweme/filter/FilterBean;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((FilterPanelState) obj).getSelectedFilter();
    }
}
