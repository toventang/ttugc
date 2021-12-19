package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.p054j.p055a.AbstractC1061b;
import androidx.room.p068a.AbstractC1501a;
import androidx.work.impl.utils.C1711c;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.impl.e */
public final class C1682e {

    /* renamed from: a */
    public static AbstractC1501a f5423a = new AbstractC1501a() {
        /* class androidx.work.impl.C1682e.C16831 */

        static {
            Covode.recordClassIndex(1848);
        }

        @Override // androidx.room.p068a.AbstractC1501a
        /* renamed from: a */
        public final void mo5042a(AbstractC1061b bVar) {
            bVar.mo3785c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo3785c("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.mo3785c("DROP TABLE IF EXISTS alarmInfo");
            bVar.mo3785c("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };

    /* renamed from: b */
    public static AbstractC1501a f5424b = new AbstractC1501a() {
        /* class androidx.work.impl.C1682e.C16842 */

        static {
            Covode.recordClassIndex(1849);
        }

        @Override // androidx.room.p068a.AbstractC1501a
        /* renamed from: a */
        public final void mo5042a(AbstractC1061b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.mo3785c("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    };

    /* renamed from: c */
    public static AbstractC1501a f5425c = new AbstractC1501a() {
        /* class androidx.work.impl.C1682e.C16853 */

        static {
            Covode.recordClassIndex(1850);
        }

        @Override // androidx.room.p068a.AbstractC1501a
        /* renamed from: a */
        public final void mo5042a(AbstractC1061b bVar) {
            bVar.mo3785c("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.mo3785c("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    };

    static {
        Covode.recordClassIndex(1847);
    }

    /* renamed from: androidx.work.impl.e$a */
    public static class C1686a extends AbstractC1501a {

        /* renamed from: c */
        final Context f5426c;

        static {
            Covode.recordClassIndex(1851);
        }

        public C1686a(Context context) {
            super(2, 3);
            this.f5426c = context;
        }

        @Override // androidx.room.p068a.AbstractC1501a
        /* renamed from: a */
        public final void mo5042a(AbstractC1061b bVar) {
            new C1711c(this.f5426c).mo5508a(true);
        }
    }
}
