package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3159c.p3161b;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.b */
public final class C54931b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public TextView f125751a;

    /* renamed from: b */
    public TuxIconView f125752b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.b$a */
    public interface AbstractC54932a {
        static {
            Covode.recordClassIndex(64654);
        }

        /* renamed from: a */
        void mo91927a();
    }

    static {
        Covode.recordClassIndex(64653);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.c.b.b$b */
    public static final class View$OnClickListenerC54933b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54931b f125753a;

        /* renamed from: b */
        final /* synthetic */ AbstractC54932a f125754b;

        static {
            Covode.recordClassIndex(64655);
        }

        public View$OnClickListenerC54933b(C54931b bVar, AbstractC54932a aVar) {
            this.f125753a = bVar;
            this.f125754b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125754b.mo91927a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54931b(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.f66);
        C89219l.m154716b(findViewById, "");
        this.f125751a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bkm);
        C89219l.m154716b(findViewById2, "");
        this.f125752b = (TuxIconView) findViewById2;
    }
}
