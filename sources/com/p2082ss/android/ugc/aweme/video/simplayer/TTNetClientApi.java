package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import java.util.List;
import org.json.JSONObject;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89740x;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.TTNetClientApi */
public interface TTNetClientApi {
    static {
        Covode.recordClassIndex(94307);
    }

    @AbstractC89722f
    AbstractC21983b<String> get(@AbstractC89740x String str, @AbstractC22004l List<C22027b> list);

    @AbstractC89731o
    AbstractC21983b<String> post(@AbstractC89740x String str, @AbstractC22004l List<C22027b> list, @AbstractC89717a JSONObject jSONObject);
}
