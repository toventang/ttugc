package com.p2082ss.android.ugc.aweme.canvas;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.canvas.k */
public final class C35390k {

    /* renamed from: a */
    String f83493a = "unset";

    /* renamed from: b */
    public VESize f83494b;

    /* renamed from: c */
    PhotoCanvasTransformFilterParam f83495c;

    /* renamed from: d */
    public final C1213t<VEVideoTransformFilterParam> f83496d = new C1213t<>();

    /* renamed from: e */
    private final HashMap<String, VEVideoTransformFilterParam> f83497e = new HashMap<>();

    static {
        Covode.recordClassIndex(42564);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo62307a() {
        if (this.f83494b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final VEVideoTransformFilterParam mo62308b() {
        if (this.f83497e.get(this.f83493a) == null) {
            HashMap<String, VEVideoTransformFilterParam> hashMap = this.f83497e;
            String str = this.f83493a;
            VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
            PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam = this.f83495c;
            if (photoCanvasTransformFilterParam != null) {
                vEVideoTransformFilterParam.scaleFactor = photoCanvasTransformFilterParam.getScaleFactor();
                vEVideoTransformFilterParam.transX = photoCanvasTransformFilterParam.getTransX();
                vEVideoTransformFilterParam.transY = photoCanvasTransformFilterParam.getTransY();
                vEVideoTransformFilterParam.degree = photoCanvasTransformFilterParam.getDegree();
            }
            hashMap.put(str, vEVideoTransformFilterParam);
        }
        VEVideoTransformFilterParam vEVideoTransformFilterParam2 = this.f83497e.get(this.f83493a);
        if (vEVideoTransformFilterParam2 != null) {
            return vEVideoTransformFilterParam2;
        }
        throw new IllegalStateException("cannot find current filter param");
    }
}
