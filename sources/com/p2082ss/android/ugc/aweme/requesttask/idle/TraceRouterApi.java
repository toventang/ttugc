package com.p2082ss.android.ugc.aweme.requesttask.idle;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22005m;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.TraceRouterApi */
public interface TraceRouterApi {
    static {
        Covode.recordClassIndex(78803);
    }

    @AbstractC22012t
    AbstractC21983b<String> doPost(@AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21998f Map<String, String> map2, @AbstractC21984a boolean z);

    @AbstractC22012t
    AbstractC21983b<String> doRegionPost(@AbstractC21993ag String str, @AbstractC21987aa Map<String, String> map, @AbstractC22005m Map<String, String> map2, @AbstractC21994b TypedOutput typedOutput, @AbstractC21984a boolean z);
}
