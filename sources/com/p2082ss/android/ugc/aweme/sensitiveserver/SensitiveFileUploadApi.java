package com.p2082ss.android.ugc.aweme.sensitiveserver;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p1610b.AbstractC22009q;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22014v;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.sensitiveserver.SensitiveFileUploadApi */
final class SensitiveFileUploadApi {

    /* renamed from: a */
    private static final String f152035a;

    /* renamed from: b */
    private static final SensitiveFileService f152036b;

    /* renamed from: com.ss.android.ugc.aweme.sensitiveserver.SensitiveFileUploadApi$SensitiveFileService */
    interface SensitiveFileService {
        static {
            Covode.recordClassIndex(79503);
        }

        @AbstractC22012t(mo35799a = "/pssresource/external/upload")
        @AbstractC22009q
        C1731i<String> uploadSensitiveFile(@AbstractC22014v(mo35801a = "file") TypedFile typedFile, @AbstractC22014v(mo35801a = "app_id") Integer num, @AbstractC22014v(mo35801a = "channel_key") TypedString typedString, @AbstractC22014v(mo35801a = "ftype") Integer num2);
    }

    static {
        Covode.recordClassIndex(79502);
        String str = "https://" + C17867d.f42587k.f42569a;
        f152035a = str;
        f152036b = (SensitiveFileService) RetrofitFactory.m33635a().mo28817b(str).mo28832d().mo28858a(SensitiveFileService.class);
    }
}
