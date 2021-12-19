package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.C28023p;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelChallengeAdapterFactory */
public final class TimeSpeedModelChallengeAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(86059);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelChallengeAdapterFactory$b */
    public static final class C73332b extends C27895a<List<AVChallenge>> {
        static {
            Covode.recordClassIndex(86061);
        }

        C73332b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelChallengeAdapterFactory$a */
    static final class C73331a extends AbstractC28031v<List<? extends AVChallenge>> {

        /* renamed from: a */
        private final AbstractC28031v<AVChallenge> f164715a;

        /* renamed from: b */
        private final C27910f f164716b;

        static {
            Covode.recordClassIndex(86060);
        }

        public C73331a(C27910f fVar) {
            C89219l.m154721d(fVar, "");
            this.f164716b = fVar;
            this.f164715a = fVar.mo46665a(AVChallenge.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ List<? extends AVChallenge> read(C27897a aVar) {
            ArrayList arrayList = null;
            if (aVar == null) {
                return null;
            }
            EnumC27899b f = aVar.mo46627f();
            if (f != null) {
                int i = C73512bk.f165157a[f.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        aVar.mo46621a();
                        arrayList = new ArrayList();
                        while (aVar.mo46626e()) {
                            AVChallenge read = this.f164715a.read(aVar);
                            C89219l.m154716b(read, "");
                            arrayList.add(read);
                        }
                        aVar.mo46622b();
                    } else if (i == 3) {
                        AVChallenge read2 = this.f164715a.read(aVar);
                        C89219l.m154716b(read2, "");
                        return C89070n.m154516a(read2);
                    }
                }
                return arrayList;
            }
            throw new C28023p("Expected JSON ARRAY or JSON OBJECT ");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.AbstractC28031v
        public final /* synthetic */ void write(C27900c cVar, List<? extends AVChallenge> list) {
            List<? extends AVChallenge> list2 = list;
            if (cVar != null) {
                if (list2 != null) {
                    cVar.mo46647b();
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        this.f164715a.write(cVar, it.next());
                    }
                    if (cVar.mo46649c() != null) {
                        return;
                    }
                }
                cVar.mo46654f();
            }
        }
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        if (!(!C89219l.m154714a(aVar, new C73332b())) || !(!C89219l.m154714a(aVar.rawType, AVChallenge.class))) {
            return new C73331a(fVar);
        }
        return null;
    }
}
