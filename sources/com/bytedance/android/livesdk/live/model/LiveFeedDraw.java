package com.bytedance.android.livesdk.live.model;

import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveFeedDraw {
    public static final C9301a Companion = new C9301a((byte) 0);
    @AbstractC27891c(mo46611a = "settings")
    private final Map<String, C9303b> settings = new HashMap();
    @AbstractC27891c(mo46611a = "url")
    private final String url = "";

    static {
        Covode.recordClassIndex(10226);
    }

    public static final String conventRequestFrom(String str, String str2) {
        return C9301a.m17580e(str, str2);
    }

    public static final String getChannelId(String str, String str2) {
        return C9301a.m17577b(str, str2);
    }

    public static final String getReqFrom(String str, String str2) {
        return C9301a.m17576a(str, str2);
    }

    private static final C9303b getSettings(String str) {
        return C9301a.m17575a(str);
    }

    private static final C9303b getSettings(String str, String str2) {
        return C9301a.m17579d(str, str2);
    }

    public static final boolean isFollow(String str, String str2) {
        return C9301a.m17578c(str, str2);
    }

    /* renamed from: com.bytedance.android.livesdk.live.model.LiveFeedDraw$a */
    public static final class C9301a {
        static {
            Covode.recordClassIndex(10227);
        }

        private C9301a() {
        }

        public /* synthetic */ C9301a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C9303b m17575a(String str) {
            Map<String, C9303b> settings = FeedDrawMtSetting.INSTANCE.getValue().getSettings();
            if (str == null) {
                str = "";
            }
            C9303b bVar = settings.get(str);
            if (bVar == null) {
                bVar = new C9303b();
            }
            return bVar;
        }

        /* renamed from: a */
        public static String m17576a(String str, String str2) {
            return m17579d(str, str2).f22739c;
        }

        /* renamed from: c */
        public static boolean m17578c(String str, String str2) {
            return m17579d(str, str2).f22738b;
        }

        /* renamed from: b */
        public static String m17577b(String str, String str2) {
            return String.valueOf(m17579d(str, str2).f22740d);
        }

        /* renamed from: d */
        public static C9303b m17579d(String str, String str2) {
            return m17575a(str + '_' + str2);
        }

        /* renamed from: e */
        public static String m17580e(String str, String str2) {
            if (C89219l.m154714a((Object) "homepage_hot", (Object) str) && C89219l.m154714a((Object) "video_head", (Object) str2)) {
                return "homepage_hot_head_draw";
            }
            if (!C89219l.m154714a((Object) "live_merge", (Object) str) || !C89219l.m154714a((Object) "live_cover", (Object) str2)) {
                return "";
            }
            return "feed_draw";
        }
    }

    public final Map<String, C9303b> getSettings() {
        return this.settings;
    }

    public final String getUrl() {
        return this.url;
    }

    public static final LiveFeedDraw defaultInstance() {
        return new LiveFeedDraw();
    }

    public static final boolean isEnable(String str, String str2) {
        return C89219l.m154714a((Object) C9301a.m17579d(str, str2).f22737a, (Object) "1");
    }
}
