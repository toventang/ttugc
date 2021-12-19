package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.TagBAUser;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.BcAdModel */
public final class BcAdModel {

    /* renamed from: ad */
    public final String f161313ad;
    public final TagBAUser baUser;
    public final String partnerWith;

    static {
        Covode.recordClassIndex(84549);
    }

    public BcAdModel(String str, String str2, TagBAUser tagBAUser) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f161313ad = str;
        this.partnerWith = str2;
        this.baUser = tagBAUser;
    }
}
