package com.p2082ss.android.common.util;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
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
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.p1279a.C18236d;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.common.util.MultiProcessSharedProvider */
public class MultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f71167a;

    /* renamed from: b */
    public static Uri f71168b;

    /* renamed from: c */
    private static UriMatcher f71169c;

    /* renamed from: f */
    private static C29826b f71170f;

    /* renamed from: d */
    private SharedPreferences f71171d;

    /* renamed from: e */
    private Map<String, Object> f71172e;

    static {
        Covode.recordClassIndex(36231);
    }

    /* renamed from: a */
    private void m60094a(Uri uri) {
        MethodCollector.m26663i(8647);
        getContext().getContentResolver().notifyChange(uri, null);
        MethodCollector.m26664o(8647);
    }

    /* renamed from: com.ss.android.common.util.MultiProcessSharedProvider$a */
    public static class C29825a {

        /* renamed from: a */
        Context f71173a;

        /* renamed from: b */
        public ContentValues f71174b;

        static {
            Covode.recordClassIndex(36232);
        }

        /* renamed from: a */
        public final synchronized void mo52108a() {
            MethodCollector.m26663i(10348);
            m60097b();
            MethodCollector.m26664o(10348);
        }

        /* renamed from: b */
        private synchronized void m60097b() {
            MethodCollector.m26663i(10347);
            try {
                this.f71173a.getContentResolver().insert(MultiProcessSharedProvider.m60090a(this.f71173a, "key", StringSet.type), this.f71174b);
                MethodCollector.m26664o(10347);
            } catch (Throwable unused) {
                MethodCollector.m26664o(10347);
            }
        }

        private C29825a(Context context) {
            this.f71174b = new ContentValues();
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f71173a = applicationContext;
        }

        public /* synthetic */ C29825a(Context context, byte b) {
            this(context);
        }
    }

    /* renamed from: a */
    private synchronized SharedPreferences m60089a() {
        MethodCollector.m26663i(8798);
        SharedPreferences sharedPreferences = this.f71171d;
        if (sharedPreferences == null) {
            int i = Build.VERSION.SDK_INT;
            Context applicationContext = getContext().getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            SharedPreferences a = C34822d.m71158a(applicationContext, "multi_process_config", 4);
            this.f71171d = a;
            MethodCollector.m26664o(8798);
            return a;
        }
        MethodCollector.m26664o(8798);
        return sharedPreferences;
    }

    public boolean onCreate() {
        if (f71169c == null) {
            try {
                Logger.debug();
                m60096b(getContext());
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        try {
            if (C18236d.f43453a != null) {
                getContext();
                return true;
            }
            m60088a(getContext(), new Intent(getContext(), Class.forName("com.ss.android.newmedia.message.MessageHandler")));
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: b */
    private synchronized void m60095b() {
        MethodCollector.m26663i(8942);
        if (this.f71172e == null) {
            this.f71172e = new ConcurrentHashMap();
            SharedPreferences a = m60089a();
            if (a != null) {
                for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
                    Object value = entry.getValue();
                    this.f71172e.put(entry.getKey(), value);
                }
            }
        }
        MethodCollector.m26664o(8942);
    }

    /* renamed from: com.ss.android.common.util.MultiProcessSharedProvider$b */
    public static class C29826b {

        /* renamed from: a */
        private Context f71175a;

        static {
            Covode.recordClassIndex(36233);
        }

        private C29826b(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f71175a = applicationContext;
            Logger.debug();
        }

        /* synthetic */ C29826b(Context context, byte b) {
            this(context);
        }

        /* renamed from: a */
        public final int mo52109a(String str, int i) {
            MethodCollector.m26663i(9117);
            try {
                int a = MultiProcessSharedProvider.m60087a(this.f71175a.getContentResolver().query(MultiProcessSharedProvider.m60090a(this.f71175a, str, "integer"), null, null, null, null), i);
                MethodCollector.m26664o(9117);
                return a;
            } catch (Throwable unused) {
                MethodCollector.m26664o(9117);
                return i;
            }
        }

        /* renamed from: a */
        public final String mo52110a(String str, String str2) {
            MethodCollector.m26663i(8958);
            try {
                String a = MultiProcessSharedProvider.m60093a(this.f71175a.getContentResolver().query(MultiProcessSharedProvider.m60090a(this.f71175a, str, "string"), null, null, null, null), str2);
                MethodCollector.m26664o(8958);
                return a;
            } catch (Throwable unused) {
                MethodCollector.m26664o(8958);
                return str2;
            }
        }
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + f71167a + ".item";
    }

    /* renamed from: b */
    private static void m60096b(Context context) {
        if (TextUtils.isEmpty(f71167a)) {
            String a = m60092a(context, MultiProcessSharedProvider.class.getName());
            f71167a = a;
            if (!TextUtils.isEmpty(a)) {
                Logger.debug();
            } else {
                throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
            }
        }
        UriMatcher uriMatcher = new UriMatcher(-1);
        f71169c = uriMatcher;
        uriMatcher.addURI(f71167a, "*/*", 65536);
        f71168b = Uri.parse("content://" + f71167a);
    }

    /* renamed from: a */
    public static synchronized C29826b m60091a(Context context) {
        C29826b bVar;
        synchronized (MultiProcessSharedProvider.class) {
            MethodCollector.m26663i(9101);
            if (f71170f == null) {
                f71170f = new C29826b(context, (byte) 0);
            }
            bVar = f71170f;
            MethodCollector.m26664o(9101);
        }
        return bVar;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        f71167a = providerInfo.authority;
        super.attachInfo(context, providerInfo);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m60087a(android.database.Cursor r1, int r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.util.MultiProcessSharedProvider.m60087a(android.database.Cursor, int):int");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m60088a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.util.MultiProcessSharedProvider.m60088a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        if (f71169c.match(uri) == 65536) {
            try {
                m60095b();
                SharedPreferences.Editor editor = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    Logger.debug();
                    if (value == null) {
                        this.f71172e.remove(key);
                    } else {
                        Object obj = this.f71172e.get(key);
                        if (obj == null || !obj.equals(value)) {
                            this.f71172e.put(key, value);
                        }
                    }
                    Logger.debug();
                    if (editor == null) {
                        editor = m60089a().edit();
                    }
                    if (value == null) {
                        editor.remove(key);
                    } else if (value instanceof String) {
                        editor.putString(key, (String) value);
                        m60094a(m60090a(getContext(), key, "string"));
                    } else if (value instanceof Boolean) {
                        editor.putBoolean(key, ((Boolean) value).booleanValue());
                        m60094a(m60090a(getContext(), key, "boolean"));
                    } else if (value instanceof Long) {
                        editor.putLong(key, ((Long) value).longValue());
                        m60094a(m60090a(getContext(), key, "long"));
                    } else if (value instanceof Integer) {
                        editor.putInt(key, ((Integer) value).intValue());
                        m60094a(m60090a(getContext(), key, "integer"));
                    } else if (value instanceof Float) {
                        editor.putFloat(key, ((Float) value).floatValue());
                        m60094a(m60090a(getContext(), key, "float"));
                    } else {
                        throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(uri)));
                    }
                }
                if (editor == null) {
                    return null;
                }
                int i = Build.VERSION.SDK_INT;
                editor.apply();
                return null;
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    /* renamed from: a */
    private static String m60092a(Context context, String str) {
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

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:5)|6|7|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m60093a(android.database.Cursor r1, java.lang.String r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.util.MultiProcessSharedProvider.m60093a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (f71169c.match(uri) == 65536) {
            try {
                m60095b();
                m60089a().edit().clear().commit();
                this.f71172e.clear();
                m60094a(m60090a(getContext(), "key", StringSet.type));
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    /* renamed from: a */
    public static final synchronized Uri m60090a(Context context, String str, String str2) {
        Uri build;
        synchronized (MultiProcessSharedProvider.class) {
            MethodCollector.m26663i(9247);
            if (f71168b == null) {
                try {
                    Logger.debug();
                    m60096b(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    MethodCollector.m26664o(9247);
                    return null;
                }
            }
            build = f71168b.buildUpon().appendPath(str).appendPath(str2).build();
            MethodCollector.m26664o(9247);
        }
        return build;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        if (f71169c.match(uri) == 65536) {
            MatrixCursor matrixCursor = null;
            try {
                m60095b();
                int i2 = 1;
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = m60089a().getAll();
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
                    if (!this.f71172e.containsKey(str4)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    Object obj = this.f71172e.get(str4);
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
