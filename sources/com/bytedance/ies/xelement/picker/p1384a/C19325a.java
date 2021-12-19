package com.bytedance.ies.xelement.picker.p1384a;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.ies.xelement.picker.a.a */
public final class C19325a implements AbstractC19328d<String> {

    /* renamed from: a */
    private List<String> f45673a;

    static {
        Covode.recordClassIndex(22113);
    }

    @Override // com.bytedance.ies.xelement.picker.p1384a.AbstractC19328d
    /* renamed from: a */
    public final int mo30777a() {
        return this.f45673a.size();
    }

    public C19325a(List<String> list) {
        this.f45673a = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.xelement.picker.p1384a.AbstractC19328d
    /* renamed from: a */
    public final /* synthetic */ String mo30778a(int i) {
        if (i < 0 || i >= this.f45673a.size()) {
            return "";
        }
        return this.f45673a.get(i);
    }
}
