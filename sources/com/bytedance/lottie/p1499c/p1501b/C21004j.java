package com.bytedance.lottie.p1499c.p1501b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1496a.AbstractC20935b;
import com.bytedance.lottie.p1495a.p1496a.C20949n;
import com.bytedance.lottie.p1499c.p1500a.AbstractC20989m;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1500a.C20982f;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;

/* renamed from: com.bytedance.lottie.c.b.j */
public final class C21004j implements AbstractC20993b {

    /* renamed from: a */
    public final String f49784a;

    /* renamed from: b */
    public final AbstractC20989m<PointF, PointF> f49785b;

    /* renamed from: c */
    public final C20982f f49786c;

    /* renamed from: d */
    public final C20978b f49787d;

    static {
        Covode.recordClassIndex(24620);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f49785b + ", size=" + this.f49786c + '}';
    }

    @Override // com.bytedance.lottie.p1499c.p1501b.AbstractC20993b
    /* renamed from: a */
    public final AbstractC20935b mo34483a(C21106i iVar, AbstractC21017a aVar) {
        return new C20949n(iVar, aVar, this);
    }

    public C21004j(String str, AbstractC20989m<PointF, PointF> mVar, C20982f fVar, C20978b bVar) {
        this.f49784a = str;
        this.f49785b = mVar;
        this.f49786c = fVar;
        this.f49787d = bVar;
    }
}
