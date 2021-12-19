package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19164i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19168m;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49510c;
import com.p2082ss.android.ugc.aweme.feed.helper.C49615a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import java.util.Map;
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
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.feed.e.a */
public final class C49421a implements AbstractC19158c {

    /* renamed from: a */
    public C49445o f113578a;

    static {
        Covode.recordClassIndex(58234);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: d */
    public final long mo30396d() {
        return -1;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: e */
    public final long mo30398e() {
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a
    /* renamed from: a */
    public final void mo30373a() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19166k
    /* renamed from: g */
    public final C19194c mo30402g() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    /* renamed from: h */
    public final C49445o mo81049h() {
        C49445o oVar = this.f113578a;
        if (oVar == null) {
            C89219l.m154710a("playerController");
        }
        return oVar;
    }

    /* renamed from: i */
    public final boolean mo81050i() {
        if (this.f113578a != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: c */
    public final long mo30394c() {
        C49445o oVar = this.f113578a;
        if (oVar == null) {
            C89219l.m154710a("playerController");
        }
        AbstractC80747i M = oVar.mo81174M();
        C89219l.m154716b(M, "");
        return M.mo123891n();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: f */
    public final long mo30400f() {
        C49445o oVar = this.f113578a;
        if (oVar == null) {
            C89219l.m154710a("playerController");
        }
        AbstractC80747i M = oVar.mo81174M();
        C89219l.m154716b(M, "");
        return C89241a.m154731b((double) M.mo123886i());
    }

    /* renamed from: k */
    public final void mo81052k() {
        String str;
        if (mo81050i()) {
            C49445o oVar = this.f113578a;
            if (oVar == null) {
                C89219l.m154710a("playerController");
            }
            Aweme I = oVar.mo81170I();
            C49445o oVar2 = this.f113578a;
            if (oVar2 == null) {
                C89219l.m154710a("playerController");
            }
            AbstractC49849am s = oVar2.mo81207s();
            if (s != null) {
                str = s.mo81096g(true);
            } else {
                str = null;
            }
            C49615a.m93038a(I, str);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: b */
    public final EnumC19170o mo30387b() {
        C49445o oVar = this.f113578a;
        if (oVar == null) {
            C89219l.m154710a("playerController");
        }
        AbstractC80747i M = oVar.mo81174M();
        C89219l.m154716b(M, "");
        AbstractC81002f L = M.mo123918L();
        C89219l.m154716b(L, "");
        AbstractC81002f.AbstractC81005c j = L.mo124462j();
        C89219l.m154716b(j, "");
        switch (j.mo124470b()) {
            case 0:
                return EnumC19170o.PLAYBACK_STATE_PAUSED;
            case 1:
                return EnumC19170o.PLAYBACK_STATE_START;
            case 2:
                return EnumC19170o.PLAYBACK_STATE_START;
            case 3:
                return EnumC19170o.PLAYBACK_STATE_START;
            case 4:
                return EnumC19170o.PLAYBACK_STATE_PLAYING;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return EnumC19170o.PLAYBACK_STATE_PAUSED;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return EnumC19170o.PLAYBACK_STATE_PAUSED;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return EnumC19170o.PLAYBACK_STATE_STOPPED;
            default:
                return EnumC19170o.PLAYBACK_STATE_ERROR;
        }
    }

    /* renamed from: j */
    public final void mo81051j() {
        String str;
        if (mo81050i() && C49510c.m92748b()) {
            C49445o oVar = this.f113578a;
            if (oVar == null) {
                C89219l.m154710a("playerController");
            }
            Aweme I = oVar.mo81170I();
            C49445o oVar2 = this.f113578a;
            if (oVar2 == null) {
                C89219l.m154710a("playerController");
            }
            AbstractC49849am s = oVar2.mo81207s();
            if (s != null) {
                str = s.mo81096g(true);
            } else {
                str = null;
            }
            if (I != null && str != null && C49510c.m92748b() && C49615a.m93041a(I)) {
                C49615a.m93039a(I, str, "enter_background");
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: e */
    public final void mo30399e(C19194c cVar) {
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89652o.f203399a), null, null, new C49424c(this, null), 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.a$a */
    static final class C49422a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f113579a;

        /* renamed from: b */
        final /* synthetic */ C49421a f113580b;

        static {
            Covode.recordClassIndex(58235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49422a(C49421a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f113580b = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C49422a(this.f113580b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C49422a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f113579a == 0) {
                C89382r.m154942a(obj);
                if (this.f113580b.mo81050i()) {
                    this.f113580b.mo81049h().mo81174M().mo123908B();
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.a$b */
    static final class C49423b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f113581a;

        /* renamed from: b */
        final /* synthetic */ C49421a f113582b;

        static {
            Covode.recordClassIndex(58236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49423b(C49421a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f113582b = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C49423b(this.f113582b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C49423b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f113581a == 0) {
                C89382r.m154942a(obj);
                if (this.f113582b.mo81050i()) {
                    this.f113582b.mo81049h().mo81174M().mo123950y();
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.a$c */
    static final class C49424c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f113583a;

        /* renamed from: b */
        final /* synthetic */ C49421a f113584b;

        static {
            Covode.recordClassIndex(58237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49424c(C49421a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f113584b = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C49424c(this.f113584b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C49424c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f113583a == 0) {
                C89382r.m154942a(obj);
                if (this.f113584b.mo81050i()) {
                    this.f113584b.mo81049h().mo81174M().mo123950y();
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19165j
    /* renamed from: a */
    public final void mo30377a(AbstractC19164i iVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(iVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: f */
    public final void mo30401f(C19194c cVar) {
        if (mo81050i()) {
            C49445o oVar = this.f113578a;
            if (oVar == null) {
                C89219l.m154710a("playerController");
            }
            oVar.mo81174M().mo123951z();
            mo81052k();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: a */
    public final void mo30378a(C19169n nVar) {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: c */
    public final void mo30395c(C19194c cVar) {
        String str;
        if (mo81050i()) {
            C49445o oVar = this.f113578a;
            if (oVar == null) {
                C89219l.m154710a("playerController");
            }
            Aweme I = oVar.mo81170I();
            C49445o oVar2 = this.f113578a;
            if (oVar2 == null) {
                C89219l.m154710a("playerController");
            }
            AbstractC49849am s = oVar2.mo81207s();
            if (s != null) {
                str = s.mo81096g(true);
            } else {
                str = null;
            }
            C49615a.m93036a();
            if (!(I == null || str == null)) {
                C49615a.m93040a(I, str, "click_audio_play", (Map<String, String>) null);
            }
            if (C17873f.f42636l && !C49510c.m92748b()) {
                C49615a.f114164a = true;
            }
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89652o.f203399a), null, null, new C49423b(this, null), 3);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: d */
    public final void mo30397d(C19194c cVar) {
        String str;
        String str2;
        if (mo81050i()) {
            if (!(cVar == null || (str = cVar.f45337a) == null)) {
                int hashCode = str.hashCode();
                if (hashCode != 270608360) {
                    if (hashCode == 1836520147) {
                        str.equals("PAUSE_FROM_LOSS_FOCUS_TRANSIENT");
                    } else if (hashCode == 2062106709 && str.equals("PAUSE_FROM_MEDIA_SESSION_CALLBACK")) {
                        C49445o oVar = this.f113578a;
                        if (oVar == null) {
                            C89219l.m154710a("playerController");
                        }
                        Aweme I = oVar.mo81170I();
                        C49445o oVar2 = this.f113578a;
                        if (oVar2 == null) {
                            C89219l.m154710a("playerController");
                        }
                        AbstractC49849am s = oVar2.mo81207s();
                        if (s != null) {
                            str2 = s.mo81096g(true);
                        } else {
                            str2 = null;
                        }
                        if (!(I == null || str2 == null)) {
                            C49615a.m93040a(I, str2, "click_audio_pause", (Map<String, String>) null);
                        }
                        mo81052k();
                    }
                } else if (str.equals("PAUSE_FROM_LOSS_FOCUS")) {
                    mo81052k();
                }
            }
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89652o.f203399a), null, null, new C49422a(this, null), 3);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: a */
    public final void mo30374a(long j, AbstractC19168m mVar) {
        if (mo81050i()) {
            C49445o oVar = this.f113578a;
            if (oVar == null) {
                C89219l.m154710a("playerController");
            }
            oVar.mo81174M().mo123931a((((float) j) / -1.0f) * 100.0f);
        }
    }
}
