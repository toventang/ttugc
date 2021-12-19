package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.q */
public final class C38251q implements AbstractC33623d {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f90380a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f90381b;
    @AbstractC27891c(mo46611a = "aweme_list")

    /* renamed from: c */
    public final List<C38247o> f90382c;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: d */
    public final LogPbBean f90383d;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: e */
    public final C38252a f90384e;

    /* renamed from: f */
    private String f90385f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.q$a */
    public static final class C38252a {
        @AbstractC27891c(mo46611a = "now")

        /* renamed from: a */
        public final long f90386a;
        @AbstractC27891c(mo46611a = "fatal_item_ids")

        /* renamed from: b */
        public final List<String> f90387b;
        @AbstractC27891c(mo46611a = "logid")

        /* renamed from: c */
        public final String f90388c;

        static {
            Covode.recordClassIndex(45736);
        }
    }

    static {
        Covode.recordClassIndex(45735);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final String getRequestId() {
        String imprId;
        String str = this.f90385f;
        if (str != null && str.length() > 0) {
            return this.f90385f;
        }
        LogPbBean logPbBean = this.f90383d;
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null || imprId.length() <= 0) {
            return null;
        }
        return this.f90383d.getImprId();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final void setRequestId(String str) {
        this.f90385f = str;
    }
}
