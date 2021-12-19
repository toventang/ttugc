package com.bytedance.android.live.liveinteract.multiguest.p325d;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.platform.common.p372d.C5695a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.AbstractC5697a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.d.a */
public final class C5201a extends AbstractC5697a {

    /* renamed from: a */
    private double f13441a;

    /* renamed from: b */
    private double f13442b;

    /* renamed from: d */
    private double f13443d;

    /* renamed from: e */
    private double f13444e;

    /* renamed from: f */
    private double f13445f;

    /* renamed from: g */
    private AbstractC5202a f13446g;

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.d.a$a */
    public interface AbstractC5202a {
        static {
            Covode.recordClassIndex(5794);
        }

        /* renamed from: f */
        int mo10988f(String str);

        /* renamed from: g */
        long mo10989g(String str);
    }

    static {
        Covode.recordClassIndex(5793);
    }

    public C5201a(Config.VideoQuality videoQuality, AbstractC5202a aVar) {
        this.f13446g = aVar;
        int width = videoQuality.getWidth();
        int height = videoQuality.getHeight();
        double d = (double) ((((float) width) * 1.0f) / 360.0f);
        Double.isNaN(d);
        double d2 = (double) width;
        Double.isNaN(d2);
        double d3 = (120.0d * d) / d2;
        this.f13441a = d3;
        Double.isNaN(d);
        double d4 = (double) height;
        Double.isNaN(d4);
        this.f13442b = (160.0d * d) / d4;
        Double.isNaN(d);
        Double.isNaN(d2);
        this.f13443d = (1.0d - d3) - ((12.0d * d) / d2);
        Double.isNaN(d);
        Double.isNaN(d4);
        this.f13444e = (60.0d * d) / d4;
        Double.isNaN(d);
        Double.isNaN(d4);
        this.f13445f = (d * 4.0d) / d4;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.Client.StreamMixer
    public final String mixStream(int i, int i2, List<Region> list) {
        String str;
        String str2 = C6894d.m14753a().f17260e;
        long c = C11115u.m19743a().mo17915b().mo13161c();
        int i3 = 0;
        for (Region region : list) {
            if (TextUtils.equals(region.getInteractId(), str2)) {
                region.mediaType(1).size(1.0d, 1.0d).position(0.0d, 0.0d).userId(c);
            } else {
                i3++;
                double d = 1.0d - this.f13444e;
                double d2 = (double) i3;
                double d3 = this.f13442b;
                Double.isNaN(d2);
                double d4 = d - (d2 * d3);
                if (i3 > 1) {
                    double d5 = (double) (i3 - 1);
                    double d6 = this.f13445f;
                    Double.isNaN(d5);
                    d4 -= d5 * d6;
                }
                region.mediaType(this.f13446g.mo10988f(region.getInteractId())).size(this.f13441a, this.f13442b).position(this.f13443d, d4).userId(this.f13446g.mo10989g(region.getInteractId()));
            }
        }
        JSONObject a = C5695a.m12437a(this.f14427c, list, i, i2, null, false);
        if (a != null) {
            str = a.toString();
        } else {
            str = "";
        }
        C5736v.m12589a(2, str2, list.size(), str);
        return str;
    }
}
