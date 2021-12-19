package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.datatransport.C25068b;
import com.google.android.datatransport.runtime.AbstractC25157h;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.p1924a.C25118a;
import com.google.android.datatransport.runtime.p1926c.AbstractC25144b;
import com.google.android.datatransport.runtime.p1927d.AbstractC25148a;
import com.google.android.datatransport.runtime.p1928e.C25154a;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.h */
public final class C25188h implements AbstractC25144b, AbstractC25182c {

    /* renamed from: a */
    static final C25068b f59653a = C25068b.m48045a("proto");

    /* renamed from: b */
    final AbstractC25183d f59654b;

    /* renamed from: c */
    private final C25175aa f59655c;

    /* renamed from: d */
    private final AbstractC25148a f59656d;

    /* renamed from: e */
    private final AbstractC25148a f59657e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.h$a */
    public interface AbstractC25189a<T, U> {
        static {
            Covode.recordClassIndex(30555);
        }

        /* renamed from: a */
        U mo41185a(T t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.h$c */
    public interface AbstractC25191c<T> {
        static {
            Covode.recordClassIndex(30557);
        }

        /* renamed from: a */
        T mo41186a();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c
    /* renamed from: a */
    public final AbstractC25187g mo41175a(AbstractC25162k kVar, AbstractC25157h hVar) {
        C25118a.m48160a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", kVar.mo41121c(), hVar.mo41064a(), kVar.mo41119a());
        long longValue = ((Long) m48322a(new C25204u(this, kVar, hVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC25187g.m48316a(longValue, kVar, hVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c
    /* renamed from: a */
    public final void mo41178a(Iterable<AbstractC25187g> iterable) {
        if (iterable.iterator().hasNext()) {
            m48322a(new C25206w("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m48326c(iterable)));
        }
    }

    @Override // com.google.android.datatransport.runtime.p1926c.AbstractC25144b
    /* renamed from: a */
    public final <T> T mo41128a(AbstractC25144b.AbstractC25145a<T> aVar) {
        MethodCollector.m26663i(3577);
        SQLiteDatabase c = mo41183c();
        m48323a(new C25199p(c), C25200q.f59671a);
        try {
            T a = aVar.mo41129a();
            c.setTransactionSuccessful();
            return a;
        } finally {
            c.endTransaction();
            MethodCollector.m26664o(3577);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c
    /* renamed from: a */
    public final void mo41177a(AbstractC25162k kVar, long j) {
        m48322a(new C25193j(j, kVar));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f59655c.close();
    }

    static {
        Covode.recordClassIndex(30554);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c
    /* renamed from: a */
    public final Iterable<AbstractC25162k> mo41176a() {
        return (Iterable) m48322a(C25195l.f59665a);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c
    /* renamed from: b */
    public final int mo41179b() {
        return ((Integer) m48322a(new C25196m(this.f59656d.mo41134a() - this.f59654b.mo41153d()))).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final SQLiteDatabase mo41183c() {
        C25175aa aaVar = this.f59655c;
        aaVar.getClass();
        return (SQLiteDatabase) m48323a(new C25192i(aaVar), C25203t.f59674a);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c
    /* renamed from: b */
    public final boolean mo41181b(AbstractC25162k kVar) {
        return ((Boolean) m48322a(new C25208y(this, kVar))).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c
    /* renamed from: c */
    public final Iterable<AbstractC25187g> mo41182c(AbstractC25162k kVar) {
        return (Iterable) m48322a(new C25194k(this, kVar));
    }

    /* renamed from: a */
    private <T> T m48322a(AbstractC25189a<SQLiteDatabase, T> aVar) {
        MethodCollector.m26663i(3587);
        SQLiteDatabase c = mo41183c();
        c.beginTransaction();
        try {
            T a = aVar.mo41185a(c);
            c.setTransactionSuccessful();
            return a;
        } finally {
            c.endTransaction();
            MethodCollector.m26664o(3587);
        }
    }

    /* renamed from: c */
    private static String m48326c(Iterable<AbstractC25187g> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC25187g> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo41168a());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c
    /* renamed from: b */
    public final void mo41180b(Iterable<AbstractC25187g> iterable) {
        MethodCollector.m26663i(3314);
        if (!iterable.iterator().hasNext()) {
            MethodCollector.m26664o(3314);
            return;
        }
        mo41183c().compileStatement("DELETE FROM events WHERE _id in " + m48326c(iterable)).execute();
        MethodCollector.m26664o(3314);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25182c
    /* renamed from: a */
    public final long mo41174a(AbstractC25162k kVar) {
        MethodCollector.m26663i(3369);
        long longValue = ((Long) m48321a(mo41183c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{kVar.mo41119a(), String.valueOf(C25154a.m48224a(kVar.mo41121c()))}), C25207x.f59680a)).longValue();
        MethodCollector.m26664o(3369);
        return longValue;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.h$b */
    public static class C25190b {

        /* renamed from: a */
        final String f59658a;

        /* renamed from: b */
        final String f59659b;

        static {
            Covode.recordClassIndex(30556);
        }

        private C25190b(String str, String str2) {
            this.f59658a = str;
            this.f59659b = str2;
        }

        /* synthetic */ C25190b(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    /* renamed from: a */
    static <T> T m48321a(Cursor cursor, AbstractC25189a<Cursor, T> aVar) {
        try {
            return aVar.mo41185a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: a */
    static Long m48320a(SQLiteDatabase sQLiteDatabase, AbstractC25162k kVar) {
        MethodCollector.m26663i(3295);
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(kVar.mo41119a(), String.valueOf(C25154a.m48224a(kVar.mo41121c()))));
        if (kVar.mo41120b() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(kVar.mo41120b(), 0));
        }
        Long l = (Long) m48321a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), C25205v.f59678a);
        MethodCollector.m26664o(3295);
        return l;
    }

    /* renamed from: a */
    private <T> T m48323a(AbstractC25191c<T> cVar, AbstractC25189a<Throwable, T> aVar) {
        long a = this.f59657e.mo41134a();
        while (true) {
            try {
                return cVar.mo41186a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f59657e.mo41134a() >= ((long) this.f59654b.mo41152c()) + a) {
                    return aVar.mo41185a(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: a */
    static List<AbstractC25187g> m48324a(List<AbstractC25187g> list, Map<Long, Set<C25190b>> map) {
        ListIterator<AbstractC25187g> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC25187g next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo41168a()))) {
                AbstractC25157h.AbstractC25158a h = next.mo41170c().mo41142h();
                for (C25190b bVar : map.get(Long.valueOf(next.mo41168a()))) {
                    h.mo41145a(bVar.f59658a, bVar.f59659b);
                }
                listIterator.set(AbstractC25187g.m48316a(next.mo41168a(), next.mo41169b(), h.mo41080b()));
            }
        }
        return list;
    }

    /* renamed from: a */
    static Map<Long, Set<C25190b>> m48325a(SQLiteDatabase sQLiteDatabase, List<AbstractC25187g> list) {
        MethodCollector.m26663i(3418);
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo41168a());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m48321a(sQLiteDatabase.query("event_metadata", new String[]{"event_id", StringSet.name, "value"}, sb.toString(), null, null, null, null), new C25198o(hashMap));
        MethodCollector.m26664o(3418);
        return hashMap;
    }

    C25188h(AbstractC25148a aVar, AbstractC25148a aVar2, AbstractC25183d dVar, C25175aa aaVar) {
        this.f59655c = aaVar;
        this.f59656d = aVar;
        this.f59657e = aVar2;
        this.f59654b = dVar;
    }
}
