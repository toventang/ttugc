package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.HotSoonRelationNotice */
public final class HotSoonRelationNotice extends IMUser {
    private final String notice;

    static {
        Covode.recordClassIndex(60890);
    }

    public final String getNotice() {
        return this.notice;
    }

    public HotSoonRelationNotice(String str) {
        C89219l.m154721d(str, "");
        this.notice = str;
    }
}
