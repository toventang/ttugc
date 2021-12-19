package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Collections;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.model.message.af */
public final class C9602af extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "delete_msg_ids")

    /* renamed from: a */
    public List<Long> f23308a;
    @AbstractC27891c(mo46611a = "delete_user_ids")

    /* renamed from: f */
    public List<Long> f23309f;

    static {
        Covode.recordClassIndex(11144);
    }

    public C9602af() {
        this.f28131L = EnumC9596a.IM_DELETE;
        List<Long> emptyList = Collections.emptyList();
        C89219l.m154716b(emptyList, "");
        this.f23308a = emptyList;
        List<Long> emptyList2 = Collections.emptyList();
        C89219l.m154716b(emptyList2, "");
        this.f23309f = emptyList2;
    }
}
