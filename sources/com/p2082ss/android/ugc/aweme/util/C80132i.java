package com.p2082ss.android.ugc.aweme.util;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.settings.C68740f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.i */
public final class C80132i {

    /* renamed from: a */
    public static final C80132i f179549a = new C80132i();

    private C80132i() {
    }

    static {
        Covode.recordClassIndex(93376);
    }

    /* renamed from: com.ss.android.ugc.aweme.util.i$a */
    public static final class View$OnClickListenerC80133a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f179550a;

        static {
            Covode.recordClassIndex(93377);
        }

        public View$OnClickListenerC80133a(boolean z) {
            this.f179550a = z;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            if (this.f179550a) {
                str = "personal_detail";
            } else {
                str = "others_homepage";
            }
            SmartRouter.buildRoute(context, C68740f.m121173a(str, "click_avatar")).open();
        }
    }
}
