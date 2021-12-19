package com.p2082ss.android.ugc.aweme.autoplay.p2348d;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.player.C34195d;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51059f;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.m */
public class C34169m implements AbstractC34146d {

    /* renamed from: i */
    public static final C34170a f80805i = new C34170a((byte) 0);

    /* renamed from: a */
    public boolean f80806a;

    /* renamed from: b */
    AbstractC34107a f80807b;

    /* renamed from: c */
    Aweme f80808c;

    /* renamed from: d */
    public AbstractView$OnAttachStateChangeListenerC34144b f80809d;

    /* renamed from: e */
    public final RecyclerView f80810e;

    /* renamed from: f */
    public final View f80811f;

    /* renamed from: g */
    public AbstractC51044b f80812g;

    /* renamed from: h */
    public AbstractC51043a f80813h;

    /* renamed from: j */
    private final AbstractC89244h f80814j;

    /* renamed from: k */
    private final AbstractC89244h f80815k;

    /* renamed from: l */
    private final boolean f80816l;

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.m$c */
    static final class C34173c extends AbstractC89220m implements AbstractC89171a<C51060g> {

        /* renamed from: a */
        final /* synthetic */ C34169m f80819a;

        static {
            Covode.recordClassIndex(41107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34173c(C34169m mVar) {
            super(0);
            this.f80819a = mVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.autoplay.d.m$c$a */
        public static final class C34174a implements AbstractC51059f {
            static {
                Covode.recordClassIndex(41108);
            }

            C34174a() {
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51060g invoke() {
            C51060g gVar = new C51060g(this.f80819a.f80810e, new C34174a(), this.f80819a);
            gVar.f117776g = new C34195d(this.f80819a.f80810e, gVar);
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(41103);
    }

    /* renamed from: a */
    public C51060g mo60497a() {
        return (C51060g) this.f80814j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    /* renamed from: g */
    public final AbstractC51043a mo60498g() {
        return (AbstractC51043a) this.f80815k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.m$a */
    public static final class C34170a {
        static {
            Covode.recordClassIndex(41104);
        }

        private C34170a() {
        }

        public /* synthetic */ C34170a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return this.f80810e;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.m$b */
    static final class C34171b extends AbstractC89220m implements AbstractC89171a<C341721> {

        /* renamed from: a */
        final /* synthetic */ C34169m f80817a;

        static {
            Covode.recordClassIndex(41105);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34171b(C34169m mVar) {
            super(0);
            this.f80817a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C341721 invoke() {
            return new AbstractC51043a(this) {
                /* class com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34169m.C34171b.C341721 */

                /* renamed from: a */
                final /* synthetic */ C34171b f80818a;

                static {
                    Covode.recordClassIndex(41106);
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: g */
                public final Fragment mo60503g() {
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: h */
                public final AbstractC84295k mo60504h() {
                    AbstractC51043a aVar = this.f80818a.f80817a.f80813h;
                    if (aVar != null) {
                        return aVar.mo60504h();
                    }
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: c */
                public final boolean mo60499c() {
                    AbstractC51043a aVar = this.f80818a.f80817a.f80813h;
                    if (aVar == null || !aVar.mo60499c() || !this.f80818a.f80817a.f80806a) {
                        return false;
                    }
                    return true;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: d */
                public final String mo60500d() {
                    String d;
                    AbstractC51043a aVar = this.f80818a.f80817a.f80813h;
                    if (aVar == null || (d = aVar.mo60500d()) == null) {
                        return "";
                    }
                    return d;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: e */
                public final boolean mo60501e() {
                    AbstractC51043a aVar = this.f80818a.f80817a.f80813h;
                    if (aVar == null || !aVar.mo60501e()) {
                        return false;
                    }
                    return true;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: f */
                public final Context mo60502f() {
                    Context f;
                    AbstractC51043a aVar = this.f80818a.f80817a.f80813h;
                    if (aVar != null && (f = aVar.mo60502f()) != null) {
                        return f;
                    }
                    Context context = this.f80818a.f80817a.f80811f.getContext();
                    C89219l.m154716b(context, "");
                    return context;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f80818a = r1;
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.m$d */
    public static final class RunnableC34175d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34169m f80820a;

        static {
            Covode.recordClassIndex(41109);
        }

        RunnableC34175d(C34169m mVar) {
            this.f80820a = mVar;
        }

        public final void run() {
            this.f80820a.mo60497a().mo86404i();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        AbstractC34107a aVar = this.f80807b;
        if (aVar != null) {
            return aVar.mo60406d();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g.AbstractC51062a
    /* renamed from: e */
    public boolean mo60483e() {
        if (!this.f80816l || !this.f80806a) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        if (this.f80816l) {
            this.f80806a = true;
        }
        C34727m.m70944a(new RunnableC34175d(this));
        AbstractC51044b bVar = this.f80812g;
        if (bVar != null) {
            bVar.mo60482a(this.f80808c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        if (this.f80816l) {
            this.f80806a = false;
        }
        mo60497a().mo86402g();
        AbstractC34107a aVar = this.f80807b;
        if (aVar != null) {
            aVar.mo60404b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
        if (this.f80816l) {
            this.f80806a = false;
        }
        mo60497a().mo86403h();
        AbstractC34107a aVar = this.f80807b;
        if (aVar != null) {
            aVar.mo60405c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
        if (this.f80816l) {
            this.f80806a = false;
        }
        mo60497a().mo86403h();
        AbstractC34107a aVar = this.f80807b;
        if (aVar != null) {
            aVar.mo60404b();
        }
    }

    public /* synthetic */ C34169m(RecyclerView recyclerView, View view, AbstractC51044b bVar, AbstractC51043a aVar) {
        this(recyclerView, view, bVar, aVar, true);
    }

    public C34169m(RecyclerView recyclerView, View view, AbstractC51044b bVar, AbstractC51043a aVar, boolean z) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(view, "");
        this.f80810e = recyclerView;
        this.f80811f = view;
        this.f80812g = bVar;
        this.f80813h = aVar;
        this.f80816l = true;
        this.f80806a = false;
        this.f80814j = C89250i.m154773a((AbstractC89171a) new C34173c(this));
        this.f80815k = C89250i.m154773a((AbstractC89171a) new C34171b(this));
    }
}
