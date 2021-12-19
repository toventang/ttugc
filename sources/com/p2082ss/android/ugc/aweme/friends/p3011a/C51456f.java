package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.invite.I18nFollowAndInviteUserBtn;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.a.f */
public final class C51456f extends RecyclerView.ViewHolder {

    /* renamed from: com.ss.android.ugc.aweme.friends.a.f$a */
    public interface AbstractC51458a {
        static {
            Covode.recordClassIndex(60717);
        }

        /* renamed from: a */
        void mo86938a();
    }

    static {
        Covode.recordClassIndex(60715);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51456f(View view, final AbstractC51458a aVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        ((I18nFollowAndInviteUserBtn) view.findViewById(R.id.f87)).mo87034d();
        ((LinearLayout) view.findViewById(R.id.cd9)).setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.friends.p3011a.C51456f.View$OnClickListenerC514571 */

            static {
                Covode.recordClassIndex(60716);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                aVar.mo86938a();
            }
        });
    }
}
