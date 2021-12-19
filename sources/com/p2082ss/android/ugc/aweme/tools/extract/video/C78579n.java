package com.p2082ss.android.ugc.aweme.tools.extract.video;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModelExtKt;
import com.p2082ss.android.ugc.aweme.tools.extract.video.C78580o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.n */
public class C78579n extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C78579n f176585a;

    static {
        Covode.recordClassIndex(91713);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
        if (0 == 0) goto L_0x005f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.p2082ss.android.ugc.aweme.tools.extract.video.C78580o> m137191b() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.extract.video.C78579n.m137191b():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (0 != 0) goto L_0x0076;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.tools.extract.video.C78580o> mo122498a() {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.extract.video.C78579n.mo122498a():java.util.List");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(7221);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `frames_table` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`video_id`\tTEXT NOT NULL,\n\t`zip_uri`\tTEXT NOT NULL,\n\t`zip_path`\tTEXT NOT NULL,\n\t`extract_model`\tTEXT NOT NULL,\n\t`union_id`\tTEXT,\n\t`match_factors`\tINTEGER,\n\t`is_draft`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`is_backup`\tINTEGER,\n\t`query_times`\tINTEGER,\n\t`update_time`\tLONG NOT NULL\n);");
        MethodCollector.m26664o(7221);
    }

    /* renamed from: a */
    public static C78579n m137189a(Context context) {
        MethodCollector.m26663i(7219);
        if (f176585a == null) {
            synchronized (C78579n.class) {
                try {
                    if (f176585a == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (C58003a.f132201c) {
                            if (applicationContext == null) {
                                applicationContext = C58003a.f132199a;
                            }
                        }
                        f176585a = new C78579n(applicationContext, "frames_table");
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7219);
                    throw th;
                }
            }
        }
        C78579n nVar = f176585a;
        MethodCollector.m26664o(7219);
        return nVar;
    }

    /* renamed from: a */
    public final void mo122500a(String str) {
        MethodCollector.m26663i(7707);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(7707);
            return;
        }
        getWritableDatabase().delete("frames_table", "aweme_id = ?", new String[]{str});
        MethodCollector.m26664o(7707);
    }

    /* renamed from: a */
    private static List<C78580o> m137190a(Cursor cursor) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C78580o.C78581a aVar = new C78580o.C78581a();
            aVar.f176598a = cursor.getString(cursor.getColumnIndex("aweme_id"));
            aVar.f176599b = cursor.getString(cursor.getColumnIndex("video_id"));
            aVar.f176600c = cursor.getString(cursor.getColumnIndex("zip_uri"));
            aVar.f176601d = cursor.getString(cursor.getColumnIndex("zip_path"));
            aVar.f176602e = ExtractFramesModelExtKt.string2Model(cursor.getString(cursor.getColumnIndex("extract_model")));
            aVar.f176604g = cursor.getString(cursor.getColumnIndex("union_id"));
            aVar.f176603f = cursor.getLong(cursor.getColumnIndex("update_time"));
            aVar.f176605h = cursor.getInt(cursor.getColumnIndex("match_factors"));
            boolean z2 = false;
            if (cursor.getInt(cursor.getColumnIndex("is_draft")) == 1) {
                z = true;
            } else {
                z = false;
            }
            aVar.f176606i = z;
            aVar.f176607j = cursor.getInt(cursor.getColumnIndex("origin"));
            if (cursor.getInt(cursor.getColumnIndex("is_backup")) == 1) {
                z2 = true;
            }
            aVar.f176608k = z2;
            aVar.f176609l = cursor.getInt(cursor.getColumnIndex("query_times"));
            arrayList.add(aVar.mo122504a());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo122499a(C78582p pVar) {
        MethodCollector.m26663i(7705);
        for (C78580o oVar : pVar.f176610a) {
            if (oVar.f176590e == null) {
                mo122500a(oVar.f176586a);
                MethodCollector.m26664o(7705);
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("aweme_id", oVar.f176586a);
            contentValues.put("video_id", oVar.f176587b);
            contentValues.put("zip_uri", oVar.f176588c);
            contentValues.put("zip_path", oVar.f176589d);
            contentValues.put("extract_model", oVar.f176590e.toString());
            contentValues.put("union_id", oVar.f176592g);
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("match_factors", Integer.valueOf(oVar.f176593h));
            if (oVar.f176594i) {
                contentValues.put("is_draft", (Integer) 1);
            } else {
                contentValues.put("is_draft", (Integer) 0);
            }
            contentValues.put("origin", Integer.valueOf(oVar.f176595j));
            if (oVar.f176596k) {
                contentValues.put("is_backup", (Integer) 1);
            } else {
                contentValues.put("is_backup", (Integer) 0);
            }
            contentValues.put("query_times", Integer.valueOf(oVar.f176597l));
            getWritableDatabase().replace("frames_table", null, contentValues);
        }
        MethodCollector.m26664o(7705);
    }

    /* renamed from: a */
    public final void mo122501a(List<C78582p> list) {
        for (C78582p pVar : list) {
            for (C78580o oVar : pVar.f176610a) {
                oVar.f176597l++;
            }
            mo122499a(pVar);
        }
    }

    private C78579n(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 3);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m26663i(7223);
        if (i < 2 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN union_id TEXT");
        }
        if (i < 3 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN match_factors INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN is_draft INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN origin INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN is_backup INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE frames_table ADD COLUMN query_times INTEGER");
        }
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame_db", "upgrade from " + i + " to " + i2);
        MethodCollector.m26664o(7223);
    }
}
