package com.p2082ss.android.ugc.aweme.account.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.network.IAccountNetworkApi */
public interface IAccountNetworkApi {
    static {
        Covode.recordClassIndex(39656);
    }

    @AbstractC22000h
    AbstractC21983b<String> getResponse(@AbstractC21993ag String str, @AbstractC22007o int i, @AbstractC22004l List<C22027b> list);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<String> getResponse(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map, @AbstractC22007o int i, @AbstractC22004l List<C22027b> list);
}
