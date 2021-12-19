package com.bytedance.bdturing.ttnet;

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
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.List;
import java.util.Map;

public interface INetworkApi {
    static {
        Covode.recordClassIndex(15267);
    }

    @AbstractC22000h
    AbstractC21983b<TypedInput> doGet(@AbstractC21984a boolean z, @AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC22004l List<C22027b> list);

    @AbstractC22012t
    @AbstractC21991ae
    AbstractC21983b<TypedInput> doPost(@AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list);
}
