package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.transition.AutoTransition;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.app.C0576b;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.AbstractC0706b;
import androidx.core.graphics.drawable.C0708d;
import androidx.core.p036g.C0692e;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.C1764a;
import com.bytedance.als.C2564l;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.keva.Keva;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.p1998c.p1999a.C27245k;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.common.C39099e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.C43211i;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.experiment.C46981gn;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.geofencing.C52864a;
import com.p2082ss.android.ugc.aweme.geofencing.GeoFencingSettingItem;
import com.p2082ss.android.ugc.aweme.geofencing.p3046b.C52880a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.p2082ss.android.ugc.aweme.internal.C56808a;
import com.p2082ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.p2082ss.android.ugc.aweme.internal.IAVUIUXBugsExperimentService;
import com.p2082ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.p2082ss.android.ugc.aweme.internal.ShareServiceImpl;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.p2363ba.C34413e;
import com.p2082ss.android.ugc.aweme.p2690cr.p2704g.C40382a;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.photo.p3546a.C62855a;
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService;
import com.p2082ss.android.ugc.aweme.profile.model.TagBAUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.property.AVPreferences;
import com.p2082ss.android.ugc.aweme.property.C65352av;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65404cp;
import com.p2082ss.android.ugc.aweme.property.C65409cs;
import com.p2082ss.android.ugc.aweme.property.C65437dt;
import com.p2082ss.android.ugc.aweme.property.C65440dw;
import com.p2082ss.android.ugc.aweme.publish.C65687t;
import com.p2082ss.android.ugc.aweme.publish.p3610a.p3611a.C65505a;
import com.p2082ss.android.ugc.aweme.publish.p3614c.C65514a;
import com.p2082ss.android.ugc.aweme.scheduler.C67295g;
import com.p2082ss.android.ugc.aweme.scheduler.C67296h;
import com.p2082ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.p2082ss.android.ugc.aweme.services.draft.IDraftService;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.services.external.IComplianceService;
import com.p2082ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p2082ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.p2082ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p2082ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p2082ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p2082ss.android.ugc.aweme.services.publish.HotSpotTagPublishModel;
import com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p2082ss.android.ugc.aweme.services.publish.MobParam;
import com.p2082ss.android.ugc.aweme.services.publish.Publish;
import com.p2082ss.android.ugc.aweme.setting.C68034bs;
import com.p2082ss.android.ugc.aweme.setting.C68044c;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.settings.C68744j;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69904bz;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC72463p;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69789ac;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69881bf;
import com.p2082ss.android.ugc.aweme.shortvideo.C69884bh;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69922cd;
import com.p2082ss.android.ugc.aweme.shortvideo.C69924cf;
import com.p2082ss.android.ugc.aweme.shortvideo.C69931cj;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70011cu;
import com.p2082ss.android.ugc.aweme.shortvideo.C70619cv;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.C71804ej;
import com.p2082ss.android.ugc.aweme.shortvideo.C71809em;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.aweme.shortvideo.C71919l;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.shortvideo.View$OnClickListenerC69883bg;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69743b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70975bo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71164e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71824e;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71826f;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentSettingItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.model.DuetSettingItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MissionUser;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.StitchSettingItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69783m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.C69787n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3834g.C71857b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3834g.C71859c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71897c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71907a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71908b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71909c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71910d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3875u.C73298a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73690g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73772f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.viewmodel.VideoPublishViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.C74089g;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72557a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72588aa;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72591ab;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72613aj;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72621b;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72622c;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72636j;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72640l;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72644n;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72681t;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72683v;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72692z;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72643m;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72684w;
import com.p2082ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73933a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73970aw;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73973ay;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73977ba;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73979bb;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74041w;
import com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.p2082ss.android.ugc.aweme.shortvideo.view.OmnipotentRoundCornerImgView;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.DuetStickerUserStruct;
import com.p2082ss.android.ugc.aweme.sticker.text.C75898d;
import com.p2082ss.android.ugc.aweme.tools.draft.C78179az;
import com.p2082ss.android.ugc.aweme.tools.draft.p4104e.C78247b;
import com.p2082ss.android.ugc.aweme.tools.draft.p4112j.C78397c;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80209ad;
import com.p2082ss.android.ugc.aweme.utils.C80272bs;
import com.p2082ss.android.ugc.aweme.utils.C80345dj;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.aweme.utils.C80571if;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80737c;
import com.p2082ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.aweme.widgetcompat.ProgressDialogC81636a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VERecordData;
import dmt.p4542av.video.C88278m;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cj */
public class C73560cj extends Fragment implements AbstractC63199ax.AbstractC63200a, IComplianceService, AbstractC69904bz {

    /* renamed from: ag */
    private static final String f165256ag = C73560cj.class.getSimpleName();

    /* renamed from: ah */
    private static final boolean f165257ah = C63253l.f143623a.mo73309e().mo93762d();

    /* renamed from: A */
    C73543bz f165258A;

    /* renamed from: B */
    CheckBox f165259B;

    /* renamed from: C */
    public ViewGroup f165260C;

    /* renamed from: D */
    public View f165261D;

    /* renamed from: E */
    TuxTextView f165262E;

    /* renamed from: F */
    TuxTextView f165263F;

    /* renamed from: G */
    public boolean f165264G = true;

    /* renamed from: H */
    public AbstractC72463p f165265H;

    /* renamed from: I */
    public C72644n f165266I;

    /* renamed from: J */
    public ViewGroup f165267J;

    /* renamed from: K */
    VideoPublishEditModel f165268K;

    /* renamed from: L */
    boolean f165269L;

    /* renamed from: M */
    public boolean f165270M;

    /* renamed from: N */
    public boolean f165271N;

    /* renamed from: O */
    public VideoCoverBitmapHolder f165272O;

    /* renamed from: P */
    public Bitmap f165273P;

    /* renamed from: Q */
    long f165274Q;

    /* renamed from: R */
    public long f165275R;

    /* renamed from: S */
    public final List<C0692e<Class<?>, IAVPublishExtension<?>>> f165276S = C63238c.f143591r.mo93931a(AVPublishContentType.Video);

    /* renamed from: T */
    boolean f165277T;

    /* renamed from: U */
    public String f165278U;

    /* renamed from: V */
    public String f165279V = "";

    /* renamed from: W */
    public int f165280W = -1;

    /* renamed from: X */
    public boolean f165281X;

    /* renamed from: Y */
    public boolean f165282Y;

    /* renamed from: Z */
    boolean f165283Z = false;

    /* renamed from: a */
    final boolean f165284a = PrivacyServiceImpl.m103033c().mo93975a();

    /* renamed from: aA */
    private ProgressDialogC81636a f165285aA;

    /* renamed from: aB */
    private final AtomicInteger f165286aB = new AtomicInteger(0);

    /* renamed from: aC */
    private ProgressDialogC81636a f165287aC;

    /* renamed from: aD */
    private long f165288aD;

    /* renamed from: aE */
    private int f165289aE;

    /* renamed from: aF */
    private boolean f165290aF;

    /* renamed from: aG */
    private boolean f165291aG;

    /* renamed from: aH */
    private C39078ad f165292aH;

    /* renamed from: aI */
    private int f165293aI = -1;

    /* renamed from: aJ */
    private boolean f165294aJ;

    /* renamed from: aK */
    private boolean f165295aK;

    /* renamed from: aL */
    private boolean f165296aL;

    /* renamed from: aM */
    private List<C72683v> f165297aM = new ArrayList();

    /* renamed from: aN */
    private String f165298aN;

    /* renamed from: aO */
    private Mission f165299aO = null;

    /* renamed from: aP */
    private C71824e f165300aP;

    /* renamed from: aQ */
    private C2564l<Boolean> f165301aQ;

    /* renamed from: aR */
    private DialogInterface.OnDismissListener f165302aR;

    /* renamed from: aa */
    String f165303aa = "";

    /* renamed from: ab */
    public String f165304ab;

    /* renamed from: ac */
    public AbstractC88412b f165305ac;

    /* renamed from: ad */
    C71859c f165306ad;

    /* renamed from: ae */
    public boolean f165307ae;

    /* renamed from: af */
    final boolean f165308af = C63244g.m114602a().mo73297y().mo93848b().booleanValue();

    /* renamed from: ai */
    private final IAVUIUXBugsExperimentService f165309ai = AVUIUXBugsExperimentServiceDiff.m103001b();

    /* renamed from: aj */
    private MutualRelationView f165310aj;

    /* renamed from: ak */
    private CommonItemView f165311ak;

    /* renamed from: al */
    private CommonItemView f165312al;

    /* renamed from: am */
    private CommonItemView f165313am;

    /* renamed from: an */
    private CommentSettingItemStatus f165314an;

    /* renamed from: ao */
    private final C52864a f165315ao = new C52864a();

    /* renamed from: ap */
    private RelativeLayout f165316ap;

    /* renamed from: aq */
    private GeoFencingSettingItem f165317aq;

    /* renamed from: ar */
    private Boolean f165318ar = false;

    /* renamed from: as */
    private final C72622c f165319as = new C72622c();

    /* renamed from: at */
    private LinearLayout f165320at;

    /* renamed from: au */
    private C69881bf f165321au;

    /* renamed from: av */
    private TuxTextView f165322av;

    /* renamed from: aw */
    private View f165323aw;

    /* renamed from: ax */
    private boolean f165324ax = false;

    /* renamed from: ay */
    private ViewStub f165325ay;

    /* renamed from: az */
    private ViewGroup f165326az;

    /* renamed from: b */
    View f165327b;

    /* renamed from: c */
    DuetSettingItemStatus f165328c;

    /* renamed from: d */
    StitchSettingItemStatus f165329d;

    /* renamed from: e */
    final AddToPlaylistItemStatus f165330e = new AddToPlaylistItemStatus();

    /* renamed from: f */
    final CommonSettingItemStatus f165331f = new CommonSettingItemStatus();

    /* renamed from: g */
    C72557a f165332g;

    /* renamed from: h */
    PermissionSettingItem f165333h;

    /* renamed from: i */
    PublishImShareSettingItem f165334i;

    /* renamed from: j */
    Boolean f165335j = false;

    /* renamed from: k */
    public String f165336k = "";

    /* renamed from: l */
    public String f165337l = "";

    /* renamed from: m */
    public final C1213t<C62855a> f165338m = new C1213t<>();

    /* renamed from: n */
    public C69924cf f165339n;

    /* renamed from: o */
    LinearLayout f165340o;

    /* renamed from: p */
    ImageView f165341p;

    /* renamed from: q */
    ObjectAnimator f165342q;

    /* renamed from: r */
    public C71804ej f165343r;

    /* renamed from: s */
    RelativeLayout f165344s;

    /* renamed from: t */
    public View f165345t;

    /* renamed from: u */
    public OmnipotentRoundCornerImgView f165346u;

    /* renamed from: v */
    public TuxTextView f165347v;

    /* renamed from: w */
    View f165348w;

    /* renamed from: x */
    View f165349x;

    /* renamed from: y */
    public HashTagMentionEditText f165350y;

    /* renamed from: z */
    VideoPrivacySettingsItem f165351z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cj$a */
    public interface AbstractC73577a {
        static {
            Covode.recordClassIndex(86314);
        }

        /* renamed from: a */
        void mo116178a();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69904bz
    /* renamed from: d */
    public final void mo110243d() {
        this.f165269L = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v28, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.bz> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m129687a(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        HashMap hashMap;
        List<User> a;
        MissionUser next;
        float f;
        boolean z4;
        int i;
        boolean z5;
        C72557a aVar;
        MethodCollector.m26663i(9805);
        ExtensionDataRepo extensionDataRepo = (ExtensionDataRepo) m129684a(this).mo3983a(ExtensionDataRepo.class);
        PermissionSettingItem permissionSettingItem = (PermissionSettingItem) view.findViewById(R.id.d0u);
        this.f165333h = permissionSettingItem;
        permissionSettingItem.mo115832a(new View$OnClickListenerC73622ds(this));
        PermissionSettingItem permissionSettingItem2 = this.f165333h;
        VideoPublishEditModel videoPublishEditModel = this.f165268K;
        C73634ed edVar = new C73634ed(this);
        C69924cf cfVar = new C69924cf(this, permissionSettingItem2, 0);
        cfVar.f156264h = videoPublishEditModel;
        cfVar.f156260d = edVar;
        this.f165339n = cfVar;
        this.f165302aR = new DialogInterface$OnDismissListenerC73645eo(this);
        this.f165339n.mo110333a((AbstractC69923ce) new AbstractC69923ce() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C735611 */

            static {
                Covode.recordClassIndex(86298);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce
            /* renamed from: d */
            public final String mo69185d() {
                return null;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce
            /* renamed from: e */
            public final String mo69186e() {
                return null;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce
            /* renamed from: c */
            public final String mo69184c() {
                if (TextUtils.isEmpty(C73560cj.this.f165336k)) {
                    return "";
                }
                return C1764a.m5928a(C73560cj.this.getString(R.string.dgx), new Object[]{C73560cj.this.f165336k});
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce
            /* renamed from: a */
            public final String mo69182a() {
                if (TextUtils.isEmpty(C73560cj.this.f165337l) || TextUtils.isEmpty(C73560cj.this.f165336k)) {
                    return C73560cj.this.getContext().getResources().getString(R.string.bxl);
                }
                return C73560cj.this.getContext().getResources().getString(R.string.bxl) + C1764a.m5928a(C73560cj.this.getContext().getResources().getString(R.string.dgx), new Object[]{C73560cj.this.f165336k});
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69923ce
            /* renamed from: b */
            public final String mo69183b() {
                if (TextUtils.isEmpty(C73560cj.this.f165337l) || TextUtils.isEmpty(C73560cj.this.f165336k)) {
                    return C73560cj.this.getContext().getResources().getString(R.string.bxk);
                }
                return C73560cj.this.getContext().getResources().getString(R.string.bxk) + C1764a.m5928a(C73560cj.this.getContext().getResources().getString(R.string.dgx), new Object[]{C73560cj.this.f165336k});
            }
        }, (AbstractC73756j) new C73654ex(this), this.f165302aR, false, false);
        this.f165338m.observe(this, new C73655ey(this, extensionDataRepo));
        if (C56808a.f129376a.mo93958a(true)) {
            TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.e46);
            tuxTextCell.setVisibility(0);
            ((AbstractC23293c.C23302f) tuxTextCell.getAccessory()).mo37962a(new View$OnClickListenerC73601cz(this));
            MutualRelationView mutualRelationView = (MutualRelationView) view.findViewById(R.id.e43);
            this.f165310aj = mutualRelationView;
            mutualRelationView.mo125021a((int) C13628n.m24520b(C63238c.f143574a, 28.0f), (int) C13628n.m24520b(C63238c.f143574a, 20.0f));
            mo116157g();
            this.f165327b = view.findViewById(R.id.e45);
            C56808a.f129376a.mo93957a(getActivity(), false, new C73604da(this));
        }
        this.f165334i = (PublishImShareSettingItem) view.findViewById(R.id.bkl);
        View findViewById = view.findViewById(R.id.aoq);
        this.f165320at = (LinearLayout) view.findViewById(R.id.c6a);
        this.f165344s = (RelativeLayout) view.findViewById(R.id.dag);
        this.f165345t = view.findViewById(R.id.c6c);
        this.f165326az = (ViewGroup) view.findViewById(R.id.gp);
        this.f165260C = (ViewGroup) view.findViewById(R.id.gz);
        this.f165261D = view.findViewById(R.id.h1);
        this.f165267J = (ViewGroup) view.findViewById(R.id.bdj);
        if (!C71909c.m126984a()) {
            this.f165331f.bindView(view.findViewById(R.id.ib), this);
            if (this.f165317aq == null) {
                GeoFencingSettingItem geoFencingSettingItem = (GeoFencingSettingItem) ((ViewStub) view.findViewById(R.id.dam)).inflate();
                this.f165317aq = geoFencingSettingItem;
                this.f165315ao.mo88538a(this, geoFencingSettingItem);
            }
        }
        if (!C71908b.m126983a() && this.f165316ap == null) {
            RelativeLayout relativeLayout = (RelativeLayout) ((ViewStub) view.findViewById(R.id.daf)).inflate();
            this.f165316ap = relativeLayout;
            this.f165330e.bindView(relativeLayout, this);
        }
        C62855a value = this.f165338m.getValue();
        if (value != null) {
            if (C63238c.f143591r.mo93939c() == 2) {
                this.f165282Y = true;
                this.f165339n.mo110332a(value.getPermission(), (List<User>) null, 0, this.f165282Y, "");
            } else if (C63238c.f143591r.mo93939c() == 1) {
                this.f165282Y = false;
                this.f165339n.mo110332a(value.getPermission(), (List<User>) null, 0, this.f165282Y, "");
            }
        }
        this.f165338m.setValue(new C62855a(this.f165268K.isPrivate, this.f165268K.excludeUserList, this.f165268K.allowRecommend));
        this.f165339n.mo110332a(this.f165338m.getValue().getPermission(), this.f165268K.excludeUserList, this.f165268K.allowRecommend, this.f165282Y, "");
        if (this.f165268K.mOutVideoWidth < this.f165268K.mOutVideoHeight) {
            z = true;
        } else {
            z = false;
        }
        if (C16048b.m29633a().mo25421a(true, "enable_share_changeux", false)) {
            this.f165265H = new C70619cv(this, view, z);
        } else {
            this.f165265H = new C70011cu(this, view, z);
        }
        C72644n nVar = new C72644n(this, this.f165268K.mIsFromDraft, this.f165295aK, this.f165296aL, this.f165306ad);
        this.f165266I = nVar;
        nVar.f162847i = new C73656ez(this);
        if (this.f165268K.hasSubtitle()) {
            C72683v vVar = new C72683v(EnumC72684w.SAVE_LOCAL_OPTIONS, getString(R.string.fdv), "", 2131232394, false, C73605db.f165423a);
            vVar.f162952e = new C73606dc(this);
            if (C71907a.m126982a()) {
                if (C72631i.m128108a()) {
                    C65687t.m117578a(0);
                } else if (m129691j().booleanValue()) {
                    vVar.f162950c = new C73607dd(this);
                }
            }
            vVar.mo114962a(C73979bb.m130114a(C65687t.m117580b()));
            vVar.f162949b = new C73608de(this);
            this.f165297aM.add(vVar);
        } else {
            C72683v vVar2 = new C72683v(EnumC72684w.SAVE_LOCAL, getString(R.string.fdv), getString(R.string.f5), 2131232394, C73772f.m129821a() && C65687t.m117580b() > 0, null);
            vVar2.f162958k = new C73609df(this, vVar2);
            vVar2.f162952e = new C73610dg(this);
            if ((C72631i.m128108a() || m129691j().booleanValue()) && C71907a.m126982a()) {
                C65687t.m117578a(0);
                vVar2.f162957j = false;
            }
            if (C71907a.m126982a()) {
                if (C72631i.m128108a()) {
                    vVar2.f162950c = new C73612di(this, vVar2);
                } else if (m129691j().booleanValue()) {
                    vVar2.f162950c = new C73613dj(this);
                }
            }
            this.f165297aM.add(vVar2);
        }
        if (C71909c.m126984a()) {
            C72683v vVar3 = new C72683v(EnumC72684w.AUTO_CAPTION, getString(R.string.b1z), "", 2131233519, this.f165268K.allowAutoCaptionSetting > 0, C73614dk.f165435a);
            vVar3.f162952e = new C73615dl(this);
            this.f165297aM.add(vVar3);
        }
        if (this.f165295aK) {
            boolean a2 = C71910d.m126985a();
            this.f165297aM.add(new C72683v(EnumC72684w.HIGH_QUALITY, getString(a2 ? R.string.ey4 : R.string.bj), getString(a2 ? R.string.ey5 : R.string.bk), a2 ? R.raw.icon_video_star : 2131232393, C65687t.m117579a(), new C73616dm(this)));
        }
        VideoPublishViewModel E = m129673E();
        List<C72683v> list = this.f165297aM;
        C89219l.m154721d(list, "");
        E.f165708a = list;
        VideoPublishViewModel E2 = m129673E();
        C52864a aVar2 = this.f165315ao;
        C89219l.m154721d(aVar2, "");
        E2.f165709b = aVar2;
        VideoPublishViewModel E3 = m129673E();
        AddToPlaylistItemStatus addToPlaylistItemStatus = this.f165330e;
        C89219l.m154721d(addToPlaylistItemStatus, "");
        E3.f165710c = addToPlaylistItemStatus;
        if (getActivity() != null) {
            C72644n nVar2 = this.f165266I;
            ActivityC0218d dVar = (ActivityC0218d) getActivity();
            VideoPublishEditModel videoPublishEditModel2 = this.f165268K;
            CommonSettingItemStatus commonSettingItemStatus = this.f165331f;
            int publishPermission = getPublishPermission();
            C71859c cVar = this.f165306ad;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(videoPublishEditModel2, "");
            C89219l.m154721d(commonSettingItemStatus, "");
            C89219l.m154721d(cVar, "");
            if (C63238c.f143594u.mo93901a()) {
                commonSettingItemStatus._visibility.setValue(8);
            } else if (nVar2.mo114941g() || videoPublishEditModel2.hasSubtitle()) {
                commonSettingItemStatus._visibility.setValue(8);
            } else if (!CrossLanguageUserExperiment.m103003c().mo93972a()) {
                commonSettingItemStatus._visibility.setValue(8);
            } else {
                aVar = new C72557a(dVar, commonSettingItemStatus, videoPublishEditModel2, cVar, new C72644n.C72646b(nVar2));
                if (aVar.f162650d.mIsFromDraft || aVar.f162650d.allowAutoCaptionSetting != 0) {
                    aVar.f162649c._checked.setValue(Boolean.valueOf(aVar.f162650d.allowAutoCaptionSetting > 0));
                } else {
                    aVar.f162649c._checked.setValue(Boolean.valueOf(C40382a.f94568a.getBoolean("privacy_setting_auto_caption", false)));
                }
                aVar.f162647a = C89219l.m154714a((Object) aVar.f162649c._checked.getValue(), (Object) true);
                aVar.mo114886a(publishPermission);
                this.f165332g = aVar;
            }
            aVar = null;
            this.f165332g = aVar;
        }
        if (!IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).needShowAddOrRemoveButton() || IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).needCreateFirstMix()) {
            z2 = false;
            z3 = false;
        } else {
            z2 = true;
            if (C71908b.m126983a()) {
                z3 = true;
            }
            z3 = false;
        }
        if (C71909c.m126984a()) {
            boolean z6 = !C52864a.C52865a.m97724a();
            boolean z7 = this.f165296aL;
            boolean z8 = this.f165332g != null;
            boolean z9 = this.f165295aK;
            C72644n nVar3 = this.f165266I;
            LinearLayout linearLayout = this.f165320at;
            List<C72683v> list2 = this.f165297aM;
            VideoPublishEditModel videoPublishEditModel3 = this.f165268K;
            AbstractC72463p pVar = this.f165265H;
            C52864a aVar3 = this.f165315ao;
            AddToPlaylistItemStatus addToPlaylistItemStatus2 = this.f165330e;
            C89219l.m154721d(linearLayout, "");
            C89219l.m154721d(aVar3, "");
            C89219l.m154721d(addToPlaylistItemStatus2, "");
            nVar3.f162854p = videoPublishEditModel3;
            Context context = linearLayout.getContext();
            C89219l.m154716b(context, "");
            nVar3.f162839a = context;
            nVar3.f162849k = z3;
            nVar3.f162853o = list2;
            if (!(z3 || z6 || z7 || z8 || z9) || list2 == null || videoPublishEditModel3 == null) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (C65357b.m117053i()) {
                IAVSettingService createIAVSettingServicebyMonsterPlugin = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
                C89219l.m154716b(createIAVSettingServicebyMonsterPlugin, "");
                if (!createIAVSettingServicebyMonsterPlugin.getSaveAtPost()) {
                    if (C72644n.C72645a.m128145b() != 0) {
                        if (pVar != null) {
                            pVar.mo114730a();
                        }
                        if (z5) {
                            C89219l.m154708a(videoPublishEditModel3);
                            nVar3.mo114931a(linearLayout, list2, videoPublishEditModel3);
                        } else {
                            nVar3.mo114930a(linearLayout, videoPublishEditModel3);
                        }
                    } else if (z5) {
                        C89219l.m154708a(videoPublishEditModel3);
                        nVar3.mo114938b(linearLayout, list2, videoPublishEditModel3);
                    }
                }
            }
            if (z5) {
                C89219l.m154708a(videoPublishEditModel3);
                nVar3.mo114938b(linearLayout, list2, videoPublishEditModel3);
            }
            if (pVar != null) {
                pVar.mo114730a();
            }
        } else {
            C72644n nVar4 = this.f165266I;
            LinearLayout linearLayout2 = this.f165320at;
            List<C72683v> list3 = this.f165297aM;
            VideoPublishEditModel videoPublishEditModel4 = this.f165268K;
            AbstractC72463p pVar2 = this.f165265H;
            C52864a aVar4 = this.f165315ao;
            AddToPlaylistItemStatus addToPlaylistItemStatus3 = this.f165330e;
            C89219l.m154721d(linearLayout2, "");
            C89219l.m154721d(aVar4, "");
            C89219l.m154721d(addToPlaylistItemStatus3, "");
            nVar4.f162854p = videoPublishEditModel4;
            boolean z10 = (nVar4.f162861w || (nVar4.f162860v && list3 != null)) && videoPublishEditModel4 != null;
            nVar4.f162853o = list3;
            Context context2 = linearLayout2.getContext();
            C89219l.m154716b(context2, "");
            nVar4.f162839a = context2;
            if (C65357b.m117053i()) {
                IAVSettingService createIAVSettingServicebyMonsterPlugin2 = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
                C89219l.m154716b(createIAVSettingServicebyMonsterPlugin2, "");
                if (!createIAVSettingServicebyMonsterPlugin2.getSaveAtPost()) {
                    if (C72644n.C72645a.m128145b() != 0) {
                        if (pVar2 != null) {
                            pVar2.mo114730a();
                        }
                        if ((nVar4.f162861w || (nVar4.f162860v && list3 != null)) && videoPublishEditModel4 != null) {
                            nVar4.mo114931a(linearLayout2, list3, videoPublishEditModel4);
                        } else {
                            nVar4.mo114930a(linearLayout2, videoPublishEditModel4);
                        }
                    } else if (z10) {
                        C89219l.m154708a(videoPublishEditModel4);
                        nVar4.mo114938b(linearLayout2, list3, videoPublishEditModel4);
                    }
                }
            }
            if (z10) {
                C89219l.m154708a(videoPublishEditModel4);
                nVar4.mo114938b(linearLayout2, list3, videoPublishEditModel4);
            }
        }
        if (C71909c.m126984a()) {
            this.f165258A = new C73543bz(this);
            VideoPrivacySettingsItem videoPrivacySettingsItem = (VideoPrivacySettingsItem) view.findViewById(R.id.fda);
            this.f165351z = videoPrivacySettingsItem;
            videoPrivacySettingsItem.setVisibility(0);
            this.f165351z.setOnClickListener(new View$OnClickListenerC73600cy(this));
        } else {
            if (this.f165311ak == null) {
                CommonItemView commonItemView = (CommonItemView) ((ViewStub) view.findViewById(R.id.a_b)).inflate();
                this.f165311ak = commonItemView;
                this.f165314an.bindView(commonItemView, this);
            }
            if (this.f165312al == null) {
                CommonItemView commonItemView2 = (CommonItemView) ((ViewStub) view.findViewById(R.id.apx)).inflate();
                this.f165312al = commonItemView2;
                this.f165328c.bindView(commonItemView2, this);
            }
            if (this.f165313am == null) {
                CommonItemView commonItemView3 = (CommonItemView) ((ViewStub) view.findViewById(R.id.e9q)).inflate();
                this.f165313am = commonItemView3;
                this.f165329d.bindView(commonItemView3, this);
            }
        }
        C72644n nVar5 = this.f165266I;
        LinearLayout linearLayout3 = this.f165320at;
        VideoPublishEditModel videoPublishEditModel5 = this.f165268K;
        if (videoPublishEditModel5 == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("creation_id", this.f165268K.creationId);
            hashMap.put("enter_from", "video_post_page");
            hashMap.put("content_type", m129682N());
            hashMap.put("content_source", C71817eu.m126793d(this.f165268K));
            hashMap.put("shoot_way", this.f165268K.mShootWay);
        }
        String str = this.f165268K.creationId;
        DuetSettingItemStatus duetSettingItemStatus = this.f165328c;
        CommentSettingItemStatus commentSettingItemStatus = this.f165314an;
        StitchSettingItemStatus stitchSettingItemStatus = this.f165329d;
        C89219l.m154721d(linearLayout3, "");
        C89219l.m154721d(videoPublishEditModel5, "");
        C89219l.m154721d(duetSettingItemStatus, "");
        C89219l.m154721d(commentSettingItemStatus, "");
        C89219l.m154721d(stitchSettingItemStatus, "");
        if (!C63238c.f143594u.mo93901a()) {
            if (nVar5.mo114941g()) {
                boolean a3 = C68034bs.m120335a(videoPublishEditModel5);
                nVar5.f162856r = C1764a.m5927a(LayoutInflater.from(linearLayout3.getContext()), R.layout.agp, linearLayout3, false);
                linearLayout3.addView(nVar5.f162856r, new LinearLayout.LayoutParams(-1, nVar5.mo114925a(56.0f)));
                View view2 = nVar5.f162856r;
                if (view2 != null) {
                    view2.setOnClickListener(new C72644n.View$OnClickListenerC72650f(nVar5, a3, str, hashMap));
                }
                nVar5.f162840b = videoPublishEditModel5.commentSetting == 0;
                if (C72681t.m128157a()) {
                    if (!C63238c.f143594u.mo93903b()) {
                        nVar5.f162843e = true;
                    } else {
                        if (nVar5.f162858t) {
                            nVar5.f162843e = videoPublishEditModel5.allowDownloadSetting == 0;
                        }
                        C1731i.m5635a((Callable) C72644n.CallableC72652h.f162877a).mo5533a(new C72644n.C72653i(nVar5), C1731i.f5564c);
                    }
                }
                duetSettingItemStatus._visibility.setValue(8);
                commentSettingItemStatus._visibility.setValue(8);
            } else {
                Context context3 = linearLayout3.getContext();
                C89219l.m154716b(context3, "");
                C72636j jVar = new C72636j(duetSettingItemStatus, context3);
                Context context4 = linearLayout3.getContext();
                C89219l.m154716b(context4, "");
                C72636j jVar2 = new C72636j(stitchSettingItemStatus, context4);
                Context context5 = linearLayout3.getContext();
                C89219l.m154716b(context5, "");
                C72636j jVar3 = new C72636j(commentSettingItemStatus, context5);
                CommonSettingItemStatus commonSettingItemStatus2 = jVar.f162813c;
                C72636j.C72637a aVar5 = new C72636j.C72637a("duet");
                aVar5.f162815a = C68034bs.m120335a(videoPublishEditModel5);
                aVar5.f162816b = C63247i.m114603a().mo73277e().getReactDuetSettingCurrent(2) == C68034bs.f152394e;
                if (!videoPublishEditModel5.mIsFromDraft) {
                    VideoPublishEditModel videoPublishEditModel6 = nVar5.f162854p;
                    if (C71073b.m125559a(videoPublishEditModel6 != null ? videoPublishEditModel6.getMainBusinessContext() : null) != null) {
                        aVar5.f162816b = true;
                    }
                }
                aVar5.f162817c = C70975bo.m125297a((BaseShortVideoContext) videoPublishEditModel5);
                aVar5.f162818d = R.string.bdk;
                aVar5.f162819e = R.string.c_c;
                aVar5.f162820f = R.string.h7v;
                aVar5.f162821g = new C72644n.View$OnClickListenerC72664q(nVar5, videoPublishEditModel5, commonSettingItemStatus2, str, hashMap);
                jVar.mo114920a(aVar5);
                CommonSettingItemStatus commonSettingItemStatus3 = jVar2.f162813c;
                boolean stitchSettingChanged = C63247i.m114603a().mo73277e().getStitchSettingChanged(false);
                C89233z.C89234a aVar6 = new C89233z.C89234a();
                aVar6.element = true;
                if (stitchSettingChanged) {
                    aVar6.element = C63247i.m114603a().mo73277e().getStitchSettingCurrent(0) == 0;
                } else if (C63247i.m114603a().mo73277e().getReactDuetSettingChanged(false)) {
                    aVar6.element = C63247i.m114603a().mo73277e().getReactDuetSettingCurrent(2) == 0;
                }
                C72636j.C72637a aVar7 = new C72636j.C72637a("stitch");
                if (!C65437dt.m117155a() || ((!(videoPublishEditModel5 instanceof VideoPublishEditModel) || !videoPublishEditModel5.isShoutout() || !C74418d.MODE_POST.equals(videoPublishEditModel5.mShoutOutsData.getShoutOutsMode())) && videoPublishEditModel5.getVideoLength() <= 0)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                aVar7.f162815a = z4;
                aVar7.f162816b = aVar6.element;
                aVar7.f162817c = C70975bo.m125297a((BaseShortVideoContext) videoPublishEditModel5);
                aVar7.f162818d = R.string.g4x;
                aVar7.f162819e = R.string.c_k;
                aVar7.f162820f = R.string.h7z;
                aVar7.f162821g = new C72644n.View$OnClickListenerC72666r(videoPublishEditModel5, aVar6, commonSettingItemStatus3, str, hashMap);
                jVar2.mo114920a(aVar7);
                C63247i.m114603a().mo73277e().setStitchSettingChanged(true);
                AVPreferences e = C63247i.m114603a().mo73277e();
                if (C89219l.m154714a((Object) commonSettingItemStatus3._checked.getValue(), (Object) true)) {
                    i = C68034bs.f152395f;
                } else {
                    i = C68034bs.f152394e;
                }
                e.setStitchSettingCurrent(i);
                CommonSettingItemStatus commonSettingItemStatus4 = jVar3.f162813c;
                C72636j.C72637a aVar8 = new C72636j.C72637a(UGCMonitor.EVENT_COMMENT);
                aVar8.f162815a = true;
                aVar8.f162816b = videoPublishEditModel5.commentSetting == 0;
                aVar8.f162819e = 0;
                aVar8.f162820f = R.string.h7t;
                aVar8.f162821g = new C72644n.View$OnClickListenerC72651g(videoPublishEditModel5, commonSettingItemStatus4, hashMap);
                jVar3.mo114920a(aVar8);
                PrivacyServiceImpl.m103033c().mo93974a(new C72644n.C72647c(jVar, jVar2, jVar3));
            }
        }
        this.f165262E = (TuxTextView) view.findViewById(R.id.m4);
        this.f165263F = (TuxTextView) view.findViewById(R.id.m3);
        this.f165322av = (TuxTextView) view.findViewById(R.id.h2);
        if (C68044c.m120346a() == 1) {
            this.f165322av.setVisibility(0);
            TuxTextView tuxTextView = this.f165322av;
            ActivityC0945e activity = getActivity();
            C89219l.m154721d(activity, "");
            C23001b a4 = C23005c.m43393a(C74041w.C74042a.f166189a).mo37368a(activity);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a5 = C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            a4.setBounds(0, 0, a5, C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system2.getDisplayMetrics())));
            tuxTextView.setCompoundDrawablesRelative(a4, null, null, null);
            view.findViewById(R.id.ark).getLayoutParams().height = (int) C13628n.m24520b(getContext(), 184.0f);
            ((RelativeLayout.LayoutParams) view.findViewById(R.id.bdj).getLayoutParams()).topMargin = (int) C13628n.m24520b(getContext(), 184.0f);
            ((RelativeLayout.LayoutParams) view.findViewById(R.id.gp).getLayoutParams()).topMargin = (int) C13628n.m24520b(getContext(), 184.0f);
            ((RelativeLayout.LayoutParams) view.findViewById(R.id.gz).getLayoutParams()).topMargin = (int) C13628n.m24520b(getContext(), 184.0f);
            ((RelativeLayout.LayoutParams) view.findViewById(R.id.bkz).getLayoutParams()).bottomMargin = (int) C13628n.m24520b(getContext(), 56.0f);
            int a6 = (C13628n.m24504a(getContext()) - ((int) C13628n.m24520b(getContext(), 46.0f))) / 3;
            this.f165322av.setMaxWidth(a6);
            this.f165262E.setMaxWidth(a6);
            this.f165263F.setMaxWidth(a6);
        }
        HashTagMentionEditText hashTagMentionEditText = (HashTagMentionEditText) view.findViewById(R.id.ass);
        this.f165350y = hashTagMentionEditText;
        hashTagMentionEditText.requestFocus();
        if (Build.VERSION.SDK_INT >= 28) {
            this.f165350y.setFallbackLineSpacing(false);
        }
        this.f165343r = new C71804ej(this, this.f165350y, this.f165262E, this.f165263F, this.f165322av, this.f165260C, this.f165268K);
        if (this.f165309ai.mo93971a()) {
            this.f165344s.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC73580cm(this));
        }
        this.f165321au = new C69881bf(this.f165268K.creationId, this.f165343r, view);
        new C71919l(this, this.f165343r, view);
        this.f165343r.mo113455a();
        this.f165346u = (OmnipotentRoundCornerImgView) view.findViewById(R.id.bkz);
        this.f165346u.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ((OmnipotentRoundCornerImgView) view.findViewById(R.id.bl0)).setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (this.f165268K.mIsFromDraft && this.f165268K.getVideoCoverPath() != null) {
            C80720e.m139931c(this.f165268K.getVideoCoverPath());
            this.f165268K.generateVideoCoverPath();
        }
        m129680L();
        this.f165346u.setOnClickListener(new AbstractView$OnClickListenerC81441k() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C7356311 */

            static {
                Covode.recordClassIndex(86300);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
            /* renamed from: a */
            public final void mo78773a(View view) {
                UrlModel urlModel;
                MethodCollector.m26663i(11599);
                OmnipotentRoundCornerImgView omnipotentRoundCornerImgView = C73560cj.this.f165346u;
                omnipotentRoundCornerImgView.buildDrawingCache(true);
                Bitmap copy = omnipotentRoundCornerImgView.getDrawingCache(true).copy(Bitmap.Config.RGB_565, false);
                omnipotentRoundCornerImgView.destroyDrawingCache();
                C73560cj.this.f165272O = new VideoCoverBitmapHolder();
                C73560cj.this.getLifecycle().mo4012a(C73560cj.this.f165272O);
                if (C73560cj.this.f165273P != null) {
                    copy = C73560cj.this.f165273P;
                }
                VideoCoverBitmapHolder.f164604a = copy;
                C73560cj.this.f165350y.setShouldDisableTrim(true);
                C73560cj.this.mo116148a(true);
                String str = null;
                if (C73560cj.this.f165276S.isEmpty() || C73560cj.this.f165276S.get(1) == null || C73560cj.this.f165276S.get(1).f2751b == null) {
                    urlModel = null;
                } else {
                    str = C73560cj.this.f165276S.get(1).f2751b.getAnchorText();
                    urlModel = C73560cj.this.f165276S.get(1).f2751b.getAnchorIconUrl();
                }
                ActivityC0945e activity = C73560cj.this.getActivity();
                OmnipotentRoundCornerImgView omnipotentRoundCornerImgView2 = C73560cj.this.f165346u;
                TuxTextView tuxTextView = C73560cj.this.f165347v;
                VideoPublishEditModel videoPublishEditModel = C73560cj.this.f165268K;
                int permission = C73560cj.this.f165338m.getValue().getPermission();
                String str2 = C73560cj.this.f165304ab;
                Intent intent = new Intent(activity, VEVideoPublishPreviewActivity.class);
                intent.putExtra("args", (Serializable) videoPublishEditModel);
                intent.putExtra("extra_publish_preview_anchor_text", str);
                intent.putExtra("extra_publish_preview_anchor_icon_url", urlModel);
                intent.putExtra("extra_publish_preview_permission", permission);
                intent.putExtra("extra_publish_preview_last_group_id", str2);
                C0792v.m2752a(omnipotentRoundCornerImgView2, "transition_view_v1");
                C0792v.m2752a(tuxTextView, "transition_view_v2");
                Bundle a = C0576b.m2190a(activity, C0692e.m2449a(omnipotentRoundCornerImgView2, "transition_view_v1"), C0692e.m2449a(tuxTextView, "transition_view_v2")).mo2564a();
                C89219l.m154721d(activity, "");
                C89219l.m154721d(intent, "");
                C84412c.m145204a(intent);
                activity.startActivityForResult(intent, 8, a);
                C73560cj.this.f165270M = true;
                C73560cj.this.mo116167r();
                MethodCollector.m26664o(11599);
            }
        });
        this.f165347v = (TuxTextView) view.findViewById(R.id.a59);
        View findViewById2 = view.findViewById(R.id.a58);
        if (!(C65409cs.m117123a() == 3 || C65409cs.m117123a() == 2)) {
            findViewById2 = this.f165347v;
        }
        findViewById2.setOnClickListener(new AbstractView$OnClickListenerC81441k() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C735703 */

            static {
                Covode.recordClassIndex(86307);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
            /* renamed from: a */
            public final void mo78773a(View view) {
                C39162r.m79460a("click_cover_entrance", new C84425b().mo129406a("creation_id", C73560cj.this.f165268K.creationId).mo129406a("enter_from", "video_post_page").mo129406a("shoot_way", C73560cj.this.f165268K.mShootWay).mo129406a("shoot_entrance", C73560cj.this.mo116168s()).mo129406a("content_type", C71817eu.m126792c(C73560cj.this.f165268K)).mo129406a("content_source", C73560cj.this.f165268K.getAvetParameter().getContentSource()).f188764a);
                C73560cj.this.f165271N = true;
                if (C73560cj.this.f165281X) {
                    C63244g.m114602a().mo73287o().mo104790j().mo104829a(C73560cj.this.requireContext(), "ChooseCover");
                }
                ActivityC0945e activity = C73560cj.this.getActivity();
                VideoPublishEditModel videoPublishEditModel = C73560cj.this.f165268K;
                Intent intent = new Intent(activity, ChooseCoverActivity.class);
                intent.addFlags(603979776);
                intent.putExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL", (Serializable) videoPublishEditModel);
                C84412c.m145199a(activity, intent, 4);
                activity.overridePendingTransition(R.anim.w, R.anim.x);
            }
        });
        this.f165348w = findViewById.findViewById(R.id.dak);
        this.f165340o = (LinearLayout) findViewById.findViewById(R.id.dao);
        this.f165341p = (ImageView) findViewById.findViewById(R.id.dap);
        this.f165348w.setOnClickListener(new AbstractView$OnClickListenerC80259bp() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C7356412 */

            static {
                Covode.recordClassIndex(86301);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                C73560cj.this.f165275R = System.currentTimeMillis();
                C39162r.m79460a("performance_publish_click", new C84425b().mo129406a("publish_action_trace_id", C73560cj.this.f165279V).f188764a);
                C84911q.m145921a("PublishDurationMonitor MANUAL_START");
                C70005cr.m123611a().f156488g = false;
                C70005cr.m123611a().f156489h = false;
                C70005cr.m123611a().mo110456f();
                if (!C63238c.f143594u.mo93903b()) {
                    C80510gr.m139542c("LG");
                    C73560cj.this.mo116147a(new C73665fb(this));
                } else {
                    C73560cj.this.mo116158h();
                }
                if (TextUtils.isEmpty(C73560cj.this.f165268K.playlist_id) && !TextUtils.isEmpty(C73560cj.this.f165268K.playlist_name)) {
                    MixFeedService.m109435k().mo97331g();
                }
            }
        });
        View findViewById3 = findViewById.findViewById(R.id.aol);
        this.f165349x = findViewById3;
        findViewById3.setOnClickListener(new AbstractView$OnClickListenerC80259bp() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C7356513 */

            static {
                Covode.recordClassIndex(86302);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                C70005cr.m123611a().mo110456f();
                if (!C73560cj.this.f165307ae) {
                    C73560cj.this.mo116150b("click save draft button");
                }
            }
        });
        View view3 = this.f165349x;
        View view4 = this.f165348w;
        ActivityC0945e activity2 = getActivity();
        C71859c cVar2 = this.f165306ad;
        C89219l.m154721d(view3, "");
        C89219l.m154721d(view4, "");
        C89219l.m154721d(findViewById, "");
        C89219l.m154721d(cVar2, "");
        int a7 = C16048b.m29633a().mo25412a(true, "studio_draft_button", 0);
        ImageView imageView = (ImageView) view3.findViewById(R.id.aom);
        View findViewById4 = view3.findViewById(R.id.aos);
        view3.setOnTouchListener(new C73690g.View$OnTouchListenerC73691a(imageView, findViewById4, view3));
        if (!(activity2 == null || a7 == 0)) {
            float b = C13628n.m24520b(activity2, 44.0f);
            if (a7 == 1 || a7 == 2) {
                C89219l.m154716b(findViewById4, "");
                findViewById4.setVisibility(8);
                C89219l.m154716b(imageView, "");
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginStart(layoutParams2.getMarginEnd());
                    f = C13628n.m24520b(activity2, 64.0f);
                    if (a7 == 1 && ((Keva) C73602d.f165419a.getValue()).getBoolean("ALLOW_DRAFT_TOOLTIP", true) && view3.getVisibility() == 0) {
                        cVar2.mo113505a(new C71857b("save_draft_button", LiveNetAdaptiveHurryTimeSetting.DEFAULT, new C73690g.C73692b(activity2, view3), (byte) 0));
                    }
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    MethodCollector.m26664o(9805);
                    throw nullPointerException;
                }
            } else {
                if (a7 == 3 || a7 == 4) {
                    C89219l.m154716b(findViewById4, "");
                    ViewGroup.LayoutParams layoutParams3 = findViewById4.getLayoutParams();
                    if (layoutParams3 != null) {
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        layoutParams4.setMarginEnd((int) C13628n.m24520b(activity2, 12.0f));
                        if (a7 == 3) {
                            C89219l.m154716b(imageView, "");
                            ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                            if (layoutParams5 != null) {
                                ((LinearLayout.LayoutParams) layoutParams5).setMarginStart(layoutParams4.getMarginEnd());
                            } else {
                                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                MethodCollector.m26664o(9805);
                                throw nullPointerException2;
                            }
                        } else {
                            C89219l.m154716b(imageView, "");
                            imageView.setVisibility(8);
                            View findViewById5 = view4.findViewById(R.id.dan);
                            C89219l.m154716b(findViewById5, "");
                            findViewById5.setVisibility(8);
                            layoutParams4.setMarginStart(layoutParams4.getMarginEnd());
                        }
                        view3.setMinimumWidth((int) C13628n.m24520b(activity2, 64.0f));
                    } else {
                        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        MethodCollector.m26664o(9805);
                        throw nullPointerException3;
                    }
                } else if (a7 == 5) {
                    C89219l.m154716b(imageView, "");
                    imageView.setVisibility(8);
                    View findViewById6 = view4.findViewById(R.id.dan);
                    C89219l.m154716b(findViewById6, "");
                    findViewById6.setVisibility(8);
                    view3.setBackgroundResource(0);
                    LinearLayout linearLayout4 = (LinearLayout) findViewById;
                    linearLayout4.removeView(view3);
                    linearLayout4.removeView(view4);
                    linearLayout4.addView(view4, 0);
                    linearLayout4.addView(view3, -1);
                    linearLayout4.setOrientation(1);
                    f = -1.0f;
                    b = C13628n.m24520b(activity2, 32.0f);
                }
                f = -2.0f;
            }
            view3.setLayoutParams(new LinearLayout.LayoutParams((int) f, (int) b));
            view4.getLayoutParams().width = -1;
        }
        List<AVChallenge> readTextChallenges = this.f165268K.getTextStickerChallenges().getReadTextChallenges();
        List list4 = this.f165268K.challenges;
        if (list4 != null && !list4.isEmpty()) {
            this.f165319as.f162803a = (AVChallenge) list4.get(0);
        }
        C63238c.f143586m.mo93853b().mo93861a(Boolean.valueOf(this.f165268K.isPrivate == 1));
        C52864a aVar9 = this.f165315ao;
        List list5 = this.f165268K.geofencingSetting;
        C89219l.m154721d(this, "");
        GeoFencingSettingItem geoFencingSettingItem2 = aVar9.f121618b;
        if (geoFencingSettingItem2 != null) {
            C89219l.m154721d(this, "");
            if (!GeoFencingSettingItem.m97717a()) {
                geoFencingSettingItem2.f121595a.observe(this, new GeoFencingSettingItem.C52861d(geoFencingSettingItem2));
                C52880a.m97733a(new GeoFencingSettingItem.C52862e(geoFencingSettingItem2, list5));
            }
        }
        if (!C52864a.C52865a.m97724a()) {
            aVar9.f121619c.observe(this, new C52864a.C52867c(aVar9));
            C52880a.m97733a(new C52864a.C52868d(aVar9, list5));
        }
        if (this.f165268K.title != null && this.f165268K.title.trim().isEmpty()) {
            VideoPublishEditModel videoPublishEditModel7 = this.f165268K;
            videoPublishEditModel7.title = videoPublishEditModel7.title.trim();
        }
        if (!TextUtils.isEmpty(this.f165268K.chain)) {
            C71804ej ejVar = this.f165343r;
            String str2 = this.f165268K.title;
            String str3 = this.f165268K.chain;
            ejVar.f160912c.setText(str2);
            Editable text = ejVar.f160912c.getText();
            if (text != null) {
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("title", str2);
                hashMap2.put("text", text.toString());
                C63247i.m114603a().mo73287o().mo104796p().mo104777a(new C71809em(str2, text), C71804ej.f160910a, "setTitleAndChain", hashMap2);
            }
            ejVar.f160912c.setSelection(str2.length());
            ejVar.f160923n = str3;
            ejVar.f160924o = true;
        } else {
            this.f165343r.f160912c.setText(this.f165268K.title);
        }
        C71804ej ejVar2 = this.f165343r;
        String str4 = this.f165268K.creationId;
        ejVar2.f160919j = str4;
        if (ejVar2.f160912c != null) {
            ejVar2.f160912c.setCreationId(str4);
        }
        if (this.f165268K.isDuet()) {
            this.f165343r.mo113456a(1);
        } else if (this.f165268K.isReaction()) {
            this.f165343r.mo113456a(2);
        } else if (this.f165268K.isCommentReply()) {
            this.f165343r.mo113456a(3);
        }
        this.f165343r.mo113463c(this.f165268K.structList);
        ArrayList arrayList = new ArrayList();
        if (this.f165268K.challenges != null) {
            arrayList.addAll(this.f165268K.challenges);
        }
        arrayList.addAll(readTextChallenges);
        this.f165343r.f160912c.f166462C.clear();
        this.f165343r.mo113458a(arrayList);
        C69905c b2 = C70005cr.m123611a().mo70084b();
        if (!(this.f165268K.mIsFromDraft || b2 == null || b2.challenge == null)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(b2.challenge);
            this.f165343r.mo113458a(arrayList2);
        }
        if (this.f165268K.stickerChallenge != null && !this.f165268K.stickerChallenge.infoStickerChallenges().isEmpty()) {
            Collection<AVChallenge> infoStickerChallenges = this.f165268K.stickerChallenge.infoStickerChallenges();
            ArrayList arrayList3 = new ArrayList();
            if (this.f165268K.challenges == null || this.f165268K.challenges.isEmpty()) {
                arrayList3.addAll(infoStickerChallenges);
            } else {
                for (AVChallenge aVChallenge : infoStickerChallenges) {
                    if (aVChallenge != null && !this.f165268K.challenges.contains(aVChallenge)) {
                        arrayList3.add(aVChallenge);
                    }
                }
            }
            this.f165343r.mo113458a(arrayList3);
        }
        Mission a8 = C63238c.f143585l.mo93813a(this.f165268K.commerceData);
        this.f165299aO = a8;
        if (a8 != null) {
            this.f165350y.setPublishExtensionDataContainer(this);
            this.f165343r.mo113461b(this.f165299aO.getChallengeNames());
            if (this.f165299aO.getMentionedUsers() != null && !this.f165299aO.getMentionedUsers().isEmpty()) {
                Iterator<MissionUser> it = this.f165299aO.getMentionedUsers().iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    this.f165343r.mo113459a(next.getNickname(), next.getUid(), next.getNickname());
                }
            }
        }
        if (!this.f165268K.publishDuetMentionedUserList.isEmpty()) {
            for (String str5 : this.f165268K.publishDuetMentionedUserList) {
                this.f165343r.mo113460b(str5);
            }
        }
        DuetStickerStruct a9 = C71073b.m125559a(this.f165268K.getMainBusinessContext());
        if (!(a9 == null || a9.getUserList() == null || a9.getUserList().size() <= 0)) {
            for (DuetStickerUserStruct duetStickerUserStruct : a9.getUserList()) {
                this.f165343r.mo113459a(duetStickerUserStruct.f169294a, duetStickerUserStruct.f169298e, duetStickerUserStruct.f169297d);
            }
        }
        if (!(this.f165268K.mentionUserModel == null || (a = C80209ad.m139033a(this.f165268K.mentionUserModel)) == null || a.isEmpty())) {
            for (User user : a) {
                if (user != null) {
                    this.f165343r.f160912c.mo116536a(user.getNickname(), user.getUid(), user.getSecUid());
                }
            }
        }
        this.f165343r.f160912c.mo116502a(true);
        if (bundle != null) {
            this.f165319as.f162803a = (AVChallenge) bundle.getSerializable("challenge");
            this.f165338m.setValue(new C62855a(bundle.getInt("permission"), (List) bundle.getSerializable("excludeUserList")));
            this.f165269L = bundle.getBoolean("contentModified");
            this.f165278U = bundle.getString("publish_id");
            this.f165279V = bundle.getString("publish_action_trace_id");
        } else {
            this.f165279V = UUID.randomUUID().toString();
        }
        for (C0692e<Class<?>, IAVPublishExtension<?>> eVar : this.f165276S) {
            eVar.f2751b.onCreate(this, (LinearLayout) view.findViewById(R.id.ay2), bundle, AVPublishContentType.Video, C70975bo.m125296a(this.f165268K), new ExtensionMisc(null, null, this.f165268K.microAppModel, this, extensionDataRepo, new MobParam("video_post_page", this.f165268K.mShootWay, this.f165268K.creationId), C75898d.m133088b(this.f165268K)), new C73581cn(this));
        }
        for (C0692e<Class<?>, IAVPublishExtension<?>> eVar2 : this.f165276S) {
            eVar2.f2751b.onCreateFinish();
        }
        this.f165328c._leftText.setValue(getString(R.string.sp));
        if (this.f165268K.mIsFromDraft && this.f165266I.mo114936b(this.f165328c) == 1) {
            C71073b.m125571b(this.f165268K);
            mo116166q();
        }
        if (C46981gn.m90261a()) {
            this.f165265H.f162448a.mo101695a(new C73582co(this));
        }
        if (C72631i.m128108a()) {
            this.f165265H.f162448a.mo101695a(new C73583cp(this));
        } else if (m129691j().booleanValue()) {
            this.f165265H.f162448a.mo101697a(false);
            this.f165265H.f162448a.mo101695a(new C73584cq(this));
        }
        m129672D();
        this.f165265H.mo114732a(this.f165268K);
        if (z2) {
            this.f165330e._visibility.setValue(0);
            this.f165330e.addOnClickListener(new C73585cr(this));
        }
        this.f165338m.observe(this, new C73594cs(this));
        this.f165315ao.mo88537a(this, new C73595ct(this));
        this.f165343r.f160932w.add(C27245k.m54229a(this));
        ((CheckBox) view.findViewById(R.id.a4n)).setVisibility(8);
        String a10 = SettingsManager.m29616a().mo25398a("video_description", "");
        if (!TextUtils.isEmpty(a10)) {
            this.f165350y.setHint(a10);
        }
        m129686a(view);
        C63253l.m114610a().mo73330z().mo93820a(this.f165325ay, this);
        m129683O();
        m129671C();
        VideoPrivacySettingsItem videoPrivacySettingsItem2 = this.f165351z;
        if (videoPrivacySettingsItem2 != null) {
            this.f165266I.mo114929a((View) videoPrivacySettingsItem2);
            m129670B();
        }
        MethodCollector.m26664o(9805);
    }

    /* renamed from: a */
    public final void mo116148a(boolean z) {
        this.f165343r.mo113462c();
        if (!z) {
            this.f165343r.f160912c.removeStarAtlas();
            C73973ay.m130101a(getContext(), this.f165350y, false);
        }
        this.f165268K.title = this.f165343r.f160912c.getNoAdTagTextForTitleModule();
        List<AVTextExtraStruct> d = this.f165343r.mo113464d();
        if (d != null) {
            this.f165268K.structList = d;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116149a(final boolean z, final boolean z2) {
        if (this.f165283Z) {
            m129689d("SaveDraft");
            return;
        }
        this.f165283Z = true;
        long j = 0;
        try {
            if (!TextUtils.isEmpty(this.f165268K.commerceData)) {
                j = new JSONObject(this.f165268K.commerceData).getLong("star_atlas_order_id");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        int i = 0;
        C70005cr.m123611a().f156488g = false;
        C70005cr.m123611a().f156489h = false;
        C84425b a = new C84425b().mo129406a("original_resolution", C70976bp.m125319o(this.f165268K)).mo129406a("creation_id", this.f165268K.creationId).mo129406a("shoot_way", this.f165268K.mShootWay).mo129404a("task_id", j).mo129406a("enter_from", "video_post_page").mo129406a("content_source", C71817eu.m126793d(this.f165268K)).mo129406a("content_type", C71817eu.m126792c(this.f165268K)).mo129403a("is_subtitle", this.f165268K.hasSubtitle() ? 1 : 0).mo129406a("from_group_id", C70747dv.m124972a());
        if (CrossLanguageUserExperiment.m103003c().mo93972a()) {
            if (this.f165268K.allowAutoCaptionSetting > 0) {
                i = 1;
            }
            a.mo129403a("trans_auth", i);
        }
        if (this.f165268K.draftId != 0) {
            a.mo129403a("draft_id", this.f165268K.draftId);
        }
        if (TextUtils.isEmpty(this.f165268K.newDraftId)) {
            this.f165268K.newDraftId = C78247b.m136733a();
            a.mo129403a("first_create_time", (int) (System.currentTimeMillis() / 1000));
        }
        a.mo129406a("new_draft_id", this.f165268K.newDraftId);
        C69905c cVar = C70005cr.m123611a().f156482a;
        a.mo129405a("music_id", cVar != null ? Long.valueOf(cVar.f156195id) : "");
        if (this.f165268K.isDuet()) {
            a.mo129403a("is_through_duet_sticker", this.f165268K.duetFromDuetSticker);
        }
        a.mo129403a("creation_duration", this.f165268K.getPreviewInfo().getPreviewVideoLength());
        a.mo129406a("info_sticker_list", this.f165268K.getInfoStickerList());
        a.mo129406a("noise_reducer_status", this.f165268K.isAudioEnhance ? "on" : "off");
        C39162r.m79460a("save_draft", a.f188764a);
        mo116153c("save_draft");
        m129681M();
        mo116160k();
        for (C0692e<Class<?>, IAVPublishExtension<?>> eVar : this.f165276S) {
            eVar.f2751b.onSaveDraft(C70975bo.m125296a(this.f165268K));
        }
        C43213k.m86181a("[realSaveDraft], activity=" + getActivity());
        this.f165268K.mSyncPlatforms = this.f165265H.mo114733b();
        final C43223c a2 = m129685a(this.f165268K);
        if (z && this.f165287aC == null && getActivity() != null && !getActivity().isFinishing()) {
            this.f165287aC = ProgressDialogC81636a.m141497a(getActivity(), getString(R.string.etx));
        }
        this.f165307ae = true;
        C73789r.m129848a(this.f165268K);
        C67296h.m119241c();
        VideoPublishEditModel videoPublishEditModel = this.f165268K;
        final int i2 = z2 ? 1 : 0;
        C69787n.m123312a(new AbstractC69783m.C69786c(a2, z2, videoPublishEditModel, new IDraftService.DraftSaveListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C735747 */

            static {
                Covode.recordClassIndex(86311);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveSuccess() {
                if (z) {
                    C73560cj.this.mo116169t();
                }
                if (z && C73560cj.this.isAdded()) {
                    new C23144b(C73560cj.this).mo37635a(C73560cj.this.getString(R.string.fdg)).mo37637b();
                }
                if (z2 && C73560cj.this.isAdded()) {
                    new C23144b(C73560cj.this).mo37635a(C73560cj.this.getString(R.string.a53)).mo37637b();
                }
                C78397c.m136927a().notifyDraftUpdate(a2);
                C63238c.f143565C.mo73275c().mo101844a(a2, false);
                int i = i2;
                if (i == 0) {
                    C73560cj.this.mo116154d(true);
                } else if (i == 1) {
                    C73560cj.this.mo116154d(false);
                }
                C43213k.m86181a("[saveDraft]: creation id = " + a2.mo73676f() + " Music Path: " + C73560cj.this.f165268K.mMusicPath + " isMusicExist: " + C84902i.m145892a(C73560cj.this.f165268K.mMusicPath));
                C73560cj.this.f165307ae = false;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
                if (z) {
                    C73560cj.this.mo116169t();
                }
                C73560cj cjVar = C73560cj.this;
                boolean a = C43211i.m86178a(draftSaveResult);
                boolean z = z;
                boolean z2 = z2;
                if (z) {
                    if (a) {
                        new C23144b(cjVar).mo37635a(cjVar.getString(R.string.bce)).mo37637b();
                    } else {
                        new C23144b(cjVar).mo37635a(cjVar.getString(R.string.bcf)).mo37637b();
                    }
                    cjVar.f165283Z = false;
                }
                if (z2) {
                    cjVar.mo116154d(false);
                }
                C73560cj.this.f165307ae = false;
            }
        }));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax.AbstractC63200a
    /* renamed from: a */
    public final void mo101679a(String str) {
        VideoPublishEditModel videoPublishEditModel = this.f165268K;
        if (videoPublishEditModel != null) {
            videoPublishEditModel.commerceData = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax.AbstractC63200a
    /* renamed from: a */
    public final void mo101678a(Boolean bool, Boolean bool2) {
        Editable text;
        TagBAUser tagBAUser;
        if (bool.booleanValue()) {
            HashTagMentionEditText hashTagMentionEditText = this.f165350y;
            BcAdModel c = C63253l.f143623a.mo73330z().mo93825c();
            String str = null;
            String handleName = (c == null || (tagBAUser = c.baUser) == null) ? null : tagBAUser.getHandleName();
            BcAdModel c2 = C63253l.f143623a.mo73330z().mo93825c();
            if (c2 != null) {
                str = c2.partnerWith;
            }
            if (!TextUtils.isEmpty(handleName) && hashTagMentionEditText != null) {
                hashTagMentionEditText.removeStarAtlas();
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    str = "";
                }
                String a = C1764a.m5928a(str, Arrays.copyOf(new Object[]{"@".concat(String.valueOf(handleName))}, 1));
                C89219l.m154716b(a, "");
                String sb2 = sb.append(a).append(" ").toString();
                if (!TextUtils.isEmpty(sb2) && (text = hashTagMentionEditText.getText()) != null) {
                    hashTagMentionEditText.mo116496a(sb2.length());
                    Boolean.valueOf(true);
                    hashTagMentionEditText.mo116495a();
                    text.insert(0, sb2);
                    Boolean.valueOf(true);
                    hashTagMentionEditText.mo116501a(sb2);
                    return;
                }
                return;
            }
            return;
        }
        C73973ay.m130101a(getContext(), this.f165350y, bool2.booleanValue());
    }

    /* renamed from: N */
    private String m129682N() {
        return C71817eu.m126792c(this.f165268K);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ C89391z mo116171v() {
        mo116163n();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ C89391z mo116172w() {
        mo116150b("checkServerPrePostAllow");
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax.AbstractC63200a
    /* renamed from: b */
    public final boolean mo101681b() {
        return m129675G().booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax.AbstractC63200a
    /* renamed from: c */
    public final boolean mo101682c() {
        return m129677I().booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IComplianceService
    public boolean getMusicPreventDownload() {
        return m129691j().booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IComplianceService
    public int getPublishPermission() {
        PermissionSettingItem permissionSettingItem = this.f165333h;
        if (permissionSettingItem != null) {
            return permissionSettingItem.getPermission();
        }
        return -1;
    }

    static {
        Covode.recordClassIndex(86297);
    }

    /* renamed from: D */
    private void m129672D() {
        try {
            if (C52912c.f121688a.f121689b.getSilentShareConfigurable().booleanValue()) {
                this.f165265H.f162448a.mo101696a(getString(R.string.fpj));
            }
        } catch (C16041a unused) {
        }
    }

    /* renamed from: E */
    private VideoPublishViewModel m129673E() {
        return (VideoPublishViewModel) C20531t.m38716a(requireActivity()).mo33800a(VideoPublishViewModel.class);
    }

    /* renamed from: F */
    private Boolean m129674F() {
        if (!AVCommerceServiceImpl.m102988h().mo93965b()) {
            return false;
        }
        return m129675G();
    }

    /* renamed from: j */
    static Boolean m129691j() {
        boolean z;
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar == null || !cVar.isPreventDownload()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final /* synthetic */ boolean mo116144A() {
        new C23144b(this).mo37640e(R.string.fdx).mo37637b();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax.AbstractC63200a
    /* renamed from: a */
    public final String mo101676a() {
        VideoPublishEditModel videoPublishEditModel = this.f165268K;
        if (videoPublishEditModel == null) {
            return null;
        }
        return videoPublishEditModel.commerceData;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo116162m() {
        C72591ab.m128073a(getActivity(), C72640l.f162829b, new C73629dz(this), new C73631ea(this), new C73632eb(this), new C73633ec(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.f165275R != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f165275R;
            if (currentTimeMillis < 10000) {
                C80571if.C80572a.m139667a("click_publish", currentTimeMillis);
            }
            this.f165275R = -1;
        }
    }

    /* renamed from: s */
    public final String mo116168s() {
        if (this.f165268K.getAvetParameter() != null) {
            return this.f165268K.getAvetParameter().getStoryShootEntrance();
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final /* synthetic */ C89391z mo116173x() {
        new C23144b(this).mo37640e(R.string.fdx).mo37637b();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ C89391z mo116174y() {
        new C23144b(this).mo37640e(R.string.fdx).mo37637b();
        return null;
    }

    /* renamed from: B */
    private void m129670B() {
        this.f165314an._checked.observe(this, new C73596cu(this));
        this.f165328c._checked.observe(this, new C73597cv(this));
        this.f165329d._checked.observe(this, new C73599cx(this));
    }

    /* renamed from: C */
    private void m129671C() {
        int i;
        if (this.f165296aL) {
            i = 2;
        } else {
            i = 3;
        }
        if (C63253l.f143623a.mo73330z().mo93827e()) {
            i = 1;
        }
        C39162r.m79460a("post_page_show", new C84425b().mo129406a("shoot_way", this.f165268K.mShootWay).mo129403a("creator_type", i).f188764a);
    }

    /* renamed from: G */
    private Boolean m129675G() {
        VideoPublishEditModel videoPublishEditModel = this.f165268K;
        boolean z = true;
        if (videoPublishEditModel != null && videoPublishEditModel.realHasOriginalSound()) {
            return true;
        }
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null && !cVar.isOriginalSound()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: H */
    private Boolean m129676H() {
        VideoPublishEditModel videoPublishEditModel = this.f165268K;
        boolean z = false;
        if (videoPublishEditModel != null && videoPublishEditModel.hasOriginalSound()) {
            return false;
        }
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null && !cVar.isCommerceMusic()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: I */
    private Boolean m129677I() {
        VideoPublishEditModel videoPublishEditModel = this.f165268K;
        boolean z = false;
        if (videoPublishEditModel != null && videoPublishEditModel.hasOriginalSound()) {
            return false;
        }
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null && cVar.isCommerceMusic()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: J */
    private void m129678J() {
        ActivityC0945e activity = getActivity();
        if (activity != null || !C68744j.m121177a()) {
            Intent intent = new Intent();
            intent.putExtra("publish result", "PublishActivity success");
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    /* renamed from: M */
    private void m129681M() {
        VideoPublishEditModel videoPublishEditModel = this.f165268K;
        videoPublishEditModel.setMainBusinessData(C71164e.updateSDKShareContextWhenSaveOrPost(videoPublishEditModel.mIsFromDraft, this.f165268K.getMainBusinessData()));
        this.f165292aH = (C39078ad) C63238c.f143575b.mo46670a(C71164e.getShareContext(this.f165268K.getMainBusinessContext()), C39078ad.class);
    }

    /* renamed from: O */
    private void m129683O() {
        AbstractC72463p pVar = this.f165265H;
        if (pVar != null && pVar.f162448a != null && this.f165265H.f162448a.mo101699c() != null && this.f165265H.f162448a.mo101699c().getVisibility() == 0) {
            ShareServiceImpl.m103039a().mo93978a(getPublishPermission(), getMusicPreventDownload());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo116155e() {
        this.f165286aB.incrementAndGet();
        if (this.f165285aA == null && getActivity() != null && !getActivity().isFinishing()) {
            this.f165285aA = ProgressDialogC81636a.m141497a(getActivity(), getString(R.string.fbq));
            C84911q.m145928d("VideoPublish prepareEffects:" + this.f165285aA);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo116156f() {
        ProgressDialogC81636a aVar;
        if (this.f165286aB.decrementAndGet() == 0 && (aVar = this.f165285aA) != null && aVar.isShowing() && getActivity() != null && !getActivity().isFinishing()) {
            this.f165285aA.dismiss();
            this.f165285aA = null;
        }
    }

    /* renamed from: l */
    public final void mo116161l() {
        for (C0692e<Class<?>, IAVPublishExtension<?>> eVar : this.f165276S) {
            eVar.f2751b.onBackPressed(C70975bo.m125296a(this.f165268K));
        }
        if (!this.f165277T) {
            C63244g.m114602a().mo73287o().mo104790j().mo104829a(getContext(), "onBackPressed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo116164o() {
        AbstractC88403ab.m153596a(C73641ek.f165467a).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new AbstractC88406ae<Boolean>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C735725 */

            static {
                Covode.recordClassIndex(86309);
            }

            /* renamed from: a */
            private void m129752a() {
                if (C73560cj.this.f165280W == -1) {
                    C73560cj cjVar = C73560cj.this;
                    cjVar.f165280W = C74089g.m130285a(cjVar.getContext(), C73560cj.this.f165268K);
                }
                if (C73560cj.this.f165280W != 0) {
                    Bundle c = C73560cj.this.mo116152c(true);
                    c.putInt("pre_publish_type", C73560cj.this.f165280W);
                    if (!C68747m.m121180a()) {
                        C73560cj cjVar2 = C73560cj.this;
                        cjVar2.f165278U = C67296h.m119231a(c, cjVar2.f165278U);
                    } else if (C67296h.m119246f() == 0) {
                        C67295g.m119228a("PublishParallel start pre publish task");
                        C67296h.m119237b();
                        C67296h.m119242c(c);
                    } else if (C68747m.m121182c()) {
                        C67295g.m119228a("PublishParallel resume previous paused task, wait for finish");
                        C67296h.m119234a();
                        C67296h.f150798f = new C73664fa(c);
                    }
                } else if (C68747m.m121180a() && C68747m.m121182c() && C67296h.m119246f() != 0) {
                    C67295g.m119228a("PublishParallel resume previous paused task");
                    C67296h.m119234a();
                }
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
                C73560cj.this.f165305ac = bVar;
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                C84911q.m145926b("fetch user pre publish config failed");
                C84911q.m145924a(th);
                C63244g.m114602a().mo73277e().setEnablePreUploadByUser(false);
                m129752a();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(Boolean bool) {
                Boolean bool2 = bool;
                C84911q.m145921a("fetch user pre publish config onSuccess".concat(String.valueOf(bool2)));
                C63244g.m114602a().mo73277e().setEnablePreUploadByUser(bool2.booleanValue());
                m129752a();
            }
        });
    }

    /* renamed from: t */
    public final void mo116169t() {
        ProgressDialogC81636a aVar = this.f165287aC;
        if (aVar != null && aVar.isShowing() && getActivity() != null && !getActivity().isFinishing()) {
            this.f165287aC.dismiss();
            this.f165287aC = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ C89391z mo116170u() {
        C39162r.m79460a("tns_video_push_words_cancel_ck", new C84425b().mo129406a("creation_id", this.f165268K.creationId).mo129406a("user_id", C63238c.f143594u.mo93906e().mo58660c()).f188764a);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ C89391z mo116175z() {
        if (!this.f165335j.booleanValue()) {
            new C23144b(getActivity()).mo37640e(R.string.gfy).mo37637b();
            return null;
        }
        IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).showAddToMixInPublishPage(getActivity(), new C73650et(this), "video_post_page", "publish_page", this.f165337l, this.f165336k);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo116157g() {
        VideoPublishEditModel videoPublishEditModel;
        if (this.f165310aj != null && (videoPublishEditModel = this.f165268K) != null) {
            if (videoPublishEditModel.tagUserList != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<InteractionTagUserInfo> it = this.f165268K.tagUserList.iterator();
                while (it.hasNext()) {
                    arrayList.add(InteractionTagInfoKt.toMutualUser(it.next()));
                }
                if (arrayList.size() > 0) {
                    this.f165310aj.setVisibility(0);
                    this.f165310aj.mo125023a(new MutualStruct(0, arrayList.size(), arrayList), 4);
                    return;
                }
            }
            this.f165310aj.setVisibility(8);
        }
    }

    /* renamed from: i */
    public final void mo116159i() {
        PublishExtensionModel fromString = PublishExtensionModel.fromString(this.f165268K.commerceData);
        BcAdModel c = C63253l.f143623a.mo73330z().mo93825c();
        if (!(c == null || c.baUser == null)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c.baUser);
            fromString.tcmTagBaInfo = arrayList;
        }
        fromString.brandedContentType = C63253l.f143623a.mo73330z().mo93830h();
        fromString.starAtlasContent = C63253l.f143623a.mo73330z().mo93826d();
        this.f165268K.commerceData = PublishExtensionModel.toString(fromString);
        C73973ay.m130101a(getContext(), this.f165350y, false);
        AbstractC81915c.m141874a(new C65514a());
        if (this.f165338m.getValue().getPermission() == 1) {
            mo116151b(true);
            return;
        }
        AbstractC63167ab abVar = C63238c.f143576c;
        getContext();
        abVar.mo93766a(new AbstractC63167ab.AbstractC63168a() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C735692 */

            static {
                Covode.recordClassIndex(86306);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab.AbstractC63168a
            /* renamed from: a */
            public final void mo101618a(boolean z) {
                C73560cj.this.mo116151b(false);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C89391z mo116166q() {
        DuetStickerStruct a = C71073b.m125559a(this.f165268K.getMainBusinessContext());
        if (!(a == null || a.getUserList() == null || a.getUserList().size() <= 0)) {
            for (DuetStickerUserStruct duetStickerUserStruct : a.getUserList()) {
                this.f165343r.mo113460b(duetStickerUserStruct.mo118710a().getUid());
            }
        }
        return C89391z.f203057a;
    }

    /* renamed from: r */
    public final void mo116167r() {
        C39162r.m79460a("click_preview_entrance", new C84425b().mo129406a("original_resolution", C70976bp.m125319o(this.f165268K)).mo129406a("creation_id", this.f165268K.creationId).mo129406a("enter_from", "video_post_page").mo129406a("shoot_way", this.f165268K.mShootWay).mo129406a("shoot_entrance", mo116168s()).mo129406a("content_source", C71817eu.m126793d(this.f165268K)).mo129406a("content_type", C71817eu.m126792c(this.f165268K)).mo129406a("route", "1").f188764a);
    }

    /* renamed from: K */
    private void m129679K() {
        String trim = this.f165343r.f160912c.getNoAdTagTextForTitleModule().trim();
        List asList = Arrays.asList(trim.split("\n"));
        ArrayList<AVTextExtraStruct> arrayList = new ArrayList();
        for (AVTextExtraStruct aVTextExtraStruct : this.f165268K.structList) {
            arrayList.add(aVTextExtraStruct.clone());
        }
        Collections.sort(arrayList, C73639ei.f165465a);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (AVTextExtraStruct aVTextExtraStruct2 : arrayList) {
            String substring = trim.substring(aVTextExtraStruct2.getStart(), aVTextExtraStruct2.getEnd());
            int i4 = i2;
            while (true) {
                if (i4 >= asList.size()) {
                    break;
                }
                int indexOf = ((String) asList.get(i4)).indexOf(substring, i3);
                if (indexOf >= 0) {
                    i3 = substring.length() + indexOf;
                    aVTextExtraStruct2.setLineIndex(i4);
                    aVTextExtraStruct2.setStart(indexOf);
                    aVTextExtraStruct2.setEnd(i3);
                    i2 = i4;
                    break;
                }
                i4++;
                i3 = 0;
            }
        }
        this.f165268K.contentDesc = asList;
        this.f165268K.contentDescExtra = arrayList;
        String replaceAll = trim.replaceAll("\n+", " ");
        List<AVTextExtraStruct> list = this.f165268K.structList;
        Collections.sort(list, C73640ej.f165466a);
        for (AVTextExtraStruct aVTextExtraStruct3 : list) {
            String substring2 = trim.substring(aVTextExtraStruct3.getStart(), aVTextExtraStruct3.getEnd());
            int indexOf2 = replaceAll.indexOf(substring2, i);
            if (indexOf2 >= 0) {
                i = substring2.length() + indexOf2;
                aVTextExtraStruct3.setStart(indexOf2);
                aVTextExtraStruct3.setEnd(i);
            }
        }
        this.f165268K.returnCaptionTitle = replaceAll;
        this.f165268K.returnCaptionStructList = list;
    }

    /* renamed from: h */
    public final void mo116158h() {
        C62855a value = this.f165338m.getValue();
        if (value == null || value.getPermission() != -1) {
            C34413e eVar = this.f165343r.f160931v;
            if (!eVar.f81334a.isEmpty() && eVar.f81337d) {
                C39162r.m79460a("input_word_cut", new C84425b().mo129406a("enter_from", "publish").mo129406a("input_content", eVar.f81335b).mo129406a("input_content_cut", eVar.f81336c.mo46674b(eVar.f81334a)).f188764a);
                eVar.mo60830a();
            }
            if (!C63253l.f143623a.mo73330z().mo93814a(getActivity(), getContext(), m129676H(), this.f165343r.mo113464d(), new C73618do(this), new C73619dp(this), new C73620dq(this), new C73621dr(this)).booleanValue()) {
                int a = C63253l.f143623a.mo73330z().mo93811a(getContext(), getActivity(), this.f165318ar, m129676H(), m129677I(), this.f165343r.mo113464d());
                if (a == 1) {
                    this.f165318ar = true;
                } else if (a == 0) {
                    mo116159i();
                }
            }
        } else {
            this.f165303aa = "click_post";
            C71826f.m126820a("click_post", value.getPermission());
            C69924cf cfVar = this.f165339n;
            C73617dn dnVar = new C73617dn(this);
            DialogInterface.OnDismissListener onDismissListener = this.f165302aR;
            if (cfVar.f156261e != null) {
                cfVar.mo110334a(cfVar.f156262f, cfVar.f156263g, false, false);
                cfVar.f156261e.mo110457a(cfVar.f156257a, dnVar, onDismissListener);
            }
        }
    }

    /* renamed from: k */
    public final void mo116160k() {
        mo116148a(false);
        C62855a value = this.f165338m.getValue();
        if (value != null) {
            this.f165268K.isPrivate = value.getPermission();
            this.f165268K.excludeUserList = value.getExcludeUserList();
            this.f165268K.allowRecommend = value.getAllowRecommend();
        }
        this.f165268K.geofencingSetting = this.f165315ao.mo88536a();
        if (this.f165319as.mo114911b() == null || !C80345dj.m139308a(this.f165343r.mo113464d(), this.f165319as.mo114910a())) {
            this.f165268K.challenges = null;
        } else {
            this.f165268K.challenges = new ArrayList();
            this.f165268K.challenges.add(this.f165319as.f162803a);
        }
        C72644n nVar = this.f165266I;
        if (nVar != null) {
            this.f165268K.commentSetting = nVar.mo114926a(this.f165314an);
            this.f165268K.allowDownloadSetting = this.f165266I.mo114940f();
            if (CrossLanguageUserExperiment.m103003c().mo93972a() && this.f165332g != null) {
                this.f165268K.allowAutoCaptionSetting = C72644n.m128121c(this.f165331f);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view;
        boolean z = false;
        if (SettingsManager.m29616a().mo25400a("studio_reset_publish_view_touch_listener", false) && (view = getView()) != null) {
            C73977ba.f166072a.mo116400a(view, null);
        }
        C71859c cVar = this.f165306ad;
        if (cVar != null) {
            cVar.mo113506b().clear();
            this.f165306ad = null;
        }
        AbstractC88412b bVar = this.f165305ac;
        if (bVar != null) {
            bVar.dispose();
        }
        C84911q.m145921a("ProcessPublish DestroyPublishFragment isPublish:" + this.f165277T);
        if (!this.f165277T) {
            C63244g.m114602a().mo73287o().mo104790j().mo104829a(getContext(), "FragmentDestroy");
        }
        super.onDestroyView();
        if (this.f165265H == null) {
            StringBuilder sb = new StringBuilder("syncModule is null and the fragment's view is null?:->");
            if (getView() == null) {
                z = true;
            }
            C51423a.m95787a(sb.append(z).toString());
        }
        C71804ej ejVar = this.f165343r;
        if (ejVar.f160925p != null) {
            C72613aj ajVar = ejVar.f160925p;
            AbstractC88412b bVar2 = ajVar.f162789f;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            AbstractC88412b bVar3 = ajVar.f162790g;
            if (bVar3 != null) {
                bVar3.dispose();
            }
        }
        for (C0692e<Class<?>, IAVPublishExtension<?>> eVar : this.f165276S) {
            eVar.f2751b.onDestroy();
        }
        C67296h.f150798f = null;
        C73964ar.f166038a.mo116394b();
    }

    /* renamed from: L */
    private void m129680L() {
        boolean z;
        if (this.f165268K.canvasVideoData != null) {
            List<String> sourceInfo = this.f165268K.canvasVideoData.getSourceInfo();
            if (sourceInfo != null && !sourceInfo.isEmpty()) {
                m129688a(this.f165346u, BitmapUtils.decodeBitmap(new File(sourceInfo.get(0))));
            }
        } else if (this.f165268K.isMvThemeVideoType()) {
            String str = this.f165268K.mvCreateVideoData.videoCoverImgPath;
            if (C80720e.m139927b(str)) {
                m129690e(str);
            }
        } else if (!this.f165268K.isMultiVideoEdit()) {
            ArrayList arrayList = new ArrayList();
            if (this.f165268K.mEffectList != null) {
                arrayList.addAll(this.f165268K.mEffectList);
            }
            if (this.f165268K.mTimeEffect != null) {
                arrayList.add(this.f165268K.mTimeEffect);
                if (this.f165268K.mTimeEffect.getKey().equals("1")) {
                    z = true;
                    C73298a.m129357a(arrayList, C50648c.m94911b(C71817eu.m126789a(this.f165268K, C63238c.f143565C.mo73290r().mo86006d())), this.f165268K.mSelectedFilterIntensity, (int) (this.f165268K.mVideoCoverStartTm * 1000.0f), z, this.f165268K.getPreviewInfo(), this.f165268K.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C735736 */

                        static {
                            Covode.recordClassIndex(86310);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                        public final void onGetVideoCoverFailed(int i) {
                            new C23144b(C73560cj.this).mo37640e(R.string.f205096dmt).mo37637b();
                        }

                        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                            if (C73560cj.this.f165346u != null && C73560cj.this.getContext() != null) {
                                Bitmap mergeCoverText = C73560cj.this.f165268K.getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
                                AbstractC0706b a = C0708d.m2514a(C73560cj.this.getResources(), mergeCoverText);
                                a.mo2738a(C13628n.m24520b(C63238c.f143574a, 4.0f));
                                C73560cj.this.f165346u.setImageDrawable(a);
                                C73560cj.this.f165273P = mergeCoverText;
                                C73298a.m129355a(mergeCoverText, C73560cj.this.f165268K.getVideoCoverPath());
                            }
                        }
                    });
                }
            }
            z = false;
            C73298a.m129357a(arrayList, C50648c.m94911b(C71817eu.m126789a(this.f165268K, C63238c.f143565C.mo73290r().mo86006d())), this.f165268K.mSelectedFilterIntensity, (int) (this.f165268K.mVideoCoverStartTm * 1000.0f), z, this.f165268K.getPreviewInfo(), this.f165268K.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C735736 */

                static {
                    Covode.recordClassIndex(86310);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverFailed(int i) {
                    new C23144b(C73560cj.this).mo37640e(R.string.f205096dmt).mo37637b();
                }

                @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    if (C73560cj.this.f165346u != null && C73560cj.this.getContext() != null) {
                        Bitmap mergeCoverText = C73560cj.this.f165268K.getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
                        AbstractC0706b a = C0708d.m2514a(C73560cj.this.getResources(), mergeCoverText);
                        a.mo2738a(C13628n.m24520b(C63238c.f143574a, 4.0f));
                        C73560cj.this.f165346u.setImageDrawable(a);
                        C73560cj.this.f165273P = mergeCoverText;
                        C73298a.m129355a(mergeCoverText, C73560cj.this.f165268K.getVideoCoverPath());
                    }
                }
            });
        } else if (C71817eu.m126799j(this.f165268K)) {
            if (TextUtils.isEmpty(this.f165268K.multiEditVideoRecordData.coverImagePath)) {
                this.f165268K.multiEditVideoRecordData.coverImagePath = C71429d.m126154a();
            }
            String str2 = this.f165268K.multiEditVideoRecordData.coverImagePath;
            if (C80720e.m139927b(str2)) {
                m129690e(str2);
            }
        } else {
            VERecordData a = C71493a.m126273a(this.f165268K.getCurMultiEditVideoRecordData());
            Pair<Integer, Integer> playInOutTime = this.f165268K.getCurMultiEditVideoRecordData().getPlayInOutTime();
            a.mo130356a((long) (((Integer) playInOutTime.first).intValue() * 1000), (long) (((Integer) playInOutTime.second).intValue() * 1000));
            this.f165346u.post(new RunnableC73642el(this, playInOutTime, a));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        for (C0692e<Class<?>, IAVPublishExtension<?>> eVar : this.f165276S) {
            eVar.f2751b.onResume();
        }
        C62855a value = this.f165338m.getValue();
        if (value != null) {
            if (C63238c.f143591r.mo93939c() == 2) {
                this.f165282Y = true;
                if (value.getPermission() == 1) {
                    this.f165338m.setValue(new C62855a(0));
                    value = this.f165338m.getValue();
                    new C23144b(this).mo37635a(getContext().getString(R.string.h6q)).mo37637b();
                }
                this.f165339n.mo110332a(value.getPermission(), (List<User>) null, 0, true, "");
            } else if (C63238c.f143591r.mo93939c() == 1) {
                this.f165282Y = false;
                this.f165339n.mo110332a(value.getPermission(), (List<User>) null, 0, false, "");
            }
            if (C63238c.f143591r.mo93939c() == 2) {
                this.f165282Y = true;
                if (value.getPermission() == 1) {
                    this.f165338m.setValue(new C62855a(0));
                    value = this.f165338m.getValue();
                    new C23144b(this).mo37635a(getContext().getString(R.string.h6q)).mo37637b();
                }
                this.f165339n.mo110332a(value.getPermission(), (List<User>) null, 0, true, "");
            } else if (C63238c.f143591r.mo93939c() == 1) {
                this.f165282Y = false;
                this.f165339n.mo110332a(value.getPermission(), (List<User>) null, 0, false, "");
            }
        }
        this.f165301aQ.mo7036a(this, new C73598cw(this));
        C2564l<Boolean> lVar = m129673E().f165711d;
        lVar.mo7036a(this, new C73611dh(this, lVar));
    }

    /* renamed from: p */
    public final void mo116165p() {
        int i;
        DuetStickerStruct a;
        List<DuetStickerUserStruct> userList;
        if (!(getActivity() == null || getActivity().isFinishing())) {
            this.f165277T = true;
            if (!this.f165290aF && !this.f165294aJ) {
                getActivity().finish();
            }
            C63238c.f143576c.mo93765a(getActivity(), this.f165268K.mStickerID);
            for (C0692e<Class<?>, IAVPublishExtension<?>> eVar : this.f165276S) {
                eVar.f2751b.onPublish(C70975bo.m125296a(this.f165268K));
            }
            C80510gr.m139531a("-2", BehaviorType.EVENT, "CP", null, null, 24);
            this.f165268K.screenBrightness = C39099e.m79372a(getActivity());
            MentionEditText.MentionSpan[] mentionText = this.f165343r.f160912c.getMentionText();
            VideoPublishEditModel videoPublishEditModel = this.f165268K;
            HashSet hashSet = new HashSet();
            if (!(mentionText == null || mentionText.length == 0)) {
                for (MentionEditText.MentionSpan mentionSpan : mentionText) {
                    String str = mentionSpan.f166494g;
                    if (!(str == null || str.length() == 0)) {
                        hashSet.add(mentionSpan.f166494g);
                    }
                }
            }
            if (!(videoPublishEditModel == null || (a = C71073b.m125559a(videoPublishEditModel.getMainBusinessContext())) == null || (userList = a.getUserList()) == null)) {
                Iterator<T> it = userList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().f169297d);
                }
            }
            String valueOf = String.valueOf(hashSet.size());
            if (C71073b.m125559a(this.f165268K.getMainBusinessContext()) == null) {
                i = 0;
            } else {
                i = 1;
            }
            C71824e.m126817a(requireActivity(), this.f165268K, this.f165259B, this.f165293aI, this.f165350y, this.f165265H, this.f165304ab, this.f165298aN, this.f165299aO, valueOf, false, i);
            ActivityC0945e requireActivity = requireActivity();
            VideoPublishEditModel videoPublishEditModel2 = this.f165268K;
            int i2 = this.f165280W;
            String str2 = this.f165279V;
            C89219l.m154721d(requireActivity, "");
            C89219l.m154721d(videoPublishEditModel2, "");
            C89219l.m154721d(str2, "");
            C39162r.m79460a("performance_publish", new C84425b().mo129406a("creation_id", videoPublishEditModel2.creationId).mo129406a("shoot_way", videoPublishEditModel2.mShootWay).mo129406a("content_type", C71817eu.m126792c(videoPublishEditModel2)).mo129403a("video_type", 0).mo129403a("memory_total_size_mb", (int) ((C80272bs.m139142a(requireActivity) / 1024) / 1024)).mo129403a("retry_publish", 0).mo129403a("pre_publish_type", i2).mo129406a("publish_action_trace_id", str2).mo129403a("brightness", videoPublishEditModel2.screenBrightness).mo129403a("is_hd_video", C88278m.m153407a(videoPublishEditModel2) ? 1 : 0).mo129403a("video_upload_type", 1).f188764a);
            if (C68743i.m121176a()) {
                C12290b.m22060a("user_publish_success_rate_parallel", -1, new C69840ar().mo110187a("video_type", (Integer) 0).mo110187a("retry_publish", (Integer) 0).mo110187a("video_upload_type", (Integer) 1).mo110191a());
            }
            C73789r.m129848a(this.f165268K);
            C69787n.m123312a(new AbstractC69783m.C69785b(getActivity(), mo116152c(false), this.f165278U));
            if (this.f165268K.isSaveLocal()) {
                C39162r.m79460a("download", new C84425b().mo129403a("scene_id", 1004).mo129406a("creation_id", this.f165268K.creationId).mo129406a("group_id", "").mo129406a("enter_from", "video_post_page").mo129406a("content_type", C71817eu.m126792c(this.f165268K)).mo129406a("download_type", "self").mo129406a("download_method", "download_with_publish").f188764a);
            }
            mo116153c("publish");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo116163n() {
        String str;
        int i;
        CheckBox checkBox;
        boolean z;
        int a;
        boolean z2;
        if (this.f165283Z) {
            m129689d("Publish");
            return;
        }
        this.f165283Z = true;
        this.f165288aD = SystemClock.uptimeMillis();
        m129681M();
        if (TextUtils.isEmpty(this.f165268K.musicId)) {
            str = "";
        } else {
            str = this.f165268K.musicId;
        }
        if (TextUtils.isEmpty(str)) {
            C69905c cVar = C70005cr.m123611a().f156482a;
            if (cVar == null) {
                str = "";
            } else {
                str = cVar.getMusicId();
            }
        }
        if (this.f165268K != null && !TextUtils.isEmpty(str) && "edit_page_recommend".equals(this.f165268K.mMusicOrigin) && 1 == this.f165268K.comFrom) {
            C84425b a2 = new C84425b().mo129406a("item_id", str);
            C89219l.m154716b("94349537828", "");
            C39162r.m79460a("jarvis_item_click", a2.mo129406a("channel_id", "94349537828").mo129406a("req_id", this.f165268K.aiMusicLogPbImprId).f188764a);
        }
        this.f165343r.mo113462c();
        this.f165268K.title = this.f165343r.f160912c.getNoAdTagTextForTitleModule();
        List<AVTextExtraStruct> d = this.f165343r.mo113464d();
        if (d == null) {
            this.f165268K.structList = new ArrayList();
        } else {
            this.f165268K.structList = d;
        }
        if (f165257ah) {
            m129679K();
        }
        GoodsPublishModel goodsPublishModel = (GoodsPublishModel) AVPublishExtensionUtils.findModel(this.f165276S, GoodsPublishModel.class);
        if (goodsPublishModel != null && !TextUtils.isEmpty(goodsPublishModel.getGoodsDraftId())) {
            this.f165268K.shopDraftId = goodsPublishModel.getGoodsDraftId();
        }
        HotSpotTagPublishModel hotSpotTagPublishModel = (HotSpotTagPublishModel) AVPublishExtensionUtils.findModel(this.f165276S, HotSpotTagPublishModel.class);
        if (hotSpotTagPublishModel != null) {
            this.f165268K.hotSpotTag = hotSpotTagPublishModel.getTag();
            this.f165268K.sentenceId = hotSpotTagPublishModel.getId();
        }
        C62855a value = this.f165338m.getValue();
        if (value != null) {
            this.f165268K.isPrivate = value.getPermission();
            this.f165268K.excludeUserList = value.getExcludeUserList();
            this.f165268K.allowRecommend = value.getAllowRecommend();
        }
        if (this.f165268K.mOutputFile == null || TextUtils.isEmpty(this.f165268K.mOutputFile)) {
            this.f165268K.mOutputFile = C69743b.m123265a(this.f165268K).mo110099h().getPath();
        }
        boolean z3 = false;
        if (CrossLanguageUserExperiment.m103003c().mo93972a()) {
            this.f165268K.allowAutoCaptionSetting = C72644n.m128121c(this.f165331f);
            if (this.f165268K.allowAutoCaptionSetting > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C40382a.f94568a.storeBoolean("privacy_setting_auto_caption", z2);
        }
        this.f165268K.commentSetting = this.f165266I.mo114926a(this.f165314an);
        this.f165268K.reactDuetSetting = this.f165266I.mo114936b(this.f165328c);
        VideoPublishEditModel videoPublishEditModel = this.f165268K;
        C72644n nVar = this.f165266I;
        StitchSettingItemStatus stitchSettingItemStatus = this.f165329d;
        C89219l.m154721d(stitchSettingItemStatus, "");
        if (!C65404cp.m117105a() ? !C89219l.m154714a((Object) stitchSettingItemStatus._checked.getValue(), (Object) true) : (a = C65352av.m117037a()) == 1 || a == 2 ? !nVar.f162842d : !C89219l.m154714a((Object) stitchSettingItemStatus._checked.getValue(), (Object) true)) {
            i = 1;
        } else {
            i = 0;
        }
        videoPublishEditModel.stitchSetting = i;
        this.f165268K.geofencingSetting = this.f165315ao.mo88536a();
        C72644n nVar2 = this.f165266I;
        VideoPublishEditModel videoPublishEditModel2 = this.f165268K;
        C89219l.m154721d(videoPublishEditModel2, "");
        if (C72681t.m128157a()) {
            videoPublishEditModel2.allowDownloadSetting = nVar2.mo114940f();
        }
        this.f165268K.challenges = null;
        int c = this.f165265H.mo114734c();
        if (C71907a.m126982a() && c == 1 && C65687t.m117580b() == 0) {
            c = 0;
        }
        C63244g.m114602a().mo73287o().mo104794n().mo104627a(this.f165268K, c);
        if (this.f165268K.getSaveModel() != null) {
            AVUploadSaveModel saveModel = this.f165268K.getSaveModel();
            if (this.f165266I.mo114935a() || (this.f165266I.f162852n && C65687t.m117580b() > 0)) {
                z = true;
            } else {
                z = false;
            }
            saveModel.setSaveToAlbum(z);
            AVUploadSaveModel saveModel2 = this.f165268K.getSaveModel();
            if ((this.f165266I.f162852n || C71907a.m126982a()) && this.f165268K.hasSubtitle() && C65687t.m117580b() == 2) {
                z3 = true;
            }
            saveModel2.setSaveWithCaption(z3);
            this.f165268K.getSaveModel().setSaveToAppPathInsteadOfAlbum(this.f165266I.f162852n);
            this.f165268K.getSaveModel().setEnableSilentEnhancement(C72644n.C72645a.m128144a());
        }
        this.f165268K.mSyncPlatforms = this.f165265H.mo114733b();
        if (m129674F().booleanValue() && (checkBox = this.f165259B) != null) {
            if (checkBox.isChecked()) {
                this.f165268K.musicUsageConfirmation = 1;
            } else {
                this.f165268K.musicUsageConfirmation = 2;
            }
        }
        if (this.f165335j.booleanValue()) {
            this.f165268K.playlist_id = this.f165337l;
            this.f165268K.playlist_name = this.f165336k;
            C39162r.m79460a("add_playlist_video", new C84425b().mo129406a("enter_from", this.f165268K.enterFrom).mo129406a("enter_method", "publish_page").mo129406a("playlist_id", this.f165337l).f188764a);
        }
        try {
            this.f165268K.mPoiData = C63134c.m114157a().mo101448a(new C73638eh(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
        C43213k.m86181a("start save draft before publish creation id = " + this.f165268K.creationId);
        final C43223c a3 = m129685a(this.f165268K);
        C70005cr.m123611a().f156496p = a3.mo73726r();
        C69787n.m123312a(new AbstractC69783m.C69786c(a3, 1, this.f165268K, new IDraftService.DraftSaveListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C735758 */

            static {
                Covode.recordClassIndex(86312);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveSuccess() {
                C63244g.m114602a().mo73275c().mo101844a(a3, true);
                C63238c.f143566D.mo73308d().mo101651a().mo101660b(a3);
                Context context = C73560cj.this.getContext();
                if (context != null) {
                    new C72692z(context, new C72588aa(context, C73560cj.this.f165268K)).mo114966a(a3);
                }
                C73560cj.this.mo116165p();
            }

            @Override // com.p2082ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
                C73560cj.this.mo116165p();
            }
        }));
    }

    /* renamed from: a */
    private static C1175ad m129684a(Fragment fragment) {
        return C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null);
    }

    /* renamed from: e */
    private void m129690e(String str) {
        this.f165346u.post(new RunnableC73643em(this, str));
    }

    /* renamed from: d */
    private static boolean m129689d(String str) {
        String concat = "DoubleManualFinishPublish ".concat(String.valueOf(str));
        C84911q.m145926b(concat);
        C40971f.m82489a(concat);
        C84911q.m145926b("BlockDoubleManualFinishPublish");
        return true;
    }

    /* renamed from: a */
    public static C43223c m129685a(VideoPublishEditModel videoPublishEditModel) {
        AbstractC63202az.AbstractC63203a<Boolean> b = C63238c.f143586m.mo93853b();
        boolean z = true;
        if (videoPublishEditModel.isPrivate() != 1) {
            z = false;
        }
        b.mo93861a(Boolean.valueOf(z));
        new C70974bn("VideoPublishFragment");
        C43223c b2 = C70974bn.m125291b(videoPublishEditModel);
        b2.f100886I = System.currentTimeMillis();
        return b2;
    }

    /* renamed from: b */
    public final void mo116150b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C84911q.m145922a(f165256ag, "save draft scene=".concat(String.valueOf(str)));
            if (!C63238c.f143594u.mo93903b()) {
                mo116147a(new C73627dx(this, true, false));
            } else {
                mo116149a(true, false);
            }
        } else {
            throw new IllegalArgumentException("save draft scene can't be empty");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C69924cf.m123487a(bundle);
        for (C0692e<Class<?>, IAVPublishExtension<?>> eVar : this.f165276S) {
            eVar.f2751b.onSaveInstanceState(bundle);
        }
        bundle.putSerializable("challenge", this.f165319as.f162803a);
        bundle.putBoolean("contentModified", this.f165269L);
        bundle.putString("publish_id", this.f165278U);
        bundle.putString("publish_action_trace_id", this.f165279V);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo116146a(final C72631i.AbstractC72633b bVar) {
        final String str;
        AbstractC32846a e = C63238c.f143594u.mo93906e();
        if (e != null) {
            str = e.mo58660c();
        } else {
            str = "";
        }
        C72631i iVar = new C72631i();
        final Dialog a = iVar.mo114915a(getContext());
        if (a != null) {
            iVar.f162808a = new C72631i.AbstractC72633b() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C7356715 */

                static {
                    Covode.recordClassIndex(86304);
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
                /* renamed from: a */
                public final void mo114916a() {
                    a.dismiss();
                    bVar.mo114916a();
                    C72631i.m128107a("", str, "video_post_page", "download_with_publish", "download");
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
                /* renamed from: b */
                public final void mo114917b() {
                    a.dismiss();
                    bVar.mo114917b();
                    C72631i.m128107a("", str, "video_post_page", "download_with_publish", "cancel");
                }
            };
            a.show();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax.AbstractC63200a
    /* renamed from: b */
    public final void mo101680b(Boolean bool) {
        View view;
        CheckBox checkBox;
        View view2;
        CheckBox checkBox2;
        if (bool.booleanValue()) {
            if (m129674F().booleanValue() && (checkBox2 = this.f165259B) != null && !checkBox2.isChecked()) {
                this.f165324ax = true;
                this.f165259B.setChecked(true);
            }
            if (m129674F().booleanValue() && (view2 = this.f165323aw) != null) {
                view2.setVisibility(8);
                return;
            }
            return;
        }
        if (m129674F().booleanValue() && this.f165324ax && (checkBox = this.f165259B) != null && checkBox.isChecked()) {
            this.f165324ax = false;
            this.f165259B.setChecked(false);
        }
        if (m129674F().booleanValue() && (view = this.f165323aw) != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo116153c(String str) {
        C39162r.m79460a("leave_post_page", new C84425b().mo129406a("enter_from", "video_post_page").mo129406a("shoot_way", this.f165268K.mShootWay).mo129406a("creation_id", this.f165268K.creationId).mo129406a("leave_action", str).mo129403a("is_enter_cover", this.f165271N ? 1 : 0).mo129403a("is_enter_preview", this.f165270M ? 1 : 0).mo129403a("is_content_modified", this.f165269L ? 1 : 0).mo129405a("app_mem_use", C73933a.C73934a.m130028a("av_video_edit").getFirst()).mo129405a("availble_mem", C73933a.C73934a.m130028a("av_video_edit").getSecond()).mo129404a("duration", System.currentTimeMillis() - this.f165274Q).mo129406a("publish_action_trace_id", this.f165279V).f188764a);
    }

    /* renamed from: a */
    private void m129686a(View view) {
        String string;
        MethodCollector.m26663i(9816);
        if (!m129674F().booleanValue()) {
            MethodCollector.m26664o(9816);
            return;
        }
        if (this.f165323aw == null) {
            this.f165323aw = ((ViewStub) view.findViewById(R.id.coq)).inflate();
        }
        String string2 = view.getResources().getString(R.string.eqc);
        String string3 = view.getResources().getString(R.string.eqd);
        if (string2.contains(string3.toLowerCase())) {
            string = string2.replace(string3.toLowerCase(), string3);
        } else {
            string = view.getResources().getString(R.string.eqc, string3);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(C73970aw.m130097a(C0643b.m2378c(view.getContext(), R.color.bx)), string.length() - string3.length(), string.length(), 18);
        TextView textView = (TextView) this.f165323aw.findViewById(R.id.cor);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        CheckBox checkBox = (CheckBox) this.f165323aw.findViewById(R.id.abz);
        this.f165259B = checkBox;
        checkBox.setChecked(true);
        this.f165259B.setClickable(false);
        this.f165323aw.setOnClickListener(new View$OnClickListenerC73623dt(this));
        MethodCollector.m26664o(9816);
    }

    /* renamed from: b */
    public final void mo116151b(boolean z) {
        C62855a value = this.f165338m.getValue();
        if (value != null) {
            C72613aj a = this.f165343r.mo113454a(value.getPermission(), C63238c.f143594u.mo93906e().mo58662e());
            C72640l.f162828a = null;
            if (a != null) {
                String obj = this.f165343r.f160912c.getText().toString();
                if (f165257ah) {
                    obj = obj.replaceAll("\n+", " ");
                }
                a.mo114907a(obj);
                a.mo114906a();
            } else {
                C84911q.m145921a("TitleSensitivity checkPrivacyConfirmation() checker is null");
            }
            if (z || !C63253l.f143623a.mo73305a().mo101760a(requireActivity())) {
                mo116162m();
                return;
            }
            C72640l.f162828a = EnumC72643m.PRIVACY_DIALOG;
            C63253l.f143623a.mo73305a().mo101759a(requireActivity(), new C73628dy(this));
        }
    }

    /* renamed from: c */
    public final Bundle mo116152c(boolean z) {
        int c = this.f165265H.mo114734c();
        if (C71907a.m126982a() && c == 1 && C65687t.m117580b() == 0) {
            c = 0;
        }
        this.f165268K.setSaveModel(C63244g.m114602a().mo73287o().mo104794n().mo104626a(this.f165268K, c, z, C65505a.m117232a(this.f165266I)));
        C77816g.m135934a(C72700q.m128164a(this.f165268K), C72700q.m128165b(this.f165268K), EnumC77814e.PUBLISH, EnumC77814e.SEND_REQUEST);
        this.f165268K.userClickPublishTime = this.f165288aD;
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", this.f165268K);
        bundle.putString("shoot_way", this.f165268K.mShootWay);
        bundle.putInt("extra_stick_point_type", this.f165289aE);
        bundle.putBoolean("enter_record_from_other_platform", this.f165290aF);
        bundle.putBoolean("extra_enter_from_live", this.f165294aJ);
        bundle.putInt("publish_private_state", this.f165268K.isPrivate());
        bundle.putInt("publish_permission", this.f165339n.f156258b.getPermission());
        if (C71817eu.m126791b(this.f165268K)) {
            bundle.putBoolean("shoutouts_video_fast_publish", true);
        }
        C51423a.m95787a("VideoPublishService.createBundleParams()  bundle=".concat(String.valueOf(bundle)));
        C39162r.m79460a("av_video_memory", new C84425b().mo129406a("log", "VideoPublishService.createBundleParams()  bundle=".concat(String.valueOf(bundle))).f188764a);
        Publish.PublishBundle = bundle;
        return bundle;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C84911q.m145921a("PublishDurationMonitor VideoPublishFragment onActivityCreated");
        if (bundle == null) {
            C69922cd cdVar = new C69922cd(this.f165268K.videoWidth(), this.f165268K.videoHeight(), C65357b.m117047c(), C65440dw.m117158a());
            C34611o.m70668a("aweme_video_record_info", new C33743c().mo59976a("resolution", cdVar.f156252a + "*" + cdVar.f156253b).mo59975a("bitrate", Long.valueOf(new BigDecimal((double) cdVar.f156254c).longValue())).mo59975a("frame_rate", Long.valueOf(new BigDecimal((double) cdVar.f156255d).longValue())).mo59971a("is_hardcode", Boolean.valueOf(cdVar.f156256e)).mo59977a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo116145a(C72613aj ajVar) {
        C69789ac acVar;
        C69931cj postPrompts;
        String goBack;
        C69931cj postPrompts2;
        String text;
        C69931cj postPrompts3;
        String postAnyway;
        String str;
        String str2;
        String str3;
        String str4;
        String dialogTitle;
        C69931cj postPrompts4;
        if (ajVar.f162784a == null || !ajVar.f162784a.booleanValue()) {
            mo116163n();
        } else {
            C39162r.m79460a("tns_video_push_words_sh", new C84425b().mo129406a("creation_id", this.f165268K.creationId).mo129406a("user_id", C63238c.f143594u.mo93906e().mo58660c()).f188764a);
            ActivityC0945e activity = getActivity();
            C73646ep epVar = new C73646ep(this);
            C73647eq eqVar = new C73647eq(this);
            C89219l.m154721d(ajVar, "");
            C89219l.m154721d(epVar, "");
            C89219l.m154721d(eqVar, "");
            if (!(activity == null || C72640l.f162828a == EnumC72643m.PRIVACY_DIALOG || C72640l.f162828a == EnumC72643m.POST_FREQUENCY_LIMIT_DIALOG || (!C89219l.m154714a((Object) ajVar.f162784a, (Object) true)) || (acVar = ajVar.f162785b) == null || acVar.getPostPrompts() == null || (postPrompts = acVar.getPostPrompts()) == null || (goBack = postPrompts.getGoBack()) == null || goBack.length() == 0 || (postPrompts2 = acVar.getPostPrompts()) == null || (text = postPrompts2.getText()) == null || text.length() == 0 || (postPrompts3 = acVar.getPostPrompts()) == null || (postAnyway = postPrompts3.getPostAnyway()) == null || postAnyway.length() == 0 || C63238c.f143594u.mo93901a())) {
                C17197a.C17200a aVar = new C17197a.C17200a(activity);
                C69789ac acVar2 = ajVar.f162785b;
                if (acVar2 != null) {
                    C69931cj postPrompts5 = acVar2.getPostPrompts();
                    if (postPrompts5 != null) {
                        str = postPrompts5.getText();
                    } else {
                        str = null;
                    }
                    aVar.f41071b = str;
                    C69931cj postPrompts6 = acVar2.getPostPrompts();
                    if (postPrompts6 == null || (dialogTitle = postPrompts6.getDialogTitle()) == null || dialogTitle.length() == 0 || (postPrompts4 = acVar2.getPostPrompts()) == null) {
                        str2 = null;
                    } else {
                        str2 = postPrompts4.getDialogTitle();
                    }
                    aVar.f41070a = str2;
                    C69931cj postPrompts7 = acVar2.getPostPrompts();
                    if (postPrompts7 != null) {
                        str3 = postPrompts7.getPostAnyway();
                    } else {
                        str3 = null;
                    }
                    C17197a.C17200a a = aVar.mo27192a(str3, (DialogInterface.OnClickListener) new C72640l.DialogInterface$OnClickListenerC72641a(aVar, epVar, eqVar), false);
                    C69931cj postPrompts8 = acVar2.getPostPrompts();
                    if (postPrompts8 != null) {
                        str4 = postPrompts8.getGoBack();
                    } else {
                        str4 = null;
                    }
                    a.mo27196b(str4, (DialogInterface.OnClickListener) new C72640l.DialogInterface$OnClickListenerC72642b(aVar, epVar, eqVar), false);
                }
                Dialog c = aVar.mo27193a().mo27185c();
                c.setCancelable(true);
                c.setCanceledOnTouchOutside(false);
                C72640l.f162828a = EnumC72643m.SENSITIVE_TITLE_DIALOG;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo116154d(boolean z) {
        C22708a.m42805a(getContext(), "VideoPublishFragment#getContext is null");
        C22708a.m42805a(getActivity(), "VideoPublishFragment#getActivity is null");
        if (this.f165294aJ) {
            if (getActivity() != null) {
                getActivity().setResult(9, new Intent());
                C84911q.m145921a("SaveDraft to Live");
                getActivity().finish();
            }
        } else if (this.f165290aF || this.f165291aG) {
            if (this.f165291aG) {
                AbstractC81915c.m141874a(new C71897c());
            }
            C84911q.m145921a("SaveDraft to OtherPlatform");
            if (z) {
                C63244g.m114602a().mo73275c().mo101846a(true);
            }
            m129678J();
        } else {
            Intent intent = new Intent();
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
            if (this.f165292aH != null && !this.f165268K.mIsFromDraft) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG", this.f165292aH);
            }
            boolean g = C63238c.f143576c.mo93778g();
            C84911q.m145921a("SaveDraft publishContainerActivityClassAlive:".concat(String.valueOf(g)));
            if (!g) {
                intent.putExtra("enable_optimize_main_not_in_stack", true);
            }
            if (this.f165268K.mIsFromDraft) {
                AbstractC81915c.m141874a(new C71897c());
                C84911q.m145921a("SaveDraft to DraftBox");
                if (z) {
                    C63244g.m114602a().mo73275c().mo101846a(true);
                }
                m129678J();
            } else {
                Context context = getContext();
                if (context != null) {
                    C63244g.m114602a().mo73287o().mo104790j().mo104829a(context, "SaveDraft");
                }
                if (getActivity() != null || !C68744j.m121177a()) {
                    intent.addFlags(335544320);
                    intent.setClass(requireActivity(), C63238c.f143576c.mo93776e());
                    C84911q.m145921a("SaveDraft to Main");
                    startActivity(intent);
                } else {
                    return;
                }
            }
            requireActivity().overridePendingTransition(0, R.anim.x);
        }
    }

    /* renamed from: a */
    public final void mo116147a(final AbstractC73577a aVar) {
        if (getActivity().getIntent().getBooleanExtra("is_from_sys_share", false)) {
            C39162r.m79460a("login_notify", new C84425b().mo129406a("enter_from", "video_edit_page").f188764a);
        }
        C63244g.m114602a().mo73287o().mo104790j().mo104829a(getContext(), "Login");
        C63238c.f143594u.mo93898a(this, "video_edit_page", "click_shoot", new AbstractC63269z.AbstractC63270a() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.C735714 */

            static {
                Covode.recordClassIndex(86308);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
            /* renamed from: b */
            public final void mo59544b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
            /* renamed from: a */
            public final void mo59543a() {
                AbstractC32846a e;
                if (C73560cj.this.f165266I != null) {
                    C72644n nVar = C73560cj.this.f165266I;
                    if (C72681t.m128157a() && (e = C63238c.f143594u.mo93906e()) != null) {
                        if (!e.mo58668k()) {
                            nVar.f162843e = false;
                        } else if (!nVar.f162844f) {
                            nVar.f162843e = e.mo58667j();
                        } else if (nVar.f162843e && !e.mo58667j()) {
                            nVar.f162843e = false;
                            new C23144b(nVar.f162857s).mo37640e(R.string.bbo).mo37637b();
                        }
                    }
                }
                if (aVar == null) {
                    return;
                }
                if (C63244g.m114602a().mo73255A().mo93901a()) {
                    C71833a.m126843a();
                } else {
                    aVar.mo116178a();
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax.AbstractC63200a
    /* renamed from: a */
    public final void mo101677a(Boolean bool) {
        Resources resources;
        String string;
        if (!bool.booleanValue()) {
            Context context = getContext();
            HashTagMentionEditText hashTagMentionEditText = this.f165350y;
            C73973ay.m130101a(context, hashTagMentionEditText, false);
            if (hashTagMentionEditText != null) {
                hashTagMentionEditText.removeStarAtlas();
            }
        } else {
            C73973ay.m130100a(getContext(), this.f165350y);
        }
        if (this.f165296aL) {
            C72644n nVar = this.f165266I;
            boolean booleanValue = bool.booleanValue();
            C73474ax axVar = nVar.f162845g;
            if (axVar != null) {
                axVar.mo116077a(booleanValue);
            }
            String str = "";
            if (booleanValue) {
                Context context2 = nVar.f162857s.getContext();
                if (!(context2 == null || (resources = context2.getResources()) == null || (string = resources.getString(R.string.g0c)) == null)) {
                    str = string;
                }
                nVar.f162855q = str;
                CommonItemView commonItemView = nVar.f162851m;
                if (commonItemView != null) {
                    commonItemView.setRightText(nVar.f162855q);
                }
                Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
                CommonItemView commonItemView2 = nVar.f162851m;
                if (commonItemView2 != null) {
                    commonItemView2.mo27136c();
                    return;
                }
                return;
            }
            nVar.f162855q = str;
            CommonItemView commonItemView3 = nVar.f162851m;
            if (commonItemView3 != null) {
                commonItemView3.setRightText(nVar.f162855q);
            }
        }
    }

    /* renamed from: a */
    private static void m129688a(ImageView imageView, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getActivity().getWindow().setSharedElementReenterTransition(new AutoTransition());
            getActivity().getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        C63253l.f143623a.mo73330z().mo93828f();
        this.f165301aQ = new C2564l<>(true);
        this.f165306ad = new C71859c(this.f165301aQ);
        this.f165314an = (CommentSettingItemStatus) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(CommentSettingItemStatus.class);
        this.f165328c = (DuetSettingItemStatus) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(DuetSettingItemStatus.class);
        this.f165329d = (StitchSettingItemStatus) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(StitchSettingItemStatus.class);
        C73977ba.m130111a(view);
        Bundle arguments = getArguments();
        this.f165293aI = arguments.getInt("music_rec_type", -1);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) arguments.getSerializable("args");
        this.f165268K = videoPublishEditModel;
        videoPublishEditModel.uploadSpeedInfo = C63244g.m114602a().mo73287o().mo104788h().mo104820b();
        this.f165304ab = C70747dv.f158358b;
        this.f165298aN = C70747dv.f158359c;
        if (C70005cr.m123611a().f156489h.booleanValue()) {
            this.f165268K.commerceData = C63238c.f143585l.mo93818a(this.f165268K.commerceData, C70005cr.m123611a().f156488g.booleanValue());
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f165268K;
        if (videoPublishEditModel2 == null || videoPublishEditModel2.isPreviewInfoValid()) {
            this.f165289aE = arguments.getInt("extra_stick_point_type", 0);
            this.f165290aF = arguments.getBoolean("enter_record_from_other_platform", false);
            this.f165294aJ = arguments.getBoolean("extra_enter_from_live", false);
            this.f165291aG = arguments.getBoolean("edit_publish_session_end_together", false);
            C84911q.m145928d("VideoPublishFragment filter_id_list:" + this.f165268K.mCurFilterIds + " prop_list:" + this.f165268K.mStickerID + " effect_list:" + this.f165268K.getEditEffectList() + " info_sticker_list:" + this.f165268K.getInfoStickerList());
            C63244g.m114602a().mo73293u();
            this.f165281X = C74089g.m130286a(getContext());
            this.f165295aK = SettingsManager.m29616a().mo25400a("enable_high_quality_video", false);
            this.f165296aL = C63253l.f143623a.mo73330z().mo93824b().booleanValue();
            this.f165325ay = (ViewStub) view.findViewById(R.id.r8);
            m129687a(view, bundle);
            C73578ck ckVar = new C73578ck(this);
            if (!this.f165268K.mIsFromDraft) {
                ckVar.invoke();
            } else {
                C78179az.m136669a(this.f165268K, getActivity(), ckVar);
            }
            C71827ew.m126828b(getActivity());
            C69881bf bfVar = this.f165321au;
            bfVar.f156143n = C72621b.m128091a(this.f165268K);
            Context context = getContext();
            if (context instanceof ActivityC0945e) {
                ActivityC0945e eVar = (ActivityC0945e) context;
                bfVar.f156145p = (HashTagMobHelper) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(HashTagMobHelper.class);
                bfVar.f156145p.f160959a = bfVar.f156146q;
                bfVar.f156145p.f160964f = bfVar.f156142m;
                bfVar.f156144o = BaseTitleHelper.C80744a.m139999a(eVar);
                bfVar.f156144o.f180540a = new C69884bh(bfVar);
                bfVar.f156145p.f160963e = bfVar.f156144o;
            }
            if (bfVar.f156133d != null) {
                bfVar.f156141l = new C80737c(context, bfVar.f156142m, bfVar);
                bfVar.f156133d.setLayoutManager(new LinearLayoutManager());
                bfVar.f156133d.setAdapter(bfVar.f156141l);
            }
            if (bfVar.f156134e != null) {
                C17275e eVar2 = new C17275e(context);
                eVar2.setStatus(new C17273d.C17274a(context).mo27464c(R.string.dck).f41365a);
                eVar2.setOnClickListener(new View$OnClickListenerC69883bg(bfVar));
                DmtStatusView dmtStatusView = bfVar.f156134e;
                DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(context);
                dmtStatusView.setBuilder(a.mo27404a(new C17273d.C17274a(a.f41298a).mo27461a("  ").mo27463b("  ").f41365a).mo27408c(eVar2));
            }
            bfVar.f156139j = C63238c.f143577d.mo93803a((AbstractC63178ak.AbstractC63179a<AVChallenge>) bfVar);
            bfVar.f156138i = C63238c.f143577d.mo93804a((AbstractC63178ak.AbstractC63183e) bfVar);
            bfVar.f156135f.mo113455a();
            HashTagMentionEditText hashTagMentionEditText = bfVar.f156135f.f160912c;
            hashTagMentionEditText.addTextChangedListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0273: INVOKE  
                  (r1v16 'hashTagMentionEditText' com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText)
                  (wrap: com.ss.android.ugc.aweme.shortvideo.bf$1 : 0x0270: CONSTRUCTOR  (r0v79 com.ss.android.ugc.aweme.shortvideo.bf$1) = 
                  (r5v1 'bfVar' com.ss.android.ugc.aweme.shortvideo.bf)
                  (r1v16 'hashTagMentionEditText' com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText)
                 call: com.ss.android.ugc.aweme.shortvideo.bf.1.<init>(com.ss.android.ugc.aweme.shortvideo.bf, com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.addTextChangedListener(android.text.TextWatcher):void in method: com.ss.android.ugc.aweme.shortvideo.ui.cj.onViewCreated(android.view.View, android.os.Bundle):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0270: CONSTRUCTOR  (r0v79 com.ss.android.ugc.aweme.shortvideo.bf$1) = 
                  (r5v1 'bfVar' com.ss.android.ugc.aweme.shortvideo.bf)
                  (r1v16 'hashTagMentionEditText' com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText)
                 call: com.ss.android.ugc.aweme.shortvideo.bf.1.<init>(com.ss.android.ugc.aweme.shortvideo.bf, com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.ui.cj.onViewCreated(android.view.View, android.os.Bundle):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.bf, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 834
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.onViewCreated(android.view.View, android.os.Bundle):void");
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View a = C1764a.m5927a(layoutInflater, R.layout.a1r, viewGroup, false);
            C73964ar.f166038a.mo116393a(getActivity(), (ViewGroup) a.findViewById(R.id.ahr));
            return a;
        }

        @Override // androidx.fragment.app.Fragment
        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            for (C0692e<Class<?>, IAVPublishExtension<?>> eVar : this.f165276S) {
                eVar.f2751b.onRequestPermissionsResult(i, strArr, iArr);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e6, code lost:
            if (r10 != null) goto L_0x002e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
        @Override // androidx.fragment.app.Fragment
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityResult(int r8, int r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 251
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73560cj.onActivityResult(int, int, android.content.Intent):void");
        }
    }
