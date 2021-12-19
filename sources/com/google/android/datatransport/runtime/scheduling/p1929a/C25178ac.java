package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25175aa;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.ac */
final /* synthetic */ class C25178ac implements C25175aa.AbstractC25176a {

    /* renamed from: a */
    static final C25178ac f59643a = new C25178ac();

    static {
        Covode.recordClassIndex(30544);
    }

    private C25178ac() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25175aa.AbstractC25176a
    /* renamed from: a */
    public final void mo41167a(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(2028);
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
        MethodCollector.m26664o(2028);
    }
}
