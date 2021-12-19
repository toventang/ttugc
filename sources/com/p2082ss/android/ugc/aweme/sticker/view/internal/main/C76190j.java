package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76149e;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.j */
public final class C76190j implements AbstractC76149e {

    /* renamed from: a */
    private final View f171159a;

    static {
        Covode.recordClassIndex(89140);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.j$a */
    static final class View$OnClickListenerC76191a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f171160a;

        static {
            Covode.recordClassIndex(89141);
        }

        View$OnClickListenerC76191a(AbstractC89171a aVar) {
            this.f171160a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f171160a.invoke();
        }
    }

    public C76190j(View view) {
        C89219l.m154721d(view, "");
        this.f171159a = view;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76149e
    /* renamed from: a */
    public final void mo119905a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f171159a.setOnClickListener(new View$OnClickListenerC76191a(aVar));
    }
}
