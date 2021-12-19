package com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h.p3311a;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.a.h.a.c */
public final class C57133c {

    /* renamed from: a */
    public static final C57133c f130069a = new C57133c();

    private C57133c() {
    }

    static {
        Covode.recordClassIndex(67027);
    }

    /* renamed from: a */
    private static boolean m103509a(List<ExternalMusicInfo> list) {
        ExternalMusicInfo externalMusicInfo;
        if (C13603b.m24435a((Collection) list)) {
            return false;
        }
        String str = null;
        if (!(list == null || (externalMusicInfo = list.get(0)) == null)) {
            str = externalMusicInfo.getPartnerName();
        }
        return TextUtils.equals(str, "awa");
    }

    /* renamed from: a */
    public static void m103508a(TextView textView, Music music) {
        List<ExternalMusicInfo> list;
        int i;
        int i2;
        if (music != null) {
            list = music.getExternalMusicInfos();
        } else {
            list = null;
        }
        if (m103509a(list)) {
            i = 2131233960;
        } else {
            i = 0;
        }
        if (textView != null) {
            if (i > 0) {
                i2 = C34728n.m70946a(5.0d);
            } else {
                i2 = 0;
            }
            textView.setCompoundDrawablePadding(i2);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        }
    }
}
