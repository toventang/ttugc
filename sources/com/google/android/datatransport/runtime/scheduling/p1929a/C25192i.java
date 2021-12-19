package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.i */
final /* synthetic */ class C25192i implements C25188h.AbstractC25191c {

    /* renamed from: a */
    private final C25175aa f59660a;

    static {
        Covode.recordClassIndex(30558);
    }

    C25192i(C25175aa aaVar) {
        this.f59660a = aaVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25191c
    /* renamed from: a */
    public final Object mo41186a() {
        MethodCollector.m26663i(3123);
        SQLiteDatabase writableDatabase = this.f59660a.getWritableDatabase();
        MethodCollector.m26664o(3123);
        return writableDatabase;
    }
}
