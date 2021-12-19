package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49671af;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bo */
public final class C50135bo extends AbstractC50304g implements AbstractC1214u<C33942b> {

    /* renamed from: l */
    private View f115726l;

    static {
        Covode.recordClassIndex(59261);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85143a() {
    }

    /* renamed from: c */
    private final void m94083c() {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        if (C50539g.m94744a(this.f116150a)) {
            View view = this.f115726l;
            if (view != null) {
                view.setVisibility(0);
            }
            C33744d a = new C33744d().mo59983a("enter_from", this.f116151b);
            Aweme aweme = this.f116150a;
            C89219l.m154716b(aweme, "");
            C33744d a2 = a.mo59983a("group_id", aweme.getAid());
            Aweme aweme2 = this.f116150a;
            C89219l.m154716b(aweme2, "");
            C39162r.m79460a("vpa_notify_show", a2.mo59983a("author_id", aweme2.getAuthorUid()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108759a(this.f116150a, this.f116154e))).f79943a);
            if (C39223a.m79591e().mo68728c() == 2 || !C89219l.m154714a((Object) "homepage_hot", (Object) this.f116151b) || this.f116154e != 0 || this.f116160k != 1) {
                View view2 = this.f115726l;
                if (view2 != null && (tuxTextView = (TuxTextView) view2.findViewById(R.id.cx1)) != null) {
                    tuxTextView.setVisibility(8);
                    return;
                }
                return;
            }
            View view3 = this.f115726l;
            if (!(view3 == null || (tuxTextView2 = (TuxTextView) view3.findViewById(R.id.cx1)) == null)) {
                tuxTextView2.setVisibility(0);
            }
            C33744d a3 = new C33744d().mo59983a("enter_from", this.f116151b);
            Aweme aweme3 = this.f116150a;
            C89219l.m154716b(aweme3, "");
            C33744d a4 = a3.mo59983a("group_id", aweme3.getAid());
            Aweme aweme4 = this.f116150a;
            C89219l.m154716b(aweme4, "");
            C39162r.m79460a("opt_out_show", a4.mo59983a("author_id", aweme4.getAuthorUid()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108759a(this.f116150a, this.f116154e))).f79943a);
            return;
        }
        View view4 = this.f115726l;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }

    public C50135bo(View view) {
        super(view);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        m94083c();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85145a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60189a("on_page_selected", (AbstractC1214u<C33942b>) this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bo$b */
    static final class View$OnClickListenerC50140b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50135bo f115732a;

        static {
            Covode.recordClassIndex(59266);
        }

        View$OnClickListenerC50140b(C50135bo boVar) {
            this.f115732a = boVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f115732a.f116156g, C39223a.m79591e().mo68727b()).open();
            C33744d a = new C33744d().mo59983a("enter_from", this.f115732a.f116151b);
            Aweme aweme = this.f115732a.f116150a;
            C89219l.m154716b(aweme, "");
            C33744d a2 = a.mo59983a("group_id", aweme.getAid());
            Aweme aweme2 = this.f115732a.f116150a;
            C89219l.m154716b(aweme2, "");
            C39162r.m79460a("enter_vpa_notify", a2.mo59983a("author_id", aweme2.getAuthorUid()).f79943a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85144a(View view) {
        TuxTextView tuxTextView;
        MethodCollector.m26663i(4448);
        View a = C1870c.m6045a((Activity) this.f116156g, (int) R.layout.tq);
        C89219l.m154716b(a, "");
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a);
        }
        this.f115726l = a;
        if (a != null) {
            a.setVisibility(8);
        }
        View view2 = this.f115726l;
        if (view2 == null || (tuxTextView = (TuxTextView) view2.findViewById(R.id.cx1)) == null) {
            MethodCollector.m26664o(4448);
            return;
        }
        tuxTextView.setVisibility(8);
        MethodCollector.m26664o(4448);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bo$a */
    static final class View$OnClickListenerC50136a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TuxTextView f115727a;

        /* renamed from: b */
        final /* synthetic */ C50135bo f115728b;

        static {
            Covode.recordClassIndex(59262);
        }

        View$OnClickListenerC50136a(TuxTextView tuxTextView, C50135bo boVar) {
            this.f115727a = tuxTextView;
            this.f115728b = boVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C33744d a = new C33744d().mo59983a("enter_from", this.f115728b.f116151b);
            Aweme aweme = this.f115728b.f116150a;
            C89219l.m154716b(aweme, "");
            C33744d a2 = a.mo59983a("group_id", aweme.getAid());
            Aweme aweme2 = this.f115728b.f116150a;
            C89219l.m154716b(aweme2, "");
            C39162r.m79460a("opt_out_click", a2.mo59983a("author_id", aweme2.getAuthorUid()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108759a(this.f115728b.f116150a, this.f115728b.f116154e))).f79943a);
            C17197a.C17200a aVar = new C17197a.C17200a(this.f115728b.f116156g);
            aVar.f41059E = true;
            C17197a.C17200a a3 = aVar.mo27189a(R.string.bva);
            a3.f41071b = this.f115727a.getContext().getString(R.string.bv8) + "\n\n" + this.f115727a.getContext().getString(R.string.bv9);
            C17197a.C17200a b = a3.mo27190a(R.string.bv_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50135bo.View$OnClickListenerC50136a.DialogInterface$OnClickListenerC501371 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC50136a f115729a;

                static {
                    Covode.recordClassIndex(59263);
                }

                {
                    this.f115729a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C39223a.m79591e().mo68724a(new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50135bo.View$OnClickListenerC50136a.DialogInterface$OnClickListenerC501371.C501381 */

                        /* renamed from: a */
                        final /* synthetic */ DialogInterface$OnClickListenerC501371 f115730a;

                        static {
                            Covode.recordClassIndex(59264);
                        }

                        {
                            this.f115730a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            AbstractC81915c.m141874a(new C49671af());
                            C49301e.m92382m();
                            new C79459a(this.f115730a.f115729a.f115728b.f116156g).mo123050a(R.string.bvc).mo123053a();
                            return C89391z.f203057a;
                        }
                    }, new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50135bo.View$OnClickListenerC50136a.DialogInterface$OnClickListenerC501371.C501392 */

                        /* renamed from: a */
                        final /* synthetic */ DialogInterface$OnClickListenerC501371 f115731a;

                        static {
                            Covode.recordClassIndex(59265);
                        }

                        {
                            this.f115731a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            new C79459a(this.f115731a.f115729a.f115728b.f116156g).mo123050a(R.string.bvb).mo123053a();
                            return C89391z.f203057a;
                        }
                    });
                }
            }, false).mo27195b(R.string.a6m, (DialogInterface.OnClickListener) null, false);
            b.f41060F = true;
            b.mo27193a().mo27185c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85146a(VideoItemParams videoItemParams) {
        String string;
        View view;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        ConstraintLayout constraintLayout;
        super.mo85146a(videoItemParams);
        if (videoItemParams != null) {
            if (C50539g.m94744a(this.f116150a)) {
                if (!C39223a.m79591e().mo68725a()) {
                    C33830n.m69192a("vpa_show_in_error_region", "", (JSONObject) null);
                }
                View view2 = this.f115726l;
                if (!(view2 == null || (constraintLayout = (ConstraintLayout) view2.findViewById(R.id.fh8)) == null)) {
                    constraintLayout.setOnClickListener(new View$OnClickListenerC50140b(this));
                }
                StringBuilder sb = new StringBuilder();
                Aweme aweme = this.f116150a;
                C89219l.m154716b(aweme, "");
                if (aweme.getUploadMiscInfoStruct().vpaInfo.getInfoBarType() == 1) {
                    string = this.f116156g.getString(R.string.bv3);
                } else {
                    string = this.f116156g.getString(R.string.bv4);
                }
                SpannableString spannableString = new SpannableString(sb.append(string).append("  ").toString());
                Context context = this.f116156g;
                C89219l.m154716b(context, "");
                spannableString.setSpan(new C50088ax(context), spannableString.length() - 1, spannableString.length(), 18);
                View view3 = this.f115726l;
                if (!(view3 == null || (tuxTextView2 = (TuxTextView) view3.findViewById(R.id.bnq)) == null)) {
                    tuxTextView2.setText(spannableString);
                }
                if (C39223a.m79591e().mo68728c() != 2 && C89219l.m154714a((Object) "homepage_hot", (Object) this.f116151b) && this.f116154e == 0 && this.f116160k == 1 && (view = this.f115726l) != null && (tuxTextView = (TuxTextView) view.findViewById(R.id.cx1)) != null) {
                    tuxTextView.setOnClickListener(new View$OnClickListenerC50136a(tuxTextView, this));
                }
            }
            m94083c();
        }
    }
}
