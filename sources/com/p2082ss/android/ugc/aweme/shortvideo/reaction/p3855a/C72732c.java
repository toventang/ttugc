package com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2324e.C33730a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.c */
public final class C72732c {

    /* renamed from: a */
    public static final C72732c f163062a = new C72732c();

    private C72732c() {
    }

    static {
        Covode.recordClassIndex(85417);
    }

    /* renamed from: a */
    public static final List<String> m128229a(List<String> list, Aweme aweme) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            String a = C33730a.m69052a(aweme, str);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
