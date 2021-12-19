package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.w */
final /* synthetic */ class C25206w implements C25188h.AbstractC25189a {

    /* renamed from: a */
    private final String f59679a;

    static {
        Covode.recordClassIndex(30572);
    }

    C25206w(String str) {
        this.f59679a = str;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        MethodCollector.m26663i(2192);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.compileStatement(this.f59679a).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        MethodCollector.m26664o(2192);
        return null;
    }
}
