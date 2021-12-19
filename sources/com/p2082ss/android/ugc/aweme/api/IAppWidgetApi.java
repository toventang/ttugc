package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.model.AppWidgetStruct;

/* renamed from: com.ss.android.ugc.aweme.api.IAppWidgetApi */
public interface IAppWidgetApi {
    static {
        Covode.recordClassIndex(40398);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/widget/challenge/")
    AbstractC21983b<AppWidgetStruct> fetchChallenge(@AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "widget_size") int i2);
}
