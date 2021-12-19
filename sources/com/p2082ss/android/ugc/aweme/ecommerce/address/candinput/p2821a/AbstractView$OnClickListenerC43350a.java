package com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.p2821a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.AbstractC43354b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43368d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.a.a */
public abstract class AbstractView$OnClickListenerC43350a extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a */
    public AbstractC43354b f101181a;

    static {
        Covode.recordClassIndex(51570);
    }

    /* renamed from: a */
    public abstract void mo73869a(C43368d dVar, int i);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractView$OnClickListenerC43350a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC43354b bVar = this.f101181a;
        if (bVar != null) {
            bVar.mo73867a(getLayoutPosition());
        }
    }
}
