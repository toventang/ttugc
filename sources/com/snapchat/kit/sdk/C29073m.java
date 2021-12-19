package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.snapchat.kit.sdk.core.controller.C28971b;
import com.snapchat.kit.sdk.core.controller.EnumC28970a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.p2070c.C29001f;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.C29037l;
import com.snapchat.kit.sdk.core.networking.CompletionCallback;
import com.snapchat.kit.sdk.core.networking.EnumC29026b;
import com.snapchat.kit.sdk.core.networking.FirebaseTokenManager;
import com.snapchat.kit.sdk.core.networking.RefreshAccessTokenResult;
import com.snapchat.kit.sdk.core.p2067a.C28953a;
import com.snapchat.kit.sdk.core.p2067a.C28954b;
import com.snapchat.kit.sdk.core.p2067a.C28958f;
import com.snapchat.kit.sdk.core.security.SecureSharedPreferences;
import com.snapchat.kit.sdk.p2065a.C28942a;
import com.snapchat.kit.sdk.p2066b.C28948a;
import com.snapchat.kit.sdk.p2066b.C28949b;
import dagger.AbstractC88075a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90051f;
import okhttp3.C90022aa;
import okhttp3.C90029ac;
import okhttp3.C90195q;
import okhttp3.C90208y;
import okhttp3.Request;

/* renamed from: com.snapchat.kit.sdk.m */
public final class C29073m implements AuthTokenManager, FirebaseTokenManager {

    /* renamed from: a */
    static final Set<String> f68708a = new HashSet<String>() {
        /* class com.snapchat.kit.sdk.C29073m.C290741 */

        static {
            Covode.recordClassIndex(35423);
        }

        {
            add("invalid_grant");
            add("invalid_request");
            add("invalid_scope");
            add("unsupported_grant_type");
        }
    };

    /* renamed from: b */
    final String f68709b;

    /* renamed from: c */
    final String f68710c;

    /* renamed from: d */
    final List<String> f68711d;

    /* renamed from: e */
    final C28971b f68712e;

    /* renamed from: f */
    final C27910f f68713f;

    /* renamed from: g */
    final AbstractC88075a<MetricQueue<ServerEvent>> f68714g;

    /* renamed from: h */
    final C29001f f68715h;

    /* renamed from: i */
    C28942a f68716i;

    /* renamed from: j */
    final KitPluginType f68717j;

    /* renamed from: k */
    final boolean f68718k;

    /* renamed from: l */
    C28954b f68719l;

    /* renamed from: m */
    public C29064e f68720m;

    /* renamed from: n */
    int f68721n = 0;

    /* renamed from: o */
    boolean f68722o;

    /* renamed from: p */
    private final Context f68723p;

    /* renamed from: q */
    private final C90208y f68724q;

    /* renamed from: r */
    private final AbstractC88075a<C29037l> f68725r;

    /* renamed from: s */
    private final AtomicBoolean f68726s = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50742a(C28954b bVar, String str, String str2) {
        if (bVar != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TextUtils.equals(str2, bVar.getState()) && !TextUtils.isEmpty(bVar.getRedirectUri()) && !TextUtils.isEmpty(bVar.getCodeVerifier())) {
            this.f68721n = 0;
            if (this.f68722o) {
                m58074b(bVar, str);
            } else {
                m58069a(bVar, str);
            }
        } else if (this.f68722o) {
            mo50743a(EnumC28970a.INVALID_OAUTH_RESPONSE);
        } else {
            mo50744b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50743a(EnumC28970a aVar) {
        this.f68714g.get().push(this.f68715h.mo50374a(false, true));
        this.f68712e.mo50333a(aVar);
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final String getAccessToken() {
        return this.f68720m.mo50735c();
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final boolean isUserLoggedIn() {
        return this.f68720m.mo50738f();
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.snapchat.kit.sdk.m$c */
    public static final class EnumC29084c extends Enum<EnumC29084c> {

        /* renamed from: a */
        public static final int f68741a = 1;

        /* renamed from: b */
        public static final int f68742b = 2;

        /* renamed from: c */
        public static final int f68743c = 3;

        /* renamed from: d */
        public static final int f68744d = 4;

        /* renamed from: e */
        public static final int f68745e = 5;

        /* renamed from: f */
        public static final int f68746f = 6;

        /* renamed from: g */
        private static final /* synthetic */ int[] f68747g = {1, 2, 3, 4, 5, 6};

        /* renamed from: a */
        public static int[] m58079a() {
            return (int[]) f68747g.clone();
        }

        static {
            Covode.recordClassIndex(35433);
        }
    }

    static {
        Covode.recordClassIndex(35422);
    }

    @Override // com.snapchat.kit.sdk.core.networking.FirebaseTokenManager
    public final void startFirebaseTokenGrant() {
        this.f68722o = true;
        m58070a(new C28958f());
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final void startTokenGrant() {
        this.f68722o = false;
        m58070a(new C28958f());
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final void clearToken() {
        boolean f = this.f68720m.mo50738f();
        this.f68720m.mo50739g();
        if (f) {
            this.f68712e.mo50337e();
        }
    }

    /* renamed from: com.snapchat.kit.sdk.m$5 */
    static /* synthetic */ class C290815 {

        /* renamed from: a */
        static final /* synthetic */ int[] f68737a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0015 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
        static {
            /*
                r0 = 35430(0x8a66, float:4.9648E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                int[] r0 = com.snapchat.kit.sdk.C29073m.EnumC29084c.m58079a()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.snapchat.kit.sdk.C29073m.C290815.f68737a = r1
                r3 = 1
                int r0 = com.snapchat.kit.sdk.C29073m.EnumC29084c.f68742b     // Catch:{ NoSuchFieldError -> 0x0015 }
                int r0 = r0 - r3
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r2 = com.snapchat.kit.sdk.C29073m.C290815.f68737a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = com.snapchat.kit.sdk.C29073m.EnumC29084c.f68741a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1 - r3
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.snapchat.kit.sdk.C29073m.C290815.f68737a     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r1 = com.snapchat.kit.sdk.C29073m.EnumC29084c.f68744d     // Catch:{ NoSuchFieldError -> 0x0025 }
                int r1 = r1 - r3
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0025 }
            L_0x0025:
                int[] r2 = com.snapchat.kit.sdk.C29073m.C290815.f68737a     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = com.snapchat.kit.sdk.C29073m.EnumC29084c.f68743c     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r1 - r3
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.C29073m.C290815.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50744b() {
        this.f68714g.get().push(this.f68715h.mo50374a(false, false));
        this.f68712e.mo50336d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009f, code lost:
        if (r4 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6 = com.snapchat.kit.sdk.C29073m.EnumC29084c.f68744d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        r7.f68726s.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f2, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo50741a() {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.C29073m.mo50741a():int");
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final boolean hasAccessToScope(String str) {
        return this.f68720m.mo50733a(str);
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final void startTokenGrantWithOptions(C28958f fVar) {
        this.f68722o = false;
        m58070a(fVar);
    }

    /* renamed from: com.snapchat.kit.sdk.m$a */
    static class AsyncTaskC29082a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final WeakReference<C29073m> f68738a;

        static {
            Covode.recordClassIndex(35431);
        }

        private AsyncTaskC29082a(C29073m mVar) {
            this.f68738a = new WeakReference<>(mVar);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ Void doInBackground(Void[] voidArr) {
            C29073m mVar = this.f68738a.get();
            if (mVar == null) {
                return null;
            }
            mVar.mo50741a();
            return null;
        }

        /* synthetic */ AsyncTaskC29082a(C29073m mVar, byte b) {
            this(mVar);
        }
    }

    @Override // com.snapchat.kit.sdk.core.networking.AuthTokenManager
    public final void refreshAccessToken(RefreshAccessTokenResult refreshAccessTokenResult) {
        new AsyncTaskC29083b(this, refreshAccessTokenResult, (byte) 0).execute(new Void[0]);
    }

    /* renamed from: com.snapchat.kit.sdk.m$b */
    static class AsyncTaskC29083b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final WeakReference<C29073m> f68739a;

        /* renamed from: b */
        private final RefreshAccessTokenResult f68740b;

        static {
            Covode.recordClassIndex(35432);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ Void doInBackground(Void[] voidArr) {
            EnumC29026b bVar;
            C29073m mVar = this.f68739a.get();
            if (mVar == null) {
                return null;
            }
            int a = mVar.mo50741a();
            String accessToken = mVar.getAccessToken();
            if (a != EnumC29084c.f68745e || accessToken == null) {
                int i = C290815.f68737a[a - 1];
                if (i == 1) {
                    bVar = EnumC29026b.REVOKED_SESSION;
                } else if (i == 2) {
                    bVar = EnumC29026b.NO_REFRESH_TOKEN;
                } else if (i == 3) {
                    bVar = EnumC29026b.NETWORK_ERROR;
                } else if (i != 4) {
                    bVar = EnumC29026b.UNKNOWN;
                } else {
                    bVar = EnumC29026b.BUSY;
                }
                C29073m.m58071a(mVar, this.f68740b, false, null, bVar);
                return null;
            }
            C29073m.m58071a(mVar, this.f68740b, true, accessToken, null);
            return null;
        }

        private AsyncTaskC29083b(C29073m mVar, RefreshAccessTokenResult refreshAccessTokenResult) {
            this.f68739a = new WeakReference<>(mVar);
            this.f68740b = refreshAccessTokenResult;
        }

        /* synthetic */ AsyncTaskC29083b(C29073m mVar, RefreshAccessTokenResult refreshAccessTokenResult, byte b) {
            this(mVar, refreshAccessTokenResult);
        }
    }

    /* renamed from: a */
    private void m58070a(C28958f fVar) {
        if (!TextUtils.isEmpty(this.f68710c)) {
            List<String> list = this.f68711d;
            if (list == null || list.isEmpty()) {
                throw new IllegalStateException("Valid scopes must be set");
            }
            C28954b a = C29067h.m58060a(this.f68709b, this.f68710c, this.f68711d, fVar, this.f68717j, this.f68718k, this.f68722o);
            this.f68719l = a;
            PackageManager packageManager = this.f68723p.getPackageManager();
            String str = C28948a.f68393a;
            if (this.f68721n < 3 && C28949b.m57972a(packageManager, str)) {
                Context context = this.f68723p;
                if (m58073a(context, packageManager, str, a.toUri("snapchat://", "oauth2", context.getPackageName(), null))) {
                    if (this.f68722o) {
                        this.f68716i.mo50270a("authSnapchatForFirebase");
                    } else {
                        this.f68716i.mo50270a("authSnapchat");
                    }
                    this.f68714g.get().push(this.f68715h.mo50373a(fVar, this.f68722o));
                    this.f68721n++;
                    return;
                }
            }
            Uri uri = a.toUri("https://accounts.snapchat.com/accounts", "/oauth2/auth", null, "snapkit_web");
            if (this.f68722o) {
                this.f68716i.mo50270a("authWebForFirebase");
            } else {
                this.f68716i.mo50270a("authWeb");
            }
            m58068a(uri, this.f68723p);
            this.f68714g.get().push(this.f68715h.mo50373a(fVar, this.f68722o));
            return;
        }
        throw new IllegalStateException("Redirect URL must be set!");
    }

    /* renamed from: a */
    static void m58072a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* renamed from: a */
    private static void m58067a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static void m58068a(Uri uri, Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            m58067a(context, intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m58074b(C28954b bVar, String str) {
        this.f68716i.mo50268a(C28942a.EnumC28943a.FIREBASE_TOKEN_GRANT);
        this.f68725r.get().mo50704a(str, bVar.getRedirectUri(), bVar.getCodeVerifier(), new CompletionCallback<String>() {
            /* class com.snapchat.kit.sdk.C29073m.C290793 */

            static {
                Covode.recordClassIndex(35428);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.snapchat.kit.sdk.core.networking.CompletionCallback
            public final /* synthetic */ void onSuccess(String str) {
                String str2 = str;
                if (TextUtils.isEmpty(str2)) {
                    C29073m.this.f68716i.mo50269a(C28942a.EnumC28943a.FIREBASE_TOKEN_GRANT, false);
                    EnumC28970a aVar = EnumC28970a.FIREBASE_CUSTOM_TOKEN_FETCH_FAILURE;
                    aVar.errorDescription = "Token fetch request succeeded but response Token is Null or Empty";
                    C29073m.this.mo50743a(aVar);
                    return;
                }
                C29073m.this.f68716i.mo50269a(C28942a.EnumC28943a.FIREBASE_TOKEN_GRANT, true);
                C29073m mVar = C29073m.this;
                mVar.f68714g.get().push(mVar.f68715h.mo50374a(true, true));
                C28971b bVar = mVar.f68712e;
                bVar.f68447b.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0044: INVOKE  
                      (wrap: android.os.Handler : 0x003d: IGET  (r1v3 android.os.Handler) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b) com.snapchat.kit.sdk.core.controller.b.b android.os.Handler)
                      (wrap: com.snapchat.kit.sdk.core.controller.b$5 : 0x0041: CONSTRUCTOR  (r0v6 com.snapchat.kit.sdk.core.controller.b$5) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b), (r5v1 'str2' java.lang.String) call: com.snapchat.kit.sdk.core.controller.b.5.<init>(com.snapchat.kit.sdk.core.controller.b, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.snapchat.kit.sdk.m.3.onSuccess(java.lang.String):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: CONSTRUCTOR  (r0v6 com.snapchat.kit.sdk.core.controller.b$5) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b), (r5v1 'str2' java.lang.String) call: com.snapchat.kit.sdk.core.controller.b.5.<init>(com.snapchat.kit.sdk.core.controller.b, java.lang.String):void type: CONSTRUCTOR in method: com.snapchat.kit.sdk.m.3.onSuccess(java.lang.String):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 18 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.snapchat.kit.sdk.core.controller.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 24 more
                    */
                /*
                    this = this;
                    java.lang.String r5 = (java.lang.String) r5
                    boolean r0 = android.text.TextUtils.isEmpty(r5)
                    if (r0 == 0) goto L_0x001e
                    com.snapchat.kit.sdk.m r0 = com.snapchat.kit.sdk.C29073m.this
                    com.snapchat.kit.sdk.a.a r2 = r0.f68716i
                    com.snapchat.kit.sdk.a.a$a r1 = com.snapchat.kit.sdk.p2065a.C28942a.EnumC28943a.FIREBASE_TOKEN_GRANT
                    r0 = 0
                    r2.mo50269a(r1, r0)
                    com.snapchat.kit.sdk.core.controller.a r1 = com.snapchat.kit.sdk.core.controller.EnumC28970a.FIREBASE_CUSTOM_TOKEN_FETCH_FAILURE
                    java.lang.String r0 = "Token fetch request succeeded but response Token is Null or Empty"
                    r1.errorDescription = r0
                    com.snapchat.kit.sdk.m r0 = com.snapchat.kit.sdk.C29073m.this
                    r0.mo50743a(r1)
                    return
                L_0x001e:
                    com.snapchat.kit.sdk.m r0 = com.snapchat.kit.sdk.C29073m.this
                    com.snapchat.kit.sdk.a.a r1 = r0.f68716i
                    com.snapchat.kit.sdk.a.a$a r0 = com.snapchat.kit.sdk.p2065a.C28942a.EnumC28943a.FIREBASE_TOKEN_GRANT
                    r3 = 1
                    r1.mo50269a(r0, r3)
                    com.snapchat.kit.sdk.m r2 = com.snapchat.kit.sdk.C29073m.this
                    dagger.a<com.snapchat.kit.sdk.core.metrics.MetricQueue<com.snapchat.kit.sdk.core.metrics.model.ServerEvent>> r0 = r2.f68714g
                    java.lang.Object r1 = r0.get()
                    com.snapchat.kit.sdk.core.metrics.MetricQueue r1 = (com.snapchat.kit.sdk.core.metrics.MetricQueue) r1
                    com.snapchat.kit.sdk.core.metrics.c.f r0 = r2.f68715h
                    com.snapchat.kit.sdk.core.metrics.model.ServerEvent r0 = r0.mo50374a(r3, r3)
                    r1.push(r0)
                    com.snapchat.kit.sdk.core.controller.b r2 = r2.f68712e
                    android.os.Handler r1 = r2.f68447b
                    com.snapchat.kit.sdk.core.controller.b$5 r0 = new com.snapchat.kit.sdk.core.controller.b$5
                    r0.<init>(r5)
                    r1.post(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.C29073m.C290793.onSuccess(java.lang.Object):void");
            }

            @Override // com.snapchat.kit.sdk.core.networking.CompletionCallback
            public final void onFailure(boolean z, int i, String str) {
                C29073m.this.f68716i.mo50269a(C28942a.EnumC28943a.FIREBASE_TOKEN_GRANT, false);
                EnumC28970a aVar = EnumC28970a.FIREBASE_CUSTOM_TOKEN_FETCH_FAILURE;
                aVar.errorDescription = str;
                C29073m.this.mo50743a(aVar);
            }
        });
    }

    /* renamed from: a */
    private static Request m58066a(AbstractC90025ab abVar, String str) {
        return new Request.C90016a().mo144692a("Content-Type", "application/x-www-form-urlencoded").mo144691a(C1764a.m5928a("%s%s", new Object[]{"https://accounts.snapchat.com", str})).mo144693a("POST", abVar).mo144698a();
    }

    /* renamed from: a */
    private void m58069a(C28954b bVar, String str) {
        C90195q.C90196a aVar = new C90195q.C90196a();
        aVar.mo145022a("grant_type", "authorization_code");
        aVar.mo145022a("code", str);
        aVar.mo145022a("redirect_uri", bVar.getRedirectUri());
        aVar.mo145022a("client_id", this.f68709b);
        aVar.mo145022a("code_verifier", bVar.getCodeVerifier());
        Request a = m58066a(aVar.mo145023a(), "/accounts/oauth2/token");
        if (a == null) {
            mo50744b();
            return;
        }
        this.f68712e.mo50335c();
        this.f68716i.mo50268a(C28942a.EnumC28943a.GRANT);
        C90022aa.m156235a(this.f68724q, a, false).mo144708a(new AbstractC90051f() {
            /* class com.snapchat.kit.sdk.C29073m.C290752 */

            static {
                Covode.recordClassIndex(35424);
            }

            @Override // okhttp3.AbstractC90051f
            public final void onFailure(AbstractC90049e eVar, IOException iOException) {
                C29073m.m58072a(new Runnable() {
                    /* class com.snapchat.kit.sdk.C29073m.C290752.RunnableC290761 */

                    static {
                        Covode.recordClassIndex(35425);
                    }

                    public final void run() {
                        C29073m.this.f68716i.mo50269a(C28942a.EnumC28943a.GRANT, false);
                        C29073m.this.mo50744b();
                    }
                });
            }

            @Override // okhttp3.AbstractC90051f
            public final void onResponse(AbstractC90049e eVar, C90029ac acVar) {
                if (!(!acVar.mo144720a() || acVar.f204111g == null || acVar.f204111g.charStream() == null)) {
                    C28953a aVar = (C28953a) C29073m.this.f68713f.mo46669a(acVar.f204111g.charStream(), C28953a.class);
                    aVar.setLastUpdated(System.currentTimeMillis());
                    if (aVar.isComplete()) {
                        C29073m.this.f68720m.mo50731a(aVar);
                        C29073m.this.f68719l = null;
                        C29073m.this.f68716i.mo50269a(C28942a.EnumC28943a.GRANT, true);
                        C29073m.m58072a(new Runnable() {
                            /* class com.snapchat.kit.sdk.C29073m.C290752.RunnableC290772 */

                            static {
                                Covode.recordClassIndex(35426);
                            }

                            public final void run() {
                                C29073m mVar = C29073m.this;
                                mVar.f68714g.get().push(mVar.f68715h.mo50374a(true, false));
                                C28971b bVar = mVar.f68712e;
                                bVar.f68447b.post(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: INVOKE  
                                      (wrap: android.os.Handler : 0x0019: IGET  (r1v1 android.os.Handler) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b) com.snapchat.kit.sdk.core.controller.b.b android.os.Handler)
                                      (wrap: com.snapchat.kit.sdk.core.controller.b$3 : 0x001d: CONSTRUCTOR  (r0v4 com.snapchat.kit.sdk.core.controller.b$3) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b) call: com.snapchat.kit.sdk.core.controller.b.3.<init>(com.snapchat.kit.sdk.core.controller.b):void type: CONSTRUCTOR)
                                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.snapchat.kit.sdk.m.2.2.run():void, file: classes9.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r0v4 com.snapchat.kit.sdk.core.controller.b$3) = (r2v1 'bVar' com.snapchat.kit.sdk.core.controller.b) call: com.snapchat.kit.sdk.core.controller.b.3.<init>(com.snapchat.kit.sdk.core.controller.b):void type: CONSTRUCTOR in method: com.snapchat.kit.sdk.m.2.2.run():void, file: classes9.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 14 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.snapchat.kit.sdk.core.controller.b, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 20 more
                                    */
                                /*
                                    this = this;
                                    com.snapchat.kit.sdk.m$2 r0 = com.snapchat.kit.sdk.C29073m.C290752.this
                                    com.snapchat.kit.sdk.m r4 = com.snapchat.kit.sdk.C29073m.this
                                    dagger.a<com.snapchat.kit.sdk.core.metrics.MetricQueue<com.snapchat.kit.sdk.core.metrics.model.ServerEvent>> r0 = r4.f68714g
                                    java.lang.Object r3 = r0.get()
                                    com.snapchat.kit.sdk.core.metrics.MetricQueue r3 = (com.snapchat.kit.sdk.core.metrics.MetricQueue) r3
                                    com.snapchat.kit.sdk.core.metrics.c.f r2 = r4.f68715h
                                    r1 = 1
                                    r0 = 0
                                    com.snapchat.kit.sdk.core.metrics.model.ServerEvent r0 = r2.mo50374a(r1, r0)
                                    r3.push(r0)
                                    com.snapchat.kit.sdk.core.controller.b r2 = r4.f68712e
                                    android.os.Handler r1 = r2.f68447b
                                    com.snapchat.kit.sdk.core.controller.b$3 r0 = new com.snapchat.kit.sdk.core.controller.b$3
                                    r0.<init>()
                                    r1.post(r0)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.C29073m.C290752.RunnableC290772.run():void");
                            }
                        });
                        return;
                    }
                }
                C29073m.m58072a(new Runnable() {
                    /* class com.snapchat.kit.sdk.C29073m.C290752.RunnableC290783 */

                    static {
                        Covode.recordClassIndex(35427);
                    }

                    public final void run() {
                        C29073m.this.f68716i.mo50269a(C28942a.EnumC28943a.GRANT, false);
                        C29073m.this.mo50744b();
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private static boolean m58073a(Context context, PackageManager packageManager, String str, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage(str);
        intent.setFlags(268435456);
        if (intent.resolveActivity(packageManager) == null) {
            return false;
        }
        m58067a(context, intent);
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ void m58071a(C29073m mVar, final RefreshAccessTokenResult refreshAccessTokenResult, final boolean z, final String str, final EnumC29026b bVar) {
        m58072a(new Runnable() {
            /* class com.snapchat.kit.sdk.C29073m.RunnableC290804 */

            static {
                Covode.recordClassIndex(35429);
            }

            public final void run() {
                if (z) {
                    refreshAccessTokenResult.onRefreshAccessTokenSuccess(str);
                } else {
                    refreshAccessTokenResult.onRefreshAccessTokenFailure(bVar);
                }
            }
        });
    }

    C29073m(String str, String str2, List<String> list, Context context, SecureSharedPreferences secureSharedPreferences, C29072l lVar, C28971b bVar, C90208y yVar, AbstractC88075a<C29037l> aVar, C27910f fVar, AbstractC88075a<MetricQueue<ServerEvent>> aVar2, C29001f fVar2, AbstractC88075a<MetricQueue<OpMetric>> aVar3, KitPluginType kitPluginType, boolean z) {
        this.f68709b = str;
        this.f68710c = str2;
        this.f68711d = list;
        this.f68723p = context;
        this.f68712e = bVar;
        this.f68724q = yVar;
        this.f68725r = aVar;
        this.f68713f = fVar;
        this.f68714g = aVar2;
        this.f68715h = fVar2;
        this.f68716i = new C28942a(aVar3);
        C29064e eVar = new C29064e(secureSharedPreferences, lVar);
        this.f68720m = eVar;
        this.f68717j = kitPluginType;
        this.f68718k = z;
        if (eVar.mo50732a()) {
            new AsyncTaskC29082a(this, (byte) 0).execute(new Void[0]);
        }
    }
}
