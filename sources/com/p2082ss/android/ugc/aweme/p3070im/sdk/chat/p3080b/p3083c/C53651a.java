package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.a */
public final class C53651a {

    /* renamed from: a */
    public static String f123099a = "";

    /* renamed from: b */
    public static final C53651a f123100b = new C53651a();

    /* renamed from: c */
    private static final int f123101c;

    /* renamed from: d */
    private static final int f123102d;

    private C53651a() {
    }

    /* renamed from: a */
    public static final boolean m98925a() {
        if ((f123101c & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m98928b() {
        if ((f123101c & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m98929c() {
        if ((f123101c & 8) == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m98930d() {
        if ((f123102d & 16) == 16) {
            return true;
        }
        return false;
    }

    static {
        int i;
        int i2;
        Covode.recordClassIndex(63231);
        C56256i iMSetting = C55076b.m100723b().getIMSetting();
        if (iMSetting != null) {
            i = iMSetting.f128316h;
        } else {
            i = 5;
        }
        f123101c = i;
        if (iMSetting != null) {
            i2 = iMSetting.f128317i;
        } else {
            i2 = 3;
        }
        f123102d = i2;
    }

    /* renamed from: a */
    public static final boolean m98927a(String str) {
        if (str != null) {
            return m98926a(AbstractC17420a.C17421a.m32276a().mo27720a(str));
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m98926a(C19638h hVar) {
        Map<String, String> ext;
        if (hVar == null) {
            return false;
        }
        C19639i coreInfo = hVar.getCoreInfo();
        if (coreInfo != null && (ext = coreInfo.getExt()) != null && C89219l.m154714a((Object) "1", (Object) ext.get("a:s_author_im_supporter"))) {
            return true;
        }
        Map<String, String> localExt = hVar.getLocalExt();
        if (localExt == null || !C89219l.m154714a((Object) "1", (Object) localExt.get("a:s_author_im_supporter"))) {
            return false;
        }
        return true;
    }
}
