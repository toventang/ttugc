package com.p2082ss.android.ugc.aweme.account.agegate.p2237b;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.account.agegate.api.Api;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31555c;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.regex.Pattern;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.b.f */
public final class C31470f extends AbstractC34586a {

    /* renamed from: a */
    private HashMap f75320a;

    static {
        Covode.recordClassIndex(38187);
    }

    /* renamed from: a */
    public final View mo57475a(int i) {
        if (this.f75320a == null) {
            this.f75320a = new HashMap();
        }
        View view = (View) this.f75320a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75320a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f75320a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.f$b */
    static final class View$OnClickListenerC31474b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31470f f75325a;

        static {
            Covode.recordClassIndex(38191);
        }

        View$OnClickListenerC31474b(C31470f fVar) {
            this.f75325a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.m70897c(this.f75325a.mo57475a(R.id.atf));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.f$c */
    static final class View$OnClickListenerC31475c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31470f f75326a;

        static {
            Covode.recordClassIndex(38192);
        }

        View$OnClickListenerC31475c(C31470f fVar) {
            this.f75326a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f75326a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.f$a */
    static final class View$OnClickListenerC31471a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31470f f75321a;

        /* renamed from: b */
        final /* synthetic */ AgeGateResponse f75322b;

        static {
            Covode.recordClassIndex(38188);
        }

        View$OnClickListenerC31471a(C31470f fVar, AgeGateResponse ageGateResponse) {
            this.f75321a = fVar;
            this.f75322b = ageGateResponse;
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            AgeGateResponse ageGateResponse = this.f75322b;
            if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 2) {
                C31376a a = new C31376a().mo57399a("enter_method", "pop_up");
                AgeGateResponse ageGateResponse2 = this.f75322b;
                if (ageGateResponse2 == null || ageGateResponse2.getAgeGatePostAction() != 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                C39162r.m79460a("export_video_finish_input", a.mo57397a("pass_gate", i).f75156a);
            } else {
                C31555c.m65837b("submit_email");
            }
            C17197a.C17200a a2 = new C17197a.C17200a(this.f75321a.getActivity()).mo27189a(R.string.a44);
            C31470f fVar = this.f75321a;
            DmtEditText dmtEditText = (DmtEditText) fVar.mo57475a(R.id.atf);
            C89219l.m154716b(dmtEditText, "");
            a2.f41071b = fVar.getString(R.string.a43, String.valueOf(dmtEditText.getText()));
            a2.mo27195b(R.string.a7d, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31470f.View$OnClickListenerC31471a.DialogInterface$OnClickListenerC314721 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31471a f75323a;

                static {
                    Covode.recordClassIndex(38189);
                }

                {
                    this.f75323a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    DmtEditText dmtEditText = (DmtEditText) this.f75323a.f75321a.mo57475a(R.id.atf);
                    C89219l.m154716b(dmtEditText, "");
                    String valueOf = String.valueOf(dmtEditText.getText());
                    int i2 = 0;
                    if (!TextUtils.isEmpty(valueOf) && Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(valueOf).matches()) {
                        AgeGateResponse ageGateResponse = this.f75323a.f75322b;
                        if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 2) {
                            C31376a a = new C31376a().mo57399a("enter_method", "pop_up");
                            AgeGateResponse ageGateResponse2 = this.f75323a.f75322b;
                            if (ageGateResponse2 != null && ageGateResponse2.getAgeGatePostAction() == 0) {
                                i2 = 1;
                            }
                            C39162r.m79460a("export_video_address_confirm", a.mo57397a("pass_gate", i2).f75156a);
                        }
                        ((DmtStatusView) this.f75323a.f75321a.mo57475a(R.id.e77)).mo27384f();
                        DmtEditText dmtEditText2 = (DmtEditText) this.f75323a.f75321a.mo57475a(R.id.atf);
                        C89219l.m154716b(dmtEditText2, "");
                        Api.emailForExportVideo(String.valueOf(dmtEditText2.getText())).mo5534a(new AbstractC1729g(this) {
                            /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31470f.View$OnClickListenerC31471a.DialogInterface$OnClickListenerC314721.C314731 */

                            /* renamed from: a */
                            final /* synthetic */ DialogInterface$OnClickListenerC314721 f75324a;

                            static {
                                Covode.recordClassIndex(38190);
                            }

                            {
                                this.f75324a = r1;
                            }

                            @Override // p077b.AbstractC1729g
                            public final /* synthetic */ Object then(C1731i iVar) {
                                AbstractC0976n nVar;
                                AbstractC0952i supportFragmentManager;
                                Serializable serializable;
                                Intent intent;
                                if (this.f75324a.f75323a.f75321a.af_() && this.f75324a.f75323a.f75321a.getActivity() != null) {
                                    ((DmtStatusView) this.f75324a.f75323a.f75321a.mo57475a(R.id.e77)).setStatus(-1);
                                    DmtStatusView dmtStatusView = (DmtStatusView) this.f75324a.f75323a.f75321a.mo57475a(R.id.e77);
                                    C89219l.m154716b(dmtStatusView, "");
                                    dmtStatusView.setVisibility(8);
                                    C89219l.m154716b(iVar, "");
                                    if (!iVar.mo5539b() && !iVar.mo5544c()) {
                                        KeyboardUtils.m70897c(this.f75324a.f75323a.f75321a.mo57475a(R.id.atf));
                                        AgeGateResponse ageGateResponse = this.f75324a.f75323a.f75322b;
                                        if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 2) {
                                            ActivityC0945e activity = this.f75324a.f75323a.f75321a.getActivity();
                                            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                                                nVar = null;
                                            } else {
                                                nVar = supportFragmentManager.mo3552a();
                                            }
                                            C31476g gVar = new C31476g();
                                            gVar.setArguments(this.f75324a.f75323a.f75321a.getArguments());
                                            if (nVar != null) {
                                                nVar.mo3469b(R.id.b82, gVar);
                                                nVar.mo3467b();
                                            }
                                            C33048q.m67688a(false);
                                        } else {
                                            SmartRoute buildRoute = SmartRouter.buildRoute(this.f75324a.f75323a.f75321a.getActivity(), "//account/deleted");
                                            ActivityC0945e activity2 = this.f75324a.f75323a.f75321a.getActivity();
                                            if (activity2 == null || (intent = activity2.getIntent()) == null) {
                                                serializable = null;
                                            } else {
                                                serializable = intent.getSerializableExtra("age_gate_response");
                                            }
                                            buildRoute.withParam("age_gate_response", serializable).open();
                                            ActivityC0945e activity3 = this.f75324a.f75323a.f75321a.getActivity();
                                            if (activity3 != null) {
                                                activity3.finish();
                                            }
                                        }
                                    }
                                }
                                return null;
                            }
                        }, C1731i.f5564c, null);
                        return;
                    }
                    new C79459a(this.f75323a.f75321a.getActivity()).mo123050a(R.string.c27).mo123053a();
                }
            }, false).mo27193a().mo27184b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31470f.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.g7, viewGroup, false);
    }
}
