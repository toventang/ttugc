package com.p2082ss.android.ugc.aweme.prop.p3607c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34486b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.prop.c.b */
public final class C65310b extends BaseResponse {
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "aweme_list")

    /* renamed from: a */
    public List<Aweme> f147411a;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public long f147412b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public int f147413c;
    @AbstractC27891c(mo46611a = "rid")

    /* renamed from: d */
    public String f147414d;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: e */
    public LogPbBean f147415e;
    @AbstractC27891c(mo46611a = "is_top")

    /* renamed from: f */
    public boolean f147416f;

    static {
        Covode.recordClassIndex(76789);
    }

    /* renamed from: a */
    public final boolean mo104471a() {
        if (this.f147413c == 1) {
            return true;
        }
        return false;
    }
}
