package com.p2082ss.android.pushmanager.setting;

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
import com.bytedance.common.p899b.C13498a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider */
public class PushMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f72063a;

    /* renamed from: b */
    public static Uri f72064b;

    /* renamed from: c */
    private static UriMatcher f72065c;

    /* renamed from: h */
    private static C30219b f72066h;

    /* renamed from: d */
    private SharedPreferences f72067d;

    /* renamed from: e */
    private Map<String, Object> f72068e = new ConcurrentHashMap();

    /* renamed from: f */
    private volatile boolean f72069f = false;

    /* renamed from: g */
    private final Object f72070g = new Object();

    static {
        Covode.recordClassIndex(36723);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m61127a(android.database.Cursor r1, boolean r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m61127a(android.database.Cursor, boolean):boolean");
    }

    /* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b */
    public static class C30219b {

        /* renamed from: a */
        private Context f72076a;

        /* renamed from: b */
        private boolean f72077b;

        /* renamed from: c */
        private SharedPreferences f72078c;

        static {
            Covode.recordClassIndex(36726);
        }

        /* renamed from: c */
        private static boolean m61137c() {
            C13498a.m24278a();
            if (!C13498a.f32875b) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final C30218a mo53660a() {
            return new C30218a(this.f72076a, (byte) 0);
        }

        /* renamed from: b */
        public final boolean mo53663b() {
            if (this.f72077b) {
                return m61137c();
            }
            return mo53662a("current_app_foreground", false);
        }

        /* renamed from: a */
        private static Context m61136a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        private C30219b(Context context) {
            this.f72077b = C30062a.m60803a(context);
            Context a = m61136a(context);
            this.f72076a = a;
            this.f72078c = C34822d.m71158a(m61136a(a), "push_multi_process_config", 4);
            Logger.debug();
        }

        /* renamed from: a */
        public final long mo53659a(String str) {
            MethodCollector.m26663i(572);
            try {
                if (this.f72077b) {
                    long j = this.f72078c.getLong(str, 0);
                    MethodCollector.m26664o(572);
                    return j;
                }
                long a = PushMultiProcessSharedProvider.m61120a(this.f72076a.getContentResolver().query(PushMultiProcessSharedProvider.m61122a(this.f72076a, str, "long"), null, null, null, null));
                MethodCollector.m26664o(572);
                return a;
            } catch (Throwable unused) {
                MethodCollector.m26664o(572);
                return 0;
            }
        }

        /* synthetic */ C30219b(Context context, byte b) {
            this(context);
        }

        /* renamed from: a */
        public final int mo53658a(String str, int i) {
            MethodCollector.m26663i(580);
            try {
                if (this.f72077b) {
                    int i2 = this.f72078c.getInt(str, i);
                    MethodCollector.m26664o(580);
                    return i2;
                }
                int a = PushMultiProcessSharedProvider.m61119a(this.f72076a.getContentResolver().query(PushMultiProcessSharedProvider.m61122a(this.f72076a, str, "integer"), null, null, null, null), i);
                MethodCollector.m26664o(580);
                return a;
            } catch (Throwable unused) {
                MethodCollector.m26664o(580);
                return i;
            }
        }

        /* renamed from: a */
        public final String mo53661a(String str, String str2) {
            MethodCollector.m26663i(567);
            try {
                if (this.f72077b) {
                    String string = this.f72078c.getString(str, str2);
                    MethodCollector.m26664o(567);
                    return string;
                }
                String a = PushMultiProcessSharedProvider.m61126a(this.f72076a.getContentResolver().query(PushMultiProcessSharedProvider.m61122a(this.f72076a, str, "string"), null, null, null, null), str2);
                MethodCollector.m26664o(567);
                return a;
            } catch (Throwable unused) {
                MethodCollector.m26664o(567);
                return str2;
            }
        }

        /* renamed from: a */
        public final boolean mo53662a(String str, boolean z) {
            MethodCollector.m26663i(574);
            try {
                if (this.f72077b) {
                    boolean z2 = this.f72078c.getBoolean(str, z);
                    MethodCollector.m26664o(574);
                    return z2;
                }
                boolean a = PushMultiProcessSharedProvider.m61127a(this.f72076a.getContentResolver().query(PushMultiProcessSharedProvider.m61122a(this.f72076a, str, "boolean"), null, null, null, null), z);
                MethodCollector.m26664o(574);
                return a;
            } catch (Throwable unused) {
                MethodCollector.m26664o(574);
                return z;
            }
        }
    }

    /* renamed from: b */
    private static boolean m61129b() {
        if (!TextUtils.isEmpty(f72063a) && f72065c != null) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a */
    public static class C30218a {

        /* renamed from: a */
        Context f72074a;

        /* renamed from: b */
        public ContentValues f72075b;

        static {
            Covode.recordClassIndex(36725);
        }

        /* renamed from: a */
        public final synchronized void mo53657a() {
            MethodCollector.m26663i(533);
            try {
                this.f72074a.getContentResolver().insert(PushMultiProcessSharedProvider.m61122a(this.f72074a, "key", StringSet.type), this.f72075b);
                MethodCollector.m26664o(533);
            } catch (Throwable unused) {
                MethodCollector.m26664o(533);
            }
        }

        private C30218a(Context context) {
            this.f72075b = new ContentValues();
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f72074a = applicationContext;
        }

        /* synthetic */ C30218a(Context context, byte b) {
            this(context);
        }

        /* renamed from: a */
        public final C30218a mo53656a(String str, String str2) {
            this.f72075b.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C30218a mo53654a(String str, int i) {
            this.f72075b.put(str, Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final C30218a mo53655a(String str, long j) {
            this.f72075b.put(str, Long.valueOf(j));
            return this;
        }
    }

    public boolean onCreate() {
        if (!Logger.debug() || C30062a.m60803a(getContext())) {
            C30061a.m60799a((Application) m61128b(getContext()));
            if (f72065c != null) {
                return true;
            }
            try {
                Logger.debug();
                m61131c(getContext());
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } else {
            throw new IllegalAccessError("should be create in main process");
        }
    }

    /* renamed from: a */
    private synchronized SharedPreferences m61121a() {
        MethodCollector.m26663i(3776);
        SharedPreferences sharedPreferences = this.f72067d;
        if (sharedPreferences == null) {
            int i = Build.VERSION.SDK_INT;
            SharedPreferences a = C34822d.m71158a(m61128b(getContext()), "push_multi_process_config", 4);
            this.f72067d = a;
            MethodCollector.m26664o(3776);
            return a;
        }
        MethodCollector.m26664o(3776);
        return sharedPreferences;
    }

    /* renamed from: c */
    private void m61130c() {
        MethodCollector.m26663i(3854);
        if (!this.f72069f) {
            synchronized (this.f72070g) {
                try {
                    if (!this.f72069f) {
                        SharedPreferences a = m61121a();
                        if (a != null) {
                            for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (!(key == null || value == null)) {
                                    this.f72068e.put(key, value);
                                }
                            }
                        }
                        this.f72069f = true;
                    }
                } finally {
                    MethodCollector.m26664o(3854);
                }
            }
            return;
        }
        MethodCollector.m26664o(3854);
    }

    /* renamed from: b */
    private static Context m61128b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public String getType(Uri uri) {
        m61130c();
        return "vnd.android.cursor.item/vnd." + f72063a + ".item";
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0010 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m61120a(android.database.Cursor r3) {
        /*
            r1 = 0
            if (r3 != 0) goto L_0x0005
            return r1
        L_0x0005:
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0010
            r0 = 0
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r3.close()     // Catch:{ Exception -> 0x0013 }
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m61120a(android.database.Cursor):long");
    }

    /* renamed from: c */
    private static void m61131c(Context context) {
        if (TextUtils.isEmpty(f72063a)) {
            f72063a = m61125a(context, PushMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f72063a)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            f72065c = uriMatcher;
            uriMatcher.addURI(f72063a, "*/*", 65536);
            f72064b = Uri.parse("content://" + f72063a);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    /* renamed from: a */
    public static synchronized C30219b m61123a(Context context) {
        C30219b bVar;
        synchronized (PushMultiProcessSharedProvider.class) {
            MethodCollector.m26663i(3958);
            if (f72066h == null) {
                f72066h = new C30219b(context, (byte) 0);
            }
            bVar = f72066h;
            MethodCollector.m26664o(3958);
        }
        return bVar;
    }

    /* renamed from: a */
    private Runnable m61124a(final String str, final String str2) {
        return new Runnable() {
            /* class com.p2082ss.android.pushmanager.setting.PushMultiProcessSharedProvider.RunnableC302171 */

            static {
                Covode.recordClassIndex(36724);
            }

            public final void run() {
                MethodCollector.m26663i(517);
                PushMultiProcessSharedProvider pushMultiProcessSharedProvider = PushMultiProcessSharedProvider.this;
                pushMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(PushMultiProcessSharedProvider.m61122a(pushMultiProcessSharedProvider.getContext(), str, str2), null);
                MethodCollector.m26664o(517);
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f72063a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m61119a(android.database.Cursor r1, int r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x000e
            r0 = 0
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x000e }
        L_0x000e:
            r1.close()     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m61119a(android.database.Cursor, int):int");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Runnable runnable;
        String str;
        m61130c();
        if (m61129b()) {
            return null;
        }
        if (f72065c.match(uri) == 65536) {
            try {
                ArrayList<Runnable> arrayList = new ArrayList();
                SharedPreferences.Editor editor = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    Logger.debug();
                    if (value == null) {
                        this.f72068e.remove(key);
                    } else {
                        Object obj = this.f72068e.get(key);
                        if (obj == null || !obj.equals(value)) {
                            this.f72068e.put(key, value);
                        }
                    }
                    if (Logger.debug()) {
                        if (("MultiProcessShareProvider reallly insert key = " + key + " value = " + value) != null) {
                            str = value.toString();
                        } else {
                            str = "null";
                        }
                        Logger.m24396d("PushService", str);
                    }
                    if (editor == null) {
                        editor = m61121a().edit();
                    }
                    if (value == null) {
                        editor.remove(key);
                    } else {
                        if (value instanceof String) {
                            editor.putString(key, (String) value);
                            runnable = m61124a(key, "string");
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(key, ((Boolean) value).booleanValue());
                            runnable = m61124a(key, "boolean");
                        } else if (value instanceof Long) {
                            editor.putLong(key, ((Long) value).longValue());
                            runnable = m61124a(key, "long");
                        } else if (value instanceof Integer) {
                            editor.putInt(key, ((Integer) value).intValue());
                            runnable = m61124a(key, "integer");
                        } else if (value instanceof Float) {
                            editor.putFloat(key, ((Float) value).floatValue());
                            runnable = m61124a(key, "float");
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
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    /* renamed from: a */
    private static String m61125a(Context context, String str) {
        if (context == null || C13627m.m24498a(str)) {
            return null;
        }
        try {
            ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (str.equals(providerInfo.name)) {
                    return providerInfo.authority;
                }
            }
        } catch (Exception unused) {
        }
        return context.getPackageName() + ".push.SHARE_PROVIDER_AUTHORITY";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m61126a(android.database.Cursor r1, java.lang.String r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m61126a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        m61130c();
        if (m61129b() || f72065c.match(uri) == 65536) {
            return 0;
        }
        throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
    }

    /* renamed from: a */
    public static final synchronized Uri m61122a(Context context, String str, String str2) {
        Uri build;
        synchronized (PushMultiProcessSharedProvider.class) {
            MethodCollector.m26663i(3965);
            if (f72064b == null) {
                try {
                    Logger.debug();
                    m61131c(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    MethodCollector.m26664o(3965);
                    return null;
                }
            }
            build = f72064b.buildUpon().appendPath(str).appendPath(str2).build();
            MethodCollector.m26664o(3965);
        }
        return build;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Object obj;
        boolean z;
        int i;
        m61130c();
        MatrixCursor matrixCursor = null;
        if (m61129b()) {
            return null;
        }
        if (f72065c.match(uri) == 65536) {
            try {
                int i2 = 1;
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = m61121a().getAll();
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
                    boolean a = C13627m.m24499a(str4, "current_app_state");
                    boolean a2 = C13627m.m24499a(str4, "current_app_foreground");
                    if (!(this.f72068e.containsKey(str4) || a || a2)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    if (a) {
                        try {
                            obj = Boolean.valueOf(C13498a.m24278a().f32878a);
                        } catch (Exception unused2) {
                            matrixCursor = matrixCursor3;
                            return matrixCursor;
                        }
                    } else if (a2) {
                        C13498a.m24278a();
                        if (!C13498a.f32875b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        obj = Boolean.valueOf(z);
                    } else {
                        obj = this.f72068e.get(str4);
                    }
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
            } catch (Exception unused3) {
                return matrixCursor;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }
}
