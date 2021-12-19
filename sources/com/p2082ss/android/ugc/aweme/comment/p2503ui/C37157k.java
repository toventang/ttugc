package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a;
import com.bytedance.ies.dmt.p1194ui.tooltip.C17257b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.p122a.C2541b;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.p1998c.p1999a.C27254p;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34572c;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34671a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.C36274b;
import com.p2082ss.android.ugc.aweme.comment.C36535m;
import com.p2082ss.android.ugc.aweme.comment.CommentViewModelImpl;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36205a;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36223d;
import com.p2082ss.android.ugc.aweme.comment.api.C36268b;
import com.p2082ss.android.ugc.aweme.comment.api.C36269c;
import com.p2082ss.android.ugc.aweme.comment.api.C36273f;
import com.p2082ss.android.ugc.aweme.comment.api.CommentBatchManagementApi;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36305b;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36317c;
import com.p2082ss.android.ugc.aweme.comment.gift.C36431a;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentGiftStruct;
import com.p2082ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct;
import com.p2082ss.android.ugc.aweme.comment.model.CommentPrompt;
import com.p2082ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p2082ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36174b;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36176c;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36179e;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36180f;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36181g;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36385a;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36388d;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36391f;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36393h;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36397l;
import com.p2082ss.android.ugc.aweme.comment.p2489c.EnumC36396k;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36402b;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36407e;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36409f;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36415a;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36417c;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36423i;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36425k;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a;
import com.p2082ss.android.ugc.aweme.comment.p2495i.AbstractC36489a;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36499g;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36500h;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36504c;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36506e;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36507f;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36509h;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36510i;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36514k;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36520p;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36539b;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36540c;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36542d;
import com.p2082ss.android.ugc.aweme.comment.p2500n.C36547a;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37067bs;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37080bx;
import com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b;
import com.p2082ss.android.ugc.aweme.comment.supporterpanel.C36977j;
import com.p2082ss.android.ugc.aweme.comment.translatorinfo.AbstractC36990a;
import com.p2082ss.android.ugc.aweme.comment.translatorinfo.C36993b;
import com.p2082ss.android.ugc.aweme.comment.translatorinfo.api.CommentTranslatorInfoApi;
import com.p2082ss.android.ugc.aweme.comment.util.C37187a;
import com.p2082ss.android.ugc.aweme.comment.util.C37197g;
import com.p2082ss.android.ugc.aweme.comment.util.C37201k;
import com.p2082ss.android.ugc.aweme.comment.util.C37208m;
import com.p2082ss.android.ugc.aweme.comment.util.C37209n;
import com.p2082ss.android.ugc.aweme.comment.util.C37213q;
import com.p2082ss.android.ugc.aweme.comment.util.C37216s;
import com.p2082ss.android.ugc.aweme.comment.util.C37221v;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37792d;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2556e.AbstractC37793a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37830a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.discover.mob.C42456h;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41893a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.experiment.C46920f;
import com.p2082ss.android.ugc.aweme.experiment.C47037o;
import com.p2082ss.android.ugc.aweme.experiment.C47038p;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.experiment.AbstractC49503af;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.p2946g.C49567b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49668ac;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49676d;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50555t;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.forward.p3004a.C51414a;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.main.p3433f.C59090b;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend;
import com.p2082ss.android.ugc.aweme.p2310al.C33491f;
import com.p2082ss.android.ugc.aweme.p2481cm.C36141a;
import com.p2082ss.android.ugc.aweme.p2715cs.C40748a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3538o.C62690a;
import com.p2082ss.android.ugc.aweme.p4235w.C81469a;
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63494a;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80275bv;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.k */
public class C37157k extends AbstractC34586a implements AbstractC36415a, AbstractC36417c, AbstractC36418d, AbstractC36420f, AbstractC36423i, AbstractC36428a, AbstractC36953b, AbstractC36990a, C37201k.AbstractC37202a, AbstractC39063h.AbstractC39067a, AbstractC39102c<Comment>, AbstractC90252i, AbstractC90253j {

    /* renamed from: D */
    public static long f87558D;

    /* renamed from: aq */
    private static boolean f87559aq;

    /* renamed from: A */
    C37221v f87560A;

    /* renamed from: B */
    AbstractC49691s<C49672ag> f87561B;

    /* renamed from: C */
    C37004a f87562C;

    /* renamed from: E */
    public DataCenter f87563E;

    /* renamed from: F */
    FrameLayout f87564F;

    /* renamed from: G */
    public boolean f87565G = false;

    /* renamed from: H */
    boolean f87566H = false;

    /* renamed from: I */
    public CommentBatchManagementViewModel f87567I;

    /* renamed from: J */
    C39110a f87568J;

    /* renamed from: K */
    AbstractC36419e f87569K;

    /* renamed from: L */
    public boolean f87570L;

    /* renamed from: M */
    IVideoGiftService f87571M = VideoGiftService.m120814l();

    /* renamed from: N */
    String f87572N = "";

    /* renamed from: O */
    public long f87573O;

    /* renamed from: P */
    private Comment f87574P;

    /* renamed from: Q */
    private ConstraintLayout f87575Q;

    /* renamed from: R */
    private TuxTextView f87576R;

    /* renamed from: S */
    private ImageView f87577S;

    /* renamed from: T */
    private SmartImageView f87578T;

    /* renamed from: U */
    private View f87579U;

    /* renamed from: V */
    private TuxIconView f87580V;

    /* renamed from: W */
    private TuxIconView f87581W;

    /* renamed from: X */
    private ImageView f87582X;

    /* renamed from: Y */
    private DmtStatusView f87583Y;

    /* renamed from: Z */
    private RecyclerView f87584Z;

    /* renamed from: a */
    final int f87585a = ((int) C13628n.m24520b(C17867d.m33078a(), 30.0f));

    /* renamed from: aA */
    private long f87586aA;

    /* renamed from: aB */
    private long f87587aB;

    /* renamed from: aC */
    private String f87588aC = "";

    /* renamed from: aD */
    private boolean f87589aD;

    /* renamed from: aE */
    private boolean f87590aE;

    /* renamed from: aF */
    private long f87591aF;

    /* renamed from: aG */
    private long f87592aG;

    /* renamed from: aH */
    private final long f87593aH = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: aI */
    private C36993b f87594aI;

    /* renamed from: aJ */
    private boolean f87595aJ = false;

    /* renamed from: aK */
    private boolean f87596aK = false;

    /* renamed from: aa */
    private TextView f87597aa;

    /* renamed from: ab */
    private View f87598ab;

    /* renamed from: ac */
    private View f87599ac;

    /* renamed from: ad */
    private View f87600ad;

    /* renamed from: ae */
    private C41893a f87601ae;

    /* renamed from: af */
    private TextView f87602af;

    /* renamed from: ag */
    private AbstractC37793a f87603ag;

    /* renamed from: ah */
    private C36506e f87604ah;

    /* renamed from: ai */
    private C36509h f87605ai;

    /* renamed from: aj */
    private C36520p f87606aj;

    /* renamed from: ak */
    private String f87607ak;

    /* renamed from: al */
    private String f87608al;

    /* renamed from: am */
    private boolean f87609am = false;

    /* renamed from: an */
    private boolean f87610an;

    /* renamed from: ao */
    private boolean f87611ao;

    /* renamed from: ap */
    private boolean f87612ap;

    /* renamed from: ar */
    private long f87613ar;

    /* renamed from: as */
    private long f87614as;

    /* renamed from: at */
    private C33947e f87615at;

    /* renamed from: au */
    private Widget f87616au;

    /* renamed from: av */
    private boolean f87617av = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: aw */
    private boolean f87618aw = false;

    /* renamed from: ax */
    private AbstractC1214u<Integer> f87619ax;

    /* renamed from: ay */
    private DmtStatusView.C17269a f87620ay;

    /* renamed from: az */
    private Set<String> f87621az = new HashSet();

    /* renamed from: b */
    public C36500h f87622b = new C36500h("");

    /* renamed from: c */
    public Aweme f87623c;

    /* renamed from: d */
    public Comment f87624d;

    /* renamed from: e */
    ViewGroup f87625e;

    /* renamed from: j */
    MentionEditText f87626j;

    /* renamed from: k */
    TuxIconView f87627k;

    /* renamed from: l */
    public ImageView f87628l;

    /* renamed from: m */
    public TextView f87629m;

    /* renamed from: n */
    ImageView f87630n;

    /* renamed from: o */
    TextView f87631o;

    /* renamed from: p */
    TextView f87632p;

    /* renamed from: q */
    TextView f87633q;

    /* renamed from: r */
    View f87634r;

    /* renamed from: s */
    public AbstractC17256a f87635s;

    /* renamed from: t */
    public C37067bs f87636t;

    /* renamed from: u */
    public WrapLinearLayoutManager f87637u;

    /* renamed from: v */
    public C36205a f87638v;

    /* renamed from: w */
    public C36514k f87639w;

    /* renamed from: y */
    public C37074bt f87640y;

    /* renamed from: z */
    public C36274b f87641z;

    static {
        Covode.recordClassIndex(44511);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(243, new RunnableC90250g(C37157k.class, "onExpandingCachedCommentReplies", C36385a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(51, new RunnableC90250g(C37157k.class, "onEvent", C34572c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(244, new RunnableC90250g(C37157k.class, "onReportCommentEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(245, new RunnableC90250g(C37157k.class, "onEnterTextEvent", C36391f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(246, new RunnableC90250g(C37157k.class, "onUserBlockedEvent", C63494a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(34, new RunnableC90250g(C37157k.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new RunnableC90250g(C37157k.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(247, new RunnableC90250g(C37157k.class, "onEvent", C36388d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(248, new RunnableC90250g(C37157k.class, "onDiggUpdateEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(249, new RunnableC90250g(C37157k.class, "onEvent", C37830a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(12, new RunnableC90250g(C37157k.class, "onAwesomeSplashEvent", C18017a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(250, new RunnableC90250g(C37157k.class, "onEvent", C59090b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(251, new RunnableC90250g(C37157k.class, "onEvent", C49668ac.class, ThreadMode.POSTING, 0, false));
        hashMap.put(145, new RunnableC90250g(C37157k.class, "onAfterLoginInEvent", C33491f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    public void onEvent(C51414a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: c */
    public final RecyclerView mo63722c() {
        return this.f87584Z;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a
    /* renamed from: j */
    public final void mo63751j() {
        mo64681A();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: m */
    public final Aweme mo64434m() {
        return this.f87623c;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: n */
    public final Comment mo64435n() {
        return this.f87624d;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.translatorinfo.AbstractC36990a
    /* renamed from: r */
    public final void mo64487r() {
        m74976ab();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63719a(Aweme aweme) {
        mo64706b(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63718a(C36500h hVar) {
        this.f87590aE = false;
        this.f87591aF = 0;
        m75003b(hVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: b */
    public final void mo63721b(boolean z) {
        if (z && C37699a.m76259ae(this.f87623c)) {
            this.f87563E.mo60191a("comment_dialog_state", (Object) 3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo64688a(List list, List list2, int i, Set set, int i2) {
        ActivityC0945e activity = getActivity();
        String join = TextUtils.join(",", list);
        String join2 = TextUtils.join(",", list2);
        int height = this.f87564F.getHeight();
        C89219l.m154721d(activity, "");
        C89219l.m154721d(join, "");
        C89219l.m154721d(join2, "");
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_ids", join).appendQueryParameter("owner_ids", join2).appendQueryParameter("report_type", UGCMonitor.EVENT_COMMENT).appendQueryParameter("is_batch", "1").appendQueryParameter("locale", SettingServiceImpl.m120782v().mo108872h());
        Bundle bundle = new Bundle();
        bundle.putInt("half_screen_height", height);
        C39223a.m79587a().mo68689a(activity, appendQueryParameter, bundle);
        int size = set.size();
        String enterFrom = this.f87622b.getEnterFrom();
        C89219l.m154721d(enterFrom, "");
        C39162r.m79460a("comment_batch_management_report_confirm_ck", new C33744d().mo59980a("c_number", i).mo59980a("u_number", size).mo59980a("video_reply_number", i2).mo59983a("enter_from", enterFrom).f79943a);
        return C89391z.f203057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64701a(Map<String, Comment> map) {
        String str;
        int i;
        HashSet hashSet = new HashSet();
        String curUserId = C31575b.m65865g().getCurUserId();
        Map<String, Comment> map2 = this.f87567I.f87768c;
        map2.clear();
        Iterator<Map.Entry<String, Comment>> it = map.entrySet().iterator();
        int i2 = 0;
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Comment value = it.next().getValue();
            if (value.getUser() != null) {
                str = value.getUser().getUid();
            }
            if (!TextUtils.equals(curUserId, str)) {
                hashSet.add(str);
                map2.put(value.getCid(), value);
            }
            if (value.getAliasAweme() != null) {
                i2++;
            }
        }
        if (map2.size() == 0) {
            new C23144b(this).mo37635a(getString(R.string.ajg)).mo37637b();
            return;
        }
        int size = hashSet.size();
        int size2 = hashSet.size();
        String enterFrom = this.f87622b.getEnterFrom();
        C89219l.m154721d(enterFrom, str);
        C39162r.m79460a("comment_batch_management_block_ck", new C33744d().mo59980a("c_number", size).mo59980a("u_number", size2).mo59980a("video_reply_number", i2).mo59983a("enter_from", enterFrom).f79943a);
        if (C36174b.m73727a().length == 3) {
            i = C36174b.m73727a()[2];
        } else {
            i = 100;
        }
        if (size > i) {
            new C23144b(this).mo37635a(getContext().getResources().getQuantityString(R.plurals.y, size, Integer.valueOf(size)) + getContext().getResources().getQuantityString(R.plurals.z, i, Integer.valueOf(i))).mo37637b();
        } else if (hashSet.size() > 0) {
            C23025b bVar = new C23025b(getContext());
            bVar.mo37416a(R.string.aje, new C37176p(this, hashSet, map, i2));
            bVar.mo37418b(R.string.aji, C37177q.f87682a);
            int size3 = hashSet.size();
            ((C23023b) C23013a.C23015a.m43405a(requireContext()).mo37411b(getActivity().getResources().getQuantityString(R.plurals.a1, size3, Integer.valueOf(size3))).mo37413d(getActivity().getResources().getQuantityString(R.plurals.a0, size3, Integer.valueOf(size3))).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
            C39162r.onEventV3("comment_batch_management_block_confirm_sw");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo64690a(final Set set, Map map, int i) {
        CommentBatchManagementApi.C36261a.m73904a().userBatchBlock(TextUtils.join(",", set)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new AbstractC88406ae<C36273f>() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.C371708 */

            static {
                Covode.recordClassIndex(44524);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(C36273f fVar) {
                if (C37157k.this.f87567I != null) {
                    C37157k.this.mo64702a(set);
                    new C23144b(C37157k.this.getActivity()).mo37640e(R.string.sx).mo37637b();
                }
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                if (!(th instanceof C34485a)) {
                    new C23144b(C37157k.this.getActivity()).mo37640e(R.string.ajf).mo37637b();
                } else if (C37157k.this.f87567I != null) {
                    C34485a aVar = (C34485a) th;
                    switch (aVar.getErrorCode()) {
                        case 3001210:
                        case 3001211:
                            new C23144b(C37157k.this.getActivity()).mo37635a(C37157k.this.getString(R.string.ajf)).mo37637b();
                            return;
                        case 3002038:
                            C37157k.this.mo64696a(aVar, set);
                            C23025b bVar = new C23025b(C37157k.this.getContext());
                            bVar.mo37416a(R.string.ep2, new C37043be(this));
                            bVar.mo37418b(R.string.ep1, (AbstractC89172b<? super C23024a, C89391z>) null);
                            ((C23023b) C23013a.C23015a.m43405a(C37157k.this.requireContext()).mo37413d(C37157k.this.getActivity().getResources().getString(R.string.ep3)).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
                            return;
                        case 3002058:
                            C37157k.this.mo64696a(aVar, set);
                            return;
                        default:
                            boolean unused = C36269c.m73912a(C37157k.this.getContext(), aVar, R.string.ajf, false, false);
                            return;
                    }
                }
            }
        });
        int size = map.size();
        int size2 = set.size();
        String enterFrom = this.f87622b.getEnterFrom();
        C89219l.m154721d(enterFrom, "");
        C39162r.m79460a("comment_batch_management_block_confirm_ck", new C33744d().mo59980a("c_number", size).mo59980a("u_number", size2).mo59980a("video_reply_number", i).mo59983a("enter_from", enterFrom).f79943a);
        return C89391z.f203057a;
    }

    /* renamed from: a */
    public final void mo64696a(C34485a aVar, Set<String> set) {
        C36273f fVar = (C36273f) aVar.getRawResponse();
        if (!TextUtils.isEmpty(fVar.f85715a) && !C13603b.m24435a((Collection) set)) {
            List asList = Arrays.asList(fVar.f85715a.split(","));
            if (set.containsAll(asList)) {
                set.removeAll(asList);
            }
        }
        if (!C13603b.m24435a((Collection) set)) {
            mo64702a(set);
            new C23144b(this).mo37640e(R.string.ajo).mo37637b();
            return;
        }
        new C23144b(this).mo37640e(R.string.ajf).mo37637b();
    }

    /* renamed from: a */
    public final void mo64702a(Set<String> set) {
        if (!(this.f87560A == null || C13603b.m24435a((Collection) set) || C13603b.m24435a((Collection) this.f87560A.f87755a))) {
            List<CommentReplyListItem> list = this.f87560A.f87755a;
            Map<String, Comment> map = this.f87567I.f87767b;
            HashSet hashSet = new HashSet();
            int i = 0;
            int i2 = 0;
            for (CommentReplyListItem commentReplyListItem : list) {
                Comment comment = commentReplyListItem.mComment;
                if (comment != null) {
                    if (comment.getUser() != null && set.contains(comment.getUser().getUid())) {
                        map.put(comment.getCid(), comment);
                        hashSet.add(comment.getCid());
                        i = (int) (((long) i) + comment.getReplyCommentTotal() + 1);
                    } else if (!C13603b.m24435a((Collection) commentReplyListItem.mReplyComments)) {
                        for (Comment comment2 : commentReplyListItem.mReplyComments) {
                            if (comment2.getUser() == null || !set.contains(comment2.getUser().getUid())) {
                                i2++;
                            } else {
                                map.put(comment.getCid(), comment);
                                hashSet.add(comment2.getCid());
                                i++;
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
            mo64693a(i, (Set<String>) hashSet, map, false);
            if (i2 == 0 && this.f87573O > 0) {
                mo64729v();
            }
            if (set.contains(m74960V())) {
                this.f87640y.f87347d = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo64689a(final Set set, int i, Set set2, int i2) {
        CommentBatchManagementApi.C36261a.m73904a().commentBatchDelete(TextUtils.join(",", set), this.f87623c.getAid()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new AbstractC88406ae<C36268b>() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.C371719 */

            static {
                Covode.recordClassIndex(44525);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(C36268b bVar) {
                if (C37157k.this.f87567I != null) {
                    Map<String, Comment> map = C37157k.this.f87567I.f87767b;
                    C37157k.this.mo64693a(C37157k.this.f87567I.f87766a, set, map, true);
                    new C23144b(C37157k.this.getActivity()).mo37640e(R.string.ajl).mo37637b();
                }
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                long j;
                if (C13603b.m24435a((Collection) set) || !(th instanceof C34485a)) {
                    new C23144b(C37157k.this.getActivity()).mo37640e(R.string.ajk).mo37637b();
                    return;
                }
                C34485a aVar = (C34485a) th;
                if (aVar.getErrorCode() == 3017005) {
                    String str = ((C36268b) aVar.getRawResponse()).f85710a;
                    if (C37157k.this.f87567I == null || TextUtils.isEmpty(str)) {
                        new C23144b(C37157k.this.getActivity()).mo37640e(R.string.ajk).mo37637b();
                        return;
                    }
                    Map<String, Comment> map = C37157k.this.f87567I.f87767b;
                    int i = C37157k.this.f87567I.f87766a;
                    if (map.size() > 0 && i > 0) {
                        String[] split = str.split(",");
                        if (map.size() == split.length) {
                            new C23144b(C37157k.this.getActivity()).mo37640e(R.string.ajk).mo37637b();
                            return;
                        }
                        for (String str2 : split) {
                            set.remove(str2);
                            i--;
                            if (map.get(str2) != null) {
                                i = (int) (((long) i) - map.get(str2).getReplyCommentTotal());
                            }
                        }
                        if (set.size() > 0 && C37157k.this.f87640y != null) {
                            C37157k.this.f87640y.mo64579a(set, map);
                            C37157k kVar = C37157k.this;
                            if (i > 0) {
                                j = (long) (-i);
                            } else {
                                j = 0;
                            }
                            kVar.mo64694a(j);
                            C37157k.this.mo64707b(map);
                            C37157k.this.f87567I.mo64781b().postValue(Integer.valueOf(map.size()));
                        }
                        new C23144b(C37157k.this.getActivity()).mo37640e(R.string.ajp).mo37637b();
                        return;
                    }
                    return;
                }
                boolean unused = C36269c.m73912a(C37157k.this.getContext(), aVar, R.string.ajk, false, false);
            }
        });
        int size = set2.size();
        String enterFrom = this.f87622b.getEnterFrom();
        C89219l.m154721d(enterFrom, "");
        C39162r.m79460a("comment_batch_management_delete_confirm_ck", new C33744d().mo59980a("c_number", i).mo59980a("u_number", size).mo59980a("video_reply_number", i2).mo59983a("enter_from", enterFrom).f79943a);
        return C89391z.f203057a;
    }

    /* renamed from: a */
    public final void mo64693a(int i, Set<String> set, Map<String, Comment> map, boolean z) {
        C37074bt btVar;
        if (map.size() > 0 && i > 0 && !C13603b.m24435a((Collection) set) && (btVar = this.f87640y) != null) {
            btVar.mo64579a(set, map);
            mo64694a((long) (-i));
            if (z) {
                this.f87567I.mo64782c();
                this.f87567I.mo64781b().postValue(0);
                return;
            }
            mo64707b(map);
            this.f87567I.mo64781b().postValue(Integer.valueOf(map.size()));
        }
    }

    /* renamed from: a */
    private static void m74973a(Set<String> set, Map<String, Comment> map) {
        if (Build.VERSION.SDK_INT >= 24) {
            map.entrySet().removeIf(new C37180t(set));
            return;
        }
        Iterator<Map.Entry<String, Comment>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d
    /* renamed from: a */
    public final boolean mo63708a() {
        AbstractC36419e eVar;
        return getUserVisibleHint() && isVisible() && (eVar = this.f87569K) != null && eVar.mo63712a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        C37201k.AbstractC37202a aVar;
        ArrayList arrayList = new ArrayList();
        m75007d(arrayList);
        m75013e(arrayList);
        this.f87640y.mo64576a(exc, arrayList);
        C36274b bVar = this.f87641z;
        if (bVar != null) {
            bVar.mo63467a(0);
        }
        if ((exc instanceof C34485a) && C13603b.m24435a((Collection) this.f87560A.f87756b)) {
            m75017g(0);
        }
        if (C37201k.f87715b != null) {
            C37201k.C37204c cVar = C37201k.f87715b;
            if (cVar != null) {
                cVar.f87723g = System.currentTimeMillis();
            }
            C51423a.m95791b(4, "CommentLog", "CommentPageLoadTimer: onDataLoadFailed");
            C37201k.C37204c cVar2 = C37201k.f87715b;
            if (!(cVar2 == null || (aVar = cVar2.f87725i) == null)) {
                C37201k.C37204c cVar3 = C37201k.f87715b;
                aVar.mo64695a(cVar3 != null ? cVar3.mo64758d() : -1, false, 0);
            }
            C37201k.m75183b();
            C37201k.f87715b = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo64711d(List<Comment> list, boolean z) {
        int size;
        boolean z2;
        C36514k kVar = this.f87639w;
        if (kVar == null || kVar.f92286h == null || this.f87639w.f92286h.mData == null) {
            C51423a.m95784a(4, UGCMonitor.EVENT_COMMENT, "onRefreshResult() with return");
            return;
        }
        StringBuilder sb = new StringBuilder("onRefreshResult(): aid = ");
        Aweme aweme = this.f87623c;
        StringBuilder append = sb.append(aweme == null ? null : aweme.getAid()).append(" load size = ");
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        C51423a.m95791b(4, UGCMonitor.EVENT_COMMENT, append.append(size).toString());
        long j = f87558D;
        if (j > 0) {
            C1731i.m5640b(new CallableC37182v(this, j), C1731i.f5562a);
            f87558D = 0;
        }
        AbstractC36419e eVar = this.f87569K;
        if (eVar == null || !eVar.mo63716d()) {
            Aweme aweme2 = this.f87623c;
            if (aweme2 == null || !aweme2.getAwemeControl().canShowComment()) {
                C51423a.m95791b(4, UGCMonitor.EVENT_COMMENT, "onRefreshResult() => showLoadEmpty() because canCommentShow == false");
                list.clear();
                mo59525f();
            }
            C36274b bVar = this.f87641z;
            if (bVar != null) {
                bVar.mo63467a(0);
            }
            m74972a(list);
            m75004b(list);
            long h = m75019h(true);
            C36274b bVar2 = this.f87641z;
            if (bVar2 != null) {
                if (this.f87639w.f92286h.mData.replyStyle == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bVar2.f85737h = z2;
            }
            m75007d(list);
            m75013e(list);
            if (m74983ai()) {
                Comment comment = new Comment();
                comment.setCommentType(222);
                if (list != null) {
                    list.add(0, comment);
                }
            }
            if (this.f87639w.f92286h.mData.hasFilteredComments()) {
                this.f87638v.mo67814a((CharSequence) m75000az());
                this.f87638v.mo67811a(LinkMovementMethod.getInstance());
                this.f87638v.f85510f = true;
            }
            this.f87640y.mo59512a(list, z);
            if (C76706a.m134278d(this.f87623c) || (m74994at() && !TextUtils.isEmpty(this.f87639w.mo63985e()))) {
                this.f87584Z.mo4413b(0);
            }
            m75017g(h);
            this.f87622b.setInsertCids(this.f87639w.mo63985e(), this.f87622b.showReplyWithInsertCid(), this.f87622b.isForceOpenReply());
            m74993as();
            C37201k.m75180a(list != null ? list.size() : 0);
            if (this.f87573O > 0) {
                m74969a(this.f87639w.f92286h.mData.commentPrompt);
            }
            if (this.f87639w.f92286h.mData.topGiftList != null && !this.f87639w.f92286h.mData.topGiftList.isEmpty()) {
                View view = this.f87598ab;
                if (view != null) {
                    this.f87601ae.mo71055b(view);
                }
                this.f87598ab = C1764a.m5927a(getLayoutInflater(), R.layout.js, (ViewGroup) getView(), false);
                View$OnClickListenerC37185y yVar = new View$OnClickListenerC37185y(this);
                this.f87598ab.findViewById(R.id.el9).setOnClickListener(yVar);
                this.f87598ab.setOnClickListener(yVar);
                RecyclerView recyclerView = (RecyclerView) this.f87598ab.findViewById(R.id.el8);
                C36431a aVar = new C36431a((ViewGroup) getView(), getContext(), yVar);
                getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                recyclerView.setAdapter(aVar);
                recyclerView.setOnClickListener(yVar);
                List<CommentGiftStruct> list2 = this.f87639w.f92286h.mData.topGiftList;
                if (list2 != null) {
                    aVar.f86116a = (ArrayList) list2;
                    aVar.notifyDataSetChanged();
                }
                this.f87601ae.mo71054a(this.f87598ab);
                m74970a(this.f87623c, this.f87639w.f92286h.mData.topGiftList);
            }
            m74976ab();
            return;
        }
        C51423a.m95791b(4, UGCMonitor.EVENT_COMMENT, "onRefreshResult() => postDelay onRefreshResult() because mCommentNestedLayout.needBlockDataLoading()");
        this.f87584Z.postDelayed(new RunnableC37183w(this, list, z), 100);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Comment> list, boolean z) {
        if (this.f87639w.f92286h.mData.hasFilteredComments()) {
            this.f87638v.mo67814a((CharSequence) m75000az());
            this.f87638v.mo67811a(LinkMovementMethod.getInstance());
            this.f87638v.f85510f = true;
        }
        this.f87640y.mo59517b(list, z);
        m75017g(m75019h(false));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
        this.f87640y.mo59511a(exc);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36415a
    /* renamed from: a */
    public final void mo63699a(String str, C36499g gVar) {
        mo64694a((long) (-m75011e(str)));
        this.f87640y.mo63699a(str, gVar);
        boolean z = false;
        AbstractC81915c.m141874a(new C36387c(4, new Object[]{this.f87622b.getAid(), str}));
        if (!(this.f87623c == null || this.f87574P == null)) {
            C39223a.m79590d().mo68616a(getActivity(), this.f87623c, this.f87574P);
        }
        if (m74994at()) {
            AbstractC81915c.m141874a(new C62690a(3, gVar.f86375c));
        }
        if (this.f87574P.getAliasAweme() != null) {
            z = true;
        }
        if (C36180f.m73734a() && z) {
            new C23144b(getActivity()).mo37640e(R.string.alo).mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw).mo37637b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36417c
    /* renamed from: a */
    public final void mo63702a(String str, String str2, Exception exc) {
        String str3;
        this.f87640y.mo63702a(str, str2, exc);
        if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 3002043) {
            this.f87622b.setCommentClose(true);
            m75003b(this.f87622b);
        }
        if (!TextUtils.isEmpty(this.f87607ak)) {
            boolean f = m75015f(str);
            boolean equals = TextUtils.equals(this.f87608al, this.f87623c.getAuthorUid());
            String enterFrom = this.f87622b.getEnterFrom();
            String enterMethod = this.f87622b.getEnterMethod();
            Aweme aweme = this.f87623c;
            String str4 = this.f87608al;
            boolean isHotPlayer = this.f87622b.isHotPlayer();
            int ae = m74979ae();
            String lastGroupId = this.f87622b.getLastGroupId();
            if (f) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C36539b.m74371a(enterFrom, enterMethod, aweme, str, false, "list", str4, isHotPlayer, str2, ae, lastGroupId, str3, !equals ? 1 : 0, this.f87622b.getAid(), C31575b.m65865g().getCurUser().getPredictedAgeGroup(), m75016g(str));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36417c
    /* renamed from: a */
    public final void mo63703a(Object... objArr) {
        String str;
        this.f87640y.mo63703a(objArr[0]);
        if (!TextUtils.isEmpty(this.f87607ak)) {
            boolean f = m75015f((String) objArr[0]);
            boolean equals = TextUtils.equals(this.f87608al, this.f87623c.getAuthorUid());
            String enterFrom = this.f87622b.getEnterFrom();
            String enterMethod = this.f87622b.getEnterMethod();
            Aweme aweme = this.f87623c;
            String str2 = (String) objArr[0];
            String str3 = this.f87608al;
            boolean isHotPlayer = this.f87622b.isHotPlayer();
            String str4 = (String) objArr[1];
            int ae = m74979ae();
            String lastGroupId = this.f87622b.getLastGroupId();
            if (f) {
                str = "1";
            } else {
                str = "0";
            }
            C36539b.m74371a(enterFrom, enterMethod, aweme, str2, true, "list", str3, isHotPlayer, str4, ae, lastGroupId, str, !equals ? 1 : 0, this.f87622b.getNewsId(), C31575b.m65865g().getCurUser().getPredictedAgeGroup(), m75016g((String) objArr[0]));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a
    /* renamed from: a */
    public final void mo63747a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            SmartRouter.buildRoute(getActivity(), "aweme://user/profile/").withParam("uid", str).withParam("enter_from", this.f87622b.getEventType()).withParam("extra_from_pre_page", "notification_page").withParam("sec_uid", str2).open();
            String eventType = this.f87622b.getEventType();
            String aid = this.f87622b.getAid();
            this.f87622b.getAuthorUid();
            String requestId = this.f87622b.getRequestId();
            Aweme aweme = this.f87623c;
            C39162r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str).setJsonObject(new C33743c().mo59976a("group_id", aid).mo59976a("request_id", requestId).mo59976a("enter_from", eventType).mo59976a("enter_method", str3).mo59976a("enter_type", "normal_way").mo59977a()));
            C39162r.m79460a("enter_personal_detail_backup", new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("to_user_id", str).mo59983a("group_id", aid).mo59983a("request_id", requestId).mo59983a("enter_method", str3).mo59983a("enter_type", "normal_way").f79943a);
            if (aweme != null) {
                C39162r.onEvent(MobClick.obtain().setEventName("head").setLabelName(eventType).setValue(aweme.getAuthorUid()).setJsonObject(new C33743c().mo59976a("request_id", aweme.getRequestId()).mo59976a("group_id", aweme.getAid()).mo59977a()));
            }
            C59252q qVar = (C59252q) new C59252q().mo96825o(eventType).mo96741a(str3);
            qVar.f135285Y = "comment_list";
            qVar.f135286Z = "comment_list";
            C59252q f = qVar.mo96749g(aweme);
            f.f135314q = str;
            f.mo96792f();
            C49907s.m93686a(EnumC48310af.PROFILE);
            AbstractC81915c.m141874a(new C49672ag(36));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a
    /* renamed from: a */
    public final void mo63743a(AbstractC36425k kVar, Comment comment) {
        if (comment != null && mo63708a() && !C76706a.m134284j(this.f87623c) && !C36535m.m74352a(comment)) {
            Aweme aliasAweme = comment.getAliasAweme();
            if (aliasAweme != null) {
                Context context = getContext();
                if (context != null && !TextUtils.isEmpty(aliasAweme.getAid())) {
                    SmartRouter.buildRoute(context, "aweme://aweme/detail/").withParam("id", aliasAweme.getAid()).withParam("refer", UGCMonitor.EVENT_COMMENT).withParam("last_group_id", this.f87622b.getAid()).open();
                    String enterFrom = this.f87622b.getEnterFrom();
                    String aid = this.f87622b.getAid();
                    String cid = comment.getCid();
                    C39162r.m79460a("click_video_comment", C36539b.m74366a(enterFrom, aid).mo59983a("comment_id", cid).mo59983a("to_group_id", aliasAweme.getAid()).f79943a);
                }
            } else if (!C31575b.m65865g().isLogin()) {
                C58957c.m108320a(getActivity(), this.f87622b.getEventType(), "reply_comment", new C80222ap().mo123649a("group_id", this.f87622b.getAid()).mo123649a("log_pb", C59208ac.m108768c(this.f87622b.getAid())).f179700a, new C37011ac(this, kVar, comment));
            } else if (!m74981ag()) {
                mo64705b(comment, "click_text");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x025b, code lost:
        if (r17 != false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02cb, code lost:
        if (r10 != 7) goto L_0x016a;
     */
    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63744a(final com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36425k r19, final com.p2082ss.android.ugc.aweme.comment.model.Comment r20, final com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g r21) {
        /*
        // Method dump skipped, instructions count: 910
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.mo63744a(com.ss.android.ugc.aweme.comment.f.k, com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.comment.f.g):void");
    }

    /* renamed from: a */
    public final void mo64692a(int i, int i2) {
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            return;
        }
        if (i2 != 0) {
            new C23144b(activity).mo37635a(activity.getString(i)).mo37636b(i2).mo37634a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).mo37637b();
        } else {
            new C23144b(activity).mo37635a(activity.getString(i)).mo37634a(InteractFirstFrameTimeOutDurationSetting.DEFAULT).mo37637b();
        }
    }

    /* renamed from: a */
    public final void mo64697a(final AbstractC36421g gVar, boolean z) {
        gVar.mo63728a(true);
        final LiveData<C36393h> b = gVar.mo63730b(z);
        if (b != null) {
            b.observe(this, new AbstractC1214u<C36393h>() {
                /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.C3716313 */

                static {
                    Covode.recordClassIndex(44517);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public final /* synthetic */ C89391z mo64734a(AbstractC36421g gVar) {
                    C37157k.this.mo64697a(gVar, true);
                    C37157k.m74971a("comment_restr_pin_opt_pin_anyway_click", gVar.mo63727a());
                    return C89391z.f203057a;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(C36393h hVar) {
                    C36393h hVar2 = hVar;
                    if (hVar2.f86073a == EnumC36396k.SUCCESS) {
                        Comment comment = C37157k.this.f87640y.f87347d;
                        if (comment != null) {
                            comment.setAuthorPin(false);
                            C37157k.this.f87640y.mo64581b(comment);
                        }
                        Comment a = gVar.mo63727a();
                        a.setAuthorPin(true);
                        C37157k.this.f87640y.f87347d = a;
                        gVar.mo63731c();
                        new C23144b(C37157k.this.getActivity()).mo37640e(R.string.al4).mo37637b();
                    } else if (hVar2.f86073a == EnumC36396k.FAIL) {
                        new C23144b(C37157k.this.getActivity()).mo37640e(R.string.akx).mo37637b();
                    } else if (hVar2.f86073a == EnumC36396k.LIMIT && hVar2.f86074b != null) {
                        int i = hVar2.f86074b.f86075a;
                        if (i == 1) {
                            C23025b bVar = new C23025b(C37157k.this.getActivity());
                            bVar.mo37416a(R.string.bx, new C37045bg(this, gVar));
                            new C23023b(C37157k.this.getActivity()).mo37413d(hVar2.f86074b.f86077c).mo37407a(bVar).mo37405a().mo37396b().show();
                            C37157k.m74971a("comment_restr_pin_popup_show", gVar.mo63727a());
                        } else if (i == 2) {
                            new C23144b(C37157k.this.getActivity()).mo37635a(hVar2.f86074b.f86077c).mo37637b();
                            C37157k.m74971a("comment_restr_pin_toast_show", gVar.mo63727a());
                        } else if (i == 3) {
                            C23025b bVar2 = new C23025b(C37157k.this.getActivity());
                            bVar2.mo37417a(hVar2.f86074b.f86079e, new C37046bh(this, gVar));
                            bVar2.mo37419b(hVar2.f86074b.f86078d, new C37047bi(this, gVar));
                            new C23023b(C37157k.this.getActivity()).mo37413d(hVar2.f86074b.f86077c).mo37407a(bVar2).mo37405a().mo37396b().show();
                            C37157k.m74971a("comment_restr_pin_opt_popup_show", gVar.mo63727a());
                        }
                    }
                    gVar.mo63732d();
                    b.removeObserver(this);
                }
            });
            C36540c.m74390a(true, gVar.mo63727a(), this.f87622b.getEventType(), this.f87622b.getAuthorUid(), this.f87622b.getAid());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo64687a(AbstractC36421g gVar) {
        mo64697a(gVar, false);
        C36540c.m74385a(this.f87622b.getEventType(), "replace", this.f87622b.getAuthorUid(), this.f87622b.getAid());
        return null;
    }

    /* renamed from: a */
    public final void mo64698a(Comment comment, String str) {
        C36205a aVar = this.f87638v;
        if (aVar != null) {
            String str2 = "comment_press";
            if (!TextUtils.equals(str2, str)) {
                str2 = "comment_click";
            }
            aVar.mo63357a(comment, "reply_via_video", str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a
    /* renamed from: a */
    public final void mo63746a(String str, String str2) {
        SmartRouter.buildRoute(getActivity(), "aweme://user/profile/").withParam("uid", str).withParam("enter_from", "like_banner").withParam("sec_uid", str2).open();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63745a(com.p2082ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct r18, com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36422h r19) {
        /*
        // Method dump skipped, instructions count: 436
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.mo63745a(com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct, com.ss.android.ugc.aweme.comment.f.h):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a
    /* renamed from: d */
    public final void mo63750d(Comment comment) {
        int i;
        C36535m.C36536a aVar;
        String text = comment.getText();
        Comment comment2 = null;
        C36535m.C36536a aVar2 = C36535m.f86493a.get(comment.getFakeId());
        if (aVar2 != null) {
            comment2 = aVar2.f86500f;
        }
        C36535m.C36536a aVar3 = C36535m.f86493a.get(comment.getFakeId());
        if (aVar3 != null) {
            i = aVar3.f86499e;
        } else {
            i = -1;
        }
        m74968a(comment2, i, C46579b.m89897a(text), text, true, "");
        C36274b bVar = this.f87641z;
        if (bVar != null) {
            Map<String, C36535m.C36536a> map = C36535m.f86493a;
            String fakeId = comment.getFakeId();
            C89219l.m154716b(fakeId, "");
            C36535m.C36536a aVar4 = C36535m.f86493a.get(comment.getFakeId());
            if (aVar4 == null || (aVar = C36535m.C36536a.m74364a(aVar4, 3, null, 0, null, 0, null, 62)) == null) {
                aVar = new C36535m.C36536a(3, null, 0, null, 0, null, 62);
            }
            map.put(fakeId, aVar);
            AbstractC36489a i2 = C36535m.m74361i(comment);
            if (i2 != null) {
                bVar.f85734e.mo57616a(i2);
            } else {
                C36535m.m74355c(comment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64699a(Comment comment, String str, String str2, int i, int i2) {
        boolean z;
        if (this.f87622b.getSource() == 0) {
            String aid = this.f87622b.getAid();
            String enterFrom = this.f87622b.getEnterFrom();
            String cid = comment.getCid();
            String authorUid = this.f87623c.getAuthorUid();
            String str3 = "";
            String uid = comment.getUser() != null ? comment.getUser().getUid() : str3;
            if (comment.getAliasAweme() != null) {
                z = true;
            } else {
                z = false;
            }
            C39162r.onEvent(MobClick.obtain().setEventName("delete_comment").setLabelName("video_page").setValue(aid));
            C33744d a = C36539b.m74366a(enterFrom, aid).mo59983a("comment_id", cid);
            if (i2 != -1) {
                a = a.mo59980a("secondary_position", i2);
            }
            C33744d a2 = a.mo59983a("author_id", authorUid);
            if (!TextUtils.isEmpty(uid)) {
                str3 = uid;
            }
            C39162r.m79460a("delete_comment", a2.mo59983a("comment_user_id", str3).mo59980a("parent_position", i).mo59983a("parent_comment_id", str).mo59983a("comment_category", str2).mo59983a("is_video", z ? "1" : "0").f79943a);
        }
        if (this.f87604ah != null && !TextUtils.isEmpty(comment.getCid())) {
            ((C36504c) this.f87604ah.f92286h).f86432c = this.f87622b.getAid();
            ((C36504c) this.f87604ah.f92286h).f86433d = new C36499g(m74983ai(), C76706a.m134278d(this.f87623c), comment);
            this.f87604ah.mo57616a(comment.getCid(), Integer.valueOf(C33721c.m69041a(this.f87622b.getEventType())));
            this.f87574P = comment;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d
    /* renamed from: a */
    public final void mo63706a(AbstractC49691s<C49672ag> sVar) {
        this.f87561B = sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo64706b(Aweme aweme) {
        this.f87623c = aweme;
        m74992ar();
        m74967a(getView());
        if (aweme != null) {
            if (aweme.getUserDigg() == 1) {
                this.f87621az.add(aweme.getAid());
            }
            if (aweme.getStatistics() != null) {
                this.f87592aG = aweme.getStatistics().getCommentCount();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64425a(String str) {
        this.f87614as = System.currentTimeMillis();
        this.f87588aC = str;
        String enterFrom = this.f87622b.getEnterFrom();
        Aweme aweme = this.f87623c;
        String a = C36539b.m74368a(this.f87624d);
        C33744d dVar = new C33744d();
        dVar.mo59985a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.m95759b().mo86844a(enterFrom, aweme)).mo59985a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.m95759b().mo86843a(aweme, "list")).mo59983a("comment_category", a);
        if (!str.isEmpty()) {
            dVar.mo59983a("enter_method", str);
        }
        if ("homepage_country".equals(enterFrom) && aweme.getAuthor() != null) {
            dVar.mo59983a("country_name", aweme.getAuthor().getRegion());
        }
        C39162r.m79460a("enter_text", dVar.f79943a);
        Comment comment = this.f87624d;
        if (comment != null) {
            this.f87640y.mo64580a(true, comment);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64424a(int i, int i2, String str, String str2, boolean z) {
        m74968a(this.f87624d, i, i2, str, false, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d
    /* renamed from: a */
    public final void mo63705a(Comment comment, boolean z) {
        if (comment != null && comment.isStoryEmojiComment()) {
            String aid = this.f87622b.getAid();
            String awemeId = comment.getAwemeId();
            comment.getFakeId();
            comment.getText();
            if (!TextUtils.equals(aid, awemeId)) {
                return;
            }
        }
        int[] au = m74995au();
        if (this.f87606aj == null) {
            m74982ah();
        }
        this.f87640y.mo64574a(comment, au[0], au[1], m74983ai());
        mo64694a(1);
        Object[] objArr = new Object[2];
        objArr[0] = this.f87622b.getAid();
        objArr[1] = comment == null ? null : comment.clone();
        AbstractC81915c.m141874a(new C36387c(3, objArr));
        if (m74994at()) {
            AbstractC81915c.m141874a(new C62690a(2, comment));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d
    /* renamed from: a */
    public final void mo63704a(Comment comment) {
        C37074bt btVar;
        if (comment != null && comment.isStoryEmojiComment()) {
            String aid = this.f87622b.getAid();
            String awemeId = comment.getAwemeId();
            comment.getFakeId();
            comment.getText();
            if (!TextUtils.equals(aid, awemeId)) {
                return;
            }
        }
        if (af_() && comment != null && (btVar = this.f87640y) != null) {
            btVar.mo64575a(comment, m74983ai());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r12.getErrorCode() != 3057) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64427b(java.lang.Exception r12, int r13, com.p2082ss.android.ugc.aweme.comment.model.Comment r14) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.mo64427b(java.lang.Exception, int, com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64426a(String str, int i) {
        C36539b.m74370a(str, i, this.f87622b.getEnterFrom(), this.f87622b.getAid(), this.f87622b.getAuthorUid());
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: b */
    public final void mo64428b(String str) {
        C36539b.m74372a(str, this.f87622b.getEnterFrom(), this.f87622b.getAid(), this.f87622b.getAuthorUid());
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36423i
    /* renamed from: a */
    public final void mo63733a(String str, List<Comment> list) {
        C36205a aVar;
        int c;
        C37074bt btVar = this.f87640y;
        String str2 = "";
        if (!TextUtils.isEmpty(str) && !C13603b.m24435a((Collection) list) && (aVar = (C36205a) btVar.mo64572a()) != null && (c = aVar.mo63365c(str, 11)) >= 0 && btVar.f87346c != null) {
            Comment comment = (Comment) aVar.mo63369e().get(c);
            if (comment instanceof CommentReplyButtonStruct) {
                str2 = ((CommentReplyButtonStruct) comment).getCommentId();
            }
            List<Comment> a = C37074bt.m74760a(aVar);
            C37221v vVar = btVar.f87346c;
            if (list != null && !C13603b.m24435a((Collection) vVar.f87756b)) {
                Comment comment2 = vVar.f87756b.get(c);
                if (comment2 instanceof CommentReplyButtonStruct) {
                    vVar.f87756b.addAll(c, list);
                    C36520p.m74325a(((CommentReplyButtonStruct) comment2).getCommentId(), list.size());
                    try {
                        CommentReplyListItem commentReplyListItem = vVar.f87755a.get(Integer.valueOf(comment2.getCid()).intValue());
                        if (!commentReplyListItem.mReplyComments.containsAll(list)) {
                            commentReplyListItem.mReplyComments.addAll(list);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            C80275bv.m139152a(aVar, a, aVar.mo63369e());
        }
        if (!TextUtils.isEmpty(str2)) {
            C36520p.m74327a(str2, false);
            String enterFrom = this.f87622b.getEnterFrom();
            String aid = this.f87622b.getAid();
            int i = C36520p.m74324a(str2).f86481h;
            C33744d a2 = C36539b.m74366a(enterFrom, aid);
            a2.mo59983a("parent_comment_id", str2);
            a2.mo59980a("click_cnt", i);
            C39162r.m79460a("show_more_reply", a2.f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36423i
    /* renamed from: b */
    public final void mo63734b(String str, List<Comment> list) {
        int c;
        C37074bt btVar = this.f87640y;
        String str2 = "";
        if (!TextUtils.isEmpty(str) && !C13603b.m24435a((Collection) list)) {
            C36205a aVar = (C36205a) btVar.mo64572a();
            if (aVar == null) {
                c = -1;
            } else {
                c = aVar.mo63365c(str, 11);
            }
            if (c - list.size() >= 0) {
                Comment comment = (Comment) aVar.mo63369e().get(c);
                if (comment instanceof CommentReplyButtonStruct) {
                    str2 = ((CommentReplyButtonStruct) comment).getCommentId();
                }
                List<Comment> a = C37074bt.m74760a(aVar);
                C37221v vVar = btVar.f87346c;
                if (vVar.f87756b != null) {
                    vVar.f87756b.removeAll(list);
                }
                C80275bv.m139152a(aVar, a, aVar.mo63369e());
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            C36520p.m74327a(str2, true);
            C33744d a2 = C36539b.m74366a(this.f87622b.getEnterFrom(), this.f87622b.getAid());
            a2.mo59983a("parent_comment_id", str2);
            C39162r.m79460a("hide_all_reply", a2.f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63720a(boolean z) {
        View view;
        this.f87595aJ = z;
        ImageView imageView = this.f87628l;
        if (imageView != null) {
            if (z) {
                imageView.setEnabled(true);
                this.f87628l.setImageResource(2131231188);
            } else {
                imageView.setEnabled(false);
                this.f87628l.setImageResource(2131231190);
            }
        }
        if (this.f87629m != null && (view = this.f87634r) != null) {
            if (!z || view.getVisibility() != 0) {
                this.f87631o.setVisibility(8);
                AbstractC36419e eVar = this.f87569K;
                if (eVar != null) {
                    eVar.mo63714b(false);
                    return;
                }
                return;
            }
            this.f87631o.setVisibility(0);
            AbstractC36419e eVar2 = this.f87569K;
            if (eVar2 != null) {
                eVar2.mo63714b(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo64707b(Map<String, Comment> map) {
        C37221v vVar = this.f87560A;
        if (!(vVar == null || C13603b.m24435a((Collection) vVar.f87755a))) {
            List<CommentReplyListItem> list = this.f87560A.f87755a;
            HashSet hashSet = new HashSet();
            for (CommentReplyListItem commentReplyListItem : list) {
                Comment comment = commentReplyListItem.mComment;
                if (comment != null) {
                    hashSet.add(comment.getCid());
                    if (!C13603b.m24435a((Collection) commentReplyListItem.mReplyComments)) {
                        for (Comment comment2 : commentReplyListItem.mReplyComments) {
                            hashSet.add(comment2.getCid());
                        }
                    }
                }
            }
            m74973a(hashSet, map);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.util.C37201k.AbstractC37202a
    /* renamed from: a */
    public final void mo64695a(long j, boolean z, int i) {
        Aweme aweme = this.f87623c;
        if (aweme != null) {
            C36540c.m74387a(aweme.getAid(), this.f87623c.getAuthorUid(), this.f87622b.getEnterFrom(), z ? i == 0 ? "null" : "success" : "fail", j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo64691a(boolean z, Aweme aweme) {
        if (z) {
            C36274b bVar = this.f87641z;
            try {
                DialogInterface$OnShowListenerC37084bz bzVar = (DialogInterface$OnShowListenerC37084bz) bVar.f85731b.getChildFragmentManager().mo3551a("input");
                if (bzVar == null) {
                    return null;
                }
                String str = bVar.f85738i;
                if (bzVar.f87425h == null) {
                    return null;
                }
                if (bzVar.f87425h.getVisibility() != 0) {
                    return null;
                }
                if (bzVar.f87399ac.mo108910h() || bzVar.getActivity() == null) {
                    return null;
                }
                String[] strArr = {"time_out"};
                bzVar.f87398ab = new C17257b(bzVar.getActivity()).mo27354a(bzVar.f87425h).mo27358b(48).mo27352a(3000L).mo27356a(bzVar.getResources().getString(R.string.h9u)).mo27357a(true).mo27353a(new View.OnClickListener(strArr) {
                    /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.View$OnClickListenerC370936 */

                    /* renamed from: a */
                    final /* synthetic */ String[] f87452a;

                    static {
                        Covode.recordClassIndex(44447);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        this.f87452a[0] = "click";
                        DialogInterface$OnShowListenerC37084bz.this.f87398ab.dismiss();
                    }

                    {
                        this.f87452a = r2;
                    }
                }).mo27350a();
                bzVar.f87398ab.mo27341a();
                bzVar.f87399ac.mo108911i();
                DialogInterface$OnShowListenerC37084bz.m74808a(bzVar.f87387S, "", str, "show_gift_tooltip");
                bzVar.f87398ab.mo27342a(new C37108ch(bzVar, strArr, str));
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            TuxIconView tuxIconView = this.f87627k;
            if (tuxIconView == null || tuxIconView.getVisibility() != 0 || this.f87571M.mo108910h() || getActivity() == null) {
                return null;
            }
            final String[] strArr2 = {"time_out"};
            AbstractC17256a a = new C17257b(getActivity()).mo27354a(this.f87627k).mo27352a(3000L).mo27358b(48).mo27356a(getResources().getString(R.string.h9u)).mo27357a(true).mo27353a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.View$OnClickListenerC371675 */

                static {
                    Covode.recordClassIndex(44521);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    strArr2[0] = "click";
                    C37157k.this.f87635s.dismiss();
                }
            }).mo27350a();
            this.f87635s = a;
            a.mo27341a();
            this.f87571M.mo108911i();
            mo64700a(aweme, "", "show_gift_tooltip");
            this.f87635s.mo27342a(new C37023ao(this, aweme, strArr2));
            return null;
        }
    }

    /* renamed from: a */
    private void m74974a(boolean z, Comment comment, int i) {
        if (this.f87623c != null && comment != null) {
            C33744d a = new C33744d().mo59983a("enter_from", this.f87622b.getEnterFrom()).mo59983a("group_id", C59208ac.m108771e(this.f87623c)).mo59983a("author_id", C59208ac.m108758a(this.f87623c)).mo59980a("is_success", z ? 1 : 0).mo59981a("gift_id", comment.getGift() == null ? comment.getFakeGiftId() : comment.getGift().getId()).mo59980a("is_follow", C37216s.m75210b(this.f87623c)).mo59980a("is_like", C37216s.m75209a(this.f87623c)).mo59980a("is_comment", !C27254p.m54261a(comment.getText()) ? 1 : 0);
            if (i != 0) {
                a.mo59980a("error_code", i);
                a.mo59982a("newtork_condition", m75002b(getContext()));
            }
            if (!this.f87572N.isEmpty()) {
                a.mo59983a("enter_method", this.f87572N);
            } else if (!this.f87641z.f85744o.isEmpty()) {
                a.mo59983a("enter_method", this.f87641z.f85744o);
            } else {
                a.mo59983a("enter_method", "send_button");
            }
            this.f87572N = "";
            C39162r.m79460a("send_gift", a.f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d
    /* renamed from: a */
    public final void mo63707a(Exception exc, int i, Comment comment) {
        mo64427b(exc, i, comment);
    }

    /* renamed from: b */
    public final void mo64705b(Comment comment, String str) {
        if (!C76706a.m134284j(this.f87623c) && isAdded()) {
            Comment comment2 = this.f87624d;
            if (comment2 == null || !comment2.equals(comment)) {
                this.f87624d = comment;
                C36274b bVar = this.f87641z;
                if (bVar != null) {
                    bVar.mo63475a(comment.getUser(), str);
                }
            } else {
                this.f87624d = comment;
                this.f87626j.performClick();
            }
            if (mo64732z()) {
                this.f87562C.mo64517a(true, 1);
                C36500h hVar = this.f87622b;
                if (hVar != null) {
                    C36540c.m74386a("keyboard", this.f87622b.getEnterFrom(), this.f87622b.getAid(), this.f87622b.getAuthorUid(), !TextUtils.equals(hVar.getAuthorUid(), C31575b.m65865g().getCurUserId()) ? 1 : 0);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64700a(Aweme aweme, String str, String str2) {
        C33744d a = new C33744d().mo59983a("enter_from", this.f87622b.getEnterFrom()).mo59983a("group_id", C59208ac.m108771e(aweme)).mo59983a("author_id", C59208ac.m108758a(aweme));
        if (str2.equals("show_gift_tooltip")) {
            C39162r.m79460a("show_gift_tooltip", a.f79943a);
            return;
        }
        a.mo59983a("enter_method", str);
        C39162r.m79460a("dismiss_gift_tooltip", a.f79943a);
    }

    /* renamed from: ax */
    private void m74998ax() {
        m74997aw();
        m74996av();
    }

    /* renamed from: A */
    public final void mo64681A() {
        AbstractC36419e eVar = this.f87569K;
        if (eVar != null) {
            eVar.mo63713b();
        }
    }

    /* renamed from: B */
    public final void mo64682B() {
        AbstractC36419e eVar = this.f87569K;
        if (eVar != null) {
            eVar.mo63715c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final /* synthetic */ Object mo64683C() {
        m74985ak();
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
        this.f87640y.bl_();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a
    /* renamed from: k */
    public final void mo63752k() {
        mo64709c("click_gift_comment");
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: o */
    public final String mo64436o() {
        return this.f87622b.getEventType();
    }

    /* renamed from: P */
    private void m74954P() {
        this.f87638v.f85511g = new C37172l(this);
    }

    /* renamed from: Q */
    private void m74955Q() {
        C36547a.m74402a().mo64260a(getActivity());
    }

    /* renamed from: af */
    private static boolean m74980af() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final /* synthetic */ C89391z mo64684D() {
        C36540c.m74391b(this.f87622b.getEnterFrom(), "cancel");
        return C89391z.f203057a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        C2541b.m7434a(UGCMonitor.EVENT_COMMENT, "info");
        this.f87640y.aW_();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        if (mo63708a()) {
            m75022i(false);
        }
        super.onStop();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: p */
    public final int mo64438p() {
        if (this.f87610an) {
            return 4;
        }
        if (this.f87624d != null) {
            return 3;
        }
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo64729v() {
        this.f87573O = 0;
        m74962X();
        m74975aa();
    }

    /* renamed from: K */
    private boolean m74949K() {
        Aweme aweme;
        if (!C46920f.m90221a() || (aweme = this.f87623c) == null || C76706a.m134278d(aweme) || !C80580in.m139681a(this.f87623c.getAuthorUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private boolean m74951M() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if (!m74952N() || (commentBatchManagementViewModel = this.f87567I) == null || !commentBatchManagementViewModel.mo64780a().getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    private boolean m74952N() {
        if (!C80580in.m139681a(this.f87622b.getAuthorUid()) || !C36176c.m73729a()) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    private long m74957S() {
        Aweme aweme = this.f87623c;
        if (aweme == null || aweme.getStatistics() == null) {
            return 0;
        }
        return this.f87623c.getStatistics().getDiggCount();
    }

    /* renamed from: V */
    private String m74960V() {
        C37074bt btVar = this.f87640y;
        if (!(btVar == null || btVar.f87347d == null)) {
            Comment comment = this.f87640y.f87347d;
            if (comment.getUser() != null) {
                return comment.getUser().getUid();
            }
        }
        return "";
    }

    /* renamed from: Y */
    private void m74963Y() {
        if (m74994at() && this.f87638v != null) {
            ArrayList arrayList = new ArrayList();
            m75013e(arrayList);
            this.f87640y.mo64578a(arrayList);
        }
    }

    /* renamed from: ad */
    private boolean m74978ad() {
        C38255s adCommentStruct;
        Aweme aweme = this.f87623c;
        if (aweme == null) {
            adCommentStruct = null;
        } else {
            adCommentStruct = aweme.getAdCommentStruct();
        }
        if (!m74987am() || adCommentStruct == null || !adCommentStruct.showAsDefault()) {
            return false;
        }
        return true;
    }

    /* renamed from: ae */
    private int m74979ae() {
        Comment comment;
        C36509h hVar = this.f87605ai;
        if (hVar == null || hVar.f92286h == null || (comment = ((C36507f) this.f87605ai.f92286h).f86439e) == null) {
            return -1;
        }
        return C76598h.m134176a(comment.getUser());
    }

    /* renamed from: ai */
    private boolean m74983ai() {
        if (!C76706a.m134278d(this.f87623c) || C76706a.m134284j(this.f87623c) || !C76660b.m134251k()) {
            return false;
        }
        return true;
    }

    /* renamed from: am */
    private boolean m74987am() {
        Aweme aweme = this.f87623c;
        if (aweme == null || !aweme.isAd() || !m74989ao() || this.f87622b.isCommentClose()) {
            return false;
        }
        return true;
    }

    /* renamed from: ao */
    private boolean m74989ao() {
        if (!this.f87622b.isEnableComment() || C37699a.m76218U(this.f87623c)) {
            return false;
        }
        return true;
    }

    /* renamed from: ap */
    private boolean m74990ap() {
        Aweme aweme = this.f87623c;
        if (aweme == null || !aweme.getAwemeControl().canComment() || this.f87622b.isCommentClose() || !m74989ao()) {
            return false;
        }
        return true;
    }

    /* renamed from: aq */
    private void m74991aq() {
        this.f87624d = null;
        this.f87610an = false;
        this.f87626j.setText("");
        C36274b bVar = this.f87641z;
        if (bVar != null) {
            bVar.mo63513l();
        }
    }

    /* renamed from: ar */
    private void m74992ar() {
        AwemeRawAd awemeRawAd;
        this.f87609am = false;
        Aweme aweme = this.f87623c;
        if (aweme != null && aweme.isAd() && (awemeRawAd = this.f87623c.getAwemeRawAd()) != null) {
            this.f87609am = awemeRawAd.isCommentAreaSwitch();
        }
    }

    /* renamed from: au */
    private int[] m74995au() {
        int i;
        int i2 = -1;
        if (mo63708a()) {
            i2 = this.f87637u.mo4371k();
            i = this.f87637u.mo4373m();
        } else {
            i = -1;
        }
        return new int[]{i2, i};
    }

    /* renamed from: ay */
    private String m74999ay() {
        int i;
        if (m74949K()) {
            i = R.string.bnp;
        } else {
            i = R.string.akj;
        }
        return getString(i);
    }

    /* renamed from: w */
    public static boolean m75024w() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean af = m74980af();
        C58029j.f132256h = af;
        return af;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final /* synthetic */ C89391z mo64685E() {
        C36540c.m74385a(this.f87622b.getEventType(), "cancel", this.f87622b.getAuthorUid(), this.f87622b.getAid());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ C89391z mo64686I() {
        String enterFrom = this.f87622b.getEnterFrom();
        C89219l.m154721d(enterFrom, "");
        C39162r.m79460a("comment_batch_management_delete_cancel_ck", new C33744d().mo59983a("enter_from", enterFrom).f79943a);
        return C89391z.f203057a;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: q */
    public final boolean mo64439q() {
        if (!C31575b.m65865g().isLogin()) {
            return false;
        }
        AbstractC49691s<C49672ag> sVar = this.f87561B;
        if (sVar == null) {
            return true;
        }
        sVar.mo63634a(new C49672ag(20));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo64727t() {
        if (!C80580in.m139681a(this.f87622b.getAuthorUid()) || !C36176c.m73730b()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final boolean mo64730x() {
        if (getActivity() == null) {
            return true;
        }
        if (m75024w()) {
            return false;
        }
        mo64692a(R.string.dcq, 0);
        return true;
    }

    /* renamed from: y */
    public final long mo64731y() {
        if (C76706a.m134278d(this.f87623c)) {
            return this.f87623c.getStory().getTotalComments();
        }
        return this.f87573O;
    }

    /* renamed from: J */
    private String m74948J() {
        if (m74949K()) {
            return C17867d.m33078a().getResources().getString(R.string.bno).replace("%d", C53437b.m98615a(this.f87592aG));
        }
        return null;
    }

    /* renamed from: R */
    private boolean m74956R() {
        if (!TextUtils.equals(this.f87622b.getEventType(), "homepage_familiar") && !this.f87622b.isShowLikeUsers()) {
            return false;
        }
        Aweme aweme = this.f87623c;
        if ((aweme == null || !this.f87621az.contains(aweme.getAid())) && m74957S() <= 0 && C13603b.m24435a((Collection) this.f87622b.getLikeUsers())) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    private void m74961W() {
        this.f87563E.mo60191a("comment_aweme_and_params", new C89378p(this.f87623c, this.f87622b));
        DataCenter dataCenter = this.f87563E;
        Aweme aweme = this.f87623c;
        dataCenter.mo60191a("comment_aweme_and_link", new C89378p(aweme, C38681bh.m78486a(aweme)));
    }

    /* renamed from: Z */
    private Long m74964Z() {
        Aweme aweme = this.f87623c;
        if ((aweme == null && (aweme = AwemeService.m70060b().mo60690d(this.f87622b.getAid())) == null) || aweme.getAwemeRawAd() == null || C37699a.m76221X(aweme)) {
            return null;
        }
        return aweme.getAwemeRawAd().getCreativeId();
    }

    /* renamed from: ac */
    private void m74977ac() {
        Aweme aweme = this.f87623c;
        if (aweme != null) {
            if (!aweme.isAd() || this.f87622b.getAdCommentStruct() == null) {
                if (C37699a.m76259ae(this.f87623c)) {
                    m74954P();
                }
                C38255s a = C37197g.m75170a(this.f87623c);
                if (a != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a);
                    this.f87638v.mo62377b_(arrayList);
                }
            }
        }
    }

    /* renamed from: ag */
    private boolean m74981ag() {
        if (C80580in.m139687c()) {
            new C23144b(this).mo37640e(R.string.acx).mo37637b();
            return true;
        } else if (this.f87565G || m74951M() || C76706a.m134284j(this.f87623c)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: ah */
    private void m74982ah() {
        C36520p pVar = new C36520p(this.f87622b.getAid(), this.f87622b.getEventType());
        this.f87606aj = pVar;
        pVar.mo63990a(this.f87560A);
        this.f87606aj.f86471e = this.f87622b.getInsertCids();
        this.f87606aj.f86467a = this;
    }

    /* renamed from: aj */
    private boolean m74984aj() {
        C36514k kVar = this.f87639w;
        if (kVar == null || kVar.f92286h == null || this.f87639w.f92286h.mData == null || this.f87639w.f92286h.mData.replyStyle != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: at */
    private boolean m74994at() {
        Aweme aweme;
        if (!this.f87622b.isMyProfile() || (aweme = this.f87623c) == null || C76706a.m134281g(aweme) || !C80580in.m139681a(this.f87623c.getAuthorUid())) {
            return false;
        }
        if ((this.f87622b.getPageType() == 1000 || this.f87622b.getPageType() == 1014) && C46920f.m90223c()) {
            return true;
        }
        return false;
    }

    /* renamed from: aw */
    private void m74997aw() {
        this.f87604ah.ck_();
        this.f87604ah.mo67840h();
        this.f87639w.ck_();
        this.f87639w.mo67840h();
        this.f87605ai.ck_();
        this.f87605ai.mo67840h();
        C36520p pVar = this.f87606aj;
        if (pVar != null) {
            pVar.ck_();
            this.f87606aj.mo67840h();
            this.f87606aj = null;
        }
        this.f87610an = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: i */
    public final void mo63726i() {
        if (C37699a.m76259ae(this.f87623c)) {
            this.f87563E.mo60191a("comment_dialog_state", (Object) 5);
        }
        if (getUserVisibleHint() || (!this.f87595aJ && m74949K())) {
            m74988an();
        }
        if (C36402b.m74101a()) {
            IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 0, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        C36514k kVar = this.f87639w;
        if (kVar != null) {
            kVar.mo57616a(4, this.f87622b.getAid(), "", m74964Z(), Integer.valueOf(C33721c.m69041a(this.f87622b.getEventType())));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f87563E.mo60191a("comment_dialog_state", (Object) 8);
        C2541b.m7439c(UGCMonitor.EVENT_COMMENT, "info");
        if (m74987am()) {
            if (this.f87587aB > 0) {
                this.f87586aA += System.currentTimeMillis() - this.f87587aB;
            }
            this.f87587aB = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo64726s() {
        CommentBatchManagementViewModel commentBatchManagementViewModel = this.f87567I;
        if (commentBatchManagementViewModel != null) {
            commentBatchManagementViewModel.mo64782c();
        }
        m74958T();
        this.f87566H = false;
        this.f87632p.setEnabled(false);
        this.f87632p.setTextColor(C0643b.m2378c(getContext(), R.color.bz));
        this.f87632p.setText(R.string.ajj);
        this.f87633q.setEnabled(false);
        this.f87633q.setTextColor(C0643b.m2378c(getContext(), R.color.bz));
    }

    /* renamed from: L */
    private void m74950L() {
        boolean z;
        m74959U();
        if (this.f87569K != null && this.f87567I != null) {
            if (m74952N() || (!C80580in.m139681a(this.f87622b.getAuthorUid()) && this.f87567I.mo64780a().getValue().booleanValue())) {
                if (!mo64727t() || this.f87622b.isCommentClose()) {
                    z = false;
                } else {
                    z = true;
                }
                C34729o.m70959b(z, this.f87630n);
                C34729o.m70959b(!this.f87622b.isCommentClose(), this.f87625e);
                this.f87569K.mo63714b(false);
                C34729o.m70959b(false, this.f87631o, this.f87634r);
                this.f87567I.mo64780a().postValue(false);
                mo64726s();
            }
        }
    }

    /* renamed from: O */
    private void m74953O() {
        Aweme aweme;
        AwemeStatistics statistics;
        long j = 0;
        if (m74989ao() && !this.f87622b.isCommentClose() && (aweme = this.f87623c) != null && (statistics = aweme.getStatistics()) != null) {
            long commentCount = statistics.getCommentCount();
            if (commentCount <= 0 || m74978ad()) {
                j = commentCount;
            } else {
                if (this.f87622b.getAdCommentStruct() != null) {
                    j = 1;
                }
                j += commentCount;
            }
        }
        m75017g(j);
        if (!this.f87622b.isForceHideKeyboard() && !this.f87565G) {
            m75014f(j);
        }
    }

    /* renamed from: T */
    private void m74958T() {
        ImageView imageView = (ImageView) getView().findViewById(R.id.r1);
        TextView textView = (TextView) getView().findViewById(R.id.r5);
        int visibility = this.f87630n.getVisibility();
        int visibility2 = this.f87631o.getVisibility();
        if (C76706a.m134278d(this.f87623c)) {
            visibility = 8;
            visibility2 = 8;
        }
        if (!m74949K() || this.f87628l == null) {
            this.f87630n = imageView;
            ImageView imageView2 = this.f87628l;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            this.f87631o = textView;
            TextView textView2 = this.f87629m;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(8);
            this.f87630n = this.f87628l;
            this.f87631o = this.f87629m;
        }
        this.f87630n.setVisibility(visibility);
        this.f87631o.setVisibility(visibility2);
        this.f87630n.setOnClickListener(new View$OnClickListenerC37028at(this));
        this.f87631o.setOnClickListener(new View$OnClickListenerC37034az(this));
    }

    /* renamed from: U */
    private void m74959U() {
        if (this.f87567I == null && af_() && m74952N() && !C76706a.m134278d(this.f87623c)) {
            this.f87567I = CommentBatchManagementViewModel.C37228a.m75235a(getActivity());
            m74958T();
            this.f87632p.setOnClickListener(new View$OnClickListenerC37039ba(this));
            this.f87633q.setOnClickListener(new View$OnClickListenerC37040bb(this));
            this.f87619ax = new C37041bc(this);
            this.f87567I.mo64781b().observe(this, this.f87619ax);
        }
    }

    /* renamed from: X */
    private void m74962X() {
        if (!m74989ao() || this.f87622b.isCommentClose()) {
            m74963Y();
            return;
        }
        C37201k.m75179a();
        this.f87639w.mo57616a(1, this.f87622b.getAid(), this.f87622b.getInsertCids(), m74964Z(), Integer.valueOf(C33721c.m69041a(this.f87622b.getEventType())));
    }

    /* renamed from: ab */
    private void m74976ab() {
        C36514k kVar;
        if (this.f87594aI != null && (kVar = this.f87639w) != null && kVar.f92286h != null && this.f87639w.f92286h.mData != null) {
            final CommentTranslatorInfoApi.C36991a aVar = this.f87594aI.f87127a;
            final CaptionItemModel b = C50555t.m94783b(this.f87623c);
            if (aVar != null && b != null && C50532ah.m94725a(this.f87623c)) {
                this.f87570L = aVar.f87123c;
                C37067bs bsVar = new C37067bs(C1764a.m5927a(LayoutInflater.from(requireContext()), R.layout.jv, (ViewGroup) getView(), false));
                this.f87636t = bsVar;
                bsVar.mo64565a(new C37067bs.C37069b(aVar.f87124d, aVar.f87122b, aVar.f87121a, aVar.f87123c, new C37067bs.AbstractC37068a() {
                    /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.C3715910 */

                    static {
                        Covode.recordClassIndex(44513);
                    }

                    /* renamed from: c */
                    private static boolean m75122c() {
                        try {
                            return C34719f.C34720a.f82009a.mo61395c();
                        } catch (Exception unused) {
                            return false;
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.C37067bs.AbstractC37068a
                    /* renamed from: a */
                    public final void mo64567a() {
                        C50555t.m94781a(C37157k.this.getContext(), aVar.f87122b, "comments", false, C37157k.this.f87623c);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.C37067bs.AbstractC37068a
                    /* renamed from: b */
                    public final void mo64568b() {
                        C37157k.this.getActivity();
                        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132256h = m75122c();
                        }
                        if (!C58029j.f132256h) {
                            new C23144b(C37157k.this.getActivity()).mo37640e(R.string.dcq).mo37637b();
                            return;
                        }
                        final boolean z = C37157k.this.f87570L;
                        C37157k.this.f87636t.mo64566a(!z);
                        CommentTranslatorInfoApi.C36992b.m74642a().updateTranslationLikeInfo(C37157k.this.f87623c.getAid(), b.getClaSubtitleId(), b.getTranslatorId(), Boolean.valueOf(z)).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new AbstractC88406ae<BaseResponse>() {
                            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.C3715910.C371601 */

                            static {
                                Covode.recordClassIndex(44514);
                            }

                            @Override // p4560f.p4561a.AbstractC88406ae
                            public final void onSubscribe(AbstractC88412b bVar) {
                            }

                            @Override // p4560f.p4561a.AbstractC88406ae
                            public final void onError(Throwable th) {
                                C37157k.this.f87636t.mo64566a(z);
                                new C23144b(C37157k.this.getActivity()).mo37640e(R.string.g5).mo37637b();
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4560f.p4561a.AbstractC88406ae
                            public final /* synthetic */ void onSuccess(BaseResponse baseResponse) {
                                String str;
                                String str2;
                                if (!z) {
                                    C37157k kVar = C37157k.this;
                                    C33744d a = new C33744d().mo59983a("enter_from", "personal_homepage").mo59983a("enter_method", "profile").mo59983a("translator_id", aVar.f87122b);
                                    if (C50555t.m94783b(kVar.f87623c) != null) {
                                        str = C50555t.m94783b(kVar.f87623c).getLanguageName();
                                    } else {
                                        str = "";
                                    }
                                    C33744d a2 = a.mo59983a("translator_lang", str).mo59980a("is_blacklisted", C47038p.m90297a().isOptOut() ? 1 : 0);
                                    if (kVar.f87623c != null) {
                                        C33744d a3 = a2.mo59983a("group_id", C59208ac.m108771e(kVar.f87623c)).mo59983a("author_id", C59208ac.m108758a(kVar.f87623c));
                                        CaptionItemModel b = C50555t.m94783b(kVar.f87623c);
                                        String str3 = null;
                                        if (b != null) {
                                            str2 = b.getLanguageName();
                                        } else {
                                            str2 = null;
                                        }
                                        C33744d a4 = a3.mo59983a("transl_lang", str2);
                                        CaptionItemModel a5 = C50555t.m94779a(kVar.f87623c);
                                        if (a5 != null) {
                                            str3 = a5.getLanguageName();
                                        }
                                        a4.mo59983a("video_lang", str3);
                                    }
                                    C39162r.m79460a("like_transl", a2.f79943a);
                                }
                                C37157k.this.f87636t.mo64566a(!z);
                                C37157k.this.f87570L = !z;
                            }
                        });
                    }
                }));
                this.f87601ae.mo71055b(this.f87636t.f87328a);
                this.f87601ae.mo71054a(this.f87636t.f87328a);
            }
        }
    }

    /* renamed from: av */
    private void m74996av() {
        long j;
        AwemeStatistics statistics;
        C36506e eVar = new C36506e();
        this.f87604ah = eVar;
        eVar.mo67838a(new C36504c());
        this.f87604ah.mo67839a_(this);
        this.f87639w = new C36514k();
        C36510i iVar = new C36510i();
        iVar.f86447g = new AbstractC37140de() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.C371642 */

            static {
                Covode.recordClassIndex(44518);
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37140de
            /* renamed from: b */
            public final void mo64665b(Comment comment) {
                C37157k.this.mo63743a((AbstractC36425k) null, comment);
            }

            @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37140de
            /* renamed from: a */
            public final void mo64664a(Comment comment) {
                if (comment.getUserDigged() == 0) {
                    C37157k.this.mo63749c(comment);
                }
            }
        };
        iVar.f86448h = this.f87622b.isNeedAutoLikeComment();
        iVar.f86449i = this.f87622b.isNeedShowReplyPanel();
        Aweme aweme = this.f87623c;
        if (aweme == null || (statistics = aweme.getStatistics()) == null) {
            j = 0;
        } else {
            j = statistics.getCommentCount();
        }
        iVar.f86446f = j;
        this.f87639w.mo67838a((AbstractC39085b) iVar);
        this.f87560A.mo63739a(this.f87622b.getInsertCids());
        ((C36510i) this.f87639w.f92286h).f86445e = this.f87560A;
        this.f87639w.mo67839a_(this);
        C36509h hVar = new C36509h();
        this.f87605ai = hVar;
        hVar.mo67839a_(this);
        this.f87605ai.mo67838a(new C36507f());
    }

    /* renamed from: az */
    private SpannableStringBuilder m75000az() {
        String string = getString(R.string.aj_);
        String string2 = getString(R.string.aja);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + "\n" + string2);
        int length = string.length() + 1;
        int length2 = string2.length() + length;
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.C371664 */

            static {
                Covode.recordClassIndex(44520);
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                if (C37157k.this.f87623c != null) {
                    C39162r.m79460a("filtered_comment_review_byvideo_ck", new C33744d().mo59981a("comments_number", C37157k.this.f87573O).f79943a);
                    SmartRouter.buildRoute(C37157k.this.getActivity(), "//webview").withParam("url", "https://www.tiktok.com/inapp/filtered_comments/comments?aweme_id=" + C37157k.this.f87623c.getAid() + "&enable_report_optimization=1").withParam("hide_nav_bar", true).open();
                }
            }
        }, length, length2, 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(getContext(), R.color.bx)), length, length2, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 18);
        return spannableStringBuilder;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: h */
    public final void mo63725h() {
        if (getUserVisibleHint()) {
            m74986al();
        }
        if (C36402b.m74101a()) {
            IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 1, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C36274b bVar = this.f87641z;
        if (bVar != null) {
            bVar.f85731b = null;
            bVar.f85734e.mo67840h();
            bVar.f85734e.ck_();
            bVar.f85735f = null;
        }
        m74997aw();
        C33947e eVar = this.f87615at;
        if (eVar != null) {
            eVar.mo60222b(this.f87616au);
        }
        CommentBatchManagementViewModel commentBatchManagementViewModel = this.f87567I;
        if (commentBatchManagementViewModel != null) {
            commentBatchManagementViewModel.mo64781b().removeObserver(this.f87619ax);
            this.f87567I.f87769d.clear();
        }
        if (C36407e.m74108a()) {
            C1870c.m6051a("aweme_comment_fragment_input_comment");
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f87611ao) {
            this.f87611ao = false;
        } else if (mo63708a()) {
            m75022i(true);
        }
        this.f87563E.mo60191a("comment_dialog_state", (Object) 7);
        if (m74987am()) {
            this.f87587aB = System.currentTimeMillis();
        }
        this.f87641z.mo63466a();
        C20766v a = C20761r.m39060a(C34735v.m70965a(C31575b.m65865g().getCurUser().getAvatarThumb()));
        a.f49092E = this.f87578T;
        a.mo34186c();
        this.f87578T.setVisibility(0);
    }

    /* renamed from: z */
    public final boolean mo64732z() {
        boolean z;
        Comment comment;
        Aweme aweme = this.f87623c;
        if (aweme == null) {
            return false;
        }
        boolean a = C37209n.m75199a(aweme, this.f87624d);
        if (!C36181g.m73735a() || !C80580in.m139681a(this.f87623c.getAuthorUid())) {
            z = false;
        } else {
            z = true;
        }
        if ((a || z) && !C39223a.m79589c().mo68606a(3) && m74984aj() && (comment = this.f87624d) != null && comment.getCommentStructType() != 1 && !C76706a.m134278d(this.f87623c)) {
            return true;
        }
        return false;
    }

    /* renamed from: aa */
    private void m74975aa() {
        this.f87599ac.setVisibility(8);
        this.f87600ad.setVisibility(8);
        this.f87626j.setVisibility(8);
        this.f87583Y.setVisibility(8);
        this.f87625e.setVisibility(8);
        if (m74994at()) {
            if (!m74989ao()) {
                this.f87599ac.setVisibility(0);
            } else if (this.f87622b.isCommentClose()) {
                this.f87600ad.setVisibility(0);
            } else {
                this.f87626j.setVisibility(0);
                this.f87583Y.setVisibility(0);
                if (!m74951M()) {
                    this.f87625e.setVisibility(0);
                }
            }
            this.f87584Z.setVisibility(0);
        } else if (!m74989ao()) {
            this.f87599ac.setVisibility(0);
            this.f87584Z.setVisibility(8);
        } else if (this.f87622b.isCommentClose()) {
            this.f87600ad.setVisibility(0);
            this.f87584Z.setVisibility(8);
        } else {
            this.f87626j.setVisibility(0);
            this.f87583Y.setVisibility(0);
            if (!m74951M()) {
                this.f87625e.setVisibility(0);
            }
            this.f87584Z.setVisibility(0);
        }
        if (this.f87565G) {
            this.f87562C.mo64516a();
            this.f87576R.setVisibility(0);
            this.f87625e.setVisibility(0);
        }
        C36274b bVar = this.f87641z;
        if (bVar != null) {
            bVar.mo63466a();
        }
        if (C76706a.m134284j(this.f87623c)) {
            this.f87625e.setVisibility(8);
        }
    }

    /* renamed from: al */
    private void m74986al() {
        Activity j;
        if (!this.f87612ap) {
            if (getActivity() != null) {
                j = getActivity();
            } else {
                j = C17873f.m33102j();
            }
            if (j != null) {
                m74966a(j);
                if (m74965a((Context) j) != null) {
                    ((CommentViewModelImpl) C1181ae.m3881a(m74965a((Context) j), (C1175ad.AbstractC1177b) null).mo3983a(CommentViewModelImpl.class)).f85428a.mo64258a();
                }
                C36141a.C36142a.f85376c = "1";
                this.f87612ap = true;
            } else {
                return;
            }
        }
        if (this.f87627k != null) {
            if (this.f87571M.mo108903a(this.f87623c)) {
                this.f87627k.setVisibility(0);
            } else {
                this.f87627k.setVisibility(8);
            }
        }
        m75022i(true);
        if (C36402b.m74101a()) {
            IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 1, false);
        }
        MentionEditText mentionEditText = this.f87626j;
        if (mentionEditText != null && TextUtils.isEmpty(mentionEditText.getText())) {
            this.f87562C.mo64518a(false, false, false);
        }
        if (m74987am()) {
            this.f87586aA = 0;
            this.f87587aB = System.currentTimeMillis();
            C18129a.m33746a("comment_ad", "othershow", this.f87623c.getAwemeRawAd()).mo28901b();
            C36205a aVar = this.f87638v;
            if (aVar != null) {
                aVar.mo63368d();
            }
        }
    }

    /* renamed from: an */
    private void m74988an() {
        C38255s adCommentStruct;
        this.f87612ap = false;
        AbstractC37793a aVar = this.f87603ag;
        if (aVar != null) {
            aVar.mo65812a();
        }
        if (C37699a.m76259ae(this.f87623c)) {
            this.f87563E.mo60191a("comment_dialog_state", (Object) 5);
        }
        C36141a.C36142a.f85376c = "0";
        if (!(!this.f87609am || this.f87584Z == null || (adCommentStruct = this.f87622b.getAdCommentStruct()) == null)) {
            List e = this.f87638v.mo63369e();
            if ((!C13603b.m24435a((Collection) e) || m74978ad()) && (C13603b.m24435a((Collection) e) || !(e.get(0) instanceof C38255s))) {
                e.add(0, adCommentStruct);
            }
        }
        m75022i(false);
        this.f87584Z.postDelayed(new RunnableC37019ak(this), 120);
        C36274b bVar = this.f87641z;
        if (bVar != null) {
            bVar.mo63508g();
        }
        if (C36402b.m74101a()) {
            IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 0, false);
        }
        if (m74987am()) {
            if (this.f87587aB > 0) {
                this.f87586aA += System.currentTimeMillis() - this.f87587aB;
            }
            this.f87587aB = 0;
            C18129a.m33746a("comment_ad", "close", this.f87623c.getAwemeRawAd()).mo28900b("duration", Long.valueOf(this.f87586aA)).mo28901b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 < 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (android.text.TextUtils.equals(r6, "bubble_desc_click_faker_cid") != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        new com.bytedance.tux.p1721g.C23144b(r9).mo37640e(com.p2082ss.android.ugc.trill.R.string.fa7).mo37637b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        return;
     */
    /* renamed from: as */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m74993as() {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.m74993as():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        C36205a aVar = this.f87638v;
        if (aVar != null) {
            List<Comment> e = aVar.mo63369e();
            if (m75006c(e)) {
                m75017g(1);
                m75004b(new ArrayList<>());
                this.f87640y.mo59512a(e, false);
                C36274b bVar = this.f87641z;
                if (bVar != null) {
                    bVar.mo63467a(0);
                }
            } else if (m74978ad()) {
                if (e == null) {
                    e = new ArrayList<>();
                }
                m75017g(0);
                m74972a(e);
                this.f87640y.mo59512a(e, false);
                C36274b bVar2 = this.f87641z;
                if (bVar2 != null) {
                    bVar2.mo63467a(0);
                }
            } else {
                C36274b bVar3 = this.f87641z;
                if (bVar3 != null) {
                    bVar3.mo63467a(0);
                }
                List<Comment> arrayList = new ArrayList<>();
                m75007d(arrayList);
                m75013e(arrayList);
                if (this.f87639w.f92286h.mData.hasFilteredComments()) {
                    TuxTextView a = C37208m.m75197a(getActivity());
                    a.setText(m75000az());
                    a.setMovementMethod(LinkMovementMethod.getInstance());
                    DmtStatusView dmtStatusView = this.f87583Y;
                    dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(m75001b(a)));
                }
                this.f87640y.mo64578a(arrayList);
                String insertCids = this.f87622b.getInsertCids();
                if (!TextUtils.isEmpty(insertCids) && !TextUtils.equals(insertCids, "bubble_desc_click_faker_cid")) {
                    new C23144b(this).mo37640e(R.string.fa7).mo37637b();
                }
            }
            C37201k.m75180a(0);
        }
    }

    /* renamed from: u */
    public final void mo64728u() {
        if (this.f87625e.getHeight() != 0 && !this.f87618aw) {
            this.f87634r.getLayoutParams().height = this.f87625e.getHeight();
            this.f87618aw = true;
        }
        CommentBatchManagementViewModel commentBatchManagementViewModel = this.f87567I;
        if (commentBatchManagementViewModel != null) {
            commentBatchManagementViewModel.mo64780a().postValue(true);
            if (mo64727t()) {
                C34729o.m70959b(false, this.f87630n);
            }
            this.f87569K.mo63714b(true);
            C34729o.m70956a(false, this.f87625e);
            C34729o.m70956a(true, this.f87631o, this.f87634r);
            mo64726s();
            if (!(this.f87638v == null || this.f87560A == null)) {
                for (String str : C36535m.f86493a.keySet()) {
                    this.f87640y.mo64577a(str);
                }
            }
            C39162r.onEventV3("comment_batch_management_sw");
        }
    }

    /* renamed from: ak */
    private void m74985ak() {
        String tempEnterMethod;
        String insertCids;
        int i;
        String str;
        if (TextUtils.isEmpty(this.f87622b.getTempEnterMethod())) {
            tempEnterMethod = this.f87622b.getEnterMethod();
        } else {
            tempEnterMethod = this.f87622b.getTempEnterMethod();
        }
        String enterFrom = this.f87622b.getEnterFrom();
        Aweme aweme = this.f87623c;
        if (TextUtils.isEmpty(this.f87622b.getInsertCids())) {
            insertCids = null;
        } else {
            insertCids = this.f87622b.getInsertCids();
        }
        String playListType = this.f87622b.getPlayListType();
        String playListIdKey = this.f87622b.getPlayListIdKey();
        String playListId = this.f87622b.getPlayListId();
        String previousPage = this.f87622b.getPreviousPage();
        String fromGroupId = this.f87622b.getFromGroupId();
        this.f87622b.getTabName();
        C59208ac.m108764b(this.f87623c, this.f87622b.getPageType());
        String creationId = this.f87622b.getCreationId();
        Map<String, String> hotPlayerMap = this.f87622b.getHotPlayerMap();
        String searchId = this.f87622b.getSearchId();
        String searchResultId = this.f87622b.getSearchResultId();
        String tagId = this.f87622b.getTagId();
        String parentTagId = this.f87622b.getParentTagId();
        mo64731y();
        if (aweme != null) {
            C33744d dVar = new C33744d();
            dVar.mo59985a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.m95759b().mo86844a(enterFrom, aweme));
            dVar.mo59985a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.m95759b().mo86843a(aweme, "list"));
            dVar.mo59983a("previous_page", previousPage);
            dVar.mo59980a("follow_status", C76598h.m134176a(aweme.getAuthor()));
            C76598h.m134177a(dVar, aweme);
            if (aweme.getStatistics() != null) {
                dVar.mo59983a("outter_comment_cnt", String.valueOf(aweme.getStatistics().getCommentCount()));
            }
            if ("homepage_country".equals(enterFrom) && aweme.getAuthor() != null) {
                dVar.mo59983a("country_name", aweme.getAuthor().getRegion());
            }
            if (!TextUtils.isEmpty(tempEnterMethod)) {
                dVar.mo59983a("enter_method", tempEnterMethod);
            }
            if (!TextUtils.isEmpty(insertCids)) {
                dVar.mo59983a("trigger_comment_id", insertCids);
            }
            if (!TextUtils.isEmpty(playListType)) {
                dVar.mo59983a("playlist_type", playListType);
            }
            if (!TextUtils.isEmpty(playListId)) {
                dVar.mo59983a(playListIdKey, playListId);
            }
            if (!TextUtils.isEmpty(BusinessComponentServiceUtils.getBusinessBridgeService().mo121229a()) && (TextUtils.equals(enterFrom, "homepage_fresh") || TextUtils.equals(enterFrom, "homepage_channel"))) {
                C81469a.m141252a();
            }
            dVar.mo59983a("request_id", C59208ac.m108763b(aweme));
            String str2 = "1";
            if (C41223i.f96336a) {
                dVar.mo59983a("is_fullscreen", str2);
            }
            if (TextUtils.equals("homepage_familiar", enterFrom)) {
                if (C80580in.m139680a(aweme)) {
                    str = "follow";
                } else {
                    str = "unfollow";
                }
                dVar.mo59983a("relation_type", str);
                dVar.mo59983a("video_type", C59208ac.m108777k(aweme));
                dVar.mo59983a("rec_uid", C59208ac.m108778l(aweme));
            }
            if (TextUtils.equals(enterFrom, "general_search")) {
                if (C42456h.f98974a) {
                    if (aweme.getVideo() == null || aweme.getVideo().getVideoTag() == null) {
                        dVar.mo59983a("video_tag", "");
                    } else {
                        dVar.mo59983a("video_tag", aweme.getVideo().getVideoTag().getTitle());
                    }
                }
                if (!C41223i.f96336a) {
                    str2 = "0";
                }
                dVar.mo59983a("is_fullscreen", str2);
                dVar.mo59983a("rank", C59208ac.m108764b(aweme, 9));
                dVar.mo59983a("enter_from", enterFrom);
                dVar.mo59983a("search_id", searchId);
                dVar.mo59983a("search_result_id", searchResultId);
            }
            dVar.mo59981a("position", C81079v.m140776O().mo123891n());
            dVar.mo59983a("impr_type", C59208ac.m108776j(aweme));
            if (!TextUtils.isEmpty(aweme.getMixId())) {
                dVar.mo59983a("compilation_id", aweme.getMixId());
            }
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                dVar.mo59983a("playlist_id", playListId);
            }
            dVar.mo59986a(C50560y.m94792b(previousPage, fromGroupId));
            int i2 = 2;
            if (C80580in.m139687c()) {
                i = 2;
            } else {
                i = 1;
            }
            dVar.mo59980a("is_child_mode", i);
            dVar.mo59978a(aweme, "click_comment_button", enterFrom);
            dVar.mo59983a("tag_id", tagId);
            dVar.mo59983a("parent_tag_id", parentTagId);
            dVar.mo59982a("is_highlighted", Boolean.valueOf(aweme.isHighlighted()));
            dVar.mo59980a("rank_index", aweme.getOriginalPos());
            C80409eu.m139390a(dVar, aweme.getAuthor());
            C79900c.m138665a(dVar, aweme, enterFrom);
            if (TextUtils.isEmpty(aweme.partN)) {
                if (aweme.getVideo() == null || !aweme.getVideo().isLongVideo()) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            }
            dVar.mo59980a("is_long", i2);
            if (C59208ac.m108762a(enterFrom)) {
                dVar.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(aweme)));
            } else {
                if (!TextUtils.isEmpty(creationId)) {
                    dVar.mo59983a("creation_id", creationId);
                }
                if (TextUtils.equals(enterFrom, "homepage_fresh_topic")) {
                    dVar.mo59983a("enter_from", enterFrom);
                    if (!TextUtils.isEmpty(aweme.getHotSpot())) {
                        dVar.mo59983a("topic_name", aweme.getHotSpot());
                    } else if (aweme.getHotListStruct() != null && !TextUtils.isEmpty(aweme.getHotListStruct().getTitile())) {
                        dVar.mo59983a("topic_name", aweme.getHotListStruct().getTitile());
                    }
                } else if (hotPlayerMap != null) {
                    dVar.mo59983a("enter_from", hotPlayerMap.get("enter_from"));
                    dVar.mo59983a("enter_method", hotPlayerMap.get("enter_method"));
                    dVar.mo59983a("trending_topic", hotPlayerMap.get("trending_topic"));
                    dVar.mo59983a("order", hotPlayerMap.get("order"));
                    dVar.mo59983a("is_rising_topic", hotPlayerMap.get("is_rising_topic"));
                    dVar.mo59983a("is_fullscreen", hotPlayerMap.get("is_fullscreen"));
                }
            }
            C39162r.m79460a("click_comment_button", dVar.f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        C2541b.m7438b(UGCMonitor.EVENT_COMMENT, "info", 1);
        this.f87640y.mo59515b();
        C36274b bVar = this.f87641z;
        if (bVar != null) {
            bVar.mo63467a(1);
        }
        this.f87563E.mo60191a("comment_ad_view_state", (Object) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: d */
    public final String mo63724d() {
        String J = m74948J();
        if (!TextUtils.isEmpty(J)) {
            return J;
        }
        Resources resources = C17867d.m33078a().getResources();
        long j = this.f87592aG;
        return resources.getQuantityString(R.plurals.ae, (int) j, C53437b.m98615a(j));
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63717a(AbstractC36419e eVar) {
        this.f87569K = eVar;
    }

    @AbstractC90264r
    public void onAfterLoginInEvent(C33491f fVar) {
        ViewGroup viewGroup = this.f87625e;
    }

    /* renamed from: j */
    private void m75023j(boolean z) {
        AbstractC36419e eVar = this.f87569K;
        if (eVar != null) {
            eVar.mo63711a(z);
        }
    }

    /* renamed from: a */
    public final void mo64694a(long j) {
        m75017g(this.f87573O + j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Object mo64704b(long j) {
        m75021h(j);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Void mo64708c(long j) {
        m75012e(j);
        return null;
    }

    /* renamed from: a */
    private static void m74966a(Activity activity) {
        C49676d dVar = new C49676d(1);
        dVar.f114335d = activity.hashCode();
        AbstractC81915c.m141874a(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        this.f87640y.mo59522c(exc);
    }

    @AbstractC90264r
    public void onAwesomeSplashEvent(C18017a aVar) {
        if (aVar.f42891a != 4) {
            m75023j(true);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C34572c cVar) {
        C36205a aVar;
        if (this.f87625e != null && (aVar = this.f87638v) != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        if (z) {
            m74988an();
        } else {
            m74986al();
        }
        super.onHiddenChanged(z);
    }

    /* renamed from: a */
    static ActivityC0945e m74965a(Context context) {
        while (context != null) {
            if (context instanceof ActivityC0945e) {
                return (ActivityC0945e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: b */
    private static C13624l.EnumC13625a m75002b(Context context) {
        if (C58029j.f132252d != C13624l.EnumC13625a.UNKNOWN && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132252d;
        }
        C13624l.EnumC13625a c = C13624l.m24487c(context);
        C58029j.f132252d = c;
        return c;
    }

    /* renamed from: c */
    private static boolean m75006c(List<Comment> list) {
        if (C13603b.m24435a((Collection) list) || !(list.get(0) instanceof C38255s)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m75014f(long j) {
        if (C36223d.m73822a().f85543a) {
            C1731i.m5640b(new CallableC37186z(this, j), C39162r.m79452a());
        } else {
            m75012e(j);
        }
    }

    /* renamed from: h */
    private static TextView m75020h(String str) {
        Context a = C17867d.m33078a();
        int c = C0643b.m2378c(a, R.color.qi);
        TuxTextView a2 = C37208m.m75197a(a);
        a2.setTextColor(c);
        a2.setText(str);
        return a2;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36415a
    /* renamed from: d */
    public final void mo63700d(Exception exc) {
        this.f87640y.mo63700d(exc);
        if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 3002042) {
            this.f87622b.setCommentClose(true);
            m75003b(this.f87622b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: g */
    public final void mo64433g(Comment comment) {
        if (comment != null && comment.getFakeGiftId() != 0) {
            m74974a(true, comment, 0);
        }
    }

    @AbstractC90264r
    public void onAntiCrawlerEvent(C34569a aVar) {
        String str = aVar.f81610a;
        if (str == null) {
            return;
        }
        if (str.contains("/aweme/v1/comment/list/?") || str.contains("/aweme/v2/comment/list/?")) {
            EventBus.m156962a().mo145397d(aVar);
            mo64729v();
        }
    }

    @AbstractC90264r
    public void onEvent(C36388d dVar) {
        if (this.f87584Z != null && TextUtils.equals(dVar.f86065a, this.f87622b.getAid())) {
            this.f87584Z.mo4413b(0);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C36179e.m73732a("CommentListFragment onSaveInstanceState");
        bundle.putBoolean("should_hide", true);
        bundle.putSerializable("page_param", this.f87622b);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (isAdded()) {
            if (z && this.f87590aE) {
                this.f87590aE = false;
                m75014f(this.f87591aF);
            }
            m75022i(z);
        }
    }

    /* renamed from: b */
    private void m75004b(List<Comment> list) {
        Aweme aweme = this.f87623c;
        if (aweme != null) {
            if (!aweme.isAd() || this.f87622b.getAdCommentStruct() == null) {
                List e = this.f87638v.mo63369e();
                if (m75006c(e)) {
                    list.addAll(0, e);
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m75005c(C36500h hVar) {
        if (TextUtils.equals(hVar.getAid(), this.f87622b.getAid()) && hVar.isCommentClose() == this.f87622b.isCommentClose() && hVar.isCommentLimited() == this.f87622b.isCommentLimited() && hVar.isEnableComment() == this.f87622b.isEnableComment() && !m75010d(hVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m75010d(C36500h hVar) {
        Aweme aweme;
        boolean z;
        if (hVar == null || hVar.getAdCommentStruct() == null) {
            aweme = null;
        } else {
            aweme = AwemeService.m70060b().mo60690d(hVar.getAdCommentStruct().getAid());
        }
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null || !aweme.getAwemeRawAd().isCommentAreaSwitch()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f87609am != z) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private int m75011e(String str) {
        C37221v vVar = this.f87560A;
        if (!C13603b.m24435a((Collection) vVar.f87756b)) {
            for (Comment comment : vVar.f87756b) {
                if (TextUtils.equals(comment.getCid(), str)) {
                    return (int) (comment.getReplyCommentTotal() + 1);
                }
            }
        }
        return 1;
    }

    /* renamed from: f */
    private boolean m75015f(String str) {
        C36205a aVar = this.f87638v;
        if (aVar != null) {
            List e = aVar.mo63369e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                Comment comment = (Comment) e.get(i);
                if (TextUtils.equals(comment.getCid(), str)) {
                    if (comment.getAliasAweme() != null) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m75018g(boolean z) {
        Aweme aweme;
        this.f87573O = 0;
        m74962X();
        m74975aa();
        if (!(this.f87594aI == null || (aweme = this.f87623c) == null || C50555t.m94783b(aweme) == null)) {
            this.f87594aI.mo64492a(this.f87623c);
        }
        if (z) {
            m74991aq();
        }
    }

    /* renamed from: h */
    private long m75019h(boolean z) {
        long d = this.f87639w.mo63984d();
        if (!this.f87609am || m74978ad()) {
            return d;
        }
        List e = this.f87638v.mo63369e();
        if (!C13603b.m24435a((Collection) e) && (z || !(e.get(0) instanceof C38255s))) {
            d++;
        }
        Aweme aweme = this.f87623c;
        if (aweme == null || aweme.getAdCommentStruct() == null || d <= 0) {
            return d;
        }
        return d + 1;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f87622b = (C36500h) arguments.getSerializable("id");
            this.f87589aD = getArguments().getBoolean("key_show_title");
        }
        this.f87641z = new C36274b(this, hashCode(), this);
        if (C47037o.m90296a()) {
            this.f87594aI = new C36993b(requireContext(), this);
        }
    }

    @AbstractC90264r
    public void onEvent(C37830a aVar) {
        if (aVar != null) {
            if (aVar.f89322a == 1) {
                mo64681A();
            } else if (this.f87596aK) {
                this.f87596aK = false;
                mo64682B();
            }
        }
    }

    /* renamed from: a */
    private void m74967a(View view) {
        View a;
        MethodCollector.m26663i(9018);
        if (view == null) {
            MethodCollector.m26664o(9018);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.be1);
        if (frameLayout == null) {
            MethodCollector.m26664o(9018);
            return;
        }
        frameLayout.removeAllViews();
        if (C63134c.f143478d == null || C63134c.m114157a() == null) {
            MethodCollector.m26664o(9018);
            return;
        }
        if (!m74994at() && (a = C63134c.m114157a().mo101445a(requireContext(), this.f87623c, this.f87622b.getEventType())) != null) {
            frameLayout.addView(a);
            ViewGroup.LayoutParams layoutParams = this.f87630n.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 8388613;
                layoutParams2.setMarginEnd(C34728n.m70946a(44.0d));
                this.f87630n.setLayoutParams(layoutParams2);
            }
        }
        MethodCollector.m26664o(9018);
    }

    /* renamed from: d */
    private CommentLikeUsersStruct m75007d(List<Comment> list) {
        if (!m74956R() || this.f87623c == null) {
            return null;
        }
        CommentLikeUsersStruct commentLikeUsersStruct = new CommentLikeUsersStruct();
        commentLikeUsersStruct.setCommentType(220);
        commentLikeUsersStruct.setDialogHeight(this.f87564F.getHeight());
        commentLikeUsersStruct.setEventType(this.f87622b.getEventType());
        commentLikeUsersStruct.setLikeUsers(this.f87622b.getLikeUsers());
        commentLikeUsersStruct.setLikeUsersCount(m74957S());
        commentLikeUsersStruct.setAweme(this.f87623c);
        if (list != null) {
            list.add(0, commentLikeUsersStruct);
        }
        return commentLikeUsersStruct;
    }

    /* renamed from: g */
    private String m75016g(String str) {
        C37221v vVar;
        List<CommentReplyListItem> list;
        if (!(str == null || (vVar = this.f87560A) == null || C13603b.m24435a((Collection) vVar.f87755a) || (list = this.f87560A.f87755a) == null || C13603b.m24435a((Collection) list))) {
            for (CommentReplyListItem commentReplyListItem : list) {
                if (str.equals(commentReplyListItem.mComment.getCid())) {
                    return commentReplyListItem.mComment.getUser().getPredictedAgeGroup();
                }
                if (commentReplyListItem.mReplyComments != null) {
                    for (Comment comment : commentReplyListItem.mReplyComments) {
                        if (str.equals(comment.getCid())) {
                            return commentReplyListItem.mComment.getUser().getPredictedAgeGroup();
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    private void m75022i(boolean z) {
        C36205a aVar;
        if (z) {
            if (this.f87613ar == 0) {
                if (this.f87617av) {
                    C1731i.m5640b(new CallableC37016ah(this), C40780g.m82246c());
                } else {
                    m74985ak();
                }
                this.f87613ar = System.currentTimeMillis();
            }
        } else if (this.f87613ar != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f87613ar;
            this.f87613ar = 0;
            if (currentTimeMillis >= 0) {
                if (this.f87617av) {
                    C1731i.m5640b(new CallableC37018aj(this, currentTimeMillis), C40780g.m82246c());
                } else {
                    m75021h(currentTimeMillis);
                }
            } else {
                return;
            }
        }
        C36205a aVar2 = this.f87638v;
        if (aVar2 != null) {
            aVar2.mo63362a(z);
        }
        if (f87559aq && (aVar = this.f87638v) != null && !C13603b.m24435a((Collection) aVar.mo63369e())) {
            this.f87584Z.mo4413b(0);
        }
        f87559aq = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: f */
    public final void mo64432f(boolean z) {
        String str;
        if (z) {
            IForwardStatisticsService b = ForwardStatisticsServiceImpl.m95759b();
            String enterFrom = this.f87622b.getEnterFrom();
            Aweme aweme = this.f87623c;
            if (this.f87624d != null) {
                str = "click_reply";
            } else {
                str = "click_original";
            }
            b.mo86846a(enterFrom, aweme, "list", str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m74961W();
        this.f87626j.setKeyListener(null);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        this.f87637u = wrapLinearLayoutManager;
        this.f87584Z.setLayoutManager(wrapLinearLayoutManager);
        m74996av();
        if (bundle != null) {
            boolean z = bundle.getBoolean("should_hide", false);
            this.f87611ao = z;
            if (z) {
                m75023j(false);
            }
            Serializable serializable = bundle.getSerializable("page_param");
            if (serializable instanceof C36500h) {
                this.f87622b = (C36500h) serializable;
                this.f87623c = AwemeService.m70060b().mo60684b(this.f87622b.getAid());
            }
        }
        m75009d(true);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEnterTextEvent(C36391f fVar) {
        if (fVar.f86069a != null && !TextUtils.isEmpty(fVar.f86070b)) {
            Comment comment = fVar.f86069a;
            if (!C31575b.m65865g().isLogin()) {
                C58957c.m108320a(getActivity(), this.f87622b.getEventType(), "reply_comment", new C80222ap().mo123649a("group_id", this.f87622b.getAid()).mo123649a("log_pb", C59208ac.m108768c(this.f87622b.getAid())).f179700a, new C37021am(this, comment));
            } else if (!m74981ag()) {
                mo64705b(comment, fVar.f86070b);
            }
        }
    }

    @AbstractC90264r
    public void onEvent(C49668ac acVar) {
        this.f87596aK = mo63708a();
        m75023j(true);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onExpandingCachedCommentReplies(C36385a aVar) {
        int intValue;
        int intValue2;
        if (aVar.f86057a == null) {
            intValue = -1;
        } else {
            intValue = aVar.f86057a.intValue();
        }
        if (aVar.f86058b == null) {
            intValue2 = 1;
        } else {
            intValue2 = aVar.f86058b.intValue();
        }
        if (intValue > 0 && intValue < this.f87638v.getItemCount() && getContext() != null) {
            C371653 r4 = new C1481r(getContext()) {
                /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.C371653 */

                static {
                    Covode.recordClassIndex(44519);
                }

                @Override // androidx.recyclerview.widget.C1481r
                /* renamed from: a */
                public final float mo4862a(DisplayMetrics displayMetrics) {
                    return 120.0f / ((float) displayMetrics.densityDpi);
                }

                @Override // androidx.recyclerview.widget.C1481r
                /* renamed from: a */
                public final int mo5011a(int i, int i2, int i3, int i4, int i5) {
                    return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
                }
            };
            r4.f4515g = intValue;
            if (intValue2 <= 5) {
                this.f87584Z.postDelayed(new RunnableC37022an(this, r4), (long) (intValue2 * 30));
                return;
            }
            this.f87584Z.mo4413b(intValue - 5);
            this.f87637u.mo4695a(r4);
        }
    }

    /* renamed from: a */
    private void m74969a(CommentPrompt commentPrompt) {
        if (commentPrompt.getType() > 0) {
            this.f87602af.setVisibility(0);
            this.f87602af.setText(commentPrompt.getContent());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f87597aa.getLayoutParams();
            layoutParams.setMargins(0, C34728n.m70946a(12.0d), 0, C34728n.m70946a(4.0d));
            this.f87597aa.setLayoutParams(layoutParams);
            return;
        }
        this.f87602af.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f87597aa.getLayoutParams();
        layoutParams2.setMargins(0, C34728n.m70946a(12.0d), 0, C34728n.m70946a(12.0d));
        this.f87597aa.setLayoutParams(layoutParams2);
    }

    /* renamed from: b */
    private View m75001b(View view) {
        int i;
        MethodCollector.m26663i(9248);
        if (!m74983ai()) {
            MethodCollector.m26664o(9248);
            return view;
        }
        Context a = C17867d.m33078a();
        LinearLayout linearLayout = new LinearLayout(a);
        linearLayout.setBackgroundColor(C0643b.m2378c(a, R.color.v));
        TuxTextView tuxTextView = new TuxTextView(a);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColor(C0643b.m2378c(a, R.color.c4));
        if (C80580in.m139681a(this.f87622b.getAuthorUid())) {
            i = R.string.h5q;
        } else {
            i = R.string.h5p;
        }
        tuxTextView.setText(a.getText(i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) C13628n.m24520b(a, 12.0f);
        layoutParams.bottomMargin = (int) C13628n.m24520b(a, 12.0f);
        layoutParams.leftMargin = (int) C13628n.m24520b(a, 16.0f);
        layoutParams.rightMargin = (int) C13628n.m24520b(a, 16.0f);
        linearLayout.addView(tuxTextView, layoutParams);
        FrameLayout frameLayout = new FrameLayout(a);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(view, layoutParams2);
        MethodCollector.m26664o(9248);
        return frameLayout;
    }

    /* renamed from: d */
    private void m75008d(String str) {
        View findViewById;
        if (getView() != null && (findViewById = getView().findViewById(R.id.an9)) != null) {
            Aweme b = AwemeService.m70060b().mo60684b(str);
            List<AnchorCommonStruct> a = C34671a.f81927a.mo61326a(b);
            if (a == null || a.size() <= 0 || m74994at()) {
                findViewById.setVisibility(8);
                return;
            }
            findViewById.setVisibility(0);
            C37213q.m75205a(C48027ac.C48028a.f111257a.mo80055a(this.f87622b.getRequestId()), this.f87622b.getEnterFrom(), findViewById, b, this.f87564F);
        }
    }

    /* renamed from: e */
    private void m75013e(List<Comment> list) {
        if (m74994at() && this.f87623c != null) {
            C36305b bVar = new C36305b();
            bVar.authorUid = this.f87622b.getAuthorUid();
            bVar.awemeId = this.f87623c.getAid();
            bVar.enterFrom = this.f87622b.getEnterFrom();
            bVar.eventType = this.f87622b.getEventType();
            bVar.mPlayListId = this.f87622b.getPlayListId();
            bVar.mPlayListType = this.f87622b.getPlayListType();
            bVar.requestId = this.f87622b.getRequestId();
            bVar.mPlayListIdKey = this.f87622b.getPlayListIdKey();
            bVar.pageType = this.f87622b.getPageType();
            bVar.tabName = this.f87622b.getTabName();
            bVar.aweme = this.f87623c;
            C36317c cVar = new C36317c(this.f87623c, bVar);
            cVar.setCommentType(221);
            cVar.setAwemeId(this.f87623c.getAid());
            if (TextUtils.isEmpty(this.f87623c.getDesc())) {
                cVar.setText("");
            } else {
                cVar.setText(this.f87623c.getDesc());
            }
            cVar.setTextExtra(this.f87623c.getTextExtra());
            cVar.setCreateTime((int) this.f87623c.getCreateTime());
            cVar.setUser(this.f87623c.getAuthor());
            list.add(0, cVar);
        }
    }

    /* renamed from: g */
    private void m75017g(long j) {
        this.f87573O = j;
        if (m74978ad()) {
            j++;
        }
        if (j == 0) {
            this.f87597aa.setText(C17867d.m33078a().getString(R.string.nq));
            if (this.f87624d != null) {
                m74991aq();
            }
        } else {
            String J = m74948J();
            if (!TextUtils.isEmpty(J)) {
                this.f87597aa.setText(J);
            } else {
                this.f87597aa.setText(new C17191a.C17192a().mo27177a(C17867d.m33078a().getResources().getQuantityString(R.plurals.ae, (int) j, C53437b.m98615a(j))).f40973a);
            }
        }
        this.f87592aG = j;
        this.f87597aa.post(new RunnableC37009aa(this, this.f87573O));
        AbstractC36419e eVar = this.f87569K;
        if (eVar != null) {
            eVar.mo63710a(this);
        }
    }

    /* renamed from: h */
    private void m75021h(long j) {
        String str;
        String str2;
        String str3;
        User user;
        String str4;
        String str5;
        String enterFrom = this.f87622b.getEnterFrom();
        String enterMethod = this.f87622b.getEnterMethod();
        Aweme aweme = this.f87623c;
        boolean isHotPlayer = this.f87622b.isHotPlayer();
        C89219l.m154721d(enterFrom, "");
        C89219l.m154721d(enterMethod, "");
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        C33744d a = C36540c.m74377a(enterFrom, str).mo59981a("duration", j);
        if (isHotPlayer) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        C33744d a2 = a.mo59983a("is_fullscreen", str2);
        if (TextUtils.equals(enterFrom, "homepage_fresh_topic")) {
            a2.mo59983a("enter_from", "homepage_fresh_topic");
        } else {
            if (isHotPlayer) {
                str3 = "trending_page";
            } else {
                str3 = enterFrom;
            }
            a2.mo59983a("enter_from", str3);
        }
        C33744d a3 = a2.mo59983a("enter_method", enterMethod);
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        C33744d a4 = a3.mo59980a("follow_status", C76598h.m134176a(user));
        if (C76706a.m134278d(aweme)) {
            str4 = "story";
        } else {
            str4 = UGCMonitor.TYPE_POST;
        }
        C33744d a5 = a4.mo59983a("story_type", str4);
        if (aweme == null || (str5 = C76706a.m134276b(aweme)) == null) {
            str5 = "";
        }
        C33744d a6 = a5.mo59983a("story_collection_id", str5);
        C89219l.m154716b(a6, "");
        C79900c.m138665a(a6, aweme, enterFrom);
        C39162r.m79460a("close_comment", a2.f79943a);
        C39162r.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName("comment_page").setExtValueString(str).setValue(String.valueOf(j)));
        C17867d.m33078a();
        C39162r.m79454a("close_comment", "click_shadow", 0);
        C2541b.m7439c(UGCMonitor.EVENT_COMMENT, "info");
        if (!this.f87639w.f86460a) {
            C37201k.m75181a(UGCMonitor.EVENT_COMMENT, 2, this.f87622b.getEnterFrom(), true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo64709c(String str) {
        if (!this.f87571M.mo108903a(this.f87623c) || this.f87641z == null || this.f87626j == null) {
            new C23144b(this).mo37640e(R.string.h93).mo37637b();
        } else if (C36409f.m74109a()) {
            ActivityC0945e activity = getActivity();
            C36274b bVar = this.f87641z;
            Aweme aweme = this.f87623c;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bVar, "");
            C36977j jVar = new C36977j();
            C89219l.m154721d(bVar, "");
            jVar.f87080a = bVar;
            jVar.f87083d = aweme;
            C23226a.C23227a a = new C23226a.C23227a().mo37817a(jVar).mo37812a(1);
            double b = (double) C13628n.m24521b(activity);
            Double.isNaN(b);
            C23226a aVar = a.mo37821b((int) (b * 0.66d)).mo37822b(false).mo37823c().mo37819a(false).mo37815a(new C36977j.C36978a.DialogInterface$OnDismissListenerC36979a(aweme)).f55057a;
            jVar.f87082c = aVar;
            aVar.show(activity.getSupportFragmentManager(), "VGSupportPanelFragment");
        } else {
            this.f87641z.mo63479a(this.f87626j.getHint(), str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    @AbstractC90264r
    public void onDiggUpdateEvent(C49672ag agVar) {
        AbstractC39060f fVar;
        AbstractC39060f fVar2;
        if (agVar.f114315a == 13 && (agVar.f114316b instanceof String)) {
            Object obj = agVar.f114316b;
            if (this.f87621az.contains(obj)) {
                this.f87621az.remove(obj);
                if (m74957S() < 1 && (fVar2 = (AbstractC39060f) this.f87640y.mo64572a()) != null && fVar2.mo63369e() != null) {
                    Iterator it = fVar2.mo63369e().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Comment comment = (Comment) it.next();
                        if (comment.getCommentType() == 220) {
                            fVar2.mo63369e().remove(comment);
                            break;
                        }
                    }
                    fVar2.notifyDataSetChanged();
                    return;
                }
                return;
            }
            this.f87621az.add(obj);
            C37074bt btVar = this.f87640y;
            CommentLikeUsersStruct d = m75007d((List<Comment>) null);
            if (d != null && (fVar = (AbstractC39060f) btVar.mo64572a()) != null && fVar.mo63369e() != null) {
                List e = fVar.mo63369e();
                int i = 0;
                while (true) {
                    if (i >= e.size() || ((Comment) e.get(i)).getCommentType() == 220) {
                        break;
                    } else if (((Comment) e.get(i)).getCommentType() == 221) {
                        e.add(i, d);
                        break;
                    } else if (((Comment) e.get(i)).getCommentType() == 1) {
                        e.add(i, d);
                        break;
                    } else {
                        i++;
                    }
                }
                fVar.notifyDataSetChanged();
            }
        }
    }

    @AbstractC90264r
    public void onEvent(C56257j jVar) {
        String quantityString;
        if (TextUtils.equals(UGCMonitor.EVENT_COMMENT, jVar.f128321d)) {
            int i = jVar.f128327j;
            String displayName = jVar.f128318a.getDisplayName();
            if (displayName.length() != 0) {
                if (displayName.length() >= 50) {
                    displayName = displayName.substring(0, 50) + "...";
                }
                if (i == 1) {
                    quantityString = getResources().getString(R.string.c_v, displayName);
                } else {
                    int i2 = i - 1;
                    quantityString = getResources().getQuantityString(R.plurals.cx, i2, displayName, Integer.valueOf(i2));
                }
                new C23144b(this).mo37635a(quantityString).mo37637b();
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onUserBlockedEvent(C63494a aVar) {
        String uid;
        C37221v vVar;
        C37074bt btVar;
        User user = aVar.f144112a;
        if (!(user == null || (uid = user.getUid()) == null || "".equals(uid) || (vVar = this.f87560A) == null || vVar.f87755a == null)) {
            C37221v vVar2 = this.f87560A;
            if (vVar2 != null && !C13603b.m24435a((Collection) vVar2.f87755a) && !"".equals(uid)) {
                int i = 0;
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                for (CommentReplyListItem commentReplyListItem : this.f87560A.f87755a) {
                    Comment comment = commentReplyListItem.mComment;
                    if (!(comment == null || comment.getUser() == null)) {
                        if (uid.equals(comment.getUser().getUid())) {
                            hashSet.add(comment.getCid());
                            i = (int) (((long) i) + comment.getReplyCommentTotal() + 1);
                            hashMap.put(comment.getCid(), comment);
                        } else if (!C13603b.m24435a((Collection) commentReplyListItem.mReplyComments)) {
                            for (Comment comment2 : commentReplyListItem.mReplyComments) {
                                if (comment2.getUser() != null && uid.equals(comment2.getUser().getUid())) {
                                    hashSet.add(comment2.getCid());
                                    hashMap.put(comment2.getCid(), comment2);
                                    i++;
                                    C36520p.m74325a(comment.getCid(), -1);
                                }
                            }
                        }
                    }
                }
                if (hashMap.size() > 0 && i > 0 && !C13603b.m24435a((Collection) hashSet) && (btVar = this.f87640y) != null) {
                    btVar.mo64579a(hashSet, hashMap);
                    mo64694a((long) (-i));
                }
            }
            if (TextUtils.equals(uid, m74960V())) {
                this.f87640y.f87347d = null;
            }
        }
    }

    /* renamed from: b */
    private void m75003b(C36500h hVar) {
        boolean c = m75005c(hVar);
        this.f87622b = hVar;
        this.f87565G = C39223a.m79589c().mo68606a(3);
        C36274b bVar = this.f87641z;
        if (bVar != null && c) {
            bVar.mo63466a();
        }
        m74953O();
        this.f87641z.mo63497b(this.f87565G);
        m75008d(this.f87622b.getAid());
        if (c || this.f87584Z.getChildCount() == 0 || this.f87609am) {
            m74998ax();
            C37221v vVar = this.f87560A;
            if (vVar != null) {
                vVar.mo63742c();
                this.f87640y.mo59525f();
            }
            m75009d(c);
            m74955Q();
            m74961W();
            m74969a(new CommentPrompt());
            return;
        }
        if (this.f87622b.isForceRefresh()) {
            m74962X();
        }
        m74975aa();
        m74961W();
        if (TextUtils.equals(this.f87622b.getInsertCids(), "bubble_desc_click_faker_cid")) {
            this.f87622b.setInsertCids("", false, false);
            this.f87584Z.mo4413b(0);
        }
    }

    /* renamed from: d */
    private void m75009d(boolean z) {
        if (C36223d.m73822a().f85546d) {
            this.f87638v = new C36205a(this, this.f87622b, this.f87584Z);
        } else {
            this.f87638v = new C36205a(this, this.f87622b);
        }
        this.f87638v.mo62377b_(new ArrayList());
        this.f87638v.f85507c = this.f87623c;
        this.f87638v.f85506b = this.f87622b.getCommentTag();
        this.f87638v.mo67813a((AbstractC39063h.AbstractC39067a) this);
        this.f87638v.f85508d = this.f87622b.getRequestId();
        this.f87638v.mo67820g(C0643b.m2378c(C17867d.m33078a(), R.color.c5));
        this.f87638v.f85509e = this.f87560A;
        TextView h = m75020h(m74999ay());
        DmtStatusView dmtStatusView = this.f87583Y;
        dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(m75001b(h)));
        C36274b bVar = this.f87641z;
        if (bVar != null) {
            bVar.mo63514m();
        }
        C41893a aVar = new C41893a(this.f87638v);
        this.f87601ae = aVar;
        this.f87584Z.setAdapter(aVar);
        m74977ac();
        this.f87638v.f85512h = this.f87563E;
        this.f87640y.f87344a = this.f87622b.getAid();
        if (z) {
            this.f87640y.f87347d = null;
        }
        m75018g(z);
        if (z || this.f87573O != 0) {
            m74950L();
        }
    }

    /* renamed from: e */
    private void m75012e(long j) {
        C36274b bVar;
        MentionEditText mentionEditText;
        boolean z = true;
        if (!getUserVisibleHint()) {
            this.f87590aE = true;
            this.f87591aF = j;
        } else if (!TextUtils.equals("click_comment_chain", this.f87622b.getEventType()) && !TextUtils.equals("click_comment_bubble", this.f87622b.getEventType()) && !TextUtils.equals("collection_comment", this.f87622b.getEventType()) && !m74951M() && !C76706a.m134284j(this.f87623c)) {
            if (m74990ap() && this.f87571M.mo108903a(this.f87623c)) {
                boolean equals = this.f87622b.getEnterMethod().equals("click_video_gift_stripe");
                if (equals && this.f87571M.mo108903a(this.f87623c) && (bVar = this.f87641z) != null && (mentionEditText = this.f87626j) != null) {
                    bVar.mo63479a(mentionEditText.getHint(), "click_video_gift_stripe");
                }
                if (j > 0) {
                    Aweme aweme = this.f87623c;
                    TuxIconView tuxIconView = this.f87627k;
                    if (tuxIconView != null && tuxIconView.getVisibility() == 0 && !this.f87571M.mo108908f() && getActivity() != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC37024ap(this, aweme, equals));
                        this.f87571M.mo108909g();
                    }
                }
                if (equals) {
                    return;
                }
            }
            if (j != 0 || !m74990ap()) {
                z = false;
            }
            if (z) {
                C36274b bVar2 = this.f87641z;
                if (bVar2 != null && !bVar2.mo63505e()) {
                    this.f87641z.mo63481a(this.f87626j.getHint(), false);
                }
                C39162r.m79460a("keyboard_open", new C33744d().mo59983a("keyboard_open", "1").mo59981a("comment_cnt", j).f79943a);
                return;
            }
            C39162r.m79460a("keyboard_open", new C33744d().mo59983a("keyboard_open", "0").mo59981a("comment_cnt", j).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a
    /* renamed from: c */
    public final void mo63749c(Comment comment) {
        CharSequence charSequence;
        String str;
        getActivity();
        if (!m75024w()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
        } else if (!C31575b.m65865g().isLogin()) {
            C58957c.m108322a(this, this.f87622b.getEventType(), "like_comment");
        } else if (comment != null) {
            if (comment.getUserDigged() == 0) {
                charSequence = "1";
            } else {
                charSequence = "2";
            }
            C36509h hVar = this.f87605ai;
            if (hVar != null && hVar.mo67841i()) {
                this.f87605ai.mo57616a(comment.getCid(), comment.getAwemeId(), charSequence, this.f87622b.getCommentTag());
                ((C36507f) this.f87605ai.f92286h).f86439e = comment;
            }
            if (comment.getUser() != null) {
                this.f87608al = comment.getUser().getUid();
            }
            this.f87607ak = comment.getCid();
            boolean f = m75015f(comment.getCid());
            boolean equals = TextUtils.equals(Comment.getAuthorUid(comment), this.f87623c.getAuthorUid());
            if (TextUtils.equals("1", charSequence)) {
                String eventType = this.f87622b.getEventType();
                String valueOf = String.valueOf(comment.getLabelType());
                String str2 = this.f87607ak;
                String aid = this.f87622b.getAid();
                String authorUid = Comment.getAuthorUid(comment);
                int i = 1 ^ (equals ? 1 : 0);
                String newsId = this.f87622b.getNewsId();
                String predictedAgeGroup = C31575b.m65865g().getCurUser().getPredictedAgeGroup();
                String predictedAgeGroup2 = comment.getUser().getPredictedAgeGroup();
                if ("1".equals(valueOf)) {
                    str = "author";
                } else if ("2".equals(valueOf)) {
                    str = "following";
                } else {
                    str = "common";
                }
                C33743c a = new C33743c().mo59976a("attribute", str).mo59976a("reply_uid", authorUid).mo59976a("reply_comment_id", str2).mo59976a("user_level", predictedAgeGroup).mo59976a("comment_author_level", predictedAgeGroup2);
                if (f) {
                    a.mo59974a("is_others_video", Integer.valueOf(i));
                }
                if (!TextUtils.isEmpty(newsId)) {
                    a.mo59976a("news_id", newsId);
                }
                C39162r.onEvent(MobClick.obtain().setEventName("like_comment").setLabelName(eventType).setValue(aid).setExtValueString(authorUid).setJsonObject(a.mo59977a()));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: f */
    public final void mo64431f(Comment comment) {
        C36535m.C36536a aVar;
        C37080bx.C37081a.m74800a(comment).show(getActivity().getSupportFragmentManager().mo3552a(), "GiftAnimationFragment");
        m74995au();
        if (this.f87624d != null && (!this.f87610an || !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId()) || comment.getCommentType() == 0)) {
            comment.setReplyToUserId(Comment.getAuthorUid(this.f87624d));
            if (this.f87610an && comment.getCommentType() != 0) {
                comment.setReplyToUserName(C80580in.m139676a(this.f87624d.getUser()));
            } else if (comment.getCommentType() == 2 && !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                comment.setReplyToUserName(C80580in.m139676a(this.f87624d.getUser()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f87624d);
            comment.setReplyComments(arrayList);
        }
        if (!C36535m.m74357e(comment)) {
            Comment comment2 = this.f87624d;
            if (comment != null) {
                Map<String, C36535m.C36536a> map = C36535m.f86493a;
                String fakeId = comment.getFakeId();
                C89219l.m154716b(fakeId, "");
                C36535m.C36536a aVar2 = C36535m.f86493a.get(comment.getFakeId());
                if (aVar2 == null || (aVar = C36535m.C36536a.m74364a(aVar2, 0, null, 0, null, 0, comment2, 31)) == null) {
                    aVar = new C36535m.C36536a(0, null, 0, null, 0, comment2, 31);
                }
                map.put(fakeId, aVar);
            }
        }
        this.f87640y.mo64575a(comment, m74983ai());
        if (C76706a.m134278d(this.f87623c)) {
            AbstractC81915c.m141874a(new C36397l(1, comment));
        }
        if (m74994at()) {
            AbstractC81915c.m141874a(new C62690a(1, comment));
        }
        m74991aq();
        AbstractC37793a aVar3 = this.f87603ag;
        if (aVar3 != null) {
            aVar3.mo65813a(new C37792d(UGCMonitor.EVENT_COMMENT, comment.getText(), this.f87622b.getEventType()));
        }
    }

    @AbstractC90264r
    public void onEvent(C59090b bVar) {
        m75023j(true);
        C36274b bVar2 = this.f87641z;
        if (bVar2 != null && (bVar2.f85731b instanceof C37157k) && bVar2.f85731b.getChildFragmentManager().mo3551a("comment_rethink") != null && bVar2.f85735f != null) {
            C36274b.C36291a aVar = bVar2.f85735f;
            if (aVar.f85792d != null && aVar.f85791c != null) {
                aVar.mo63535a(aVar.f85792d, true);
                aVar.f85791c.dismiss();
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onReportCommentEvent(C47959j jVar) {
        long j;
        T t;
        Comment comment;
        try {
            if (TextUtils.equals("commentReportSuccess", jVar.f111077b.getString("eventName"))) {
                String string = jVar.f111077b.getJSONObject("data").getString("object_id");
                Comment comment2 = new Comment();
                comment2.setCid(string);
                mo64694a((long) (-m75011e(string)));
                this.f87640y.mo63699a(string, new C36499g(m74983ai(), C76706a.m134278d(this.f87623c), comment2));
                AbstractC81915c.m141874a(new C36387c(4, new Object[]{this.f87622b.getAid(), string}));
                T t2 = this.f87639w.f92286h;
                if (!(t2 == null || (t = t2.mData) == null || t.replyStyle == 2)) {
                    C37074bt btVar = this.f87640y;
                    if (btVar.mo64572a() instanceof C36205a) {
                        C36205a aVar = (C36205a) btVar.mo64572a();
                        if (!(aVar.mo60933c() == 0 || TextUtils.isEmpty(string))) {
                            Iterator it = aVar.f92236l.iterator();
                            boolean z = false;
                            while (it.hasNext()) {
                                Comment comment3 = (Comment) it.next();
                                if (!C13603b.m24435a((Collection) comment3.getReplyComments()) && (comment = comment3.getReplyComments().get(0)) != null && TextUtils.equals(comment.getCid(), string)) {
                                    it.remove();
                                    z = true;
                                }
                            }
                            if (z) {
                                aVar.notifyDataSetChanged();
                            }
                        }
                    }
                }
            } else if (TextUtils.equals("commentBatchReportResult", jVar.f111077b.getString("eventName"))) {
                JSONArray jSONArray = jVar.f111077b.getJSONObject("data").getJSONArray("object_ids");
                if (this.f87567I == null || jSONArray == null) {
                    new C23144b(this).mo37640e(R.string.ajt).mo37637b();
                    return;
                }
                HashSet hashSet = new HashSet();
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                Map<String, Comment> map = this.f87567I.f87767b;
                Map<String, Comment> map2 = this.f87567I.f87768c;
                int i2 = this.f87567I.f87766a;
                if (map2.size() > 0 && i2 > 0) {
                    if (map2.size() == hashSet.size()) {
                        this.f87640y.mo64579a(hashSet, map2);
                        mo64694a((long) (-i2));
                        if (map2.size() == map.size()) {
                            this.f87567I.mo64782c();
                            this.f87567I.mo64781b().postValue(0);
                        } else {
                            mo64707b(map);
                            this.f87567I.mo64781b().postValue(Integer.valueOf(map.size()));
                        }
                        new C23144b(this).mo37640e(R.string.ajw).mo37637b();
                        return;
                    }
                    C37074bt btVar2 = this.f87640y;
                    if (btVar2 != null) {
                        btVar2.mo64579a(hashSet, map2);
                        for (Map.Entry<String, Comment> entry : map2.entrySet()) {
                            if (!hashSet.contains(entry.getKey()) && entry.getValue() != null) {
                                i2 = (int) (((long) i2) - (entry.getValue().getReplyCommentTotal() + 1));
                            }
                        }
                        if (i2 > 0) {
                            j = (long) (-i2);
                        } else {
                            j = 0;
                        }
                        mo64694a(j);
                        mo64707b(map);
                        this.f87567I.mo64781b().postValue(Integer.valueOf(map.size()));
                    }
                    new C23144b(this).mo37640e(R.string.ajq).mo37637b();
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: c */
    public final void mo63723c(boolean z) {
        int i;
        TextView textView = this.f87597aa;
        if (textView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Object mo64710d(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            String aid = this.f87622b.getAid();
            if (aid == null) {
                aid = "";
            }
            jSONObject.put("group_id", aid);
            C40748a.f95402b = SystemClock.uptimeMillis() - j;
            jSONObject.put("duration", String.valueOf(C40748a.f95402b));
            long n = C81079v.m140776O().mo123891n();
            long j2 = (long) C36542d.f86522c;
            long j3 = C36542d.f86523d;
            Long.signum(j2);
            jSONObject.put("when", n + (j2 * j3));
            jSONObject.put("repeat", C36542d.f86522c);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C29819a.m60077a("comment_list", jSONObject);
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: e */
    public final void mo64429e(Comment comment) {
        C49567b.C49569b a;
        List<TextExtraStruct> textExtra;
        String str;
        C36500h hVar;
        Aweme aweme = this.f87623c;
        Comment comment2 = null;
        if (aweme != null && aweme.isAd()) {
            String str2 = "draw_ad";
            if (TextUtils.equals(this.f87622b.getEventType(), "general_search")) {
                IAdCommentDepend b = AdCommentDependImpl.m75903b();
                Context context = getContext();
                Aweme aweme2 = this.f87623c;
                if (!C37699a.m76314s(aweme2) || (hVar = this.f87622b) == null || !hVar.isEnterFullScreen()) {
                    str2 = "result_ad";
                }
                b.mo59058a(context, aweme2, str2, UGCMonitor.EVENT_COMMENT);
            } else {
                AdCommentDependImpl.m75903b().mo59057a(getContext(), this.f87623c, (String) null);
                C18129a.m33746a(str2, UGCMonitor.EVENT_COMMENT, this.f87623c.getAwemeRawAd()).mo28897a("anchor_id", C37187a.m75152b(this.f87623c)).mo28897a("room_id", C37187a.m75151a(this.f87623c)).mo28902c();
                ReportFeedAdAction.m78334a(this.f87622b.getEnterFrom());
            }
        }
        if (!(comment == null || comment.getReplyComments() == null || (textExtra = comment.getTextExtra()) == null || this.f87641z == null)) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                Iterator<User> it = this.f87641z.f85733d.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    if (TextUtils.equals(next.getUid(), textExtraStruct.getUserId())) {
                        if (next.getAtType() == 3) {
                            str = "follow";
                        } else if (next.getAtType() == 1) {
                            str = "search";
                        } else if (next.getAtType() == 4) {
                            str = "recent";
                        } else {
                            str = null;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            String aid = this.f87622b.getAid();
                            String uid = next.getUid();
                            C17867d.m33078a();
                            C39162r.m79457a("comment_at", str, aid, uid);
                        }
                    }
                }
            }
        }
        int[] au = m74995au();
        if (this.f87606aj == null) {
            m74982ah();
        }
        this.f87640y.mo64574a(comment, au[0], au[1], m74983ai());
        if (this.f87623c != null) {
            C49567b bVar = C49567b.C49568a.f114022a;
            String aid2 = this.f87622b.getAid();
            if (AbstractC49503af.f113865a && (a = bVar.f114019e.mo81318a(aid2)) != null) {
                bVar.f114016b++;
                a.f114025c = 1;
            }
        }
        mo64694a(1);
        Object[] objArr = new Object[2];
        objArr[0] = this.f87622b.getAid();
        if (comment != null) {
            comment2 = comment.clone();
        }
        objArr[1] = comment2;
        AbstractC81915c.m141874a(new C36387c(3, objArr));
        if (C76706a.m134278d(this.f87623c)) {
            AbstractC81915c.m141874a(new C36397l(2, comment));
        }
        if (m74994at()) {
            AbstractC81915c.m141874a(new C62690a(2, comment));
        }
        if (!(comment == null || comment.getGift() == null)) {
            m74974a(true, comment, 0);
        }
    }

    /* renamed from: a */
    private void m74972a(List<Comment> list) {
        C38255s adCommentStruct;
        if (!this.f87609am) {
            return;
        }
        if ((!C13603b.m24435a((Collection) list) || m74978ad()) && (adCommentStruct = this.f87622b.getAdCommentStruct()) != null) {
            if (C13603b.m24435a((Collection) list) || !(list.get(0) instanceof C38255s)) {
                list.add(0, adCommentStruct);
            }
            this.f87563E.mo60191a("comment_ad_struct", adCommentStruct);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a
    /* renamed from: b */
    public final void mo63748b(Comment comment) {
        if (!C76706a.m134284j(this.f87623c)) {
            if (!C31575b.m65865g().isLogin()) {
                C58957c.m108320a(getActivity(), this.f87622b.getEventType(), "reply_comment", new C80222ap().mo123649a("group_id", this.f87622b.getAid()).mo123649a("log_pb", C59208ac.m108768c(this.f87622b.getAid())).f179700a, new C37010ab(this, comment));
            } else if (!m74981ag()) {
                mo64705b(comment, "click_button");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: e */
    public final void mo64430e(boolean z) {
        if (z) {
            this.f87624d = null;
            this.f87610an = false;
        } else {
            this.f87582X.setVisibility(0);
        }
        this.f87580V.setVisibility(0);
        this.f87581W.setVisibility(0);
        this.f87562C.mo64518a(!z, false, false);
        if (this.f87614as > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f87614as;
            this.f87614as = 0;
            String enterFrom = this.f87622b.getEnterFrom();
            Aweme aweme = this.f87623c;
            C33744d dVar = new C33744d();
            dVar.mo59985a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.m95759b().mo86844a(enterFrom, aweme)).mo59985a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.m95759b().mo86843a(aweme, "list")).mo59981a("stay_time", currentTimeMillis);
            if ("homepage_country".equals(enterFrom) && aweme.getAuthor() != null) {
                dVar.mo59983a("country_name", aweme.getAuthor().getRegion());
            }
            C39162r.m79460a("close_text", dVar.f79943a);
        }
        this.f87640y.mo64580a(false, (Comment) null);
    }

    /* renamed from: a */
    public static void m74971a(String str, Comment comment) {
        C39162r.m79460a(str, new C33744d().mo59983a("comment_id", comment.getCid()).mo59983a("author_id", comment.getUser().getUid()).mo59980a("is_self_pin", C80580in.m139681a(comment.getUser().getUid()) ? 1 : 0).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<Comment> list, boolean z) {
        this.f87640y.mo59523c(list, z);
    }

    /* renamed from: a */
    private void m74970a(Aweme aweme, List<CommentGiftStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (CommentGiftStruct commentGiftStruct : list) {
            if (commentGiftStruct != null) {
                arrayList.add(String.valueOf(commentGiftStruct.getId()));
            } else {
                arrayList.add("");
            }
        }
        C39162r.m79460a("show_gift_summary_stripe", new C33744d().mo59983a("enter_from", this.f87622b.getEnterFrom()).mo59983a("group_id", C59208ac.m108771e(aweme)).mo59983a("author_id", C59208ac.m108758a(aweme)).mo59982a("gift_list", arrayList).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f87625e = (ViewGroup) view.findViewById(R.id.a99);
        this.f87576R = (TuxTextView) view.findViewById(R.id.a95);
        this.f87577S = (ImageView) view.findViewById(R.id.dih);
        this.f87578T = (SmartImageView) view.findViewById(R.id.a94);
        this.f87626j = (MentionEditText) view.findViewById(R.id.a9f);
        this.f87580V = (TuxIconView) view.findViewById(R.id.bsk);
        this.f87581W = (TuxIconView) view.findViewById(R.id.bv9);
        this.f87627k = (TuxIconView) view.findViewById(R.id.bvw);
        this.f87582X = (ImageView) view.findViewById(R.id.a_a);
        this.f87575Q = (ConstraintLayout) view.findViewById(R.id.a9e);
        this.f87579U = view.findViewById(R.id.c3x);
        this.f87583Y = (DmtStatusView) view.findViewById(R.id.e7i);
        this.f87584Z = (RecyclerView) view.findViewById(R.id.dgn);
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.f87597aa = textView;
        if (this.f87589aD) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f87630n = (ImageView) view.findViewById(R.id.r1);
        this.f87631o = (TextView) view.findViewById(R.id.r5);
        this.f87632p = (TextView) view.findViewById(R.id.r4);
        this.f87633q = (TextView) view.findViewById(R.id.r7);
        this.f87634r = view.findViewById(R.id.r3);
        this.f87599ac = view.findViewById(R.id.b7t);
        this.f87600ad = view.findViewById(R.id.a98);
        this.f87564F = (FrameLayout) view.findViewById(R.id.b3y);
        this.f87602af = (TextView) view.findViewById(R.id.a_8);
        ICommerceEggService c = CommerceEggServiceImpl.m76488c();
        if (c != null) {
            this.f87603ag = c.mo65833a((ViewStub) view.findViewById(R.id.aag));
        }
        C37004a aVar = new C37004a(this.f87575Q);
        this.f87562C = aVar;
        aVar.mo64519b(false, false, false);
        Context context = view.getContext();
        int c2 = C0643b.m2378c(context, R.color.qi);
        TuxTextView a = C37208m.m75197a(context);
        a.setTextColor(c2);
        a.setText(R.string.cxh);
        a.setOnClickListener(new View$OnClickListenerC37173m(this));
        DmtStatusView.C17269a c3 = DmtStatusView.C17269a.m31905a(context).mo27406b(m75001b(m75020h(m74999ay()))).mo27408c(a);
        c3.f41304g = 0;
        this.f87620ay = c3;
        this.f87583Y.setBuilder(c3);
        RecyclerView recyclerView = this.f87584Z;
        if (recyclerView instanceof FpsRecyclerView) {
            ((FpsRecyclerView) recyclerView).setLabel("comment_list");
        }
        C80330da.C80331a.m139266a("comment_list").mo123698a(this.f87584Z);
        this.f87560A = new C37221v();
        this.f87640y = new C37074bt(getActivity(), this.f87583Y, this.f87584Z, this.f87560A, this.f87623c);
        this.f87584Z.mo4405a(new RecyclerView.AbstractC1371n() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.C371581 */

            static {
                Covode.recordClassIndex(44512);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                super.mo4753a(recyclerView, i);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                super.mo4754a(recyclerView, i, i2);
                int m = C37157k.this.f87637u.mo4373m();
                int A = C37157k.this.f87637u.mo4685A();
                if (m >= 8 && A - m < 8 && ((AbstractC39100a) C37157k.this.f87639w.f92286h).isHasMore()) {
                    C37157k.this.mo62679l();
                }
                if (C37699a.m76259ae(C37157k.this.f87623c)) {
                    C37157k.this.f87563E.mo60191a("comment_dialog_state", (Object) 3);
                }
            }
        });
        this.f87626j.setFocusable(false);
        this.f87626j.setMaxLines(1);
        this.f87626j.setEllipsize(TextUtils.TruncateAt.END);
        TuxTextView tuxTextView = this.f87576R;
        String str = getString(R.string.ajd) + " ";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + getString(R.string.h_a));
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.C371697 */

            static {
                Covode.recordClassIndex(44523);
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                C39223a.m79589c().mo68602a(C37157k.this.getContext(), "float_comment");
            }
        }, str.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(getContext(), R.color.bx)), str.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), str.length(), spannableStringBuilder.length(), 18);
        tuxTextView.setText(spannableStringBuilder);
        this.f87576R.setMovementMethod(new LinkMovementMethod());
        this.f87641z.mo63476a(this.f87626j, this.f87580V, this.f87581W, this.f87627k, this.f87576R, this.f87622b.getAid(), this.f87622b.getEnterFrom());
        C36274b bVar = this.f87641z;
        ImageView imageView = this.f87577S;
        ConstraintLayout constraintLayout = this.f87575Q;
        bVar.f85741l = imageView;
        bVar.f85747r = constraintLayout;
        boolean a2 = C39223a.m79589c().mo68606a(3);
        this.f87565G = a2;
        this.f87641z.mo63497b(a2);
        this.f87626j.setTextSize(2, 15.0f);
        this.f87563E = DataCenter.m69492a(C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null), this);
        C33947e a3 = C33947e.m69516a(this, view);
        this.f87615at = a3;
        a3.mo60218a(this.f87563E);
        Widget a4 = AdCommentDependImpl.m75903b().mo59050a(new C37181u(this));
        this.f87616au = a4;
        this.f87615at.mo60216a(R.id.acg, a4);
        this.f87641z.f85742m = this.f87563E;
        m74967a(view);
        this.f87641z.f85739j = new C37184x(this);
        this.f87641z.mo63466a();
        this.f87582X.setOnClickListener(new View$OnClickListenerC37017ai(this));
        m74953O();
        Aweme aweme = this.f87623c;
        if (aweme != null) {
            m75008d(aweme.getAid());
        }
        m74959U();
        if (C36407e.m74108a()) {
            C58254p.f132679a.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.RunnableC371686 */

                static {
                    Covode.recordClassIndex(44522);
                }

                public final void run() {
                    if (!C1870c.m6052b(null, "aweme_comment_fragment_input_comment")) {
                        C1870c.m6050a((Context) null, "aweme_comment_fragment_input_comment");
                    }
                }
            }, 1000);
        }
        m74982ah();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1870c.m6045a((Activity) getActivity(), (int) R.layout.i9);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C89391z mo64703b(Comment comment, String str, String str2, int i, int i2) {
        C36540c.m74391b(this.f87622b.getEnterFrom(), "delete");
        mo64699a(comment, str, str2, i, i2);
        return C89391z.f203057a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        if (r40 != null) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m74968a(com.p2082ss.android.ugc.aweme.comment.model.Comment r40, int r41, int r42, java.lang.String r43, boolean r44, java.lang.String r45) {
        /*
        // Method dump skipped, instructions count: 378
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k.m74968a(com.ss.android.ugc.aweme.comment.model.Comment, int, int, java.lang.String, boolean, java.lang.String):void");
    }
}
