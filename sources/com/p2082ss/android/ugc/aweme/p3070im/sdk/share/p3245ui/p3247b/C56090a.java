package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3247b;

import android.app.Activity;
import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3248c.DialogC56091a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3249d.DialogC56104a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55968c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56253f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.b.a */
public final class C56090a {

    /* renamed from: a */
    public static final C56090a f127918a = new C56090a();

    private C56090a() {
    }

    static {
        Covode.recordClassIndex(65889);
    }

    /* renamed from: a */
    public static Dialog m101987a(Activity activity, SharePackage sharePackage, C56253f fVar, Set<? extends IMContact> set, boolean z, AbstractC56263a aVar, boolean z2, C55968c cVar) {
        Dialog aVar2;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(sharePackage, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            aVar2 = new DialogC56104a(activity);
        } else if (fVar != null) {
            aVar2 = new DialogC56091a(activity, set, z, aVar, z2, sharePackage, cVar, fVar);
        } else {
            aVar2 = new DialogC56091a(activity, set, z, aVar, z2, sharePackage, cVar);
        }
        return aVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ Dialog m101988a(Activity activity, SharePackage sharePackage, Set set, boolean z, AbstractC56263a aVar, boolean z2, C55968c cVar, int i) {
        Set set2 = set;
        boolean z3 = z;
        AbstractC56263a aVar2 = aVar;
        boolean z4 = z2;
        C55968c cVar2 = null;
        if ((i & 8) != 0) {
            set2 = null;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            aVar2 = null;
        }
        if ((i & 64) != 0) {
            z4 = false;
        }
        if ((i & 128) == 0) {
            cVar2 = cVar;
        }
        return m101987a(activity, sharePackage, (C56253f) null, set2, z3, aVar2, z4, cVar2);
    }
}
