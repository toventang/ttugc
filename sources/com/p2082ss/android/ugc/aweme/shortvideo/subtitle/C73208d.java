package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.d */
public final class C73208d {

    /* renamed from: u */
    public static final C73209a f164403u = new C73209a((byte) 0);

    /* renamed from: a */
    public long f164404a;

    /* renamed from: b */
    public long f164405b;

    /* renamed from: c */
    public long f164406c;

    /* renamed from: d */
    public long f164407d;

    /* renamed from: e */
    public long f164408e;

    /* renamed from: f */
    public long f164409f;

    /* renamed from: g */
    public double f164410g;

    /* renamed from: h */
    public double f164411h;

    /* renamed from: i */
    public double f164412i;

    /* renamed from: j */
    public double f164413j;

    /* renamed from: k */
    public double f164414k;

    /* renamed from: l */
    public long f164415l;

    /* renamed from: m */
    public long f164416m;

    /* renamed from: n */
    public String f164417n = "";

    /* renamed from: o */
    public String f164418o = "";

    /* renamed from: p */
    public volatile int f164419p;

    /* renamed from: q */
    public int f164420q;

    /* renamed from: r */
    public String f164421r = "";

    /* renamed from: s */
    public long f164422s;

    /* renamed from: t */
    public String f164423t = "";

    static {
        Covode.recordClassIndex(85926);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.d$a */
    public static final class C73209a {
        static {
            Covode.recordClassIndex(85927);
        }

        private C73209a() {
        }

        public /* synthetic */ C73209a(byte b) {
            this();
        }
    }

    public final String toString() {
        return "CaptionMonitorData(duration=" + this.f164404a + ", getConfigDuration=" + this.f164405b + ", extractDuration=" + this.f164406c + ", uploadDuration=" + this.f164407d + ", submitDuration=" + this.f164408e + ", queryDuration=" + this.f164409f + ", extractDurationPerSecond=" + this.f164410g + ", uploadDurationPerSecond=" + this.f164411h + ", submitDurationPerSecond=" + this.f164412i + ", queryDurationPerSecond=" + this.f164413j + ", recognizeDurationPerSecond=" + this.f164414k + ", perceivedGetConfigDuration=" + this.f164415l + ", perceivedExtractDuration=" + this.f164416m + ", tosKey='" + this.f164417n + "', jobId='" + this.f164418o + "', failedStep=" + this.f164419p + ", failedCode=" + this.f164420q + ", failedMsg='" + this.f164421r + "', audioFileSize=" + this.f164422s + ", audioUploadDomain='" + this.f164423t + "')";
    }

    /* renamed from: a */
    public final void mo115750a(String str) {
        C89219l.m154721d(str, "");
        this.f164417n = str;
    }

    /* renamed from: b */
    public final void mo115751b(String str) {
        C89219l.m154721d(str, "");
        this.f164418o = str;
    }

    /* renamed from: c */
    public final void mo115752c(String str) {
        C89219l.m154721d(str, "");
        this.f164423t = str;
    }
}
