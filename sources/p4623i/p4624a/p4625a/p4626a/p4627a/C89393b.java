package p4623i.p4624a.p4625a.p4626a.p4627a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: i.a.a.a.a.b */
public final class C89393b {
    static {
        Covode.recordClassIndex(105477);
    }

    /* renamed from: a */
    public static final void m154949a(View view) {
        C89219l.m154721d(view, "");
        C13628n.m24510a(view, 8);
    }

    /* renamed from: b */
    public static final void m154950b(View view) {
        C89219l.m154721d(view, "");
        C13628n.m24510a(view, 4);
    }

    /* renamed from: c */
    public static final void m154951c(View view) {
        C89219l.m154721d(view, "");
        C13628n.m24510a(view, 0);
    }

    /* renamed from: a */
    public static final float m154948a(float f) {
        Context e = C3966y.m9669e();
        C89219l.m154716b(e, "");
        Context applicationContext = e.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154716b(applicationContext, "");
        Resources resources = applicationContext.getResources();
        C89219l.m154716b(resources, "");
        return (resources.getDisplayMetrics().density * f) + 0.5f;
    }
}
