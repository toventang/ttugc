package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13616g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32864k;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.k */
public final class C32218k extends C32232n implements TwoStepAuthActivity.AbstractC32110b {

    /* renamed from: d */
    public static final boolean f76881d = false;

    /* renamed from: e */
    public static final C32219a f76882e = new C32219a((byte) 0);

    /* renamed from: a */
    public LoadingButton f76883a;

    /* renamed from: b */
    public ImageView f76884b;

    /* renamed from: c */
    public String f76885c;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.k$a */
    public static final class C32219a {
        static {
            Covode.recordClassIndex(38984);
        }

        private C32219a() {
        }

        public /* synthetic */ C32219a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(38983);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n
    /* renamed from: a */
    public final View mo58188a() {
        MethodCollector.m26663i(10289);
        if (this.f76910k.getLayoutResource() <= 0) {
            this.f76910k.setLayoutResource(R.layout.h0);
        }
        View inflate = this.f76910k.inflate();
        C89219l.m154716b(inflate, "");
        View findViewById = inflate.findViewById(R.id.cg9);
        C89219l.m154716b(findViewById, "");
        this.f76884b = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.cg8);
        C89219l.m154716b(findViewById2, "");
        LoadingButton loadingButton = (LoadingButton) findViewById2;
        this.f76883a = loadingButton;
        if (loadingButton == null) {
            C89219l.m154710a("verifyButton");
        }
        C17235c.m31810a(loadingButton, 0.5f);
        LoadingButton loadingButton2 = this.f76883a;
        if (loadingButton2 == null) {
            C89219l.m154710a("verifyButton");
        }
        loadingButton2.setEnabled(false);
        LoadingButton loadingButton3 = this.f76883a;
        if (loadingButton3 == null) {
            C89219l.m154710a("verifyButton");
        }
        loadingButton3.setOnClickListener(new View$OnClickListenerC32222c(this));
        if (this.f76907h == null) {
            mo58234a((Integer) null, "JSON is empty");
        } else {
            C80214ai.m139042a(new RunnableC32220b(this), "BoltsUtils");
        }
        MethodCollector.m26664o(10289);
        return inflate;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.k$b */
    static final class RunnableC32220b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C32218k f76886a;

        static {
            Covode.recordClassIndex(38985);
        }

        RunnableC32220b(C32218k kVar) {
            this.f76886a = kVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONArray jSONArray;
            final int i;
            JSONObject jSONObject2 = this.f76886a.f76907h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C32218k kVar = this.f76886a;
            String a = C13616g.m24464a(jSONObject, "verify_ticket", "");
            C89219l.m154716b(a, "");
            kVar.mo58248d(a);
            if (jSONObject != null) {
                jSONArray = jSONObject.getJSONArray("platforms");
            } else {
                jSONArray = null;
            }
            if (TextUtils.isEmpty(this.f76886a.f76909j) || jSONArray == null || jSONArray.length() <= 0) {
                this.f76886a.mo58234a((Integer) null, "Verify ticket or platform is unavailable");
                return;
            }
            this.f76886a.f76885c = jSONArray.getString(0);
            String str = this.f76886a.f76885c;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1240244679:
                        if (str.equals("google")) {
                            i = 2131231062;
                            C80214ai.m139044b(new Runnable(this) {
                                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32218k.RunnableC32220b.RunnableC322211 */

                                /* renamed from: a */
                                final /* synthetic */ RunnableC32220b f76887a;

                                static {
                                    Covode.recordClassIndex(38986);
                                }

                                {
                                    this.f76887a = r1;
                                }

                                public final void run() {
                                    C32218k.m66590a(this.f76887a.f76886a).setEnabled(true);
                                    ImageView imageView = this.f76887a.f76886a.f76884b;
                                    if (imageView == null) {
                                        C89219l.m154710a("providerImage");
                                    }
                                    imageView.setImageResource(i);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case -916346253:
                        if (str.equals("twitter")) {
                            i = 2131231066;
                            C80214ai.m139044b(new Runnable(this) {
                                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32218k.RunnableC32220b.RunnableC322211 */

                                /* renamed from: a */
                                final /* synthetic */ RunnableC32220b f76887a;

                                static {
                                    Covode.recordClassIndex(38986);
                                }

                                {
                                    this.f76887a = r1;
                                }

                                public final void run() {
                                    C32218k.m66590a(this.f76887a.f76886a).setEnabled(true);
                                    ImageView imageView = this.f76887a.f76886a.f76884b;
                                    if (imageView == null) {
                                        C89219l.m154710a("providerImage");
                                    }
                                    imageView.setImageResource(i);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case 3765:
                        if (str.equals("vk")) {
                            i = 2131231067;
                            C80214ai.m139044b(new Runnable(this) {
                                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32218k.RunnableC32220b.RunnableC322211 */

                                /* renamed from: a */
                                final /* synthetic */ RunnableC32220b f76887a;

                                static {
                                    Covode.recordClassIndex(38986);
                                }

                                {
                                    this.f76887a = r1;
                                }

                                public final void run() {
                                    C32218k.m66590a(this.f76887a.f76886a).setEnabled(true);
                                    ImageView imageView = this.f76887a.f76886a.f76884b;
                                    if (imageView == null) {
                                        C89219l.m154710a("providerImage");
                                    }
                                    imageView.setImageResource(i);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case 3321844:
                        if (str.equals("line")) {
                            i = 2131231065;
                            C80214ai.m139044b(new Runnable(this) {
                                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32218k.RunnableC32220b.RunnableC322211 */

                                /* renamed from: a */
                                final /* synthetic */ RunnableC32220b f76887a;

                                static {
                                    Covode.recordClassIndex(38986);
                                }

                                {
                                    this.f76887a = r1;
                                }

                                public final void run() {
                                    C32218k.m66590a(this.f76887a.f76886a).setEnabled(true);
                                    ImageView imageView = this.f76887a.f76886a.f76884b;
                                    if (imageView == null) {
                                        C89219l.m154710a("providerImage");
                                    }
                                    imageView.setImageResource(i);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case 28903346:
                        if (str.equals("instagram")) {
                            i = 2131231063;
                            C80214ai.m139044b(new Runnable(this) {
                                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32218k.RunnableC32220b.RunnableC322211 */

                                /* renamed from: a */
                                final /* synthetic */ RunnableC32220b f76887a;

                                static {
                                    Covode.recordClassIndex(38986);
                                }

                                {
                                    this.f76887a = r1;
                                }

                                public final void run() {
                                    C32218k.m66590a(this.f76887a.f76886a).setEnabled(true);
                                    ImageView imageView = this.f76887a.f76886a.f76884b;
                                    if (imageView == null) {
                                        C89219l.m154710a("providerImage");
                                    }
                                    imageView.setImageResource(i);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case 486515695:
                        if (str.equals("kakaotalk")) {
                            i = 2131231064;
                            C80214ai.m139044b(new Runnable(this) {
                                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32218k.RunnableC32220b.RunnableC322211 */

                                /* renamed from: a */
                                final /* synthetic */ RunnableC32220b f76887a;

                                static {
                                    Covode.recordClassIndex(38986);
                                }

                                {
                                    this.f76887a = r1;
                                }

                                public final void run() {
                                    C32218k.m66590a(this.f76887a.f76886a).setEnabled(true);
                                    ImageView imageView = this.f76887a.f76886a.f76884b;
                                    if (imageView == null) {
                                        C89219l.m154710a("providerImage");
                                    }
                                    imageView.setImageResource(i);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                    case 497130182:
                        if (str.equals("facebook")) {
                            i = 2131231061;
                            C80214ai.m139044b(new Runnable(this) {
                                /* class com.p2082ss.android.ugc.aweme.account.login.twostep.C32218k.RunnableC32220b.RunnableC322211 */

                                /* renamed from: a */
                                final /* synthetic */ RunnableC32220b f76887a;

                                static {
                                    Covode.recordClassIndex(38986);
                                }

                                {
                                    this.f76887a = r1;
                                }

                                public final void run() {
                                    C32218k.m66590a(this.f76887a.f76886a).setEnabled(true);
                                    ImageView imageView = this.f76887a.f76886a.f76884b;
                                    if (imageView == null) {
                                        C89219l.m154710a("providerImage");
                                    }
                                    imageView.setImageResource(i);
                                }
                            }, "BoltsUtils");
                            return;
                        }
                        break;
                }
            }
            this.f76886a.mo58234a((Integer) null, "Unknown third party platform: " + this.f76886a.f76885c);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LoadingButton m66590a(C32218k kVar) {
        LoadingButton loadingButton = kVar.f76883a;
        if (loadingButton == null) {
            C89219l.m154710a("verifyButton");
        }
        return loadingButton;
    }

    /* renamed from: a */
    public final void mo58235a(String str) {
        LoadingButton loadingButton = this.f76883a;
        if (loadingButton == null) {
            C89219l.m154710a("verifyButton");
        }
        loadingButton.mo58777b(true);
        mo58249e(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.k$c */
    static final class View$OnClickListenerC32222c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32218k f76889a;

        static {
            Covode.recordClassIndex(38987);
        }

        View$OnClickListenerC32222c(C32218k kVar) {
            this.f76889a = kVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C32218k.m66590a(this.f76889a).mo58776a(true);
            Intent intent = new Intent(this.f76889a.mo58247d(), AuthorizeActivity.class);
            intent.putExtra("platform", this.f76889a.f76885c);
            intent.putExtra("is_only_fetch_token", true);
            intent.putExtra("is_login", false);
            if (this.f76889a.mo58247d() instanceof TwoStepAuthActivity) {
                ActivityC0218d d = this.f76889a.mo58247d();
                Objects.requireNonNull(d, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity");
                ((TwoStepAuthActivity) d).f76619e = this.f76889a;
            }
            ActivityC0218d d2 = this.f76889a.mo58247d();
            if (d2 != null) {
                d2.startActivityForResult(intent, 123);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.k$d */
    static final class C32223d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C32218k f76890a;

        static {
            Covode.recordClassIndex(38988);
        }

        C32223d(C32218k kVar) {
            this.f76890a = kVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<TwoStepAuthApi.C32120c> iVar) {
            Integer num;
            String str;
            if (!C80214ai.m139043a(iVar)) {
                this.f76890a.mo58234a((Integer) null, "TwoStepAuthApi.verifyThirdParty bolts Task error");
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
                this.f76890a.mo58234a(num, str);
                if (str != null) {
                    new C79459a(this.f76890a.mo58247d()).mo123052a(str).mo123053a();
                }
                return null;
            }
            this.f76890a.mo58235a(d.f76648b.f76649a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static String m66591a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo58234a(Integer num, String str) {
        LoadingButton loadingButton = this.f76883a;
        if (loadingButton == null) {
            C89219l.m154710a("verifyButton");
        }
        loadingButton.mo58777b(true);
        new C79459a(mo58247d()).mo123052a(mo58246b(num, str)).mo123053a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32218k(ActivityC0218d dVar, ViewStub viewStub, C32232n.AbstractC32233a aVar) {
        super(dVar, viewStub, aVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(viewStub, "");
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity.AbstractC32110b
    /* renamed from: a */
    public final void mo58071a(int i, int i2, Intent intent) {
        Integer num;
        String str;
        String str2;
        String str3;
        Integer num2;
        String str4;
        if (i == 123) {
            String str5 = null;
            if (i2 == -1) {
                if (intent != null) {
                    str = m66591a(intent, "access_token");
                    str2 = m66591a(intent, "access_token_secret");
                    str3 = m66591a(intent, "code");
                    num2 = Integer.valueOf(intent.getIntExtra("expires_in", 0));
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    num2 = null;
                }
                if (intent == null || (str4 = m66591a(intent, "platform_id")) == null) {
                    str4 = "";
                }
                C89219l.m154716b(str4, "");
                TwoStepAuthApi.m66501a().verifyThirdParty(str, str2, str3, num2, 0, this.f76885c, Integer.valueOf(C32864k.m67463a(str4)), null, this.f76909j).mo5534a(new C32223d(this), C1731i.f5564c, null);
                return;
            }
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra("error_code", 0));
                str5 = m66591a(intent, "description");
            } else {
                num = null;
            }
            mo58234a(num, str5);
        }
    }
}
