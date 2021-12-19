package com.bytedance.android.live.wallet.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.Map;

public interface PipoApi {
    static {
        Covode.recordClassIndex(7018);
    }

    @AbstractC22000h
    AbstractC21983b<TypedInput> get(@AbstractC21993ag String str);

    @AbstractC22012t
    @AbstractC21999g
    AbstractC21983b<TypedInput> post(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map);
}
