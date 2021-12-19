package com.p2082ss.android.ugc.aweme.commercialize.p2570im;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.commercialize.p2570im.C38024a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56252e;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity */
public final class ChatCheckLoginActivity extends ActivityC17312a {

    /* renamed from: d */
    public static final C38018a f89838d = new C38018a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f89839a = RouteArgExtension.INSTANCE.optionalArg(this, C38021d.f89845a, "extra_uid", String.class);

    /* renamed from: b */
    final AbstractC89244h f89840b = RouteArgExtension.INSTANCE.optionalArg(this, C38019b.f89843a, "extra_ext", String.class);

    /* renamed from: c */
    final AbstractC89244h f89841c = RouteArgExtension.INSTANCE.optionalArg(this, C38020c.f89844a, "extra_imadlog", C56252e.class);

    /* renamed from: e */
    private SparseArray f89842e;

    static {
        Covode.recordClassIndex(45479);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f89842e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f89842e == null) {
            this.f89842e = new SparseArray();
        }
        View view = (View) this.f89842e.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f89842e.put(i, findViewById);
        return findViewById;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$a */
    public static final class C38018a {
        static {
            Covode.recordClassIndex(45480);
        }

        private C38018a() {
        }

        public /* synthetic */ C38018a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m77080a(Context context, String str, String str2, C56252e eVar) {
            C89219l.m154721d(context, "");
            SmartRouter.buildRoute(context, "//main/im/check_login").withParam("extra_uid", str).withParam("extra_ext", str2).withParam("extra_imadlog", eVar).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$e */
    public static final class C38022e implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ ChatCheckLoginActivity f89846a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f89847b;

        static {
            Covode.recordClassIndex(45484);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
            this.f89846a.finish();
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f89847b.element.invoke();
        }

        C38022e(ChatCheckLoginActivity chatCheckLoginActivity, C89233z.C89238e eVar) {
            this.f89846a = chatCheckLoginActivity;
            this.f89847b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$f */
    static final class C38023f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatCheckLoginActivity f89848a;

        static {
            Covode.recordClassIndex(45485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38023f(ChatCheckLoginActivity chatCheckLoginActivity) {
            super(0);
            this.f89848a = chatCheckLoginActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ChatCheckLoginActivity chatCheckLoginActivity = this.f89848a;
            new C38024a.C38025a(chatCheckLoginActivity, (String) chatCheckLoginActivity.f89839a.getValue(), (String) this.f89848a.f89840b.getValue(), (C56252e) this.f89848a.f89841c.getValue()).mo66300a();
            this.f89848a.finish();
            return C89391z.f203057a;
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

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$b */
    static final class C38019b extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C38019b f89843a = new C38019b();

        static {
            Covode.recordClassIndex(45481);
        }

        C38019b() {
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

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$c */
    static final class C38020c extends AbstractC89220m implements AbstractC89172b<Boolean, C56252e> {

        /* renamed from: a */
        public static final C38020c f89844a = new C38020c();

        static {
            Covode.recordClassIndex(45482);
        }

        C38020c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C56252e invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$d */
    static final class C38021d extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C38021d f89845a = new C38021d();

        static {
            Covode.recordClassIndex(45483);
        }

        C38021d() {
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new C38023f(this);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            eVar.element.invoke();
        } else {
            C58957c.m108321a(this, "", "", new C38022e(this, eVar));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onCreate", false);
    }
}
