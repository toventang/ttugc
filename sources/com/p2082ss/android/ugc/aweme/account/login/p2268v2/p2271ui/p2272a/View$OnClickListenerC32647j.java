package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.DialogInterfaceC0216c;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import androidx.lifecycle.C1213t;
import androidx.p025c.C0484a;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22293f;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22314a;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22406a;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22411f;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22417l;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22418m;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.account.p2089b.C29345a;
import com.p2082ss.android.ugc.aweme.C33917aq;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.experiment.C31663o;
import com.p2082ss.android.ugc.aweme.account.login.p2259d.C31898a;
import com.p2082ss.android.ugc.aweme.account.login.p2260e.C31915f;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.ActionResultModel;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32405w;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32555z;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a.C32334a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import com.p2082ss.android.ugc.aweme.account.login.recover.C32034f;
import com.p2082ss.android.ugc.aweme.account.loginsetting.AbstractC32830a;
import com.p2082ss.android.ugc.aweme.account.loginsetting.C32833d;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingCircleView;
import com.p2082ss.android.ugc.aweme.account.p2280ui.TimerTextView;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;
import com.p2082ss.android.ugc.aweme.account.views.C33064a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j */
public final class View$OnClickListenerC32647j extends AbstractC32613a implements View.OnClickListener, CodeInputView.AbstractC32959a {

    /* renamed from: j */
    public static final AbstractC89244h f77858j = C89250i.m154773a((AbstractC89171a) C32654b.f77890a);

    /* renamed from: k */
    public static final C32648a f77859k = new C32648a((byte) 0);

    /* renamed from: A */
    private String f77860A = "";

    /* renamed from: B */
    private String f77861B = "";

    /* renamed from: C */
    private C32034f.C32036b f77862C;

    /* renamed from: D */
    private boolean f77863D;

    /* renamed from: E */
    private final AbstractC89244h f77864E = C89250i.m154773a((AbstractC89171a) new C32656d(this));

    /* renamed from: F */
    private final AbstractC89244h f77865F = C89250i.m154773a((AbstractC89171a) new C32671s(this));

    /* renamed from: G */
    private final AbstractC89244h f77866G = C89250i.m154773a((AbstractC89171a) C32653ae.f77889a);

    /* renamed from: H */
    private final C32652ad f77867H = new C32652ad(this);

    /* renamed from: I */
    private HashMap f77868I;

    /* renamed from: a */
    public String f77869a = "";

    /* renamed from: b */
    public long f77870b = System.currentTimeMillis();

    /* renamed from: c */
    public boolean f77871c;

    /* renamed from: d */
    public boolean f77872d;

    /* renamed from: e */
    public boolean f77873e;

    /* renamed from: l */
    private boolean f77874l;

    /* renamed from: m */
    private boolean f77875m;

    /* renamed from: n */
    private String f77876n = "";

    /* renamed from: o */
    private int f77877o;

    /* renamed from: p */
    private TimerHolder.C32597b f77878p;

    /* renamed from: q */
    private C32308a f77879q;

    /* renamed from: r */
    private boolean f77880r;

    /* renamed from: s */
    private C31915f f77881s;

    /* renamed from: y */
    private boolean f77882y;

    /* renamed from: z */
    private boolean f77883z;

    /* renamed from: t */
    private final boolean m67199t() {
        return ((Boolean) this.f77866G.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77868I == null) {
            this.f77868I = new HashMap();
        }
        View view = (View) this.f77868I.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77868I.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hk;
    }

    /* renamed from: e */
    public final boolean mo58513e() {
        return ((Boolean) this.f77864E.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final String mo57437g() {
        return (String) this.f77865F.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77868I;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$a */
    public static final class C32648a {
        static {
            Covode.recordClassIndex(39427);
        }

        /* renamed from: a */
        public static HashMap<String, Boolean> m67220a() {
            return (HashMap) View$OnClickListenerC32647j.f77858j.getValue();
        }

        private C32648a() {
        }

        public /* synthetic */ C32648a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        m67197I();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$ad */
    public static final class C32652ad extends C32308a.C32310b {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77888a;

        static {
            Covode.recordClassIndex(39431);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.C32310b, com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: a */
        public final void mo58205a() {
            this.f77888a.mo58514i();
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.C32310b, com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: b */
        public final void mo58206b() {
            if (this.f77888a.af_()) {
                this.f77888a.mo58515k();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32652ad(View$OnClickListenerC32647j jVar) {
            this.f77888a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.C32310b, com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: a */
        public final void mo58389a(long j) {
            if (this.f77888a.af_()) {
                this.f77888a.mo58511a(j);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$b */
    static final class C32654b extends AbstractC89220m implements AbstractC89171a<HashMap<String, Boolean>> {

        /* renamed from: a */
        public static final C32654b f77890a = new C32654b();

        static {
            Covode.recordClassIndex(39433);
        }

        C32654b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, Boolean> invoke() {
            return new HashMap();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        mo58460Z_();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$ae */
    static final class C32653ae extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C32653ae f77889a = new C32653ae();

        static {
            Covode.recordClassIndex(39432);
        }

        C32653ae() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C31663o.m65975a());
        }
    }

    /* renamed from: E */
    private final String m67196E() {
        if (TextUtils.isEmpty(this.f77876n)) {
            return this.f77869a;
        }
        return this.f77876n;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$d */
    static final class C32656d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77892a;

        static {
            Covode.recordClassIndex(39435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32656d(View$OnClickListenerC32647j jVar) {
            super(0);
            this.f77892a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.f77892a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_ProAccount", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$s */
    static final class C32671s extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77907a;

        static {
            Covode.recordClassIndex(39450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32671s(View$OnClickListenerC32647j jVar) {
            super(0);
            this.f77907a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f77907a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            return arguments.getString("platform", "");
        }
    }

    static {
        Covode.recordClassIndex(39426);
    }

    /* renamed from: I */
    private final void m67197I() {
        LoadingCircleView loadingCircleView = (LoadingCircleView) mo57434c(R.id.bo0);
        C89219l.m154716b(loadingCircleView, "");
        loadingCircleView.setVisibility(0);
        ((LoadingCircleView) mo57434c(R.id.bo0)).mo58783a();
    }

    /* renamed from: m */
    public final String mo58517m() {
        return m67196E() + "_voice";
    }

    /* renamed from: o */
    public final void mo58519o() {
        C39162r.m79460a("auto_fill_sms_verification", new C31376a().mo57399a("enter_method", mo58467x()).f75156a);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C31915f fVar = this.f77881s;
        if (fVar != null) {
            fVar.mo57852c();
        }
        super.onDestroyView();
        KeyboardUtils.m70897c(mo57434c(R.id.bo5));
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        CodeInputView codeInputView = (CodeInputView) mo57434c(R.id.bo5);
        C89219l.m154716b(codeInputView, "");
        C32776c.m67375a(codeInputView);
    }

    /* renamed from: J */
    private final void m67198J() {
        String str;
        C17197a.C17200a aVar = new C17197a.C17200a(getContext());
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.aql);
        } else {
            str = null;
        }
        aVar.f41070a = str;
        aVar.mo27190a(R.string.as_, (DialogInterface.OnClickListener) null, false).mo27193a().mo27185c().setCancelable(false);
    }

    /* renamed from: i */
    public final void mo58514i() {
        TimerTextView timerTextView = (TimerTextView) mo57434c(R.id.bo4);
        C89219l.m154716b(timerTextView, "");
        if (timerTextView.getVisibility() != 0) {
            TimerTextView timerTextView2 = (TimerTextView) mo57434c(R.id.bo4);
            C89219l.m154716b(timerTextView2, "");
            timerTextView2.setVisibility(0);
        }
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.bo1);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setEnabled(false);
    }

    /* renamed from: k */
    public final void mo58515k() {
        TimerTextView timerTextView = (TimerTextView) mo57434c(R.id.bo4);
        C89219l.m154716b(timerTextView, "");
        if (timerTextView.getVisibility() != 8) {
            TimerTextView timerTextView2 = (TimerTextView) mo57434c(R.id.bo4);
            C89219l.m154716b(timerTextView2, "");
            timerTextView2.setVisibility(8);
        }
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.bo1);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setEnabled(true);
    }

    /* renamed from: l */
    public final void mo58516l() {
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.bo1);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setEnabled(false);
        ((TimerTextView) mo57434c(R.id.bo4)).setCallback(this.f77867H);
        TimerHolder.C32596a.m67089a(getActivity(), m67196E(), new TimerHolder.C32597b(((TimerTextView) mo57434c(R.id.bo4)).mo58808c()), mo58458A());
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        if (mo58513e()) {
            C39162r.m79460a("back", new C31376a().mo57399a("enter_from", "Input Phone Captcha").mo57398a("duration", System.currentTimeMillis() - this.f77723t).f75156a);
        }
        return super.mo57458q();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        CodeInputView codeInputView = (CodeInputView) mo57434c(R.id.bo5);
        C89219l.m154716b(codeInputView, "");
        codeInputView.setEnabled(true);
        LoadingCircleView loadingCircleView = (LoadingCircleView) mo57434c(R.id.bo0);
        C89219l.m154716b(loadingCircleView, "");
        loadingCircleView.setVisibility(8);
        ((LoadingCircleView) mo57434c(R.id.bo0)).mo58784b();
    }

    /* renamed from: n */
    public final void mo58518n() {
        C39162r.m79460a("switch_to_password", new C31376a().mo57399a("enter_method", mo58467x()).f75156a);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC32594j.PHONE_PASSWORD_LOGIN.getValue());
        arguments.putInt("current_scene", mo58458A().getValue());
        arguments.putBoolean("recover_mobile_code", this.f77863D);
        arguments.putSerializable("recover_account_data", this.f77862C);
        C89219l.m154716b(arguments, "");
        mo58461a(arguments);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        String str;
        String str2;
        int i = C32679k.f77915a[mo58460Z_().ordinal()];
        int i2 = R.string.aqo;
        boolean z = true;
        String str3 = "";
        switch (i) {
            case 1:
                if (!this.f77874l) {
                    if (m67199t()) {
                        i2 = R.string.aqj;
                    } else {
                        i2 = R.string.arh;
                    }
                }
                str2 = getString(i2);
                C89219l.m154716b(str2, str3);
                Locale locale = Locale.US;
                String string = getString(R.string.aqh);
                C89219l.m154716b(string, str3);
                str = C1764a.m5929a(locale, string, Arrays.copyOf(new Object[]{this.f77869a}, 1));
                C89219l.m154716b(str, str3);
                if (!this.f77874l) {
                    str3 = "phone_sign_up_sms_verification_page";
                    break;
                } else {
                    str3 = "phone_sign_up_whatsapp_verification_page";
                    break;
                }
            case 2:
                str2 = getString(R.string.ara);
                C89219l.m154716b(str2, str3);
                Locale locale2 = Locale.US;
                String string2 = getString(R.string.arb);
                C89219l.m154716b(string2, str3);
                str = C1764a.m5929a(locale2, string2, Arrays.copyOf(new Object[]{this.f77876n}, 1));
                C89219l.m154716b(str, str3);
                str3 = "email_sign_up_verification_page";
                break;
            case 3:
                if (m67199t()) {
                    str2 = getString(R.string.aqj);
                } else {
                    str2 = getString(R.string.arh);
                }
                C89219l.m154716b(str2, str3);
                Locale locale3 = Locale.US;
                String string3 = getString(R.string.aqh);
                C89219l.m154716b(string3, str3);
                str = C1764a.m5929a(locale3, string3, Arrays.copyOf(new Object[]{this.f77869a}, 1));
                C89219l.m154716b(str, str3);
                str3 = "reset_sms_code_input";
                break;
            case 4:
                str2 = getString(R.string.ara);
                C89219l.m154716b(str2, str3);
                Locale locale4 = Locale.US;
                String string4 = getString(R.string.arb);
                C89219l.m154716b(string4, str3);
                str = C1764a.m5929a(locale4, string4, Arrays.copyOf(new Object[]{this.f77876n}, 1));
                C89219l.m154716b(str, str3);
                str3 = "reset_email_code_input";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                if (!this.f77874l) {
                    if (m67199t()) {
                        i2 = R.string.aqj;
                    } else {
                        i2 = R.string.arh;
                    }
                }
                str2 = getString(i2);
                C89219l.m154716b(str2, str3);
                if (m67199t()) {
                    Locale locale5 = Locale.US;
                    String string5 = getString(R.string.cz5);
                    C89219l.m154716b(string5, str3);
                    str = C1764a.m5929a(locale5, string5, Arrays.copyOf(new Object[]{this.f77869a}, 1));
                    C89219l.m154716b(str, str3);
                } else {
                    Locale locale6 = Locale.US;
                    String string6 = getString(R.string.aqh);
                    C89219l.m154716b(string6, str3);
                    str = C1764a.m5929a(locale6, string6, Arrays.copyOf(new Object[]{this.f77869a}, 1));
                    C89219l.m154716b(str, str3);
                }
                if (!this.f77874l) {
                    str3 = "phone_login_sms_verification_page";
                    break;
                } else {
                    str3 = "phone_login_whatsapp_verification_page";
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                if (m67199t()) {
                    str2 = getString(R.string.aqj);
                } else {
                    str2 = getString(R.string.arh);
                }
                C89219l.m154716b(str2, str3);
                Locale locale7 = Locale.US;
                String string7 = getString(R.string.aqh);
                C89219l.m154716b(string7, str3);
                str = C1764a.m5929a(locale7, string7, Arrays.copyOf(new Object[]{this.f77869a}, 1));
                C89219l.m154716b(str, str3);
                z = false;
                break;
            default:
                throw new IllegalStateException("Unknown step " + mo58460Z_() + " during getCommonUiParam()");
        }
        if (mo58458A() == EnumC32592i.RECOVER_ACCOUNT || this.f77863D) {
            z = false;
        }
        return new C32775b(" ", null, false, str2, str, false, str3, z, false, 1230);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$c */
    public static final class C32655c implements AbstractC32830a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77891a;

        static {
            Covode.recordClassIndex(39434);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32655c(View$OnClickListenerC32647j jVar) {
            this.f77891a = jVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.loginsetting.AbstractC32830a
        /* renamed from: a */
        public final void mo58523a(boolean z) {
            C32648a.m67220a().put(this.f77891a.f77869a, Boolean.valueOf(z));
            this.f77891a.f77871c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$t */
    public static final class C32672t<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77908a;

        static {
            Covode.recordClassIndex(39451);
        }

        C32672t(View$OnClickListenerC32647j jVar) {
            this.f77908a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77908a.mo58516l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$u */
    public static final class C32673u<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77909a;

        static {
            Covode.recordClassIndex(39452);
        }

        C32673u(View$OnClickListenerC32647j jVar) {
            this.f77909a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77909a.mo58516l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$v */
    public static final class C32674v<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77910a;

        static {
            Covode.recordClassIndex(39453);
        }

        C32674v(View$OnClickListenerC32647j jVar) {
            this.f77910a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77910a.mo58516l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$w */
    public static final class C32675w<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77911a;

        static {
            Covode.recordClassIndex(39454);
        }

        C32675w(View$OnClickListenerC32647j jVar) {
            this.f77911a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77911a.mo58516l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$x */
    public static final class C32676x<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77912a;

        static {
            Covode.recordClassIndex(39455);
        }

        C32676x(View$OnClickListenerC32647j jVar) {
            this.f77912a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77912a.mo58516l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$y */
    public static final class C32677y<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77913a;

        static {
            Covode.recordClassIndex(39456);
        }

        C32677y(View$OnClickListenerC32647j jVar) {
            this.f77913a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77913a.mo58516l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$z */
    public static final class C32678z<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77914a;

        static {
            Covode.recordClassIndex(39457);
        }

        C32678z(View$OnClickListenerC32647j jVar) {
            this.f77914a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77914a.mo58516l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$ac */
    public static final class DialogInterface$OnDismissListenerC32651ac implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f77887a;

        static {
            Covode.recordClassIndex(39430);
        }

        DialogInterface$OnDismissListenerC32651ac(C89233z.C89234a aVar) {
            this.f77887a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (!this.f77887a.element) {
                C31898a.m66241a("sms_verification", "cancel");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$e */
    static final class C32657e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77893a;

        static {
            Covode.recordClassIndex(39436);
        }

        C32657e(View$OnClickListenerC32647j jVar) {
            this.f77893a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22418m mVar = (C22418m) obj;
            if (mVar.f53031e != null) {
                View$OnClickListenerC32647j jVar = this.f77893a;
                EnumC32592i A = jVar.mo58458A();
                EnumC32594j Z_ = this.f77893a.mo58460Z_();
                C22507a aVar = mVar.f53031e;
                C89219l.m154716b(aVar, "");
                C32334a.m66709a(jVar, A, Z_, aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$h */
    static final class C32660h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77896a;

        static {
            Covode.recordClassIndex(39439);
        }

        C32660h(View$OnClickListenerC32647j jVar) {
            this.f77896a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22411f fVar = (C22411f) obj;
            if (fVar.f52995f != null) {
                View$OnClickListenerC32647j jVar = this.f77896a;
                EnumC32592i A = jVar.mo58458A();
                EnumC32594j Z_ = this.f77896a.mo58460Z_();
                C22507a aVar = fVar.f52995f;
                C89219l.m154716b(aVar, "");
                C32334a.m66709a(jVar, A, Z_, aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$i */
    static final class C32661i extends AbstractC89220m implements AbstractC89172b<C32405w, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77897a;

        static {
            Covode.recordClassIndex(39440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32661i(View$OnClickListenerC32647j jVar) {
            super(1);
            this.f77897a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C32405w wVar) {
            C32405w wVar2 = wVar;
            C89219l.m154721d(wVar2, "");
            View$OnClickListenerC32647j jVar = this.f77897a;
            String g = jVar.mo57437g();
            C89219l.m154716b(g, "");
            jVar.mo58512a(g, false, wVar2.getErrorCode());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$k */
    static final class C32663k extends AbstractC89220m implements AbstractC89172b<C32405w, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77899a;

        static {
            Covode.recordClassIndex(39442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32663k(View$OnClickListenerC32647j jVar) {
            super(1);
            this.f77899a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C32405w wVar) {
            C32405w wVar2 = wVar;
            C89219l.m154721d(wVar2, "");
            View$OnClickListenerC32647j jVar = this.f77899a;
            String g = jVar.mo57437g();
            C89219l.m154716b(g, "");
            jVar.mo58512a(g, false, wVar2.getErrorCode());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$o */
    static final class C32667o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77903a;

        static {
            Covode.recordClassIndex(39446);
        }

        C32667o(View$OnClickListenerC32647j jVar) {
            this.f77903a = jVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            ((CodeInputView) this.f77903a.mo57434c(R.id.bo5)).setTextAndAutoCheck((String) obj);
            this.f77903a.mo58519o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$p */
    static final class C32668p<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77904a;

        static {
            Covode.recordClassIndex(39447);
        }

        C32668p(View$OnClickListenerC32647j jVar) {
            this.f77904a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            TimerTextView timerTextView = (TimerTextView) this.f77904a.mo57434c(R.id.bo4);
            C89219l.m154716b(timerTextView, "");
            timerTextView.setVisibility(0);
            this.f77904a.mo58516l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$r */
    public static final class C32670r extends AbstractC33066c {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77906a;

        static {
            Covode.recordClassIndex(39449);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            if (!C58001a.m104815a(view, 1200) && this.f77906a.mo58493C()) {
                this.f77906a.onClick(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32670r(View$OnClickListenerC32647j jVar, int i, int i2) {
            super(i, i2);
            this.f77906a = jVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$aa */
    public static final class C32649aa<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77884a;

        static {
            Covode.recordClassIndex(39428);
        }

        C32649aa(View$OnClickListenerC32647j jVar) {
            this.f77884a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ActivityC0945e activity = this.f77884a.getActivity();
            String m = this.f77884a.mo58517m();
            C32308a a = new C32308a(60000, 1000, null).mo58384a();
            C89219l.m154716b(a, "");
            TimerHolder.C32596a.m67089a(activity, m, new TimerHolder.C32597b(a), this.f77884a.mo58458A());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$g */
    static final class C32659g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77895a;

        static {
            Covode.recordClassIndex(39438);
        }

        C32659g(View$OnClickListenerC32647j jVar) {
            this.f77895a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22417l lVar = (C22417l) obj;
            if (lVar.f53026e != null) {
                View$OnClickListenerC32647j jVar = this.f77895a;
                EnumC32592i A = jVar.mo58458A();
                EnumC32594j Z_ = this.f77895a.mo58460Z_();
                C22507a aVar = lVar.f53026e;
                C89219l.m154716b(aVar, "");
                C32334a.m66709a(jVar, A, Z_, aVar);
            }
            C39162r.m79460a("input_code_page", new C31376a().mo57398a("stay_time", System.currentTimeMillis() - this.f77895a.f77870b).f75156a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$j */
    static final class C32662j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77898a;

        static {
            Covode.recordClassIndex(39441);
        }

        C32662j(View$OnClickListenerC32647j jVar) {
            this.f77898a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22314a aVar = (C22314a) obj;
            View$OnClickListenerC32647j jVar = this.f77898a;
            String g = jVar.mo57437g();
            C89219l.m154716b(g, "");
            jVar.mo58512a(g, true, aVar.f52715d);
            View$OnClickListenerC32647j jVar2 = this.f77898a;
            Bundle arguments = jVar2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC32594j.RESET_PASSWORD_FOR_PHONE.getValue());
            arguments.putString("ticket", aVar.f52739j);
            C89219l.m154716b(arguments, "");
            jVar2.mo58461a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$l */
    static final class C32664l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77900a;

        static {
            Covode.recordClassIndex(39443);
        }

        C32664l(View$OnClickListenerC32647j jVar) {
            this.f77900a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22314a aVar = (C22314a) obj;
            View$OnClickListenerC32647j jVar = this.f77900a;
            String g = jVar.mo57437g();
            C89219l.m154716b(g, "");
            jVar.mo58512a(g, true, aVar.f52715d);
            View$OnClickListenerC32647j jVar2 = this.f77900a;
            Bundle arguments = jVar2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC32594j.RESET_PASSWORD_FOR_EMAIL.getValue());
            arguments.putString("ticket", aVar.f52739j);
            C89219l.m154716b(arguments, "");
            jVar2.mo58461a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$n */
    static final class C32666n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77902a;

        static {
            Covode.recordClassIndex(39445);
        }

        C32666n(View$OnClickListenerC32647j jVar) {
            this.f77902a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22293f fVar = (C22293f) obj;
            View$OnClickListenerC32647j jVar = this.f77902a;
            Bundle arguments = jVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC32594j.INPUT_PHONE_MODIFY.getValue());
            C89219l.m154716b(fVar, "");
            arguments.putString("ticket", fVar.f52736j);
            C89219l.m154716b(arguments, "");
            jVar.mo58461a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$q */
    static final class C32669q<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77905a;

        static {
            Covode.recordClassIndex(39448);
        }

        C32669q(View$OnClickListenerC32647j jVar) {
            this.f77905a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            CodeInputView codeInputView = (CodeInputView) this.f77905a.mo57434c(R.id.bo5);
            C89219l.m154716b(codeInputView, "");
            codeInputView.setEnabled(true);
            TimerTextView timerTextView = (TimerTextView) this.f77905a.mo57434c(R.id.bo4);
            C89219l.m154716b(timerTextView, "");
            timerTextView.setVisibility(0);
            this.f77905a.mo58516l();
            CodeInputView codeInputView2 = (CodeInputView) this.f77905a.mo57434c(R.id.bo5);
            C89219l.m154716b(codeInputView2, "");
            C32776c.m67375a(codeInputView2);
            this.f77905a.f77872d = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView.AbstractC32959a
    /* renamed from: b */
    public final void mo58201b(String str) {
        C89219l.m154721d(str, "");
        if (af_()) {
            if (this.f77883z) {
                ((CodeInputView) mo57434c(R.id.bo5)).setText("");
                this.f77883z = false;
            }
            ((InputResultIndicator) mo57434c(R.id.bny)).mo58481a();
            ((CodeInputView) mo57434c(R.id.bo5)).mo58743d();
        }
    }

    /* renamed from: a */
    public final void mo58511a(long j) {
        if (this.f77871c && j <= 50000) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.bo6);
            C89219l.m154716b(tuxTextView, "");
            if (tuxTextView.getVisibility() != 0) {
                TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.bo6);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$f */
    static final class C32658f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77894a;

        static {
            Covode.recordClassIndex(39437);
        }

        C32658f(View$OnClickListenerC32647j jVar) {
            this.f77894a = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
            if (r1 != null) goto L_0x0046;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r10) {
            /*
            // Method dump skipped, instructions count: 137
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.View$OnClickListenerC32647j.C32658f.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$m */
    static final class C32665m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77901a;

        static {
            Covode.recordClassIndex(39444);
        }

        C32665m(View$OnClickListenerC32647j jVar) {
            this.f77901a = jVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C22291d dVar = (C22291d) obj;
            if (this.f77901a.mo58513e()) {
                C39162r.m79460a("set_up_proAccount", new C31376a().mo57399a("page", "Input Phone Captcha").mo57399a("method", "set_by_phone").mo57398a("duration", System.currentTimeMillis() - this.f77901a.f77723t).f75156a);
            }
            View$OnClickListenerC32647j jVar = this.f77901a;
            C22406a aVar = (C22406a) dVar.f52723j;
            C89219l.m154721d(jVar, "");
            ActivityC0945e activity = jVar.getActivity();
            if (activity != null) {
                C1210r<Bundle> rVar = ((ActionResultModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77691b;
                Bundle arguments = jVar.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                User f = C36085cj.m73552f();
                if (!(f == null || aVar == null)) {
                    C29345a aVar2 = aVar.f52971g.f53211b.get("mobile");
                    if (aVar2 != null) {
                        str = aVar2.f69628d;
                    } else {
                        str = "";
                    }
                    f.setPhoneBinded(true);
                    f.setBindPhone(str);
                    if (aVar.f52971g.f53210a > 0) {
                        C36085cj.f85262b.mo57069e().updateUserInfo(aVar.f52971g);
                    }
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    C22507a aVar3 = aVar.f52971g;
                    C89219l.m154716b(aVar3, "");
                    String jSONObject = aVar3.f53222m.toString();
                    C89219l.m154716b(jSONObject, "");
                    C36085cj.m73540a(7, 1, new C33917aq(str, jSONObject));
                }
                rVar.postValue(arguments);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0180  */
    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.View$OnClickListenerC32647j.onCreate(android.os.Bundle):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView.AbstractC32959a
    /* renamed from: a_ */
    public final void mo58199a_(String str) {
        boolean z;
        String str2;
        C89219l.m154721d(str, "");
        CodeInputView codeInputView = (CodeInputView) mo57434c(R.id.bo5);
        C89219l.m154716b(codeInputView, "");
        codeInputView.setEnabled(false);
        this.f77883z = false;
        m67197I();
        switch (C32679k.f77918d[mo58460Z_().ordinal()]) {
            case 1:
            case 2:
                if (mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
                    C32034f.C32036b bVar = this.f77862C;
                    if (bVar != null) {
                        str2 = bVar.getTicket();
                    } else {
                        str2 = null;
                    }
                    EnumC32592i A = mo58458A();
                    EnumC32594j Z_ = mo58460Z_();
                    C89219l.m154721d(this, "");
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(A, "");
                    C89219l.m154721d(Z_, "");
                    AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32456be(A, Z_, this, str2, str)).mo143251d(new C32407x.C32458bf(this)).mo143244b(C32407x.C32459bg.f77412a);
                    C89219l.m154716b(b, "");
                    C32555z.m67011a(this, b).mo143251d(new C32657e(this)).mo143246c();
                    return;
                }
                String str3 = this.f77869a;
                EnumC32592i A2 = mo58458A();
                EnumC32594j Z_2 = mo58460Z_();
                boolean z2 = this.f77874l;
                C89219l.m154721d(this, "");
                C89219l.m154721d(str3, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(A2, "");
                C89219l.m154721d(Z_2, "");
                if (A2 == EnumC32592i.SIGN_UP) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC88973n b2 = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32452bb(A2, this, Z_2, str3, str)).mo143251d(new C32407x.C32454bc(z, z2, this)).mo143244b(new C32407x.C32455bd(z, z2, this));
                C89219l.m154716b(b2, "");
                C32555z.m67011a(this, b2).mo143251d(new C32659g(this)).mo143246c();
                return;
            case 3:
                String str4 = this.f77876n;
                EnumC32592i A3 = mo58458A();
                EnumC32594j Z_3 = mo58460Z_();
                C89219l.m154721d(this, "");
                C89219l.m154721d(str4, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(A3, "");
                C89219l.m154721d(Z_3, "");
                AbstractC88973n b3 = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32518cx(this, A3, Z_3, str4, str)).mo143251d(new C32407x.C32520cy(this)).mo143244b(new C32407x.C32521cz(this));
                C89219l.m154716b(b3, "");
                C32555z.m67011a(this, b3).mo143251d(new C32660h(this)).mo143246c();
                return;
            case 4:
                C32407x.m66799a(this, this.f77869a, str, 4, (Map<String, String>) null, new C32661i(this)).mo143251d(new C32662j(this)).mo143246c();
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                C32407x.m66804a("forget_password", this, this.f77876n, str, 4, (Map<String, String>) null, new C32663k(this)).mo143251d(new C32664l(this)).mo143246c();
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                String str5 = this.f77869a;
                EnumC32592i A4 = mo58458A();
                EnumC32594j Z_4 = mo58460Z_();
                Bundle arguments = getArguments();
                if (arguments == null) {
                    C89219l.m154715b();
                }
                boolean z3 = arguments.getBoolean("from_changePwd", false);
                C89219l.m154721d(this, "");
                C89219l.m154721d(str5, "");
                C89219l.m154721d(A4, "");
                C89219l.m154721d(Z_4, "");
                C89219l.m154721d(str, "");
                AbstractC88973n b4 = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32522d(this, A4, Z_4, z3, str5, str)).mo143251d(new C32407x.C32524e(this, str5)).mo143244b(new C32407x.C32525f(this, str5));
                C89219l.m154716b(b4, "");
                C32555z.m67011a(this, b4).mo143251d(new C32665m(this)).mo143246c();
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                EnumC32592i A5 = mo58458A();
                EnumC32594j Z_5 = mo58460Z_();
                C89219l.m154721d(this, "");
                C89219l.m154721d(A5, "");
                C89219l.m154721d(Z_5, "");
                C89219l.m154721d(str, "");
                AbstractC88973n b5 = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32460bh(A5, Z_5, this, str, C32407x.m66785a(Z_5))).mo143251d(new C32407x.C32462bi(this)).mo143244b(new C32407x.C32463bj(this));
                C89219l.m154716b(b5, "");
                C32555z.m67011a(this, b5).mo143251d(new C32666n(this)).mo143246c();
                return;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                String str6 = this.f77869a;
                EnumC32592i A6 = mo58458A();
                EnumC32594j Z_6 = mo58460Z_();
                String str7 = this.f77860A;
                String str8 = this.f77861B;
                C89219l.m154721d(this, "");
                C89219l.m154721d(A6, "");
                C89219l.m154721d(Z_6, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(str7, "");
                C89219l.m154721d(str8, "");
                C0484a aVar = new C0484a();
                aVar.put("unusable_mobile_ticket", str8);
                AbstractC88973n b6 = AbstractC88973n.m154243a((AbstractC88976q) new C32407x.C32528h(A6, Z_6, this, str6, str, str7, aVar)).mo143251d(new C32407x.C32530i(this)).mo143244b(new C32407x.C32531j(this));
                C89219l.m154716b(b6, "");
                C32555z.m67011a(this, b6).mo143251d(new C32658f(this)).mo143246c();
                return;
            default:
                throw new IllegalStateException("Unknown step [" + mo58460Z_() + "] when trying to validate codes");
        }
    }

    public final void onClick(View view) {
        Integer num;
        C32308a aVar;
        String str;
        ClickAgent.onClick(view);
        String str2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        String str3 = "user_click";
        if (num != null) {
            if (num.intValue() == R.id.bo1) {
                if (mo58513e()) {
                    C39162r.onEventV3("resend_code_phone");
                }
                switch (C32679k.f77917c[mo58460Z_().ordinal()]) {
                    case 1:
                    case 2:
                        String str4 = "choose_dialog";
                        if (mo58458A() == EnumC32592i.RECOVER_ACCOUNT) {
                            C32034f.C32036b bVar = this.f77862C;
                            if (bVar != null) {
                                str = bVar.getTicket();
                            } else {
                                str = null;
                            }
                            EnumC32592i iVar = EnumC32592i.RECOVER_ACCOUNT;
                            EnumC32594j jVar = EnumC32594j.PHONE_SMS_LOGIN;
                            boolean z = this.f77875m;
                            if (!z) {
                                str3 = "auto_system";
                            }
                            if (!z) {
                                str4 = null;
                            }
                            C32407x.m66809b(this, str, iVar, jVar, "", str3, str4).mo143251d(new C32672t(this)).mo143246c();
                            return;
                        } else if (this.f77874l) {
                            C32407x.m66793a(this, this.f77869a, mo58458A(), mo58460Z_(), "resend", "").mo143251d(new C32673u(this)).mo143246c();
                            return;
                        } else {
                            String str5 = this.f77869a;
                            EnumC32592i A = mo58458A();
                            EnumC32594j Z_ = mo58460Z_();
                            if (!this.f77875m) {
                                str4 = null;
                            }
                            C32407x.m66795a(this, str5, A, Z_, "", "resend", str4, 128).mo143251d(new C32674v(this)).mo143246c();
                            return;
                        }
                    case 3:
                        String str6 = this.f77876n;
                        Bundle arguments = getArguments();
                        if (arguments != null) {
                            str2 = arguments.getString("password");
                        }
                        C32407x.m66788a(this, str6, 1, "resend", (Map) null, str2, 64).mo143251d(new C32675w(this)).mo143246c();
                        return;
                    case 4:
                        C32407x.m66797a(this, this.f77869a, mo58460Z_(), "resend").mo143251d(new C32676x(this)).mo143246c();
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        C32407x.m66788a(this, this.f77876n, 4, "resend", (Map) null, (String) null, 96).mo143251d(new C32677y(this)).mo143246c();
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        C32407x.m66794a(this, this.f77869a, mo58458A(), mo58460Z_(), this.f77860A, this.f77861B, "resend").mo143251d(new C32678z(this)).mo143246c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown step [" + mo58460Z_() + "] when trying to send codes");
                }
            } else if (num != null) {
                if (num.intValue() == R.id.bo6) {
                    if (this.f77871c && !TextUtils.isEmpty(this.f77869a)) {
                        TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(getActivity(), mo58517m(), mo58458A());
                        if (a == null || (aVar = a.f77750a) == null || !aVar.mo58388d()) {
                            this.f77882y = true;
                            C32407x.m66808b(this, this.f77869a, mo58458A(), mo58460Z_(), str3).mo143251d(new C32649aa(this)).mo143246c();
                            return;
                        }
                        m67198J();
                    }
                } else if (num.intValue() != R.id.bo3) {
                } else {
                    if (this.f77873e) {
                        C89233z.C89234a aVar2 = new C89233z.C89234a();
                        aVar2.element = false;
                        C89219l.m154721d("sms_verification", "");
                        C39162r.m79460a("login_procedure_jump_notify", new C33744d().mo59983a("platform", "sms_verification").f79943a);
                        C39110a aVar3 = new C39110a(getActivity());
                        aVar3.mo67871a(new String[]{getString(R.string.aok), getString(R.string.cyy)}, new DialogInterface$OnClickListenerC32650ab(this, aVar2));
                        DialogInterfaceC0216c a2 = aVar3.f92306a.mo453a();
                        a2.setOnDismissListener(new DialogInterface$OnDismissListenerC32651ac(aVar2));
                        C80273bt.m139145a(a2);
                        return;
                    }
                    mo58518n();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        if (!this.f77882y || i != 1206) {
            this.f77883z = true;
            CodeInputView codeInputView = (CodeInputView) mo57434c(R.id.bo5);
            C89219l.m154716b(codeInputView, "");
            codeInputView.setEnabled(true);
            ((CodeInputView) mo57434c(R.id.bo5)).mo58742c();
            ((InputResultIndicator) mo57434c(R.id.bny)).mo58482a(str);
            return;
        }
        this.f77882y = false;
        m67198J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$ab */
    public static final class DialogInterface$OnClickListenerC32650ab implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC32647j f77885a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f77886b;

        static {
            Covode.recordClassIndex(39429);
        }

        DialogInterface$OnClickListenerC32650ab(View$OnClickListenerC32647j jVar, C89233z.C89234a aVar) {
            this.f77885a = jVar;
            this.f77886b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 1) {
                this.f77886b.element = true;
                C31898a.m66241a("sms_verification", "log_in_with_password");
                this.f77885a.mo58518n();
            } else if (i == 0) {
                if (this.f77885a.getActivity() != null) {
                    this.f77886b.element = true;
                    C89219l.m154721d("sms_verification", "");
                    C39162r.m79460a("login_procedure_jump_confirm", new C33744d().mo59983a("platform", "sms_verification").f79943a);
                    C31898a.m66240a(this.f77885a, "sms_verification");
                } else {
                    return;
                }
            }
            dialogInterface.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C32308a aVar;
        long j;
        String str;
        String str2;
        C32308a aVar2;
        boolean z;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(getActivity(), m67196E(), mo58458A());
        this.f77878p = a;
        String str3 = null;
        if (a != null) {
            aVar = a.f77750a;
        } else {
            aVar = null;
        }
        this.f77879q = aVar;
        if (mo58460Z_() == EnumC32594j.PHONE_SMS_LOGIN && !this.f77880r) {
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.bo3);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            this.f77873e = false;
        }
        TimerTextView timerTextView = (TimerTextView) mo57434c(R.id.bo4);
        C32308a aVar3 = this.f77879q;
        if (aVar3 != null) {
            j = aVar3.mo58386b();
        } else {
            j = 60000;
        }
        timerTextView.mo58805a(j, "s");
        CodeInputView codeInputView = (CodeInputView) mo57434c(R.id.bo5);
        C89219l.m154716b(codeInputView, "");
        codeInputView.setEnabled(true);
        ((CodeInputView) mo57434c(R.id.bo5)).mo58738a();
        ((CodeInputView) mo57434c(R.id.bo5)).mo58740b();
        ((CodeInputView) mo57434c(R.id.bo5)).setCallback(this);
        ((CodeInputView) mo57434c(R.id.bo5)).setInputLength(this.f77877o);
        C17235c.m31810a(mo57434c(R.id.bo1), 0.5f);
        C17235c.m31810a(mo57434c(R.id.bo3), 0.5f);
        mo58495a(mo57434c(R.id.bo1), this);
        String string = getString(R.string.aqk);
        C89219l.m154716b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.aqn, string));
        TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.bo6);
        C89219l.m154716b(tuxTextView2, "");
        spannableStringBuilder.setSpan(new C32670r(this, C0643b.m2378c(tuxTextView2.getContext(), R.color.bh), getResources().getColor(R.color.bh)), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 34);
        TuxTextView tuxTextView3 = (TuxTextView) mo57434c(R.id.bo6);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(spannableStringBuilder);
        TuxTextView tuxTextView4 = (TuxTextView) mo57434c(R.id.bo6);
        C89219l.m154716b(tuxTextView4, "");
        tuxTextView4.setMovementMethod(C33064a.m67722a());
        ((TuxTextView) mo57434c(R.id.bo3)).setOnClickListener(this);
        if (!(mo58460Z_() == EnumC32594j.EMAIL_SMS_SIGN_UP || mo58460Z_() == EnumC32594j.EMAIL_SMS_FIND_PASSWORD)) {
            C31915f fVar = this.f77881s;
            if (fVar == null) {
                C89219l.m154715b();
            }
            C1213t<String> tVar = fVar.f76255b;
            C89219l.m154716b(tVar, "");
            String value = tVar.getValue();
            if (!TextUtils.isEmpty(value)) {
                ((CodeInputView) mo57434c(R.id.bo5)).setTextAndAutoCheck(value);
                C31915f fVar2 = this.f77881s;
                if (fVar2 == null) {
                    C89219l.m154715b();
                }
                C1213t<String> tVar2 = fVar2.f76255b;
                C89219l.m154716b(tVar2, "");
                tVar2.setValue("");
                mo58519o();
            } else {
                C31915f fVar3 = this.f77881s;
                if (fVar3 == null) {
                    C89219l.m154715b();
                }
                fVar3.f76255b.observe(this, new C32667o(this));
            }
        }
        if (mo58460Z_() != EnumC32594j.PHONE_SMS_VERIFY) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.getBoolean("code_sent");
            }
            Bundle arguments2 = getArguments();
            if (arguments2 == null || !arguments2.getBoolean("code_sent")) {
                if (!(this.f77879q == null || !C32648a.m67220a().containsKey(this.f77869a) || C32648a.m67220a().get(this.f77869a) == null)) {
                    Boolean bool = C32648a.m67220a().get(this.f77869a);
                    if (bool == null) {
                        C89219l.m154715b();
                    }
                    this.f77871c = bool.booleanValue();
                    C32308a aVar4 = this.f77879q;
                    if (aVar4 == null) {
                        C89219l.m154715b();
                    }
                    mo58511a(aVar4.mo58386b());
                }
                C32308a aVar5 = this.f77879q;
                if (aVar5 == null || !aVar5.mo58388d()) {
                    mo58515k();
                } else {
                    ((TimerTextView) mo57434c(R.id.bo4)).setCallback(this.f77867H);
                    TimerTextView timerTextView2 = (TimerTextView) mo57434c(R.id.bo4);
                    C32308a aVar6 = this.f77879q;
                    if (aVar6 == null) {
                        C89219l.m154715b();
                    }
                    timerTextView2.mo58806a(aVar6);
                    mo58514i();
                }
            } else {
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    arguments3.remove("code_sent");
                }
                mo58516l();
                if ((mo58460Z_() == EnumC32594j.PHONE_SMS_SIGN_UP || mo58460Z_() == EnumC32594j.PHONE_SMS_LOGIN) && mo58458A() != EnumC32592i.RECOVER_ACCOUNT) {
                    z = true;
                } else {
                    z = false;
                }
                if (!TextUtils.isEmpty(this.f77869a) && z) {
                    if (!C32648a.m67220a().containsKey(this.f77869a) || C32648a.m67220a().get(this.f77869a) == null) {
                        C32833d.m67400a(this.f77869a, new C32655c(this));
                    } else {
                        Boolean bool2 = C32648a.m67220a().get(this.f77869a);
                        if (bool2 == null) {
                            C89219l.m154715b();
                        }
                        this.f77871c = bool2.booleanValue();
                    }
                }
            }
        } else {
            C32308a aVar7 = this.f77879q;
            if (aVar7 == null) {
                TimerTextView timerTextView3 = (TimerTextView) mo57434c(R.id.bo4);
                C89219l.m154716b(timerTextView3, "");
                timerTextView3.setVisibility(8);
                C32407x.m66794a(this, "", mo58458A(), mo58460Z_(), "", this.f77861B, "user_click").mo143251d(new C32668p(this)).mo143246c();
            } else if (aVar7.mo58388d()) {
                ((TimerTextView) mo57434c(R.id.bo4)).setCallback(this.f77867H);
                TimerTextView timerTextView4 = (TimerTextView) mo57434c(R.id.bo4);
                C32308a aVar8 = this.f77879q;
                if (aVar8 == null) {
                    C89219l.m154715b();
                }
                timerTextView4.mo58806a(aVar8);
                mo58514i();
            } else {
                C32308a aVar9 = this.f77879q;
                if (aVar9 == null) {
                    C89219l.m154715b();
                }
                if (aVar9.mo58387c()) {
                    mo58515k();
                }
            }
        }
        if (mo58458A() == EnumC32592i.RECOVER_ACCOUNT && mo58460Z_() == EnumC32594j.PHONE_SMS_LOGIN) {
            TimerHolder.C32597b a2 = TimerHolder.C32596a.m67088a(getActivity(), m67196E(), mo58458A());
            if (a2 == null || (aVar2 = a2.f77750a) == null || !aVar2.mo58388d()) {
                CodeInputView codeInputView2 = (CodeInputView) mo57434c(R.id.bo5);
                C89219l.m154716b(codeInputView2, "");
                codeInputView2.setEnabled(false);
                TimerTextView timerTextView5 = (TimerTextView) mo57434c(R.id.bo4);
                C89219l.m154716b(timerTextView5, "");
                timerTextView5.setVisibility(8);
                C32034f.C32036b bVar = this.f77862C;
                if (bVar != null) {
                    str = bVar.getTicket();
                } else {
                    str = null;
                }
                EnumC32592i iVar = EnumC32592i.RECOVER_ACCOUNT;
                EnumC32594j jVar = EnumC32594j.PHONE_SMS_LOGIN;
                boolean z2 = this.f77875m;
                if (z2) {
                    str2 = "user_click";
                } else {
                    str2 = "auto_system";
                }
                if (z2) {
                    str3 = "choose_dialog";
                }
                C32407x.m66809b(this, str, iVar, jVar, "", str2, str3).mo143251d(new C32669q(this)).mo143246c();
            }
        }
    }

    /* renamed from: a */
    public final void mo58512a(String str, boolean z, int i) {
        String str2;
        C31376a a = new C31376a().mo57399a("enter_from", "forgot_password").mo57399a("enter_method", mo58467x()).mo57399a("platform", str);
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        C39162r.m79460a("forgot_pw_code_submit", a.mo57399a("status", str2).mo57397a("error_code", i).mo57398a("duration", System.currentTimeMillis() - this.f77723t).f75156a);
    }
}
