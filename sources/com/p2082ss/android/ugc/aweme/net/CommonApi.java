package com.p2082ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21995c;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22013u;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.net.CommonApi */
public interface CommonApi {
    static {
        Covode.recordClassIndex(71918);
    }

    @AbstractC21995c
    AbstractC21983b<String> doDelete(@AbstractC21993ag String str);

    @AbstractC21995c
    AbstractC21983b<String> doDelete(@AbstractC21993ag String str, @AbstractC22007o int i, @AbstractC22004l List<C22027b> list);

    @AbstractC21995c
    AbstractC21983b<String> doDelete(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list);

    @AbstractC21995c
    AbstractC21983b<String> doDelete(@AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map);

    @AbstractC22000h
    AbstractC21983b<String> doGet(@AbstractC21993ag String str);

    @AbstractC22000h
    AbstractC21983b<String> doGet(@AbstractC21993ag String str, @AbstractC22007o int i);

    @AbstractC22000h
    AbstractC21983b<String> doGet(@AbstractC21993ag String str, @AbstractC22007o int i, @AbstractC21987aa Map<String, String> map);

    @AbstractC22000h
    AbstractC21983b<String> doGet(@AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map);

    @AbstractC22000h
    AbstractC21983b<String> doGet(@AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC22004l List<C22027b> list);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<String> doPost(@AbstractC21993ag String str, @AbstractC22007o int i, @AbstractC21998f Map<String, String> map);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<String> doPost(@AbstractC21993ag String str, @AbstractC22007o int i, @AbstractC21998f Map<String, String> map, @AbstractC21987aa Map<String, String> map2);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<String> doPost(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<String> doPost(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map, @AbstractC22004l List<C22027b> list);

    @AbstractC22012t
    AbstractC21983b<String> postBody(@AbstractC21993ag String str, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list);

    @AbstractC22013u
    AbstractC21983b<String> putBody(@AbstractC21993ag String str, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list);
}
