package com.bytedance.lottie.p1499c.p1501b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.p1495a.p1496a.AbstractC20935b;
import com.bytedance.lottie.p1495a.p1496a.C20947m;
import com.bytedance.lottie.p1499c.p1500a.AbstractC20989m;
import com.bytedance.lottie.p1499c.p1500a.C20978b;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;

/* renamed from: com.bytedance.lottie.c.b.i */
public final class C21002i implements AbstractC20993b {

    /* renamed from: a */
    public final String f49773a;

    /* renamed from: b */
    public final EnumC21003a f49774b;

    /* renamed from: c */
    public final C20978b f49775c;

    /* renamed from: d */
    public final AbstractC20989m<PointF, PointF> f49776d;

    /* renamed from: e */
    public final C20978b f49777e;

    /* renamed from: f */
    public final C20978b f49778f;

    /* renamed from: g */
    public final C20978b f49779g;

    /* renamed from: h */
    public final C20978b f49780h;

    /* renamed from: i */
    public final C20978b f49781i;

    static {
        Covode.recordClassIndex(24618);
    }

    /* renamed from: com.bytedance.lottie.c.b.i$a */
    public enum EnumC21003a {
        Star(1),
        Polygon(2);
        

        /* renamed from: a */
        private final int f49783a;

        static {
            Covode.recordClassIndex(24619);
        }

        public static EnumC21003a forValue(int i) {
            EnumC21003a[] values = values();
            for (EnumC21003a aVar : values) {
                if (aVar.f49783a == i) {
                    return aVar;
                }
            }
            return null;
        }

        private EnumC21003a(int i) {
            this.f49783a = i;
        }
    }

    @Override // com.bytedance.lottie.p1499c.p1501b.AbstractC20993b
    /* renamed from: a */
    public final AbstractC20935b mo34483a(C21106i iVar, AbstractC21017a aVar) {
        return new C20947m(iVar, aVar, this);
    }

    public C21002i(String str, EnumC21003a aVar, C20978b bVar, AbstractC20989m<PointF, PointF> mVar, C20978b bVar2, C20978b bVar3, C20978b bVar4, C20978b bVar5, C20978b bVar6) {
        this.f49773a = str;
        this.f49774b = aVar;
        this.f49775c = bVar;
        this.f49776d = mVar;
        this.f49777e = bVar2;
        this.f49778f = bVar3;
        this.f49779g = bVar4;
        this.f49780h = bVar5;
        this.f49781i = bVar6;
    }
}
