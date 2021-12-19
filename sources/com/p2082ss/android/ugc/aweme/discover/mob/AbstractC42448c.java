package com.p2082ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.c */
public interface AbstractC42448c {

    /* renamed from: a */
    public static final C42449a f98926a = C42449a.f98927a;

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.c$b */
    public interface AbstractC42450b {

        /* renamed from: a */
        public static final C42451a f98928a = C42451a.f98929a;

        static {
            Covode.recordClassIndex(50398);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.mob.c$b$a */
        public static final class C42451a {

            /* renamed from: a */
            static final /* synthetic */ C42451a f98929a = new C42451a();

            /* renamed from: a */
            public static String m84856a(int i) {
                if (i != 3) {
                    if (i == 4) {
                        return "video";
                    }
                    if (i == 0) {
                        return "user";
                    }
                    if (i == 1) {
                        return "music";
                    }
                    if (i == 2) {
                        return "challenge";
                    }
                    if (i == 7) {
                        return "live";
                    }
                }
                return "general";
            }

            private C42451a() {
            }

            static {
                Covode.recordClassIndex(50399);
            }
        }
    }

    static {
        Covode.recordClassIndex(50396);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.c$a */
    public static final class C42449a {

        /* renamed from: a */
        static final /* synthetic */ C42449a f98927a = new C42449a();

        /* renamed from: a */
        public static String m84855a(int i) {
            return i == 3 ? "general_search" : i == 4 ? "video" : i == 0 ? "user" : i == 1 ? "music" : i == 2 ? "challenge" : i == 7 ? "live" : "";
        }

        private C42449a() {
        }

        static {
            Covode.recordClassIndex(50397);
        }
    }
}
