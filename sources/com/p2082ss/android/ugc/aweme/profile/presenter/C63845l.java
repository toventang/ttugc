package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.presenter.l */
public final /* synthetic */ class C63845l implements AbstractC88983w {

    /* renamed from: a */
    private final C63833b f144761a;

    /* renamed from: b */
    private final String f144762b;

    /* renamed from: c */
    private final Aweme f144763c;

    static {
        Covode.recordClassIndex(75269);
    }

    C63845l(C63833b bVar, String str, Aweme aweme) {
        this.f144761a = bVar;
        this.f144762b = str;
        this.f144763c = aweme;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C63833b bVar = this.f144761a;
        String str = this.f144762b;
        Aweme aweme = this.f144763c;
        FeedItemList c = bVar.mo103311c(str);
        if (c == null) {
            c = new FeedItemList();
        }
        if (c.getItems() == null) {
            c.items = new ArrayList(1);
        }
        c.getItems().add(0, aweme);
        bVar.mo103304a(c, str);
    }
}
