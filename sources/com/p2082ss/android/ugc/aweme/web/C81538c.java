package com.p2082ss.android.ugc.aweme.web;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.c */
public final class C81538c extends C81542d {

    /* renamed from: a */
    private final AbstractC89244h f182335a = C89250i.m154774a(EnumC89331m.NONE, C81539a.f182339a);

    /* renamed from: b */
    private final List<String> f182336b = new ArrayList();

    /* renamed from: c */
    private boolean f182337c;

    /* renamed from: d */
    private final Aweme f182338d;

    static {
        Covode.recordClassIndex(94916);
    }

    /* renamed from: b */
    private final AbstractC33207d m141404b() {
        return (AbstractC33207d) this.f182335a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.web.c$a */
    static final class C81539a extends AbstractC89220m implements AbstractC89171a<AbstractC33207d> {

        /* renamed from: a */
        public static final C81539a f182339a = new C81539a();

        static {
            Covode.recordClassIndex(94917);
        }

        C81539a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC33207d invoke() {
            IFeedAdService c = FeedAdServiceImpl.m67808c();
            if (c != null) {
                return c.mo58883b();
            }
            return null;
        }
    }

    /* renamed from: c */
    private final void m141405c() {
        if (this.f182336b.isEmpty() && !this.f182337c) {
            this.f182337c = true;
            AbstractC33207d b = m141404b();
            if (b != null) {
                b.mo59089a(this.f182338d, true);
            }
        }
    }

    public C81538c(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f182338d = aweme;
    }

    @Override // com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public final void mo24050a(String str, long j) {
        C89219l.m154721d("GeckoX---onUpdateSuccess, channel: ".concat(String.valueOf(str)), "");
        super.mo24050a(str, j);
        List<String> list = this.f182336b;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        C89206ad.m154680b(list).remove(str);
        m141405c();
    }

    @Override // com.p2082ss.android.ugc.aweme.web.C81542d, com.bytedance.geckox.p1019f.AbstractC14933a
    /* renamed from: a */
    public final void mo24053a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        C89219l.m154721d("GeckoX---onCheckServerVersionSuccess, updateList empty: " + this.f182336b.isEmpty(), "");
        super.mo24053a(map, map2);
        this.f182336b.clear();
        if (map2 != null) {
            for (Map.Entry<String, List<UpdatePackage>> entry : map2.entrySet()) {
                List<UpdatePackage> value = entry.getValue();
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        List<String> list = this.f182336b;
                        String channel = it.next().getChannel();
                        C89219l.m154716b(channel, "");
                        list.add(channel);
                    }
                }
            }
        }
        m141405c();
    }
}
