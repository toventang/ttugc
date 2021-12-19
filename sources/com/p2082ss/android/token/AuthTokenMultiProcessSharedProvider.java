package com.p2082ss.android.token;

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
import android.util.Log;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.C29845d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.token.AuthTokenMultiProcessSharedProvider */
public class AuthTokenMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f73165a;

    /* renamed from: b */
    public static Uri f73166b;

    /* renamed from: c */
    public static String f73167c = "token_shared_preference";

    /* renamed from: d */
    private static UriMatcher f73168d;

    /* renamed from: i */
    private static C30623b f73169i;

    /* renamed from: e */
    private SharedPreferences f73170e;

    /* renamed from: f */
    private Map<String, Object> f73171f = new ConcurrentHashMap();

    /* renamed from: g */
    private volatile boolean f73172g = false;

    /* renamed from: h */
    private final Object f73173h = new Object();

    /* renamed from: a */
    public final void mo54880a(Uri uri) {
        MethodCollector.m26663i(59);
        getContext().getContentResolver().notifyChange(uri, null);
        MethodCollector.m26664o(59);
    }

    static {
        Covode.recordClassIndex(37158);
    }

    /* renamed from: com.ss.android.token.AuthTokenMultiProcessSharedProvider$b */
    public static class C30623b {

        /* renamed from: a */
        private Context f73179a;

        /* renamed from: b */
        private boolean f73180b;

        /* renamed from: c */
        private SharedPreferences f73181c;

        static {
            Covode.recordClassIndex(37161);
        }

        /* renamed from: a */
        public final C30622a mo54892a() {
            return new C30622a(this.f73179a, (byte) 0);
        }

        /* renamed from: a */
        private static Context m62914a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        /* renamed from: a */
        public final boolean mo54894a(String str) {
            MethodCollector.m26663i(1680);
            try {
                if (this.f73180b) {
                    boolean z = this.f73181c.getBoolean(str, true);
                    MethodCollector.m26664o(1680);
                    return z;
                }
                boolean a = AuthTokenMultiProcessSharedProvider.m62907a(this.f73179a.getContentResolver().query(AuthTokenMultiProcessSharedProvider.m62901a(this.f73179a, str, "boolean"), null, null, null, null));
                MethodCollector.m26664o(1680);
                return a;
            } catch (Throwable th) {
                C30629e.m62929a(th);
                MethodCollector.m26664o(1680);
                return true;
            }
        }

        /* renamed from: a */
        public final String mo54893a(String str, String str2) {
            MethodCollector.m26663i(1675);
            try {
                if (this.f73180b) {
                    String string = this.f73181c.getString(str, str2);
                    C29845d.m60144a("AuthTokenMultiProcessShared", "mSharedPreferences main getString get key = " + str + " value = " + C30630f.m62930a((Object) string) + " " + Log.getStackTraceString(new Exception()));
                    MethodCollector.m26664o(1675);
                    return string;
                }
                String a = AuthTokenMultiProcessSharedProvider.m62905a(this.f73179a.getContentResolver().query(AuthTokenMultiProcessSharedProvider.m62901a(this.f73179a, str, "string"), null, null, null, null), str2);
                C29845d.m60144a("AuthTokenMultiProcessShared", " MultiProcessShared getString get key = " + str + " value = " + C30630f.m62930a((Object) a) + " " + Log.getStackTraceString(new Exception()));
                MethodCollector.m26664o(1675);
                return a;
            } catch (Throwable th) {
                C30629e.m62929a(th);
                MethodCollector.m26664o(1675);
                return str2;
            }
        }

        private C30623b(Context context, String str, boolean z) {
            this.f73180b = z;
            this.f73179a = m62914a(context);
            AuthTokenMultiProcessSharedProvider.f73167c = str;
            this.f73181c = C34822d.m71158a(m62914a(this.f73179a), AuthTokenMultiProcessSharedProvider.f73167c, 4);
            Logger.debug();
        }

        /* synthetic */ C30623b(Context context, String str, boolean z, byte b) {
            this(context, str, z);
        }
    }

    /* renamed from: b */
    private static boolean m62908b() {
        if (!TextUtils.isEmpty(f73165a) && f73168d != null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private synchronized SharedPreferences m62900a() {
        MethodCollector.m26663i(66);
        SharedPreferences sharedPreferences = this.f73170e;
        if (sharedPreferences == null) {
            int i = Build.VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            SharedPreferences a = C34822d.m71158a(applicationContext, f73167c, 4);
            this.f73170e = a;
            MethodCollector.m26664o(66);
            return a;
        }
        MethodCollector.m26664o(66);
        return sharedPreferences;
    }

    public boolean onCreate() {
        if (Logger.debug() && !C30633g.m62953a(getContext())) {
            throw new IllegalAccessError("should be create in main process");
        } else if (f73168d != null) {
            return true;
        } else {
            try {
                Logger.debug();
                m62906a(getContext());
                return true;
            } catch (Exception e) {
                C30629e.m62929a(e);
                e.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.token.AuthTokenMultiProcessSharedProvider$a */
    public static class C30622a {

        /* renamed from: a */
        Context f73177a;

        /* renamed from: b */
        private ContentValues f73178b;

        static {
            Covode.recordClassIndex(37160);
        }

        /* renamed from: a */
        public final synchronized void mo54891a() {
            MethodCollector.m26663i(1989);
            try {
                SharedPreferences.Editor edit = C34822d.m71158a(this.f73177a, AuthTokenMultiProcessSharedProvider.f73167c, 4).edit();
                for (Map.Entry<String, Object> entry : this.f73178b.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    C29845d.m60144a("AuthTokenMultiProcessShared", "MultiProcessShareProvider apply key = " + key + " value = " + C30630f.m62930a(value));
                    if (value == null) {
                        edit.remove(key);
                    } else if (value instanceof String) {
                        edit.putString(key, (String) value);
                    } else if (value instanceof Boolean) {
                        edit.putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Long) {
                        edit.putLong(key, ((Long) value).longValue());
                    } else if (value instanceof Integer) {
                        edit.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Float) {
                        edit.putFloat(key, ((Float) value).floatValue());
                    }
                }
                edit.commit();
                this.f73177a.getContentResolver().insert(AuthTokenMultiProcessSharedProvider.m62901a(this.f73177a, "key", StringSet.type), this.f73178b);
                MethodCollector.m26664o(1989);
            } catch (Throwable th) {
                C29845d.m60144a("AuthTokenMultiProcessShared", "MultiProcessShareProvider apply error = " + Log.getStackTraceString(th));
                C30629e.m62929a(th);
                MethodCollector.m26664o(1989);
            }
        }

        /* renamed from: a */
        public final C30622a mo54889a(String str) {
            this.f73178b.put(str, (Boolean) false);
            return this;
        }

        private C30622a(Context context) {
            this.f73178b = new ContentValues();
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f73177a = applicationContext;
        }

        /* synthetic */ C30622a(Context context, byte b) {
            this(context);
        }

        /* renamed from: a */
        public final C30622a mo54890a(String str, String str2) {
            this.f73178b.put(str, str2);
            return this;
        }
    }

    /* renamed from: c */
    private void m62909c() {
        MethodCollector.m26663i(118);
        if (!this.f73172g) {
            synchronized (this.f73173h) {
                try {
                    if (!this.f73172g) {
                        SharedPreferences a = m62900a();
                        if (a != null) {
                            for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == null || key == null) {
                                    try {
                                        C29845d.m60144a("AuthTokenMultiProcessShared", "MultiProcessShareProvider loadValues key_ = " + key + " value_ = " + value);
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("key_", key);
                                        jSONObject.put("value_", value);
                                        C22455a.m42376a("token_sp_error", jSONObject);
                                    } catch (Exception e) {
                                        C30629e.m62929a(e);
                                    }
                                } else {
                                    this.f73171f.put(key, value);
                                }
                            }
                        }
                        this.f73172g = true;
                    }
                } finally {
                    MethodCollector.m26664o(118);
                }
            }
            return;
        }
        MethodCollector.m26664o(118);
    }

    public String getType(Uri uri) {
        m62909c();
        return "vnd.android.cursor.item/vnd." + f73165a + ".item";
    }

    /* renamed from: a */
    private static void m62906a(Context context) {
        if (TextUtils.isEmpty(f73165a)) {
            f73165a = m62904a(context, AuthTokenMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f73165a)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            f73168d = uriMatcher;
            uriMatcher.addURI(f73165a, "*/*", 65536);
            f73166b = Uri.parse("content://" + f73165a);
            return;
        }
        throw new IllegalStateException("Must Set AuthTokenMultiProcessSharedProvider Authority");
    }

    /* renamed from: a */
    public static boolean m62907a(Cursor cursor) {
        boolean z = true;
        if (cursor == null) {
            return true;
        }
        try {
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) <= 0) {
                    z = false;
                }
            }
            try {
                cursor.close();
            } catch (Exception e) {
                C30629e.m62929a(e);
            }
        } catch (Throwable th) {
            try {
                cursor.close();
            } catch (Exception e2) {
                C30629e.m62929a(e2);
            }
            throw th;
        }
        return z;
    }

    /* renamed from: a */
    private Runnable m62903a(final String str, final String str2) {
        return new Runnable() {
            /* class com.p2082ss.android.token.AuthTokenMultiProcessSharedProvider.RunnableC306211 */

            static {
                Covode.recordClassIndex(37159);
            }

            public final void run() {
                AuthTokenMultiProcessSharedProvider authTokenMultiProcessSharedProvider = AuthTokenMultiProcessSharedProvider.this;
                authTokenMultiProcessSharedProvider.mo54880a(AuthTokenMultiProcessSharedProvider.m62901a(authTokenMultiProcessSharedProvider.getContext(), str, str2));
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f73165a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* renamed from: a */
    private static String m62904a(Context context, String str) {
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
        } catch (Exception e) {
            C30629e.m62929a(e);
        }
        return context.getPackageName() + ".auth_token.SHARE_PROVIDER_AUTHORITY";
    }

    /* renamed from: a */
    public static String m62905a(Cursor cursor, String str) {
        if (cursor == null) {
            return str;
        }
        try {
            if (cursor.moveToFirst()) {
                str = cursor.getString(0);
            }
            try {
                cursor.close();
            } catch (Exception e) {
                C30629e.m62929a(e);
            }
        } catch (Throwable th) {
            try {
                cursor.close();
            } catch (Exception e2) {
                C30629e.m62929a(e2);
            }
            throw th;
        }
        return str;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Runnable runnable;
        m62909c();
        if (m62908b()) {
            return null;
        }
        if (f73168d.match(uri) == 65536) {
            try {
                ArrayList<Runnable> arrayList = new ArrayList();
                SharedPreferences.Editor editor = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    C29845d.m60144a("AuthTokenMultiProcessShared", "MultiProcessShareProvider reallly insert key = " + key + " value = " + C30630f.m62930a(value));
                    if (key != null) {
                        if (value == null) {
                            this.f73171f.remove(key);
                        } else {
                            Object obj = this.f73171f.get(key);
                            if (obj == null || !obj.equals(value)) {
                                this.f73171f.put(key, value);
                            }
                        }
                        C29845d.m60144a("AuthTokenMultiProcessShared", "MultiProcessShareProvider reallly insert key = " + key + " value = " + C30630f.m62930a(value));
                        if (editor == null) {
                            editor = m62900a().edit();
                        }
                        if (value == null) {
                            editor.remove(key);
                        } else {
                            if (value instanceof String) {
                                editor.putString(key, (String) value);
                                runnable = m62903a(key, "string");
                            } else if (value instanceof Boolean) {
                                editor.putBoolean(key, ((Boolean) value).booleanValue());
                                runnable = m62903a(key, "boolean");
                            } else if (value instanceof Long) {
                                editor.putLong(key, ((Long) value).longValue());
                                runnable = m62903a(key, "long");
                            } else if (value instanceof Integer) {
                                editor.putInt(key, ((Integer) value).intValue());
                                runnable = m62903a(key, "integer");
                            } else if (value instanceof Float) {
                                editor.putFloat(key, ((Float) value).floatValue());
                                runnable = m62903a(key, "float");
                            } else {
                                throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(uri)));
                            }
                            if (runnable != null) {
                                arrayList.add(runnable);
                            }
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
                C30629e.m62929a(e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    /* renamed from: a */
    public static synchronized C30623b m62902a(Context context, String str, boolean z) {
        C30623b bVar;
        synchronized (AuthTokenMultiProcessSharedProvider.class) {
            MethodCollector.m26663i(1216);
            if (f73169i == null) {
                f73169i = new C30623b(context, str, z, (byte) 0);
            }
            bVar = f73169i;
            MethodCollector.m26664o(1216);
        }
        return bVar;
    }

    /* renamed from: a */
    public static final synchronized Uri m62901a(Context context, String str, String str2) {
        Uri build;
        synchronized (AuthTokenMultiProcessSharedProvider.class) {
            MethodCollector.m26663i(1245);
            if (f73166b == null) {
                try {
                    Logger.debug();
                    m62906a(context);
                } catch (Exception e) {
                    C30629e.m62929a(e);
                    MethodCollector.m26664o(1245);
                    return null;
                }
            }
            build = f73166b.buildUpon().appendPath(str).appendPath(str2).build();
            MethodCollector.m26664o(1245);
        }
        return build;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        m62909c();
        if (m62908b()) {
            return 0;
        }
        if (f73168d.match(uri) == 65536) {
            try {
                this.f73171f.clear();
                m62900a().edit().clear().commit();
                mo54880a(m62901a(getContext(), "key", StringSet.type));
            } catch (Exception e) {
                C30629e.m62929a(e);
            }
            return 0;
        }
        throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Exception e;
        int i;
        m62909c();
        MatrixCursor matrixCursor = null;
        if (m62908b()) {
            return null;
        }
        if (f73168d.match(uri) == 65536) {
            try {
                int i2 = 1;
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = m62900a().getAll();
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
                    } catch (Exception e2) {
                        e = e2;
                        matrixCursor = matrixCursor2;
                        C30629e.m62929a(e);
                        return matrixCursor;
                    }
                } else {
                    String str4 = uri.getPathSegments().get(0);
                    if (!this.f73171f.containsKey(str4)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    Object obj = this.f73171f.get(str4);
                    MatrixCursor.RowBuilder newRow2 = matrixCursor3.newRow();
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i2 = 0;
                        }
                        obj = Integer.valueOf(i2);
                    }
                    C29845d.m60144a("AuthTokenMultiProcessShared", "MultiProcessShareProvider  get key = " + str4 + " value = " + C30630f.m62930a(obj) + " " + Log.getStackTraceString(new Exception()));
                    newRow2.add(obj);
                    return matrixCursor3;
                }
            } catch (Exception e3) {
                e = e3;
                C30629e.m62929a(e);
                return matrixCursor;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }
}
