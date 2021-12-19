package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4359c;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84547o;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.EnumC84548p;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84601i;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84603k;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84604l;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84450i;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.f */
public final class C84592f extends AbstractC20191d<List<? extends InfoStickerEffect>, List<? extends C84547o>> implements AbstractC84604l {

    /* renamed from: a */
    public final AbstractC84603k f189058a;

    /* renamed from: b */
    public final AbstractC84601i f189059b;

    static {
        Covode.recordClassIndex(98557);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.f$a */
    static final class CallableC84593a<V> implements Callable<List<? extends C84547o>> {

        /* renamed from: a */
        final /* synthetic */ C84592f f189060a;

        /* renamed from: b */
        final /* synthetic */ List f189061b;

        static {
            Covode.recordClassIndex(98558);
        }

        CallableC84593a(C84592f fVar, List list) {
            this.f189060a = fVar;
            this.f189061b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<? extends C84547o> call() {
            EnumC84548p pVar;
            List<InfoStickerEffect> list = this.f189061b;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (InfoStickerEffect infoStickerEffect : list) {
                String a = this.f189060a.f189058a.mo129520a(infoStickerEffect);
                if (C84450i.m145271a(this.f189060a.f189059b, infoStickerEffect)) {
                    pVar = EnumC84548p.SEARCH_STICKER_STICKER_DOWNLOADING;
                } else if (this.f189060a.f189058a.mo129521b(infoStickerEffect)) {
                    pVar = EnumC84548p.SEARCH_STICKER_STICKER_DOWNLOAD_SUCCESS;
                } else {
                    pVar = EnumC84548p.SEARCH_STICKER_STICKER_NOT_DOWNLOAD;
                }
                arrayList.add(new C84547o(pVar, a));
            }
            return arrayList;
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        List list = (List) obj;
        C89219l.m154721d(list, "");
        AbstractC88979t c = AbstractC88979t.m154314c(new CallableC84593a(this, list));
        C89219l.m154716b(c, "");
        return c;
    }

    public C84592f(AbstractC84603k kVar, AbstractC84601i iVar) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(iVar, "");
        this.f189058a = kVar;
        this.f189059b = iVar;
    }
}
