package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.SingleImShareContactStruct */
public final class SingleImShareContactStruct extends ImShareContactStruct {
    private int followStatus = -1;
    private String nickname = "";
    private String remarkName = "";
    private String secUid = "";
    private String uid = "";

    static {
        Covode.recordClassIndex(84621);
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.model.ImShareContactStruct
    public final String getDisplayName() {
        if (this.remarkName.length() > 0) {
            return this.remarkName;
        }
        return this.nickname;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setNickname(String str) {
        C89219l.m154721d(str, "");
        this.nickname = str;
    }

    public final void setRemarkName(String str) {
        C89219l.m154721d(str, "");
        this.remarkName = str;
    }

    public final void setSecUid(String str) {
        C89219l.m154721d(str, "");
        this.secUid = str;
    }

    public final void setUid(String str) {
        C89219l.m154721d(str, "");
        this.uid = str;
    }
}
