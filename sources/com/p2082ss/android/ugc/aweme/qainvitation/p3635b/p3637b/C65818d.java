package com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39144m;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b.d */
public final class C65818d extends C39088c<C65814c, AbstractC65813b> implements AbstractC65812a {

    /* renamed from: a */
    private final AbstractC89244h f148307a = C89250i.m154773a((AbstractC89171a) C65819a.f148310a);

    /* renamed from: b */
    private String f148308b;

    /* renamed from: c */
    private String f148309c;

    static {
        Covode.recordClassIndex(77319);
    }

    /* renamed from: e */
    private final C65814c m117742e() {
        return (C65814c) this.f148307a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.b.d$a */
    static final class C65819a extends AbstractC89220m implements AbstractC89171a<C65814c> {

        /* renamed from: a */
        public static final C65819a f148310a = new C65819a();

        static {
            Covode.recordClassIndex(77320);
        }

        C65819a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65814c invoke() {
            return new C65814c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.AbstractC65812a
    /* renamed from: a */
    public final boolean mo104939a() {
        return mo67841i();
    }

    public C65818d() {
        mo67838a(m117742e());
        this.f148308b = "";
        this.f148309c = "";
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: b */
    public final void mo57527b() {
        AbstractC65813b bVar;
        super.mo57527b();
        C65814c cVar = (C65814c) this.f92286h;
        if (cVar != null && cVar.f148301a && (bVar = (AbstractC65813b) this.f92287i) != null) {
            bVar.mo104885d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.AbstractC65812a
    /* renamed from: d */
    public final boolean mo104940d() {
        T t;
        AbstractC39085b bVar = this.f92286h;
        if (bVar == null || (t = bVar.mData) == null || !t.mo106753a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        String str;
        String str2;
        super.mo57528c();
        T t = m117742e().mData;
        if (t != null) {
            C65814c cVar = (C65814c) this.f92286h;
            String str3 = "";
            if (cVar != null && cVar.f148301a) {
                LogPbBean logPbBean = t.f151689b;
                if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
                    str2 = str3;
                }
                this.f148308b = str2;
            }
            String str4 = t.f151690c;
            if (str4 == null) {
                str4 = str3;
            }
            this.f148309c = str4;
            C48027ac.C48028a.f111257a.mo80056a(this.f148309c, t.f151689b);
            AbstractC65813b bVar = (AbstractC65813b) this.f92287i;
            if (bVar != null) {
                C67681g gVar = m117742e().f148302b;
                if (!(gVar == null || (str = gVar.f151684c) == null)) {
                    str3 = str;
                }
                bVar.mo104879a(t, str3);
            }
            AbstractC65813b bVar2 = (AbstractC65813b) this.f92287i;
            if (bVar2 != null) {
                bVar2.mo104881b(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.AbstractC65812a
    /* renamed from: a */
    public final void mo104937a(AbstractC39144m mVar) {
        C89219l.m154721d(mVar, "");
        if (!(mVar instanceof AbstractC65813b)) {
            mVar = null;
        }
        mo67839a_((AbstractC65813b) mVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        super.mo57526a_(exc);
        AbstractC65813b bVar = (AbstractC65813b) this.f92287i;
        if (bVar != null) {
            bVar.mo104886e();
        }
        AbstractC65813b bVar2 = (AbstractC65813b) this.f92287i;
        if (bVar2 != null) {
            bVar2.mo104881b(false);
        }
        this.f148308b = "";
    }

    @Override // com.p2082ss.android.ugc.aweme.qainvitation.p3635b.p3637b.AbstractC65812a
    /* renamed from: a */
    public final void mo104938a(boolean z, C67681g gVar) {
        C89219l.m154721d(gVar, "");
        super.mo57616a(Boolean.valueOf(z), gVar);
    }
}
