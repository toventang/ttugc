package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50387k;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.d */
public final class C50395d extends FrameLayout {

    /* renamed from: a */
    public OptionDescItemLayout f116350a;

    /* renamed from: b */
    public AbstractC50357e f116351b;

    /* renamed from: c */
    private SparseArray f116352c;

    static {
        Covode.recordClassIndex(59527);
    }

    /* renamed from: a */
    private View m94504a() {
        if (this.f116352c == null) {
            this.f116352c = new SparseArray();
        }
        View view = (View) this.f116352c.get(R.id.vn);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.vn);
        this.f116352c.put(R.id.vn, findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50395d(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4190);
        View.inflate(getContext(), R.layout.sg, this);
        View findViewById = findViewById(R.id.ajp);
        C89219l.m154716b(findViewById, "");
        this.f116350a = (OptionDescItemLayout) findViewById;
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50395d.View$OnClickListenerC503961 */

            /* renamed from: a */
            final /* synthetic */ C50395d f116353a;

            static {
                Covode.recordClassIndex(59528);
            }

            {
                this.f116353a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC50357e eVar = this.f116353a.f116351b;
                if (eVar != null) {
                    C89219l.m154716b(view, "");
                    eVar.mo85531b(view);
                }
            }
        });
        MethodCollector.m26664o(4190);
    }

    /* renamed from: a */
    public final void mo85566a(C50387k kVar, boolean z) {
        C89219l.m154721d(kVar, "");
        this.f116351b = kVar.f116331b;
        this.f116350a.mo85557a(kVar.f116330a);
        if (z) {
            View a = m94504a();
            C89219l.m154716b(a, "");
            a.setVisibility(4);
            return;
        }
        View a2 = m94504a();
        C89219l.m154716b(a2, "");
        a2.setVisibility(0);
    }
}
