package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.l */
public final class C32794l extends AbstractC0975m {

    /* renamed from: a */
    private final AbstractC89244h f78143a = C89250i.m154773a((AbstractC89171a) C32796b.f78146a);

    static {
        Covode.recordClassIndex(39573);
    }

    /* renamed from: a */
    private final List<C32795a> m67386a() {
        return (List) this.f78143a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.l$b */
    static final class C32796b extends AbstractC89220m implements AbstractC89171a<List<C32795a>> {

        /* renamed from: a */
        public static final C32796b f78146a = new C32796b();

        static {
            Covode.recordClassIndex(39575);
        }

        C32796b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C32795a> invoke() {
            return new ArrayList();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return m67386a().size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return m67386a().get(i).f78145b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32794l(AbstractC0952i iVar) {
        super(iVar);
        C89219l.m154721d(iVar, "");
    }

    @Override // androidx.fragment.app.AbstractC0975m
    /* renamed from: a */
    public final Fragment mo3649a(int i) {
        return m67386a().get(i).f78144a;
    }

    /* renamed from: a */
    public final void mo58593a(C32795a aVar) {
        C89219l.m154721d(aVar, "");
        if (!m67386a().contains(aVar)) {
            m67386a().add(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.l$a */
    public static final class C32795a {

        /* renamed from: a */
        public final Fragment f78144a;

        /* renamed from: b */
        public final String f78145b;

        static {
            Covode.recordClassIndex(39574);
        }

        public C32795a(Fragment fragment, String str) {
            C89219l.m154721d(fragment, "");
            C89219l.m154721d(str, "");
            this.f78144a = fragment;
            this.f78145b = str;
        }
    }
}
