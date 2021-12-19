package com.p2082ss.android.ugc.aweme.account.agegate.p2237b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23029d;
import com.bytedance.tux.dialog.p1713b.C23032e;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31558e;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateResultViewModel;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.experiment.C31637a;
import com.p2082ss.android.ugc.aweme.account.login.p2262g.C31937c;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.SignUpOrLoginActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.account.util.C33047p;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.b.c */
public final class C31455c extends AbstractC32572b {

    /* renamed from: a */
    public static final C31456a f75298a = new C31456a((byte) 0);

    /* renamed from: b */
    private AbstractC32613a f75299b;

    /* renamed from: c */
    private final AbstractC89244h f75300c = C89250i.m154773a((AbstractC89171a) new C31457b(this));

    /* renamed from: d */
    private HashMap f75301d;

    static {
        Covode.recordClassIndex(38172);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: b_ */
    public final void mo57470b_(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f75301d == null) {
            this.f75301d = new HashMap();
        }
        View view = (View) this.f75301d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75301d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f75301d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.c$a */
    public static final class C31456a {
        static {
            Covode.recordClassIndex(38173);
        }

        private C31456a() {
        }

        public /* synthetic */ C31456a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onDestroyView() {
        super.onDestroyView();
        getViewModelStore().mo3997a();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.c$b */
    static final class C31457b extends AbstractC89220m implements AbstractC89171a<C31558e> {

        /* renamed from: a */
        final /* synthetic */ C31455c f75302a;

        static {
            Covode.recordClassIndex(38174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31457b(C31455c cVar) {
            super(0);
            this.f75302a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31558e invoke() {
            Context context = this.f75302a.getContext();
            if (context == null) {
                return null;
            }
            EnumC32594j Z_ = this.f75302a.mo58460Z_();
            C89219l.m154716b(context, "");
            return new C31558e(Z_, context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57468a() {
        Context context = getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            C23023b a = C23013a.C23015a.m43405a(context);
            String a2 = C1764a.m5928a("%s\n%s", Arrays.copyOf(new Object[]{getString(R.string.a5v), getString(R.string.a5w)}, 2));
            C89219l.m154716b(a2, "");
            ((C23023b) C23032e.m43444a(a.mo37413d(a2), new C31460e(this)).mo37482a(false)).mo37405a().mo37396b().show();
            C39162r.onEventV3("confirm_f_special_age_popup");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: q */
    public final boolean mo57458q() {
        AbstractC32613a aVar = this.f75299b;
        if (aVar != null && aVar.mo57458q()) {
            return true;
        }
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        if (childFragmentManager.mo3564e() > 1) {
            getChildFragmentManager().mo3562c();
        } else {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C89219l.m154716b(arguments, "");
            arguments.putInt("next_page", EnumC32594j.FINISH.getValue());
            arguments.putInt("result_code", -1);
            mo58461a(arguments);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.c$e */
    public static final class C31460e extends AbstractC89220m implements AbstractC89172b<C23029d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31455c f75305a;

        static {
            Covode.recordClassIndex(38177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31460e(C31455c cVar) {
            super(1);
            this.f75305a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23029d dVar) {
            C23029d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo37423a(R.string.a5u, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.C31455c.C31460e.C314611 */

                /* renamed from: a */
                final /* synthetic */ C31460e f75306a;

                static {
                    Covode.recordClassIndex(38178);
                }

                {
                    this.f75306a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    Bundle arguments = this.f75306a.f75305a.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    C89219l.m154716b(arguments, "");
                    C31455c cVar = this.f75306a.f75305a;
                    arguments.putInt("next_page", EnumC32594j.FTC_CREATE_ACCOUNT.getValue());
                    int i = C31463d.f75309b[this.f75306a.f75305a.mo58460Z_().ordinal()];
                    if (i == 1) {
                        arguments.putString("enter_method", "age_gate");
                    } else if (i == 2) {
                        arguments.putString("enter_method", "sign_in");
                    } else if (i == 3) {
                        arguments.putString("enter_method", "sign_up");
                    } else if (i == 4) {
                        arguments.putString("enter_method", "edit_dob");
                    }
                    cVar.mo58461a(arguments);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.c$c */
    static final class C31458c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C31455c f75303a;

        static {
            Covode.recordClassIndex(38175);
        }

        C31458c(C31455c cVar) {
            this.f75303a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            C31455c cVar = this.f75303a;
            C89219l.m154716b(str, "");
            if (C31637a.C31638a.m65948a()) {
                Fragment a = cVar.getChildFragmentManager().mo3551a("age_gate_dob_fragment");
                if (!(a instanceof C31414a)) {
                    a = null;
                }
                C31414a aVar = (C31414a) a;
                if (aVar == null) {
                    aVar = new C31414a();
                    aVar.setArguments(cVar.getArguments());
                }
                cVar.mo57469a(aVar, "age_gate_dob_fragment");
            }
            C31566h.f75503b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.c$d */
    static final class C31459d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C31455c f75304a;

        static {
            Covode.recordClassIndex(38176);
        }

        C31459d(C31455c cVar) {
            this.f75304a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            AgeGateResponse ageGateResponse = (AgeGateResponse) obj;
            if (ageGateResponse.getStatus_code() == 0 && ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.getRegisterAgeGatePostAction() == 0) {
                C31455c cVar = this.f75304a;
                C89219l.m154716b(ageGateResponse, "");
                if (cVar.mo58460Z_() != EnumC32594j.AGE_GATE) {
                    if (cVar.getActivity() instanceof SignUpOrLoginActivity) {
                        ActivityC0945e activity = cVar.getActivity();
                        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                        ((SignUpOrLoginActivity) activity).f77784a = ageGateResponse;
                    } else {
                        Bundle arguments = cVar.getArguments();
                        if (arguments != null) {
                            arguments.putSerializable("age_gate_response", ageGateResponse);
                        }
                    }
                }
                Bundle arguments2 = cVar.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                C89219l.m154716b(arguments2, "");
                switch (C31463d.f75308a[cVar.mo58460Z_().ordinal()]) {
                    case 1:
                        if (cVar.mo58458A() == EnumC32592i.GUEST_MODE) {
                            C31667a.m65983a(14);
                            arguments2.putInt("next_page", EnumC32594j.FINISH.getValue());
                            cVar.mo58461a(arguments2);
                            return;
                        } else if (C31937c.m66302a()) {
                            arguments2.putInt("next_page", EnumC32594j.TERMS_CONSENT_SIGN_UP.getValue());
                            cVar.mo58461a(arguments2);
                            return;
                        } else {
                            arguments2.putInt("next_page", EnumC32594j.PHONE_EMAIL_SIGN_UP.getValue());
                            cVar.mo58461a(arguments2);
                            return;
                        }
                    case 2:
                        if (ageGateResponse.is_prompt()) {
                            SmartRouter.buildRoute(cVar.getActivity(), "//account/video/deleted/alert").withParam("age_gate_response", ageGateResponse).open();
                            ActivityC0945e activity2 = cVar.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                                return;
                            }
                            return;
                        }
                        C17197a.C17200a aVar = new C17197a.C17200a(cVar.getActivity());
                        aVar.mo27189a(R.string.a5m);
                        aVar.mo27194b(R.string.a5l);
                        aVar.mo27190a(R.string.as_, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC31462f(cVar), false);
                        aVar.mo27193a().mo27184b().setCancelable(false);
                        return;
                    case 3:
                        Intent intent = new Intent();
                        intent.putExtra("age_gate_response", ageGateResponse);
                        ActivityC0945e activity3 = cVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(-1, intent);
                        }
                        ActivityC0945e activity4 = cVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                            return;
                        }
                        return;
                    case 4:
                        Bundle arguments3 = cVar.getArguments();
                        if (arguments3 == null) {
                            arguments3 = new Bundle();
                        }
                        C89219l.m154716b(arguments3, "");
                        Bundle arguments4 = cVar.getArguments();
                        if (arguments4 == null || (str = arguments4.getString("sms_code_key")) == null) {
                            str = "";
                        }
                        C89219l.m154716b(str, "");
                        if (C31937c.m66302a()) {
                            arguments3.putInt("next_page", EnumC32594j.TERMS_CONSENT_NEW_PHONE_USER.getValue());
                            arguments3.putString("phone_number_format", C31940a.m66306a(C32582d.m67066b(cVar)));
                            arguments3.putString("sms_code_key", str);
                            cVar.mo58461a(arguments3);
                            return;
                        }
                        String a = C31940a.m66306a(C32582d.m67066b(cVar));
                        C89219l.m154716b(a, "");
                        C32407x.m66800a(cVar, a, str, EnumC32592i.SIGN_UP, cVar.mo58460Z_()).mo143246c();
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        Bundle arguments5 = cVar.getArguments();
                        if (arguments5 == null) {
                            arguments5 = new Bundle();
                        }
                        C89219l.m154716b(arguments5, "");
                        if (C31937c.m66302a()) {
                            arguments5.putInt("next_page", EnumC32594j.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
                            cVar.mo58461a(arguments5);
                            return;
                        }
                        arguments5.putInt("next_page", EnumC32594j.FINISH.getValue());
                        arguments5.putInt("result_code", -1);
                        cVar.mo58461a(arguments5);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        if (ageGateResponse.is_prompt()) {
                            SmartRouter.buildRoute(cVar.getActivity(), "//account/video/deleted/alert").withParam("age_gate_response", ageGateResponse).open();
                            ActivityC0945e activity5 = cVar.getActivity();
                            if (activity5 != null) {
                                activity5.finish();
                                return;
                            }
                            return;
                        }
                        C36085cj.m73549c().mo57395a(C31566h.f75502a, true);
                        C31566h.m65848a();
                        ActivityC0945e activity6 = cVar.getActivity();
                        if (activity6 != null) {
                            activity6.finish();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                C31455c cVar2 = this.f75304a;
                C89219l.m154716b(ageGateResponse, "");
                if ((cVar2.getActivity() instanceof SignUpOrLoginActivity) && cVar2.mo58460Z_() != EnumC32594j.AGE_GATE) {
                    ActivityC0945e activity7 = cVar2.getActivity();
                    Objects.requireNonNull(activity7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                    ((SignUpOrLoginActivity) activity7).f77784a = ageGateResponse;
                }
                if (cVar2.mo58460Z_() == EnumC32594j.EDIT_DOB_AGE_GATE || cVar2.mo58460Z_() == EnumC32594j.AGE_GATE) {
                    if (ageGateResponse.getAgeGatePostAction() != 1) {
                        SmartRouter.buildRoute(cVar2.getActivity(), "//account/deleted/alert").withParam("age_gate_response", ageGateResponse).open();
                        ActivityC0945e activity8 = cVar2.getActivity();
                        if (activity8 != null) {
                            activity8.finish();
                            return;
                        }
                        return;
                    }
                    cVar2.mo57468a();
                } else if (ageGateResponse.getRegisterAgeGatePostAction() == 1) {
                    cVar2.mo57468a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.c$f */
    static final class DialogInterface$OnClickListenerC31462f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31455c f75307a;

        static {
            Covode.recordClassIndex(38179);
        }

        DialogInterface$OnClickListenerC31462f(C31455c cVar) {
            this.f75307a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C36085cj.m73549c().mo57395a("", true);
            ActivityC0945e activity = this.f75307a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57469a(AbstractC32613a aVar, String str) {
        this.f75299b = aVar;
        getChildFragmentManager().mo3552a().mo3470b(R.id.hn, aVar, str).mo3457a(str).mo3473c();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        int i;
        int i2;
        int i3 = 10802;
        MethodCollector.m26663i(10802);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if ((mo58460Z_() == EnumC32594j.AGE_GATE_SIGN_UP || mo58460Z_() == EnumC32594j.AGE_GATE_LOGIN) && !C31637a.C31639b.m65949a() && C31637a.C31638a.m65948a()) {
            Fragment a = getChildFragmentManager().mo3551a("age_gate_nickname_fragment");
            if (!(a instanceof C31464e) || a == null) {
                C31464e eVar = new C31464e();
                eVar.setArguments(getArguments());
                mo57469a(eVar, "age_gate_nickname_fragment");
            }
        } else {
            Fragment a2 = getChildFragmentManager().mo3551a("age_gate_dob_fragment");
            if (!(a2 instanceof C31414a) || a2 == null) {
                C31414a aVar = new C31414a();
                aVar.setArguments(getArguments());
                mo57469a(aVar, "age_gate_dob_fragment");
            }
        }
        AbstractC1174ac a3 = C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(AgeGateResultViewModel.class);
        C89219l.m154716b(a3, "");
        AgeGateResultViewModel ageGateResultViewModel = (AgeGateResultViewModel) a3;
        ageGateResultViewModel.f75514a.observe(this, new C31458c(this));
        ageGateResultViewModel.f75515b.observe(this, new C31459d(this));
        AbstractC0952i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            C31558e eVar2 = (C31558e) this.f75300c.getValue();
            if (eVar2 != null) {
                C89219l.m154716b(fragmentManager, "");
                C89219l.m154721d(fragmentManager, "");
                if (eVar2.f75494e != EnumC32594j.EDIT_DOB_AGE_GATE && C33047p.m67683a() && !eVar2.f75490a) {
                    if (C33047p.f78597a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    eVar2.f75490a = z;
                    TuxTextView tuxTextView = new TuxTextView(eVar2.f75495f, null, 0, 6);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    int a4 = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    int a5 = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
                    Resources system3 = Resources.getSystem();
                    C89219l.m154709a((Object) system3, "");
                    int a6 = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system3.getDisplayMetrics()));
                    Resources system4 = Resources.getSystem();
                    C89219l.m154709a((Object) system4, "");
                    layoutParams.setMargins(a4, a5, a6, C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system4.getDisplayMetrics())));
                    tuxTextView.setLayoutParams(layoutParams);
                    if (!eVar2.f75490a) {
                        str = "Select country or region";
                    } else {
                        str = "Your account will be registered in " + C33047p.f78597a;
                    }
                    tuxTextView.setText(str);
                    tuxTextView.setTuxFont(52);
                    Resources system5 = Resources.getSystem();
                    C89219l.m154709a((Object) system5, "");
                    int a7 = C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system5.getDisplayMetrics()));
                    Resources system6 = Resources.getSystem();
                    C89219l.m154709a((Object) system6, "");
                    int a8 = C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system6.getDisplayMetrics()));
                    Resources system7 = Resources.getSystem();
                    C89219l.m154709a((Object) system7, "");
                    int a9 = C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system7.getDisplayMetrics()));
                    Resources system8 = Resources.getSystem();
                    C89219l.m154709a((Object) system8, "");
                    tuxTextView.setPaddingRelative(a7, a8, a9, C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system8.getDisplayMetrics())));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    Context context = tuxTextView.getContext();
                    C89219l.m154716b(context, "");
                    Integer a10 = C23155d.m43641a(context, R.attr.h);
                    if (a10 != null) {
                        i = a10.intValue();
                    } else {
                        i = -3355444;
                    }
                    gradientDrawable.setColor(i);
                    Resources system9 = Resources.getSystem();
                    C89219l.m154709a((Object) system9, "");
                    gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 2.0f, system9.getDisplayMetrics()));
                    tuxTextView.setBackground(gradientDrawable);
                    eVar2.f75493d = tuxTextView;
                    LinearLayout linearLayout = new LinearLayout(eVar2.f75495f);
                    linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    linearLayout.setOrientation(1);
                    View view2 = eVar2.f75493d;
                    if (view2 == null) {
                        C89219l.m154710a("regionSelect");
                    }
                    linearLayout.addView(view2);
                    View view3 = new View(linearLayout.getContext());
                    Resources system10 = Resources.getSystem();
                    C89219l.m154709a((Object) system10, "");
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C89241a.m154730a(TypedValue.applyDimension(1, 0.5f, system10.getDisplayMetrics())));
                    Resources system11 = Resources.getSystem();
                    C89219l.m154709a((Object) system11, "");
                    layoutParams2.setMarginStart(C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system11.getDisplayMetrics())));
                    Resources system12 = Resources.getSystem();
                    C89219l.m154709a((Object) system12, "");
                    layoutParams2.setMarginEnd(C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system12.getDisplayMetrics())));
                    view3.setLayoutParams(layoutParams2);
                    Context context2 = view3.getContext();
                    C89219l.m154716b(context2, "");
                    Integer a11 = C23155d.m43641a(context2, R.attr.ah);
                    if (a11 != null) {
                        i2 = a11.intValue();
                    } else {
                        i2 = -12303292;
                    }
                    view3.setBackground(new ColorDrawable(i2));
                    linearLayout.addView(view3);
                    Context context3 = linearLayout.getContext();
                    C89219l.m154716b(context3, "");
                    TuxTextView tuxTextView2 = new TuxTextView(context3, null, 0, 6);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    Resources system13 = Resources.getSystem();
                    C89219l.m154709a((Object) system13, "");
                    int a12 = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system13.getDisplayMetrics()));
                    Resources system14 = Resources.getSystem();
                    C89219l.m154709a((Object) system14, "");
                    int a13 = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system14.getDisplayMetrics()));
                    Resources system15 = Resources.getSystem();
                    C89219l.m154709a((Object) system15, "");
                    int a14 = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system15.getDisplayMetrics()));
                    Resources system16 = Resources.getSystem();
                    C89219l.m154709a((Object) system16, "");
                    layoutParams3.setMargins(a12, a13, a14, C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system16.getDisplayMetrics())));
                    tuxTextView2.setLayoutParams(layoutParams3);
                    tuxTextView2.setTuxFont(71);
                    tuxTextView2.setTextColorRes(R.attr.a4);
                    tuxTextView2.setText("This is a local_test only feature. You may need to specify registration region first when signing up in beta app.");
                    linearLayout.addView(tuxTextView2);
                    eVar2.f75492c = linearLayout;
                    TextView textView = eVar2.f75493d;
                    if (textView == null) {
                        C89219l.m154710a("regionSelect");
                    } else {
                        textView.setOnClickListener(new C31558e.View$OnClickListenerC31560b(eVar2));
                    }
                    C23226a.C23227a aVar2 = new C23226a.C23227a();
                    LinearLayout linearLayout2 = eVar2.f75492c;
                    if (linearLayout2 == null) {
                        C89219l.m154710a("regionSelectViews");
                    }
                    C23226a.C23227a b = aVar2.mo37816a(linearLayout2).mo37822b(false).mo37824c(false).mo37811a().mo37820b();
                    LinearLayout linearLayout3 = eVar2.f75492c;
                    if (linearLayout3 == null) {
                        C89219l.m154710a("regionSelectViews");
                    }
                    C23226a.C23227a b2 = b.mo37821b(linearLayout3.getHeight());
                    TuxNavBar.C23179a aVar3 = new TuxNavBar.C23179a();
                    C23187b a15 = new C23187b().mo37738a(R.raw.icon_x_mark);
                    a15.f54930b = true;
                    TuxNavBar.C23179a a16 = aVar3.mo37732a(a15.mo37741a((AbstractC89171a<C89391z>) new C31558e.C31562c(eVar2))).mo37731a(new C23194g().mo37753a("Choose your registration region"));
                    a16.f54919d = true;
                    eVar2.f75491b = b2.mo37818a(a16).f55057a;
                    C23226a aVar4 = eVar2.f75491b;
                    if (aVar4 == null) {
                        C89219l.m154710a("regionSelectSheet");
                    }
                    aVar4.show(fragmentManager, (String) null);
                    i3 = 10802;
                }
                MethodCollector.m26664o(i3);
                return;
            }
            MethodCollector.m26664o(10802);
            return;
        }
        MethodCollector.m26664o(10802);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.g2, viewGroup, false);
    }
}
