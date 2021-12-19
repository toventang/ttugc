package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.bt */
public class C9688bt extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: a */
    public String f23578a;
    @AbstractC27891c(mo46611a = "notice_type")

    /* renamed from: f */
    public int f23579f;
    @AbstractC27891c(mo46611a = "style")

    /* renamed from: g */
    public String f23580g;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: h */
    public C9698b f23581h;
    @AbstractC27891c(mo46611a = "violation_reason")

    /* renamed from: i */
    public C9698b f23582i;
    @AbstractC27891c(mo46611a = "display_text")

    /* renamed from: j */
    public C9698b f23583j;
    @AbstractC27891c(mo46611a = "tips_title")

    /* renamed from: k */
    public C9698b f23584k;
    @AbstractC27891c(mo46611a = "tips_url")

    /* renamed from: l */
    public String f23585l;
    @AbstractC27891c(mo46611a = "notice_title")

    /* renamed from: m */
    public C9698b f23586m;
    @AbstractC27891c(mo46611a = "notice_content")

    /* renamed from: n */
    public C9698b f23587n;

    static {
        Covode.recordClassIndex(11230);
    }

    public C9688bt() {
        this.f28131L = EnumC9596a.REMIND;
    }

    @Override // com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a
    /* renamed from: a */
    public final boolean mo12726a() {
        if (this.f28134O == null || this.f28134O.f28144j == null) {
            return false;
        }
        return true;
    }
}
