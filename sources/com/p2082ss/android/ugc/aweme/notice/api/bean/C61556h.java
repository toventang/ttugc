package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.h */
public class C61556h extends C61550b {
    @AbstractC27891c(mo46611a = "notify_group")

    /* renamed from: a */
    public int f139718a;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: b */
    public int f139719b;
    @AbstractC27891c(mo46611a = "msg_id")

    /* renamed from: c */
    public String f139720c;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: d */
    public StrangerNoticeMessage f139721d;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: e */
    public int f139722e;
    @AbstractC27891c(mo46611a = "author_id")

    /* renamed from: f */
    public long f139723f;
    @AbstractC27891c(mo46611a = "item_id")

    /* renamed from: g */
    public long f139724g;
    @AbstractC27891c(mo46611a = "push_type")

    /* renamed from: h */
    public String f139725h;

    static {
        Covode.recordClassIndex(72231);
    }

    public C61556h() {
        this.msgType = EnumC61554f.NOTICE;
    }
}
