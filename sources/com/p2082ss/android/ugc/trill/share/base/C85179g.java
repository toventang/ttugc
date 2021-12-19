package com.p2082ss.android.ugc.trill.share.base;

import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.C49925a;

/* renamed from: com.ss.android.ugc.trill.share.base.g */
public final class C85179g {

    /* renamed from: a */
    C85180a f190593a;

    static {
        Covode.recordClassIndex(99223);
    }

    public C85179g(C85180a aVar) {
        this.f190593a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo130106a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        C39162r.m79460a("client_watermark_end", new C33744d().mo59981a("end_watermark", currentTimeMillis).mo59983a("watermark_id", this.f190593a.f190596c).mo59981a("duration", currentTimeMillis - this.f190593a.f190594a).mo59980a("watermark_sdk", this.f190593a.f190595b).mo59983a("watermark_type", this.f190593a.f190597d).mo59980a("is_self_video", this.f190593a.f190598e).mo59980a("is_composer_watermark_success", i).f79943a);
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.g$a */
    public static class C85180a {

        /* renamed from: a */
        long f190594a;

        /* renamed from: b */
        int f190595b;

        /* renamed from: c */
        String f190596c;

        /* renamed from: d */
        String f190597d;

        /* renamed from: e */
        int f190598e;

        /* renamed from: f */
        boolean f190599f;

        /* renamed from: g */
        Aweme f190600g;

        static {
            Covode.recordClassIndex(99224);
        }

        public C85180a(Aweme aweme, String str) {
            this.f190600g = aweme;
            this.f190598e = C49925a.m93732a(aweme) ? 1 : 0;
            this.f190596c = C13607d.m24442b(str + AppLog.getServerDeviceId() + System.currentTimeMillis());
        }
    }
}
