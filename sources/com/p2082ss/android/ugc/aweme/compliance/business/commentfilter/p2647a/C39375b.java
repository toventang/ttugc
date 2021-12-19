package com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2647a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.a.b */
public final class C39375b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final TextView f92949a;

    /* renamed from: b */
    public int f92950b;

    /* renamed from: c */
    public final View f92951c;

    /* renamed from: d */
    public final Context f92952d;

    /* renamed from: e */
    private final ImageView f92953e;

    static {
        Covode.recordClassIndex(47059);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39375b(View view, Context context, final AbstractC89172b<? super Integer, C89391z> bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        this.f92951c = view;
        this.f92952d = context;
        this.f92949a = (TextView) view.findViewById(R.id.eex);
        ImageView imageView = (ImageView) view.findViewById(R.id.aiw);
        this.f92953e = imageView;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2647a.C39375b.View$OnClickListenerC393761 */

            /* renamed from: a */
            final /* synthetic */ C39375b f92954a;

            static {
                Covode.recordClassIndex(47060);
            }

            {
                this.f92954a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                bVar.invoke(Integer.valueOf(this.f92954a.f92950b));
            }
        });
    }
}
