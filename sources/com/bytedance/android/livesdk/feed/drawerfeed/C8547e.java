package com.bytedance.android.livesdk.feed.drawerfeed;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.feed.dislike.C8527a;
import com.bytedance.android.livesdk.feed.dislike.DislikeApi;
import com.bytedance.android.livesdk.feed.services.C8685d;
import com.bytedance.android.livesdk.feed.tab.p541b.C8701g;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.p691g.AbstractC11767g;
import com.bytedance.android.livesdkapi.p691g.C11772k;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.e */
public final class C8547e {

    /* renamed from: a */
    C8555l f21122a;

    /* renamed from: b */
    AbstractC8593h f21123b = C8685d.m16963a();

    /* renamed from: c */
    AbstractC8643m f21124c = C8701g.m16993b();

    /* renamed from: d */
    AbstractC11767g f21125d = C11772k.f28126a;

    /* renamed from: e */
    AbstractC11643g f21126e;

    /* renamed from: f */
    C8527a f21127f = new C8527a((DislikeApi) C5805e.m12718a().mo11572a(DislikeApi.class));

    static {
        Covode.recordClassIndex(9402);
    }

    public C8547e(C8555l lVar) {
        if (C6193a.m13435a(AbstractC4357d.class) != null) {
            this.f21126e = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController();
        }
        this.f21122a = lVar;
    }
}
