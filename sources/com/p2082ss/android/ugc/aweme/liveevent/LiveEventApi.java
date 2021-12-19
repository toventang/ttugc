package com.p2082ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.liveevent.LiveEventApi */
public final class LiveEventApi {

    /* renamed from: a */
    static final AbstractC18099f f133797a = RetrofitFactory.m33635a().mo28817b(Api.f79771d).mo28832d();

    /* renamed from: b */
    public static final LiveEventApi f133798b = new LiveEventApi();

    /* renamed from: com.ss.android.ugc.aweme.liveevent.LiveEventApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(69100);
        }

        @AbstractC89722f(mo144276a = "/tiktok/event/list/v1")
        AbstractFutureC27655q<C58813k> getAnchorSelectionResponse(@AbstractC89736t(mo144292a = "host_user_id") String str, @AbstractC89736t(mo144292a = "query_type") int i, @AbstractC89736t(mo144292a = "offset") int i2, @AbstractC89736t(mo144292a = "count") int i3);
    }

    private LiveEventApi() {
    }

    static {
        Covode.recordClassIndex(69099);
    }
}
