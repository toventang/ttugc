package com.p2082ss.android.ugc.aweme.account.login.p2254a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.m */
public final class C31844m extends RecyclerView.ViewHolder {

    /* renamed from: a */
    AbstractC31843l f76099a;

    /* renamed from: b */
    final AbstractC89244h f76100b;

    static {
        Covode.recordClassIndex(38586);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a.m$b */
    static final class C31846b extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ View f76102a;

        static {
            Covode.recordClassIndex(38588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31846b(View view) {
            super(0);
            this.f76102a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f76102a.findViewById(R.id.cld);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a.m$a */
    static final class View$OnClickListenerC31845a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC31843l f76101a;

        static {
            Covode.recordClassIndex(38587);
        }

        View$OnClickListenerC31845a(AbstractC31843l lVar) {
            this.f76101a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC31843l lVar = this.f76101a;
            if (lVar != null) {
                lVar.mo57785a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31844m(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f76100b = C89250i.m154774a(EnumC89331m.NONE, new C31846b(view));
    }
}
