package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.C50349d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.f */
public final class C50398f extends ConstraintLayout {

    /* renamed from: g */
    public C50349d f116356g;

    /* renamed from: h */
    private ImageView f116357h;

    static {
        Covode.recordClassIndex(59530);
    }

    public C50398f(Context context) {
        super(context);
        MethodCollector.m26663i(4053);
        View.inflate(getContext(), R.layout.sh, this);
        View findViewById = findViewById(R.id.bsy);
        C89219l.m154716b(findViewById, "");
        ImageView imageView = (ImageView) findViewById;
        this.f116357h = imageView;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50398f.View$OnClickListenerC503991 */

            /* renamed from: a */
            final /* synthetic */ C50398f f116358a;

            static {
                Covode.recordClassIndex(59531);
            }

            {
                this.f116358a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C50349d dVar = this.f116358a.f116356g;
                if (dVar != null) {
                    C89219l.m154716b(view, "");
                    dVar.mo85531b(view);
                }
            }
        });
        setOnClickListener(View$OnClickListenerC504002.f116359a);
        MethodCollector.m26664o(4053);
    }
}
