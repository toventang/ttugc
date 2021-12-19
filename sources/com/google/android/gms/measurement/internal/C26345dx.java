package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.util.AbstractC25603e;

/* renamed from: com.google.android.gms.measurement.internal.dx */
public final class C26345dx extends AbstractC26377fb {

    /* renamed from: a */
    private final C26344dw f61804a = new C26344dw(this, mo43012m(), "google_app_measurement_local.db");

    /* renamed from: b */
    private boolean f61805b;

    static {
        Covode.recordClassIndex(31767);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26377fb
    /* renamed from: u */
    public final boolean mo43045u() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42994a() {
        super.mo42994a();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo42999b() {
        super.mo42999b();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43002c() {
        super.mo43002c();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C26240a mo43003d() {
        return super.mo43003d();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C26413gk mo43004e() {
        return super.mo43004e();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C26342du mo43005f() {
        return super.mo43005f();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C26451hv mo43006g() {
        return super.mo43006g();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C26446hq mo43007h() {
        return super.mo43007h();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C26345dx mo43008i() {
        return super.mo43008i();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C26482iz mo43009j() {
        return super.mo43009j();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C26483j mo43010k() {
        return super.mo43010k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ AbstractC25603e mo43011l() {
        return super.mo43011l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43012m() {
        return super.mo43012m();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C26347dz mo43013n() {
        return super.mo43013n();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C26510jz mo43014o() {
        return super.mo43014o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C26372ex mo43015p() {
        return super.mo43015p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C26350eb mo43016q() {
        return super.mo43016q();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C26361em mo43017r() {
        return super.mo43017r();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C26524km mo43018s() {
        return super.mo43018s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C26523kl mo43019t() {
        return super.mo43019t();
    }

    /* renamed from: A */
    private final boolean m51579A() {
        return mo43012m().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: z */
    private final SQLiteDatabase m51581z() {
        if (this.f61805b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f61804a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f61805b = true;
        return null;
    }

    /* renamed from: w */
    public final void mo43057w() {
        MethodCollector.m26663i(5135);
        mo43002c();
        try {
            int delete = m51581z().delete("messages", null, null) + 0;
            if (delete > 0) {
                mo43016q().f61835k.mo43170a("Reset local analytics data. records", Integer.valueOf(delete));
            }
            MethodCollector.m26664o(5135);
        } catch (SQLiteException e) {
            mo43016q().f61827c.mo43170a("Error resetting local analytics data. error", e);
            MethodCollector.m26664o(5135);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090 A[SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43059y() {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26345dx.mo43059y():boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:55|56|57) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:37|38|39|156) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0194, code lost:
        if (r17.inTransaction() != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0196, code lost:
        r17.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a6, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ab, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d5, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01da, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01f8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01f9, code lost:
        r15 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01fa, code lost:
        r8 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0200, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0205, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        mo43016q().f61827c.mo43169a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        mo43016q().f61827c.mo43169a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        mo43016q().f61827c.mo43169a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0108, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0130, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0131, code lost:
        r11.recycle();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5285);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0137, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0138, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0139, code lost:
        r11.recycle();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5285);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0140, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0141, code lost:
        r11.recycle();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5285);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0147, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0179, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017c, code lost:
        r8 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0182, code lost:
        r10 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00fd */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01f3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:14:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0190 A[SYNTHETIC, Splitter:B:98:0x0190] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> mo43058x() {
        /*
        // Method dump skipped, instructions count: 539
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26345dx.mo43058x():java.util.List");
    }

    C26345dx(C26381ff ffVar) {
        super(ffVar);
    }

    /* renamed from: a */
    private static long m51580a(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(5498);
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (query.moveToFirst()) {
                long j = query.getLong(0);
                query.close();
                MethodCollector.m26664o(5498);
                return j;
            }
            query.close();
            MethodCollector.m26664o(5498);
            return -1;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(5498);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae A[SYNTHETIC, Splitter:B:35:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x011c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43056a(int r19, byte[] r20) {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26345dx.mo43056a(int, byte[]):boolean");
    }
}
