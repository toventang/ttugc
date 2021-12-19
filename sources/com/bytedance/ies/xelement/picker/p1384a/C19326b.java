package com.bytedance.ies.xelement.picker.p1384a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.xelement.picker.a.b */
public final class C19326b implements AbstractC19328d<Integer> {

    /* renamed from: a */
    private int f45674a;

    /* renamed from: b */
    private int f45675b;

    static {
        Covode.recordClassIndex(22114);
    }

    @Override // com.bytedance.ies.xelement.picker.p1384a.AbstractC19328d
    /* renamed from: a */
    public final int mo30777a() {
        return (this.f45675b - this.f45674a) + 1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.xelement.picker.p1384a.AbstractC19328d
    /* renamed from: a */
    public final /* synthetic */ Integer mo30778a(int i) {
        if (i < 0 || i >= mo30777a()) {
            return 0;
        }
        return Integer.valueOf(this.f45674a + i);
    }

    public C19326b(int i, int i2) {
        this.f45674a = i;
        this.f45675b = i2;
    }
}
