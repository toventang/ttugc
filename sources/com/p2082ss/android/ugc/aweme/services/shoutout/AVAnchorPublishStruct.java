package com.p2082ss.android.ugc.aweme.services.shoutout;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.shoutout.AVAnchorPublishStruct */
public final class AVAnchorPublishStruct {
    private final String img;
    private final String keyword;
    private final String url;

    static {
        Covode.recordClassIndex(79958);
    }

    public final String getImg() {
        return this.img;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getUrl() {
        return this.url;
    }

    public AVAnchorPublishStruct(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.img = str;
        this.url = str2;
        this.keyword = str3;
    }
}
