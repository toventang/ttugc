package com.p2082ss.android.ugc.aweme.runtime.behavior;

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

/* renamed from: com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase_Impl */
public final class RuntimeBehaviorDataBase_Impl extends RuntimeBehaviorDataBase {

    /* renamed from: k */
    private volatile AbstractC67207a f150627k;

    static {
        Covode.recordClassIndex(78824);
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: a */
    public final C1519g mo5084a() {
        return new C1519g(this, new HashMap(0), new HashMap(0), "runtimeBehaviorEntity");
    }

    @Override // com.p2082ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase
    /* renamed from: i */
    public final AbstractC67207a mo106099i() {
        AbstractC67207a aVar;
        MethodCollector.m26663i(4563);
        if (this.f150627k != null) {
            AbstractC67207a aVar2 = this.f150627k;
            MethodCollector.m26664o(4563);
            return aVar2;
        }
        synchronized (this) {
            try {
                if (this.f150627k == null) {
                    this.f150627k = new C67208b(this);
                }
                aVar = this.f150627k;
            } finally {
                MethodCollector.m26664o(4563);
            }
        }
        return aVar;
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: b */
    public final AbstractC1062c mo5087b(C1500a aVar) {
        C1539l lVar = new C1539l(aVar, new C1539l.AbstractC1540a() {
            /* class com.p2082ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase_Impl.C672061 */

            static {
                Covode.recordClassIndex(78825);
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: a */
            public final void mo5100a() {
                if (RuntimeBehaviorDataBase_Impl.this.f5040g != null) {
                    int size = RuntimeBehaviorDataBase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        RuntimeBehaviorDataBase_Impl.this.f5040g.get(i);
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
                bVar.mo3785c("DROP TABLE IF EXISTS `runtimeBehaviorEntity`");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: b */
            public final void mo5102b(AbstractC1061b bVar) {
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `runtimeBehaviorEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `time` INTEGER NOT NULL, `msg` TEXT NOT NULL)");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo3785c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '977ffca18b985d80d9f488e58c9d7da9')");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: c */
            public final void mo5103c(AbstractC1061b bVar) {
                RuntimeBehaviorDataBase_Impl.this.f5034a = bVar;
                RuntimeBehaviorDataBase_Impl.this.mo5085a(bVar);
                if (RuntimeBehaviorDataBase_Impl.this.f5040g != null) {
                    int size = RuntimeBehaviorDataBase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC1533j.AbstractC1535b) RuntimeBehaviorDataBase_Impl.this.f5040g.get(i)).mo5097a(bVar);
                    }
                }
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: d */
            public final void mo5104d(AbstractC1061b bVar) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("id", new C1506d.C1507a("id", "INTEGER", true, 1));
                hashMap.put(StringSet.type, new C1506d.C1507a(StringSet.type, "TEXT", true, 0));
                hashMap.put("time", new C1506d.C1507a("time", "INTEGER", true, 0));
                hashMap.put("msg", new C1506d.C1507a("msg", "TEXT", true, 0));
                C1506d dVar = new C1506d("runtimeBehaviorEntity", hashMap, new HashSet(0), new HashSet(0));
                C1506d a = C1506d.m5133a(bVar, "runtimeBehaviorEntity");
                if (!dVar.equals(a)) {
                    throw new IllegalStateException("Migration didn't properly handle runtimeBehaviorEntity(com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorEntity).\n Expected:\n" + dVar + "\n Found:\n" + a);
                }
            }
        }, "977ffca18b985d80d9f488e58c9d7da9", "3d4bcb8798a8e5184ae76e79c3f54456");
        AbstractC1062c.C1064b.C1065a a = AbstractC1062c.C1064b.m3606a(aVar.f4949b);
        a.f3710b = aVar.f4950c;
        a.f3711c = lVar;
        return aVar.f4948a.mo3802a(a.mo3815a());
    }
}
