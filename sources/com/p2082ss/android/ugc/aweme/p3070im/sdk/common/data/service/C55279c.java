package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55828f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55845g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56232b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.service.c */
public final class C55279c implements AbstractC56232b {
    static {
        Covode.recordClassIndex(65034);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.service.c$b */
    static final class C55281b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC56232b.AbstractC56233a f126391a;

        static {
            Covode.recordClassIndex(65036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55281b(AbstractC56232b.AbstractC56233a aVar) {
            super(1);
            this.f126391a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56232b
    /* renamed from: a */
    public final void mo92291a(AbstractC56232b.AbstractC56233a aVar) {
        AbstractC55736a fVar;
        if (C56216k.m102133c()) {
            C55732c cVar = new C55732c(2, false);
            cVar.f127112c = false;
            cVar.f127113d = true;
            cVar.f127114e = true;
            cVar.f127116g = true;
            fVar = new C55845g(cVar);
        } else {
            C55732c cVar2 = new C55732c(1, false);
            cVar2.f127112c = false;
            cVar2.f127113d = true;
            cVar2.f127114e = true;
            fVar = new C55828f(cVar2);
        }
        C55280a aVar2 = new C55280a(aVar);
        C55281b bVar = new C55281b(aVar);
        AbstractC55736a.C55744h hVar = AbstractC55736a.C55744h.f127144a;
        AbstractC55736a.C55745i iVar = AbstractC55736a.C55745i.f127145a;
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(iVar, "");
        fVar.mo92615a(new AbstractC55736a.C55746j(aVar2, bVar, hVar, iVar)).mo92621g();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.service.c$a */
    static final class C55280a extends AbstractC89220m implements AbstractC89183m<List<IMContact>, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f126389a = 3;

        /* renamed from: b */
        final /* synthetic */ AbstractC56232b.AbstractC56233a f126390b;

        static {
            Covode.recordClassIndex(65035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55280a(AbstractC56232b.AbstractC56233a aVar) {
            super(2);
            this.f126390b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(List<IMContact> list, Boolean bool) {
            String str;
            List<IMContact> list2 = list;
            bool.booleanValue();
            C89219l.m154721d(list2, "");
            User d = C55197c.m100922d();
            if (d != null) {
                str = d.getUid();
            } else {
                str = null;
            }
            int min = Math.min(list2.size(), this.f126389a);
            AbstractC56232b.AbstractC56233a aVar = this.f126390b;
            if (aVar != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : list2) {
                    if ((t instanceof IMUser) && (!C89219l.m154714a((Object) t.getUid(), (Object) str))) {
                        arrayList.add(t);
                    }
                    if (arrayList.size() >= min) {
                        break;
                    }
                }
                aVar.mo93050a(arrayList);
            }
            return C89391z.f203057a;
        }
    }
}
