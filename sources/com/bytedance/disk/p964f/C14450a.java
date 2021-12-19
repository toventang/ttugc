package com.bytedance.disk.p964f;

import android.net.Uri;
import android.provider.BaseColumns;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.disk.f.a */
public final class C14450a {

    /* renamed from: a */
    public static final Uri f34949a = Uri.parse("content://com.bytedance.disk:migration");

    /* renamed from: b */
    public static final String[] f34950b = {"mig_opt_reason", "mig_opt_from", "mig_opt_to", "mig_opt_policy", "mig_event", "mig_opt_type"};

    /* renamed from: com.bytedance.disk.f.a$a */
    public static class C14451a implements BaseColumns {

        /* renamed from: a */
        public static final Uri f34951a = Uri.withAppendedPath(C14450a.f34949a, "migration_items_table");

        static {
            Covode.recordClassIndex(16530);
        }
    }

    static {
        Covode.recordClassIndex(16529);
    }

    /* renamed from: com.bytedance.disk.f.a$b */
    public interface AbstractC14452b {

        /* renamed from: a */
        public static final String[] f34952a = {"_id", "mig_opt_dir", "mig_opt_reason", "mig_opt_file_len", "mig_opt_from", "mig_opt_to", "mig_opt_policy", "mig_opt_type", "mig_event", "mig_event_time", "mig_event_elapsed", "mig_deleted"};

        /* renamed from: b */
        public static final String[] f34953b = {"_id"};

        static {
            Covode.recordClassIndex(16531);
        }
    }
}
