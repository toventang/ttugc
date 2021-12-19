package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.browser.p024a.C0471b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AbstractC24265e;
import com.facebook.AbstractC24311h;
import com.facebook.AccessToken;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24739e;
import com.facebook.internal.C24743g;
import com.facebook.internal.C24776s;
import com.facebook.login.LoginClient;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class LoginManager {

    /* renamed from: d */
    private static final Set<String> f58952d = Collections.unmodifiableSet(new HashSet<String>() {
        /* class com.facebook.login.LoginManager.C248382 */

        static {
            Covode.recordClassIndex(29023);
        }

        {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    });

    /* renamed from: e */
    private static volatile LoginManager f58953e;

    /* renamed from: a */
    public EnumC24864d f58954a = EnumC24864d.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    public EnumC24862b f58955b = EnumC24862b.FRIENDS;

    /* renamed from: c */
    public String f58956c = "rerequest";

    /* renamed from: f */
    private final SharedPreferences f58957f;

    /* renamed from: com.facebook.login.LoginManager$a */
    public static class C24840a implements AbstractC24871h {

        /* renamed from: a */
        private final Activity f58961a;

        static {
            Covode.recordClassIndex(29025);
        }

        @Override // com.facebook.login.AbstractC24871h
        /* renamed from: a */
        public final Activity mo40703a() {
            return this.f58961a;
        }

        public C24840a(Activity activity) {
            C24699ae.m47301a((Object) activity, "activity");
            this.f58961a = activity;
        }

        @Override // com.facebook.login.AbstractC24871h
        /* renamed from: a */
        public final void mo40704a(Intent intent, int i) {
            this.f58961a.startActivityForResult(intent, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r5 == false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40701a(int r13, android.content.Intent r14, com.facebook.AbstractC24311h<com.facebook.login.C24870g> r15) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginManager.mo40701a(int, android.content.Intent, com.facebook.h):boolean");
    }

    /* renamed from: a */
    public final void mo40700a(AbstractC24871h hVar, LoginClient.Request request) {
        m47594a(hVar.mo40703a(), request);
        C24739e.m47368a(C24739e.EnumC24741b.Login.toRequestCode(), new C24739e.AbstractC24740a() {
            /* class com.facebook.login.LoginManager.C248393 */

            static {
                Covode.recordClassIndex(29024);
            }

            @Override // com.facebook.internal.C24739e.AbstractC24740a
            /* renamed from: a */
            public final boolean mo40568a(int i, Intent intent) {
                return LoginManager.this.mo40701a(i, intent, null);
            }
        });
        if (!m47598b(hVar, request)) {
            C24798j jVar = new C24798j("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m47595a(hVar.mo40703a(), LoginClient.Result.EnumC24834a.ERROR, null, jVar, false, request);
            throw jVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.login.LoginManager$b */
    public static class C24841b implements AbstractC24871h {

        /* renamed from: a */
        private final C24776s f58962a;

        static {
            Covode.recordClassIndex(29026);
        }

        @Override // com.facebook.login.AbstractC24871h
        /* renamed from: a */
        public final Activity mo40703a() {
            return this.f58962a.mo40595a();
        }

        C24841b(C24776s sVar) {
            C24699ae.m47301a(sVar, "fragment");
            this.f58962a = sVar;
        }

        @Override // com.facebook.login.AbstractC24871h
        /* renamed from: a */
        public final void mo40704a(Intent intent, int i) {
            this.f58962a.mo40596a(intent, i);
        }
    }

    /* renamed from: b */
    public final void mo40702b() {
        AccessToken.m45055a((AccessToken) null);
        Profile.m45114a(null);
        m47596a(false);
    }

    static {
        Covode.recordClassIndex(29021);
    }

    /* renamed from: a */
    public static LoginManager m47593a() {
        MethodCollector.m26663i(6931);
        if (f58953e == null) {
            synchronized (LoginManager.class) {
                try {
                    if (f58953e == null) {
                        f58953e = new LoginManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6931);
                    throw th;
                }
            }
        }
        LoginManager loginManager = f58953e;
        MethodCollector.m26664o(6931);
        return loginManager;
    }

    LoginManager() {
        C24699ae.m47299a();
        C24699ae.m47299a();
        this.f58957f = C34822d.m71158a(C24872m.f59047g, "com.facebook.loginManager", 0);
        if (C24872m.f59049i && C24743g.m47374a() != null) {
            C24846a aVar = new C24846a();
            C24699ae.m47299a();
            C0471b.m1710a(C24872m.f59047g, "com.android.chrome", aVar);
            C24699ae.m47299a();
            Context context = C24872m.f59047g;
            C24699ae.m47299a();
            C0471b.m1709a(context, C24872m.f59047g.getPackageName());
        }
    }

    /* renamed from: a */
    private void m47596a(boolean z) {
        SharedPreferences.Editor edit = this.f58957f.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.login.LoginManager$c */
    public static class C24842c {

        /* renamed from: a */
        private static C24868f f58963a;

        static {
            Covode.recordClassIndex(29027);
        }

        /* renamed from: a */
        public static synchronized C24868f m47611a(Context context) {
            synchronized (C24842c.class) {
                MethodCollector.m26663i(5543);
                if (context == null) {
                    C24699ae.m47299a();
                    context = C24872m.f59047g;
                    if (context == null) {
                        MethodCollector.m26664o(5543);
                        return null;
                    }
                }
                if (f58963a == null) {
                    C24699ae.m47299a();
                    f58963a = new C24868f(context, C24872m.f59041a);
                }
                C24868f fVar = f58963a;
                MethodCollector.m26664o(5543);
                return fVar;
            }
        }
    }

    /* renamed from: a */
    static boolean m47597a(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("publish") || str.startsWith("manage") || f58952d.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final LoginClient.Request mo40697a(Collection<String> collection) {
        HashSet hashSet;
        EnumC24864d dVar = this.f58954a;
        if (collection == null) {
            hashSet = new HashSet();
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        EnumC24862b bVar = this.f58955b;
        String str = this.f58956c;
        C24699ae.m47299a();
        LoginClient.Request request = new LoginClient.Request(dVar, unmodifiableSet, bVar, str, C24872m.f59041a, UUID.randomUUID().toString());
        request.f58936f = AccessToken.m45056a();
        return request;
    }

    /* renamed from: a */
    private static void m47594a(Context context, LoginClient.Request request) {
        C24868f a = C24842c.m47611a(context);
        if (a != null && request != null) {
            a.mo40765a(request);
        }
    }

    /* renamed from: b */
    private static boolean m47598b(AbstractC24871h hVar, LoginClient.Request request) {
        Intent intent = new Intent();
        C24699ae.m47299a();
        intent.setClass(C24872m.f59047g, FacebookActivity.class);
        intent.setAction(request.f58931a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        C24699ae.m47299a();
        if (C24872m.f59047g.getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        try {
            hVar.mo40704a(intent, C24739e.EnumC24741b.Login.toRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo40698a(AbstractC24265e eVar, final AbstractC24311h<C24870g> hVar) {
        if (eVar instanceof C24739e) {
            ((C24739e) eVar).mo40567b(C24739e.EnumC24741b.Login.toRequestCode(), new C24739e.AbstractC24740a() {
                /* class com.facebook.login.LoginManager.C248371 */

                static {
                    Covode.recordClassIndex(29022);
                }

                @Override // com.facebook.internal.C24739e.AbstractC24740a
                /* renamed from: a */
                public final boolean mo40568a(int i, Intent intent) {
                    return LoginManager.this.mo40701a(i, intent, hVar);
                }
            });
            return;
        }
        throw new C24798j("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* renamed from: a */
    public final void mo40699a(C24776s sVar, Collection<String> collection) {
        mo40700a(new C24841b(sVar), mo40697a(collection));
    }

    /* renamed from: a */
    private static void m47595a(Context context, LoginClient.Result.EnumC24834a aVar, Map<String, String> map, Exception exc, boolean z, LoginClient.Request request) {
        String str;
        C24868f a = C24842c.m47611a(context);
        if (a != null) {
            if (request == null) {
                a.mo40766a("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                return;
            }
            HashMap hashMap = new HashMap();
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("try_login_activity", str);
            a.mo40769a(request.f58935e, hashMap, aVar, map, exc);
        }
    }
}
