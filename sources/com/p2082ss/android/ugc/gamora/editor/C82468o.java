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
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.C71345b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerEditingLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.p3820a.AbstractC71276a;
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

/* renamed from: com.ss.android.ugc.gamora.editor.o */
public final class C82468o extends AbstractC82018a<User> {

    /* renamed from: e */
    static final /* synthetic */ AbstractC89286i[] f184438e = {new C89232y(C82468o.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};

    /* renamed from: f */
    public static final C82469a f184439f = new C82469a((byte) 0);

    /* renamed from: g */
    private EditMentionStickerViewModel f184440g;

    /* renamed from: h */
    private final AbstractC89244h f184441h = C89250i.m154773a((AbstractC89171a) new C82470b(this));

    /* renamed from: i */
    private final AbstractC89248d f184442i = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    static {
        Covode.recordClassIndex(96308);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82018a
    /* renamed from: C */
    public final int mo127229C() {
        return 8;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.o$a */
    public static final class C82469a {
        static {
            Covode.recordClassIndex(96309);
        }

        private C82469a() {
        }

        public /* synthetic */ C82469a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82018a
    /* renamed from: D */
    public final void mo127230D() {
        ((AbstractC82018a) this).f183561b.mo112708a((MentionStickerEditingLayout) this.f184441h.getValue());
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82018a
    /* renamed from: d */
    public final AbstractC71276a<User> mo127250d() {
        return new C71345b(mo127248b());
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82018a
    /* renamed from: E */
    public final void mo127231E() {
        super.mo127231E();
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditMentionStickerViewModel.class);
        C89219l.m154716b(a, "");
        this.f184440g = (EditMentionStickerViewModel) a;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82018a
    /* renamed from: F */
    public final void mo127232F() {
        super.mo127232F();
        EditMentionStickerViewModel editMentionStickerViewModel = this.f184440g;
        if (editMentionStickerViewModel == null) {
            C89219l.m154710a("editMentionStickerViewModel");
        }
        editMentionStickerViewModel.mo127226a().observe(this, new C82472d(this));
        EditMentionStickerViewModel editMentionStickerViewModel2 = this.f184440g;
        if (editMentionStickerViewModel2 == null) {
            C89219l.m154710a("editMentionStickerViewModel");
        }
        selectNonNullSubscribe(editMentionStickerViewModel2, C82475p.f184450a, new C20370ah(), new C82473e(this));
        EditMentionStickerViewModel editMentionStickerViewModel3 = this.f184440g;
        if (editMentionStickerViewModel3 == null) {
            C89219l.m154710a("editMentionStickerViewModel");
        }
        AbstractC20382b.C20383a.m38603b(this, editMentionStickerViewModel3, C82545q.f184617a, new C82474f(this));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.o$b */
    static final class C82470b extends AbstractC89220m implements AbstractC89171a<MentionStickerEditingLayout> {

        /* renamed from: a */
        final /* synthetic */ C82468o f184443a;

        static {
            Covode.recordClassIndex(96310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82470b(C82468o oVar) {
            super(0);
            this.f184443a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MentionStickerEditingLayout invoke() {
            MethodCollector.m26663i(11659);
            C82468o oVar = this.f184443a;
            if (oVar.f52551o != null) {
                AbstractC22219j jVar = oVar.f52551o;
                if (jVar == null) {
                    C89219l.m154715b();
                }
                View inflate = ((ViewStub) jVar.mo36475c(R.id.fg7)).inflate();
                if (inflate != null) {
                    MentionStickerEditingLayout mentionStickerEditingLayout = (MentionStickerEditingLayout) inflate;
                    View findViewById = mentionStickerEditingLayout.findViewById(R.id.ey8);
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
                    MethodCollector.m26664o(11659);
                    return mentionStickerEditingLayout;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.MentionStickerEditingLayout");
                MethodCollector.m26664o(11659);
                throw nullPointerException;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Parent Scene is null".toString());
            MethodCollector.m26664o(11659);
            throw illegalStateException;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.o$d */
    static final class C82472d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C82468o f184447a;

        static {
            Covode.recordClassIndex(96312);
        }

        C82472d(C82468o oVar) {
            this.f184447a = oVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                ((AbstractC82018a) this.f184447a).f183561b.mo112305a(f.floatValue());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82468o(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.o$c */
    static final class C82471c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C82468o f184444a;

        /* renamed from: b */
        final /* synthetic */ AbstractC31071f f184445b;

        /* renamed from: c */
        final /* synthetic */ AbstractC82035ab f184446c;

        static {
            Covode.recordClassIndex(96311);
        }

        C82471c(C82468o oVar, AbstractC31071f fVar, AbstractC82035ab abVar) {
            this.f184444a = oVar;
            this.f184445b = fVar;
            this.f184446c = abVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            for (C45859b bVar : (List) iVar.mo5545d()) {
                StickerItemModel stickerItemModel = new StickerItemModel(((AbstractC82018a) this.f184444a).f183561b.f159747a, bVar.stickerPath, "", bVar.index, false, 0, this.f184445b.mo56368j(), 8);
                stickerItemModel.isImageStickerLayer = true;
                stickerItemModel.viewHash = bVar.viewHash;
                this.f184446c.mo87638a(stickerItemModel);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.o$e */
    static final class C82473e extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82468o f184448a;

        static {
            Covode.recordClassIndex(96313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82473e(C82468o oVar) {
            super(2);
            this.f184448a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f184448a.mo127247a(booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.o$f */
    static final class C82474f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82468o f184449a;

        static {
            Covode.recordClassIndex(96314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82474f(C82468o oVar) {
            super(2);
            this.f184449a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C89391z zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            ((AbstractC82018a) this.f184449a).f183561b.mo112324n();
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
            if (bVar == null || (str = bVar.invoke("mention_sticker")) == null) {
                str = ((VideoPublishEditModel) this.f184442i.mo23374a(this, f184438e[0])).uniqueVideoSessionDir(mo127238L() + "/effect/mention_stickers" + File.separator + System.currentTimeMillis() + File.separator);
            }
            C89219l.m154716b(str, "");
            C1731i<TContinuationResult> c = mo127241a(str, abVar.mo87631T().mo112106a(), abVar.mo87631T().mo112109b(), fVar.mo56330b().width, fVar.mo56330b().height).mo5543c(new C82471c(this, fVar, abVar), C1731i.f5564c);
            C89219l.m154716b(c, "");
            return c;
        }
        C1731i<C89391z> a = C1731i.m5633a(C89391z.f203057a);
        C89219l.m154716b(a, "");
        return a;
    }
}
