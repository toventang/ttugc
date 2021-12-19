package com.p2082ss.android.ugc.aweme.journey.flow;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.EnumC29737c;
import com.p2082ss.android.p2124c.p2126b.AbstractC29741a;
import com.p2082ss.android.ugc.aweme.journey.C56840aa;
import com.p2082ss.android.ugc.aweme.journey.C56844ad;
import com.p2082ss.android.ugc.aweme.journey.C56845ae;
import com.p2082ss.android.ugc.aweme.journey.C56849ai;
import com.p2082ss.android.ugc.aweme.journey.C56864k;
import com.p2082ss.android.ugc.aweme.journey.C56866m;
import com.p2082ss.android.ugc.aweme.journey.C56867n;
import com.p2082ss.android.ugc.aweme.journey.C56868o;
import com.p2082ss.android.ugc.aweme.journey.C57053v;
import com.p2082ss.android.ugc.aweme.journey.C57054w;
import com.p2082ss.android.ugc.aweme.journey.C57056y;
import com.p2082ss.android.ugc.aweme.journey.p3291a.C56837c;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56900c;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.flow.a */
public final class C56857a extends AbstractC29741a<NewUserJourneyFlowDependencies> {

    /* renamed from: c */
    public static final C56858a f129474c = new C56858a((byte) 0);

    /* renamed from: f */
    private static final List<C56840aa> f129475f = C89070n.m154522b(new C56840aa(EnumC29737c.JOURNEY_SLOGAN_ID.getId()), new C56840aa(EnumC29737c.JOURNEY_ON_UPDATE_ADD_FB_FRIENDS_ID.getId()), new C56840aa(EnumC29737c.JOURNEY_INTERESTS_ID.getId()), new C56840aa(EnumC29737c.JOURNEY_AD_EXPERIENCE_ID.getId()), new C56840aa(EnumC29737c.JOURNEY_CONTENT_LANGUAGE_ID.getId()), new C56840aa(EnumC29737c.JOURNEY_APP_LANGUAGE_ID.getId()), new C56840aa(EnumC29737c.JOURNEY_NEW_USER_ADD_FB_FRIENDS_ID.getId()), new C56840aa(EnumC29737c.JOURNEY_DEEPLINK_ID.getId()), new C56840aa(EnumC29737c.JOURNEY_SWIPE_UP_ID.getId()), new C56840aa(EnumC29737c.JOURNEY_PRIVATE_ACCOUNT_TIPS_ID.getId()));

    /* renamed from: b */
    public int f129476b = -1;

    /* renamed from: d */
    private List<C56840aa> f129477d = f129475f;

    /* renamed from: e */
    private List<EnumC29737c> f129478e = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.journey.flow.a$a */
    public static final class C56858a {
        static {
            Covode.recordClassIndex(66744);
        }

        private C56858a() {
        }

        public /* synthetic */ C56858a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final void m103111a() {
        List<C56840aa> list;
        List<Integer> list2;
        List<C57054w> list3;
        C56837c c = this.f70928a.mo94028c();
        ComponentDependencies a = this.f70928a.mo94020a();
        Context context = (Context) ((WeakReference) this.f70928a.f129467b.invoke()).get();
        if (context != null && !C57056y.f129918a) {
            C89219l.m154716b(context, "");
            C57056y.C57057a.m103411a(context);
        }
        C56868o oVar = c.f129426a;
        if (oVar != null) {
            a.mo94084j();
            C57053v vVar = oVar.f129497a;
            if (!(vVar == null || (list3 = vVar.f129910a) == null)) {
                a.mo94071b(list3);
            }
            List<C56849ai> list4 = oVar.f129504h;
            if (list4 != null) {
                a.mo94075c(list4);
            }
            C56866m mVar = oVar.f129501e;
            if (!(mVar == null || (list2 = mVar.f129492a) == null)) {
                a.mo94066a(list2);
            }
            C56864k kVar = oVar.f129498b;
            if (kVar != null) {
                a.mo94059a(kVar);
            }
            C56845ae aeVar = oVar.f129500d;
            if (aeVar != null) {
                a.mo94058a(aeVar);
            }
            C56867n nVar = oVar.f129499c;
            if (nVar != null) {
                a.mo94060a(nVar);
            }
            C56844ad adVar = oVar.f129502f;
            if (adVar != null && (list = adVar.f129440a) != null) {
                m103113a(list);
            }
        }
    }

    static {
        Covode.recordClassIndex(66743);
    }

    /* renamed from: a */
    public final void mo94030a(NewUserJourneyFlowDependencies newUserJourneyFlowDependencies) {
        C89219l.m154721d(newUserJourneyFlowDependencies, "");
        mo51985a((Object) newUserJourneyFlowDependencies);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56857a(NewUserJourneyFlowDependencies newUserJourneyFlowDependencies) {
        super(newUserJourneyFlowDependencies);
        C89219l.m154721d(newUserJourneyFlowDependencies, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.flow.a$b */
    public static final class C56859b extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56857a f129479a;

        /* renamed from: b */
        final /* synthetic */ AbstractC56900c f129480b;

        /* renamed from: c */
        final /* synthetic */ ComponentDependencies f129481c;

        static {
            Covode.recordClassIndex(66745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56859b(C56857a aVar, AbstractC56900c cVar, ComponentDependencies componentDependencies) {
            super(1);
            this.f129479a = aVar;
            this.f129480b = cVar;
            this.f129481c = componentDependencies;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            if (this.f129480b.mo51983b(this.f129481c) == null) {
                this.f129479a.mo94031a((Boolean) null);
            } else {
                this.f129480b.mo94106a().invoke(this.f129481c);
                this.f129480b.mo51984c(this.f129481c);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m103113a(List<C56840aa> list) {
        int i = this.f129476b;
        if (i == -1) {
            this.f129477d = list;
        } else if (i < list.size()) {
            int i2 = 0;
            int i3 = this.f129476b;
            if (i3 >= 0) {
                while (true) {
                    EnumC29737c a = EnumC29737c.C29738a.m59912a(list.get(i2).f129431a);
                    if (a != null && this.f129478e.get(i2) == a) {
                        if (i2 == i3) {
                            break;
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            }
            this.f129477d = list;
        }
    }

    /* renamed from: a */
    private final void m103112a(C56840aa aaVar) {
        EnumC29737c a = EnumC29737c.C29738a.m59912a(aaVar.f129431a);
        if (a == null) {
            mo94031a((Boolean) null);
        } else if (this.f129478e.contains(a)) {
            mo94031a((Boolean) null);
        } else {
            this.f129478e.add(a);
            AbstractC56900c<?, ? super ComponentDependencies> a2 = this.f70928a.f129466a.mo94111a(a.getId());
            ComponentDependencies a3 = this.f70928a.mo94020a();
            if (a2 == null) {
                mo94031a((Boolean) null);
            } else if (!a2.mo51982a((Object) a3)) {
                mo94031a((Boolean) null);
            } else {
                C56859b bVar = new C56859b(this, a2, a3);
                if (a2.mo94105a((Object) a3) == 0) {
                    bVar.invoke(C89391z.f203057a);
                } else {
                    this.f70928a.mo94028c().mo94001a(a2.mo94105a((Object) a3), bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo94031a(Boolean bool) {
        if (bool != null && (!C89219l.m154714a((Object) this.f70928a.mo94025b().getValue(), (Object) true))) {
            this.f70928a.mo94025b().postValue(Boolean.valueOf(!bool.booleanValue()));
        }
        if (this.f129476b == Integer.MAX_VALUE) {
            this.f70928a.mo94029d().invoke();
            return;
        }
        m103111a();
        int i = this.f129476b + 1;
        this.f129476b = i;
        if (i >= this.f129477d.size()) {
            this.f70928a.mo94029d().invoke();
        } else {
            m103112a(this.f129477d.get(this.f129476b));
        }
    }
}
