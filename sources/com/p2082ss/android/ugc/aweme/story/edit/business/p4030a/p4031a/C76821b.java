package com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.p4031a;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20525o;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71532y;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.DialogC74290k;
import com.p2082ss.android.ugc.aweme.story.base.p4021b.C76615b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.AbstractC77135b;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.C77134a;
import com.p2082ss.android.ugc.aweme.story.edit.clip.impl.VEEditClipCluster;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82018a;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82034aa;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.gamora.editor.C82299l;
import com.p2082ss.android.ugc.gamora.editor.C82468o;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83076b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b */
public final class C76821b extends C82617c implements AbstractC77135b {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f172413b = {new C89232y(C76821b.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C76821b.class, "editCompileCallback", "getEditCompileCallback()Lcom/ss/android/ugc/gamora/editor/IEditCompileCallback;", 0), new C89232y(C76821b.class, "clipCluster", "getClipCluster()Lcom/ss/android/ugc/aweme/story/edit/clip/impl/VEEditClipCluster;", 0)};

    /* renamed from: f */
    public static final C76824c f172414f = new C76824c((byte) 0);

    /* renamed from: Q */
    private final AbstractC89248d f172415Q;

    /* renamed from: R */
    private final AbstractC89244h f172416R;

    /* renamed from: S */
    private final AbstractC89248d f172417S;

    /* renamed from: T */
    private final AbstractC89248d f172418T;

    /* renamed from: U */
    private final C76830i f172419U;

    /* renamed from: V */
    private final AbstractC89244h f172420V;

    /* renamed from: c */
    DialogC74290k f172421c;

    /* renamed from: d */
    final AbstractC89244h f172422d = C89250i.m154774a(EnumC89331m.NONE, new C76823b(this));

    /* renamed from: e */
    public final Runnable f172423e;

    static {
        Covode.recordClassIndex(89817);
    }

    /* renamed from: ak */
    private final VideoPublishEditModel m134438ak() {
        return (VideoPublishEditModel) this.f172415Q.mo23374a(this, f172413b[0]);
    }

    /* renamed from: al */
    private final EditStickerViewModel m134439al() {
        return (EditStickerViewModel) this.f172416R.getValue();
    }

    /* renamed from: am */
    private final AbstractC82035ab m134440am() {
        return (AbstractC82035ab) this.f172417S.mo23374a(this, f172413b[1]);
    }

    /* renamed from: F */
    public final SafeHandler mo120457F() {
        return (SafeHandler) this.f172420V.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b$c */
    public static final class C76824c {
        static {
            Covode.recordClassIndex(89820);
        }

        private C76824c() {
        }

        public /* synthetic */ C76824c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b$e */
    static final class C76826e extends AbstractC89220m implements AbstractC89171a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C76821b f172432a;

        static {
            Covode.recordClassIndex(89822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76826e(C76821b bVar) {
            super(0);
            this.f172432a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.f172432a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b$b */
    public static final class C76823b extends AbstractC89220m implements AbstractC89171a<AbstractC46036a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172427a;

        static {
            Covode.recordClassIndex(89819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76823b(AbstractC21566a aVar) {
            super(0);
            this.f172427a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.editSticker.text.als.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172427a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.editSticker.text.als.a> r1 = com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.p4031a.C76821b.C76823b.invoke():com.bytedance.als.b");
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.story.edit.clip.a.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77117a
    public final /* synthetic */ VEEditClipCluster cF_() {
        return (VEEditClipCluster) this.f172418T.mo23374a(this, f172413b[2]);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        mo120458G();
        mo120457F().removeCallbacks(this.f172423e);
    }

    /* renamed from: G */
    public final void mo120458G() {
        try {
            DialogC74290k kVar = this.f172421c;
            if (kVar != null && kVar.isShowing()) {
                kVar.dismiss();
            }
            this.f172421c = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b$h */
    static final class RunnableC76829h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C76821b f172435a;

        static {
            Covode.recordClassIndex(89825);
        }

        RunnableC76829h(C76821b bVar) {
            this.f172435a = bVar;
        }

        public final void run() {
            if (this.f172435a.f52549m != null) {
                Activity activity = this.f172435a.f52549m;
                if (activity == null || !activity.isFinishing()) {
                    C76821b bVar = this.f172435a;
                    bVar.mo120458G();
                    try {
                        Activity t = bVar.mo36486t();
                        C89219l.m154716b(t, "");
                        DialogC74290k kVar = new DialogC74290k(t);
                        kVar.show();
                        bVar.f172421c = kVar;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b$a */
    public static final class C76822a extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f172424a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f172425b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f172426c;

        static {
            Covode.recordClassIndex(89818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76822a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f172424a = jVar;
            this.f172425b = cVar;
            this.f172426c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f172424a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f172426c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f172426c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f172425b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m134446xa2c070fe(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f172424a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f172425b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m134446xa2c070fe(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.p4031a.C76821b.C76822a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_story_edit_business_isolate_sticker_StoryEditStickerScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m134446xa2c070fe(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b$i */
    public static final class C76830i implements AbstractC89172b<String, String> {

        /* renamed from: a */
        final /* synthetic */ C76821b f172436a;

        static {
            Covode.recordClassIndex(89826);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76830i(C76821b bVar) {
            this.f172436a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(String str) {
            C89219l.m154721d(str, "");
            StoryEditClipModel d = C77134a.m134739d(this.f172436a);
            if (d == null) {
                return "";
            }
            String a = C76615b.m134199a(d.getSessionId(), "sticker_cache/".concat(String.valueOf(str)));
            d.getStickerCacheDirMap().put(str, a);
            return a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        selectNonNullSubscribe(m134439al(), C76831c.f172437a, new C20370ah(), new C76827f(this));
        selectNonNullSubscribe(m134439al(), C76832d.f172438a, new C20370ah(), new C76828g(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b$d */
    public static final class C76825d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C76821b f172428a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f172429b;

        /* renamed from: c */
        final /* synthetic */ long f172430c;

        /* renamed from: d */
        final /* synthetic */ boolean f172431d;

        static {
            Covode.recordClassIndex(89821);
        }

        C76825d(C76821b bVar, AbstractC89171a aVar, long j, boolean z) {
            this.f172428a = bVar;
            this.f172429b = aVar;
            this.f172430c = j;
            this.f172431d = z;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            this.f172428a.mo120457F().removeCallbacks(this.f172428a.f172423e);
            this.f172428a.mo120458G();
            this.f172428a.mo127712a(false);
            this.f172428a.mo127721ai();
            this.f172429b.invoke();
            C84911q.m145921a("EditSticker,compile sticker finish,time cost:" + (System.currentTimeMillis() - this.f172430c) + ",needExpand:" + this.f172431d);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76821b(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
        this.f172415Q = C21572a.m40504a(fVar, VideoPublishEditModel.class);
        AbstractC89277c a = C89204ab.m154669a(EditStickerViewModel.class);
        this.f172416R = C89250i.m154773a((AbstractC89171a) new C76822a(this, a, a));
        this.f172417S = C21572a.m40504a(fVar, AbstractC82035ab.class);
        this.f172418T = C21572a.m40504a(fVar, VEEditClipCluster.class);
        this.f172419U = new C76830i(this);
        this.f172423e = new RunnableC76829h(this);
        this.f172420V = C89250i.m154773a((AbstractC89171a) new C76826e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b$f */
    static final class C76827f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76821b f172433a;

        static {
            Covode.recordClassIndex(89823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76827f(C76821b bVar) {
            super(2);
            this.f172433a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20521k kVar) {
            C20521k kVar2 = kVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(kVar2, "");
            AbstractC46036a aVar = (AbstractC46036a) this.f172433a.f172422d.getValue();
            if (aVar != null) {
                aVar.mo77628e(kVar2.f48283b.booleanValue());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.a.a.b$g */
    static final class C76828g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20525o<Boolean, Boolean, AbstractC89171a<? extends C89391z>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76821b f172434a;

        static {
            Covode.recordClassIndex(89824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76828g(C76821b bVar) {
            super(2);
            this.f172434a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20525o<Boolean, Boolean, AbstractC89171a<? extends C89391z>> oVar) {
            C20525o<Boolean, Boolean, AbstractC89171a<? extends C89391z>> oVar2 = oVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(oVar2, "");
            T t = oVar2.f48283b;
            this.f172434a.mo120459a(((Boolean) t.getFirst()).booleanValue(), ((Boolean) t.getSecond()).booleanValue(), (AbstractC89171a) t.getThird());
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo120459a(boolean z, boolean z2, AbstractC89171a<C89391z> aVar) {
        C45995c a;
        String str;
        String effectId;
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC46036a aVar2 = this.f184754M;
        if (aVar2 != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            List<C46239q> r = aVar2.mo77643r();
            int size = r.size();
            for (int i = 0; i < size; i++) {
                TextStickerData data = r.get(i).getData();
                if (!(data == null || (a = C45989b.m88764a().mo77588a(data.getFontType())) == null)) {
                    if (a.f107118b == null) {
                        str = "";
                    } else {
                        str = a.f107118b;
                    }
                    sb.append(str);
                    if (a.f107125i == null) {
                        effectId = "";
                    } else {
                        effectId = a.f107125i.getEffectId();
                    }
                    sb2.append(effectId);
                    if (i != r.size() - 1) {
                        sb.append(",");
                        sb2.append(",");
                    }
                }
            }
            m134438ak().textTypes = sb.toString();
            m134438ak().textEffectIds = sb2.toString();
        } else {
            m134438ak().textTypes = "";
            m134438ak().textEffectIds = "";
        }
        AbstractC31071f b = C77134a.m134737b(this);
        if (b != null) {
            AbstractC70977bq T = mo127705Y().mo87631T();
            AbstractC45898d[] dVarArr = new AbstractC45898d[9];
            dVarArr[0] = mo127706Z().mo127928h();
            AbstractC46036a aVar3 = this.f184754M;
            dVarArr[1] = aVar3 != null ? aVar3.mo77642q() : null;
            dVarArr[2] = mo127697Q().mo128028i();
            dVarArr[3] = mo127698R().mo127958c();
            AbstractC82034aa aaVar = this.f184780k;
            dVarArr[4] = aaVar != null ? aaVar.mo127261L() : null;
            AbstractC82791h hVar = ((C82617c) this).f184778i;
            dVarArr[5] = hVar != null ? hVar.mo127756K() : null;
            C82468o oVar = this.f184782t;
            dVarArr[6] = oVar != null ? ((AbstractC82018a) oVar).f183561b : null;
            C82299l lVar = this.f184783u;
            dVarArr[7] = lVar != null ? ((AbstractC82018a) lVar).f183561b : null;
            C83076b bVar = this.f184784v;
            dVarArr[8] = bVar != null ? bVar.mo128177C() : null;
            boolean a2 = C71532y.m126437a(b, T, dVarArr);
            mo127705Y().mo87631T().mo112108a(a2, false);
            mo127712a(true);
            ArrayList arrayList = new ArrayList();
            if (z2) {
                arrayList.add(mo87917b(b, m134440am(), this.f172419U));
            }
            if (z) {
                View view = this.f52550n;
                C89219l.m154716b(view, "");
                view.setVisibility(4);
            }
            arrayList.add(mo87915a(b, m134440am(), this.f172419U));
            C1731i<Void> b2 = C1731i.m5638b((Collection<? extends C1731i<?>>) arrayList);
            C89219l.m154716b(b2, "");
            if (!b2.mo5535a()) {
                mo120457F().postDelayed(this.f172423e, 500);
            }
            b2.mo5534a(new C76825d(this, aVar, currentTimeMillis, a2), C1731i.f5564c, null);
        }
    }
}
