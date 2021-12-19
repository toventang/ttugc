package com.p2082ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.f */
public enum EnumC40473f {
    CreatorPlusStatusUnknown(0),
    CreatorPlusStatusNoRights(1),
    CreatorPlusStatusNeverEnrolled(2),
    CreatorPlusStatusEnrolled(3),
    CreatorPlusStatusMeetsAllRequirements(4),
    CreatorPlusStatusMeetsSomeRequirements(5),
    CreatorPlusStatusEnrollFailed(6),
    CreatorPlusStatusLeft(7),
    CreatorPlusStatusEvicted(8);
    

    /* renamed from: b */
    private final int f94716b;

    public final int getValue() {
        return this.f94716b;
    }

    static {
        Covode.recordClassIndex(48280);
    }

    private EnumC40473f(int i) {
        this.f94716b = i;
    }
}
