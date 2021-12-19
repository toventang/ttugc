package com.p2082ss.android.ugc.aweme.music.p3481ui.p3485d;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p2082ss.android.ugc.aweme.music.p3481ui.api.MusicAwemeApi;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.d.a */
public final class C61157a extends AbstractC20179a<C61159c, List<? extends Aweme>, C61159c, MusicAwemeList> {

    /* renamed from: a */
    private final MusicAwemeApi f138856a = MusicAwemeApi.C61122a.m110745a();

    static {
        Covode.recordClassIndex(71762);
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
    public final /* synthetic */ AbstractC88979t<MusicAwemeList> mo33481a(C61159c cVar) {
        C61159c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        return this.f138856a.queryMusicAwemeList(cVar2.f138858a, cVar2.f138859b, cVar2.f138860c, 0);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        MusicAwemeList musicAwemeList = (MusicAwemeList) obj2;
        C89219l.m154721d(obj, "");
        C89219l.m154721d(musicAwemeList, "");
        List<Aweme> list = musicAwemeList.items;
        if (list == null) {
            return C89086z.INSTANCE;
        }
        return list;
    }
}
