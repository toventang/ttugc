package com.p2082ss.android.ugc.aweme.video.p4208b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.C16073e;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.p1007g.C14853c;
import com.p2082ss.android.ugc.playerkit.model.C84202f;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.b.o */
public final class C80689o {

    /* renamed from: a */
    public static final C80677c f180397a = null;

    /* renamed from: b */
    static final AbstractC89244h f180398b = C89250i.m154773a((AbstractC89171a) C80691b.f180403a);

    /* renamed from: c */
    public static final AbstractC89244h f180399c = C89250i.m154773a((AbstractC89171a) C80692c.f180404a);

    /* renamed from: d */
    public static final AbstractC89244h f180400d = C89250i.m154773a((AbstractC89171a) C80690a.f180402a);

    /* renamed from: e */
    public static final C80689o f180401e = new C80689o();

    private C80689o() {
    }

    /* renamed from: com.ss.android.ugc.aweme.video.b.o$b */
    static final class C80691b extends AbstractC89220m implements AbstractC89171a<C80677c> {

        /* renamed from: a */
        public static final C80691b f180403a = new C80691b();

        static {
            Covode.recordClassIndex(93972);
        }

        C80691b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80677c invoke() {
            return C16048b.m29633a().mo25416a(true, "player_dynamic_option_config", C80677c.class, C80689o.f180397a);
        }
    }

    static {
        Covode.recordClassIndex(93970);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.b.o$a */
    static final class C80690a extends AbstractC89220m implements AbstractC89171a<List<C84202f>> {

        /* renamed from: a */
        public static final C80690a f180402a = new C80690a();

        static {
            Covode.recordClassIndex(93971);
        }

        C80690a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C84202f> invoke() {
            C80677c cVar = (C80677c) C16048b.m29633a().mo25416a(true, "player_dynamic_option_config", C80677c.class, C80689o.f180397a);
            ArrayList arrayList = null;
            if (cVar != null && cVar.f180374a != null && !cVar.f180374a.isEmpty() && C14853c.f36267d) {
                C16083j a = C16083j.m29874a();
                C89219l.m154716b(a, "");
                if (a.f38733a != null) {
                    arrayList = new ArrayList();
                    for (C80678d dVar : cVar.f180374a) {
                        if (dVar.f180378d == 2 || dVar.f180378d == 3) {
                            C84202f a2 = dVar.mo123851a();
                            C16073e.m29864a();
                            if (a2.mo128999a(C16073e.m29869b(dVar.f180375a, true))) {
                                arrayList.add(a2);
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.b.o$c */
    static final class C80692c extends AbstractC89220m implements AbstractC89171a<List<C84202f>> {

        /* renamed from: a */
        public static final C80692c f180404a = new C80692c();

        static {
            Covode.recordClassIndex(93973);
        }

        C80692c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<C84202f> invoke() {
            C80677c cVar = (C80677c) C80689o.f180398b.getValue();
            ArrayList arrayList = null;
            if (cVar != null && cVar.f180374a != null && !cVar.f180374a.isEmpty() && C14853c.f36267d) {
                C16083j a = C16083j.m29874a();
                C89219l.m154716b(a, "");
                if (a.f38733a != null) {
                    arrayList = new ArrayList();
                    for (C80678d dVar : cVar.f180374a) {
                        if (dVar.f180378d == 1) {
                            C84202f a2 = dVar.mo123851a();
                            C16073e.m29864a();
                            if (a2.mo128999a(C16073e.m29869b(dVar.f180375a, true))) {
                                arrayList.add(a2);
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }
}
