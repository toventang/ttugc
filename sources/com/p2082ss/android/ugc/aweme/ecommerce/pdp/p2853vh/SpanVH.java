package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.SpanVH */
public final class SpanVH extends AbsFullSpanVH<C44954h> implements AbstractC33974au {
    static {
        Covode.recordClassIndex(53346);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpanVH(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        C89219l.m154721d(viewGroup, "");
        MethodCollector.m26663i(7129);
        MethodCollector.m26664o(7129);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(Object obj) {
        C44954h hVar = (C44954h) obj;
        C89219l.m154721d(hVar, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        RecyclerView.C1367j jVar = new RecyclerView.C1367j(-1, (int) C13628n.m24520b(view.getContext(), hVar.f104886a));
        jVar.leftMargin = hVar.f104888c;
        jVar.rightMargin = hVar.f104888c;
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        view2.setLayoutParams(jVar);
        this.itemView.setPadding(hVar.f104888c, 0, hVar.f104888c, 0);
        this.itemView.setBackgroundColor(hVar.f104889d);
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        C44998a.C44999a.m87685a(view3, hVar.f104887b);
    }
}
