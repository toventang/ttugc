package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.EffectNetworkAPI */
public interface EffectNetworkAPI {
    static {
        Covode.recordClassIndex(54978);
    }

    @AbstractC22000h
    @AbstractC21991ae
    AbstractC21983b<TypedInput> doGet(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map);

    @AbstractC22012t
    @AbstractC21991ae
    AbstractC21983b<TypedInput> doPost(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21994b Map<String, Object> map);
}
