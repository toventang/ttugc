package com.p2082ss.android.ugc.gamora.editor.sticker.p4286a;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.C37410k;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.C37426a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.qasticker.C65863a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4290qa.EditPageQaStickerViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.a.a */
public final class C82566a extends C37347a {

    /* renamed from: c */
    public boolean f184655c;

    /* renamed from: d */
    public EditCommentStickerViewModel f184656d;

    /* renamed from: e */
    public EditPageQaStickerViewModel f184657e;

    /* renamed from: f */
    public final VideoPublishEditModel f184658f;

    /* renamed from: k */
    private final AbstractC89244h f184659k = C89250i.m154774a(EnumC89331m.NONE, new C82567a(this));

    /* renamed from: l */
    private final C21582f f184660l;

    /* renamed from: m */
    private final AbstractC22186b f184661m;

    /* renamed from: n */
    private final int f184662n;

    static {
        Covode.recordClassIndex(96411);
    }

    /* renamed from: o */
    private final AbstractC72510a m142746o() {
        return (AbstractC72510a) this.f184659k.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f184661m;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a, com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    public final C21582f getDiContainer() {
        return this.f184660l;
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: m */
    public final int mo64977m() {
        return this.f184662n;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.a.a$a */
    public static final class C82567a extends AbstractC89220m implements AbstractC89171a<AbstractC72510a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184663a;

        static {
            Covode.recordClassIndex(96412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82567a(AbstractC21566a aVar) {
            super(0);
            this.f184663a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184663a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.p4286a.C82566a.C82567a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: c */
    public final void mo23032c() {
        m142746o().mo114805a((AbstractC72510a) false, false, false);
        EditCommentStickerViewModel editCommentStickerViewModel = this.f184656d;
        if (editCommentStickerViewModel == null) {
            C89219l.m154710a("commentStickerViewModel");
        }
        editCommentStickerViewModel.mo127200a(0.3137255f);
        super.mo23032c();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: d */
    public final void mo23033d() {
        m142746o().mo114805a((AbstractC72510a) true, false, true);
        EditCommentStickerViewModel editCommentStickerViewModel = this.f184656d;
        if (editCommentStickerViewModel == null) {
            C89219l.m154710a("commentStickerViewModel");
        }
        editCommentStickerViewModel.mo127200a(1.0f);
        super.mo23033d();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        Activity b = C2556g.m7473b(this);
        Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) b).mo33800a(EditCommentStickerViewModel.class);
        C89219l.m154716b(a, "");
        EditCommentStickerViewModel editCommentStickerViewModel = (EditCommentStickerViewModel) a;
        this.f184656d = editCommentStickerViewModel;
        if (editCommentStickerViewModel == null) {
            C89219l.m154710a("commentStickerViewModel");
        }
        Activity b2 = C2556g.m7473b(this);
        Objects.requireNonNull(b2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC88412b unused = editCommentStickerViewModel.m38548b((ActivityC0945e) b2, C82578b.f184678a, new C20370ah(), new C82574d(this));
        mo64946f().mo64932a();
        mo64974a().f88200i.mo6997a(this, new C82575e(this));
        AbstractC20382b.C20383a.m38603b(this, mo64946f(), C82579c.f184679a, new C82576f(this));
        AbstractC20382b.C20383a.m38603b(this, mo64946f(), C82580d.f184680a, new C82577g(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ EditPageQaStickerViewModel m142745a(C82566a aVar) {
        EditPageQaStickerViewModel editPageQaStickerViewModel = aVar.f184657e;
        if (editPageQaStickerViewModel == null) {
            C89219l.m154710a("qaStickerViewModel");
        }
        return editPageQaStickerViewModel;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.a.a$d */
    static final class C82574d extends AbstractC89220m implements AbstractC89172b<C20521k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82566a f184674a;

        static {
            Covode.recordClassIndex(96419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82574d(C82566a aVar) {
            super(1);
            this.f184674a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20521k kVar) {
            boolean z;
            T t;
            C20521k kVar2 = kVar;
            C82566a aVar = this.f184674a;
            if (kVar2 == null || (t = kVar2.f48283b) == null) {
                z = false;
            } else {
                z = t.booleanValue();
            }
            aVar.f184655c = z;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.a.a$b */
    static final class C82568b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82566a f184664a;

        /* renamed from: b */
        final /* synthetic */ EditPageQaStickerViewModel f184665b;

        /* renamed from: c */
        final /* synthetic */ CommentVideoModel f184666c;

        /* renamed from: d */
        final /* synthetic */ int f184667d = 2;

        static {
            Covode.recordClassIndex(96413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82568b(C82566a aVar, EditPageQaStickerViewModel editPageQaStickerViewModel, CommentVideoModel commentVideoModel) {
            super(1);
            this.f184664a = aVar;
            this.f184665b = editPageQaStickerViewModel;
            this.f184666c = commentVideoModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = C2556g.m7474c(this.f184664a).getString(R.string.f0x);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.sticker.p4286a.C82566a.C82568b.C825691 */

                /* renamed from: a */
                final /* synthetic */ C82568b f184668a;

                static {
                    Covode.recordClassIndex(96414);
                }

                {
                    this.f184668a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f184668a.f184665b.mo128053k().mo128071d().mo112285d();
                    CommentAndQuestionAndQuestionStickerPanelViewModel f = this.f184668a.f184664a.mo64946f();
                    f.mo64934a(this.f184668a.f184666c);
                    f.mo64950j();
                    f.mo64936a(this.f184668a.f184666c, f.f88074c.getTabName(), "replace");
                    f.mo64941a("replace", this.f184668a.f184667d);
                    return C89391z.f203057a;
                }
            });
            String string2 = C2556g.m7474c(this.f184664a).getString(R.string.f0y);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.sticker.p4286a.C82566a.C82568b.C825702 */

                /* renamed from: a */
                final /* synthetic */ C82568b f184669a;

                static {
                    Covode.recordClassIndex(96415);
                }

                {
                    this.f184669a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    EditPageQaStickerViewModel editPageQaStickerViewModel = this.f184669a.f184665b;
                    int i = this.f184669a.f184667d;
                    C89219l.m154721d("cancel", "");
                    C65863a aVar2 = editPageQaStickerViewModel.f185407b;
                    C89219l.m154721d("cancel", "");
                    VideoPublishEditModel videoPublishEditModel = aVar2.f148412b;
                    if (videoPublishEditModel != null) {
                        C39162r.m79460a("replace_question_confirm", new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("target", "cancel").mo129403a(StringSet.type, i).f188764a);
                    }
                    this.f184669a.f184664a.mo64946f().mo64936a(this.f184669a.f184666c, this.f184669a.f184664a.mo64946f().f88074c.getTabName(), "cancel");
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.a.a$c */
    static final class C82571c extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82566a f184670a;

        /* renamed from: b */
        final /* synthetic */ QaStruct f184671b;

        static {
            Covode.recordClassIndex(96416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82571c(C82566a aVar, QaStruct qaStruct) {
            super(1);
            this.f184670a = aVar;
            this.f184671b = qaStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = C2556g.m7474c(this.f184670a).getString(R.string.f0x);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.sticker.p4286a.C82566a.C82571c.C825721 */

                /* renamed from: a */
                final /* synthetic */ C82571c f184672a;

                static {
                    Covode.recordClassIndex(96417);
                }

                {
                    this.f184672a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C82566a.m142745a(this.f184672a.f184670a).mo128053k().mo128071d().mo112285d();
                    CommentAndQuestionAndQuestionStickerPanelViewModel f = this.f184672a.f184670a.mo64946f();
                    f.mo64951k();
                    EditCommentStickerViewModel editCommentStickerViewModel = this.f184672a.f184670a.f184656d;
                    if (editCommentStickerViewModel == null) {
                        C89219l.m154710a("commentStickerViewModel");
                    }
                    editCommentStickerViewModel.mo127204g();
                    C82566a.m142745a(this.f184672a.f184670a).mo128040a(this.f184672a.f184671b);
                    f.mo64944b();
                    return C89391z.f203057a;
                }
            });
            String string2 = C2556g.m7474c(this.f184670a).getString(R.string.f0y);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, C825732.f184673a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.a.a$e */
    static final class C82575e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82566a f184675a;

        static {
            Covode.recordClassIndex(96420);
        }

        C82575e(C82566a aVar) {
            this.f184675a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f184675a.f184658f.commentVideoModel = this.f184675a.mo64974a().mo65010d();
            this.f184675a.f184658f.commentVideoModel.setShootWay("edit_panel");
            this.f184675a.mo64946f().f88079l.setValue(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: a */
    public final void mo64975a(CommentVideoModel commentVideoModel) {
        C89219l.m154721d(commentVideoModel, "");
        Activity b = C2556g.m7473b(this);
        Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) b).mo33800a(EditPageQaStickerViewModel.class);
        C89219l.m154716b(a, "");
        EditPageQaStickerViewModel editPageQaStickerViewModel = (EditPageQaStickerViewModel) a;
        if (editPageQaStickerViewModel.mo128053k().mo128071d().mo112283b()) {
            CommentAndQuestionAndQuestionStickerPanelViewModel f = mo64946f();
            f.mo64935a(commentVideoModel, f.f88074c.getTabName());
            f.mo64933a(2);
            C23028c.m43435a(new C23023b(C2556g.m7474c(this)).mo37411b(C2556g.m7474c(this).getString(R.string.f49)).mo37413d(C2556g.m7474c(this).getString(R.string.f48)), new C82568b(this, editPageQaStickerViewModel, commentVideoModel)).mo37405a().mo37396b().show();
            return;
        }
        super.mo64975a(commentVideoModel);
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: a */
    public final void mo64976a(QaStruct qaStruct) {
        C89219l.m154721d(qaStruct, "");
        Activity b = C2556g.m7473b(this);
        Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) b).mo33800a(EditPageQaStickerViewModel.class);
        C89219l.m154716b(a, "");
        EditPageQaStickerViewModel editPageQaStickerViewModel = (EditPageQaStickerViewModel) a;
        this.f184657e = editPageQaStickerViewModel;
        if (editPageQaStickerViewModel == null) {
            C89219l.m154710a("qaStickerViewModel");
        }
        if (editPageQaStickerViewModel.mo128053k().mo128071d().mo112283b()) {
            EditPageQaStickerViewModel editPageQaStickerViewModel2 = this.f184657e;
            if (editPageQaStickerViewModel2 == null) {
                C89219l.m154710a("qaStickerViewModel");
            }
            editPageQaStickerViewModel2.mo128053k().mo128071d().mo112285d();
            EditPageQaStickerViewModel editPageQaStickerViewModel3 = this.f184657e;
            if (editPageQaStickerViewModel3 == null) {
                C89219l.m154710a("qaStickerViewModel");
            }
            editPageQaStickerViewModel3.mo128040a(qaStruct);
            mo64946f().mo64944b();
        } else if (this.f184655c) {
            C23028c.m43435a(new C23023b(C2556g.m7474c(this)).mo37411b(C2556g.m7474c(this).getString(R.string.f49)).mo37413d(C2556g.m7474c(this).getString(R.string.f48)), new C82571c(this, qaStruct)).mo37405a().mo37396b().show();
        } else {
            EditPageQaStickerViewModel editPageQaStickerViewModel4 = this.f184657e;
            if (editPageQaStickerViewModel4 == null) {
                C89219l.m154710a("qaStickerViewModel");
            }
            editPageQaStickerViewModel4.mo128040a(qaStruct);
            mo64946f().mo64944b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.a.a$f */
    static final class C82576f extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, CommentVideoModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82566a f184676a;

        static {
            Covode.recordClassIndex(96421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82576f(C82566a aVar) {
            super(2);
            this.f184676a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, CommentVideoModel commentVideoModel) {
            CommentVideoModel commentVideoModel2 = commentVideoModel;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(commentVideoModel2, "");
            this.f184676a.mo64975a(commentVideoModel2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.a.a$g */
    static final class C82577g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, QaStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82566a f184677a;

        static {
            Covode.recordClassIndex(96422);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82577g(C82566a aVar) {
            super(2);
            this.f184677a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, QaStruct qaStruct) {
            QaStruct qaStruct2 = qaStruct;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(qaStruct2, "");
            this.f184677a.mo64976a(qaStruct2);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82566a(C21582f fVar, AbstractC22186b bVar, int i, VideoPublishEditModel videoPublishEditModel) {
        super(fVar, bVar, i, videoPublishEditModel.commentVideoModel, new C37410k(null, videoPublishEditModel, false, 1));
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        this.f184660l = fVar;
        this.f184661m = bVar;
        this.f184662n = i;
        this.f184658f = videoPublishEditModel;
        C37426a.f88336f = videoPublishEditModel.creationId;
    }
}
