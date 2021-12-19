package com.p2082ss.android.ugc.playerkit.p4324d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.d.d */
public final class C84189d {
    static {
        Covode.recordClassIndex(98091);
    }

    /* renamed from: a */
    public static C84241i m144772a(C63059e eVar) {
        if (eVar != null && (eVar.f143251p instanceof C84241i)) {
            return (C84241i) eVar.f143251p;
        }
        return null;
    }

    /* renamed from: a */
    private static C63059e.C63060a m144770a(C84237e eVar) {
        if (eVar == null) {
            return null;
        }
        C63059e.C63060a aVar = new C63059e.C63060a();
        aVar.f143252a = eVar.getBitRate();
        aVar.f143253b = eVar.getGearName();
        aVar.f143254c = eVar.getQualityType();
        aVar.f143255d = eVar.isBytevc1();
        aVar.f143256e = eVar.getUrlKey();
        aVar.f143257f = eVar.urlList();
        aVar.f143258g = eVar.getChecksum();
        aVar.f143259h = eVar.getSize();
        C84239g playAddr = eVar.getPlayAddr();
        if (playAddr != null) {
            aVar.f143260i = playAddr.getUri();
            aVar.f143261j = playAddr.getWidth();
            aVar.f143262k = playAddr.getHeight();
            aVar.f143263l = playAddr.getaK();
        }
        return aVar;
    }

    /* renamed from: a */
    public static C63059e m144771a(C84241i iVar, AbstractC63057c cVar) {
        boolean z;
        if (iVar == null) {
            return null;
        }
        C63059e eVar = new C63059e();
        if (cVar != null) {
            z = true;
        } else {
            z = false;
        }
        eVar.f143241f = z;
        eVar.f143236a = iVar.getSourceId();
        eVar.f143237b = iVar.getUri();
        eVar.f143238c = iVar.getaK();
        eVar.f143239d = iVar.getDuration();
        eVar.f143240e = iVar.getAspectRatio();
        eVar.f143245j = iVar.getCdnUrlExpired();
        eVar.f143246k = iVar.getCreateTime();
        eVar.f143244i = new C63059e.C63060a();
        eVar.f143244i.f143256e = iVar.getUrlKey();
        eVar.f143244i.f143257f = iVar.getUrlList();
        eVar.f143244i.f143258g = iVar.getFileCheckSum();
        eVar.f143244i.f143252a = -1;
        eVar.f143244i.f143264m = iVar.getRatio();
        eVar.f143244i.f143265n = iVar.getSourceId();
        eVar.f143244i.f143267p = iVar.getCdnUrlExpired();
        List<C84237e> bitRate = iVar.getBitRate();
        ArrayList arrayList = new ArrayList();
        if (bitRate != null && bitRate.size() > 0) {
            for (C84237e eVar2 : bitRate) {
                C63059e.C63060a a = m144770a(eVar2);
                a.f143264m = iVar.getRatio();
                a.f143265n = iVar.getSourceId();
                a.f143267p = iVar.getCdnUrlExpired();
                arrayList.add(a);
            }
        }
        eVar.f143243h = arrayList;
        eVar.f143242g = arrayList;
        eVar.f143249n = cVar;
        eVar.f143251p = iVar;
        return eVar;
    }
}
