package com.p2082ss.android.ugc.trill.share.base;

import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.io.File;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.share.base.d */
public final class C85174d {

    /* renamed from: f */
    public static final C85175a f190580f = new C85175a((byte) 0);

    /* renamed from: a */
    public int f190581a;

    /* renamed from: b */
    public long f190582b;

    /* renamed from: c */
    public int f190583c;

    /* renamed from: d */
    public Aweme f190584d;

    /* renamed from: e */
    public String f190585e;

    static {
        Covode.recordClassIndex(99218);
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.d$a */
    public static final class C85175a {
        static {
            Covode.recordClassIndex(99219);
        }

        private C85175a() {
        }

        public /* synthetic */ C85175a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.d$b */
    static final class CallableC85176b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C85174d f190586a;

        /* renamed from: b */
        final /* synthetic */ String f190587b;

        /* renamed from: c */
        final /* synthetic */ long f190588c;

        /* renamed from: d */
        final /* synthetic */ String f190589d;

        /* renamed from: e */
        final /* synthetic */ long f190590e;

        static {
            Covode.recordClassIndex(99220);
        }

        CallableC85176b(C85174d dVar, String str, long j, String str2, long j2) {
            this.f190586a = dVar;
            this.f190587b = str;
            this.f190588c = j;
            this.f190589d = str2;
            this.f190590e = j2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String d = C80313cs.m139235d(this.f190587b);
            long length = new File(this.f190587b).length();
            this.f190586a.mo130104a(this.f190588c, length, 0, "", false, this.f190589d);
            boolean equals = TextUtils.equals(d, "20");
            C33743c cVar = new C33743c();
            long j = this.f190590e;
            long j2 = 0;
            if (j != 0) {
                j2 = length / j;
            }
            C12290b.m22060a("aweme_download_error_rate", 0, cVar.mo59975a("Download_Rate", Long.valueOf(j2)).mo59975a("Download_duration", Long.valueOf(this.f190590e)).mo59975a("file_size", Long.valueOf(length)).mo59976a("errorDesc", "success").mo59974a("errorCode", (Integer) -1).mo59976a("url", this.f190586a.f190585e).mo59971a("isMp4", Boolean.valueOf(equals)).mo59977a());
            return null;
        }
    }

    /* renamed from: a */
    public final C85174d mo130103a(boolean z) {
        this.f190583c = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public final C85174d mo130102a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f190584d = aweme;
        return this;
    }

    /* renamed from: a */
    public final C85174d mo130101a(ACLCommonShare aCLCommonShare) {
        int i = 0;
        if (aCLCommonShare != null && aCLCommonShare.getTranscode() == 3) {
            i = 1;
        }
        this.f190581a = i;
        return this;
    }

    /* renamed from: a */
    public final void mo130104a(long j, long j2, int i, String str, boolean z, String str2) {
        C89219l.m154721d(str2, "");
        C33744d a = new C33744d().mo59981a("end_download", System.currentTimeMillis()).mo59981a("package_size", j2).mo59981a("duration", j - this.f190582b).mo59980a("is_self_video", this.f190583c);
        Aweme aweme = this.f190584d;
        if (aweme == null) {
            C89219l.m154710a("mAweme");
        }
        C33744d a2 = a.mo59983a("aweme_id", aweme.getAid()).mo59983a("download_url", this.f190585e).mo59980a("is_server_watermark", this.f190581a);
        C89219l.m154716b(a2, "");
        Aweme aweme2 = this.f190584d;
        if (aweme2 == null) {
            C89219l.m154710a("mAweme");
        }
        C33744d a3 = C79900c.m138665a(a2, aweme2, str2);
        if (j2 == -1) {
            a3.mo59980a("error_code", i).mo59980a("retry_failed", z ? 1 : 0).mo59983a("error_message", str);
        }
        C39162r.m79460a("download_end", a3.f79943a);
    }
}
