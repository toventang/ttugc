package com.p2082ss.android.ugc.aweme.account.agegate.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23029d;
import com.bytedance.tux.dialog.p1713b.C23032e;
import com.bytedance.tux.dialog.p1716e.C23054e;
import com.bytedance.tux.dialog.p1716e.C23055f;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.C31604d;
import com.p2082ss.android.ugc.aweme.account.agegate.C31412b;
import com.p2082ss.android.ugc.aweme.account.agegate.model.C31548h;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity */
public final class FtcRegistrationCompleteActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C31403a f75205a = new C31403a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f75206b = C89250i.m154773a((AbstractC89171a) new C31405c(this));

    /* renamed from: c */
    private HashMap f75207c;

    static {
        Covode.recordClassIndex(38116);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f75207c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f75207c == null) {
            this.f75207c = new HashMap();
        }
        View view = (View) this.f75207c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75207c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final String mo57419a() {
        return (String) this.f75206b.getValue();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity$a */
    public static final class C31403a {
        static {
            Covode.recordClassIndex(38117);
        }

        private C31403a() {
        }

        public /* synthetic */ C31403a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity$c */
    static final class C31405c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ FtcRegistrationCompleteActivity f75209a;

        static {
            Covode.recordClassIndex(38119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31405c(FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity) {
            super(0);
            this.f75209a = ftcRegistrationCompleteActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a;
            Intent intent = this.f75209a.getIntent();
            if (intent == null || (a = m65627a(intent, "enter_method")) == null) {
                return "";
            }
            return a;
        }

        /* renamed from: a */
        private static String m65627a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
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

    /* renamed from: a */
    public static Bundle m65625a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity$d */
    static final class C31406d extends AbstractC89220m implements AbstractC89172b<C23054e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FtcRegistrationCompleteActivity f75210a;

        static {
            Covode.recordClassIndex(38120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31406d(FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity) {
            super(1);
            this.f75210a = ftcRegistrationCompleteActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23054e eVar) {
            C23054e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54562a = FtcRegistrationCompleteActivity.m65624a(this.f75210a);
            eVar2.f54563b = FtcRegistrationCompleteActivity.m65624a(this.f75210a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity$e */
    static final class C31407e extends AbstractC89220m implements AbstractC89172b<C23029d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FtcRegistrationCompleteActivity f75211a;

        static {
            Covode.recordClassIndex(38121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31407e(FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity) {
            super(1);
            this.f75211a = ftcRegistrationCompleteActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23029d dVar) {
            C23029d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo37423a(R.string.f_1, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity.C31407e.C314081 */

                /* renamed from: a */
                final /* synthetic */ C31407e f75212a;

                static {
                    Covode.recordClassIndex(38122);
                }

                {
                    this.f75212a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity = this.f75212a.f75211a;
                    Bundle a = FtcRegistrationCompleteActivity.m65625a(ftcRegistrationCompleteActivity.getIntent());
                    if (a == null) {
                        a = new Bundle();
                    }
                    C89219l.m154716b(a, "");
                    if (C36085cj.m73547a()) {
                        a.putBoolean("only_login", true);
                    }
                    C31604d.m65915a(a, ftcRegistrationCompleteActivity, new C31404b(ftcRegistrationCompleteActivity));
                    C39162r.m79460a("confirm_relaunch_app_popup", new C31376a().mo57399a("enter_method", ftcRegistrationCompleteActivity.mo57419a()).f75156a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static int m65624a(Context context) {
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (int) TypedValue.applyDimension(1, 132.0f, resources.getDisplayMetrics());
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity$b */
    static final class C31404b extends AbstractC89220m implements AbstractC89172b<C1731i<Bundle>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FtcRegistrationCompleteActivity f75208a;

        static {
            Covode.recordClassIndex(38118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31404b(FtcRegistrationCompleteActivity ftcRegistrationCompleteActivity) {
            super(1);
            this.f75208a = ftcRegistrationCompleteActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C1731i<Bundle> iVar) {
            C1731i<Bundle> iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            this.f75208a.finish();
            C31412b.f75219b = false;
            if (C36085cj.m73550d()) {
                C36085cj.m73540a(1, 1, (Object) "");
            }
            C31667a.m65983a(11);
            C36085cj.m73544a(C36085cj.m73552f());
            iVar2.mo5545d();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        String string;
        MethodCollector.m26663i(11199);
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fj);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(2131231089);
        if (C16048b.m29633a().mo25412a(true, "kids_mode_relaunch_model_copy", 1) == C31548h.f75452a) {
            string = getString(R.string.f_3);
        } else {
            string = getString(R.string.f_4);
        }
        C89219l.m154716b(string, "");
        ((C23023b) C23032e.m43444a(C23055f.m43473a(C23013a.C23015a.m43405a(this), imageView, new C31406d(this)).mo37411b(string).mo37413d(getString(R.string.f_2)), new C31407e(this)).mo37482a(false)).mo37405a().mo37396b().show();
        C39162r.m79460a("show_relaunch_app_popup", new C31376a().mo57399a("enter_method", mo57419a()).f75156a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onCreate", false);
        MethodCollector.m26664o(11199);
    }
}
