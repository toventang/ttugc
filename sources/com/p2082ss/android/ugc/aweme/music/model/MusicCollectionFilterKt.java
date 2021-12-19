package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicCollectionFilterKt */
public final class MusicCollectionFilterKt {
    static {
        Covode.recordClassIndex(71403);
    }

    public static final List<MusicCollectionItem> distinctByName(List<? extends MusicCollectionItem> list) {
        C89219l.m154721d(list, "");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (hashSet.add(t.mcName)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
