package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p578b.C9631a;
import com.bytedance.android.livesdk.model.message.p578b.C9642h;
import com.bytedance.android.livesdk.model.message.p578b.C9644i;
import com.bytedance.android.livesdk.model.message.p578b.C9648l;
import com.bytedance.android.livesdk.model.message.p578b.C9650n;
import com.bytedance.android.livesdk.model.message.p578b.C9651o;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11695b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.model.message.an */
public class C9614an extends AbstractC6571a {
    @AbstractC27891c(mo46611a = "battle_id")

    /* renamed from: a */
    public long f23354a;
    @AbstractC27891c(mo46611a = "action")

    /* renamed from: f */
    public int f23355f;
    @AbstractC27891c(mo46611a = "battle_settings")

    /* renamed from: g */
    public C9644i f23356g;
    @AbstractC27891c(mo46611a = "battle_result")

    /* renamed from: h */
    public Map<Long, C9642h> f23357h;
    @AbstractC27891c(mo46611a = "fuzzy_display_config")

    /* renamed from: i */
    public C9631a f23358i;
    @AbstractC27891c(mo46611a = "battle_combo_v2")

    /* renamed from: j */
    public Map<Long, C11695b> f23359j;
    @AbstractC27891c(mo46611a = "armies")

    /* renamed from: k */
    public List<C9651o> f23360k;
    @AbstractC27891c(mo46611a = "anchors_info")

    /* renamed from: l */
    public List<C9648l> f23361l;
    @AbstractC27891c(mo46611a = "bubble_text")

    /* renamed from: m */
    public String f23362m;
    @AbstractC27891c(mo46611a = "supported_actions")

    /* renamed from: n */
    public List<C9650n> f23363n;
    @AbstractC27891c(mo46611a = "invitee_gift_permission_type")

    /* renamed from: o */
    public int f23364o;

    static {
        Covode.recordClassIndex(11156);
    }

    public C9614an() {
        this.f28131L = EnumC9596a.LINK_MIC_BATTLE;
    }

    public String toString() {
        return "LinkMicBattleMessage{battleId=" + this.f23354a + ", action=" + this.f23355f + ", battleSetting=" + this.f23356g + ", battleResult=" + this.f23357h + '}';
    }
}
