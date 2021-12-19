package com.p2082ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.p */
public final class C57984p {

    /* renamed from: a */
    public static final C57984p f132162a = new C57984p();

    private C57984p() {
    }

    static {
        Covode.recordClassIndex(68010);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.p$a */
    static final class View$OnClickListenerC57985a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC57982o f132163a;

        static {
            Covode.recordClassIndex(68011);
        }

        View$OnClickListenerC57985a(AbstractC57982o oVar) {
            this.f132163a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                AbstractC57982o oVar = this.f132163a;
                Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
                oVar.mo95128a((CommonItemView) view);
                String a = this.f132163a.mo95127a();
                if (a != null) {
                    C57354e.m103958a("click_setting_item", new C33743c().mo59976a("item_name", a).mo59977a());
                }
            }
        }
    }

    /* renamed from: a */
    public static List<AbstractC57982o> m104793a(Activity activity) {
        C89219l.m154721d(activity, "");
        List<AbstractC57982o> c = C89070n.m154524c(new C57801a(activity), new C57814g(activity), new C57813f(activity), new C57808c(activity), new C57815h(activity), new C57817i(activity), new C57986q(activity), new C57978l(activity), new C57811e(activity), new C57803b(activity), new C57977k(activity), new C57968j(activity), new C57809d(activity), new C57981n(activity), new C57980m(activity));
        for (T t : c) {
            LinearLayout linearLayout = (LinearLayout) activity.findViewById(R.id.cei);
            C89219l.m154716b(linearLayout, "");
            t.mo95126a(linearLayout).setOnClickListener(new View$OnClickListenerC57985a(t));
        }
        return c;
    }
}
