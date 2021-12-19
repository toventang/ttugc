package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.c */
public final class C73207c {
    static {
        Covode.recordClassIndex(85925);
    }

    /* renamed from: a */
    public static final ArrayList<C75313h> m129259a(List<C75313h> list, int i) {
        C89219l.m154721d(list, "");
        ArrayList<C75313h> arrayList = new ArrayList<>();
        if (list.isEmpty()) {
            return arrayList;
        }
        int i2 = 0;
        if (((int) list.get(0).getStartTime()) != 0) {
            arrayList.add(new C75313h(0, list.get(0).getStartTime()));
        }
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                break;
            } else if (i2 == list.size() - 1) {
                arrayList.add(new C75313h(list.get(i2)));
                break;
            } else {
                arrayList.add(new C75313h(list.get(i2)));
                i2++;
                arrayList.add(new C75313h(list.get(i2).getEndTime(), list.get(i2).getStartTime()));
            }
        }
        if (((int) list.get(list.size() - 1).getEndTime()) != i) {
            arrayList.add(new C75313h(list.get(list.size() - 1).getEndTime(), (long) i));
        }
        return arrayList;
    }
}
