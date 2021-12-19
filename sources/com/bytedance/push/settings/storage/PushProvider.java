package com.bytedance.push.settings.storage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.settings.C21895h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PushProvider extends ContentProvider {

    /* renamed from: a */
    public static String f51863a;

    /* renamed from: b */
    public static Uri f51864b;

    /* renamed from: c */
    static volatile boolean f51865c;

    /* renamed from: d */
    private static UriMatcher f51866d;

    static {
        Covode.recordClassIndex(25561);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    private static boolean m41127a() {
        if (!TextUtils.isEmpty(f51863a) && f51866d != null) {
            return false;
        }
        return true;
    }

    public boolean onCreate() {
        f51865c = true;
        if (f51866d != null) {
            return true;
        }
        try {
            m41126a(getContext());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + f51863a + ".item";
    }

    /* renamed from: a */
    private static void m41126a(Context context) {
        if (TextUtils.isEmpty(f51863a)) {
            f51863a = m41125a(context, PushProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f51863a)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            f51866d = uriMatcher;
            uriMatcher.addURI(f51863a, "*/*/*/*", 65536);
            f51864b = Uri.parse("content://" + f51863a);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f51863a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* renamed from: a */
    static synchronized Uri m41123a(Context context, C21900b bVar) {
        synchronized (PushProvider.class) {
            MethodCollector.m26663i(11642);
            if (f51864b == null) {
                try {
                    m41126a(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    MethodCollector.m26664o(11642);
                    return null;
                }
            }
            if (bVar == null) {
                Uri uri = f51864b;
                MethodCollector.m26664o(11642);
                return uri;
            }
            Uri a = bVar.mo35632a(f51864b);
            MethodCollector.m26664o(11642);
            return a;
        }
    }

    /* renamed from: a */
    private static String m41125a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str.equals(providerInfo.name)) {
                        return providerInfo.authority;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return context.getPackageName() + ".push.settings";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        String str;
        if (m41127a()) {
            return null;
        }
        if (f51866d.match(uri) == 65536) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                return null;
            }
            String str2 = pathSegments.get(0);
            try {
                AbstractC21912i a = C21895h.f51860a.mo35620a(getContext(), true, str2);
                SharedPreferences.Editor a2 = a.mo35633a();
                ArrayList<Runnable> arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (value == null) {
                        a2.remove(key);
                    } else {
                        if (value instanceof String) {
                            if (!TextUtils.equals(a.mo35647a(key), (String) value)) {
                                a2.putString(key, (String) value);
                                str = "string";
                            }
                        } else if (value instanceof Boolean) {
                            if (a.mo35655e(key) != ((Boolean) value).booleanValue()) {
                                a2.putBoolean(key, ((Boolean) value).booleanValue());
                                str = "boolean";
                            }
                        } else if (value instanceof Long) {
                            if (a.mo35653c(key) != ((Long) value).longValue()) {
                                a2.putLong(key, ((Long) value).longValue());
                                str = "long";
                            }
                        } else if (value instanceof Integer) {
                            if (a.mo35652b(key) != ((Integer) value).intValue()) {
                                a2.putInt(key, ((Integer) value).intValue());
                                str = "integer";
                            }
                        } else if (!(value instanceof Float)) {
                            throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(uri)));
                        } else if (a.mo35654d(key) != ((Float) value).floatValue()) {
                            a2.putFloat(key, ((Float) value).floatValue());
                            str = "float";
                        }
                        arrayList.add(m41124a(getContext(), str2, key, str));
                    }
                }
                if (a2 == null) {
                    return null;
                }
                a2.apply();
                for (Runnable runnable : arrayList) {
                    runnable.run();
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri ".concat(String.valueOf(uri)));
        }
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        AbstractC21907e eVar = C21908f.f51891a.get(str);
        if (eVar == null) {
            return null;
        }
        return eVar.mo35630a(getContext(), bundle);
    }

    /* renamed from: a */
    static Runnable m41124a(final Context context, final String str, final String str2, final String str3) {
        return new Runnable() {
            /* class com.bytedance.push.settings.storage.PushProvider.RunnableC218981 */

            static {
                Covode.recordClassIndex(25562);
            }

            public final void run() {
                MethodCollector.m26663i(12748);
                Uri a = PushProvider.m41123a(context, new C21900b(str, str2, "val", str3));
                if (a == null) {
                    MethodCollector.m26664o(12748);
                    return;
                }
                try {
                    context.getContentResolver().notifyChange(a, null);
                    MethodCollector.m26664o(12748);
                } catch (Exception e) {
                    e.printStackTrace();
                    MethodCollector.m26664o(12748);
                }
            }
        };
    }

    /* renamed from: b */
    public static synchronized Uri m41128b(Context context, String str, String str2, String str3) {
        synchronized (PushProvider.class) {
            MethodCollector.m26663i(11469);
            if (f51864b == null) {
                try {
                    m41126a(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    MethodCollector.m26664o(11469);
                    return null;
                }
            }
            if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                Uri uri = f51864b;
                MethodCollector.m26664o(11469);
                return uri;
            }
            Uri a = new C21900b(str, str2, "val", str3).mo35632a(f51864b);
            MethodCollector.m26664o(11469);
            return a;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        List<String> pathSegments;
        Object obj;
        if (!m41127a() && f51866d.match(uri) == 65536 && uri != null && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() >= 4) {
            C21900b bVar = new C21900b(pathSegments.get(0), pathSegments.get(1), pathSegments.get(2), pathSegments.get(3));
            if (!TextUtils.isEmpty(bVar.f51871a) && !TextUtils.isEmpty(bVar.f51872b) && !TextUtils.isEmpty(bVar.f51874d)) {
                AbstractC21912i a = C21895h.f51860a.mo35620a(getContext(), true, bVar.f51871a);
                String str3 = bVar.f51874d;
                str3.hashCode();
                switch (str3.hashCode()) {
                    case -891985903:
                        if (str3.equals("string")) {
                            obj = a.mo35648a(bVar.f51872b, bVar.f51873c);
                            MatrixCursor matrixCursor = new MatrixCursor(new String[]{bVar.f51872b});
                            matrixCursor.newRow().add(obj);
                            return matrixCursor;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 3327612:
                        if (str3.equals("long")) {
                            obj = Long.valueOf(a.mo35646a(bVar.f51872b, Long.parseLong(bVar.f51873c)));
                            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{bVar.f51872b});
                            matrixCursor2.newRow().add(obj);
                            return matrixCursor2;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 64711720:
                        if (str3.equals("boolean")) {
                            obj = Integer.valueOf(a.mo35651a(bVar.f51872b, Boolean.parseBoolean(bVar.f51873c)) ? 1 : 0);
                            MatrixCursor matrixCursor22 = new MatrixCursor(new String[]{bVar.f51872b});
                            matrixCursor22.newRow().add(obj);
                            return matrixCursor22;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 97526364:
                        if (str3.equals("float")) {
                            obj = Float.valueOf(a.mo35644a(bVar.f51872b, Float.parseFloat(bVar.f51873c)));
                            MatrixCursor matrixCursor222 = new MatrixCursor(new String[]{bVar.f51872b});
                            matrixCursor222.newRow().add(obj);
                            return matrixCursor222;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 1958052158:
                        if (str3.equals("integer")) {
                            obj = Integer.valueOf(a.mo35645a(bVar.f51872b, Integer.parseInt(bVar.f51873c)));
                            MatrixCursor matrixCursor2222 = new MatrixCursor(new String[]{bVar.f51872b});
                            matrixCursor2222.newRow().add(obj);
                            return matrixCursor2222;
                        }
                        throw new IllegalArgumentException("unknown type");
                    default:
                        throw new IllegalArgumentException("unknown type");
                }
            }
        }
        return null;
    }
}
