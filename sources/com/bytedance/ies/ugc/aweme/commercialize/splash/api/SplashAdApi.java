package com.bytedance.ies.ugc.aweme.commercialize.splash.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21990ad;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22003k;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.Map;

public interface SplashAdApi {
    static {
        Covode.recordClassIndex(20550);
    }

    @AbstractC22000h
    AbstractC21983b<String> executeGet(@AbstractC22007o int i, @AbstractC21993ag String str);

    @AbstractC22000h
    @AbstractC21990ad(mo35784a = "vas_ad_track")
    AbstractC21983b<String> executeGet(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC22003k(mo35794a = "User-Agent") String str2);

    @AbstractC22012t
    AbstractC21983b<String> executePost(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21994b TypedOutput typedOutput);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<String> executePost(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21997e(mo35786a = "ad_status") String str2);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<String> executePost(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21998f Map<String, String> map);
}
