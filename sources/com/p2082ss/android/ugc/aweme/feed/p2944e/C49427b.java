package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19193b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.p2082ss.android.ugc.aweme.feed.helper.C49615a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89377o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.e.b */
public final class C49427b implements AbstractC19173b {

    /* renamed from: a */
    public C49445o f113593a;

    static {
        Covode.recordClassIndex(58240);
    }

    /* renamed from: a */
    public final C49445o mo81055a() {
        C49445o oVar = this.f113593a;
        if (oVar == null) {
            C89219l.m154710a("playerController");
        }
        return oVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b
    /* renamed from: a */
    public final void mo30385a(AbstractC19193b<AbstractC19186f, C19169n> bVar) {
        C89219l.m154721d(bVar, "");
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.b$a */
    static final class C49428a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f113594a;

        /* renamed from: b */
        final /* synthetic */ C49427b f113595b;

        static {
            Covode.recordClassIndex(58241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49428a(C49427b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f113595b = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C49428a(this.f113595b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C49428a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f113594a == 0) {
                C89382r.m154942a(obj);
                this.f113595b.mo81055a().mo81163B();
                this.f113595b.mo81055a().mo81174M().mo123950y();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.b$b */
    static final class C49429b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f113596a;

        /* renamed from: b */
        final /* synthetic */ C49427b f113597b;

        static {
            Covode.recordClassIndex(58242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49429b(C49427b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f113597b = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C49429b(this.f113597b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C49429b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f113596a == 0) {
                C89382r.m154942a(obj);
                this.f113597b.mo81055a().mo81164C();
                this.f113597b.mo81055a().mo81174M().mo123950y();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b
    /* renamed from: a */
    public final void mo30386a(C19194c cVar) {
        String str;
        C49445o oVar = this.f113593a;
        if (oVar == null) {
            C89219l.m154710a("playerController");
        }
        Aweme z = oVar.mo81214z();
        C49445o oVar2 = this.f113593a;
        if (oVar2 == null) {
            C89219l.m154710a("playerController");
        }
        Aweme I = oVar2.mo81170I();
        C49445o oVar3 = this.f113593a;
        if (oVar3 == null) {
            C89219l.m154710a("playerController");
        }
        AbstractC49849am s = oVar3.mo81207s();
        if (s != null) {
            str = s.mo81096g(true);
        } else {
            str = null;
        }
        if (!(z == null || I == null || str == null)) {
            C49615a.m93037a(z, I, str, "click_audio_previous");
        }
        C49615a.f114164a = true;
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89652o.f203399a), null, null, new C49429b(this, null), 3);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b
    /* renamed from: b */
    public final void mo30393b(C19194c cVar) {
        String str;
        C49445o oVar = this.f113593a;
        if (oVar == null) {
            C89219l.m154710a("playerController");
        }
        Aweme I = oVar.mo81170I();
        C49445o oVar2 = this.f113593a;
        if (oVar2 == null) {
            C89219l.m154710a("playerController");
        }
        Aweme A = oVar2.mo81162A();
        C49445o oVar3 = this.f113593a;
        if (oVar3 == null) {
            C89219l.m154710a("playerController");
        }
        AbstractC49849am s = oVar3.mo81207s();
        if (s != null) {
            str = s.mo81096g(true);
        } else {
            str = null;
        }
        if (!(I == null || A == null || str == null)) {
            C49615a.m93037a(I, A, str, "click_audio_next");
        }
        C49615a.f114164a = true;
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89652o.f203399a), null, null, new C49428a(this, null), 3);
    }
}
