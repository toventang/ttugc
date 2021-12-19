package com.p2082ss.android.ugc.aweme.music.p3481ui.p3485d;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.p3481ui.api.MusicAwemeApi;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.d.d */
public final class C61160d extends AbstractC20179a<C61163f, List<? extends Music>, C61163f, C61164g> {

    /* renamed from: a */
    public static final C61161a f138861a = new C61161a((byte) 0);

    /* renamed from: b */
    private final MusicAwemeApi f138862b = MusicAwemeApi.C61122a.m110745a();

    static {
        Covode.recordClassIndex(71765);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.d.d$a */
    public static final class C61161a {
        static {
            Covode.recordClassIndex(71766);
        }

        private C61161a() {
        }

        public /* synthetic */ C61161a(byte b) {
            this();
        }
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
    public final /* synthetic */ AbstractC88979t<C61164g> mo33481a(C61163f fVar) {
        C61163f fVar2 = fVar;
        C89219l.m154721d(fVar2, "");
        return this.f138862b.queryMusicList(fVar2.f138864a, fVar2.f138865b, fVar2.f138866c);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C61164g gVar = (C61164g) obj2;
        C89219l.m154721d(obj, "");
        C89219l.m154721d(gVar, "");
        List<Music> list = gVar.f138869c;
        if (list == null) {
            return C89086z.INSTANCE;
        }
        return list;
    }
}
