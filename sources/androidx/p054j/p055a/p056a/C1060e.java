package androidx.p054j.p055a.p056a;

import android.database.sqlite.SQLiteStatement;
import androidx.p054j.p055a.AbstractC1069f;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.j.a.a.e */
final class C1060e extends C1059d implements AbstractC1069f {

    /* renamed from: a */
    private final SQLiteStatement f3704a;

    static {
        Covode.recordClassIndex(1153);
    }

    @Override // androidx.p054j.p055a.AbstractC1069f
    /* renamed from: a */
    public final int mo3809a() {
        return this.f3704a.executeUpdateDelete();
    }

    @Override // androidx.p054j.p055a.AbstractC1069f
    /* renamed from: b */
    public final long mo3810b() {
        return this.f3704a.executeInsert();
    }

    C1060e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3704a = sQLiteStatement;
    }
}
