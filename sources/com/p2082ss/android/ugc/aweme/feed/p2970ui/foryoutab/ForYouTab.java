package com.p2082ss.android.ugc.aweme.feed.p2970ui.foryoutab;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC35331bz;
import com.p2082ss.android.ugc.aweme.C43044dj;
import com.p2082ss.android.ugc.aweme.TabFragmentNode;
import com.p2082ss.android.ugc.aweme.experiment.C46720aw;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.main.experiment.C59083d;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.foryoutab.ForYouTab */
public final class ForYouTab extends TabFragmentNode {

    /* renamed from: b */
    public final Context f116146b;

    /* renamed from: c */
    private final AbstractC89244h f116147c = C89250i.m154773a((AbstractC89171a) new C50302a(this));

    static {
        Covode.recordClassIndex(59428);
    }

    /* renamed from: b */
    private final C43044dj m94386b() {
        return (C43044dj) this.f116147c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.p2082ss.android.ugc.aweme.TabFragmentNode
    /* renamed from: a */
    public final int mo57291a() {
        return 0;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: e */
    public final String mo25233e() {
        return "homepage_hot";
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.p2082ss.android.ugc.aweme.TabFragmentNode
    /* renamed from: i */
    public final void mo57293i() {
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: f */
    public final Class<? extends Fragment> mo25234f() {
        return C50041af.class;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: Y_ */
    public final String mo62207Y_() {
        return m94386b().f100355i;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.bytedance.hox.AbstractC15501d
    /* renamed from: d */
    public final String mo25232d() {
        return m94386b().f100354h;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.foryoutab.ForYouTab$a */
    static final class C50302a extends AbstractC89220m implements AbstractC89171a<C43044dj> {

        /* renamed from: a */
        final /* synthetic */ ForYouTab f116148a;

        static {
            Covode.recordClassIndex(59429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50302a(ForYouTab forYouTab) {
            super(0);
            this.f116148a = forYouTab;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43044dj invoke() {
            return C50303a.m94396a(this.f116148a.f116146b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.p2082ss.android.ugc.aweme.TabFragmentNode
    /* renamed from: h */
    public final void mo57292h() {
        SpecActServiceImpl.m131497i().mo118025a("ForYou");
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: g */
    public final Bundle mo25235g() {
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
        return bundle;
    }

    public ForYouTab(Context context) {
        C89219l.m154721d(context, "");
        this.f116146b = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: a */
    public final View mo62208a(AbstractC35331bz bzVar) {
        C89219l.m154721d(bzVar, "");
        if (!C46720aw.m90103b() && !C46720aw.m90102a()) {
            return bzVar.mo62210a(m94386b());
        }
        View d = C59083d.f134486a.mo37200d();
        if (d == null) {
            return bzVar.mo62210a(m94386b());
        }
        return d;
    }
}
