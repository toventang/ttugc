package com.p2082ss.android.ugc.aweme.feed.p2963q;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.reflect.C13638c;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.p1196b.C17156b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18026g;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23319b;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.C34406ba;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.UgAllServiceImpl;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.adaptation.RunnableC33410d;
import com.p2082ss.android.ugc.aweme.adaptation.RunnableC33411e;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.livedata.C34603a;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35197k;
import com.p2082ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36179e;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36386b;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36389e;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36392g;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36416b;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36493c;
import com.p2082ss.android.ugc.aweme.commercialize.C37608b;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37832b;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37835d;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37836e;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37838g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37873az;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.commercialize.feed.timegap.AdShowTimeGapManager;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38684bk;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38699bq;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38740e;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38884aj;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38886c;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.C38887d;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.net.C39148c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39106g;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39107h;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39108i;
import com.p2082ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractC41360al;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractC41361am;
import com.p2082ss.android.ugc.aweme.discover.mob.C42454f;
import com.p2082ss.android.ugc.aweme.experiment.C46796cm;
import com.p2082ss.android.ugc.aweme.experiment.C46841dn;
import com.p2082ss.android.ugc.aweme.experiment.C46847dp;
import com.p2082ss.android.ugc.aweme.experiment.C46902eq;
import com.p2082ss.android.ugc.aweme.experiment.C46919ez;
import com.p2082ss.android.ugc.aweme.experiment.C46920f;
import com.p2082ss.android.ugc.aweme.experiment.C46924fc;
import com.p2082ss.android.ugc.aweme.experiment.C47008he;
import com.p2082ss.android.ugc.aweme.experiment.C47036n;
import com.p2082ss.android.ugc.aweme.feed.AbstractC49420e;
import com.p2082ss.android.ugc.aweme.feed.C48317al;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48145ae;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48247d;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a;
import com.p2082ss.android.ugc.aweme.feed.background.C49283a;
import com.p2082ss.android.ugc.aweme.feed.background.C49286c;
import com.p2082ss.android.ugc.aweme.feed.cache.C49300d;
import com.p2082ss.android.ugc.aweme.feed.cache.C49326i;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49495aa;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49502ae;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49527r;
import com.p2082ss.android.ugc.aweme.feed.guide.C49594i;
import com.p2082ss.android.ugc.aweme.feed.guide.p2947a.AbstractC49583a;
import com.p2082ss.android.ugc.aweme.feed.helper.C49619e;
import com.p2082ss.android.ugc.aweme.feed.helper.C49628k;
import com.p2082ss.android.ugc.aweme.feed.helper.C49648o;
import com.p2082ss.android.ugc.aweme.feed.helper.C49653t;
import com.p2082ss.android.ugc.aweme.feed.helper.C49656u;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.feed.model.GreenScreenMaterial;
import com.p2082ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.p2082ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49418a;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49432e;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49433f;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49670ae;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49675c;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49679g;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49680h;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49684l;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49686n;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49689q;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49690r;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49693u;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49695w;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49696x;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49746c;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49747d;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49749f;
import com.p2082ss.android.ugc.aweme.feed.p2957n.C49753i;
import com.p2082ss.android.ugc.aweme.feed.p2968t.C49932a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49990v;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49962af;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49964ag;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49993y;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49995z;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50114bh;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50131bn;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50323k;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.VideoDownloadStatusBar;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.AbstractC50421b;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.C50418a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.NewUserFeedProgressBar;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50453c;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50524a;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50528ad;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50535d;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50537f;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50541i;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50546n;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50550r;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50555t;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.p2979x.CallableC50549q;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.service.C49912a;
import com.p2082ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.legacy.AbTestManagerImpl;
import com.p2082ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.p2082ss.android.ugc.aweme.login.p3423a.C58953a;
import com.p2082ss.android.ugc.aweme.login.p3423a.C58954b;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.C59038ax;
import com.p2082ss.android.ugc.aweme.main.C59063c;
import com.p2082ss.android.ugc.aweme.main.C59092g;
import com.p2082ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.p2082ss.android.ugc.aweme.main.p3428b.C59043a;
import com.p2082ss.android.ugc.aweme.main.p3429c.C59064a;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.metrics.C59261w;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59387a;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59390d;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59392f;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59401a;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59403c;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59404d;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59409i;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59410j;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.button.C33212c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33206c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2294c.C33215a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33133p;
import com.p2082ss.android.ugc.aweme.p2310al.C33489d;
import com.p2082ss.android.ugc.aweme.p2433ca.C35351h;
import com.p2082ss.android.ugc.aweme.p2726da.C40928a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56251d;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56259l;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56261n;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadCommentV2Experiment;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadProfileV2Experiment;
import com.p2082ss.android.ugc.aweme.p3682s.C67246b;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.p3682s.C67261e;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79639a;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79642b;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79648d;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79656f;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79657g;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79664i;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79665j;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79667k;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79668l;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79673m;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.SwipeUpGuideStrengthenLayout;
import com.p2082ss.android.ugc.aweme.player.C62890a;
import com.p2082ss.android.ugc.aweme.player.C62933c;
import com.p2082ss.android.ugc.aweme.player.C62956e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.preload.p3563a.C63311a;
import com.p2082ss.android.ugc.aweme.preload.p3563a.C63329e;
import com.p2082ss.android.ugc.aweme.preload.p3564b.C63332a;
import com.p2082ss.android.ugc.aweme.preload.p3564b.C63339b;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.service.IFeedDebugService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68021bg;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68068c;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.share.C68859af;
import com.p2082ss.android.ugc.aweme.share.C68955h;
import com.p2082ss.android.ugc.aweme.share.model.C69329a;
import com.p2082ss.android.ugc.aweme.share.model.C69332d;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68906a;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.share.p3747e.C68919a;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3866b.C72889a;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.PollStruct;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.live.C77354d;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80316cv;
import com.p2082ss.android.ugc.aweme.utils.C80390ej;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80631v;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.C80750l;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.local.C80771f;
import com.p2082ss.android.ugc.aweme.video.preload.C80860b;
import com.p2082ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.q.a */
public abstract class AbstractC49815a extends AbstractC49887w implements WeakHandler.IHandler, C33403c.AbstractC33409e, AbstractC39103d<Aweme>, AbstractC49439l, AbstractC49691s<C49672ag>, AbstractC49849am, AbstractC49990v, VideoDownloadStatusBar.AbstractC50021c, AbstractC50421b, AbstractC63854r, AbstractC68021bg, AbstractC68021bg, AbstractC90252i, AbstractC90253j {

    /* renamed from: J */
    protected static final String f114752J = AbstractC49815a.class.getSimpleName();

    /* renamed from: k */
    private static boolean f114753k = false;

    /* renamed from: A */
    private C79642b f114754A;

    /* renamed from: B */
    private int f114755B;

    /* renamed from: K */
    public long f114756K;

    /* renamed from: L */
    protected boolean f114757L;

    /* renamed from: M */
    public LoadMoreFrameLayout f114758M;

    /* renamed from: N */
    public VerticalViewPager f114759N;

    /* renamed from: O */
    protected View f114760O;

    /* renamed from: P */
    protected View f114761P;

    /* renamed from: Q */
    protected VideoDownloadStatusBar f114762Q;

    /* renamed from: R */
    protected ViewStub f114763R;

    /* renamed from: S */
    protected NewUserFeedProgressBar f114764S;

    /* renamed from: T */
    protected ViewStub f114765T;

    /* renamed from: U */
    protected FeedSwipeRefreshLayout f114766U;

    /* renamed from: V */
    protected DiggLayout f114767V;

    /* renamed from: W */
    public AbstractC48191b f114768W;

    /* renamed from: X */
    protected boolean f114769X;

    /* renamed from: Y */
    public int f114770Y;

    /* renamed from: Z */
    protected WeakHandler f114771Z;

    /* renamed from: a */
    private final float f114772a;

    /* renamed from: aA */
    public boolean f114773aA;

    /* renamed from: aB */
    public boolean f114774aB;

    /* renamed from: aC */
    public boolean f114775aC;

    /* renamed from: aD */
    Runnable f114776aD;

    /* renamed from: aE */
    protected String f114777aE;

    /* renamed from: aF */
    protected AbstractC34638b f114778aF;

    /* renamed from: aG */
    public boolean f114779aG;

    /* renamed from: aH */
    protected final AbstractC49420e f114780aH;

    /* renamed from: aI */
    protected Boolean f114781aI;

    /* renamed from: aJ */
    public C49812b f114782aJ;

    /* renamed from: aK */
    public C49445o f114783aK;

    /* renamed from: aL */
    protected final C49432e f114784aL;

    /* renamed from: aM */
    public boolean f114785aM;

    /* renamed from: aN */
    public int f114786aN;

    /* renamed from: aO */
    protected AbstractC49583a f114787aO;

    /* renamed from: aP */
    protected boolean f114788aP;

    /* renamed from: aQ */
    protected boolean f114789aQ;

    /* renamed from: aR */
    protected boolean f114790aR;

    /* renamed from: aS */
    protected boolean f114791aS;

    /* renamed from: aT */
    protected boolean f114792aT;

    /* renamed from: aU */
    public boolean f114793aU;

    /* renamed from: aV */
    protected C69488a f114794aV;

    /* renamed from: aW */
    protected boolean f114795aW;

    /* renamed from: aX */
    public String f114796aX;

    /* renamed from: aY */
    protected AbstractC48149ai f114797aY;

    /* renamed from: aZ */
    protected int f114798aZ;

    /* renamed from: aa */
    protected String f114799aa;

    /* renamed from: ab */
    public boolean f114800ab;

    /* renamed from: ac */
    public boolean f114801ac;

    /* renamed from: ad */
    public boolean f114802ad;

    /* renamed from: ae */
    public Set<String> f114803ae;

    /* renamed from: af */
    final ArrayList<String> f114804af;

    /* renamed from: ag */
    protected boolean f114805ag;

    /* renamed from: ah */
    public String f114806ah;

    /* renamed from: ai */
    public String f114807ai;

    /* renamed from: aj */
    AbstractC23317a f114808aj;

    /* renamed from: ak */
    public boolean f114809ak;

    /* renamed from: al */
    public boolean f114810al;

    /* renamed from: am */
    protected boolean f114811am;

    /* renamed from: an */
    View f114812an;

    /* renamed from: ao */
    View f114813ao;

    /* renamed from: ap */
    ViewGroup f114814ap;

    /* renamed from: aq */
    ViewGroup f114815aq;

    /* renamed from: ar */
    protected AbstractC49746c f114816ar;

    /* renamed from: as */
    public AbstractC49747d f114817as;

    /* renamed from: at */
    public AbstractC49749f f114818at;

    /* renamed from: au */
    ImageView f114819au;

    /* renamed from: av */
    protected AbstractC51754w f114820av;

    /* renamed from: aw */
    protected C17156b f114821aw;

    /* renamed from: ax */
    protected boolean f114822ax;

    /* renamed from: ay */
    protected boolean f114823ay;

    /* renamed from: az */
    public boolean f114824az;

    /* renamed from: b */
    private C49995z f114825b;

    /* renamed from: ba */
    protected boolean f114826ba;

    /* renamed from: bb */
    protected boolean f114827bb;

    /* renamed from: bc */
    public boolean f114828bc;

    /* renamed from: bd */
    public boolean f114829bd;

    /* renamed from: be */
    public Object f114830be;

    /* renamed from: bf */
    boolean f114831bf;

    /* renamed from: bg */
    public boolean f114832bg;

    /* renamed from: bh */
    public boolean f114833bh;

    /* renamed from: bi */
    public boolean f114834bi;

    /* renamed from: bj */
    public boolean f114835bj;

    /* renamed from: bk */
    protected boolean f114836bk;

    /* renamed from: bl */
    int f114837bl;

    /* renamed from: bm */
    public boolean f114838bm;

    /* renamed from: bn */
    public int f114839bn;

    /* renamed from: bo */
    public final VerticalViewPager.AbstractC39186f f114840bo;

    /* renamed from: bp */
    public String f114841bp;

    /* renamed from: bq */
    public boolean f114842bq;

    /* renamed from: br */
    protected C49932a f114843br;

    /* renamed from: bs */
    protected C79648d f114844bs;

    /* renamed from: bt */
    protected C79668l f114845bt;

    /* renamed from: c */
    private C49418a f114846c;

    /* renamed from: d */
    private C49964ag f114847d;

    /* renamed from: e */
    private Handler f114848e;

    /* renamed from: f */
    private final Runnable f114849f;

    /* renamed from: g */
    private final C37608b f114850g;

    /* renamed from: h */
    private boolean f114851h;

    /* renamed from: i */
    private C50131bn f114852i;

    /* renamed from: j */
    private boolean f114853j;

    /* renamed from: l */
    private int f114854l;

    /* renamed from: m */
    private AbstractC49851ao f114855m;

    /* renamed from: n */
    private AbstractC80747i f114856n;

    /* renamed from: o */
    private String f114857o;

    /* renamed from: p */
    private final C49862ax f114858p;

    /* renamed from: q */
    private long f114859q;

    /* renamed from: r */
    private final IAccountService.AbstractC31272b f114860r;

    /* renamed from: s */
    private final long f114861s;

    /* renamed from: t */
    private final C50524a f114862t;

    /* renamed from: u */
    private Aweme f114863u;

    /* renamed from: v */
    private final List<Callable> f114864v;

    /* renamed from: w */
    private Boolean f114865w;

    /* renamed from: x */
    private boolean f114866x;

    /* renamed from: y */
    private final String f114867y;

    /* renamed from: z */
    private final String f114868z;

    /* renamed from: A */
    public void mo70435A() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: E */
    public boolean mo70439E() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an
    /* renamed from: F */
    public abstract boolean mo70440F();

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public ViewGroup mo70447N() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public boolean mo70450Q() {
        return true;
    }

    /* renamed from: S */
    public boolean mo70452S() {
        return false;
    }

    /* renamed from: a */
    public abstract AbstractC48191b mo70459a(Context context, LayoutInflater layoutInflater, AbstractC49691s<C49672ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, AbstractC49439l lVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70463a(int i, boolean z) {
    }

    /* renamed from: a */
    public void mo70464a(long j, long j2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w
    public final boolean aE_() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    public void aF_() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aQ */
    public void mo84709aQ() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: ac */
    public boolean mo70411ac() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: ap */
    public final String mo81091ap() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: aq */
    public final String mo81092aq() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: ar */
    public final String mo81093ar() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: bF */
    public void mo84731bF() {
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.AbstractC68021bg
    /* renamed from: bI */
    public final void mo84734bI() {
        f114753k = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an
    /* renamed from: bK */
    public final void mo84736bK() {
        this.f114842bq = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bS */
    public final /* synthetic */ void mo84744bS() {
        this.f114826ba = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.C33403c.AbstractC33409e
    public void bs_() {
    }

    /* renamed from: c */
    public abstract void mo70479c(int i);

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: d */
    public void mo70485d(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49990v
    /* renamed from: d */
    public void mo70486d(Exception exc) {
    }

    /* renamed from: e */
    public void mo70490e(int i) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(86, new RunnableC90250g(AbstractC49815a.class, "onDeleteAwemeEventOnBase", C49677e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(87, new RunnableC90250g(AbstractC49815a.class, "onCleanModeChangedEvent", C59064a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(88, new RunnableC90250g(AbstractC49815a.class, "onDismissEnterMusicGuideEvent", C59043a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(89, new RunnableC90250g(AbstractC49815a.class, "onShareFinished", C68919a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(90, new RunnableC90250g(AbstractC49815a.class, "onCommentBubbleItemClicked", C36386b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(91, new RunnableC90250g(AbstractC49815a.class, "onFakeSwipeEvent", C79639a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new RunnableC90250g(AbstractC49815a.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(92, new RunnableC90250g(AbstractC49815a.class, "onEvent", C33212c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(93, new RunnableC90250g(AbstractC49815a.class, "onEvent", C56251d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(94, new RunnableC90250g(AbstractC49815a.class, "onEvent", C56259l.class, ThreadMode.POSTING, 0, false));
        hashMap.put(12, new RunnableC90250g(AbstractC49815a.class, "onAwesomeSplashEvent", C18017a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(95, new RunnableC90250g(AbstractC49815a.class, "onDismissInteractStickerPop", C49680h.class, ThreadMode.POSTING, 0, false));
        hashMap.put(96, new RunnableC90250g(AbstractC49815a.class, "onLandPagePopupWebShowEvent", C35197k.class, ThreadMode.POSTING, 0, false));
        hashMap.put(97, new RunnableC90250g(AbstractC49815a.class, "onPrivateModelEvent", C49695w.class, ThreadMode.POSTING, 0, false));
        hashMap.put(98, new RunnableC90250g(AbstractC49815a.class, "onTabSwitched", C69332d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(99, new RunnableC90250g(AbstractC49815a.class, "onAdFeedRefreshEvent", C33215a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(100, new RunnableC90250g(AbstractC49815a.class, "onAddVideoToMixEvent", C59401a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(101, new RunnableC90250g(AbstractC49815a.class, "onEvent", C33489d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(102, new RunnableC90250g(AbstractC49815a.class, "initTopPageEvent", C49675c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(103, new RunnableC90250g(AbstractC49815a.class, "onEvent", C56261n.class, ThreadMode.POSTING, 0, false));
        hashMap.put(104, new RunnableC90250g(AbstractC49815a.class, "onCommentListPageDialogEvent", C36389e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(105, new RunnableC90250g(AbstractC49815a.class, "onEvent", C38886c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(106, new RunnableC90250g(AbstractC49815a.class, "onLoginPageCloseEvent", C58953a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(107, new RunnableC90250g(AbstractC49815a.class, "onBottomTabClicked", C68955h.class, ThreadMode.POSTING, 0, false));
        hashMap.put(108, new RunnableC90250g(AbstractC49815a.class, "onCreateMixListSuccess", C59404d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(109, new RunnableC90250g(AbstractC49815a.class, "onFeedDislikeEventEvent", C49684l.class, ThreadMode.POSTING, 0, false));
        hashMap.put(110, new RunnableC90250g(AbstractC49815a.class, "onFakeLabelEvent", C36392g.class, ThreadMode.POSTING, 0, false));
        hashMap.put(111, new RunnableC90250g(AbstractC49815a.class, "onEvent", C49696x.class, ThreadMode.POSTING, 0, false));
        hashMap.put(112, new RunnableC90250g(AbstractC49815a.class, "onPopUpShowEvent", C79664i.class, ThreadMode.POSTING, 0, false));
        hashMap.put(113, new RunnableC90250g(AbstractC49815a.class, "onEvent", C49670ae.class, ThreadMode.POSTING, 0, false));
        hashMap.put(114, new RunnableC90250g(AbstractC49815a.class, "onEvent", C49686n.class, ThreadMode.POSTING, 0, false));
        hashMap.put(58, new RunnableC90250g(AbstractC49815a.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(115, new RunnableC90250g(AbstractC49815a.class, "onDismissEnterMusicGuideEvent", C49679g.class, ThreadMode.POSTING, 0, false));
        hashMap.put(116, new RunnableC90250g(AbstractC49815a.class, "onTabChangeEvent", C79673m.class, ThreadMode.POSTING, 0, false));
        hashMap.put(117, new RunnableC90250g(AbstractC49815a.class, "onEvent", C37838g.class, ThreadMode.POSTING, 0, false));
        hashMap.put(48, new RunnableC90250g(AbstractC49815a.class, "onPublishStatus", C71900f.class, ThreadMode.POSTING, -1, true));
        hashMap.put(118, new RunnableC90250g(AbstractC49815a.class, "onTopViewLiveEnd", C18026g.class, ThreadMode.POSTING, 0, false));
        hashMap.put(2, new RunnableC90250g(AbstractC49815a.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(119, new RunnableC90250g(AbstractC49815a.class, "onUpdateMixVideoDesc", C59410j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(120, new RunnableC90250g(AbstractC49815a.class, "onRestrictEvent", C68068c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(121, new RunnableC90250g(AbstractC49815a.class, "onReceiveDislikeAwemeEvent", C49678f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(6, new RunnableC90250g(AbstractC49815a.class, "onVideoPlayerEvent", C71904j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(122, new RunnableC90250g(AbstractC49815a.class, "onFeedAdClickCouponEvent", C37835d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(123, new RunnableC90250g(AbstractC49815a.class, "onScrolledToProfileTab", C69329a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(124, new RunnableC90250g(AbstractC49815a.class, "onNetStateChangeEvent", C39148c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(125, new RunnableC90250g(AbstractC49815a.class, "onFeedAdClickFormEvent", C37836e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(126, new RunnableC90250g(AbstractC49815a.class, "onRegisterProgressEvent", C33133p.class, ThreadMode.MAIN, 0, false));
        hashMap.put(127, new RunnableC90250g(AbstractC49815a.class, "onReplayEvent", C38884aj.class, ThreadMode.POSTING, 0, false));
        hashMap.put(128, new RunnableC90250g(AbstractC49815a.class, "onEvent", C37832b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(129, new RunnableC90250g(AbstractC49815a.class, "onLoginPageShowEvent", C58954b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(130, new RunnableC90250g(AbstractC49815a.class, "onChangePlayListNameEvent", C59403c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(131, new RunnableC90250g(AbstractC49815a.class, "onPushNotificationDialogShowed", C79656f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(81, new RunnableC90250g(AbstractC49815a.class, "onEvent", FollowStatusEvent.class, ThreadMode.MAIN, 0, false));
        hashMap.put(132, new RunnableC90250g(AbstractC49815a.class, "onRemoveVideoToMixEvent", C59409i.class, ThreadMode.POSTING, 0, false));
        hashMap.put(133, new RunnableC90250g(AbstractC49815a.class, "onPollEvent", C72889a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(30, new RunnableC90250g(AbstractC49815a.class, "onEvent", C38887d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @AbstractC90264r
    public void onBottomTabClicked(C68955h hVar) {
    }

    /* renamed from: p */
    public void mo70407p() {
    }

    /* renamed from: s */
    public void mo70514s() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo70516u() {
    }

    /* renamed from: z */
    public boolean mo70519z() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: M */
    public String mo70446M() {
        return this.f114777aE;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.AbstractC50421b
    /* renamed from: aL */
    public final void mo84704aL() {
        mo70387m();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: aR */
    public final VerticalViewPager mo84710aR() {
        return this.f114759N;
    }

    /* renamed from: aX */
    public final void mo84716aX() {
        mo84726bA();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: as */
    public final C49812b mo81094as() {
        return this.f114782aJ;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: az */
    public final void mo81107az() {
        mo84731bF();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an
    /* renamed from: bJ */
    public final boolean mo84735bJ() {
        return this.f114779aG;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an
    /* renamed from: bL */
    public final boolean mo84737bL() {
        return this.f114802ad;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an
    /* renamed from: bc */
    public final boolean mo84750bc() {
        return this.f114834bi;
    }

    /* renamed from: a */
    public AbstractC49815a mo70460a(C49812b bVar) {
        this.f114782aJ = bVar;
        if (bVar.getFrom() != null) {
            this.f114836bk = bVar.getFrom().equals("from_publish_add_video");
        }
        C49432e eVar = this.f114784aL;
        String from = bVar.getFrom();
        for (C49431d dVar : eVar.f113608a) {
            dVar.mo81057b(from);
        }
        C49432e eVar2 = this.f114784aL;
        String enterMethodValue = bVar.getEnterMethodValue();
        for (C49431d dVar2 : eVar2.f113608a) {
            dVar2.f113604g = enterMethodValue;
        }
        this.f114783aK.f113732y = bVar.getReactSessionId();
        C49432e eVar3 = this.f114784aL;
        String eventType = bVar.getEventType();
        for (C49431d dVar3 : eVar3.f113608a) {
            dVar3.f113601d = eventType;
        }
        C49432e eVar4 = this.f114784aL;
        int pageType = bVar.getPageType();
        for (C49431d dVar4 : eVar4.f113608a) {
            dVar4.f113602e = pageType;
        }
        C49432e eVar5 = this.f114784aL;
        String previousPage = bVar.getPreviousPage();
        for (C49431d dVar5 : eVar5.f113608a) {
            dVar5.f113606i = previousPage;
        }
        C49432e eVar6 = this.f114784aL;
        String fromGroupId = bVar.getFromGroupId();
        for (C49431d dVar6 : eVar6.f113608a) {
            dVar6.f113607j = fromGroupId;
        }
        this.f114780aH.mo81048a(bVar.getCreationId());
        return this;
    }

    /* renamed from: a */
    public void mo70471a(AbstractC49746c cVar) {
        this.f114816ar = cVar;
    }

    /* renamed from: a */
    public final void mo84688a(ViewPager.AbstractC1579e eVar) {
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager != null) {
            verticalViewPager.mo67974a(eVar);
        }
    }

    /* renamed from: a */
    public final void mo84696a(AbstractC80747i iVar) {
        this.f114856n = iVar;
        this.f114783aK.f113642O = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84700a(boolean z, boolean z2) {
        m93317s(z);
        if (!z2 || C50528ad.m94717a(this.f114782aJ.getEventType())) {
            AbstractC48149ai bg = mo84754bg();
            if (bg != null) {
                bg.mo80212c(z);
            }
            SharePrefCache.inst().getHasLongPressDislike().mo59940b(true);
            boolean z3 = !z;
            this.f114766U.setCanTouch(z3);
            this.f114759N.setCanTouch(z3);
        }
    }

    @AbstractC90264r
    public void onEvent(C56257j jVar) {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            bg.mo80163a(jVar);
        }
        mo70387m();
    }

    @AbstractC90264r
    public void onEvent(C56259l lVar) {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            bg.mo80164a(lVar);
        }
        mo70387m();
    }

    @AbstractC90264r
    public void onEvent(C56261n nVar) {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            bg.mo80165a(nVar);
        }
        mo84703aK();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c
    /* renamed from: a */
    public final void mo84686a(Activity activity, Fragment fragment) {
        super.mo84686a(activity, fragment);
        for (C49431d dVar : this.f114784aL.f113608a) {
            dVar.mo65520a(activity, fragment);
        }
        try {
            for (Callable callable : this.f114864v) {
                callable.call();
            }
            this.f114864v.clear();
        } catch (Exception e) {
            C51423a.m95788a("", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84698a(String str, boolean z) {
        this.f114783aK.mo81197a(str, z, (AbstractC48149ai) null);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w
    /* renamed from: a */
    public void mo70393a(View view, Bundle bundle) {
        GestureDetector gestureDetector;
        super.mo70393a(view, bundle);
        Activity j = C17873f.m33102j();
        if (j instanceof ActivityC0945e) {
            ActivityC0945e eVar = (ActivityC0945e) j;
            HomePageDataViewModel.C52942a.m97777a(eVar).f121743i.observe(eVar, new C49866c(this));
        }
        this.f114758M = (LoadMoreFrameLayout) view.findViewById(R.id.cg7);
        this.f114759N = (VerticalViewPager) view.findViewById(R.id.fgn);
        this.f114760O = view.findViewById(R.id.em1);
        this.f114761P = view.findViewById(R.id.ve);
        if (C67261e.m119186d()) {
            this.f114763R = (ViewStub) view.findViewById(R.id.aoe);
            this.f114765T = (ViewStub) view.findViewById(R.id.cs5);
        }
        if (this.f114763R == null) {
            VideoDownloadStatusBar videoDownloadStatusBar = (VideoDownloadStatusBar) view.findViewById(R.id.aod);
            this.f114762Q = videoDownloadStatusBar;
            videoDownloadStatusBar.setVideoDownloadClickListener(this);
        }
        if (this.f114765T == null) {
            this.f114764S = (NewUserFeedProgressBar) view.findViewById(R.id.cs4);
        }
        VideoDownloadStatusBar.f115447h.add(this);
        this.f114766U = (FeedSwipeRefreshLayout) view.findViewById(R.id.dhb);
        this.f114767V = (DiggLayout) view.findViewById(R.id.alb);
        this.f114812an = view.findViewById(R.id.el4);
        this.f114813ao = view.findViewById(R.id.up);
        this.f114814ap = (ViewGroup) view.findViewById(R.id.el5);
        this.f114815aq = (ViewGroup) view.findViewById(R.id.uq);
        this.f114757L = true;
        try {
            AbstractC0952i bY = mo84913bY();
            Fragment a = bY.mo3551a(UGCMonitor.EVENT_COMMENT);
            if (a != null) {
                AbstractC0976n a2 = bY.mo3552a();
                a2.mo3455a(a);
                a2.mo3467b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (mo84727bB()) {
            this.f114799aa = C62956e.m113376a("scene_feed" + getClass().getSimpleName() + hashCode());
        } else {
            this.f114799aa = C62956e.m113376a("scene_home_page" + getClass().getSimpleName() + hashCode());
        }
        this.f114766U.setViewPager(this.f114759N);
        this.f114771Z = new WeakHandler(this);
        Activity activity = this.f183419bv;
        WeakHandler weakHandler = this.f114771Z;
        boolean z = this.f114805ag;
        C4981911 r3 = new C50550r.AbstractC50552a() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C4981911 */

            static {
                Covode.recordClassIndex(58926);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.p2979x.C50550r.AbstractC50552a
            /* renamed from: a */
            public final void mo84858a(int i) {
                AbstractC49815a.this.mo70479c(i);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.p2979x.C50550r.AbstractC50552a
            /* renamed from: a */
            public final void mo84859a(MotionEvent motionEvent) {
                Aweme aD = AbstractC49815a.this.mo81109aD();
                if ((!C76660b.m134242b() || !C76706a.m134277c(aD)) && !C76706a.m134280f(C76706a.m134283i(aD))) {
                    AbstractC49815a.this.mo84687a(motionEvent);
                }
            }
        };
        if (!z) {
            gestureDetector = null;
        } else {
            gestureDetector = new GestureDetector(activity, new C50537f(r3, activity));
        }
        AbstractC48191b a3 = mo70459a(this.f183419bv, LayoutInflater.from(this.f183419bv), this, aH_(), new View.OnTouchListener(activity, gestureDetector, r3, weakHandler) {
            /* class com.p2082ss.android.ugc.aweme.feed.p2979x.C50550r.View$OnTouchListenerC505511 */

            /* renamed from: a */
            float f116828a;

            /* renamed from: b */
            float f116829b;

            /* renamed from: c */
            int f116830c;

            /* renamed from: d */
            int f116831d;

            /* renamed from: e */
            int f116832e;

            /* renamed from: f */
            int f116833f;

            /* renamed from: g */
            boolean f116834g;

            /* renamed from: h */
            boolean f116835h;

            /* renamed from: i */
            boolean f116836i;

            /* renamed from: j */
            MotionEvent f116837j;

            /* renamed from: k */
            MotionEvent f116838k;

            /* renamed from: l */
            final /* synthetic */ Activity f116839l;

            /* renamed from: m */
            final /* synthetic */ GestureDetector f116840m;

            /* renamed from: n */
            final /* synthetic */ AbstractC50552a f116841n;

            /* renamed from: o */
            final /* synthetic */ Handler f116842o;

            static {
                Covode.recordClassIndex(59698);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                GestureDetector gestureDetector = this.f116840m;
                if (gestureDetector != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (this.f116842o.hasMessages(0)) {
                        this.f116842o.removeMessages(0);
                    }
                    this.f116836i = false;
                    MotionEvent motionEvent2 = this.f116837j;
                    MotionEvent motionEvent3 = this.f116838k;
                    if (!(motionEvent2 == null || motionEvent3 == null || !this.f116834g)) {
                        long eventTime = motionEvent.getEventTime() - motionEvent3.getEventTime();
                        if (eventTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && eventTime >= 40) {
                            int x = ((int) motionEvent2.getX()) - ((int) motionEvent.getX());
                            int y = ((int) motionEvent2.getY()) - ((int) motionEvent.getY());
                            if ((x * x) + (y * y) < this.f116833f) {
                                this.f116836i = true;
                                this.f116841n.mo84859a(this.f116837j);
                            }
                        }
                    }
                    MotionEvent motionEvent4 = this.f116837j;
                    if (motionEvent4 != null) {
                        motionEvent4.recycle();
                    }
                    this.f116837j = MotionEvent.obtain(motionEvent);
                    this.f116835h = true;
                    this.f116834g = true;
                    this.f116828a = motionEvent.getX();
                    this.f116829b = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        int x2 = (int) (motionEvent.getX() - this.f116828a);
                        int y2 = (int) (motionEvent.getY() - this.f116829b);
                        int i = (x2 * x2) + (y2 * y2);
                        if (i > this.f116832e || Math.abs(x2) >= this.f116831d) {
                            this.f116835h = false;
                            this.f116842o.removeMessages(0);
                        }
                        if (i > this.f116833f) {
                            this.f116834g = false;
                        }
                    }
                } else if (this.f116835h) {
                    if (!this.f116836i && this.f116837j != null) {
                        Handler handler = this.f116842o;
                        handler.sendMessageDelayed(handler.obtainMessage(0, new C0692e(Float.valueOf(this.f116828a), Float.valueOf(this.f116829b))), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + this.f116837j.getEventTime());
                    }
                    MotionEvent motionEvent5 = this.f116838k;
                    if (motionEvent5 != null) {
                        motionEvent5.recycle();
                    }
                    this.f116838k = MotionEvent.obtain(motionEvent);
                }
                return false;
            }

            {
                this.f116839l = r2;
                this.f116840m = r3;
                this.f116841n = r4;
                this.f116842o = r5;
                this.f116830c = ViewConfiguration.get(r2).getScaledDoubleTapSlop();
                int scaledTouchSlop = ViewConfiguration.get(r2).getScaledTouchSlop() * 3;
                this.f116831d = scaledTouchSlop;
                this.f116832e = scaledTouchSlop * scaledTouchSlop;
                int i = this.f116830c;
                this.f116833f = i * i;
            }
        }, BaseFeedPageParams.newBuilder().setAwemeFromPage(mo70445L()).setEventType(this.f114782aJ.getEventType()).setParam(this.f114782aJ).setMyProfile(TextUtils.equals("from_profile_self", this.f114782aJ.getFrom())).setFromPostList(this.f114782aJ.isFromPostList()).setPageType(this.f114782aJ.getPageType()).setShowVote(this.f114782aJ.isShowPoll()).setCid(this.f114782aJ.getCid()).setChallengeId(this.f114782aJ.getChallengeId()), this);
        this.f114768W = a3;
        a3.f111627e = mo70515t();
        this.f114759N.setAdapter(this.f114768W);
        if (mo70517w()) {
            this.f114759N.setOnGenericMotionListener(new View.OnGenericMotionListener() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.View$OnGenericMotionListenerC4982920 */

                static {
                    Covode.recordClassIndex(58936);
                }

                public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
                    if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || AbstractC49815a.this.f114759N == null || AbstractC49815a.this.f114759N.getScrollState() != 0 || AbstractC49815a.this.f114788aP) {
                        return false;
                    }
                    C51423a.m95784a(3, AbstractC49815a.f114752J, "onGenericMotionEvent action scroll");
                    if (motionEvent.getAxisValue(9) < 0.0f) {
                        if (AbstractC49815a.this.f114759N.canScrollVertically(1)) {
                            AbstractC49815a.this.f114759N.setCurrentItem(AbstractC49815a.this.f114759N.getCurrentItem() + 1);
                            return true;
                        }
                    } else if (AbstractC49815a.this.f114759N.canScrollVertically(-1)) {
                        AbstractC49815a.this.f114759N.setCurrentItem(AbstractC49815a.this.f114759N.getCurrentItem() - 1);
                        return true;
                    }
                    return false;
                }
            });
        }
        final Activity activity2 = this.f183419bv;
        if (activity2 != null && (activity2 instanceof AbstractC59103j)) {
            this.f114824az = ((AbstractC59103j) activity2).hasRegistedResumeAction();
        }
        this.f114759N.mo67974a(new ViewPager.AbstractC1579e() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C4982214 */

            /* renamed from: a */
            int f114879a = -1;

            /* renamed from: b */
            int f114880b = -1;

            /* renamed from: c */
            int f114881c = -1;

            /* renamed from: d */
            boolean f114882d;

            /* renamed from: e */
            float f114883e;

            /* renamed from: f */
            boolean f114884f;

            /* renamed from: g */
            boolean f114885g;

            /* renamed from: h */
            int f114886h = -1;

            static {
                Covode.recordClassIndex(58929);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final /* synthetic */ void mo84862a(int i) {
                m93527b(i);
                C35351h.f83390a = true;
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageSelected(int i) {
                if (C35351h.m72352a()) {
                    C40928a.m82418a(new RunnableC49883t(this, i));
                } else {
                    m93527b(i);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
                boolean z;
                this.f114886h = i;
                AbstractC49815a aVar = AbstractC49815a.this;
                if (i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.f114834bi = z;
                if (i == 1) {
                    C46841dn.f109127d = System.currentTimeMillis();
                    AbstractC49815a.this.mo84728bC();
                    AbstractC48149ai bg = AbstractC49815a.this.mo84754bg();
                    if (bg != null) {
                        bg.mo80128k();
                    }
                } else if (i == 0) {
                    AbstractC49815a.this.f114835bj = false;
                    if (!this.f114884f) {
                        this.f114885g = false;
                        C46841dn.f109126c = System.currentTimeMillis() - C46841dn.f109127d;
                        AbstractC48149ai bg2 = AbstractC49815a.this.mo84754bg();
                        if (bg2 != null) {
                            bg2.mo80127h();
                            if (C49502ae.m92739a(AbstractC49815a.this.f114782aJ.getEventType()) && !AbstractC49815a.m93300b(bg2)) {
                                C80749k.m140049a().mo123953b();
                            }
                        }
                    }
                } else if (i == 2) {
                    AbstractC49815a.this.f114783aK.mo81173L();
                }
                AbstractC81915c.m141874a(new C50453c(AbstractC49815a.this.mo81109aD(), i, AbstractC49815a.this.f114782aJ.getEventType()));
                AbstractC49815a.this.mo70490e(i);
            }

            /* JADX WARNING: Removed duplicated region for block: B:135:0x02f0  */
            /* JADX WARNING: Removed duplicated region for block: B:138:0x0304  */
            /* JADX WARNING: Removed duplicated region for block: B:177:0x0421  */
            /* JADX WARNING: Removed duplicated region for block: B:180:0x0448  */
            /* JADX WARNING: Removed duplicated region for block: B:187:0x04a8  */
            /* JADX WARNING: Removed duplicated region for block: B:190:0x04c8  */
            /* JADX WARNING: Removed duplicated region for block: B:193:0x04d5  */
            /* JADX WARNING: Removed duplicated region for block: B:196:0x0520  */
            /* JADX WARNING: Removed duplicated region for block: B:199:0x053f  */
            /* JADX WARNING: Removed duplicated region for block: B:237:0x05e9  */
            /* JADX WARNING: Removed duplicated region for block: B:239:0x05f0  */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void m93527b(int r20) {
                /*
                // Method dump skipped, instructions count: 1586
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C4982214.m93527b(int):void");
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
                boolean z;
                boolean z2;
                if (AbstractC49815a.this.f183420bw.getActivity() != null) {
                    if (!AbstractC49815a.this.f114835bj) {
                        AbstractC49815a.this.f114835bj = true;
                        AbstractC49815a.this.mo84853q(false);
                    }
                    if (this.f114886h == 1) {
                        if (i == AbstractC49815a.this.f114770Y && f > 0.0f) {
                            AbstractC49815a.this.f114783aK.mo81185a(i, true);
                        } else if (i < AbstractC49815a.this.f114770Y && (!C62890a.f142627a ? C16048b.m29633a().mo25412a(true, "player_prerender_prev_enable", 1) == 1 : ((Boolean) C62933c.f142846d.getValue()).booleanValue())) {
                            AbstractC49815a.this.f114783aK.mo81185a(i, false);
                        }
                    }
                    if (i != AbstractC49815a.this.f114770Y) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f114884f = z;
                    boolean z3 = AbstractC49815a.this.f114785aM;
                    if (AbstractC49815a.this.f114785aM && f == 0.0f && i2 == 0) {
                        onPageSelected(i);
                        AbstractC49815a.this.f114785aM = false;
                    }
                    if (((float) i2) != 0.0f) {
                        this.f114882d = true;
                    }
                    if (AbstractC49815a.this.f114822ax) {
                        AbstractC49815a.this.f114822ax = false;
                        return;
                    }
                    this.f114883e = f;
                    if (i == this.f114879a && f < 1.0E-10f) {
                        AbstractC49815a.this.f114770Y = i;
                        this.f114879a = -1;
                        AbstractC49815a.this.mo70514s();
                        AbstractC49815a.this.mo70516u();
                        AbstractC49815a.this.mo84709aQ();
                        View m = AbstractC49815a.this.mo84788m(false);
                        if (m != null) {
                            m.setAlpha(0.0f);
                        }
                        if (!z3) {
                            AbstractC49815a.this.f114802ad = true;
                        }
                        Aweme c = AbstractC49815a.this.f114768W.mo80287c(i);
                        if (c == null || c.isLive() || c.isCanPlay()) {
                            ServiceManager.get().getService(IFeedDebugService.class);
                            if (!MainPageExperimentServiceImpl.m108379b().mo96454a() || AbstractC49815a.this.f114989bu) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (AbstractC49815a.this.mo84760bm() && !C50545m.m94768e(c) && AbstractC49815a.this.f114842bq && !z2 && !C37699a.m76251aW(c)) {
                                if (C80636z.m139816a(c)) {
                                    new C79459a(AbstractC49815a.this.f183419bv).mo123050a(R.string.hc8).mo123053a();
                                } else if (c.isLive()) {
                                    C80749k.m140049a();
                                    if (C80771f.f180597a && AbstractC49815a.this.mo84754bg() != null) {
                                        AbstractC49815a.this.mo84754bg().mo80227r();
                                    }
                                } else {
                                    AbstractC49815a.this.mo84707aO().mo123937a(AbstractC49815a.this.f114783aK.mo81172K());
                                    if (C80771f.f180597a && AbstractC49815a.this.mo84754bg() != null) {
                                        AbstractC49815a.this.mo84754bg().mo80151C();
                                        AbstractC49815a.this.mo84707aO().mo123949x();
                                    }
                                    if (!C76706a.m134279e(AbstractC49815a.this.mo84738bM())) {
                                        AbstractC49815a.this.mo84752be();
                                    }
                                }
                            }
                            AbstractC49815a.this.mo84771bx();
                        } else {
                            return;
                        }
                    }
                    if (i == AbstractC49815a.this.f114770Y) {
                        float f2 = (float) (-i2);
                        AbstractC49815a.this.mo84788m(true).setTranslationY(f2);
                        AbstractC49815a.this.f114767V.setTranslationY(f2);
                        if (AbstractC49815a.this.f114821aw != null && AbstractC49815a.this.f114774aB) {
                            AbstractC49815a.this.mo84726bA();
                        }
                    } else {
                        int measuredHeight = AbstractC49815a.this.f114758M.getMeasuredHeight();
                        if (measuredHeight == 0) {
                            measuredHeight = C13628n.m24521b(AbstractC49815a.this.f183419bv);
                        }
                        if (C33403c.C33406b.f79409a.f79388q) {
                            measuredHeight = C33403c.C33406b.f79409a.f79385j;
                        }
                        float f3 = (float) (measuredHeight - i2);
                        AbstractC49815a.this.mo84788m(true).setTranslationY(f3);
                        AbstractC49815a.this.f114767V.setTranslationY(f3);
                        if (AbstractC49815a.this.f114821aw != null && AbstractC49815a.this.f114774aB) {
                            AbstractC49815a.this.mo84726bA();
                        }
                    }
                    Aweme c2 = AbstractC49815a.this.f114768W.mo80287c(AbstractC49815a.this.f114770Y);
                    if (C49502ae.m92739a(AbstractC49815a.this.f114782aJ.getEventType()) && c2 != null && !c2.isLive() && !this.f114885g && this.f114886h == 1) {
                        if (f > 0.5f) {
                            Aweme c3 = AbstractC49815a.this.f114768W.mo80287c(i);
                            if (c3 != null && c3.isLive()) {
                                AbstractC49815a.this.mo84682a(c3, false, AbstractC49815a.this.mo84756bi());
                                this.f114885g = true;
                            }
                        } else {
                            Aweme c4 = AbstractC49815a.this.f114768W.mo80287c(i + 1);
                            if (c4 != null && c4.isLive()) {
                                AbstractC49815a.this.mo84682a(c4, false, AbstractC49815a.this.mo84755bh());
                                this.f114885g = true;
                            }
                        }
                    }
                    AbstractC49815a.this.f114838bm = true;
                }
            }
        });
        this.f114759N.setOnUserSwipeUpListener(this.f114840bo);
        C49995z zVar = new C49995z();
        this.f114825b = zVar;
        zVar.mo67838a(new C49993y());
        this.f114825b.mo67839a_(this);
        AbstractC51754w i = C51648a.f118980a.mo87329i();
        this.f114820av = i;
        i.mo87468a(this);
        C49964ag agVar = new C49964ag();
        this.f114847d = agVar;
        agVar.mo67838a(new C49962af());
        this.f114847d.mo67839a_(this);
        this.f114780aH.mo81047a();
        this.f114758M.setOnScrolledListener(new LoadMoreFrameLayout.AbstractC50500c() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C4982315 */

            static {
                Covode.recordClassIndex(58930);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.AbstractC50500c
            /* renamed from: a */
            public final void mo84863a(int i) {
                View m = AbstractC49815a.this.mo84788m(true);
                if (m != null) {
                    m.setTranslationY((float) i);
                }
                if (AbstractC49815a.this.f114767V != null) {
                    AbstractC49815a.this.f114767V.setTranslationY((float) i);
                }
                AbstractC49815a.this.mo84726bA();
            }
        });
        this.f114758M.setOnGestureTriggerExit(new LoadMoreFrameLayout.AbstractC50498a() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C4982416 */

            static {
                Covode.recordClassIndex(58931);
            }

            @Override // com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.AbstractC50498a
            /* renamed from: a */
            public final void mo70522a() {
                Activity activity = activity2;
                if (activity != null) {
                    activity.finish();
                }
            }
        });
        this.f114801ac = true;
        C49418a aVar = new C49418a();
        this.f114846c = aVar;
        this.f114783aK.f113722o = aVar;
        if (!C67248d.m119182j()) {
            mo70441G();
        }
        TextUtils.equals(this.f114782aJ.getEventType(), "homepage_hot");
        this.f114778aF = this.f114766U;
        this.f114759N.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.View$OnLayoutChangeListenerC4982517 */

            static {
                Covode.recordClassIndex(58932);
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i != i5 || i2 != i6 || i4 != i8 || i3 != i7) {
                    AbstractC49815a.this.mo84714aV();
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            this.f114759N.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.RunnableC4982618 */

                static {
                    Covode.recordClassIndex(58933);
                }

                public final void run() {
                    WindowInsets rootWindowInsets;
                    if (AbstractC49815a.this.f114759N != null && (rootWindowInsets = AbstractC49815a.this.f114759N.getRootWindowInsets()) != null) {
                        boolean z = true;
                        Object a = C13638c.m24545a(WindowInsets.class, "getDisplayCutout", rootWindowInsets);
                        C33403c cVar = C33403c.C33406b.f79409a;
                        if (a == null) {
                            z = false;
                        }
                        cVar.f79389r = z;
                    }
                }
            }, 200);
        }
        this.f114794aV = C69488a.C69489a.m122709a(this.f183419bv);
        C79668l lVar = new C79668l(this, this.f114794aV);
        this.f114845bt = lVar;
        C69488a aVar2 = lVar.f178773b;
        C79668l.C79670b bVar = new C79668l.C79670b(lVar);
        C89219l.m154721d(bVar, "");
        aVar2.mo109735a("comment_panel", bVar);
        C79668l lVar2 = this.f114845bt;
        C69488a aVar3 = lVar2.f178773b;
        C79668l.C79671c cVar = new C79668l.C79671c(lVar2);
        C89219l.m154721d(cVar, "");
        aVar3.mo109735a("login_panel", cVar);
        C79668l lVar3 = this.f114845bt;
        C69488a aVar4 = lVar3.f178773b;
        C79668l.C79672d dVar = new C79668l.C79672d(lVar3);
        C89219l.m154721d(dVar, "");
        aVar4.mo109735a("share_panel", dVar);
        if (aH_() != null) {
            C34603a.C34604a.f81659a.mo61063a("video_download_status").observe(aH_(), new C49865b(this));
        }
        mo84783j(mo81109aD());
    }

    /* renamed from: a */
    public final void mo84683a(int i, AbstractC48149ai aiVar) {
        Runnable runnable = this.f114776aD;
        if (runnable != null) {
            runnable.run();
            this.f114776aD = null;
        }
        this.f114776aD = new RunnableC49877n(this, aiVar, i);
        if (C46919ez.m90220b()) {
            if (C40928a.m82418a(this.f114776aD)) {
                return;
            }
        } else if (C46919ez.f109341a == 2) {
            if (this.f114848e == null) {
                this.f114848e = new Handler(Looper.getMainLooper());
            }
            Message obtain = Message.obtain(this.f114848e, this.f114776aD);
            if (Build.VERSION.SDK_INT >= 22) {
                obtain.setAsynchronous(true);
            }
            this.f114848e.sendMessageAtFrontOfQueue(obtain);
            return;
        } else if (C46919ez.f109341a == 3) {
            this.f114759N.postOnAnimation(this.f114776aD);
            return;
        } else if (C46919ez.f109341a == 4) {
            this.f114759N.postOnAnimation(new RunnableC49878o(this));
            return;
        }
        this.f114776aD.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo84690a(AbstractC48149ai aiVar, int i) {
        if (this.f114759N != null) {
            mo84689a(aiVar);
            mo84774g(i);
            this.f114776aD = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo84689a(AbstractC48149ai aiVar) {
        if (aiVar != null) {
            aiVar.mo80072g();
            if (C76706a.m134279e(mo84738bM())) {
                C49862ax axVar = this.f114858p;
                Aweme b = aiVar.mo80206b();
                C89219l.m154721d(b, "");
                if (C76706a.m134277c(b)) {
                    axVar.f114947a.mo81167F();
                }
            }
            aiVar.mo80094b(System.currentTimeMillis());
        }
        AbstractC48149ai aiVar2 = null;
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager != null) {
            int childCount = verticalViewPager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC48149ai aiVar3 = (AbstractC48149ai) this.f114759N.getChildAt(i).getTag(R.id.b0u);
                if (m93299b(this.f114759N.getCurrentItem(), aiVar3)) {
                    aiVar2 = aiVar3;
                }
            }
        }
        this.f114797aY = aiVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo84684a(int i, Aweme aweme) {
        this.f114768W.mo80329f(i);
    }

    /* renamed from: a */
    public final void mo84687a(MotionEvent motionEvent) {
        AbstractC48149ai bk;
        if (!this.f114781aI.booleanValue() && !this.f114836bk && (bk = mo84758bk()) != null) {
            Aweme b = bk.mo80206b();
            if (C76706a.m134277c(b)) {
                b = C76706a.m134283i(b);
            }
            mo70465a(motionEvent, bk, b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo84682a(Aweme aweme, boolean z, AbstractC48149ai aiVar) {
        if (this.f114824az && aweme != null) {
            this.f114841bp = aweme.getAid();
        }
        if (C76706a.m134277c(aweme)) {
            return this.f114858p.mo84888a();
        }
        return this.f114783aK.mo81184a(aweme, z, aiVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.ss.android.ugc.aweme.feed.q.a */
    /* JADX DEBUG: Multi-variable search result rejected for r3v62, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63634a(com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag r16) {
        /*
        // Method dump skipped, instructions count: 1880
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.mo63634a(com.ss.android.ugc.aweme.feed.i.ag):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo84693a(Aweme aweme, String str, int i, C49672ag agVar, String str2, int i2) {
        HashMap<String, String> a;
        AbstractC51754w wVar = this.f114820av;
        if (wVar != null && wVar.mo87471i()) {
            m93289a(aweme, str, true, i, agVar);
            AbstractC51754w wVar2 = this.f114820av;
            C63847n.C63848a d = new C63847n.C63848a().mo103320a(str).mo103325b(str2).mo103322a(aweme.getAuthor().isSecret() || aweme.getAuthor().isPrivateAccount()).mo103318a(1).mo103327c(this.f114782aJ.getEventType()).mo103329d(C50545m.m94769f(C50539g.m94745b(mo84754bg()))).mo103319a(aweme).mo103330e(agVar.f114319e).mo103326c(C80316cv.C80317a.m139239a(this.f114782aJ.getEventType())).mo103324b(C80316cv.C80317a.m139240a(this.f114782aJ.getEventType(), aweme.getRelationLabel())).mo103328d(i2);
            if (aweme.isAd()) {
                a = C50535d.m94739a(this.f183419bv, aweme.getAwemeRawAd().getLogExtra(), String.valueOf(aweme.getAwemeRawAd().getAdId()), String.valueOf(aweme.getAwemeRawAd().getCreativeId()), new HashMap());
            } else {
                a = C50535d.m94740a(this.f114782aJ.getEventType(), null, new HashMap());
            }
            wVar2.mo87469a(d.mo103321a(a).mo103323a());
        }
    }

    /* renamed from: a */
    private void m93292a(boolean z, C50323k.EnumC50325b bVar) {
        DataCenter D;
        if (!C47008he.m90283b() && TextUtils.equals(this.f114782aJ.getEventType(), "homepage_hot") && (D = mo70438D()) != null) {
            if (z) {
                D.mo60191a("follow_button_interaction", (Object) 0);
            } else if (bVar != null) {
                D.mo60191a("follow_button_interaction", bVar);
            }
        }
    }

    /* renamed from: a */
    private static boolean m93294a(Aweme aweme, AbstractC48149ai aiVar) {
        return C37699a.m76262ah(aweme) && aiVar.mo80229t() != null && C37699a.m76292e(aweme) != null && aiVar.mo80229t().mo65936M().longValue() >= ((long) (C37699a.m76292e(aweme).getShowSeconds() * 1000));
    }

    /* renamed from: a */
    public final void mo84692a(final Aweme aweme, final String str) {
        C29339a.m58754b(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.RunnableC498282 */

            static {
                Covode.recordClassIndex(58935);
            }

            public final void run() {
                String str;
                if (AbstractC49815a.this.f183419bv != null && !AbstractC49815a.this.f183419bv.isFinishing()) {
                    Aweme aweme = aweme;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = "";
                    }
                    Aweme aweme2 = aweme;
                    if (aweme2 != null && "1".equals(aweme2.isFromTrendingCard())) {
                        str = AbstractC49815a.this.f114782aJ.getSearchResultId();
                    }
                    C68859af.C68860a b = new C68859af.C68860a().mo109438a(AbstractC49815a.this.f114782aJ.getTabName()).mo109439b(AbstractC49815a.this.f114782aJ.getmImprId());
                    b.f154007a.f154003e = AbstractC49815a.this.f114782aJ.getSearchId();
                    b.f154007a.f154004f = str;
                    b.f154007a.f154005g = AbstractC49815a.this.f114782aJ.getChallengeId();
                    b.f154007a.f154006h = AbstractC49815a.this.f114782aJ.getParentTagId();
                    AbstractC49815a.this.f114780aH.mo81311a(AbstractC49815a.this.f183419bv, aweme, b.f154007a);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo84695a(Aweme aweme, String str, boolean z, boolean z2, boolean z3, int i) {
        if (aweme == null) {
            C36179e.m73733b("AWEME == NULL");
            return;
        }
        if (this.f114780aH.mo81058c() == null) {
            C36179e.m73733b("ACTIVITY == NULL");
        } else if (this.f114780aH.mo81058c().isFinishing()) {
            return;
        }
        mo84754bg();
        C36493c.C36494a a = new C36493c.C36494a(aweme).mo63865a(str);
        a.f86337b = true;
        int i2 = 0;
        a.f86340e = false;
        a.f86338c = z;
        a.f86344i = this.f114782aJ.isFromPostList();
        a.f86345j = false;
        a.f86346k = null;
        a.f86352q = z2;
        a.f86353r = z3;
        a.f86342g = this.f114782aJ.getPreviousPage();
        a.f86347l = 0;
        String str2 = C76706a.m134281g(aweme) ? "story" : UGCMonitor.TYPE_POST;
        if (aweme.getAuthor() != null) {
            i2 = C76598h.m134176a(aweme.getAuthor());
        }
        C39162r.m79460a("enter_comment_list", new C33744d().mo59983a("enter_from", this.f114782aJ.getEventType()).mo59983a("enter_method", "comment_reply").mo59983a("group_id", aweme.getAid()).mo59983a("trigger_comment_id", str).mo59980a("follow_status", i2).mo59983a("story_type", str2).mo59980a("follow_status_to_user", i).f79943a);
        AbstractC49420e eVar = this.f114780aH;
        if (eVar instanceof AbstractC36416b) {
            ((AbstractC36416b) eVar).mo63701a(a.mo63867a());
        }
    }

    /* renamed from: b */
    public final void mo84722b(Aweme aweme, String str) {
        if (aweme == null) {
            C36179e.m73733b("AWEME == NULL");
            return;
        }
        if (this.f114780aH.mo81058c() == null) {
            C36179e.m73733b("ACTIVITY == NULL");
        } else if (this.f114780aH.mo81058c().isFinishing()) {
            return;
        }
        C36493c.C36494a aVar = new C36493c.C36494a(aweme);
        C89219l.m154721d(str, "");
        aVar.f86354s = str;
        aVar.f86342g = this.f114782aJ.getPreviousPage();
        aVar.f86347l = 3;
        AbstractC49420e eVar = this.f114780aH;
        if (eVar instanceof AbstractC36416b) {
            ((AbstractC36416b) eVar).mo63701a(aVar.mo63867a());
        }
    }

    /* renamed from: b */
    public final void mo84723b(Aweme aweme, String str, int i) {
        if (aweme == null) {
            C36179e.m73733b("AWEME == NULL");
            return;
        }
        if (this.f114780aH.mo81058c() == null) {
            C36179e.m73733b("ACTIVITY == NULL");
        } else if (this.f114780aH.mo81058c().isFinishing()) {
            return;
        }
        C36493c.C36494a aVar = new C36493c.C36494a(aweme);
        aVar.f86348m = str;
        aVar.f86349n = i;
        aVar.f86342g = this.f114782aJ.getPreviousPage();
        aVar.f86347l = 1;
        AbstractC49420e eVar = this.f114780aH;
        if (eVar instanceof AbstractC36416b) {
            ((AbstractC36416b) eVar).mo63701a(aVar.mo63867a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84694a(Aweme aweme, String str, boolean z, String str2) {
        m93290a(aweme, str, z, str2, 0, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84691a(Aweme aweme, int i, String str) {
        m93290a(aweme, (String) null, this.f114851h, str, i, false);
    }

    /* renamed from: a */
    private void m93290a(Aweme aweme, String str, boolean z, String str2, int i, boolean z2) {
        if (aweme == null) {
            C36179e.m73733b("AWEME == NULL");
            return;
        }
        if (this.f114780aH.mo81058c() == null) {
            C36179e.m73733b("ACTIVITY == NULL");
        } else if (this.f114780aH.mo81058c().isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!RelationLabelHelper.hasDuoShanLabel(aweme) && RelationLabelHelper.hasCommentId(aweme)) {
            arrayList.add(aweme.getFeedRelationLabel().getExtra().getCid());
        } else if (aweme.getOriginCommentIds() != null) {
            arrayList.addAll(aweme.getOriginCommentIds());
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        mo81108aC();
        C36493c.C36494a a = new C36493c.C36494a(C50545m.m94766c(aweme)).mo63866a(arrayList);
        a.f86343h = this.f114782aJ.getCreationId();
        a.f86340e = z;
        a.f86344i = this.f114782aJ.isFromPostList();
        a.f86341f = str2;
        a.f86342g = this.f114782aJ.getPreviousPage();
        a.f86350o = this.f114782aJ.getChallengeId();
        a.f86351p = this.f114782aJ.getParentTagId();
        a.f86339d = z2;
        a.f86347l = i;
        if (TextUtils.equals(str2, "bubble")) {
            a.f86337b = true;
        }
        AbstractC49420e eVar = this.f114780aH;
        if (eVar instanceof AbstractC36416b) {
            ((AbstractC36416b) eVar).mo63701a(a.mo63867a());
        }
        this.f114851h = false;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus = followStatusEvent.status;
        if (super.mo84730bE()) {
            AbstractC48191b bVar = this.f114768W;
            C89219l.m154721d(followStatus, "");
            if (bVar.getCount() != 0) {
                List<Aweme> e = bVar.mo80288e();
                ArrayList<Aweme> arrayList = new ArrayList();
                for (T t : e) {
                    User author = t.getAuthor();
                    if (C13627m.m24499a(author != null ? author.getUid() : null, followStatus.userId)) {
                        arrayList.add(t);
                    }
                }
                for (Aweme aweme : arrayList) {
                    User author2 = aweme.getAuthor();
                    if (author2 != null) {
                        author2.setFollowStatus(followStatus.followStatus);
                    }
                }
            }
        }
        if ((!this.f114827bb || !super.mo84708aP()) && followStatusEvent.status != null) {
            C63332a.C63333a.m114832a();
            C63332a.m114824a(followStatusEvent.status.secUserId, followStatusEvent.status.userId);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l
    /* renamed from: a */
    public final void mo81115a(Aweme aweme, boolean z, boolean z2) {
        if (C80636z.m139816a(aweme)) {
            new C79459a(this.f183419bv).mo123050a(R.string.hc8).mo123053a();
        } else if ((!this.f114842bq || !super.mo84730bE()) && !C49286c.m92321a()) {
            C51423a.m95791b(4, "BaseListFragmentPanel", "try to handlePlay,but can't meet the conditions,pageResume:" + this.f114842bq + ",isViewValid:" + super.mo84730bE() + "BgPlayState.INSTANCE.isMediaNotificationActiveAndInBackground():" + C49286c.m92321a());
            C51423a.m95791b(4, "BaseListFragmentPanel", "the stacktrace:" + Log.getStackTraceString(new Throwable()));
        } else {
            this.f114783aK.mo81187a(aweme, z, z2);
        }
    }

    /* renamed from: a */
    public final void mo84685a(int i, String str) {
        AbstractC48149ai n = mo84791n(this.f114768W.mo80287c(i).getAid());
        if (n != null) {
            n.mo80126d(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public void mo62668a(List<Aweme> list, int i) {
        C51423a.m95791b(5, "BaseListFragmentPanel", "insert called,but not response for position:" + i + ",eventType:" + this.f114782aJ.getEventType());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final boolean mo62670a(C39108i<Aweme> iVar) {
        List<T> list = iVar.f92304e;
        int i = iVar.f92301b;
        boolean z = iVar.f92303d;
        int i2 = iVar.f92302c;
        if (list == null || list.size() < i) {
            return true;
        }
        if (this.f114768W.getCount() == 0) {
            this.f114768W.mo80286a(list);
            return true;
        } else if (!z) {
            return true;
        } else {
            this.f114768W.mo80323a(list, i, i2);
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: a */
    public final boolean mo81098a(Runnable runnable, long j) {
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager != null) {
            return verticalViewPager.postDelayed(runnable, j);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80914f
    /* renamed from: a */
    public final void mo84697a(String str, long j, long j2) {
        if (mo70450Q()) {
            if (this.f114843br == null) {
                this.f114843br = new C49932a(this.f114783aK, mo70451R());
            }
            if (!m93315o(mo81116aG()) || mo81111aF() > 1) {
                this.f114843br.mo84979a(false, str, j, j2, this.f114768W, mo81110aE(), this.f114801ac);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: b */
    public final void mo84724b(String str, boolean z) {
        if (z && mo70450Q()) {
            if (this.f114843br == null) {
                this.f114843br = new C49932a(this.f114783aK, mo70451R());
            }
            this.f114843br.mo84979a(z, str, 0, 0, this.f114768W, mo81110aE(), this.f114801ac);
        }
    }

    /* renamed from: b */
    public final void mo84725b(List<Aweme> list, int i) {
        try {
            AbstractC49749f fVar = this.f114818at;
            if (fVar != null) {
                fVar.mo84305a(C39107h.m79399a(list, i, list.size()));
            } else {
                m93305c(list, i);
            }
        } catch (C39106g e) {
            C51423a.m95788a("", e);
            m93305c(list, i);
        }
    }

    /* renamed from: a */
    private static boolean m93293a(C47959j jVar) {
        try {
            JSONObject jSONObject = jVar.f111077b.getJSONObject("data");
            boolean z = jSONObject != null && TextUtils.equals("landing_page", jSONObject.getString("report_from"));
            if (!TextUtils.equals("adVideoReportSuccess", jVar.f111077b.getString("eventName")) || z) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @AbstractC90264r
    public void onEvent(C49696x xVar) {
        AbstractC48149ai bg;
        AbstractC37879bc t;
        if (xVar != null) {
            Activity activity = this.f183419bv;
            if (xVar.f114369a == (activity != null ? activity.hashCode() : 0) && (bg = mo84754bg()) != null && xVar.f114371c == bg.mo80206b() && (t = bg.mo80229t()) != null) {
                int i = xVar.f114370b;
                if (i == 1) {
                    t.mo65959a(xVar.f114372d);
                } else if (i == 2) {
                    t.mo65966b(xVar.f114372d);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        if (r7 != 0) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02e8, code lost:
        if (com.p2082ss.android.ugc.aweme.feed.C48317al.m91756b() >= r7) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02f4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70465a(android.view.MotionEvent r27, com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai r28, com.p2082ss.android.ugc.aweme.feed.model.Aweme r29) {
        /*
        // Method dump skipped, instructions count: 880
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.mo70465a(android.view.MotionEvent, com.ss.android.ugc.aweme.feed.adapter.ai, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: a */
    public void mo84699a(boolean z, Aweme aweme, Aweme aweme2) {
        if (aweme != null && aweme2 != null) {
            C49812b bVar = this.f114782aJ;
            boolean z2 = !z;
            boolean equals = TextUtils.equals(bVar.getEventType(), "homepage_hot");
            String bs = mo84766bs();
            if (equals) {
                C1731i.m5640b(new CallableC50549q(z2, bs, aweme.getAuthorUid(), aweme.getAid(), aweme2.getAid(), bVar), C39162r.m79452a());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: b */
    public void mo71320b(FollowStatus followStatus) {
        User author;
        Aweme b = C50539g.m94745b(mo84754bg());
        if (b != null && (author = b.getAuthor()) != null && author.getUid() != null) {
            if (author.getUid().equals(followStatus.userId)) {
                author.setFollowStatus(followStatus.followStatus);
            }
            AbstractC81915c.m141874a(new C35503c(followStatus.followStatus, author));
            if (mo84753bf()) {
                C63332a.C63333a.m114832a().mo101921a(4);
                int i = this.f114798aZ;
                if (i >= 0 && i < 5) {
                    C63339b a = C63339b.C63340a.m114834a();
                    if (SmartPreloadCommentV2Experiment.C59983a.m109504b() || SmartPreloadProfileV2Experiment.C59985a.m109507b()) {
                        a.f143769a++;
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: O */
    public String mo70448O() {
        return this.f114782aJ.getTracker();
    }

    /* renamed from: P */
    public void mo70449P() {
        this.f114783aK.mo81171J();
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public PreloadStrategyConfig mo70451R() {
        return C49527r.m92770c();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49438k
    /* renamed from: aC */
    public final AbstractC48149ai mo81108aC() {
        return mo84754bg();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.VideoDownloadStatusBar.AbstractC50021c
    /* renamed from: aN */
    public final void mo84706aN() {
        mo70477b(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w
    /* renamed from: aP */
    public final boolean mo84708aP() {
        return super.mo84708aP();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: ag */
    public final String mo81082ag() {
        return this.f114782aJ.getEnterFromRequestId();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: ah */
    public final String mo81083ah() {
        return this.f114782aJ.getPreviousPage();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: ai */
    public final String mo81084ai() {
        return this.f114782aJ.getSearchKeyword();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: aj */
    public final String mo81085aj() {
        return this.f114782aJ.getContentSource();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: ak */
    public final String mo81086ak() {
        return this.f114782aJ.getLikeEnterMethod();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w
    /* renamed from: bE */
    public final boolean mo84730bE() {
        return super.mo84730bE();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bo */
    public final void mo84762bo() {
        mo84707aO().mo123908B();
    }

    /* renamed from: bv */
    public final View mo84769bv() {
        return mo84788m(true);
    }

    /* renamed from: bw */
    public final void mo84770bw() {
        AbstractC23317a aVar = this.f114808aj;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: i */
    public final String mo81097i() {
        return this.f114782aJ.getEventType();
    }

    /* renamed from: w */
    private static boolean mo70517w() {
        try {
            return C52912c.f121688a.f121689b.getFeedHandleGenericMotion().booleanValue();
        } catch (C16041a unused) {
            return true;
        }
    }

    /* renamed from: y */
    private void mo70429y() {
        mo84707aO().mo123946c(this.f114783aK.mo81172K());
    }

    /* renamed from: B */
    public void mo70436B() {
        Aweme bM = mo84738bM();
        if (bM != null) {
            mo84789m(bM);
        }
    }

    /* renamed from: H */
    public void mo70402H() {
        C35351h.m72351a(new RunnableC49880q(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: aA */
    public final void mo81099aA() {
        C79668l lVar = this.f114845bt;
        if (lVar != null) {
            lVar.mo123213a(C79667k.m138474a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49438k
    /* renamed from: aD */
    public final Aweme mo81109aD() {
        return C50539g.m94745b(mo84754bg());
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49438k
    /* renamed from: aE */
    public final int mo81110aE() {
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null) {
            return this.f114770Y;
        }
        return verticalViewPager.getCurrentItem();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49438k
    /* renamed from: aF */
    public final int mo81111aF() {
        AbstractC48191b bVar = this.f114768W;
        if (bVar == null) {
            return 0;
        }
        return bVar.getCount();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l
    /* renamed from: aH */
    public final C33206c mo81117aH() {
        C49445o oVar = this.f114783aK;
        if (oVar.f113635H == null) {
            oVar.f113635H = new C33206c(oVar);
        }
        return oVar.f113635H;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aI */
    public final boolean mo84701aI() {
        if (!TextUtils.isEmpty(this.f114796aX)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.VideoDownloadStatusBar.AbstractC50021c
    /* renamed from: aM */
    public final void mo84705aM() {
        C34603a.C34604a.f81659a.mo61063a("video_click_retry").postValue(C68909c.f154157e);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: aO */
    public final AbstractC80747i mo84707aO() {
        if (this.f114856n == null) {
            this.f114856n = C81079v.m140776O();
        }
        return this.f114856n;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c
    /* renamed from: aT */
    public final void mo84712aT() {
        super.mo84712aT();
        C31575b.m65859a();
        C31575b.f75524a.mo57064a(this.f114860r);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c
    /* renamed from: aU */
    public final void mo84713aU() {
        super.mo84713aU();
        C31575b.m65859a();
        C31575b.f75524a.mo57066b(this.f114860r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aY */
    public final void mo84717aY() {
        mo84707aO().mo123951z();
        C80749k.m140049a().mo123953b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aZ */
    public final void mo84718aZ() {
        this.f114783aK.mo81195a((String) null, System.currentTimeMillis());
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: al */
    public final String mo81087al() {
        return mo81089an().optString("request_id");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: at */
    public final void mo81101at() {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            bg.mo80214d(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: av */
    public final void mo81103av() {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            bg.mo80214d(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: ax */
    public final boolean mo81105ax() {
        View m = mo84788m(false);
        if (m == null || m.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: bB */
    public final boolean mo84727bB() {
        if (mo70445L() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: bC */
    public final void mo84728bC() {
        AbstractC48148ah bj = mo84757bj();
        if (bj != null) {
            bj.mo80185aa();
        }
    }

    /* renamed from: bD */
    public final int mo84729bD() {
        AbstractC48191b bVar = this.f114768W;
        if (bVar != null) {
            return bVar.getCount() - (this.f114770Y + 1);
        }
        return 0;
    }

    /* renamed from: bG */
    public final void mo84732bG() {
        m93297b(new C49868e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bP */
    public final /* synthetic */ void mo84741bP() {
        this.f114764S = (NewUserFeedProgressBar) this.f114765T.inflate();
        this.f114765T = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bU */
    public final /* synthetic */ void mo84746bU() {
        View view = this.f114761P;
        if (view != null && view.getVisibility() == 8) {
            mo84714aV();
        }
    }

    /* renamed from: bf */
    public final boolean mo84753bf() {
        return TextUtils.equals(this.f114782aJ.getEventType(), "homepage_hot");
    }

    /* access modifiers changed from: protected */
    /* renamed from: bj */
    public final AbstractC48148ah mo84757bj() {
        AbstractC48149ai bg = mo84754bg();
        if (bg == null) {
            return null;
        }
        return bg.mo80231v();
    }

    /* renamed from: bk */
    public final AbstractC48149ai mo84758bk() {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null && !m93300b(bg)) {
            return bg;
        }
        return null;
    }

    /* renamed from: bn */
    public final void mo84761bn() {
        mo70429y();
        C80749k.m140049a().mo123953b();
    }

    /* renamed from: bp */
    public final boolean mo84763bp() {
        C69488a aVar = this.f114794aV;
        if (aVar != null) {
            return aVar.mo109737a("share_panel");
        }
        return this.f114789aQ;
    }

    /* renamed from: bq */
    public final void mo84764bq() {
        if (mo84763bp()) {
            this.f114780aH.mo81315g();
        }
    }

    /* renamed from: by */
    public void mo84772by() {
        mo81102au();
        this.f114842bq = true;
        mo84732bG();
    }

    static {
        Covode.recordClassIndex(58922);
    }

    /* renamed from: D */
    private DataCenter mo70438D() {
        AbstractC48149ai bg = mo84754bg();
        if (bg instanceof AbstractC48234cd) {
            return ((AbstractC48234cd) bg).mo80202aw();
        }
        return null;
    }

    /* renamed from: K */
    private void mo70444K() {
        if (this.f114821aw != null && SharePrefCache.inst().getFollowGuideShown().mo59941c().booleanValue()) {
            mo84726bA();
        }
    }

    /* renamed from: L */
    private int mo70445L() {
        Activity activity = this.f183419bv;
        if (activity == null) {
            return -1;
        }
        if (activity instanceof AbstractC59103j) {
            return 1;
        }
        if (activity instanceof AbstractC41360al) {
            return 2;
        }
        return -1;
    }

    /* renamed from: T */
    private void mo70403T() {
        if (this.f114754A == null) {
            this.f114754A = new C79642b(this.f114759N, this.f114758M);
        }
        this.f114754A.mo123198a();
    }

    /* renamed from: U */
    private void mo70453U() {
        if (this.f114762Q == null && this.f114763R != null) {
            C67246b.m119169a(new RunnableC49873j(this));
        }
    }

    /* renamed from: t */
    private long mo70515t() {
        if (this.f114859q == 0) {
            this.f114859q = System.currentTimeMillis();
        }
        return this.f114859q;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c
    /* renamed from: I */
    public void mo70442I() {
        super.mo70442I();
        for (C49431d dVar : this.f114784aL.f113608a) {
            dVar.mo81056b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l
    /* renamed from: aG */
    public final String mo81116aG() {
        return C50545m.m94769f(this.f114768W.mo80287c(this.f114759N.getCurrentItem()));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: am */
    public final void mo81088am() {
        JSONObject an = mo81089an();
        if (an != null) {
            try {
                AbstractC81915c.m141874a(new C49689q(an.getString("request_id")));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: bA */
    public final void mo84726bA() {
        C17156b bVar = this.f114821aw;
        if (bVar != null) {
            bVar.mo27111e();
            this.f114793aU = false;
            this.f114794aV.mo109736a("follow_guide_popup", false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bN */
    public final void mo84739bN() {
        AbstractC48149ai bg;
        AbstractC48136a P;
        if (C76706a.m134278d(mo84738bM()) && (bg = mo84754bg()) != null && (P = bg.mo80101P()) != null) {
            P.mo80269a(EnumC76739a.LOOP_CURRENT_VIDEO);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bQ */
    public final /* synthetic */ void mo84742bQ() {
        VideoDownloadStatusBar videoDownloadStatusBar = (VideoDownloadStatusBar) this.f114763R.inflate();
        this.f114762Q = videoDownloadStatusBar;
        videoDownloadStatusBar.setVideoDownloadClickListener(this);
        this.f114763R = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bT */
    public final /* synthetic */ void mo84745bT() {
        AbstractC48148ah bj = mo84757bj();
        if (bj != null) {
            bj.mo80187ac();
        }
        mo81115a(mo84738bM(), true, true);
    }

    /* renamed from: bb */
    public final void mo84749bb() {
        AbstractC48149ai k = mo84785k(this.f114801ac);
        if (k != null && (k instanceof AbstractC48145ae) && k.mo80155a() == 101) {
            ((AbstractC48145ae) k).mo80283G();
        }
    }

    /* renamed from: bd */
    public final Boolean mo84751bd() {
        if (!this.f114810al || this.f114809ak) {
            return false;
        }
        return true;
    }

    /* renamed from: be */
    public final void mo84752be() {
        if (!C49656u.m93102b(this.f183419bv) || this.f114838bm) {
            mo84707aO().mo123949x();
        }
    }

    /* renamed from: bl */
    public void mo84759bl() {
        mo84682a(this.f114768W.mo80287c(this.f114759N.getCurrentItem()), true, (AbstractC48149ai) null);
    }

    /* renamed from: bm */
    public final boolean mo84760bm() {
        AbstractC48149ai bg = mo84754bg();
        if (C50539g.m94752e(bg) || (bg != null && bg.mo80225p().mo80228s() == 2)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bs */
    public final String mo84766bs() {
        return C59208ac.m108759a(this.f114768W.mo80287c(this.f114759N.getCurrentItem()), this.f114782aJ.getPageType());
    }

    /* access modifiers changed from: protected */
    /* renamed from: bx */
    public final void mo84771bx() {
        if (this.f114821aw != null && SharePrefCache.inst().getFollowGuideShown().mo59941c().booleanValue()) {
            mo84726bA();
        }
    }

    /* renamed from: bz */
    public final void mo84773bz() {
        if (this.f114821aw != null) {
            mo84726bA();
            VerticalViewPager verticalViewPager = this.f114759N;
            if (verticalViewPager != null) {
                verticalViewPager.removeCallbacks(this.f114849f);
            }
        }
    }

    /* renamed from: G */
    private void mo70441G() {
        boolean booleanValue = SharePrefCache.inst().getFollowGuideShown().mo59941c().booleanValue();
        this.f114774aB = booleanValue;
        if (!booleanValue) {
            C17156b.C17157a aVar = new C17156b.C17157a(this.f183419bv);
            aVar.f40895r = R.string.bye;
            aVar.f40882e = false;
            aVar.f40871A = false;
            aVar.f40889l = 5000;
            this.f114821aw = aVar.mo27113a(new C17156b.AbstractC17161e() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C498347 */

                static {
                    Covode.recordClassIndex(58941);
                }

                @Override // com.bytedance.ies.dmt.p1194ui.p1196b.C17156b.AbstractC17161e
                /* renamed from: a */
                public final void mo27115a() {
                    AbstractC49815a.this.f114774aB = true;
                    SharePrefCache.inst().getFollowGuideShown().mo59940b(true);
                    C59038ax.m108507a().edit().putBoolean("hasFollowGuideShown", true).apply();
                }
            }).mo27114a();
        }
    }

    /* renamed from: m */
    private void mo70387m() {
        NewUserFeedProgressBar newUserFeedProgressBar = this.f114764S;
        if (newUserFeedProgressBar != null) {
            newUserFeedProgressBar.mo85598a(true);
            AbstractC48149ai bg = mo84754bg();
            if (bg instanceof AbstractC48234cd) {
                ((AbstractC48234cd) bg).mo80168a(false, this.f114764S.getHeight());
            } else if (bg instanceof AbstractC48145ae) {
                ((AbstractC48145ae) bg).mo80285f(this.f114764S.getHeight());
            }
        }
    }

    /* renamed from: o */
    private static void mo70389o() {
        Aweme aweme = C68909c.f154157e;
        if (aweme != null) {
            C39162r.m79460a("download_failure_window_show", new C33744d().mo59983a("group_id", aweme.getAid()).mo59983a("author_id", aweme.getAuthorUid()).f79943a);
        }
    }

    /* renamed from: v */
    private boolean mo70428v() {
        if (Objects.equals(this.f114782aJ.getEventType(), "compilation_detail") || Objects.equals(this.f114782aJ.getEventType(), "others_homepage") || Objects.equals(this.f114782aJ.getEventType(), "personal_homepage")) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private boolean mo70518x() {
        C49812b bVar = this.f114782aJ;
        if (bVar == null || !bVar.isMyProfile()) {
            return false;
        }
        if ((this.f114782aJ.getPageType() == 1000 || this.f114782aJ.getPageType() == 1014) && C46920f.m90223c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aJ */
    public final String mo84702aJ() {
        String str = this.f114799aa;
        if (str == null) {
            return getClass().getSimpleName() + hashCode();
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c
    /* renamed from: aS */
    public final void mo84711aS() {
        super.mo84711aS();
        WeakHandler weakHandler = this.f114771Z;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        this.f114783aK = null;
        AbstractC49851ao aoVar = this.f114855m;
        if (aoVar != null) {
            aoVar.mo84885c();
        }
        C69488a aVar = this.f114794aV;
        if (aVar != null && aVar.mo109737a("swipe_up_guide")) {
            this.f114794aV.mo109736a("swipe_up_guide", false);
        }
        AbstractC33200b.f78893a = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aV */
    public final void mo84714aV() {
        if (mo84754bg() != null) {
            C37699a.m76199B(C50539g.m94745b(mo84785k(true)));
        }
        mo84715aW();
        VerticalViewPager verticalViewPager = this.f114759N;
        View view = this.f114760O;
        View view2 = this.f114761P;
        Activity activity = this.f183419bv;
        C49875l lVar = new C49875l(this);
        if (C33403c.f79374d) {
            C29339a.m58752a(new RunnableC33411e(activity, C33403c.f79373c, verticalViewPager, view2, view, lVar));
        } else {
            C29339a.m58752a(new RunnableC33410d(activity, verticalViewPager, view2, lVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aW */
    public void mo84715aW() {
        if (this.f114837bl != 4) {
            this.f114760O.setVisibility(8);
            this.f114761P.setVisibility(8);
            return;
        }
        this.f114760O.setVisibility(0);
        this.f114760O.setBackgroundResource(R.color.a2);
        this.f114761P.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: an */
    public final JSONObject mo81089an() {
        return C50541i.m94754a(this.f114768W.mo80287c(this.f114759N.getCurrentItem()), this.f114782aJ.getPageType(), this.f114782aJ.getEnterMethodValue(), this.f114782aJ.getEventType());
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: ao */
    public final void mo81090ao() {
        Aweme b;
        if (this.f114989bu) {
            AbstractC48149ai bg = mo84754bg();
            if (C50539g.m94752e(bg) && (b = bg.mo80206b()) != null && b != this.f114863u) {
                this.f114863u = b;
                C50546n.m94774a(this.f183419bv, b, mo81089an(), this.f114782aJ, mo81096g(true));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: au */
    public final void mo81102au() {
        final View m = mo84788m(false);
        if (m != null) {
            m.setVisibility(0);
            m.animate().alpha(0.0f).setDuration(100).withEndAction(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.RunnableC4982012 */

                static {
                    Covode.recordClassIndex(58927);
                }

                public final void run() {
                    View view = m;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                }
            }).start();
        }
        Activity activity = this.f183419bv;
        if (activity != null) {
            C50524a.m94704a(activity, activity.getString(R.string.kp));
        }
        mo84770bw();
    }

    /* renamed from: bH */
    public final boolean mo84733bH() {
        try {
            if (!C46796cm.f109016a) {
                return C52912c.f121688a.f121689b.getEnableOnPageSelectPauseCheck().booleanValue();
            }
            Boolean bool = this.f114865w;
            if (bool != null) {
                return bool.booleanValue();
            }
            Boolean enableOnPageSelectPauseCheck = C52912c.f121688a.f121689b.getEnableOnPageSelectPauseCheck();
            this.f114865w = enableOnPageSelectPauseCheck;
            return enableOnPageSelectPauseCheck.booleanValue();
        } catch (C16041a unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bO */
    public final void mo84740bO() {
        AbstractC48149ai bg;
        AbstractC48136a P;
        if (C76706a.m134278d(mo84738bM()) && (bg = mo84754bg()) != null && (P = bg.mo80101P()) != null) {
            P.mo80269a(C77260g.f173332a.mo120137a(this.f114782aJ.getEventType(), this.f114782aJ.getFrom()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bR */
    public final /* synthetic */ void mo84743bR() {
        if (this.f183419bv != null && !this.f183419bv.isFinishing() && super.mo84730bE()) {
            try {
                this.f114852i.showAtLocation(this.f114767V, 17, 0, 0);
                C48317al.m91754a().edit().putBoolean("hasShowUnloginDiggToast", true).apply();
                return;
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
        }
        this.f114826ba = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: ba */
    public final boolean mo84748ba() {
        int aE = mo81110aE() - 1;
        Aweme f = mo81112f(aE);
        while (f != null && C49283a.m92318b(f)) {
            aE--;
            f = mo81112f(aE);
        }
        if (aE >= 0) {
            return m93309k(aE);
        }
        if (mo70428v()) {
            return m93309k(mo81111aF() - 1);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: bg */
    public final AbstractC48149ai mo84754bg() {
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null) {
            return null;
        }
        if (m93299b(verticalViewPager.getCurrentItem(), this.f114797aY)) {
            return this.f114797aY;
        }
        for (int childCount = this.f114759N.getChildCount() - 1; childCount >= 0; childCount--) {
            AbstractC48149ai aiVar = (AbstractC48149ai) this.f114759N.getChildAt(childCount).getTag(R.id.b0u);
            if (m93299b(this.f114759N.getCurrentItem(), aiVar)) {
                return aiVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bh */
    public final AbstractC48149ai mo84755bh() {
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null) {
            return null;
        }
        for (int childCount = verticalViewPager.getChildCount() - 1; childCount >= 0; childCount--) {
            AbstractC48149ai aiVar = (AbstractC48149ai) this.f114759N.getChildAt(childCount).getTag(R.id.b0u);
            if (m93299b(this.f114759N.getCurrentItem() + 1, aiVar)) {
                return aiVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final AbstractC48149ai mo84756bi() {
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null || verticalViewPager.getCurrentItem() <= 0) {
            return null;
        }
        for (int childCount = this.f114759N.getChildCount() - 1; childCount >= 0; childCount--) {
            AbstractC48149ai aiVar = (AbstractC48149ai) this.f114759N.getChildAt(childCount).getTag(R.id.b0u);
            if (m93299b(this.f114759N.getCurrentItem() - 1, aiVar)) {
                return aiVar;
            }
        }
        return null;
    }

    /* renamed from: br */
    public final void mo84765br() {
        AbstractC48149ai bg = mo84754bg();
        AbstractC48149ai bi = mo84756bi();
        AbstractC48149ai bh = mo84755bh();
        if (bg instanceof AbstractC48234cd) {
            bg.mo80226q();
        }
        if (bi instanceof AbstractC48234cd) {
            bi.mo80226q();
        }
        if (bh instanceof AbstractC48234cd) {
            bh.mo80226q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bt */
    public final void mo84767bt() {
        if (this.f114768W.getCount() == 0) {
            DmtStatusView o = mo84794o(true);
            if (o != null) {
                o.setVisibility(0);
                o.mo27385g();
            }
            mo84761bn();
            if (mo84727bB()) {
                AbstractC81915c.m141874a(new C49693u(null));
            }
        }
    }

    /* renamed from: C */
    private void mo70437C() {
        Aweme b;
        AbstractC48149ai bg = mo84754bg();
        if (bg != null && (b = bg.mo80206b()) != null) {
            if (C80631v.m139798a(b) && C38000g.m77051b().isShowCommerceAfterInteraction() && bg.mo80229t() != null) {
                bg.mo80229t().mo65946a(C38000g.m77051b().getDelayTimeAfterInteraction() * 1000, "passive_show");
            } else if (m93294a(b, bg)) {
                if (C37699a.m76208K(b)) {
                    bg.mo80229t().mo65947a((long) (C37699a.m76263ai(b) * 1000));
                } else {
                    bg.mo80229t().mo65946a(C37699a.m76263ai(b) * 1000, "passive_show");
                }
            } else if (C37699a.m76210M(b) && !C37699a.m76212O(b)) {
                bg.mo80229t().mo65947a(0L);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: aw */
    public final void mo81104aw() {
        View m = mo84788m(true);
        if (m != null) {
            m.setVisibility(0);
            m.setScaleX(2.5f);
            m.setScaleY(2.5f);
            m.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).withEndAction(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.RunnableC498369 */

                static {
                    Covode.recordClassIndex(58943);
                }

                public final void run() {
                    String str;
                    if (C46847dp.m90162a()) {
                        AbstractC49815a aVar = AbstractC49815a.this;
                        int b = C34723i.m70928b(aVar.f183419bv);
                        int a = C34723i.m70924a(aVar.f183419bv);
                        int b2 = (int) C13628n.m24520b(aVar.f183419bv, -30.0f);
                        int[] iArr = new int[2];
                        StringBuilder sb = new StringBuilder();
                        Aweme aD = aVar.mo81109aD();
                        int p = aVar.mo84848p(aD);
                        if (aD != null && p != -1) {
                            GreenScreenMaterial greenScreenMaterial = aD.getGreenScreenMaterials().get(p);
                            aVar.f114806ah = greenScreenMaterial.getStickerId();
                            Iterator<String> it = aVar.f114804af.iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                if (sb.length() == 0) {
                                    str = "";
                                } else {
                                    str = ",";
                                }
                                sb.append(str).append(next);
                            }
                            aVar.f114807ai = sb.toString();
                            aVar.f114808aj = ((C23319b) new C23319b(aVar.f183419bv).mo38034a(EnumC23352h.TOP).mo38030a(-1001L).mo38041b(aVar.f114819au).mo38028a(C3966y.m9663b((int) R.color.c7)).mo38039b(b2).mo38027a().mo38038b().mo38036a(true)).mo38011a(new AbstractC89172b<C23322d, C89391z>(greenScreenMaterial, aD) {
                                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C4981710 */

                                /* renamed from: a */
                                final /* synthetic */ GreenScreenMaterial f114870a;

                                /* renamed from: b */
                                final /* synthetic */ Aweme f114871b;

                                static {
                                    Covode.recordClassIndex(58924);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                public final /* synthetic */ C89391z invoke(C23322d dVar) {
                                    String authorName;
                                    C23322d dVar2 = dVar;
                                    C23322d.C23323a aVar = new C23322d.C23323a();
                                    Activity activity = AbstractC49815a.this.f183419bv;
                                    Object[] objArr = new Object[1];
                                    if (TextUtils.isEmpty(this.f114870a.getAuthorName())) {
                                        authorName = "GIPHY";
                                    } else {
                                        authorName = this.f114870a.getAuthorName();
                                    }
                                    objArr[0] = authorName;
                                    aVar.mo38016a(activity.getString(R.string.c44, objArr));
                                    aVar.f55279f = new View.OnClickListener() {
                                        /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C4981710.View$OnClickListenerC498181 */

                                        static {
                                            Covode.recordClassIndex(58925);
                                        }

                                        public final void onClick(View view) {
                                            int i;
                                            ClickAgent.onClick(view);
                                            AbstractC49815a aVar = AbstractC49815a.this;
                                            String str = AbstractC49815a.this.f114806ah;
                                            String str2 = AbstractC49815a.this.f114807ai;
                                            Aweme aD = aVar.mo81109aD();
                                            if (aD.getVideo() != null) {
                                                i = aD.getVideo().getVideoLength();
                                            } else {
                                                i = 0;
                                            }
                                            PropReuseServiceImpl.m116994c().mo104483a(aVar.f183419bv, aD, str, str2, "Feed", aD.getGroupId(), i);
                                            AbstractC49815a.this.mo84770bw();
                                            C39162r.m79460a("click_media_tooltip", new C33744d().mo59983a("group_id", C4981710.this.f114871b.getGroupId()).mo59983a("giphy_id", AbstractC49815a.this.f114807ai).mo59983a("prop_id", AbstractC49815a.this.f114806ah).mo59983a("media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[C4981710.this.f114870a.getType()]).f79943a);
                                        }
                                    };
                                    dVar2.mo38014a(aVar);
                                    return C89391z.f203057a;
                                }

                                {
                                    this.f114870a = r2;
                                    this.f114871b = r3;
                                }
                            }).mo38012d();
                            if (!aVar.f114808aj.isShowing()) {
                                aVar.f114819au.getLocationOnScreen(iArr);
                                if (iArr[0] >= 0 && iArr[0] <= b && iArr[1] >= 0 && iArr[1] <= a) {
                                    aVar.f114808aj.mo38001a();
                                    C39162r.m79460a("show_media_tooltip", new C33744d().mo59983a("group_id", aD.getGroupId()).mo59983a("giphy_id", aVar.f114804af.get(0)).mo59983a("prop_id", aVar.f114806ah).mo59983a("media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[greenScreenMaterial.getType()]).f79943a);
                                }
                            }
                        }
                    }
                }
            }).start();
            m.setSelected(false);
        }
        C50524a.m94705a(this.f183419bv, this.f183419bv.getString(R.string.kp), false, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: ay */
    public final void mo81106ay() {
        User currentUser;
        if (!C59038ax.m108507a().getBoolean("hasFollowGuideShown", false) && !this.f114790aR && !this.f114788aP && !this.f114793aU) {
            AbstractC48149ai bg = mo84754bg();
            if (bg == null || bg.mo80206b() == null || !bg.mo80206b().isAd()) {
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                if ((createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null || currentUser.getFollowingCount() <= 0) && !this.f114794aV.mo109737a("gif_download_dialog") && !this.f114794aV.mo109737a("swipe_up_guide") && this.f114821aw != null && C49594i.m93011d()) {
                    C49594i.m93009b();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: bM */
    public final Aweme mo84738bM() {
        AbstractC48191b bVar;
        AbstractC48149ai T;
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null || (bVar = this.f114768W) == null) {
            return null;
        }
        Aweme c = bVar.mo80287c(verticalViewPager.getCurrentItem());
        if (!C76706a.m134277c(c)) {
            return c;
        }
        AbstractC48149ai bg = mo84754bg();
        if (bg != null && (T = bg.mo80105T()) != null) {
            return T.mo80206b();
        }
        UserStory userStory = c.getUserStory();
        if (UserStoryKt.currentStory(userStory) != null) {
            return UserStoryKt.currentStory(userStory);
        }
        if (userStory.getStories().size() == 0) {
            return null;
        }
        if (UserStoryKt.currentStory(userStory) == null) {
            return userStory.getStories().get(0);
        }
        return UserStoryKt.currentStory(userStory);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c
    /* renamed from: q */
    public void mo70513q() {
        super.mo70513q();
        C80749k.f180544c = mo70515t();
        String sb = new StringBuilder().append(mo84707aO().mo123918L().hashCode()).toString();
        C89219l.m154721d(this, "");
        C89219l.m154721d(sb, "");
        if (!C49854ar.m93566a().containsKey(String.valueOf(hashCode()))) {
            C49854ar.m93566a().put(String.valueOf(hashCode()), sb);
        }
        this.f114783aK.mo81165D();
        this.f114783aK.mo81203b(false);
        if (C16048b.m29633a().mo25412a(true, "gather_mode", 0) != 0) {
            C80750l a = C80750l.m140052a(this.f183419bv);
            if (a.f180551b != null) {
                if (a.f180552c == null) {
                    a.f180552c = new PhoneStateListener() {
                        /* class com.p2082ss.android.ugc.aweme.video.C80750l.C807511 */

                        static {
                            Covode.recordClassIndex(94041);
                        }

                        public final void onCellLocationChanged(CellLocation cellLocation) {
                            if (!((Boolean) C15346a.m28238a(this, new Object[]{cellLocation}, 100911, "void", false, null).first).booleanValue()) {
                                C15346a.m28243a(this, new Object[]{cellLocation}, 100911, "onCellLocationChanged(Landroid/telephony/CellLocation;)V");
                            }
                        }

                        public final void onServiceStateChanged(ServiceState serviceState) {
                        }

                        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                            int i;
                            try {
                                int parseInt = Integer.parseInt(signalStrength.toString().split(" ")[9]);
                                int gsmSignalStrength = (signalStrength.getGsmSignalStrength() * 2) - 113;
                                TelephonyManager telephonyManager = C80750l.this.f180551b;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    if (!C58017a.f132225a.getAndSet(true)) {
                                        C58017a.m104840a().mo95542a();
                                    }
                                    i = C58017a.m104840a().f132229b.get();
                                    if (!C58017a.f132227c && i == -1) {
                                        C80750l.this.f180550a = gsmSignalStrength;
                                    }
                                } else {
                                    i = telephonyManager.getNetworkType();
                                }
                                if (i == 13) {
                                    C80750l.this.f180550a = parseInt;
                                    return;
                                }
                                C80750l.this.f180550a = gsmSignalStrength;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                }
                a.f180551b.listen(a.f180552c, 256);
            }
        }
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            bg.mo80082l();
            bg.mo80210c(2);
        }
        if (this.f114845bt != null) {
            int i = this.f114854l;
            this.f114854l = i + 1;
            if (!(i == 0 || !this.f114827bb || this.f114759N.getChildCount() == 0)) {
                this.f114845bt.mo123213a(C79667k.m138474a());
            }
        }
        this.f114829bd = false;
        C49628k.m93078a(true);
        mo84783j(mo81109aD());
        mo84703aK();
        if (this.f114866x) {
            this.f114866x = false;
            SettingServiceImpl.m120782v().mo108864a(false, aH_().getFragmentManager());
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w
    /* renamed from: r */
    public void mo70413r() {
        C89219l.m154721d(this, "");
        C49854ar.m93566a().remove(String.valueOf(hashCode()));
        this.f114783aK.mo81175N();
        this.f114783aK.mo81168G();
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            bg.mo70620j();
        }
        ArrayList<AbstractC48149ai> arrayList = new ArrayList();
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager != null) {
            for (int childCount = verticalViewPager.getChildCount() - 1; childCount >= 0; childCount--) {
                Object tag = this.f114759N.getChildAt(childCount).getTag(R.id.b0u);
                if (tag != null) {
                    arrayList.add(tag);
                }
            }
        }
        for (AbstractC48149ai aiVar : arrayList) {
            aiVar.mo80080c();
        }
        Runnable runnable = this.f114776aD;
        if (runnable != null) {
            VerticalViewPager verticalViewPager2 = this.f114759N;
            if (verticalViewPager2 != null) {
                verticalViewPager2.removeCallbacks(runnable);
            }
            Handler handler = this.f114848e;
            if (handler != null) {
                handler.removeCallbacks(this.f114776aD);
            }
            this.f114776aD = null;
        }
        VerticalViewPager verticalViewPager3 = this.f114759N;
        if (!(verticalViewPager3 == null || verticalViewPager3.f92488e == null)) {
            verticalViewPager3.f92488e.clear();
        }
        super.mo70413r();
        C49995z zVar = this.f114825b;
        if (zVar != null) {
            zVar.ck_();
        }
        C49964ag agVar = this.f114847d;
        if (agVar != null) {
            agVar.ck_();
        }
        AbstractC51754w wVar = this.f114820av;
        if (wVar != null) {
            wVar.ck_();
        }
        if (mo84707aO().mo123945b(this.f114783aK.mo81172K())) {
            mo84707aO().mo123937a((OnUIPlayListener) null);
        }
        C80749k.m140049a();
        C50131bn bnVar = this.f114852i;
        if (bnVar != null) {
            bnVar.mo85273a();
            this.f114852i = null;
        }
        VideoDownloadStatusBar.f115447h.remove(this);
        C38684bk a = C38684bk.m78498a();
        a.f91395e = null;
        a.f91392b = null;
        a.f91391a.removeCallbacks(a.f91396f);
        C63332a.C63333a.m114832a().mo101923b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        if ("general_search".equalsIgnoreCase(r1) == false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015a, code lost:
        if (r4 == null) goto L_0x00e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6  */
    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70443J() {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.mo70443J():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49437j
    /* renamed from: aB */
    public final void mo81100aB() {
        View a;
        TuxTextView tuxTextView;
        CharSequence text;
        Integer valueOf;
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager != null && verticalViewPager.getChildCount() != 0) {
            if (this.f114844bs == null && mo70447N() != null) {
                this.f114844bs = new C79648d(mo70447N(), this.f114759N, "home_swipe_up_lottie_android.json", C79665j.C79666a.m138473a(), TextUtils.equals(this.f114782aJ.getEventType(), "homepage_hot"));
            }
            C79648d dVar = this.f114844bs;
            if (dVar != null) {
                if (dVar.f178734e == null) {
                    if (C46902eq.m90200a()) {
                        Context context = dVar.f178738i.getContext();
                        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                        a = C1870c.m6045a((Activity) context, (int) R.layout.tg);
                    } else {
                        a = C1764a.m5927a(LayoutInflater.from(dVar.f134477a.getContext()), R.layout.tg, dVar.f178738i, false);
                    }
                    dVar.f178734e = a;
                    View view = dVar.f178734e;
                    Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout");
                    dVar.f178737h = (SwipeUpGuideStrengthenLayout) view;
                    SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = dVar.f178737h;
                    if (swipeUpGuideStrengthenLayout != null) {
                        swipeUpGuideStrengthenLayout.setViewPager(dVar.f178739j);
                        swipeUpGuideStrengthenLayout.setFallBackRunnable(new C79648d.RunnableC79651c(dVar));
                    }
                    View view2 = dVar.f178734e;
                    if (!(view2 == null || (tuxTextView = (TuxTextView) view2.findViewById(R.id.f4r)) == null || (text = tuxTextView.getText()) == null || (valueOf = Integer.valueOf(text.length())) == null)) {
                        int intValue = valueOf.intValue();
                        if (intValue > 0) {
                            if (20 < intValue) {
                                if (20 <= intValue && 40 >= intValue) {
                                    tuxTextView.setTextSize(25.0f);
                                }
                            }
                        }
                        tuxTextView.setTextSize(20.0f);
                    }
                }
                View view3 = dVar.f178734e;
                if (view3 == null || view3.getParent() == null) {
                    dVar.f178738i.addView(dVar.f178734e);
                }
                View view4 = dVar.f178734e;
                if (view4 != null) {
                    view4.setVisibility(0);
                    view4.setAlpha(0.0f);
                    view4.animate().alpha(1.0f).setDuration(300).withEndAction(new C79648d.RunnableC79652d(view4, dVar)).start();
                    if (C89219l.m154714a((Object) dVar.f178740k, (Object) "home_swipe_up_lottie_android.json")) {
                        C39162r.m79460a("new_user_guide_show", new C33744d().mo59983a("guide_type", "slide").f79943a);
                    }
                    dVar.f178731b.mo109736a("swipe_up_guide", true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bV */
    public final /* synthetic */ void mo84747bV() {
        boolean z;
        boolean z2;
        if (C67261e.m119186d()) {
            mo70453U();
        }
        if (C50539g.m94745b(mo84754bg()) == null || !m93310k(C50539g.m94745b(mo84754bg()))) {
            z = false;
        } else {
            z = true;
        }
        if (z || C68906a.f154143a == 3) {
            z2 = false;
        } else {
            z2 = true;
        }
        mo70477b(z2);
        int i = C68906a.f154143a;
        if (i == 1) {
            mo84739bN();
            if (!z) {
                VideoDownloadStatusBar videoDownloadStatusBar = this.f114762Q;
                VideoDownloadStatusBar.m93909d();
                videoDownloadStatusBar.mo85117a();
                VideoDownloadStatusBar.f115449j = 0;
                ImageView imageView = videoDownloadStatusBar.f115452b;
                if (imageView == null) {
                    C89219l.m154710a("mDownloadSuccessImageView");
                }
                imageView.setVisibility(8);
                TextView textView = videoDownloadStatusBar.f115453c;
                if (textView == null) {
                    C89219l.m154710a("mDownloadSuccessTextView");
                }
                textView.setVisibility(8);
                TextView textView2 = videoDownloadStatusBar.f115456f;
                if (textView2 == null) {
                    C89219l.m154710a("mDownloadFailedTextView");
                }
                textView2.setVisibility(8);
                RelativeLayout relativeLayout = videoDownloadStatusBar.f115451a;
                if (relativeLayout == null) {
                    C89219l.m154710a("mDownloadProgressViewRoot");
                }
                relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
                RelativeLayout relativeLayout2 = videoDownloadStatusBar.f115451a;
                if (relativeLayout2 == null) {
                    C89219l.m154710a("mDownloadProgressViewRoot");
                }
                relativeLayout2.setVisibility(0);
                TextView textView3 = videoDownloadStatusBar.f115454d;
                if (textView3 == null) {
                    C89219l.m154710a("mDownloadProgressView");
                }
                textView3.setVisibility(0);
                TextView textView4 = videoDownloadStatusBar.f115455e;
                if (textView4 == null) {
                    C89219l.m154710a("mDownloadingStatusTextView");
                }
                textView4.setVisibility(0);
                TextView textView5 = videoDownloadStatusBar.f115457g;
                if (textView5 == null) {
                    C89219l.m154710a("mDownloadVideoCancelView");
                }
                textView5.setVisibility(0);
                RelativeLayout relativeLayout3 = videoDownloadStatusBar.f115451a;
                if (relativeLayout3 == null) {
                    C89219l.m154710a("mDownloadProgressViewRoot");
                }
                relativeLayout3.requestLayout();
                mo70477b(true);
            } else if (C68909c.m121608c() && !C68909c.m121609d()) {
                new C79459a(C17867d.m33078a()).mo123050a(R.string.fe0).mo123053a();
            }
        } else if (i == 2) {
            mo84739bN();
            if (!z) {
                this.f114762Q.mo85118a(C68906a.f154144b);
            }
        } else if (i == 3) {
            mo84740bO();
        } else if (i == 4) {
            mo84740bO();
            if (VideoDownloadStatusBar.f115448i.hasMessages(1) && !z) {
                this.f114762Q.mo85119b();
                mo70477b(true);
            } else if (!C68909c.m121608c() || C68909c.m121609d()) {
                mo70477b(false);
            } else if (!z) {
                this.f114762Q.mo85119b();
                mo70477b(true);
            } else {
                mo70477b(false);
                new C79459a(C17867d.m33078a()).mo123050a(R.string.h7p).mo123053a();
            }
        } else if (i != 5) {
            mo84740bO();
        } else {
            mo84740bO();
            if (VideoDownloadStatusBar.f115448i.hasMessages(2) && !z) {
                this.f114762Q.mo85120c();
                mo70477b(true);
                mo70389o();
            } else if (!C68909c.m121608c() || C68909c.m121609d()) {
                mo70477b(false);
            } else if (!z) {
                this.f114762Q.mo85120c();
                mo70477b(true);
                mo70389o();
            } else {
                VideoDownloadStatusBar.m93907a(2, 20000);
                mo70477b(false);
            }
        }
    }

    /* renamed from: bu */
    public final void mo84768bu() {
        AbstractC48149ai bg;
        AbstractC48148ah bj;
        int[] Z;
        if (!super.mo84730bE() || !this.f114827bb || !mo84753bf() || this.f114794aV.mo109737a("download_dialog")) {
            return;
        }
        if (C50539g.m94745b(mo84754bg()) == null || !C50539g.m94745b(mo84754bg()).isLive()) {
            BusinessComponentServiceUtils.getBusinessBridgeService().mo121230b();
            if (C67248d.m119182j()) {
                mo70441G();
            }
            if (this.f114821aw != null && !SharePrefCache.inst().getFollowGuideShown().mo59941c().booleanValue() && (bg = mo84754bg()) != null && !C50545m.m94762a(bg.mo80206b()) && (bj = mo84757bj()) != null && (Z = bj.mo80154Z()) != null) {
                if (C80471gb.m139483a(this.f183419bv)) {
                    this.f114821aw.mo27104a(this.f114767V, 5, Z[0] + ((int) C13628n.m24520b(this.f183419bv, 40.0f)), Z[1] - ((int) C13628n.m24520b(this.f183419bv, 45.0f)), (float) ((this.f114821aw.mo27108c() / 2) + ((int) C13628n.m24520b(this.f183419bv, 4.0f))));
                } else {
                    C17156b bVar = this.f114821aw;
                    bVar.mo27104a(this.f114767V, 3, (Z[0] - bVar.mo27109d()) - ((int) C13628n.m24520b(this.f183419bv, 10.0f)), (Z[1] - (this.f114821aw.mo27108c() / 2)) - ((int) C13628n.m24520b(this.f183419bv, 12.0f)), (float) ((this.f114821aw.mo27108c() / 2) + ((int) C13628n.m24520b(this.f183419bv, 4.0f))));
                }
                this.f114821aw.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C498358 */

                    static {
                        Covode.recordClassIndex(58942);
                    }

                    public final void onDismiss() {
                        AbstractC49815a.this.f114793aU = false;
                        AbstractC49815a.this.f114794aV.mo109736a("follow_guide_popup", AbstractC49815a.this.f114793aU);
                    }
                });
                this.f114793aU = true;
                this.f114794aV.mo109736a("follow_guide_popup", true);
                C39162r.m79460a("follow_hint_guide_show ", new C33744d().f79943a);
                C39162r.m79460a("new_user_guide_show", new C33744d().mo59983a("guide_type", "follow").f79943a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2  */
    /* renamed from: aK */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84703aK() {
        /*
        // Method dump skipped, instructions count: 811
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.mo84703aK():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an
    /* renamed from: b */
    public final void mo84720b(long j) {
        this.f114756K = j;
    }

    @AbstractC90264r
    public void onDismissEnterMusicGuideEvent(C49679g gVar) {
        mo84728bC();
    }

    @AbstractC90264r
    public void onEvent(C49670ae aeVar) {
        mo84703aK();
    }

    public AbstractC49815a(String str) {
        this(str, 0);
    }

    /* renamed from: r */
    private void m93316r(boolean z) {
        m93291a(mo84738bM(), z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo84681a(AbstractC88433f fVar) {
        m93297b(fVar);
        return null;
    }

    /* renamed from: e */
    public String mo70489e(Aweme aweme) {
        return mo84682a(aweme, true, (AbstractC48149ai) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49438k
    /* renamed from: f */
    public final Aweme mo81112f(int i) {
        return this.f114768W.mo80287c(i);
    }

    /* renamed from: m */
    public void mo84789m(Aweme aweme) {
        mo70406b(aweme);
        mo81090ao();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an
    /* renamed from: o */
    public final void mo84795o(Aweme aweme) {
        mo81115a(aweme, true, false);
    }

    @AbstractC90264r
    public void onDismissEnterMusicGuideEvent(C59043a aVar) {
        mo84728bC();
    }

    @AbstractC90264r
    public void onLoginPageCloseEvent(C58953a aVar) {
        mo70488d(false);
    }

    @AbstractC90264r
    public void onLoginPageShowEvent(C58954b bVar) {
        mo70488d(bVar.f134194a);
    }

    /* renamed from: p */
    public final AbstractC49815a mo84849p(String str) {
        this.f114782aJ.setEnterMethodValue(str);
        return this;
    }

    /* renamed from: b */
    public static boolean m93300b(AbstractC48149ai aiVar) {
        if (aiVar.mo80155a() == 101) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void mo70488d(boolean z) {
        this.f114790aR = z;
        this.f114794aV.mo109736a("login_panel", z);
        if (z) {
            mo70444K();
        }
    }

    /* renamed from: k */
    public static boolean m93310k(Aweme aweme) {
        if (C37699a.m76314s(aweme) || C37699a.m76199B(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m93312l(Aweme aweme) {
        if (aweme == null || C38701br.m78511a(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w
    /* renamed from: e */
    public void mo70492e(boolean z) {
        super.mo70492e(z);
        mo84853q(true);
        if (z) {
            mo84732bG();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo84780i(boolean z) {
        if (z) {
            mo70444K();
        } else {
            mo70437C();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final AbstractC48149ai mo84782j(int i) {
        return (AbstractC48149ai) this.f114759N.getChildAt(i).getTag(R.id.b0u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo84792n(Aweme aweme) {
        mo84694a(aweme, (String) null, this.f114851h, "");
    }

    @AbstractC90264r
    public void onDismissInteractStickerPop(C49680h hVar) {
        AbstractC48148ah bj = mo84757bj();
        if (bj != null) {
            bj.mo80187ac();
        }
    }

    @AbstractC90264r
    public void onEvent(C56251d dVar) {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            bg.mo80115a(dVar);
        }
    }

    @AbstractC90264r
    public void onFakeLabelEvent(C36392g gVar) {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            bg.mo80167a(gVar.f86071a, gVar.f86072b);
        }
    }

    @AbstractC90264r
    public void onFakeSwipeEvent(C79639a aVar) {
        if (super.mo84708aP()) {
            mo70403T();
        }
    }

    @AbstractC90264r
    public void onPopUpShowEvent(C79664i iVar) {
        UgAllServiceImpl.m65444c().mo57252a(this.f183419bv);
    }

    @AbstractC90264r
    public void onPrivateModelEvent(C49695w wVar) {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            bg.mo80161a(wVar);
        }
    }

    @AbstractC90264r
    public void onPushNotificationDialogShowed(C79656f fVar) {
        C79668l lVar;
        if (!fVar.f178754a && (lVar = this.f114845bt) != null) {
            lVar.mo123213a(0);
        }
    }

    @AbstractC90264r
    public void onRestrictEvent(C68068c cVar) {
        AbstractC48148ah bj = mo84757bj();
        if (bj != null) {
            bj.mo80153Y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo84851q(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            this.f114779aG = false;
        }
        this.f114851h = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an
    /* renamed from: r */
    public final Aweme mo84854r(Aweme aweme) {
        int currentItem;
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null) {
            currentItem = this.f114770Y;
        } else {
            currentItem = verticalViewPager.getCurrentItem();
        }
        return mo70468a(aweme, currentItem);
    }

    /* renamed from: f */
    private void mo70494f(boolean z) {
        m93317s(z);
        this.f114789aQ = z;
        this.f114794aV.mo109736a("share_panel", z);
        AbstractC48149ai bg = mo84754bg();
        if (bg != null && bg.mo80229t() != null) {
            bg.mo80229t().mo65972e(z);
        }
    }

    /* renamed from: k */
    private boolean m93309k(int i) {
        if (i < 0 || i > this.f114768W.getCount() - 1) {
            return false;
        }
        if (C17873f.f42636l) {
            this.f114759N.mo67973a(i, false);
        } else {
            this.f114759N.setCurrentItemWithDefaultVelocity(i);
        }
        return true;
    }

    /* renamed from: o */
    protected static boolean m93315o(String str) {
        if (C80860b.m140277b(C80860b.m140276a(str)) || C49326i.m92417a(str)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: d_ */
    public final void mo71322d_(Exception exc) {
        if (super.mo84730bE()) {
            CaptchaHelperServiceImpl.m72448a();
            C39143l.m79438a(C34729o.m70950a((Context) this.f183419bv), exc);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: g */
    public final String mo81096g(boolean z) {
        return C49619e.m93060a(this.f114782aJ.getPageType(), this.f114782aJ.getEventType(), z);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49990v
    /* renamed from: h */
    public void mo70497h(String str) {
        AbstractC81915c.m141874a(new C49672ag(2, str));
        if (mo81105ax()) {
            mo81102au();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an
    /* renamed from: l */
    public final void mo84786l(final String str) {
        WeakHandler weakHandler = this.f114771Z;
        if (weakHandler != null) {
            Message obtain = Message.obtain(weakHandler, new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.RunnableC4982113 */

                static {
                    Covode.recordClassIndex(58928);
                }

                public final void run() {
                    if (AbstractC49815a.this.f114771Z != null) {
                        AbstractC49815a.this.f114771Z.removeMessages(10);
                    }
                    AbstractC48149ai aC = AbstractC49815a.this.mo81108aC();
                    if (aC != null && aC.mo80206b() != null && TextUtils.equals(aC.mo80206b().getAid(), str) && aC.mo80206b().isLive() && AbstractC49815a.this.mo84730bE()) {
                        Aweme b = aC.mo80206b();
                        C77354d.m135256a(1, b.getAuthor().getUid(), b.getAuthor().roomId, C77354d.m135255a("homepage_follow", "live", AbstractC49815a.this.mo81089an().optString("request_id")));
                    }
                }
            });
            obtain.what = 10;
            this.f114771Z.sendMessageDelayed(obtain, 60000);
        }
    }

    /* renamed from: n */
    public void mo84793n(boolean z) {
        int i;
        this.f114842bq = false;
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            if (z) {
                i = 4;
            } else {
                i = 5;
            }
            bg.mo80207b(i);
        }
    }

    @AbstractC90264r
    public void onAdFeedRefreshEvent(C33215a aVar) {
        Aweme b;
        AbstractC48149ai bg = mo84754bg();
        if (C50539g.m94752e(bg) && (b = bg.mo80206b()) != null && b.isAd()) {
            this.f114779aG = true;
        }
    }

    @AbstractC90264r
    public void onCleanModeChangedEvent(C59064a aVar) {
        boolean z = C59063c.m108543a().f134455a;
        for (int i = 0; i < this.f114759N.getChildCount(); i++) {
            AbstractC48149ai j = mo84782j(i);
            if (j != null) {
                j.mo80095b(z);
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onCommentBubbleItemClicked(C36386b bVar) {
        if (bVar != null && !this.f114829bd) {
            m93304c(C50539g.m94745b(mo84754bg()), bVar.f86059a, bVar.f86060b, "bullet");
        }
    }

    @AbstractC90264r
    public void onDeleteAwemeEventOnBase(C49677e eVar) {
        if (C49495aa.m92734a()) {
            C51423a.m95784a(4, "BaseListFragmentPanel", "BaseListFragmentPanel onDeleteAweme");
        }
        this.f114759N.post(new RunnableC49881r(this));
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C33489d dVar) {
        if (dVar.f79559b) {
            m93317s(dVar.f79558a);
        } else if (dVar.f79558a) {
            mo84739bN();
        } else {
            mo84740bO();
        }
    }

    @AbstractC90264r
    public void onLandPagePopupWebShowEvent(C35197k kVar) {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null && bg.mo80229t() != null) {
            bg.mo80229t().mo65953a(kVar);
        }
    }

    @AbstractC90264r(mo145423b = true, mo145424c = -1)
    public void onPublishStatus(C71900f fVar) {
        if (fVar.f161088b == 10) {
            C50114bh.f115687b = false;
            if (mo84754bg() instanceof VideoViewCell) {
                ((VideoViewCell) mo84754bg()).mo80220g(true);
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onRegisterProgressEvent(C33133p pVar) {
        AbstractC48149ai bg;
        if (pVar != null && (bg = mo84754bg()) != null && bg.mo80229t() != null) {
            bg.mo80229t().mo65950a(pVar);
        }
    }

    @AbstractC90264r
    public void onTabSwitched(C69332d dVar) {
        C79668l lVar;
        C79668l lVar2;
        boolean z = dVar.f154902a;
        this.f114827bb = z;
        if (!z && (lVar2 = this.f114845bt) != null) {
            lVar2.mo123215c();
        }
        if (this.f114827bb && (lVar = this.f114845bt) != null) {
            lVar.mo123213a(C79667k.m138474a());
        }
    }

    /* renamed from: a */
    private static int mo70386a(RelativeLayout relativeLayout) {
        relativeLayout.measure(0, 0);
        int measuredHeight = relativeLayout.getMeasuredHeight();
        int a = C33403c.m68502a();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, (((ViewGroup) relativeLayout.getParent()).getHeight() - measuredHeight) - a, 0, a);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.requestLayout();
        return measuredHeight;
    }

    /* renamed from: b */
    private void mo70406b(Aweme aweme) {
        if (!C80636z.m139816a(aweme) && !C49912a.m93714a(this.f183419bv).booleanValue() && this.f183419bv != null) {
            AbstractC48149ai bg = mo84754bg();
            if (C80771f.f180597a && bg != null) {
                bg.mo80210c(1);
            }
            if (AwemeChangeCallBack.m108593a((ActivityC0945e) this.f183419bv) != aweme) {
                AwemeChangeCallBack.m108596a((ActivityC0945e) this.f183419bv, aweme);
            }
            this.f114783aK.mo81183a(aweme, 0);
        }
    }

    /* renamed from: c */
    private void mo70481c(Aweme aweme) {
        if (!TextUtils.isEmpty(this.f114782aJ.getEventType()) && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            C49648o oVar = new C49648o(aweme.getAid(), 4, System.currentTimeMillis(), this.f114782aJ.getEventType());
            oVar.f114274a = aweme.getAuthorUid();
            C49653t.m93096a(oVar);
        }
    }

    /* renamed from: s */
    private void m93317s(boolean z) {
        if (C76706a.m134278d(mo84738bM())) {
            if (z) {
                this.f114755B++;
            } else {
                this.f114755B--;
            }
            if (this.f114755B > 0) {
                mo84739bN();
            } else {
                mo84740bO();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49438k
    /* renamed from: g */
    public final int mo81113g(Aweme aweme) {
        List<Aweme> e = this.f114768W.mo80288e();
        for (int i = 0; i < e.size(); i++) {
            if (!(aweme == null || e.get(i) == null || !e.get(i).getAid().equals(aweme.getAid()))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: h */
    public final String mo84775h(Aweme aweme) {
        Aweme aweme2;
        Aweme aweme3 = null;
        if (!C38000g.m77057h().mo67250b(aweme)) {
            return null;
        }
        List<Aweme> e = this.f114768W.mo80288e();
        int indexOf = e.indexOf(aweme);
        if (indexOf > 0) {
            aweme2 = this.f114768W.mo80326d(indexOf - 1);
        } else {
            aweme2 = null;
        }
        if (indexOf < e.size() - 1) {
            aweme3 = this.f114768W.mo80326d(indexOf + 1);
        }
        return C37699a.m76225a(aweme2, aweme3);
    }

    /* renamed from: i */
    public final void mo84779i(int i) {
        Aweme c = this.f114768W.mo80287c(i);
        if (!m93312l(c)) {
            mo84684a(i, c);
            C38000g.m77057h().mo67251c(c);
        }
        FeedAdServiceImpl.m67808c().mo58883b().mo59088a(c, new C49879p(this));
    }

    @AbstractC90264r
    public void initTopPageEvent(C49675c cVar) {
        AbstractC48149ai bg = mo84754bg();
        if (bg != null && bg.mo80229t() != null && bg.mo80229t().mo65982o() != null) {
            bg.mo80229t().mo65982o().mo67558b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: j */
    public final boolean mo84784j(boolean z) {
        int aE = mo81110aE() + 1;
        Aweme f = mo81112f(aE);
        if (z) {
            while (f != null && C49283a.m92318b(f)) {
                aE++;
                f = mo81112f(aE);
            }
        }
        if (aE < mo81111aF()) {
            return m93309k(aE);
        }
        if (!mo70428v() || aE != mo81111aF()) {
            return false;
        }
        return m93309k(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final AbstractC48149ai mo84785k(boolean z) {
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null) {
            return null;
        }
        int childCount = verticalViewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AbstractC48149ai j = mo84782j(i);
            int currentItem = this.f114759N.getCurrentItem();
            int i2 = z ? currentItem - 1 : currentItem + 1;
            if (i2 < 0) {
                return null;
            }
            if (m93299b(i2, j)) {
                return j;
            }
        }
        return null;
    }

    /* renamed from: l */
    public void mo84787l(boolean z) {
        m93316r(z);
        View m = mo84788m(false);
        if (m != null) {
            m.setAlpha(0.0f);
        }
    }

    /* renamed from: n */
    public final AbstractC48149ai mo84791n(String str) {
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null) {
            return null;
        }
        int childCount = verticalViewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AbstractC48149ai aiVar = (AbstractC48149ai) this.f114759N.getChildAt(i).getTag(R.id.b0u);
            if (!(aiVar == null || aiVar.mo80089O() == null || !C13627m.m24499a(aiVar.mo80089O().getAid(), str))) {
                return aiVar;
            }
        }
        return null;
    }

    @AbstractC90264r
    public void onAddVideoToMixEvent(C59401a aVar) {
        if (aVar.f135693a != null) {
            DmtStatusView o = mo84794o(true);
            if (o != null) {
                o.mo27384f();
            }
            this.f114759N.setDisableScroll(true);
            if (C50539g.m94745b(mo84754bg()) == aVar.f135693a) {
                m93303c(aVar.f135693a, "long_press");
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onCommentListPageDialogEvent(C36389e eVar) {
        Activity activity = this.f183419bv;
        if (activity != null && !activity.isFinishing() && eVar.f86068b == activity.hashCode()) {
            if (eVar.f86067a == 1) {
                mo84739bN();
                return;
            }
            m93292a(false, C50323k.EnumC50325b.POST);
            mo84740bO();
        }
    }

    @AbstractC90264r
    public void onEvent(C33212c cVar) {
        AbstractC48149ai bg;
        AbstractC37879bc t;
        if (cVar != null && (bg = mo84754bg()) != null && TextUtils.equals(cVar.f78908a, bg.mo80206b().getAid()) && (t = bg.mo80229t()) != null) {
            t.mo65935K();
        }
    }

    @AbstractC90264r
    public void onFeedDislikeEventEvent(C49684l lVar) {
        if (!this.f114781aI.booleanValue()) {
            Aweme b = C50539g.m94745b(mo84754bg());
            if (mo84753bf() && b != null && !this.f114833bh && !b.isAd() && C49628k.m93079a(b.getAid(), b.getAuthorUid(), b.isWithSurvey(), this.f114803ae.size())) {
                C49628k.f114224q = true;
            }
        }
    }

    @AbstractC90264r
    public void onNetStateChangeEvent(C39148c cVar) {
        if (C34719f.C34720a.f82009a.mo61395c()) {
            String str = f114752J;
            C51423a.m95793c(3, str, "onNetStateChangeEvent, Network available");
            C49418a aVar = this.f114846c;
            if (aVar == null || aVar.f113577a != 3) {
                C51423a.m95793c(3, str, "tryResumePlay from onNetStateChangeEvent");
                if (!C46924fc.m90226a() || !mo84707aO().mo123892o()) {
                    mo70436B();
                    return;
                }
                return;
            }
            C51423a.m95793c(3, str, "do not resumePlay when paused");
        }
    }

    @AbstractC90264r
    public void onReceiveDislikeAwemeEvent(C49678f fVar) {
        if (!this.f114781aI.booleanValue()) {
            this.f114853j = fVar.f114341a;
            if (fVar.f114346f == 2 && fVar.f114341a) {
                mo81102au();
            }
            if (!fVar.f114341a && !fVar.f114347g) {
                m93292a(false, C50323k.EnumC50325b.SHARE);
            }
        }
    }

    @AbstractC90264r
    public void onReplayEvent(C38884aj ajVar) {
        AbstractC48149ai bg;
        Aweme b = C50539g.m94745b(mo84754bg());
        if (ajVar.f91823a && TextUtils.equals(ajVar.f91824b, b.getAid()) && (bg = mo84754bg()) != null && bg.mo80229t() != null) {
            bg.mo80229t().mo65965b(b);
        }
    }

    @AbstractC90264r
    public void onScrolledToProfileTab(C69329a aVar) {
        this.f114827bb = false;
        mo70444K();
        C59038ax.m108507a().edit().putBoolean("hasVisitedProfilePage", true).apply();
        if (mo84753bf()) {
            C63339b.C63340a.m114834a().f143771c = true;
        }
    }

    @AbstractC90264r
    public void onShareFinished(C68919a aVar) {
        if (this.f114789aQ && !m93310k(C50539g.m94745b(mo84754bg()))) {
            int i = aVar.f154178a;
            if (i == 1) {
                SettingServiceImpl.m120782v().mo108864a(false, aH_().getChildFragmentManager());
            } else if (i == 2) {
                this.f114866x = true;
            }
        }
    }

    @AbstractC90264r
    public void onTabChangeEvent(C79673m mVar) {
        if (mVar.f178781b.equals("HOME")) {
            VerticalViewPager verticalViewPager = this.f114759N;
            if (verticalViewPager != null && verticalViewPager.getChildCount() != 0) {
                this.f114845bt.mo123213a(C79667k.m138474a());
                return;
            }
            return;
        }
        C79668l lVar = this.f114845bt;
        if (lVar != null) {
            lVar.mo123215c();
        }
    }

    /* renamed from: p */
    public final void mo84850p(boolean z) {
        DataCenter aw;
        AbstractC48149ai bg = mo84754bg();
        if ((bg instanceof AbstractC48234cd) && (aw = ((AbstractC48234cd) bg).mo80202aw()) != null && z) {
            aw.mo60191a("video_share_click", (Object) true);
        }
        mo70464a(0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo84852q(String str) {
        if (!"on_ear_phone_unplug".equals(str)) {
            return;
        }
        if (mo84707aO().mo123892o()) {
            mo81104aw();
            mo84761bn();
            C59092g.m108570a("play", this.f114782aJ.getEventType(), C50539g.m94745b(mo84754bg()));
            return;
        }
        C59092g.m108570a("pause", this.f114782aJ.getEventType(), C50539g.m94745b(mo84754bg()));
    }

    /* renamed from: b */
    private void m93297b(AbstractC88433f<ScrollSwitchStateManager> fVar) {
        Activity activity = this.f183419bv;
        if (activity == null) {
            this.f114864v.add(new CallableC49869f(this, fVar));
        } else if (activity instanceof ActivityC0945e) {
            try {
                fVar.accept(ScrollSwitchStateManager.C52950a.m97811a((ActivityC0945e) activity));
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am
    /* renamed from: g */
    public void mo70495g(String str) {
        if (mo84753bf() && mo81116aG() != null && mo81116aG().equals(str) && m93315o(str) && !C49300d.f113310b) {
            C49300d.f113310b = true;
            if (C49300d.f113309a) {
                C49300d.m92355a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo84776h(int i) {
        AbstractC48191b bVar = this.f114768W;
        if (bVar != null && i >= 0) {
            int i2 = i - 1;
            if (C37699a.m76314s(bVar.mo80287c(i2)) && !C37699a.m76273as(this.f114768W.mo80287c(i2))) {
                m93311l(i2);
            }
            if (i == 0 && this.f114768W.mo80287c(1) != null) {
                m93311l(i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49850an
    /* renamed from: i */
    public final Aweme mo84778i(Aweme aweme) {
        int currentItem;
        AbstractC48191b bVar;
        AbstractC48149ai bi;
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null) {
            currentItem = this.f114770Y;
        } else {
            currentItem = verticalViewPager.getCurrentItem();
        }
        if (currentItem <= 0 || (bVar = this.f114768W) == null) {
            return null;
        }
        Aweme c = bVar.mo80287c(currentItem);
        if (c != aweme && mo84738bM() != aweme) {
            return c;
        }
        Aweme c2 = this.f114768W.mo80287c(currentItem - 1);
        if (!C76706a.m134277c(c2) || (bi = mo84756bi()) == null || bi.mo80105T() == null) {
            return c2;
        }
        return bi.mo80105T().mo80206b();
    }

    /* renamed from: j */
    public final void mo84783j(Aweme aweme) {
        if (aweme == null || !m93310k(aweme)) {
            if (C68909c.m121606b()) {
                mo70477b(true);
                VideoDownloadStatusBar videoDownloadStatusBar = this.f114762Q;
                if (videoDownloadStatusBar != null) {
                    videoDownloadStatusBar.mo85118a((VideoDownloadStatusBar) VideoDownloadStatusBar.f115449j);
                    return;
                }
                return;
            } else if (this.f114762Q != null && VideoDownloadStatusBar.f115448i.hasMessages(1)) {
                mo70477b(true);
                this.f114762Q.mo85119b();
                return;
            } else if (this.f114762Q != null && VideoDownloadStatusBar.f115448i.hasMessages(2)) {
                mo70477b(true);
                this.f114762Q.mo85120c();
                mo70389o();
                return;
            }
        }
        mo70477b(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49438k
    /* renamed from: k */
    public final AbstractC48149ai mo81114k(String str) {
        AbstractC48149ai c;
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null) {
            return null;
        }
        int childCount = verticalViewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AbstractC48149ai aiVar = (AbstractC48149ai) this.f114759N.getChildAt(i).getTag(R.id.b0u);
            if (!(aiVar == null || aiVar.mo80089O() == null)) {
                if (C13627m.m24499a(aiVar.mo80089O().getAid(), str) && !C76706a.m134277c(aiVar.mo80089O())) {
                    return aiVar;
                }
                if (C76706a.m134277c(aiVar.mo80089O()) && (c = aiVar.mo80124c(str)) != null) {
                    return c;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final View mo84788m(boolean z) {
        if (this.f114819au == null && z && this.f114757L) {
            ImageView imageView = new ImageView(this.f183419bv);
            this.f114819au = imageView;
            imageView.setImageResource(2131231746);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f114758M.addView(this.f114819au, layoutParams);
            this.f114819au.setScaleX(2.5f);
            this.f114819au.setScaleY(2.5f);
            this.f114819au.setVisibility(8);
            this.f114819au.setAlpha(0.0f);
            this.f114819au.setOnClickListener(new View$OnClickListenerC49867d(this));
        }
        return this.f114819au;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final DmtStatusView mo84794o(boolean z) {
        if (aH_() == null) {
            return null;
        }
        Fragment aH_ = aH_();
        if (aH_ instanceof AbstractC50300f) {
            return ((AbstractC50300f) aH_).mo85467b(z);
        }
        if (aH_ instanceof AbstractC41361am) {
            return ((AbstractC41361am) aH_).mo70640p();
        }
        return null;
    }

    @AbstractC90264r
    public void onAwesomeSplashEvent(C18017a aVar) {
        DmtStatusView o;
        AbstractC48149ai bg;
        AbstractC48148ah v;
        Aweme b;
        int i = aVar.f42891a;
        this.f114837bl = i;
        if (!(i != 1 || (bg = mo84754bg()) == null || (v = bg.mo80231v()) == null || (b = bg.mo80206b()) == null)) {
            C1731i.m5640b(new CallableC49870g(b, v), C1731i.f5562a);
        }
        if (this.f114837bl < 4 && (o = mo84794o(false)) != null && o.mo27389j()) {
            o.mo27382d();
        }
        C17975i.m33461a(aVar.f42891a, this.f114814ap, this.f114815aq);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onChangePlayListNameEvent(C59403c cVar) {
        Aweme b = C50539g.m94745b(mo84754bg());
        if (b != null && b.playlist_info != null) {
            PlayListInfo playListInfo = b.playlist_info;
            if (playListInfo.getMixId().equals(cVar.f135696b)) {
                playListInfo.setMixName(cVar.f135695a);
                playListInfo.setShowRenameTooltip(false);
                new C79459a(this.f183419bv).mo123050a(R.string.gft).mo123053a();
                AbstractC81915c.m141874a(new C59410j(true, b));
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onCreateMixListSuccess(C59404d dVar) {
        String str;
        if (dVar.f135701e && dVar.f135697a && !TextUtils.isEmpty(dVar.f135699c) && !TextUtils.isEmpty(dVar.f135698b)) {
            final String str2 = "";
            if (C50539g.m94745b(mo84754bg()) != null) {
                str = C50539g.m94745b(mo84754bg()).getAid();
            } else {
                str = str2;
            }
            VerticalViewPager verticalViewPager = this.f114759N;
            if (verticalViewPager != null) {
                verticalViewPager.setDisableScroll(true);
            }
            if (dVar.f135700d != null && dVar.f135700d.getAid().equals(str)) {
                final Aweme b = C50539g.m94745b(mo84754bg());
                final String str3 = dVar.f135699c;
                final String str4 = dVar.f135698b;
                if (dVar.f135702f != null) {
                    str2 = dVar.f135702f;
                }
                new Handler().postDelayed(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.RunnableC498336 */

                    static {
                        Covode.recordClassIndex(58940);
                    }

                    public final void run() {
                        if (AbstractC49815a.this.f183419bv != null && b != null && str3 != null && str4 != null) {
                            if (AbstractC49815a.this.f114759N != null) {
                                AbstractC49815a.this.f114759N.setDisableScroll(false);
                            }
                            ((AbstractC59392f) AbstractC49815a.this.f114780aH).mo81312a(AbstractC49815a.this.f183419bv, b, str3, str4, AbstractC49815a.this.mo81096g(true), str2);
                        }
                    }
                }, 1000);
            }
        }
    }

    @AbstractC90264r
    public void onEvent(C37832b bVar) {
        AbstractC48149ai bg;
        AbstractC37879bc t;
        if (bVar != null && (bg = mo84754bg()) != null && TextUtils.equals(bVar.f89326c, bg.mo80206b().getAid()) && (t = bg.mo80229t()) != null) {
            t.mo65954a(bVar);
        }
    }

    @AbstractC90264r
    public void onFeedAdClickCouponEvent(C37835d dVar) {
        AbstractC48149ai bg;
        Aweme aweme = dVar.f89327a;
        int i = dVar.f89328b;
        if (C37699a.m76272ar(aweme) != null) {
            if (Arrays.asList(2, 6, 3, 17, 25, 8).contains(Integer.valueOf(i)) && (bg = mo84754bg()) != null && bg.mo80229t() != null && bg.mo80229t().mo65982o() != null) {
                bg.mo80229t().mo65982o().mo67556a(i);
            }
        }
    }

    @AbstractC90264r
    public void onFeedAdClickFormEvent(C37836e eVar) {
        AbstractC48149ai bg;
        Aweme aweme = eVar.f89329a;
        int i = eVar.f89330b;
        CardStruct e = C37699a.m76292e(aweme);
        if (e == null || e.getCardType() != 1) {
            AbstractC37873az c = C38000g.m77052c();
            Activity activity = this.f183419bv;
            mo84913bY();
            c.mo65917a(activity, aweme, i);
        } else if (i == 2 && (bg = mo84754bg()) != null && bg.mo80229t() != null && bg.mo80229t().mo65982o() != null) {
            bg.mo80229t().mo65982o().mo67561d();
        }
    }

    @AbstractC90264r
    public void onPollEvent(C72889a aVar) {
        AbstractC48149ai bg;
        AbstractC48191b bVar = this.f114768W;
        if (!(bVar == null || C13603b.m24435a((Collection) bVar.mo80288e()) || (bg = mo84754bg()) == null || bg.mo80206b() == null || !TextUtils.equals(bg.mo80206b().getAid(), aVar.f163555a) || bg.mo80206b().getInteractStickerStructs() == null)) {
            for (InteractStickerStruct interactStickerStruct : bg.mo80206b().getInteractStickerStructs()) {
                PollStruct pollStruct = interactStickerStruct.getPollStruct();
                if (!(pollStruct == null || pollStruct.getOptions() == null)) {
                    for (PollStruct.OptionsBean optionsBean : pollStruct.getOptions()) {
                        if (optionsBean.getOptionId() == aVar.f163556b) {
                            pollStruct.setSelectOptionId(aVar.f163556b);
                        }
                    }
                }
            }
        }
    }

    @AbstractC90264r
    public void onRemoveVideoToMixEvent(C59409i iVar) {
        if (iVar.f135706a != null) {
            DmtStatusView o = mo84794o(true);
            if (o != null) {
                o.mo27384f();
            }
            this.f114759N.setDisableScroll(true);
            if (C50539g.m94745b(mo84754bg()) != iVar.f135706a || !mo81096g(true).equals(iVar.f135707b)) {
                this.f114759N.setDisableScroll(false);
                if (o != null) {
                    o.setVisibility(8);
                    return;
                }
                return;
            }
            m93306d(iVar.f135706a, "long_press");
        }
    }

    @AbstractC90264r
    public void onTopViewLiveEnd(C18026g gVar) {
        AbstractC48149ai bg;
        C49445o oVar;
        if (gVar != null) {
            String str = gVar.f42904a;
            int i = gVar.f42905b;
            if ((i == 3 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 19 || i == 20 || i == 21) && (bg = mo84754bg()) != null) {
                Aweme b = bg.mo80206b();
                if (C37699a.m76318w(b) && TextUtils.equals(b.getAid(), str) && !C37699a.m76319x(b) && TextUtils.isEmpty(b.getAwemeRawAd().getWebUrl()) && (oVar = this.f114783aK) != null) {
                    oVar.mo81183a(b, 0);
                }
            }
        }
    }

    @AbstractC90264r
    public void onVideoPlayerEvent(C71904j jVar) {
        Long l;
        if (jVar.f161106c == 4) {
            if (!TextUtils.isEmpty(this.f114857o)) {
                String str = this.f114857o;
                this.f114857o = "";
                AbstractC48149ai bg = mo84754bg();
                if (!(bg == null || bg.mo80206b() == null || !TextUtils.equals(bg.mo80206b().getAid(), str))) {
                    mo81102au();
                    mo84726bA();
                    mo84707aO().mo123891n();
                    bg.mo80097E();
                }
            }
            Long l2 = C79657g.f178756b;
            if (l2 != null) {
                long longValue = l2.longValue();
                C79657g.f178757c.removeCallbacks(C79657g.f178759e);
                Long l3 = C79657g.f178755a;
                if (l3 != null) {
                    l = Long.valueOf(l3.longValue() - (System.currentTimeMillis() - longValue));
                } else {
                    l = null;
                }
                C79657g.f178755a = l;
            }
        }
    }

    /* renamed from: q */
    public final void mo84853q(boolean z) {
        Activity activity = this.f183419bv;
        if (activity != null && !activity.isFinishing()) {
            if (z || activity.getWindow().getDecorView().getBackground() == null) {
                activity.getWindow().getDecorView().setBackgroundColor(C0643b.m2378c(activity, R.color.a2));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo84855s(Aweme aweme) {
        if (aweme != null) {
            C39162r.m79460a("share_highlight", new C33744d().mo59983a("enter_from", this.f114782aJ.getEventType()).mo59983a("group_id", aweme.getAid()).mo59983a("author_id", aweme.getAuthorUid()).mo59983a("show_content", "house").f79943a);
        }
    }

    /* renamed from: b */
    private void mo70477b(boolean z) {
        if (C67261e.m119186d() && z) {
            mo70453U();
        }
        VideoDownloadStatusBar videoDownloadStatusBar = this.f114762Q;
        if (videoDownloadStatusBar == null) {
            return;
        }
        if (z) {
            videoDownloadStatusBar.setVisibility(0);
            int a = mo70386a((RelativeLayout) this.f114762Q);
            AbstractC48149ai bg = mo84754bg();
            if (bg instanceof AbstractC48234cd) {
                ((AbstractC48234cd) bg).mo80168a(true, a);
                return;
            }
            return;
        }
        videoDownloadStatusBar.setVisibility(8);
        if (!C50418a.C50419a.m94572a(C50539g.m94745b(mo84754bg()), this.f114782aJ.getEventType())) {
            AbstractC48149ai bg2 = mo84754bg();
            if (bg2 instanceof AbstractC48234cd) {
                ((AbstractC48234cd) bg2).mo80168a(false, this.f114762Q.getHeight());
            }
        }
    }

    /* renamed from: l */
    private void m93311l(int i) {
        String shareUrl;
        String shareUrl2;
        String encode;
        String encode2;
        String str;
        AbstractC48191b bVar = this.f114768W;
        if (bVar != null) {
            Aweme c = bVar.mo80287c(i);
            if (!(!C37699a.m76314s(c) || c.getAwemeRawAd().getContextTrack() == null || C13603b.m24435a((Collection) c.getAwemeRawAd().getContextTrack().getUrlList()))) {
                c.getAwemeRawAd().setContextTrackSent(true);
                Aweme c2 = this.f114768W.mo80287c(i - 1);
                Aweme c3 = this.f114768W.mo80287c(i + 1);
                if (c2 == null) {
                    shareUrl = "";
                } else {
                    shareUrl = c2.getShareUrl();
                }
                if (c3 == null) {
                    shareUrl2 = "";
                } else {
                    shareUrl2 = c3.getShareUrl();
                }
                if (TextUtils.isEmpty(shareUrl)) {
                    encode = "";
                } else {
                    encode = URLEncoder.encode(shareUrl);
                }
                if (TextUtils.isEmpty(shareUrl2)) {
                    encode2 = "";
                } else {
                    encode2 = URLEncoder.encode(shareUrl2);
                }
                LinkedList linkedList = new LinkedList();
                for (String str2 : c.getAwemeRawAd().getContextTrack().getUrlList()) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("__PCONTENT__", encode).replace("__NCONTENT__", encode2);
                        try {
                            str = mo81087al();
                        } catch (Exception e) {
                            e.printStackTrace();
                            str = "";
                        }
                        linkedList.add(Uri.parse(replace).buildUpon().appendQueryParameter("platform", "android").appendQueryParameter("req_id", str).toString());
                    }
                }
                C38000g.m77050a().mo65884a(linkedList);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49436i
    /* renamed from: f */
    public final C33743c mo81095f(Aweme aweme) {
        int currentItem;
        String str;
        VerticalViewPager verticalViewPager = this.f114759N;
        if (verticalViewPager == null) {
            currentItem = 0;
        } else {
            currentItem = verticalViewPager.getCurrentItem();
        }
        C49812b bVar = this.f114782aJ;
        C33743c a = new C33743c().mo59976a("author_id", C59208ac.m108758a(aweme)).mo59976a("request_id", C59208ac.m108759a(aweme, bVar.getPageType())).mo59974a("detail", Integer.valueOf(mo70440F() ? 1 : 0)).mo59974a("order", Integer.valueOf(currentItem)).mo59976a("is_photo", C59208ac.m108772f(aweme)).mo59976a("enter_method", bVar.getEnterMethodValue()).mo59976a("enter_from", bVar.getEventType());
        if (aweme.getAllowGift()) {
            str = "1";
        } else {
            str = "0";
        }
        C33743c a2 = a.mo59976a("is_giftable", str);
        if (!TextUtils.isEmpty(bVar.getShareUserId())) {
            a2.mo59976a("share_mode", "token").mo59976a("uid", bVar.getShareUserId());
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo84774g(int i) {
        Long creativeId;
        AbstractC48149ai bg = mo84754bg();
        if (bg != null) {
            Aweme b = bg.mo80206b();
            if (!(b == null || b.getAid() == null)) {
                AwemeRawAd awemeRawAd = b.getAwemeRawAd();
                if (awemeRawAd != null && awemeRawAd.isHardAd()) {
                    C38740e.f91486c = System.currentTimeMillis();
                }
                C38740e.f91484a.remove(b.getAid());
                if (b.isAd()) {
                    try {
                        AwemeRawAd awemeRawAd2 = b.getAwemeRawAd();
                        if (!(awemeRawAd2 == null || (creativeId = awemeRawAd2.getCreativeId()) == null)) {
                            C38740e.f91485b.remove(Long.valueOf(creativeId.longValue()));
                        }
                    } catch (Exception unused) {
                    }
                    C38699bq.m78509a(C38740e.f91485b);
                }
            }
            bg.mo70614a(i);
            bg.mo80158a(System.currentTimeMillis());
        }
        AbstractC48191b bVar = this.f114768W;
        if (bVar != null) {
            Aweme c = bVar.mo80287c(i);
            if (C37699a.m76314s(c)) {
                c.getAwemeRawAd().setContextTrackSent(false);
            }
        }
        mo84776h(i);
        this.f114798aZ = i;
        if (i == 0) {
            C63339b a = C63339b.C63340a.m114834a();
            if (SmartPreloadCommentV2Experiment.C59983a.m109504b() || SmartPreloadProfileV2Experiment.C59985a.m109507b()) {
                a.f143769a = 0;
                a.f143770b = false;
            }
            C63332a a2 = C63332a.C63333a.m114832a();
            if (SmartPreloadCommentV2Experiment.C59983a.m109504b() && !a2.f143748e) {
                C63311a.m114810a("check_comment_evaluator_available_task", C63329e.C63331b.m114821a("check_comment_evaluator_available_task"), new C63332a.RunnableC63335c(a2));
            }
            if (SmartPreloadProfileV2Experiment.C59985a.m109507b() && !a2.f143749f) {
                C63311a.m114810a("check_profile_evaluator_available_task", C63329e.C63331b.m114821a("check_profile_evaluator_available_task"), new C63332a.RunnableC63336d(a2));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo84777h(boolean z) {
        this.f114788aP = z;
        this.f114794aV.mo109736a("comment_panel", z);
        AbstractC48149ai bg = mo84754bg();
        if (bg != null && bg.mo80229t() != null) {
            bg.mo80229t().mo65971d(z);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        String str;
        int i;
        if (message.what == 0) {
            C51423a.m95784a(3, "BaseListFragmentPanel", "try resume play or try pause play for tap");
            if (this.f114768W == null || this.f114759N == null) {
                C51423a.m95786a((Exception) new IllegalStateException("adapter or viewpager is null,maybe is bug,please contact liuyiming.777"));
                return;
            }
            Aweme b = C50539g.m94745b(mo84754bg());
            if (C76706a.m134277c(b)) {
                if (C77260g.f173332a.mo120148a(this.f114782aJ.getEventType())) {
                    b = C76706a.m134283i(b);
                } else if (b != null) {
                    try {
                        if (b.getAid() != null) {
                            float floatValue = ((C0692e) message.obj).f2750a.floatValue();
                            Activity activity = this.f183419bv;
                            C89219l.m154719c(activity, "");
                            Resources resources = activity.getResources();
                            C89219l.m154709a((Object) resources, "");
                            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                            if (displayMetrics != null) {
                                i = displayMetrics.widthPixels;
                            } else {
                                i = 0;
                            }
                            if (floatValue <= ((float) i) / 3.0f) {
                                mo84754bg().mo80101P().mo80277g();
                                return;
                            } else {
                                mo84754bg().mo80101P().mo80276f();
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (C50545m.m94767d(b)) {
                C51423a.m95784a(3, "BaseListFragmentPanel", "tap for image aweme!");
                mo70519z();
            } else {
                C51423a.m95784a(3, "BaseListFragmentPanel", "tap for video aweme!");
                if (b != null && !TextUtils.isEmpty(b.getAid())) {
                    C39162r.m79455a("click", "video", b.getAid(), 0);
                    mo84754bg();
                    if (!C76706a.m134281g(b) || C77260g.f173332a.mo120148a(this.f114782aJ.getEventType())) {
                        mo81115a(b, true, true);
                    }
                } else if (!C76706a.m134281g(b)) {
                    if (b == null || (str = b.toString()) == null) {
                        str = "null aweme";
                    }
                    C51423a.m95784a(3, "Aweme", str);
                }
            }
            AbstractC48148ah bj = mo84757bj();
            if (bj != null) {
                bj.mo80187ac();
            }
        }
    }

    /* renamed from: m */
    public final void mo84790m(String str) {
        Video video;
        String str2 = str;
        Aweme c = this.f114768W.mo80287c(mo81110aE());
        if (c != null && c.getVideo() != null && (video = c.getVideo()) != null && video.getPlayAddr() != null) {
            boolean z = !TextUtils.isEmpty(video.getVideoModelStr());
            if (this.f114843br == null) {
                this.f114843br = new C49932a(mo70451R());
            }
            if (!z) {
                str2 = video.getPlayAddr().getBitRatedRatioUri();
            }
            this.f114843br.mo84979a(z, str2, 0, 0, this.f114768W, mo81110aE(), this.f114801ac);
        }
    }

    @AbstractC90264r
    public void onEvent(C37838g gVar) {
        AbstractC48149ai bg;
        if (gVar != null && (bg = mo84754bg()) != null && bg.mo80229t() != null) {
            bg.mo80229t().mo65955a(gVar);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onJsBroadCastEvent(C47959j jVar) {
        try {
            if (TextUtils.equals("videoReportSuccess", jVar.f111077b.getString("eventName")) || m93293a(jVar)) {
                String string = jVar.f111077b.getJSONObject("data").getString("object_id");
                Aweme bM = mo84738bM();
                if (bM != null && TextUtils.equals(bM.getAid(), string)) {
                    bM.setReportMaskInfo(new VideoMaskInfo(true, 1, 1, this.f183419bv.getString(R.string.fah), this.f183419bv.getString(R.string.faf), this.f183419bv.getString(R.string.fag)));
                    AwemeService.m70060b().mo60677a(bM);
                    if (this.f114768W.getCount() <= this.f114770Y + 1) {
                        return;
                    }
                    if (!C37699a.m76296f(bM.getAwemeRawAd()) || this.f114827bb) {
                        mo70403T();
                    }
                }
            } else if (C48247d.f111777a && TextUtils.equals(C50555t.f116844a, jVar.f111077b.getString("eventName"))) {
                C47036n.f109585a = true;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onUpdateMixVideoDesc(C59410j jVar) {
        String str;
        String str2;
        Aweme b;
        if (jVar != null) {
            Aweme aweme = jVar.f135709b;
            if (aweme != null) {
                String aid = aweme.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    String str3 = "";
                    if (!TextUtils.isEmpty(mo81116aG())) {
                        str = mo81116aG();
                    } else {
                        str = str3;
                    }
                    Aweme i = mo84778i(C50539g.m94745b(mo84754bg()));
                    if (i != null) {
                        str2 = i.getAid();
                    } else {
                        str2 = str3;
                    }
                    Aweme r = mo84854r(C50539g.m94745b(mo84754bg()));
                    if (r != null) {
                        str3 = r.getAid();
                    }
                    if (!aid.equals(str) && !aid.equals(str3) && !aid.equals(str2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (jVar.f135708a) {
                Boolean.valueOf(true);
                mo84765br();
                return;
            }
            if (!(jVar.f135709b == null || jVar.f135709b.getAid() == null)) {
                String aid2 = jVar.f135709b.getAid();
                Aweme b2 = C50539g.m94745b(mo84754bg());
                Aweme i2 = mo84778i(b2);
                Aweme r2 = mo84854r(b2);
                if (b2 == null || !b2.getAid().equals(aid2)) {
                    if (i2 != null && i2.getAid().equals(aid2)) {
                        b2 = i2;
                    } else if (r2 != null && r2.getAid().equals(aid2)) {
                        b2 = r2;
                    }
                }
                if (b2.playlist_info != null) {
                    b2.playlist_info = null;
                }
            }
            if (!(jVar.f135709b != null || (b = C50539g.m94745b(mo84754bg())) == null || b.playlist_info == null)) {
                b.playlist_info = null;
            }
            Boolean.valueOf(false);
            mo84765br();
        }
    }

    @AbstractC90264r
    public void onVideoEvent(C49672ag agVar) {
        Aweme b;
        boolean z;
        AbstractC49747d dVar;
        if (super.mo84730bE() && agVar != null) {
            if (agVar.f114315a == 36) {
                this.f114783aK.mo81171J();
            } else if (agVar.f114315a == 14 || agVar.f114315a == 13 || agVar.f114315a == 2) {
                String str = (String) agVar.f114316b;
                if (agVar.f114315a == 2 && (dVar = this.f114817as) != null) {
                    dVar.mo70688a(str);
                }
                int childCount = this.f114759N.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    AbstractC48149ai aiVar = (AbstractC48149ai) this.f114759N.getChildAt(i).getTag(R.id.b0u);
                    if (aiVar != null && !m93300b(aiVar) && aiVar.mo80206b() != null && C13627m.m24499a(aiVar.mo80206b().getAid(), str) && agVar.f114315a == 13 && (b = AwemeService.m70060b().mo60684b(str)) != null) {
                        if (b.getUserDigg() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b.isAd() && b.getActivityPendant() == null) {
                            C89219l.m154721d(this.f114782aJ.getEventType(), "");
                            Aweme aweme = new Aweme();
                            aweme.update(b);
                            aweme.setAd(false);
                            AwemeService.m70060b().mo60677a(aweme);
                        }
                        AbstractC81915c.m141874a(new C49690r(z, b.getAid()));
                        if (aiVar.mo80229t() != null) {
                            aiVar.mo80229t().mo65969c(z);
                        }
                        if (mo84753bf()) {
                            C63332a.C63333a.m114832a().mo101921a(5);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final int mo84848p(Aweme aweme) {
        if (aweme == null || !Aweme.containsGreenScreenGiphyAnchor(aweme.getAnchors()) || C80390ej.m139366a(aweme.getGreenScreenMaterials())) {
            return -1;
        }
        this.f114804af.clear();
        int i = -1;
        for (int i2 = 0; i2 < aweme.getGreenScreenMaterials().size(); i2++) {
            GreenScreenMaterial greenScreenMaterial = aweme.getGreenScreenMaterials().get(i2);
            greenScreenMaterial.getStartTime();
            this.f114856n.mo123891n();
            greenScreenMaterial.getEndTime();
            int n = ((int) this.f114856n.mo123891n()) - 300;
            if (greenScreenMaterial.getType() == 3) {
                long j = (long) n;
                if (greenScreenMaterial.getStartTime() <= j && j < greenScreenMaterial.getEndTime()) {
                    int indexOf = this.f114804af.indexOf(greenScreenMaterial.getResId());
                    if (indexOf != -1) {
                        this.f114804af.remove(indexOf);
                    }
                    this.f114804af.add(0, greenScreenMaterial.getResId());
                    i = i2;
                } else if (!this.f114804af.contains(greenScreenMaterial.getResId())) {
                    this.f114804af.add(greenScreenMaterial.getResId());
                }
            }
        }
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: c */
    public final void mo71321c(FollowStatus followStatus) {
        if (followStatus.followStatus == 0) {
            C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", this.f114782aJ.getEventType()).mo59983a("to_user_id", followStatus.userId).f79943a);
        } else {
            C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", this.f114782aJ.getEventType()).mo59983a("to_user_id", followStatus.userId).f79943a);
        }
    }

    @AbstractC90264r
    public void onEvent(C38886c cVar) {
        Activity activity;
        AbstractC48149ai bg;
        if (cVar != null && (activity = this.f183419bv) != null && cVar.f91830e == activity.hashCode() && (bg = mo84754bg()) != null && bg.mo80229t() != null && bg.mo80229t().mo65982o() != null) {
            int i = cVar.f91828c;
            if (i == 1) {
                bg.mo80229t().mo65982o().mo67557a(cVar.f91827b, cVar.f91826a);
            } else if (i == 2) {
                bg.mo80229t().mo65982o().mo67559b(cVar.f91827b, cVar.f91826a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: b */
    public final void mo62671b(int i) {
        Aweme d = this.f114768W.mo80326d(i);
        if (!AdShowTimeGapManager.f89790q) {
            if (AdShowTimeGapManager.m77034a()) {
                AdShowTimeGapManager.f89787n = null;
                AdShowTimeGapManager.f89782i = -1;
                AdShowTimeGapManager.f89783j = -1;
                AdShowTimeGapManager.f89786m = -1;
                if (AdShowTimeGapManager.f89781h >= 0 && AdShowTimeGapManager.f89781h < AdShowTimeGapManager.f89779f.size()) {
                    AdShowTimeGapManager.f89779f.remove(AdShowTimeGapManager.f89781h);
                }
                AdShowTimeGapManager.f89788o = true;
            }
            mo84689a(this.f114797aY);
            this.f114768W.mo80329f(i);
        }
        mo84767bt();
        if (!AdShowTimeGapManager.f89790q) {
            mo84774g(this.f114759N.getCurrentItem());
        }
        FeedAdServiceImpl.m67808c().mo58883b().mo59087a(d, i, this.f114768W.mo80288e());
    }

    @AbstractC90264r
    public void onEvent(C38887d dVar) {
        Activity activity;
        if (dVar != null && (activity = this.f183419bv) != null && dVar.f91835e == activity.hashCode() && this.f114856n == null) {
        }
    }

    @AbstractC90264r
    public void onEvent(C49686n nVar) {
        int currentItem = this.f114759N.getCurrentItem() + 1;
        if (currentItem < this.f114768W.getCount()) {
            this.f114759N.setCurrentItemWithDefaultVelocity(currentItem);
        }
    }

    /* renamed from: b */
    public final void mo84719b(int i, boolean z) {
        this.f114759N.mo67973a(i, z);
    }

    /* renamed from: a */
    private void m93291a(Aweme aweme, boolean z) {
        if (z) {
            mo81090ao();
        }
        mo70406b(aweme);
    }

    /* renamed from: c */
    private void m93302c(Aweme aweme, int i) {
        C51423a.m95786a((Exception) new RuntimeException("insertItemList fall to downgrade logic"));
        this.f114768W.mo80321a(aweme, i);
    }

    /* renamed from: a */
    public static void m93287a(View view, int i) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.height != i) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    private void m93303c(final Aweme aweme, final String str) {
        MixFeedService.m109435k().mo97316a(new AbstractC59390d() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C498314 */

            static {
                Covode.recordClassIndex(58938);
            }

            @Override // com.p2082ss.android.ugc.aweme.mix.api.AbstractC59390d
            /* renamed from: a */
            public final void mo84869a(boolean z, int i) {
                if (z) {
                    DmtStatusView o = AbstractC49815a.this.mo84794o(true);
                    if (o != null) {
                        o.setVisibility(8);
                    }
                    if (i == 0) {
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("key_mix_add_aweme_info", aweme);
                        MixFeedService.m109435k().mo97312a(AbstractC49815a.this.f183419bv, bundle, 3, AbstractC49815a.this.mo81096g(true), str);
                    } else if (AbstractC49815a.this.f114780aH instanceof AbstractC59392f) {
                        ((AbstractC59392f) AbstractC49815a.this.f114780aH).mo81312a(AbstractC49815a.this.f183419bv, aweme, "", "", AbstractC49815a.this.mo81096g(true), str);
                    }
                    AbstractC49815a.this.f114759N.setDisableScroll(false);
                    return;
                }
                new C79459a(AbstractC49815a.this.f183419bv).mo123050a(R.string.bol).mo123053a();
            }
        });
    }

    /* renamed from: d */
    private void m93306d(Aweme aweme, String str) {
        AbstractC49420e eVar = this.f114780aH;
        if (eVar instanceof AbstractC59392f) {
            ((AbstractC59392f) eVar).mo81310a(this.f183419bv, aweme, new AbstractC59387a() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C498325 */

                static {
                    Covode.recordClassIndex(58939);
                }

                @Override // com.p2082ss.android.ugc.aweme.mix.api.AbstractC59387a
                /* renamed from: a */
                public final void mo84870a(boolean z) {
                }

                @Override // com.p2082ss.android.ugc.aweme.mix.api.AbstractC59387a
                /* renamed from: b */
                public final void mo84871b(boolean z) {
                    if (z) {
                        Aweme aD = AbstractC49815a.this.mo81109aD();
                        if (aD != null) {
                            aD.playlist_info = null;
                        }
                        AbstractC49815a aVar = AbstractC49815a.this;
                        Boolean.valueOf(false);
                        aVar.mo84765br();
                    }
                    DmtStatusView o = AbstractC49815a.this.mo84794o(true);
                    if (o != null) {
                        o.setVisibility(8);
                    }
                    AbstractC49815a.this.f114759N.setDisableScroll(false);
                }
            }, mo81096g(true), str);
        }
    }

    /* renamed from: a */
    private Aweme mo70468a(Aweme aweme, int i) {
        AbstractC48149ai bh;
        AbstractC48191b bVar = this.f114768W;
        if (bVar == null) {
            return null;
        }
        Aweme c = bVar.mo80287c(i);
        if (c != aweme && mo84738bM() != aweme) {
            return c;
        }
        Aweme c2 = this.f114768W.mo80287c(i + 1);
        if (!C76706a.m134277c(c2) || (bh = mo84755bh()) == null || bh.mo80105T() == null) {
            return c2;
        }
        return bh.mo80105T().mo80206b();
    }

    /* renamed from: a */
    private static Object m93285a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: c */
    private void m93305c(List<Aweme> list, int i) {
        C51423a.m95786a((Exception) new RuntimeException("insertItemList fall to downgrade logic"));
        this.f114768W.mo80322a(list, i);
    }

    public AbstractC49815a(String str, int i) {
        this.f114772a = 1.0E-10f;
        this.f114803ae = new HashSet();
        this.f114804af = new ArrayList<>();
        this.f114805ag = false;
        this.f114806ah = null;
        this.f114807ai = null;
        this.f114808aj = null;
        this.f114809ak = false;
        this.f114810al = false;
        this.f114811am = false;
        this.f114822ax = false;
        this.f114823ay = false;
        this.f114824az = false;
        this.f114773aA = false;
        this.f114774aB = false;
        this.f114775aC = false;
        this.f114776aD = null;
        this.f114848e = null;
        this.f114777aE = "";
        this.f114849f = new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.RunnableC498161 */

            static {
                Covode.recordClassIndex(58923);
            }

            public final void run() {
                AbstractC49815a.this.mo84768bu();
            }
        };
        this.f114779aG = false;
        this.f114781aI = false;
        this.f114782aJ = new C49812b();
        this.f114785aM = true;
        this.f114787aO = AbstractC49583a.f114087a;
        this.f114788aP = false;
        this.f114789aQ = false;
        this.f114790aR = false;
        this.f114791aS = false;
        this.f114792aT = false;
        this.f114793aU = false;
        this.f114795aW = false;
        this.f114796aX = null;
        this.f114797aY = null;
        this.f114798aZ = -1;
        this.f114826ba = false;
        this.f114853j = false;
        this.f114827bb = true;
        this.f114854l = 0;
        this.f114828bc = false;
        this.f114829bd = false;
        this.f114831bf = false;
        this.f114832bg = false;
        this.f114833bh = false;
        this.f114834bi = false;
        this.f114835bj = true;
        this.f114836bk = false;
        this.f114837bl = 4;
        this.f114838bm = false;
        this.f114857o = "";
        this.f114859q = 0;
        this.f114860r = new C49753i();
        this.f114839bn = 0;
        this.f114840bo = new VerticalViewPager.AbstractC39186f() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C4982719 */

            static {
                Covode.recordClassIndex(58934);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.AbstractC39186f
            /* renamed from: b */
            public final boolean mo68051b() {
                return C37699a.m76236aH(AbstractC49815a.this.mo81109aD());
            }

            @Override // com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.AbstractC39186f
            /* renamed from: a */
            public final void mo68049a() {
                if (!C46796cm.f109017b) {
                    C59038ax.m108508b();
                    C49594i.m93012e();
                } else if (!AbstractC49815a.this.f114775aC) {
                    C59038ax.m108508b();
                    C49594i.m93012e();
                    AbstractC49815a.this.f114775aC = true;
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.AbstractC39186f
            /* renamed from: a */
            public final boolean mo68050a(boolean z) {
                if (AbstractC49815a.this.mo84753bf() && C37699a.m76199B(AbstractC49815a.this.mo81109aD()) && C37699a.m76308m(AbstractC49815a.this.mo81109aD()).getSwipeUpType() == 5 && (AbstractC49815a.this.f183419bv instanceof ActivityC0945e) && AdHomePageDataVM.C17902a.m33208a((ActivityC0945e) AbstractC49815a.this.f183419bv).mo28555a()) {
                    if (!z) {
                        return true;
                    }
                    if (AdHomePageDataVM.C17902a.m33208a((ActivityC0945e) AbstractC49815a.this.f183419bv).f42663c.getValue() == null || AdHomePageDataVM.C17902a.m33208a((ActivityC0945e) AbstractC49815a.this.f183419bv).f42663c.getValue().floatValue() < C13628n.m24520b(AbstractC49815a.this.f183419bv, 54.0f)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.AbstractC39186f
            /* renamed from: a */
            public final int mo68047a(int i, int i2, int i3) {
                if (AbstractC49815a.this.mo84754bg() == null || AbstractC49815a.this.mo84754bg().mo80229t() == null || AbstractC49815a.this.mo84754bg().mo80229t().mo65963b() == null || !AbstractC49815a.this.mo84754bg().mo80229t().mo65963b().mo59355a(i, i2, i3)) {
                    return i;
                }
                AbstractC49815a.this.mo81102au();
                return i2;
            }

            /* JADX WARNING: Removed duplicated region for block: B:72:0x01c9  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x0219  */
            /* JADX WARNING: Removed duplicated region for block: B:80:0x0240  */
            /* JADX WARNING: Removed duplicated region for block: B:86:0x0278  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x02b4  */
            @Override // com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager.AbstractC39186f
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final int mo68048a(int r20, int r21, int r22, int r23) {
                /*
                // Method dump skipped, instructions count: 710
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a.C4982719.mo68048a(int, int, int, int):int");
            }
        };
        this.f114861s = 29000;
        this.f114862t = new C50524a();
        this.f114842bq = true;
        this.f114843br = null;
        this.f114864v = new ArrayList();
        this.f114865w = null;
        this.f114866x = false;
        this.f114867y = "home_swipe_up_lottie_android.json";
        this.f114844bs = null;
        this.f114868z = "dialog_opt";
        this.f114755B = 0;
        this.f114782aJ.setEventType(str);
        this.f114782aJ.setPageType(i);
        AbstractC49420e a = C49912a.m93713a().mo84951a(str, i, this, this);
        this.f114780aH = a;
        C37608b bVar = new C37608b(str, i);
        this.f114850g = bVar;
        this.f114783aK = new C49433f(str, i, this);
        C49432e eVar = new C49432e();
        this.f114784aL = eVar;
        eVar.mo81065a(a);
        eVar.mo81065a(bVar);
        eVar.mo81065a(this.f114783aK);
        this.f114858p = new C49862ax(this.f114783aK, this);
        mo84853q(true);
        C80749k.f180544c = mo70515t();
        AbTestManagerImpl.m104980b().mo95589a(this);
        try {
            int intValue = C52912c.f121688a.f121689b.getBackgroundPausePlayerSetting().intValue();
            if (intValue != 0) {
                this.f114855m = new C49857at(this, intValue);
            }
        } catch (Throwable th) {
            C51423a.m95790a(th);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m93286a(Aweme aweme, AbstractC48148ah ahVar) {
        try {
            Aweme a = C34406ba.m70397a().mo57057a(aweme.getAid(), "");
            if (a == null) {
                if (C37699a.m76199B(aweme)) {
                    C18129a.m33746a("draw_ad", "topview_detail_update_fail", aweme.getAwemeRawAd()).mo28901b();
                }
                return null;
            }
            if (C37699a.m76199B(aweme)) {
                C18129a.m33746a("draw_ad", "topview_detail_update_success", aweme.getAwemeRawAd()).mo28901b();
            }
            ahVar.mo80218f(a);
            return null;
        } catch (Exception e) {
            if (C37699a.m76199B(aweme)) {
                C18129a.m33746a("draw_ad", "topview_detail_update_fail", aweme.getAwemeRawAd()).mo28901b();
            }
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private boolean m93299b(int i, AbstractC48149ai aiVar) {
        if (aiVar == null) {
            return false;
        }
        Aweme d = this.f114768W.mo80326d(i);
        Aweme O = aiVar.mo80089O();
        if (C76706a.m134277c(d) && d != null && O != null) {
            return TextUtils.equals(d.getAid(), O.getAid());
        }
        if (!mo70518x() || d == null) {
            if (d == O) {
                return true;
            }
        } else if (O != null) {
            return TextUtils.equals(d.getAid(), O.getAid());
        }
        return false;
    }

    /* renamed from: b */
    public final void mo84721b(Aweme aweme, int i) {
        try {
            AbstractC49749f fVar = this.f114818at;
            if (fVar != null) {
                fVar.mo84305a(C39107h.m79398a(aweme, i));
            } else {
                m93302c(aweme, i);
            }
        } catch (C39106g e) {
            C51423a.m95788a("", e);
            m93302c(aweme, i);
        }
    }

    /* renamed from: b */
    private void m93296b(Aweme aweme, String str, boolean z, String str2) {
        if (aweme != null) {
            if (!this.f114780aH.f113605h || !C46920f.m90223c()) {
                mo84694a(aweme, str, z, str2);
            } else {
                m93304c(aweme, str, z, str2);
            }
        }
    }

    /* renamed from: c */
    private void m93304c(Aweme aweme, String str, boolean z, String str2) {
        m93290a(aweme, str, z, str2, 0, true);
    }

    /* renamed from: a */
    private void m93288a(Aweme aweme, String str, int i, String str2) {
        String str3;
        String str4;
        String previousPage;
        String previousPagePosition;
        String searchResultId = this.f114782aJ.getSearchResultId();
        User user = null;
        if (aweme != null) {
            user = aweme.getAuthor();
        }
        if (TextUtils.isEmpty(searchResultId)) {
            if (aweme != null) {
                searchResultId = aweme.getAid();
            } else {
                searchResultId = "";
            }
        }
        C59256u a = new C59256u().mo96834a("homepage_hot");
        a.f135350a = C59256u.EnumC59259c.ITEM;
        a.f135352b = C59256u.EnumC59257a.FOLLOW;
        a.mo96837o(str2).mo96749g(aweme).mo96832a(user).mo96835b();
        boolean z = false;
        if (!(aweme == null || aweme.getBottomBarModel() == null)) {
            z = true;
        }
        if (user == null || user.getFollowerStatus() != 1) {
            str3 = "single";
        } else {
            str3 = "mutual";
        }
        if (C76706a.m134281g(aweme)) {
            str4 = "story";
        } else {
            str4 = UGCMonitor.TYPE_POST;
        }
        C59260v a2 = new C59260v().mo96847a(mo81096g(true));
        if (TextUtils.isEmpty(this.f114782aJ.getPreviousPage())) {
            previousPage = this.f114782aJ.getEventType();
        } else {
            previousPage = this.f114782aJ.getPreviousPage();
        }
        a2.f135402b = previousPage;
        if (TextUtils.isEmpty(this.f114782aJ.getPreviousPage())) {
            previousPagePosition = "follow_button";
        } else {
            previousPagePosition = this.f114782aJ.getPreviousPagePosition();
        }
        a2.f135403c = previousPagePosition;
        a2.f135404d = z;
        a2.f135409s = str2;
        a2.f135405e = str;
        C59260v vVar = (C59260v) a2.mo96848c(aweme, this.f114782aJ.getPageType()).mo96810l(this.f114782aJ.getSearchId()).mo96804f(searchResultId);
        vVar.f135376aa = i;
        vVar.f135369X = this.f114782aJ.getChallengeId();
        vVar.f135370Y = this.f114782aJ.getParentTagId();
        vVar.f135379ad = aweme.isHighlighted();
        vVar.f135380ae = aweme.getOriginalPos();
        vVar.f135381af = this.f114782aJ.getCategoryName();
        C59260v a3 = vVar.mo96846a(aweme.getAuthor());
        a3.f135222V = C76598h.m134176a(aweme.getAuthor());
        a3.f135412v = str3;
        a3.f135223W = str4;
        AbstractC59233c a4 = a3.mo96752b_(C76706a.m134276b(aweme)).mo96771n(C50560y.m94791a(this.f114782aJ.getPreviousPage(), this.f114782aJ.getFromGroupId())).mo96788a(C80632w.m139800a(aweme, "follow", this.f114782aJ.getEventType()));
        C79900c.m138667a(a4, aweme, mo81096g(true));
        a4.mo96792f();
    }

    /* renamed from: a */
    private void m93289a(Aweme aweme, String str, boolean z, int i, C49672ag agVar) {
        String previousPage;
        String previousPagePosition;
        String str2;
        if (z) {
            mo70481c(aweme);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("author_id", aweme.getAuthorUid());
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("enter_from", this.f114782aJ.getEventType());
            jSONObject.put("impr_type", C59208ac.m108776j(aweme));
            jSONObject.put("compilation_id", aweme.getMixId());
            jSONObject.put("request_id", mo81089an().optString("request_id"));
            jSONObject.put("enter_type", "normal_way");
            if (!"homepage_hot".equals(this.f114782aJ.getEventType())) {
                jSONObject.put("previous_page", this.f114782aJ.getEnterMethodValue());
            }
            jSONObject.put("request_id", C59208ac.m108759a(aweme, this.f114782aJ.getPageType()));
            jSONObject.put("is_photo", C59208ac.m108772f(aweme));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C39162r.m79459a("follow", this.f114782aJ.getEventType(), str, C59208ac.m108771e(aweme), jSONObject);
        if (z) {
            if (agVar == null || TextUtils.isEmpty(agVar.f114328n) || (!"card_button".equals(agVar.f114328n) && !"expand_card".equals(agVar.f114328n) && !"small_card".equals(agVar.f114328n))) {
                str2 = "main_head";
            } else {
                str2 = agVar.f114328n;
            }
            m93288a(aweme, str, i, str2);
            if (TextUtils.equals(this.f114782aJ.getEventType(), "search_result")) {
                SearchResultStatisticsImpl.m104992a().mo71655a(new C42454f("search_follow", str, "search_video", true, "", "", ""));
                return;
            }
            return;
        }
        C59261w a = new C59261w().mo96850a(mo81096g(true));
        if (TextUtils.isEmpty(this.f114782aJ.getPreviousPage())) {
            previousPage = this.f114782aJ.getEventType();
        } else {
            previousPage = this.f114782aJ.getPreviousPage();
        }
        a.f135413a = previousPage;
        if (TextUtils.isEmpty(this.f114782aJ.getPreviousPage())) {
            previousPagePosition = "follow_button";
        } else {
            previousPagePosition = this.f114782aJ.getPreviousPagePosition();
        }
        a.f135414b = previousPagePosition;
        a.f135416d = "follow_button";
        a.f135415c = str;
        a.mo96851c(aweme, this.f114782aJ.getPageType()).mo96792f();
    }
}
