package com.p2082ss.android.ugc.aweme.commercialize.live.service;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.AbstractC38089a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.EnumC38092d;
import com.p2082ss.android.ugc.aweme.commercialize.live.feedLive.AbstractC38121a;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38048a;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38050c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService */
public interface ICommercializeLiveService {
    static {
        Covode.recordClassIndex(45616);
    }

    /* renamed from: a */
    AbstractC21983b<C38050c> mo66421a(String str, String str2, String str3);

    /* renamed from: a */
    C38048a mo66422a(AwemeRawAd awemeRawAd, String str);

    /* renamed from: a */
    AbstractC38089a mo66423a(EnumC38092d dVar, AbstractC89172b<? super Bundle, C89391z> bVar);

    /* renamed from: a */
    AbstractC38121a mo66424a(FrameLayout frameLayout);

    /* renamed from: a */
    String mo66425a(Aweme aweme);

    /* renamed from: a */
    void mo66426a(Aweme aweme, EnterRoomConfig enterRoomConfig, int i);

    /* renamed from: a */
    void mo66427a(JSONObject jSONObject);

    /* renamed from: b */
    boolean mo66428b(Aweme aweme);
}
