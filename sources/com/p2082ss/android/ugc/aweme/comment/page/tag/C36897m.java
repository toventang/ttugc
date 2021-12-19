package com.p2082ss.android.ugc.aweme.comment.page.tag;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.m */
public final class C36897m {
    static {
        Covode.recordClassIndex(44235);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.m$a */
    public static final class View$OnClickListenerC36898a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36895l f86897a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f86898b;

        static {
            Covode.recordClassIndex(44236);
        }

        public View$OnClickListenerC36898a(C36895l lVar, AbstractC89171a aVar) {
            this.f86897a = lVar;
            this.f86898b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86897a.setCloseType("delete");
            this.f86898b.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.m$b */
    public static final class View$OnClickListenerC36899b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36895l f86899a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f86900b;

        static {
            Covode.recordClassIndex(44237);
        }

        public View$OnClickListenerC36899b(C36895l lVar, AbstractC89171a aVar) {
            this.f86899a = lVar;
            this.f86900b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86899a.setCloseType("confirm");
            this.f86900b.invoke();
        }
    }
}
