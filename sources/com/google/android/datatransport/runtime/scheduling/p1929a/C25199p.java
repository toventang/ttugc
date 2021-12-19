package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.p */
final /* synthetic */ class C25199p implements C25188h.AbstractC25191c {

    /* renamed from: a */
    private final SQLiteDatabase f59670a;

    static {
        Covode.recordClassIndex(30565);
    }

    C25199p(SQLiteDatabase sQLiteDatabase) {
        this.f59670a = sQLiteDatabase;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25191c
    /* renamed from: a */
    public final Object mo41186a() {
        MethodCollector.m26663i(2425);
        this.f59670a.beginTransaction();
        MethodCollector.m26664o(2425);
        return null;
    }
}
