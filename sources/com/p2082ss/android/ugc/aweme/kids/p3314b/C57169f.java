package com.p2082ss.android.ugc.aweme.kids.p3314b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.p3314b.C57166d;
import com.p2082ss.android.ugc.aweme.services.external.ICacheService;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.kids.b.f */
public final /* synthetic */ class C57169f implements C57166d.AbstractC57167a {

    /* renamed from: a */
    private final ICacheService f130156a;

    static {
        Covode.recordClassIndex(67069);
    }

    C57169f(ICacheService iCacheService) {
        this.f130156a = iCacheService;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3314b.C57166d.AbstractC57167a
    /* renamed from: a */
    public final String mo94369a() {
        return this.f130156a.musicDir() + "download/";
    }
}
