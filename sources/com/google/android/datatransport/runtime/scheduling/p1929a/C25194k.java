package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.k */
final /* synthetic */ class C25194k implements C25188h.AbstractC25189a {

    /* renamed from: a */
    private final C25188h f59663a;

    /* renamed from: b */
    private final AbstractC25162k f59664b;

    static {
        Covode.recordClassIndex(30560);
    }

    C25194k(C25188h hVar, AbstractC25162k kVar) {
        this.f59663a = hVar;
        this.f59664b = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        MethodCollector.m26663i(2640);
        C25188h hVar = this.f59663a;
        AbstractC25162k kVar = this.f59664b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ArrayList arrayList = new ArrayList();
        Long a = C25188h.m48320a(sQLiteDatabase, kVar);
        if (a != null) {
            C25188h.m48321a(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", new String[]{a.toString()}, null, null, null, String.valueOf(hVar.f59654b.mo41151b())), new C25197n(arrayList, kVar));
        }
        List<AbstractC25187g> a2 = C25188h.m48324a(arrayList, C25188h.m48325a(sQLiteDatabase, arrayList));
        MethodCollector.m26664o(2640);
        return a2;
    }
}
