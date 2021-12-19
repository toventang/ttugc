package com.bytedance.tux.table.p1726a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.table.a.b */
public final class C23276b {

    /* renamed from: a */
    public static final int f55182a;

    /* renamed from: b */
    public static final C23276b f55183b = new C23276b();

    /* renamed from: c */
    private static final int f55184c;

    private C23276b() {
    }

    static {
        Covode.recordClassIndex(27226);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f55182a = C89241a.m154730a(TypedValue.applyDimension(1, 86.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        f55184c = C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics()));
    }

    /* renamed from: b */
    public static void m43838b(ConstraintLayout constraintLayout, View view, View view2) {
        C89219l.m154719c(constraintLayout, "");
        C89219l.m154719c(view, "");
        C89219l.m154719c(view2, "");
        constraintLayout.removeView(view);
        C0550b bVar = new C0550b();
        bVar.mo2451a(constraintLayout);
        bVar.mo2444a(view.getId());
        bVar.mo2448a(view2.getId(), 7, constraintLayout.getId(), 7);
        bVar.mo2454b(constraintLayout);
    }

    /* renamed from: a */
    public static void m43837a(ConstraintLayout constraintLayout, View view, View view2) {
        MethodCollector.m26663i(8417);
        C89219l.m154719c(constraintLayout, "");
        C89219l.m154719c(view, "");
        C89219l.m154719c(view2, "");
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        view.setId(R.id.er9);
        constraintLayout.addView(view);
        int id = view.getId();
        int id2 = view2.getId();
        int id3 = constraintLayout.getId();
        C0550b bVar = new C0550b();
        bVar.mo2451a(constraintLayout);
        bVar.mo2448a(id, 3, id3, 3);
        bVar.mo2448a(id, 7, id3, 7);
        bVar.mo2448a(id2, 7, id, 6);
        bVar.mo2445a(id2, 0.0f);
        bVar.mo2448a(id, 6, id2, 7);
        bVar.mo2445a(id, 1.0f);
        bVar.mo2455c(id2);
        bVar.mo2454b(constraintLayout);
        C23163i.m43668b(view, Integer.valueOf(f55184c), null, null, null, false, 30);
        MethodCollector.m26664o(8417);
    }
}
