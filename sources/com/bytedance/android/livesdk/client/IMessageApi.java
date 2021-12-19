package com.bytedance.android.livesdk.client;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22005m;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;

public interface IMessageApi {
    static {
        Covode.recordClassIndex(9023);
    }

    @AbstractC22000h
    AbstractC88979t<C22099u<TypedInput>> doGetAsync(@AbstractC21993ag String str, @AbstractC22005m Map<String, String> map, @AbstractC21987aa Map<String, String> map2);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<TypedInput> doPost(@AbstractC21993ag String str, @AbstractC22005m Map<String, String> map, @AbstractC21987aa Map<String, String> map2, @AbstractC21998f Map<String, String> map3);

    @AbstractC22012t
    AbstractC88979t<C22099u<TypedInput>> doPostAsync(@AbstractC21993ag String str, @AbstractC22005m Map<String, String> map, @AbstractC21987aa Map<String, String> map2, @AbstractC21994b TypedOutput typedOutput);
}
