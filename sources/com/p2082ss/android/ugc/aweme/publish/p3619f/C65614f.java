package com.p2082ss.android.ugc.aweme.publish.p3619f;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34486b;

/* renamed from: com.ss.android.ugc.aweme.publish.f.f */
public final class C65614f extends AbstractC34479a {
    @AbstractC27891c(mo46611a = "captionAppKey")

    /* renamed from: A */
    public String f147878A;
    @AbstractC27891c(mo46611a = "captionAuthorization")

    /* renamed from: B */
    public String f147879B;
    @AbstractC27891c(mo46611a = "userStoreRegion")

    /* renamed from: C */
    public String f147880C;
    @AbstractC27891c(mo46611a = "aiCutAuthorization")

    /* renamed from: D */
    public String f147881D;
    @AbstractC27891c(mo46611a = "aiCutAppKey")

    /* renamed from: E */
    public String f147882E;
    @AbstractC27891c(mo46611a = "authorization2")

    /* renamed from: F */
    public C65615a f147883F;
    @AbstractC27891c(mo46611a = "upload_main_network_type")

    /* renamed from: G */
    public int f147884G;
    @AbstractC27891c(mo46611a = "upload_backup_network_type")

    /* renamed from: H */
    public int f147885H;
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "appKey")

    /* renamed from: a */
    public String f147886a;
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "fileHostName")

    /* renamed from: b */
    public String f147887b;
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "videoHostName")

    /* renamed from: c */
    public String f147888c;
    @AbstractC27891c(mo46611a = "sliceTimeout")

    /* renamed from: d */
    public int f147889d;
    @AbstractC27891c(mo46611a = "sliceRetryCount")

    /* renamed from: e */
    public int f147890e;
    @AbstractC27891c(mo46611a = "sliceSize")

    /* renamed from: f */
    public int f147891f;
    @AbstractC27891c(mo46611a = "fileRetryCount")

    /* renamed from: g */
    public int f147892g = 1;
    @AbstractC27891c(mo46611a = "maxFailTime")

    /* renamed from: h */
    public int f147893h;
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "authorization")

    /* renamed from: i */
    public String f147894i;
    @AbstractC27891c(mo46611a = "enableHttps")

    /* renamed from: j */
    public int f147895j;
    @AbstractC27891c(mo46611a = "enableExternDNS")

    /* renamed from: k */
    public int f147896k;
    @AbstractC27891c(mo46611a = "aliveMaxFailTime")

    /* renamed from: l */
    public int f147897l = 6;
    @AbstractC27891c(mo46611a = "enableTTNetDNS")

    /* renamed from: m */
    public int f147898m;
    @AbstractC27891c(mo46611a = "enablePostMethod")

    /* renamed from: n */
    public int f147899n;
    @AbstractC27891c(mo46611a = "openTimeOut")

    /* renamed from: o */
    public int f147900o = 5000;
    @AbstractC27891c(mo46611a = "uploadRegion")

    /* renamed from: p */
    public String f147901p;
    @AbstractC27891c(mo46611a = "enableExternNet")

    /* renamed from: q */
    public int f147902q;
    @AbstractC27891c(mo46611a = "enableQuic")

    /* renamed from: r */
    public int f147903r;
    @AbstractC27891c(mo46611a = "enableMutitask")

    /* renamed from: s */
    public int f147904s;
    @AbstractC27891c(mo46611a = "ttnetConfigValue")

    /* renamed from: t */
    public int f147905t;
    @AbstractC27891c(mo46611a = "enable_tt_uploader_log_callback")

    /* renamed from: u */
    public boolean f147906u;
    @AbstractC27891c(mo46611a = "is_stream_upload_enable")

    /* renamed from: v */
    public int f147907v;
    @AbstractC27891c(mo46611a = "enable_client_network_judgement")

    /* renamed from: w */
    public boolean f147908w;
    @AbstractC27891c(mo46611a = "enable_tt_uploader_ev_state")

    /* renamed from: x */
    public boolean f147909x;
    @AbstractC27891c(mo46611a = "testSpeedAppKey")

    /* renamed from: y */
    public String f147910y;
    @AbstractC27891c(mo46611a = "testSpeedAuthorization")

    /* renamed from: z */
    public String f147911z;

    static {
        Covode.recordClassIndex(77105);
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.f.f$a */
    public class C65615a extends AbstractC34479a {
        @AbstractC34486b
        @AbstractC27891c(mo46611a = "access_key_id")

        /* renamed from: a */
        public String f147912a;
        @AbstractC34486b
        @AbstractC27891c(mo46611a = "secret_access_key")

        /* renamed from: b */
        public String f147913b;
        @AbstractC34486b
        @AbstractC27891c(mo46611a = "session_token")

        /* renamed from: c */
        public String f147914c;
        @AbstractC34486b
        @AbstractC27891c(mo46611a = "space_name")

        /* renamed from: d */
        public String f147915d;

        static {
            Covode.recordClassIndex(77106);
        }

        public final String toString() {
            return "STSAuthConfig{accessKeyId='" + this.f147912a + '\'' + ", secretAccessKey='" + this.f147913b + '\'' + ", sessionToken='" + this.f147914c + '\'' + ", spaceName='" + this.f147915d + '\'' + '}';
        }
    }

    public final String toString() {
        return "UploadVideoConfig{appKey='" + this.f147886a + '\'' + ", fileHostName='" + this.f147887b + '\'' + ", videoHostName='" + this.f147888c + '\'' + ", sliceTimeout=" + this.f147889d + ", sliceRetryCount=" + this.f147890e + ", sliceSize=" + this.f147891f + ", fileRetryCount=" + this.f147892g + ", maxFailTime=" + this.f147893h + ", authorization='" + this.f147894i + '\'' + ", enableHttps=" + this.f147895j + ", enableExternDNS=" + this.f147896k + ", aliveMaxFailTime=" + this.f147897l + ", enableTTNetDNS=" + this.f147898m + ", enablePostMethod=" + this.f147899n + ", openTimeOut=" + this.f147900o + ", uploadRegion='" + this.f147901p + '\'' + ", enableExternNet=" + this.f147902q + ", enableQuic=" + this.f147903r + ", enableMutitask=" + this.f147904s + ", ttnetConfigValue=" + this.f147905t + ", enableTTUploaderLogCallback=" + this.f147906u + ", isStreamUploadEnable=" + this.f147907v + ", enableClientNetworkJudgement=" + this.f147908w + ", testSpeedAppKey='" + this.f147910y + '\'' + ", testSpeedAuthorization='" + this.f147911z + '\'' + ", captionAppKey='" + this.f147878A + '\'' + ", captionAuthorization='" + this.f147879B + '\'' + ", aiCutAuthorization='" + this.f147881D + '\'' + ", aiCutAppKey='" + this.f147882E + '\'' + ", authorization2=" + this.f147883F + '\'' + ", mainNetworkType='" + this.f147884G + '\'' + ", backupNetworkType='" + this.f147885H + '\'' + '}';
    }
}
