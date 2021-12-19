package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.gift.model.q */
public final class C8853q {

    /* renamed from: a */
    public static final Long f21758a = 0L;

    /* renamed from: b */
    public static final Long f21759b = 0L;

    /* renamed from: c */
    public static final Long f21760c = 0L;

    /* renamed from: d */
    public static final Long f21761d = 0L;

    /* renamed from: e */
    public static final Long f21762e = 0L;
    @AbstractC27891c(mo46611a = "display_text")

    /* renamed from: f */
    public C9698b f21763f;
    @AbstractC27891c(mo46611a = "describe")

    /* renamed from: g */
    public String f21764g;
    @AbstractC27891c(mo46611a = "gift_id")

    /* renamed from: h */
    public Long f21765h;
    @AbstractC27891c(mo46611a = "group_count")

    /* renamed from: i */
    public Long f21766i;
    @AbstractC27891c(mo46611a = "repeat_count")

    /* renamed from: j */
    public Long f21767j;
    @AbstractC27891c(mo46611a = "combo_count")

    /* renamed from: k */
    public Long f21768k;
    @AbstractC27891c(mo46611a = "msg_id")

    /* renamed from: l */
    public Long f21769l;

    static {
        Covode.recordClassIndex(9734);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f21763f != null) {
            sb.append(", display_text=").append(this.f21763f);
        }
        if (this.f21764g != null) {
            sb.append(", describe=").append(this.f21764g);
        }
        if (this.f21765h != null) {
            sb.append(", gift_id=").append(this.f21765h);
        }
        if (this.f21766i != null) {
            sb.append(", group_count=").append(this.f21766i);
        }
        if (this.f21767j != null) {
            sb.append(", repeat_count=").append(this.f21767j);
        }
        if (this.f21768k != null) {
            sb.append(", combo_count=").append(this.f21768k);
        }
        if (this.f21769l != null) {
            sb.append(", msg_id=").append(this.f21769l);
        }
        return sb.replace(0, 2, "HotfixGiftDataForProp{").append('}').toString();
    }
}
