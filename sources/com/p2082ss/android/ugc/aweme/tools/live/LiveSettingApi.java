package com.p2082ss.android.ugc.aweme.tools.live;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.C35470cg;
import com.p2082ss.android.ugc.aweme.C35478ch;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi */
public final class LiveSettingApi {

    /* renamed from: a */
    public static WebcastAPI f176654a = ((WebcastAPI) C18097a.m33698a("https://webcast.tiktokv.com", WebcastAPI.class));

    /* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi$WebcastAPI */
    public interface WebcastAPI {
        static {
            Covode.recordClassIndex(91746);
        }

        @AbstractC89722f(mo144276a = "/webcast/room/create_info/")
        C1731i<C78611a> createInfo();

        @AbstractC89722f(mo144276a = "/webcast/room/live_podcast/")
        C1731i<C78613b> getLivePodCast();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi$a */
    public class C78611a extends BaseResponse {
        @AbstractC27891c(mo46611a = "data")

        /* renamed from: a */
        public C78612a f176655a;

        /* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi$a$a */
        public class C78612a {
            @AbstractC27891c(mo46611a = "never_go_live_flag")

            /* renamed from: a */
            public boolean f176656a;

            static {
                Covode.recordClassIndex(91748);
            }
        }

        static {
            Covode.recordClassIndex(91747);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi$b */
    public class C78613b extends BaseResponse {
        @AbstractC27891c(mo46611a = "data")

        /* renamed from: a */
        public C78614a f176657a;

        /* renamed from: com.ss.android.ugc.aweme.tools.live.LiveSettingApi$b$a */
        public class C78614a {
            @AbstractC27891c(mo46611a = "can_be_live_podcast")

            /* renamed from: a */
            public boolean f176658a;
            @AbstractC27891c(mo46611a = "live_scenario")

            /* renamed from: b */
            public C35478ch f176659b;
            @AbstractC27891c(mo46611a = "live_permission_apply")

            /* renamed from: c */
            public C35470cg f176660c;

            static {
                Covode.recordClassIndex(91750);
            }
        }

        static {
            Covode.recordClassIndex(91749);
        }
    }

    static {
        Covode.recordClassIndex(91745);
    }
}
