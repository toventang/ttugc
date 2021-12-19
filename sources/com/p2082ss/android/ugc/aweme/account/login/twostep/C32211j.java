package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13616g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.account.experiment.C31663o;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingCircleView;
import com.p2082ss.android.ugc.aweme.account.p2280ui.TimerTextView;
import com.p2082ss.android.ugc.aweme.account.util.C33036f;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.j */
public final class C32211j extends C32232n implements CodeInputView.AbstractC32959a {

    /* renamed from: f */
    public static final boolean f76866f = false;

    /* renamed from: g */
    public static final C32212a f76867g = new C32212a((byte) 0);

    /* renamed from: a */
    public TimerTextView f76868a;

    /* renamed from: b */
    public CodeInputView f76869b;

    /* renamed from: c */
    public TextView f76870c;

    /* renamed from: d */
    public View f76871d;

    /* renamed from: e */
    public boolean f76872e;

    /* renamed from: m */
    private LoadingCircleView f76873m;

    /* renamed from: n */
    private TextView f76874n;

    /* renamed from: o */
    private View f76875o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.j$a */
    public static final class C32212a {
        static {
            Covode.recordClassIndex(38977);
        }

        private C32212a() {
        }

        public /* synthetic */ C32212a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.j$c */
    public static final class C32214c extends C32308a.C32310b {

        /* renamed from: a */
        final /* synthetic */ C32211j f76877a;

        static {
            Covode.recordClassIndex(38979);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.C32310b, com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: a */
        public final void mo58205a() {
            C32211j.m66576a(this.f76877a).setVisibility(0);
            C32211j.m66577b(this.f76877a).setEnabled(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.C32310b, com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: b */
        public final void mo58206b() {
            C32211j.m66576a(this.f76877a).setVisibility(8);
            C32211j.m66577b(this.f76877a).setEnabled(true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32214c(C32211j jVar) {
            this.f76877a = jVar;
        }
    }

    static {
        Covode.recordClassIndex(38976);
    }

    /* renamed from: e */
    private final void m66579e() {
        View view = this.f76875o;
        if (view == null) {
            C89219l.m154710a("errorLayout");
        }
        view.setVisibility(8);
        CodeInputView codeInputView = this.f76869b;
        if (codeInputView == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView.mo58743d();
    }

    /* renamed from: c */
    public final void mo58230c() {
        LoadingCircleView loadingCircleView = this.f76873m;
        if (loadingCircleView == null) {
            C89219l.m154710a("loadingView");
        }
        loadingCircleView.mo58784b();
        LoadingCircleView loadingCircleView2 = this.f76873m;
        if (loadingCircleView2 == null) {
            C89219l.m154710a("loadingView");
        }
        loadingCircleView2.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.j$b */
    static final class RunnableC32213b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C32211j f76876a;

        static {
            Covode.recordClassIndex(38978);
        }

        RunnableC32213b(C32211j jVar) {
            this.f76876a = jVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f76876a.f76907h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C32211j jVar = this.f76876a;
            String a = C13616g.m24464a(jSONObject, "verify_ticket", "");
            C89219l.m154716b(a, "");
            jVar.mo58248d(a);
            if (!TextUtils.isEmpty(this.f76876a.f76909j)) {
                this.f76876a.mo58229b();
            } else {
                this.f76876a.mo58228a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    /* renamed from: b */
    public final void mo58229b() {
        TwoStepAuthApi.m66501a().sendSmsCode(this.f76909j, Integer.valueOf(C31663o.m65975a() ? 1 : 0), 22).mo5534a(new C32217f(this), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n
    /* renamed from: a */
    public final View mo58188a() {
        int i;
        int i2;
        MethodCollector.m26663i(9728);
        if (this.f76910k.getLayoutResource() <= 0) {
            this.f76910k.setLayoutResource(R.layout.gz);
        }
        View inflate = this.f76910k.inflate();
        C89219l.m154716b(inflate, "");
        View findViewById = inflate.findViewById(R.id.e3k);
        C89219l.m154716b(findViewById, "");
        this.f76873m = (LoadingCircleView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.e3g);
        C89219l.m154716b(findViewById2, "");
        this.f76870c = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.e3j);
        C89219l.m154716b(findViewById3, "");
        this.f76869b = (CodeInputView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.e3l);
        C89219l.m154716b(findViewById4, "");
        this.f76871d = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.e3m);
        C89219l.m154716b(findViewById5, "");
        this.f76868a = (TimerTextView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.e3h);
        C89219l.m154716b(findViewById6, "");
        this.f76875o = findViewById6;
        View findViewById7 = inflate.findViewById(R.id.e3i);
        C89219l.m154716b(findViewById7, "");
        this.f76874n = (TextView) findViewById7;
        TextView textView = (TextView) inflate.findViewById(R.id.e3n);
        if (C31663o.m65975a()) {
            i = R.string.aqj;
        } else {
            i = R.string.cz3;
        }
        textView.setText(i);
        TimerTextView timerTextView = this.f76868a;
        if (timerTextView == null) {
            C89219l.m154710a("timerText");
        }
        timerTextView.mo58807a("s");
        TimerTextView timerTextView2 = this.f76868a;
        if (timerTextView2 == null) {
            C89219l.m154710a("timerText");
        }
        timerTextView2.setCallback(new C32214c(this));
        View view = this.f76871d;
        if (view == null) {
            C89219l.m154710a("resendCodeBtn");
        }
        view.setEnabled(false);
        View view2 = this.f76871d;
        if (view2 == null) {
            C89219l.m154710a("resendCodeBtn");
        }
        view2.setOnClickListener(new View$OnClickListenerC32215d(this));
        CodeInputView codeInputView = this.f76869b;
        if (codeInputView == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView.setEnabled(false);
        CodeInputView codeInputView2 = this.f76869b;
        if (codeInputView2 == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView2.mo58738a();
        CodeInputView codeInputView3 = this.f76869b;
        if (codeInputView3 == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView3.mo58740b();
        CodeInputView codeInputView4 = this.f76869b;
        if (codeInputView4 == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView4.setCallback(this);
        CodeInputView codeInputView5 = this.f76869b;
        if (codeInputView5 == null) {
            C89219l.m154710a("codeInputView");
        }
        if (C31663o.m65975a()) {
            i2 = 6;
        } else {
            i2 = 4;
        }
        codeInputView5.setInputLength(i2);
        if (this.f76907h == null) {
            mo58228a(null, "JSON is empty");
        } else {
            C80214ai.m139042a(new RunnableC32213b(this), "BoltsUtils");
        }
        MethodCollector.m26664o(9728);
        return inflate;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.j$d */
    static final class View$OnClickListenerC32215d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32211j f76878a;

        static {
            Covode.recordClassIndex(38980);
        }

        View$OnClickListenerC32215d(C32211j jVar) {
            this.f76878a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76878a.mo58229b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TimerTextView m66576a(C32211j jVar) {
        TimerTextView timerTextView = jVar.f76868a;
        if (timerTextView == null) {
            C89219l.m154710a("timerText");
        }
        return timerTextView;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m66577b(C32211j jVar) {
        View view = jVar.f76871d;
        if (view == null) {
            C89219l.m154710a("resendCodeBtn");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m66578c(C32211j jVar) {
        TextView textView = jVar.f76870c;
        if (textView == null) {
            C89219l.m154710a("descriptionText");
        }
        return textView;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView.AbstractC32959a
    /* renamed from: b */
    public final void mo58201b(String str) {
        C89219l.m154721d(str, "");
        if (this.f76872e) {
            CodeInputView codeInputView = this.f76869b;
            if (codeInputView == null) {
                C89219l.m154710a("codeInputView");
            }
            codeInputView.setText("");
            this.f76872e = false;
        }
        m66579e();
    }

    /* renamed from: f */
    private final void m66580f(String str) {
        View view = this.f76875o;
        if (view == null) {
            C89219l.m154710a("errorLayout");
        }
        view.setVisibility(0);
        TextView textView = this.f76874n;
        if (textView == null) {
            C89219l.m154710a("errorText");
        }
        textView.setText(str);
        CodeInputView codeInputView = this.f76869b;
        if (codeInputView == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView.mo58742c();
    }

    /* renamed from: c */
    public final void mo58231c(String str) {
        mo58230c();
        m66579e();
        mo58249e(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.j$e */
    static final class C32216e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C32211j f76879a;

        static {
            Covode.recordClassIndex(38981);
        }

        C32216e(C32211j jVar) {
            this.f76879a = jVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<TwoStepAuthApi.C32120c> iVar) {
            Integer num;
            String str;
            if (!C80214ai.m139043a(iVar)) {
                this.f76879a.f76872e = true;
                this.f76879a.mo58228a(null, "TwoStepAuthApi.verifySmsCode bolts Task error");
                return null;
            }
            C89219l.m154716b(iVar, "");
            TwoStepAuthApi.C32120c d = iVar.mo5545d();
            if (!C89361p.m154872a("success", d.f76647a, true) || d.f76648b == null || TextUtils.isEmpty(d.f76648b.f76649a)) {
                this.f76879a.f76872e = true;
                TwoStepAuthApi.C32120c.C32121a aVar = d.f76648b;
                if (aVar != null) {
                    num = aVar.f76651c;
                } else {
                    num = null;
                }
                TwoStepAuthApi.C32120c.C32121a aVar2 = d.f76648b;
                if (aVar2 != null) {
                    str = aVar2.f76652d;
                } else {
                    str = null;
                }
                this.f76879a.mo58228a(num, str);
                return null;
            }
            this.f76879a.mo58231c(d.f76648b.f76649a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView.AbstractC32959a
    /* renamed from: a_ */
    public final void mo58199a_(String str) {
        C89219l.m154721d(str, "");
        this.f76872e = false;
        LoadingCircleView loadingCircleView = this.f76873m;
        if (loadingCircleView == null) {
            C89219l.m154710a("loadingView");
        }
        loadingCircleView.setVisibility(0);
        LoadingCircleView loadingCircleView2 = this.f76873m;
        if (loadingCircleView2 == null) {
            C89219l.m154710a("loadingView");
        }
        loadingCircleView2.mo58783a();
        m66579e();
        String str2 = this.f76909j;
        C89219l.m154721d(str, "");
        TwoStepAuthApi.Api a = TwoStepAuthApi.m66501a();
        String a2 = C33036f.m67670a(null);
        String a3 = C33036f.m67670a(str);
        C89219l.m154716b(a3, "");
        a.verifySmsCode(1, a2, a3, 22, str2).mo5534a(new C32216e(this), C1731i.f5564c, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.j$f */
    public static final class C32217f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C32211j f76880a;

        static {
            Covode.recordClassIndex(38982);
        }

        C32217f(C32211j jVar) {
            this.f76880a = jVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<TwoStepAuthApi.C32118b> iVar) {
            Integer num;
            String str;
            String str2;
            String str3 = null;
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                if (!C89361p.m154872a("error", iVar.mo5545d().f76639a, true)) {
                    if (TextUtils.isEmpty(C32211j.m66578c(this.f76880a).getText())) {
                        TextView c = C32211j.m66578c(this.f76880a);
                        Locale locale = Locale.US;
                        ActivityC0218d d = this.f76880a.mo58247d();
                        if (d == null) {
                            C89219l.m154715b();
                        }
                        String string = d.getString(R.string.ari);
                        C89219l.m154716b(string, "");
                        Object[] objArr = new Object[1];
                        TwoStepAuthApi.C32118b.C32119a aVar = iVar.mo5545d().f76640b;
                        if (aVar != null) {
                            str3 = aVar.f76641a;
                        }
                        objArr[0] = str3;
                        String a = C1764a.m5929a(locale, string, Arrays.copyOf(objArr, 1));
                        C89219l.m154716b(a, "");
                        c.setText(a);
                    }
                    CodeInputView codeInputView = this.f76880a.f76869b;
                    if (codeInputView == null) {
                        C89219l.m154710a("codeInputView");
                    }
                    codeInputView.setEnabled(true);
                    C32211j.m66577b(this.f76880a).setEnabled(false);
                    this.f76880a.mo58230c();
                    return C32211j.m66576a(this.f76880a).mo58808c();
                }
            }
            if (C32211j.f76866f) {
                C89219l.m154716b(iVar, "");
                if (iVar.mo5546e() == null) {
                    TwoStepAuthApi.C32118b.C32119a aVar2 = iVar.mo5545d().f76640b;
                    if (aVar2 != null) {
                        str2 = aVar2.f76644d;
                    } else {
                        str2 = null;
                    }
                    new Exception(str2);
                }
            }
            C32211j jVar = this.f76880a;
            C89219l.m154716b(iVar, "");
            TwoStepAuthApi.C32118b.C32119a aVar3 = iVar.mo5545d().f76640b;
            if (aVar3 != null) {
                num = aVar3.f76645e;
            } else {
                num = null;
            }
            Exception e = iVar.mo5546e();
            if (e == null || (str = e.getMessage()) == null) {
                TwoStepAuthApi.C32118b.C32119a aVar4 = iVar.mo5545d().f76640b;
                if (aVar4 != null) {
                    str = aVar4.f76644d;
                } else {
                    str = null;
                }
            }
            jVar.mo58228a(num, str);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo58228a(Integer num, String str) {
        mo58230c();
        m66580f(mo58246b(num, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32211j(ActivityC0218d dVar, ViewStub viewStub, C32232n.AbstractC32233a aVar) {
        super(dVar, viewStub, aVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(viewStub, "");
        C89219l.m154721d(aVar, "");
    }
}
