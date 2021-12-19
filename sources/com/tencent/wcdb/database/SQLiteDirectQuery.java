package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.support.C87272a;

public class SQLiteDirectQuery extends AbstractC87256j {

    /* renamed from: g */
    private static final int[] f197660g = {3, 1, 2, 3, 4, 0};

    /* renamed from: f */
    private final C87272a f197661f;

    private static native byte[] nativeGetBlob(long j, int i);

    private static native double nativeGetDouble(long j, int i);

    private static native long nativeGetLong(long j, int i);

    private static native String nativeGetString(long j, int i);

    private static native int nativeGetType(long j, int i);

    private static native int nativeStep(long j, int i);

    static {
        Covode.recordClassIndex(103121);
    }

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.database.AbstractC87256j, com.tencent.wcdb.database.AbstractC87245c
    /* renamed from: c */
    public final void mo141108c() {
        SQLiteConnection sQLiteConnection;
        MethodCollector.m26663i(4989);
        synchronized (this) {
            try {
                if (this.f197744e != null) {
                    SQLiteConnection.C87239c cVar = this.f197744e;
                    C87272a aVar = this.f197661f;
                    SQLiteConnection sQLiteConnection2 = cVar.f197636a.get();
                    if (sQLiteConnection2 != null) {
                        sQLiteConnection2.mo141172a(aVar);
                    }
                    SQLiteConnection.C87239c cVar2 = this.f197744e;
                    if (!(cVar2.f197645j == null || (sQLiteConnection = cVar2.f197636a.get()) == null)) {
                        if (sQLiteConnection.f197607f.mo141192b(cVar2.f197645j.f197629h)) {
                            sQLiteConnection.f197607f.mo141191a(cVar2.f197645j.f197629h, (String) null);
                        }
                        cVar2.f197645j = null;
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(4989);
                throw th;
            }
        }
        super.mo141108c();
        MethodCollector.m26664o(4989);
    }
}
