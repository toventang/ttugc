package com.bytedance.android.live.liveinteract.match.p305d;

import com.bytedance.android.livesdk.model.message.p578b.C9642h;
import com.bytedance.android.livesdk.model.message.p578b.C9645j;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11695b;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11697d;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.d.a */
public final class C5010a {
    @AbstractC27891c(mo46611a = "battle_result")

    /* renamed from: a */
    public final Map<Long, C9642h> f13040a;
    @AbstractC27891c(mo46611a = "battle_combo_v2")

    /* renamed from: b */
    public Map<Long, C11695b> f13041b;
    @AbstractC27891c(mo46611a = "armies")

    /* renamed from: c */
    public Map<Long, C9645j> f13042c;
    @AbstractC27891c(mo46611a = "anchors_info")

    /* renamed from: d */
    public Map<Long, C11697d> f13043d;

    static {
        Covode.recordClassIndex(5593);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5010a)) {
            return false;
        }
        C5010a aVar = (C5010a) obj;
        return C89219l.m154714a(this.f13040a, aVar.f13040a) && C89219l.m154714a(this.f13041b, aVar.f13041b) && C89219l.m154714a(this.f13042c, aVar.f13042c) && C89219l.m154714a(this.f13043d, aVar.f13043d);
    }

    public final int hashCode() {
        Map<Long, C9642h> map = this.f13040a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<Long, C11695b> map2 = this.f13041b;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<Long, C9645j> map3 = this.f13042c;
        int hashCode3 = (hashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<Long, C11697d> map4 = this.f13043d;
        if (map4 != null) {
            i = map4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "BattleFinishResult(battleResult=" + this.f13040a + ", battleCombos=" + this.f13041b + ", armies=" + this.f13042c + ", userInfoMap=" + this.f13043d + ")";
    }
}
