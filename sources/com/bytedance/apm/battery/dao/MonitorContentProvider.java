package com.bytedance.apm.battery.dao;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.core.SpPair;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MonitorContentProvider extends ContentProvider {

    /* renamed from: a */
    public static String f29745a;

    /* renamed from: b */
    private final Map<String, SQLiteOpenHelper> f29746b = new HashMap();

    static {
        Covode.recordClassIndex(14149);
    }

    public String getType(Uri uri) {
        return null;
    }

    public boolean onCreate() {
        f29745a = getContext().getPackageName() + ".apm";
        return false;
    }

    /* renamed from: b */
    private synchronized Pair<SharedPreferences, String> m22169b(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String str = null;
        if (pathSegments == null || pathSegments.size() < 2 || !"sp".equals(pathSegments.get(0))) {
            return null;
        }
        SharedPreferences a = C34822d.m71158a(getContext(), pathSegments.get(1), 0);
        if (pathSegments.size() > 2) {
            str = pathSegments.get(2);
        }
        return new Pair<>(a, str);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.util.Pair<android.database.sqlite.SQLiteDatabase, java.lang.String> m22167a(android.net.Uri r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r4 = 0
            java.util.List r2 = r6.getPathSegments()     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            if (r2 == 0) goto L_0x004e
            int r1 = r2.size()     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            r0 = 2
            if (r1 < r0) goto L_0x004e
            r0 = 0
            java.lang.Object r1 = r2.get(r0)     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            r0 = 1
            java.lang.Object r3 = r2.get(r0)     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x004e, all -> 0x0050 }
            if (r1 != 0) goto L_0x0021
            monitor-exit(r5)
            return r4
        L_0x0021:
            java.util.Map<java.lang.String, android.database.sqlite.SQLiteOpenHelper> r0 = r5.f29746b
            java.lang.Object r2 = r0.get(r1)
            android.database.sqlite.SQLiteOpenHelper r2 = (android.database.sqlite.SQLiteOpenHelper) r2
            if (r2 != 0) goto L_0x0041
            java.lang.String r0 = "apm_monitor_t1.db"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x004c
            com.bytedance.apm.battery.dao.b r2 = new com.bytedance.apm.battery.dao.b
            android.content.Context r0 = r5.getContext()
            r2.<init>(r0, r1)
            java.util.Map<java.lang.String, android.database.sqlite.SQLiteOpenHelper> r0 = r5.f29746b
            r0.put(r1, r2)
        L_0x0041:
            android.util.Pair r1 = new android.util.Pair
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()
            r1.<init>(r0, r3)
            monitor-exit(r5)
            return r1
        L_0x004c:
            monitor-exit(r5)
            return r4
        L_0x004e:
            monitor-exit(r5)
            return r4
        L_0x0050:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.dao.MonitorContentProvider.m22167a(android.net.Uri):android.util.Pair");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = m22167a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return null;
        }
        try {
            long insert = sQLiteDatabase.insert((String) a.second, null, contentValues);
            if (insert >= 0) {
                return ContentUris.withAppendedId(uri, insert);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static void m22168a(SharedPreferences sharedPreferences, Bundle bundle) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bundle.getBoolean("clear")) {
            edit.clear();
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("edit");
        if (parcelableArrayList != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                SpPair spPair = (SpPair) it.next();
                if (spPair.f30191b == null) {
                    edit.remove(spPair.f30190a);
                } else {
                    String str = spPair.f30190a;
                    Object obj = spPair.f30191b;
                    if (obj instanceof String) {
                        edit.putString(str, (String) obj);
                    } else if (obj instanceof Integer) {
                        edit.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        edit.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        edit.putFloat(str, ((Float) obj).floatValue());
                    } else if (obj instanceof Boolean) {
                        edit.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof String[]) {
                        edit.putStringSet(str, new HashSet(Arrays.asList((String[]) obj)));
                    }
                }
            }
            edit.apply();
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = m22167a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.delete((String) a.second, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static Bundle m22166a(SharedPreferences sharedPreferences, String str, Object obj) {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (str == null) {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                arrayList.add(new SpPair(entry.getKey(), entry.getValue()));
            }
            bundle.putParcelableArrayList("sp", arrayList);
        } else {
            Object obj2 = sharedPreferences.getAll().get(str);
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj instanceof Set) {
                obj = C12585h.m22683a((Set) obj);
            }
            arrayList.add(new SpPair(str, obj));
            bundle.putParcelableArrayList("sp", arrayList);
        }
        return bundle;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        SpPair spPair;
        if (bundle != null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        if ("getPid".equals(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("Pid", Process.myPid());
            return bundle2;
        }
        Uri.parse(str);
        Pair<SharedPreferences, String> b = m22169b(Uri.parse(str));
        Object obj = null;
        if (b == null) {
            return null;
        }
        if ("query".equals(str2)) {
            if (!(bundle == null || (spPair = (SpPair) bundle.getParcelable("sp")) == null)) {
                obj = spPair.f30191b;
            }
            return m22166a((SharedPreferences) b.first, (String) b.second, obj);
        } else if ("contains".equals(str2)) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("contains", ((SharedPreferences) b.first).contains((String) b.second));
            return bundle3;
        } else {
            if ("edit".equals(str2) && bundle != null) {
                m22168a((SharedPreferences) b.first, bundle);
            }
            return null;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = m22167a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return -1;
        }
        try {
            return sQLiteDatabase.update((String) a.second, contentValues, str, strArr);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase sQLiteDatabase;
        Pair<SQLiteDatabase, String> a = m22167a(uri);
        if (a == null || (sQLiteDatabase = (SQLiteDatabase) a.first) == null) {
            return null;
        }
        if (TextUtils.equals(str2, "rawQuery")) {
            return sQLiteDatabase.rawQuery(str, strArr2);
        }
        if (TextUtils.equals(str2, "execSQL")) {
            String[] split = str.split(";");
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    sQLiteDatabase.execSQL(str3);
                }
            }
            return null;
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables((String) a.second);
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2);
    }
}
