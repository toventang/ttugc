package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.t */
public final class C42438t extends BaseResponse {
    @AbstractC27891c(mo46611a = "sug_word_list")

    /* renamed from: a */
    public List<C42437s> f98906a;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: b */
    public Map<String, String> f98907b;

    static {
        Covode.recordClassIndex(50384);
    }

    /* renamed from: a */
    public final String mo71641a() {
        Map<String, String> map = this.f98907b;
        if (map == null || map.isEmpty()) {
            return "";
        }
        Map<String, String> map2 = this.f98907b;
        if (map2 == null) {
            C89219l.m154715b();
        }
        String str = map2.get("impr_id");
        if (str == null || str.length() == 0) {
            return "";
        }
        Map<String, String> map3 = this.f98907b;
        if (map3 == null) {
            C89219l.m154715b();
        }
        String str2 = map3.get("impr_id");
        if (str2 == null) {
            C89219l.m154715b();
        }
        return str2;
    }
}
