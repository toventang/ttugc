package com.p2082ss.android.ugc.aweme;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.p2082ss.android.ugc.aweme.p2310al.C33491f;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.aweme.view.EOYPlayer;
import com.p2082ss.android.ugc.aweme.view.NestedScrollUIList;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.EOYContainerActivity */
public final class EOYContainerActivity extends BulletContainerActivity implements AbstractC90252i, AbstractC90253j {

    /* renamed from: m */
    private SparseArray f74950m;

    static {
        Covode.recordClassIndex(37925);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    /* renamed from: a */
    public final View mo26864a(int i) {
        if (this.f74950m == null) {
            this.f74950m = new SparseArray();
        }
        View view = (View) this.f74950m.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f74950m.put(i, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(370, new RunnableC90250g(EOYContainerActivity.class, "onLoginEvent", C33491f.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.EOYContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.EOYContainerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.EOYContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a
    public final void finish() {
        super.finish();
        C65691a.m117584a(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
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

    /* renamed from: com.ss.android.ugc.aweme.EOYContainerActivity$b */
    public static final class C31269b extends C28463a {
        static {
            Covode.recordClassIndex(37927);
        }

        C31269b(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            return new NestedScrollUIList(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.EOYContainerActivity$c */
    public static final class C31270c extends C28463a {
        static {
            Covode.recordClassIndex(37928);
        }

        C31270c(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C28463a
        /* renamed from: a */
        public final LynxUI<?> mo16275a(AbstractC28520j jVar) {
            return new EOYPlayer(jVar);
        }
    }

    /* renamed from: a */
    private static Bundle m65261a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onLoginEvent(C33491f fVar) {
        C89219l.m154721d(fVar, "");
        C18494b.m34415a(new C18484a("login", System.currentTimeMillis(), null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0127  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.bullet.BulletContainerActivity, com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a, com.bytedance.ies.bullet.p1184ui.common.AbstractActivityC17000a, androidx.appcompat.app.ActivityC0218d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.EOYContainerActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m65262a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.EOYContainerActivity$a */
    static final class C31268a implements C28573r.AbstractC28574a {

        /* renamed from: a */
        final /* synthetic */ EOYContainerActivity f74951a;

        /* renamed from: b */
        final /* synthetic */ Map f74952b;

        static {
            Covode.recordClassIndex(37926);
        }

        C31268a(EOYContainerActivity eOYContainerActivity, Map map) {
            this.f74951a = eOYContainerActivity;
            this.f74952b = map;
        }

        @Override // com.lynx.tasm.behavior.shadow.text.C28573r.AbstractC28574a
        /* renamed from: a */
        public final Typeface mo14647a(String str, int i) {
            String str2;
            if (C89361p.m154908a((CharSequence) "Proxima Nova", (CharSequence) str, false)) {
                str2 = (String) this.f74952b.get("ProximaNova-Reg");
            } else {
                if (C89361p.m154908a((CharSequence) "ProximaNova-Regular", (CharSequence) str, false)) {
                    str2 = (String) this.f74952b.get("ProximaNova-Reg");
                }
                return null;
            }
            if (str2 != null) {
                return C28573r.m57140a(this.f74951a.getAssets(), str2, i, "font/");
            }
            return null;
        }
    }
}
