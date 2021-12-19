package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.g */
public final class C55894g extends AbstractC55867a {
    static {
        Covode.recordClassIndex(65684);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a
    /* renamed from: a */
    public final String mo92715a(IMContact iMContact) {
        IMUser a = C55083f.m100745a(iMContact);
        if (a != null) {
            return "@" + a.getUniqueId();
        }
        return null;
    }
}
