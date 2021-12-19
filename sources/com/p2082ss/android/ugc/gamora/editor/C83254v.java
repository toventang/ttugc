package com.p2082ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2554e;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
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
import com.bytedance.p1559o.C21597n;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14536a;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.p969f.p970a.p971a.p972a.AbstractC14537a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45898d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.editSticker.model.C45939c;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.als.AbstractC46036a;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2983c.C50649a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g;
import com.p2082ss.android.ugc.aweme.infoSticker.C56724i;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65332ab;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.p2082ss.android.ugc.aweme.setting.C68338q;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68093f;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69892bn;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71511n;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71532y;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AbstractC70859h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70835b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70860i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70892c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.C70893d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.AbstractC71002a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.C71003b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71494b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71427b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71428c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70935a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71692e;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71693f;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73233l;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73205b;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73211f;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73212g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78101b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80209ad;
import com.p2082ss.android.ugc.aweme.utils.C80285bz;
import com.p2082ss.android.ugc.aweme.utils.C80288ca;
import com.p2082ss.android.ugc.aweme.utils.C80357ds;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.editor.corner.AbstractC82088a;
import com.p2082ss.android.ugc.gamora.editor.corner.C82089b;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a;
import com.p2082ss.android.ugc.gamora.editor.cutmusic.C82105b;
import com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a;
import com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b;
import com.p2082ss.android.ugc.gamora.editor.filter.core.C82209c;
import com.p2082ss.android.ugc.gamora.editor.filter.core.C82211d;
import com.p2082ss.android.ugc.gamora.editor.filter.core.EnumC82234j;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a;
import com.p2082ss.android.ugc.gamora.editor.filter.indicator.C82239b;
import com.p2082ss.android.ugc.gamora.editor.gesture.AbstractC82254a;
import com.p2082ss.android.ugc.gamora.editor.gesture.C82255b;
import com.p2082ss.android.ugc.gamora.editor.lightening.canvas.C82394a;
import com.p2082ss.android.ugc.gamora.editor.lightening.p4281a.C82307a;
import com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.C82352e;
import com.p2082ss.android.ugc.gamora.editor.lightening.p4283c.C82388c;
import com.p2082ss.android.ugc.gamora.editor.lightening.p4284d.C82398b;
import com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a;
import com.p2082ss.android.ugc.gamora.editor.multiedit.C82404b;
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
import com.p2082ss.android.ugc.gamora.editor.music.C82428b;
import com.p2082ss.android.ugc.gamora.editor.music.C82455h;
import com.p2082ss.android.ugc.gamora.editor.p4274a.AbstractC82032d;
import com.p2082ss.android.ugc.gamora.editor.p4274a.C82028b;
import com.p2082ss.android.ugc.gamora.editor.p4274a.C82030c;
import com.p2082ss.android.ugc.gamora.editor.p4274a.C82033e;
import com.p2082ss.android.ugc.gamora.editor.p4275b.AbstractC82038a;
import com.p2082ss.android.ugc.gamora.editor.p4275b.C82039b;
import com.p2082ss.android.ugc.gamora.editor.p4276c.AbstractC82074b;
import com.p2082ss.android.ugc.gamora.editor.p4276c.C82080c;
import com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c;
import com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a;
import com.p2082ss.android.ugc.gamora.editor.progress.C82480b;
import com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a;
import com.p2082ss.android.ugc.gamora.editor.progressbar.C82529b;
import com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.C82614b;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.C82617c;
import com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.AbstractC82791h;
import com.p2082ss.android.ugc.gamora.editor.sticker.duet.AbstractC82814a;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.sticker.livecd.AbstractC82878a;
import com.p2082ss.android.ugc.gamora.editor.sticker.p4286a.C82566a;
import com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a;
import com.p2082ss.android.ugc.gamora.editor.sticker.panel.C82907b;
import com.p2082ss.android.ugc.gamora.editor.sticker.poll.AbstractC82957a;
import com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83076b;
import com.p2082ss.android.ugc.gamora.editor.subtitle.C83095f;
import com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s;
import com.p2082ss.android.ugc.gamora.editor.toolbar.C83131a;
import com.p2082ss.android.ugc.gamora.editor.toolbar.C83136ab;
import com.p2082ss.android.ugc.gamora.editor.toolbar.C83156ah;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a;
import com.p2082ss.android.ugc.gamora.editor.volume.C83370b;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VESize;
import dmt.p4542av.video.C88271g;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88296t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.gamora.editor.v */
public final class C83254v extends AbstractC82561d implements AbstractC20382b, AbstractC21566a, AbstractC82035ab, AbstractC82563s {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f185987b = {new C89232y(C83254v.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0)};

    /* renamed from: u */
    public static final C83257ab f185988u = new C83257ab((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f185989A = C89250i.m154774a(EnumC89331m.NONE, new C83356r(this));

    /* renamed from: B */
    private final AbstractC89244h f185990B = C89250i.m154774a(EnumC89331m.NONE, new C83357s(this));

    /* renamed from: C */
    private final AbstractC89244h f185991C = C89250i.m154774a(EnumC89331m.NONE, new C83342d(this));

    /* renamed from: D */
    private final AbstractC89244h f185992D = C89250i.m154774a(EnumC89331m.NONE, new C83343e(this));

    /* renamed from: E */
    private final AbstractC89248d f185993E = new C83256aa(this, this);

    /* renamed from: F */
    private final AbstractC89244h f185994F = C89250i.m154774a(EnumC89331m.NONE, new C83344f(this));

    /* renamed from: G */
    private final AbstractC89244h f185995G = C89250i.m154774a(EnumC89331m.NONE, new C83358t(this));

    /* renamed from: H */
    private final AbstractC89244h f185996H = C89250i.m154774a(EnumC89331m.NONE, new C83346h(this));

    /* renamed from: I */
    private final AbstractC89244h f185997I = C89250i.m154774a(EnumC89331m.NONE, new C83347i(this));

    /* renamed from: J */
    private final AbstractC89244h f185998J = C89250i.m154774a(EnumC89331m.NONE, new C83348j(this));

    /* renamed from: K */
    private final AbstractC89244h f185999K = C89250i.m154774a(EnumC89331m.NONE, new C83359u(this));

    /* renamed from: L */
    private final AbstractC89244h f186000L = C89250i.m154774a(EnumC89331m.NONE, new C83360v(this));

    /* renamed from: M */
    private final AbstractC89244h f186001M = C89250i.m154774a(EnumC89331m.NONE, new C83285b(this));

    /* renamed from: N */
    private final AbstractC89244h f186002N = C89250i.m154774a(EnumC89331m.NONE, new C83361w(this));

    /* renamed from: O */
    private final AbstractC89244h f186003O = C89250i.m154774a(EnumC89331m.NONE, new C83362x(this));

    /* renamed from: P */
    private final AbstractC89244h f186004P = C89250i.m154774a(EnumC89331m.NONE, new C83363y(this));

    /* renamed from: Q */
    private final AbstractC89244h f186005Q;

    /* renamed from: R */
    private C56724i f186006R;

    /* renamed from: S */
    private AbstractC70977bq f186007S;

    /* renamed from: T */
    private Dialog f186008T;

    /* renamed from: U */
    private boolean f186009U;

    /* renamed from: V */
    private final AbstractC89244h f186010V;

    /* renamed from: W */
    private final AbstractC89244h f186011W;

    /* renamed from: X */
    private final C21582f f186012X;

    /* renamed from: c */
    public VideoPublishEditModel f186013c;

    /* renamed from: d */
    final AbstractC89244h f186014d = C89250i.m154774a(EnumC89331m.NONE, new C83345g(this));

    /* renamed from: e */
    final AbstractC89244h f186015e = C89250i.m154774a(EnumC89331m.NONE, new C83349k(this));

    /* renamed from: f */
    final AbstractC89244h f186016f = C89250i.m154774a(EnumC89331m.NONE, new C83313c(this));

    /* renamed from: g */
    final AbstractC89244h f186017g = C89250i.m154774a(EnumC89331m.NONE, new C83364z(this));

    /* renamed from: h */
    public AbstractC14552j f186018h;

    /* renamed from: i */
    View f186019i;

    /* renamed from: j */
    public final C82028b f186020j;

    /* renamed from: k */
    boolean f186021k;

    /* renamed from: l */
    boolean f186022l;

    /* renamed from: t */
    final AbstractC89244h f186023t;

    /* renamed from: w */
    private final AbstractC89244h f186024w = C89250i.m154774a(EnumC89331m.NONE, new C83355q(this));

    /* renamed from: x */
    private final AbstractC89244h f186025x = C89250i.m154773a((AbstractC89171a) new C83339cs(this));

    /* renamed from: y */
    private final AbstractC89244h f186026y = C89250i.m154773a((AbstractC89171a) new C83340ct(this));

    /* renamed from: z */
    private final AbstractC89244h f186027z = C89250i.m154774a(EnumC89331m.NONE, new C83255a(this));

    static {
        Covode.recordClassIndex(97138);
    }

    /* renamed from: aq */
    private final AbstractC82088a m143655aq() {
        return (AbstractC82088a) this.f185997I.getValue();
    }

    /* renamed from: ar */
    private final EditToolbarViewModel m143656ar() {
        return (EditToolbarViewModel) this.f186011W.getValue();
    }

    /* renamed from: E */
    public final C83386w mo62771E() {
        return (C83386w) this.f186025x.getValue();
    }

    /* renamed from: F */
    public final C82617c mo87618G() {
        return (C82617c) this.f186026y.getValue();
    }

    /* renamed from: H */
    public final AbstractC83233s mo128326H() {
        return (AbstractC83233s) this.f186027z.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final AbstractC70892c mo128327I() {
        return (AbstractC70892c) this.f185989A.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final AbstractC70859h mo128328J() {
        return (AbstractC70859h) this.f185990B.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final AbstractC71002a mo128329K() {
        return (AbstractC71002a) this.f185991C.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final AbstractC82038a mo128330L() {
        return (AbstractC82038a) this.f185992D.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final AbstractC82427a mo128331M() {
        return (AbstractC82427a) this.f185993E.mo23374a(this, f185987b[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final AbstractC82200a mo128332N() {
        return (AbstractC82200a) this.f185994F.getValue();
    }

    /* renamed from: O */
    public final AbstractC82478a mo128333O() {
        return (AbstractC82478a) this.f185995G.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final AbstractC82610a mo128334P() {
        return (AbstractC82610a) this.f185996H.getValue();
    }

    /* renamed from: Q */
    public final AbstractC82155c mo128335Q() {
        return (AbstractC82155c) this.f185998J.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final AbstractC82403a mo128336R() {
        return (AbstractC82403a) this.f185999K.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final AbstractC82905a mo128337S() {
        return (AbstractC82905a) this.f186000L.getValue();
    }

    /* renamed from: U */
    public final AbstractC82104a mo128338U() {
        return (AbstractC82104a) this.f186001M.getValue();
    }

    /* renamed from: V */
    public final AbstractC83094e mo128339V() {
        return (AbstractC83094e) this.f186002N.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final AbstractC82032d mo128340Y() {
        return (AbstractC82032d) this.f186003O.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final AbstractC71692e mo128341Z() {
        return (AbstractC71692e) this.f186004P.getValue();
    }

    /* renamed from: ab */
    public final C73205b mo128345ab() {
        return (C73205b) this.f186010V.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: ae */
    public final void mo127620ae() {
        this.f186021k = false;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ab */
    public static final class C83257ab {
        static {
            Covode.recordClassIndex(97141);
        }

        private C83257ab() {
        }

        public /* synthetic */ C83257ab(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: W */
    public final boolean mo87634W() {
        return this.f186021k;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo128343a(boolean z) {
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel.isStickPointMode) {
            VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            if (!videoPublishEditModel2.mIsFromDraft) {
                new C79459a(this.f52549m).mo123050a(R.string.g4f).mo123053a();
                return;
            }
            return;
        }
        boolean z2 = false;
        mo128326H().mo128243a(false);
        C63253l.f143623a.mo73306b().mo101550i();
        AbstractC82427a M = mo128331M();
        if (M != null) {
            M.mo127542b(z);
        }
        mo128335Q().mo114805a((AbstractC72510a) false, false, false);
        C69905c cVar = C70005cr.m123611a().f156482a;
        boolean isMvThemeMusic = cVar != null ? cVar.isMvThemeMusic() : false;
        AbstractC82036ac ap = mo127624ap();
        VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("mModel");
        }
        if (C70976bp.m125317m(videoPublishEditModel3) && !isMvThemeMusic) {
            z2 = true;
        }
        ap.mo127277a(z2);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: a */
    public final void mo87644a(boolean z, boolean z2, Runnable runnable) {
        C89219l.m154721d(runnable, "");
        mo127618a(z, z2, runnable, (Runnable) null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: a */
    public final void mo127618a(boolean z, boolean z2, Runnable runnable, Runnable runnable2) {
        C89219l.m154721d(runnable, "");
        AbstractC31071f value = mo128335Q().mo114778C().getValue();
        if (value != null) {
            VideoPublishEditModel videoPublishEditModel = this.f186013c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel.getPreviewInfo().setPreviewVideoLength(value.mo56368j());
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel2.mIsFromDraft) {
            VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
            if (videoPublishEditModel3 == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel3.isDraftMusicIllegal && C70005cr.m123611a().f156482a != null) {
                VideoPublishEditModel videoPublishEditModel4 = this.f186013c;
                if (videoPublishEditModel4 == null) {
                    C89219l.m154710a("mModel");
                }
                videoPublishEditModel4.isDraftMusicIllegal = false;
            }
        }
        VideoPublishEditModel videoPublishEditModel5 = this.f186013c;
        if (videoPublishEditModel5 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel5.isMvThemeVideoType()) {
            m143658at();
            AbstractC31071f aj = mo128350aj();
            VideoPublishEditModel videoPublishEditModel6 = this.f186013c;
            if (videoPublishEditModel6 == null) {
                C89219l.m154710a("mModel");
            }
            String str = videoPublishEditModel6.mvCreateVideoData.videoCoverImgPath;
            VideoPublishEditModel videoPublishEditModel7 = this.f186013c;
            if (videoPublishEditModel7 == null) {
                C89219l.m154710a("mModel");
            }
            new C71993c(aj, str, videoPublishEditModel7.mvCreateVideoData.videoCoverStartTime, C83284az.f186067a, new C83286ba(this, z, z2, runnable, runnable2));
            return;
        }
        VideoPublishEditModel videoPublishEditModel8 = this.f186013c;
        if (videoPublishEditModel8 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel8.isMultiVideoEdit()) {
            VideoPublishEditModel videoPublishEditModel9 = this.f186013c;
            if (videoPublishEditModel9 == null) {
                C89219l.m154710a("mModel");
            }
            if (C71817eu.m126799j(videoPublishEditModel9)) {
                m143659au();
                AbstractC31071f aj2 = mo128350aj();
                VideoPublishEditModel videoPublishEditModel10 = this.f186013c;
                if (videoPublishEditModel10 == null) {
                    C89219l.m154710a("mModel");
                }
                String str2 = videoPublishEditModel10.multiEditVideoRecordData.coverImagePath;
                VideoPublishEditModel videoPublishEditModel11 = this.f186013c;
                if (videoPublishEditModel11 == null) {
                    C89219l.m154710a("mModel");
                }
                new C71993c(aj2, str2, (int) videoPublishEditModel11.getMultiEditVideoStartTime(), C83287bb.f186074a, new C83288bc(this, z, z2, runnable, runnable2));
                return;
            }
        }
        mo127619a(false, z, z2, runnable, runnable2);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: a */
    public final void mo87645a(boolean z, boolean z2, boolean z3, Runnable runnable) {
        C89219l.m154721d(runnable, "");
        mo87649b(z, z2, z3, runnable);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: a */
    public final void mo127619a(boolean z, boolean z2, boolean z3, Runnable runnable, Runnable runnable2) {
        C89219l.m154721d(runnable, "");
        mo128342a((Runnable) new RunnableC83264ai(this, runnable2, z, z2, z3, runnable), true);
    }

    /* renamed from: a */
    public final void mo128344a(boolean z, boolean z2, Intent intent) {
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel.mShoutOutsData == null) {
            Activity t = mo36486t();
            C89219l.m154716b(t, "");
            C82080c.m142102a(new AbstractC82074b.C82077c(z, z2, t, intent));
            return;
        }
        String str = C74418d.MODE_CREATE;
        VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("mModel");
        }
        if (!C89219l.m154714a((Object) str, (Object) videoPublishEditModel2.mShoutOutsData.getShoutOutsMode())) {
            String str2 = C74418d.MODE_EDIT;
            VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
            if (videoPublishEditModel3 == null) {
                C89219l.m154710a("mModel");
            }
            if (!C89219l.m154714a((Object) str2, (Object) videoPublishEditModel3.mShoutOutsData.getShoutOutsMode())) {
                String str3 = C74418d.MODE_SEND;
                VideoPublishEditModel videoPublishEditModel4 = this.f186013c;
                if (videoPublishEditModel4 == null) {
                    C89219l.m154710a("mModel");
                }
                if (C89219l.m154714a((Object) str3, (Object) videoPublishEditModel4.mShoutOutsData.getShoutOutsMode())) {
                    IShoutOutsService shoutOutsService = AVExternalServiceImpl.m113114a().shoutOutsService();
                    Activity t2 = mo36486t();
                    Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    ActivityC0945e eVar = (ActivityC0945e) t2;
                    VideoPublishEditModel videoPublishEditModel5 = this.f186013c;
                    if (videoPublishEditModel5 == null) {
                        C89219l.m154710a("mModel");
                    }
                    shoutOutsService.publishShoutOuts(eVar, videoPublishEditModel5);
                    return;
                }
                return;
            }
        }
        IShoutOutsService shoutOutsService2 = AVExternalServiceImpl.m113114a().shoutOutsService();
        Activity t3 = mo36486t();
        C89219l.m154716b(t3, "");
        shoutOutsService2.startShoutoutsPublishActivity(t3, intent);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ac */
    static final class C83258ac extends AbstractC89220m implements AbstractC89171a<C73205b> {

        /* renamed from: a */
        public static final C83258ac f186031a = new C83258ac();

        static {
            Covode.recordClassIndex(97142);
        }

        C83258ac() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C73205b invoke() {
            return new C73205b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ak */
    static final class C83266ak extends AbstractC89220m implements AbstractC89171a<C71511n> {

        /* renamed from: a */
        public static final C83266ak f186047a = new C83266ak();

        static {
            Covode.recordClassIndex(97150);
        }

        C83266ak() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71511n invoke() {
            return new C71511n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.v$cn */
    public static final class C83334cn extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186164a;

        /* renamed from: b */
        final /* synthetic */ C83333cm f186165b;

        static {
            Covode.recordClassIndex(97218);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83334cn(C83254v vVar, C83333cm cmVar) {
            super(0);
            this.f186164a = vVar;
            this.f186165b = cmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo128366a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo128366a() {
            int i;
            AVTextExtraStruct createQuestionStruct;
            CommentVideoModel commentVideoModel = C83254v.m143654a(this.f186164a).commentVideoModel;
            if (commentVideoModel != null) {
                StringBuilder a = this.f186165b.invoke("@" + commentVideoModel.getUserName());
                ArrayList arrayList = new ArrayList();
                String userName = commentVideoModel.getUserName();
                if (userName == null) {
                    userName = "";
                }
                int indexOf = a.indexOf(userName) - 1;
                int i2 = indexOf + 1;
                String userName2 = commentVideoModel.getUserName();
                if (userName2 != null) {
                    i = userName2.length();
                } else {
                    i = 0;
                }
                int i3 = i2 + i;
                String str = "0";
                if (commentVideoModel.isComment()) {
                    String userId = commentVideoModel.getUserId();
                    if (userId != null) {
                        str = userId;
                    }
                    createQuestionStruct = AVTextExtraStructHelper.createCommentStruct(indexOf, i3, str);
                } else {
                    String userId2 = commentVideoModel.getUserId();
                    if (userId2 != null) {
                        str = userId2;
                    }
                    createQuestionStruct = AVTextExtraStructHelper.createQuestionStruct(indexOf, i3, str);
                }
                arrayList.add(createQuestionStruct);
                if (C83254v.m143654a(this.f186164a).structList != null) {
                    for (AVTextExtraStruct aVTextExtraStruct : C83254v.m143654a(this.f186164a).structList) {
                        C89219l.m154716b(aVTextExtraStruct, "");
                        aVTextExtraStruct.setStart(aVTextExtraStruct.getStart() + a.toString().length());
                        aVTextExtraStruct.setEnd(aVTextExtraStruct.getEnd() + a.toString().length());
                    }
                    VideoPublishEditModel a2 = C83254v.m143654a(this.f186164a);
                    List list = C83254v.m143654a(this.f186164a).structList;
                    C89219l.m154716b(list, "");
                    a2.structList = C89070n.m154572d((Collection) arrayList, (Iterable) list);
                } else {
                    C83254v.m143654a(this.f186164a).structList = arrayList;
                }
                String sb = a.toString();
                VideoPublishEditModel a3 = C83254v.m143654a(this.f186164a);
                a3.title = C83254v.m143654a(this.f186164a).title != null ? sb + C83254v.m143654a(this.f186164a).title : sb;
                VideoPublishEditModel a4 = C83254v.m143654a(this.f186164a);
                if (C83254v.m143654a(this.f186164a).chain != null) {
                    sb = sb + C83254v.m143654a(this.f186164a).chain;
                }
                a4.chain = sb;
                C83254v.m143654a(this.f186164a).disableDeleteChain = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.v$co */
    public static final class C83335co extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186166a;

        /* renamed from: b */
        final /* synthetic */ C83333cm f186167b;

        static {
            Covode.recordClassIndex(97219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83335co(C83254v vVar, C83333cm cmVar) {
            super(0);
            this.f186166a = vVar;
            this.f186167b = cmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo128367a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo128367a() {
            int i;
            String str;
            if (C83254v.m143654a(this.f186166a).structList != null && C83254v.m143654a(this.f186166a).structList.size() != 0) {
                AVTextExtraStruct aVTextExtraStruct = null;
                List list = C83254v.m143654a(this.f186166a).structList;
                String str2 = "";
                C89219l.m154716b(list, str2);
                int size = list.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    AVTextExtraStruct aVTextExtraStruct2 = (AVTextExtraStruct) C83254v.m143654a(this.f186166a).structList.get(i4);
                    C89219l.m154716b(aVTextExtraStruct2, str2);
                    if (aVTextExtraStruct2.getSubType() == 2) {
                        i3 = i4;
                        aVTextExtraStruct = aVTextExtraStruct2;
                    }
                }
                if (aVTextExtraStruct != null) {
                    String str3 = C83254v.m143654a(this.f186166a).title;
                    C89219l.m154716b(str3, str2);
                    int start = aVTextExtraStruct.getStart();
                    int end = aVTextExtraStruct.getEnd();
                    Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                    String substring = str3.substring(start, end);
                    C89219l.m154716b(substring, str2);
                    int length = this.f186167b.invoke(substring).length();
                    List list2 = C83254v.m143654a(this.f186166a).structList;
                    C89219l.m154716b(list2, str2);
                    int size2 = list2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (i5 > i3) {
                            Object obj = C83254v.m143654a(this.f186166a).structList.get(i5);
                            C89219l.m154716b(obj, str2);
                            AVTextExtraStruct aVTextExtraStruct3 = (AVTextExtraStruct) obj;
                            aVTextExtraStruct3.setStart(aVTextExtraStruct3.getStart() - length);
                            Object obj2 = C83254v.m143654a(this.f186166a).structList.get(i5);
                            C89219l.m154716b(obj2, str2);
                            AVTextExtraStruct aVTextExtraStruct4 = (AVTextExtraStruct) obj2;
                            aVTextExtraStruct4.setEnd(aVTextExtraStruct4.getEnd() - length);
                        }
                    }
                    aVTextExtraStruct.getEnd();
                    aVTextExtraStruct.getStart();
                    try {
                        VideoPublishEditModel a = C83254v.m143654a(this.f186166a);
                        String str4 = C83254v.m143654a(this.f186166a).title;
                        if (str4 != null) {
                            i = str4.length();
                        } else {
                            i = 0;
                        }
                        if (i >= length) {
                            String str5 = C83254v.m143654a(this.f186166a).title;
                            C89219l.m154716b(str5, str2);
                            int end2 = (aVTextExtraStruct.getEnd() - length) + 1;
                            int end3 = aVTextExtraStruct.getEnd() + 1;
                            if (str5 != null) {
                                str = C89361p.m154892a(str5, end2, end3).toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            str = str2;
                        }
                        a.title = str;
                        VideoPublishEditModel a2 = C83254v.m143654a(this.f186166a);
                        String str6 = C83254v.m143654a(this.f186166a).chain;
                        if (str6 != null) {
                            i2 = str6.length();
                        }
                        if (i2 >= length) {
                            String str7 = C83254v.m143654a(this.f186166a).chain;
                            C89219l.m154716b(str7, str2);
                            int end4 = (aVTextExtraStruct.getEnd() - length) + 1;
                            int end5 = aVTextExtraStruct.getEnd() + 1;
                            if (str7 != null) {
                                str2 = C89361p.m154892a(str7, end4, end5).toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        }
                        a2.chain = str2;
                        C83254v.m143654a(this.f186166a).structList.remove(aVTextExtraStruct);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.v$cr */
    public static final class C83338cr extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186171a;

        /* renamed from: b */
        final /* synthetic */ C83336cp f186172b;

        static {
            Covode.recordClassIndex(97222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83338cr(C83254v vVar, C83336cp cpVar) {
            super(0);
            this.f186171a = vVar;
            this.f186172b = cpVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo128370a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo128370a() {
            int i;
            AVTextExtraStruct aVTextExtraStruct;
            Object obj;
            String str;
            String str2;
            int i2;
            int end;
            int i3;
            int end2;
            int i4;
            String str3;
            if (C83254v.m143654a(this.f186171a).structList != null && C83254v.m143654a(this.f186171a).structList.size() != 0) {
                List list = C83254v.m143654a(this.f186171a).structList;
                String str4 = "";
                C89219l.m154716b(list, str4);
                int size = list.size();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    i = R.string.f42;
                    if (i6 < size) {
                        aVTextExtraStruct = (AVTextExtraStruct) C83254v.m143654a(this.f186171a).structList.get(i6);
                        C89219l.m154716b(aVTextExtraStruct, str4);
                        if (aVTextExtraStruct.getSubType() == 5) {
                            i = R.string.f43;
                            break;
                        } else if (aVTextExtraStruct.getSubType() == 7) {
                            break;
                        } else {
                            i6++;
                        }
                    } else {
                        return;
                    }
                }
                String str5 = C83254v.m143654a(this.f186171a).title;
                C89219l.m154716b(str5, str4);
                int start = aVTextExtraStruct.getStart();
                int end3 = aVTextExtraStruct.getEnd();
                Objects.requireNonNull(str5, "null cannot be cast to non-null type java.lang.String");
                String substring = str5.substring(start, end3);
                C89219l.m154716b(substring, str4);
                int length = this.f186172b.mo128368a(substring, i).length();
                List list2 = C83254v.m143654a(this.f186171a).structList;
                C89219l.m154716b(list2, str4);
                int size2 = list2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    if (i7 > i6) {
                        Object obj2 = C83254v.m143654a(this.f186171a).structList.get(i7);
                        C89219l.m154716b(obj2, str4);
                        AVTextExtraStruct aVTextExtraStruct2 = (AVTextExtraStruct) obj2;
                        aVTextExtraStruct2.setStart(aVTextExtraStruct2.getStart() - length);
                        Object obj3 = C83254v.m143654a(this.f186171a).structList.get(i7);
                        C89219l.m154716b(obj3, str4);
                        AVTextExtraStruct aVTextExtraStruct3 = (AVTextExtraStruct) obj3;
                        aVTextExtraStruct3.setEnd(aVTextExtraStruct3.getEnd() - length);
                    }
                }
                try {
                    if (((aVTextExtraStruct.getEnd() + 1) + 1) - length < 0) {
                        i2 = 0;
                    } else {
                        i2 = ((aVTextExtraStruct.getEnd() + 1) + 1) - length;
                    }
                    if (aVTextExtraStruct.getEnd() + 1 > C83254v.m143654a(this.f186171a).title.length()) {
                        end = C83254v.m143654a(this.f186171a).title.length();
                    } else {
                        end = aVTextExtraStruct.getEnd() + 1;
                    }
                    if (i2 < C83254v.m143654a(this.f186171a).title.length()) {
                        VideoPublishEditModel a = C83254v.m143654a(this.f186171a);
                        String str6 = C83254v.m143654a(this.f186171a).title;
                        if (str6 != null) {
                            i4 = str6.length();
                        } else {
                            i4 = 0;
                        }
                        if (i4 >= length) {
                            String str7 = C83254v.m143654a(this.f186171a).title;
                            C89219l.m154716b(str7, str4);
                            if (str7 != null) {
                                str3 = C89361p.m154892a(str7, i2, end).toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            str3 = str4;
                        }
                        a.title = str3;
                    }
                    if (((aVTextExtraStruct.getEnd() + 1) + 1) - length < 0) {
                        i3 = 0;
                    } else {
                        i3 = ((aVTextExtraStruct.getEnd() + 1) + 1) - length;
                    }
                    if (aVTextExtraStruct.getEnd() + 1 > C83254v.m143654a(this.f186171a).chain.length()) {
                        end2 = C83254v.m143654a(this.f186171a).chain.length();
                    } else {
                        end2 = aVTextExtraStruct.getEnd() + 1;
                    }
                    if (i3 < C83254v.m143654a(this.f186171a).chain.length()) {
                        VideoPublishEditModel a2 = C83254v.m143654a(this.f186171a);
                        String str8 = C83254v.m143654a(this.f186171a).chain;
                        if (str8 != null) {
                            i5 = str8.length();
                        }
                        if (i5 >= length) {
                            String str9 = C83254v.m143654a(this.f186171a).chain;
                            C89219l.m154716b(str9, str4);
                            if (str9 != null) {
                                str4 = C89361p.m154892a(str9, i3, end2).toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        }
                        a2.chain = str4;
                    }
                    C83254v.m143654a(this.f186171a).structList.remove(aVTextExtraStruct);
                } catch (Exception unused) {
                    StringBuilder append = new StringBuilder("start: ").append(Integer.valueOf(aVTextExtraStruct.getStart())).append(" end: ").append(Integer.valueOf(aVTextExtraStruct.getEnd())).append(" chainLength ");
                    VideoPublishEditModel a3 = C83254v.m143654a(this.f186171a);
                    Object obj4 = "null";
                    if (a3 == null || (str2 = a3.chain) == null) {
                        obj = obj4;
                    } else {
                        obj = Integer.valueOf(str2.length());
                    }
                    StringBuilder append2 = append.append(obj).append("titleLength ");
                    VideoPublishEditModel a4 = C83254v.m143654a(this.f186171a);
                    if (!(a4 == null || (str = a4.title) == null)) {
                        obj4 = Integer.valueOf(str.length());
                    }
                    C84911q.m145922a("EditRootScene", append2.append(obj4).toString());
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82563s
    /* renamed from: X */
    public final void mo87635X() {
        mo128343a(false);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: af */
    public final void mo127621af() {
        super.mo127621af();
        this.f186022l = true;
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

    /* renamed from: com.ss.android.ugc.gamora.editor.v$a */
    public static final class C83255a extends AbstractC89220m implements AbstractC89171a<AbstractC83233s> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186028a;

        static {
            Covode.recordClassIndex(97139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83255a(AbstractC21566a aVar) {
            super(0);
            this.f186028a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.toolbar.s] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186028a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.toolbar.s> r1 = com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83255a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ag */
    public static final class C83262ag implements AbstractC73233l {

        /* renamed from: a */
        final /* synthetic */ C83254v f186037a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f186038b;

        static {
            Covode.recordClassIndex(97146);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73233l
        /* renamed from: a */
        public final void mo115769a() {
            this.f186038b.element.dismiss();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73233l
        /* renamed from: b */
        public final void mo115770b() {
            this.f186037a.mo128345ab().f164402a.storeBoolean("has_accept_caption_protocol_" + C69892bn.m123462a(C63244g.m114602a().mo73255A().mo93904c()), true);
            VideoPublishEditModel a = C83254v.m143654a(this.f186037a);
            C89219l.m154721d(a, "");
            C39162r.m79460a("caption_intro_accept", C70968bl.m125268d(a).f188764a);
            this.f186037a.mo127622ai();
        }

        C83262ag(C83254v vVar, C89233z.C89238e eVar) {
            this.f186037a = vVar;
            this.f186038b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$av */
    public static final class C83280av implements AbstractC56722g {

        /* renamed from: a */
        final /* synthetic */ C83254v f186062a;

        static {
            Covode.recordClassIndex(97164);
        }

        @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
        /* renamed from: L */
        public final void mo87911L() {
            this.f186062a.mo87618G().mo87911L();
        }

        @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
        /* renamed from: M */
        public final void mo87912M() {
            this.f186062a.mo87618G().mo87912M();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83280av(C83254v vVar) {
            this.f186062a = vVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56722g
        /* renamed from: a */
        public final void mo87916a(Effect effect, String str) {
            C89219l.m154721d(effect, "");
            this.f186062a.mo87618G().mo87916a(effect, str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$b */
    public static final class C83285b extends AbstractC89220m implements AbstractC89171a<AbstractC82104a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186068a;

        static {
            Covode.recordClassIndex(97169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83285b(AbstractC21566a aVar) {
            super(0);
            this.f186068a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186068a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.p2082ss.android.ugc.gamora.editor.cutmusic.AbstractC82104a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83285b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ba */
    static final class C83286ba implements AbstractC72004a {

        /* renamed from: a */
        final /* synthetic */ C83254v f186069a;

        /* renamed from: b */
        final /* synthetic */ boolean f186070b;

        /* renamed from: c */
        final /* synthetic */ boolean f186071c;

        /* renamed from: d */
        final /* synthetic */ Runnable f186072d;

        /* renamed from: e */
        final /* synthetic */ Runnable f186073e;

        static {
            Covode.recordClassIndex(97170);
        }

        C83286ba(C83254v vVar, boolean z, boolean z2, Runnable runnable, Runnable runnable2) {
            this.f186069a = vVar;
            this.f186070b = z;
            this.f186071c = z2;
            this.f186072d = runnable;
            this.f186073e = runnable2;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a
        /* renamed from: a */
        public final void mo87651a() {
            this.f186069a.mo127619a(false, this.f186070b, this.f186071c, this.f186072d, this.f186073e);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bc */
    static final class C83288bc implements AbstractC72004a {

        /* renamed from: a */
        final /* synthetic */ C83254v f186075a;

        /* renamed from: b */
        final /* synthetic */ boolean f186076b;

        /* renamed from: c */
        final /* synthetic */ boolean f186077c;

        /* renamed from: d */
        final /* synthetic */ Runnable f186078d;

        /* renamed from: e */
        final /* synthetic */ Runnable f186079e;

        static {
            Covode.recordClassIndex(97172);
        }

        C83288bc(C83254v vVar, boolean z, boolean z2, Runnable runnable, Runnable runnable2) {
            this.f186075a = vVar;
            this.f186076b = z;
            this.f186077c = z2;
            this.f186078d = runnable;
            this.f186079e = runnable2;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a
        /* renamed from: a */
        public final void mo87651a() {
            this.f186075a.mo127619a(false, this.f186076b, this.f186077c, this.f186078d, this.f186079e);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bg */
    public static final class C83292bg implements VEListener.AbstractC85247p {

        /* renamed from: a */
        final /* synthetic */ C83254v f186091a;

        /* renamed from: b */
        final /* synthetic */ boolean f186092b;

        /* renamed from: c */
        final /* synthetic */ boolean f186093c;

        /* renamed from: d */
        final /* synthetic */ Intent f186094d;

        static {
            Covode.recordClassIndex(97176);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85247p
        /* renamed from: a */
        public final void mo87653a() {
            this.f186091a.mo128344a(this.f186092b, this.f186093c, this.f186094d);
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85247p
        /* renamed from: b */
        public final void mo87654b() {
            this.f186091a.mo128344a(this.f186092b, this.f186093c, this.f186094d);
        }

        C83292bg(C83254v vVar, boolean z, boolean z2, Intent intent) {
            this.f186091a = vVar;
            this.f186092b = z;
            this.f186093c = z2;
            this.f186094d = intent;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$c */
    public static final class C83313c extends AbstractC89220m implements AbstractC89171a<AbstractC83369a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186134a;

        static {
            Covode.recordClassIndex(97197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83313c(AbstractC21566a aVar) {
            super(0);
            this.f186134a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.volume.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186134a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.volume.a> r1 = com.p2082ss.android.ugc.gamora.editor.volume.AbstractC83369a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83313c.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$cs */
    static final class C83339cs extends AbstractC89220m implements AbstractC89171a<C83386w> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186173a;

        static {
            Covode.recordClassIndex(97223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83339cs(C83254v vVar) {
            super(0);
            this.f186173a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83386w invoke() {
            C83386w wVar = new C83386w();
            this.f186173a.mo36387a(R.id.ase, wVar, "EditStickerDeleteScene");
            return wVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$d */
    public static final class C83342d extends AbstractC89220m implements AbstractC89171a<AbstractC71002a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186175a;

        static {
            Covode.recordClassIndex(97226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83342d(AbstractC21566a aVar) {
            super(0);
            this.f186175a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.edit.effect.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.AbstractC71002a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186175a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.effect.a> r1 = com.p2082ss.android.ugc.aweme.shortvideo.edit.effect.AbstractC71002a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83342d.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$e */
    public static final class C83343e extends AbstractC89220m implements AbstractC89171a<AbstractC82038a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186176a;

        static {
            Covode.recordClassIndex(97227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83343e(AbstractC21566a aVar) {
            super(0);
            this.f186176a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.b.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.p4275b.AbstractC82038a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186176a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.b.a> r1 = com.p2082ss.android.ugc.gamora.editor.p4275b.AbstractC82038a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83343e.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$f */
    public static final class C83344f extends AbstractC89220m implements AbstractC89171a<AbstractC82200a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186177a;

        static {
            Covode.recordClassIndex(97228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83344f(AbstractC21566a aVar) {
            super(0);
            this.f186177a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.filter.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186177a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.core.a> r1 = com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83344f.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$g */
    public static final class C83345g extends AbstractC89220m implements AbstractC89171a<AbstractC82237a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186178a;

        static {
            Covode.recordClassIndex(97229);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83345g(AbstractC21566a aVar) {
            super(0);
            this.f186178a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.filter.indicator.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186178a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.indicator.a> r1 = com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83345g.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$h */
    public static final class C83346h extends AbstractC89220m implements AbstractC89171a<AbstractC82610a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186179a;

        static {
            Covode.recordClassIndex(97230);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83346h(AbstractC21566a aVar) {
            super(0);
            this.f186179a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.core.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186179a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83346h.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$i */
    public static final class C83347i extends AbstractC89220m implements AbstractC89171a<AbstractC82088a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186180a;

        static {
            Covode.recordClassIndex(97231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83347i(AbstractC21566a aVar) {
            super(0);
            this.f186180a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.corner.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.corner.AbstractC82088a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186180a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.corner.a> r1 = com.p2082ss.android.ugc.gamora.editor.corner.AbstractC82088a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83347i.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$j */
    public static final class C83348j extends AbstractC89220m implements AbstractC89171a<AbstractC82155c> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186181a;

        static {
            Covode.recordClassIndex(97232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83348j(AbstractC21566a aVar) {
            super(0);
            this.f186181a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.e.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186181a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.e.c> r1 = com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83348j.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$k */
    public static final class C83349k extends AbstractC89220m implements AbstractC89171a<AbstractC82254a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186182a;

        static {
            Covode.recordClassIndex(97233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83349k(AbstractC21566a aVar) {
            super(0);
            this.f186182a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.gesture.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.gesture.AbstractC82254a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186182a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.gesture.a> r1 = com.p2082ss.android.ugc.gamora.editor.gesture.AbstractC82254a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83349k.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$r */
    public static final class C83356r extends AbstractC89220m implements AbstractC89171a<AbstractC70892c> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186193a;

        static {
            Covode.recordClassIndex(97240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83356r(AbstractC21566a aVar) {
            super(0);
            this.f186193a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70892c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186193a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c> r1 = com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord.AbstractC70892c.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83356r.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$s */
    public static final class C83357s extends AbstractC89220m implements AbstractC89171a<AbstractC70859h> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186194a;

        static {
            Covode.recordClassIndex(97241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83357s(AbstractC21566a aVar) {
            super(0);
            this.f186194a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AbstractC70859h invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186194a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h> r1 = com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AbstractC70859h.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83357s.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$t */
    public static final class C83358t extends AbstractC89220m implements AbstractC89171a<AbstractC82478a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186195a;

        static {
            Covode.recordClassIndex(97242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83358t(AbstractC21566a aVar) {
            super(0);
            this.f186195a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.progress.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186195a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progress.a> r1 = com.p2082ss.android.ugc.gamora.editor.progress.AbstractC82478a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83358t.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$u */
    public static final class C83359u extends AbstractC89220m implements AbstractC89171a<AbstractC82403a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186196a;

        static {
            Covode.recordClassIndex(97243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83359u(AbstractC21566a aVar) {
            super(0);
            this.f186196a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.multiedit.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186196a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.multiedit.a> r1 = com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83359u.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$v */
    public static final class C83360v extends AbstractC89220m implements AbstractC89171a<AbstractC82905a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186197a;

        static {
            Covode.recordClassIndex(97244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83360v(AbstractC21566a aVar) {
            super(0);
            this.f186197a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.panel.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186197a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.panel.a> r1 = com.p2082ss.android.ugc.gamora.editor.sticker.panel.AbstractC82905a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83360v.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$w */
    public static final class C83361w extends AbstractC89220m implements AbstractC89171a<AbstractC83094e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186198a;

        static {
            Covode.recordClassIndex(97245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83361w(AbstractC21566a aVar) {
            super(0);
            this.f186198a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.subtitle.e, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186198a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.subtitle.e> r1 = com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83361w.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$x */
    public static final class C83362x extends AbstractC89220m implements AbstractC89171a<AbstractC82032d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186199a;

        static {
            Covode.recordClassIndex(97246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83362x(AbstractC21566a aVar) {
            super(0);
            this.f186199a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.a.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.p4274a.AbstractC82032d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186199a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.a.d> r1 = com.p2082ss.android.ugc.gamora.editor.p4274a.AbstractC82032d.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83362x.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$y */
    public static final class C83363y extends AbstractC89220m implements AbstractC89171a<AbstractC71692e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186200a;

        static {
            Covode.recordClassIndex(97247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83363y(AbstractC21566a aVar) {
            super(0);
            this.f186200a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.editcut.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71692e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186200a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.editcut.e> r1 = com.p2082ss.android.ugc.aweme.shortvideo.editcut.AbstractC71692e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83363y.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$z */
    public static final class C83364z extends AbstractC89220m implements AbstractC89171a<AbstractC82503a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186201a;

        static {
            Covode.recordClassIndex(97248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83364z(AbstractC21566a aVar) {
            super(0);
            this.f186201a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.progressbar.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186201a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progressbar.a> r1 = com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83364z.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: as */
    private static boolean m143657as() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab
    /* renamed from: T */
    public final AbstractC70977bq mo87631T() {
        AbstractC70977bq bqVar = this.f186007S;
        if (bqVar == null) {
            C89219l.m154710a("mVideoSizeProvider");
        }
        return bqVar;
    }

    /* renamed from: aj */
    public final AbstractC31071f mo128350aj() {
        return mo128335Q().mo114778C().getValue();
    }

    /* renamed from: ak */
    public final void mo128351ak() {
        Dialog dialog = this.f186008T;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f186008T = null;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: am */
    public final void mo127623am() {
        AbstractC71692e Z = mo128341Z();
        if (Z != null) {
            Z.mo113369a();
        }
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
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        C71494b.f160199a = 0;
        C71494b.f160200b = 0;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: x */
    public final void mo36491x() {
        super.mo36491x();
        C73964ar.f166038a.mo116394b();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ct */
    static final class C83340ct extends AbstractC89220m implements AbstractC89171a<C82617c> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186174a;

        static {
            Covode.recordClassIndex(97224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83340ct(C83254v vVar) {
            super(0);
            this.f186174a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82617c invoke() {
            AbstractC22219j a = this.f186174a.mo36386a("EditStickerScene");
            if (a == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$q */
    public static final class C83355q extends AbstractC89220m implements AbstractC89171a<EditInfoStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186192a;

        static {
            Covode.recordClassIndex(97239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83355q(C83254v vVar) {
            super(0);
            this.f186192a = vVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.v r0 = r2.f186192a
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.C20531t.m38716a(r0)
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel> r0 = com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.mo33800a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83355q.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: au */
    private final void m143659au() {
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null) {
            String str = multiEditVideoStatusRecordData.coverImagePath;
            if (str == null || str.length() == 0) {
                multiEditVideoStatusRecordData.coverImagePath = C71429d.m126154a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: aa */
    public final boolean mo87646aa() {
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (C70976bp.m125321q(videoPublishEditModel) || mo87618G().mo87913N()) {
            return true;
        }
        return false;
    }

    /* renamed from: ad */
    public final void mo128347ad() {
        mo128326H().mo128238a(4, false);
        AbstractC82905a S = mo128337S();
        if (S != null) {
            S.mo127989a((AbstractC82905a) true, (boolean) "click_button");
        }
        mo128335Q().mo114805a((AbstractC72510a) false, false, false);
        C71529w.m126422b("sticker");
    }

    /* renamed from: ah */
    public final void mo128349ah() {
        mo128335Q().mo114805a((AbstractC72510a) false, false, false);
        AbstractC70892c I = mo128327I();
        if (I != null) {
            I.mo112052a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ao */
    public final void mo128354ao() {
        AbstractC82403a R = mo128336R();
        if (R != null) {
            mo128335Q().mo114805a((AbstractC72510a) false, false, false);
            m143663ay();
            R.mo127493a();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: o */
    public final void mo36481o() {
        super.mo36481o();
        AbstractC83094e V = mo128339V();
        if (V != null) {
            V.mo128170g();
        }
        C63253l.f143623a.mo73306b().mo101553l().mo101611d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.v$ax */
    public static final class C83282ax<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C83254v f186064a;

        /* renamed from: b */
        final /* synthetic */ Runnable f186065b;

        static {
            Covode.recordClassIndex(97166);
        }

        C83282ax(C83254v vVar, Runnable runnable) {
            this.f186064a = vVar;
            this.f186065b = runnable;
        }

        /* renamed from: a */
        private Void m143738a() {
            try {
                this.f186064a.mo128351ak();
                this.f186064a.mo87618G().mo127712a(false);
                Runnable runnable = this.f186065b;
                if (runnable == null) {
                    return null;
                }
                runnable.run();
                return null;
            } catch (Throwable th) {
                C84911q.m145926b("Crash happens in edit -> publish: " + C78101b.m136519a(th));
                C22708a.m42803a(th, "edit -> publish");
                return null;
            }
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            return m143738a();
        }
    }

    /* renamed from: at */
    private final void m143658at() {
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (TextUtils.isEmpty(videoPublishEditModel.mvCreateVideoData.videoCoverImgPath)) {
            VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath = C63253l.f143623a.mo73308d().mo101651a().mo101653a();
        }
    }

    /* renamed from: aw */
    private final void m143661aw() {
        if (this.f186008T == null) {
            Activity t = mo36486t();
            C89219l.m154716b(t, "");
            ProgressDialogC81146b a = ProgressDialogC81146b.C81148b.m140902a(t);
            a.setMessage(mo36476c_(R.string.etx));
            this.f186008T = a;
        }
        Dialog dialog = this.f186008T;
        if (dialog != null) {
            dialog.show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ac */
    public final void mo128346ac() {
        AbstractC82036ac rVar;
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (C70976bp.m125316l(videoPublishEditModel)) {
            Activity activity = this.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            rVar = new C82180f((ActivityC0945e) activity, this, getDiContainer());
        } else {
            Activity activity2 = this.f52549m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            rVar = new C82546r((ActivityC0945e) activity2, this, getDiContainer());
        }
        mo127617a(rVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ai */
    static final class RunnableC83264ai implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83254v f186040a;

        /* renamed from: b */
        final /* synthetic */ Runnable f186041b;

        /* renamed from: c */
        final /* synthetic */ boolean f186042c;

        /* renamed from: d */
        final /* synthetic */ boolean f186043d;

        /* renamed from: e */
        final /* synthetic */ boolean f186044e;

        /* renamed from: f */
        final /* synthetic */ Runnable f186045f;

        static {
            Covode.recordClassIndex(97148);
        }

        RunnableC83264ai(C83254v vVar, Runnable runnable, boolean z, boolean z2, boolean z3, Runnable runnable2) {
            this.f186040a = vVar;
            this.f186041b = runnable;
            this.f186042c = z;
            this.f186043d = z2;
            this.f186044e = z3;
            this.f186045f = runnable2;
        }

        public final void run() {
            Runnable runnable = this.f186041b;
            if (runnable != null) {
                runnable.run();
            } else if (this.f186042c) {
                VideoPublishEditModel a = C83254v.m143654a(this.f186040a);
                C43213k.m86181a("[saveDraft]: save draft creation id = " + a.creationId);
                new C70974bn("VEVideoPublishEditActivity");
                C43223c a2 = C70974bn.m125287a(a);
                C89219l.m154716b(a2, "");
                a2.f100886I = System.currentTimeMillis();
                C63244g.m114602a().mo73275c().mo101842a(a2);
                C63244g.m114602a().mo73275c().mo101844a(a2, false);
                if (this.f186040a.f52549m instanceof VEVideoPublishEditActivity) {
                    Activity activity = this.f186040a.f52549m;
                    Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
                    ((VEVideoPublishEditActivity) activity).mo87538j();
                }
            } else {
                this.f186040a.mo128356b(this.f186043d, this.f186044e, this.f186045f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$be */
    public static final class CallableC83290be implements Callable<Pair<Integer, C70625d>> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186081a;

        /* renamed from: b */
        final /* synthetic */ String f186082b;

        /* renamed from: c */
        final /* synthetic */ int f186083c;

        /* renamed from: d */
        final /* synthetic */ int f186084d;

        /* renamed from: e */
        final /* synthetic */ boolean f186085e;

        static {
            Covode.recordClassIndex(97174);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Pair<Integer, C70625d> call() {
            if (this.f186081a.mo128335Q().mo114778C().getValue() == null) {
                return null;
            }
            AbstractC31071f value = this.f186081a.mo128335Q().mo114778C().getValue();
            if (value == null) {
                C89219l.m154715b();
            }
            int a = value.mo56284a(this.f186082b, this.f186083c, this.f186084d);
            AbstractC31071f value2 = this.f186081a.mo128335Q().mo114778C().getValue();
            if (value2 == null) {
                C89219l.m154715b();
            }
            value2.mo56388t();
            if (a < 0 || !this.f186085e) {
                return new Pair(Integer.valueOf(a), null);
            }
            return new Pair(Integer.valueOf(a), C70612k.C70614b.m124758a(this.f186082b, true, null));
        }

        CallableC83290be(C83254v vVar, String str, int i, int i2, boolean z) {
            this.f186081a = vVar;
            this.f186082b = str;
            this.f186083c = i;
            this.f186084d = i2;
            this.f186085e = z;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$o */
    public static final class C83353o extends AbstractC89220m implements AbstractC89171a<EditStickerViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f186186a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f186187b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f186188c;

        static {
            Covode.recordClassIndex(97237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83353o(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f186186a = jVar;
            this.f186187b = cVar;
            this.f186188c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f186186a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f186188c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f186188c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f186187b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143754x84ce7cd4(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f186186a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f186187b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143754x84ce7cd4(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83353o.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_EditRootScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143754x84ce7cd4(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$p */
    public static final class C83354p extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f186189a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f186190b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f186191c;

        static {
            Covode.recordClassIndex(97238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83354p(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f186189a = jVar;
            this.f186190b = cVar;
            this.f186191c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f186189a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f186191c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f186191c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f186190b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m143755x98765055(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f186189a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f186190b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m143755x98765055(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83354p.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_gamora_editor_EditRootScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m143755x98765055(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: ag */
    public final void mo128348ag() {
        String str;
        String str2;
        AbstractC82403a R = mo128336R();
        if (R != null) {
            boolean aa = mo87646aa();
            if (aa) {
                new C17197a.C17200a(this.f52549m).mo27194b(R.string.bjb).mo27195b(R.string.bjc, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.bjd, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC83332cl(new DialogInterface$OnClickListenerC83261af(aa, this)), false).mo27193a().mo27184b().show();
            } else {
                mo128357c(aa);
            }
            boolean b = R.mo127497b();
            VideoPublishEditModel videoPublishEditModel = this.f186013c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            int k = C70968bl.m125279k(videoPublishEditModel);
            C84425b c = C71427b.m126147c();
            if (aa) {
                str = "1";
            } else {
                str = "0";
            }
            C84425b a = c.mo129406a("is_warn_shown", str).mo129403a("is_multi_content", k);
            if (b) {
                str2 = "single";
            } else {
                str2 = "multiple";
            }
            C39162r.m79460a("click_video_trim", a.mo129406a("segment_type", str2).f188764a);
        }
    }

    /* renamed from: an */
    public final void mo128353an() {
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(EditInfoStickerViewModel.class);
        C89219l.m154716b(a, "");
        EditInfoStickerViewModel editInfoStickerViewModel = (EditInfoStickerViewModel) a;
        AbstractC31071f aj = mo128350aj();
        if (aj == null) {
            C89219l.m154715b();
        }
        Integer valueOf = Integer.valueOf(aj.mo56246G());
        AbstractC31071f aj2 = mo128350aj();
        if (aj2 == null) {
            C89219l.m154715b();
        }
        editInfoStickerViewModel.mo127917a(new C89378p<>(valueOf, Integer.valueOf(aj2.mo56368j())));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: w */
    public final void mo36490w() {
        super.mo36490w();
        C84911q.m145921a("VEVideoPublishEditActivity onResume EditRootScene");
        this.f186009U = false;
        this.f186022l = false;
        this.f186021k = false;
        C73964ar.f166038a.mo116393a(this.f52549m, (ViewGroup) this.f52550n);
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (C80285bz.m139187a(videoPublishEditModel)) {
            VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            C89219l.m154721d(videoPublishEditModel2, "");
            if (!C80288ca.m139193a().getBoolean(videoPublishEditModel2.creationId, true)) {
                mo128326H().mo128237a(1);
                VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
                if (videoPublishEditModel3 == null) {
                    C89219l.m154710a("mModel");
                }
                C80285bz.m139185a(videoPublishEditModel3, true);
            }
        }
    }

    /* renamed from: ax */
    private final void m143662ax() {
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel.isDisableOriginalSound()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel2.resetVolume();
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel3.veAudioEffectParam = null;
        VideoPublishEditModel videoPublishEditModel4 = this.f186013c;
        if (videoPublishEditModel4 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel4.veAudioRecorderParam = null;
        VideoPublishEditModel videoPublishEditModel5 = this.f186013c;
        if (videoPublishEditModel5 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel5.mSelectedId = 0;
        VideoPublishEditModel videoPublishEditModel6 = this.f186013c;
        if (videoPublishEditModel6 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel6.mTimeEffect = null;
        VideoPublishEditModel videoPublishEditModel7 = this.f186013c;
        if (videoPublishEditModel7 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel7.mCurFilterIds = null;
        VideoPublishEditModel videoPublishEditModel8 = this.f186013c;
        if (videoPublishEditModel8 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel8.mSelectedFilterId = null;
        VideoPublishEditModel videoPublishEditModel9 = this.f186013c;
        if (videoPublishEditModel9 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel9.mSelectedFilterLabel = null;
        VideoPublishEditModel videoPublishEditModel10 = this.f186013c;
        if (videoPublishEditModel10 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel10.captionStruct = null;
        VideoPublishEditModel videoPublishEditModel11 = this.f186013c;
        if (videoPublishEditModel11 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel11.autoEnhanceOn = false;
        VideoPublishEditModel videoPublishEditModel12 = this.f186013c;
        if (videoPublishEditModel12 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel12.autoEnhanceType = 0;
        AbstractC83094e V = mo128339V();
        if (V != null) {
            V.mo128164a(null);
        }
        AbstractC83094e V2 = mo128339V();
        if (V2 != null) {
            V2.mo128168e();
        }
    }

    /* renamed from: ay */
    private final void m143663ay() {
        int i;
        mo128332N().mo127389e();
        AbstractC70859h J = mo128328J();
        if (J != null) {
            AbstractC82155c Q = mo128335Q();
            VideoPublishEditModel videoPublishEditModel = this.f186013c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            J.mo111997a(Q, videoPublishEditModel);
        }
        if (C65350at.m117036a()) {
            m143656ar().mo128252c(false);
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel2.autoEnhanceOn) {
            AbstractC83233s H = mo128326H();
            Activity activity = this.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            if (C65350at.m117036a()) {
                i = 2131230928;
            } else {
                i = 2131230929;
            }
            Drawable a = C0643b.m2369a(activity, i);
            if (a == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(a, "");
            VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
            if (videoPublishEditModel3 == null) {
                C89219l.m154710a("mModel");
            }
            H.mo128240a(new C83131a(a, videoPublishEditModel3.autoEnhanceOn, false));
            mo128330L().mo127285a(false);
        }
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) activity2, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
        C89219l.m154716b(a2, "");
        ((EditEffectVideoModel) a2).mo78632i().setValue(null);
        mo128352al();
        m143662ax();
        VideoPublishEditModel videoPublishEditModel4 = this.f186013c;
        if (videoPublishEditModel4 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel4.commentVideoModel != null) {
            VideoPublishEditModel videoPublishEditModel5 = this.f186013c;
            if (videoPublishEditModel5 == null) {
                C89219l.m154710a("mModel");
            }
            CommentVideoModel commentVideoModel = videoPublishEditModel5.commentVideoModel;
            if (commentVideoModel != null) {
                commentVideoModel.setStartTime(0);
            }
            VideoPublishEditModel videoPublishEditModel6 = this.f186013c;
            if (videoPublishEditModel6 == null) {
                C89219l.m154710a("mModel");
            }
            CommentVideoModel commentVideoModel2 = videoPublishEditModel6.commentVideoModel;
            if (commentVideoModel2 != null) {
                commentVideoModel2.setEndTime(0);
            }
        }
    }

    /* renamed from: av */
    private final void m143660av() {
        String userName;
        String userName2;
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = 0;
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        String str = "";
        if (videoPublishEditModel.structList != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            for (AVTextExtraStruct aVTextExtraStruct : videoPublishEditModel2.structList) {
                C89219l.m154716b(aVTextExtraStruct, str);
                if (aVTextExtraStruct.getSubType() == 2 || aVTextExtraStruct.getSubType() == 3) {
                    cVar.element = aVTextExtraStruct.getSubType();
                }
            }
        }
        QaStruct i = mo128334P().mo127686i();
        C83333cm cmVar = new C83333cm(this, cVar);
        C83334cn cnVar = new C83334cn(this, cmVar);
        C83335co coVar = new C83335co(this, cmVar);
        C83336cp cpVar = new C83336cp(this);
        C83337cq cqVar = new C83337cq(this, i);
        C83338cr crVar = new C83338cr(this, cpVar);
        VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel3.commentVideoModel != null) {
            VideoPublishEditModel videoPublishEditModel4 = this.f186013c;
            if (videoPublishEditModel4 == null) {
                C89219l.m154710a("mModel");
            }
            Boolean bool = videoPublishEditModel4.isCommentDeleted;
            C89219l.m154716b(bool, str);
            if (bool.booleanValue()) {
                VideoPublishEditModel videoPublishEditModel5 = this.f186013c;
                if (videoPublishEditModel5 == null) {
                    C89219l.m154710a("mModel");
                }
                if (videoPublishEditModel5.commentVideoModel.isCommentFromPanel()) {
                    if (cVar.element != 0) {
                        coVar.mo128367a();
                    }
                    VideoPublishEditModel videoPublishEditModel6 = this.f186013c;
                    if (videoPublishEditModel6 == null) {
                        C89219l.m154710a("mModel");
                    }
                    if (!videoPublishEditModel6.commentVideoModel.isCommentFromEditPanel()) {
                        VideoPublishEditModel videoPublishEditModel7 = this.f186013c;
                        if (videoPublishEditModel7 == null) {
                            C89219l.m154710a("mModel");
                        }
                        videoPublishEditModel7.commentVideoModel = null;
                    }
                } else if (cVar.element == 0) {
                    if (mo128334P().mo127686i() == null) {
                        crVar.mo128370a();
                        cnVar.mo128366a();
                    } else {
                        coVar.mo128367a();
                    }
                }
            } else if (cVar.element != 0) {
                VideoPublishEditModel videoPublishEditModel8 = this.f186013c;
                if (videoPublishEditModel8 == null) {
                    C89219l.m154710a("mModel");
                }
                Object obj = videoPublishEditModel8.structList.get(0);
                C89219l.m154716b(obj, str);
                String userId = ((AVTextExtraStruct) obj).getUserId();
                VideoPublishEditModel videoPublishEditModel9 = this.f186013c;
                if (videoPublishEditModel9 == null) {
                    C89219l.m154710a("mModel");
                }
                if (!C89219l.m154714a((Object) userId, (Object) videoPublishEditModel9.commentVideoModel.getUserId())) {
                    coVar.mo128367a();
                    if (mo128334P().mo127686i() == null) {
                        crVar.mo128370a();
                        cnVar.mo128366a();
                    }
                }
            } else if (mo128334P().mo127686i() == null) {
                cnVar.mo128366a();
            } else {
                coVar.mo128367a();
            }
        } else if (cVar.element != 0) {
            VideoPublishEditModel videoPublishEditModel10 = this.f186013c;
            if (videoPublishEditModel10 == null) {
                C89219l.m154710a("mModel");
            }
            Boolean bool2 = videoPublishEditModel10.isCommentDeleted;
            C89219l.m154716b(bool2, str);
            if (bool2.booleanValue()) {
                coVar.mo128367a();
            }
        }
        crVar.mo128370a();
        if (mo128334P().mo127686i() != null) {
            QaStruct i2 = mo128334P().mo127686i();
            if (i2 == null || i2.getQuestionId() == 0) {
                if (!(i == null || (userName = i.getUserName()) == null)) {
                    str = userName;
                }
                cqVar.mo128369a(cpVar.mo128368a(str, R.string.f43), 5);
                return;
            }
            if (!(i == null || (userName2 = i.getUserName()) == null)) {
                str = userName2;
            }
            cqVar.mo128369a(cpVar.mo128368a(str, R.string.f42), 7);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: ai */
    public final void mo127622ai() {
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (!videoPublishEditModel.hasOriginalAudio()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            if (!videoPublishEditModel2.hasRecord()) {
                new C79459a(mo36483q()).mo123050a(R.string.xt).mo123053a();
                return;
            }
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("mModel");
        }
        if (!videoPublishEditModel3.hasRecord()) {
            VideoPublishEditModel videoPublishEditModel4 = this.f186013c;
            if (videoPublishEditModel4 == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel4.voiceVolume == 0.0f) {
                new C79459a(mo36483q()).mo123050a(R.string.b71).mo123053a();
                return;
            }
        }
        if (!C16048b.m29633a().mo25421a(true, "tool_show_caption_license", true) || mo128345ab().f164402a.getBoolean("has_accept_caption_protocol_" + C69892bn.m123462a(C63244g.m114602a().mo73255A().mo93904c()), false)) {
            VideoPublishEditModel videoPublishEditModel5 = this.f186013c;
            if (videoPublishEditModel5 == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel5.isTimeEffectApply()) {
                new C17197a.C17200a(mo36486t()).mo27189a(R.string.xr).mo27194b(R.string.xq).mo27195b(R.string.bc3, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.f_7, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC83263ah(this), false).mo27193a().mo27184b().show();
                return;
            }
            mo128355b(false);
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m143657as();
            }
            if (!C58029j.f132253e) {
                new C79459a(mo36483q()).mo123052a(mo36476c_(R.string.xm)).mo123053a();
                return;
            }
            ((EditStickerViewModel) this.f186005Q.getValue()).mo127691n().setValue(true);
            AbstractC83094e V = mo128339V();
            if (V != null) {
                V.mo128166b();
            }
            mo128326H().mo128244b();
            return;
        }
        VideoPublishEditModel videoPublishEditModel6 = this.f186013c;
        if (videoPublishEditModel6 == null) {
            C89219l.m154710a("mModel");
        }
        C89219l.m154721d(videoPublishEditModel6, "");
        C39162r.m79460a("caption_intro_show", C70968bl.m125268d(videoPublishEditModel6).f188764a);
        Context s = mo36485s();
        C89219l.m154716b(s, "");
        C73212g gVar = new C73212g(s, (byte) 0);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new C23226a.C23227a().mo37816a(gVar).mo37812a(1).mo37821b((int) C13628n.m24520b(mo36485s(), 593.0f)).f55057a;
        gVar.setOnCaptionWelcomeViewCallback(new C83262ag(this, eVar));
        Activity t = mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        eVar.element.show(((ActivityC0945e) t).getSupportFragmentManager(), "caption_welcome");
    }

    /* renamed from: al */
    public final boolean mo128352al() {
        AbstractC82791h hVar;
        AbstractC82034aa aaVar;
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel.mTimeEffect == null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            if (C13617h.m24465a(videoPublishEditModel2.mEffectList)) {
                VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
                if (videoPublishEditModel3 == null) {
                    C89219l.m154710a("mModel");
                }
                if (!videoPublishEditModel3.hasInfoStickers() && !mo87618G().mo87913N()) {
                    return false;
                }
            }
        }
        C82617c F = mo87618G();
        F.mo127697Q().mo128024e();
        F.mo127699S().mo127885e();
        F.mo127698R().mo127959e();
        F.mo127701U().mo128047e();
        if (!(F.f184780k == null || (aaVar = F.f184780k) == null)) {
            aaVar.mo127256G();
        }
        C83076b bVar = F.f184784v;
        if (bVar != null) {
            bVar.mo128177C().mo112285d();
        }
        if (!(F.f184778i == null || (hVar = F.f184778i) == null)) {
            hVar.mo127753H();
        }
        C82468o oVar = F.f184782t;
        if (oVar != null) {
            ((AbstractC82018a) oVar).f183561b.mo112447r();
        }
        C82299l lVar = F.f184783u;
        if (lVar != null) {
            ((AbstractC82018a) lVar).f183561b.mo112447r();
        }
        AbstractC46036a aVar = F.f184754M;
        if (aVar != null) {
            aVar.mo77638m();
        }
        F.mo127721ai();
        mo87618G().mo127720ah();
        ArrayList<EffectPointModel> r = mo128335Q().mo114829r();
        C88271g<C88292p> p = mo128335Q().mo114827p();
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
        VideoPublishEditModel videoPublishEditModel4 = this.f186013c;
        if (videoPublishEditModel4 == null) {
            C89219l.m154710a("mModel");
        }
        if (C13617h.m24465a(videoPublishEditModel4.mEffectList)) {
            return true;
        }
        VideoPublishEditModel videoPublishEditModel5 = this.f186013c;
        if (videoPublishEditModel5 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel5.mEffectList.clear();
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ci */
    static final class C83322ci extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186150a;

        static {
            Covode.recordClassIndex(97206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83322ci(C83254v vVar) {
            super(1);
            this.f186150a = vVar;
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.v$ci$f */
        public static final class C83328f extends AbstractC21603p<AbstractC83397z> {

            /* renamed from: a */
            final /* synthetic */ C83322ci f186156a;

            static {
                Covode.recordClassIndex(97212);
            }

            /* renamed from: com.ss.android.ugc.gamora.editor.v$ci$f$a */
            public static final class C83329a implements AbstractC83397z {

                /* renamed from: a */
                final /* synthetic */ C83328f f186157a;

                static {
                    Covode.recordClassIndex(97213);
                }

                C83329a(C83328f fVar) {
                    this.f186157a = fVar;
                }

                @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC83397z
                /* renamed from: a */
                public final void mo128363a(Runnable runnable) {
                    C89219l.m154721d(runnable, "");
                    this.f186157a.f186156a.f186150a.mo128342a(runnable, true);
                }
            }

            public C83328f(C83322ci ciVar) {
                this.f186156a = ciVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC83397z get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C83329a(this);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.v$ci$a */
        public static final class C83323a extends AbstractC21603p<AbstractC14552j> {

            /* renamed from: a */
            final /* synthetic */ C83322ci f186151a;

            static {
                Covode.recordClassIndex(97207);
            }

            public C83323a(C83322ci ciVar) {
                this.f186151a = ciVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC14552j get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C83254v.m143664b(this.f186151a.f186150a);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.v$ci$b */
        public static final class C83324b extends AbstractC21603p<C83386w> {

            /* renamed from: a */
            final /* synthetic */ C83322ci f186152a;

            static {
                Covode.recordClassIndex(97208);
            }

            public C83324b(C83322ci ciVar) {
                this.f186152a = ciVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C83386w get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f186152a.f186150a.mo62771E();
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.v$ci$c */
        public static final class C83325c extends AbstractC21603p<C83254v> {

            /* renamed from: a */
            final /* synthetic */ C83322ci f186153a;

            static {
                Covode.recordClassIndex(97209);
            }

            public C83325c(C83322ci ciVar) {
                this.f186153a = ciVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C83254v get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f186153a.f186150a;
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.v$ci$d */
        public static final class C83326d extends AbstractC21603p<VideoPublishEditModel> {

            /* renamed from: a */
            final /* synthetic */ C83322ci f186154a;

            static {
                Covode.recordClassIndex(97210);
            }

            public C83326d(C83322ci ciVar) {
                this.f186154a = ciVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final VideoPublishEditModel get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C83254v.m143654a(this.f186154a.f186150a);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.v$ci$e */
        public static final class C83327e extends AbstractC21603p<AbstractC82036ac> {

            /* renamed from: a */
            final /* synthetic */ C83322ci f186155a;

            static {
                Covode.recordClassIndex(97211);
            }

            public C83327e(C83322ci ciVar) {
                this.f186155a = ciVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC82036ac get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f186155a.f186150a.mo127624ap();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC14552j.class, (String) null, (AbstractC21603p) new C83323a(this)), "");
            C21597n.C21600a a = nVar2.mo35260a(C83386w.class, (String) null, (AbstractC21603p) new C83324b(this));
            C89219l.m154716b(a, "");
            a.mo35263a(AbstractC45899e.class);
            C21597n.C21600a a2 = nVar2.mo35260a(C83254v.class, (String) null, (AbstractC21603p) new C83325c(this));
            C89219l.m154716b(a2, "");
            a2.mo35263a(AbstractC82035ab.class, AbstractC82563s.class);
            C89219l.m154716b(nVar2.mo35260a(VideoPublishEditModel.class, (String) null, (AbstractC21603p) new C83326d(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC82036ac.class, (String) null, (AbstractC21603p) new C83327e(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC83397z.class, (String) null, (AbstractC21603p) new C83328f(this)), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ad */
    public static final class C83259ad implements AbstractC63264v.AbstractC63265a {

        /* renamed from: a */
        final /* synthetic */ C83254v f186032a;

        static {
            Covode.recordClassIndex(97143);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83259ad(C83254v vVar) {
            this.f186032a = vVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v.AbstractC63265a
        /* renamed from: a */
        public final void mo87657a(String[] strArr, int[] iArr) {
            if (strArr == null || iArr == null || strArr.length == 0 || iArr.length == 0) {
                Activity activity = this.f186032a.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                new C79459a(activity).mo123050a(R.string.awv).mo123053a();
            } else if (iArr[0] == 0) {
                this.f186032a.mo128349ah();
            } else {
                Activity activity2 = this.f186032a.f52549m;
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                new C79459a(activity2).mo123050a(R.string.awv).mo123053a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$aj */
    public static final class C83265aj implements AbstractC82208b {

        /* renamed from: a */
        final /* synthetic */ C83254v f186046a;

        static {
            Covode.recordClassIndex(97149);
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88317a(String str) {
            C89219l.m154721d(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83265aj(C83254v vVar) {
            this.f186046a = vVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88315a(float f) {
            FilterBean filterBean;
            C50649a value = this.f186046a.mo128335Q().mo114821j().getValue();
            if (value != null && (filterBean = value.f116985b) != null) {
                AbstractC50706n value2 = this.f186046a.mo128335Q().mo114822k().getValue();
                if (value2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value2, "");
                AbstractC50706n nVar = value2;
                AbstractC50703k value3 = this.f186046a.mo128335Q().mo114823l().getValue();
                if (value3 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value3, "");
                C83254v.m143654a(this.f186046a).mSelectedFilterIntensity = ((float) nVar.mo86059a(filterBean, value3)) / 100.0f;
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88318a(boolean z, FilterBean filterBean) {
            this.f186046a.mo128335Q().mo114805a((AbstractC72510a) (!z), false, r1);
        }

        @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
        /* renamed from: a */
        public final void mo88316a(FilterBean filterBean, boolean z, Context context) {
            if (filterBean != null) {
                AbstractC50706n value = this.f186046a.mo128335Q().mo114822k().getValue();
                if (value == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value, "");
                AbstractC50706n nVar = value;
                AbstractC50703k value2 = this.f186046a.mo128335Q().mo114823l().getValue();
                if (value2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(value2, "");
                C83254v.m143654a(this.f186046a).mSelectedId = C50691c.m94985a(C63244g.m114602a().mo73290r().mo86006d().mo86071f(), filterBean);
                C83254v.m143654a(this.f186046a).mSelectedFilterId = String.valueOf(filterBean.getId());
                C83254v.m143654a(this.f186046a).mSelectedFilterLabel = filterBean.getEnName();
                C83254v.m143654a(this.f186046a).mSelectedFilterResId = filterBean.getResId();
                C83254v.m143654a(this.f186046a).mSelectedFilterIntensity = ((float) nVar.mo86059a(filterBean, value2)) / 100.0f;
                C80209ad.m139034a(context, String.valueOf(filterBean.getId()), 3);
                C63253l.f143623a.mo73310f().mo93769a(C83254v.m143654a(this.f186046a).getAvetParameter().getContentType(), "mid_page", filterBean.getEnName());
                if (z) {
                    C70968bl.m125259a(C83254v.m143654a(this.f186046a), "slide", filterBean.getEnName(), filterBean.getId());
                } else {
                    C70968bl.m125259a(C83254v.m143654a(this.f186046a), "click", filterBean.getEnName(), filterBean.getId());
                }
            } else {
                C83254v.m143654a(this.f186046a).mSelectedId = 0;
                C83254v.m143654a(this.f186046a).mSelectedFilterId = "";
                C83254v.m143654a(this.f186046a).mSelectedFilterLabel = "";
                C83254v.m143654a(this.f186046a).mSelectedFilterResId = "";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$al */
    public static final class C83267al extends AbstractC14537a {

        /* renamed from: a */
        final /* synthetic */ C83254v f186048a;

        static {
            Covode.recordClassIndex(97151);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83267al(C83254v vVar) {
            this.f186048a = vVar;
        }

        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: c */
        public final boolean mo23404c(MotionEvent motionEvent) {
            C82617c F = this.f186048a.mo87618G();
            AbstractC82957a Q = F.mo127697Q();
            if (Q.mo128031l()) {
                Q.mo128021b();
            }
            AbstractC82814a S = F.mo127699S();
            if (S.mo127890j()) {
                S.mo127882b();
            }
            AbstractC82878a R = F.mo127698R();
            if (R.mo127961g()) {
                R.mo127962h();
            }
            C82468o oVar = F.f184782t;
            if (oVar != null && ((AbstractC82018a) oVar).f183561b.mo112312a()) {
                ((AbstractC82018a) oVar).f183561b.mo112324n();
            }
            C82299l lVar = F.f184783u;
            if (lVar != null && ((AbstractC82018a) lVar).f183561b.mo112312a()) {
                ((AbstractC82018a) lVar).f183561b.mo112324n();
            }
            C83076b bVar = F.f184784v;
            if (bVar != null && bVar.mo128177C().mo112312a()) {
                bVar.mo128177C().mo112324n();
            }
            AbstractC46036a aVar = F.f184754M;
            if (aVar != null) {
                return aVar.mo77639n();
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$l */
    public static final class C83350l extends AbstractC21603p<C82388c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186183a;

        static {
            Covode.recordClassIndex(97234);
        }

        public C83350l(C2553d dVar) {
            this.f186183a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82388c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82388c(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$m */
    public static final class C83351m extends AbstractC21603p<C82033e> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186184a;

        static {
            Covode.recordClassIndex(97235);
        }

        public C83351m(C2553d dVar) {
            this.f186184a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82033e get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82033e(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$n */
    public static final class C83352n extends AbstractC21603p<C82039b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186185a;

        static {
            Covode.recordClassIndex(97236);
        }

        public C83352n(C2553d dVar) {
            this.f186185a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82039b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82039b(fVar);
        }
    }

    /* renamed from: a */
    private static Bundle m143653a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo128355b(boolean z) {
        m143655aq().mo127319a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.v$ay */
    public static final class C83283ay<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C83254v f186066a;

        static {
            Covode.recordClassIndex(97167);
        }

        C83283ay(C83254v vVar) {
            this.f186066a = vVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            this.f186066a.mo87618G().mo127721ai();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$az */
    static final class C83284az implements C71993c.AbstractC71996b {

        /* renamed from: a */
        public static final C83284az f186067a = new C83284az();

        static {
            Covode.recordClassIndex(97168);
        }

        C83284az() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c.AbstractC71996b
        /* renamed from: a */
        public final void mo78807a(String str) {
            C63244g.m114602a().mo73263I().mo101628a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bb */
    static final class C83287bb implements C71993c.AbstractC71996b {

        /* renamed from: a */
        public static final C83287bb f186074a = new C83287bb();

        static {
            Covode.recordClassIndex(97171);
        }

        C83287bb() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c.AbstractC71996b
        /* renamed from: a */
        public final void mo78807a(String str) {
            C63244g.m114602a().mo73263I().mo101628a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bh */
    public static final class C83293bh extends AbstractC21603p<C82089b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186095a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186096b;

        static {
            Covode.recordClassIndex(97177);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82089b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82089b(fVar, this.f186096b);
        }

        public C83293bh(C2553d dVar, C83254v vVar) {
            this.f186095a = dVar;
            this.f186096b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bi */
    public static final class C83294bi extends AbstractC21603p<C83156ah> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186097a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186098b;

        static {
            Covode.recordClassIndex(97178);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83156ah get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83156ah(fVar, this.f186098b);
        }

        public C83294bi(C2553d dVar, C83254v vVar) {
            this.f186097a = dVar;
            this.f186098b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bl */
    public static final class C83297bl extends AbstractC21603p<C82480b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186103a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186104b;

        static {
            Covode.recordClassIndex(97181);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82480b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82480b(fVar, this.f186104b);
        }

        public C83297bl(C2553d dVar, C83254v vVar) {
            this.f186103a = dVar;
            this.f186104b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bm */
    public static final class C83298bm extends AbstractC21603p<C82529b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186105a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186106b;

        static {
            Covode.recordClassIndex(97182);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82529b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82529b(fVar, this.f186106b);
        }

        public C83298bm(C2553d dVar, C83254v vVar) {
            this.f186105a = dVar;
            this.f186106b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bn */
    public static final class C83299bn extends AbstractC21603p<C70893d> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186107a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186108b;

        static {
            Covode.recordClassIndex(97183);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C70893d get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C70893d(fVar, this.f186108b);
        }

        public C83299bn(C2553d dVar, C83254v vVar) {
            this.f186107a = dVar;
            this.f186108b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bo */
    public static final class C83300bo extends AbstractC21603p<C70860i> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186109a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186110b;

        static {
            Covode.recordClassIndex(97184);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C70860i get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C70860i(fVar, this.f186110b);
        }

        public C83300bo(C2553d dVar, C83254v vVar) {
            this.f186109a = dVar;
            this.f186110b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bp */
    public static final class C83301bp extends AbstractC21603p<C71003b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186111a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186112b;

        static {
            Covode.recordClassIndex(97185);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C71003b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C71003b(fVar, this.f186112b);
        }

        public C83301bp(C2553d dVar, C83254v vVar) {
            this.f186111a = dVar;
            this.f186112b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bq */
    public static final class C83302bq extends AbstractC21603p<C82907b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186113a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186114b;

        static {
            Covode.recordClassIndex(97186);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82907b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82907b(fVar, this.f186114b);
        }

        public C83302bq(C2553d dVar, C83254v vVar) {
            this.f186113a = dVar;
            this.f186114b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$br */
    public static final class C83303br extends AbstractC21603p<C82105b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186115a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186116b;

        static {
            Covode.recordClassIndex(97187);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82105b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82105b(fVar, this.f186116b);
        }

        public C83303br(C2553d dVar, C83254v vVar) {
            this.f186115a = dVar;
            this.f186116b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bs */
    public static final class C83304bs extends AbstractC21603p<C82255b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186117a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186118b;

        static {
            Covode.recordClassIndex(97188);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82255b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82255b(fVar, this.f186118b);
        }

        public C83304bs(C2553d dVar, C83254v vVar) {
            this.f186117a = dVar;
            this.f186118b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bt */
    public static final class C83305bt extends AbstractC21603p<C83370b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186119a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186120b;

        static {
            Covode.recordClassIndex(97189);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83370b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83370b(fVar, this.f186120b);
        }

        public C83305bt(C2553d dVar, C83254v vVar) {
            this.f186119a = dVar;
            this.f186120b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bu */
    public static final class C83306bu extends AbstractC21603p<C83095f> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186121a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186122b;

        static {
            Covode.recordClassIndex(97190);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83095f get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83095f(fVar, this.f186122b);
        }

        public C83306bu(C2553d dVar, C83254v vVar) {
            this.f186121a = dVar;
            this.f186122b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bv */
    public static final class C83307bv extends AbstractC21603p<C82455h> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186123a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186124b;

        static {
            Covode.recordClassIndex(97191);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82455h get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82455h(fVar, this.f186124b);
        }

        public C83307bv(C2553d dVar, C83254v vVar) {
            this.f186123a = dVar;
            this.f186124b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bw */
    public static final class C83308bw extends AbstractC21603p<C82428b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186125a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186126b;

        static {
            Covode.recordClassIndex(97192);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82428b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82428b(fVar, this.f186126b);
        }

        public C83308bw(C2553d dVar, C83254v vVar) {
            this.f186125a = dVar;
            this.f186126b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bx */
    public static final class C83309bx extends AbstractC21603p<C71693f> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186127a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186128b;

        static {
            Covode.recordClassIndex(97193);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C71693f get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C71693f(fVar, this.f186128b);
        }

        public C83309bx(C2553d dVar, C83254v vVar) {
            this.f186127a = dVar;
            this.f186128b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$by */
    public static final class C83310by extends AbstractC21603p<C82404b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186129a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186130b;

        static {
            Covode.recordClassIndex(97194);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82404b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82404b(fVar, this.f186130b);
        }

        public C83310by(C2553d dVar, C83254v vVar) {
            this.f186129a = dVar;
            this.f186130b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$cb */
    public static final class C83315cb extends AbstractC21603p<C82614b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186137a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186138b;

        static {
            Covode.recordClassIndex(97199);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82614b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82614b(fVar, this.f186138b);
        }

        public C83315cb(C2553d dVar, C83254v vVar) {
            this.f186137a = dVar;
            this.f186138b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$cc */
    public static final class C83316cc extends AbstractC21603p<C83136ab> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186139a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186140b;

        static {
            Covode.recordClassIndex(97200);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83136ab get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83136ab(fVar, this.f186140b);
        }

        public C83316cc(C2553d dVar, C83254v vVar) {
            this.f186139a = dVar;
            this.f186140b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$cd */
    public static final class C83317cd extends AbstractC21603p<C82352e> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186141a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186142b;

        static {
            Covode.recordClassIndex(97201);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82352e get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82352e(fVar, this.f186142b, true);
        }

        public C83317cd(C2553d dVar, C83254v vVar) {
            this.f186141a = dVar;
            this.f186142b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$cf */
    public static final class C83319cf extends AbstractC21603p<C82398b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186145a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186146b;

        static {
            Covode.recordClassIndex(97203);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82398b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82398b(fVar, this.f186146b);
        }

        public C83319cf(C2553d dVar, C83254v vVar) {
            this.f186145a = dVar;
            this.f186146b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$cg */
    public static final class C83320cg extends AbstractC21603p<C82307a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186147a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186148b;

        static {
            Covode.recordClassIndex(97204);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82307a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82307a(fVar, this.f186148b);
        }

        public C83320cg(C2553d dVar, C83254v vVar) {
            this.f186147a = dVar;
            this.f186148b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ch */
    static final class C83321ch extends AbstractC89220m implements AbstractC89172b<C2554e, C89391z> {

        /* renamed from: a */
        public static final C83321ch f186149a = new C83321ch();

        static {
            Covode.recordClassIndex(97205);
        }

        C83321ch() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C2554e eVar) {
            C2554e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f7721a = C68093f.m120394a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoPublishEditModel m143654a(C83254v vVar) {
        VideoPublishEditModel videoPublishEditModel = vVar.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC14552j m143664b(C83254v vVar) {
        AbstractC14552j jVar = vVar.f186018h;
        if (jVar == null) {
            C89219l.m154710a("gestureService");
        }
        return jVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$aq */
    static final class C83275aq<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83254v f186057a;

        static {
            Covode.recordClassIndex(97159);
        }

        C83275aq(C83254v vVar) {
            this.f186057a = vVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C83254v vVar = this.f186057a;
            vVar.mo128355b(true);
            vVar.mo128329K().mo112156b();
            vVar.mo128335Q().mo114805a((AbstractC72510a) true, false, true);
            this.f186057a.mo128353an();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ar */
    static final class C83276ar<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83254v f186058a;

        static {
            Covode.recordClassIndex(97160);
        }

        C83276ar(C83254v vVar) {
            this.f186058a = vVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C83254v vVar = this.f186058a;
            AbstractC70892c I = vVar.mo128327I();
            if (I != null) {
                I.mo112053b();
            }
            vVar.mo128335Q().mo114805a((AbstractC72510a) true, false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$as */
    static final class C83277as<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83254v f186059a;

        static {
            Covode.recordClassIndex(97161);
        }

        C83277as(C83254v vVar) {
            this.f186059a = vVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C83254v vVar = this.f186059a;
            vVar.mo128355b(true);
            AbstractC83094e V = vVar.mo128339V();
            if (V != null) {
                V.mo128167c();
            }
            vVar.mo128335Q().mo114805a((AbstractC72510a) true, false, true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ca */
    public static final class C83314ca extends AbstractC21603p<C82566a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186135a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186136b;

        static {
            Covode.recordClassIndex(97198);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82566a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C83254v vVar = this.f186136b;
            return new C82566a(fVar, vVar, R.id.a_h, C83254v.m143654a(vVar));
        }

        public C83314ca(C2553d dVar, C83254v vVar) {
            this.f186135a = dVar;
            this.f186136b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ce */
    public static final class C83318ce extends AbstractC21603p<C82352e> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186143a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186144b;

        static {
            Covode.recordClassIndex(97202);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82352e get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82352e(fVar, this.f186144b, AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableNewMusicMarquee());
        }

        public C83318ce(C2553d dVar, C83254v vVar) {
            this.f186143a = dVar;
            this.f186144b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$cj */
    static final class C83330cj extends AbstractC89220m implements AbstractC89172b<C82211d, C89391z> {

        /* renamed from: a */
        public static final C83330cj f186158a = new C83330cj();

        static {
            Covode.recordClassIndex(97214);
        }

        C83330cj() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C82211d dVar) {
            C82211d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo127398a(EnumC82234j.Circle);
            dVar2.f183931b = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ae */
    static final class C83260ae extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f186033a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186034b;

        static {
            Covode.recordClassIndex(97144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83260ae(boolean z, C83254v vVar) {
            super(1);
            this.f186033a = z;
            this.f186034b = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            String str;
            String str2;
            C84425b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (this.f186034b.mo87646aa()) {
                str = "1";
            } else {
                str = "0";
            }
            bVar2.mo129406a("is_warn_shown", str);
            if (this.f186033a) {
                str2 = "single";
            } else {
                str2 = "multiple";
            }
            bVar2.mo129406a("segment_type", str2);
            bVar2.mo129403a("is_multi_content", C70968bl.m125279k(C83254v.m143654a(this.f186034b)));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$an */
    static final class C83269an<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83254v f186051a;

        static {
            Covode.recordClassIndex(97153);
        }

        C83269an(C83254v vVar) {
            this.f186051a = vVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            View c = this.f186051a.mo36475c(R.id.c7m);
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

    /* renamed from: com.ss.android.ugc.gamora.editor.v$au */
    static final class C83279au<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83254v f186061a;

        static {
            Covode.recordClassIndex(97163);
        }

        C83279au(C83254v vVar) {
            this.f186061a = vVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (C89219l.m154714a(obj, (Object) false)) {
                this.f186061a.mo87618G().mo127722aj();
                this.f186061a.mo87618G().mo127701U().mo128049g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bj */
    public static final class C83295bj extends AbstractC21603p<C82239b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186099a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186100b;

        static {
            Covode.recordClassIndex(97179);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82239b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82239b(fVar, this.f186100b, C63244g.m114602a().mo73290r().mo86005c().mo86019a(0), C63244g.m114602a().mo73290r().mo86006d());
        }

        public C83295bj(C2553d dVar, C83254v vVar) {
            this.f186099a = dVar;
            this.f186100b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bk */
    public static final class C83296bk extends AbstractC21603p<C82209c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186101a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186102b;

        static {
            Covode.recordClassIndex(97180);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82209c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C82209c(fVar, this.f186102b, C63244g.m114602a().mo73290r().mo86006d(), C63244g.m114602a().mo73290r().mo86007e(), new C83265aj(this.f186102b), C83330cj.f186158a);
        }

        public C83296bk(C2553d dVar, C83254v vVar) {
            this.f186101a = dVar;
            this.f186102b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bz */
    public static final class C83311bz extends AbstractC21603p<C82394a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f186131a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186132b;

        static {
            Covode.recordClassIndex(97195);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C82394a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            Activity t = this.f186132b.mo36486t();
            C89219l.m154716b(t, "");
            Intent intent = t.getIntent();
            C89219l.m154716b(intent, "");
            return new C82394a(intent, fVar, this.f186132b, new AbstractC89171a<AbstractC14552j>(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.C83254v.C83311bz.C833121 */

                /* renamed from: a */
                final /* synthetic */ C83311bz f186133a;

                static {
                    Covode.recordClassIndex(97196);
                }

                {
                    this.f186133a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC14552j invoke() {
                    return C83254v.m143664b(this.f186133a.f186132b);
                }
            });
        }

        public C83311bz(C2553d dVar, C83254v vVar) {
            this.f186131a = dVar;
            this.f186132b = vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ck */
    public static final class C83331ck implements C70612k.AbstractC70617c {

        /* renamed from: a */
        final /* synthetic */ C83254v f186159a;

        /* renamed from: b */
        final /* synthetic */ int f186160b;

        static {
            Covode.recordClassIndex(97215);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.AbstractC70617c
        /* renamed from: a */
        public final void mo87655a(Object obj) {
            this.f186159a.mo128338U().mo127331a(this.f186160b);
            int a = C80418fa.m139406a(C83254v.m143654a(this.f186159a).mMusicPath);
            AbstractC82104a U = this.f186159a.mo128338U();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean");
            U.mo127332a((C70625d) obj, a, 0);
        }

        C83331ck(C83254v vVar, int i) {
            this.f186159a = vVar;
            this.f186160b = i;
        }
    }

    /* renamed from: c */
    public final void mo128357c(boolean z) {
        mo128354ao();
        mo128358d(z);
        int b = mo128335Q().mo114807b();
        int c = mo128335Q().mo114810c();
        if (mo128350aj() != null) {
            AbstractC31071f aj = mo128350aj();
            if (aj == null) {
                C89219l.m154715b();
            }
            VESize a = aj.mo56299a(b, c);
            if (a.width > 0 && a.height > 0) {
                C71428c.m126148a(b, c, a.width, a.height);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo128358d(boolean z) {
        AbstractC82403a R = mo128336R();
        if (R != null) {
            R.mo127495a(z, true);
            VideoPublishEditModel videoPublishEditModel = this.f186013c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData == null) {
                C89219l.m154715b();
            }
            AbstractC31071f aj = mo128350aj();
            if (aj == null) {
                C89219l.m154715b();
            }
            curMultiEditVideoRecordData.preVideoDuration = aj.mo56368j();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$am */
    static final class C83268am<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC82032d f186049a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186050b;

        static {
            Covode.recordClassIndex(97152);
        }

        C83268am(AbstractC82032d dVar, C83254v vVar) {
            this.f186049a = dVar;
            this.f186050b = vVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (C83254v.m143654a(this.f186050b).realHasOriginalSound() || C70976bp.m125309e(C83254v.m143654a(this.f186050b))) {
                if (C70005cr.m123611a().f156482a != null) {
                    C82028b bVar = this.f186050b.f186020j;
                    C89219l.m154716b(bool, "");
                    bVar.f183586a.storeBoolean("double_track", bool.booleanValue());
                } else {
                    C82028b bVar2 = this.f186050b.f186020j;
                    C89219l.m154716b(bool, "");
                    bVar2.f183586a.storeBoolean("single_track", bool.booleanValue());
                }
            }
            this.f186050b.mo128326H().mo128256f();
            this.f186049a.mo127254c();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ao */
    static final class C83270ao<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83254v f186052a;

        static {
            Covode.recordClassIndex(97154);
        }

        C83270ao(C83254v vVar) {
            this.f186052a = vVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C83254v vVar = this.f186052a;
            vVar.mo87618G().mo127707a(vVar.mo128335Q().mo114795a(), vVar.mo128335Q().mo114807b(), vVar.mo128335Q().mo114810c());
            C83254v vVar2 = this.f186052a;
            int i = 0;
            if (C16048b.m29633a().mo25412a(true, "studio_black_layer_optimization", 0) == 2) {
                ViewGroup.MarginLayoutParams a = vVar2.mo128335Q().mo114795a();
                View view = vVar2.f186019i;
                if (view != null) {
                    if (a.topMargin != 0) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.v$cm */
    public static final class C83333cm extends AbstractC89220m implements AbstractC89172b<String, StringBuilder> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186162a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f186163b;

        static {
            Covode.recordClassIndex(97217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83333cm(C83254v vVar, C89233z.C89236c cVar) {
            super(1);
            this.f186162a = vVar;
            this.f186163b = cVar;
        }

        /* renamed from: a */
        public final StringBuilder invoke(String str) {
            int i;
            C89219l.m154721d(str, "");
            StringBuilder sb = new StringBuilder();
            CommentVideoModel commentVideoModel = C83254v.m143654a(this.f186162a).commentVideoModel;
            if ((commentVideoModel == null || !commentVideoModel.isComment()) && this.f186163b.element != 2) {
                i = R.string.d4;
            } else {
                i = R.string.alm;
            }
            String string = this.f186162a.mo36485s().getString(i, str);
            C89219l.m154716b(string, "");
            sb.append(string).append(" ");
            return sb;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: a */
    public final void mo87639a(C56724i iVar) {
        C89219l.m154721d(iVar, "");
        this.f186006R = iVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ap */
    static final class C83271ap<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83254v f186053a;

        static {
            Covode.recordClassIndex(97155);
        }

        C83271ap(C83254v vVar) {
            this.f186053a = vVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C40970e.m82485a("receive prepare done event in edit page");
            C83254v vVar = this.f186053a;
            C84911q.m145921a("VEVideoPublishEditActivity initAllStickerModules");
            vVar.mo87618G().mo127716ad();
            AbstractC82905a S = vVar.mo128337S();
            if (S != null) {
                S.mo127986a();
            }
            AbstractC82905a S2 = vVar.mo128337S();
            if (S2 != null) {
                S2.mo127987a(new C83280av(vVar));
            }
            vVar.mo87618G().mo127717ae();
            vVar.mo87618G().mo127718af();
            vVar.mo128326H().mo128238a(4, true);
            vVar.mo128326H().mo128238a(3, true);
            vVar.mo128326H().mo128238a(11, true);
            VideoPublishEditModel videoPublishEditModel = vVar.f186013c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel.isMultiVideoEdit()) {
                VideoPublishEditModel videoPublishEditModel2 = vVar.f186013c;
                if (videoPublishEditModel2 == null) {
                    C89219l.m154710a("mModel");
                }
                if (videoPublishEditModel2.isRetakeVideo()) {
                    vVar.mo128358d(false);
                }
            }
            AbstractC88979t.m154310b(C83254v.m143654a(this.f186053a)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143292d(C832721.f186054a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.C83254v.C83271ap.C832732 */

                /* renamed from: a */
                final /* synthetic */ C83271ap f186055a;

                static {
                    Covode.recordClassIndex(97157);
                }

                {
                    this.f186055a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    Integer num = (Integer) obj;
                    this.f186055a.f186053a.f186023t.getValue();
                    Context r = this.f186055a.f186053a.mo36484r();
                    if (r == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(r, "");
                    View view = this.f186055a.f186053a.f52550n;
                    C89219l.m154716b(view, "");
                    ViewParent parent = view.getParent();
                    Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    C89219l.m154716b(num, "");
                    num.intValue();
                    C89219l.m154721d(r, "");
                    C89219l.m154721d(parent, "");
                    C63244g.m114602a();
                }
            }, C832743.f186056a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$at */
    static final class C83278at<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83254v f186060a;

        static {
            Covode.recordClassIndex(97162);
        }

        C83278at(C83254v vVar) {
            this.f186060a = vVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
            if (r1 != r0.mo56368j()) goto L_0x00a4;
         */
        @Override // androidx.lifecycle.AbstractC1214u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 253
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83278at.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bf */
    public static final class C83291bf implements AbstractC1729g<Pair<Integer, C70625d>, Void> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186086a;

        /* renamed from: b */
        final /* synthetic */ String f186087b;

        /* renamed from: c */
        final /* synthetic */ boolean f186088c;

        /* renamed from: d */
        final /* synthetic */ int f186089d;

        /* renamed from: e */
        final /* synthetic */ int f186090e;

        static {
            Covode.recordClassIndex(97175);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x013e  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x01c9  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void then(p077b.C1731i<android.util.Pair<java.lang.Integer, com.p2082ss.android.ugc.aweme.shortvideo.C70625d>> r9) {
            /*
            // Method dump skipped, instructions count: 496
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83291bf.then(b.i):java.lang.Void");
        }

        C83291bf(C83254v vVar, String str, boolean z, int i, int i2) {
            this.f186086a = vVar;
            this.f186087b = str;
            this.f186088c = z;
            this.f186089d = i;
            this.f186090e = i2;
        }
    }

    public C83254v(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f186012X = fVar;
        AbstractC89277c a = C89204ab.m154669a(EditStickerViewModel.class);
        this.f186005Q = C89250i.m154773a((AbstractC89171a) new C83353o(this, a, a));
        this.f186010V = C89250i.m154773a((AbstractC89171a) C83258ac.f186031a);
        this.f186020j = new C82028b();
        AbstractC89277c a2 = C89204ab.m154669a(EditToolbarViewModel.class);
        this.f186011W = C89250i.m154773a((AbstractC89171a) new C83354p(this, a2, a2));
        this.f186023t = C89250i.m154773a((AbstractC89171a) C83266ak.f186047a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.AbstractC82035ab
    /* renamed from: a */
    public final void mo87638a(StickerItemModel stickerItemModel) {
        int i;
        int i2;
        C89219l.m154721d(stickerItemModel, "");
        if (C80720e.m139927b(stickerItemModel.path)) {
            VideoPublishEditModel videoPublishEditModel = this.f186013c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            if (!videoPublishEditModel.hasInfoStickers()) {
                VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
                if (videoPublishEditModel2 == null) {
                    C89219l.m154710a("mModel");
                }
                VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
                if (videoPublishEditModel3 == null) {
                    C89219l.m154710a("mModel");
                }
                videoPublishEditModel2.infoStickerModel = new InfoStickerModel(videoPublishEditModel3.draftDir());
            }
            VideoPublishEditModel videoPublishEditModel4 = this.f186013c;
            if (videoPublishEditModel4 == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel4.infoStickerModel.stickers.size() > 0) {
                VideoPublishEditModel videoPublishEditModel5 = this.f186013c;
                if (videoPublishEditModel5 == null) {
                    C89219l.m154710a("mModel");
                }
                i = 1;
                for (StickerItemModel stickerItemModel2 : videoPublishEditModel5.infoStickerModel.stickers) {
                    C89219l.m154716b(stickerItemModel2, "");
                    if (C45939c.m88695a(stickerItemModel2) && stickerItemModel2.layerWeight > i) {
                        i = stickerItemModel2.layerWeight;
                    }
                }
            } else {
                i = 1;
            }
            stickerItemModel.layerWeight += i;
            VideoPublishEditModel videoPublishEditModel6 = this.f186013c;
            if (videoPublishEditModel6 == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel6.infoStickerModel.stickers.add(stickerItemModel);
            ArrayList arrayList = new ArrayList();
            VideoPublishEditModel videoPublishEditModel7 = this.f186013c;
            if (videoPublishEditModel7 == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel7.infoStickerModel.stickers.size() > 0) {
                VideoPublishEditModel videoPublishEditModel8 = this.f186013c;
                if (videoPublishEditModel8 == null) {
                    C89219l.m154710a("mModel");
                }
                i2 = 1;
                for (StickerItemModel stickerItemModel3 : videoPublishEditModel8.infoStickerModel.stickers) {
                    if (stickerItemModel3.type == 4) {
                        C89219l.m154716b(stickerItemModel3, "");
                        arrayList.add(stickerItemModel3);
                    } else if (stickerItemModel3.type == 7) {
                        C89219l.m154716b(stickerItemModel3, "");
                        arrayList.add(stickerItemModel3);
                    } else if (stickerItemModel3.type == 19) {
                        C89219l.m154716b(stickerItemModel3, "");
                        arrayList.add(stickerItemModel3);
                    } else if (stickerItemModel3.layerWeight > i2) {
                        i2 = stickerItemModel3.layerWeight;
                    }
                }
            } else {
                i2 = 1;
            }
            if (arrayList.size() > 1) {
                C89070n.m154530a((List) arrayList, (Comparator) new C83341cu());
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((StickerItemModel) arrayList.get(i3)).layerWeight = i2 + i3 + 1;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$bd */
    static final class C83289bd<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83254v f186080a;

        static {
            Covode.recordClassIndex(97173);
        }

        C83289bd(C83254v vVar) {
            this.f186080a = vVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC83094e V;
            int i;
            LiveData<Boolean> e;
            LiveData<Boolean> c;
            LiveData<Boolean> i2;
            LiveData<Boolean> e2;
            C40970e.m82485a("receive FirstFrameVisible event in edit page");
            C83254v vVar = this.f186080a;
            VideoPublishEditModel videoPublishEditModel = vVar.f186013c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            if (!C70976bp.m125314j(videoPublishEditModel)) {
                C63244g.m114602a().mo73284l().requestDuetSettingPermission();
                ((AbstractC82254a) vVar.f186015e.getValue()).mo127430a();
                vVar.mo128334P().mo127670a();
                AbstractC82478a O = vVar.mo128333O();
                if (O != null) {
                    O.mo127565b();
                }
                vVar.mo128332N().mo127384a();
                ((AbstractC82237a) vVar.f186014d.getValue()).mo127416a();
                vVar.mo36417e(vVar.mo62771E());
                VideoPublishEditModel videoPublishEditModel2 = vVar.f186013c;
                if (videoPublishEditModel2 == null) {
                    C89219l.m154710a("mModel");
                }
                if (videoPublishEditModel2.isMultiVideoEdit()) {
                    VideoPublishEditModel videoPublishEditModel3 = vVar.f186013c;
                    if (videoPublishEditModel3 == null) {
                        C89219l.m154710a("mModel");
                    }
                    if (videoPublishEditModel3.isRetakeVideo()) {
                        vVar.mo128354ao();
                    }
                }
            }
            C83254v vVar2 = this.f186080a;
            vVar2.mo127624ap().mo127283k();
            VideoPublishEditModel videoPublishEditModel4 = vVar2.f186013c;
            if (videoPublishEditModel4 == null) {
                C89219l.m154710a("mModel");
            }
            if (C70976bp.m125310f(videoPublishEditModel4)) {
                C70835b.m125099a();
            }
            C83254v vVar3 = this.f186080a;
            VideoPublishEditModel videoPublishEditModel5 = vVar3.f186013c;
            if (videoPublishEditModel5 == null) {
                C89219l.m154710a("mModel");
            }
            if (videoPublishEditModel5.isAutoEnhanceEnable(C70935a.m125235a())) {
                vVar3.mo128330L().mo127284a();
            }
            C83254v vVar4 = this.f186080a;
            vVar4.mo128335Q().mo114792Q().observe(vVar4, new C83269an(vVar4));
            vVar4.mo128335Q().mo120449X().observe(vVar4, new C83270ao(vVar4));
            vVar4.mo128335Q().mo114816e().observe(vVar4, new C83271ap(vVar4));
            Activity activity = vVar4.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            C89219l.m154716b(a, "");
            ((EditEffectVideoModel) a).mo78634k().observe(vVar4, new C83275aq(vVar4));
            AbstractC70892c I = vVar4.mo128327I();
            if (!(I == null || (e2 = I.mo112055e()) == null)) {
                e2.observe(vVar4, new C83276ar(vVar4));
            }
            AbstractC83094e V2 = vVar4.mo128339V();
            if (!(V2 == null || (i2 = V2.mo128172i()) == null)) {
                i2.observe(vVar4, new C83277as(vVar4));
            }
            AbstractC82403a R = vVar4.mo128336R();
            if (!(R == null || (c = R.mo127498c()) == null)) {
                c.observe(vVar4, new C83278at(vVar4));
            }
            AbstractC82403a R2 = vVar4.mo128336R();
            if (!(R2 == null || (e = R2.mo127499e()) == null)) {
                e.observe(vVar4, new C83279au(vVar4));
            }
            AbstractC82032d Y = vVar4.mo128340Y();
            if (Y != null) {
                VideoPublishEditModel videoPublishEditModel6 = vVar4.f186013c;
                if (videoPublishEditModel6 == null) {
                    C89219l.m154710a("mModel");
                }
                if (videoPublishEditModel6.isAudioEnhance) {
                    if (!C82030c.m142036c()) {
                        Y.mo127253b();
                        Activity activity2 = vVar4.f52549m;
                        if (activity2 == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(activity2, "");
                        new C23144b(activity2).mo37640e(R.string.bog).mo37637b();
                    } else {
                        VideoPublishEditModel videoPublishEditModel7 = vVar4.f186013c;
                        if (videoPublishEditModel7 == null) {
                            C89219l.m154710a("mModel");
                        }
                        if (!videoPublishEditModel7.mIsFromDraft && C65332ab.m117014a() && !vVar4.f186020j.f183586a.getBoolean("display_noise_on_v3", false)) {
                            Activity activity3 = vVar4.f52549m;
                            if (activity3 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(activity3, "");
                            new C23144b(activity3).mo37640e(R.string.dgt).mo37637b();
                            vVar4.f186020j.f183586a.storeBoolean("display_noise_on_v3", true);
                        }
                    }
                    Y.mo127252a().observe(vVar4, new C83268am(Y, vVar4));
                }
            }
            vVar4.mo128326H().mo128249c().observe(vVar4, new C83281aw(vVar4));
            AbstractC83094e V3 = this.f186080a.mo128339V();
            if (V3 != null) {
                VideoPublishEditModel a2 = C83254v.m143654a(this.f186080a);
                AbstractC31071f aj = this.f186080a.mo128350aj();
                if (aj != null) {
                    i = aj.mo56368j();
                } else {
                    i = -1;
                }
                V3.mo128163a(a2, i);
            }
            if (C73211f.m129264a(C83254v.m143654a(this.f186080a)) && (V = this.f186080a.mo128339V()) != null) {
                V.mo128169f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$aw */
    static final class C83281aw<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C83254v f186063a;

        static {
            Covode.recordClassIndex(97165);
        }

        C83281aw(C83254v vVar) {
            this.f186063a = vVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:205:0x044e, code lost:
            r0 = r3.mo128328J();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x0452, code lost:
            if (r0 == null) goto L_0x0457;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0454, code lost:
            r0.mo111996a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0457, code lost:
            r3.mo128335Q().mo114805a((com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a) false, false, false);
            com.p2082ss.android.ugc.aweme.shortvideo.edit.C71529w.m126422b("voice");
            r9 = r3.f186013c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0465, code lost:
            if (r9 != null) goto L_0x046a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0467, code lost:
            p4600h.p4611f.p4613b.C89219l.m154710a("mModel");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x046a, code lost:
            p4600h.p4611f.p4613b.C89219l.m154721d(r9, "");
            com.p2082ss.android.ugc.aweme.common.C39162r.m79460a("click_voice_modify", com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl.m125280l(r9).mo129406a("creation_id", r9.creationId).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", r9.mShootWay).mo129406a("content_source", com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70856f.m125132a("content_source", r9)).mo129406a("shoot_entrance", com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70856f.m125132a("shoot_entrance", r9)).mo129406a("content_type", com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70856f.m125132a("content_type", r9)).mo129404a("local_time_ms", java.lang.System.currentTimeMillis()).mo129403a("is_multi_content", com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl.m125279k(r9)).f188764a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x04b4, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:287:0x05fa, code lost:
            if (r1 == 1) goto L_0x05fc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
            if (com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp.m125311g(r0) != false) goto L_0x008b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
            if (r0.veAudioRecorderParam.hasRecord() == false) goto L_0x00a5;
         */
        @Override // androidx.lifecycle.AbstractC1214u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r17) {
            /*
            // Method dump skipped, instructions count: 1746
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.C83281aw.onChanged(java.lang.Object):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0445, code lost:
        if (com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp.m125309e(r0) != false) goto L_0x0447;
     */
    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22704a(android.os.Bundle r13) {
        /*
        // Method dump skipped, instructions count: 1165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.C83254v.mo22704a(android.os.Bundle):void");
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$aa */
    public static final class C83256aa implements AbstractC89248d<Object, AbstractC82427a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186029a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186030b;

        static {
            Covode.recordClassIndex(97140);
        }

        public C83256aa(AbstractC21566a aVar, C83254v vVar) {
            this.f186029a = aVar;
            this.f186030b = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        public final /* synthetic */ AbstractC82427a mo23374a(Object obj, AbstractC89286i iVar) {
            C89219l.m154721d(obj, "");
            C89219l.m154721d(iVar, "");
            Object b = this.f186029a.getDiContainer().mo35252b(AbstractC82427a.class, null);
            if (C70976bp.m125316l(C83254v.m143654a(this.f186030b))) {
                return b;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.v$af */
    public static final class DialogInterface$OnClickListenerC83261af implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f186035a;

        /* renamed from: b */
        final /* synthetic */ C83254v f186036b;

        static {
            Covode.recordClassIndex(97145);
        }

        DialogInterface$OnClickListenerC83261af(boolean z, C83254v vVar) {
            this.f186035a = z;
            this.f186036b = vVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f186036b.mo128357c(this.f186035a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.v$cl */
    public static final class DialogInterface$OnClickListenerC83332cl implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface.OnClickListener f186161a;

        static {
            Covode.recordClassIndex(97216);
        }

        DialogInterface$OnClickListenerC83332cl(DialogInterface.OnClickListener onClickListener) {
            this.f186161a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            DialogInterface.OnClickListener onClickListener = this.f186161a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.v$cp */
    public static final class C83336cp extends AbstractC89220m implements AbstractC89183m<String, Integer, String> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186168a;

        static {
            Covode.recordClassIndex(97220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83336cp(C83254v vVar) {
            super(2);
            this.f186168a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ String invoke(String str, Integer num) {
            return mo128368a(str, num.intValue());
        }

        /* renamed from: a */
        public final String mo128368a(String str, int i) {
            C89219l.m154721d(str, "");
            StringBuilder sb = new StringBuilder();
            String string = this.f186168a.mo36485s().getString(i, "@".concat(String.valueOf(str)));
            C89219l.m154716b(string, "");
            String sb2 = sb.append(string).append(" ").toString();
            C89219l.m154716b(sb2, "");
            return sb2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.v$cq */
    public static final class C83337cq extends AbstractC89220m implements AbstractC89183m<String, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83254v f186169a;

        /* renamed from: b */
        final /* synthetic */ QaStruct f186170b;

        static {
            Covode.recordClassIndex(97221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83337cq(C83254v vVar, QaStruct qaStruct) {
            super(2);
            this.f186169a = vVar;
            this.f186170b = qaStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Integer num) {
            mo128369a(str, num.intValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo128369a(String str, int i) {
            C89219l.m154721d(str, "");
            QaStruct qaStruct = this.f186170b;
            if (qaStruct != null) {
                ArrayList arrayList = new ArrayList();
                String userName = qaStruct.getUserName();
                if (userName == null) {
                    userName = "";
                }
                int i2 = 0;
                int a = C89361p.m154888a((CharSequence) str, userName, 0, false, 6) - 1;
                int i3 = a + 1;
                String userName2 = qaStruct.getUserName();
                if (userName2 != null) {
                    i2 = userName2.length();
                }
                arrayList.add(AVTextExtraStructHelper.createQaStickerStruct(a, i3 + i2, String.valueOf(qaStruct.getUserId()), i));
                if (C83254v.m143654a(this.f186169a).structList != null) {
                    for (AVTextExtraStruct aVTextExtraStruct : C83254v.m143654a(this.f186169a).structList) {
                        C89219l.m154716b(aVTextExtraStruct, "");
                        aVTextExtraStruct.setStart(aVTextExtraStruct.getStart() + str.length());
                        aVTextExtraStruct.setEnd(aVTextExtraStruct.getEnd() + str.length());
                    }
                    VideoPublishEditModel a2 = C83254v.m143654a(this.f186169a);
                    List list = C83254v.m143654a(this.f186169a).structList;
                    C89219l.m154716b(list, "");
                    a2.structList = C89070n.m154572d((Collection) arrayList, (Iterable) list);
                } else {
                    C83254v.m143654a(this.f186169a).structList = arrayList;
                }
                String str2 = str.toString();
                VideoPublishEditModel a3 = C83254v.m143654a(this.f186169a);
                a3.title = C83254v.m143654a(this.f186169a).title != null ? str2 + C83254v.m143654a(this.f186169a).title : str2;
                VideoPublishEditModel a4 = C83254v.m143654a(this.f186169a);
                if (C83254v.m143654a(this.f186169a).chain != null) {
                    str2 = str2 + C83254v.m143654a(this.f186169a).chain;
                }
                a4.chain = str2;
                C83254v.m143654a(this.f186169a).disableDeleteChain = true;
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$cu */
    public static final class C83341cu<T> implements Comparator {
        static {
            Covode.recordClassIndex(97225);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.layerWeight), Integer.valueOf(t2.layerWeight));
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.bytedance.scene.group.AbstractC22186b
    /* renamed from: a */
    public final /* synthetic */ View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mo22702a(layoutInflater, viewGroup);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$ah */
    static final class DialogInterface$OnClickListenerC83263ah implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83254v f186039a;

        static {
            Covode.recordClassIndex(97147);
        }

        DialogInterface$OnClickListenerC83263ah(C83254v vVar) {
            this.f186039a = vVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Activity activity = this.f186039a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ((EditEffectVideoModel) C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class)).mo78633j().setValue(null);
            this.f186039a.mo127622ai();
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        AbstractC14552j jVar = this.f186018h;
        if (jVar == null) {
            C89219l.m154710a("gestureService");
        }
        jVar.mo23383a(new C14544f(0, new C83267al(this)));
    }

    @Override // com.bytedance.scene.group.AbstractC22186b
    /* renamed from: b */
    public final ViewGroup mo36393b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.asf, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a;
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        this.f186018h = C14536a.m26550a(context, (FrameLayout) viewGroup2.findViewById(R.id.aro));
        this.f186019i = viewGroup2.findViewById(R.id.asl);
        return viewGroup2;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: a */
    public final void mo87640a(Effect effect, CustomStickerInfo customStickerInfo) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(customStickerInfo, "");
        mo128335Q().mo114833v().setValue(C88296t.m153438b(0));
        AbstractC82905a S = mo128337S();
        if (S != null) {
            S.mo127988a(effect, C80357ds.m139323a(customStickerInfo.mo93663a()));
        }
    }

    /* renamed from: a */
    public final void mo128342a(Runnable runnable, boolean z) {
        C45995c a;
        String str;
        String effectId;
        C84911q.m145921a("VEVideoPublishEditActivity compileStickers");
        AbstractC46036a aVar = mo87618G().f184754M;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            List<C46239q> r = aVar.mo77643r();
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
            VideoPublishEditModel videoPublishEditModel = this.f186013c;
            if (videoPublishEditModel == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel.textTypes = sb.toString();
            VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
            if (videoPublishEditModel2 == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel2.textEffectIds = sb2.toString();
        } else {
            VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
            if (videoPublishEditModel3 == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel3.textTypes = "";
            VideoPublishEditModel videoPublishEditModel4 = this.f186013c;
            if (videoPublishEditModel4 == null) {
                C89219l.m154710a("mModel");
            }
            videoPublishEditModel4.textEffectIds = "";
        }
        AbstractC82957a Q = mo87618G().mo127697Q();
        AbstractC82814a S = mo87618G().mo127699S();
        AbstractC82034aa aaVar = mo87618G().f184780k;
        AbstractC82791h hVar = mo87618G().f184778i;
        C82468o oVar = mo87618G().f184782t;
        C82299l lVar = mo87618G().f184783u;
        AbstractC82878a R = mo87618G().mo127698R();
        AbstractC31071f aj = mo128350aj();
        if (aj == null) {
            C89219l.m154715b();
        }
        AbstractC70977bq bqVar = this.f186007S;
        if (bqVar == null) {
            C89219l.m154710a("mVideoSizeProvider");
        }
        AbstractC45898d[] dVarArr = new AbstractC45898d[10];
        dVarArr[0] = ((EditInfoStickerViewModel) this.f186024w.getValue()).mo127928h();
        dVarArr[1] = S.mo127888h();
        dVarArr[2] = aVar != null ? aVar.mo77642q() : null;
        dVarArr[3] = Q.mo128028i();
        dVarArr[4] = R.mo127958c();
        dVarArr[5] = aaVar != null ? aaVar.mo127261L() : null;
        dVarArr[6] = hVar != null ? hVar.mo127756K() : null;
        dVarArr[7] = oVar != null ? ((AbstractC82018a) oVar).f183561b : null;
        dVarArr[8] = lVar != null ? ((AbstractC82018a) lVar).f183561b : null;
        C83076b bVar = mo87618G().f184784v;
        dVarArr[9] = bVar != null ? bVar.mo128177C() : null;
        boolean a2 = C71532y.m126437a(aj, bqVar, dVarArr);
        AbstractC70977bq bqVar2 = this.f186007S;
        if (bqVar2 == null) {
            C89219l.m154710a("mVideoSizeProvider");
        }
        bqVar2.mo112108a(a2, true);
        long currentTimeMillis = System.currentTimeMillis();
        mo87618G().mo127712a(true);
        C82617c F = mo87618G();
        AbstractC31071f aj2 = mo128350aj();
        if (aj2 == null) {
            C89219l.m154715b();
        }
        C1731i<C89391z> a3 = F.mo87915a(aj2, this, (AbstractC89172b<? super String, String>) null);
        C82617c F2 = mo87618G();
        AbstractC31071f aj3 = mo128350aj();
        if (aj3 == null) {
            C89219l.m154715b();
        }
        C1731i iVar = F2.mo87917b(aj3, this, (AbstractC89172b<? super String, String>) null);
        if (!a3.mo5535a() || (iVar != null && !iVar.mo5535a())) {
            C1731i a4 = C1731i.m5638b((Collection<? extends C1731i<?>>) C89070n.m154522b(a3, iVar)).mo5534a(new C83283ay(this), C1731i.f5564c, null);
            C89219l.m154716b(a4, "");
            if (!a4.mo5535a()) {
                m143661aw();
                C1731i<Void> a5 = C1731i.m5631a(Math.max(0L, 50 - (System.currentTimeMillis() - currentTimeMillis)));
                C89219l.m154716b(a5, "");
                a4 = C1731i.m5638b((Collection<? extends C1731i<?>>) C89070n.m154522b(a4, a5));
            }
            a4.mo5534a(new C83282ax(this, runnable), C1731i.f5564c, null);
            return;
        }
        mo87618G().mo127721ai();
        mo87618G().mo127712a(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: b */
    public final void mo128356b(boolean z, boolean z2, Runnable runnable) {
        float f;
        AVChallenge aVChallenge;
        String str;
        if (this.f186009U) {
            C63244g.m114602a();
            C84911q.m145926b("DoubleGoPublishActivity VEVideoPublishEditActivity");
            C40971f.m82489a("DoubleGoPublishActivity VEVideoPublishEditActivity");
            if (SettingsManager.m29616a().mo25400a("is_block_error_go_publish", true)) {
                C84911q.m145926b("BlockErrorGoPublish");
                return;
            }
        }
        this.f186009U = true;
        VideoPublishEditModel videoPublishEditModel = this.f186013c;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        AbstractC82155c Q = mo128335Q();
        AbstractC31071f aj = mo128350aj();
        if (aj != null) {
            f = aj.mo56245F();
        } else {
            f = -1.0f;
        }
        C70968bl.m125253a(videoPublishEditModel, Q, f, "go_publish");
        Intent intent = new Intent();
        Activity t = mo36486t();
        C89219l.m154716b(t, "");
        Intent intent2 = t.getIntent();
        C89219l.m154716b(intent2, "");
        Bundle a = m143653a(intent2);
        if (a != null) {
            a.putInt("fromDraft", 0);
            intent.putExtras(a);
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f186013c;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("mModel");
        }
        C70005cr a2 = C70005cr.m123611a();
        C89219l.m154716b(a2, "");
        videoPublishEditModel2.setMultiEditChallenges(a2.f156492l);
        VideoPublishEditModel videoPublishEditModel3 = this.f186013c;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel3.setMultiEditStickIds();
        VideoPublishEditModel videoPublishEditModel4 = this.f186013c;
        if (videoPublishEditModel4 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel4.setMultiEditBeautyMetadatas();
        VideoPublishEditModel videoPublishEditModel5 = this.f186013c;
        if (videoPublishEditModel5 == null) {
            C89219l.m154710a("mModel");
        }
        videoPublishEditModel5.setMultiEditCameraLensInfo();
        ArrayList arrayList = new ArrayList();
        VideoPublishEditModel videoPublishEditModel6 = this.f186013c;
        if (videoPublishEditModel6 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel6.challenges == null) {
            C56724i iVar = this.f186006R;
            if (iVar == null) {
                C89219l.m154710a("stickerChallengeManager");
            }
            if (!iVar.mo93675c().isEmpty()) {
                C56724i iVar2 = this.f186006R;
                if (iVar2 == null) {
                    C89219l.m154710a("stickerChallengeManager");
                }
                arrayList.addAll(iVar2.mo93675c());
            }
        }
        VideoPublishEditModel videoPublishEditModel7 = this.f186013c;
        if (videoPublishEditModel7 == null) {
            C89219l.m154710a("mModel");
        }
        AudioEffectParam audioEffectParam = videoPublishEditModel7.veAudioEffectParam;
        if (audioEffectParam != null) {
            aVChallenge = audioEffectParam.getChallenge();
            if (aVChallenge != null) {
                VideoPublishEditModel videoPublishEditModel8 = this.f186013c;
                if (videoPublishEditModel8 == null) {
                    C89219l.m154710a("mModel");
                }
                if (C70976bp.m125312h(videoPublishEditModel8)) {
                    VideoPublishEditModel videoPublishEditModel9 = this.f186013c;
                    if (videoPublishEditModel9 == null) {
                        C89219l.m154710a("mModel");
                    }
                    if (videoPublishEditModel9.hasNotAudioRecord()) {
                        VideoPublishEditModel videoPublishEditModel10 = this.f186013c;
                        if (videoPublishEditModel10 == null) {
                            C89219l.m154710a("mModel");
                        }
                        C70835b.m125100a(videoPublishEditModel10);
                    }
                }
                arrayList.add(aVChallenge);
            }
        } else {
            aVChallenge = null;
        }
        VideoPublishEditModel videoPublishEditModel11 = this.f186013c;
        if (videoPublishEditModel11 == null) {
            C89219l.m154710a("mModel");
        }
        if (videoPublishEditModel11.challenges != null) {
            VideoPublishEditModel videoPublishEditModel12 = this.f186013c;
            if (videoPublishEditModel12 == null) {
                C89219l.m154710a("mModel");
            }
            arrayList.addAll(videoPublishEditModel12.challenges);
            C56724i iVar3 = this.f186006R;
            if (iVar3 == null) {
                C89219l.m154710a("stickerChallengeManager");
            }
            VideoPublishEditModel videoPublishEditModel13 = this.f186013c;
            if (videoPublishEditModel13 == null) {
                C89219l.m154710a("mModel");
            }
            List list = videoPublishEditModel13.challenges;
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
        VideoPublishEditModel videoPublishEditModel14 = this.f186013c;
        if (videoPublishEditModel14 == null) {
            C89219l.m154710a("mModel");
        }
        C56724i iVar4 = this.f186006R;
        if (iVar4 == null) {
            C89219l.m154710a("stickerChallengeManager");
        }
        videoPublishEditModel14.stickerChallenge = iVar4.mo93671a();
        m143660av();
        VideoPublishEditModel videoPublishEditModel15 = this.f186013c;
        if (videoPublishEditModel15 == null) {
            C89219l.m154710a("mModel");
        }
        VideoPublishEditModel makeCopy = VideoPublishEditModel.makeCopy(videoPublishEditModel15);
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
        if (!C68338q.m120618a() || mo128350aj() == null) {
            mo128344a(z2, booleanExtra, intent);
            return;
        }
        AbstractC31071f aj2 = mo128350aj();
        if (aj2 != null) {
            aj2.mo56307a(new C83292bg(this, z2, booleanExtra, intent));
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.rootscene.AbstractC82561d
    /* renamed from: b */
    public final void mo87649b(boolean z, boolean z2, boolean z3, Runnable runnable) {
        C89219l.m154721d(runnable, "");
        mo127619a(z, z2, z3, runnable, (Runnable) null);
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
        m143661aw();
        C1731i.m5640b(new CallableC83290be(this, str, i, i2, z), C1731i.f5562a).mo5534a(new C83291bf(this, str, z, i3, i), C1731i.f5564c, null);
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
