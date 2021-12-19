package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3096a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.a.b */
public final class C53843b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final RemoteImageView f123466a;

    /* renamed from: b */
    public AbstractC89183m<? super View, ? super Integer, C89391z> f123467b;

    static {
        Covode.recordClassIndex(63503);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53843b(ViewGroup viewGroup) {
        super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a52, viewGroup, false));
        C89219l.m154721d(viewGroup, "");
        View findViewById = this.itemView.findViewById(R.id.aua);
        C89219l.m154716b(findViewById, "");
        RemoteImageView remoteImageView = (RemoteImageView) findViewById;
        this.f123466a = remoteImageView;
        remoteImageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3096a.C53843b.View$OnClickListenerC538441 */

            /* renamed from: a */
            final /* synthetic */ C53843b f123468a;

            static {
                Covode.recordClassIndex(63504);
            }

            {
                this.f123468a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC89183m<? super View, ? super Integer, C89391z> mVar = this.f123468a.f123467b;
                if (mVar != null) {
                    C89219l.m154716b(view, "");
                    mVar.invoke(view, Integer.valueOf(this.f123468a.getAdapterPosition()));
                }
            }
        });
        ((C24246a) remoteImageView.getHierarchy()).mo39966c(R.drawable.auo);
    }
}
