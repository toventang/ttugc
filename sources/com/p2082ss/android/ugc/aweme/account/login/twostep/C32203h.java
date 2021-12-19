package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13616g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.util.C33036f;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.h */
public final class C32203h extends C32232n {

    /* renamed from: b */
    public static final boolean f76851b = false;

    /* renamed from: c */
    public static final C32204a f76852c = new C32204a((byte) 0);

    /* renamed from: a */
    public LoadingButton f76853a;

    /* renamed from: d */
    private InputWithIndicator f76854d;

    /* renamed from: e */
    private InputResultIndicator f76855e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.h$a */
    public static final class C32204a {
        static {
            Covode.recordClassIndex(38969);
        }

        private C32204a() {
        }

        public /* synthetic */ C32204a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(38968);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.h$b */
    static final class RunnableC32205b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C32203h f76856a;

        static {
            Covode.recordClassIndex(38970);
        }

        RunnableC32205b(C32203h hVar) {
            this.f76856a = hVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f76856a.f76907h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C32203h hVar = this.f76856a;
            String a = C13616g.m24464a(jSONObject, "verify_ticket", "");
            C89219l.m154716b(a, "");
            hVar.mo58248d(a);
            if (TextUtils.isEmpty(this.f76856a.f76909j)) {
                this.f76856a.mo58216a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    /* renamed from: b */
    public final void mo58218b() {
        boolean z;
        InputWithIndicator inputWithIndicator = this.f76854d;
        if (inputWithIndicator == null) {
            C89219l.m154710a("passwordInput");
        }
        String text = inputWithIndicator.getText();
        if (text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ActivityC0218d d = mo58247d();
            if (d == null) {
                C89219l.m154715b();
            }
            String string = d.getString(R.string.boo);
            C89219l.m154716b(string, "");
            m66568b(string);
            return;
        }
        LoadingButton loadingButton = this.f76853a;
        if (loadingButton == null) {
            C89219l.m154710a("loadingButton");
        }
        loadingButton.mo58776a(true);
        String str = this.f76909j;
        C89219l.m154721d(text, "");
        C89219l.m154721d(str, "");
        TwoStepAuthApi.Api a = TwoStepAuthApi.m66501a();
        String a2 = C33036f.m67670a(text);
        C89219l.m154716b(a2, "");
        a.verifyPassword(null, null, null, a2, 1, str).mo5534a(new C32208e(this), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n
    /* renamed from: a */
    public final View mo58188a() {
        MethodCollector.m26663i(10455);
        if (this.f76910k.getLayoutResource() <= 0) {
            this.f76910k.setLayoutResource(R.layout.gy);
        }
        View inflate = this.f76910k.inflate();
        C89219l.m154716b(inflate, "");
        View findViewById = inflate.findViewById(R.id.cz9);
        C89219l.m154716b(findViewById, "");
        this.f76853a = (LoadingButton) findViewById;
        View findViewById2 = inflate.findViewById(R.id.cza);
        C89219l.m154716b(findViewById2, "");
        this.f76854d = (InputWithIndicator) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.czb);
        C89219l.m154716b(findViewById3, "");
        this.f76855e = (InputResultIndicator) findViewById3;
        InputWithIndicator inputWithIndicator = this.f76854d;
        if (inputWithIndicator == null) {
            C89219l.m154710a("passwordInput");
        }
        inputWithIndicator.setTextWatcher(new C32206c(this));
        LoadingButton loadingButton = this.f76853a;
        if (loadingButton == null) {
            C89219l.m154710a("loadingButton");
        }
        loadingButton.setEnabled(false);
        LoadingButton loadingButton2 = this.f76853a;
        if (loadingButton2 == null) {
            C89219l.m154710a("loadingButton");
        }
        loadingButton2.setOnClickListener(new View$OnClickListenerC32207d(this));
        if (this.f76907h == null) {
            mo58216a(null, "JSON is empty");
        } else {
            C80214ai.m139042a(new RunnableC32205b(this), "BoltsUtils");
        }
        MethodCollector.m26664o(10455);
        return inflate;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.h$c */
    public static final class C32206c extends C31685i {

        /* renamed from: a */
        final /* synthetic */ C32203h f76857a;

        static {
            Covode.recordClassIndex(38971);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32206c(C32203h hVar) {
            this.f76857a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            LoadingButton loadingButton = this.f76857a.f76853a;
            if (loadingButton == null) {
                C89219l.m154710a("loadingButton");
            }
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            loadingButton.setEnabled(!z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.h$d */
    static final class View$OnClickListenerC32207d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32203h f76858a;

        static {
            Covode.recordClassIndex(38972);
        }

        View$OnClickListenerC32207d(C32203h hVar) {
            this.f76858a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76858a.mo58218b();
        }
    }

    /* renamed from: b */
    private final void m66568b(String str) {
        InputResultIndicator inputResultIndicator = this.f76855e;
        if (inputResultIndicator == null) {
            C89219l.m154710a("passwordInputResult");
        }
        inputResultIndicator.mo58482a(str);
        LoadingButton loadingButton = this.f76853a;
        if (loadingButton == null) {
            C89219l.m154710a("loadingButton");
        }
        loadingButton.mo58777b(true);
    }

    /* renamed from: a */
    public final void mo58217a(String str) {
        InputResultIndicator inputResultIndicator = this.f76855e;
        if (inputResultIndicator == null) {
            C89219l.m154710a("passwordInputResult");
        }
        inputResultIndicator.mo58481a();
        LoadingButton loadingButton = this.f76853a;
        if (loadingButton == null) {
            C89219l.m154710a("loadingButton");
        }
        loadingButton.mo58777b(true);
        mo58249e(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.h$e */
    public static final class C32208e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C32203h f76859a;

        static {
            Covode.recordClassIndex(38973);
        }

        C32208e(C32203h hVar) {
            this.f76859a = hVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<TwoStepAuthApi.C32120c> iVar) {
            Integer num;
            String str;
            String str2;
            if (!C80214ai.m139043a(iVar)) {
                C32203h hVar = this.f76859a;
                C89219l.m154716b(iVar, "");
                Exception e = iVar.mo5546e();
                if (e != null) {
                    str2 = e.toString();
                } else {
                    str2 = null;
                }
                hVar.mo58216a(null, str2);
                return null;
            }
            C89219l.m154716b(iVar, "");
            TwoStepAuthApi.C32120c d = iVar.mo5545d();
            if (!C89361p.m154872a("success", d.f76647a, true) || d.f76648b == null || TextUtils.isEmpty(d.f76648b.f76649a)) {
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
                this.f76859a.mo58216a(num, str);
                return null;
            }
            this.f76859a.mo58217a(d.f76648b.f76649a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo58216a(Integer num, String str) {
        m66568b(mo58246b(num, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32203h(ActivityC0218d dVar, ViewStub viewStub, C32232n.AbstractC32233a aVar) {
        super(dVar, viewStub, aVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(viewStub, "");
        C89219l.m154721d(aVar, "");
    }
}
