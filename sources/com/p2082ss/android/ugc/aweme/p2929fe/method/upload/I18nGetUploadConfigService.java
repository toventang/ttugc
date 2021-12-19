package com.p2082ss.android.ugc.aweme.p2929fe.method.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.config.I18nUploadAuthConfig;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.response.I18nUploadResponse;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.I18nGetUploadConfigService */
public final class I18nGetUploadConfigService {

    /* renamed from: b */
    public static final C47966a f111089b = new C47966a((byte) 0);

    /* renamed from: a */
    public final UploadConfigService f111090a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.I18nGetUploadConfigService$UploadConfigService */
    public interface UploadConfigService {
        static {
            Covode.recordClassIndex(56679);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/upload/authkey/")
        C1731i<I18nUploadAuthConfig> getUploadAuthConfig();

        @AbstractC89722f(mo144276a = "/aweme/v1/sign/gain/url/")
        C1731i<I18nUploadResponse> getUploadPlayUrlResponse(@AbstractC89736t(mo144292a = "video_id") String str, @AbstractC89736t(mo144292a = "play_source") int i);
    }

    static {
        Covode.recordClassIndex(56678);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.I18nGetUploadConfigService$a */
    public static final class C47966a {
        static {
            Covode.recordClassIndex(56680);
        }

        private C47966a() {
        }

        public /* synthetic */ C47966a(byte b) {
            this();
        }
    }

    public I18nGetUploadConfigService() {
        Object a = RetrofitFactory.m33635a().mo28816a("https://api.tiktokv.com/").mo28858a(UploadConfigService.class);
        C89219l.m154716b(a, "");
        this.f111090a = (UploadConfigService) a;
    }
}
