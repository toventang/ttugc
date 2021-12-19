package com.bytedance.ies.xelement.pickview.p1391a;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.ies.xelement.pickview.a.a */
public final class C19382a implements AbstractC19384c<String> {

    /* renamed from: a */
    private List<String> f45893a;

    static {
        Covode.recordClassIndex(22177);
    }

    @Override // com.bytedance.ies.xelement.pickview.p1391a.AbstractC19384c
    /* renamed from: a */
    public final int mo30908a() {
        return this.f45893a.size();
    }

    public C19382a(List<String> list) {
        this.f45893a = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.xelement.pickview.p1391a.AbstractC19384c
    /* renamed from: a */
    public final /* synthetic */ String mo30909a(int i) {
        if (i < 0 || i >= this.f45893a.size()) {
            return "";
        }
        return this.f45893a.get(i);
    }
}
