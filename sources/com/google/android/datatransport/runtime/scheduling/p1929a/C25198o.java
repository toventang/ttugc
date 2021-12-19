package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.o */
public final /* synthetic */ class C25198o implements C25188h.AbstractC25189a {

    /* renamed from: a */
    private final Map f59669a;

    static {
        Covode.recordClassIndex(30564);
    }

    C25198o(Map map) {
        this.f59669a = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        Map map = this.f59669a;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C25188h.C25190b(cursor.getString(1), cursor.getString(2), (byte) 0));
        }
        return null;
    }
}
