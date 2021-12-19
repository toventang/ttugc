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

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.a */
public final class C5486a extends AbstractC5697a {

    /* renamed from: b */
    public static final C5487a f14058b = new C5487a((byte) 0);

    /* renamed from: a */
    public Map<String, Integer> f14059a = new HashMap();

    /* renamed from: d */
    private final C5494e.AbstractC5495a f14060d;

    static {
        Covode.recordClassIndex(6081);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.c.a$a */
    public static final class C5487a {
        static {
            Covode.recordClassIndex(6082);
        }

        private C5487a() {
        }

        public /* synthetic */ C5487a(byte b) {
            this();
        }
    }

    public C5486a(C5494e.AbstractC5495a aVar) {
        C89219l.m154721d(aVar, "");
        this.f14060d = aVar;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i, int i2, List<? extends Region> list) {
        String jSONObject;
        double d;
        double d2;
        int i3;
        C89219l.m154721d(list, "");
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        String str = a.f17260e;
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        this.f14059a.clear();
        boolean z = false;
        for (Region region : list) {
            region.size(0.0d, 0.0d);
            C5494e.AbstractC5495a aVar = this.f14060d;
            String interactId = region.getInteractId();
            C89219l.m154716b(interactId, "");
            boolean h = aVar.mo11134h(interactId);
            C5494e.AbstractC5495a aVar2 = this.f14060d;
            String interactId2 = region.getInteractId();
            C89219l.m154716b(interactId2, "");
            boolean i4 = aVar2.mo11136i(interactId2);
            if (TextUtils.equals(region.getInteractId(), str)) {
                region.size(0.7535465256071171d, 0.7560780122896072d).position(0.0d, 0.24392198771039275d).userId(c).mediaType(1).muteAudio(i4).muteVideo(false).status(0);
                z = h;
            } else {
                C5494e.AbstractC5495a aVar3 = this.f14060d;
                String interactId3 = region.getInteractId();
                C89219l.m154716b(interactId3, "");
                int j = aVar3.mo11137j(interactId3);
                if (j >= 0) {
                    Map<String, Integer> map = this.f14059a;
                    String interactId4 = region.getInteractId();
                    C89219l.m154716b(interactId4, "");
                    map.put(interactId4, Integer.valueOf(j));
                    Region size = region.size(0.24044241404183697d, 0.2497996259684745d);
                    if (j != 1) {
                        if (j == 2) {
                            d = 0.49706118087095913d;
                        } else if (j != 3) {
                            d2 = 0.759557585958163d;
                            d = 0.0d;
                        } else {
                            d = 0.7502003740315255d;
                        }
                        d2 = 0.759557585958163d;
                    } else {
                        d = 0.24392198771039272d;
                        d2 = 0.759557585958163d;
                    }
                    Region position = size.position(d2, d);
                    if (!h) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                    Region muteVideo = position.mediaType(i3).muteAudio(i4).muteVideo(h);
                    C5494e.AbstractC5495a aVar4 = this.f14060d;
                    String interactId5 = region.getInteractId();
                    C89219l.m154716b(interactId5, "");
                    muteVideo.userId(aVar4.mo10989g(interactId5));
                }
            }
        }
        LiveCore.InteractConfig interactConfig = this.f14427c;
        C89219l.m154716b(interactConfig, "");
        interactConfig.setSeiVersion(12);
        JSONObject a2 = C5695a.m12437a(this.f14427c, list, i, i2, this.f14059a, z);
        if (a2 == null || (jSONObject = a2.toString()) == null) {
            return "";
        }
        return jSONObject;
    }
}
