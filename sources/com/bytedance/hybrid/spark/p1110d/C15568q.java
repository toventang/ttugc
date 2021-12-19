package com.bytedance.hybrid.spark.p1110d;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.view.RadiusLayout;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21137b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.q */
public final class C15568q implements AbstractC15510f {

    /* renamed from: a */
    private final C21137b f37944a;

    /* renamed from: b */
    private final RadiusLayout f37945b;

    /* renamed from: c */
    private final boolean f37946c;

    static {
        Covode.recordClassIndex(17830);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        boolean z;
        if (this.f37946c) {
            RadiusLayout radiusLayout = this.f37945b;
            float radius = (float) this.f37944a.getRadius();
            float radius2 = (float) this.f37944a.getRadius();
            int i = Build.VERSION.SDK_INT;
            Resources resources = radiusLayout.getResources();
            C89219l.m154709a((Object) resources, "");
            Configuration configuration = resources.getConfiguration();
            C89219l.m154709a((Object) configuration, "");
            if (configuration.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            radiusLayout.f38050b = z ? new float[]{radius2, radius2, radius, radius, 0.0f, 0.0f, 0.0f, 0.0f} : new float[]{radius, radius, radius2, radius2, 0.0f, 0.0f, 0.0f, 0.0f};
            radiusLayout.invalidate();
            return;
        }
        this.f37945b.setRadius((float) this.f37944a.getRadius());
    }

    public C15568q(C21137b bVar, RadiusLayout radiusLayout, boolean z) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(radiusLayout, "");
        this.f37944a = bVar;
        this.f37945b = radiusLayout;
        this.f37946c = z;
    }
}
