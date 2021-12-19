package com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37624c;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.a.d */
public final class C37613d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final TextView f88917a;

    static {
        Covode.recordClassIndex(45035);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37613d(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = this.itemView.findViewById(R.id.exv);
        C89219l.m154716b(findViewById, "");
        this.f88917a = (TextView) findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.a.d$a */
    static final class View$OnClickListenerC37614a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37613d f88918a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f88919b;

        /* renamed from: c */
        final /* synthetic */ WikipediaInfo f88920c;

        /* renamed from: d */
        final /* synthetic */ Map f88921d;

        static {
            Covode.recordClassIndex(45036);
        }

        View$OnClickListenerC37614a(C37613d dVar, AbstractC89172b bVar, WikipediaInfo wikipediaInfo, Map map) {
            this.f88918a = dVar;
            this.f88919b = bVar;
            this.f88920c = wikipediaInfo;
            this.f88921d = map;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88919b.invoke(this.f88920c);
            View view2 = this.f88918a.itemView;
            C89219l.m154716b(view2, "");
            Context context = view2.getContext();
            C89219l.m154716b(context, "");
            C37624c.m75876a(context, this.f88920c, this.f88921d, C89041ag.m154415a());
        }
    }
}
