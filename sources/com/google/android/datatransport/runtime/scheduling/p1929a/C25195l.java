package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.l */
final /* synthetic */ class C25195l implements C25188h.AbstractC25189a {

    /* renamed from: a */
    static final C25195l f59665a = new C25195l();

    static {
        Covode.recordClassIndex(30561);
    }

    private C25195l() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        MethodCollector.m26663i(2489);
        Object a = C25188h.m48321a(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C25201r.f59672a);
        MethodCollector.m26664o(2489);
        return a;
    }
}
