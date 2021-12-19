package com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.kids.a.i.a */
public final class C57145a {
    static {
        Covode.recordClassIndex(67039);
    }

    /* renamed from: a */
    private static String m103540a(String str) {
        C89219l.m154721d(str, "");
        if (C89361p.m154874b(str, "http://", false)) {
            return C89361p.m154873b(str, "http://", "https://", false);
        }
        return str;
    }

    /* renamed from: a */
    private static UrlModel m103538a(UrlModel urlModel) {
        C89219l.m154721d(urlModel, "");
        List<String> urlList = urlModel.getUrlList();
        ArrayList arrayList = null;
        if (urlList != null) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) urlList, 10));
            for (T t : urlList) {
                arrayList2.add(t != null ? m103540a((String) t) : null);
            }
            arrayList = arrayList2;
        }
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    /* renamed from: a */
    public static final MusicModel m103539a(MusicModel musicModel) {
        UrlModel urlModel;
        C89219l.m154721d(musicModel, "");
        UrlModel url = musicModel.getUrl();
        UrlModel urlModel2 = null;
        if (url != null) {
            urlModel = m103538a(url);
        } else {
            urlModel = null;
        }
        musicModel.setUrl(urlModel);
        UrlModel strongBeatUrl = musicModel.getStrongBeatUrl();
        if (strongBeatUrl != null) {
            urlModel2 = m103538a(strongBeatUrl);
        }
        musicModel.setStrongBeatUrl(urlModel2);
        return musicModel;
    }
}
