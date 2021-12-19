package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.p1928e.C25154a;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.j */
final /* synthetic */ class C25193j implements C25188h.AbstractC25189a {

    /* renamed from: a */
    private final long f59661a;

    /* renamed from: b */
    private final AbstractC25162k f59662b;

    static {
        Covode.recordClassIndex(30559);
    }

    C25193j(long j, AbstractC25162k kVar) {
        this.f59661a = j;
        this.f59662b = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        MethodCollector.m26663i(3658);
        long j = this.f59661a;
        AbstractC25162k kVar = this.f59662b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{kVar.mo41119a(), String.valueOf(C25154a.m48224a(kVar.mo41121c()))}) <= 0) {
            contentValues.put("backend_name", kVar.mo41119a());
            contentValues.put("priority", Integer.valueOf(C25154a.m48224a(kVar.mo41121c())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        MethodCollector.m26664o(3658);
        return null;
    }
}
