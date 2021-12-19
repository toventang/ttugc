package com.p2082ss.android.ugc.aweme.live.p3410g;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.TikTokLiveGeckoBroadcastCdnPathSetting;
import com.bytedance.android.livesdk.livesetting.other.TiktokLiveBasicResourceGeckoBaseUrlSetting;
import com.bytedance.android.livesdk.livesetting.other.TiktokLiveInteractionResourceGeckoBaseUrlSetting;
import com.bytedance.android.livesdk.livesetting.other.TiktokLiveWatchResourceGeckoBaseUrlSetting;
import com.bytedance.android.livesdkapi.p676d.C11621c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.sdk.webview.C30262h;
import com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.g.d */
public final class C58640d {

    /* renamed from: a */
    public static final C58640d f133541a = new C58640d();

    /* renamed from: b */
    private static volatile C30262h f133542b;

    private C58640d() {
    }

    static {
        Covode.recordClassIndex(68940);
    }

    /* renamed from: a */
    private static void m107770a() {
        if (f133542b == null) {
            ILiveHostOuterService p = LiveHostOuterService.m107232p();
            C89219l.m154716b(p, "");
            C30262h hVar = new C30262h(p.mo95814f());
            ILiveHostOuterService p2 = LiveHostOuterService.m107232p();
            C89219l.m154716b(p2, "");
            f133542b = hVar.mo53717a(p2.mo95813e()).mo53716a(C11621c.m20436a());
        }
    }

    /* renamed from: a */
    private static String m107767a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        m107770a();
        C30262h hVar = f133542b;
        if (hVar != null) {
            str2 = hVar.f72196b;
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        C89219l.m154716b(C81631k.f182525a, "");
        return C80333dc.m139272a("offlineX", str2, str);
    }

    /* renamed from: a */
    public static String m107768a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            switch (str.hashCode()) {
                case 351530604:
                    if (str.equals("tiktok_live_watch_resource")) {
                        return m107769a(TiktokLiveWatchResourceGeckoBaseUrlSetting.INSTANCE.getValue(), TiktokLiveWatchResourceGeckoBaseUrlSetting.DEFAULT, str, str2);
                    }
                    break;
                case 1021228553:
                    if (str.equals("tiktok_live_interaction_resource")) {
                        return m107769a(TiktokLiveInteractionResourceGeckoBaseUrlSetting.INSTANCE.getValue(), "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource", str, str2);
                    }
                    break;
                case 1040038381:
                    if (str.equals("tiktok_live_basic_resource")) {
                        return m107769a(TiktokLiveBasicResourceGeckoBaseUrlSetting.INSTANCE.getValue(), "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource", str, str2);
                    }
                    break;
                case 1544090554:
                    if (str.equals("tiktok_live_broadcast_resource")) {
                        return m107769a(TikTokLiveGeckoBroadcastCdnPathSetting.INSTANCE.getValue(), "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource", str, str2);
                    }
                    break;
            }
        }
        return "";
    }

    /* renamed from: b */
    public static File m107771b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        String a = m107767a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        File file = new File(a + File.separator + str2);
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    /* renamed from: a */
    private static String m107769a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            return str + '/' + str3 + '/' + str4;
        }
        return str2 + '/' + str3 + '/' + str4;
    }
}
