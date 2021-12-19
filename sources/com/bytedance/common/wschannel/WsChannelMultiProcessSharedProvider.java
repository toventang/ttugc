package com.bytedance.common.wschannel;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.C13756k;
import com.bytedance.common.wschannel.p921e.C13747d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WsChannelMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f33131a;

    /* renamed from: b */
    public static Uri f33132b;

    /* renamed from: c */
    public static boolean f33133c;

    /* renamed from: d */
    private static UriMatcher f33134d;

    /* renamed from: g */
    private static volatile boolean f33135g;

    /* renamed from: i */
    private static C13641b f33136i;

    /* renamed from: e */
    private SharedPreferences f33137e;

    /* renamed from: f */
    private Map<String, Object> f33138f = new ConcurrentHashMap();

    /* renamed from: h */
    private final Object f33139h = new Object();

    static {
        Covode.recordClassIndex(15668);
    }

    /* renamed from: a */
    public final void mo21906a(Uri uri) {
        MethodCollector.m26663i(11167);
        getContext().getContentResolver().notifyChange(uri, null);
        MethodCollector.m26664o(11167);
    }

    /* renamed from: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider$a */
    public static class C13640a {

        /* renamed from: a */
        Context f33143a;

        /* renamed from: b */
        public ContentValues f33144b;

        static {
            Covode.recordClassIndex(15670);
        }

        /* renamed from: a */
        public final synchronized void mo21915a() {
            MethodCollector.m26663i(11895);
            m24558b();
            MethodCollector.m26664o(11895);
        }

        /* renamed from: b */
        private synchronized void m24558b() {
            MethodCollector.m26663i(11725);
            try {
                this.f33143a.getContentResolver().insert(WsChannelMultiProcessSharedProvider.m24549a(this.f33143a, "key", StringSet.type), this.f33144b);
                MethodCollector.m26664o(11725);
            } catch (Throwable unused) {
                MethodCollector.m26664o(11725);
            }
        }

        private C13640a(Context context) {
            this.f33144b = new ContentValues();
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f33143a = applicationContext;
        }

        /* synthetic */ C13640a(Context context, byte b) {
            this(context);
        }
    }

    /* renamed from: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider$b */
    public static class C13641b {

        /* renamed from: a */
        private Context f33145a;

        /* renamed from: b */
        private boolean f33146b;

        /* renamed from: c */
        private SharedPreferences f33147c;

        static {
            Covode.recordClassIndex(15671);
        }

        /* renamed from: a */
        public final C13640a mo21917a() {
            return new C13640a(this.f33145a, (byte) 0);
        }

        /* renamed from: a */
        private static Context m24560a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        private C13641b(Context context) {
            boolean z;
            if (!C13747d.m24781a(context) || !WsChannelMultiProcessSharedProvider.f33133c) {
                z = false;
            } else {
                z = true;
            }
            this.f33146b = z;
            Context a = m24560a(context);
            this.f33145a = a;
            this.f33147c = C34822d.m71158a(m24560a(a), "wschannel_multi_process_config", 4);
            Logger.debug();
        }

        /* synthetic */ C13641b(Context context, byte b) {
            this(context);
        }

        /* renamed from: a */
        public final long mo21916a(String str, long j) {
            MethodCollector.m26663i(12434);
            try {
                if (this.f33146b) {
                    long j2 = this.f33147c.getLong(str, j);
                    MethodCollector.m26664o(12434);
                    return j2;
                }
                long a = WsChannelMultiProcessSharedProvider.m24547a(this.f33145a.getContentResolver().query(WsChannelMultiProcessSharedProvider.m24549a(this.f33145a, str, "long"), null, null, null, null), j);
                MethodCollector.m26664o(12434);
                return a;
            } catch (Throwable unused) {
                MethodCollector.m26664o(12434);
                return j;
            }
        }

        /* renamed from: a */
        public final String mo21918a(String str, String str2) {
            MethodCollector.m26663i(12320);
            try {
                if (this.f33146b) {
                    String string = this.f33147c.getString(str, str2);
                    MethodCollector.m26664o(12320);
                    return string;
                }
                String a = WsChannelMultiProcessSharedProvider.m24553a(this.f33145a.getContentResolver().query(WsChannelMultiProcessSharedProvider.m24549a(this.f33145a, str, "string"), null, null, null, null), str2);
                MethodCollector.m26664o(12320);
                return a;
            } catch (Throwable unused) {
                MethodCollector.m26664o(12320);
                return str2;
            }
        }

        /* renamed from: a */
        public final boolean mo21919a(String str, boolean z) {
            MethodCollector.m26663i(12550);
            try {
                if (this.f33146b) {
                    boolean z2 = this.f33147c.getBoolean(str, z);
                    MethodCollector.m26664o(12550);
                    return z2;
                }
                boolean a = WsChannelMultiProcessSharedProvider.m24554a(this.f33145a.getContentResolver().query(WsChannelMultiProcessSharedProvider.m24549a(this.f33145a, str, "boolean"), null, null, null, null), z);
                MethodCollector.m26664o(12550);
                return a;
            } catch (Throwable unused) {
                MethodCollector.m26664o(12550);
                return z;
            }
        }
    }

    /* renamed from: a */
    private synchronized SharedPreferences m24548a() {
        MethodCollector.m26663i(11318);
        SharedPreferences sharedPreferences = this.f33137e;
        if (sharedPreferences == null) {
            int i = Build.VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            SharedPreferences a = C34822d.m71158a(applicationContext, "wschannel_multi_process_config", 4);
            this.f33137e = a;
            MethodCollector.m26664o(11318);
            return a;
        }
        MethodCollector.m26664o(11318);
        return sharedPreferences;
    }

    /* renamed from: b */
    private void m24555b() {
        MethodCollector.m26663i(11471);
        if (!f33135g) {
            synchronized (this.f33139h) {
                try {
                    if (!f33135g) {
                        SharedPreferences a = m24548a();
                        if (a == null) {
                            f33135g = true;
                            return;
                        }
                        for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
                            Object value = entry.getValue();
                            this.f33138f.put(entry.getKey(), value);
                        }
                        f33135g = true;
                    }
                    MethodCollector.m26664o(11471);
                } finally {
                    MethodCollector.m26664o(11471);
                }
            }
        } else {
            MethodCollector.m26664o(11471);
        }
    }

    public boolean onCreate() {
        if (C13747d.m24781a(getContext())) {
            f33133c = true;
        }
        Context applicationContext = getContext().getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        Application application = (Application) applicationContext;
        C13734d dVar = new C13734d();
        dVar.f33376b = new C13756k.C13757a(application);
        application.registerActivityLifecycleCallbacks(dVar);
        if (f33134d == null) {
            try {
                Logger.debug();
                m24556b(getContext());
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + f33131a + ".item";
    }

    /* renamed from: a */
    public static synchronized C13641b m24550a(Context context) {
        C13641b bVar;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            MethodCollector.m26663i(11643);
            if (f33136i == null) {
                f33136i = new C13641b(context, (byte) 0);
            }
            bVar = f33136i;
            MethodCollector.m26664o(11643);
        }
        return bVar;
    }

    /* renamed from: b */
    private static void m24556b(Context context) {
        if (TextUtils.isEmpty(f33131a)) {
            f33131a = m24552a(context, WsChannelMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f33131a)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            f33134d = uriMatcher;
            uriMatcher.addURI(f33131a, "*/*", 65536);
            f33132b = Uri.parse("content://" + f33131a);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    /* renamed from: a */
    private Runnable m24551a(final String str, final String str2) {
        return new Runnable() {
            /* class com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.RunnableC136391 */

            static {
                Covode.recordClassIndex(15669);
            }

            public final void run() {
                WsChannelMultiProcessSharedProvider wsChannelMultiProcessSharedProvider = WsChannelMultiProcessSharedProvider.this;
                wsChannelMultiProcessSharedProvider.mo21906a(WsChannelMultiProcessSharedProvider.m24549a(wsChannelMultiProcessSharedProvider.getContext(), str, str2));
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f33131a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m24547a(android.database.Cursor r1, long r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x000e
            r0 = 0
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x000e }
        L_0x000e:
            r1.close()     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.m24547a(android.database.Cursor, long):long");
    }

    /* renamed from: a */
    private static String m24552a(Context context, String str) {
        if (context != null && !C13627m.m24498a(str)) {
            try {
                ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str.equals(providerInfo.name)) {
                        return providerInfo.authority;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Runnable runnable;
        String str;
        if (f33134d.match(uri) == 65536) {
            try {
                m24555b();
                ArrayList<Runnable> arrayList = new ArrayList();
                SharedPreferences.Editor editor = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    Logger.debug();
                    if (value == null) {
                        this.f33138f.remove(key);
                    } else {
                        Object obj = this.f33138f.get(key);
                        if (obj == null || !obj.equals(value)) {
                            this.f33138f.put(key, value);
                        }
                    }
                    if (Logger.debug()) {
                        if (("MultiProcessShareProvider reallly insert key = " + key + " value = " + value) != null) {
                            str = value.toString();
                        } else {
                            str = "null";
                        }
                        Logger.m24408v("PushService", str);
                    }
                    if (editor == null) {
                        editor = m24548a().edit();
                    }
                    if (value == null) {
                        editor.remove(key);
                    } else {
                        if (value instanceof String) {
                            editor.putString(key, (String) value);
                            runnable = m24551a(key, "string");
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(key, ((Boolean) value).booleanValue());
                            runnable = m24551a(key, "boolean");
                        } else if (value instanceof Long) {
                            editor.putLong(key, ((Long) value).longValue());
                            runnable = m24551a(key, "long");
                        } else if (value instanceof Integer) {
                            editor.putInt(key, ((Integer) value).intValue());
                            runnable = m24551a(key, "integer");
                        } else if (value instanceof Float) {
                            editor.putFloat(key, ((Float) value).floatValue());
                            runnable = m24551a(key, "float");
                        } else {
                            throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(uri)));
                        }
                        if (runnable != null) {
                            arrayList.add(runnable);
                        }
                    }
                }
                if (editor == null) {
                    return null;
                }
                int i = Build.VERSION.SDK_INT;
                editor.apply();
                for (Runnable runnable2 : arrayList) {
                    runnable2.run();
                }
                return null;
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24553a(android.database.Cursor r1, java.lang.String r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x000e
            r0 = 0
            java.lang.String r2 = r1.getString(r0)     // Catch:{ all -> 0x000e }
        L_0x000e:
            r1.close()     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.m24553a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24554a(android.database.Cursor r1, boolean r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0013
            r0 = 0
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0013 }
            if (r0 <= 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r1.close()     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.m24554a(android.database.Cursor, boolean):boolean");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (f33134d.match(uri) == 65536) {
            try {
                m24548a().edit().clear().commit();
                this.f33138f.clear();
                mo21906a(m24549a(getContext(), "key", StringSet.type));
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    /* renamed from: a */
    public static final synchronized Uri m24549a(Context context, String str, String str2) {
        Uri build;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            MethodCollector.m26663i(11803);
            if (f33132b == null) {
                try {
                    Logger.debug();
                    m24556b(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    MethodCollector.m26664o(11803);
                    return null;
                }
            }
            build = f33132b.buildUpon().appendPath(str).appendPath(str2).build();
            MethodCollector.m26664o(11803);
        }
        return build;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        if (f33134d.match(uri) == 65536) {
            MatrixCursor matrixCursor = null;
            try {
                int i2 = 1;
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = m24548a().getAll();
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                    try {
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            MatrixCursor.RowBuilder newRow = matrixCursor2.newRow();
                            String str3 = "string";
                            if (!(value instanceof String)) {
                                if (value instanceof Boolean) {
                                    str3 = "boolean";
                                    if (((Boolean) value).booleanValue()) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    value = Integer.valueOf(i);
                                } else if (value instanceof Integer) {
                                    str3 = "integer";
                                } else if (value instanceof Long) {
                                    str3 = "long";
                                } else if (value instanceof Float) {
                                    str3 = "float";
                                }
                            }
                            newRow.add(key);
                            newRow.add(value);
                            newRow.add(str3);
                        }
                        return matrixCursor2;
                    } catch (Exception unused) {
                        matrixCursor = matrixCursor2;
                        return matrixCursor;
                    }
                } else {
                    String str4 = uri.getPathSegments().get(0);
                    m24555b();
                    if (!this.f33138f.containsKey(str4)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    Object obj = this.f33138f.get(str4);
                    MatrixCursor.RowBuilder newRow2 = matrixCursor3.newRow();
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i2 = 0;
                        }
                        obj = Integer.valueOf(i2);
                    }
                    Logger.debug();
                    newRow2.add(obj);
                    return matrixCursor3;
                }
            } catch (Exception unused2) {
                return matrixCursor;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }
}
