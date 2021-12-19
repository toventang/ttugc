package com.p2082ss.android.ugc.aweme.tools.policysecurity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.a */
public final class C79023a extends SQLiteOpenHelper {

    /* renamed from: a */
    public static C79023a f177629a;

    /* renamed from: b */
    public static final C79024a f177630b = new C79024a((byte) 0);

    static {
        Covode.recordClassIndex(92191);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.a$a */
    public static final class C79024a {
        static {
            Covode.recordClassIndex(92192);
        }

        private C79024a() {
        }

        public /* synthetic */ C79024a(byte b) {
            this();
        }

        /* renamed from: b */
        private static Context m137855b(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        /* renamed from: a */
        public static C79023a m137854a(Context context) {
            C89219l.m154721d(context, "");
            if (C79023a.f177629a == null) {
                Context b = m137855b(context);
                C89219l.m154716b(b, "");
                C79023a.f177629a = new C79023a(b);
            }
            C79023a aVar = C79023a.f177629a;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundSQLiteHelper");
            return aVar;
        }
    }

    /* renamed from: a */
    public final ArrayList<OriginalSoundUploadTask> mo122848a() {
        boolean z;
        boolean z2;
        MethodCollector.m26663i(10825);
        ArrayList<OriginalSoundUploadTask> arrayList = new ArrayList<>();
        Cursor query = getReadableDatabase().query("OriginalSound", new String[]{"aweme_id", "vid", "audio_path", "union_id", "update_time", "match_factors", "is_draft", "origin", "is_backup", "query_times"}, null, null, null, null, "update_time desc");
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("aweme_id"));
                C89219l.m154716b(string, "");
                String string2 = cursor.getString(cursor.getColumnIndex("vid"));
                C89219l.m154716b(string2, "");
                String string3 = cursor.getString(cursor.getColumnIndex("audio_path"));
                C89219l.m154716b(string3, "");
                long j = cursor.getLong(cursor.getColumnIndex("update_time"));
                String string4 = cursor.getString(cursor.getColumnIndex("union_id"));
                int i = cursor.getInt(cursor.getColumnIndex("match_factors"));
                if (cursor.getInt(cursor.getColumnIndex("is_draft")) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = cursor.getInt(cursor.getColumnIndex("origin"));
                if (cursor.getInt(cursor.getColumnIndex("is_backup")) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(new OriginalSoundUploadTask(string, string2, string3, j, string4, i, z, i2, z2, cursor.getInt(cursor.getColumnIndex("query_times"))));
            }
            C89146c.m154636a(query, null);
            MethodCollector.m26664o(10825);
            return arrayList;
        } catch (Throwable th) {
            C89146c.m154636a(query, th);
            MethodCollector.m26664o(10825);
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79023a(Context context) {
        super(context, "OriginalSound", (SQLiteDatabase.CursorFactory) null, 3);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    public final void mo122850a(C79025b bVar) {
        C89219l.m154721d(bVar, "");
        Iterator<T> it = bVar.f177631a.iterator();
        while (it.hasNext()) {
            mo122849a((OriginalSoundUploadTask) it.next());
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(10510);
        C89219l.m154721d(sQLiteDatabase, "");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `OriginalSound` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`vid`\tTEXT NOT NULL,\n\t`audio_path`\tTEXT NOT NULL,\n\t`audio_vid`\tTEXT,\n\t`union_id`\tTEXT,\n\t`match_factors`\tINTEGER,\n\t`is_draft`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`is_backup`\tINTEGER,\n\t`query_times`\tINTEGER,\n\t`update_time`\tLONG NOT NULL\n);");
        MethodCollector.m26664o(10510);
    }

    /* renamed from: b */
    public final void mo122851b(C79025b bVar) {
        C89219l.m154721d(bVar, "");
        for (T t : bVar.f177631a) {
            t.f177628k++;
            mo122849a((OriginalSoundUploadTask) t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo122849a(OriginalSoundUploadTask originalSoundUploadTask) {
        MethodCollector.m26663i(10823);
        ContentValues contentValues = new ContentValues();
        contentValues.put("aweme_id", originalSoundUploadTask.f177618a);
        contentValues.put("vid", originalSoundUploadTask.f177619b);
        contentValues.put("audio_path", originalSoundUploadTask.f177620c);
        contentValues.put("audio_vid", originalSoundUploadTask.f177623f);
        contentValues.put("update_time", Long.valueOf(originalSoundUploadTask.f177621d));
        contentValues.put("union_id", originalSoundUploadTask.f177622e);
        contentValues.put("match_factors", Integer.valueOf(originalSoundUploadTask.f177624g));
        contentValues.put("is_draft", Integer.valueOf(originalSoundUploadTask.f177625h ? 1 : 0));
        contentValues.put("origin", Integer.valueOf(originalSoundUploadTask.f177626i));
        contentValues.put("is_backup", Integer.valueOf(originalSoundUploadTask.f177627j ? 1 : 0));
        contentValues.put("query_times", Integer.valueOf(originalSoundUploadTask.f177628k));
        getWritableDatabase().replace("OriginalSound", null, contentValues);
        MethodCollector.m26664o(10823);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m26663i(10682);
        C89219l.m154721d(sQLiteDatabase, "");
        if (i < 2 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN union_id TEXT");
        }
        if (i < 3 && i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN match_factors INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN is_draft INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN origin INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN is_backup INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN query_times INTEGER");
        }
        MethodCollector.m26664o(10682);
    }
}
