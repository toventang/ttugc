package com.p2082ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.choosemusic.p2464d.AbstractC35828c;
import com.p2082ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.o */
public final class View$OnClickListenerC36020o extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a */
    TextView f85071a;

    /* renamed from: b */
    RemoteImageView f85072b;

    /* renamed from: c */
    MusicCollectionItem f85073c;

    /* renamed from: d */
    private int f85074d;

    /* renamed from: e */
    private AbstractC35828c f85075e;

    static {
        Covode.recordClassIndex(43266);
    }

    public final void onClick(View view) {
        AbstractC35828c cVar;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200) && this.f85073c != null && this.itemView != null && (cVar = this.f85075e) != null) {
            cVar.mo62935a(this.f85073c);
        }
    }

    public View$OnClickListenerC36020o(View view, int i, AbstractC35828c cVar) {
        super(view);
        this.f85071a = (TextView) view.findViewById(R.id.etp);
        this.f85072b = (RemoteImageView) view.findViewById(R.id.bu1);
        this.f85074d = i;
        this.itemView.setOnClickListener(this);
        this.f85075e = cVar;
    }
}
