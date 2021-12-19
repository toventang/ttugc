package com.p2082ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.editSticker.compile.C45859b;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.C71299a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerEditingLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71276a;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.List;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.editor.l */
public final class C82299l extends AbstractC82018a<C80735b> {

    /* renamed from: e */
    static final /* synthetic */ AbstractC89286i[] f184099e = {new C89232y(C82299l.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: f */
    public static final C82300a f184100f = new C82300a((byte) 0);

    /* renamed from: g */
    private EditHashTagStickerViewModel f184101g;

    /* renamed from: h */
    private final AbstractC89248d f184102h = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: i */
    private final AbstractC89244h f184103i = C89250i.m154773a((AbstractC89171a) new C82301b(this));

    static {
        Covode.recordClassIndex(96133);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82018a
    /* renamed from: C */
    public final int mo127229C() {
        return 9;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.l$a */
    public static final class C82300a {
        static {
            Covode.recordClassIndex(96134);
        }

        private C82300a() {
        }

        public /* synthetic */ C82300a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82018a
    /* renamed from: D */
    public final void mo127230D() {
        ((AbstractC82018a) this).f183561b.mo112708a((HashTagStickerEditingLayout) this.f184103i.getValue());
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82018a
    /* renamed from: d */
    public final AbstractC71276a<C80735b> mo127250d() {
        return new C71299a(mo127248b());
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82018a
    /* renamed from: E */
    public final void mo127231E() {
        super.mo127231E();
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditHashTagStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f184101g = (EditHashTagStickerViewModel) a;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82018a
    /* renamed from: F */
    public final void mo127232F() {
        super.mo127232F();
        EditHashTagStickerViewModel editHashTagStickerViewModel = this.f184101g;
        if (editHashTagStickerViewModel == null) {
            C89219l.m154710a("editHashTagStickerViewModel");
        }
        editHashTagStickerViewModel.mo127213a().observe(this, new C82303d(this));
        EditHashTagStickerViewModel editHashTagStickerViewModel2 = this.f184101g;
        if (editHashTagStickerViewModel2 == null) {
            C89219l.m154710a("editHashTagStickerViewModel");
        }
        selectNonNullSubscribe(editHashTagStickerViewModel2, C82400m.f184314a, new C20370ah(), new C82304e(this));
        EditHashTagStickerViewModel editHashTagStickerViewModel3 = this.f184101g;
        if (editHashTagStickerViewModel3 == null) {
            C89219l.m154710a("editHashTagStickerViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editHashTagStickerViewModel3, C82467n.f184437a, new C82305f(this));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.l$b */
    static final class C82301b extends AbstractC89220m implements AbstractC89171a<HashTagStickerEditingLayout> {

        /* renamed from: a */
        final /* synthetic */ C82299l f184104a;

        static {
            Covode.recordClassIndex(96135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82301b(C82299l lVar) {
            super(0);
            this.f184104a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashTagStickerEditingLayout invoke() {
            MethodCollector.m26663i(11668);
            C82299l lVar = this.f184104a;
            if (lVar.f52551o != null) {
                AbstractC22219j jVar = lVar.f52551o;
                if (jVar == null) {
                    C89219l.m154715b();
                }
                View inflate = ((ViewStub) jVar.mo36475c(R.id.fg5)).inflate();
                if (inflate != null) {
                    HashTagStickerEditingLayout hashTagStickerEditingLayout = (HashTagStickerEditingLayout) inflate;
                    hashTagStickerEditingLayout.setModel(lVar.mo127248b());
                    View findViewById = hashTagStickerEditingLayout.findViewById(R.id.ey8);
                    if (findViewById != null) {
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.topMargin = C33398a.f79357a.mo59453d();
                            findViewById.requestLayout();
                        }
                    }
                    MethodCollector.m26664o(11668);
                    return hashTagStickerEditingLayout;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.HashTagStickerEditingLayout");
                MethodCollector.m26664o(11668);
                throw nullPointerException;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Parent Scene is null".toString());
            MethodCollector.m26664o(11668);
            throw illegalStateException;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.l$d */
    static final class C82303d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82299l f184108a;

        static {
            Covode.recordClassIndex(96137);
        }

        C82303d(C82299l lVar) {
            this.f184108a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                ((AbstractC82018a) this.f184108a).f183561b.mo112305a(f.floatValue());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82299l(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.l$c */
    static final class C82302c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C82299l f184105a;

        /* renamed from: b */
        final /* synthetic */ AbstractC31071f f184106b;

        /* renamed from: c */
        final /* synthetic */ AbstractC82035ab f184107c;

        static {
            Covode.recordClassIndex(96136);
        }

        C82302c(C82299l lVar, AbstractC31071f fVar, AbstractC82035ab abVar) {
            this.f184105a = lVar;
            this.f184106b = fVar;
            this.f184107c = abVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            for (C45859b bVar : (List) iVar.mo5545d()) {
                StickerItemModel stickerItemModel = new StickerItemModel(((AbstractC82018a) this.f184105a).f183561b.f159747a, bVar.stickerPath, "", bVar.index, false, 0, this.f184106b.mo56368j(), 9);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = bVar.viewHash;
                this.f184107c.mo87638a(stickerItemModel);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.l$e */
    static final class C82304e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82299l f184109a;

        static {
            Covode.recordClassIndex(96138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82304e(C82299l lVar) {
            super(2);
            this.f184109a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f184109a.mo127247a(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.l$f */
    static final class C82305f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82299l f184110a;

        static {
            Covode.recordClassIndex(96139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82305f(C82299l lVar) {
            super(2);
            this.f184110a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            ((AbstractC82018a) this.f184110a).f183561b.mo112324n();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.AbstractC82581b
    /* renamed from: a */
    public final C1731i<C89391z> mo127435a(AbstractC31071f fVar, AbstractC82035ab abVar, AbstractC89172b<? super String, String> bVar) {
        String str;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(abVar, "");
        if (mo127236J()) {
            if (bVar == null || (str = bVar.invoke("hashtag_sticker")) == null) {
                str = ((VideoPublishEditModel) this.f184102h.mo23374a(this, f184099e[0])).uniqueVideoSessionDir(mo127238L() + "/effect/hashtag_stickers" + File.separator + System.currentTimeMillis() + File.separator);
            }
            C89219l.m154716b(str, "");
            C1731i<TContinuationResult> c = mo127241a(str, abVar.mo87631T().mo112106a(), abVar.mo87631T().mo112109b(), fVar.mo56330b().width, fVar.mo56330b().height).mo5543c(new C82302c(this, fVar, abVar), C1731i.f5564c);
            C89219l.m154716b(c, "");
            return c;
        }
        C1731i<C89391z> a = C1731i.m5633a(C89391z.f203057a);
        C89219l.m154716b(a, "");
        return a;
    }
}
