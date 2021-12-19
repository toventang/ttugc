package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.i */
public final class C72312i {

    /* renamed from: a */
    public static final C72312i f162115a = new C72312i();

    /* renamed from: b */
    private static final AbstractC72315l f162116b;

    private C72312i() {
    }

    static {
        Covode.recordClassIndex(84979);
        if (Build.VERSION.SDK_INT >= 21) {
            f162116b = new C72314k();
        } else {
            f162116b = new C72313j();
        }
    }

    /* renamed from: a */
    public static PropertyValuesHolder m127528a(Property<?, PointF> property, Path path) {
        return f162116b.mo114581a(property, path);
    }
}
