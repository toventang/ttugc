package com.p2082ss.android.ugc.aweme.relation.api;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.api.d */
public final class C66863d implements AbstractC12644a<AbstractC66862c> {

    /* renamed from: a */
    public RelationApi f150134a;

    /* renamed from: b */
    public final AbstractC66862c f150135b = new C66864a(this);

    static {
        Covode.recordClassIndex(78438);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC66862c mo20458a() {
        return this.f150135b;
    }

    /* renamed from: b */
    public final RelationApi mo105812b() {
        RelationApi relationApi = this.f150134a;
        if (relationApi == null) {
            C89219l.m154710a("relationApi");
        }
        return relationApi;
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.api.d$a */
    public static final class C66864a implements AbstractC66862c {

        /* renamed from: a */
        final /* synthetic */ C66863d f150136a;

        static {
            Covode.recordClassIndex(78439);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C66864a(C66863d dVar) {
            this.f150136a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.api.AbstractC66862c
        /* renamed from: a */
        public final AbstractC88979t<RecommendUserDialogList> mo105810a(int i, String str) {
            C89219l.m154721d(str, "");
            return this.f150136a.mo105812b().fetchUserRecommendationsList(30, i, str);
        }

        @Override // com.p2082ss.android.ugc.aweme.relation.api.AbstractC66862c
        /* renamed from: b */
        public final AbstractC88979t<RecommendUserDialogList> mo105811b(int i, String str) {
            C89219l.m154721d(str, "");
            return this.f150136a.mo105812b().fetchMatchedFriendsList(30, i, str);
        }
    }
}
