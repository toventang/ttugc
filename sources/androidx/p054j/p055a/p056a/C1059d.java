package androidx.p054j.p055a.p056a;

import android.database.sqlite.SQLiteProgram;
import androidx.p054j.p055a.AbstractC1067d;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.j.a.a.d */
class C1059d implements AbstractC1067d {

    /* renamed from: a */
    private final SQLiteProgram f3703a;

    static {
        Covode.recordClassIndex(1152);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3703a.close();
    }

    C1059d(SQLiteProgram sQLiteProgram) {
        this.f3703a = sQLiteProgram;
    }

    @Override // androidx.p054j.p055a.AbstractC1067d
    /* renamed from: a */
    public final void mo3803a(int i) {
        this.f3703a.bindNull(i);
    }

    @Override // androidx.p054j.p055a.AbstractC1067d
    /* renamed from: a */
    public final void mo3804a(int i, double d) {
        this.f3703a.bindDouble(i, d);
    }

    @Override // androidx.p054j.p055a.AbstractC1067d
    /* renamed from: a */
    public final void mo3805a(int i, long j) {
        this.f3703a.bindLong(i, j);
    }

    @Override // androidx.p054j.p055a.AbstractC1067d
    /* renamed from: a */
    public final void mo3806a(int i, String str) {
        this.f3703a.bindString(i, str);
    }

    @Override // androidx.p054j.p055a.AbstractC1067d
    /* renamed from: a */
    public final void mo3807a(int i, byte[] bArr) {
        this.f3703a.bindBlob(i, bArr);
    }
}
