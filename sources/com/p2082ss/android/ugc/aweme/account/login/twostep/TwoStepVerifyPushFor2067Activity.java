package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32358ab;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32369ae;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32378b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32405w;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2248g.C31672b;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity */
public final class TwoStepVerifyPushFor2067Activity extends ActivityC17312a {

    /* renamed from: a */
    AbstractC88412b f76762a;

    /* renamed from: b */
    AbstractC88412b f76763b;

    /* renamed from: c */
    public AbstractC88412b f76764c;

    /* renamed from: d */
    String f76765d;

    /* renamed from: e */
    String f76766e;

    /* renamed from: f */
    public String f76767f;

    /* renamed from: g */
    public String f76768g;

    /* renamed from: h */
    public final long f76769h = 60;

    /* renamed from: i */
    public ArrayList<String> f76770i = new ArrayList<>();

    /* renamed from: j */
    boolean f76771j;

    /* renamed from: k */
    public Runnable f76772k = new RunnableC32175q(this);

    /* renamed from: l */
    private final AbstractC89244h f76773l = C89250i.m154773a((AbstractC89171a) new C32161c(this));

    /* renamed from: m */
    private final AbstractC89244h f76774m = C89250i.m154773a((AbstractC89171a) new C32162d(this));

    /* renamed from: n */
    private final AbstractC89244h f76775n = C89250i.m154773a((AbstractC89171a) new C32163e(this));

    /* renamed from: o */
    private final AbstractC89244h f76776o = C89250i.m154773a((AbstractC89171a) new C32167i(this));

    /* renamed from: p */
    private final AbstractC89244h f76777p = C89250i.m154773a((AbstractC89171a) new C32166h(this));

    /* renamed from: q */
    private AbstractC88412b f76778q;

    /* renamed from: r */
    private final long f76779r = 120000;

    /* renamed from: s */
    private Handler f76780s = new Handler(Looper.getMainLooper());

    /* renamed from: t */
    private HashMap f76781t;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$b */
    static final class C32160b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32160b f76783a = new C32160b();

        static {
            Covode.recordClassIndex(38925);
        }

        C32160b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$o */
    public static final class C32173o<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32173o f76796a = new C32173o();

        static {
            Covode.recordClassIndex(38938);
        }

        C32173o() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(38923);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f76781t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f76781t == null) {
            this.f76781t = new HashMap();
        }
        View view = (View) this.f76781t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76781t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final String mo58123a() {
        return (String) this.f76774m.getValue();
    }

    /* renamed from: b */
    public final String mo58125b() {
        return (String) this.f76775n.getValue();
    }

    /* renamed from: c */
    public final String mo58126c() {
        return (String) this.f76776o.getValue();
    }

    /* renamed from: d */
    public final String mo58127d() {
        return (String) this.f76777p.getValue();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        super.onBackPressed();
        mo58129f();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$h */
    static final class C32166h extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76789a;

        static {
            Covode.recordClassIndex(38931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32166h(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            super(0);
            this.f76789a = twoStepVerifyPushFor2067Activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return m66543a(this.f76789a.getIntent(), "ticket");
        }

        /* renamed from: a */
        private static String m66543a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$i */
    static final class C32167i extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76790a;

        static {
            Covode.recordClassIndex(38932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32167i(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            super(0);
            this.f76790a = twoStepVerifyPushFor2067Activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return m66544a(this.f76790a.getIntent(), "platform");
        }

        /* renamed from: a */
        private static String m66544a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$c */
    static final class C32161c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76784a;

        static {
            Covode.recordClassIndex(38926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32161c(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            super(0);
            this.f76784a = twoStepVerifyPushFor2067Activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = m66540a(this.f76784a.getIntent(), "enter_from");
            if (a == null) {
                return "";
            }
            return a;
        }

        /* renamed from: a */
        private static String m66540a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$d */
    static final class C32162d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76785a;

        static {
            Covode.recordClassIndex(38927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32162d(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            super(0);
            this.f76785a = twoStepVerifyPushFor2067Activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = m66541a(this.f76785a.getIntent(), "enter_method");
            if (a == null) {
                return "";
            }
            return a;
        }

        /* renamed from: a */
        private static String m66541a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$e */
    static final class C32163e extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76786a;

        static {
            Covode.recordClassIndex(38928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32163e(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            super(0);
            this.f76786a = twoStepVerifyPushFor2067Activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = m66542a(this.f76786a.getIntent(), "enter_type");
            if (a == null) {
                return "";
            }
            return a;
        }

        /* renamed from: a */
        private static String m66542a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        if (!this.f76771j) {
            C32231m.m66598a().mo58245a(new C31672b(null, this.f76766e, 0, "User left TwoStepAuthActivity before completing auth process", this.f76765d));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$p */
    public static final class C32174p implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76797a;

        static {
            Covode.recordClassIndex(38939);
        }

        C32174p(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f76797a = twoStepVerifyPushFor2067Activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            String string = this.f76797a.getString(R.string.f0a);
            C89219l.m154716b(string, "");
            ((LoadingButton) this.f76797a._$_findCachedViewById(R.id.yo)).setText(string);
            LoadingButton loadingButton = (LoadingButton) this.f76797a._$_findCachedViewById(R.id.yo);
            C89219l.m154716b(loadingButton, "");
            loadingButton.setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$q */
    static final class RunnableC32175q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76798a;

        static {
            Covode.recordClassIndex(38940);
        }

        RunnableC32175q(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f76798a = twoStepVerifyPushFor2067Activity;
        }

        public final void run() {
            if (!this.f76798a.isFinishing()) {
                Context applicationContext = this.f76798a.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                new C79459a(applicationContext).mo123052a(this.f76798a.getString(R.string.f08)).mo123053a();
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = this.f76798a;
                String string = twoStepVerifyPushFor2067Activity.getString(R.string.f08);
                C89219l.m154716b(string, "");
                twoStepVerifyPushFor2067Activity.mo58124a(string);
            }
        }
    }

    /* renamed from: g */
    private void m66532g() {
        ((TuxTextView) _$_findCachedViewById(R.id.et6)).setOnClickListener(new View$OnClickListenerC32164f(this));
        ((LoadingButton) _$_findCachedViewById(R.id.yo)).setOnClickListener(new View$OnClickListenerC32165g(this));
    }

    /* renamed from: f */
    public final void mo58129f() {
        C39162r.m79460a("cancel_push_challenge_login_request", new C31376a().mo57399a("enter_method", mo58123a()).mo57399a("enter_from", mo58123a()).mo57399a("enter_type", mo58125b()).mo57399a("platform", mo58126c()).f75156a);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        C89219l.m154716b(window, "");
        View decorView = window.getDecorView();
        C89219l.m154716b(decorView, "");
        setFinishOnTouchOutside(false);
        ViewGroup.LayoutParams layoutParams = decorView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        layoutParams2.width = C13628n.m24504a(this);
        layoutParams2.height = -2;
        getWindowManager().updateViewLayout(decorView, layoutParams2);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        AbstractC88412b bVar = this.f76778q;
        if (bVar != null) {
            bVar.dispose();
        }
        AbstractC88412b bVar2 = this.f76762a;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        AbstractC88412b bVar3 = this.f76763b;
        if (bVar3 != null) {
            bVar3.dispose();
        }
        AbstractC88412b bVar4 = this.f76764c;
        if (bVar4 != null) {
            bVar4.dispose();
        }
        this.f76780s.removeCallbacks(this.f76772k);
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

    /* renamed from: e */
    public final void mo58128e() {
        String string = getString(R.string.f0_, new Object[]{String.valueOf(this.f76769h)});
        C89219l.m154716b(string, "");
        ((LoadingButton) _$_findCachedViewById(R.id.yo)).setText(string);
        LoadingButton loadingButton = (LoadingButton) _$_findCachedViewById(R.id.yo);
        C89219l.m154716b(loadingButton, "");
        loadingButton.setEnabled(false);
        AbstractC88412b bVar = this.f76778q;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f76778q = AbstractC88979t.m154282a(0, 1, TimeUnit.SECONDS).mo143276b(this.f76769h).mo143292d(new C32171m(this)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new C32172n(this), C32173o.f76796a, new C32174p(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$f */
    public static final class View$OnClickListenerC32164f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76787a;

        static {
            Covode.recordClassIndex(38929);
        }

        View$OnClickListenerC32164f(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f76787a = twoStepVerifyPushFor2067Activity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76787a.mo58129f();
            this.f76787a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$m */
    public static final class C32171m<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76794a;

        static {
            Covode.recordClassIndex(38936);
        }

        C32171m(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f76794a = twoStepVerifyPushFor2067Activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            C89219l.m154721d(l, "");
            return Long.valueOf(this.f76794a.f76769h - l.longValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$n */
    public static final class C32172n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76795a;

        static {
            Covode.recordClassIndex(38937);
        }

        C32172n(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f76795a = twoStepVerifyPushFor2067Activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String string = this.f76795a.getString(R.string.f0_, new Object[]{String.valueOf(((Long) obj).longValue())});
            C89219l.m154716b(string, "");
            ((LoadingButton) this.f76795a._$_findCachedViewById(R.id.yo)).setText(string);
        }
    }

    /* renamed from: a */
    public final void mo58124a(String str) {
        C89219l.m154721d(str, "");
        C32231m.m66598a().mo58245a(new C31672b(null, this.f76766e, 0, str, this.f76765d));
        this.f76771j = true;
        finish();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$a */
    static final class C32159a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76782a;

        static {
            Covode.recordClassIndex(38924);
        }

        C32159a(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f76782a = twoStepVerifyPushFor2067Activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32378b bVar = (C32378b) obj;
            String str = "";
            if (C89219l.m154714a((Object) "allowed", (Object) bVar.f77208a)) {
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = this.f76782a;
                String str2 = bVar.f77209b;
                if (str2 != null) {
                    str = str2;
                }
                twoStepVerifyPushFor2067Activity.f76768g = str;
                AbstractC88412b bVar2 = this.f76782a.f76764c;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity2 = this.f76782a;
                C31672b bVar3 = new C31672b(twoStepVerifyPushFor2067Activity2.f76768g, twoStepVerifyPushFor2067Activity2.f76766e, 0, null, twoStepVerifyPushFor2067Activity2.f76765d);
                twoStepVerifyPushFor2067Activity2.f76771j = true;
                C32231m.m66598a().mo58245a(bVar3);
                twoStepVerifyPushFor2067Activity2.finish();
            } else if (C89219l.m154714a((Object) "denied", (Object) bVar.f77208a)) {
                Context applicationContext = this.f76782a.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                new C79459a(applicationContext).mo123052a(this.f76782a.getString(R.string.f09)).mo123053a();
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity3 = this.f76782a;
                String string = twoStepVerifyPushFor2067Activity3.getString(R.string.f09);
                C89219l.m154716b(string, str);
                twoStepVerifyPushFor2067Activity3.mo58124a(string);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$g */
    public static final class View$OnClickListenerC32165g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76788a;

        static {
            Covode.recordClassIndex(38930);
        }

        View$OnClickListenerC32165g(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f76788a = twoStepVerifyPushFor2067Activity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = this.f76788a;
            C39162r.m79460a("click_resend_push_challenge_login", new C31376a().mo57399a("enter_method", twoStepVerifyPushFor2067Activity.mo58123a()).mo57399a("enter_from", twoStepVerifyPushFor2067Activity.mo58123a()).mo57399a("enter_type", twoStepVerifyPushFor2067Activity.mo58125b()).mo57399a("platform", twoStepVerifyPushFor2067Activity.mo58126c()).f75156a);
            TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity2 = this.f76788a;
            ((LoadingButton) twoStepVerifyPushFor2067Activity2._$_findCachedViewById(R.id.yo)).mo58776a(true);
            twoStepVerifyPushFor2067Activity2.f76762a = C32369ae.m66734a(twoStepVerifyPushFor2067Activity2.mo58127d(), twoStepVerifyPushFor2067Activity2.f76767f).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143190a(new C32168j(twoStepVerifyPushFor2067Activity2), new C32169k(twoStepVerifyPushFor2067Activity2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$j */
    static final class C32168j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76791a;

        static {
            Covode.recordClassIndex(38933);
        }

        C32168j(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f76791a = twoStepVerifyPushFor2067Activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32358ab abVar = (C32358ab) obj;
            ((LoadingButton) this.f76791a._$_findCachedViewById(R.id.yo)).mo58777b(true);
            if (C89219l.m154714a((Object) "ok", (Object) abVar.f77176e)) {
                if (TextUtils.isEmpty(abVar.f77177f)) {
                    TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = this.f76791a;
                    String str = abVar.f77177f;
                    if (str == null) {
                        str = "";
                    }
                    twoStepVerifyPushFor2067Activity.f76767f = str;
                }
                TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity2 = this.f76791a;
                Collection collection = abVar.f77181j;
                if (collection == null) {
                    collection = C89086z.INSTANCE;
                }
                twoStepVerifyPushFor2067Activity2.f76770i = new ArrayList<>(collection);
                this.f76791a.mo58128e();
            } else if (C89219l.m154714a((Object) "expired", (Object) abVar.f77176e)) {
                this.f76791a.f76772k.run();
            } else {
                String str2 = abVar.f77180i;
                if (str2 != null && str2.length() > 0) {
                    Context applicationContext = this.f76791a.getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    new C79459a(applicationContext).mo123052a(str2).mo123053a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$k */
    static final class C32169k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76792a;

        static {
            Covode.recordClassIndex(38934);
        }

        C32169k(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f76792a = twoStepVerifyPushFor2067Activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ((LoadingButton) this.f76792a._$_findCachedViewById(R.id.yo)).mo58777b(true);
            if (th instanceof C32405w) {
                C32405w wVar = (C32405w) th;
                if (TextUtils.isEmpty(wVar.getDetailErrorMsg())) {
                    Context applicationContext = this.f76792a.getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    new C79459a(applicationContext).mo123052a(wVar.getDetailErrorMsg()).mo123053a();
                }
            }
            String string = this.f76792a.getString(R.string.f0a);
            C89219l.m154716b(string, "");
            ((LoadingButton) this.f76792a._$_findCachedViewById(R.id.yo)).setText(string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity$l */
    static final class C32170l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerifyPushFor2067Activity f76793a;

        static {
            Covode.recordClassIndex(38935);
        }

        C32170l(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
            this.f76793a = twoStepVerifyPushFor2067Activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity = this.f76793a;
            AbstractC88412b bVar = twoStepVerifyPushFor2067Activity.f76763b;
            if (bVar != null) {
                bVar.dispose();
            }
            String d = twoStepVerifyPushFor2067Activity.mo58127d();
            String str = twoStepVerifyPushFor2067Activity.f76767f;
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(d)) {
                if (d == null) {
                    C89219l.m154715b();
                }
                hashMap.put("verify_ticket", d);
            }
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    C89219l.m154715b();
                }
                hashMap.put("wait_ticket", str);
            }
            AbstractC88924h<R> a = NetworkProxyAccount.m67480d("/passport/push_challenge/check_2sv/", hashMap).mo143198a(C32369ae.C32370a.f77199a).mo143195a(C88391a.m153580a(C88392a.f200660a));
            C89219l.m154716b(a, "");
            twoStepVerifyPushFor2067Activity.f76763b = a.mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143190a(new C32159a(twoStepVerifyPushFor2067Activity), C32160b.f76783a);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.hc);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("device_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        this.f76770i = stringArrayListExtra;
        this.f76767f = m66531a(getIntent(), "wait_ticket");
        String a = m66531a(getIntent(), "sms_code_key");
        if (a == null) {
            a = "";
        }
        this.f76765d = a;
        String a2 = m66531a(getIntent(), "profile_key");
        if (a2 == null) {
            a2 = "";
        }
        this.f76766e = a2;
        if (this.f76770i.size() == 1) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.eu6);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(getString(R.string.f07, new Object[]{this.f76770i.get(0)}));
        } else if (this.f76770i.size() >= 2) {
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.eu6);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(getResources().getQuantityString(R.plurals.gx, this.f76770i.size() - 1, this.f76770i.get(0), String.valueOf(this.f76770i.size() - 1)));
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.eu6);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(getString(R.string.f07, new Object[]{""}));
        }
        TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.et6);
        C89219l.m154716b(tuxTextView4, "");
        tuxTextView4.setText(getString(R.string.a90));
        LoadingButton loadingButton = (LoadingButton) _$_findCachedViewById(R.id.yo);
        C89219l.m154716b(loadingButton, "");
        loadingButton.setEnabled(false);
        String string = getString(R.string.f0_, new Object[]{String.valueOf(this.f76769h)});
        C89219l.m154716b(string, "");
        ((LoadingButton) _$_findCachedViewById(R.id.yo)).setText(string);
        m66532g();
        this.f76764c = AbstractC88979t.m154282a(0, 3, TimeUnit.SECONDS).mo143289d(new C32170l(this));
        m66532g();
        mo58128e();
        C39162r.m79460a("show_interrupted_login_panel", new C31376a().mo57399a("enter_method", mo58123a()).mo57399a("enter_from", mo58123a()).mo57399a("enter_type", mo58125b()).mo57399a("platform", mo58126c()).f75156a);
        this.f76780s.postDelayed(this.f76772k, this.f76779r);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m66531a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
