package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4038e.p4039a;

import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a;
import com.p2082ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a */
public final class C76969a extends AbstractC23520b<EditStickerPanelViewModel> implements AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172695a = {new C89232y(C76969a.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/story/edit/preview/StoryEditPreviewApi;", 0), new C89232y(C76969a.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0)};

    /* renamed from: b */
    private final AbstractC89244h f172696b = C89250i.m154773a((AbstractC89171a) new C76973c(this));

    /* renamed from: c */
    private final AbstractC89171a<EditStickerPanelViewModel> f172697c = new C76974d(this);

    /* renamed from: d */
    private final AbstractC89248d f172698d = C21572a.m40504a(getDiContainer(), AbstractC76760e.class);

    /* renamed from: e */
    private final AbstractC89248d f172699e = new C76970a(this);

    /* renamed from: f */
    private final C21582f f172700f;

    /* renamed from: k */
    private final AbstractC22186b f172701k;

    /* renamed from: l */
    private final int f172702l = R.id.c7m;

    static {
        Covode.recordClassIndex(89965);
    }

    /* renamed from: a */
    public final C76975b mo120518a() {
        return (C76975b) this.f172696b.getValue();
    }

    /* renamed from: f */
    public final AbstractC82610a mo120519f() {
        return (AbstractC82610a) this.f172699e.mo23374a(this, f172695a[1]);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditStickerPanelViewModel> mo23031b() {
        return this.f172697c;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f172701k;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172700f;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a$c */
    static final class C76973c extends AbstractC89220m implements AbstractC89171a<C76975b> {

        /* renamed from: a */
        final /* synthetic */ C76969a f172706a;

        static {
            Covode.recordClassIndex(89969);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76973c(C76969a aVar) {
            super(0);
            this.f172706a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76975b invoke() {
            return new C76975b(this.f172706a.getDiContainer());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a$d */
    static final class C76974d extends AbstractC89220m implements AbstractC89171a<EditStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ C76969a f172707a;

        static {
            Covode.recordClassIndex(89970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76974d(C76969a aVar) {
            super(0);
            this.f172707a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditStickerPanelViewModel invoke() {
            return new EditStickerPanelViewModel(this.f172707a.mo120518a());
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f172701k.mo36421f(mo120518a())) {
            this.f172701k.mo36387a(this.f172702l, mo120518a(), "EditStickerPanelScene");
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        ((AbstractC76760e) this.f172698d.mo23374a(this, f172695a[0])).mo114816e().observe(this, new C76971b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a$a */
    public static final class C76970a implements AbstractC89248d<Object, AbstractC82610a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172703a;

        static {
            Covode.recordClassIndex(89966);
        }

        public C76970a(AbstractC21566a aVar) {
            this.f172703a = aVar;
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
                com.bytedance.o.a r0 = r2.f172703a
                com.ss.android.ugc.aweme.story.edit.business.a.b r1 = com.p2082ss.android.ugc.aweme.story.edit.business.p4030a.C76814a.m134431a(r0)
                if (r1 == 0) goto L_0x0017
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r0 = com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a.class
                java.lang.Object r0 = r1.mo120461a(r0)
                return r0
            L_0x0017:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4038e.p4039a.C76969a.C76970a.mo23374a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.e.a.a$b */
    static final class C76971b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C76969a f172704a;

        static {
            Covode.recordClassIndex(89967);
        }

        C76971b(C76969a aVar) {
            this.f172704a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ((EditStickerPanelViewModel) this.f172704a.getApiComponent()).mo127986a();
            ((EditStickerPanelViewModel) this.f172704a.getApiComponent()).mo127987a(new AbstractC56722g(this) {
                /* class com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4038e.p4039a.C76969a.C76971b.C769721 */

                /* renamed from: a */
                final /* synthetic */ C76971b f172705a;

                static {
                    Covode.recordClassIndex(89968);
                }

                @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
                /* renamed from: L */
                public final void mo87911L() {
                    AbstractC82610a f = this.f172705a.f172704a.mo120519f();
                    if (f != null) {
                        f.mo127681c();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
                /* renamed from: M */
                public final void mo87912M() {
                    AbstractC82610a f = this.f172705a.f172704a.mo120519f();
                    if (f != null) {
                        f.mo127682e();
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f172705a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
                /* renamed from: a */
                public final void mo87916a(Effect effect, String str) {
                    C89219l.m154721d(effect, "");
                    AbstractC82610a f = this.f172705a.f172704a.mo120519f();
                    if (f != null) {
                        f.mo127673a(effect, str);
                    }
                }
            });
        }
    }

    public C76969a(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f172700f = fVar;
        this.f172701k = bVar;
    }
}
