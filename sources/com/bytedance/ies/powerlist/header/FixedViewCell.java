package com.bytedance.ies.powerlist.header;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.PowerCell;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class FixedViewCell extends PowerCell<C17660a> {
    static {
        Covode.recordClassIndex(20215);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154719c(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.am7, viewGroup, false);
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C17660a aVar) {
        MethodCollector.m26663i(5141);
        C17660a aVar2 = aVar;
        C89219l.m154719c(aVar2, "");
        View view = aVar2.f42228a;
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            View view2 = this.itemView;
            C89219l.m154709a((Object) view2, "");
            if (!C89219l.m154714a(viewGroup, view2.findViewById(R.id.dnb))) {
                viewGroup.removeView(view);
            }
            MethodCollector.m26664o(5141);
            return;
        }
        View view3 = this.itemView;
        C89219l.m154709a((Object) view3, "");
        ((FrameLayout) view3.findViewById(R.id.dnb)).addView(view);
        MethodCollector.m26664o(5141);
    }
}
