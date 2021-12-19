package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.s */
public final class C62576s extends AbstractC20179a<String, C62683w, C62682v, C62683w> {

    /* renamed from: a */
    public final NotificationLiveApi f141903a;

    static {
        Covode.recordClassIndex(73373);
    }

    public C62576s() {
        Object a = RetrofitFactory.m33635a().mo28816a("https://webcast16-normal-c-useast1a.tiktokv.com/").mo28858a(NotificationLiveApi.class);
        C89219l.m154716b(a, "");
        this.f141903a = (NotificationLiveApi) a;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C62682v vVar = (C62682v) obj;
        C89219l.m154721d(vVar, "");
        return vVar.f142111b;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<C62683w> mo33481a(C62682v vVar) {
        C62682v vVar2 = vVar;
        C89219l.m154721d(vVar2, "");
        return this.f141903a.changeOptions(vVar2.f142110a, vVar2.f142111b);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(obj2, "");
        return obj2;
    }
}
