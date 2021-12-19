package com.bytedance.lottie.p1499c.p1501b;

import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1496a.AbstractC20935b;
import com.bytedance.lottie.p1495a.p1496a.C20939f;
import com.bytedance.lottie.p1499c.p1500a.C20977a;
import com.bytedance.lottie.p1499c.p1500a.C20980d;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;

/* renamed from: com.bytedance.lottie.c.b.m */
public final class C21007m implements AbstractC20993b {

    /* renamed from: a */
    public final Path.FillType f49795a;

    /* renamed from: b */
    public final String f49796b;

    /* renamed from: c */
    public final C20977a f49797c;

    /* renamed from: d */
    public final C20980d f49798d;

    /* renamed from: e */
    private final boolean f49799e;

    static {
        Covode.recordClassIndex(24623);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f49799e + '}';
    }

    @Override // com.bytedance.lottie.p1499c.p1501b.AbstractC20993b
    /* renamed from: a */
    public final AbstractC20935b mo34483a(C21106i iVar, AbstractC21017a aVar) {
        return new C20939f(iVar, aVar, this);
    }

    public C21007m(String str, boolean z, Path.FillType fillType, C20977a aVar, C20980d dVar) {
        this.f49796b = str;
        this.f49799e = z;
        this.f49795a = fillType;
        this.f49797c = aVar;
        this.f49798d = dVar;
    }
}
