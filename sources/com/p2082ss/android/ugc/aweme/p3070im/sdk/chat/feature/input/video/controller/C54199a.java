package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.controller;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1780c.C23697c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.controller.a */
public final class C54199a extends AbstractC41261a<AbstractC39100a<?, ?>, C39101b<AbstractC39100a<?, ?>>> {

    /* renamed from: a */
    private boolean f124167a;

    /* renamed from: b */
    private String f124168b;

    static {
        Covode.recordClassIndex(63884);
    }

    /* renamed from: a */
    private final int m99464a() {
        if (this.f124167a) {
            return 1000;
        }
        return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final int getPageType(int i) {
        return m99464a() + i;
    }

    public C54199a(AbstractC39100a<?, ?> aVar, String str) {
        this.mModel = aVar == null ? C63419ae.f143971a.createAwemeModel() : aVar;
        this.mPresenter = new C39101b();
        this.f124167a = true;
        this.f124168b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        if (C23697c.m44781a(bVar.getSecUid())) {
            this.mPresenter.mo57616a(Integer.valueOf(i), true, this.f124168b, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(m99464a()));
            return;
        }
        this.mPresenter.mo57616a(Integer.valueOf(i), true, this.f124168b, Integer.valueOf(bVar.getVideoType()), Integer.valueOf(m99464a()), bVar.getSecUid());
    }
}
