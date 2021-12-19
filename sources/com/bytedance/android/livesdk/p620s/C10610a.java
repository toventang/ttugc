package com.bytedance.android.livesdk.p620s;

import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameCategoryEntranceSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.s.a */
public final class C10610a {
    static {
        Covode.recordClassIndex(12199);
    }

    /* renamed from: a */
    public static final GameTag m19178a() {
        return new GameTag(-1L, C3966y.m9657a((int) R.string.e9k), C3966y.m9657a((int) R.string.e9k), C3966y.m9657a((int) R.string.e9k));
    }

    /* renamed from: b */
    private static final boolean m19182b(DataChannel dataChannel) {
        C3272o oVar;
        if (dataChannel == null || (oVar = (C3272o) dataChannel.mo28318b(C9094df.class)) == null) {
            return false;
        }
        return oVar.f9383r;
    }

    /* renamed from: a */
    public static final boolean m19180a(DataChannel dataChannel) {
        boolean z;
        boolean z2 = true;
        if (!LiveGameCategoryEntranceSetting.INSTANCE.shouldShow() || !m19182b(dataChannel)) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder append = new StringBuilder("shouldShowGameCategoryEntry. result=").append(z).append(". dataChannelNull=");
        if (dataChannel != null) {
            z2 = false;
        }
        C3854a.m9453a(4, "GameCategoryExt", append.append(z2).toString());
        return z;
    }

    /* renamed from: a */
    public static final boolean m19181a(List<GameTag> list) {
        C89219l.m154721d(list, "");
        int size = list.size();
        if (size == 1) {
            return list.get(0).isNonGameOrOtherGameItem();
        }
        if (size == 2 && list.get(0).isNonGameOrOtherGameItem() && list.get(1).isNonGameOrOtherGameItem()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final List<GameTag> m19179a(boolean z, List<GameTag> list) {
        long j;
        boolean z2;
        Long l;
        C89219l.m154721d(list, "");
        C6805b<Map<String, String>> bVar = AbstractC6804a.f17017cM;
        C89219l.m154716b(bVar, "");
        GameTag a = GameTag.C9511a.m17802a(bVar.mo13066a());
        list.add(0, m19178a());
        if (!z) {
            list.add(1, new GameTag(0L, C3966y.m9657a((int) R.string.e9j), C3966y.m9657a((int) R.string.e9j), C3966y.m9657a((int) R.string.e9j)));
        }
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            GameTag gameTag = new GameTag(null, null, null, null, 15, null);
            if (t == null || (l = t.f23082id) == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            gameTag.f23082id = Long.valueOf(j);
            Long l2 = null;
            gameTag.showName = t != null ? t.showName : null;
            gameTag.fullName = t != null ? t.fullName : null;
            gameTag.shortName = t != null ? t.shortName : null;
            if (a != null) {
                Long l3 = a.f23082id;
                if (t != null) {
                    l2 = t.f23082id;
                }
                if (C89219l.m154714a(l3, l2)) {
                    z2 = true;
                    gameTag.setSelected(z2);
                    arrayList.add(gameTag);
                }
            }
            z2 = false;
            gameTag.setSelected(z2);
            arrayList.add(gameTag);
        }
        return C89070n.m154585g((Collection) arrayList);
    }
}
