package com.p2082ss.android.ugc.aweme.tools.draft.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78243n;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.j */
public final class C78454j extends AbstractC78442a<C78243n> {

    /* renamed from: a */
    private TextView f176287a;

    static {
        Covode.recordClassIndex(91582);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78454j(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f176287a = (TextView) view.findViewById(R.id.f62);
        C17301b.m32033a().mo27614a(this.f176287a, C17303d.f41573g);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.tools.draft.d.a] */
    @Override // com.p2082ss.android.ugc.aweme.tools.draft.viewholder.AbstractC78442a
    /* renamed from: a */
    public final /* synthetic */ void mo122361a(C78243n nVar) {
        C78243n nVar2 = nVar;
        C89219l.m154721d(nVar2, "");
        int i = nVar2.f175740c;
        TextView textView = this.f176287a;
        if (textView != null && i >= 0) {
            textView.setText(i);
        }
    }
}
