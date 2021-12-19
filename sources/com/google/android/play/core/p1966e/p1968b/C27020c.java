package com.google.android.play.core.p1966e.p1968b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1966e.AbstractC27034f;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.b.c */
public final /* synthetic */ class C27020c implements AbstractC27028k {

    /* renamed from: a */
    private final Integer f63951a;

    /* renamed from: b */
    private final int f63952b;

    /* renamed from: c */
    private final int f63953c;

    /* renamed from: d */
    private final Long f63954d;

    /* renamed from: e */
    private final Long f63955e;

    /* renamed from: f */
    private final List f63956f;

    /* renamed from: g */
    private final List f63957g;

    static {
        Covode.recordClassIndex(32496);
    }

    C27020c(Integer num, int i, int i2, Long l, Long l2, List list, List list2) {
        this.f63951a = num;
        this.f63952b = i;
        this.f63953c = i2;
        this.f63954d = l;
        this.f63955e = l2;
        this.f63956f = list;
        this.f63957g = list2;
    }

    @Override // com.google.android.play.core.p1966e.p1968b.AbstractC27028k
    /* renamed from: a */
    public final AbstractC27034f mo44726a(AbstractC27034f fVar) {
        Integer num = this.f63951a;
        int i = this.f63952b;
        int i2 = this.f63953c;
        Long l = this.f63954d;
        Long l2 = this.f63955e;
        List<String> list = this.f63956f;
        List<String> list2 = this.f63957g;
        if (fVar == null) {
            fVar = AbstractC27034f.m53721a(0, 0, 0, 0, 0, new ArrayList(), new ArrayList());
        }
        int a = num == null ? fVar.mo44734a() : num.intValue();
        long d = l == null ? fVar.mo44737d() : l.longValue();
        long e = l2 == null ? fVar.mo44738e() : l2.longValue();
        if (list == null) {
            list = fVar.mo44739f();
        }
        if (list2 == null) {
            list2 = fVar.mo44740g();
        }
        return AbstractC27034f.m53721a(a, i, i2, d, e, list, list2);
    }
}
