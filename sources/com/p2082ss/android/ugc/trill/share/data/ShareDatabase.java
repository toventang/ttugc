package com.p2082ss.android.ugc.trill.share.data;

import android.content.Context;
import androidx.p054j.p055a.AbstractC1061b;
import androidx.room.AbstractC1533j;
import androidx.room.C1532i;
import androidx.room.p068a.AbstractC1501a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;

/* renamed from: com.ss.android.ugc.trill.share.data.ShareDatabase */
public abstract class ShareDatabase extends AbstractC1533j {

    /* renamed from: k */
    private static volatile ShareDatabase f190601k;

    /* renamed from: l */
    private static final AbstractC1501a f190602l = new AbstractC1501a() {
        /* class com.p2082ss.android.ugc.trill.share.data.ShareDatabase.C851811 */

        static {
            Covode.recordClassIndex(99226);
        }

        @Override // androidx.room.p068a.AbstractC1501a
        /* renamed from: a */
        public final void mo5042a(AbstractC1061b bVar) {
            bVar.mo3785c("CREATE TABLE IF NOT EXISTS `quick_share_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mutual_follow_status` INTEGER NOT NULL, `friends_list` TEXT, `timestamp` INTEGER NOT NULL)");
            bVar.mo3785c("CREATE TABLE IF NOT EXISTS `quick_share_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hashed_phone_number` TEXT NOT NULL, `created_time` INTEGER)");
            bVar.mo3785c("CREATE UNIQUE INDEX `index_quick_share_history_hashed_phone_number` ON `quick_share_history` (`hashed_phone_number`)");
            bVar.mo3785c("CREATE TRIGGER delete_oldest_record AFTER INSERT ON quick_share_history BEGIN DELETE FROM quick_share_history WHERE id NOT IN (SELECT id FROM quick_share_history ORDER BY created_time DESC LIMIT 10); END");
        }
    };

    /* renamed from: m */
    private static final AbstractC1501a f190603m = new AbstractC1501a() {
        /* class com.p2082ss.android.ugc.trill.share.data.ShareDatabase.C851822 */

        static {
            Covode.recordClassIndex(99227);
        }

        @Override // androidx.room.p068a.AbstractC1501a
        /* renamed from: a */
        public final void mo5042a(AbstractC1061b bVar) {
            bVar.mo3785c("DROP TABLE IF EXISTS `quick_share_data`");
            bVar.mo3785c("DROP TABLE IF EXISTS `quick_share_history`");
        }
    };

    /* renamed from: i */
    public abstract AbstractC85185b mo130107i();

    static {
        Covode.recordClassIndex(99225);
    }

    /* renamed from: a */
    public static ShareDatabase m146473a(Context context) {
        boolean z;
        if (f190601k == null) {
            synchronized (ShareDatabase.class) {
                StringBuilder sb = new StringBuilder("Creating ShareDatabase instance, WRITE_EXTERNAL_STORAGE: ");
                if (C80620e.m139781c(context) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C51423a.m95787a(sb.append(z).toString());
                try {
                    if (f190601k == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (C58003a.f132201c) {
                            if (applicationContext == null) {
                                applicationContext = C58003a.f132199a;
                            }
                        }
                        AbstractC1533j.C1534a a = C1532i.m5166a(applicationContext, ShareDatabase.class, "share.db").mo5095a(f190602l, f190603m);
                        a.f5046b = true;
                        f190601k = (ShareDatabase) a.mo5096a();
                    }
                } catch (Throwable th) {
                    C51423a.m95787a("Error creating ShareDatabase: " + th.toString());
                }
            }
        }
        return f190601k;
    }
}
