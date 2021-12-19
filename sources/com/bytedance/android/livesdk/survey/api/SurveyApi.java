package com.bytedance.android.livesdk.survey.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.survey.p636a.C10788a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;

public interface SurveyApi {
    static {
        Covode.recordClassIndex(12396);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/survey/list/")
    AbstractC88979t<C5832d<C10788a>> list(@AbstractC22018z(mo35807a = "room_id") long j);

    @AbstractC22012t(mo35799a = "/webcast/room/survey/submit/")
    @AbstractC21999g
    AbstractC88979t<C5832d<Void>> submit(@AbstractC21998f HashMap<String, Object> hashMap);
}
