package com.p2082ss.android.ugc.aweme.tools.music.p4128e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78821b;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.e */
public final class C78826e {
    static {
        Covode.recordClassIndex(91969);
    }

    /* renamed from: a */
    public static final MusicModel m137591a(C69905c cVar) {
        C89219l.m154721d(cVar, "");
        return C78821b.C78822a.m137588a(cVar);
    }

    /* renamed from: a */
    public static final boolean m137592a(ArrayList<MusicModel> arrayList, MusicModel musicModel) {
        C89219l.m154721d(arrayList, "");
        if (musicModel == null) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a((Object) it.next().getMusicId(), (Object) musicModel.getMusicId())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final int m137593b(ArrayList<MusicModel> arrayList, MusicModel musicModel) {
        C89219l.m154721d(arrayList, "");
        if (musicModel == null) {
            return -1;
        }
        int i = 0;
        for (T t : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (C89219l.m154714a((Object) t.getMusicId(), (Object) musicModel.getMusicId())) {
                return i;
            }
            i = i2;
        }
        return -1;
    }
}
