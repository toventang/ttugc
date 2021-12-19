package com.p2082ss.android.ugc.aweme.account.agegate.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31555c;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity */
public final class DeleteVideoAlertActivity extends ActivityC17312a implements View.OnClickListener {

    /* renamed from: a */
    public static final C31395a f75191a = new C31395a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f75192b = RouteArgExtension.INSTANCE.optionalArg(this, C31396b.f75194a, "enter_from", String.class);

    /* renamed from: c */
    private HashMap f75193c;

    static {
        Covode.recordClassIndex(38105);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f75193c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f75193c == null) {
            this.f75193c = new HashMap();
        }
        View view = (View) this.f75193c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75193c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final String mo57413a() {
        return (String) this.f75192b.getValue();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity$a */
    public static final class C31395a {
        static {
            Covode.recordClassIndex(38106);
        }

        private C31395a() {
        }

        public /* synthetic */ C31395a(byte b) {
            this();
        }
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

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity$b */
    static final class C31396b extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C31396b f75194a = new C31396b();

        static {
            Covode.recordClassIndex(38107);
        }

        C31396b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity.onClick(android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00af  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity$c */
    static final class DialogInterface$OnClickListenerC31397c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteVideoAlertActivity f75195a;

        static {
            Covode.recordClassIndex(38108);
        }

        DialogInterface$OnClickListenerC31397c(DeleteVideoAlertActivity deleteVideoAlertActivity) {
            this.f75195a = deleteVideoAlertActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (TextUtils.equals(this.f75195a.mo57413a(), "from_delete_account")) {
                C31555c.m65838c("cancel");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity$d */
    static final class DialogInterface$OnClickListenerC31398d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteVideoAlertActivity f75196a;

        static {
            Covode.recordClassIndex(38109);
        }

        DialogInterface$OnClickListenerC31398d(DeleteVideoAlertActivity deleteVideoAlertActivity) {
            this.f75196a = deleteVideoAlertActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (!TextUtils.equals(this.f75196a.mo57413a(), "from_delete_account")) {
                C39162r.m79460a("export_video_no_confirm", new C31376a().mo57399a("enter_method", "pop_up").mo57397a(StringSet.type, TextUtils.equals(this.f75196a.mo57413a(), "from_create_account_password") ? 1 : 0).f75156a);
                C33048q.m67688a(false);
                Intent intent = new Intent(this.f75196a, OperatorCompleteActivity.class);
                intent.putExtra("age_gate_response", this.f75196a.getIntent().getSerializableExtra("age_gate_response"));
                DeleteVideoAlertActivity deleteVideoAlertActivity = this.f75196a;
                C84349a.m145093a(intent, deleteVideoAlertActivity);
                deleteVideoAlertActivity.startActivity(intent);
            } else {
                C31555c.m65838c("log_out");
                SmartRouter.buildRoute(this.f75196a, "//account/deleted").withParam("age_gate_response", this.f75196a.getIntent().getSerializableExtra("age_gate_response")).open();
            }
            this.f75196a.finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1024 && i2 == -1) {
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }
}
