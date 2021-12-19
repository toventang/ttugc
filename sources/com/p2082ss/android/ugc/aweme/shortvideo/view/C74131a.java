package com.p2082ss.android.ugc.aweme.shortvideo.view;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a */
public final class C74131a {

    /* renamed from: a */
    public AbstractC89171a<C89391z> f166503a;

    /* renamed from: b */
    public final ActivityC0218d f166504b;

    /* renamed from: c */
    private final AbstractC89244h f166505c = C89250i.m154773a((AbstractC89171a) new C74138f(this));

    /* renamed from: d */
    private final AbstractC89244h f166506d = C89250i.m154773a((AbstractC89171a) new C74135d(this));

    /* renamed from: e */
    private final AbstractC89244h f166507e = C89250i.m154773a((AbstractC89171a) new C74132a(this));

    /* renamed from: f */
    private final AbstractC89244h f166508f = C89250i.m154773a((AbstractC89171a) new C74136e(this));

    static {
        Covode.recordClassIndex(86890);
    }

    /* renamed from: c */
    private final View m130358c() {
        return (View) this.f166506d.getValue();
    }

    /* renamed from: d */
    private final View m130359d() {
        return (View) this.f166507e.getValue();
    }

    /* renamed from: a */
    public final View mo116595a() {
        return (View) this.f166505c.getValue();
    }

    /* renamed from: b */
    public final C23226a mo116597b() {
        return (C23226a) this.f166508f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a$a */
    static final class C74132a extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C74131a f166509a;

        static {
            Covode.recordClassIndex(86891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74132a(C74131a aVar) {
            super(0);
            this.f166509a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View findViewById = this.f166509a.mo116595a().findViewById(R.id.yg);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.view.View");
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a$d */
    static final class C74135d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C74131a f166514a;

        static {
            Covode.recordClassIndex(86894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74135d(C74131a aVar) {
            super(0);
            this.f166514a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View findViewById = this.f166514a.mo116595a().findViewById(R.id.zc);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.view.View");
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a$f */
    static final class C74138f extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C74131a f166517a;

        static {
            Covode.recordClassIndex(86897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74138f(C74131a aVar) {
            super(0);
            this.f166517a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return C1764a.m5927a(LayoutInflater.from(this.f166517a.f166504b), R.layout.adv, null, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a$e */
    static final class C74136e extends AbstractC89220m implements AbstractC89171a<C23226a> {

        /* renamed from: a */
        final /* synthetic */ C74131a f166515a;

        static {
            Covode.recordClassIndex(86895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74136e(C74131a aVar) {
            super(0);
            this.f166515a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23226a invoke() {
            C23226a.C23227a aVar = new C23226a.C23227a();
            View a = this.f166515a.mo116595a();
            C89219l.m154716b(a, "");
            return aVar.mo37816a(a).mo37819a(true).mo37815a(new DialogInterface.OnDismissListener(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.view.C74131a.C74136e.DialogInterface$OnDismissListenerC741371 */

                /* renamed from: a */
                final /* synthetic */ C74136e f166516a;

                static {
                    Covode.recordClassIndex(86896);
                }

                {
                    this.f166516a = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    AbstractC89171a<C89391z> aVar = this.f166516a.f166515a.f166503a;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
            }).f55057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a$b */
    static final class View$OnClickListenerC74133b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C74131a f166510a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f166511b;

        static {
            Covode.recordClassIndex(86892);
        }

        View$OnClickListenerC74133b(C74131a aVar, AbstractC89171a aVar2) {
            this.f166510a = aVar;
            this.f166511b = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f166511b.invoke();
            this.f166510a.mo116597b().dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.view.a$c */
    static final class View$OnClickListenerC74134c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C74131a f166512a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f166513b;

        static {
            Covode.recordClassIndex(86893);
        }

        View$OnClickListenerC74134c(C74131a aVar, AbstractC89171a aVar2) {
            this.f166512a = aVar;
            this.f166513b = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f166513b.invoke();
            this.f166512a.mo116597b().dismiss();
        }
    }

    public C74131a(ActivityC0218d dVar) {
        C89219l.m154721d(dVar, "");
        this.f166504b = dVar;
    }

    /* renamed from: a */
    public final void mo116596a(AbstractC89171a<C89391z> aVar, AbstractC89171a<C89391z> aVar2, AbstractC89171a<C89391z> aVar3) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f166503a = aVar3;
        m130358c().setOnClickListener(new View$OnClickListenerC74133b(this, aVar));
        m130359d().setOnClickListener(new View$OnClickListenerC74134c(this, aVar2));
        mo116597b().show(this.f166504b.getSupportFragmentManager(), "Auto-generated Captions");
    }
}
