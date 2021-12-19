package com.p2082ss.android.ugc.aweme.kids.p3314b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57166d;
import com.p2082ss.android.ugc.aweme.services.external.ICacheService;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.b.e */
public final /* synthetic */ class C57168e implements C57166d.AbstractC57167a {

    /* renamed from: a */
    private final ICacheService f130155a;

    static {
        Covode.recordClassIndex(67068);
    }

    C57168e(ICacheService iCacheService) {
        this.f130155a = iCacheService;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3314b.C57166d.AbstractC57167a
    /* renamed from: a */
    public final String mo94369a() {
        return this.f130155a.musicDir() + "cache/";
    }
}
