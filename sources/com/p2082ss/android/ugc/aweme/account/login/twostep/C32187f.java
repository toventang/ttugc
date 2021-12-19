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

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.f */
public final class C32187f extends C32232n implements CodeInputView.AbstractC32959a {

    /* renamed from: f */
    public static final boolean f76823f = false;

    /* renamed from: g */
    public static final C32188a f76824g = new C32188a((byte) 0);

    /* renamed from: a */
    public TimerTextView f76825a;

    /* renamed from: b */
    public CodeInputView f76826b;

    /* renamed from: c */
    public TextView f76827c;

    /* renamed from: d */
    public View f76828d;

    /* renamed from: e */
    public boolean f76829e;

    /* renamed from: m */
    private LoadingCircleView f76830m;

    /* renamed from: n */
    private TextView f76831n;

    /* renamed from: o */
    private View f76832o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.f$a */
    public static final class C32188a {
        static {
            Covode.recordClassIndex(38953);
        }

        private C32188a() {
        }

        public /* synthetic */ C32188a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.f$c */
    public static final class C32190c extends C32308a.C32310b {

        /* renamed from: a */
        final /* synthetic */ C32187f f76834a;

        static {
            Covode.recordClassIndex(38955);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.C32310b, com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: a */
        public final void mo58205a() {
            C32187f.m66548a(this.f76834a).setVisibility(0);
            C32187f.m66549b(this.f76834a).setEnabled(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.C32310b, com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a.AbstractC32309a
        /* renamed from: b */
        public final void mo58206b() {
            C32187f.m66548a(this.f76834a).setVisibility(8);
            C32187f.m66549b(this.f76834a).setEnabled(true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32190c(C32187f fVar) {
            this.f76834a = fVar;
        }
    }

    static {
        Covode.recordClassIndex(38952);
    }

    /* renamed from: e */
    private final void m66551e() {
        View view = this.f76832o;
        if (view == null) {
            C89219l.m154710a("errorLayout");
        }
        view.setVisibility(8);
        CodeInputView codeInputView = this.f76826b;
        if (codeInputView == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView.mo58743d();
    }

    /* renamed from: b */
    public final void mo58200b() {
        TwoStepAuthApi.m66501a().sendEmailCode(this.f76909j, 6).mo5534a(new C32193f(this), C1731i.f5564c, null);
    }

    /* renamed from: c */
    public final void mo58202c() {
        LoadingCircleView loadingCircleView = this.f76830m;
        if (loadingCircleView == null) {
            C89219l.m154710a("loadingView");
        }
        loadingCircleView.mo58784b();
        LoadingCircleView loadingCircleView2 = this.f76830m;
        if (loadingCircleView2 == null) {
            C89219l.m154710a("loadingView");
        }
        loadingCircleView2.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.f$b */
    static final class RunnableC32189b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C32187f f76833a;

        static {
            Covode.recordClassIndex(38954);
        }

        RunnableC32189b(C32187f fVar) {
            this.f76833a = fVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f76833a.f76907h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C32187f fVar = this.f76833a;
            String a = C13616g.m24464a(jSONObject, "verify_ticket", "");
            C89219l.m154716b(a, "");
            fVar.mo58248d(a);
            if (!TextUtils.isEmpty(this.f76833a.f76909j)) {
                this.f76833a.mo58200b();
            } else {
                this.f76833a.mo58198a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n
    /* renamed from: a */
    public final View mo58188a() {
        MethodCollector.m26663i(10442);
        if (this.f76910k.getLayoutResource() <= 0) {
            this.f76910k.setLayoutResource(R.layout.gx);
        }
        View inflate = this.f76910k.inflate();
        C89219l.m154716b(inflate, "");
        View findViewById = inflate.findViewById(R.id.atw);
        C89219l.m154716b(findViewById, "");
        this.f76830m = (LoadingCircleView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.ats);
        C89219l.m154716b(findViewById2, "");
        this.f76827c = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.atv);
        C89219l.m154716b(findViewById3, "");
        this.f76826b = (CodeInputView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.atx);
        C89219l.m154716b(findViewById4, "");
        this.f76828d = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.aty);
        C89219l.m154716b(findViewById5, "");
        this.f76825a = (TimerTextView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.att);
        C89219l.m154716b(findViewById6, "");
        this.f76832o = findViewById6;
        View findViewById7 = inflate.findViewById(R.id.atu);
        C89219l.m154716b(findViewById7, "");
        this.f76831n = (TextView) findViewById7;
        TimerTextView timerTextView = this.f76825a;
        if (timerTextView == null) {
            C89219l.m154710a("timerText");
        }
        timerTextView.mo58807a("s");
        TimerTextView timerTextView2 = this.f76825a;
        if (timerTextView2 == null) {
            C89219l.m154710a("timerText");
        }
        timerTextView2.setCallback(new C32190c(this));
        View view = this.f76828d;
        if (view == null) {
            C89219l.m154710a("resendCodeBtn");
        }
        view.setEnabled(false);
        View view2 = this.f76828d;
        if (view2 == null) {
            C89219l.m154710a("resendCodeBtn");
        }
        view2.setOnClickListener(new View$OnClickListenerC32191d(this));
        CodeInputView codeInputView = this.f76826b;
        if (codeInputView == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView.setEnabled(false);
        CodeInputView codeInputView2 = this.f76826b;
        if (codeInputView2 == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView2.mo58738a();
        CodeInputView codeInputView3 = this.f76826b;
        if (codeInputView3 == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView3.mo58740b();
        CodeInputView codeInputView4 = this.f76826b;
        if (codeInputView4 == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView4.setCallback(this);
        CodeInputView codeInputView5 = this.f76826b;
        if (codeInputView5 == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView5.setInputLength(6);
        if (this.f76907h == null) {
            mo58198a(null, "JSON is empty");
        } else {
            C80214ai.m139042a(new RunnableC32189b(this), "BoltsUtils");
        }
        MethodCollector.m26664o(10442);
        return inflate;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.f$d */
    static final class View$OnClickListenerC32191d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32187f f76835a;

        static {
            Covode.recordClassIndex(38956);
        }

        View$OnClickListenerC32191d(C32187f fVar) {
            this.f76835a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76835a.mo58200b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TimerTextView m66548a(C32187f fVar) {
        TimerTextView timerTextView = fVar.f76825a;
        if (timerTextView == null) {
            C89219l.m154710a("timerText");
        }
        return timerTextView;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m66549b(C32187f fVar) {
        View view = fVar.f76828d;
        if (view == null) {
            C89219l.m154710a("resendCodeBtn");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m66550c(C32187f fVar) {
        TextView textView = fVar.f76827c;
        if (textView == null) {
            C89219l.m154710a("descriptionText");
        }
        return textView;
    }

    /* renamed from: f */
    private final void m66552f(String str) {
        View view = this.f76832o;
        if (view == null) {
            C89219l.m154710a("errorLayout");
        }
        view.setVisibility(0);
        TextView textView = this.f76831n;
        if (textView == null) {
            C89219l.m154710a("errorText");
        }
        textView.setText(str);
        CodeInputView codeInputView = this.f76826b;
        if (codeInputView == null) {
            C89219l.m154710a("codeInputView");
        }
        codeInputView.mo58742c();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView.AbstractC32959a
    /* renamed from: b */
    public final void mo58201b(String str) {
        C89219l.m154721d(str, "");
        if (this.f76829e) {
            CodeInputView codeInputView = this.f76826b;
            if (codeInputView == null) {
                C89219l.m154710a("codeInputView");
            }
            codeInputView.setText("");
            this.f76829e = false;
        }
        m66551e();
    }

    /* renamed from: c */
    public final void mo58203c(String str) {
        mo58202c();
        m66551e();
        mo58249e(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.f$e */
    static final class C32192e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C32187f f76836a;

        static {
            Covode.recordClassIndex(38957);
        }

        C32192e(C32187f fVar) {
            this.f76836a = fVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<TwoStepAuthApi.C32120c> iVar) {
            Integer num;
            String str;
            if (!C80214ai.m139043a(iVar)) {
                this.f76836a.f76829e = true;
                this.f76836a.mo58198a(null, "TwoStepAuthApi.verifyEmailCode bolts Task error");
                return null;
            }
            C89219l.m154716b(iVar, "");
            TwoStepAuthApi.C32120c d = iVar.mo5545d();
            if (!C89361p.m154872a("success", d.f76647a, true) || d.f76648b == null || TextUtils.isEmpty(d.f76648b.f76649a)) {
                this.f76836a.f76829e = true;
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
                this.f76836a.mo58198a(num, str);
                return null;
            }
            this.f76836a.mo58203c(d.f76648b.f76649a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.CodeInputView.AbstractC32959a
    /* renamed from: a_ */
    public final void mo58199a_(String str) {
        C89219l.m154721d(str, "");
        this.f76829e = false;
        LoadingCircleView loadingCircleView = this.f76830m;
        if (loadingCircleView == null) {
            C89219l.m154710a("loadingView");
        }
        loadingCircleView.setVisibility(0);
        LoadingCircleView loadingCircleView2 = this.f76830m;
        if (loadingCircleView2 == null) {
            C89219l.m154710a("loadingView");
        }
        loadingCircleView2.mo58783a();
        m66551e();
        String str2 = this.f76909j;
        C89219l.m154721d(str, "");
        TwoStepAuthApi.Api a = TwoStepAuthApi.m66501a();
        String a2 = C33036f.m67670a(null);
        C89219l.m154716b(a2, "");
        String a3 = C33036f.m67670a(str);
        C89219l.m154716b(a3, "");
        a.verifyEmailCode(1, a2, a3, 6, str2).mo5534a(new C32192e(this), C1731i.f5564c, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.f$f */
    public static final class C32193f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C32187f f76837a;

        static {
            Covode.recordClassIndex(38958);
        }

        C32193f(C32187f fVar) {
            this.f76837a = fVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<TwoStepAuthApi.C32116a> iVar) {
            Integer num;
            String str;
            String str2;
            String str3 = null;
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                if (!C89361p.m154872a("error", iVar.mo5545d().f76633a, true)) {
                    if (TextUtils.isEmpty(C32187f.m66550c(this.f76837a).getText())) {
                        TextView c = C32187f.m66550c(this.f76837a);
                        Locale locale = Locale.US;
                        ActivityC0218d d = this.f76837a.mo58247d();
                        if (d == null) {
                            C89219l.m154715b();
                        }
                        String string = d.getString(R.string.arb);
                        C89219l.m154716b(string, "");
                        Object[] objArr = new Object[1];
                        TwoStepAuthApi.C32116a.C32117a aVar = iVar.mo5545d().f76634b;
                        if (aVar != null) {
                            str3 = aVar.f76635a;
                        }
                        objArr[0] = str3;
                        String a = C1764a.m5929a(locale, string, Arrays.copyOf(objArr, 1));
                        C89219l.m154716b(a, "");
                        c.setText(a);
                    }
                    CodeInputView codeInputView = this.f76837a.f76826b;
                    if (codeInputView == null) {
                        C89219l.m154710a("codeInputView");
                    }
                    codeInputView.setEnabled(true);
                    C32187f.m66549b(this.f76837a).setEnabled(false);
                    this.f76837a.mo58202c();
                    return C32187f.m66548a(this.f76837a).mo58808c();
                }
            }
            if (C32187f.f76823f) {
                C89219l.m154716b(iVar, "");
                if (iVar.mo5546e() == null) {
                    TwoStepAuthApi.C32116a.C32117a aVar2 = iVar.mo5545d().f76634b;
                    if (aVar2 != null) {
                        str2 = aVar2.f76637c;
                    } else {
                        str2 = null;
                    }
                    new Exception(str2);
                }
            }
            C32187f fVar = this.f76837a;
            C89219l.m154716b(iVar, "");
            TwoStepAuthApi.C32116a.C32117a aVar3 = iVar.mo5545d().f76634b;
            if (aVar3 != null) {
                num = aVar3.f76638d;
            } else {
                num = null;
            }
            Exception e = iVar.mo5546e();
            if (e == null || (str = e.getMessage()) == null) {
                TwoStepAuthApi.C32116a.C32117a aVar4 = iVar.mo5545d().f76634b;
                if (aVar4 != null) {
                    str = aVar4.f76637c;
                } else {
                    str = null;
                }
            }
            fVar.mo58198a(num, str);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo58198a(Integer num, String str) {
        mo58202c();
        m66552f(mo58246b(num, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32187f(ActivityC0218d dVar, ViewStub viewStub, C32232n.AbstractC32233a aVar) {
        super(dVar, viewStub, aVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(viewStub, "");
        C89219l.m154721d(aVar, "");
    }
}
