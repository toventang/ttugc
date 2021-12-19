package com.p2082ss.android.ugc.aweme.commercialize.dao;

import androidx.p054j.p055a.AbstractC1061b;
import androidx.p054j.p055a.AbstractC1062c;
import androidx.room.AbstractC1533j;
import androidx.room.C1500a;
import androidx.room.C1519g;
import androidx.room.C1539l;
import androidx.room.p069b.C1504b;
import androidx.room.p069b.C1506d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase_Impl */
public final class ShowAdDataBase_Impl extends ShowAdDataBase {

    /* renamed from: k */
    private volatile AbstractC37645b f89007k;

    static {
        Covode.recordClassIndex(45070);
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: a */
    public final C1519g mo5084a() {
        return new C1519g(this, new HashMap(0), new HashMap(0), "showAd");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase
    /* renamed from: i */
    public final AbstractC37645b mo65594i() {
        AbstractC37645b bVar;
        MethodCollector.m26663i(134);
        if (this.f89007k != null) {
            AbstractC37645b bVar2 = this.f89007k;
            MethodCollector.m26664o(134);
            return bVar2;
        }
        synchronized (this) {
            try {
                if (this.f89007k == null) {
                    this.f89007k = new C37646c(this);
                }
                bVar = this.f89007k;
            } finally {
                MethodCollector.m26664o(134);
            }
        }
        return bVar;
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: b */
    public final AbstractC1062c mo5087b(C1500a aVar) {
        C1539l lVar = new C1539l(aVar, new C1539l.AbstractC1540a() {
            /* class com.p2082ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase_Impl.C376431 */

            static {
                Covode.recordClassIndex(45071);
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: a */
            public final void mo5100a() {
                if (ShowAdDataBase_Impl.this.f5040g != null) {
                    int size = ShowAdDataBase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        ShowAdDataBase_Impl.this.f5040g.get(i);
                    }
                }
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: e */
            public final void mo5105e(AbstractC1061b bVar) {
                C1504b.m5130a(bVar);
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: a */
            public final void mo5101a(AbstractC1061b bVar) {
                bVar.mo3785c("DROP TABLE IF EXISTS `showAd`");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: b */
            public final void mo5102b(AbstractC1061b bVar) {
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `showAd` (`awemeId` TEXT NOT NULL, PRIMARY KEY(`awemeId`))");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo3785c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b390b3c8ccd346d851c56d8fb78f29df')");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: c */
            public final void mo5103c(AbstractC1061b bVar) {
                ShowAdDataBase_Impl.this.f5034a = bVar;
                ShowAdDataBase_Impl.this.mo5085a(bVar);
                if (ShowAdDataBase_Impl.this.f5040g != null) {
                    int size = ShowAdDataBase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC1533j.AbstractC1535b) ShowAdDataBase_Impl.this.f5040g.get(i)).mo5097a(bVar);
                    }
                }
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: d */
            public final void mo5104d(AbstractC1061b bVar) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("awemeId", new C1506d.C1507a("awemeId", "TEXT", true, 1));
                C1506d dVar = new C1506d("showAd", hashMap, new HashSet(0), new HashSet(0));
                C1506d a = C1506d.m5133a(bVar, "showAd");
                if (!dVar.equals(a)) {
                    throw new IllegalStateException("Migration didn't properly handle showAd(com.ss.android.ugc.aweme.commercialize.dao.ShowAd).\n Expected:\n" + dVar + "\n Found:\n" + a);
                }
            }
        }, "b390b3c8ccd346d851c56d8fb78f29df", "ad22cd0c0878f7d44a84485b85a127f7");
        AbstractC1062c.C1064b.C1065a a = AbstractC1062c.C1064b.m3606a(aVar.f4949b);
        a.f3710b = aVar.f4950c;
        a.f3711c = lVar;
        return aVar.f4948a.mo3802a(a.mo3815a());
    }
}
