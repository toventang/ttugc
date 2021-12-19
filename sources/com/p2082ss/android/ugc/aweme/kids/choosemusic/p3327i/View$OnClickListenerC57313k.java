package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57235c;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e.C57110d;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.i.k */
public final class View$OnClickListenerC57313k extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a */
    TextView f130596a;

    /* renamed from: b */
    RemoteImageView f130597b;

    /* renamed from: c */
    C57110d f130598c;

    /* renamed from: d */
    private int f130599d;

    /* renamed from: e */
    private AbstractC57235c f130600e;

    static {
        Covode.recordClassIndex(67218);
    }

    public final void onClick(View view) {
        AbstractC57235c cVar;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200) && this.f130598c != null && this.itemView != null && (cVar = this.f130600e) != null) {
            cVar.mo94453a(this.f130598c);
        }
    }

    public View$OnClickListenerC57313k(View view, int i, AbstractC57235c cVar) {
        super(view);
        this.f130596a = (TextView) view.findViewById(R.id.etp);
        this.f130597b = (RemoteImageView) view.findViewById(R.id.bu1);
        this.f130599d = i;
        this.itemView.setOnClickListener(this);
        this.f130600e = cVar;
    }
}
