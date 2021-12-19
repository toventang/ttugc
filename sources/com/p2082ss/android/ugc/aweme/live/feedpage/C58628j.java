package com.p2082ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.j */
public final class C58628j extends BaseResponse implements AbstractC33623d {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public C58629a f133529a;

    /* renamed from: b */
    private String f133530b;

    static {
        Covode.recordClassIndex(68928);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final String getRequestId() {
        return this.f133530b;
    }

    /* renamed from: com.ss.android.ugc.aweme.live.feedpage.j$a */
    public static class C58629a {
        @AbstractC27891c(mo46611a = "room_id")

        /* renamed from: a */
        public Map<Long, Long> f133531a;

        static {
            Covode.recordClassIndex(68929);
        }

        /* renamed from: a */
        public final Map<Long, Long> mo96092a() {
            Map<Long, Long> map = this.f133531a;
            if (map == null) {
                return new HashMap(0);
            }
            return map;
        }
    }

    /* renamed from: a */
    public final Map<Long, Long> mo96091a() {
        C58629a aVar = this.f133529a;
        if (aVar == null) {
            return new HashMap(0);
        }
        return aVar.mo96092a();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final void setRequestId(String str) {
        this.f133530b = str;
    }
}
