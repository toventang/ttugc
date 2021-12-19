package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.a */
public final class C55946a {
    static {
        Covode.recordClassIndex(65739);
    }

    /* renamed from: a */
    public static final void m101789a(SharePackage sharePackage, List<? extends IMContact> list) {
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(list, "");
        List<IMUser> a = C89070n.m154544a((Iterable<?>) list, IMUser.class);
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        for (IMUser iMUser : a) {
            arrayList.add(iMUser.getUid());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sharePackage.f155492i.putStringArray("shared_users_id_list", (String[]) array);
    }
}
