package com.p2082ss.android.ugc.playerkit;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.b */
public final class C84180b {
    static {
        Covode.recordClassIndex(98082);
    }

    /* renamed from: a */
    public static boolean m144762a(C84209m.EnumC84214e eVar) {
        if (!C84199c.f187979a.isEnableBytevc1()) {
            return false;
        }
        if (C84209m.EnumC84214e.TT.equals(eVar) || C84209m.EnumC84214e.TT_HARDWARE.equals(eVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m144763a(C84239g gVar) {
        List<String> urlList;
        if (!(gVar == null || (urlList = gVar.getUrlList()) == null || urlList.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (String str : urlList) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
            gVar.setUrlList(arrayList);
            if (urlList.isEmpty() || TextUtils.isEmpty(gVar.getUri())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
