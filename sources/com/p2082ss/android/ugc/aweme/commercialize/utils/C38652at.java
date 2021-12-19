package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.live.service.C38143a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.at */
public final class C38652at {

    /* renamed from: a */
    public static final C38652at f91333a = new C38652at();

    private C38652at() {
    }

    static {
        Covode.recordClassIndex(46193);
    }

    /* renamed from: a */
    public static void m78413a() {
        m78414a(10000, "live_duration_10s");
        m78414a(30000, "live_duration_30s");
        m78414a(60000, "live_duration_60s");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.at$a */
    public static final class C38653a extends AbstractC7258b {

        /* renamed from: b */
        final /* synthetic */ String f91334b;

        /* renamed from: c */
        final /* synthetic */ long f91335c;

        static {
            Covode.recordClassIndex(46194);
        }

        @Override // com.bytedance.android.livesdk.callback.AbstractC7258b
        /* renamed from: a */
        public final void mo13461a(Map<String, Object> map) {
            Object obj;
            String str;
            String str2;
            HashMap<String, String> hashMap = null;
            if (map != null) {
                obj = map.get("audience_live_play_enter_room_config");
            } else {
                obj = null;
            }
            if (!(obj instanceof EnterRoomConfig)) {
                obj = null;
            }
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj;
            if (enterRoomConfig != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
                if (roomsData != null) {
                    hashMap = roomsData.f28356l;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f28233c;
                if (roomsData2 != null && roomsData2.f28359o) {
                    String str3 = this.f91334b;
                    String str4 = "";
                    if (hashMap == null || (str = hashMap.get("value")) == null) {
                        str = str4;
                    }
                    C89219l.m154716b(str, str4);
                    if (!(hashMap == null || (str2 = hashMap.get("log_extra")) == null)) {
                        str4 = str2;
                    }
                    C18129a.m33747a("live_ad", str3, str, str4, "0").mo28897a("room_id", map.get("audience_live_play_room_id")).mo28901b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38653a(String str, long j, long j2) {
            super(j2);
            this.f91334b = str;
            this.f91335c = j;
        }
    }

    /* renamed from: a */
    private static void m78414a(long j, String str) {
        C89219l.m154721d(str, "");
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95830d().mo12995a(AbstractC7258b.EnumC7259a.AUDIENCE_LIVE_PLAY_DURATION, new C38653a(str, j, j));
    }

    /* renamed from: a */
    public static final void m78415a(Context context, Aweme aweme, int i) {
        AbstractC17897a c;
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        IAdSceneService f = AdSceneServiceImpl.m33210f();
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28232b.f28259c = aweme.getAid();
        EnterRoomConfig.LogData logData = enterRoomConfig.f28232b;
        User author = aweme.getAuthor();
        C89219l.m154716b(author, "");
        logData.f28257a = author.getRequestId();
        enterRoomConfig.f28233c.f28295L = "feed";
        C38143a.m77301a(aweme, enterRoomConfig, i);
        enterRoomConfig.f28233c.f28293J = "feed";
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95835i().mo105593a(context, aweme.getAuthor(), enterRoomConfig);
        m78413a();
        if (f != null && (c = f.mo28466c()) != null) {
            c.mo28511a(aweme, context, i);
        }
    }
}
