package com.p2082ss.android.ugc.aweme.p2282ad.comment.p2289d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.d.a */
public final class View$OnClickListenerC33149a extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public C38214ac f78747a;

    /* renamed from: b */
    public Aweme f78748b;

    /* renamed from: c */
    public TextView f78749c;

    /* renamed from: d */
    private AbstractC33150a f78750d;

    /* renamed from: e */
    private TextView f78751e;

    /* renamed from: f */
    private TextView f78752f;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.d.a$a */
    public interface AbstractC33150a {
        static {
            Covode.recordClassIndex(39968);
        }

        /* renamed from: a */
        void mo59009a();

        /* renamed from: b */
        void mo59010b();

        /* renamed from: c */
        void mo59011c();
    }

    static {
        Covode.recordClassIndex(39967);
    }

    public final void setInnerClick(AbstractC33150a aVar) {
        this.f78750d = aVar;
    }

    public final void onClick(View view) {
        AbstractC33150a aVar;
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        int id = view.getId();
        if (id == R.id.ch7) {
            AbstractC33150a aVar2 = this.f78750d;
            if (aVar2 != null) {
                aVar2.mo59010b();
            }
        } else if (id == R.id.ctp) {
            AbstractC33150a aVar3 = this.f78750d;
            if (aVar3 != null) {
                aVar3.mo59009a();
            }
        } else if (id == R.id.dii && (aVar = this.f78750d) != null) {
            aVar.mo59011c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private View$OnClickListenerC33149a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13860);
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.nf, this, true);
        this.f78751e = (TextView) a.findViewById(R.id.ch7);
        this.f78752f = (TextView) a.findViewById(R.id.ctp);
        this.f78749c = (TextView) a.findViewById(R.id.dii);
        TextView textView = this.f78751e;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f78752f;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.f78749c;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
            MethodCollector.m26664o(13860);
            return;
        }
        MethodCollector.m26664o(13860);
    }

    public /* synthetic */ View$OnClickListenerC33149a(Context context, byte b) {
        this(context);
    }
}
