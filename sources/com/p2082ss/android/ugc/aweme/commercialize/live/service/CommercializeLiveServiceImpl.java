package com.p2082ss.android.ugc.aweme.commercialize.live.service;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.live.api.LiveAdCardApi;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.AbstractC38089a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.EnumC38092d;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2591e.C38094a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38104e;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38105f;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38106g;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.EnumC38108i;
import com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a;
import com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38048a;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38050c;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.HashMap;
import org.json.JSONObject;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl */
public final class CommercializeLiveServiceImpl implements ICommercializeLiveService {
    static {
        Covode.recordClassIndex(45615);
    }

    /* renamed from: a */
    private static int m77281a(int i) {
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 7;
        }
        if (i == 8) {
            return 6;
        }
        if (i == 14) {
            return 9;
        }
        if (i == 11) {
            return 8;
        }
        if (i == 12) {
            return 10;
        }
        if (i == 42) {
            return 11;
        }
        if (i != 43) {
            switch (i) {
                case 50:
                    return 3;
                case 51:
                    return 4;
                case 52:
                    break;
                default:
                    return 0;
            }
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /* renamed from: a */
    public final void mo66427a(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        try {
            String string = jSONObject.getString("eventName");
            if (C89219l.m154714a((Object) string, (Object) EnumC38108i.LIVE_LINK_PIN.getValue())) {
                AbstractC81915c.m141874a(new C38104e((C38106g) new C27910f().mo46670a(jSONObject2.toString(), C38106g.class), null));
            } else if (C89219l.m154714a((Object) string, (Object) EnumC38108i.LIVE_LINK_CARD.getValue())) {
                AbstractC81915c.m141874a(new C38104e(null, (C38105f) new C27910f().mo46670a(jSONObject2.toString(), C38105f.class)));
            }
        } catch (Exception unused) {
            C88060b.m153136a("Broadcast JSB", "Gson parse error", null);
        }
    }

    /* renamed from: a */
    public static ICommercializeLiveService m77282a() {
        MethodCollector.m26663i(2650);
        Object a = C81908b.m141854a(ICommercializeLiveService.class, false);
        if (a != null) {
            ICommercializeLiveService iCommercializeLiveService = (ICommercializeLiveService) a;
            MethodCollector.m26664o(2650);
            return iCommercializeLiveService;
        }
        if (C81908b.f183185ao == null) {
            synchronized (ICommercializeLiveService.class) {
                try {
                    if (C81908b.f183185ao == null) {
                        C81908b.f183185ao = new CommercializeLiveServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2650);
                    throw th;
                }
            }
        }
        CommercializeLiveServiceImpl commercializeLiveServiceImpl = (CommercializeLiveServiceImpl) C81908b.f183185ao;
        MethodCollector.m26664o(2650);
        return commercializeLiveServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /* renamed from: a */
    public final AbstractC38121a mo66424a(FrameLayout frameLayout) {
        C89219l.m154721d(frameLayout, "");
        return new FeedLiveAdLynxCard(frameLayout);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /* renamed from: b */
    public final boolean mo66428b(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getComponentType() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /* renamed from: a */
    public final String mo66425a(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return null;
        }
        if (aweme.isLive()) {
            return "full_screen_feed_live";
        }
        if (C37699a.m76318w(aweme)) {
            return "top_live";
        }
        if (aweme.getAuthor() != null) {
            User author = aweme.getAuthor();
            C89219l.m154716b(author, "");
            if (author.isLive()) {
                return "feed_live";
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /* renamed from: a */
    public final AbstractC38089a mo66423a(EnumC38092d dVar, AbstractC89172b<? super Bundle, C89391z> bVar) {
        C89219l.m154721d(dVar, "");
        return C38094a.m77209a(dVar, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /* renamed from: a */
    public final C38048a mo66422a(AwemeRawAd awemeRawAd, String str) {
        C89219l.m154721d(awemeRawAd, "");
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        String creativeIdStr = awemeRawAd.getCreativeIdStr();
        if (creativeIdStr != null) {
            hashMap.put("value", creativeIdStr);
        }
        String logExtra = awemeRawAd.getLogExtra();
        if (logExtra != null) {
            hashMap.put("log_extra", logExtra);
        }
        Long groupId = awemeRawAd.getGroupId();
        if (groupId != null) {
            hashMap.put("group_id", String.valueOf(groupId.longValue()));
        }
        hashMap.put("traffic_from_position", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("traffic_from_position", str);
        return new C38048a(String.valueOf(awemeRawAd.getLiveAdType()), hashMap, hashMap2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /* renamed from: a */
    public final AbstractC21983b<C38050c> mo66421a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        Object a = RetrofitFactory.m33635a().mo28817b(LiveAdCardApi.C38053a.f89917a).mo28832d().mo28858a(LiveAdCardApi.class);
        C89219l.m154716b(a, "");
        return ((LiveAdCardApi) a).getLiveAdCardInfo(str, str2, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /* renamed from: a */
    public final void mo66426a(Aweme aweme, EnterRoomConfig enterRoomConfig, int i) {
        String str;
        Long groupId;
        String logExtra;
        String creativeIdStr;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(enterRoomConfig, "");
        enterRoomConfig.f28233c.f28359o = true;
        enterRoomConfig.f28233c.f28360p = aweme.getAid();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (str = String.valueOf(awemeRawAd.getLiveAdType())) == null) {
            str = "0";
        }
        roomsData.f28358n = str;
        HashMap<String, String> hashMap = new HashMap<>();
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (!(awemeRawAd2 == null || (creativeIdStr = awemeRawAd2.getCreativeIdStr()) == null)) {
            hashMap.put("value", creativeIdStr);
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (!(awemeRawAd3 == null || (logExtra = awemeRawAd3.getLogExtra()) == null)) {
            hashMap.put("log_extra", logExtra);
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (!(awemeRawAd4 == null || (groupId = awemeRawAd4.getGroupId()) == null)) {
            hashMap.put("group_id", String.valueOf(groupId.longValue()));
        }
        hashMap.put("traffic_from_position", String.valueOf(m77281a(i)));
        enterRoomConfig.f28233c.f28356l = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("traffic_from_position", String.valueOf(m77281a(i)));
        enterRoomConfig.f28233c.f28357m = hashMap2;
    }
}
