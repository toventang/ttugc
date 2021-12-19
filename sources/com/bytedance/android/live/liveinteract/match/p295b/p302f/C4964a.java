package com.bytedance.android.live.liveinteract.match.p295b.p302f;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.AbstractC5697a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnebleLinkmicRegionBackupSetting;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.b.f.a */
public final class C4964a extends AbstractC5697a {

    /* renamed from: a */
    public boolean f12939a = true;

    /* renamed from: b */
    public boolean f12940b = true;

    /* renamed from: d */
    private double f12941d;

    /* renamed from: e */
    private double f12942e;

    static {
        Covode.recordClassIndex(5547);
    }

    public C4964a(Config.VideoQuality videoQuality) {
        int width = videoQuality.getWidth();
        int height = videoQuality.getHeight();
        double d = (double) ((((float) width) * 1.0f) / 360.0f);
        Double.isNaN(d);
        double d2 = (double) height;
        Double.isNaN(d2);
        this.f12941d = (138.0d * d) / d2;
        Double.isNaN(d);
        Double.isNaN(d2);
        this.f12942e = (d * 260.0d) / d2;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i, int i2, List<Region> list) {
        String str = C4384b.C4385a.m10496a().f11922L;
        if (str == null && LiveAnebleLinkmicRegionBackupSetting.INSTANCE.getValue()) {
            str = C4384b.C4385a.m10496a().f11972t;
        }
        long c = C11115u.m19743a().mo17915b().mo13161c();
        long j = C4384b.C4385a.m10496a().f11958f;
        boolean z = C4384b.C4385a.m10496a().f11942ae;
        String str2 = "";
        C89219l.m154721d(list, str2);
        C4384b a = C4384b.C4385a.m10496a();
        if (LiveAnebleLinkmicRegionBackupSetting.INSTANCE.getValue() && !a.f11956d && str != null) {
            list.clear();
        }
        for (Region region : list) {
            if (TextUtils.equals(region.getInteractId(), str)) {
                region.mediaType(1).userId(c).status(!this.f12939a ? 1 : 0).writeToSei(false);
                if (list.size() <= 1) {
                    region.size(1.0d, 1.0d).position(0.0d, 0.0d);
                } else {
                    region.size(0.5d, this.f12942e).position(0.0d, this.f12941d);
                }
            } else {
                if (C4384b.C4385a.m10496a().f11957e != 0) {
                    C4384b.C4385a.m10496a().f11923M = region.getInteractId();
                }
                region.mediaType(1).size(0.5d, this.f12942e).position(0.5d, this.f12941d).userId(j).muteAudio(z).status(!this.f12940b ? 1 : 0);
            }
        }
        JSONObject a2 = C5695a.m12437a(this.f14427c, list, i, i2, null, false);
        if (a2 != null) {
            str2 = a2.toString();
        }
        C5736v.m12589a(4, str, list.size(), str2);
        return str2;
    }
}
