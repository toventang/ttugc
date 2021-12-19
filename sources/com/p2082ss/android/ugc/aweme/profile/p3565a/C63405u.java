package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.story.model.C77380c;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.a.u */
public final class C63405u extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public C77380c f143949a;

    /* renamed from: b */
    final View f143950b;

    /* renamed from: c */
    final ActivityC0945e f143951c;

    static {
        Covode.recordClassIndex(74696);
    }

    /* renamed from: a */
    public static void m114971a(String str) {
        C39162r.m79462a("story_archive", C89387v.m154943a("personal_homepage", "enter_from"), C89387v.m154943a(str, "action_type"));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63405u(View view, ActivityC0945e eVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(eVar, "");
        this.f143950b = view;
        this.f143951c = eVar;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63405u.View$OnClickListenerC634061 */

            /* renamed from: a */
            final /* synthetic */ C63405u f143952a;

            static {
                Covode.recordClassIndex(74697);
            }

            {
                this.f143952a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                SmartRouter.buildRoute(this.f143952a.f143951c, "//story/archive").withParam("enter_from", "profile").open();
                C63405u.m114971a("click");
            }
        });
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63405u.View$OnAttachStateChangeListenerC634072 */

            /* renamed from: a */
            final /* synthetic */ C63405u f143953a;

            static {
                Covode.recordClassIndex(74698);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f143953a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                if (this.f143953a.f143949a != null) {
                    C63405u.m114971a("show");
                }
            }
        });
    }
}
