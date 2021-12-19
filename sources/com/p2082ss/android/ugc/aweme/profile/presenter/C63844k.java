package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import java.util.Collection;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.presenter.k */
public final /* synthetic */ class C63844k implements AbstractC88983w {

    /* renamed from: a */
    private final C63833b f144758a;

    /* renamed from: b */
    private final String f144759b;

    /* renamed from: c */
    private final Collection f144760c;

    static {
        Covode.recordClassIndex(75268);
    }

    C63844k(C63833b bVar, String str, Collection collection) {
        this.f144758a = bVar;
        this.f144759b = str;
        this.f144760c = collection;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C63833b bVar = this.f144758a;
        String str = this.f144759b;
        Collection<Aweme> collection = this.f144760c;
        FeedItemList c = bVar.mo103311c(str);
        if (!(c == null || c.getItems() == null)) {
            for (Aweme aweme : collection) {
                C50545m.m94763a(c.getItems(), aweme, null);
            }
            bVar.mo103304a(c, str);
        }
    }
}
