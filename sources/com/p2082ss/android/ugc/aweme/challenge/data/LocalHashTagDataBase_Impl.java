package com.p2082ss.android.ugc.aweme.challenge.data;

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
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase_Impl */
public final class LocalHashTagDataBase_Impl extends LocalHashTagDataBase {

    /* renamed from: k */
    private volatile AbstractC35506b f83730k;

    static {
        Covode.recordClassIndex(42697);
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: a */
    public final C1519g mo5084a() {
        return new C1519g(this, new HashMap(0), new HashMap(0), "localHashTag");
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase
    /* renamed from: i */
    public final AbstractC35506b mo62407i() {
        AbstractC35506b bVar;
        MethodCollector.m26663i(1258);
        if (this.f83730k != null) {
            AbstractC35506b bVar2 = this.f83730k;
            MethodCollector.m26664o(1258);
            return bVar2;
        }
        synchronized (this) {
            try {
                if (this.f83730k == null) {
                    this.f83730k = new C35507c(this);
                }
                bVar = this.f83730k;
            } finally {
                MethodCollector.m26664o(1258);
            }
        }
        return bVar;
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: b */
    public final AbstractC1062c mo5087b(C1500a aVar) {
        C1539l lVar = new C1539l(aVar, new C1539l.AbstractC1540a() {
            /* class com.p2082ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase_Impl.C355041 */

            static {
                Covode.recordClassIndex(42698);
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: a */
            public final void mo5100a() {
                if (LocalHashTagDataBase_Impl.this.f5040g != null) {
                    int size = LocalHashTagDataBase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        LocalHashTagDataBase_Impl.this.f5040g.get(i);
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
                bVar.mo3785c("DROP TABLE IF EXISTS `localHashTag`");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: b */
            public final void mo5102b(AbstractC1061b bVar) {
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `localHashTag` (`name` TEXT NOT NULL, `time` INTEGER, PRIMARY KEY(`name`))");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo3785c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0fdb23fe113307f93af74ceea527f0a9')");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: c */
            public final void mo5103c(AbstractC1061b bVar) {
                LocalHashTagDataBase_Impl.this.f5034a = bVar;
                LocalHashTagDataBase_Impl.this.mo5085a(bVar);
                if (LocalHashTagDataBase_Impl.this.f5040g != null) {
                    int size = LocalHashTagDataBase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC1533j.AbstractC1535b) LocalHashTagDataBase_Impl.this.f5040g.get(i)).mo5097a(bVar);
                    }
                }
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: d */
            public final void mo5104d(AbstractC1061b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put(StringSet.name, new C1506d.C1507a(StringSet.name, "TEXT", true, 1));
                hashMap.put("time", new C1506d.C1507a("time", "INTEGER", false, 0));
                C1506d dVar = new C1506d("localHashTag", hashMap, new HashSet(0), new HashSet(0));
                C1506d a = C1506d.m5133a(bVar, "localHashTag");
                if (!dVar.equals(a)) {
                    throw new IllegalStateException("Migration didn't properly handle localHashTag(com.ss.android.ugc.aweme.challenge.data.LocalHashTagItem).\n Expected:\n" + dVar + "\n Found:\n" + a);
                }
            }
        }, "0fdb23fe113307f93af74ceea527f0a9", "606e3395020db78e36e0b235c6657129");
        AbstractC1062c.C1064b.C1065a a = AbstractC1062c.C1064b.m3606a(aVar.f4949b);
        a.f3710b = aVar.f4950c;
        a.f3711c = lVar;
        return aVar.f4948a.mo3802a(a.mo3815a());
    }
}
