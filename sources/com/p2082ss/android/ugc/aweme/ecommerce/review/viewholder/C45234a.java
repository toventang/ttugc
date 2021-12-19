package com.p2082ss.android.ugc.aweme.ecommerce.review.viewholder;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.viewholder.a */
public final class C45234a {
    static {
        Covode.recordClassIndex(53681);
    }

    /* renamed from: a */
    public static final <T, V extends View> void m87822a(ViewGroup viewGroup, List<? extends T> list, AbstractC89171a<? extends V> aVar, AbstractC89187q<? super V, ? super T, ? super Integer, C89391z> qVar) {
        MethodCollector.m26663i(8315);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(qVar, "");
        if (list == null || list.isEmpty()) {
            viewGroup.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
        }
        if (C89219l.m154714a(viewGroup.getTag(), list) || list == null) {
            viewGroup.setTag(list);
            MethodCollector.m26664o(8315);
            return;
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                View view = (View) aVar.invoke();
                viewGroup.addView(view);
                qVar.invoke(view, t, Integer.valueOf(i));
            } else {
                childAt.setVisibility(0);
                qVar.invoke(childAt, t, Integer.valueOf(i));
            }
            i = i2;
        }
        if (viewGroup.getChildCount() > list.size()) {
            int childCount = viewGroup.getChildCount();
            for (int size = list.size(); size < childCount; size++) {
                View childAt2 = viewGroup.getChildAt(size);
                C89219l.m154716b(childAt2, "");
                childAt2.setVisibility(8);
            }
        }
        MethodCollector.m26664o(8315);
    }
}
