package com.bytedance.webx.extension.webview.ttnet;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import java.util.List;

public interface TtnetRetrofitApi {
    static {
        Covode.recordClassIndex(27699);
    }

    @AbstractC22000h
    @AbstractC21991ae
    AbstractC21983b<TypedInput> streamRequest(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list);
}
