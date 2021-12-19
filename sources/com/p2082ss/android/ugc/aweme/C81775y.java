package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.p2232ac.AbstractC31365a;
import com.p2082ss.android.ugc.aweme.p2232ac.C31366b;
import com.p2082ss.android.ugc.aweme.p2310al.C33491f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.y */
public final class C81775y {
    static {
        Covode.recordClassIndex(95182);
    }

    /* renamed from: a */
    public static C1731i<Bundle> m141657a(Bundle bundle, AbstractC31365a aVar) {
        int i;
        C1731i<Bundle> a;
        if (bundle == null) {
            bundle = new Bundle();
        }
        IAccountService.AbstractC31271a e = ((AbstractC34817bf) C31291a.m65463a(AbstractC34817bf.class)).mo60104e();
        String string = bundle.getString("previous_uid");
        String curUserId = C36085cj.f85262b.mo57069e().getCurUserId();
        boolean isNullUid = C36085cj.f85262b.mo57069e().isNullUid(string);
        boolean isNullUid2 = C36085cj.f85262b.mo57069e().isNullUid(curUserId);
        if (isNullUid) {
            if (!isNullUid2) {
                i = 0;
                a = e.mo57081a(bundle);
            }
            i = 2;
            a = e.mo57082a(bundle, (C31366b) aVar);
        } else {
            if (!isNullUid2) {
                i = 1;
                a = e.mo57083b(bundle);
            }
            i = 2;
            a = e.mo57082a(bundle, (C31366b) aVar);
        }
        AbstractC81915c.m141874a(new C33491f(i));
        return a.mo5542c(C81784z.f182895a);
    }
}
