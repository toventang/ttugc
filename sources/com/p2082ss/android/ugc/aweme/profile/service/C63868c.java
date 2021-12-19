package com.p2082ss.android.ugc.aweme.profile.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.service.c */
public final class C63868c implements AbstractC63872g {

    /* renamed from: a */
    public static final C63868c f144795a = new C63868c();

    /* renamed from: b */
    private final /* synthetic */ AbstractC63872g f144796b = C63873h.f144797a.favoritesMobUtilsService();

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63872g
    public final boolean isDataSetChangedOnStart() {
        return this.f144796b.isDataSetChangedOnStart();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63872g
    public final void onVideoItemActionShow(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f144796b.onVideoItemActionShow(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.service.AbstractC63872g
    public final void setDataSetChangedOnStart(boolean z) {
        this.f144796b.setDataSetChangedOnStart(z);
    }

    static {
        Covode.recordClassIndex(75293);
    }

    private C63868c() {
    }
}
