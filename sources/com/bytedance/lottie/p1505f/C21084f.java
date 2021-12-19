package com.bytedance.lottie.p1505f;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1495a.p1496a.AbstractC20943j;
import com.bytedance.lottie.p1499c.C20976a;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1499c.p1501b.C21006l;
import java.util.List;

/* renamed from: com.bytedance.lottie.f.f */
public final class C21084f {
    static {
        Covode.recordClassIndex(24700);
    }

    /* renamed from: com.bytedance.lottie.f.f$a */
    static class C21085a extends AbstractC21086g<PointF> {

        /* renamed from: a */
        static final C21085a f49961a = new C21085a();

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.bytedance.lottie.p1505f.AbstractC21086g
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ PointF[] mo34556a() {
            return new PointF[3];
        }

        private C21085a() {
        }

        static {
            Covode.recordClassIndex(24701);
        }
    }

    /* renamed from: a */
    public static int m39707a(int i) {
        return Math.max(0, Math.min(255, i));
    }

    /* renamed from: a */
    static int m39706a(float f, float f2) {
        boolean z;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (!z && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* renamed from: a */
    public static PointF m39708a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: a */
    public static void m39709a(C21006l lVar, Path path) {
        path.reset();
        PointF pointF = lVar.f49793b;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = (PointF) C21085a.f49961a.mo34558b();
        if (pointF2 == null) {
            pointF2 = new PointF(f, f2);
        } else {
            pointF2.x = f;
            pointF2.y = f2;
        }
        for (int i = 0; i < lVar.f49792a.size(); i++) {
            C20976a aVar = lVar.f49792a.get(i);
            PointF pointF3 = aVar.f49709a;
            PointF pointF4 = aVar.f49710b;
            PointF pointF5 = aVar.f49711c;
            if (!pointF3.equals(pointF2) || !pointF4.equals(pointF5)) {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            } else {
                path.lineTo(pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
        }
        C21085a.f49961a.mo34557a(pointF2);
        if (lVar.f49794c) {
            path.close();
        }
    }

    /* renamed from: a */
    public static float m39705a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: a */
    public static void m39710a(C21033e eVar, int i, List<C21033e> list, C21033e eVar2, AbstractC20943j jVar) {
        if (eVar.mo34507c(jVar.mo34457b(), i)) {
            list.add(eVar2.mo34504a(jVar.mo34457b()).mo34503a(jVar));
        }
    }
}
