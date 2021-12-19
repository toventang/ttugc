package com.bytedance.apm.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.List;
import java.util.Map;

public interface RetrofitMonitorService {
    static {
        Covode.recordClassIndex(14307);
    }

    @AbstractC22000h
    AbstractC21983b<TypedInput> fetch(@AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC21984a boolean z);

    @AbstractC22012t
    AbstractC21983b<TypedInput> report(@AbstractC21993ag String str, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list, @AbstractC21984a boolean z);
}
