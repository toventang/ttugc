package com.bytedance.android.live.publicscreen.impl.p399e;

import android.os.SystemClock;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.config.C8209a;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGameFloatMsgPanelConfigSetting;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import p4600h.C89378p;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.e */
public final class C5947e {

    /* renamed from: b */
    public static final C5948a f14869b = new C5948a((byte) 0);

    /* renamed from: a */
    ArrayDeque<AbstractC5877k<?>> f14870a;

    /* renamed from: c */
    private final int f14871c = 100;

    /* renamed from: d */
    private LinkedList<AbstractC5877k<?>> f14872d = new LinkedList<>();

    /* renamed from: e */
    private final int f14873e = 100;

    /* renamed from: f */
    private final Set<Integer> f14874f = C89047am.m154439b(Integer.valueOf(EnumC9596a.GIFT.getIntType()), Integer.valueOf(EnumC9596a.DOODLE_GIFT.getIntType()), Integer.valueOf(EnumC9596a.CHAT.getIntType()), Integer.valueOf(EnumC9596a.MEMBER.getIntType()), Integer.valueOf(EnumC9596a.SCREEN.getIntType()), Integer.valueOf(EnumC9596a.DIGG.getIntType()), Integer.valueOf(EnumC9596a.SOCIAL.getIntType()));

    /* renamed from: g */
    private final Map<Integer, Long> f14875g;

    /* renamed from: h */
    private final Map<Integer, C89378p<Long, Integer>> f14876h;

    /* renamed from: i */
    private final int f14877i;

    /* renamed from: j */
    private final int f14878j;

    /* renamed from: k */
    private final long f14879k;

    /* renamed from: l */
    private final int f14880l;

    static {
        Covode.recordClassIndex(6555);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.e.e$a */
    public static final class C5948a {
        static {
            Covode.recordClassIndex(6556);
        }

        private C5948a() {
        }

        public /* synthetic */ C5948a(byte b) {
            this();
        }
    }

    public C5947e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f14875g = linkedHashMap;
        this.f14876h = new LinkedHashMap();
        this.f14870a = new ArrayDeque<>(100);
        C8209a value = LiveGameFloatMsgPanelConfigSetting.INSTANCE.getValue();
        this.f14877i = value.f20388b;
        this.f14878j = value.f20389c;
        this.f14879k = value.f20390d;
        this.f14880l = value.f20391e;
        linkedHashMap.put(1, 0L);
        linkedHashMap.put(2, 0L);
    }

    /* renamed from: a */
    private final boolean m13004a(int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C89378p<Long, Integer> pVar = this.f14876h.get(Integer.valueOf(i));
        if (pVar == null || uptimeMillis - pVar.getFirst().longValue() > this.f14879k) {
            this.f14876h.put(Integer.valueOf(i), new C89378p<>(Long.valueOf(uptimeMillis), 1));
            return false;
        } else if (pVar.getSecond().intValue() >= this.f14880l) {
            return true;
        } else {
            this.f14876h.put(Integer.valueOf(i), new C89378p<>(Long.valueOf(uptimeMillis), Integer.valueOf(pVar.getSecond().intValue() + 1)));
            return false;
        }
    }

    /* renamed from: a */
    public final void mo11823a(AbstractC5877k<?> kVar) {
        C89219l.m154721d(kVar, "");
        int intType = kVar.f14737d.getIntType();
        if (this.f14874f.contains(Integer.valueOf(intType))) {
            MESSAGE message = kVar.f14737d;
            if (intType == EnumC9596a.GIFT.getIntType() && (message instanceof C9895y)) {
                C9895y yVar = (C9895y) message;
                C9904t findGiftById = ((IGiftService) C6193a.m13435a(IGiftService.class)).findGiftById(yVar.f23934i);
                if (findGiftById != null && findGiftById.f24002g && yVar.f23944s) {
                    return;
                }
            }
            ArrayDeque<AbstractC5877k<?>> arrayDeque = this.f14870a;
            if (arrayDeque == null) {
                C89219l.m154710a("messageQueue");
            }
            if (arrayDeque.size() < this.f14871c) {
                arrayDeque.add(kVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11824b(com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k<? extends com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a> r17) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.p399e.C5947e.mo11824b(com.bytedance.android.live.publicscreen.a.d.k):boolean");
    }
}
