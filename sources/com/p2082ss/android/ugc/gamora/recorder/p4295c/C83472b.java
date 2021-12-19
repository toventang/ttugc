package com.p2082ss.android.ugc.gamora.recorder.p4295c;

import android.content.DialogInterface;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2564l;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.C37410k;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.C37426a;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi;
import com.p2082ss.android.ugc.aweme.p2443cg.AbstractC35471a;
import com.p2082ss.android.ugc.aweme.setting.C68435t;
import com.p2082ss.android.ugc.aweme.setting.C68719x;
import com.p2082ss.android.ugc.aweme.setting.EoyHighlightConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.c.b */
public final class C83472b extends C37347a {

    /* renamed from: c */
    static final /* synthetic */ AbstractC89286i[] f186426c = {new C89232y(C83472b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C83472b.class, "recordControlProgressComponent", "getRecordControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new C89232y(C83472b.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C89232y(C83472b.class, "recordQaStickerApi", "getRecordQaStickerApi()Lcom/ss/android/ugc/aweme/qa_sticker/RecordQaStickerApi;", 0), new C89232y(C83472b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: d */
    public boolean f186427d;

    /* renamed from: e */
    public final ShortVideoContext f186428e;

    /* renamed from: f */
    private final AbstractC89248d f186429f;

    /* renamed from: k */
    private final AbstractC89248d f186430k;

    /* renamed from: l */
    private final AbstractC89248d f186431l;

    /* renamed from: m */
    private final AbstractC89248d f186432m;

    /* renamed from: n */
    private final AbstractC89248d f186433n;

    /* renamed from: o */
    private boolean f186434o;

    /* renamed from: p */
    private final AbstractC89244h f186435p;

    /* renamed from: q */
    private final AbstractC22186b f186436q;

    /* renamed from: r */
    private final C21582f f186437r;

    /* renamed from: s */
    private final int f186438s = R.id.dg9;

    static {
        Covode.recordClassIndex(97358);
    }

    /* renamed from: r */
    private final AbstractC71864a m143850r() {
        return (AbstractC71864a) this.f186429f.mo23374a(this, f186426c[0]);
    }

    /* renamed from: s */
    private final AbstractC83746a m143851s() {
        return (AbstractC83746a) this.f186430k.mo23374a(this, f186426c[1]);
    }

    /* renamed from: t */
    private final AbstractC83406b m143852t() {
        return (AbstractC83406b) this.f186431l.mo23374a(this, f186426c[2]);
    }

    /* renamed from: o */
    public final AbstractC35471a mo128484o() {
        return (AbstractC35471a) this.f186432m.mo23374a(this, f186426c[3]);
    }

    /* renamed from: p */
    public final AbstractC84089j mo128485p() {
        return (AbstractC84089j) this.f186433n.mo23374a(this, f186426c[4]);
    }

    /* renamed from: q */
    public final ProgressDialogC81146b mo128486q() {
        return (ProgressDialogC81146b) this.f186435p.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f186436q;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a, com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    public final C21582f getDiContainer() {
        return this.f186437r;
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: m */
    public final int mo64977m() {
        return this.f186438s;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.b$f */
    static final class C83484f extends AbstractC89220m implements AbstractC89171a<ProgressDialogC81146b> {

        /* renamed from: a */
        final /* synthetic */ C83472b f186452a;

        static {
            Covode.recordClassIndex(97370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83484f(C83472b bVar) {
            super(0);
            this.f186452a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProgressDialogC81146b invoke() {
            return new ProgressDialogC81146b(C2556g.m7473b(this.f186452a), ProgressDialogC81146b.EnumC81147a.VISIBLE_AFTER_5S, (byte) 0);
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: d */
    public final void mo23033d() {
        m143850r().mo113510a(true, false);
        m143851s().mo128718c(true);
        m143852t().showBottomTab(true);
        if (this.f186434o) {
            m143852t().showComplexTab(0, null);
            this.f186434o = false;
        }
        super.mo23033d();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        mo64974a().f88200i.mo6997a(this, new C83485g(this));
        AbstractC20382b.C20383a.m38603b(this, mo64946f(), C83488c.f186456a, new C83486h(this));
        AbstractC20382b.C20383a.m38603b(this, mo64946f(), C83489d.f186457a, new C83487i(this));
        mo64946f().mo64932a();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        C37426a.f88332b.clear();
        C37426a.f88333c.clear();
        C37426a.f88334d = false;
        C37426a.f88335e.mo6999a((Boolean) false);
        C37426a.f88336f = null;
        C37426a.f88331a = new CommentStickerPanelRequestApi();
        super.onDestroy();
    }

    /* renamed from: u */
    private final void m143853u() {
        if (!C2556g.m7473b(this).isFinishing()) {
            ProgressDialogC81146b q = mo128486q();
            q.setCancelable(false);
            q.setOnCancelListener(new DialogInterface$OnCancelListenerC83482d(this));
            q.show();
            this.f186427d = false;
            C83470a aVar = new C83470a(mo128485p());
            EoyHighlightConfig eoyHighlightConfig = C68719x.f153729b;
            if (eoyHighlightConfig == null) {
                C89219l.m154715b();
            }
            String effectId = eoyHighlightConfig.getEffectId();
            if (effectId == null) {
                C89219l.m154715b();
            }
            Object a = getDiContainer().mo35247a(ActivityC0218d.class);
            C89219l.m154716b(a, "");
            aVar.mo128482a(effectId, new C83992b((ActivityC0218d) a, this.f186428e, mo128485p()).mo128877f(), new C83483e(this));
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: c */
    public final void mo23032c() {
        T value;
        m143850r().mo113510a(false, true);
        m143851s().mo128718c(false);
        m143852t().showBottomTab(false);
        C2564l<Integer> complexTabVisibility = m143852t().getComplexTabVisibility();
        if (!(complexTabVisibility == null || (value = complexTabVisibility.f7727a.getValue()) == null || value.intValue() != 0)) {
            m143852t().showComplexTab(8, null);
            this.f186434o = true;
        }
        m143852t().showComplexTab(8, null);
        super.mo23032c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.c.b$d */
    public static final class DialogInterface$OnCancelListenerC83482d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C83472b f186450a;

        static {
            Covode.recordClassIndex(97368);
        }

        DialogInterface$OnCancelListenerC83482d(C83472b bVar) {
            this.f186450a = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f186450a.f186427d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.b$e */
    public static final class C83483e implements IEffectDownloadProgressListener {

        /* renamed from: a */
        final /* synthetic */ C83472b f186451a;

        static {
            Covode.recordClassIndex(97369);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83483e(C83472b bVar) {
            this.f186451a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            this.f186451a.mo128486q().dismiss();
            if (effect != null && !this.f186451a.f186427d) {
                this.f186451a.f186428e.f155760U = true;
                FaceStickerBean.sCurPropSource = "qa_prop";
                this.f186451a.mo128485p().mo128909f(true);
                C75346e.m132159a(this.f186451a.mo128485p(), C89070n.m154516a(effect), true, true, null, 0, null, 504);
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            this.f186451a.mo128486q().dismiss();
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i, long j) {
            this.f186451a.mo128486q().setProgress(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.b$b */
    static final class C83476b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83472b f186443a;

        /* renamed from: b */
        final /* synthetic */ QaStruct f186444b;

        static {
            Covode.recordClassIndex(97362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83476b(C83472b bVar, QaStruct qaStruct) {
            super(1);
            this.f186443a = bVar;
            this.f186444b = qaStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.f47, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.p4295c.C83472b.C83476b.C834771 */

                /* renamed from: a */
                final /* synthetic */ C83476b f186445a;

                static {
                    Covode.recordClassIndex(97363);
                }

                {
                    this.f186445a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    AbstractC35471a o = this.f186445a.f186443a.mo128484o();
                    if (o != null) {
                        o.mo62363b();
                    }
                    AbstractC35471a o2 = this.f186445a.f186443a.mo128484o();
                    if (o2 != null) {
                        o2.mo62362a(this.f186445a.f186444b);
                    }
                    this.f186445a.f186443a.mo64946f().mo64944b();
                    this.f186445a.f186443a.mo128483b(this.f186445a.f186444b);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, C834782.f186446a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.b$c */
    static final class C83479c extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83472b f186447a;

        /* renamed from: b */
        final /* synthetic */ QaStruct f186448b;

        static {
            Covode.recordClassIndex(97365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83479c(C83472b bVar, QaStruct qaStruct) {
            super(1);
            this.f186447a = bVar;
            this.f186448b = qaStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.f47, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.p4295c.C83472b.C83479c.C834801 */

                /* renamed from: a */
                final /* synthetic */ C83479c f186449a;

                static {
                    Covode.recordClassIndex(97366);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f186449a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f186449a.f186447a.mo64946f().mo64944b();
                    this.f186449a.f186447a.mo64946f().mo64951k();
                    this.f186449a.f186447a.mo64946f().mo33689c(CommentAndQuestionAndQuestionStickerPanelViewModel.C37344n.f88108a);
                    this.f186449a.f186447a.f186428e.f155825j = null;
                    AbstractC35471a o = this.f186449a.f186447a.mo128484o();
                    if (o != null) {
                        o.mo62362a(this.f186449a.f186448b);
                    }
                    this.f186449a.f186447a.mo128483b(this.f186449a.f186448b);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, new AbstractC89172b<C23024a, C89391z>() {
                /* class com.p2082ss.android.ugc.gamora.recorder.p4295c.C83472b.C83479c.C834812 */

                static {
                    Covode.recordClassIndex(97367);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.b$a */
    static final class C83473a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83472b f186439a;

        /* renamed from: b */
        final /* synthetic */ CommentVideoModel f186440b;

        static {
            Covode.recordClassIndex(97359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83473a(C83472b bVar, CommentVideoModel commentVideoModel) {
            super(1);
            this.f186439a = bVar;
            this.f186440b = commentVideoModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            String string = C2556g.m7474c(this.f186439a).getString(R.string.f0x);
            C89219l.m154716b(string, "");
            bVar2.mo37417a(string, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.p4295c.C83472b.C83473a.C834741 */

                /* renamed from: a */
                final /* synthetic */ C83473a f186441a;

                static {
                    Covode.recordClassIndex(97360);
                }

                {
                    this.f186441a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    AbstractC35471a o = this.f186441a.f186439a.mo128484o();
                    if (o != null) {
                        o.mo62363b();
                    }
                    CommentAndQuestionAndQuestionStickerPanelViewModel f = this.f186441a.f186439a.mo64946f();
                    f.mo64934a(this.f186441a.f186440b);
                    f.mo64950j();
                    this.f186441a.f186439a.mo128483b(null);
                    f.mo64936a(this.f186441a.f186440b, f.f88074c.getTabName(), "replace");
                    return C89391z.f203057a;
                }
            });
            String string2 = C2556g.m7474c(this.f186439a).getString(R.string.f0y);
            C89219l.m154716b(string2, "");
            bVar2.mo37419b(string2, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.p4295c.C83472b.C83473a.C834752 */

                /* renamed from: a */
                final /* synthetic */ C83473a f186442a;

                static {
                    Covode.recordClassIndex(97361);
                }

                {
                    this.f186442a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f186442a.f186439a.mo64946f().mo64936a(this.f186442a.f186440b, this.f186442a.f186439a.mo64946f().f88074c.getTabName(), "cancel");
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.b$g */
    static final class C83485g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83472b f186453a;

        static {
            Covode.recordClassIndex(97371);
        }

        C83485g(C83472b bVar) {
            this.f186453a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186453a.f186428e.f155825j = this.f186453a.mo64974a().mo65010d();
            CommentVideoModel commentVideoModel = this.f186453a.f186428e.f155825j;
            if (commentVideoModel != null) {
                commentVideoModel.setShootWay("record_panel");
            }
            this.f186453a.mo64946f().f88079l.setValue(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: a */
    public final void mo64975a(CommentVideoModel commentVideoModel) {
        Boolean bool;
        C89219l.m154721d(commentVideoModel, "");
        AbstractC35471a o = mo128484o();
        if (o != null) {
            bool = o.mo62361a();
        } else {
            bool = null;
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            mo64946f().mo64935a(commentVideoModel, mo64946f().f88074c.getTabName());
            C23028c.m43435a(new C23023b(C2556g.m7474c(this)).mo37411b(C2556g.m7474c(this).getString(R.string.f49)).mo37413d(C2556g.m7474c(this).getString(R.string.f48)), new C83473a(this, commentVideoModel)).mo37405a().mo37396b().show();
            return;
        }
        super.mo64975a(commentVideoModel);
    }

    /* renamed from: b */
    public final void mo128483b(QaStruct qaStruct) {
        String str;
        EoyHighlightConfig eoyHighlightConfig;
        String effectId;
        if (qaStruct == null || !C68435t.m120865a(qaStruct.getQuestionContent())) {
            FaceStickerBean i = mo128485p().mo23127i();
            if (i != null) {
                str = i.getPropSource();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) "qa_prop")) {
                mo128485p().mo128909f(false);
                C75346e.m132156a(mo128485p(), (Effect) null);
            }
        } else if (C75346e.m132154a(mo128485p()) == null && (eoyHighlightConfig = C68719x.f153729b) != null && (effectId = eoyHighlightConfig.getEffectId()) != null && C80537hk.m139613a(effectId)) {
            m143853u();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commentStickerPanel.C37347a
    /* renamed from: a */
    public final void mo64976a(QaStruct qaStruct) {
        C89219l.m154721d(qaStruct, "");
        if (this.f186428e.f155826k != null) {
            C23028c.m43435a((C23023b) C23013a.C23015a.m43405a(C2556g.m7474c(this)).mo37411b(C2556g.m7474c(this).getResources().getString(R.string.f49)).mo37483b(R.string.f44), new C83476b(this, qaStruct)).mo37405a().mo37396b().show();
        } else if (this.f186428e.f155825j != null) {
            C23028c.m43435a((C23023b) C23013a.C23015a.m43405a(C2556g.m7474c(this)).mo37411b(C2556g.m7474c(this).getResources().getString(R.string.f49)).mo37483b(R.string.f0f), new C83479c(this, qaStruct)).mo37405a().mo37396b().show();
        } else {
            AbstractC35471a o = mo128484o();
            if (o != null) {
                o.mo62362a(qaStruct);
            }
            mo64946f().mo64944b();
            mo128483b(qaStruct);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.b$h */
    static final class C83486h extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, CommentVideoModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83472b f186454a;

        static {
            Covode.recordClassIndex(97372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83486h(C83472b bVar) {
            super(2);
            this.f186454a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, CommentVideoModel commentVideoModel) {
            CommentVideoModel commentVideoModel2 = commentVideoModel;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(commentVideoModel2, "");
            this.f186454a.mo64975a(commentVideoModel2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.c.b$i */
    static final class C83487i extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, QaStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83472b f186455a;

        static {
            Covode.recordClassIndex(97373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83487i(C83472b bVar) {
            super(2);
            this.f186455a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, QaStruct qaStruct) {
            QaStruct qaStruct2 = qaStruct;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(qaStruct2, "");
            this.f186455a.mo64976a(qaStruct2);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83472b(AbstractC22186b bVar, C21582f fVar, ShortVideoContext shortVideoContext) {
        super(fVar, bVar, R.id.dg9, shortVideoContext.f155825j, new C37410k(shortVideoContext, null, true, 2));
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(shortVideoContext, "");
        this.f186436q = bVar;
        this.f186437r = fVar;
        this.f186428e = shortVideoContext;
        this.f186429f = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);
        this.f186430k = C21572a.m40504a(getDiContainer(), AbstractC83746a.class);
        this.f186431l = C21572a.m40504a(getDiContainer(), AbstractC83406b.class);
        this.f186432m = C21572a.m40505b(getDiContainer(), AbstractC35471a.class);
        this.f186433n = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);
        this.f186435p = C89250i.m154773a((AbstractC89171a) new C83484f(this));
        C37426a.f88336f = shortVideoContext.f155830o;
    }
}
