package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.homepage.story.icon.C53117b;
import com.p2082ss.android.ugc.aweme.homepage.story.icon.C53174j;
import com.p2082ss.android.ugc.aweme.homepage.story.icon.X2CIconStory;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76681f;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.k */
public final class C22804k extends AbstractC22773c {

    /* renamed from: a */
    public final AbstractC18234b f53848a;

    static {
        Covode.recordClassIndex(26700);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final void mo37084a(View view) {
        C89219l.m154721d(view, "");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: c */
    public final int mo37087c() {
        return 8388627;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: d */
    public final boolean mo37095d() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final boolean mo37085a() {
        return C77260g.f173332a.mo120161i();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: b */
    public final View mo37086b() {
        ActivityC0945e activity;
        if (!C77260g.f173332a.mo120161i() || (activity = this.f53848a.getActivity()) == null) {
            return null;
        }
        C89219l.m154716b(activity, "");
        View a = ((X2CBaseInflate) C58221f.m105142a(new X2CIconStory())).mo67522a(activity, R.layout.a3p);
        AbstractC18234b bVar = this.f53848a;
        C12780d.m23005a(bVar, new C22805a(bVar, a));
        return a;
    }

    public C22804k(AbstractC18234b bVar) {
        C89219l.m154721d(bVar, "");
        this.f53848a = bVar;
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.k$a */
    static final class C22805a extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC18234b f53849a;

        /* renamed from: b */
        final /* synthetic */ View f53850b;

        static {
            Covode.recordClassIndex(26701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22805a(AbstractC18234b bVar, View view) {
            super(1);
            this.f53849a = bVar;
            this.f53850b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f53849a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.bytedance.tiktok.homepage.mainfragment.toolbar.C22804k.C22805a.C228061 */

                /* renamed from: a */
                final /* synthetic */ C22805a f53851a;

                static {
                    Covode.recordClassIndex(26702);
                }

                {
                    this.f53851a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    AbstractC89277c<? extends AbstractC12769a> a;
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f53851a.f53850b;
                    if (C76681f.m134256a()) {
                        a = C89204ab.m154669a(C53174j.class);
                    } else {
                        a = C89204ab.m154669a(C53117b.class);
                    }
                    qVar2.mo20632a(a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }
}
