package com.bytedance.android.live.liveinteract.multilive.anchor.p352c;

import com.bytedance.android.live.liveinteract.multilive.anchor.p352c.C5494e;
import com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.AbstractC5697a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.d */
public final class C5492d extends AbstractC5697a {

    /* renamed from: b */
    public static final C5493a f14067b = new C5493a((byte) 0);

    /* renamed from: a */
    public Map<String, Integer> f14068a = new HashMap();

    /* renamed from: d */
    private final C5494e.AbstractC5495a f14069d;

    static {
        Covode.recordClassIndex(6087);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.d$a */
    public static final class C5493a {
        static {
            Covode.recordClassIndex(6088);
        }

        private C5493a() {
        }

        public /* synthetic */ C5493a(byte b) {
            this();
        }
    }

    public C5492d(C5494e.AbstractC5495a aVar) {
        C89219l.m154721d(aVar, "");
        this.f14069d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0098  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p2082ss.avframework.livestreamv2.core.interact.model.Region m12001a(int r18, com.p2082ss.avframework.livestreamv2.core.interact.model.Region r19) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.anchor.p352c.C5492d.m12001a(int, com.ss.avframework.livestreamv2.core.interact.model.Region):com.ss.avframework.livestreamv2.core.interact.model.Region");
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i, int i2, List<? extends Region> list) {
        String jSONObject;
        C89219l.m154721d(list, "");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        this.f14068a.clear();
        for (Region region : list) {
            region.size(0.0d, 0.0d);
        }
        int size = list.size();
        if (size == 1) {
            m12001a(0, (Region) list.get(0)).userId(c).mediaType(1).status(0);
        } else if (size == 2) {
            m12001a(5, (Region) list.get(0)).userId(c).mediaType(1).status(0);
            m12001a(6, (Region) list.get(1));
        } else if (size != 3) {
            m12001a(1, (Region) list.get(0)).userId(c).mediaType(1).status(0);
            m12001a(2, (Region) list.get(1));
            m12001a(3, (Region) list.get(2));
            m12001a(4, (Region) list.get(3));
        } else {
            m12001a(5, (Region) list.get(0)).userId(c).mediaType(1).status(0);
            m12001a(3, (Region) list.get(1));
            m12001a(4, (Region) list.get(2));
        }
        LiveCore.InteractConfig interactConfig = this.f14427c;
        C89219l.m154716b(interactConfig, "");
        interactConfig.setSeiVersion(13);
        C5494e.AbstractC5495a aVar = this.f14069d;
        String interactId = ((Region) list.get(0)).getInteractId();
        C89219l.m154716b(interactId, "");
        JSONObject a = C5695a.m12437a(this.f14427c, list, i, i2, this.f14068a, aVar.mo11134h(interactId));
        if (a == null || (jSONObject = a.toString()) == null) {
            return "";
        }
        return jSONObject;
    }
}
