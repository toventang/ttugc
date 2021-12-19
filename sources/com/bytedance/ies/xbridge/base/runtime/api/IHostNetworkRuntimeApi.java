package com.bytedance.ies.xbridge.base.runtime.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21995c;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22013u;
import java.util.List;
import java.util.Map;

public interface IHostNetworkRuntimeApi {
    static {
        Covode.recordClassIndex(21100);
    }

    @AbstractC21995c
    AbstractC21983b<String> doDeleteForString(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);

    @AbstractC22000h
    AbstractC21983b<String> doGetForString(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);

    @AbstractC22012t
    @AbstractC21991ae
    AbstractC21983b<TypedInput> doPostForStream(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21994b TypedOutput typedOutput, @AbstractC21996d Object obj);

    @AbstractC22012t
    AbstractC21983b<String> doPostForString(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21994b TypedOutput typedOutput, @AbstractC21996d Object obj);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<String> doPostForString(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21998f(mo35788a = true) Map<String, String> map2, @AbstractC21996d Object obj);

    @AbstractC22013u
    AbstractC21983b<String> doPutForString(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC22004l List<C22027b> list, @AbstractC21994b TypedOutput typedOutput, @AbstractC21996d Object obj);

    @AbstractC22000h
    @AbstractC21991ae
    AbstractC21983b<TypedInput> downloadFile(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);
}
