package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.api.IDeepLinkApi */
public interface IDeepLinkApi {
    static {
        Covode.recordClassIndex(40399);
    }

    @AbstractC22000h
    AbstractC21983b<TypedInput> fetchLongUrl(@AbstractC21993ag String str, @AbstractC21996d Object obj);

    @AbstractC22000h(mo35789a = "/tiktok/linker/target/get/v1/")
    AbstractC88979t<C33536e> transUrl(@AbstractC22018z(mo35807a = "url") String str);
}
