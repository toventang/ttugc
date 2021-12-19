package com.p2082ss.android.ugc.aweme.account.agegate.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.AgeGateService;
import com.p2082ss.android.ugc.aweme.account.agegate.model.C31540a;
import com.p2082ss.android.ugc.aweme.account.agegate.p2236a.C31382a;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31555c;
import com.p2082ss.android.ugc.aweme.account.view.DialogC33061a;
import com.p2082ss.android.ugc.aweme.profile.model.AgeGateInfo;
import com.p2082ss.android.ugc.aweme.profile.model.AgeGateOption;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity */
public final class AccountDeletedActivity extends ActivityC17312a {

    /* renamed from: c */
    public static final C31385a f75168c = new C31385a((byte) 0);

    /* renamed from: a */
    public final User f75169a;

    /* renamed from: b */
    public boolean f75170b;

    /* renamed from: d */
    private final AbstractC89244h f75171d = C89250i.m154773a((AbstractC89171a) new C31390e(this));

    /* renamed from: e */
    private List<C31540a> f75172e;

    /* renamed from: f */
    private List<AgeGateOption> f75173f;

    /* renamed from: g */
    private HashMap f75174g;

    static {
        Covode.recordClassIndex(38093);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f75174g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f75174g == null) {
            this.f75174g = new HashMap();
        }
        View view = (View) this.f75174g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75174g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final DialogC33061a mo57407a() {
        return (DialogC33061a) this.f75171d.getValue();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity$a */
    public static final class C31385a {
        static {
            Covode.recordClassIndex(38094);
        }

        private C31385a() {
        }

        public /* synthetic */ C31385a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity$e */
    static final class C31390e extends AbstractC89220m implements AbstractC89171a<DialogC33061a> {

        /* renamed from: a */
        final /* synthetic */ AccountDeletedActivity f75181a;

        static {
            Covode.recordClassIndex(38099);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31390e(AccountDeletedActivity accountDeletedActivity) {
            super(0);
            this.f75181a = accountDeletedActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC33061a invoke() {
            return new DialogC33061a(this.f75181a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity$b */
    static final class C31386b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31540a f75175a;

        /* renamed from: b */
        final /* synthetic */ AgeGateOption f75176b;

        /* renamed from: c */
        final /* synthetic */ AccountDeletedActivity f75177c;

        static {
            Covode.recordClassIndex(38095);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31386b(C31540a aVar, AgeGateOption ageGateOption, AccountDeletedActivity accountDeletedActivity) {
            super(0);
            this.f75175a = aVar;
            this.f75176b = ageGateOption;
            this.f75177c = accountDeletedActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f75175a.f75430c) {
                TuxButton tuxButton = (TuxButton) this.f75177c._$_findCachedViewById(R.id.a0d);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setEnabled(true);
                ((TuxButton) this.f75177c._$_findCachedViewById(R.id.a0d)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity.C31386b.View$OnClickListenerC313871 */

                    /* renamed from: a */
                    final /* synthetic */ C31386b f75178a;

                    static {
                        Covode.recordClassIndex(38096);
                    }

                    {
                        this.f75178a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        String str = this.f75178a.f75176b.type;
                        if (str != null) {
                            C31555c.m65836a(str);
                        }
                        String str2 = this.f75178a.f75176b.type;
                        if (str2 != null && str2.hashCode() == -1411068529 && str2.equals("appeal")) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f75178a.f75176b.url));
                            intent.addFlags(268435456);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            try {
                                AccountDeletedActivity accountDeletedActivity = this.f75178a.f75177c;
                                C84349a.m145093a(intent, accountDeletedActivity);
                                accountDeletedActivity.startActivity(intent);
                            } catch (ActivityNotFoundException unused) {
                                SmartRouter.buildRoute(this.f75178a.f75177c, "//webview").withParam(Uri.parse(this.f75178a.f75176b.url)).open();
                            }
                        } else {
                            SmartRouter.buildRoute(this.f75178a.f75177c, "//webview").withParam("url", this.f75178a.f75176b.url).withParam("hide_nav_bar", true).open();
                        }
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    public AccountDeletedActivity() {
        User f = C36085cj.m73552f();
        C89219l.m154716b(f, "");
        this.f75169a = f;
        this.f75172e = new ArrayList();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity$c */
    static final class View$OnClickListenerC31388c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AccountDeletedActivity f75179a;

        static {
            Covode.recordClassIndex(38097);
        }

        View$OnClickListenerC31388c(AccountDeletedActivity accountDeletedActivity) {
            this.f75179a = accountDeletedActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AgeGateService.f75149a = false;
            AccountDeletedActivity accountDeletedActivity = this.f75179a;
            if (!accountDeletedActivity.f75170b) {
                C31555c.m65836a("logout");
                C80273bt.m139145a(accountDeletedActivity.mo57407a());
                C36085cj.m73543a(new C31389d(accountDeletedActivity));
                accountDeletedActivity.f75170b = true;
                C36085cj.m73553g().logout("age_gate_delete_account", "user_logout");
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fd);
        List<AgeGateOption> list = null;
        if (this.f75169a.getAgeGateInfo() != null) {
            AgeGateInfo ageGateInfo = this.f75169a.getAgeGateInfo();
            if (ageGateInfo != null) {
                list = ageGateInfo.getOptionList();
            }
            this.f75173f = list;
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.acq);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(this.f75169a.getAgeGateInfo().getContent());
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.aj9);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(this.f75169a.getAgeGateInfo().getTitle());
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.acq);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText((CharSequence) null);
            TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.aj9);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setText((CharSequence) null);
        }
        List<AgeGateOption> list2 = this.f75173f;
        if (list2 != null) {
            for (AgeGateOption ageGateOption : list2) {
                C31540a aVar = new C31540a(ageGateOption.content);
                aVar.f75428a = new C31386b(aVar, ageGateOption, this);
                this.f75172e.add(aVar);
            }
        }
        C31382a aVar2 = new C31382a(this);
        List<C31540a> list3 = this.f75172e;
        C89219l.m154721d(list3, "");
        aVar2.f75161a.clear();
        aVar2.f75161a.addAll(list3);
        aVar2.notifyDataSetChanged();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.bq);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setAdapter(aVar2);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.bq);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        ((TuxButton) _$_findCachedViewById(R.id.a0b)).setOnClickListener(new View$OnClickListenerC31388c(this));
        TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.a0d);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setEnabled(false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity$d */
    static final class C31389d implements IAccountService.AbstractC31272b {

        /* renamed from: a */
        final /* synthetic */ AccountDeletedActivity f75180a;

        static {
            Covode.recordClassIndex(38098);
        }

        C31389d(AccountDeletedActivity accountDeletedActivity) {
            this.f75180a = accountDeletedActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
        public final void onAccountResult(int i, boolean z, int i2, User user) {
            this.f75180a.f75170b = false;
            C80273bt.m139146b(this.f75180a.mo57407a());
        }
    }
}
