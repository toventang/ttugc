package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.k */
public final class C50323k {
    static {
        Covode.recordClassIndex(59451);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.k$a */
    public enum EnumC50324a {
        SHOW("show"),
        FOLLOW("follow");
        

        /* renamed from: b */
        private final String f116199b;

        public final String getType() {
            return this.f116199b;
        }

        static {
            Covode.recordClassIndex(59452);
        }

        private EnumC50324a(String str) {
            this.f116199b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.k$b */
    public enum EnumC50325b {
        LIKE("like"),
        POST(UGCMonitor.TYPE_POST),
        SHARE("share"),
        FINISH("finish");
        

        /* renamed from: b */
        private final String f116201b;

        public final String getType() {
            return this.f116201b;
        }

        static {
            Covode.recordClassIndex(59453);
        }

        private EnumC50325b(String str) {
            this.f116201b = str;
        }
    }
}
