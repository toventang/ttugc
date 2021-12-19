package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34598e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a */
public final class C39343a {

    /* renamed from: a */
    static Dialog f92872a;

    /* renamed from: b */
    public static final C34598e f92873b = new C34598e(C17867d.m33078a(), "gradient_punish_warning");

    /* renamed from: c */
    public static final C39343a f92874c = new C39343a();

    private C39343a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a$a */
    public static final class CallableC39344a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f92875a;

        /* renamed from: b */
        final /* synthetic */ String f92876b;

        static {
            Covode.recordClassIndex(47025);
        }

        public CallableC39344a(ActivityC0945e eVar, String str) {
            this.f92875a = eVar;
            this.f92876b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f92875a);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.GRADIENT_PUNISH_WARNING;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.C39343a.CallableC39344a.C393451 */

                /* renamed from: a */
                final /* synthetic */ CallableC39344a f92877a;

                static {
                    Covode.recordClassIndex(47026);
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27202a(List<Integer> list) {
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27203a(List<Integer> list, int i) {
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27201a() {
                    Dialog dialog;
                    MethodCollector.m26663i(9187);
                    ActivityC0945e eVar = this.f92877a.f92875a;
                    String str = this.f92877a.f92876b;
                    C89219l.m154716b(str, "");
                    C89219l.m154721d(eVar, "");
                    C89219l.m154721d(str, "");
                    if (C39343a.f92872a == null || (dialog = C39343a.f92872a) == null || !dialog.isShowing()) {
                        GradientPunishWarning a = C39343a.m79987a();
                        if (a == null) {
                            MethodCollector.m26664o(9187);
                            return;
                        }
                        String component1 = a.component1();
                        String component2 = a.component2();
                        View inflate = LayoutInflater.from(eVar).inflate(R.layout.uj, (ViewGroup) null);
                        TextView textView = (TextView) inflate.findViewById(R.id.ewq);
                        C89219l.m154716b(textView, "");
                        textView.setText(component1);
                        TextView textView2 = (TextView) inflate.findViewById(R.id.ewp);
                        C89219l.m154716b(textView2, "");
                        textView2.setText(component2);
                        textView2.setOnClickListener(new View$OnClickListenerC39346b(eVar, str));
                        Dialog b = new C17197a.C17200a(eVar).mo27193a().mo27184b();
                        b.setContentView(inflate);
                        b.setCancelable(false);
                        b.show();
                        C39343a.f92872a = b;
                        C39162r.m79460a("violation_dialog_show", new C33744d().mo59983a("enter_from", str).f79943a);
                        MethodCollector.m26664o(9187);
                        return;
                    }
                    MethodCollector.m26664o(9187);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f92877a = r1;
                }
            }));
            return null;
        }
    }

    static {
        Covode.recordClassIndex(47024);
    }

    /* renamed from: a */
    public static final GradientPunishWarning m79987a() {
        try {
            return (GradientPunishWarning) SettingsManager.m29616a().mo25396a("gradient_punish_warning", GradientPunishWarning.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a$b */
    static final class View$OnClickListenerC39346b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f92878a;

        /* renamed from: b */
        final /* synthetic */ String f92879b;

        static {
            Covode.recordClassIndex(47027);
        }

        View$OnClickListenerC39346b(Activity activity, String str) {
            this.f92878a = activity;
            this.f92879b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39343a.m79988a(this.f92878a, "popup_warning");
            C39162r.m79460a("enter_violation_record", new C33744d().mo59983a("enter_method", "dialog").mo59983a("enter_from", this.f92879b).f79943a);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            C89219l.m154716b(curUserId, "");
            C39343a.m79989a(curUserId, true);
            Dialog dialog = C39343a.f92872a;
            if (dialog != null) {
                dialog.dismiss();
            }
            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.GRADIENT_PUNISH_WARNING);
        }
    }

    /* renamed from: b */
    public static final void m79990b(String str, boolean z) {
        C89219l.m154721d(str, "");
        f92873b.mo61058b("has_click_warning_bubble_".concat(String.valueOf(str)), z);
    }

    /* renamed from: a */
    public static final void m79989a(String str, boolean z) {
        C89219l.m154721d(str, "");
        f92873b.mo61058b("has_click_warning_dialog_".concat(String.valueOf(str)), z);
    }

    /* renamed from: a */
    public static final void m79988a(Context context, String str) {
        String str2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview");
        StringBuilder sb = new StringBuilder();
        GradientPunishWarning a = m79987a();
        if (a != null) {
            str2 = a.getDetailUrl();
        } else {
            str2 = null;
        }
        buildRoute.withParam("url", sb.append(str2).append("&enter_from=").append(str).toString()).withParam("hide_nav_bar", true).open();
    }
}
