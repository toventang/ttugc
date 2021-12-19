package com.bytedance.tux.tooltip.p1727a.p1728a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.tooltip.a.a.c */
public final class C23320c extends LinearLayout {
    static {
        Covode.recordClassIndex(27273);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C23320c(Context context) {
        super(context, null, R.attr.cg);
        final int parseColor;
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(11934);
        setOrientation(1);
        int[] iArr = {R.attr.gm, R.attr.gn, R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu};
        C89219l.m154709a((Object) iArr, "");
        Integer a = C23155d.m43642a(context, iArr, 1);
        if (a != null) {
            parseColor = a.intValue();
        } else {
            parseColor = Color.parseColor("#33FFFFFF");
        }
        setDividerDrawable(C23009f.m43397a(new AbstractC89172b<C23008e, C89391z>() {
            /* class com.bytedance.tux.tooltip.p1727a.p1728a.C23320c.C233211 */

            static {
                Covode.recordClassIndex(27274);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23008e eVar) {
                C23008e eVar2 = eVar;
                C89219l.m154719c(eVar2, "");
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                eVar2.f54468g = C89241a.m154730a(TypedValue.applyDimension(1, 0.5f, system.getDisplayMetrics()));
                eVar2.f54462a = Integer.valueOf(parseColor);
                return C89391z.f203057a;
            }
        }).mo37389a(context));
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        setDividerPadding(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
        setShowDividers(2);
        MethodCollector.m26664o(11934);
    }

    public final void setActions(List<? extends AbstractC23318a> list) {
        C89219l.m154719c(list, "");
        removeAllViews();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View view = (AbstractC23318a) it.next();
            if (view instanceof View) {
                if (view != null) {
                    addView(view);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (view instanceof C23322d.C23323a) {
                Context context = getContext();
                C89219l.m154709a((Object) context, "");
                C23325e eVar = new C23325e(context, (byte) 0);
                eVar.setAction((C23322d.C23323a) view);
                addView(eVar);
            } else if (view instanceof C23322d.C23324b) {
                Context context2 = getContext();
                C89219l.m154709a((Object) context2, "");
                C23327f fVar = new C23327f(context2, (byte) 0);
                fVar.setAction((C23322d.C23324b) view);
                addView(fVar);
            }
        }
    }

    public /* synthetic */ C23320c(Context context, byte b) {
        this(context);
    }
}
