package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14522f;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.dmt.p1194ui.widget.View$OnTouchListenerC17271b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17964b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20760q;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.monitor.collector.C21478d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33946d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.TagLayout;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36388d;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38622af;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39113c;
import com.p2082ss.android.ugc.aweme.common.widget.C39189a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.experiment.BatteryTask;
import com.p2082ss.android.ugc.aweme.experiment.C46748bt;
import com.p2082ss.android.ugc.aweme.experiment.C46824dc;
import com.p2082ss.android.ugc.aweme.experiment.C46825dd;
import com.p2082ss.android.ugc.aweme.experiment.C46832dk;
import com.p2082ss.android.ugc.aweme.experiment.C46920f;
import com.p2082ss.android.ugc.aweme.experiment.C46965gb;
import com.p2082ss.android.ugc.aweme.experiment.C47008he;
import com.p2082ss.android.ugc.aweme.experiment.C47036n;
import com.p2082ss.android.ugc.aweme.feed.C48314ai;
import com.p2082ss.android.ugc.aweme.feed.C50565z;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a;
import com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.C48137b;
import com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.C48139c;
import com.p2082ss.android.ugc.aweme.feed.assem.C48342a;
import com.p2082ss.android.ugc.aweme.feed.assem.C48442b;
import com.p2082ss.android.ugc.aweme.feed.assem.p2938a.C48345a;
import com.p2082ss.android.ugc.aweme.feed.assem.report.C48957b;
import com.p2082ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49495aa;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49525p;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49531u;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49533w;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49537z;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.GeneralVideoMaskWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.PhotosensitiveVideoMaskWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.ReportVideoMaskWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VPAInfoBarWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VPAOptedOutMaskWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoCaptionWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoFeedTagWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoRelationBtnWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoReviewStatusWidget;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoTopCautionWidgetV1;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.guide.C49592h;
import com.p2082ss.android.ugc.aweme.feed.helper.C49617c;
import com.p2082ss.android.ugc.aweme.feed.helper.C49618d;
import com.p2082ss.android.ugc.aweme.feed.helper.C49648o;
import com.p2082ss.android.ugc.aweme.feed.helper.C49653t;
import com.p2082ss.android.ugc.aweme.feed.helper.C49658w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoCaptionUpdateParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.BottomGradualOptimizeConfig;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.C48022b;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49668ac;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49669ad;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49695w;
import com.p2082ss.android.ugc.aweme.feed.p2953l.p2954a.C49721a;
import com.p2082ss.android.ugc.aweme.feed.p2953l.p2954a.C49726b;
import com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b.C49729b;
import com.p2082ss.android.ugc.aweme.feed.p2953l.p2955b.C49735c;
import com.p2082ss.android.ugc.aweme.feed.p2957n.C49754j;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50087aw;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50114bh;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50162c;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50323k;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.DebugInfoView;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.FeedInterceptTouchLayout;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.p2972b.C50096a;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50525aa;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50536e;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50541i;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50555t;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50561z;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.feed.service.C49912a;
import com.p2082ss.android.ugc.aweme.feed.share.C49914a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgFeedBottomNoticeBar;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.legoImp.inflate.C58292e;
import com.p2082ss.android.ugc.aweme.main.C59063c;
import com.p2082ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b;
import com.p2082ss.android.ugc.aweme.p2310al.C33489d;
import com.p2082ss.android.ugc.aweme.p2433ca.C35347e;
import com.p2082ss.android.ugc.aweme.p2433ca.C35351h;
import com.p2082ss.android.ugc.aweme.p2433ca.C35355j;
import com.p2082ss.android.ugc.aweme.p2444ch.C35479a;
import com.p2082ss.android.ugc.aweme.p2480cl.C36139a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56251d;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56259l;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56261n;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.p3538o.AbstractC62694c;
import com.p2082ss.android.ugc.aweme.player.C62890a;
import com.p2082ss.android.ugc.aweme.player.C62933c;
import com.p2082ss.android.ugc.aweme.power.C63303c;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.aweme.report.C67107d;
import com.p2082ss.android.ugc.aweme.report.C67110f;
import com.p2082ss.android.ugc.aweme.service.AbstractC67849c;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.RestrictTextView;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.p2082ss.android.ugc.aweme.share.C69508y;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72876a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.p2082ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75398a;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75399b;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75400c;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a;
import com.p2082ss.android.ugc.aweme.video.p4212f.C80727b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell */
public class VideoViewCell extends VideoBaseCell implements AbstractC50087aw, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    AnimationImageView f111370A;

    /* renamed from: B */
    ConstraintLayout f111371B;

    /* renamed from: C */
    LinearLayout f111372C;

    /* renamed from: D */
    LinearLayout f111373D;

    /* renamed from: E */
    LinearLayout f111374E;

    /* renamed from: F */
    protected ViewGroup f111375F;

    /* renamed from: G */
    LongPressLayout f111376G;

    /* renamed from: H */
    protected FrameLayout f111377H;

    /* renamed from: I */
    protected FrameLayout f111378I;

    /* renamed from: J */
    protected FrameLayout f111379J;

    /* renamed from: K */
    public FrameLayout f111380K;

    /* renamed from: L */
    protected FrameLayout f111381L;

    /* renamed from: M */
    protected FrameLayout f111382M;

    /* renamed from: N */
    protected RelativeLayout f111383N;

    /* renamed from: O */
    ViewGroup f111384O;

    /* renamed from: P */
    ViewGroup f111385P;

    /* renamed from: Q */
    TextView f111386Q;

    /* renamed from: R */
    View f111387R;

    /* renamed from: S */
    ImageView f111388S;

    /* renamed from: T */
    public View f111389T;

    /* renamed from: U */
    TuxIconView f111390U;

    /* renamed from: V */
    TuxIconView f111391V;

    /* renamed from: W */
    TextView f111392W;

    /* renamed from: X */
    View f111393X;

    /* renamed from: Y */
    TuxTextView f111394Y;

    /* renamed from: Z */
    View f111395Z;

    /* renamed from: a */
    private boolean f111396a;

    /* renamed from: aA */
    protected C33947e f111397aA;

    /* renamed from: aB */
    public C48442b f111398aB;

    /* renamed from: aC */
    protected Handler f111399aC = new Handler(Looper.getMainLooper()) {
        /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.HandlerC480981 */

        static {
            Covode.recordClassIndex(56838);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            long j = 5000;
            if (message.what == 20) {
                C56257j jVar = (C56257j) message.obj;
                C49914a.m93719a(jVar, VideoViewCell.this.f111443av);
                if (!jVar.f128328k) {
                    if (!TextUtils.isEmpty(jVar.f128326i)) {
                        j = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                    }
                    VideoViewCell.this.f111399aC.sendEmptyMessageDelayed(21, j);
                }
            } else if (message.what == 21) {
                C49914a.m93726c(VideoViewCell.this.f111443av);
            } else if (message.what == 23) {
                C49914a.m93717a(VideoViewCell.this.f111443av);
            } else if (message.what == 25) {
                C49914a.m93724b(VideoViewCell.this.f111443av);
            } else if (message.what == 31) {
                C48201bd bdVar = VideoViewCell.this.f111443av;
                C89219l.m154721d(bdVar, "");
                TuxIconView tuxIconView = bdVar.f111676d;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(8);
                }
                TextView textView = bdVar.f111677e;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TuxTextView tuxTextView = bdVar.f111673a;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                }
                TuxTextView tuxTextView2 = bdVar.f111673a;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(C17867d.m33078a().getResources().getString(R.string.g7f));
                }
                TuxIconView tuxIconView2 = bdVar.f111675c;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                }
                float b = C13628n.m24520b(C17867d.m33078a(), 32.0f);
                View view = bdVar.f111674b;
                if (view != null) {
                    view.getLayoutParams().height = 0;
                    view.requestLayout();
                    view.setVisibility(0);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, b);
                    ofFloat.addUpdateListener(new C49914a.C49924i(view));
                    C89219l.m154716b(ofFloat, "");
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                }
                sendEmptyMessageDelayed(32, 5000);
            } else if (message.what == 32) {
                C48201bd bdVar2 = VideoViewCell.this.f111443av;
                C89219l.m154721d(bdVar2, "");
                if (bdVar2.f111674b != null && bdVar2.f111674b.getVisibility() != 8) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat((float) bdVar2.f111674b.getHeight(), 0.0f);
                    C49914a.f115060a = ofFloat2;
                    if (ofFloat2 != null) {
                        ofFloat2.addUpdateListener(new C49914a.C49915a(bdVar2));
                    }
                    ValueAnimator valueAnimator = C49914a.f115060a;
                    if (valueAnimator != null) {
                        valueAnimator.setDuration(300L);
                    }
                    ValueAnimator valueAnimator2 = C49914a.f115060a;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    };

    /* renamed from: aD */
    public float f111400aD;

    /* renamed from: aE */
    protected AbstractC49439l f111401aE;

    /* renamed from: aF */
    protected C33947e f111402aF;

    /* renamed from: aG */
    protected BaseFeedPageParams f111403aG;

    /* renamed from: aH */
    boolean f111404aH = false;

    /* renamed from: aI */
    final C88411a f111405aI = new C88411a();

    /* renamed from: aK */
    private AbstractC80726a f111406aK;

    /* renamed from: aL */
    private boolean f111407aL = false;

    /* renamed from: aM */
    private View.OnTouchListener f111408aM;

    /* renamed from: aN */
    private LongPressLayout.AbstractC50014a f111409aN;

    /* renamed from: aO */
    private int f111410aO = -1;

    /* renamed from: aP */
    private long f111411aP;

    /* renamed from: aQ */
    private long f111412aQ;

    /* renamed from: aR */
    private boolean f111413aR = false;

    /* renamed from: aS */
    private boolean f111414aS = false;

    /* renamed from: aT */
    private boolean f111415aT = false;

    /* renamed from: aU */
    private ScrollSwitchStateManager f111416aU;

    /* renamed from: aV */
    private String f111417aV;

    /* renamed from: aW */
    private long f111418aW = -1;

    /* renamed from: aX */
    private boolean f111419aX;

    /* renamed from: aY */
    private VideoViewModel f111420aY;

    /* renamed from: aZ */
    private VideoPlayViewModel f111421aZ;

    /* renamed from: aa */
    FrameLayout f111422aa;

    /* renamed from: ab */
    ImageView f111423ab;

    /* renamed from: ac */
    ImageView f111424ac;

    /* renamed from: ad */
    ImageView f111425ad;

    /* renamed from: ae */
    ImageView f111426ae;

    /* renamed from: af */
    DebugInfoView f111427af;

    /* renamed from: ag */
    FrameLayout f111428ag;

    /* renamed from: ah */
    ViewGroup f111429ah;

    /* renamed from: ai */
    public Space f111430ai;

    /* renamed from: aj */
    ViewGroup f111431aj;

    /* renamed from: ak */
    ConstraintLayout f111432ak;

    /* renamed from: al */
    ConstraintLayout f111433al;

    /* renamed from: am */
    LinearLayout f111434am;

    /* renamed from: an */
    protected long f111435an;

    /* renamed from: ao */
    protected Context f111436ao;

    /* renamed from: ap */
    protected AbstractC49691s<C49672ag> f111437ap;

    /* renamed from: aq */
    public JSONObject f111438aq;

    /* renamed from: ar */
    public AbstractC37879bc f111439ar;

    /* renamed from: as */
    protected C49617c f111440as = new C49617c();

    /* renamed from: at */
    public C72876a f111441at;

    /* renamed from: au */
    boolean f111442au = false;

    /* renamed from: av */
    public C48201bd f111443av;

    /* renamed from: aw */
    IVideoGiftService f111444aw = VideoGiftService.m120814l();

    /* renamed from: ax */
    protected boolean f111445ax = true;

    /* renamed from: ay */
    public String f111446ay = "click";

    /* renamed from: az */
    protected DataCenter f111447az;

    /* renamed from: b */
    private AbstractC23317a f111448b;

    /* renamed from: ba */
    private VideoPlaySearchViewModel f111449ba;

    /* renamed from: bb */
    private VideoEventDispatchViewModel f111450bb;

    /* renamed from: bc */
    private AbstractC62694c f111451bc;

    /* renamed from: bd */
    private FrameLayout f111452bd;

    /* renamed from: be */
    private ViewTreeObserver.OnGlobalLayoutListener f111453be = new ViewTreeObserver.OnGlobalLayoutListener() {
        /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.ViewTreeObserver$OnGlobalLayoutListenerC4809910 */

        static {
            Covode.recordClassIndex(56839);
        }

        public final void onGlobalLayout() {
            if (VideoViewCell.this.mo80170aA() != VideoViewCell.this.f111400aD && VideoViewCell.this.f111441at != null) {
                VideoViewCell.this.f111441at.mo115246a((int) VideoViewCell.this.mo80170aA(), VideoViewCell.this.f111377H.getHeight());
                VideoViewCell videoViewCell = VideoViewCell.this;
                videoViewCell.f111400aD = videoViewCell.mo80170aA();
            }
        }
    };

    /* renamed from: bf */
    private int f111454bf;

    /* renamed from: bg */
    private boolean f111455bg = true;

    /* renamed from: bh */
    private boolean f111456bh = false;

    /* renamed from: bi */
    private double f111457bi = -1.0d;

    /* renamed from: bj */
    private Widget f111458bj;

    /* renamed from: bk */
    private Widget f111459bk;

    /* renamed from: bl */
    private boolean f111460bl = false;

    /* renamed from: bm */
    private final String f111461bm = "click_video_duet_button";

    /* renamed from: bn */
    private SparseBooleanArray f111462bn = new SparseBooleanArray();

    /* renamed from: bo */
    private AbstractC1214u<FollowStatus> f111463bo = new AbstractC1214u<FollowStatus>() {
        /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.C481149 */

        static {
            Covode.recordClassIndex(56854);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* bridge */ /* synthetic */ void onChanged(FollowStatus followStatus) {
        }
    };

    /* renamed from: c */
    private boolean f111464c;

    /* renamed from: d */
    private C49618d f111465d;

    /* renamed from: e */
    private boolean f111466e;

    /* renamed from: f */
    private boolean f111467f;

    /* renamed from: g */
    private boolean f111468g;

    /* renamed from: h */
    private boolean f111469h;

    /* renamed from: p */
    protected RelativeLayout f111470p;

    /* renamed from: q */
    protected AbstractC48136a f111471q;

    /* renamed from: r */
    protected SmartImageView f111472r;

    /* renamed from: s */
    FrameLayout f111473s;

    /* renamed from: t */
    ViewGroup f111474t;

    /* renamed from: u */
    FrameLayout f111475u;

    /* renamed from: v */
    View f111476v;

    /* renamed from: w */
    protected View f111477w;

    /* renamed from: x */
    RestrictTextView f111478x;

    /* renamed from: y */
    View f111479y;

    /* renamed from: z */
    TagLayout f111480z;

    static {
        Covode.recordClassIndex(56837);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: b */
    public final void mo60627b(int i, int i2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: e */
    public final void mo80215e(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo80096e(Aweme aweme) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(58, new RunnableC90250g(VideoViewCell.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void onBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void onDecoderBuffering(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void onRetryOnError(C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: p */
    public final AbstractC48147ag mo80225p() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: s */
    public final int mo80228s() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: v */
    public final AbstractC48148ah mo80231v() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: N */
    public final AbstractC80726a mo80100N() {
        return this.f111406aK;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: P */
    public final AbstractC48136a mo80101P() {
        return this.f111471q;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: Q */
    public final boolean mo80102Q() {
        return this.f111464c;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: R */
    public final C49618d mo80103R() {
        return this.f111465d;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: S */
    public final boolean mo80104S() {
        return this.f111445ax;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: W */
    public final boolean mo80108W() {
        return this.f111456bh;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: ad */
    public final View mo80119ad() {
        return this.f111377H;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd
    /* renamed from: an */
    public final View mo80193an() {
        return this.f111377H;
    }

    /* renamed from: ap */
    public final Context mo80195ap() {
        return this.f111436ao;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd
    /* renamed from: as */
    public final JSONObject mo80198as() {
        return this.f111438aq;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd
    /* renamed from: au */
    public final double mo80200au() {
        return this.f111457bi;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd
    /* renamed from: aw */
    public final DataCenter mo80202aw() {
        return this.f111447az;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: b */
    public Aweme mo80206b() {
        return this.f111308j;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: t */
    public final AbstractC37879bc mo80229t() {
        return this.f111439ar;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd
    /* renamed from: a */
    public final void mo80160a(View.OnTouchListener onTouchListener) {
        this.f111447az.mo60191a("bind_title_touch_listener", onTouchListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: a */
    public void mo80114a(Aweme aweme, int i) {
        this.f111309k = i;
        if (mo80077K() && C46748bt.m90121h() && C35355j.f83397b == 0) {
            Iterator<T> it = C35355j.f83396a.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            C35355j.f83396a.clear();
        }
        mo70615a(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public void mo70615a(Aweme aweme) {
        if (aweme != null) {
            this.f111308j = aweme;
            mo80069H();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
    /* renamed from: a */
    public final void mo80161a(C49695w wVar) {
        if (this.f111308j.getAid().equals(wVar.f114365b.getAid())) {
            UrlModel urlModel = wVar.f114364a.labelPrivate;
            this.f111308j.setLabelPrivate(urlModel);
            this.f111308j.setHybridLabels(wVar.f114364a.hybridLabels);
            AwemeLabelModel awemeLabelModel = null;
            if (urlModel != null) {
                awemeLabelModel = new AwemeLabelModel();
                awemeLabelModel.setLabelType(1);
                awemeLabelModel.setUrlModels(urlModel);
            }
            if (!(this.f111308j == null || this.f111308j.videoLabels == null)) {
                if (this.f111308j.videoLabels.size() == 0) {
                    this.f111308j.videoLabels.add(0, awemeLabelModel);
                } else {
                    this.f111308j.videoLabels.set(0, awemeLabelModel);
                }
            }
            if (!C13603b.m24435a((Collection) this.f111308j.getHybridLabels()) || (SharePrefCache.inst().getIsPrivateAvailable().mo59941c().booleanValue() && urlModel != null && !C13603b.m24435a((Collection) urlModel.getUrlList()))) {
                this.f111480z.mo61318b(this.f111308j, this.f111308j.getVideoLabels(), TagLayout.f81906f);
                return;
            }
            TagLayout tagLayout = this.f111480z;
            View a = tagLayout.mo61316a(1);
            if (!(a == null && (a = tagLayout.mo61316a(11)) == null)) {
                int indexOfChild = tagLayout.indexOfChild(a);
                ArrayList arrayList = new ArrayList();
                if (indexOfChild != -1) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < tagLayout.getChildCount(); i++) {
                        if (i > indexOfChild) {
                            arrayList.add(tagLayout.getChildAt(i));
                            arrayList2.add(ObjectAnimator.ofFloat(tagLayout.getChildAt(i), "translationX", 0.0f, (float) ((int) (((float) (-a.getWidth())) - C13628n.m24520b(tagLayout.f81908b, 7.0f)))));
                        }
                    }
                    animatorSet.setDuration(200L);
                    animatorSet.playSequentially(arrayList2);
                    animatorSet.start();
                }
                a.animate().alpha(0.0f).setDuration(150).withEndAction(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0111: INVOKE  
                      (wrap: android.view.ViewPropertyAnimator : 0x0108: INVOKE  (r1v3 android.view.ViewPropertyAnimator) = 
                      (wrap: android.view.ViewPropertyAnimator : 0x0102: INVOKE  (r2v4 android.view.ViewPropertyAnimator) = 
                      (wrap: android.view.ViewPropertyAnimator : 0x00fe: INVOKE  (r0v20 android.view.ViewPropertyAnimator) = (r4v1 'a' android.view.View) type: VIRTUAL call: android.view.View.animate():android.view.ViewPropertyAnimator)
                      (0.0f float)
                     type: VIRTUAL call: android.view.ViewPropertyAnimator.alpha(float):android.view.ViewPropertyAnimator)
                      (150 long)
                     type: VIRTUAL call: android.view.ViewPropertyAnimator.setDuration(long):android.view.ViewPropertyAnimator)
                      (wrap: com.ss.android.ugc.aweme.base.ui.TagLayout$2 : 0x010e: CONSTRUCTOR  (r0v22 com.ss.android.ugc.aweme.base.ui.TagLayout$2) = 
                      (r5v0 'tagLayout' com.ss.android.ugc.aweme.base.ui.TagLayout)
                      (r4v1 'a' android.view.View)
                      (r3v1 'arrayList' java.util.ArrayList)
                     call: com.ss.android.ugc.aweme.base.ui.TagLayout.2.<init>(com.ss.android.ugc.aweme.base.ui.TagLayout, android.view.View, java.util.List):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.view.ViewPropertyAnimator.withEndAction(java.lang.Runnable):android.view.ViewPropertyAnimator in method: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.a(com.ss.android.ugc.aweme.feed.i.w):void, file: classes3.dex
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x010e: CONSTRUCTOR  (r0v22 com.ss.android.ugc.aweme.base.ui.TagLayout$2) = 
                      (r5v0 'tagLayout' com.ss.android.ugc.aweme.base.ui.TagLayout)
                      (r4v1 'a' android.view.View)
                      (r3v1 'arrayList' java.util.ArrayList)
                     call: com.ss.android.ugc.aweme.base.ui.TagLayout.2.<init>(com.ss.android.ugc.aweme.base.ui.TagLayout, android.view.View, java.util.List):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.a(com.ss.android.ugc.aweme.feed.i.w):void, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 32 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.base.ui.TagLayout, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 38 more
                    */
                /*
                // Method dump skipped, instructions count: 277
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.mo80161a(com.ss.android.ugc.aweme.feed.i.w):void");
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: a */
            public final void mo80167a(String str, String str2) {
                if (this.f111308j != null && TextUtils.equals(this.f111308j.getAid(), str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    if ((TextUtils.equals(mo80197ar(), "homepage_hot") || TextUtils.equals(mo80197ar(), "personal_homepage") || TextUtils.equals(mo80197ar(), "others_homepage") || TextUtils.equals(mo80197ar(), "challenge")) && this.f111480z != null) {
                        this.f111308j.setFeedRelationLabel(RelationLabelHelper.mockStarCommentLabel(this.f111308j.getAuthor()));
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: a */
            public final void mo80164a(C56259l lVar) {
                C51423a.m95791b(3, "VideoViewCell", "shareSending" + lVar.f128330b + " enter from: " + lVar.f128335g);
                if (this.f111308j == null) {
                    return;
                }
                if ((TextUtils.equals(lVar.f128329a, this.f111308j.getAid()) || "publish_share_panel".equals(lVar.f128335g)) && !CommentServiceImpl.m73664e().mo63297a(this.f111436ao) && !m91165aW()) {
                    mo80203ax();
                    this.f111417aV = lVar.f128330b;
                    TextView textView = this.f111392W;
                    if (textView != null) {
                        textView.setOnClickListener(new View$OnClickListenerC48207bj(this, lVar));
                    }
                    C49914a.f115062c.mo84962a(lVar, this.f111443av);
                    this.f111399aC.sendEmptyMessageDelayed(23, lVar.f128331c);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: a */
            public final void mo80165a(C56261n nVar) {
                if (TextUtils.isEmpty(this.f111417aV) || this.f111417aV == nVar.f128339b) {
                    C51423a.m95792b("VideoViewCell", "shareUndo" + nVar.f128339b);
                    mo80203ax();
                    C49914a.m93720a(nVar, this.f111443av);
                    this.f111399aC.sendEmptyMessageDelayed(25, nVar.f128340c);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: a */
            public final void mo80163a(C56257j jVar) {
                C51423a.m95791b(3, "VideoViewCell", "shareComplete" + jVar.f128324g + " enter from: " + jVar.f128322e);
                if (this.f111308j == null) {
                    return;
                }
                if ((!TextUtils.equals(jVar.f128324g, this.f111308j.getAid()) && !jVar.f128322e.equals("publish_share_panel")) || CommentServiceImpl.m73664e().mo63297a(this.f111436ao)) {
                    return;
                }
                if (m91165aW()) {
                    new C79459a(C17867d.m33078a()).mo123050a(R.string.ch9).mo123053a();
                } else if ((TextUtils.isEmpty(this.f111417aV) || TextUtils.isEmpty(jVar.f128326i) || this.f111417aV == jVar.f128326i) && this.f111399aC != null) {
                    mo80203ax();
                    Message obtainMessage = this.f111399aC.obtainMessage(20);
                    obtainMessage.what = 20;
                    obtainMessage.obj = jVar;
                    if (TextUtils.isEmpty(jVar.f128326i)) {
                        this.f111399aC.sendMessage(obtainMessage);
                    } else {
                        this.f111399aC.sendMessageDelayed(obtainMessage, 500);
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            /* renamed from: a */
            public final void mo80115a(C56251d dVar) {
                if (dVar.f128293a <= 0) {
                    this.f111399aC.sendEmptyMessage(21);
                } else {
                    this.f111399aC.sendEmptyMessageDelayed(21, dVar.f128293a);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final /* synthetic */ void mo80159a(Context context) {
                C77260g.f173332a.mo120143a((ActivityC0945e) context, mo80197ar(), this.f111308j);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: a */
            public final void mo80166a(final String str) {
                this.f111446ay = str;
                if (this.f111460bl) {
                    C49559p.f113984a.mo81305a(new RunnableC49561r(true, new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.RunnableC4810415 */

                        static {
                            Covode.recordClassIndex(56844);
                        }

                        public final void run() {
                            VideoViewCell.this.f111307i.setEnterMethodValue(str);
                        }
                    }));
                } else {
                    this.f111307i.setEnterMethodValue(str);
                }
                m91164aV();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd
            /* renamed from: a */
            public void mo80071a(Video video) {
                this.f111445ax = true;
                this.f111465d = new C49618d();
                Aweme aweme = this.f111308j;
                C49617c cVar = this.f111440as;
                Context context = this.f111436ao;
                View y = this.f111471q.mo80234y();
                SmartImageView smartImageView = this.f111472r;
                if (aweme == null) {
                    C51423a.m95786a((Exception) new NullPointerException("aweme is null"));
                } else if (aweme.isVr()) {
                    C49617c.m93046a(y);
                    C49617c.m93046a(smartImageView);
                } else if (aweme.getVideo() != null) {
                    cVar.mo81412a(context, aweme.getVideo(), y, smartImageView, aweme.getOcrLocation());
                }
                this.f111440as.mo81413a(this.f111436ao, aweme.getVideo(), this.f111422aa, aweme.getOcrLocation());
                mo80216e("bindCoverImage");
                if (C38701br.m78512a(this.f111308j, 3)) {
                    if (video == null || !m91157a(video.getOriginCover())) {
                        C48242ch.m91650a(this.f111472r);
                        this.f111472r.setImageURI(Uri.parse("res://" + this.f111436ao.getPackageName() + "/2131099659"));
                        return;
                    }
                    C20766v a = C20761r.m39060a(C34735v.m70965a(video.getOriginCover()));
                    a.f49088A = EnumC20760q.HIGH;
                    C20766v a2 = a.mo34179a("VideoViewCell");
                    a2.f49092E = this.f111472r;
                    a2.mo34181a(new C49754j(this, this.f111465d));
                } else if (video == null || video.getPlayAddr() == null || C13603b.m24435a((Collection) video.getPlayAddr().getUrlList()) || !m91157a(video.getOriginCover())) {
                    C48242ch.m91649a(this.f111472r, this.f111436ao);
                } else if (C50539g.m94749d(this)) {
                    C20766v a3 = C20761r.m39060a(C34735v.m70965a(video.getOriginCover())).mo34179a("VideoViewCell");
                    a3.f49092E = this.f111472r;
                    a3.mo34181a(new C49754j(this, this.f111465d));
                } else {
                    if (!C62890a.f142627a ? C16048b.m29633a().mo25412a(true, "player_prerender_cover_need", 1) != 1 : !((Boolean) C62933c.f142843a.getValue()).booleanValue()) {
                        if (!aweme.isAd()) {
                            this.f111472r.setVisibility(8);
                            this.f111445ax = false;
                            return;
                        }
                    }
                    if (C50545m.m94762a(aweme) && aweme.isProhibited()) {
                        C48242ch.m91649a(this.f111472r, this.f111436ao);
                    } else if (!C16048b.m29633a().mo25421a(true, "enable_reuse_external_image", false) || this.f111403aG.awemeFromPage != 2 || video.getCachedOuterCoverUrl() == null || video.getCachedOuterCoverUrl().getUrlList().isEmpty()) {
                        C20766v a4 = C20761r.m39060a(C34735v.m70965a(video.getOriginCover()));
                        a4.f49088A = EnumC20760q.HIGH;
                        C20766v a5 = a4.mo34179a("VideoViewCell");
                        a5.f49092E = this.f111472r;
                        a5.mo34181a(new C49754j(this, this.f111465d));
                    } else {
                        C20766v a6 = C20761r.m39060a(C34735v.m70965a(video.getCachedOuterCoverUrl()));
                        if (video.getCachedOuterCoverSize() != null) {
                            a6.mo34185b(video.getCachedOuterCoverSize());
                        }
                        C20766v a7 = a6.mo34179a("VideoViewCell");
                        a7.f49092E = this.f111472r;
                        a7.f49106c = false;
                        a7.mo34181a(new C49754j(this, this.f111465d));
                    }
                    this.f111445ax = true;
                }
            }

            /* renamed from: a */
            public void mo80093a(View view, boolean z) {
                int i;
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                if (!z) {
                    view.setAlpha(1.0f);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd
            /* renamed from: a */
            public final void mo80168a(boolean z, int i) {
                View view = this.f111393X;
                if (view != null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.height = i;
                        this.f111393X.setLayoutParams(layoutParams);
                        this.f111393X.requestLayout();
                    }
                    this.f111393X.setVisibility(z ? 0 : 8);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: a */
            public final void mo80169a(boolean z, boolean z2) {
                this.f111439ar.mo65967b(z);
                if (z) {
                    C48245ck.f111772b = true;
                    final ViewPropertyAnimator duration = this.f111470p.animate().alpha(0.0f).setDuration(200);
                    if (z2) {
                        duration.setListener(new AnimatorListenerAdapter() {
                            /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.C4810617 */

                            static {
                                Covode.recordClassIndex(56846);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                VideoViewCell.this.f111470p.setVisibility(8);
                                duration.setListener(null);
                            }
                        });
                    }
                    duration.start();
                    this.f111464c = true;
                    return;
                }
                C48245ck.f111772b = false;
                this.f111470p.setVisibility(0);
                this.f111470p.animate().alpha(1.0f).setDuration(200).start();
                if (this.f111464c) {
                    this.f111464c = false;
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: a */
            public final void mo80158a(long j) {
                if (!C38701br.m78512a(this.f111308j, 3)) {
                    RelativeLayout relativeLayout = this.f111470p;
                    TagLayout tagLayout = this.f111480z;
                    if (tagLayout != null) {
                        Iterator a = C89309k.m154809e(C38622af.m78384b(tagLayout)).mo2926a();
                        while (a.hasNext()) {
                            View view = (View) a.next();
                            Object tag = view.getTag(C38622af.f91275a);
                            if (!(tag instanceof Long)) {
                                tag = null;
                            }
                            Long l = (Long) tag;
                            if (l != null) {
                                long longValue = l.longValue();
                                if (longValue > 0) {
                                    view.postDelayed(new C38622af.RunnableC38624b(view, relativeLayout, tagLayout), longValue);
                                }
                            }
                            C38622af.m78383a(relativeLayout, tagLayout, view);
                        }
                    }
                }
                if (!this.f111396a && this.f111427af != null) {
                    if (TextUtils.isEmpty(this.f111308j.getExtra())) {
                        C34729o.m70955a(this.f111427af, 8);
                    } else {
                        C34729o.m70955a(this.f111427af, 0);
                        this.f111427af.setContent(this.f111308j.getExtra());
                    }
                }
                TagLayout tagLayout2 = this.f111480z;
                if (!(tagLayout2 == null || tagLayout2.f81910d == null)) {
                    if ((TextUtils.equals(tagLayout2.f81909c, "homepage_hot") || TextUtils.equals(tagLayout2.f81909c, "homepage_follow")) && tagLayout2.f81910d.getRelationRecommendInfo() != null) {
                        C33744d a2 = new C33744d().mo59983a("enter_from", tagLayout2.f81909c).mo59983a("group_id", tagLayout2.f81910d.getAid()).mo59983a("author_id", tagLayout2.f81910d.getAuthorUid()).mo59981a("rec_type", tagLayout2.f81910d.getRelationRecommendInfo().getRecommendType()).mo59983a("label_text", tagLayout2.f81910d.getRelationRecommendInfo().getRelationTextKey());
                        if (tagLayout2.f81910d.getMutualRelation() != null && C51487e.m95905b()) {
                            a2.mo59983a("is_avatar", C51487e.m95906c());
                            a2.mo59980a("maf_num", tagLayout2.f81910d.getMutualRelation().getTotal());
                        }
                        C39162r.m79460a("show_label", a2.f79943a);
                    } else if (!(tagLayout2.f81910d.getRelationLabel() == null || !tagLayout2.f81910d.getRelationLabel().isValid() || tagLayout2.f81911e == null)) {
                        C39162r.onEvent(MobClick.obtain().setEventName("show").setLabelName("like_banner").setValue(tagLayout2.f81910d.getAid()).setExtValueString(C31575b.m65865g().getCurUserId()));
                    }
                }
                if (this.f111308j != null && this.f111308j.isAd()) {
                    C39162r.onEvent(MobClick.obtain().setEventName("ad_show").setJsonObject(new C33743c().mo59976a("request_id", RequestIdService.m70076a().mo60693a(this.f111308j, this.f111403aG.pageType)).mo59977a()).setExtValueString(this.f111308j.getAid()));
                }
                if (TextUtils.equals(mo80197ar(), "homepage_hot")) {
                    C38000g.m77056g().mo28751a(this.f111436ao, this.f111308j, j);
                    C38000g.m77056g().mo28752b(this.f111436ao, this.f111308j, j);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            /* renamed from: a */
            public final void mo80117a(String str, int i, int i2, String str2) {
                VideoCaptionUpdateParams videoCaptionUpdateParams = new VideoCaptionUpdateParams.Builder().setAwemeId(str).setCode(i).setTimestamp(i2).setCaptionText(str2).mParams;
                this.f111447az.mo60191a("update_caption_text", videoCaptionUpdateParams);
                VideoViewModel videoViewModel = this.f111420aY;
                C89219l.m154721d(videoCaptionUpdateParams, "");
                videoViewModel.mo20662a(new VideoViewModel.C48125c(videoCaptionUpdateParams));
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            /* renamed from: a */
            public final void mo80116a(String str, int i, int i2, int i3, long j) {
                this.f111447az.mo60191a("update_audio_state", (Object) true);
                C39162r.m79460a("tts_switch_play_quality", new C33744d().mo59981a("duration", j).mo59980a("tts_pre_cache_size", i2).mo59980a("tts_bitrate", i3).mo59980a("is_success", i).mo59983a("group_id", str).mo59983a("author_id", str).f79943a);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd
            /* renamed from: a */
            public final void mo80162a(LongPressLayout.AbstractC50014a aVar) {
                LongPressLayout longPressLayout = this.f111376G;
                if (longPressLayout != null) {
                    longPressLayout.setListener(aVar);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v24, resolved type: com.ss.android.ugc.aweme.feed.i.s<com.ss.android.ugc.aweme.feed.i.ag> */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:111:0x0249  */
            /* JADX WARNING: Removed duplicated region for block: B:116:0x030f  */
            /* JADX WARNING: Removed duplicated region for block: B:119:0x0351  */
            /* JADX WARNING: Removed duplicated region for block: B:121:0x0369  */
            /* JADX WARNING: Removed duplicated region for block: B:122:0x036b  */
            /* JADX WARNING: Removed duplicated region for block: B:123:0x036e  */
            /* JADX WARNING: Removed duplicated region for block: B:133:0x03a1  */
            /* JADX WARNING: Removed duplicated region for block: B:135:0x03a7  */
            /* JADX WARNING: Removed duplicated region for block: B:137:0x03aa  */
            /* JADX WARNING: Removed duplicated region for block: B:139:0x03b3  */
            /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x0099  */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7  */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x016c  */
            /* JADX WARNING: Removed duplicated region for block: B:74:0x0174  */
            /* JADX WARNING: Removed duplicated region for block: B:76:0x0186  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x0197  */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x01a1  */
            /* JADX WARNING: Removed duplicated region for block: B:81:0x01af  */
            /* JADX WARNING: Removed duplicated region for block: B:91:0x01da  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onChanged(com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r7) {
                /*
                // Method dump skipped, instructions count: 1052
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            /* renamed from: a */
            public final void mo80118a(Map<String, AwemeStatisticsBackup> map) {
                if (this.f111308j == null || map == null || map.size() == 0) {
                    C51423a.m95790a((Throwable) new IllegalArgumentException("list is empty,should never happen!"));
                    return;
                }
                for (int i = 0; i < map.size(); i++) {
                    String aid = this.f111308j.getAid();
                    if (!(map.get(aid) == null || this.f111447az == null)) {
                        C51423a.m95791b(4, "FeedBackupHelper", "aid:" + aid + ".start to update statistics!");
                        this.f111447az.mo60191a("awesome_update_backup_data", this.f111307i);
                        VideoViewModel videoViewModel = this.f111420aY;
                        if (videoViewModel != null) {
                            videoViewModel.mo20662a(new VideoViewModel.C48134l(this.f111307i));
                        }
                    }
                }
            }

            /* renamed from: aP */
            private void m91158aP() {
                this.f111441at = new C72876a(this);
            }

            /* access modifiers changed from: protected */
            /* renamed from: aA */
            public float mo80170aA() {
                return this.f111430ai.getY();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: aD */
            public final /* synthetic */ void mo80173aD() {
                m91187i(0);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: aG */
            public final /* synthetic */ void mo80176aG() {
                this.f111439ar.mo65952a(this.f111397aA);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd
            /* renamed from: at */
            public final boolean mo80199at() {
                return this.f111310l.getUserVisibleHint();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50087aw
            /* renamed from: az */
            public final int mo80205az() {
                return this.f111452bd.getHeight();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: l */
            public void mo80082l() {
                this.f111439ar.mo65991x();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: r */
            public final void mo80227r() {
                mo80150B();
                mo80151C();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
            /* renamed from: w */
            public final boolean mo80232w() {
                return this.f111471q.mo80232w();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
            /* renamed from: x */
            public final Surface mo80233x() {
                return this.f111471q.mo80233x();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
            /* renamed from: y */
            public final View mo80234y() {
                return this.f111471q.mo80234y();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell$b */
            public class C48116b implements AbstractC75400c {

                /* renamed from: b */
                private boolean f111506b;

                static {
                    Covode.recordClassIndex(56856);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75400c
                /* renamed from: b */
                public final void mo80253b() {
                    AbstractC81915c.m141874a(new C33489d(false, false));
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75400c
                /* renamed from: c */
                public final void mo80254c() {
                    this.f111506b = false;
                    if (VideoViewCell.m91169ak() && VideoViewCell.this.f111401aE != null) {
                        this.f111506b = true;
                        VideoViewCell.this.f111401aE.mo81115a(VideoViewCell.this.f111308j, false, false);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75400c
                /* renamed from: d */
                public final void mo80255d() {
                    if (this.f111506b && VideoViewCell.this.f111401aE != null) {
                        VideoViewCell.this.f111401aE.mo81115a(VideoViewCell.this.f111308j, false, false);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75400c
                /* renamed from: a */
                public final void mo80252a() {
                    AbstractC81915c.m141874a(new C33489d(true, false));
                    if (!VideoViewCell.m91169ak() && VideoViewCell.this.f111401aE != null) {
                        VideoViewCell.this.f111401aE.mo81115a(VideoViewCell.this.f111308j, true, false);
                    }
                }

                private C48116b() {
                }

                /* synthetic */ C48116b(VideoViewCell videoViewCell, byte b) {
                    this();
                }
            }

            /* renamed from: aW */
            private boolean m91165aW() {
                if (this.f111308j == null || !this.f111308j.isAd()) {
                    return false;
                }
                return true;
            }

            /* renamed from: ak */
            public static boolean m91169ak() {
                return C81079v.m140776O().mo123892o();
            }

            /* renamed from: bc */
            private String m91174bc() {
                String str = this.f111403aG.challengeId;
                if (str == null) {
                    return "";
                }
                return str;
            }

            /* renamed from: bd */
            private boolean m91175bd() {
                if (!C46965gb.f109453a || !this.f111415aT) {
                    return false;
                }
                return true;
            }

            /* renamed from: bi */
            private boolean m91180bi() {
                if (!mo80077K() || !C49533w.m92773b()) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
            /* renamed from: A */
            public final void mo80149A() {
                if (!m91175bd()) {
                    mo80194ao();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: D */
            public final void mo80152D() {
                SmartImageView smartImageView = this.f111472r;
                if (smartImageView != null) {
                    smartImageView.setVisibility(8);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            /* renamed from: T */
            public final AbstractC48149ai mo80105T() {
                AbstractC48136a aVar = this.f111471q;
                if (aVar != null) {
                    return aVar.mo80274d();
                }
                return null;
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
            /* renamed from: Y */
            public final void mo80153Y() {
                if (this.f111308j != null) {
                    this.f111478x.mo109008a(this.f111308j.getAid());
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: aB */
            public final /* synthetic */ Long mo80171aB() {
                return Long.valueOf(System.currentTimeMillis() - this.f111435an);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: aF */
            public final /* synthetic */ void mo80175aF() {
                mo80222h(this.f111308j);
                mo80219g(this.f111308j);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: aI */
            public final /* synthetic */ void mo80178aI() {
                this.f111397aA.mo60217a(this.f111475u, C50162c.m94142d());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: aJ */
            public final /* synthetic */ Long mo80179aJ() {
                return Long.valueOf(System.currentTimeMillis() - this.f111435an);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
            /* renamed from: ab */
            public final void mo80186ab() {
                DataCenter dataCenter = this.f111447az;
                if (dataCenter != null) {
                    dataCenter.mo60191a("show_festival_activity_icon", (Object) null);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
            /* renamed from: ac */
            public void mo80187ac() {
                AbsInteractStickerWidget absInteractStickerWidget;
                C72876a aVar = this.f111441at;
                if (aVar != null && (absInteractStickerWidget = aVar.f163541o) != null) {
                    absInteractStickerWidget.mo115500f();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd
            /* renamed from: aq */
            public final void mo80196aq() {
                this.f111371B.setVisibility(8);
                this.f111432ak.setVisibility(8);
            }

            /* renamed from: ar */
            public final String mo80197ar() {
                if (this.f111403aG.eventType == null) {
                    return "";
                }
                return this.f111403aG.eventType;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g
            /* renamed from: ay */
            public final long mo80204ay() {
                return C81079v.m140776O().mo123891n();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
            /* renamed from: z */
            public final void mo80235z() {
                mo80194ao();
                this.f111439ar.mo65993z();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell$a */
            public class C48115a implements AbstractC75399b {
                static {
                    Covode.recordClassIndex(56855);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75399b
                /* renamed from: a */
                public final void mo80251a() {
                    if (VideoViewCell.this.f111401aE != null) {
                        VideoViewCell.this.f111401aE.mo81115a(VideoViewCell.this.f111308j, false, false);
                    }
                }

                private C48115a() {
                }

                /* synthetic */ C48115a(VideoViewCell videoViewCell, byte b) {
                    this();
                }
            }

            /* renamed from: J */
            private boolean mo80076J() {
                if (!this.f111403aG.isMyProfile) {
                    return false;
                }
                if ((this.f111403aG.pageType == 1000 || this.f111403aG.pageType == 1014) && C46920f.m90223c()) {
                    return true;
                }
                return false;
            }

            /* renamed from: aQ */
            private void m91159aQ() {
                if (!m91180bi() && !mo80076J()) {
                    this.f111397aA.mo60221b(R.id.c34, C50162c.m94139a(this.f111408aM, mo80197ar()));
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: aS */
            public void mo80183aN() {
                if (!C47008he.m90283b() && TextUtils.equals(mo80197ar(), "homepage_hot")) {
                    this.f111397aA.mo60221b(R.id.fcj, new VideoRelationBtnWidget());
                }
            }

            /* renamed from: aT */
            private static Boolean m91162aT() {
                boolean z;
                boolean c = C39223a.m79601o().mo68706c();
                if (!C31575b.m65865g().isLogin() || c) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            /* renamed from: aX */
            private void m91166aX() {
                DataCenter dataCenter = this.f111447az;
                if (dataCenter != null) {
                    dataCenter.mo60191a("stopPlayAnimation", (Object) true);
                }
                VideoPlayViewModel videoPlayViewModel = this.f111421aZ;
                if (videoPlayViewModel != null) {
                    videoPlayViewModel.mo23342g();
                }
                this.f111415aT = false;
            }

            /* renamed from: aY */
            private String m91167aY() {
                if (this.f111403aG.getPreviousPage() == null) {
                    return "";
                }
                return this.f111403aG.getPreviousPage();
            }

            /* renamed from: aZ */
            private String m91168aZ() {
                if (this.f111403aG.getFromGroupId() == null) {
                    return "";
                }
                return this.f111403aG.getFromGroupId();
            }

            /* renamed from: ba */
            private String m91172ba() {
                if (m91167aY().equals("") || this.f111403aG.getPreviousPagePosition() == null) {
                    return "";
                }
                return this.f111403aG.getPreviousPagePosition();
            }

            /* renamed from: bb */
            private String m91173bb() {
                if (this.f111403aG.param.getCreationId() == null) {
                    return "";
                }
                return this.f111403aG.param.getCreationId();
            }

            /* renamed from: bf */
            private boolean m91177bf() {
                if (C59063c.m108543a().f134455a) {
                    return true;
                }
                if (!TextUtils.equals(mo80197ar(), "homepage_follow") || !C59063c.m108543a().f134456b) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: B */
            public final void mo80150B() {
                if (this.f111471q.mo80272b()) {
                    View y = this.f111471q.mo80234y();
                    if (y.getVisibility() != 0) {
                        C34729o.m70955a(y, 0);
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            /* renamed from: E */
            public final void mo80097E() {
                BusinessComponentServiceUtils.getBusinessBridgeService().mo121230b();
                this.f111471q.mo80234y();
                mo80206b();
                mo80197ar();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            /* renamed from: M */
            public final void mo80099M() {
                this.f111447az.mo60191a("video_show_share_stay_home_animation", (Object) null);
                VideoShareViewModel a = C48345a.m91805a(this);
                if (a != null) {
                    a.mo20662a(VideoShareViewModel.C49014k.f112937a);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            /* renamed from: X */
            public final void mo80109X() {
                this.f111447az.mo60191a("video_hide_share_stay_home_animation", (Object) null);
                VideoShareViewModel a = C48345a.m91805a(this);
                if (a != null) {
                    a.mo20662a(VideoShareViewModel.C49007d.f112928a);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: aH */
            public final /* synthetic */ void mo80177aH() {
                View findViewById = this.f111377H.findViewById(R.id.ay1);
                if (findViewById != null) {
                    this.f111397aA.mo60217a(findViewById, C50162c.m94147i());
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.AbstractC72888b
            public final AbsInteractStickerWidget aI_() {
                AbsInteractStickerWidget a = StickerServiceImpl.m132027c().mo118501a();
                a.mo115492a(this);
                this.f111402aF.mo60216a(R.id.bp8, a);
                return a;
            }

            @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
            public final void aJ_() {
                if (this.f111407aL) {
                    this.f111407aL = false;
                    if (this.f111471q.mo80272b() && this.f111404aH) {
                        C81079v.m140776O().mo123910D();
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
            /* renamed from: aa */
            public void mo80185aa() {
                mo80187ac();
                AbstractC23317a aVar = this.f111448b;
                if (aVar != null) {
                    aVar.dismiss();
                    this.f111448b = null;
                }
                C69508y.f155284b = false;
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            /* renamed from: ag */
            public final C48442b mo80122ag() {
                C48442b bVar = this.f111398aB;
                if (bVar != null) {
                    return bVar;
                }
                C48442b bVar2 = new C48442b(this.f111403aG, new C48214bq(this), m91180bi());
                this.f111398aB = bVar2;
                return bVar2;
            }

            /* access modifiers changed from: protected */
            /* renamed from: aj */
            public void mo80190aj() {
                if (!m91180bi()) {
                    this.f111397aA.mo60217a(this.f111377H, new VideoTopCautionWidgetV1());
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: m */
            public void mo80083m() {
                mo80187ac();
                this.f111447az.mo60191a("video_on_pause", (Object) null);
                this.f111439ar.mo65992y();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: u */
            public final void mo80230u() {
                if (this.f111471q.mo80272b()) {
                    this.f111471q.mo80234y().setVisibility(8);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: I */
            public void mo80184aO() {
                Bundle bundle = new Bundle();
                if (this.f111403aG.param != null) {
                    bundle.putBoolean("isDuetChain", this.f111403aG.param.isFromDuetChain());
                } else {
                    bundle.putBoolean("isDuetChain", false);
                }
                this.f111397aA.mo60221b(R.id.apf, C50162c.m94137a(bundle));
            }

            /* renamed from: aV */
            private void m91164aV() {
                JSONObject a = m91156a(this.f111308j, this.f111403aG, this.f111446ay);
                this.f111438aq = a;
                this.f111439ar.mo65960a(a);
                if (this.f111460bl) {
                    C49559p.f113984a.mo81305a(new RunnableC49561r(true, new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.RunnableC4810516 */

                        static {
                            Covode.recordClassIndex(56845);
                        }

                        public final void run() {
                            VideoViewCell.this.f111307i.setRequestId(VideoViewCell.this.f111438aq);
                        }
                    }));
                } else {
                    this.f111307i.setRequestId(this.f111438aq);
                }
            }

            /* renamed from: be */
            private void m91176be() {
                Rect rect = new Rect();
                this.f111476v.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.f111395Z.getGlobalVisibleRect(rect2);
                int b = (rect.bottom - rect2.bottom) + ((int) C13628n.m24520b(this.f111436ao, 72.0f));
                if (b != this.f111476v.getLayoutParams().height) {
                    this.f111476v.getLayoutParams().height = b;
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: bh */
            public void mo80174aE() {
                if (this.f111308j == null || m91180bi()) {
                    return;
                }
                if (this.f111308j.shouldShowReviewStatus() || C80635y.m139806a(this.f111308j)) {
                    this.f111397aA.mo60217a(this.f111475u, new VideoReviewStatusWidget());
                }
            }

            /* renamed from: o */
            private void mo80074o() {
                this.f111447az = DataCenter.m69492a(C33946d.m69514a(this.f111310l, this), this.f111310l);
                C33947e a = C33947e.m69516a(this.f111310l, this.f111377H);
                this.f111397aA = a;
                a.mo60218a(this.f111447az);
                mo80073n();
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
            /* renamed from: Z */
            public final int[] mo80154Z() {
                if (this.f111308j == null || this.f111308j.getAuthor() == null || this.f111308j.getAuthor().getFollowStatus() != 0) {
                    return null;
                }
                int[] iArr = new int[2];
                View findViewById = this.f111387R.findViewById(R.id.b6a);
                if (findViewById == null) {
                    return null;
                }
                findViewById.getLocationOnScreen(iArr);
                return iArr;
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
            /* renamed from: a */
            public final int mo80155a() {
                if (this.f111308j != null) {
                    return this.f111308j.getAwemeType();
                }
                return 0;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: aL */
            public final /* synthetic */ void mo80181aL() {
                if (!m91180bi() || !C49531u.f113911a) {
                    this.f111447az.mo60191a("on_bottom_layer_clicked", (Object) 1);
                } else {
                    this.f111420aY.mo20662a(new VideoViewModel.C48124b());
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: ai */
            public void mo80189ai() {
                if (!m91180bi()) {
                    this.f111397aA.mo60221b(R.id.fc4, new VideoCaptionWidget());
                }
                if (!C48247d.f111777a && !EventBus.m156962a().mo145393a(this)) {
                    EventBus.m156966a(EventBus.m156962a(), this);
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: ax */
            public final void mo80203ax() {
                Handler handler = this.f111399aC;
                if (handler != null) {
                    handler.removeMessages(20);
                    this.f111399aC.removeMessages(21);
                    this.f111399aC.removeMessages(23);
                    this.f111399aC.removeMessages(25);
                    this.f111399aC.removeMessages(31);
                    this.f111399aC.removeMessages(32);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
            /* renamed from: h */
            public final void mo80127h() {
                C80446fr.f180030d = false;
                C21478d.f50922d = false;
                if (C46824dc.f109078a) {
                    C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.RunnableC481138 */

                        static {
                            Covode.recordClassIndex(56853);
                        }

                        public final void run() {
                            if (!C35347e.f83385a) {
                                if (C35347e.f83386b == 0) {
                                    Jato.preloadCpusetInfo();
                                } else if (C35347e.f83386b == 2) {
                                    C35347e.f83385a = true;
                                }
                                C35347e.f83386b++;
                                Jato.getInnerExecutorService().execute(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: INVOKE  
                                      (wrap: java.util.concurrent.ExecutorService : 0x0011: INVOKE  (r1v1 java.util.concurrent.ExecutorService) =  type: STATIC call: com.bytedance.common.jato.Jato.getInnerExecutorService():java.util.concurrent.ExecutorService)
                                      (wrap: com.ss.android.ugc.aweme.ca.e$1 : 0x0017: CONSTRUCTOR  (r0v5 com.ss.android.ugc.aweme.ca.e$1) =  call: com.ss.android.ugc.aweme.ca.e.1.<init>():void type: CONSTRUCTOR)
                                     type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.8.run():void, file: classes2.dex
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
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: CONSTRUCTOR  (r0v5 com.ss.android.ugc.aweme.ca.e$1) =  call: com.ss.android.ugc.aweme.ca.e.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell.8.run():void, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 21 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.ca.e, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 27 more
                                    */
                                /*
                                    this = this;
                                    boolean r0 = com.p2082ss.android.ugc.aweme.p2433ca.C35347e.f83385a
                                    if (r0 != 0) goto L_0x001d
                                    int r0 = com.p2082ss.android.ugc.aweme.p2433ca.C35347e.f83386b
                                    r2 = 1
                                    if (r0 != 0) goto L_0x001e
                                    com.bytedance.common.jato.Jato.preloadCpusetInfo()
                                L_0x000c:
                                    int r0 = com.p2082ss.android.ugc.aweme.p2433ca.C35347e.f83386b
                                    int r0 = r0 + r2
                                    com.p2082ss.android.ugc.aweme.p2433ca.C35347e.f83386b = r0
                                    java.util.concurrent.ExecutorService r1 = com.bytedance.common.jato.Jato.getInnerExecutorService()
                                    com.ss.android.ugc.aweme.ca.e$1 r0 = new com.ss.android.ugc.aweme.ca.e$1
                                    r0.<init>()
                                    r1.execute(r0)
                                L_0x001d:
                                    return
                                L_0x001e:
                                    int r1 = com.p2082ss.android.ugc.aweme.p2433ca.C35347e.f83386b
                                    r0 = 2
                                    if (r1 != r0) goto L_0x000c
                                    com.p2082ss.android.ugc.aweme.p2433ca.C35347e.f83385a = r2
                                    goto L_0x000c
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.RunnableC481138.run():void");
                            }
                        }, 500);
                    }
                    if (!m91175bd() && C81079v.m140776O().mo123892o()) {
                        mo80194ao();
                    }
                    C67107d.C67108a.f150503a.mo105936b();
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                /* renamed from: k */
                public final void mo80128k() {
                    C80446fr.f180030d = true;
                    C58254p.f132679a.postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.RunnableC481127 */

                        static {
                            Covode.recordClassIndex(56852);
                        }

                        public final void run() {
                            C80446fr.f180030d = false;
                        }
                    }, 600);
                    C80446fr.m139460c(1000);
                    C80446fr.m139459b(1500);
                    C80446fr.m139456a(1000);
                    if (C81079v.m140776O().mo123892o()) {
                        m91166aX();
                    }
                    C67107d.C67108a.f150503a.mo105934a();
                }

                /* renamed from: bg */
                private void m91178bg() {
                    int i;
                    if (!C33403c.C33406b.f79409a.f79388q || (C37699a.m76199B(this.f111308j) && !C37699a.m76260af(this.f111308j) && !C17975i.f42801a)) {
                        i = 0;
                    } else {
                        i = -C33403c.m68502a();
                    }
                    C37699a.m76260af(this.f111308j);
                    if (C33403c.f79374d) {
                        i += C33403c.f79375e;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f111470p.getLayoutParams();
                    layoutParams.bottomMargin = i;
                    this.f111470p.setLayoutParams(layoutParams);
                    m91171b(C33403c.C33406b.f79409a.f79390s, C33403c.C33406b.f79409a.f79391t);
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: C */
                public final void mo80151C() {
                    if (this.f111471q.mo80272b()) {
                        View y = this.f111471q.mo80234y();
                        C13605d<SurfaceView> dVar = AbstractC48234cd.C48235a.f111738a.get(this.f111436ao);
                        if (dVar != null) {
                            Iterator<SurfaceView> it = dVar.iterator();
                            while (it.hasNext()) {
                                SurfaceView next = it.next();
                                if (next != y) {
                                    C34729o.m70955a(next, 8);
                                }
                            }
                        }
                        C13605d<AbstractC48234cd> dVar2 = AbstractC48234cd.C48235a.f111739b.get(this.f111436ao);
                        if (dVar2 != null) {
                            Iterator<AbstractC48234cd> it2 = dVar2.iterator();
                            while (it2.hasNext()) {
                                AbstractC48234cd next2 = it2.next();
                                if (next2 != this) {
                                    VideoViewCell videoViewCell = (VideoViewCell) next2;
                                    if ((videoViewCell.f111309k == this.f111309k - 1 || videoViewCell.f111309k == this.f111309k + 1) && videoViewCell.f111308j != null) {
                                        videoViewCell.mo80071a(videoViewCell.f111308j.getVideo());
                                    }
                                }
                            }
                        }
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                /* renamed from: L */
                public final void mo80098L() {
                    Aweme aweme = null;
                    this.f111447az.mo60191a("video_show_share_guide_animation", (Object) null);
                    VideoShareViewModel a = C48345a.m91805a(this);
                    if (a != null && !a.f112921m && C16048b.m29633a().mo25412a(true, "interction_share_button_style", 0) == 0 && VideoShareViewModel.m92171k() == 0) {
                        VideoItemParams videoItemParams = (VideoItemParams) a.mo23342g();
                        if (videoItemParams != null) {
                            aweme = videoItemParams.mAweme;
                        }
                        if (!C80636z.m139819d(aweme) && !C80636z.m139818c(aweme) && !C49658w.m93105a(a.mo23343h())) {
                            C49592h.C49593a.f114095a.mo81383b(C59208ac.m108771e(aweme));
                            C48314ai.m91748b();
                            a.f112922n = true;
                            a.mo20662a(new VideoShareViewModel.C49013j(a));
                        }
                    }
                }

                /* renamed from: ah */
                public void mo80188ah() {
                    this.f111447az.mo60189a("feed_internal_event", (AbstractC1214u<C33942b>) this).mo60189a("to_profile", (AbstractC1214u<C33942b>) this).mo60189a("update_diig_view", (AbstractC1214u<C33942b>) this).mo60189a("video_comment_list", (AbstractC1214u<C33942b>) this).mo60189a("video_gift_stripe_show_comment_list_gift_panel", (AbstractC1214u<C33942b>) this).mo60189a("video_share_click", (AbstractC1214u<C33942b>) this).mo60189a("on_render_ready", (AbstractC1214u<C33942b>) this).mo60189a("video_more_click", (AbstractC1214u<C33942b>) this).mo60189a("video_digg", (AbstractC1214u<C33942b>) this).mo60189a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", (AbstractC1214u<C33942b>) this).mo60189a("title_view_click", (AbstractC1214u<C33942b>) this).mo60189a("video_duet_click", (AbstractC1214u<C33942b>) this).mo60189a("use_translated_caption", (AbstractC1214u<C33942b>) this);
                    if (C56216k.m102133c()) {
                        C39113c.m79407a(this.f111374E);
                    }
                    if (C46832dk.m90153d()) {
                        C58254p.f132679a.post(new RunnableC48220bw(this));
                    } else {
                        mo80180aK();
                    }
                }

                /* access modifiers changed from: protected */
                /* renamed from: al */
                public void mo80191al() {
                    this.f111441at.mo115247a(this.f111308j);
                    C72876a aVar = this.f111441at;
                    Aweme aweme = aVar.f163527a;
                    if (aweme != null && aweme.getInteractStickerStructs() != null) {
                        Aweme aweme2 = aVar.f163527a;
                        if (aweme2 == null) {
                            C89219l.m154715b();
                        }
                        ArrayList<InteractStickerStruct> arrayList = new ArrayList<>(aweme2.getInteractStickerStructs());
                        Aweme aweme3 = aVar.f163527a;
                        if (aweme3 != null && aweme3.isProhibited()) {
                            arrayList = new ArrayList<>();
                        }
                        if (!C13603b.m24435a((Collection) arrayList)) {
                            if (aVar.f163541o == null) {
                                aVar.mo115252c();
                            }
                            aVar.mo115248a(arrayList);
                        } else if (aVar.f163541o != null) {
                            aVar.mo115248a(new ArrayList<>());
                        }
                    } else if (aVar.f163541o != null) {
                        aVar.mo115248a(new ArrayList<>());
                    }
                }

                /* access modifiers changed from: protected */
                /* renamed from: am */
                public void mo80172aC() {
                    InteractStickerViewModel interactStickerViewModel;
                    if (!C46965gb.f109453a || !this.f111414aS) {
                        this.f111414aS = true;
                        AbstractC80747i O = C81079v.m140776O();
                        this.f111441at.mo115247a(this.f111308j);
                        this.f111441at.f163532f = O;
                        this.f111441at.f163533g = null;
                        C72876a aVar = this.f111441at;
                        Aweme aweme = aVar.f163527a;
                        if (aweme == null || !aweme.isProhibited()) {
                            C1731i.m5640b(new C72876a.CallableC72878b(aVar), C1731i.f5562a).mo5534a(new C72876a.C72879c(aVar), C1731i.f5564c, null);
                        } else if (aVar.f163528b != null) {
                            DataCenter dataCenter = aVar.f163528b;
                            if (dataCenter != null) {
                                dataCenter.mo60191a("interact_sticker_video_data", new ArrayList());
                            }
                        } else if (aVar.f163536j != null && (interactStickerViewModel = aVar.f163536j) != null) {
                            interactStickerViewModel.mo115496a("interact_sticker_video_data", new ArrayList());
                        }
                    }
                }

                /* renamed from: ao */
                public void mo80194ao() {
                    this.f111415aT = true;
                    if (this.f111447az != null && !C63303c.m114800a().mo101877b()) {
                        this.f111447az.mo60191a("startPlayAnimation", (Object) true);
                        VideoPlayViewModel videoPlayViewModel = this.f111421aZ;
                        if (videoPlayViewModel != null) {
                            videoPlayViewModel.mo20662a(new VideoPlayViewModel.C48096j());
                        }
                    }
                    if (C37699a.m76199B(this.f111308j) && !C37699a.m76260af(this.f111308j)) {
                        this.f111439ar.mo65948a(this.f111377H);
                    } else if (C50565z.m94797a(this.f111454bf) && !this.f111464c) {
                        mo80093a(this.f111470p, m91177bf());
                    }
                }

                /* renamed from: av */
                public final void mo80201av() {
                    View findViewById;
                    Aweme b = mo80206b();
                    if (C69508y.m122721a(b) && this.f111310l.getActivity() != null) {
                        if (C56216k.m102133c()) {
                            findViewById = this.f111377H.findViewById(R.id.abf);
                        } else {
                            findViewById = this.f111377H.findViewById(R.id.dxn);
                        }
                        if (findViewById != null) {
                            AbstractC23317a d = ((C23329a) new C23329a(this.f111436ao).mo38030a(3000L).mo38028a(C0643b.m2378c(this.f111436ao, R.color.bn))).mo38022a(b.getBubbleInfo().getText()).mo38034a(EnumC23352h.END).mo38041b(findViewById).mo38036a(false).mo38032a(new C48209bl(this, b)).mo38037a(false, (View.OnClickListener) null).mo38012d();
                            this.f111448b = d;
                            d.mo38001a();
                        }
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                /* renamed from: c */
                public void mo80080c() {
                    super.mo80080c();
                    DataCenter dataCenter = this.f111447az;
                    if (dataCenter != null) {
                        dataCenter.mo60191a("stopPlayAnimation", (Object) true);
                    }
                    mo80217e(false);
                    this.f111441at.mo115247a(this.f111308j);
                    C72876a aVar = this.f111441at;
                    if (aVar.f163541o != null) {
                        if (aVar.f163528b != null) {
                            DataCenter dataCenter2 = aVar.f163528b;
                            if (dataCenter2 != null) {
                                dataCenter2.mo60191a("interact_sticker_clear_data", (Object) null);
                            }
                            DataCenter dataCenter3 = aVar.f163528b;
                            if (dataCenter3 != null) {
                                dataCenter3.mo60191a("interact_sticker_aweme_data", (Object) null);
                            }
                            DataCenter dataCenter4 = aVar.f163528b;
                            if (dataCenter4 != null) {
                                dataCenter4.mo60191a("interact_sticker_video_data", (Object) null);
                            }
                        } else {
                            InteractStickerViewModel interactStickerViewModel = aVar.f163536j;
                            if (interactStickerViewModel != null) {
                                interactStickerViewModel.mo115496a("interact_sticker_clear_data", (Object) null);
                            }
                            InteractStickerViewModel interactStickerViewModel2 = aVar.f163536j;
                            if (interactStickerViewModel2 != null) {
                                interactStickerViewModel2.mo115496a("interact_sticker_aweme_data", (Object) null);
                            }
                            InteractStickerViewModel interactStickerViewModel3 = aVar.f163536j;
                            if (interactStickerViewModel3 != null) {
                                interactStickerViewModel3.mo115496a("interact_sticker_video_data", (Object) null);
                            }
                        }
                    }
                    UserService.m138861d().mo123566b().removeObserver(this.f111463bo);
                    m91188i(false);
                    AbstractC62694c cVar = this.f111451bc;
                    if (cVar != null) {
                        cVar.mo63658c();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.adaptation.C33403c.AbstractC33407c
                /* renamed from: d */
                public final void mo59483d() {
                    if (this.f111470p != null) {
                        m91178bg();
                        this.f111440as.mo81412a(this.f111436ao, this.f111308j.getVideo(), this.f111471q.mo80234y(), this.f111472r, this.f111308j.getOcrLocation());
                        if (this.f111308j.getVideo() != null) {
                            this.f111440as.mo81413a(this.f111436ao, this.f111308j.getVideo(), this.f111422aa, this.f111308j.getOcrLocation());
                        }
                        this.f111439ar.mo65980m();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: j */
                public void mo70620j() {
                    AbsInteractStickerWidget absInteractStickerWidget;
                    if (!C48247d.f111777a && EventBus.m156962a().mo145393a(this)) {
                        EventBus.m156962a().mo145395b(this);
                    }
                    C49726b.m93141a();
                    if (C50536e.m94741a(this.f111308j)) {
                        C38000g.m77054e().mo65130a(this.f111308j);
                    }
                    this.f111439ar.mo65943T();
                    C72876a aVar = this.f111441at;
                    if (!(aVar == null || (absInteractStickerWidget = aVar.f163541o) == null)) {
                        absInteractStickerWidget.mo115501g();
                    }
                    Handler handler = this.f111399aC;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    this.f111457bi = -1.0d;
                    this.f111405aI.dispose();
                    this.f111471q.mo80279i();
                }

                /* renamed from: n */
                public void mo80073n() {
                    mo80188ah();
                    if (C56216k.m102133c()) {
                        C39113c.m79407a(this.f111374E);
                    }
                    this.f111460bl = true;
                    this.f111439ar.mo65951a(this.f111447az);
                    if (((Boolean) C46832dk.f109107e.getValue()).booleanValue()) {
                        C58254p.f132679a.post(new RunnableC48204bg(this));
                    } else {
                        this.f111439ar.mo65952a(this.f111397aA);
                    }
                    this.f111402aF = C33947e.m69516a(this.f111310l, this.f111377H);
                    m91158aP();
                    mo80190aj();
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: q */
                public final void mo80226q() {
                    String str;
                    if (this.f111447az != null) {
                        m91170b(this.f111308j, this.f111309k);
                        if (this.f111308j != null && !m91162aT().booleanValue()) {
                            int i = 8;
                            if (this.f111308j.getPlaylist_info() != null) {
                                ConstraintLayout constraintLayout = this.f111371B;
                                if (!C50539g.m94744a(this.f111308j)) {
                                    i = 0;
                                }
                                constraintLayout.setVisibility(i);
                                if (this.f111403aG.eventType != null) {
                                    str = this.f111403aG.eventType;
                                } else {
                                    str = "";
                                }
                                C67110f.m118769a(this.f111308j, this.f111475u, this.f111371B, str);
                                return;
                            }
                            this.f111371B.setVisibility(8);
                        }
                    }
                }

                /* renamed from: aR */
                private void m91160aR() {
                    ViewGroup viewGroup;
                    if (this.f111458bj == null && !FeedParamProvider.C49809a.m93270a(this.f111436ao).isHideMusicText() && !m91180bi()) {
                        Widget e = C50162c.m94143e();
                        this.f111458bj = e;
                        this.f111397aA.mo60221b(R.id.fec, e);
                    }
                    if (!C49537z.m92776b() && (viewGroup = this.f111384O) != null) {
                        viewGroup.getLayoutParams().width = this.f111384O.getContext().getResources().getDimensionPixelSize(R.dimen.g0);
                    }
                    if (FeedParamProvider.C49809a.m93270a(this.f111436ao).isHideMusicText()) {
                        C58254p.m105190a().post(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.RunnableC4810011 */

                            static {
                                Covode.recordClassIndex(56840);
                            }

                            public final void run() {
                                VideoViewCell.this.f111384O.setPadding(VideoViewCell.this.f111384O.getLeft(), 0, VideoViewCell.this.f111384O.getRight(), 0);
                                ViewGroup.LayoutParams layoutParams = VideoViewCell.this.f111384O.getLayoutParams();
                                if (layoutParams instanceof FrameLayout.LayoutParams) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                    layoutParams2.topMargin = 0;
                                    layoutParams2.bottomMargin = 0;
                                }
                            }
                        });
                    }
                    if (this.f111459bk == null && !m91180bi() && !this.f111468g) {
                        Widget f = C50162c.m94144f();
                        this.f111459bk = f;
                        this.f111397aA.mo60221b(R.id.feb, f);
                    }
                    if (C16048b.m29633a().mo25421a(true, "marquee_title_opt", false) || C63303c.m114800a().f143683a == 2) {
                        C58254p.m105190a().post(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.RunnableC4810112 */

                            static {
                                Covode.recordClassIndex(56841);
                            }

                            public final void run() {
                                ViewGroup.LayoutParams layoutParams = VideoViewCell.this.f111384O.getLayoutParams();
                                layoutParams.width = C34728n.m70946a(250.0d);
                                VideoViewCell.this.f111384O.setLayoutParams(layoutParams);
                            }
                        });
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: aU */
                public void mo80182aM() {
                    AwemeTextLabelModel label;
                    C50539g.m94747c(this.f111308j);
                    List<AwemeLabelModel> videoLabels = this.f111308j.getVideoLabels();
                    if (this.f111308j.isAd() && !this.f111308j.getAwemeRawAd().isRightStyle() && (label = this.f111308j.getAwemeRawAd().getLabel()) != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(label);
                        this.f111308j.setTextVideoLabels(arrayList);
                    }
                    if (m91165aW() && C37699a.m76261ag(this.f111308j)) {
                        this.f111480z.setVisibility(8);
                    } else if ((!C13627m.m24499a(mo80197ar(), "homepage_hot") || m91165aW()) && !TextUtils.equals(mo80197ar(), "homepage_familiar") && !C37699a.m76221X(this.f111308j) && !TextUtils.equals(mo80197ar(), "challenge")) {
                        this.f111480z.mo61318b(this.f111308j, videoLabels, TagLayout.f81906f);
                    } else {
                        if (this.f111308j.getRelationLabel() != null && this.f111308j.getRelationLabel().getType() == 0 && TextUtils.equals(mo80197ar(), "homepage_familiar")) {
                            this.f111308j.setRelationLabel(null);
                        }
                        this.f111480z.mo61319c(this.f111308j, videoLabels, TagLayout.f81906f);
                    }
                    C38622af.m78382a(this.f111480z);
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: g */
                public void mo80072g() {
                    String str;
                    C17975i.f42801a = true;
                    this.f111439ar.mo65979l();
                    if (C50536e.m94741a(this.f111308j) && this.f111377H != null) {
                        C38000g.m77054e().mo65128a(this.f111436ao, this.f111308j, (View) this.f111377H, false);
                    }
                    this.f111447az.mo60191a("on_page_unselected", (Object) true);
                    VideoViewModel videoViewModel = this.f111420aY;
                    if (videoViewModel != null) {
                        videoViewModel.mo20662a(VideoViewModel.C48131i.f111520a);
                    }
                    AbstractC81915c.m141874a(new C36388d(this.f111308j.getAid()));
                    this.f111420aY.mo20662a(new VideoViewModel.C48129g(this.f111308j.getAid()));
                    C38000g.m77056g().mo28749a();
                    C72876a aVar = this.f111441at;
                    if (aVar != null) {
                        String str2 = null;
                        if (this.f111308j != null) {
                            str = this.f111308j.getAid();
                        } else {
                            str = null;
                        }
                        Aweme aweme = aVar.f163527a;
                        if (aweme != null) {
                            str2 = aweme.getAid();
                        }
                        if (C89219l.m154714a((Object) str, (Object) str2)) {
                            if (aVar.f163528b != null) {
                                DataCenter dataCenter = aVar.f163528b;
                                if (dataCenter != null) {
                                    dataCenter.mo60191a("viewholder_select_status_changed", (Object) false);
                                }
                            } else {
                                InteractStickerViewModel interactStickerViewModel = aVar.f163536j;
                                if (interactStickerViewModel != null) {
                                    interactStickerViewModel.mo115496a("viewholder_select_status_changed", (Object) false);
                                }
                            }
                        }
                    }
                    AbstractC62694c cVar = this.f111451bc;
                    if (cVar != null) {
                        cVar.mo63657b();
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: G */
                public void mo80180aK() {
                    if (mo80077K() && C35355j.m72358a()) {
                        C35355j.m72361c();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("eventType", mo80197ar());
                    bundle.putString("previousPage", m91167aY());
                    bundle.putString("from_group_id", m91168aZ());
                    bundle.putString("previousPagePosition", m91172ba());
                    bundle.putString("creationId", m91173bb());
                    bundle.putString("challengeId", m91174bc());
                    bundle.putString("extra_parent_tag_id", this.f111403aG.param.getParentTagId());
                    if (!m91180bi() && !this.f111468g && !mo80076J()) {
                        this.f111397aA.mo60221b(R.id.b17, new VideoFeedTagWidget());
                    }
                    if (!m91180bi()) {
                        this.f111397aA.mo60221b(R.id.alb, C50162c.m94138a(bundle, new C48221bx(this)));
                    }
                    if (!m91180bi()) {
                        this.f111397aA.mo60221b(R.id.dxw, C50162c.m94136a());
                    }
                    if (!m91180bi()) {
                        this.f111397aA.mo60221b(R.id.dhe, C50162c.m94145g());
                    }
                    if (!m91180bi()) {
                        this.f111397aA.mo60221b(R.id.cm0, C50162c.m94140b());
                    }
                    if (!m91180bi()) {
                        if (!mo80077K() || !C46748bt.m90115b()) {
                            this.f111397aA.mo60217a(this.f111475u, C50162c.m94142d());
                        } else {
                            C35355j.m72357a(new RunnableC48222by(this));
                        }
                    }
                    if (!m91180bi()) {
                        C58071d.m104907a();
                        if (C48957b.m92140a() && TextUtils.equals(mo80197ar(), "homepage_hot")) {
                            this.f111397aA.mo60221b(R.id.diq, C50162c.m94141c());
                        }
                    }
                    if (!m91180bi() || !C49531u.f113911a) {
                        this.f111397aA.mo60221b(R.id.fe_, C39189a.m79541a());
                    }
                    if (!m91180bi()) {
                        this.f111397aA.mo60221b(R.id.a9t, C50162c.m94146h());
                    }
                    if (C56216k.m102133c()) {
                        C39113c.m79407a(this.f111374E);
                    }
                    if (!m91180bi()) {
                        if (!mo80077K() || !C46748bt.m90116c()) {
                            View findViewById = this.f111377H.findViewById(R.id.ay1);
                            if (findViewById != null) {
                                this.f111397aA.mo60217a(findViewById, C50162c.m94147i());
                            }
                        } else {
                            C35355j.m72357a(new RunnableC48223bz(this));
                        }
                    }
                    if (!m91180bi()) {
                        this.f111397aA.mo60221b(R.id.oo, C50162c.m94148j());
                    }
                    if (!mo80077K() || !C46748bt.m90117d()) {
                        mo80189ai();
                    } else {
                        C35355j.m72357a(new RunnableC48231ca(this));
                    }
                    m91159aQ();
                    m91160aR();
                    if (!mo80077K() || !C46748bt.m90119f()) {
                        mo80184aO();
                    } else {
                        C35355j.m72357a(new RunnableC48232cb(this));
                    }
                    if (!mo80077K() || !C46748bt.m90118e()) {
                        mo80183aN();
                    } else {
                        C35355j.m72357a(new RunnableC48233cc(this));
                    }
                    mo80081f(this.f111468g);
                }

                /* JADX WARNING: Removed duplicated region for block: B:42:0x01d9  */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x020c  */
                /* JADX WARNING: Removed duplicated region for block: B:66:0x026c  */
                /* JADX WARNING: Removed duplicated region for block: B:69:0x0279  */
                /* JADX WARNING: Removed duplicated region for block: B:80:0x02bf  */
                /* renamed from: H */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo80069H() {
                    /*
                    // Method dump skipped, instructions count: 707
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.mo80069H():void");
                }

                public void bp_() {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    boolean z8;
                    int i;
                    String uniqueId;
                    String str;
                    String str2;
                    String str3;
                    int i2;
                    boolean z9;
                    FeedInterceptTouchLayout feedInterceptTouchLayout;
                    TextView textView;
                    String str4;
                    Resources resources;
                    MethodCollector.m26663i(5375);
                    ViewGroup viewGroup = this.f111375F;
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                    }
                    ImageView imageView = this.f111388S;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    Video video = this.f111308j.getVideo();
                    m91178bg();
                    Context context = this.f111436ao;
                    Aweme aweme = this.f111308j;
                    String ar = mo80197ar();
                    Boolean valueOf = Boolean.valueOf(C80580in.m139681a(aweme.getAuthorUid()));
                    if (!"homepage_hot".equals(ar) || valueOf.booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Boolean valueOf2 = Boolean.valueOf(z);
                    Boolean valueOf3 = Boolean.valueOf("homepage_follow".equals(ar));
                    if (!"chat_list".equals(ar) || valueOf.booleanValue()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    Boolean valueOf4 = Boolean.valueOf(z2);
                    if (!"notification_page".equals(ar) || valueOf.booleanValue()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    Boolean valueOf5 = Boolean.valueOf(z3);
                    if (!C76660b.m134246f() || valueOf.booleanValue() || (!"personal_homepage".equals(mo80197ar()) && !"others_homepage".equals(mo80197ar()))) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    Boolean valueOf6 = Boolean.valueOf(z4);
                    if (valueOf.booleanValue() || (!"following".equals(ar) && !"other_following".equals(ar))) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    Boolean valueOf7 = Boolean.valueOf(z5);
                    if (valueOf.booleanValue() || (!"fans".equals(ar) && !"other_fans".equals(ar))) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    Boolean valueOf8 = Boolean.valueOf(z6);
                    if (!(context instanceof ActivityC0945e) || !C76706a.m134278d(aweme) || (!valueOf2.booleanValue() && !valueOf3.booleanValue() && !valueOf4.booleanValue() && !valueOf5.booleanValue() && !valueOf6.booleanValue() && !valueOf7.booleanValue() && !valueOf8.booleanValue())) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (Boolean.valueOf(z7).booleanValue()) {
                        this.f111479y.setVisibility(0);
                        this.f111479y.setOnClickListener(new View$OnClickListenerC48208bk(this, context));
                    } else {
                        this.f111479y.setVisibility(8);
                    }
                    mo80182aM();
                    if (this.f111308j.isRelieve()) {
                        this.f111370A.setAnimation("anti_addiction_tag.json");
                        this.f111370A.mo5826a();
                        this.f111370A.mo5833b(true);
                        this.f111370A.setVisibility(0);
                    } else {
                        AnimationImageView animationImageView = this.f111370A;
                        if (animationImageView != null) {
                            try {
                                animationImageView.mo5836d();
                            } catch (NullPointerException e) {
                                C51423a.m95790a((Throwable) e);
                            }
                            this.f111370A.setVisibility(8);
                        }
                    }
                    if (SharePrefCache.inst().isOb().mo59941c().booleanValue()) {
                        this.f111478x.setVisibility(0);
                        this.f111478x.mo109008a(this.f111308j.getAid());
                    } else {
                        this.f111478x.setVisibility(8);
                    }
                    if (this.f111308j == null || this.f111308j.getCommerceVideoAuthInfo() == null || this.f111308j.getCommerceVideoAuthInfo().getDarkPostStatus() != 1) {
                        this.f111373D.setVisibility(8);
                    } else {
                        this.f111373D.setVisibility(0);
                    }
                    if (m91165aW()) {
                        this.f111371B.setVisibility(8);
                        this.f111432ak.setVisibility(8);
                        ConstraintLayout constraintLayout = this.f111433al;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                        }
                        this.f111439ar.mo65968c(this.f111308j);
                    } else {
                        this.f111372C.setVisibility(8);
                        this.f111432ak.setVisibility(8);
                        ConstraintLayout constraintLayout2 = this.f111433al;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(8);
                        }
                        this.f111431aj.setVisibility(8);
                        if (!C50545m.m94770g(this.f111308j) || this.f111308j.isProhibitedAndShouldTell() || C80635y.m139806a(this.f111308j) || C50539g.m94744a(this.f111308j)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        ConstraintLayout constraintLayout3 = this.f111371B;
                        if (z8) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        constraintLayout3.setVisibility(i);
                        if (C50545m.m94770g(this.f111308j)) {
                            Aweme aweme2 = this.f111308j;
                            ConstraintLayout constraintLayout4 = this.f111371B;
                            C89219l.m154721d(aweme2, "");
                            C89219l.m154721d(constraintLayout4, "");
                            TextView textView2 = (TextView) constraintLayout4.findViewById(R.id.f2w);
                            ImageView imageView2 = (ImageView) constraintLayout4.findViewById(R.id.ks);
                            C17191a.C17192a aVar = new C17191a.C17192a();
                            AwemeRiskModel awemeRiskModel = aweme2.getAwemeRiskModel();
                            C89219l.m154716b(awemeRiskModel, "");
                            String content = awemeRiskModel.getContent();
                            C89219l.m154716b(content, "");
                            C17191a aVar2 = aVar.mo27177a(content).f40973a;
                            C89219l.m154716b(textView2, "");
                            textView2.setText(aVar2);
                            C20766v a = C20761r.m39056a(2131231738);
                            a.f49092E = (SmartImageView) constraintLayout4.findViewById(R.id.bh1);
                            a.mo34186c();
                            AwemeRiskModel awemeRiskModel2 = aweme2.getAwemeRiskModel();
                            C89219l.m154716b(awemeRiskModel2, "");
                            if (!TextUtils.isEmpty(awemeRiskModel2.getUrl())) {
                                C89219l.m154716b(imageView2, "");
                                imageView2.setVisibility(0);
                                constraintLayout4.setOnClickListener(new C67110f.View$OnClickListenerC67114d(aweme2, constraintLayout4));
                                i2 = 1;
                            } else {
                                C89219l.m154716b(imageView2, "");
                                imageView2.setVisibility(8);
                                constraintLayout4.setOnClickListener(C67110f.View$OnClickListenerC67115e.f150524a);
                                i2 = 0;
                            }
                            C33744d a2 = new C33744d().mo59983a("group_id", aweme2.getAid());
                            AwemeRiskModel awemeRiskModel3 = aweme2.getAwemeRiskModel();
                            C89219l.m154716b(awemeRiskModel3, "");
                            C39162r.m79460a("info_bar_show", a2.mo59983a("content", awemeRiskModel3.getContent()).mo59980a("is_clickable", i2).f79943a);
                        } else if (TextUtils.isEmpty(C39223a.m79588b().mo68591a()) && !this.f111308j.isProhibitedAndShouldTell() && !C80635y.m139806a(this.f111308j) && !C50539g.m94744a(this.f111308j)) {
                            if (!m91162aT().booleanValue() && this.f111403aG.pageType != 30 && (this.f111308j.hasTrendingBar() || this.f111308j.hasTrendingBarFYP())) {
                                ViewGroup viewGroup2 = this.f111431aj;
                                Aweme aweme3 = this.f111308j;
                                String ar2 = mo80197ar();
                                C49812b bVar = this.f111403aG.param;
                                C89219l.m154721d(viewGroup2, "");
                                C89219l.m154721d(aweme3, "");
                                C89219l.m154721d(ar2, "");
                                C49726b.m93141a();
                                viewGroup2.setVisibility(0);
                                viewGroup2.removeAllViews();
                                C49729b.C49730a aVar3 = new C49729b.C49730a();
                                C89219l.m154721d(viewGroup2, "");
                                C89219l.m154721d(aweme3, "");
                                C89219l.m154721d(ar2, "");
                                C49729b.C49730a a3 = aVar3.mo81475a(new C49735c(10, new C49721a.C49722a(viewGroup2, aweme3, ar2, bVar)));
                                C89219l.m154721d(viewGroup2, "");
                                C89219l.m154721d(aweme3, "");
                                C89219l.m154721d(ar2, "");
                                C49729b.C49730a a4 = a3.mo81475a(new C49735c(9, new C49721a.C49724b(viewGroup2, aweme3, ar2, bVar)));
                                C49726b.C49727a aVar4 = new C49726b.C49727a(viewGroup2);
                                C89219l.m154721d(aVar4, "");
                                a4.f114453b = aVar4;
                                C49729b bVar2 = new C49729b(a4.f114452a);
                                bVar2.f114450c = a4.f114453b;
                                C49726b.f114444a = bVar2;
                                if (!bVar2.f114449b) {
                                    int keyAt = bVar2.f114451d.keyAt(0);
                                    if (!bVar2.f114449b && bVar2.f114451d.indexOfKey(keyAt) >= 0 && bVar2.f114451d.size() != 0) {
                                        bVar2.mo81474b();
                                        int indexOfKey = bVar2.f114451d.indexOfKey(keyAt);
                                        C49735c valueAt = bVar2.f114451d.valueAt(indexOfKey);
                                        C89219l.m154716b(valueAt, "");
                                        C49735c cVar = valueAt;
                                        bVar2.f114448a = cVar;
                                        cVar.mo81477a(new C49729b.C49734e(bVar2, indexOfKey));
                                        if (bVar2.f114450c != null && bVar2.f114450c == null) {
                                            C89219l.m154715b();
                                        }
                                    }
                                }
                            } else if (this.f111433al != null && C35479a.m72543a(this.f111308j)) {
                                Aweme aweme4 = this.f111308j;
                                ConstraintLayout constraintLayout5 = this.f111433al;
                                C89219l.m154721d(aweme4, "");
                                C89219l.m154721d(constraintLayout5, "");
                                try {
                                    IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                                    C89219l.m154716b(iESSettingsProxy, "");
                                    UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                                    if (awemeActivitySetting != null) {
                                        constraintLayout5.setVisibility(0);
                                        TuxTextView tuxTextView = (TuxTextView) constraintLayout5.findViewById(R.id.dh8);
                                        SmartImageView smartImageView = (SmartImageView) constraintLayout5.findViewById(R.id.dh7);
                                        C89219l.m154716b(tuxTextView, "");
                                        UgFeedBottomNoticeBar ugFeedBottomNoticeBar = awemeActivitySetting.getUgFeedBottomNoticeBar();
                                        if (ugFeedBottomNoticeBar == null || (str2 = ugFeedBottomNoticeBar.getText()) == null) {
                                            str2 = "";
                                        }
                                        tuxTextView.setText(str2);
                                        UgFeedBottomNoticeBar ugFeedBottomNoticeBar2 = awemeActivitySetting.getUgFeedBottomNoticeBar();
                                        if (ugFeedBottomNoticeBar2 == null || (str3 = ugFeedBottomNoticeBar2.getIcon()) == null) {
                                            str3 = "";
                                        }
                                        C20766v a5 = C20761r.m39061a(str3);
                                        a5.f49092E = smartImageView;
                                        a5.f49125v = EnumC20767w.CENTER_INSIDE;
                                        a5.mo34186c();
                                        constraintLayout5.setOnClickListener(new C35479a.View$OnClickListenerC35480a(constraintLayout5, awemeActivitySetting, aweme4));
                                        C39162r.m79460a("text_link_show", new C33744d().mo59983a("group_id", aweme4.getAid()).f79943a);
                                    }
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            } else if (!m91162aT().booleanValue() && this.f111308j.getPlaylist_info() != null) {
                                this.f111371B.setVisibility(0);
                                if (this.f111403aG.eventType != null) {
                                    str = this.f111403aG.eventType;
                                } else {
                                    str = "";
                                }
                                C67110f.m118769a(this.f111308j, this.f111475u, this.f111371B, str);
                            } else if (!m91162aT().booleanValue() && this.f111444aw.mo108903a(this.f111308j) && this.f111444aw.mo108905c().size() < 3 && !this.f111444aw.mo108906d() && mo80206b() != null && mo80206b().getAuthor() != null) {
                                this.f111432ak.setVisibility(0);
                                TuxTextView tuxTextView2 = (TuxTextView) this.f111432ak.findViewById(R.id.bai);
                                User author = mo80206b().getAuthor();
                                if (TextUtils.isEmpty(author.getUniqueId())) {
                                    uniqueId = author.getShortId();
                                } else {
                                    uniqueId = author.getUniqueId();
                                }
                                tuxTextView2.setText(this.f111436ao.getResources().getString(R.string.h8t, uniqueId));
                                this.f111432ak.setOnClickListener(new View.OnClickListener() {
                                    /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.View$OnClickListenerC4810213 */

                                    static {
                                        Covode.recordClassIndex(56842);
                                    }

                                    public final void onClick(View view) {
                                        ClickAgent.onClick(view);
                                        if (VideoViewCell.this.f111308j != null && VideoViewCell.this.f111308j.getStatus() != null && VideoViewCell.this.f111308j.getStatus().isAllowComment()) {
                                            VideoViewCell.this.f111447az.mo60191a("video_gift_stripe_show_comment_list_gift_panel", (Object) 58);
                                        }
                                    }
                                });
                            }
                        }
                        mo80220g(false);
                    }
                    if (this.f111432ak.getVisibility() == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.f111467f = z9;
                    if (!C59208ac.m108774h(this.f111308j) || !this.f111308j.isProhibited()) {
                        this.f111386Q.setVisibility(8);
                    } else {
                        this.f111386Q.setVisibility(0);
                        TextView textView3 = this.f111386Q;
                        double a6 = (double) C13628n.m24504a(this.f111436ao);
                        Double.isNaN(a6);
                        textView3.setWidth((int) (a6 * 0.56d));
                        if (!TextUtils.isEmpty(this.f111308j.getVideoDetailNotice())) {
                            this.f111386Q.setText(this.f111308j.getVideoDetailNotice());
                        } else {
                            this.f111386Q.setText(R.string.h8k);
                            C33830n.m69192a("notice_content_empty", "", new C33743c().mo59976a(StringSet.type, "video_detail_notice_bottom").mo59976a("log_id", this.f111308j.getRequestId()).mo59976a("item_id", this.f111308j.getAid()).mo59977a());
                        }
                    }
                    Integer num = (Integer) this.f111377H.getTag(R.id.b0v);
                    if (num != null) {
                        this.f111410aO = num.intValue();
                    }
                    mo80071a(video);
                    if (!(this.f111308j == null || this.f111377H == null || this.f111429ah == null)) {
                        Aweme aweme5 = this.f111308j;
                        FrameLayout frameLayout = this.f111377H;
                        ViewGroup viewGroup3 = this.f111429ah;
                        C89219l.m154721d(aweme5, "");
                        C89219l.m154721d(frameLayout, "");
                        if (viewGroup3 != null) {
                            if (aweme5.isScheduleVideo()) {
                                C89219l.m154721d(aweme5, "");
                                if (aweme5.isScheduleVideo() && (textView = (TextView) viewGroup3.findViewById(R.id.f30)) != null) {
                                    Context context2 = viewGroup3.getContext();
                                    if (context2 == null || (resources = context2.getResources()) == null) {
                                        str4 = null;
                                    } else {
                                        str4 = resources.getString(R.string.fee, C36139a.f85366a.format(Long.valueOf(aweme5.getScheduleTime() * 1000)));
                                    }
                                    textView.setText(str4);
                                }
                                viewGroup3.setVisibility(0);
                                View findViewById = frameLayout.findViewById(R.id.f31);
                                if (findViewById != null) {
                                    findViewById.setVisibility(0);
                                }
                                C36139a.m73618a(frameLayout, false);
                                if (C56216k.m102133c()) {
                                    FeedInterceptTouchLayout feedInterceptTouchLayout2 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.dxw);
                                    if (feedInterceptTouchLayout2 != null) {
                                        feedInterceptTouchLayout2.setGroupClickable(false);
                                    }
                                    FeedInterceptTouchLayout feedInterceptTouchLayout3 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.dxw);
                                    if (feedInterceptTouchLayout3 != null) {
                                        feedInterceptTouchLayout3.setHintTextRes(R.string.fek);
                                    }
                                }
                                C89219l.m154721d(frameLayout, "");
                                FeedInterceptTouchLayout feedInterceptTouchLayout4 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.b17);
                                if (feedInterceptTouchLayout4 != null) {
                                    feedInterceptTouchLayout4.setHintTextRes(R.string.fej);
                                }
                                FeedInterceptTouchLayout feedInterceptTouchLayout5 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.alb);
                                if (feedInterceptTouchLayout5 != null) {
                                    feedInterceptTouchLayout5.setHintTextRes(R.string.fei);
                                }
                                FeedInterceptTouchLayout feedInterceptTouchLayout6 = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.a9t);
                                if (feedInterceptTouchLayout6 != null) {
                                    feedInterceptTouchLayout6.setHintTextRes(R.string.feh);
                                }
                            } else {
                                viewGroup3.setVisibility(8);
                                View findViewById2 = frameLayout.findViewById(R.id.f31);
                                if (findViewById2 != null) {
                                    findViewById2.setVisibility(8);
                                }
                                C36139a.m73618a(frameLayout, true);
                                if (C56216k.m102133c() && (feedInterceptTouchLayout = (FeedInterceptTouchLayout) frameLayout.findViewById(R.id.dxw)) != null) {
                                    feedInterceptTouchLayout.setGroupClickable(true);
                                }
                            }
                        }
                    }
                    if (this.f111376G != null) {
                        if ((this.f111308j == null || !this.f111308j.isScheduleVideo()) && !C76706a.m134284j(this.f111308j) && ((!C76660b.m134242b() || !this.f111403aG.param.isStoryPage()) && (!C76706a.m134281g(this.f111308j) || !this.f111308j.isProhibited()))) {
                            this.f111376G.setListener(this.f111409aN);
                        } else {
                            this.f111376G.setListener(null);
                        }
                    }
                    if (this.f111410aO == 4) {
                        C58221f.m105153e().mo95704a(new BatteryTask()).mo95706a();
                    }
                    MethodCollector.m26664o(5375);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewCell$c */
                public class C48117c implements AbstractC75398a {
                    static {
                        Covode.recordClassIndex(56857);
                    }

                    private C48117c() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75398a
                    /* renamed from: a */
                    public final void mo80256a(boolean z) {
                        if (z) {
                            if (!VideoViewCell.m91169ak()) {
                                return;
                            }
                        } else if (VideoViewCell.m91169ak()) {
                            return;
                        }
                        if (VideoViewCell.this.f111401aE != null) {
                            VideoViewCell.this.f111401aE.mo81115a(VideoViewCell.this.f111308j, false, false);
                        }
                    }

                    /* synthetic */ C48117c(VideoViewCell videoViewCell, byte b) {
                        this();
                    }
                }

                /* renamed from: g */
                private boolean m91185g(int i) {
                    return this.f111462bn.get(i);
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void onPlayFailed(C84208l lVar) {
                    m91186h(3);
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                /* renamed from: b */
                public final void mo80123b(String str) {
                    if (this.f111307i != null) {
                        this.f111307i.adapterType = str;
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                /* renamed from: c */
                public final AbstractC48149ai mo80124c(String str) {
                    AbstractC48136a aVar = this.f111471q;
                    if (aVar != null) {
                        return aVar.mo80265a(str);
                    }
                    return null;
                }

                /* access modifiers changed from: package-private */
                /* renamed from: i */
                public final /* synthetic */ C89391z mo80223i(Aweme aweme) {
                    this.f111447az.mo60191a("social_video_tag_info", aweme);
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public void onPlayCompleted(String str) {
                    this.f111439ar.mo65932E();
                    this.f111471q.onPlayCompleted(str);
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public void onPreparePlay(String str) {
                    mo80216e("onPreparePlay");
                    this.f111466e = false;
                    AbstractC48136a aVar = this.f111471q;
                    if (aVar != null) {
                        aVar.onPreparePlay(str);
                    }
                }

                /* renamed from: a */
                private static boolean m91157a(UrlModel urlModel) {
                    if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
                        return false;
                    }
                    return true;
                }

                /* renamed from: c */
                private void m91181c(long j) {
                    long j2 = this.f111412aQ;
                    if (j2 > 0) {
                        this.f111411aP += j - j2;
                        mo80206b().getAid();
                        this.f111412aQ = 0;
                    }
                }

                /* renamed from: h */
                private void m91186h(int i) {
                    DataCenter dataCenter = this.f111447az;
                    if (dataCenter != null) {
                        dataCenter.mo60191a("pausePlayAnimation", Integer.valueOf(i));
                    }
                    VideoPlayViewModel videoPlayViewModel = this.f111421aZ;
                    if (videoPlayViewModel != null) {
                        videoPlayViewModel.mo80147a(i);
                    }
                    this.f111415aT = false;
                }

                /* renamed from: j */
                private void m91189j(boolean z) {
                    if (this.f111406aK != null) {
                        if (z) {
                            this.f111473s.setVisibility(0);
                        } else {
                            this.f111473s.setVisibility(8);
                        }
                        this.f111406aK.mo123872a(z);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
                /* renamed from: b */
                public final void mo80209b(Aweme aweme) {
                    DataCenter dataCenter = this.f111447az;
                    if (dataCenter != null) {
                        dataCenter.mo60191a("video_resume_play", aweme);
                    }
                    VideoPlayViewModel videoPlayViewModel = this.f111421aZ;
                    if (videoPlayViewModel != null) {
                        videoPlayViewModel.mo20662a(new VideoPlayViewModel.C48095i(aweme));
                    }
                    SmartImageView smartImageView = this.f111472r;
                    if (smartImageView != null) {
                        C48242ch.m91650a(smartImageView);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                /* renamed from: d */
                public final void mo80125d(Aweme aweme) {
                    if (aweme != null) {
                        this.f111308j = aweme;
                        if (!this.f111471q.mo80272b()) {
                            this.f111471q.mo80270a((AbstractC84295k) this);
                        }
                    }
                }

                /* renamed from: f */
                public Aweme mo80090f(int i) {
                    if (!C76706a.m134277c(this.f111308j)) {
                        return this.f111308j;
                    }
                    if (mo80105T() == null) {
                        return null;
                    }
                    return mo80105T().mo80206b();
                }

                /* renamed from: g */
                public final void mo80220g(boolean z) {
                    if (QnaService.m117969a().enablePublicQna() && this.f111310l.getActivity() != null) {
                        C50114bh.m94070a(this.f111310l, this.f111308j, this.f111434am, this.f111403aG.eventType, z);
                    }
                }

                @AbstractC90264r(mo145422a = ThreadMode.MAIN)
                public void onJsBroadCastEvent(C47959j jVar) {
                    if (!C48247d.f111777a && jVar.f111077b.optString("eventName") == C50555t.f116844a) {
                        C47036n.f109585a = true;
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public void onPlayCompletedFirstTime(String str) {
                    this.f111447az.mo60191a("play_complete_first_time", (Object) null);
                    this.f111447az.mo60191a("follow_button_interaction", C50323k.EnumC50325b.FINISH);
                    this.f111421aZ.mo20662a(VideoPlayViewModel.C48090d.f111362a);
                }

                /* renamed from: f */
                private void m91182f(String str) {
                    String f = C50545m.m94769f(this.f111308j);
                    C89219l.m154721d(str, "");
                    C50525aa.m94711c("hideCover " + f + ", source " + str);
                    SmartImageView smartImageView = this.f111472r;
                    if (smartImageView != null) {
                        smartImageView.setVisibility(8);
                    }
                }

                /* renamed from: i */
                private void m91188i(boolean z) {
                    this.f111430ai.getViewTreeObserver().removeOnGlobalLayoutListener(this.f111453be);
                    if (C50539g.m94750d(this.f111308j) && z) {
                        this.f111430ai.getViewTreeObserver().addOnGlobalLayoutListener(this.f111453be);
                        if (this.f111441at != null) {
                            float aA = mo80170aA();
                            this.f111400aD = aA;
                            this.f111441at.mo115246a((int) aA, this.f111377H.getHeight());
                        }
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: c */
                public final void mo80210c(int i) {
                    DataCenter dataCenter;
                    this.f111404aH = false;
                    mo80150B();
                    DataCenter dataCenter2 = this.f111447az;
                    if (dataCenter2 != null) {
                        dataCenter2.mo60191a("holder_on_resume", Integer.valueOf(i));
                    }
                    AbstractC62694c cVar = this.f111451bc;
                    if (cVar != null) {
                        cVar.mo63660e();
                    }
                    if (i == 2 || i == 1) {
                        this.f111439ar.mo65987t();
                    } else if (C16048b.m29633a().mo25421a(true, "stop_main_anim_when_invisible", false) && (dataCenter = this.f111447az) != null) {
                        dataCenter.mo60191a("recover_share_guide_animation", (Object) true);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: d */
                public final void mo80214d(boolean z) {
                    this.f111447az.mo60191a("load_progress_bar", Boolean.valueOf(z));
                    VideoViewModel videoViewModel = this.f111420aY;
                    if (videoViewModel != null) {
                        videoViewModel.mo20662a(new VideoViewModel.C48132j(z));
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
                /* renamed from: e */
                public final void mo80217e(boolean z) {
                    this.f111469h = z;
                    if (z) {
                        if (this.f111471q.mo80273c() != null) {
                            this.f111471q.mo80273c().mo129319g();
                        }
                    } else if (this.f111471q.mo80273c() != null) {
                        this.f111471q.mo80273c().mo129320h();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void onPausePlay(String str) {
                    m91186h(2);
                    this.f111439ar.mo65929A();
                    m91181c(System.currentTimeMillis());
                    AbstractC48136a aVar = this.f111471q;
                    if (aVar != null) {
                        aVar.onPausePlay(str);
                    }
                    VideoPlaySearchViewModel videoPlaySearchViewModel = this.f111449ba;
                    if (videoPlaySearchViewModel != null) {
                        videoPlaySearchViewModel.mo20662a(VideoPlaySearchViewModel.C48081b.f111354a);
                    }
                }

                /* renamed from: f */
                private void mo80081f(boolean z) {
                    if (z) {
                        this.f111374E.setVisibility(8);
                        ((FeedInterceptTouchLayout) this.f111377H.findViewById(R.id.fe_)).setGroupClickable(false);
                        ((FeedInterceptTouchLayout) this.f111377H.findViewById(R.id.c34)).setGroupClickable(false);
                        ((FeedInterceptTouchLayout) this.f111377H.findViewById(R.id.fec)).setGroupClickable(false);
                    }
                }

                /* renamed from: g */
                private void m91184g(String str) {
                    C51423a.m95784a(4, "FeedAvatarView", "VideoViewCell rev liveData!");
                    DataCenter dataCenter = this.f111447az;
                    if (dataCenter != null) {
                        dataCenter.mo60191a("dismiss_dou_pop", (Object) true);
                    }
                    C49669ad adVar = new C49669ad(this.f111436ao.hashCode(), this.f111454bf);
                    if (!TextUtils.isEmpty(str)) {
                        adVar.f114314c = str;
                    }
                    C49668ac acVar = new C49668ac(mo80197ar(), C50565z.m94797a(this.f111454bf));
                    mo80197ar();
                    C48164as.m91483a(acVar, adVar);
                }

                /* renamed from: i */
                private void m91187i(int i) {
                    String str;
                    JSONObject jSONObject = this.f111438aq;
                    if (jSONObject != null) {
                        try {
                            str = jSONObject.getString("request_id");
                        } catch (JSONException e) {
                            e.printStackTrace();
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f111308j.setRequestId(str);
                        }
                    }
                    IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                    if (createIIMServicebyMonsterPlugin != null && createIIMServicebyMonsterPlugin.isNeedToContinuePlayInAct()) {
                        createIIMServicebyMonsterPlugin.setNeedToContinuePlayInAct(false);
                    }
                    if (this.f111437ap != null && this.f111308j != null) {
                        this.f111437ap.mo63634a(new C49672ag(i, mo80090f(i)));
                    }
                }

                /* access modifiers changed from: protected */
                /* renamed from: e */
                public void mo80216e(String str) {
                    boolean z;
                    SmartImageView smartImageView;
                    SmartImageView smartImageView2;
                    String f = C50545m.m94769f(this.f111308j);
                    C89219l.m154721d(str, "");
                    C50525aa.m94711c("showCover " + f + ", source " + str);
                    AbstractC33200b N = this.f111439ar.mo65937N();
                    if (N == null || !N.mo59127a(this.f111308j)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if ((!this.f111445ax || z) && (smartImageView2 = this.f111472r) != null) {
                        smartImageView2.setVisibility(8);
                    } else if ((!this.f111466e || !mo80197ar().equals("playlist")) && (smartImageView = this.f111472r) != null) {
                        smartImageView.setVisibility(0);
                    }
                }

                /* access modifiers changed from: protected */
                /* renamed from: h */
                public void mo80222h(Aweme aweme) {
                    if (!m91180bi() && C50539g.m94744a(aweme)) {
                        if (!m91185g(0)) {
                            this.f111462bn.put(0, true);
                            this.f111397aA.mo60217a(this.f111475u, new VPAInfoBarWidget());
                        }
                        if (!m91185g(1) && C39223a.m79591e().mo68728c() == 3) {
                            this.f111462bn.put(1, true);
                            this.f111397aA.mo60217a(this.f111377H, new VPAOptedOutMaskWidget());
                        }
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void onPlayProgressChange(float f) {
                    if (!(this.f111308j == null || this.f111308j.getVideo() == null)) {
                        double duration = (double) ((((float) this.f111308j.getVideo().getDuration()) * (f / 100.0f)) / 1000.0f);
                        if (this.f111457bi < Math.floor(duration)) {
                            this.f111447az.mo60191a("action_video_on_play_progress_change", new C0692e(Float.valueOf(f), Double.valueOf(duration)));
                            this.f111421aZ.mo20662a(new VideoPlayViewModel.C48089c(f));
                            this.f111421aZ.mo20662a(new VideoPlayViewModel.C48088b(duration));
                        }
                        this.f111457bi = duration;
                    }
                    this.f111471q.onPlayProgressChange(f);
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public void onResumePlay(String str) {
                    this.f111439ar.mo65993z();
                    if (this.f111454bf == 2 || this.f111466e) {
                        m91182f("onResumePlay");
                    } else if (C49495aa.m92735b()) {
                        C51423a.m95791b(4, "VideoViewCell", "onResumePlay without calling hideCover in " + mo80197ar() + ", sourceId is " + str);
                    }
                    DataCenter dataCenter = this.f111447az;
                    if (dataCenter != null) {
                        dataCenter.mo60191a("in_video_view_holder", (Object) true);
                    }
                    this.f111421aZ.mo20662a(VideoPlayViewModel.C48093g.f111365a);
                    this.f111412aQ = System.currentTimeMillis();
                    mo80206b().getAid();
                    AbstractC48136a aVar = this.f111471q;
                    if (aVar != null) {
                        aVar.onResumePlay(str);
                    }
                }

                public VideoViewCell(C48238ce ceVar) {
                    super(ceVar);
                    View view = ceVar.f111744a;
                    this.f111382M = (FrameLayout) view.findViewById(R.id.d3e);
                    this.f111378I = (FrameLayout) view.findViewById(R.id.e9y);
                    this.f111379J = (FrameLayout) view.findViewById(R.id.e_c);
                    this.f111380K = (FrameLayout) view.findViewById(R.id.e_l);
                    this.f111471q = mo80157a(ceVar);
                    this.f111310l = ceVar.f111746c;
                    this.f111447az = DataCenter.m69492a(C33946d.m69514a(this.f111310l, this), this.f111310l);
                    this.f111437ap = ceVar.f111745b;
                    this.f111403aG = ceVar.f111748e;
                    AbstractC37879bc a = mo80156a(ceVar.f111744a, ceVar.f111745b, this.f111310l);
                    this.f111439ar = a;
                    a.mo65957a(this.f111403aG.param);
                    this.f111471q.f111526a = this.f111447az;
                    m91158aP();
                    C35351h.m72351a(new RunnableC48203bf(this, ceVar));
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public AbstractC48136a mo80157a(C48238ce ceVar) {
                    FrameLayout frameLayout = this.f111382M;
                    C89219l.m154721d(frameLayout, "");
                    C89219l.m154721d(this, "");
                    C89219l.m154721d(ceVar, "");
                    if (ceVar.f111756m != 16) {
                        return new C48139c(frameLayout, this);
                    }
                    Context context = frameLayout.getContext();
                    C89219l.m154716b(context, "");
                    return new C48137b(context);
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: b */
                public final void mo80207b(int i) {
                    DataCenter dataCenter;
                    this.f111404aH = true;
                    if (this.f111471q.mo80272b()) {
                        View y = this.f111471q.mo80234y();
                        if (y.getVisibility() != 8) {
                            C34729o.m70955a(y, 8);
                        }
                    }
                    if (!(i == 4 || i == 5)) {
                        this.f111439ar.mo65990w();
                    }
                    AbstractC62694c cVar = this.f111451bc;
                    if (cVar != null) {
                        cVar.mo63659d();
                    }
                    if (i == 1) {
                        if (C16048b.m29633a().mo25421a(true, "stop_main_anim_when_invisible", false) && (dataCenter = this.f111447az) != null) {
                            dataCenter.mo60191a("pause_share_guide_animation", (Object) true);
                        }
                    } else if (i != 6) {
                        if (i == 5) {
                            m91166aX();
                        } else {
                            m91186h(1);
                        }
                        DataCenter dataCenter2 = this.f111447az;
                        if (dataCenter2 != null) {
                            dataCenter2.mo60191a("holder_on_pause", (Object) true);
                            this.f111447az.mo60191a("in_video_view_holder", (Object) false);
                        }
                        this.f111420aY.mo20662a(VideoViewModel.C48127e.f111516a);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: c */
                public final void mo80211c(Aweme aweme) {
                    if (this.f111436ao != null && aweme != null) {
                        DataCenter dataCenter = this.f111447az;
                        if (dataCenter != null) {
                            dataCenter.mo60191a("handle_double_click", aweme);
                        }
                        VideoViewModel videoViewModel = this.f111420aY;
                        if (videoViewModel != null) {
                            videoViewModel.mo20662a(new VideoViewModel.C48126d(aweme));
                        }
                        if (this.f111403aG.isPlayListCleanMode().booleanValue()) {
                        }
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: d */
                public final void mo80213d(int i) {
                    mo80222h(this.f111308j);
                    mo80219g(this.f111308j);
                    DataCenter dataCenter = this.f111447az;
                    if (dataCenter != null) {
                        dataCenter.mo60191a("on_viewpager_page_selected", (Object) null);
                        VideoViewModel videoViewModel = this.f111420aY;
                        if (videoViewModel != null) {
                            videoViewModel.mo20662a(new VideoViewModel.C48130h(i));
                        }
                    }
                    if (this.f111467f) {
                        Set<String> c = this.f111444aw.mo108905c();
                        boolean d = this.f111444aw.mo108906d();
                        if (c == null || c.size() >= 3 || d) {
                            ConstraintLayout constraintLayout = this.f111432ak;
                            if (constraintLayout != null) {
                                constraintLayout.setVisibility(8);
                            }
                        } else {
                            c.add(this.f111308j.getAid());
                            this.f111444aw.mo108901a(c);
                            if (this.f111308j != null) {
                                C33744d a = new C33744d().mo59983a("enter_from", mo80197ar()).mo59983a("group_id", C59208ac.m108771e(this.f111308j)).mo59983a("author_id", C59208ac.m108758a(this.f111308j)).mo59983a("user_id", C31575b.m65865g().getCurUserId());
                                int i2 = 1;
                                if (this.f111308j.getFollowStatus() != 1) {
                                    i2 = 0;
                                }
                                C39162r.m79460a("show_video_gift_stripe", a.mo59980a("is_follow", i2).mo59980a("is_like", this.f111308j.isLike() ? 1 : 0).f79943a);
                            }
                        }
                    }
                    this.f111456bh = C50532ah.m94725a(this.f111308j);
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50087aw
                /* renamed from: h */
                public final Void mo80221h(boolean z) {
                    ValueAnimator ofFloat;
                    if (C49525p.m92762b()) {
                        if (C48022b.m91033b() == 0) {
                            this.f111476v.setBackgroundResource(R.drawable.a0o);
                            if (z) {
                                int b = C13628n.m24521b(this.f111436ao);
                                this.f111476v.getLayoutParams().height = (b * 3) / 5;
                                return null;
                            }
                            this.f111476v.getLayoutParams().height = (int) C13628n.m24520b(this.f111436ao, 356.0f);
                            return null;
                        }
                        m91176be();
                        return null;
                    } else if (C49525p.m92763c()) {
                        if (z) {
                            this.f111476v.setBackgroundResource(R.drawable.a0k);
                        } else {
                            this.f111476v.setBackgroundResource(R.drawable.a0o);
                        }
                        m91176be();
                        return null;
                    } else if (!C49525p.m92764d()) {
                        return null;
                    } else {
                        final Boolean valueOf = Boolean.valueOf(z);
                        if (valueOf.booleanValue()) {
                            ofFloat = ValueAnimator.ofFloat(0.18f, C49525p.m92761a());
                        } else {
                            ofFloat = ValueAnimator.ofFloat(C49525p.m92761a(), 0.18f);
                        }
                        ofFloat.addUpdateListener(new C48212bo(this));
                        ofFloat.addListener(new AnimatorListenerAdapter() {
                            /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.C481105 */

                            static {
                                Covode.recordClassIndex(56850);
                            }

                            public final void onAnimationStart(Animator animator) {
                                super.onAnimationStart(animator);
                                if (valueOf.booleanValue()) {
                                    VideoViewCell.this.f111476v.setBackgroundResource(R.drawable.tk);
                                    VideoViewCell.this.f111476v.getLayoutParams().height = C13628n.m24521b(VideoViewCell.this.f111436ao);
                                    return;
                                }
                                VideoViewCell.this.f111476v.setBackgroundResource(R.drawable.a0o);
                                VideoViewCell.this.f111476v.getLayoutParams().height = (int) C13628n.m24520b(VideoViewCell.this.f111436ao, 356.0f);
                            }
                        });
                        ofFloat.start();
                        return null;
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a6, code lost:
                    if (((com.p2082ss.android.ugc.aweme.main.CleanModeManager2) r0).f134230c != false) goto L_0x01a8;
                 */
                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo70614a(int r10) {
                    /*
                    // Method dump skipped, instructions count: 453
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.mo70614a(int):void");
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: b */
                public void mo80094b(long j) {
                    this.f111447az.mo60191a("hide_commerce_second_info", (Object) null);
                    m91189j(false);
                    C38622af.m78382a(this.f111480z);
                    m91181c(j);
                    long j2 = this.f111411aP;
                    this.f111411aP = 0;
                    if (j2 > 0 && j2 < InteractFirstFrameTimeOutDurationSetting.DEFAULT && this.f111455bg && !TextUtils.isEmpty(mo80197ar()) && this.f111308j != null && !TextUtils.isEmpty(this.f111308j.getAid())) {
                        C49653t.m93096a(new C49648o(this.f111308j.getAid(), 2, j, mo80197ar()));
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: c */
                public final void mo80212c(boolean z) {
                    this.f111439ar.mo65967b(z);
                    if (z) {
                        C48245ck.f111771a = true;
                        this.f111476v.animate().alpha(0.0f).setDuration(200).start();
                        this.f111477w.animate().alpha(0.0f).setDuration(200).start();
                        this.f111470p.animate().alpha(0.0f).setDuration(200).start();
                        this.f111464c = true;
                        return;
                    }
                    C48245ck.f111771a = false;
                    this.f111476v.animate().alpha(1.0f).setDuration(200).start();
                    this.f111477w.animate().alpha(1.0f).setDuration(200).start();
                    this.f111470p.setVisibility(0);
                    this.f111470p.animate().alpha(1.0f).setDuration(200).start();
                    if (this.f111464c) {
                        this.f111464c = false;
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
                /* renamed from: f */
                public final void mo80218f(Aweme aweme) {
                    boolean z;
                    if (this.f111308j != null && aweme != null && TextUtils.equals(this.f111308j.getAid(), aweme.getAid()) && this.f111447az != null) {
                        this.f111308j.setCmtSwt(aweme.isCmtSwt());
                        this.f111308j.setAwemeACLShareInfo(aweme.getAwemeACLShareInfo());
                        if (aweme.getStatus() != null) {
                            AwemeStatus status = this.f111308j.getStatus();
                            if (status == null) {
                                status = new AwemeStatus();
                            }
                            status.setDownloadStatus(aweme.getStatus().getDownloadStatus());
                            status.setAllowShare(aweme.getStatus().isAllowShare());
                            this.f111308j.setStatus(status);
                        }
                        if (aweme.getCommerceVideoAuthInfo() != null) {
                            C37437a commerceVideoAuthInfo = this.f111308j.getCommerceVideoAuthInfo();
                            if (commerceVideoAuthInfo == null) {
                                commerceVideoAuthInfo = new C37437a();
                            }
                            commerceVideoAuthInfo.setPreventShare(aweme.getCommerceVideoAuthInfo().isPreventShare());
                            this.f111308j.setCommerceVideoAuthInfo(commerceVideoAuthInfo);
                        }
                        if (!(!C37699a.m76318w(this.f111308j) || aweme.getAuthor() == null || this.f111308j.getAuthor() == null || this.f111439ar.mo65941R() == 4)) {
                            this.f111308j.getAuthor().roomId = aweme.getAuthor().roomId;
                            C37699a.m76258ad(this.f111308j);
                            try {
                                final C2954a aVar = new C2954a();
                                aVar.f8697b = Long.parseLong(aweme.getAuthor().getUid());
                                aVar.f8696a = aweme.getAuthor().roomId;
                                if (!aweme.getAuthor().isLive()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                aVar.f8698c = z;
                                C34727m.m70944a(new Runnable() {
                                    /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.RunnableC481116 */

                                    static {
                                        Covode.recordClassIndex(56851);
                                    }

                                    public final void run() {
                                        AbstractC81915c.m141874a(aVar);
                                        VideoViewCell.this.f111439ar.mo65942S();
                                    }
                                });
                            } catch (Exception unused) {
                            }
                        }
                        this.f111308j.setDuetSetting(aweme.getDuetSetting());
                        this.f111308j.setStitchSetting(aweme.getStitchSetting());
                        this.f111308j.setWithPromotionalMusic(aweme.isWithPromotionalMusic());
                        this.f111308j.setStatistics(aweme.getStatistics());
                        this.f111447az.mo60191a("awesome_update_data", this.f111307i);
                        VideoViewModel videoViewModel = this.f111420aY;
                        if (videoViewModel != null) {
                            videoViewModel.mo20662a(new VideoViewModel.C48133k(this.f111307i));
                        }
                    }
                }

                /* access modifiers changed from: protected */
                /* renamed from: g */
                public void mo80219g(Aweme aweme) {
                    if (!m91185g(2) && C80635y.m139812g(aweme)) {
                        this.f111462bn.put(2, true);
                        if (!m91180bi()) {
                            this.f111397aA.mo60217a(this.f111377H, new ReportVideoMaskWidget());
                        }
                    }
                    if (!m91185g(4) && C80635y.m139813h(aweme)) {
                        this.f111462bn.put(4, true);
                        if (!m91180bi()) {
                            this.f111397aA.mo60217a(this.f111377H, new GeneralVideoMaskWidget());
                        }
                    }
                    if (!m91180bi() && !m91185g(5) && C80635y.m139814i(aweme)) {
                        this.f111462bn.put(5, true);
                        this.f111397aA.mo60217a(this.f111377H, new PhotosensitiveVideoMaskWidget());
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void onRenderFirstFrame(C84216o oVar) {
                    int i;
                    String str;
                    this.f111435an = System.currentTimeMillis();
                    m91182f("onRenderFirstFrame");
                    this.f111466e = true;
                    final Aweme aweme = this.f111308j;
                    if (C46825dd.f109090c) {
                        C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.RunnableC481072 */

                            static {
                                Covode.recordClassIndex(56847);
                            }

                            public final void run() {
                                VideoViewCell.this.mo80096e(aweme);
                            }
                        }, 300);
                        C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.RunnableC481083 */

                            static {
                                Covode.recordClassIndex(56848);
                            }

                            public final void run() {
                                VideoViewCell.this.mo80201av();
                            }
                        }, 500);
                    } else {
                        mo80096e(this.f111308j);
                        mo80201av();
                    }
                    m91189j(true);
                    DataCenter dataCenter = this.f111447az;
                    if (dataCenter != null) {
                        dataCenter.mo60191a("in_video_view_holder", (Object) true);
                    }
                    this.f111421aZ.mo20662a(VideoPlayViewModel.C48091e.f111363a);
                    if (this.f111310l.getActivity() != null && this.f111309k == 0) {
                        MainPageExperimentServiceImpl.m108379b();
                        if (TextUtils.equals(mo80197ar(), "homepage_follow")) {
                            FollowPageFirstFrameViewModel.m138884a(this.f111310l.getActivity());
                        }
                    }
                    if (!(this.f111308j == null || this.f111308j.getVideo() == null)) {
                        int l = C81079v.m140776O().mo123889l();
                        int m = C81079v.m140776O().mo123890m();
                        if (l <= 0 || m <= 0) {
                            C51423a.m95791b(5, "VideoViewCell", "video Player size is wrong, aid is " + C50545m.m94769f(this.f111308j));
                        } else {
                            int width = this.f111308j.getVideo().getWidth();
                            int height = this.f111308j.getVideo().getHeight();
                            if (width <= 0 || height <= 0) {
                                i = 1;
                            } else if ((width > height && l < m) || (width < height && l > m)) {
                                i = 2;
                            } else if (C48243ci.m91651a(width, height, l, m)) {
                                i = 3;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("aweme_id", C50545m.m94769f(this.f111308j));
                                jSONObject.put("aweme_position", this.f111309k);
                                jSONObject.put("video_server_width", width);
                                jSONObject.put("video_server_height", height);
                                jSONObject.put("video_player_width", l);
                                jSONObject.put("video_player_height", m);
                                jSONObject.put("event_type", mo80197ar());
                                JSONObject jSONObject2 = this.f111438aq;
                                if (jSONObject2 == null) {
                                    str = "";
                                } else {
                                    str = jSONObject2.optString("request_id");
                                }
                                jSONObject.put("request_id", str);
                                C51423a.m95791b(4, "VideoViewCell", "video_view_size_mismatch ".concat(String.valueOf(jSONObject)));
                                C12290b.m22060a("video_view_size_mismatch", i, jSONObject);
                            } catch (Exception e) {
                                C51423a.m95786a(e);
                            }
                            if (i > 1) {
                                C51423a.m95791b(5, "VideoViewCell", "video_view_size_mismatch, but current strategy does not handle it");
                            } else if (!(this.f111308j == null || this.f111308j.getVideo() == null)) {
                                this.f111308j.getVideo().setWidth(l);
                                this.f111308j.getVideo().setHeight(m);
                                UrlModel originCover = this.f111308j.getVideo().getOriginCover();
                                if (originCover != null) {
                                    originCover.setWidth(l);
                                    originCover.setHeight(m);
                                }
                                try {
                                    this.f111440as.mo81412a(this.f111436ao, this.f111308j.getVideo(), this.f111471q.mo80234y(), this.f111472r, this.f111308j.getOcrLocation());
                                } catch (Exception e2) {
                                    C51423a.m95788a("", e2);
                                }
                            }
                        }
                    }
                    View view = this.f111395Z;
                    LinearLayout linearLayout = this.f111374E;
                    if (C50561z.f116851a && linearLayout != null) {
                        linearLayout.getLocationOnScreen(C50561z.f116854d);
                    }
                    if (C50561z.f116852b && view != null) {
                        view.getLocationOnScreen(C50561z.f116853c);
                    }
                    AbstractC48136a aVar = this.f111471q;
                    if (aVar != null) {
                        aVar.onRenderFirstFrame(oVar);
                    }
                    ((AbstractC67849c) ServiceManager.get().getService(AbstractC67849c.class)).mo106975a(oVar.getId());
                    int i2 = C48342a.f112043b ^ 1;
                    C48342a.f112043b = i2;
                    if (i2 == 3) {
                        SystemClock.uptimeMillis();
                        C48342a.m91803a();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai
                /* renamed from: b */
                public void mo80095b(boolean z) {
                    DataCenter dataCenter;
                    this.f111419aX = z;
                    mo80093a(this.f111470p, z);
                    this.f111439ar.mo65961a(z);
                    if (z && (dataCenter = this.f111447az) != null) {
                        dataCenter.mo60191a("dismiss_dou_pop", (Object) true);
                    }
                    if (TextUtils.equals(mo80197ar(), "homepage_follow")) {
                        C51423a.m95791b(3, "VideoViewCell", "openCleanMode in position " + this.f111309k + ", clean is" + z);
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:169:0x02a1, code lost:
                    if (r2 == null) goto L_0x02a3;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:186:0x02d0, code lost:
                    if (r2 == null) goto L_0x02d2;
                 */
                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onRenderReady(com.p2082ss.android.ugc.playerkit.model.C84215n r21) {
                    /*
                    // Method dump skipped, instructions count: 836
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell.onRenderReady(com.ss.android.ugc.playerkit.model.n):void");
                }

                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public final /* synthetic */ void mo80208b(C48238ce ceVar) {
                    boolean z;
                    View view;
                    C12814b bVar;
                    MethodCollector.m26663i(7040);
                    C89219l.m154721d(this, "");
                    AbstractC89277c a = C89204ab.m154669a(VideoPlayViewModel.class);
                    this.f111421aZ = (VideoPlayViewModel) new C14522f(a, new VideoPlayViewModel.C48082a.C48084b(this, a), VideoPlayViewModel.C48082a.C48085c.INSTANCE, new VideoPlayViewModel.C48082a.C48086d(this), this, VideoPlayViewModel.C48082a.C48087e.INSTANCE, VideoPlayViewModel.C48082a.C48083a.INSTANCE).getValue();
                    C89219l.m154721d(this, "");
                    AbstractC89277c a2 = C89204ab.m154669a(VideoViewModel.class);
                    this.f111420aY = (VideoViewModel) new C14522f(a2, new VideoViewModel.C48118a.C48120b(this, a2), VideoViewModel.C48118a.C48121c.INSTANCE, new VideoViewModel.C48118a.C48122d(this), this, VideoViewModel.C48118a.C48123e.INSTANCE, VideoViewModel.C48118a.C48119a.INSTANCE).getValue();
                    C89219l.m154721d(this, "");
                    AbstractC89277c a3 = C89204ab.m154669a(VideoEventDispatchViewModel.class);
                    this.f111450bb = (VideoEventDispatchViewModel) new C14522f(a3, new VideoEventDispatchViewModel.C48048a.C48050b(this, a3), VideoEventDispatchViewModel.C48048a.C48051c.INSTANCE, new VideoEventDispatchViewModel.C48048a.C48052d(this), this, VideoEventDispatchViewModel.C48048a.C48053e.INSTANCE, VideoEventDispatchViewModel.C48048a.C48049a.INSTANCE).getValue();
                    if (ceVar.f111746c != null) {
                        Fragment fragment = ceVar.f111746c;
                        C89219l.m154721d(fragment, "");
                        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
                        AbstractC89277c a4 = C89204ab.m154669a(VideoPlaySearchViewModel.class);
                        VideoPlaySearchViewModel.C48066a.C48067a aVar2 = new VideoPlaySearchViewModel.C48066a.C48067a(a4);
                        VideoPlaySearchViewModel.C48066a.C48073g gVar = VideoPlaySearchViewModel.C48066a.C48073g.INSTANCE;
                        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
                            bVar = new C12814b(a4, aVar2, VideoPlaySearchViewModel.C48066a.C48074h.INSTANCE, new VideoPlaySearchViewModel.C48066a.C48075i(fragment), new VideoPlaySearchViewModel.C48066a.C48076j(fragment), VideoPlaySearchViewModel.C48066a.C48077k.INSTANCE, gVar, new VideoPlaySearchViewModel.C48066a.C48078l(fragment), new VideoPlaySearchViewModel.C48066a.C48079m(fragment));
                        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
                            bVar = new C12814b(a4, aVar2, VideoPlaySearchViewModel.C48066a.C48080n.INSTANCE, new VideoPlaySearchViewModel.C48066a.C48068b(fragment), new VideoPlaySearchViewModel.C48066a.C48069c(fragment), VideoPlaySearchViewModel.C48066a.C48070d.INSTANCE, gVar, new VideoPlaySearchViewModel.C48066a.C48071e(fragment), new VideoPlaySearchViewModel.C48066a.C48072f(fragment));
                        } else {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Do not support this scope here.");
                            MethodCollector.m26664o(7040);
                            throw illegalArgumentException;
                        }
                        this.f111449ba = (VideoPlaySearchViewModel) bVar.getValue();
                    }
                    View view2 = ceVar.f111744a;
                    this.f111436ao = view2.getContext();
                    AbstractC49691s<C49672ag> sVar = ceVar.f111745b;
                    View.OnTouchListener onTouchListener = ceVar.f111747d;
                    Fragment fragment2 = ceVar.f111746c;
                    BaseFeedPageParams baseFeedPageParams = ceVar.f111748e;
                    if (TextUtils.equals("from_publish_add_video", baseFeedPageParams.param.getFrom())) {
                        this.f111468g = true;
                    }
                    AbstractC49439l lVar = ceVar.f111749f;
                    C49617c cVar = ceVar.f111750g;
                    View.OnTouchListener onTouchListener2 = ceVar.f111751h;
                    if (onTouchListener2 != null) {
                        this.f111408aM = onTouchListener2;
                    } else {
                        this.f111408aM = new View$OnTouchListenerC17271b();
                    }
                    LongPressLayout.AbstractC50014a aVar3 = ceVar.f111752i;
                    if (aVar3 == null) {
                        aVar3 = new C48202be(baseFeedPageParams, this.f111436ao);
                    }
                    this.f111409aN = aVar3;
                    this.f111403aG = baseFeedPageParams;
                    this.f111454bf = baseFeedPageParams.awemeFromPage;
                    this.f111401aE = lVar;
                    if (cVar == null) {
                        this.f111440as = new C49617c();
                        int i = Build.VERSION.SDK_INT;
                        C49617c.m93044a(this.f111436ao);
                    }
                    try {
                        this.f111470p = (RelativeLayout) view2.findViewById(R.id.fir);
                        this.f111472r = (SmartImageView) view2.findViewById(R.id.afn);
                        this.f111474t = (ViewGroup) view2.findViewById(R.id.fdr);
                        this.f111475u = (FrameLayout) view2.findViewById(R.id.u2);
                        this.f111476v = view2.findViewById(R.id.bbq);
                        this.f111477w = view2.findViewById(R.id.bbs);
                        this.f111478x = (RestrictTextView) view2.findViewById(R.id.f2k);
                        this.f111479y = view2.findViewById(R.id.e_2);
                        this.f111480z = (TagLayout) view2.findViewById(R.id.fe0);
                        this.f111370A = (AnimationImageView) view2.findViewById(R.id.fdf);
                        this.f111371B = (ConstraintLayout) view2.findViewById(R.id.b0z);
                        this.f111372C = (LinearLayout) view2.findViewById(R.id.e3);
                        this.f111373D = (LinearLayout) view2.findViewById(R.id.ak2);
                        this.f111374E = (LinearLayout) view2.findViewById(R.id.dke);
                        this.f111375F = (ViewGroup) view2.findViewById(R.id.p7);
                        this.f111376G = (LongPressLayout) view2.findViewById(R.id.ch5);
                        this.f111377H = (FrameLayout) view2.findViewById(R.id.ffz);
                        if (this.f111378I == null) {
                            this.f111378I = (FrameLayout) view2.findViewById(R.id.e9y);
                        }
                        if (this.f111379J == null) {
                            this.f111379J = (FrameLayout) view2.findViewById(R.id.e_c);
                        }
                        if (this.f111380K == null) {
                            this.f111380K = (FrameLayout) view2.findViewById(R.id.e_l);
                        }
                        this.f111381L = (FrameLayout) view2.findViewById(R.id.d9r);
                        this.f111382M = (FrameLayout) view2.findViewById(R.id.d3e);
                        this.f111383N = (RelativeLayout) view2.findViewById(R.id.emc);
                        this.f111384O = (ViewGroup) view2.findViewById(R.id.fec);
                        this.f111385P = (ViewGroup) view2.findViewById(R.id.apf);
                        this.f111386Q = (TextView) view2.findViewById(R.id.f8d);
                        this.f111387R = view2.findViewById(R.id.oo);
                        this.f111388S = (ImageView) view2.findViewById(R.id.bvl);
                        this.f111389T = view2.findViewById(R.id.dxk);
                        this.f111390U = (TuxIconView) view2.findViewById(R.id.dxu);
                        this.f111391V = (TuxIconView) view2.findViewById(R.id.avv);
                        this.f111392W = (TextView) view2.findViewById(R.id.f93);
                        this.f111393X = view2.findViewById(R.id.fce);
                        this.f111394Y = (TuxTextView) view2.findViewById(R.id.dxl);
                        this.f111395Z = view2.findViewById(R.id.c34);
                        this.f111422aa = (FrameLayout) view2.findViewById(R.id.bp8);
                        this.f111423ab = (ImageView) view2.findViewById(R.id.aeo);
                        this.f111424ac = (ImageView) view2.findViewById(R.id.aep);
                        this.f111425ad = (ImageView) view2.findViewById(R.id.aek);
                        this.f111426ae = (ImageView) view2.findViewById(R.id.ael);
                        this.f111427af = (DebugInfoView) view2.findViewById(R.id.ahp);
                        this.f111428ag = (FrameLayout) view2.findViewById(R.id.aaj);
                        this.f111429ah = (ViewGroup) view2.findViewById(R.id.b12);
                        this.f111430ai = (Space) view2.findViewById(R.id.d2c);
                        this.f111431aj = (ViewGroup) view2.findViewById(R.id.v0);
                        this.f111434am = (LinearLayout) view2.findViewById(R.id.dbd);
                        this.f111432ak = (ConstraintLayout) view2.findViewById(R.id.bah);
                        this.f111433al = (ConstraintLayout) view2.findViewById(R.id.dh6);
                        this.f111434am = (LinearLayout) view2.findViewById(R.id.dbd);
                        this.f111452bd = (FrameLayout) view2.findViewById(R.id.fc4);
                        View findViewById = view2.findViewById(R.id.title);
                        if (findViewById != null) {
                            findViewById.setOnClickListener(new View$OnClickListenerC48215br(this));
                        }
                    } catch (IllegalStateException unused) {
                        C58292e.m105313a(getClass().getName(), view2, this.f111436ao, 0);
                    }
                    this.f111443av = new C48201bd(this.f111394Y, this.f111389T, this.f111390U, this.f111391V, this.f111392W, this.f111475u, new SparseArray());
                    LongPressLayout longPressLayout = this.f111376G;
                    if (longPressLayout != null) {
                        longPressLayout.setListener(this.f111409aN);
                    }
                    if (!C31575b.m65865g().isLogin() || !C13627m.m24499a(C17867d.f42595s, "lark_inhouse")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f111396a = z;
                    AbstractC37879bc a5 = mo80156a(view2, sVar, fragment2);
                    this.f111439ar = a5;
                    a5.mo65957a(this.f111403aG.param);
                    if (this.f111471q == null) {
                        this.f111471q = mo80157a(ceVar);
                    }
                    int b = C48022b.m91033b();
                    if (b == 0) {
                        this.f111476v.setBackgroundResource(R.drawable.a0o);
                        this.f111476v.getLayoutParams().height = (int) C13628n.m24520b(this.f111436ao, 356.0f);
                    } else if (b != 1) {
                        float f = 0.18f;
                        if (b == 2) {
                            view = this.f111476v;
                        } else if (b == 3) {
                            view = this.f111476v;
                            BottomGradualOptimizeConfig a6 = C48022b.m91032a();
                            if (a6 != null) {
                                float opacity = a6.getOpacity();
                                if (opacity >= 0.18f && opacity <= 0.24f) {
                                    f = a6.getOpacity();
                                }
                            }
                        }
                        view.setBackgroundDrawable(C50096a.m94050a(((int) Math.ceil((double) (f * 255.0f))) << 24));
                    } else {
                        this.f111476v.setBackgroundResource(R.drawable.a0o);
                    }
                    if (C49525p.m92764d()) {
                        this.f111476v.setOnClickListener(new View$OnClickListenerC48213bp(this));
                    }
                    this.f111477w.setBackgroundResource(R.drawable.a0p);
                    this.f111477w.getLayoutParams().height = (int) C13628n.m24520b(this.f111436ao, 136.0f);
                    this.f111310l = fragment2;
                    if (SharePrefCache.inst().getShowPlayerInfoUI().mo59941c().booleanValue()) {
                        if (this.f111473s == null) {
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C13628n.m24520b(this.f111436ao, 300.0f), (int) C13628n.m24520b(this.f111436ao, 500.0f));
                            layoutParams.topMargin = (int) C13628n.m24520b(this.f111436ao, 80.0f);
                            this.f111473s = new FrameLayout(this.f111436ao);
                            int b2 = (int) C13628n.m24520b(this.f111436ao, 8.0f);
                            this.f111473s.setPadding(b2, b2, b2, b2);
                            this.f111377H.addView(this.f111473s, layoutParams);
                        }
                        this.f111406aK = new C80727b(this.f111436ao, this.f111473s);
                    }
                    this.f111437ap = sVar;
                    if (TextUtils.equals("upload", mo80197ar())) {
                        this.f111403aG.setEventType(null);
                    }
                    this.f111376G.setTapListener(onTouchListener);
                    mo80074o();
                    this.f111450bb.f111326j = new C48216bs(this);
                    this.f111450bb.f111327k = new C48217bt(this);
                    this.f111471q.f111526a = this.f111447az;
                    if (AbstractC48234cd.C48235a.f111739b.get(this.f111436ao) == null) {
                        AbstractC48234cd.C48235a.f111739b.put(this.f111436ao, new C13605d<>());
                    }
                    AbstractC48234cd.C48235a.f111739b.get(this.f111436ao).mo21864a(this);
                    this.f111307i = VideoItemParams.newBuilder(baseFeedPageParams, this.f111439ar, fragment2, this.f111446ay, this.f111447az, this);
                    this.f111480z.setEventType(mo80197ar());
                    this.f111480z.setFeedFromPage(this.f111454bf);
                    this.f111480z.setFromPostPage(this.f111403aG.isFromPostList);
                    this.f111416aU = ScrollSwitchStateManager.C52950a.m97811a(fragment2.getActivity());
                    fragment2.getActivity().getClass().getName();
                    fragment2.getClass().getName();
                    this.f111416aU.mo89360g(fragment2, new C48218bu(this));
                    MethodCollector.m26664o(7040);
                }

                /* renamed from: a */
                private static String m91155a(Intent intent, String str) {
                    try {
                        return intent.getStringExtra(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }

                /* renamed from: b */
                private void m91170b(Aweme aweme, int i) {
                    this.f111447az.mo60191a("video_params", this.f111307i);
                    mo80111a(i, aweme);
                    if (mo80077K()) {
                        SystemClock.uptimeMillis();
                        int i2 = C48342a.f112043b ^ 2;
                        C48342a.f112043b = i2;
                        if (i2 == 3) {
                            C48342a.m91803a();
                        }
                    }
                }

                /* renamed from: b */
                private void m91171b(boolean z, boolean z2) {
                    if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableStudioScreenRightCorner()) {
                        C34729o.m70959b(false, this.f111423ab, this.f111425ad, this.f111424ac, this.f111426ae);
                        return;
                    }
                    C34729o.m70959b(z, this.f111423ab, this.f111424ac);
                    C34729o.m70959b(z2, this.f111425ad, this.f111426ae);
                }

                @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
                /* renamed from: a */
                public final void mo60625a(int i, int i2) {
                    this.f111407aL = true;
                    if (C17964b.f42785d) {
                        return;
                    }
                    if (C48342a.f112042a) {
                        C58254p.m105190a().post(new RunnableC48210bm(this));
                        C58254p.m105190a().post(new RunnableC48211bn(this));
                        return;
                    }
                    m91187i(0);
                    mo80172aC();
                }

                /* renamed from: a */
                private static JSONObject m91156a(Aweme aweme, BaseFeedPageParams baseFeedPageParams, String str) {
                    return C50541i.m94754a(aweme, baseFeedPageParams.pageType, str, baseFeedPageParams.eventType);
                }

                @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                public void onPlayProgressChange(String str, long j, long j2) {
                    this.f111471q.onPlayProgressChange(str, j, j2);
                }

                /* renamed from: a */
                public AbstractC37879bc mo80156a(View view, AbstractC49691s<C49672ag> sVar, Fragment fragment) {
                    return C49912a.m93713a().mo84950a().mo80292a(this, view, this.f111403aG.pageType, mo80197ar(), sVar, fragment);
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                /* renamed from: a */
                public final void mo80110a(int i, long j, long j2, int i2, long j3, long j4, long j5, int i3) {
                    C39162r.m79460a("cla_caption_switch_language_success", new C33744d().mo59983a("enter_from", mo80197ar()).mo59983a("group_id", C59208ac.m108771e(this.f111308j)).mo59983a("author_id", C59208ac.m108758a(this.f111308j)).mo59980a("is_success", i).mo59980a("enable_experiment", C16048b.m29633a().mo25412a(true, "player_enable_opt_subload_time", 1)).mo59981a("duration", j).mo59981a("load_duration", j2).mo59980a("is_display_ontime", i2).mo59981a("fst_display_position", j3).mo59981a("fst_line_position", j4).mo59981a("position_lag", j5).mo59980a("cla_pre_cache_size", i3).f79943a);
                }

                @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
                /* renamed from: a */
                public final void mo80112a(int i, String str, long j, long j2, int i2, long j3, long j4, long j5, int i3) {
                    if (this.f111418aW != -1) {
                        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.f111418aW);
                        this.f111418aW = -1;
                        C39162r.m79460a("cla_caption_load_time", new C33744d().mo59983a("enter_from", mo80197ar()).mo59983a("group_id", C59208ac.m108771e(this.f111308j)).mo59983a("author_id", C59208ac.m108758a(this.f111308j)).mo59982a("load_duration", valueOf).mo59980a("enable_experiment", C16048b.m29633a().mo25412a(true, "player_enable_opt_subload_time", 1)).mo59983a("play_sess", str).mo59981a("duration", j).mo59981a("load_duration", j2).mo59980a("is_display_ontime", i2).mo59981a("fst_display_position", j3).mo59981a("fst_line_position", j4).mo59981a("position_lag", j5).mo59980a("cla_pre_cache_size", i3).f79943a);
                    }
                    C39162r.m79460a("cla_caption_load_success", new C33744d().mo59983a("enter_from", mo80197ar()).mo59983a("group_id", C59208ac.m108771e(this.f111308j)).mo59983a("author_id", C59208ac.m108758a(this.f111308j)).mo59980a("is_success", i).mo59980a("enable_experiment", C16048b.m29633a().mo25412a(true, "player_enable_opt_subload_time", 1)).f79943a);
                }
            }
