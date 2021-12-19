package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.m */
final /* synthetic */ class C25196m implements C25188h.AbstractC25189a {

    /* renamed from: a */
    private final long f59666a;

    static {
        Covode.recordClassIndex(30562);
    }

    C25196m(long j) {
        this.f59666a = j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        MethodCollector.m26663i(2500);
        Integer valueOf = Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f59666a)}));
        MethodCollector.m26664o(2500);
        return valueOf;
    }
}
