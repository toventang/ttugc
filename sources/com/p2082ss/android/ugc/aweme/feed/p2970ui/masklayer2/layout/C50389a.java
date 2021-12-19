package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.a */
public final class C50389a extends LinearLayout {

    /* renamed from: a */
    public OptionDescItemLayout f116336a;

    /* renamed from: b */
    public AbstractC50357e f116337b;

    /* renamed from: c */
    public AbstractC50357e f116338c;

    /* renamed from: d */
    private LinearLayout f116339d;

    /* renamed from: e */
    private TextView f116340e;

    /* renamed from: f */
    private SparseArray f116341f;

    static {
        Covode.recordClassIndex(59521);
    }

    /* renamed from: a */
    public final View mo85558a() {
        if (this.f116341f == null) {
            this.f116341f = new SparseArray();
        }
        View view = (View) this.f116341f.get(R.id.vn);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.vn);
        this.f116341f.put(R.id.vn, findViewById);
        return findViewById;
    }

    public C50389a(Context context) {
        super(context);
        MethodCollector.m26663i(4081);
        View.inflate(getContext(), R.layout.se, this);
        View findViewById = findViewById(R.id.ajp);
        C89219l.m154716b(findViewById, "");
        this.f116336a = (OptionDescItemLayout) findViewById;
        View findViewById2 = findViewById(R.id.cm0);
        C89219l.m154716b(findViewById2, "");
        this.f116339d = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.ezk);
        C89219l.m154716b(findViewById3, "");
        this.f116340e = (TextView) findViewById3;
        this.f116336a.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50389a.View$OnClickListenerC503901 */

            /* renamed from: a */
            final /* synthetic */ C50389a f116342a;

            static {
                Covode.recordClassIndex(59522);
            }

            {
                this.f116342a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC50357e eVar = this.f116342a.f116337b;
                if (eVar != null) {
                    C89219l.m154716b(view, "");
                    eVar.mo85531b(view);
                }
            }
        });
        this.f116339d.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50389a.View$OnClickListenerC503912 */

            /* renamed from: a */
            final /* synthetic */ C50389a f116343a;

            static {
                Covode.recordClassIndex(59523);
            }

            {
                this.f116343a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC50357e eVar = this.f116343a.f116338c;
                if (eVar != null) {
                    C89219l.m154716b(view, "");
                    eVar.mo85531b(view);
                }
            }
        });
        MethodCollector.m26664o(4081);
    }
}
