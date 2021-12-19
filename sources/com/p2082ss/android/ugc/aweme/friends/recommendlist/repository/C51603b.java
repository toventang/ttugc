package com.p2082ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.friends.model.MutualUserList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.b */
public final class C51603b extends AbstractC20179a<C51605c, List<? extends User>, C51605c, MutualUserList> {

    /* renamed from: a */
    public static final C51604a f118910a = new C51604a((byte) 0);

    /* renamed from: b */
    private final RecommendApi f118911b;

    static {
        Covode.recordClassIndex(60946);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.b$a */
    public static final class C51604a {
        static {
            Covode.recordClassIndex(60947);
        }

        private C51604a() {
        }

        public /* synthetic */ C51604a(byte b) {
            this();
        }
    }

    public C51603b() {
        Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RecommendApi.class);
        C89219l.m154716b(a, "");
        this.f118911b = (RecommendApi) a;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<MutualUserList> mo33481a(C51605c cVar) {
        C51605c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        return this.f118911b.getMutualList(cVar2.f118912a, 20, cVar2.f118913b, cVar2.f118914c);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        MutualUserList mutualUserList = (MutualUserList) obj2;
        C89219l.m154721d(obj, "");
        C89219l.m154721d(mutualUserList, "");
        if (mutualUserList.status_code != 0) {
            return C89086z.INSTANCE;
        }
        List<User> list = mutualUserList.userList;
        if (list == null) {
            return C89086z.INSTANCE;
        }
        return list;
    }
}
