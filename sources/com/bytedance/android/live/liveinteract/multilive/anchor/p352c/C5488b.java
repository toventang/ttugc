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
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.b */
public final class C5488b extends AbstractC5697a {

    /* renamed from: b */
    public static final C5489a f14061b = new C5489a((byte) 0);

    /* renamed from: a */
    public Map<String, Integer> f14062a = new HashMap();

    /* renamed from: d */
    private final C5494e.AbstractC5495a f14063d;

    static {
        Covode.recordClassIndex(6083);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.b$a */
    public static final class C5489a {
        static {
            Covode.recordClassIndex(6084);
        }

        private C5489a() {
        }

        public /* synthetic */ C5489a(byte b) {
            this();
        }
    }

    public C5488b(C5494e.AbstractC5495a aVar) {
        C89219l.m154721d(aVar, "");
        this.f14063d = aVar;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i, int i2, List<? extends Region> list) {
        String jSONObject;
        double d;
        C89219l.m154721d(list, "");
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        String str = a.f17260e;
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        this.f14062a.clear();
        boolean z = false;
        for (Region region : list) {
            region.size(0.0d, 0.0d);
            C5494e.AbstractC5495a aVar = this.f14063d;
            String interactId = region.getInteractId();
            C89219l.m154716b(interactId, "");
            boolean h = aVar.mo11134h(interactId);
            C5494e.AbstractC5495a aVar2 = this.f14063d;
            String interactId2 = region.getInteractId();
            C89219l.m154716b(interactId2, "");
            boolean i3 = aVar2.mo11136i(interactId2);
            int i4 = 1;
            if (TextUtils.equals(region.getInteractId(), str)) {
                region.size(1.0d, 1.0d).position(0.0d, 0.0d).userId(c).mediaType(1).muteAudio(i3).muteVideo(false).status(0);
                z = h;
            } else {
                C5494e.AbstractC5495a aVar3 = this.f14063d;
                String interactId3 = region.getInteractId();
                C89219l.m154716b(interactId3, "");
                int k = aVar3.mo11139k(interactId3);
                if (k >= 0) {
                    Map<String, Integer> map = this.f14062a;
                    String interactId4 = region.getInteractId();
                    C89219l.m154716b(interactId4, "");
                    map.put(interactId4, Integer.valueOf(k));
                    double d2 = 0.7162491686987364d;
                    if (k == 1) {
                        d = 0.7068965517241379d;
                    } else if (k == 2) {
                        d = 0.5073891625615763d;
                    } else if (k != 3) {
                        d = 1.0d;
                        d2 = 1.0d;
                    } else {
                        d = 0.30788177339901485d;
                    }
                    C89378p a2 = C89387v.m154943a(Double.valueOf(d2), Double.valueOf(d));
                    Region position = region.size(0.2660164043449346d, 0.1921182266009852d).position(((Number) a2.getFirst()).doubleValue(), ((Number) a2.getSecond()).doubleValue());
                    if (h) {
                        i4 = 2;
                    }
                    Region muteVideo = position.mediaType(i4).muteAudio(i3).muteVideo(h);
                    C5494e.AbstractC5495a aVar4 = this.f14063d;
                    String interactId5 = region.getInteractId();
                    C89219l.m154716b(interactId5, "");
                    muteVideo.userId(aVar4.mo10989g(interactId5));
                }
            }
        }
        LiveCore.InteractConfig interactConfig = this.f14427c;
        C89219l.m154716b(interactConfig, "");
        interactConfig.setSeiVersion(11);
        JSONObject a3 = C5695a.m12437a(this.f14427c, list, i, i2, this.f14062a, z);
        if (a3 == null || (jSONObject = a3.toString()) == null) {
            return "";
        }
        return jSONObject;
    }
}
