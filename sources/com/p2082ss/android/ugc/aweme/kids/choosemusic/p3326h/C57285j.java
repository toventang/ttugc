package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57192b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3322d.AbstractC57233a;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3303a.AbstractC57080c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.j */
public final class C57285j extends AbstractC57278d {
    static {
        Covode.recordClassIndex(67190);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57278d, com.p2082ss.android.ugc.aweme.kids.choosemusic.p3326h.AbstractC57279e
    /* renamed from: e */
    public final void mo94482e() {
        super.mo94482e();
        TuxStatusView tuxStatusView = this.f130486c;
        C89219l.m154716b(tuxStatusView, "");
        Context context = tuxStatusView.getContext();
        TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
        String string = context.getString(R.string.bs6);
        C89219l.m154716b(string, "");
        TuxStatusView.C23263c a = cVar.mo37879a(string);
        String string2 = context.getString(R.string.bs8);
        C89219l.m154716b(string2, "");
        this.f130486c.setStatus(a.mo37878a((CharSequence) string2).mo37877a(C23005c.m43393a(C57286a.f130509a)));
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.h.j$a */
    static final class C57286a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C57286a f130509a = new C57286a();

        static {
            Covode.recordClassIndex(67191);
        }

        C57286a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_bookmark;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    public C57285j(Context context, View view, AbstractC57233a<?> aVar, AbstractC39063h.AbstractC39067a aVar2, AbstractC57080c<C57192b> cVar, int i) {
        super(context, view, aVar, aVar2, cVar, i);
    }
}
