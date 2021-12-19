package androidx.p054j.p055a.p056a;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import androidx.p054j.p055a.AbstractC1061b;
import androidx.p054j.p055a.AbstractC1068e;
import androidx.p054j.p055a.AbstractC1069f;
import androidx.p054j.p055a.C1052a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: androidx.j.a.a.a */
final class C1053a implements AbstractC1061b {

    /* renamed from: a */
    private static final String[] f3692a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: b */
    private static final String[] f3693b = new String[0];

    /* renamed from: c */
    private final SQLiteDatabase f3694c;

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: a */
    public final void mo3781a() {
        this.f3694c.beginTransaction();
    }

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: b */
    public final void mo3783b() {
        this.f3694c.endTransaction();
    }

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: c */
    public final void mo3784c() {
        this.f3694c.setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3694c.close();
    }

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: d */
    public final boolean mo3787d() {
        return this.f3694c.inTransaction();
    }

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: e */
    public final boolean mo3788e() {
        return this.f3694c.isOpen();
    }

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: f */
    public final String mo3789f() {
        return this.f3694c.getPath();
    }

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: g */
    public final List<Pair<String, String>> mo3790g() {
        return this.f3694c.getAttachedDbs();
    }

    static {
        Covode.recordClassIndex(1146);
    }

    C1053a(SQLiteDatabase sQLiteDatabase) {
        this.f3694c = sQLiteDatabase;
    }

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: a */
    public final AbstractC1069f mo3780a(String str) {
        return new C1060e(this.f3694c.compileStatement(str));
    }

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: b */
    public final Cursor mo3782b(String str) {
        return mo3779a(new C1052a(str, (byte) 0));
    }

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: c */
    public final void mo3785c(String str) {
        this.f3694c.execSQL(str);
    }

    @Override // androidx.p054j.p055a.AbstractC1061b
    /* renamed from: a */
    public final Cursor mo3779a(final AbstractC1068e eVar) {
        return this.f3694c.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            /* class androidx.p054j.p055a.p056a.C1053a.C10541 */

            static {
                Covode.recordClassIndex(1147);
            }

            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                eVar.mo3777a(new C1059d(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.mo3778b(), f3693b, null);
    }
}
