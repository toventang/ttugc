package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.proto.ReferenceInfo;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ReferenceInfoHint;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.c */
public final class C55193c {
    static {
        Covode.recordClassIndex(64938);
    }

    /* renamed from: a */
    public static final ReferenceInfoHint m100906a(ReferenceInfo referenceInfo) {
        C89219l.m154721d(referenceInfo, "");
        return (ReferenceInfoHint) C55214j.m100957a(referenceInfo.hint, ReferenceInfoHint.class);
    }

    /* renamed from: a */
    public static final boolean m100907a(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        if (aiVar.getMsgType() == 1 || aiVar.getMsgType() == 1030 || aiVar.getMsgType() == 1031) {
            return true;
        }
        return false;
    }
}
