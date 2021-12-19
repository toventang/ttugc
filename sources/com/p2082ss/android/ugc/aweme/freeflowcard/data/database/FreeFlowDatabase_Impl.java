package com.p2082ss.android.ugc.aweme.freeflowcard.data.database;

import androidx.p054j.p055a.AbstractC1061b;
import androidx.p054j.p055a.AbstractC1062c;
import androidx.room.AbstractC1533j;
import androidx.room.C1500a;
import androidx.room.C1519g;
import androidx.room.C1539l;
import androidx.room.p069b.C1504b;
import androidx.room.p069b.C1506d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.database.FreeFlowDatabase_Impl */
public final class FreeFlowDatabase_Impl extends FreeFlowDatabase {
    static {
        Covode.recordClassIndex(60690);
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: a */
    public final C1519g mo5084a() {
        return new C1519g(this, new HashMap(0), new HashMap(0), "tb_auto_play_setting", "tb_user_click_event", "tb_app_start_mode");
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: b */
    public final AbstractC1062c mo5087b(C1500a aVar) {
        C1539l lVar = new C1539l(aVar, new C1539l.AbstractC1540a() {
            /* class com.p2082ss.android.ugc.aweme.freeflowcard.data.database.FreeFlowDatabase_Impl.C514341 */

            static {
                Covode.recordClassIndex(60691);
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: a */
            public final void mo5100a() {
                if (FreeFlowDatabase_Impl.this.f5040g != null) {
                    int size = FreeFlowDatabase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        FreeFlowDatabase_Impl.this.f5040g.get(i);
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
                bVar.mo3785c("DROP TABLE IF EXISTS `tb_auto_play_setting`");
                bVar.mo3785c("DROP TABLE IF EXISTS `tb_user_click_event`");
                bVar.mo3785c("DROP TABLE IF EXISTS `tb_app_start_mode`");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: b */
            public final void mo5102b(AbstractC1061b bVar) {
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `tb_auto_play_setting` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_open` INTEGER NOT NULL, `change_type` INTEGER NOT NULL, `reset_time` INTEGER NOT NULL, `monthly_state` INTEGER NOT NULL, `day_open` INTEGER NOT NULL, `day_open_reset_time` INTEGER NOT NULL)");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `tb_user_click_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `click_type` INTEGER NOT NULL, `is_auto_play` INTEGER NOT NULL)");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `tb_app_start_mode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `start_mode` INTEGER NOT NULL)");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo3785c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1967f4d2e5a4f7e5e76e753b06cafe2b')");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: c */
            public final void mo5103c(AbstractC1061b bVar) {
                FreeFlowDatabase_Impl.this.f5034a = bVar;
                FreeFlowDatabase_Impl.this.mo5085a(bVar);
                if (FreeFlowDatabase_Impl.this.f5040g != null) {
                    int size = FreeFlowDatabase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC1533j.AbstractC1535b) FreeFlowDatabase_Impl.this.f5040g.get(i)).mo5097a(bVar);
                    }
                }
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: d */
            public final void mo5104d(AbstractC1061b bVar) {
                HashMap hashMap = new HashMap(7);
                hashMap.put("id", new C1506d.C1507a("id", "INTEGER", true, 1));
                hashMap.put("is_open", new C1506d.C1507a("is_open", "INTEGER", true, 0));
                hashMap.put("change_type", new C1506d.C1507a("change_type", "INTEGER", true, 0));
                hashMap.put("reset_time", new C1506d.C1507a("reset_time", "INTEGER", true, 0));
                hashMap.put("monthly_state", new C1506d.C1507a("monthly_state", "INTEGER", true, 0));
                hashMap.put("day_open", new C1506d.C1507a("day_open", "INTEGER", true, 0));
                hashMap.put("day_open_reset_time", new C1506d.C1507a("day_open_reset_time", "INTEGER", true, 0));
                C1506d dVar = new C1506d("tb_auto_play_setting", hashMap, new HashSet(0), new HashSet(0));
                C1506d a = C1506d.m5133a(bVar, "tb_auto_play_setting");
                if (dVar.equals(a)) {
                    HashMap hashMap2 = new HashMap(4);
                    hashMap2.put("id", new C1506d.C1507a("id", "INTEGER", true, 1));
                    hashMap2.put("time", new C1506d.C1507a("time", "INTEGER", true, 0));
                    hashMap2.put("click_type", new C1506d.C1507a("click_type", "INTEGER", true, 0));
                    hashMap2.put("is_auto_play", new C1506d.C1507a("is_auto_play", "INTEGER", true, 0));
                    C1506d dVar2 = new C1506d("tb_user_click_event", hashMap2, new HashSet(0), new HashSet(0));
                    C1506d a2 = C1506d.m5133a(bVar, "tb_user_click_event");
                    if (dVar2.equals(a2)) {
                        HashMap hashMap3 = new HashMap(3);
                        hashMap3.put("id", new C1506d.C1507a("id", "INTEGER", true, 1));
                        hashMap3.put("time", new C1506d.C1507a("time", "INTEGER", true, 0));
                        hashMap3.put("start_mode", new C1506d.C1507a("start_mode", "INTEGER", true, 0));
                        C1506d dVar3 = new C1506d("tb_app_start_mode", hashMap3, new HashSet(0), new HashSet(0));
                        C1506d a3 = C1506d.m5133a(bVar, "tb_app_start_mode");
                        if (!dVar3.equals(a3)) {
                            throw new IllegalStateException("Migration didn't properly handle tb_app_start_mode(com.ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode).\n Expected:\n" + dVar3 + "\n Found:\n" + a3);
                        }
                        return;
                    }
                    throw new IllegalStateException("Migration didn't properly handle tb_user_click_event(com.ss.android.ugc.aweme.freeflowcard.data.entity.UserClickEvent).\n Expected:\n" + dVar2 + "\n Found:\n" + a2);
                }
                throw new IllegalStateException("Migration didn't properly handle tb_auto_play_setting(com.ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting).\n Expected:\n" + dVar + "\n Found:\n" + a);
            }
        }, "1967f4d2e5a4f7e5e76e753b06cafe2b", "b3be3e5c94533db90027e813123cd689");
        AbstractC1062c.C1064b.C1065a a = AbstractC1062c.C1064b.m3606a(aVar.f4949b);
        a.f3710b = aVar.f4950c;
        a.f3711c = lVar;
        return aVar.f4948a.mo3802a(a.mo3815a());
    }
}
