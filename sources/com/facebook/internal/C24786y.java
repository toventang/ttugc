package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.facebook.C24798j;
import com.facebook.C24815l;
import com.facebook.C24872m;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.login.EnumC24862b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.y */
public final class C24786y {

    /* renamed from: a */
    private static final String f58818a = C24786y.class.getName();

    /* renamed from: b */
    private static final List<AbstractC24792e> f58819b = m47488e();

    /* renamed from: c */
    private static final List<AbstractC24792e> f58820c = m47490f();

    /* renamed from: d */
    private static final Map<String, List<AbstractC24792e>> f58821d = m47492g();

    /* renamed from: e */
    private static final AtomicBoolean f58822e = new AtomicBoolean(false);

    /* renamed from: f */
    private static final List<Integer> f58823f = Arrays.asList(20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101);

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.y$e */
    public static abstract class AbstractC24792e {

        /* renamed from: a */
        TreeSet<Integer> f58824a;

        static {
            Covode.recordClassIndex(28945);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract String mo40602a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract String mo40603b();

        private AbstractC24792e() {
        }

        /* synthetic */ AbstractC24792e(byte b) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            if (r0.isEmpty() == false) goto L_0x0013;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void mo40604a(boolean r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 != 0) goto L_0x000d
                java.util.TreeSet<java.lang.Integer> r0 = r1.f58824a     // Catch:{ all -> 0x0015 }
                if (r0 == 0) goto L_0x000d
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0015 }
                if (r0 == 0) goto L_0x0013
            L_0x000d:
                java.util.TreeSet r0 = com.facebook.internal.C24786y.m47472a(r1)     // Catch:{ all -> 0x0015 }
                r1.f58824a = r0     // Catch:{ all -> 0x0015 }
            L_0x0013:
                monitor-exit(r1)
                return
            L_0x0015:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C24786y.AbstractC24792e.mo40604a(boolean):void");
        }
    }

    /* renamed from: com.facebook.internal.y$f */
    public static class C24793f {

        /* renamed from: a */
        public AbstractC24792e f58825a;

        /* renamed from: b */
        public int f58826b;

        static {
            Covode.recordClassIndex(28946);
        }

        C24793f() {
        }

        /* renamed from: a */
        public static C24793f m47505a() {
            C24793f fVar = new C24793f();
            fVar.f58826b = -1;
            return fVar;
        }
    }

    /* renamed from: a */
    static /* synthetic */ TreeSet m47472a(AbstractC24792e eVar) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            return m47480b(eVar);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    private static Intent m47465a(AbstractC24792e eVar, String str, Collection<String> collection, String str2, boolean z, EnumC24862b bVar, String str3, String str4, boolean z2) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            String b = eVar.mo40603b();
            if (b == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.mo40602a(), b).putExtra("client_id", str);
            putExtra.putExtra("facebook_sdk_version", "9.0.0");
            if (!C24693ad.m47262a(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!C24693ad.m47261a(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", "token,signed_request,graph_domain");
            putExtra.putExtra("return_scopes", "true");
            if (z) {
                putExtra.putExtra("default_audience", bVar.getNativeProtocolAudience());
            }
            putExtra.putExtra("legacy_override", C24872m.m47693e());
            putExtra.putExtra("auth_type", str4);
            if (z2) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            return putExtra;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    public static List<Intent> m47471a(String str, Collection<String> collection, String str2, boolean z, EnumC24862b bVar, String str3, String str4, boolean z2) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (AbstractC24792e eVar : f58819b) {
                Intent a = m47465a(eVar, str, collection, str2, z, bVar, str3, str4, z2);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m47475a(int i) {
        if (C24677a.m47209a(C24786y.class)) {
            return false;
        }
        try {
            return f58823f.contains(Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return false;
        }
    }

    /* renamed from: a */
    public static UUID m47473a(Intent intent) {
        String str;
        if (C24677a.m47209a(C24786y.class) || intent == null) {
            return null;
        }
        try {
            if (m47475a(m47487e(intent))) {
                Bundle a = m47466a(intent, "com.facebook.platform.protocol.BRIDGE_ARGS");
                str = a != null ? a.getString("action_id") : null;
            } else {
                str = m47479b(intent, "com.facebook.platform.protocol.CALL_ID");
            }
            if (str == null) {
                return null;
            }
            try {
                return UUID.fromString(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    public static C24798j m47470a(Bundle bundle) {
        if (C24677a.m47209a(C24786y.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
                return new C24798j(string2);
            }
            return new C24815l(string2);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    public static Bundle m47467a(C24798j jVar) {
        if (C24677a.m47209a(C24786y.class) || jVar == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", jVar.toString());
            if (jVar instanceof C24815l) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    public static C24793f m47468a(String str, int[] iArr) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            return m47469a(f58821d.get(str), iArr);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    private static C24793f m47469a(List<AbstractC24792e> list, int[] iArr) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            m47481b();
            if (list == null) {
                return C24793f.m47505a();
            }
            for (AbstractC24792e eVar : list) {
                if (eVar.f58824a == null || eVar.f58824a.isEmpty()) {
                    eVar.mo40604a(false);
                }
                int a = m47459a(eVar.f58824a, m47458a(), iArr);
                if (a != -1) {
                    C24793f fVar = new C24793f();
                    fVar.f58825a = eVar;
                    fVar.f58826b = a;
                    return fVar;
                }
            }
            return C24793f.m47505a();
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    private static Bundle m47466a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    /* renamed from: a */
    public static void m47474a(Intent intent, String str, String str2, int i, Bundle bundle) {
        if (!C24677a.m47209a(C24786y.class)) {
            try {
                C24699ae.m47299a();
                String str3 = C24872m.f59041a;
                C24699ae.m47299a();
                String str4 = C24872m.f59042b;
                intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", str3);
                if (m47475a(i)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("action_id", str);
                    C24693ad.m47249a(bundle2, "app_name", str4);
                    intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
                    return;
                }
                intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
                if (!C24693ad.m47261a(str4)) {
                    intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", str4);
                }
                intent.putExtras(bundle);
            } catch (Throwable th) {
                C24677a.m47208a(th, C24786y.class);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.y$a */
    public static class C24788a extends AbstractC24792e {
        static {
            Covode.recordClassIndex(28941);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.C24786y.AbstractC24792e
        /* renamed from: a */
        public final String mo40602a() {
            return "com.facebook.arstudio.player";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.C24786y.AbstractC24792e
        /* renamed from: b */
        public final String mo40603b() {
            return null;
        }

        private C24788a() {
            super((byte) 0);
        }

        /* synthetic */ C24788a(byte b) {
            this();
        }
    }

    /* renamed from: com.facebook.internal.y$b */
    static class C24789b extends AbstractC24792e {
        static {
            Covode.recordClassIndex(28942);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.C24786y.AbstractC24792e
        /* renamed from: a */
        public final String mo40602a() {
            return "com.facebook.lite";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.C24786y.AbstractC24792e
        /* renamed from: b */
        public final String mo40603b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        private C24789b() {
            super((byte) 0);
        }

        /* synthetic */ C24789b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.y$c */
    public static class C24790c extends AbstractC24792e {
        static {
            Covode.recordClassIndex(28943);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.C24786y.AbstractC24792e
        /* renamed from: a */
        public final String mo40602a() {
            return "com.facebook.katana";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.C24786y.AbstractC24792e
        /* renamed from: b */
        public final String mo40603b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private C24790c() {
            super((byte) 0);
        }

        /* synthetic */ C24790c(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.y$d */
    public static class C24791d extends AbstractC24792e {
        static {
            Covode.recordClassIndex(28944);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.C24786y.AbstractC24792e
        /* renamed from: a */
        public final String mo40602a() {
            return "com.facebook.orca";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.C24786y.AbstractC24792e
        /* renamed from: b */
        public final String mo40603b() {
            return null;
        }

        private C24791d() {
            super((byte) 0);
        }

        /* synthetic */ C24791d(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.y$g */
    public static class C24794g extends AbstractC24792e {
        static {
            Covode.recordClassIndex(28947);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.C24786y.AbstractC24792e
        /* renamed from: a */
        public final String mo40602a() {
            return "com.facebook.wakizashi";
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.internal.C24786y.AbstractC24792e
        /* renamed from: b */
        public final String mo40603b() {
            return "com.facebook.katana.ProxyAuth";
        }

        private C24794g() {
            super((byte) 0);
        }

        /* synthetic */ C24794g(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static final int m47458a() {
        if (C24677a.m47209a(C24786y.class)) {
            return 0;
        }
        try {
            return f58823f.get(0).intValue();
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return 0;
        }
    }

    /* renamed from: c */
    static /* synthetic */ List m47484c() {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            return f58819b;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ AtomicBoolean m47486d() {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            return f58822e;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: e */
    private static List<AbstractC24792e> m47488e() {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C24790c((byte) 0));
            arrayList.add(new C24794g((byte) 0));
            return arrayList;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: f */
    private static List<AbstractC24792e> m47490f() {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(m47488e());
            arrayList.add(0, new C24788a((byte) 0));
            return arrayList;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: g */
    private static Map<String, List<AbstractC24792e>> m47492g() {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C24791d((byte) 0));
            List<AbstractC24792e> list = f58819b;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f58820c);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(28939);
    }

    /* renamed from: b */
    public static void m47481b() {
        if (!C24677a.m47209a(C24786y.class)) {
            try {
                if (f58822e.compareAndSet(false, true)) {
                    C24872m.m47689c().execute(new Runnable() {
                        /* class com.facebook.internal.C24786y.RunnableC247871 */

                        static {
                            Covode.recordClassIndex(28940);
                        }

                        public final void run() {
                            if (!C24677a.m47209a(this)) {
                                try {
                                    for (AbstractC24792e eVar : C24786y.m47484c()) {
                                        eVar.mo40604a(true);
                                    }
                                    C24786y.m47486d().set(false);
                                } catch (Throwable th) {
                                    C24677a.m47208a(th, this);
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24786y.class);
            }
        }
    }

    /* renamed from: g */
    private static Bundle m47491g(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static int m47476b(int i) {
        if (C24677a.m47209a(C24786y.class)) {
            return 0;
        }
        try {
            return m47469a(f58819b, new int[]{i}).f58826b;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return 0;
        }
    }

    /* renamed from: e */
    private static int m47487e(Intent intent) {
        if (C24677a.m47209a(C24786y.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return 0;
        }
    }

    /* renamed from: a */
    public static Intent m47460a(Context context) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            for (AbstractC24792e eVar : f58819b) {
                Intent b = m47477b(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.mo40602a()).addCategory("android.intent.category.DEFAULT"));
                if (b != null) {
                    return b;
                }
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: c */
    private static Uri m47482c(AbstractC24792e eVar) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            return Uri.parse("content://" + eVar.mo40602a() + ".provider.PlatformProvider/versions");
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: d */
    public static Bundle m47485d(Intent intent) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            if (!m47493h(intent)) {
                return null;
            }
            Bundle f = m47489f(intent);
            if (f != null) {
                return f.getBundle("error");
            }
            return m47491g(intent);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: f */
    private static Bundle m47489f(Intent intent) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            if (!m47475a(m47487e(intent))) {
                return null;
            }
            return m47466a(intent, "com.facebook.platform.protocol.BRIDGE_ARGS");
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: h */
    private static boolean m47493h(Intent intent) {
        if (C24677a.m47209a(C24786y.class)) {
            return false;
        }
        try {
            Bundle f = m47489f(intent);
            if (f != null) {
                return f.containsKey("error");
            }
            return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return false;
        }
    }

    /* renamed from: b */
    public static Bundle m47478b(Intent intent) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            if (!m47475a(m47487e(intent))) {
                return m47491g(intent);
            }
            return m47466a(intent, "com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: c */
    public static Bundle m47483c(Intent intent) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            int e = m47487e(intent);
            Bundle g = m47491g(intent);
            if (!m47475a(e) || g == null) {
                return g;
            }
            return g.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.TreeSet<java.lang.Integer> m47480b(com.facebook.internal.C24786y.AbstractC24792e r13) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C24786y.m47480b(com.facebook.internal.y$e):java.util.TreeSet");
    }

    /* renamed from: b */
    private static String m47479b(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Intent m47477b(Context context, Intent intent) {
        if (C24677a.m47209a(C24786y.class) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && C24756m.m47401a(context, resolveService.serviceInfo.packageName)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    private static Intent m47461a(Context context, Intent intent) {
        if (C24677a.m47209a(C24786y.class) || intent == null) {
            return null;
        }
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity != null && C24756m.m47401a(context, resolveActivity.activityInfo.packageName)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    private static int m47459a(TreeSet<Integer> treeSet, int i, int[] iArr) {
        if (C24677a.m47209a(C24786y.class)) {
            return 0;
        }
        try {
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i2 = -1;
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                int intValue = descendingIterator.next().intValue();
                i2 = Math.max(i2, intValue);
                while (length >= 0) {
                    if (iArr[length] > intValue) {
                        length--;
                    } else if (iArr[length] == intValue) {
                        if (length % 2 == 0) {
                            return Math.min(i2, i);
                        }
                    }
                }
                return -1;
            }
            return -1;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return 0;
        }
    }

    /* renamed from: a */
    public static Intent m47464a(Intent intent, Bundle bundle, C24798j jVar) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            UUID a = m47473a(intent);
            if (a == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m47487e(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", a.toString());
            if (jVar != null) {
                bundle2.putBundle("error", m47467a(jVar));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m47462a(Context context, String str, String str2, C24793f fVar, Bundle bundle) {
        Intent a;
        if (C24677a.m47209a(C24786y.class) || fVar == null) {
            return null;
        }
        try {
            AbstractC24792e eVar = fVar.f58825a;
            if (eVar == null || (a = m47461a(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(eVar.mo40602a()).addCategory("android.intent.category.DEFAULT"))) == null) {
                return null;
            }
            m47474a(a, str, str2, fVar.f58826b, bundle);
            return a;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m47463a(Context context, String str, Collection<String> collection, String str2, boolean z, EnumC24862b bVar, String str3, String str4) {
        if (C24677a.m47209a(C24786y.class)) {
            return null;
        }
        try {
            return m47461a(context, m47465a(new C24789b((byte) 0), str, collection, str2, z, bVar, str3, str4, false));
        } catch (Throwable th) {
            C24677a.m47208a(th, C24786y.class);
            return null;
        }
    }
}
