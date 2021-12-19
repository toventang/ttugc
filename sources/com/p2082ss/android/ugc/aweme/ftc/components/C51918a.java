package com.p2082ss.android.ugc.aweme.ftc.components;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14536a;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.p969f.p970a.p971a.p972a.AbstractC14537a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.model.C45939c;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45830f;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.ftc.C52534f;
import com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.AbstractC51986e;
import com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51987f;
import com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.AbstractC52016c;
import com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.C52017d;
import com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.corner.AbstractC52056a;
import com.p2082ss.android.ugc.aweme.ftc.components.corner.C52057b;
import com.p2082ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.AbstractC52071a;
import com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.C52072b;
import com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.effect.AbstractC52098a;
import com.p2082ss.android.ugc.aweme.ftc.components.effect.C52112b;
import com.p2082ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.p3029a.C51954a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.AbstractC52173a;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52174b;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.C52177c;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.text.AbstractC52309a;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.AbstractC52410k;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.C52434r;
import com.p2082ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.p2082ss.android.ugc.aweme.ftc.components.volume.AbstractC52439a;
import com.p2082ss.android.ugc.aweme.ftc.components.volume.C52440b;
import com.p2082ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel;
import com.p2082ss.android.ugc.aweme.ftc.p3035g.C52547a;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.setting.C68338q;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71532y;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70835b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71428c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.sticker.text.C75894b;
import com.p2082ss.android.ugc.aweme.sticker.text.C75896c;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.widgetcompat.ProgressDialogC81636a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82563s;
import com.p2082ss.android.ugc.gamora.editor.C82546r;
import com.p2082ss.android.ugc.gamora.editor.C83098t;
import com.p2082ss.android.ugc.gamora.editor.C83386w;
import com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a;
import com.p2082ss.android.ugc.gamora.editor.filter.core.C82209c;
import com.p2082ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.C82239b;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorViewModel;
import com.p2082ss.android.ugc.gamora.editor.gesture.AbstractC82254a;
import com.p2082ss.android.ugc.gamora.editor.gesture.C82255b;
import com.p2082ss.android.ugc.gamora.editor.gesture.EditGestureViewModel;
import com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a;
import com.p2082ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel;
import com.p2082ss.android.ugc.gamora.editor.p4276c.AbstractC82074b;
import com.p2082ss.android.ugc.gamora.editor.p4276c.C82080c;
import com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESize;
import dmt.p4542av.video.C88271g;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88296t;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.a */
public final class C51918a extends AbstractC82561d implements AbstractC20382b, AbstractC21566a, AbstractC82035ab, AbstractC82563s {

    /* renamed from: f */
    public static final C51941n f119609f = new C51941n((byte) 0);

    /* renamed from: A */
    private AbstractC14552j f119610A;

    /* renamed from: B */
    private C56724i f119611B;

    /* renamed from: C */
    private AbstractC70977bq f119612C;

    /* renamed from: D */
    private ProgressDialogC81636a f119613D;

    /* renamed from: E */
    private boolean f119614E;

    /* renamed from: F */
    private final C52534f f119615F = C52534f.f120954a;

    /* renamed from: G */
    private final C21582f f119616G;

    /* renamed from: b */
    final AbstractC89244h f119617b = C89250i.m154774a(EnumC89331m.NONE, new C51919a(this));

    /* renamed from: c */
    public VideoPublishEditModel f119618c;

    /* renamed from: d */
    final AbstractC89244h f119619d = C89250i.m154774a(EnumC89331m.NONE, new C51936i(this));

    /* renamed from: e */
    final AbstractC89244h f119620e = C89250i.m154774a(EnumC89331m.NONE, new C51938k(this));

    /* renamed from: g */
    private final AbstractC89244h f119621g = C89250i.m154773a((AbstractC89171a) new C51927ah(this));

    /* renamed from: h */
    private final AbstractC89244h f119622h = C89250i.m154773a((AbstractC89171a) new C51928ai(this));

    /* renamed from: i */
    private final AbstractC89244h f119623i = C89250i.m154774a(EnumC89331m.NONE, new C51931d(this));

    /* renamed from: j */
    private final AbstractC89244h f119624j = C89250i.m154774a(EnumC89331m.NONE, new C51939l(this));

    /* renamed from: k */
    private final AbstractC89244h f119625k = C89250i.m154774a(EnumC89331m.NONE, new C51940m(this));

    /* renamed from: l */
    private final AbstractC89244h f119626l = C89250i.m154774a(EnumC89331m.NONE, new C51932e(this));

    /* renamed from: t */
    private final AbstractC89244h f119627t = C89250i.m154774a(EnumC89331m.NONE, new C51933f(this));

    /* renamed from: u */
    private final AbstractC89244h f119628u = C89250i.m154774a(EnumC89331m.NONE, new C51934g(this));

    /* renamed from: w */
    private final AbstractC89244h f119629w = C89250i.m154774a(EnumC89331m.NONE, new C51935h(this));

    /* renamed from: x */
    private final AbstractC89244h f119630x = C89250i.m154774a(EnumC89331m.NONE, new C51937j(this));

    /* renamed from: y */
    private final AbstractC89244h f119631y = C89250i.m154774a(EnumC89331m.NONE, new C51929b(this));

    /* renamed from: z */
    private final AbstractC89244h f119632z = C89250i.m154774a(EnumC89331m.NONE, new C51930c(this));

    static {
        Covode.recordClassIndex(61287);
    }

    /* renamed from: ab */
    private final AbstractC52056a m96617ab() {
        return (AbstractC52056a) this.f119631y.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final C83386w mo62771E() {
        return (C83386w) this.f119621g.getValue();
    }

    /* renamed from: F */
    public final C52177c mo87618G() {
        return (C52177c) this.f119622h.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final AbstractC52410k mo87619H() {
        return (AbstractC52410k) this.f119623i.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final AbstractC52016c mo87620I() {
        return (AbstractC52016c) this.f119624j.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final AbstractC51986e mo87621J() {
        return (AbstractC51986e) this.f119625k.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final AbstractC52098a mo87622K() {
        return (AbstractC52098a) this.f119626l.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final AbstractC82200a mo87623L() {
        return (AbstractC82200a) this.f119627t.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final AbstractC52173a mo87624M() {
        return (AbstractC52173a) this.f119628u.getValue();
    }

    /* renamed from: N */
    public final AbstractC82155c mo87625N() {
        return (AbstractC82155c) this.f119629w.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final AbstractC82403a mo87626O() {
        return (AbstractC82403a) this.f119630x.getValue();
    }

    /* renamed from: P */
    public final AbstractC52071a mo87627P() {
        return (AbstractC52071a) this.f119632z.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: W */
    public final boolean mo87634W() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82563s
    /* renamed from: X */
    public final void mo87635X() {
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: a */
    public final void mo87640a(Effect effect, CustomStickerInfo customStickerInfo) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(customStickerInfo, "");
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$n */
    public static final class C51941n {
        static {
            Covode.recordClassIndex(61310);
        }

        private C51941n() {
        }

        public /* synthetic */ C51941n(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87642a(boolean z) {
        m96617ab().mo87793a(z);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: a */
    public final void mo87644a(boolean z, boolean z2, Runnable runnable) {
        C89219l.m154721d(runnable, "");
        VideoPublishEditModel videoPublishEditModel = this.f119618c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f119618c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            if (TextUtils.isEmpty(videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath)) {
                VideoPublishEditModel videoPublishEditModel3 = this.f119618c;
                if (videoPublishEditModel3 == null) {
                    C89219l.m154710a("mModel");
                }
                videoPublishEditModel3.mvCreateVideoData.videoCoverImgPath = C63253l.f143623a.mo73308d().mo101651a().mo101653a();
            }
            AbstractC31071f U = mo87632U();
            VideoPublishEditModel videoPublishEditModel4 = this.f119618c;
            if (videoPublishEditModel4 == null) {
                C89219l.m154710a("mModel");
            }
            String str = videoPublishEditModel4.mvCreateVideoData.videoCoverImgPath;
            VideoPublishEditModel videoPublishEditModel5 = this.f119618c;
            if (videoPublishEditModel5 == null) {
                C89219l.m154710a("mModel");
            }
            new C71993c(U, str, videoPublishEditModel5.mvCreateVideoData.videoCoverStartTime, C51953z.f119686a, new C51920aa(this, z, z2, runnable));
        } else {
            mo87645a(false, z, z2, runnable);
        }
        VideoPublishEditModel videoPublishEditModel6 = this.f119618c;
        if (videoPublishEditModel6 == null) {
            C89219l.m154710a("mModel");
        }
        C89219l.m154721d(videoPublishEditModel6, "");
        C84425b a = new C84425b().mo129406a("creation_id", videoPublishEditModel6.creationId).mo129406a("shoot_way", videoPublishEditModel6.mShootWay).mo129406a("enter_from", "video_edit_page");
        if (videoPublishEditModel6.draftId != 0) {
            a.mo129403a("draft_id", videoPublishEditModel6.draftId);
        }
        C39162r.m79460a("next", a.f188764a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: a */
    public final void mo87645a(boolean z, boolean z2, boolean z3, Runnable runnable) {
        C89219l.m154721d(runnable, "");
        mo87649b(z, z2, z3, runnable);
    }

    /* renamed from: a */
    public final void mo87643a(boolean z, boolean z2, Intent intent) {
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        C82080c.m142102a(new AbstractC82074b.C82077c(z, z2, t, intent));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$a */
    public static final class C51919a extends AbstractC89220m implements AbstractC89171a<AbstractC82237a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119633a;

        static {
            Covode.recordClassIndex(61288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51919a(AbstractC21566a aVar) {
            super(0);
            this.f119633a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.filter.indicator.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119633a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.indicator.a> r1 = com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51919a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$aa */
    static final class C51920aa implements AbstractC72004a {

        /* renamed from: a */
        final /* synthetic */ C51918a f119634a;

        /* renamed from: b */
        final /* synthetic */ boolean f119635b;

        /* renamed from: c */
        final /* synthetic */ boolean f119636c;

        /* renamed from: d */
        final /* synthetic */ Runnable f119637d;

        static {
            Covode.recordClassIndex(61289);
        }

        C51920aa(C51918a aVar, boolean z, boolean z2, Runnable runnable) {
            this.f119634a = aVar;
            this.f119635b = z;
            this.f119636c = z2;
            this.f119637d = runnable;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a
        /* renamed from: a */
        public final void mo87651a() {
            this.f119634a.mo87645a(false, this.f119635b, this.f119636c, this.f119637d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$ae */
    public static final class C51924ae implements VEListener.AbstractC85247p {

        /* renamed from: a */
        final /* synthetic */ C51918a f119649a;

        /* renamed from: b */
        final /* synthetic */ boolean f119650b;

        /* renamed from: c */
        final /* synthetic */ boolean f119651c;

        /* renamed from: d */
        final /* synthetic */ Intent f119652d;

        static {
            Covode.recordClassIndex(61293);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85247p
        /* renamed from: a */
        public final void mo87653a() {
            this.f119649a.mo87643a(this.f119650b, this.f119651c, this.f119652d);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85247p
        /* renamed from: b */
        public final void mo87654b() {
            this.f119649a.mo87643a(this.f119650b, this.f119651c, this.f119652d);
        }

        C51924ae(C51918a aVar, boolean z, boolean z2, Intent intent) {
            this.f119649a = aVar;
            this.f119650b = z;
            this.f119651c = z2;
            this.f119652d = intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$ah */
    static final class C51927ah extends AbstractC89220m implements AbstractC89171a<C83386w> {

        /* renamed from: a */
        final /* synthetic */ C51918a f119656a;

        static {
            Covode.recordClassIndex(61296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51927ah(C51918a aVar) {
            super(0);
            this.f119656a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83386w invoke() {
            C83386w wVar = new C83386w();
            this.f119656a.mo36387a(R.id.ase, wVar, "EditStickerDeleteScene");
            return wVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$b */
    public static final class C51929b extends AbstractC89220m implements AbstractC89171a<AbstractC52056a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119658a;

        static {
            Covode.recordClassIndex(61298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51929b(AbstractC21566a aVar) {
            super(0);
            this.f119658a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.corner.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.corner.AbstractC52056a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119658a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.corner.a> r1 = com.p2082ss.android.ugc.aweme.ftc.components.corner.AbstractC52056a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51929b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$c */
    public static final class C51930c extends AbstractC89220m implements AbstractC89171a<AbstractC52071a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119659a;

        static {
            Covode.recordClassIndex(61299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51930c(AbstractC21566a aVar) {
            super(0);
            this.f119659a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.AbstractC52071a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119659a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.cutmusic.a> r1 = com.p2082ss.android.ugc.aweme.ftc.components.cutmusic.AbstractC52071a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51930c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$d */
    public static final class C51931d extends AbstractC89220m implements AbstractC89171a<AbstractC52410k> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119660a;

        static {
            Covode.recordClassIndex(61300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51931d(AbstractC21566a aVar) {
            super(0);
            this.f119660a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.toolbar.k] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.toolbar.AbstractC52410k invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119660a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.toolbar.k> r1 = com.p2082ss.android.ugc.aweme.ftc.components.toolbar.AbstractC52410k.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51931d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$e */
    public static final class C51932e extends AbstractC89220m implements AbstractC89171a<AbstractC52098a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119661a;

        static {
            Covode.recordClassIndex(61301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51932e(AbstractC21566a aVar) {
            super(0);
            this.f119661a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.effect.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.effect.AbstractC52098a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119661a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.effect.a> r1 = com.p2082ss.android.ugc.aweme.ftc.components.effect.AbstractC52098a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51932e.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$f */
    public static final class C51933f extends AbstractC89220m implements AbstractC89171a<AbstractC82200a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119662a;

        static {
            Covode.recordClassIndex(61302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51933f(AbstractC21566a aVar) {
            super(0);
            this.f119662a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.filter.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119662a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.core.a> r1 = com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51933f.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$g */
    public static final class C51934g extends AbstractC89220m implements AbstractC89171a<AbstractC52173a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119663a;

        static {
            Covode.recordClassIndex(61303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51934g(AbstractC21566a aVar) {
            super(0);
            this.f119663a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ftc.components.sticker.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.AbstractC52173a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119663a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.sticker.core.a> r1 = com.p2082ss.android.ugc.aweme.ftc.components.sticker.core.AbstractC52173a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51934g.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$h */
    public static final class C51935h extends AbstractC89220m implements AbstractC89171a<AbstractC82155c> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119664a;

        static {
            Covode.recordClassIndex(61304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51935h(AbstractC21566a aVar) {
            super(0);
            this.f119664a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.e.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119664a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.e.c> r1 = com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51935h.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$i */
    public static final class C51936i extends AbstractC89220m implements AbstractC89171a<AbstractC82254a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119665a;

        static {
            Covode.recordClassIndex(61305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51936i(AbstractC21566a aVar) {
            super(0);
            this.f119665a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.gesture.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.gesture.AbstractC82254a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119665a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.gesture.a> r1 = com.p2082ss.android.ugc.gamora.editor.gesture.AbstractC82254a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51936i.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$j */
    public static final class C51937j extends AbstractC89220m implements AbstractC89171a<AbstractC82403a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119666a;

        static {
            Covode.recordClassIndex(61306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51937j(AbstractC21566a aVar) {
            super(0);
            this.f119666a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.multiedit.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119666a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.multiedit.a> r1 = com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51937j.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$k */
    public static final class C51938k extends AbstractC89220m implements AbstractC89171a<AbstractC52439a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119667a;

        static {
            Covode.recordClassIndex(61307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51938k(AbstractC21566a aVar) {
            super(0);
            this.f119667a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.ftc.components.volume.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.volume.AbstractC52439a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119667a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.volume.a> r1 = com.p2082ss.android.ugc.aweme.ftc.components.volume.AbstractC52439a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51938k.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$l */
    public static final class C51939l extends AbstractC89220m implements AbstractC89171a<AbstractC52016c> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119668a;

        static {
            Covode.recordClassIndex(61308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51939l(AbstractC21566a aVar) {
            super(0);
            this.f119668a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.audiorecord.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.AbstractC52016c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119668a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.audiorecord.c> r1 = com.p2082ss.android.ugc.aweme.ftc.components.audiorecord.AbstractC52016c.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51939l.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$m */
    public static final class C51940m extends AbstractC89220m implements AbstractC89171a<AbstractC51986e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f119669a;

        static {
            Covode.recordClassIndex(61309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51940m(AbstractC21566a aVar) {
            super(0);
            this.f119669a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.ftc.components.audioeffect.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.AbstractC51986e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f119669a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.ftc.components.audioeffect.e> r1 = com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.AbstractC51986e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51940m.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab
    /* renamed from: T */
    public final AbstractC70977bq mo87631T() {
        AbstractC70977bq bqVar = this.f119612C;
        if (bqVar == null) {
            C89219l.m154710a("mVideoSizeProvider");
        }
        return bqVar;
    }

    /* renamed from: U */
    public final AbstractC31071f mo87632U() {
        return mo87625N().mo114778C().getValue();
    }

    /* renamed from: V */
    public final void mo87633V() {
        ProgressDialogC81636a aVar = this.f119613D;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f119613D = null;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        C21582f b = C2552c.m7464b(this);
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        C73964ar.f166038a.mo116394b();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$ai */
    static final class C51928ai extends AbstractC89220m implements AbstractC89171a<C52177c> {

        /* renamed from: a */
        final /* synthetic */ C51918a f119657a;

        static {
            Covode.recordClassIndex(61297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51928ai(C51918a aVar) {
            super(0);
            this.f119657a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52177c invoke() {
            AbstractC22219j a = this.f119657a.mo36386a("FTCEditStickerScene");
            if (a == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: ag */
    private final void m96620ag() {
        mo87625N().mo114805a((AbstractC72510a) false, false, false);
        m96621ah();
        mo87626O().mo127493a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo87628Q() {
        VideoPublishEditModel videoPublishEditModel = this.f119618c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f119618c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel2.isRetakeVideo()) {
                m96620ag();
            }
        }
    }

    /* renamed from: S */
    public final void mo87630S() {
        mo87625N().mo114805a((AbstractC72510a) false, false, false);
        AbstractC52016c I = mo87620I();
        if (I != null) {
            I.mo87737a();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        C84911q.m145921a("VEVideoPublishEditActivity onResume EditRootScene");
        this.f119614E = false;
        C73964ar.f166038a.mo116393a(this.f52549m, (ViewGroup) this.f52550n);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$ac */
    public static final class CallableC51922ac implements Callable<Pair<Integer, C70625d>> {

        /* renamed from: a */
        final /* synthetic */ C51918a f119639a;

        /* renamed from: b */
        final /* synthetic */ String f119640b;

        /* renamed from: c */
        final /* synthetic */ int f119641c;

        /* renamed from: d */
        final /* synthetic */ int f119642d;

        /* renamed from: e */
        final /* synthetic */ boolean f119643e;

        static {
            Covode.recordClassIndex(61291);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Pair<Integer, C70625d> call() {
            AbstractC31071f U = this.f119639a.mo87632U();
            if (U == null) {
                return null;
            }
            int a = U.mo56284a(this.f119640b, this.f119641c, this.f119642d);
            U.mo56388t();
            if (a < 0 || !this.f119643e) {
                return new Pair(Integer.valueOf(a), null);
            }
            return new Pair(Integer.valueOf(a), C70612k.C70614b.m124758a(this.f119640b, true, null));
        }

        CallableC51922ac(C51918a aVar, String str, int i, int i2, boolean z) {
            this.f119639a = aVar;
            this.f119640b = str;
            this.f119641c = i;
            this.f119642d = i2;
            this.f119643e = z;
        }
    }

    /* renamed from: ac */
    private final void m96618ac() {
        if (this.f119613D == null) {
            ProgressDialogC81636a a = ProgressDialogC81636a.m141497a(this.f52549m, mo36486t().getResources().getString(R.string.etx));
            if (a != null) {
                a.setIndeterminate(true);
            } else {
                a = null;
            }
            this.f119613D = a;
        }
    }

    /* renamed from: ad */
    private final void m96619ad() {
        VideoPublishEditModel videoPublishEditModel = this.f119618c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel.veAudioEffectParam = null;
        VideoPublishEditModel videoPublishEditModel2 = this.f119618c;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel2.veAudioRecorderParam = null;
        VideoPublishEditModel videoPublishEditModel3 = this.f119618c;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel3.mSelectedId = 0;
        VideoPublishEditModel videoPublishEditModel4 = this.f119618c;
        if (videoPublishEditModel4 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel4.mTimeEffect = null;
        VideoPublishEditModel videoPublishEditModel5 = this.f119618c;
        if (videoPublishEditModel5 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel5.mCurFilterIds = null;
        VideoPublishEditModel videoPublishEditModel6 = this.f119618c;
        if (videoPublishEditModel6 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel6.mSelectedFilterId = null;
    }

    /* renamed from: ah */
    private final void m96621ah() {
        mo87623L().mo127389e();
        AbstractC51986e J = mo87621J();
        if (J != null) {
            VideoPublishEditModel videoPublishEditModel = this.f119618c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            J.mo87698a(videoPublishEditModel);
        }
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
        C89219l.m154716b(a, "");
        ((EditEffectVideoModel) a).mo78632i().setValue(null);
        mo87636Y();
        m96619ad();
        VideoPublishEditModel videoPublishEditModel2 = this.f119618c;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel2.commentVideoModel != null) {
            VideoPublishEditModel videoPublishEditModel3 = this.f119618c;
            if (videoPublishEditModel3 == null) {
                C89219l.m154710a("mModel");
            }
            CommentVideoModel commentVideoModel = videoPublishEditModel3.commentVideoModel;
            if (commentVideoModel != null) {
                commentVideoModel.setStartTime(0);
            }
            VideoPublishEditModel videoPublishEditModel4 = this.f119618c;
            if (videoPublishEditModel4 == null) {
                C89219l.m154710a("mModel");
            }
            CommentVideoModel commentVideoModel2 = videoPublishEditModel4.commentVideoModel;
            if (commentVideoModel2 != null) {
                commentVideoModel2.setEndTime(0);
            }
        }
    }

    /* renamed from: R */
    public final void mo87629R() {
        String str;
        String str2;
        boolean aa = mo87646aa();
        if (aa) {
            new C17197a.C17200a(this.f52549m).mo27194b(R.string.bjb).mo27195b(R.string.bjc, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.bjd, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC51926ag(new DialogInterface$OnClickListenerC51943p(this, aa)), false).mo27193a().mo27184b().show();
        } else {
            mo87647b(aa);
        }
        boolean b = mo87626O().mo127497b();
        C84425b c = C71427b.m126147c();
        if (aa) {
            str = "1";
        } else {
            str = "0";
        }
        C84425b a = c.mo129406a("is_warn_shown", str);
        if (b) {
            str2 = "single";
        } else {
            str2 = "multiple";
        }
        C39162r.m79460a("click_video_trim", a.mo129406a("segment_type", str2).f188764a);
    }

    /* renamed from: Z */
    public final void mo87637Z() {
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditInfoStickerViewModel.class);
        C89219l.m154716b(a, "");
        EditInfoStickerViewModel editInfoStickerViewModel = (EditInfoStickerViewModel) a;
        AbstractC31071f U = mo87632U();
        if (U == null) {
            C89219l.m154715b();
        }
        Integer valueOf = Integer.valueOf(U.mo56246G());
        AbstractC31071f U2 = mo87632U();
        if (U2 == null) {
            C89219l.m154715b();
        }
        editInfoStickerViewModel.mo127917a(new C89378p<>(valueOf, Integer.valueOf(U2.mo56368j())));
    }

    /* renamed from: Y */
    public final boolean mo87636Y() {
        VideoPublishEditModel videoPublishEditModel = this.f119618c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel.mTimeEffect == null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f119618c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            if (C13617h.m24465a(videoPublishEditModel2.mEffectList)) {
                VideoPublishEditModel videoPublishEditModel3 = this.f119618c;
                if (videoPublishEditModel3 == null) {
                    C89219l.m154710a("mModel");
                }
                if (!videoPublishEditModel3.hasInfoStickers() && !mo87618G().mo87913N()) {
                    return false;
                }
            }
        }
        AbstractC52309a aVar = mo87618G().f120215i;
        if (aVar != null) {
            aVar.mo88059j();
        }
        mo87618G().mo87907H().mo87946e();
        ArrayList<EffectPointModel> r = mo87625N().mo114829r();
        C88271g<C88292p> p = mo87625N().mo114827p();
        if (!C13617h.m24465a(r)) {
            int size = r.size();
            int[] iArr = new int[size];
            String[] strArr = new String[r.size()];
            for (int i = 0; i < size; i++) {
                EffectPointModel effectPointModel = r.get(i);
                C89219l.m154716b(effectPointModel, "");
                iArr[i] = effectPointModel.getIndex();
                EffectPointModel effectPointModel2 = r.get(i);
                C89219l.m154716b(effectPointModel2, "");
                strArr[i] = effectPointModel2.getUuid();
            }
            p.setValue(C88292p.m153432b(iArr, strArr));
        }
        VideoPublishEditModel videoPublishEditModel4 = this.f119618c;
        if (videoPublishEditModel4 == null) {
            C89219l.m154710a("mModel");
        }
        if (C13617h.m24465a(videoPublishEditModel4.mEffectList)) {
            return true;
        }
        VideoPublishEditModel videoPublishEditModel5 = this.f119618c;
        if (videoPublishEditModel5 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel5.mEffectList.clear();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0.veAudioRecorderParam.getNeedOriginalSound() == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r0.getKey(), (java.lang.Object) "0")) != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0092  */
    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo87646aa() {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.mo87646aa():boolean");
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$o */
    public static final class C51942o implements AbstractC63264v.AbstractC63265a {

        /* renamed from: a */
        final /* synthetic */ C51918a f119670a;

        static {
            Covode.recordClassIndex(61311);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51942o(C51918a aVar) {
            this.f119670a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v.AbstractC63265a
        /* renamed from: a */
        public final void mo87657a(String[] strArr, int[] iArr) {
            if (strArr == null || iArr == null || strArr.length == 0 || iArr.length == 0) {
                Activity activity = this.f119670a.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                new C79459a(activity).mo123050a(R.string.awv).mo123053a();
            } else if (iArr[0] == 0) {
                this.f119670a.mo87630S();
            } else {
                Activity activity2 = this.f119670a.f52549m;
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                new C79459a(activity2).mo123050a(R.string.awv).mo123053a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$r */
    public static final class C51945r extends AbstractC14537a {

        /* renamed from: a */
        final /* synthetic */ C51918a f119678a;

        static {
            Covode.recordClassIndex(61314);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51945r(C51918a aVar) {
            this.f119678a = aVar;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: c */
        public final boolean mo23404c(MotionEvent motionEvent) {
            AbstractC52309a aVar = this.f119678a.mo87618G().f120215i;
            if (aVar != null) {
                return aVar.mo88060k();
            }
            return false;
        }
    }

    /* renamed from: a */
    private static Bundle m96614a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$z */
    static final class C51953z implements C71993c.AbstractC71996b {

        /* renamed from: a */
        public static final C51953z f119686a = new C51953z();

        static {
            Covode.recordClassIndex(61322);
        }

        C51953z() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c.AbstractC71996b
        /* renamed from: a */
        public final void mo78807a(String str) {
            C63244g.m114602a().mo73263I().mo101628a(str);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoPublishEditModel m96615a(C51918a aVar) {
        VideoPublishEditModel videoPublishEditModel = aVar.f119618c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        return videoPublishEditModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$v */
    static final class C51949v<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51918a f119682a;

        static {
            Covode.recordClassIndex(61318);
        }

        C51949v(C51918a aVar) {
            this.f119682a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C51918a aVar = this.f119682a;
            aVar.mo87642a(true);
            aVar.mo87622K().mo87833b();
            aVar.mo87625N().mo114805a((AbstractC72510a) true, false, true);
            this.f119682a.mo87637Z();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$w */
    static final class C51950w<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51918a f119683a;

        static {
            Covode.recordClassIndex(61319);
        }

        C51950w(C51918a aVar) {
            this.f119683a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C51918a aVar = this.f119683a;
            AbstractC52016c I = aVar.mo87620I();
            if (I != null) {
                I.mo87738b();
            }
            aVar.mo87625N().mo114805a((AbstractC72510a) true, false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$af */
    public static final class C51925af implements C70612k.AbstractC70617c {

        /* renamed from: a */
        final /* synthetic */ C51918a f119653a;

        /* renamed from: b */
        final /* synthetic */ int f119654b;

        static {
            Covode.recordClassIndex(61294);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.AbstractC70617c
        /* renamed from: a */
        public final void mo87655a(Object obj) {
            this.f119653a.mo87627P().mo87804a(this.f119654b);
            int a = C80418fa.m139406a(C51918a.m96615a(this.f119653a).mMusicPath);
            AbstractC52071a P = this.f119653a.mo87627P();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean");
            P.mo87805a((C70625d) obj, a);
        }

        C51925af(C51918a aVar, int i) {
            this.f119653a = aVar;
            this.f119654b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$s */
    static final class C51946s<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51918a f119679a;

        static {
            Covode.recordClassIndex(61315);
        }

        C51946s(C51918a aVar) {
            this.f119679a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            View c = this.f119679a.mo36475c(R.id.c7m);
            C89219l.m154716b(c, "");
            FrameLayout frameLayout = (FrameLayout) c;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C89219l.m154716b(num, "");
            marginLayoutParams.topMargin = num.intValue();
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo87650c(boolean z) {
        Integer num;
        mo87626O().mo127495a(z, true);
        VideoPublishEditModel videoPublishEditModel = this.f119618c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        if (curMultiEditVideoRecordData != null) {
            AbstractC31071f U = mo87632U();
            if (U != null) {
                num = Integer.valueOf(U.mo56368j());
            } else {
                num = null;
            }
            curMultiEditVideoRecordData.preVideoDuration = num.intValue();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$q */
    static final class C51944q<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C51918a f119673a;

        /* renamed from: b */
        final /* synthetic */ boolean f119674b;

        /* renamed from: c */
        final /* synthetic */ boolean f119675c;

        /* renamed from: d */
        final /* synthetic */ boolean f119676d;

        /* renamed from: e */
        final /* synthetic */ Runnable f119677e;

        static {
            Covode.recordClassIndex(61313);
        }

        C51944q(C51918a aVar, boolean z, boolean z2, boolean z3, Runnable runnable) {
            this.f119673a = aVar;
            this.f119674b = z;
            this.f119675c = z2;
            this.f119676d = z3;
            this.f119677e = runnable;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            this.f119673a.mo87633V();
            if (this.f119674b) {
                VideoPublishEditModel a = C51918a.m96615a(this.f119673a);
                new C70974bn("VEVideoPublishEditActivity");
                C43223c b = C70974bn.m125291b(a);
                C89219l.m154716b(b, "");
                b.f100886I = System.currentTimeMillis();
                C63244g.m114602a().mo73275c().mo101842a(b);
                C63244g.m114602a().mo73275c().mo101844a(b, false);
                if (!(this.f119673a.f52549m instanceof VEVideoPublishEditActivity)) {
                    return null;
                }
                Activity activity = this.f119673a.f52549m;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
                ((VEVideoPublishEditActivity) activity).mo87538j();
                return null;
            }
            this.f119673a.mo87648b(this.f119675c, this.f119676d, this.f119677e);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$t */
    static final class C51947t<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51918a f119680a;

        static {
            Covode.recordClassIndex(61316);
        }

        C51947t(C51918a aVar) {
            this.f119680a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C51918a aVar = this.f119680a;
            C52177c F = aVar.mo87618G();
            ViewGroup.MarginLayoutParams a = aVar.mo87625N().mo114795a();
            int b = aVar.mo87625N().mo114807b();
            int c = aVar.mo87625N().mo114810c();
            C89219l.m154721d(a, "");
            AbstractC52309a aVar2 = F.f120215i;
            if (aVar2 != null) {
                aVar2.mo88057h();
            }
            F.mo87907H().mo87940a(b, c, new int[]{a.leftMargin, a.topMargin, a.rightMargin, a.bottomMargin});
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: a */
    public final void mo87639a(C56724i iVar) {
        C89219l.m154721d(iVar, "");
        this.f119611B = iVar;
    }

    /* renamed from: b */
    public final void mo87647b(boolean z) {
        m96620ag();
        mo87650c(z);
        int b = mo87625N().mo114807b();
        int c = mo87625N().mo114810c();
        if (mo87632U() != null) {
            AbstractC31071f U = mo87632U();
            if (U == null) {
                C89219l.m154715b();
            }
            VESize a = U.mo56299a(b, c);
            if (a.width > 0 && a.height > 0) {
                C71428c.m126148a(b, c, a.width, a.height);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$ab */
    static final class C51921ab<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51918a f119638a;

        static {
            Covode.recordClassIndex(61290);
        }

        C51921ab(C51918a aVar) {
            this.f119638a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            LiveData<Boolean> c;
            C84911q.m145921a("receive FirstFrameVisible event in edit page");
            C51918a aVar = this.f119638a;
            ((AbstractC82254a) aVar.f119619d.getValue()).mo127430a();
            aVar.mo87623L().mo127384a();
            ((AbstractC82237a) aVar.f119617b.getValue()).mo127416a();
            aVar.mo36417e(aVar.mo62771E());
            aVar.mo87628Q();
            C51918a aVar2 = this.f119638a;
            aVar2.mo127624ap().mo127283k();
            VideoPublishEditModel videoPublishEditModel = aVar2.f119618c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            if (C70976bp.m125310f(videoPublishEditModel)) {
                C70835b.m125099a();
            }
            C51918a aVar3 = this.f119638a;
            aVar3.mo87625N().mo114792Q().observe(aVar3, new C51946s(aVar3));
            aVar3.mo87625N().mo120449X().observe(aVar3, new C51947t(aVar3));
            aVar3.mo87625N().mo114816e().observe(aVar3, new C51948u(aVar3));
            Activity activity = aVar3.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            C89219l.m154716b(a, "");
            ((EditEffectVideoModel) a).mo78634k().observe(aVar3, new C51949v(aVar3));
            AbstractC52016c I = aVar3.mo87620I();
            if (!(I == null || (c = I.mo87739c()) == null)) {
                c.observe(aVar3, new C51950w(aVar3));
            }
            aVar3.mo87626O().mo127498c().observe(aVar3, new C51951x(aVar3));
            aVar3.mo87619H().mo88154b().observe(aVar3, new C51952y(aVar3));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$u */
    static final class C51948u<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51918a f119681a;

        static {
            Covode.recordClassIndex(61317);
        }

        C51948u(C51918a aVar) {
            this.f119681a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C40970e.m82485a("receive prepare done event in edit page");
            C51918a aVar = this.f119681a;
            C84911q.m145921a("VEVideoPublishEditActivity initAllStickerModules");
            aVar.mo87618G().mo87908I();
            C52177c F = aVar.mo87618G();
            if (!F.f120217k) {
                AbstractC52309a aVar2 = F.f120215i;
                if (aVar2 != null) {
                    aVar2.mo88054e();
                }
                F.mo87909J();
                AbstractC52309a aVar3 = F.f120215i;
                if (aVar3 != null) {
                    aVar3.mo88045a(new C52177c.C52206u(F));
                }
                AbstractC52309a aVar4 = F.f120215i;
                if (aVar4 != null) {
                    aVar4.mo88047a(new C52177c.C52207v(F));
                }
                AbstractC52309a aVar5 = F.f120215i;
                if (aVar5 != null) {
                    aVar5.mo88048a(new C52177c.C52208w(F));
                }
                AbstractC52309a aVar6 = F.f120215i;
                if (aVar6 != null) {
                    aVar6.mo88044a(new C52177c.C52209x());
                }
                AbstractC52309a aVar7 = F.f120215i;
                if (aVar7 != null) {
                    aVar7.mo88042a(new C52177c.C52210y(F));
                }
                F.f120217k = true;
            }
            aVar.mo87619H().mo88150a(4, true);
            aVar.mo87619H().mo88150a(3, true);
            VideoPublishEditModel videoPublishEditModel = aVar.f119618c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel.isMultiVideoEdit()) {
                VideoPublishEditModel videoPublishEditModel2 = aVar.f119618c;
                if (videoPublishEditModel2 == null) {
                    C89219l.m154710a("mModel");
                }
                if (videoPublishEditModel2.isRetakeVideo()) {
                    aVar.mo87650c(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$x */
    static final class C51951x<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51918a f119684a;

        static {
            Covode.recordClassIndex(61320);
        }

        C51951x(C51918a aVar) {
            this.f119684a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
            if (r1 != r0.mo56368j()) goto L_0x0077;
         */
        @Override // androidx.lifecycle.AbstractC1214u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 205
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51951x.onChanged(java.lang.Object):void");
        }
    }

    public C51918a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f119616G = fVar;
        C75894b.m133079a();
        C75896c.m133081a();
        C75896c.m133082a(new C45830f());
    }

    /* renamed from: a */
    private final void m96616a(AbstractC52309a aVar) {
        C45995c a;
        String str;
        String effectId;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            List<C46239q> n = aVar.mo88063n();
            int size = n.size();
            for (int i = 0; i < size; i++) {
                TextStickerData data = n.get(i).getData();
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
                    if (i != n.size() - 1) {
                        sb.append(",");
                        sb2.append(",");
                    }
                }
            }
            VideoPublishEditModel videoPublishEditModel = this.f119618c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel.textTypes = sb.toString();
            VideoPublishEditModel videoPublishEditModel2 = this.f119618c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel2.textEffectIds = sb2.toString();
            return;
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f119618c;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel3.textTypes = "";
        VideoPublishEditModel videoPublishEditModel4 = this.f119618c;
        if (videoPublishEditModel4 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel4.textEffectIds = "";
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$ad */
    public static final class C51923ad implements AbstractC1729g<Pair<Integer, C70625d>, Void> {

        /* renamed from: a */
        final /* synthetic */ C51918a f119644a;

        /* renamed from: b */
        final /* synthetic */ String f119645b;

        /* renamed from: c */
        final /* synthetic */ boolean f119646c;

        /* renamed from: d */
        final /* synthetic */ int f119647d;

        /* renamed from: e */
        final /* synthetic */ int f119648e;

        static {
            Covode.recordClassIndex(61292);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1731i<Pair<Integer, C70625d>> iVar) {
            boolean z;
            C70625d dVar;
            this.f119644a.mo87633V();
            if (iVar == null) {
                return null;
            }
            Pair<Integer, C70625d> d = iVar.mo5545d();
            boolean z2 = false;
            if (iVar.mo5544c() || iVar.mo5539b()) {
                z = true;
            } else {
                z = false;
            }
            if (d == null || d.first == null || ((Number) d.first).intValue() < 0) {
                z2 = true;
            }
            if (z || z2) {
                new C79459a(this.f119644a.mo36483q()).mo123052a(this.f119644a.mo36476c_(R.string.dbs)).mo123053a();
                return null;
            }
            if (this.f119644a.mo87636Y()) {
                new C79459a(this.f119644a.mo36483q()).mo123052a(this.f119644a.mo36476c_(R.string.dbt)).mo123053a();
            }
            if (d != null) {
                dVar = (C70625d) d.second;
            } else {
                dVar = null;
            }
            AbstractC31071f U = this.f119644a.mo87632U();
            if (U == null) {
                return null;
            }
            int j = U.mo56368j();
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null || cVar.getShootDuration() <= 0) {
                this.f119644a.mo87627P().mo87804a(j);
            } else {
                int a = C80418fa.m139406a(this.f119645b);
                if (Math.abs(a - cVar.getShootDuration()) >= 1000) {
                    this.f119644a.mo87627P().mo87804a(Math.min(j, cVar.getShootDuration()));
                } else {
                    this.f119644a.mo87627P().mo87804a(Math.min(j, a));
                }
            }
            if (this.f119646c) {
                this.f119644a.mo87627P().mo87805a(dVar, this.f119647d);
            }
            Activity activity = this.f119644a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            C89219l.m154716b(a2, "");
            ((EditEffectVideoModel) a2).mo78627d().setValue(Integer.valueOf(j));
            int G = U.mo56246G();
            Activity activity2 = this.f119644a.f52549m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a3 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(EditInfoStickerViewModel.class);
            C89219l.m154716b(a3, "");
            ((EditInfoStickerViewModel) a3).mo127917a(new C89378p<>(Integer.valueOf(G), Integer.valueOf(j)));
            AbstractC1196i lifecycle = this.f119644a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a() == AbstractC1196i.EnumC1199b.RESUMED) {
                C1213t<C88296t> v = this.f119644a.mo87625N().mo114833v();
                v.setValue(C88296t.m153438b((long) this.f119648e));
                v.setValue(C88296t.m153435a());
            }
            if (!C83098t.m143514b(C51918a.m96615a(this.f119644a))) {
                this.f119644a.mo127624ap().mo127277a(C70976bp.m125302a(C51918a.m96615a(this.f119644a), this.f119645b));
            }
            return null;
        }

        C51923ad(C51918a aVar, String str, boolean z, int i, int i2) {
            this.f119644a = aVar;
            this.f119645b = str;
            this.f119646c = z;
            this.f119647d = i;
            this.f119648e = i2;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Object a = this.f119616G.mo35249a((Type) VideoPublishEditModel.class, (String) null);
        C89219l.m154716b(a, "");
        this.f119618c = (VideoPublishEditModel) a;
        Object a2 = this.f119616G.mo35249a((Type) AbstractC70977bq.class, (String) null);
        C89219l.m154716b(a2, "");
        this.f119612C = (AbstractC70977bq) a2;
        AbstractC14552j jVar = this.f119610A;
        if (jVar == null) {
            C89219l.m154710a("gestureService");
        }
        C83386w E = mo62771E();
        VideoPublishEditModel videoPublishEditModel = this.f119618c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        C52547a aVar = new C52547a(jVar, E, videoPublishEditModel);
        C89219l.m154721d(this, "");
        C2556g.m7472a(this, new C52547a.C52548a(aVar, this));
        C2551b bVar = new C2551b(C2552c.m7462a(this));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar.f7720a;
        alsLogicContainer.f7696d.mo35260a(C82255b.class, (String) null, (AbstractC21603p) new C52547a.C52557f(dVar, aVar, this));
        alsLogicContainer.mo7005a(EditGestureViewModel.class, C82255b.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C52057b.class, (String) null, (AbstractC21603p) new C52547a.C52558g(dVar2, aVar, this));
        alsLogicContainer2.mo7005a(FTCEditCornerViewModel.class, C52057b.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C52174b.class, (String) null, (AbstractC21603p) new C52547a.C52559h(dVar3, aVar, this));
        alsLogicContainer3.mo7005a(FTCEditStickerViewModel.class, C52174b.class);
        C2553d dVar4 = new C2553d();
        AlsLogicContainer alsLogicContainer4 = bVar.f7720a;
        alsLogicContainer4.f7696d.mo35260a(C82209c.class, (String) null, (AbstractC21603p) new C52547a.C52560i(dVar4, aVar, this));
        alsLogicContainer4.mo7005a(EditFilterViewModel.class, C82209c.class);
        C2553d dVar5 = new C2553d();
        AlsLogicContainer alsLogicContainer5 = bVar.f7720a;
        alsLogicContainer5.f7696d.mo35260a(C82239b.class, (String) null, (AbstractC21603p) new C52547a.C52561j(dVar5, aVar, this));
        alsLogicContainer5.mo7005a(EditFilterIndicatorViewModel.class, C82239b.class);
        C2553d dVar6 = new C2553d();
        AlsLogicContainer alsLogicContainer6 = bVar.f7720a;
        alsLogicContainer6.f7696d.mo35260a(C52434r.class, (String) null, (AbstractC21603p) new C52547a.C52562k(dVar6, aVar, this));
        alsLogicContainer6.mo7005a(FTCEditToolbarViewModel.class, C52434r.class);
        if (C70976bp.m125313i(aVar.f120982c)) {
            C2553d dVar7 = new C2553d();
            AlsLogicContainer alsLogicContainer7 = bVar.f7720a;
            alsLogicContainer7.f7696d.mo35260a(C52017d.class, (String) null, (AbstractC21603p) new C52547a.C52563l(dVar7, aVar, this));
            alsLogicContainer7.mo7005a(FTCEditAudioRecordViewModel.class, C52017d.class);
        }
        if (C70976bp.m125310f(aVar.f120982c)) {
            C2553d dVar8 = new C2553d();
            AlsLogicContainer alsLogicContainer8 = bVar.f7720a;
            alsLogicContainer8.f7696d.mo35260a(C51987f.class, (String) null, (AbstractC21603p) new C52547a.C52564m(dVar8, aVar, this));
            alsLogicContainer8.mo7005a(FTCEditAudioEffectViewModel.class, C51987f.class);
        }
        C2553d dVar9 = new C2553d();
        AlsLogicContainer alsLogicContainer9 = bVar.f7720a;
        alsLogicContainer9.f7696d.mo35260a(C52112b.class, (String) null, (AbstractC21603p) new C52547a.C52553b(dVar9, aVar, this));
        alsLogicContainer9.mo7005a(FTCEditEffectViewModel.class, C52112b.class);
        C2553d dVar10 = new C2553d();
        AlsLogicContainer alsLogicContainer10 = bVar.f7720a;
        alsLogicContainer10.f7696d.mo35260a(C52072b.class, (String) null, (AbstractC21603p) new C52547a.C52554c(dVar10, aVar, this));
        alsLogicContainer10.mo7005a(FTCEditMusicCutViewModel.class, C52072b.class);
        C2553d dVar11 = new C2553d();
        AlsLogicContainer alsLogicContainer11 = bVar.f7720a;
        alsLogicContainer11.f7696d.mo35260a(C51954a.class, (String) null, (AbstractC21603p) new C52547a.C52555d(dVar11, aVar, this));
        alsLogicContainer11.mo7005a(MultiEditViewModel.class, C51954a.class);
        C2553d dVar12 = new C2553d();
        AlsLogicContainer alsLogicContainer12 = bVar.f7720a;
        alsLogicContainer12.f7696d.mo35260a(C52440b.class, (String) null, (AbstractC21603p) new C52547a.C52556e(dVar12, aVar, this));
        alsLogicContainer12.mo7005a(FTCEditVolumeViewModel.class, C52440b.class);
        bVar.mo7031a();
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) activity;
        C21582f b = C2552c.m7464b(this);
        if (b == null) {
            C89219l.m154715b();
        }
        mo127617a(new C82546r(eVar, this, b));
        mo87624M().mo87899a();
        m96617ab().mo87792a();
        mo87628Q();
        mo87625N().mo114817f().observe(this, new C51921ab(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$y */
    static final class C51952y<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51918a f119685a;

        static {
            Covode.recordClassIndex(61321);
        }

        C51952y(C51918a aVar) {
            this.f119685a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
            if (r0.veAudioRecorderParam.hasRecord() == false) goto L_0x00dd;
         */
        @Override // androidx.lifecycle.AbstractC1214u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 715
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.C51918a.C51952y.onChanged(java.lang.Object):void");
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab
    /* renamed from: a */
    public final void mo87638a(StickerItemModel stickerItemModel) {
        C89219l.m154721d(stickerItemModel, "");
        if (C80720e.m139927b(stickerItemModel.path)) {
            VideoPublishEditModel videoPublishEditModel = this.f119618c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            if (!videoPublishEditModel.hasInfoStickers()) {
                VideoPublishEditModel videoPublishEditModel2 = this.f119618c;
                if (videoPublishEditModel2 == null) {
                    C89219l.m154710a("mModel");
                }
                VideoPublishEditModel videoPublishEditModel3 = this.f119618c;
                if (videoPublishEditModel3 == null) {
                    C89219l.m154710a("mModel");
                }
                videoPublishEditModel2.infoStickerModel = new InfoStickerModel(videoPublishEditModel3.draftDir());
            }
            int i = 1;
            VideoPublishEditModel videoPublishEditModel4 = this.f119618c;
            if (videoPublishEditModel4 == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel4.infoStickerModel.stickers.size() > 0) {
                VideoPublishEditModel videoPublishEditModel5 = this.f119618c;
                if (videoPublishEditModel5 == null) {
                    C89219l.m154710a("mModel");
                }
                for (StickerItemModel stickerItemModel2 : videoPublishEditModel5.infoStickerModel.stickers) {
                    C89219l.m154716b(stickerItemModel2, "");
                    if (C45939c.m88695a(stickerItemModel2) && stickerItemModel2.layerWeight > i) {
                        i = stickerItemModel2.layerWeight;
                    }
                }
            }
            stickerItemModel.layerWeight += i;
            VideoPublishEditModel videoPublishEditModel6 = this.f119618c;
            if (videoPublishEditModel6 == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel6.infoStickerModel.stickers.add(stickerItemModel);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$ag */
    public static final class DialogInterface$OnClickListenerC51926ag implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f119655a;

        static {
            Covode.recordClassIndex(61295);
        }

        DialogInterface$OnClickListenerC51926ag(DialogInterface.OnClickListener onClickListener) {
            this.f119655a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            DialogInterface.OnClickListener onClickListener = this.f119655a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.components.a$p */
    public static final class DialogInterface$OnClickListenerC51943p implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51918a f119671a;

        /* renamed from: b */
        final /* synthetic */ boolean f119672b;

        static {
            Covode.recordClassIndex(61312);
        }

        DialogInterface$OnClickListenerC51943p(C51918a aVar, boolean z) {
            this.f119671a = aVar;
            this.f119672b = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f119671a.mo87647b(this.f119672b);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        AbstractC14552j jVar = this.f119610A;
        if (jVar == null) {
            C89219l.m154710a("gestureService");
        }
        jVar.mo23383a(new C14544f(0, new C51945r(this)));
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asx, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        this.f119610A = C14536a.m26550a(context, (FrameLayout) viewGroup2.findViewById(R.id.aro));
        return viewGroup2;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: b */
    public final void mo87648b(boolean z, boolean z2, Runnable runnable) {
        AVChallenge aVChallenge;
        String str;
        if (this.f119614E) {
            C63244g.m114602a();
            C84911q.m145926b("DoubleGoPublishActivity VEVideoPublishEditActivity");
            C22708a.m42800a("DoubleGoPublishActivity VEVideoPublishEditActivity");
            if (SettingsManager.m29616a().mo25400a("is_block_error_go_publish", true)) {
                C84911q.m145926b("BlockErrorGoPublish");
                return;
            }
        }
        this.f119614E = true;
        Intent intent = new Intent();
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        Intent intent2 = t.getIntent();
        C89219l.m154716b(intent2, "");
        Bundle a = m96614a(intent2);
        if (a != null) {
            intent.putExtras(a);
        }
        VideoPublishEditModel videoPublishEditModel = this.f119618c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        C70005cr a2 = C70005cr.m123611a();
        C89219l.m154716b(a2, "");
        videoPublishEditModel.setMultiEditChallenges(a2.f156492l);
        VideoPublishEditModel videoPublishEditModel2 = this.f119618c;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel2.setMultiEditStickIds();
        VideoPublishEditModel videoPublishEditModel3 = this.f119618c;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel3.setMultiEditBeautyMetadatas();
        VideoPublishEditModel videoPublishEditModel4 = this.f119618c;
        if (videoPublishEditModel4 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel4.setMultiEditCameraLensInfo();
        ArrayList arrayList = new ArrayList();
        VideoPublishEditModel videoPublishEditModel5 = this.f119618c;
        if (videoPublishEditModel5 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel5.challenges == null) {
            C56724i iVar = this.f119611B;
            if (iVar == null) {
                C89219l.m154710a("stickerChallengeManager");
            }
            if (!iVar.mo93675c().isEmpty()) {
                C56724i iVar2 = this.f119611B;
                if (iVar2 == null) {
                    C89219l.m154710a("stickerChallengeManager");
                }
                arrayList.addAll(iVar2.mo93675c());
            }
        }
        VideoPublishEditModel videoPublishEditModel6 = this.f119618c;
        if (videoPublishEditModel6 == null) {
            C89219l.m154710a("mModel");
        }
        AudioEffectParam audioEffectParam = videoPublishEditModel6.veAudioEffectParam;
        if (audioEffectParam != null) {
            aVChallenge = audioEffectParam.getChallenge();
            if (aVChallenge != null) {
                VideoPublishEditModel videoPublishEditModel7 = this.f119618c;
                if (videoPublishEditModel7 == null) {
                    C89219l.m154710a("mModel");
                }
                if (C70976bp.m125312h(videoPublishEditModel7)) {
                    VideoPublishEditModel videoPublishEditModel8 = this.f119618c;
                    if (videoPublishEditModel8 == null) {
                        C89219l.m154710a("mModel");
                    }
                    if (videoPublishEditModel8.hasNotAudioRecord()) {
                        VideoPublishEditModel videoPublishEditModel9 = this.f119618c;
                        if (videoPublishEditModel9 == null) {
                            C89219l.m154710a("mModel");
                        }
                        C70835b.m125100a(videoPublishEditModel9);
                    }
                }
                arrayList.add(aVChallenge);
            }
        } else {
            aVChallenge = null;
        }
        VideoPublishEditModel videoPublishEditModel10 = this.f119618c;
        if (videoPublishEditModel10 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel10.challenges != null) {
            VideoPublishEditModel videoPublishEditModel11 = this.f119618c;
            if (videoPublishEditModel11 == null) {
                C89219l.m154710a("mModel");
            }
            arrayList.addAll(videoPublishEditModel11.challenges);
            C56724i iVar3 = this.f119611B;
            if (iVar3 == null) {
                C89219l.m154710a("stickerChallengeManager");
            }
            VideoPublishEditModel videoPublishEditModel12 = this.f119618c;
            if (videoPublishEditModel12 == null) {
                C89219l.m154710a("mModel");
            }
            List list = videoPublishEditModel12.challenges;
            C89219l.m154716b(list, "");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                String str2 = ((AVChallenge) obj).challengeName;
                if (aVChallenge == null || (str = aVChallenge.challengeName) == null) {
                    str = "";
                }
                if (!C89219l.m154714a((Object) str2, (Object) str)) {
                    arrayList2.add(obj);
                }
            }
            iVar3.mo93673a(arrayList2);
        }
        VideoPublishEditModel videoPublishEditModel13 = this.f119618c;
        if (videoPublishEditModel13 == null) {
            C89219l.m154710a("mModel");
        }
        C56724i iVar4 = this.f119611B;
        if (iVar4 == null) {
            C89219l.m154710a("stickerChallengeManager");
        }
        videoPublishEditModel13.stickerChallenge = iVar4.mo93671a();
        if (C70005cr.m123611a().f156482a != null) {
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null) {
                C89219l.m154715b();
            }
            AVChallenge aVChallenge2 = cVar.challenge;
            if (aVChallenge2 != null && !arrayList.contains(aVChallenge2)) {
                arrayList.add(aVChallenge2);
            }
        }
        VideoPublishEditModel videoPublishEditModel14 = this.f119618c;
        if (videoPublishEditModel14 == null) {
            C89219l.m154710a("mModel");
        }
        VideoPublishEditModel makeCopy = VideoPublishEditModel.makeCopy(videoPublishEditModel14);
        C77816g.m135934a(C72700q.m128164a(makeCopy), C72700q.m128165b(makeCopy), EnumC77814e.EDIT, EnumC77814e.PUBLISH);
        Objects.requireNonNull(makeCopy, "null cannot be cast to non-null type java.io.Serializable");
        intent.putExtra("args", (Serializable) makeCopy);
        C40970e.m82485a("GoPublishActivity from new edit page  newOne = ".concat(String.valueOf(makeCopy)));
        intent.putExtra("is_from_sys_share", z);
        intent.putExtra("challenge", arrayList);
        intent.putExtra("enter_record_from_other_platform", z2);
        Activity activity = this.f52549m;
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        boolean booleanExtra = activity.getIntent().getBooleanExtra("extra_enter_from_live", false);
        intent.putExtra("extra_enter_from_live", booleanExtra);
        Activity activity2 = this.f52549m;
        if (activity2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity2, "");
        intent.putExtra("edit_publish_session_end_together", activity2.getIntent().getBooleanExtra("edit_publish_session_end_together", false));
        int b = mo127624ap().mo127278b();
        if (b >= 0) {
            intent.putExtra("music_rec_type", b);
        }
        runnable.run();
        if (!C68338q.m120618a() || mo87632U() == null) {
            mo87643a(z2, booleanExtra, intent);
            return;
        }
        AbstractC31071f U = mo87632U();
        if (U != null) {
            U.mo56307a(new C51924ae(this, z2, booleanExtra, intent));
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: b */
    public final void mo87649b(boolean z, boolean z2, boolean z3, Runnable runnable) {
        AbstractC45898d dVar;
        C89219l.m154721d(runnable, "");
        C84911q.m145921a("VEVideoPublishEditActivity compileStickers");
        AbstractC52309a aVar = mo87618G().f120215i;
        m96616a(aVar);
        AbstractC31071f U = mo87632U();
        if (U == null) {
            C89219l.m154715b();
        }
        AbstractC70977bq bqVar = this.f119612C;
        if (bqVar == null) {
            C89219l.m154710a("mVideoSizeProvider");
        }
        AbstractC45898d[] dVarArr = new AbstractC45898d[2];
        dVarArr[0] = mo87618G().mo87907H().mo87949h();
        if (aVar != null) {
            dVar = aVar.mo88062m();
        } else {
            dVar = null;
        }
        dVarArr[1] = dVar;
        boolean a = C71532y.m126437a(U, bqVar, dVarArr);
        AbstractC70977bq bqVar2 = this.f119612C;
        if (bqVar2 == null) {
            C89219l.m154710a("mVideoSizeProvider");
        }
        bqVar2.mo112108a(a, false);
        long currentTimeMillis = System.currentTimeMillis();
        C52177c F = mo87618G();
        AbstractC31071f U2 = mo87632U();
        if (U2 == null) {
            C89219l.m154715b();
        }
        C1731i<Void> b = C1731i.m5638b((Collection<? extends C1731i<?>>) C89070n.m154516a(F.mo87917b(U2, this, (AbstractC89172b<? super String, String>) null)));
        C89219l.m154716b(b, "");
        if (!b.mo5535a()) {
            m96618ac();
            C1731i<Void> a2 = C1731i.m5631a(Math.max(0L, 500 - (System.currentTimeMillis() - currentTimeMillis)));
            C89219l.m154716b(a2, "");
            b = C1731i.m5638b((Collection<? extends C1731i<?>>) C89070n.m154522b(b, a2));
        }
        b.mo5534a(new C51944q(this, z, z2, z3, runnable), C1731i.f5564c, null);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82563s
    /* renamed from: a */
    public final void mo87641a(String str, int i, int i2, int i3, boolean z) {
        C89219l.m154721d(str, "");
        m96618ac();
        C1731i.m5640b(new CallableC51922ac(this, str, i, i2, z), C1731i.f5562a).mo5534a(new C51923ad(this, str, z, i3, i), C1731i.f5564c, null);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
