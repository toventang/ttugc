package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.input.TuxTextView;
import com.google.p1998c.p2001c.AbstractC27540z;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.login.AbstractC32818x;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import com.p2082ss.android.ugc.aweme.account.login.p2259d.C31898a;
import com.p2082ss.android.ugc.aweme.account.login.p2260e.C31910a;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import com.p2082ss.android.ugc.aweme.account.login.view.DialogC32810a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32868n;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.p2280ui.PhoneInputView;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t */
public final class C32731t extends AbstractC32613a implements AbstractC2599d, AbstractC32818x {

    /* renamed from: c */
    public static final C32732a f78010c = new C32732a((byte) 0);

    /* renamed from: a */
    public DialogC32810a f78011a;

    /* renamed from: b */
    public boolean f78012b = true;

    /* renamed from: d */
    private boolean f78013d;

    /* renamed from: e */
    private boolean f78014e;

    /* renamed from: j */
    private String f78015j = "";

    /* renamed from: k */
    private String f78016k = "";

    /* renamed from: l */
    private final AbstractC89244h f78017l = C89250i.m154773a((AbstractC89171a) new C32735d(this));

    /* renamed from: m */
    private boolean f78018m;

    /* renamed from: n */
    private HashMap f78019n;

    static {
        Covode.recordClassIndex(39510);
    }

    /* renamed from: e */
    private final C31910a m67312e() {
        return (C31910a) this.f78017l.getValue();
    }

    @Override // com.bytedance.analytics.page.AbstractC2599d
    public final String ah_() {
        return "PhoneEmailLoginStep";
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f78019n == null) {
            this.f78019n = new HashMap();
        }
        View view = (View) this.f78019n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78019n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hq;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f78019n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$a */
    public static final class C32732a {
        static {
            Covode.recordClassIndex(39511);
        }

        private C32732a() {
        }

        public /* synthetic */ C32732a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m67326a(boolean z, String str) {
            C89219l.m154721d(str, "");
            C39162r.m79460a("login_click_next_result", new C31376a().mo57399a("platform", "phone").mo57399a("enter_method", str).mo57397a("is_success", z ? 1 : 0).mo57397a("is_register", 0).f75156a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractC32818x
    /* renamed from: a */
    public final boolean mo57964a() {
        return this.f78012b;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$f */
    public static final class C32740f implements DialogC32810a.AbstractC32811a {

        /* renamed from: a */
        final /* synthetic */ C32731t f78027a;

        static {
            Covode.recordClassIndex(39519);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.view.DialogC32810a.AbstractC32811a
        /* renamed from: a */
        public final void mo58554a() {
            C80273bt.m139146b(this.f78027a.f78011a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32740f(C32731t tVar) {
            this.f78027a = tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$d */
    static final class C32735d extends AbstractC89220m implements AbstractC89171a<C31910a> {

        /* renamed from: a */
        final /* synthetic */ C32731t f78022a;

        static {
            Covode.recordClassIndex(39514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32735d(C32731t tVar) {
            super(0);
            this.f78022a = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31910a invoke() {
            C32731t tVar = this.f78022a;
            return new C31910a(tVar, tVar.mo58467x());
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        m67312e().mo57846b();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.d1g)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        ((LoadingButton) mo57434c(R.id.d1g)).mo58776a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$e */
    static final class CallableC32736e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C32731t f78023a;

        static {
            Covode.recordClassIndex(39515);
        }

        CallableC32736e(C32731t tVar) {
            this.f78023a = tVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f78023a);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.TWO_FACTOR_AUTH;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32731t.CallableC32736e.C327371 */

                /* renamed from: a */
                final /* synthetic */ CallableC32736e f78024a;

                static {
                    Covode.recordClassIndex(39516);
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
                    if (this.f78024a.f78023a.getActivity() != null) {
                        ActivityC0945e activity = this.f78024a.f78023a.getActivity();
                        if (!(activity instanceof AbstractActivityC32568a)) {
                            activity = null;
                        }
                        AbstractActivityC32568a aVar = (AbstractActivityC32568a) activity;
                        if (aVar != null && !aVar.isFinishing()) {
                            ActivityC0945e activity2 = this.f78024a.f78023a.getActivity();
                            if (activity2 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(activity2, "");
                            ((C23023b) C23028c.m43435a(new C23023b(activity2).mo37411b(this.f78024a.f78023a.getString(R.string.gxn)).mo37413d(this.f78024a.f78023a.getString(R.string.gxl)), new C32738a(this)).mo37482a(false)).mo37405a().mo37396b().show();
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f78024a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$e$1$a */
                static final class C32738a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C327371 f78025a;

                    static {
                        Covode.recordClassIndex(39517);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C32738a(C327371 r2) {
                        super(1);
                        this.f78025a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23025b bVar) {
                        C23025b bVar2 = bVar;
                        C89219l.m154721d(bVar2, "");
                        String string = this.f78025a.f78024a.f78023a.getString(R.string.as_);
                        C89219l.m154716b(string, "");
                        bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32731t.CallableC32736e.C327371.C32738a.C327391 */

                            /* renamed from: a */
                            final /* synthetic */ C32738a f78026a;

                            static {
                                Covode.recordClassIndex(39518);
                            }

                            {
                                this.f78026a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                C89219l.m154721d(aVar, "");
                                ActivityC0945e activity = this.f78026a.f78025a.f78024a.f78023a.getActivity();
                                if (!(activity instanceof AbstractActivityC32568a)) {
                                    activity = null;
                                }
                                AbstractActivityC32568a aVar2 = (AbstractActivityC32568a) activity;
                                if (aVar2 != null) {
                                    aVar2.onBackPressed();
                                }
                                C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TWO_FACTOR_AUTH);
                                return C89391z.f203057a;
                            }
                        });
                        bVar2.f54513b = true;
                        return C89391z.f203057a;
                    }
                }
            }));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        KeyboardUtils.m70897c(((PhoneInputView) mo57434c(R.id.d1i)).getEditText());
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        return new C32775b(null, null, false, null, null, true, null, false, false, 1870);
    }

    /* renamed from: g */
    private final void m67313g() {
        if (((PhoneInputView) mo57434c(R.id.d1i)).getPhoneNumber() <= 0 && !this.f78014e) {
            m67312e().mo57845a(((PhoneInputView) mo57434c(R.id.d1i)).getEditText());
        }
        this.f78014e = true;
        C32776c.m67375a(((PhoneInputView) mo57434c(R.id.d1i)).getInputView().getEditText());
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$c */
    public static final class C32734c extends C31685i {

        /* renamed from: a */
        final /* synthetic */ C32731t f78021a;

        static {
            Covode.recordClassIndex(39513);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32734c(C32731t tVar) {
            this.f78021a = tVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            String obj;
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f78021a.mo57434c(R.id.d1h);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo58481a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f78021a.mo57434c(R.id.d1g);
            if (loadingButton != null) {
                boolean z = false;
                if (!(editable == null || (obj = editable.toString()) == null || obj.length() <= 0)) {
                    z = true;
                }
                loadingButton.setEnabled(z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m67312e().mo57843a();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$g */
    static final class View$OnClickListenerC32741g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32731t f78028a;

        /* renamed from: b */
        final /* synthetic */ boolean f78029b;

        static {
            Covode.recordClassIndex(39520);
        }

        View$OnClickListenerC32741g(C32731t tVar, boolean z) {
            this.f78028a = tVar;
            this.f78029b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78028a.mo58549a(this.f78029b);
            this.f78028a.mo58550a(this.f78029b, true);
            C80273bt.m139146b(this.f78028a.f78011a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$h */
    static final class View$OnClickListenerC32742h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32731t f78030a;

        /* renamed from: b */
        final /* synthetic */ boolean f78031b;

        static {
            Covode.recordClassIndex(39521);
        }

        View$OnClickListenerC32742h(C32731t tVar, boolean z) {
            this.f78030a = tVar;
            this.f78031b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78030a.mo58549a(!this.f78031b);
            this.f78030a.mo58550a(!this.f78031b, true);
            C80273bt.m139146b(this.f78030a.f78011a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$i */
    static final class View$OnClickListenerC32743i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32731t f78032a;

        static {
            Covode.recordClassIndex(39522);
        }

        View$OnClickListenerC32743i(C32731t tVar) {
            this.f78032a = tVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f78032a.getActivity() != null) {
                C31898a.m66240a(this.f78032a, "");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$j */
    public static final class C32744j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32731t f78033a;

        static {
            Covode.recordClassIndex(39523);
        }

        C32744j(C32731t tVar) {
            this.f78033a = tVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String x = this.f78033a.mo58467x();
            C89219l.m154716b(x, "");
            C32732a.m67326a(true, x);
            this.f78033a.mo58551a(true, true, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$k */
    public static final class C32745k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32731t f78034a;

        /* renamed from: b */
        final /* synthetic */ boolean f78035b;

        static {
            Covode.recordClassIndex(39524);
        }

        C32745k(C32731t tVar, boolean z) {
            this.f78034a = tVar;
            this.f78035b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String x = this.f78034a.mo58467x();
            C89219l.m154716b(x, "");
            C32732a.m67326a(true, x);
            this.f78034a.mo58551a(false, true, this.f78035b);
        }
    }

    /* renamed from: a */
    public final void mo58549a(boolean z) {
        String str;
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C39162r.m79460a(str, new C31376a().mo57399a("enter_type", mo58468y()).f75156a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            return;
        }
        if (af_()) {
            m67313g();
        } else {
            this.f78013d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$b */
    static final class View$OnClickListenerC32733b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32731t f78020a;

        static {
            Covode.recordClassIndex(39512);
        }

        View$OnClickListenerC32733b(C32731t tVar) {
            this.f78020a = tVar;
        }

        public final void onClick(View view) {
            String string;
            String string2;
            ClickAgent.onClick(view);
            this.f78020a.f78012b = false;
            C39162r.m79460a("login_click_next", new C31376a().mo57399a("platform", "phone").mo57399a("enter_method", this.f78020a.mo58467x()).f75156a);
            if (!C31940a.m66308a(((PhoneInputView) this.f78020a.mo57434c(R.id.d1i)).getCountryCodeString(), ((PhoneInputView) this.f78020a.mo57434c(R.id.d1i)).getPhoneNumberString())) {
                String x = this.f78020a.mo58467x();
                C89219l.m154716b(x, "");
                C32732a.m67326a(false, x);
                C32731t tVar = this.f78020a;
                String string3 = tVar.getString(R.string.aqb);
                C89219l.m154716b(string3, "");
                tVar.mo57442a(0, string3);
            } else if (!C32868n.m67469a(((PhoneInputView) this.f78020a.mo57434c(R.id.d1i)).getCountryCodeString()) || this.f78020a.mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
                this.f78020a.mo58550a(false, false);
            } else {
                C32731t tVar2 = this.f78020a;
                if (tVar2.getActivity() != null) {
                    String countryCodeString = ((PhoneInputView) tVar2.mo57434c(R.id.d1i)).getCountryCodeString();
                    boolean b = C32868n.m67470b(countryCodeString);
                    if (C32868n.m67470b(countryCodeString)) {
                        string = tVar2.getString(R.string.fij);
                        C89219l.m154716b(string, "");
                        string2 = tVar2.getString(R.string.fii);
                        C89219l.m154716b(string2, "");
                    } else {
                        string = tVar2.getString(R.string.fii);
                        C89219l.m154716b(string, "");
                        string2 = tVar2.getString(R.string.fij);
                        C89219l.m154716b(string2, "");
                    }
                    String fullPhoneNumber = ((PhoneInputView) tVar2.mo57434c(R.id.d1i)).getFullPhoneNumber();
                    ActivityC0945e activity = tVar2.getActivity();
                    if (activity == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity, "");
                    String string4 = tVar2.getString(R.string.fik);
                    C89219l.m154716b(string4, "");
                    String string5 = tVar2.getString(R.string.fih, fullPhoneNumber);
                    C89219l.m154716b(string5, "");
                    String y = tVar2.mo58468y();
                    C89219l.m154716b(y, "");
                    tVar2.f78011a = new DialogC32810a(activity, new DialogC32810a.C32812b(string4, string5, string, string2, y, fullPhoneNumber));
                    DialogC32810a aVar = tVar2.f78011a;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    aVar.f78166a = new C32740f(tVar2);
                    DialogC32810a aVar2 = tVar2.f78011a;
                    if (aVar2 == null) {
                        C89219l.m154715b();
                    }
                    aVar2.f78167b = new View$OnClickListenerC32741g(tVar2, b);
                    DialogC32810a aVar3 = tVar2.f78011a;
                    if (aVar3 == null) {
                        C89219l.m154715b();
                    }
                    aVar3.f78168c = new View$OnClickListenerC32742h(tVar2, b);
                    C80273bt.m139145a(tVar2.f78011a);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        C31898a.f76207a.contains(Integer.valueOf(i));
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.d1h);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo58482a(str);
        }
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.d1g);
        if (loadingButton != null) {
            loadingButton.mo58777b(true);
        }
        if (i == 1053) {
            C1731i.m5640b(new CallableC32736e(this), C1731i.f5564c);
        }
    }

    /* renamed from: a */
    public final void mo58550a(boolean z, boolean z2) {
        String str;
        C32308a aVar;
        TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(getActivity(), ((PhoneInputView) mo57434c(R.id.d1i)).getFullPhoneNumber(), EnumC32592i.LOGIN);
        if (a != null && (aVar = a.f77750a) != null && aVar.mo58388d()) {
            mo58551a(z, false, false);
        } else if (!z || mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
            String a2 = C31940a.m66306a(((PhoneInputView) mo57434c(R.id.d1i)).getPhoneNumberObject());
            C89219l.m154716b(a2, "");
            EnumC32592i iVar = EnumC32592i.LOGIN;
            EnumC32594j jVar = EnumC32594j.PHONE_SMS_LOGIN;
            if (z2) {
                str = "choose_dialog";
            } else {
                str = null;
            }
            C32407x.m66795a(this, a2, iVar, jVar, "", "user_click", str, 128).mo143251d(new C32745k(this, z2)).mo143246c();
        } else {
            String a3 = C31940a.m66306a(((PhoneInputView) mo57434c(R.id.d1i)).getPhoneNumberObject());
            C89219l.m154716b(a3, "");
            C32407x.m66793a(this, a3, EnumC32592i.LOGIN, EnumC32594j.PHONE_SMS_LOGIN, "user_click", "").mo143251d(new C32744j(this)).mo143246c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String countryIso;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo58495a(mo57434c(R.id.d1g), new View$OnClickListenerC32733b(this));
        ((PhoneInputView) mo57434c(R.id.d1i)).getInputView().setTextWatcher(new C32734c(this));
        if (mo58458A() != EnumC32592i.RECOVER_ACCOUNT) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable("auto_fill_phone_number");
            C31966a aVar = null;
            if (!(serializable instanceof C31940a.C31941a)) {
                serializable = null;
            }
            C31940a.C31941a aVar2 = (C31940a.C31941a) serializable;
            if (aVar2 != null) {
                if (aVar2.getNationalNumber() != 0) {
                    ((PhoneInputView) mo57434c(R.id.d1i)).setPhoneNumber(String.valueOf(aVar2.getNationalNumber()));
                }
                C89219l.m154721d(aVar2, "");
                AbstractC27540z<C31966a> zVar = C31966a.f76330h;
                if (zVar != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : zVar) {
                        T t2 = t;
                        if (t2.mo57951a() == aVar2.getCountryCode() && ((countryIso = aVar2.getCountryIso()) == null || countryIso.length() == 0 || C89219l.m154714a((Object) t2.f76334c, (Object) aVar2.getCountryIso()))) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        aVar = (C31966a) arrayList2.get(0);
                    }
                }
                ((PhoneInputView) mo57434c(R.id.d1i)).setCountry(aVar);
            }
        }
        if (((PhoneInputView) mo57434c(R.id.d1i)).getCountryCodeString().length() == 0 && ((PhoneInputView) mo57434c(R.id.d1i)).getCountryName().length() == 0) {
            ((PhoneInputView) mo57434c(R.id.d1i)).mo58790a();
        }
        if (this.f78013d) {
            m67313g();
            this.f78013d = false;
        }
        if (this.f78018m) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.a3v);
            C89219l.m154716b(tuxTextView, "");
            if (tuxTextView.getVisibility() != 0) {
                TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.a3v);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                TuxTextView tuxTextView3 = (TuxTextView) mo57434c(R.id.a3v);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setText(getString(R.string.aoo));
                ((TuxTextView) mo57434c(R.id.a3v)).setOnClickListener(new View$OnClickListenerC32743i(this));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m67312e().mo57844a(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo58551a(boolean z, boolean z2, boolean z3) {
        if (mo57434c(R.id.d1i) != null) {
            ActivityC0945e activity = getActivity();
            boolean z4 = true;
            if (activity == null || !activity.isFinishing()) {
                C32582d.m67062a(this, ((PhoneInputView) mo57434c(R.id.d1i)).getPhoneNumberObject());
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", EnumC32594j.PHONE_SMS_LOGIN.getValue());
                arguments.putInt("current_scene", EnumC32592i.LOGIN.getValue());
                if (mo58458A() != EnumC32592i.RECOVER_ACCOUNT) {
                    z4 = false;
                }
                arguments.putBoolean("recover_mobile_code", z4);
                arguments.putBoolean("code_sent", z2);
                arguments.putBoolean("use_whatsapp", z);
                arguments.putBoolean("from_choose_dialog", z3);
                C89219l.m154716b(arguments, "");
                if (!C89219l.m154714a((Object) C31940a.m66306a(((PhoneInputView) mo57434c(R.id.d1i)).getPhoneNumberObject()), (Object) this.f78016k) || TextUtils.isEmpty(this.f78015j)) {
                    arguments.putString("gms_phone_pwd", "");
                } else {
                    arguments.putString("gms_phone_pwd", this.f78015j);
                }
                mo58461a(arguments);
            }
        }
    }

    /* renamed from: a */
    public final void mo58548a(String str, String str2, String str3, String str4, boolean z) {
        if (mo57434c(R.id.d1i) != null) {
            if (!((!TextUtils.isEmpty(((PhoneInputView) mo57434c(R.id.d1i)).getEditText().getText()) && !z) || str == null || str3 == null)) {
                C31966a a = C31966a.C31967a.m66337a(Integer.parseInt(str3));
                ((PhoneInputView) mo57434c(R.id.d1i)).setPhoneNumber(str);
                ((PhoneInputView) mo57434c(R.id.d1i)).setCountry(a);
            }
            if (str4 == null || str2 == null) {
                if (!z) {
                    return;
                }
            } else if (!z) {
                this.f78016k = str4;
                this.f78015j = str2;
                return;
            }
            LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.d1g);
            if (loadingButton != null) {
                loadingButton.mo58776a(true);
            }
        }
    }
}
