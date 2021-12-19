package com.bytedance.android.live.liveinteract.multilive.anchor.p352c;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multilive.anchor.p352c.C5494e;
import com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.AbstractC5697a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.g */
public final class C5498g extends AbstractC5697a {

    /* renamed from: a */
    public Map<String, Integer> f14075a = new HashMap();

    /* renamed from: b */
    private final C5494e.AbstractC5495a f14076b;

    static {
        Covode.recordClassIndex(6093);
    }

    public C5498g(C5494e.AbstractC5495a aVar) {
        C89219l.m154721d(aVar, "");
        this.f14076b = aVar;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i, int i2, List<? extends Region> list) {
        String jSONObject;
        C89219l.m154721d(list, "");
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        String str = a.f17260e;
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        this.f14075a.clear();
        boolean z = false;
        for (Region region : list) {
            if (TextUtils.equals(region.getInteractId(), str)) {
                C5494e.AbstractC5495a aVar = this.f14076b;
                String interactId = region.getInteractId();
                C89219l.m154716b(interactId, "");
                z = aVar.mo11134h(interactId);
                region.size(1.0d, 1.0d).position(0.0d, 0.0d).userId(c).mediaType(1).status(0);
            }
        }
        LiveCore.InteractConfig interactConfig = this.f14427c;
        C89219l.m154716b(interactConfig, "");
        interactConfig.setSeiVersion(15);
        JSONObject a2 = C5695a.m12437a(this.f14427c, list, i, i2, this.f14075a, z);
        if (a2 == null || (jSONObject = a2.toString()) == null) {
            return "";
        }
        return jSONObject;
    }
}
