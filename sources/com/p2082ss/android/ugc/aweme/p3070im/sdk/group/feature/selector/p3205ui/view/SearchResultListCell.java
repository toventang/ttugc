package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55727e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.SearchResultListCell */
public final class SearchResultListCell extends BaseContactListCell<C55599d> {
    static {
        Covode.recordClassIndex(65357);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo92491a(C55599d dVar) {
        C89219l.m154721d(dVar, "");
        super.mo23350a((C55597b) dVar);
        View findViewById = this.itemView.findViewById(R.id.cpq);
        C89219l.m154716b(findViewById, "");
        C55727e.m101480a((TextView) findViewById, dVar.f126828a.getDisplayName(), dVar.f126831c);
        View findViewById2 = this.itemView.findViewById(R.id.akb);
        C89219l.m154716b(findViewById2, "");
        C55727e.m101480a((TextView) findViewById2, dVar.f126828a.getUniqueId(), dVar.f126831c);
    }
}
