package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.i */
public final class C26456i {
    static {
        Covode.recordClassIndex(31878);
    }

    /* renamed from: a */
    private static Set<String> m52165a(SQLiteDatabase sQLiteDatabase, String str) {
        MethodCollector.m26663i(6440);
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
            MethodCollector.m26664o(6440);
        }
    }

    /* renamed from: a */
    static void m52166a(C26350eb ebVar, SQLiteDatabase sQLiteDatabase) {
        if (ebVar != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                ebVar.f61830f.mo43169a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                ebVar.f61830f.mo43169a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                ebVar.f61830f.mo43169a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                ebVar.f61830f.mo43169a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* renamed from: a */
    private static boolean m52168a(C26350eb ebVar, SQLiteDatabase sQLiteDatabase, String str) {
        MethodCollector.m26663i(6583);
        if (ebVar != null) {
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{StringSet.name}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                MethodCollector.m26664o(6583);
                return moveToFirst;
            } catch (SQLiteException e) {
                ebVar.f61830f.mo43171a("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                MethodCollector.m26664o(6583);
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                MethodCollector.m26664o(6583);
                throw th;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Monitor must not be null");
            MethodCollector.m26664o(6583);
            throw illegalArgumentException;
        }
    }

    /* renamed from: a */
    static void m52167a(C26350eb ebVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        MethodCollector.m26663i(6581);
        if (ebVar != null) {
            if (!m52168a(ebVar, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> a = m52165a(sQLiteDatabase, str);
                String[] split = str3.split(",");
                for (String str4 : split) {
                    if (!a.remove(str4)) {
                        SQLiteException sQLiteException = new SQLiteException(new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length()).append("Table ").append(str).append(" is missing required column: ").append(str4).toString());
                        MethodCollector.m26664o(6581);
                        throw sQLiteException;
                    }
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i += 2) {
                        if (!a.remove(strArr[i])) {
                            sQLiteDatabase.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (!a.isEmpty()) {
                    ebVar.f61830f.mo43171a("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
                }
                MethodCollector.m26664o(6581);
            } catch (SQLiteException e) {
                ebVar.f61827c.mo43170a("Failed to verify columns on table that was just created", str);
                MethodCollector.m26664o(6581);
                throw e;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Monitor must not be null");
            MethodCollector.m26664o(6581);
            throw illegalArgumentException;
        }
    }
}
