package com.p2082ss.android.ugc.aweme.p2483co;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23163i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.co.c */
public final class C36149c extends AbstractC36147a {

    /* renamed from: a */
    public View f85394a;

    /* renamed from: b */
    public View f85395b;

    /* renamed from: c */
    public View f85396c;

    /* renamed from: d */
    public TextView f85397d;

    static {
        Covode.recordClassIndex(43402);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2483co.AbstractC36147a
    /* renamed from: c */
    public final void mo63275c() {
        View view = this.f85394a;
        if (view != null) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(view, null, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 9.5f, system.getDisplayMetrics()))), null, false, 27);
        }
        View view2 = this.f85395b;
        if (view2 != null) {
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 45.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            C36157i.m73655a(view2, a, C89241a.m154730a(TypedValue.applyDimension(1, 45.0f, system3.getDisplayMetrics())));
        }
        View view3 = this.f85396c;
        if (view3 != null) {
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system4.getDisplayMetrics()));
            Resources system5 = Resources.getSystem();
            C89219l.m154709a((Object) system5, "");
            C36157i.m73655a(view3, a2, C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system5.getDisplayMetrics())));
        }
        TextView textView = this.f85397d;
        if (textView != null) {
            textView.setTextSize(1, 11.0f);
            Resources system6 = Resources.getSystem();
            C89219l.m154709a((Object) system6, "");
            C23163i.m43668b(textView, null, Integer.valueOf(-C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system6.getDisplayMetrics()))), null, null, false, 29);
            Resources system7 = Resources.getSystem();
            C89219l.m154709a((Object) system7, "");
            C23163i.m43660a((View) textView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system7.getDisplayMetrics()))), false, 23);
        }
    }
}
