package com.p2082ss.android.ugc.aweme.p2929fe.method.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.config.UploadAuthConfig;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.response.C48014a;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.GetUploadConfigService */
public final class GetUploadConfigService {

    /* renamed from: a */
    public final UploadConfigService f111088a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.GetUploadConfigService$UploadConfigService */
    public interface UploadConfigService {
        static {
            Covode.recordClassIndex(56677);
        }

        @AbstractC89722f(mo144276a = "common/upload_settings")
        C1731i<UploadAuthConfig> getUploadAuthConfig();

        @AbstractC89722f(mo144276a = "common/play_url")
        C1731i<C48014a> getUploadPlayUrlResponse(@AbstractC89736t(mo144292a = "video_id") String str);
    }

    static {
        Covode.recordClassIndex(56676);
    }

    public GetUploadConfigService() {
        Object a = RetrofitFactory.m33635a().mo28816a("/").mo28858a(UploadConfigService.class);
        C89219l.m154716b(a, "");
        this.f111088a = (UploadConfigService) a;
    }
}
