package com.p2082ss.android.ugc.aweme.ttuploader.api;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.ttuploader.api.UploadApi */
public interface UploadApi {

    /* renamed from: a */
    public static final C79336a f178249a = C79336a.f178250a;

    static {
        Covode.recordClassIndex(92530);
    }

    @AbstractC89731o(mo144285a = "/aweme/v1/upload/authkey/")
    @AbstractC89721e
    AbstractC88979t<Object> refreshUploadConfig(@AbstractC89720d LinkedHashMap<String, String> linkedHashMap);

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.api.UploadApi$a */
    public static final class C79336a {

        /* renamed from: a */
        static final /* synthetic */ C79336a f178250a = new C79336a();

        private C79336a() {
        }

        static {
            Covode.recordClassIndex(92531);
        }
    }
}
