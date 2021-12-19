package com.p2082ss.android.ugc.aweme.profile.widgets.translations;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C47036n;
import com.p2082ss.android.ugc.aweme.experiment.C47037o;
import com.p2082ss.android.ugc.aweme.experiment.C47038p;
import com.p2082ss.android.ugc.aweme.experiment.ClaCrowdsourcingEntrypoints;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50555t;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.translations.TranslationsAssem */
public final class TranslationsAssem extends AbstractC12769a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public TextView f147100j;

    /* renamed from: k */
    private final C12786i f147101k = new C12786i(bW_(), new C65190a(this, null));

    static {
        Covode.recordClassIndex(76661);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(58, new RunnableC90250g(TranslationsAssem.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo104362v() {
        if (this.f147101k.getValue() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.translations.TranslationsAssem$a */
    public static final class C65190a extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147102a;

        /* renamed from: b */
        final /* synthetic */ String f147103b;

        static {
            Covode.recordClassIndex(76662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65190a(AbstractC12748a aVar, String str) {
            super(0);
            this.f147102a = aVar;
            this.f147103b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f147102a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f147103b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.translations.TranslationsAssem.C65190a.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public final void mo20527p() {
        if (EventBus.m156962a().mo145393a(this)) {
            EventBus.m156962a().mo145395b(this);
        }
        super.mo20527p();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.translations.TranslationsAssem$d */
    static final class C65193d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TranslationsAssem f147107a;

        static {
            Covode.recordClassIndex(76665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65193d(TranslationsAssem translationsAssem) {
            super(1);
            this.f147107a = translationsAssem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar) {
            TextView textView;
            if (!(aVar == null || (textView = this.f147107a.f147100j) == null)) {
                textView.setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        if (C89219l.m154714a((Object) jVar.f111077b.optString("eventName"), (Object) C50555t.f116844a)) {
            C47036n.f109585a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.translations.TranslationsAssem$b */
    static final class View$OnClickListenerC65191b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TranslationsAssem f147104a;

        /* renamed from: b */
        final /* synthetic */ User f147105b;

        static {
            Covode.recordClassIndex(76663);
        }

        View$OnClickListenerC65191b(TranslationsAssem translationsAssem, User user) {
            this.f147104a = translationsAssem;
            this.f147105b = user;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TranslationsAssem translationsAssem = this.f147104a;
            User user = this.f147105b;
            Context az_ = translationsAssem.az_();
            if (az_ == null) {
                C89219l.m154715b();
            }
            String uid = user.getUid();
            C89219l.m154716b(uid, "");
            C50555t.m94781a(az_, uid, "profile", false, null);
            if (!EventBus.m156962a().mo145393a(translationsAssem)) {
                EventBus.m156966a(EventBus.m156962a(), translationsAssem);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        this.f147100j = (TextView) view.findViewById(R.id.f6f);
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C65194a.f147108a, new C65192c(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64206ab.class), C65195b.f147109a, new C65193d(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.translations.TranslationsAssem$c */
    static final class C65192c extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TranslationsAssem f147106a;

        static {
            Covode.recordClassIndex(76664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65192c(TranslationsAssem translationsAssem) {
            super(1);
            this.f147106a = translationsAssem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            TextView textView;
            ClaCrowdsourcingEntrypoints a;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                TranslationsAssem translationsAssem = this.f147106a;
                if (C47037o.m90296a() && (textView = translationsAssem.f147100j) != null) {
                    int i = 0;
                    if ((!translationsAssem.mo104362v() || (a = C47038p.m90297a()) == null || !a.isEnrolled()) && (translationsAssem.mo104362v() || !t.isTranslator)) {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    textView.setOnClickListener(new View$OnClickListenerC65191b(translationsAssem, t));
                }
            }
            return C89391z.f203057a;
        }
    }
}
