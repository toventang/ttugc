package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p578b.C9636b;
import com.bytedance.android.livesdk.model.message.p578b.C9637c;
import com.bytedance.android.livesdk.model.message.p578b.C9638d;
import com.bytedance.android.livesdk.model.message.p578b.C9639e;
import com.bytedance.android.livesdk.model.message.p578b.C9641g;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.message.ao */
public class C9615ao extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "notice_type")

    /* renamed from: a */
    public int f23365a;
    @AbstractC27891c(mo46611a = "anchor_guide")

    /* renamed from: f */
    public C9637c f23366f;
    @AbstractC27891c(mo46611a = "toast")

    /* renamed from: g */
    public C9641g f23367g;
    @AbstractC27891c(mo46611a = "bubble_guide")

    /* renamed from: h */
    public C9638d f23368h;
    @AbstractC27891c(mo46611a = "anchor_gift_guide")

    /* renamed from: i */
    public C9636b f23369i;
    @AbstractC27891c(mo46611a = "rule_guide")

    /* renamed from: j */
    public C9639e f23370j;

    /* renamed from: k */
    public boolean f23371k;

    static {
        Covode.recordClassIndex(11157);
    }

    @Override // com.bytedance.android.livesdkapi.p692h.C11777a
    /* renamed from: b */
    public final boolean mo15100b() {
        return true;
    }

    public C9615ao() {
        this.f28131L = EnumC9596a.LINK_MIC_BATTLE_NOTICE;
    }

    public String toString() {
        return "LinkMicBattleNoticeMessage{noticeType=" + this.f23365a + ", anchorGuide=" + this.f23366f + ", toast=" + this.f23367g + ", bubbleGuide=" + this.f23368h + ", anchorGiftGuide=" + this.f23369i + ", battleRuleGuide=" + this.f23370j + '}';
    }
}
