package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e */
public class C71164e implements Serializable {

    /* renamed from: a */
    private C39078ad f159410a;
    public boolean interactStickerCheckEffectSdk;
    public C71085c mInteractStickerContext;

    static {
        Covode.recordClassIndex(83670);
    }

    public static String updateSDKShareContextWhenSaveOrPost(boolean z, String str) {
        return str;
    }

    public C71085c getInteractStickerContext() {
        return this.mInteractStickerContext;
    }

    public C39078ad getShareContext() {
        return this.f159410a;
    }

    public String toBusinessData() {
        return C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(this);
    }

    public void setInteractStickerContext(C71085c cVar) {
        this.mInteractStickerContext = cVar;
    }

    public void setShareContext(C39078ad adVar) {
        this.f159410a = adVar;
    }

    public static String getShareContext(C71164e eVar) {
        if (eVar == null || eVar.getShareContext() == null) {
            return null;
        }
        return C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(eVar.getShareContext());
    }

    public static String getShareContext(String str) {
        C71164e eVar;
        if (C13627m.m24498a(str) || (eVar = (C71164e) C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46670a(str, C71164e.class)) == null || eVar.getShareContext() == null) {
            return null;
        }
        return C63244g.m114602a().mo73257C().getRetrofitFactoryGson().mo46674b(eVar.getShareContext());
    }
}
