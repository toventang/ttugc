package com.p2082ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33740a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.app.u */
public final class C33854u {
    static {
        Covode.recordClassIndex(40767);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.u$a */
    public enum EnumC33855a {
        PRIVATE,
        AUDITING,
        SDCARD,
        AWEME,
        NETWORK,
        DOWNLOAD_URL,
        SUFFIX_LOGO_DOWNLOAD_URL,
        PLAY_URL,
        PREVENT_DOWNLOAD,
        UI_ALIKE_WATERMARK_DOWNLOAD_URL,
        SUFFIX_SCREEN_DOWNLOAD_URL;

        static {
            Covode.recordClassIndex(40768);
        }
    }

    /* renamed from: a */
    public static void m69292a(String str, String str2) {
        C33740a.m69069a("aweme_movie_download_error_message", "download", str, str2);
    }

    /* renamed from: a */
    public static final void m69291a(EnumC33855a aVar, Aweme aweme) {
        StringBuilder sb = new StringBuilder("ForbidDownload:");
        sb.append("ForbidType:").append(aVar);
        if (aweme != null) {
            sb.append(",");
            sb.append("aweme_id").append(aweme.getAid());
        }
        m69292a(sb.toString(), "");
    }
}
