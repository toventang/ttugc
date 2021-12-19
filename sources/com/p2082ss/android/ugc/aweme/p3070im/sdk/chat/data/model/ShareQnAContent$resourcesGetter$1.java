package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent$resourcesGetter$1 */
final class ShareQnAContent$resourcesGetter$1 extends AbstractC89220m implements AbstractC89171a<Resources> {
    public static final ShareQnAContent$resourcesGetter$1 INSTANCE = new ShareQnAContent$resourcesGetter$1();

    static {
        Covode.recordClassIndex(63469);
    }

    ShareQnAContent$resourcesGetter$1() {
        super(0);
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Resources invoke() {
        Resources resources = C17867d.m33078a().getResources();
        C89219l.m154716b(resources, "");
        return resources;
    }
}
