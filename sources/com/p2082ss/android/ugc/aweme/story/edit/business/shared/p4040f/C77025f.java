package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f;

import android.app.Activity;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.publish.C65504a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72479d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClip;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.C77118b;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.concurrent.Callable;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f */
public final class C77025f extends AbstractC2562j<AbstractC77024e> implements AbstractC21566a, AbstractC77024e {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172810a = {new C89232y(C77025f.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0), new C89232y(C77025f.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/story/edit/model/StoryEditModel;", 0), new C89232y(C77025f.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0)};

    /* renamed from: f */
    public static final C77028c f172811f = new C77028c((byte) 0);

    /* renamed from: b */
    public final AbstractC77024e f172812b = this;

    /* renamed from: c */
    final C2559g<AbstractC77041g> f172813c = new C2563k();

    /* renamed from: d */
    final AbstractC89248d f172814d = new C77027b(this);

    /* renamed from: e */
    final AbstractC89244h f172815e = C89250i.m154774a(EnumC89331m.NONE, new C77026a(this));

    /* renamed from: g */
    private final AbstractC89248d f172816g = C21572a.m40504a(getDiContainer(), VEEditClipCluster.class);

    /* renamed from: h */
    private final AbstractC89248d f172817h = C21572a.m40504a(getDiContainer(), StoryEditModel.class);

    /* renamed from: i */
    private final AbstractC89244h f172818i = C89250i.m154773a((AbstractC89171a) new C77029d(this));

    /* renamed from: j */
    private final C21582f f172819j;

    static {
        Covode.recordClassIndex(90024);
    }

    /* renamed from: c */
    public final VEEditClipCluster mo120564c() {
        return (VEEditClipCluster) this.f172816g.mo23374a(this, f172810a[0]);
    }

    /* renamed from: d */
    public final StoryEditModel mo120565d() {
        return (StoryEditModel) this.f172817h.mo23374a(this, f172810a[1]);
    }

    /* renamed from: e */
    public final C77010b mo120566e() {
        return (C77010b) this.f172818i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$c */
    public static final class C77028c {
        static {
            Covode.recordClassIndex(90027);
        }

        private C77028c() {
        }

        public /* synthetic */ C77028c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$h */
    public static final class C77035h extends AbstractC72639k {
        static {
            Covode.recordClassIndex(90034);
        }

        C77035h() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onFinish(AbstractC72623d dVar, Object obj) {
            C89219l.m154721d(dVar, "");
            if (dVar instanceof AbstractC72623d.C72626c) {
                C72479d.m127866a(C72477c.f162474a).mo114743e();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.AbstractC77024e
    /* renamed from: b */
    public final C2559g<AbstractC77041g> mo120563b() {
        return this.f172813c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC77024e getApiComponent() {
        return this.f172812b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172819j;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$g */
    public static final class C77034g implements AbstractC63269z.AbstractC63270a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f172828a;

        static {
            Covode.recordClassIndex(90033);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
        /* renamed from: b */
        public final void mo59544b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
        /* renamed from: a */
        public final void mo59543a() {
            this.f172828a.invoke();
        }

        C77034g(AbstractC89171a aVar) {
            this.f172828a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$a */
    public static final class C77026a extends AbstractC89220m implements AbstractC89171a<AbstractC76760e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172820a;

        static {
            Covode.recordClassIndex(90025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77026a(AbstractC21566a aVar) {
            super(0);
            this.f172820a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172820a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.C77025f.C77026a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$d */
    static final class C77029d extends AbstractC89220m implements AbstractC89171a<C77010b> {

        /* renamed from: a */
        final /* synthetic */ C77025f f172822a;

        static {
            Covode.recordClassIndex(90028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77029d(C77025f fVar) {
            super(0);
            this.f172822a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C77010b invoke() {
            AbstractC31071f fVar;
            Activity b = C2556g.m7473b(this.f172822a);
            VEEditClip vEEditClip = (VEEditClip) C77118b.m134706a(this.f172822a.mo120564c());
            if (vEEditClip != null) {
                fVar = C77134a.m134735a(vEEditClip);
            } else {
                fVar = null;
            }
            return new C77010b(b, fVar, (AbstractC76760e) this.f172822a.f172815e.getValue(), new C65504a(true, C770301.f172823a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$e */
    static final class CallableC77031e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C77025f f172824a;

        /* renamed from: b */
        final /* synthetic */ C1743j f172825b;

        static {
            Covode.recordClassIndex(90030);
        }

        CallableC77031e(C77025f fVar, C1743j jVar) {
            this.f172824a = fVar;
            this.f172825b = jVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C77025f fVar = this.f172824a;
            AbstractC82610a aVar = (AbstractC82610a) fVar.f172814d.mo23374a(fVar, C77025f.f172810a[2]);
            if (aVar == null) {
                return Boolean.valueOf(this.f172825b.mo5555a(C89391z.f203057a));
            }
            aVar.mo127678a(false, (AbstractC89171a<C89391z>) new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.C77025f.CallableC77031e.C770321 */

                /* renamed from: a */
                final /* synthetic */ CallableC77031e f172826a;

                static {
                    Covode.recordClassIndex(90031);
                }

                {
                    this.f172826a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f172826a.f172825b.mo5555a(C89391z.f203057a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$j */
    static final class C77039j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77025f f172844a;

        static {
            Covode.recordClassIndex(90038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77039j(C77025f fVar) {
            super(0);
            this.f172844a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C77025f fVar = this.f172844a;
            C770401 r4 = new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.C77025f.C77039j.C770401 */

                /* renamed from: a */
                final /* synthetic */ C77039j f172845a;

                static {
                    Covode.recordClassIndex(90039);
                }

                {
                    this.f172845a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C77036i(this.f172845a.f172844a, null), 3);
                    return C89391z.f203057a;
                }
            };
            C1743j jVar = new C1743j();
            C1731i.m5640b(new CallableC77031e(fVar, jVar), C1731i.f5563b);
            C1731i<TResult> iVar = jVar.f5610a;
            C89219l.m154716b(iVar, "");
            C1731i.m5638b((Collection<? extends C1731i<?>>) C89070n.m154522b(iVar, fVar.mo120566e().mo120550a())).mo5534a(new C77033f(r4), C1731i.f5564c, null);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.AbstractC77024e
    /* renamed from: a */
    public final void mo120562a() {
        C77039j jVar = new C77039j(this);
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            C84911q.m145926b("story publish in children mode is not allowed");
        } else if (!C63244g.m114602a().mo73255A().mo93903b()) {
            C85041d.m146229c(C63247i.f143610a, R.string.g5h).mo129984b();
            C63244g.m114602a().mo73255A().mo93897a(C2556g.m7473b(this), "video_edit_page", "click_shoot", null, new C77034g(jVar));
        } else {
            jVar.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$b */
    public static final class C77027b implements AbstractC89248d<Object, AbstractC82610a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172821a;

        static {
            Covode.recordClassIndex(90026);
        }

        public C77027b(AbstractC21566a aVar) {
            this.f172821a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.gamora.editor.sticker.core.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a mo23374a(java.lang.Object r3, p4600h.p4620k.AbstractC89286i<?> r4) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
                p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
                com.bytedance.o.a r0 = r2.f172821a
                com.ss.android.ugc.aweme.story.edit.business.a.b r1 = com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.C76814a.m134431a(r0)
                if (r1 == 0) goto L_0x0017
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r0 = com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a.class
                java.lang.Object r0 = r1.mo120461a(r0)
                return r0
            L_0x0017:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.C77025f.C77027b.mo23374a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$f */
    static final class C77033f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f172827a;

        static {
            Covode.recordClassIndex(90032);
        }

        C77033f(AbstractC89171a aVar) {
            this.f172827a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            this.f172827a.invoke();
            return C89391z.f203057a;
        }
    }

    public C77025f(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172819j = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.f$i */
    public static final class C77036i extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f172829a;

        /* renamed from: b */
        Object f172830b;

        /* renamed from: c */
        Object f172831c;

        /* renamed from: d */
        Object f172832d;

        /* renamed from: e */
        Object f172833e;

        /* renamed from: f */
        Object f172834f;

        /* renamed from: g */
        Object f172835g;

        /* renamed from: h */
        int f172836h;

        /* renamed from: i */
        int f172837i;

        /* renamed from: j */
        int f172838j;

        /* renamed from: k */
        final /* synthetic */ C77025f f172839k;

        static {
            Covode.recordClassIndex(90035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77036i(C77025f fVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f172839k = fVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C77036i(this.f172839k, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C77036i) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0129 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
            // Method dump skipped, instructions count: 306
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f.C77025f.C77036i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
