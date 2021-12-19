package com.bytedance.android.livesdkapi.depend.model.live.p688a;

import com.bytedance.android.livesdk.model.message.p578b.C9631a;
import com.bytedance.android.livesdk.model.message.p578b.C9642h;
import com.bytedance.android.livesdk.model.message.p578b.C9644i;
import com.bytedance.android.livesdk.model.message.p578b.C9645j;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.a.c */
public final class C11696c {
    @AbstractC27891c(mo46611a = "channel_id")

    /* renamed from: a */
    public Long f27982a;
    @AbstractC27891c(mo46611a = "battle_id")

    /* renamed from: b */
    public Long f27983b;
    @AbstractC27891c(mo46611a = "battle_settings")

    /* renamed from: c */
    public C9644i f27984c;
    @AbstractC27891c(mo46611a = "armies")

    /* renamed from: d */
    public Map<Long, C9645j> f27985d;
    @AbstractC27891c(mo46611a = "battle_result")

    /* renamed from: e */
    public Map<Long, C9642h> f27986e;
    @AbstractC27891c(mo46611a = "anchors_info")

    /* renamed from: f */
    public Map<Long, C11697d> f27987f;
    @AbstractC27891c(mo46611a = "bubble_text")

    /* renamed from: g */
    public String f27988g;
    @AbstractC27891c(mo46611a = "supported_actions")

    /* renamed from: h */
    public Map<Long, Boolean> f27989h;
    @AbstractC27891c(mo46611a = "fuzzy_display_config")

    /* renamed from: i */
    public C9631a f27990i;
    @AbstractC27891c(mo46611a = "battle_combo_v2")

    /* renamed from: j */
    public Map<Long, C11695b> f27991j;

    static {
        Covode.recordClassIndex(13384);
    }

    public C11696c(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11696c)) {
            return false;
        }
        C11696c cVar = (C11696c) obj;
        return C89219l.m154714a(this.f27982a, cVar.f27982a) && C89219l.m154714a(this.f27983b, cVar.f27983b) && C89219l.m154714a(this.f27984c, cVar.f27984c) && C89219l.m154714a(this.f27985d, cVar.f27985d) && C89219l.m154714a(this.f27986e, cVar.f27986e) && C89219l.m154714a(this.f27987f, cVar.f27987f) && C89219l.m154714a(this.f27988g, cVar.f27988g) && C89219l.m154714a(this.f27989h, cVar.f27989h) && C89219l.m154714a(this.f27990i, cVar.f27990i) && C89219l.m154714a(this.f27991j, cVar.f27991j);
    }

    public final int hashCode() {
        Long l = this.f27982a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.f27983b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        C9644i iVar = this.f27984c;
        int hashCode3 = (hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        Map<Long, C9645j> map = this.f27985d;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        Map<Long, C9642h> map2 = this.f27986e;
        int hashCode5 = (hashCode4 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<Long, C11697d> map3 = this.f27987f;
        int hashCode6 = (hashCode5 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str = this.f27988g;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
        Map<Long, Boolean> map4 = this.f27989h;
        int hashCode8 = (hashCode7 + (map4 != null ? map4.hashCode() : 0)) * 31;
        C9631a aVar = this.f27990i;
        int hashCode9 = (hashCode8 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Map<Long, C11695b> map5 = this.f27991j;
        if (map5 != null) {
            i = map5.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        return "BattleInfoResponse(channelId=" + this.f27982a + ", battleId=" + this.f27983b + ", setting=" + this.f27984c + ", armies=" + this.f27985d + ", resultMap=" + this.f27986e + ", userInfoMap=" + this.f27987f + ", bubbleText=" + this.f27988g + ", supportedActions=" + this.f27989h + ", mBattleDisplayConfig=" + this.f27990i + ", battleCombos=" + this.f27991j + ")";
    }

    private C11696c() {
        this.f27982a = null;
        this.f27983b = null;
        this.f27984c = null;
        this.f27985d = null;
        this.f27986e = null;
        this.f27987f = null;
        this.f27988g = null;
        this.f27989h = null;
        this.f27990i = null;
        this.f27991j = null;
    }

    private /* synthetic */ C11696c(byte b) {
        this();
    }
}
