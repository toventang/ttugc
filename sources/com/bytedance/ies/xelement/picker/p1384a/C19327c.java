package com.bytedance.ies.xelement.picker.p1384a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.xelement.picker.a.c */
public final class C19327c implements AbstractC19328d<Integer> {

    /* renamed from: a */
    private int f45676a;

    /* renamed from: b */
    private int f45677b;

    /* renamed from: c */
    private int f45678c = 24;

    static {
        Covode.recordClassIndex(22115);
    }

    @Override // com.bytedance.ies.xelement.picker.p1384a.AbstractC19328d
    /* renamed from: a */
    public final int mo30777a() {
        return (this.f45677b - this.f45676a) + 1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.xelement.picker.p1384a.AbstractC19328d
    /* renamed from: a */
    public final /* synthetic */ Integer mo30778a(int i) {
        if (i < 0 || i >= mo30777a()) {
            return 0;
        }
        return Integer.valueOf((this.f45676a + i) % this.f45678c);
    }

    public C19327c(int i, int i2) {
        this.f45676a = i;
        if (i2 > i) {
            this.f45677b = i2;
        } else {
            this.f45677b = i2 + 24;
        }
    }
}
