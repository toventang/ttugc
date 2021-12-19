package androidx.p054j.p055a.p056a;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.p054j.p055a.AbstractC1061b;
import androidx.p054j.p055a.AbstractC1062c;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.j.a.a.b */
final class C1055b implements AbstractC1062c {

    /* renamed from: a */
    private final C1056a f3697a;

    static {
        Covode.recordClassIndex(1148);
    }

    @Override // androidx.p054j.p055a.AbstractC1062c
    /* renamed from: a */
    public final AbstractC1061b mo3792a() {
        return this.f3697a.mo3794a();
    }

    /* renamed from: androidx.j.a.a.b$a */
    static class C1056a extends SQLiteOpenHelper {

        /* renamed from: a */
        final C1053a[] f3698a;

        /* renamed from: b */
        final AbstractC1062c.AbstractC1063a f3699b;

        /* renamed from: c */
        private boolean f3700c;

        static {
            Covode.recordClassIndex(1149);
        }

        @Override // java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.f3698a[0] = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized AbstractC1061b mo3794a() {
            this.f3700c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f3700c) {
                close();
                return mo3794a();
            }
            return m3577a(writableDatabase);
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            m3577a(sQLiteDatabase);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f3699b.mo3811a(m3577a(sQLiteDatabase));
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f3700c) {
                this.f3699b.mo3813b(m3577a(sQLiteDatabase));
            }
        }

        /* renamed from: a */
        private C1053a m3577a(SQLiteDatabase sQLiteDatabase) {
            if (this.f3698a[0] == null) {
                this.f3698a[0] = new C1053a(sQLiteDatabase);
            }
            return this.f3698a[0];
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f3700c = true;
            this.f3699b.mo3814b(m3577a(sQLiteDatabase), i, i2);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f3700c = true;
            this.f3699b.mo3812a(m3577a(sQLiteDatabase), i, i2);
        }

        C1056a(Context context, String str, final C1053a[] aVarArr, final AbstractC1062c.AbstractC1063a aVar) {
            super(context, str, null, aVar.f3705a, new DatabaseErrorHandler() {
                /* class androidx.p054j.p055a.p056a.C1055b.C1056a.C10571 */

                static {
                    Covode.recordClassIndex(1150);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
                    r2 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
                    if (r0 != null) goto L_0x0024;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
                    r1 = r0.iterator();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
                    if (r1.hasNext() != false) goto L_0x002e;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
                    androidx.p054j.p055a.AbstractC1062c.AbstractC1063a.m3600a((java.lang.String) r1.next().second);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
                    androidx.p054j.p055a.AbstractC1062c.AbstractC1063a.m3600a(r1.mo3789f());
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
                    throw r2;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001d */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x0021 A[ExcHandler: all (r2v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
                  PHI: (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:7:0x0019, B:9:0x001d, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:7:0x0019] */
                /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                    /*
                    // Method dump skipped, instructions count: 103
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.p054j.p055a.p056a.C1055b.C1056a.C10571.onCorruption(android.database.sqlite.SQLiteDatabase):void");
                }
            });
            this.f3699b = aVar;
            this.f3698a = aVarArr;
        }
    }

    @Override // androidx.p054j.p055a.AbstractC1062c
    /* renamed from: a */
    public final void mo3793a(boolean z) {
        this.f3697a.setWriteAheadLoggingEnabled(z);
    }

    C1055b(Context context, String str, AbstractC1062c.AbstractC1063a aVar) {
        this.f3697a = new C1056a(context, str, new C1053a[1], aVar);
    }
}
