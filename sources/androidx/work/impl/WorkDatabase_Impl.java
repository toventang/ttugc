package androidx.work.impl;

import androidx.p054j.p055a.AbstractC1061b;
import androidx.p054j.p055a.AbstractC1062c;
import androidx.room.AbstractC1533j;
import androidx.room.C1500a;
import androidx.room.C1519g;
import androidx.room.C1539l;
import androidx.room.p069b.C1506d;
import androidx.work.impl.p073b.AbstractC1634b;
import androidx.work.impl.p073b.AbstractC1638e;
import androidx.work.impl.p073b.AbstractC1645h;
import androidx.work.impl.p073b.AbstractC1657k;
import androidx.work.impl.p073b.C1635c;
import androidx.work.impl.p073b.C1639f;
import androidx.work.impl.p073b.C1646i;
import androidx.work.impl.p073b.C1658l;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: l */
    private volatile AbstractC1645h f5238l;

    /* renamed from: m */
    private volatile AbstractC1634b f5239m;

    /* renamed from: n */
    private volatile AbstractC1657k f5240n;

    /* renamed from: o */
    private volatile AbstractC1638e f5241o;

    static {
        Covode.recordClassIndex(1760);
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: a */
    public final C1519g mo5084a() {
        return new C1519g(this, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: i */
    public final AbstractC1645h mo5366i() {
        AbstractC1645h hVar;
        if (this.f5238l != null) {
            return this.f5238l;
        }
        synchronized (this) {
            if (this.f5238l == null) {
                this.f5238l = new C1646i(this);
            }
            hVar = this.f5238l;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: j */
    public final AbstractC1634b mo5367j() {
        AbstractC1634b bVar;
        if (this.f5239m != null) {
            return this.f5239m;
        }
        synchronized (this) {
            if (this.f5239m == null) {
                this.f5239m = new C1635c(this);
            }
            bVar = this.f5239m;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: k */
    public final AbstractC1657k mo5368k() {
        AbstractC1657k kVar;
        if (this.f5240n != null) {
            return this.f5240n;
        }
        synchronized (this) {
            if (this.f5240n == null) {
                this.f5240n = new C1658l(this);
            }
            kVar = this.f5240n;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: l */
    public final AbstractC1638e mo5369l() {
        AbstractC1638e eVar;
        if (this.f5241o != null) {
            return this.f5241o;
        }
        synchronized (this) {
            if (this.f5241o == null) {
                this.f5241o = new C1639f(this);
            }
            eVar = this.f5241o;
        }
        return eVar;
    }

    @Override // androidx.room.AbstractC1533j
    /* renamed from: b */
    public final AbstractC1062c mo5087b(C1500a aVar) {
        C1539l lVar = new C1539l(aVar, new C1539l.AbstractC1540a() {
            /* class androidx.work.impl.WorkDatabase_Impl.C16061 */

            static {
                Covode.recordClassIndex(1761);
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: a */
            public final void mo5100a() {
                if (WorkDatabase_Impl.this.f5040g != null) {
                    int size = WorkDatabase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        WorkDatabase_Impl.this.f5040g.get(i);
                    }
                }
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: a */
            public final void mo5101a(AbstractC1061b bVar) {
                bVar.mo3785c("DROP TABLE IF EXISTS `Dependency`");
                bVar.mo3785c("DROP TABLE IF EXISTS `WorkSpec`");
                bVar.mo3785c("DROP TABLE IF EXISTS `WorkTag`");
                bVar.mo3785c("DROP TABLE IF EXISTS `SystemIdInfo`");
                bVar.mo3785c("DROP TABLE IF EXISTS `WorkName`");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: b */
            public final void mo5102b(AbstractC1061b bVar) {
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo3785c("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                bVar.mo3785c("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                bVar.mo3785c("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo3785c("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo3785c("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                bVar.mo3785c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo3785c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c84d23ade98552f1cec71088c1f0794c\")");
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: c */
            public final void mo5103c(AbstractC1061b bVar) {
                WorkDatabase_Impl.this.f5034a = bVar;
                bVar.mo3785c("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.mo5085a(bVar);
                if (WorkDatabase_Impl.this.f5040g != null) {
                    int size = WorkDatabase_Impl.this.f5040g.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC1533j.AbstractC1535b) WorkDatabase_Impl.this.f5040g.get(i)).mo5097a(bVar);
                    }
                }
            }

            @Override // androidx.room.C1539l.AbstractC1540a
            /* renamed from: d */
            public final void mo5104d(AbstractC1061b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new C1506d.C1507a("work_spec_id", "TEXT", true, 1));
                hashMap.put("prerequisite_id", new C1506d.C1507a("prerequisite_id", "TEXT", true, 2));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new C1506d.C1508b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new C1506d.C1508b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new C1506d.C1510d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
                hashSet2.add(new C1506d.C1510d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
                C1506d dVar = new C1506d("Dependency", hashMap, hashSet, hashSet2);
                C1506d a = C1506d.m5133a(bVar, "Dependency");
                if (dVar.equals(a)) {
                    HashMap hashMap2 = new HashMap(23);
                    hashMap2.put("id", new C1506d.C1507a("id", "TEXT", true, 1));
                    hashMap2.put("state", new C1506d.C1507a("state", "INTEGER", true, 0));
                    hashMap2.put("worker_class_name", new C1506d.C1507a("worker_class_name", "TEXT", true, 0));
                    hashMap2.put("input_merger_class_name", new C1506d.C1507a("input_merger_class_name", "TEXT", false, 0));
                    hashMap2.put("input", new C1506d.C1507a("input", "BLOB", true, 0));
                    hashMap2.put("output", new C1506d.C1507a("output", "BLOB", true, 0));
                    hashMap2.put("initial_delay", new C1506d.C1507a("initial_delay", "INTEGER", true, 0));
                    hashMap2.put("interval_duration", new C1506d.C1507a("interval_duration", "INTEGER", true, 0));
                    hashMap2.put("flex_duration", new C1506d.C1507a("flex_duration", "INTEGER", true, 0));
                    hashMap2.put("run_attempt_count", new C1506d.C1507a("run_attempt_count", "INTEGER", true, 0));
                    hashMap2.put("backoff_policy", new C1506d.C1507a("backoff_policy", "INTEGER", true, 0));
                    hashMap2.put("backoff_delay_duration", new C1506d.C1507a("backoff_delay_duration", "INTEGER", true, 0));
                    hashMap2.put("period_start_time", new C1506d.C1507a("period_start_time", "INTEGER", true, 0));
                    hashMap2.put("minimum_retention_duration", new C1506d.C1507a("minimum_retention_duration", "INTEGER", true, 0));
                    hashMap2.put("schedule_requested_at", new C1506d.C1507a("schedule_requested_at", "INTEGER", true, 0));
                    hashMap2.put("required_network_type", new C1506d.C1507a("required_network_type", "INTEGER", false, 0));
                    hashMap2.put("requires_charging", new C1506d.C1507a("requires_charging", "INTEGER", true, 0));
                    hashMap2.put("requires_device_idle", new C1506d.C1507a("requires_device_idle", "INTEGER", true, 0));
                    hashMap2.put("requires_battery_not_low", new C1506d.C1507a("requires_battery_not_low", "INTEGER", true, 0));
                    hashMap2.put("requires_storage_not_low", new C1506d.C1507a("requires_storage_not_low", "INTEGER", true, 0));
                    hashMap2.put("trigger_content_update_delay", new C1506d.C1507a("trigger_content_update_delay", "INTEGER", true, 0));
                    hashMap2.put("trigger_max_content_delay", new C1506d.C1507a("trigger_max_content_delay", "INTEGER", true, 0));
                    hashMap2.put("content_uri_triggers", new C1506d.C1507a("content_uri_triggers", "BLOB", false, 0));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(1);
                    hashSet4.add(new C1506d.C1510d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
                    C1506d dVar2 = new C1506d("WorkSpec", hashMap2, hashSet3, hashSet4);
                    C1506d a2 = C1506d.m5133a(bVar, "WorkSpec");
                    if (dVar2.equals(a2)) {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put("tag", new C1506d.C1507a("tag", "TEXT", true, 1));
                        hashMap3.put("work_spec_id", new C1506d.C1507a("work_spec_id", "TEXT", true, 2));
                        HashSet hashSet5 = new HashSet(1);
                        hashSet5.add(new C1506d.C1508b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                        HashSet hashSet6 = new HashSet(1);
                        hashSet6.add(new C1506d.C1510d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
                        C1506d dVar3 = new C1506d("WorkTag", hashMap3, hashSet5, hashSet6);
                        C1506d a3 = C1506d.m5133a(bVar, "WorkTag");
                        if (dVar3.equals(a3)) {
                            HashMap hashMap4 = new HashMap(2);
                            hashMap4.put("work_spec_id", new C1506d.C1507a("work_spec_id", "TEXT", true, 1));
                            hashMap4.put("system_id", new C1506d.C1507a("system_id", "INTEGER", true, 0));
                            HashSet hashSet7 = new HashSet(1);
                            hashSet7.add(new C1506d.C1508b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                            C1506d dVar4 = new C1506d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                            C1506d a4 = C1506d.m5133a(bVar, "SystemIdInfo");
                            if (dVar4.equals(a4)) {
                                HashMap hashMap5 = new HashMap(2);
                                hashMap5.put(StringSet.name, new C1506d.C1507a(StringSet.name, "TEXT", true, 1));
                                hashMap5.put("work_spec_id", new C1506d.C1507a("work_spec_id", "TEXT", true, 2));
                                HashSet hashSet8 = new HashSet(1);
                                hashSet8.add(new C1506d.C1508b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                                HashSet hashSet9 = new HashSet(1);
                                hashSet9.add(new C1506d.C1510d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
                                C1506d dVar5 = new C1506d("WorkName", hashMap5, hashSet8, hashSet9);
                                C1506d a5 = C1506d.m5133a(bVar, "WorkName");
                                if (!dVar5.equals(a5)) {
                                    throw new IllegalStateException("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + a5);
                                }
                                return;
                            }
                            throw new IllegalStateException("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + a4);
                        }
                        throw new IllegalStateException("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + a3);
                    }
                    throw new IllegalStateException("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + a2);
                }
                throw new IllegalStateException("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + a);
            }
        }, "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        AbstractC1062c.C1064b.C1065a a = AbstractC1062c.C1064b.m3606a(aVar.f4949b);
        a.f3710b = aVar.f4950c;
        a.f3711c = lVar;
        return aVar.f4948a.mo3802a(a.mo3815a());
    }
}
