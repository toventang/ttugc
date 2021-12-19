package com.google.android.datatransport.runtime.scheduling.p1929a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.C25068b;
import com.google.android.datatransport.runtime.AbstractC25157h;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.C25156g;
import com.google.android.datatransport.runtime.scheduling.p1929a.C25188h;
import java.util.List;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.n */
final /* synthetic */ class C25197n implements C25188h.AbstractC25189a {

    /* renamed from: a */
    private final List f59667a;

    /* renamed from: b */
    private final AbstractC25162k f59668b;

    static {
        Covode.recordClassIndex(30563);
    }

    C25197n(List list, AbstractC25162k kVar) {
        this.f59667a = list;
        this.f59668b = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.C25188h.AbstractC25189a
    /* renamed from: a */
    public final Object mo41185a(Object obj) {
        C25068b a;
        List list = this.f59667a;
        AbstractC25162k kVar = this.f59668b;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            AbstractC25157h.AbstractC25158a b = AbstractC25157h.m48227i().mo41076a(cursor.getString(1)).mo41073a(cursor.getLong(2)).mo41079b(cursor.getLong(3));
            String string = cursor.getString(4);
            if (string == null) {
                a = C25188h.f59653a;
            } else {
                a = C25068b.m48045a(string);
            }
            AbstractC25157h.AbstractC25158a a2 = b.mo41074a(new C25156g(a, cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                a2.mo41075a(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC25187g.m48316a(j, kVar, a2.mo41080b()));
        }
        return null;
    }
}
