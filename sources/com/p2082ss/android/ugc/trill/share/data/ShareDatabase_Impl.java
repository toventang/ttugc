package com.p2082ss.android.ugc.trill.share.data;

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

/* renamed from: com.ss.android.ugc.trill.share.data.ShareDatabase_Impl */
public final class ShareDatabase_Impl extends ShareDatabase {

    /* renamed from: k */
    private volatile AbstractC85185b f190604k;

    static {
        Covode.recordClassIndex(99228);
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: a */
    public final C1519g mo5084a() {
        return new C1519g(this, new HashMap(0), new HashMap(0), "Record");
    }

    @Override // com.p2082ss.android.ugc.trill.share.data.ShareDatabase
    /* renamed from: i */
    public final AbstractC85185b mo130107i() {
        AbstractC85185b bVar;
        MethodCollector.m26663i(3476);
        if (this.f190604k != null) {
            AbstractC85185b bVar2 = this.f190604k;
            MethodCollector.m26664o(3476);
            return bVar2;
        }
        synchronized (this) {
            try {
                if (this.f190604k == null) {
                    this.f190604k = new C85186c(this);
                }
                bVar = this.f190604k;
            } finally {
                MethodCollector.m26664o(3476);
            }
        }
        return bVar;
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: b */
    public final AbstractC1062c mo5087b(C1500a aVar) {
        C1539l lVar = new C1539l(aVar, new C1539l.AbstractC1540a() {
            /* class com.p2082ss.android.ugc.trill.share.data.ShareDatabase_Impl.C851831 */

            static {
                Covode.recordClassIndex(99229);
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: a */
            public final void mo5100a() {
                if (ShareDatabase_Impl.this.f5040g != null) {
                    int size = ShareDatabase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        ShareDatabase_Impl.this.f5040g.get(i);
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
                bVar.mo3785c("DROP TABLE IF EXISTS `Record`");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: b */
            public final void mo5102b(AbstractC1061b bVar) {
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `Record` (`rid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER, `channel` TEXT, `share_type` INTEGER)");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo3785c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4e670bbb58b1cec9bfaaeb409ecedc0d')");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: c */
            public final void mo5103c(AbstractC1061b bVar) {
                ShareDatabase_Impl.this.f5034a = bVar;
                ShareDatabase_Impl.this.mo5085a(bVar);
                if (ShareDatabase_Impl.this.f5040g != null) {
                    int size = ShareDatabase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC1533j.AbstractC1535b) ShareDatabase_Impl.this.f5040g.get(i)).mo5097a(bVar);
                    }
                }
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: d */
            public final void mo5104d(AbstractC1061b bVar) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("rid", new C1506d.C1507a("rid", "INTEGER", true, 1));
                hashMap.put("time", new C1506d.C1507a("time", "INTEGER", false, 0));
                hashMap.put("channel", new C1506d.C1507a("channel", "TEXT", false, 0));
                hashMap.put("share_type", new C1506d.C1507a("share_type", "INTEGER", false, 0));
                C1506d dVar = new C1506d("Record", hashMap, new HashSet(0), new HashSet(0));
                C1506d a = C1506d.m5133a(bVar, "Record");
                if (!dVar.equals(a)) {
                    throw new IllegalStateException("Migration didn't properly handle Record(com.ss.android.ugc.trill.share.data.Record).\n Expected:\n" + dVar + "\n Found:\n" + a);
                }
            }
        }, "4e670bbb58b1cec9bfaaeb409ecedc0d", "c53d71306862fad59b3a3fe103512963");
        AbstractC1062c.C1064b.C1065a a = AbstractC1062c.C1064b.m3606a(aVar.f4949b);
        a.f3710b = aVar.f4950c;
        a.f3711c = lVar;
        return aVar.f4948a.mo3802a(a.mo3815a());
    }
}
