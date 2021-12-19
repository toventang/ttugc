package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3240b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.b.a */
public final class C55970a extends IMContact {

    /* renamed from: a */
    private final boolean f127630a;

    static {
        Covode.recordClassIndex(65764);
    }

    public C55970a() {
        this(false, 1, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public final UrlModel getDisplayAvatar() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public final String getDisplayName() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public final String getNickName() {
        return null;
    }

    public final boolean getHasShownGuide() {
        return this.f127630a;
    }

    public C55970a(boolean z) {
        this.f127630a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C55970a(boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z);
    }
}
