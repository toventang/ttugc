package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34852c;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.EnumC34857g;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2393b.C34850a;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2393b.C34851b;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81962a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.h */
public final class C74655h {
    static {
        Covode.recordClassIndex(87478);
    }

    /* renamed from: a */
    public static Map<String, Object> m131108a(C84241i iVar, double d, EnumC34857g gVar) {
        AbstractC81962a a;
        if (gVar == EnumC34857g.INTELLIGENT) {
            return new C34850a().mo61716a();
        }
        C34851b bVar = new C34851b();
        bVar.f82302a.put("internet_speed", Integer.valueOf((int) d));
        Map<String, Object> map = bVar.f82302a;
        map.put("source_id", iVar.getSourceId());
        AbstractC34852c autoBitrateSetStrategy = AbstractC74616d.m131036a().mo117290b().getCommonConfig().getAutoBitrateSetStrategy();
        if (!(autoBitrateSetStrategy == null || (a = autoBitrateSetStrategy.mo61717a(iVar.getSourceId())) == null)) {
            map.put("KEY_AUTO_BITRATE_SET", a);
        }
        return map;
    }
}
