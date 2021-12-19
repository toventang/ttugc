package com.bytedance.lottie.p1499c.p1501b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1496a.AbstractC20935b;
import com.bytedance.lottie.p1495a.p1496a.C20936c;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.lottie.c.b.n */
public final class C21008n implements AbstractC20993b {

    /* renamed from: a */
    public final String f49800a;

    /* renamed from: b */
    public final List<AbstractC20993b> f49801b;

    static {
        Covode.recordClassIndex(24624);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f49800a + "' Shapes: " + Arrays.toString(this.f49801b.toArray()) + '}';
    }

    public C21008n(String str, List<AbstractC20993b> list) {
        this.f49800a = str;
        this.f49801b = list;
    }

    @Override // com.bytedance.lottie.p1499c.p1501b.AbstractC20993b
    /* renamed from: a */
    public final AbstractC20935b mo34483a(C21106i iVar, AbstractC21017a aVar) {
        return new C20936c(iVar, aVar, this);
    }
}
