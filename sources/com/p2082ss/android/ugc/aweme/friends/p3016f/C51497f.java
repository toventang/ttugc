package com.p2082ss.android.ugc.aweme.friends.p3016f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.friends.model.SummonFriendSearchModelV2;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.f.f */
public final class C51497f extends C39088c<SummonFriendSearchModelV2, AbstractC51491b> {

    /* renamed from: a */
    public String f118684a;

    /* renamed from: b */
    private final AbstractC89244h f118685b = C89250i.m154773a((AbstractC89171a) C51498a.f118687a);

    /* renamed from: c */
    private String f118686c;

    static {
        Covode.recordClassIndex(60762);
    }

    /* renamed from: d */
    private final SummonFriendSearchModelV2 m95951d() {
        return (SummonFriendSearchModelV2) this.f118685b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.f.f$a */
    static final class C51498a extends AbstractC89220m implements AbstractC89171a<SummonFriendSearchModelV2> {

        /* renamed from: a */
        public static final C51498a f118687a = new C51498a();

        static {
            Covode.recordClassIndex(60763);
        }

        C51498a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SummonFriendSearchModelV2 invoke() {
            return new SummonFriendSearchModelV2();
        }
    }

    public C51497f() {
        mo67838a(m95951d());
        this.f118686c = "";
        this.f118684a = "";
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: b */
    public final void mo57527b() {
        AbstractC51491b bVar;
        super.mo57527b();
        SummonFriendSearchModelV2 summonFriendSearchModelV2 = (SummonFriendSearchModelV2) this.f92286h;
        if (summonFriendSearchModelV2 != null && summonFriendSearchModelV2.forceRefresh && (bVar = (AbstractC51491b) this.f92287i) != null) {
            bVar.mo87000a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        String str;
        super.mo57528c();
        T t = m95951d().mData;
        if (t != null) {
            SummonFriendSearchModelV2 summonFriendSearchModelV2 = (SummonFriendSearchModelV2) this.f92286h;
            String str2 = "";
            if (summonFriendSearchModelV2 != null && summonFriendSearchModelV2.forceRefresh) {
                LogPbBean logPbBean = t.f151689b;
                if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
                    str = str2;
                }
                this.f118686c = str;
            }
            String str3 = t.f151690c;
            if (str3 != null) {
                str2 = str3;
            }
            this.f118684a = str2;
            C48027ac.C48028a.f111257a.mo80056a(this.f118684a, t.f151689b);
            AbstractC51491b bVar = (AbstractC51491b) this.f92287i;
            if (bVar != null) {
                bVar.mo87001a(t, m95951d().getKeyword());
            }
            AbstractC51491b bVar2 = (AbstractC51491b) this.f92287i;
            if (bVar2 != null) {
                bVar2.mo87002a(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        super.mo57526a_(exc);
        AbstractC51491b bVar = (AbstractC51491b) this.f92287i;
        if (bVar != null) {
            bVar.mo87003b();
        }
        AbstractC51491b bVar2 = (AbstractC51491b) this.f92287i;
        if (bVar2 != null) {
            bVar2.mo87002a(false);
        }
        this.f118686c = "";
    }

    /* renamed from: a */
    public final void mo87013a(boolean z, C67681g gVar) {
        C89219l.m154721d(gVar, "");
        super.mo57616a(Boolean.valueOf(z), gVar);
    }
}
