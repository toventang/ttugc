package com.bytedance.disk.p964f;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p957b.C14428a;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.disk.f.b */
public final class C14453b implements AbstractC14454c {

    /* renamed from: b */
    private static final UriMatcher f34954b;

    /* renamed from: a */
    public Context f34955a;

    /* renamed from: c */
    private SQLiteOpenHelper f34956c;

    /* renamed from: d */
    private SQLiteDatabase f34957d;

    static {
        Covode.recordClassIndex(16532);
        UriMatcher uriMatcher = new UriMatcher(-1);
        f34954b = uriMatcher;
        uriMatcher.addURI("com.bytedance.disk:migration", "migration_items_table", 1);
        uriMatcher.addURI("com.bytedance.disk:migration", "migration_items_table/#", 2);
    }

    @Override // com.bytedance.disk.p964f.AbstractC14454c
    /* renamed from: a */
    public final void mo23282a(Context context) {
        MethodCollector.m26663i(1032);
        this.f34955a = context;
        C14428a a = C14428a.m26339a(context);
        this.f34956c = a;
        this.f34957d = a.getWritableDatabase();
        MethodCollector.m26664o(1032);
    }

    /* renamed from: a */
    private static String m26387a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return "_id=".concat(String.valueOf(j));
        }
        return str + " AND _id=" + j;
    }

    @Override // com.bytedance.disk.p964f.AbstractC14454c
    /* renamed from: a */
    public final Uri mo23281a(Uri uri, ContentValues contentValues) {
        MethodCollector.m26663i(1055);
        SQLiteDatabase writableDatabase = this.f34956c.getWritableDatabase();
        String[] strArr = C14450a.f34950b;
        int length = strArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                if (contentValues.getAsLong("mig_event_time") == null) {
                    contentValues.put("mig_event_time", Long.valueOf(System.currentTimeMillis()));
                }
                z = true;
            } else if (contentValues.get(strArr[i]) == null) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            MethodCollector.m26664o(1055);
            return null;
        }
        long insert = writableDatabase.insert("migration_items_table", null, contentValues);
        if (insert < 0) {
            MethodCollector.m26664o(1055);
            return null;
        }
        Uri withAppendedId = ContentUris.withAppendedId(uri, insert);
        MethodCollector.m26664o(1055);
        return withAppendedId;
    }

    @Override // com.bytedance.disk.p964f.AbstractC14454c
    /* renamed from: a */
    public final int mo23278a(Uri uri, ContentValues contentValues, String str) {
        MethodCollector.m26663i(1064);
        SQLiteDatabase writableDatabase = this.f34956c.getWritableDatabase();
        int match = f34954b.match(uri);
        if (match != 1) {
            if (match == 2) {
                str = m26387a((String) null, ContentUris.parseId(uri));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unknown uri: ".concat(String.valueOf(uri)));
                MethodCollector.m26664o(1064);
                throw illegalArgumentException;
            }
        }
        int update = writableDatabase.update("migration_items_table", contentValues, str, null);
        MethodCollector.m26664o(1064);
        return update;
    }

    @Override // com.bytedance.disk.p964f.AbstractC14454c
    /* renamed from: a */
    public final int mo23279a(Uri uri, String str, String[] strArr) {
        MethodCollector.m26663i(1061);
        if (!(!TextUtils.isEmpty(str))) {
            MethodCollector.m26664o(1061);
            return 0;
        }
        SQLiteDatabase writableDatabase = this.f34956c.getWritableDatabase();
        int match = f34954b.match(uri);
        if (match != 1) {
            if (match == 2) {
                str = m26387a(str, ContentUris.parseId(uri));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unknown uri: ".concat(String.valueOf(uri)));
                MethodCollector.m26664o(1061);
                throw illegalArgumentException;
            }
        }
        int delete = writableDatabase.delete("migration_items_table", str, strArr);
        MethodCollector.m26664o(1061);
        return delete;
    }

    @Override // com.bytedance.disk.p964f.AbstractC14454c
    /* renamed from: a */
    public final Cursor mo23280a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MethodCollector.m26663i(1044);
        SQLiteDatabase readableDatabase = this.f34956c.getReadableDatabase();
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("migration_items_table");
        if (f34954b.match(uri) == 2) {
            sQLiteQueryBuilder.appendWhere("_id=" + ContentUris.parseId(uri));
        }
        Cursor query = sQLiteQueryBuilder.query(readableDatabase, strArr, str, strArr2, null, null, str2);
        MethodCollector.m26664o(1044);
        return query;
    }
}
