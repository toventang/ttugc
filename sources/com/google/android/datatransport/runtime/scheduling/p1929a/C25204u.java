package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.AbstractC25157h;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.p1928e.C25154a;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;
import com.kakao.usermgmt.StringSet;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.u */
final /* synthetic */ class C25204u implements C25188h.AbstractC25189a {

    /* renamed from: a */
    private final C25188h f59675a;

    /* renamed from: b */
    private final AbstractC25162k f59676b;

    /* renamed from: c */
    private final AbstractC25157h f59677c;

    static {
        Covode.recordClassIndex(30570);
    }

    C25204u(C25188h hVar, AbstractC25162k kVar, AbstractC25157h hVar2) {
        this.f59675a = hVar;
        this.f59676b = kVar;
        this.f59677c = hVar2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        long insert;
        MethodCollector.m26663i(2667);
        C25188h hVar = this.f59675a;
        AbstractC25162k kVar = this.f59676b;
        AbstractC25157h hVar2 = this.f59677c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (hVar.mo41183c().compileStatement("PRAGMA page_count").simpleQueryForLong() * hVar.mo41183c().compileStatement("PRAGMA page_size").simpleQueryForLong() >= hVar.f59654b.mo41150a()) {
            MethodCollector.m26664o(2667);
            return -1L;
        }
        Long a = C25188h.m48320a(sQLiteDatabase, kVar);
        if (a != null) {
            insert = a.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", kVar.mo41119a());
            contentValues.put("priority", Integer.valueOf(C25154a.m48224a(kVar.mo41121c())));
            contentValues.put("next_request_ms", (Integer) 0);
            if (kVar.mo41120b() != null) {
                contentValues.put("extras", Base64.encodeToString(kVar.mo41120b(), 0));
            }
            insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(insert));
        contentValues2.put("transport_name", hVar2.mo41064a());
        contentValues2.put("timestamp_ms", Long.valueOf(hVar2.mo41067d()));
        contentValues2.put("uptime_ms", Long.valueOf(hVar2.mo41068e()));
        contentValues2.put("payload_encoding", hVar2.mo41066c().f59599a.f59446a);
        contentValues2.put("payload", hVar2.mo41066c().f59600b);
        contentValues2.put("code", hVar2.mo41065b());
        contentValues2.put("num_attempts", (Integer) 0);
        long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
        for (Map.Entry<String, String> entry : hVar2.mo41141g().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert2));
            contentValues3.put(StringSet.name, entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        Long valueOf = Long.valueOf(insert2);
        MethodCollector.m26664o(2667);
        return valueOf;
    }
}
