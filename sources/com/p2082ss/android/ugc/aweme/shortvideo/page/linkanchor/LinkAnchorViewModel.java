package com.p2082ss.android.ugc.aweme.shortvideo.page.linkanchor;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1210r;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.shortvideo.page.linkanchor.C72504b;
import kotlinx.coroutines.C89561bs;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorViewModel */
public final class LinkAnchorViewModel extends AbstractC1174ac {

    /* renamed from: f */
    public static final C72501a f162498f = new C72501a((byte) 0);

    /* renamed from: a */
    final C1213t<String> f162499a;

    /* renamed from: b */
    public final C1213t<EnumC72507c> f162500b;

    /* renamed from: c */
    public final C1213t<String> f162501c = new C1213t<>();

    /* renamed from: d */
    final C1213t<Boolean> f162502d = new C1213t<>();

    /* renamed from: e */
    public boolean f162503e;

    /* renamed from: g */
    private final AbstractC89244h f162504g = C89250i.m154773a((AbstractC89171a) C72502b.f162508a);

    static {
        Covode.recordClassIndex(85175);
    }

    /* renamed from: a */
    public final C88411a mo114760a() {
        return (C88411a) this.f162504g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorViewModel$a */
    public static final class C72501a {
        static {
            Covode.recordClassIndex(85179);
        }

        private C72501a() {
        }

        public /* synthetic */ C72501a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorViewModel$b */
    static final class C72502b extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C72502b f162508a = new C72502b();

        static {
            Covode.recordClassIndex(85180);
        }

        C72502b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        mo114760a().dispose();
    }

    public LinkAnchorViewModel() {
        C1213t<String> tVar = new C1213t<>();
        this.f162499a = tVar;
        C1213t<EnumC72507c> tVar2 = new C1213t<>();
        this.f162500b = tVar2;
        tVar.setValue("");
        tVar2.setValue(EnumC72507c.INITIAL);
        C89561bs bsVar = C89561bs.f203280a;
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(bsVar, "");
        C1210r rVar = new C1210r();
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        rVar.mo4026a(tVar, new C72504b.C72505a(eVar, rVar, tVar, tVar, bsVar));
        rVar.observeForever(new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorViewModel.C724981 */

            /* renamed from: a */
            final /* synthetic */ LinkAnchorViewModel f162505a;

            static {
                Covode.recordClassIndex(85176);
            }

            {
                this.f162505a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                String str = (String) obj;
                if (this.f162505a.f162503e) {
                    this.f162505a.f162500b.setValue(EnumC72507c.VALIDATING);
                    this.f162505a.mo114760a().mo142944a();
                    C88411a a = this.f162505a.mo114760a();
                    Object a2 = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(AnchorLinkValidateApi.class);
                    C89219l.m154716b(a2, "");
                    int type = EnumC31359ab.NEWS.getTYPE();
                    C89219l.m154716b(str, "");
                    a.mo142945a(((AnchorLinkValidateApi) a2).validate(type, str).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143245b(C88446a.f200702h).mo143244b(new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorViewModel.C724981.C724991 */

                        /* renamed from: a */
                        final /* synthetic */ C724981 f162506a;

                        static {
                            Covode.recordClassIndex(85177);
                        }

                        {
                            this.f162506a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            this.f162506a.f162505a.f162500b.setValue(EnumC72507c.INVALID);
                        }
                    }).mo143253e(new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkAnchorViewModel.C724981.C725002 */

                        /* renamed from: a */
                        final /* synthetic */ C724981 f162507a;

                        static {
                            Covode.recordClassIndex(85178);
                        }

                        {
                            this.f162507a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            C72508d dVar = (C72508d) obj;
                            if (dVar.f162519a != 0) {
                                this.f162507a.f162505a.f162500b.setValue(EnumC72507c.INVALID);
                                this.f162507a.f162505a.f162501c.setValue(dVar.f162520b);
                                return;
                            }
                            this.f162507a.f162505a.f162500b.setValue(EnumC72507c.VALIDATED);
                        }
                    }));
                }
            }
        });
    }
}
