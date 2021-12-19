package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32807q;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2242b.C31588c;
import com.p2082ss.android.ugc.aweme.account.p2280ui.BindOrModifyPhoneActivity;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.p2280ui.PhoneInputView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.BaseBindService;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p */
public final class C32700p extends AbstractC32613a {

    /* renamed from: d */
    public static final C32701a f77960d = new C32701a((byte) 0);

    /* renamed from: a */
    String f77961a = "";

    /* renamed from: b */
    String f77962b = "";

    /* renamed from: c */
    public long f77963c = System.currentTimeMillis();

    /* renamed from: e */
    private final AbstractC89244h f77964e = C89250i.m154773a((AbstractC89171a) new C32702b(this));

    /* renamed from: j */
    private HashMap f77965j;

    static {
        Covode.recordClassIndex(39479);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77965j == null) {
            this.f77965j = new HashMap();
        }
        View view = (View) this.f77965j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77965j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hn;
    }

    /* renamed from: e */
    public final boolean mo58539e() {
        return ((Boolean) this.f77964e.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77965j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$a */
    public static final class C32701a {
        static {
            Covode.recordClassIndex(39480);
        }

        private C32701a() {
        }

        public /* synthetic */ C32701a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.bof);
        if (loadingButton != null) {
            loadingButton.mo58777b(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.bof);
        if (loadingButton != null) {
            loadingButton.mo58776a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$b */
    static final class C32702b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C32700p f77966a;

        static {
            Covode.recordClassIndex(39481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32702b(C32700p pVar) {
            super(0);
            this.f77966a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f77966a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_ProAccount", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$f */
    static final class CallableC32707f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C32700p f77972a;

        static {
            Covode.recordClassIndex(39486);
        }

        CallableC32707f(C32700p pVar) {
            this.f77972a = pVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f77972a);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.TWO_FACTOR_AUTH;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32700p.CallableC32707f.C327081 */

                /* renamed from: a */
                final /* synthetic */ CallableC32707f f77973a;

                static {
                    Covode.recordClassIndex(39487);
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
                    if (this.f77973a.f77972a.getActivity() != null) {
                        ActivityC0945e activity = this.f77973a.f77972a.getActivity();
                        if (!(activity instanceof AbstractActivityC32568a)) {
                            activity = null;
                        }
                        AbstractActivityC32568a aVar = (AbstractActivityC32568a) activity;
                        if (aVar != null && !aVar.isFinishing()) {
                            ActivityC0945e activity2 = this.f77973a.f77972a.getActivity();
                            if (activity2 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(activity2, "");
                            ((C23023b) C23028c.m43435a(new C23023b(activity2).mo37411b(this.f77973a.f77972a.getString(R.string.gy4)).mo37413d(this.f77973a.f77972a.getString(R.string.gy2)), new C32709a(this)).mo37482a(false)).mo37405a().mo37396b().show();
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f77973a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$f$1$a */
                static final class C32709a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C327081 f77974a;

                    static {
                        Covode.recordClassIndex(39488);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C32709a(C327081 r2) {
                        super(1);
                        this.f77974a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23025b bVar) {
                        C23025b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        String string = this.f77974a.f77973a.f77972a.getString(R.string.gy1);
                        C89219l.m154716b(string, "");
                        bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32700p.CallableC32707f.C327081.C32709a.C327101 */

                            /* renamed from: a */
                            final /* synthetic */ C32709a f77975a;

                            static {
                                Covode.recordClassIndex(39489);
                            }

                            {
                                this.f77975a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                C29844g gVar = new C29844g("aweme://i18n_feedback_input");
                                gVar.mo52130a("feedback_id", "5695");
                                SmartRouter.buildRoute(this.f77975a.f77974a.f77973a.f77972a.getActivity(), gVar.mo52126a()).open();
                                C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TWO_FACTOR_AUTH);
                                return C89391z.f203057a;
                            }
                        });
                        String string2 = this.f77974a.f77973a.f77972a.getString(R.string.as_);
                        C89219l.m154716b(string2, "");
                        bVar2.mo37419b(string2, C327112.f77976a);
                        bVar2.f54513b = true;
                        return C89391z.f203057a;
                    }
                }
            }));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C32776c.m67375a(((PhoneInputView) mo57434c(R.id.boh)).getEditText());
        this.f77963c = System.currentTimeMillis();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        if (mo58539e()) {
            C39162r.m79460a("back", new C31376a().mo57399a("enter_from", "Set up by Phone").mo57398a("duration", System.currentTimeMillis() - this.f77723t).f75156a);
        }
        if (mo58458A() == EnumC32592i.BIND_PHONE) {
            C31588c.m65884a(mo58466w());
        }
        return super.mo57458q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r0.getBoolean("show_skip") != false) goto L_0x0068;
     */
    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b mo57457p() {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32700p.mo57457p():com.ss.android.ugc.aweme.account.login.v2.ui.b");
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$g */
    static final class C32712g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32700p f77977a;

        static {
            Covode.recordClassIndex(39491);
        }

        C32712g(C32700p pVar) {
            this.f77977a = pVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77977a.mo58538a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$i */
    static final class C32714i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32700p f77979a;

        static {
            Covode.recordClassIndex(39493);
        }

        C32714i(C32700p pVar) {
            this.f77979a = pVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77979a.mo58538a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$c */
    public static final class C32703c extends C34699o {

        /* renamed from: a */
        final /* synthetic */ EditText f77967a;

        /* renamed from: b */
        final /* synthetic */ C32700p f77968b;

        static {
            Covode.recordClassIndex(39482);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            LoadingButton loadingButton = (LoadingButton) this.f77968b.mo57434c(R.id.bof);
            if (loadingButton != null) {
                loadingButton.setEnabled(!TextUtils.isEmpty(this.f77967a.getText()));
            }
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f77968b.mo57434c(R.id.bog);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo58481a();
            }
        }

        C32703c(EditText editText, C32700p pVar) {
            this.f77967a = editText;
            this.f77968b = pVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$h */
    static final class C32713h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32700p f77978a;

        static {
            Covode.recordClassIndex(39492);
        }

        C32713h(C32700p pVar) {
            this.f77978a = pVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f77978a.mo58539e()) {
                C39162r.m79460a("click_next_for_proAccount", new C31376a().mo57397a("is_success", 1).mo57399a("method", "phone").mo57399a("page", "Set up by Phone").mo57398a("duration", System.currentTimeMillis() - this.f77978a.f77963c).f75156a);
            }
            this.f77978a.mo58538a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$d */
    static final class View$OnClickListenerC32704d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32700p f77969a;

        static {
            Covode.recordClassIndex(39483);
        }

        View$OnClickListenerC32704d(C32700p pVar) {
            this.f77969a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f77969a.mo58539e()) {
                C39162r.onEventV3("set_up_by_email");
            }
            Bundle arguments = this.f77969a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            if (arguments.getInt("last_scene", -1) != -1) {
                ActivityC0945e activity = this.f77969a.getActivity();
                if (activity == null) {
                    C89219l.m154715b();
                }
                activity.finish();
                return;
            }
            BaseBindService h = C36085cj.m73554h();
            ActivityC0945e activity2 = this.f77969a.getActivity();
            String w = this.f77969a.mo58466w();
            String x = this.f77969a.mo58467x();
            ActivityC0945e activity3 = this.f77969a.getActivity();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity");
            Bundle c = ((BindOrModifyPhoneActivity) activity3).mo58017c();
            c.putInt("current_scene", this.f77969a.mo58458A().getValue());
            h.bindEmail(activity2, w, x, c, new IAccountService.AbstractC31277g(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32700p.View$OnClickListenerC32704d.C327051 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC32704d f77970a;

                static {
                    Covode.recordClassIndex(39484);
                }

                {
                    this.f77970a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
                public final void onResult(int i, int i2, Object obj) {
                    if (i2 == 1) {
                        ActivityC0945e activity = this.f77970a.f77969a.getActivity();
                        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity");
                        BindOrModifyPhoneActivity bindOrModifyPhoneActivity = (BindOrModifyPhoneActivity) activity;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type android.os.Bundle");
                        Bundle bundle = (Bundle) obj;
                        C89219l.m154721d(bundle, "");
                        bindOrModifyPhoneActivity.f78407a = true;
                        bindOrModifyPhoneActivity.f78408b = bundle;
                        bindOrModifyPhoneActivity.f78409c = Integer.valueOf(i);
                        bindOrModifyPhoneActivity.finish();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo58538a(boolean z) {
        C32582d.m67062a(this, ((PhoneInputView) mo57434c(R.id.boh)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("code_sent", z);
        int i = C32715q.f77981b[mo58460Z_().ordinal()];
        if (i == 1) {
            arguments.putInt("next_page", EnumC32594j.PHONE_SMS_FIND_PASSWORD.getValue());
        } else if (i == 2) {
            arguments.putInt("next_page", EnumC32594j.PHONE_SMS_BIND.getValue());
        } else if (i == 3) {
            arguments.putInt("next_page", EnumC32594j.PHONE_SMS_MODIFY.getValue());
        }
        C89219l.m154716b(arguments, "");
        mo58461a(arguments);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        if (mo58458A() == EnumC32592i.MODIFY_PHONE) {
            Bundle arguments = getArguments();
            String str2 = "";
            if (arguments == null || (str = arguments.getString("ticket")) == null) {
                str = str2;
            }
            this.f77961a = str;
            Bundle arguments2 = getArguments();
            if (!(arguments2 == null || (string = arguments2.getString("mUnusableMobileTicket")) == null)) {
                str2 = string;
            }
            this.f77962b = str2;
        } else if (mo58458A() == EnumC32592i.BIND_PHONE) {
            C31588c.m65885a(mo58466w(), "mobile");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$e */
    static final class View$OnClickListenerC32706e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32700p f77971a;

        static {
            Covode.recordClassIndex(39485);
        }

        View$OnClickListenerC32706e(C32700p pVar) {
            this.f77971a = pVar;
        }

        public final void onClick(View view) {
            C32308a aVar;
            ClickAgent.onClick(view);
            C32700p pVar = this.f77971a;
            if (!C31940a.m66308a(((PhoneInputView) pVar.mo57434c(R.id.boh)).getCountryCodeString(), ((PhoneInputView) pVar.mo57434c(R.id.boh)).getPhoneNumberString())) {
                String string = pVar.getString(R.string.aqb);
                C89219l.m154716b(string, "");
                pVar.mo57442a(0, string);
                if (pVar.mo58539e()) {
                    C39162r.m79460a("input_wrong_phone", new C31376a().mo57399a("page", "Set up by Phone").mo57399a("error_code", "1").f75156a);
                    return;
                }
                return;
            }
            TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(pVar.getActivity(), ((PhoneInputView) pVar.mo57434c(R.id.boh)).getFullPhoneNumber(), pVar.mo58458A());
            if (a == null || (aVar = a.f77750a) == null || !aVar.mo58388d()) {
                String a2 = C31940a.m66306a(((PhoneInputView) pVar.mo57434c(R.id.boh)).getPhoneNumberObject());
                C89219l.m154716b(a2, "");
                int i = C32715q.f77980a[pVar.mo58460Z_().ordinal()];
                if (i == 1) {
                    C32407x.m66797a(pVar, a2, pVar.mo58460Z_(), "user_click").mo143251d(new C32712g(pVar)).mo143246c();
                } else if (i == 2) {
                    C32407x.m66794a(pVar, C31940a.m66306a(((PhoneInputView) pVar.mo57434c(R.id.boh)).getPhoneNumberObject()), pVar.mo58458A(), pVar.mo58460Z_(), "", "", "user_click").mo143251d(new C32713h(pVar)).mo143246c();
                } else if (i == 3) {
                    C32407x.m66794a(pVar, C31940a.m66306a(((PhoneInputView) pVar.mo57434c(R.id.boh)).getPhoneNumberObject()), pVar.mo58458A(), pVar.mo58460Z_(), pVar.f77961a, pVar.f77962b, "user_click").mo143251d(new C32714i(pVar)).mo143246c();
                }
            } else {
                pVar.mo58538a(false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.bog);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58482a(str);
        }
        if (i == 1356) {
            C1731i.m5640b(new CallableC32707f(this), C1731i.f5564c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        PhoneInputView phoneInputView = (PhoneInputView) mo57434c(R.id.boh);
        EditText editText = phoneInputView.getEditText();
        editText.setInputType(3);
        editText.addTextChangedListener(new C32703c(editText, this));
        editText.setHint(getString(R.string.d8y));
        C31940a.C31941a b = C32582d.m67066b(this);
        if (b != null) {
            phoneInputView.setCountryCode(new StringBuilder().append(b.getCountryCode()).toString());
            phoneInputView.setCountryName(b.getCountryIso());
            phoneInputView.setPhoneNumber(new StringBuilder().append(b.getNationalNumber()).toString());
        } else {
            phoneInputView.mo58790a();
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        if (arguments.getBoolean("use_email", false) || mo58539e()) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView2, "");
            C32807q.m67391a(tuxTextView2, new View$OnClickListenerC32704d(this), R.string.flh, R.string.fli);
        }
        mo58495a(mo57434c(R.id.bof), new View$OnClickListenerC32706e(this));
    }
}
