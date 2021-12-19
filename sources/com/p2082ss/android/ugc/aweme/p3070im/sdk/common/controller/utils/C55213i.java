package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56201b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56202c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i */
public final class C55213i {

    /* renamed from: a */
    public static final C55213i f126286a = new C55213i();

    private C55213i() {
    }

    static {
        Covode.recordClassIndex(64960);
    }

    /* renamed from: a */
    public static boolean m100955a() {
        if (!C56201b.m102110a() || C56202c.m102111a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<IMContact> m100954a(List<IMContact> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof IMUser) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m100956b(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            arrayList.add(t.getUid());
        }
        return arrayList;
    }
}
