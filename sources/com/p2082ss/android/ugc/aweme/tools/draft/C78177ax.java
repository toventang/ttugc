package com.p2082ss.android.ugc.aweme.tools.draft;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.vesdk.VEUtils;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ax */
public final class C78177ax {
    static {
        Covode.recordClassIndex(91292);
    }

    /* renamed from: a */
    public static final boolean m136665a(C69905c cVar) {
        C89219l.m154721d(cVar, "");
        String b = m136666b(cVar);
        if (b == null || b.length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final String m136666b(C69905c cVar) {
        String str;
        C89219l.m154721d(cVar, "");
        int i = cVar.musicType;
        if (i == MusicModel.MusicType.LOCAL.ordinal()) {
            str = cVar.path;
        } else if (i == MusicModel.MusicType.ONLINE.ordinal()) {
            str = C63253l.f143623a.mo73306b().mo101748b(cVar);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || VEUtils.checkAudioFile(str) != 0) {
            return null;
        }
        return str;
    }
}
