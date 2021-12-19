package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25175aa;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.ab */
final /* synthetic */ class C25177ab implements C25175aa.AbstractC25176a {

    /* renamed from: a */
    static final C25177ab f59642a = new C25177ab();

    static {
        Covode.recordClassIndex(30543);
    }

    private C25177ab() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25175aa.AbstractC25176a
    /* renamed from: a */
    public final void mo41167a(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(2052);
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
        MethodCollector.m26664o(2052);
    }
}
