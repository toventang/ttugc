package com.p2082ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.p036g.C0692e;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.lobby.auth.AbstractC20884a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20886c;
import com.bytedance.lobby.internal.C20914a;
import com.bytedance.lobby.internal.C20919d;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22330f;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AbstractC34817bf;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.C31604d;
import com.p2082ss.android.ugc.aweme.account.agegate.C31380a;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.base.SafeHandler;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.login.ActivityC31890b;
import com.p2082ss.android.ugc.aweme.account.login.C31942i;
import com.p2082ss.android.ugc.aweme.account.login.C31970n;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.DialogC31962m;
import com.p2082ss.android.ugc.aweme.account.login.authorize.p2256b.AbstractC31873a;
import com.p2082ss.android.ugc.aweme.account.login.authorize.p2256b.C31874b;
import com.p2082ss.android.ugc.aweme.account.login.authorize.p2256b.C31875c;
import com.p2082ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.p2082ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.p2082ss.android.ugc.aweme.account.login.p2262g.C31935b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32404v;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a.C32343g;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a.C32355o;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.account.p2249h.AbstractC31679e;
import com.p2082ss.android.ugc.aweme.account.p2249h.C31681f;
import com.p2082ss.android.ugc.aweme.account.p2252k.C31719e;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32840d;
import com.p2082ss.android.ugc.aweme.account.util.C33033c;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;
import com.p2082ss.android.ugc.aweme.p2310al.C33488c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.IAccountHelperService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity */
public class AuthorizeActivity extends ActivityC31890b implements AbstractC20884a, C31380a.AbstractC31381a, AbstractC31873a, C31935b.AbstractC31936a, DialogC31962m.AbstractC31963a, AbstractC32584f {

    /* renamed from: m */
    private static final boolean f76126m = false;

    /* renamed from: y */
    private static Set<Integer> f76127y = new HashSet();

    /* renamed from: A */
    private int f76128A = -1;

    /* renamed from: B */
    private String f76129B = "";

    /* renamed from: C */
    private C22292e f76130C;

    /* renamed from: D */
    private boolean f76131D = false;

    /* renamed from: E */
    private boolean f76132E = false;

    /* renamed from: i */
    public AuthResult f76133i;

    /* renamed from: j */
    public String f76134j;

    /* renamed from: k */
    protected String f76135k;

    /* renamed from: l */
    protected String f76136l;

    /* renamed from: n */
    private C20919d f76137n;

    /* renamed from: o */
    private C20886c f76138o;

    /* renamed from: p */
    private AbstractC31679e f76139p;

    /* renamed from: q */
    private AbstractC22330f f76140q;

    /* renamed from: r */
    private boolean f76141r;

    /* renamed from: s */
    private boolean f76142s;

    /* renamed from: t */
    private boolean f76143t;

    /* renamed from: u */
    private DialogC31962m f76144u;

    /* renamed from: v */
    private boolean f76145v;

    /* renamed from: w */
    private boolean f76146w;

    /* renamed from: x */
    private Handler f76147x = new SafeHandler(this);

    /* renamed from: z */
    private boolean f76148z = false;

    @Override // com.p2082ss.android.ugc.aweme.account.login.ActivityC31890b
    /* renamed from: a */
    public final int mo57794a() {
        return R.layout.h8;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final String aa_() {
        return this.f76135k;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final String ab_() {
        return this.f76136l;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.authorize.p2256b.AbstractC31873a
    /* renamed from: a */
    public final void mo57798a(C22507a aVar) {
        C36085cj.m73542a(aVar);
        m66190a((Boolean) false);
        if (this.f76141r) {
            String str = this.f76134j;
            if (C31942i.m66314a()) {
                C32837b.m67403a("aweme_thirdparty_login_error_rate", 1, C31942i.m66310a(str).mo59976a("app_language", ((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a()).mo59976a("platform", str).mo59977a());
            }
        }
        ((IAccountHelperService) C31291a.m65463a(IAccountHelperService.class)).AppsFlyerUtilsTrackLoginSuccess(this.f76134j);
        this.f76147x.post(new RunnableC31879f(this, aVar));
    }

    /* renamed from: h */
    private int m66194h() {
        if (this.f76143t) {
            return 3;
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final String ac_() {
        return m66189a(getIntent(), "enter_type");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
    public final Bundle ae_() {
        return m66188a(getIntent());
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.DialogC31962m.AbstractC31963a
    /* renamed from: e */
    public final void mo57803e() {
        mo57795a(0, new Intent());
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        C80273bt.m139146b(this.f76144u);
        super.finish();
    }

    static {
        Covode.recordClassIndex(38601);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo57804f() {
        if (this.f76144u == null) {
            DialogC31962m mVar = new DialogC31962m(this);
            this.f76144u = mVar;
            mVar.f76326a = this;
        }
        C80273bt.m139145a(this.f76144u);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", true);
        super.onResume();
        if (this.f76131D && !this.f76132E) {
            mo57805g();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        MethodCollector.m26663i(11031);
        C15477a.m28479e(this);
        super.onDestroy();
        if (this.f76137n != null) {
            C20914a a = C20914a.m39334a();
            synchronized (a.f49464a) {
                try {
                    for (Map.Entry<C0692e<String, Integer>, List<AbstractC20884a>> entry : a.f49464a.entrySet()) {
                        List<AbstractC20884a> value = entry.getValue();
                        if (value != null) {
                            value.remove(this);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11031);
                    throw th;
                }
            }
        }
        Set<Integer> set = f76127y;
        if (set != null) {
            set.remove(Integer.valueOf(hashCode()));
        }
        MethodCollector.m26664o(11031);
    }

    /* renamed from: g */
    public final void mo57805g() {
        C32355o.f77169b = null;
        if (this.f76141r) {
            C32840d.C32841a.m67413a(1, this.f76134j, this.f76128A, "passport error:" + this.f76129B);
            C31942i.m66312a(this.f76128A, this.f76129B, this.f76134j);
        }
        Intent intent = new Intent();
        intent.putExtra("error_code", this.f76128A);
        if (((AbstractC34817bf) C31291a.m65463a(AbstractC34817bf.class)).mo60103d() == 1 && this.f76146w && !TextUtils.equals(this.f76134j, "facebook") && !TextUtils.equals(this.f76134j, "google") && C33048q.m67685a() != 0) {
            mo57795a(0, intent);
        } else if (this.f76130C.mo36606a()) {
            intent.putExtra("description", this.f76128A);
            intent.putExtra("repeat_bind_error", true);
            mo57795a(999, intent);
        } else {
            intent.putExtra("description", this.f76128A);
            mo57795a(0, intent);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0151, code lost:
        if (r9.equals(r10) != false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea  */
    @Override // com.p2082ss.android.ugc.aweme.account.login.ActivityC31890b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57799b() {
        /*
        // Method dump skipped, instructions count: 482
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.mo57799b():void");
    }

    /* renamed from: a */
    public static Bundle m66188a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m66191b(AuthResult authResult) {
        if (TextUtils.equals("google", authResult.f49370d)) {
            return "unuse";
        }
        return authResult.f49372f;
    }

    /* renamed from: c */
    private static String m66193c(AuthResult authResult) {
        if (TextUtils.equals("google", authResult.f49370d) || TextUtils.equals("google_onetap", authResult.f49370d)) {
            return authResult.f49372f;
        }
        return authResult.f49373g;
    }

    /* renamed from: a */
    private void m66190a(Boolean bool) {
        if (!TextUtils.isEmpty(this.f76134j) && "google_onetap".equals(this.f76134j)) {
            C31376a aVar = new C31376a();
            aVar.mo57399a("enter_from", this.f76135k).mo57399a("enter_method", this.f76136l);
            if (bool.booleanValue()) {
                aVar.mo57399a("exit_method", "dismiss");
            } else {
                aVar.mo57399a("exit_method", "continue");
            }
            C39162r.m79460a("exit_google_onetap", aVar.f75156a);
        }
    }

    /* renamed from: b */
    public final void mo57801b(C22507a aVar) {
        this.f76132E = true;
        C32355o.f77169b = null;
        mo57798a(aVar);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.account.login.ActivityC31890b, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", true);
        super.onCreate(bundle);
        f76127y.add(Integer.valueOf(hashCode()));
        if (f76127y.size() != 1) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
            return;
        }
        this.f76135k = m66189a(getIntent(), "enter_from");
        this.f76136l = m66189a(getIntent(), "enter_method");
        C31566h.m65848a();
        if (!(this.f76137n == null || this.f76138o == null)) {
            C39162r.onEvent(MobClick.obtain().setEventName("sign_in").setLabelName(this.f76134j));
            C32840d.f78210a = System.currentTimeMillis();
            if ("google_web".equals(this.f76138o.f49387b)) {
                mo57804f();
            }
            C20919d.m39340a(this.f76138o);
            if (this.f76141r) {
                C39162r.m79460a("token_request", new C31376a().mo57399a("enter_method", this.f76136l).mo57399a("enter_from", this.f76135k).mo57399a("platform", this.f76134j).mo57397a("_perf_monitor", 1).f75156a);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo57802c(final C22507a aVar) {
        EnumC32592i iVar;
        AuthResult authResult;
        boolean z;
        if (this.f76141r) {
            if (!TextUtils.isEmpty(this.f76134j) && "facebook".equals(this.f76134j) && aVar != null && (authResult = this.f76133i) != null) {
                String[] stringArray = authResult.f49376j.getStringArray("fb_granted_permissions");
                int length = stringArray.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if ("user_friends".equals(stringArray[i])) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                String valueOf = String.valueOf(aVar.f53210a);
                String str = this.f76133i.f49372f;
                long j = this.f76133i.f49374h;
                if (z) {
                    C51648a.f118980a.mo87327g().mo86989a(valueOf, str, j);
                } else {
                    C51648a.f118980a.mo87327g().mo86992b(valueOf);
                    C51648a.f118980a.mo87324d(false);
                }
            }
            final Intent intent = new Intent();
            AgeGateResponse ageGateResponse = null;
            if (((AbstractC34817bf) C31291a.m65463a(AbstractC34817bf.class)).mo60103d() != 0 && this.f76146w) {
                ageGateResponse = new AgeGateResponse(0, "", false, 0, 0, null);
            }
            Bundle bundle = new Bundle(m66188a(getIntent()));
            if (aVar.f53214e) {
                bundle.putBoolean("new_user_need_set_username", true);
                bundle.putBoolean("new_user_need_get_recommend_username", true);
                bundle.putString("set_username_platform", C31681f.m66001a(this.f76138o));
                bundle.putString("enter_from", this.f76135k);
                bundle.putString("enter_method", this.f76136l);
            }
            if (aVar.f53214e) {
                iVar = EnumC32592i.SIGN_UP;
            } else {
                iVar = EnumC32592i.LOGIN;
            }
            bundle.putInt("current_scene", iVar.getValue());
            bundle.putString("platform", C31681f.m66001a(this.f76138o));
            bundle.putString("login_path", "third_party_auth");
            if (ageGateResponse != null) {
                bundle.putSerializable("age_gate_response", ageGateResponse);
            }
            C31604d.m65915a(bundle, this, new AbstractC89172b<C1731i<Bundle>, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.C318591 */

                static {
                    Covode.recordClassIndex(38602);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C1731i<Bundle> iVar) {
                    if (iVar.mo5544c()) {
                        AuthorizeActivity.this.mo57795a(0, intent);
                    } else {
                        C31667a.m65983a(11);
                        AuthorizeActivity.this.mo57795a(-1, intent);
                        C32404v.m66777a(aVar.f53214e, AuthorizeActivity.this.f76134j, (AbstractC32584f) AuthorizeActivity.this, aVar, (Map<String, ? extends Object>) null, false);
                    }
                    User f = C36085cj.m73552f();
                    String uid = f.getUid();
                    if (!TextUtils.isEmpty(uid) && AuthorizeActivity.this.getIntent().getBooleanExtra("need_remember_login_method", true)) {
                        C31975q.m66354b(new TPLoginMethod(uid, AuthorizeActivity.this.f76134j, TPUserInfo.from(f), false, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis())));
                    }
                    if (C36085cj.m73550d()) {
                        C36085cj.m73540a(1, 1, (Object) "");
                        C36085cj.m73544a(C36085cj.m73552f());
                    }
                    if (AuthorizeActivity.this.f76133i == null) {
                        return null;
                    }
                    ((IAccountHelperService) C31291a.m65463a(IAccountHelperService.class)).friendUploadToken(AuthorizeActivity.this.f76134j, AuthorizeActivity.this.f76133i.f49372f, AuthorizeActivity.this.f76133i.f49373g);
                    return null;
                }
            });
            if ("find_account".equals(this.f76135k)) {
                AbstractC81915c.m141874a(new C33488c());
                return;
            }
            return;
        }
        mo57795a(-1, new Intent());
    }

    @Override // com.bytedance.lobby.auth.AbstractC20884a
    /* renamed from: a */
    public final void mo34320a(AuthResult authResult) {
        Set<String> keySet;
        if (f76126m) {
            Bundle bundle = authResult.f49376j;
            C89219l.m154721d("AuthorizeActivity", "");
            if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
                for (T t : keySet) {
                    new StringBuilder("[").append((String) t).append(": ").append(C33033c.m67667a(bundle, t)).append(']');
                }
            }
        }
        if (!(isFinishing() || isDestroyed())) {
            this.f76133i = authResult;
            if (authResult.f49367a) {
                mo57797a(authResult, true);
            } else if (authResult.f49368b) {
                m66190a((Boolean) true);
                this.f76147x.post(new RunnableC31868a(this));
            } else {
                this.f76147x.post(new RunnableC31872b(this));
            }
            AbstractC31679e eVar = this.f76139p;
            if (eVar != null) {
                eVar.mo57668a(authResult);
            }
        }
    }

    /* renamed from: a */
    private static String m66189a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2262g.C31935b.AbstractC31936a
    /* renamed from: b */
    public final void mo57800b(int i, AuthResult authResult) {
        if (i == -1) {
            mo57797a(authResult, false);
            return;
        }
        mo57795a(0, new Intent());
        finish();
    }

    /* renamed from: b */
    private static boolean m66192b(int i, Intent intent) {
        Bundle a;
        if (i == 0 || intent == null || (a = m66188a(intent)) == null || !a.containsKey("callback")) {
            return false;
        }
        try {
            Uri parse = Uri.parse(a.getString("callback"));
            String scheme = parse.getScheme();
            if (scheme != null) {
                if (scheme.startsWith("snssdk")) {
                    if ("connect_switch".equals(parse.getQueryParameter("error_name"))) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo57795a(int i, Intent intent) {
        intent.putExtra("platform", this.f76134j);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            setResult(i, intent);
            finish();
            return;
        }
        this.f76147x.post(new RunnableC31878e(this, i, intent));
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.C31380a.AbstractC31381a
    /* renamed from: a */
    public final void mo57405a(int i, AuthResult authResult) {
        if (!isFinishing()) {
            if (i == -1) {
                C32404v.m66774a(true, 56004, C31681f.m66005d(authResult), (AbstractC32584f) this, (Map<String, ? extends Object>) null, false);
            } else if (i == 0) {
                C32404v.m66774a(true, -3005, C31681f.m66005d(authResult), (AbstractC32584f) this, (Map<String, ? extends Object>) null, false);
            }
            if (authResult == null || i != 1) {
                mo57795a(0, new Intent());
                finish();
                return;
            }
            mo57797a(authResult, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57797a(AuthResult authResult, boolean z) {
        String a = C31681f.m66000a(authResult);
        String c = C31681f.m66004c(authResult);
        String d = C31681f.m66005d(authResult);
        long j = authResult.f49374h / 1000;
        String b = m66191b(authResult);
        String c2 = m66193c(authResult);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(authResult.f49371e)) {
            hashMap.put("uid", Uri.encode(authResult.f49371e));
        }
        if (!TextUtils.isEmpty(c2)) {
            hashMap.put("access_token_secret", Uri.encode(c2));
        }
        if (!TextUtils.isEmpty(C31681f.m66003b(authResult))) {
            hashMap.put("profile_key", Uri.encode(C31681f.m66003b(authResult)));
        }
        int h = m66194h();
        if (h == 1) {
            this.f76145v = z;
            if (this.f76141r && C36085cj.m73553g().isEnableMultiAccountLogin()) {
                hashMap.put("multi_login", Uri.encode("1"));
            }
            if (!z) {
                Map<String, String> b2 = C31566h.m65850b();
                if (b2.size() > 0) {
                    hashMap.putAll(b2);
                }
                if (this.f76141r) {
                    if (this.f76142s) {
                        hashMap.put("multi_signup", "1");
                    } else {
                        hashMap.put("multi_signup", "0");
                    }
                }
                if (!TextUtils.isEmpty(a)) {
                    this.f76140q.mo36666a(c, d, a, j, hashMap, new C31875c(this));
                } else {
                    this.f76140q.mo36668b(c, d, b, j, hashMap, new C31875c(this));
                }
            } else if (!TextUtils.isEmpty(a)) {
                this.f76140q.mo36669c(c, d, a, j, hashMap, new C31875c(this));
            } else {
                this.f76140q.mo36670d(c, d, b, j, hashMap, new C31875c(this));
            }
        } else if (h != 3) {
            this.f76147x.post(new RunnableC31876c(this));
        } else {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(b)) {
                intent.putExtra("access_token", b);
            }
            if (!TextUtils.isEmpty(c2)) {
                intent.putExtra("access_token_secret", c2);
            }
            if (!TextUtils.isEmpty(a)) {
                intent.putExtra("code", a);
            }
            if (j > 0) {
                intent.putExtra("expires_in", j);
            }
            if (!TextUtils.isEmpty(c)) {
                intent.putExtra("platform_id", c);
            }
            mo57795a(-1, intent);
        }
        this.f76147x.post(new RunnableC31877d(this));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 32972) {
            if (m66192b(i2, intent)) {
                Intent intent2 = new Intent();
                intent2.putExtra("repeat_bind_error", true);
                mo57795a(0, intent2);
                return;
            }
            this.f76140q.mo36665a(this.f76134j, new C31874b(this));
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.authorize.p2256b.AbstractC31873a
    /* renamed from: a */
    public final void mo57796a(int i, String str, String str2, C22292e eVar) {
        boolean z;
        String str3;
        String str4;
        if (!isFinishing()) {
            this.f76128A = i;
            this.f76129B = str;
            this.f76130C = eVar;
            boolean z2 = false;
            m66190a((Boolean) false);
            int d = ((AbstractC34817bf) C31291a.m65463a(AbstractC34817bf.class)).mo60103d();
            if (i == 1011) {
                z = true;
            } else {
                z = false;
            }
            this.f76146w = z;
            C31719e eVar2 = new C31719e();
            eVar2.f75864c = this.f76134j;
            eVar2.f75863b = "0";
            eVar2.f75865d = String.valueOf(i);
            if (this.f76145v) {
                str3 = "/passport/auth/only_login/";
            } else {
                str3 = "/passport/auth/login/";
            }
            eVar2.f75866e = str3;
            eVar2.mo57683a();
            if (m66188a(getIntent()) != null && m66188a(getIntent()).getBoolean("age_gate_block", false)) {
                z2 = true;
            }
            if (!this.f76145v || !this.f76146w) {
                if (!this.f76146w && this.f76141r) {
                    C32404v.m66774a(false, i, this.f76134j, (AbstractC32584f) this, (Map<String, ? extends Object>) null, false);
                    if (i > 0 && !C31970n.f76340a.contains(Integer.valueOf(i)) && !C31970n.f76341b.contains(Integer.valueOf(i))) {
                        if (i == 1450) {
                            C89219l.m154721d(this, "");
                            C89219l.m154721d(eVar, "");
                            C32355o.f77169b = new WeakReference<>(this);
                            String optString = eVar.f52719h.optJSONObject("data").optString("webapp_url");
                            if (TextUtils.isEmpty(optString)) {
                                new C23144b(this).mo37640e(R.string.bos).mo37637b();
                            }
                            SmartRouter.buildRoute(this, optString).open();
                            this.f76131D = true;
                            return;
                        } else if (i != 1381) {
                            if (TextUtils.isEmpty(str)) {
                                str4 = getString(R.string.cyp);
                            } else {
                                str4 = str;
                            }
                            new C79459a(getBaseContext()).mo123052a(str4).mo123053a();
                        } else {
                            if (eVar.f52719h != null) {
                                C32343g gVar = new C32343g(eVar.f52719h.optJSONObject("data"));
                                if (gVar.f77140a) {
                                    CommonFlowActivity.m67015a(this, gVar.mo58400a(), EnumC32592i.CHANGE_PASSWORD, gVar.mo58401b(), new C31881h(this), null, true);
                                }
                            }
                            new C79459a(getBaseContext()).mo123050a(R.string.bos).mo123053a();
                        }
                    }
                }
                if (this.f76141r) {
                    C32840d.C32841a.m67413a(1, this.f76134j, i, "passport error:".concat(String.valueOf(str)));
                    C31942i.m66312a(i, str, this.f76134j);
                }
                mo57805g();
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f76133i.f49376j.putString("profile_key", str2);
            }
            this.f76147x.post(new RunnableC31880g(this, d, z2));
        }
    }
}
