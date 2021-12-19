package com.p2082ss.android.ugc.aweme.profile;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.i */
public final class C63808i {

    /* renamed from: a */
    private final Keva f144629a = Keva.getRepo("repo_local_cover");

    static {
        Covode.recordClassIndex(75136);
    }

    /* renamed from: a */
    public final UrlModel mo102372a(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String string = this.f144629a.getString(str, "");
        C89219l.m154716b(string, "");
        if (!new File(string).exists()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String uri = Uri.fromFile(new File(string)).toString();
        C89219l.m154716b(uri, "");
        arrayList.add(uri);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(arrayList);
        return urlModel;
    }
}
