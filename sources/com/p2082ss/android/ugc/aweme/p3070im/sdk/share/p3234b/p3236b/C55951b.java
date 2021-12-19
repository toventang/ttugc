package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.AbstractC56258k;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56261n;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.EnumC56260m;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.b */
public final /* synthetic */ class C55951b implements AbstractC56258k {

    /* renamed from: a */
    private final C55954e f127584a;

    /* renamed from: b */
    private final SharePackage f127585b;

    /* renamed from: c */
    private final IMContact f127586c;

    static {
        Covode.recordClassIndex(65744);
    }

    C55951b(C55954e eVar, SharePackage sharePackage, IMContact iMContact) {
        this.f127584a = eVar;
        this.f127585b = sharePackage;
        this.f127586c = iMContact;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.AbstractC56258k
    /* renamed from: a */
    public final void mo92819a() {
        C55954e eVar = this.f127584a;
        SharePackage sharePackage = this.f127585b;
        IMContact iMContact = this.f127586c;
        if (eVar.f127588a == EnumC56260m.SENDING) {
            C55949a.f127582a.removeMessages(100);
            eVar.mo92821a(EnumC56260m.UNDO);
            AbstractC81915c.m141874a(new C56261n(eVar.f127590c, eVar.f127589b));
            String str = eVar.f127595h;
            HashMap hashMap = new HashMap();
            if (sharePackage != null) {
                Bundle bundle = sharePackage.f155492i;
                hashMap.put("enter_method", bundle.getString("enter_method"));
                hashMap.put("enter_from", bundle.getString("enter_from"));
            }
            hashMap.put("chat_type", "private");
            if (iMContact != null && (iMContact instanceof IMUser)) {
                IMUser iMUser = (IMUser) iMContact;
                hashMap.put("conversation_id", AbstractC17427b.C17428a.m32309a(Long.valueOf(Long.parseLong(iMUser.getUid())).longValue()));
                hashMap.put("to_user_id", iMUser.getUid());
            }
            hashMap.put("process_id", str);
            hashMap.put("message_type", "share_video");
            C39162r.m79460a("send_message_undo", hashMap);
        }
    }
}
