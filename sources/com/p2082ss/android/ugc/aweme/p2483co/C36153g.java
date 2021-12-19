package com.p2082ss.android.ugc.aweme.p2483co;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23163i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.co.g */
public final class C36153g extends AbstractC36147a {

    /* renamed from: a */
    public View f85409a;

    /* renamed from: b */
    public View f85410b;

    /* renamed from: c */
    public View f85411c;

    /* renamed from: d */
    public View f85412d;

    static {
        Covode.recordClassIndex(43406);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2483co.AbstractC36147a
    /* renamed from: c */
    public final void mo63275c() {
        View view = this.f85409a;
        if (view != null) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(view, null, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 9.5f, system.getDisplayMetrics()))), null, false, 27);
        }
        View view2 = this.f85410b;
        if (view2 != null) {
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            C36157i.m73655a(view2, C89241a.m154730a(TypedValue.applyDimension(1, 45.0f, system2.getDisplayMetrics())), -2);
        }
        View view3 = this.f85411c;
        if (view3 != null) {
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            C36157i.m73655a(view3, a, C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system4.getDisplayMetrics())));
        }
        View view4 = this.f85412d;
        if (view4 != null) {
            Resources system5 = Resources.getSystem();
            C89219l.m154709a((Object) system5, "");
            int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system5.getDisplayMetrics()));
            Resources system6 = Resources.getSystem();
            C89219l.m154709a((Object) system6, "");
            C36157i.m73655a(view4, a2, C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system6.getDisplayMetrics())));
        }
    }

    /* renamed from: a */
    public static void m73653a(TextView textView) {
        C89219l.m154721d(textView, "");
        if (m73643a()) {
            textView.setTextSize(1, 11.0f);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(textView, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 3.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }
    }
}
