package com.p2082ss.android.ugc.aweme.music.p3470e;

import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b.C61134a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.musicprovider.C84158e;
import com.toutiao.proxyserver.p4495g.C87327a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.C90200t;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.music.e.e */
public final class C60768e {
    static {
        Covode.recordClassIndex(71325);
    }

    /* renamed from: a */
    public static final String m110299a(UrlModel urlModel) {
        if (urlModel != null) {
            return "UrlModel: " + urlModel.getUrlList();
        }
        return "";
    }

    /* renamed from: b */
    public static final boolean m110302b(UrlModel urlModel) {
        if (urlModel != null && !TextUtils.isEmpty(urlModel.getUri()) && !C13603b.m24435a((Collection) urlModel.getUrlList())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final String m110303c(UrlModel urlModel) {
        C89219l.m154721d(urlModel, "");
        List<String> urlList = urlModel.getUrlList();
        if (urlList != null) {
            return (String) C89070n.m154583g((List) urlList);
        }
        return null;
    }

    /* renamed from: d */
    public static final List<String> m110304d(UrlModel urlModel) {
        C89219l.m154721d(urlModel, "");
        List<String> urlList = urlModel.getUrlList();
        if (urlList == null) {
            return C89086z.INSTANCE;
        }
        List<String> g = C89070n.m154585g((Collection) urlList);
        g.remove(m110303c(urlModel));
        return g;
    }

    /* renamed from: a */
    public static final boolean m110301a(String str, String str2, String str3) {
        String a = C87327a.m151540a(str);
        C84158e a2 = C84158e.m144733a();
        C89219l.m154716b(a2, "");
        File file = new File(a2.mo128988c(), a);
        if (!file.exists() || !file.isFile()) {
            C61134a.m110747a(false, str, str2, str3);
            return false;
        }
        C61134a.m110747a(true, str, str2, str3);
        return true;
    }

    /* renamed from: a */
    public static final void m110300a(MusicModel musicModel, String str, boolean z) {
        C89219l.m154721d(musicModel, "");
        if (musicModel.isPlayUrlValid()) {
            UrlModel url = musicModel.getUrl();
            C89219l.m154716b(url, "");
            List<String> urlList = url.getUrlList();
            C89219l.m154716b(urlList, "");
            List<String> f = C89070n.m154580f((Iterable) urlList);
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) f, 10));
            for (String str2 : f) {
                if (!musicModel.isNeedSetCookie() || !C89361p.m154874b(str2, "http://", false)) {
                    C90200t f2 = C90200t.m156802f(str2);
                    if (f2 != null && f2.mo145048c("ss_is_p_v_ss") == null) {
                        C90200t.C90201a j = f2.mo145060j();
                        j.mo145070c("ss_is_p_v_ss", "1");
                        str2 = j.toString();
                    }
                    C89219l.m154716b(str2, "");
                } else {
                    String musicId = musicModel.getMusicId();
                    C12290b.m22060a("aweme_music_download_error_rate", -3, new C33743c().mo59976a("music_id", musicId).mo59976a("fileUrlList", m110299a(musicModel.getUrl())).mo59976a("trace", str).mo59971a("isHitCache", Boolean.valueOf(z)).mo59977a());
                }
                arrayList.add(str2);
            }
            UrlModel url2 = musicModel.getUrl();
            C89219l.m154716b(url2, "");
            url2.setUrlList(arrayList);
        }
    }
}
