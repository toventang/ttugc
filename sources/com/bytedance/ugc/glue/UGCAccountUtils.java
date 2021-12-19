package com.bytedance.ugc.glue;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.ugcwidget.UGCServiceManager;

public class UGCAccountUtils {

    /* renamed from: com.bytedance.ugc.glue.UGCAccountUtils$a */
    public static abstract class AbstractC23507a {
        static {
            Covode.recordClassIndex(27510);
        }
    }

    /* renamed from: com.bytedance.ugc.glue.UGCAccountUtils$b */
    public static class C23508b {
        static {
            Covode.recordClassIndex(27511);
        }
    }

    static {
        Covode.recordClassIndex(27509);
    }

    public static long getUserId() {
        UGCServiceManager.getService(C23508b.class);
        return 0;
    }

    public static boolean isLogin() {
        UGCServiceManager.getService(C23508b.class);
        return false;
    }

    public static void register(AbstractC23507a aVar) {
        UGCServiceManager.getService(C23508b.class);
    }

    public static void unregister(AbstractC23507a aVar) {
        UGCServiceManager.getService(C23508b.class);
    }
}
