package com.p2082ss.android.ugc.aweme.kids.discovery.list;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.AbstractC57367d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.d */
public final class C57597d extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(67555);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57597d(View view, final AbstractC57367d dVar) {
        super(view);
        C89219l.m154721d(view, "");
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.discovery.list.C57597d.View$OnClickListenerC575981 */

            static {
                Covode.recordClassIndex(67556);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC57367d dVar = dVar;
                if (dVar != null) {
                    dVar.mo94631a(view, null, "view more");
                }
            }
        });
    }
}
