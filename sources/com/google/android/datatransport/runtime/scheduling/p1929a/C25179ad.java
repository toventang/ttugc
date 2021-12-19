package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25175aa;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.ad */
final /* synthetic */ class C25179ad implements C25175aa.AbstractC25176a {

    /* renamed from: a */
    static final C25179ad f59644a = new C25179ad();

    static {
        Covode.recordClassIndex(30545);
    }

    private C25179ad() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25175aa.AbstractC25176a
    /* renamed from: a */
    public final void mo41167a(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(1978);
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
        MethodCollector.m26664o(1978);
    }
}
