package com.bytedance.ttnet;

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
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22009q;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22015w;
import java.util.List;
import java.util.Map;

public interface INetworkApi {
    static {
        Covode.recordClassIndex(26794);
    }

    @AbstractC22000h
    AbstractC21983b<String> doGet(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<String> doPost(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC21998f(mo35788a = true) Map<String, String> map2, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);

    @AbstractC22000h
    @AbstractC21991ae
    AbstractC21983b<TypedInput> downloadFile(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map);

    @AbstractC22000h
    @AbstractC21991ae
    AbstractC21983b<TypedInput> downloadFile(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);

    @AbstractC22012t
    AbstractC21983b<String> postBody(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list);

    @AbstractC22012t
    @AbstractC22009q
    AbstractC21983b<String> postMultiPart(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC22015w Map<String, TypedOutput> map2, @AbstractC22004l List<C22027b> list);
}
