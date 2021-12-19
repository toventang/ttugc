package com.p2082ss.android.ugc.aweme.main;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.Toast;
import androidx.appcompat.app.AbstractC0220f;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1213t;
import com.aweme.storage.C2360c;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.common.jato.boost.C13546g;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.hox.AbstractC15501d;
import com.bytedance.hox.Hox;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17964b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.keva.Keva;
import com.bytedance.monitor.collector.C21478d;
import com.bytedance.monitor.collector.p1551a.C21471a;
import com.bytedance.p1435io.prefetcher.IoPrefetcher;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tiktok.homepage.C22724a;
import com.bytedance.tiktok.homepage.mainactivity.C22734a;
import com.bytedance.tiktok.homepage.mainactivity.C22740c;
import com.bytedance.tiktok.homepage.mainactivity.C22742d;
import com.bytedance.tiktok.homepage.mainactivity.C22743e;
import com.bytedance.tiktok.homepage.mainactivity.C22745f;
import com.bytedance.tiktok.homepage.mainactivity.C22746g;
import com.bytedance.tiktok.homepage.mainactivity.C22752h;
import com.bytedance.tiktok.homepage.mainactivity.C22753i;
import com.bytedance.tiktok.homepage.mainactivity.C22758n;
import com.bytedance.tiktok.homepage.mainactivity.C22759o;
import com.bytedance.tiktok.homepage.mainactivity.C22761p;
import com.bytedance.tiktok.homepage.mainactivity.C22762q;
import com.bytedance.tiktok.homepage.mainactivity.C22763r;
import com.bytedance.tiktok.homepage.mainactivity.PerformanceActivityObserver;
import com.bytedance.tiktok.homepage.mainactivity.PreloadActicityTask;
import com.bytedance.tiktok.homepage.mainactivity.RunnableC22754j;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.C22855b;
import com.bytedance.tux.p1721g.C23144b;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.AbstractC34895bp;
import com.p2082ss.android.ugc.aweme.C33955at;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.login.twostep.DialogC32194g;
import com.p2082ss.android.ugc.aweme.activity.processor.C33099t;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.activity.processor.C33104y;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34690j;
import com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.p2638b.C39228b;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39232c;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40203j;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40556v;
import com.p2082ss.android.ugc.aweme.detail.transition.C41327a;
import com.p2082ss.android.ugc.aweme.detail.transition.C41333b;
import com.p2082ss.android.ugc.aweme.discover.activity.AbstractC41570a;
import com.p2082ss.android.ugc.aweme.experiment.C46711at;
import com.p2082ss.android.ugc.aweme.experiment.C46714av;
import com.p2082ss.android.ugc.aweme.experiment.C46807cw;
import com.p2082ss.android.ugc.aweme.experiment.C46832dk;
import com.p2082ss.android.ugc.aweme.experiment.C46852dt;
import com.p2082ss.android.ugc.aweme.experiment.C46870e;
import com.p2082ss.android.ugc.aweme.experiment.C46890em;
import com.p2082ss.android.ugc.aweme.experiment.C46899ep;
import com.p2082ss.android.ugc.aweme.experiment.C46939fp;
import com.p2082ss.android.ugc.aweme.experiment.C47024i;
import com.p2082ss.android.ugc.aweme.experiment.C47033k;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.RunnableC49720l;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.cache.C49299c;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49560q;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49668ac;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49669ad;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49688p;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49689q;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49693u;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49853aq;
import com.p2082ss.android.ugc.aweme.feed.p2964r.C49905a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram.C50308a;
import com.p2082ss.android.ugc.aweme.feed.service.C49912a;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51539b;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.homepage.C52932a;
import com.p2082ss.android.ugc.aweme.homepage.api.data.C52948a;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.business.C52965a;
import com.p2082ss.android.ugc.aweme.homepage.business.C52967b;
import com.p2082ss.android.ugc.aweme.homepage.business.HomeToastTask;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.C53307c;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.p3056a.C53303b;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.p3056a.C53304c;
import com.p2082ss.android.ugc.aweme.homepage.story.container.AbstractC53045c;
import com.p2082ss.android.ugc.aweme.homepage.story.container.C53055h;
import com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53446g;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58206e;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.component.AbstractC58191c;
import com.p2082ss.android.ugc.aweme.lego.p3390a.C58140b;
import com.p2082ss.android.ugc.aweme.lego.p3390a.EnumC58085a;
import com.p2082ss.android.ugc.aweme.lego.p3390a.HandlerC58143e;
import com.p2082ss.android.ugc.aweme.lego.p3392b.C58172b;
import com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58420ae;
import com.p2082ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.logger.C58949c;
import com.p2082ss.android.ugc.aweme.logger.C58951d;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.main.C59066d;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.main.p3427a.C59008a;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59254s;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.metrics.C59226b;
import com.p2082ss.android.ugc.aweme.miniapp.utils.C59286a;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61515c;
import com.p2082ss.android.ugc.aweme.node.C61522a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.p2335aq.p2336a.C33918a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2400bp.C34902e;
import com.p2082ss.android.ugc.aweme.p2433ca.C35345c;
import com.p2082ss.android.ugc.aweme.p2433ca.C35350g;
import com.p2082ss.android.ugc.aweme.p2433ca.C35353i;
import com.p2082ss.android.ugc.aweme.p2436cc.C35435d;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40911c;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56206g;
import com.p2082ss.android.ugc.aweme.p3426m.C58975a;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLCommonService;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.p3682s.C67269f;
import com.p2082ss.android.ugc.aweme.p4173ug.IUgCommonService;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.p4173ug.amplify.C79563a;
import com.p2082ss.android.ugc.aweme.p4173ug.p4183h.C79676b;
import com.p2082ss.android.ugc.aweme.player.C62957f;
import com.p2082ss.android.ugc.aweme.port.internal.C63285l;
import com.p2082ss.android.ugc.aweme.port.internal.C63297m;
import com.p2082ss.android.ugc.aweme.profile.C63345a;
import com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64149b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i;
import com.p2082ss.android.ugc.aweme.promote.C65227b;
import com.p2082ss.android.ugc.aweme.promote.C65238g;
import com.p2082ss.android.ugc.aweme.promote.DialogC65233e;
import com.p2082ss.android.ugc.aweme.push.C65692b;
import com.p2082ss.android.ugc.aweme.push.C65697d;
import com.p2082ss.android.ugc.aweme.push.C65722f;
import com.p2082ss.android.ugc.aweme.push.View$OnClickListenerC65719e;
import com.p2082ss.android.ugc.aweme.relation.dialog.SocialRecFriendsConditionViewModel;
import com.p2082ss.android.ugc.aweme.report.C67107d;
import com.p2082ss.android.ugc.aweme.requesttask.p3681b.C67179a;
import com.p2082ss.android.ugc.aweme.service.AbstractC67849c;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.settingsrequest.PopupSettingManager;
import com.p2082ss.android.ugc.aweme.share.viewmodel.C69488a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69908cb;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71849n;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71898d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73454ag;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72630h;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.model.C77379b;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.userstory.mine.C77697a;
import com.p2082ss.android.ugc.aweme.turbo.api.C79340b;
import com.p2082ss.android.ugc.aweme.utils.C80229aw;
import com.p2082ss.android.ugc.aweme.utils.C80304cm;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.utils.C80420fc;
import com.p2082ss.android.ugc.aweme.utils.C80456ft;
import com.p2082ss.android.ugc.aweme.utils.C80608p;
import com.p2082ss.android.ugc.aweme.utils.JacocoUtils;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import com.p2082ss.android.ugc.aweme.video.C80938q;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.C81081w;
import com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.p4378g.C85088a;
import com.p2082ss.ttvideoengine.C86313ai;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4586g.AbstractC88922b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.main.MainActivity */
public class MainActivity extends AbstractActivityC59100h implements C17873f.AbstractC17876c, AbstractC34471f, AbstractC40912d, AbstractC49853aq, C59008a.AbstractC59009a, AbstractC59103j, AbstractC59104k, AbstractC90252i, AbstractC90253j {
    private static final String TAG = MainActivity.class.getSimpleName();
    private AdHomePageDataVM adHomePageDataVM;
    boolean allowWhenPush = true;
    private AbstractC40911c asyncInflater;
    public C59066d.C59067a contextInfo;
    private final Object decorViewLock;
    private boolean firstCreated;
    public HomePageDataViewModel homeViewModel;
    private volatile Hox hoxInstance;
    private boolean isFirstLaunch = false;
    private volatile boolean isInited;
    private boolean isPaused = true;
    private AtomicBoolean lazyDoItCalled = new AtomicBoolean(false);
    private C22734a mAccountObserver;
    private List<AbstractC34466a> mActivityOnKeyDownListeners;
    C52932a mActivityProxy = new C52932a();
    private AbstractC34467b mActivityResultListener;
    private AbstractC72630h mBinder;
    private final C22740c mCommerceActivityObserver;
    private final C22742d mCommonFeedActivityObserver;
    private final AbstractC39232c mComplianceBusinessActivityObserver;
    protected DataCenter mDataCenter;
    private final C22724a mDialogRefactorContainer;
    private boolean mHasShownMandatoryLoginFromColdStart;
    private AbstractC51539b mInvitationReflowHelper;
    private boolean mIsFirstVisible = true;
    private final C22743e mLegacyPlayerActivityObserver;
    private final C22745f mLocalTestActivityObserver;
    private final C22746g mLoginAndConsentObserver;
    private C59031aq mMainHelper;
    private final C22752h mMiniAppActivityObserver;
    private final C22753i mNewUserGuideObserver;
    private final PerformanceActivityObserver mPerformanceActivityObserver;
    private boolean mRestartFromLogout = false;
    private C59052bb mScrollSwitchHelper;
    private final AbstractC34895bp mSocialActivityObserver;
    private SocialRecFriendsConditionViewModel mSocialRecFriendsConditionVM;
    private final C22759o mToolsActivityObserver;
    private IUgCommonService mUgCommonService;
    private final C22763r mUserGrowthActivityObserver;
    private C35353i mViewInflaterOpt;
    private final C59033as mainLifecycleRegistryWrapper;
    private int pageType;
    private IAVPublishService.OnPublishCallback processedCallback;
    private Resources resource;
    private final C53303b scrollBasicChecker;
    private final C53304c scrollFullChecker;
    private boolean showToast = false;
    private ScrollSwitchStateManager stateManager;
    private C22758n tikTokToolsObserver = new C22758n(this);

    /* renamed from: com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m108375xb33ce78b(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m108376xb33ce790(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_ugc_aweme_main_MainActivity_java_lang_reflect_Method_invoke */
    private static Object m108378xfb5bdd58(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_main_MainActivity_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_main_MainActivity_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private ActivityC0945e getActivity() {
        return this;
    }

    static final /* synthetic */ AbstractC17362a lambda$null$4$MainActivity(C33103x xVar) {
        return xVar;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(15, new RunnableC90250g(MainActivity.class, "onSettingsDoneEvent", C39228b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(16, new RunnableC90250g(MainActivity.class, "onScrollToProfileEvent", C49669ad.class, ThreadMode.POSTING, 0, false));
        hashMap.put(17, new RunnableC90250g(MainActivity.class, "onHideLivePopupWindowEvent", C65692b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(18, new RunnableC90250g(MainActivity.class, "onVideoPageChangeEvent", C49693u.class, ThreadMode.POSTING, 0, false));
        hashMap.put(19, new RunnableC90250g(MainActivity.class, "onScrollToDetailEvent", C49668ac.class, ThreadMode.POSTING, 0, false));
        hashMap.put(20, new RunnableC90250g(MainActivity.class, "onPublishMessage", C77379b.class, ThreadMode.MAIN, -1, true));
        hashMap.put(21, new RunnableC90250g(MainActivity.class, "onMobEnterFromEvent", C49688p.class, ThreadMode.POSTING, 0, false));
        hashMap.put(22, new RunnableC90250g(MainActivity.class, "onMobRequestIdEvent", C49689q.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public View getVisionSearchRect() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public boolean hasRegistedResumeAction() {
        return false;
    }

    public boolean isDuoDevice() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public boolean isDuoDualMode() {
        return false;
    }

    public boolean isSwipeUpGuideShowing() {
        return false;
    }

    public boolean isUnderFamiliarTab() {
        return false;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public AbstractC72630h getBinder() {
        return this.mBinder;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.p3427a.C59008a.AbstractC59009a
    public AbstractC59108o getHelper() {
        return this.mScrollSwitchHelper;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59104k
    public boolean getIsFirstLaunch() {
        return this.isFirstLaunch;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.mainLifecycleRegistryWrapper;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public C59031aq getMainHelper() {
        return this.mMainHelper;
    }

    public IAVPublishService.OnPublishCallback getProcessedCallback() {
        return this.processedCallback;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49853aq
    public boolean isPaused() {
        return this.isPaused;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$2$MainActivity() {
        C80608p.m139760a(this);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onCreate$8$MainActivity() {
        DialogC32194g.C32195a.m66562a(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onPostResume() {
        super.onPostResume();
    }

    static final /* synthetic */ AbstractC17362a lambda$null$3$MainActivity() {
        return new C33099t();
    }

    static final /* synthetic */ AbstractC17362a lambda$null$5$MainActivity() {
        return new C33104y(false, false);
    }

    static final /* synthetic */ void lambda$onCreate$1$MainActivity() {
        C22855b.m43080b();
        C22855b.m43079a();
    }

    public Resources getOriginResources() {
        return super.getResources();
    }

    public boolean isInDiscoveryPage() {
        return isUnderSecondTab();
    }

    public void setAdScrollRightControl() {
        this.mCommerceActivityObserver.mo37064c();
    }

    static {
        Covode.recordClassIndex(69313);
    }

    private void createMainHelper() {
        C59031aq aqVar = new C59031aq(this);
        this.mMainHelper = aqVar;
        aqVar.mo96539c();
    }

    private void ensureLazyDoItFinallyCalled() {
        C29339a.m58753a(new RunnableC59012ac(this), 10000);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d
    public AbstractC40911c getInflater() {
        if (this.asyncInflater == null) {
            this.asyncInflater = new C63345a(this);
        }
        return this.asyncInflater;
    }

    public TabChangeManager getTabChangeManager() {
        return TabChangeManager.C59002a.m108439a(getActivity());
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public boolean isUnderMainTab() {
        return "HOME".equals(getTabChangeManager().f134312d);
    }

    public boolean isUnderNearbyTab() {
        return "NEARBY".equals(getTabChangeManager().f134312d);
    }

    public boolean isUnderProfileTab() {
        return "USER".equals(getTabChangeManager().f134312d);
    }

    public boolean isUnderSecondTab() {
        return "DISCOVER".equals(getTabChangeManager().f134312d);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public boolean isUnderThirdTab() {
        return "NOTIFICATION".equals(getTabChangeManager().f134312d);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59104k
    public boolean mainPageOnFeed() {
        return this.stateManager.mo89350b("page_feed");
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59104k
    public void splashOverShowMandatoryLoginPage() {
        this.mLoginAndConsentObserver.mo37067a(false, this.pageType);
    }

    /* access modifiers changed from: private */
    /* renamed from: callLazyDoIt */
    public void bridge$lambda$0$MainActivity() {
        if (this.lazyDoItCalled.compareAndSet(false, true)) {
            C1731i.m5631a(1800).mo5538b(new C59114r(this), C40780g.m82246c());
            lazyDoItMainThread();
        }
    }

    private void doFeedCachePre() {
        if (SettingsRequestServiceImpl.m65417i().mo57287e() == 0) {
            C49301e.m92379j();
        }
        if (SettingsRequestServiceImpl.m65417i().mo57288f() == 2) {
            C49301e.m92366b(true);
        }
    }

    private void doHoxInit() {
        C58945a.C58947b.f134185a.mo96425a("main_act_node_init_duration", false);
        this.hoxInstance = Hox.C15490a.m28529a(this);
        this.hoxInstance.mo25206a(this, new C61522a(this));
        C58945a.C58947b.f134185a.mo96429b("main_act_node_init_duration", false);
    }

    private String handleIntent() {
        String com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m108374x3cd6895c(getIntent(), "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        if (TextUtils.isEmpty(com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
            return "HOME";
        }
        return com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
    }

    private boolean needHook() {
        if (Looper.getMainLooper() == Looper.myLooper() || !C47033k.f109573c) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public Fragment getCurFragment() {
        if (getTabChangeManager() == null) {
            return null;
        }
        return getTabChangeManager().mo96536b();
    }

    public C50041af getCurrentFeedRecommendFragment() {
        Fragment curFragment = getCurFragment();
        if (!(curFragment instanceof C59014ae)) {
            return null;
        }
        AbstractC50477z s = ((C59014ae) curFragment).mo96547l();
        if (s instanceof C50041af) {
            return (C50041af) s;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public boolean isMainTabVisible() {
        if (!isUnderMainTab() || this.mScrollSwitchHelper == null || !this.stateManager.mo89350b("page_feed")) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public void onFeedRecommendFragmentReady() {
        new C58221f.C58224c().mo95703b((AbstractC58264w) new ReleaseWindowBackgroundTask(this)).mo95706a();
    }

    private void refreshWhenBack() {
        C33594aj<Boolean> isUseBackRefresh = SharePrefCache.inst().getIsUseBackRefresh();
        if (isUseBackRefresh != null && isUseBackRefresh.mo59941c().booleanValue() && getTabChangeManager().mo96536b() != null && (getTabChangeManager().mo96536b() instanceof C59014ae)) {
            ((C59014ae) getTabChangeManager().mo96536b()).mo96559r();
        }
    }

    private void setAllowPrepareVideo() {
        if (SettingsRequestServiceImpl.m65417i().mo57288f() != 0) {
            m108375xb33ce78b("FeedCacheLoader", "MainActivity->setAllowPrepareVideo->return");
            return;
        }
        Intent intent = getIntent();
        boolean z = true;
        if (intent != null) {
            this.allowWhenPush = !intent.getBooleanExtra("from_notification", false);
        }
        if (this.adHomePageDataVM.f42661a || !this.allowWhenPush) {
            z = false;
        }
        C49301e.m92366b(z);
    }

    public AssetManager getAssets() {
        if (needHook()) {
            if (!this.isInited) {
                this.isInited = true;
                initContextInfo();
            }
            C59066d.C59067a aVar = this.contextInfo;
            if (!(aVar == null || aVar.f134460a == null || this.contextInfo.mo96595a(this))) {
                return this.contextInfo.f134460a.getAssets();
            }
        }
        return super.getAssets();
    }

    public Resources.Theme getTheme() {
        if (needHook()) {
            if (!this.isInited) {
                this.isInited = true;
                initContextInfo();
            }
            C59066d.C59067a aVar = this.contextInfo;
            if (!(aVar == null || aVar.f134461b == null || this.contextInfo.mo96595a(this))) {
                return this.contextInfo.f134461b.getTheme();
            }
        }
        return super.getTheme();
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59104k
    public boolean isADShowing() {
        if (C17964b.f42785d || C17975i.m33468e() || C37699a.m76314s(this.homeViewModel.f121745k) || C37699a.m76199B(this.homeViewModel.f121745k)) {
            return true;
        }
        return false;
    }

    public Boolean isFollowFeed() {
        AbstractC50477z s;
        Fragment curFragment = getCurFragment();
        if (curFragment == null || !(curFragment instanceof C59014ae) || (s = ((C59014ae) curFragment).mo96547l()) == null || !(s instanceof C50403p)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void lazyDoItMainThread() {
        if (!isDestroyed() && this.showToast && !this.adHomePageDataVM.mo28555a()) {
            C89219l.m154721d(this, "");
            new HomeToastTask().mo28600a(this);
            this.showToast = false;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        AbstractC53045c cVar;
        C59031aq aqVar = this.mMainHelper;
        if (aqVar.mo96563b() || ((!C53055h.f121997c || C53055h.f121995a == null || (cVar = C53055h.f121995a) == null || !cVar.mo89560a()) && !aqVar.mo96540d())) {
            backRefreshStrategy();
        }
        this.mDataCenter.mo60191a("exitGuideView", (Object) false);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
    public void onKeyBack() {
        if (!this.mScrollSwitchHelper.mo96583b()) {
            if (getTabChangeManager().mo96536b() != null && (getTabChangeManager().mo96536b() instanceof AbstractC64149b)) {
                refreshWhenBack();
            }
            refreshWhenBack();
        }
    }

    private void feedOVVMainActivityCreate() {
        if (C49907s.m93685a().booleanValue()) {
            C49710k.f114397e = SystemClock.elapsedRealtime();
            long j = 8000;
            if (C46890em.m90194a()) {
                Boolean value = C46890em.f109274e.getValue();
                C89219l.m154716b(value, "");
                if (value.booleanValue()) {
                    int intValue = C46890em.f109273d.getValue().intValue();
                    if (intValue == C46890em.f109271b) {
                        j = 5000;
                    } else if (intValue == C46890em.f109272c) {
                        j = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                    }
                }
                C34727m.m70945a(RunnableC49720l.f114426a, j);
            }
        }
    }

    private void initContextInfo() {
        MethodCollector.m26663i(9014);
        super.getAssets();
        super.getTheme();
        super.getResources();
        C59066d.f134459c = true;
        synchronized (C59066d.f134458b) {
            try {
                C59066d.C59067a aVar = C59066d.f134458b.get(this);
                if (aVar == null) {
                    aVar = new C59066d.C59067a();
                    aVar.f134462c = getOriginResources().getConfiguration();
                    aVar.f134460a = C59066d.m108545a(this);
                    C59066d.f134458b.put(this, aVar);
                }
                try {
                    Method declaredMethod = ContextThemeWrapper.class.getDeclaredMethod("getThemeResId", new Class[0]);
                    declaredMethod.setAccessible(true);
                    aVar.f134461b = new ContextThemeWrapper(this, ((Integer) declaredMethod.invoke(this, new Object[0])).intValue());
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                this.contextInfo = aVar;
            } finally {
                MethodCollector.m26664o(9014);
            }
        }
    }

    private void setStatusBarColor() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1024 | 256);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else {
            int i = Build.VERSION.SDK_INT;
            getWindow().addFlags(67108864);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public Resources getResources() {
        if (needHook()) {
            if (!this.isInited) {
                this.isInited = true;
                initContextInfo();
            }
            C59066d.C59067a aVar = this.contextInfo;
            if (!(aVar == null || aVar.f134460a == null || this.contextInfo.mo96595a(this))) {
                return this.contextInfo.f134460a.getResources();
            }
        }
        if (!((Boolean) C58172b.f132462e.getValue()).booleanValue()) {
            return super.getResources();
        }
        if (this.resource == null) {
            this.resource = super.getResources();
        }
        return this.resource;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        overridePendingTransition(0, 0);
        this.isPaused = true;
        C58945a.C58947b.f134185a.f134176c = false;
        C58949c.f134187a = false;
        if (!C58949c.C58950a.f134191b) {
            C58949c.C58950a.f134191b = true;
            C17873f.m33099g().mo143289d(C58951d.f134193a);
        }
        super.onPause();
        if (C16048b.m29633a().mo25421a(true, "is_record_last_network_speed_enabled", true)) {
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            inst.getLastUsableNetworkSpeed().mo59940b(Integer.valueOf((int) C84116g.m144636e().mo124230d()));
        }
        this.mComplianceBusinessActivityObserver.mo68115c();
        this.mCommerceActivityObserver.f53719e.onPause();
        C49301e.f113324l.getValue();
        try {
            if (C46852dt.f109160a > 0) {
                C46852dt.m90165a(C46852dt.f109161b, System.currentTimeMillis() - C46852dt.f109160a, "background");
            }
        } catch (Throwable unused) {
        }
        JacocoUtils.uploadCoverageFileNow();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        C58945a.C58947b.f134185a.f134176c = false;
        C58949c.f134187a = false;
        LocalVideoPlayerManager.m140055a().mo123962b();
        C53446g.C53447a.f122670a.f122664b = false;
        if (!C2360c.f7177a) {
            C1731i.m5640b(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0029: INVOKE  
                  (wrap: com.aweme.storage.c$1 : 0x0022: CONSTRUCTOR  (r1v3 com.aweme.storage.c$1) = 
                  (wrap: android.content.Context : 0x001c: INVOKE  (r0v9 android.content.Context) = (r3v0 'this' com.ss.android.ugc.aweme.main.MainActivity A[IMMUTABLE_TYPE, THIS]) type: STATIC call: com.aweme.storage.c.a(android.content.Context):android.content.Context)
                 call: com.aweme.storage.c.1.<init>(android.content.Context):void type: CONSTRUCTOR)
                  (wrap: java.util.concurrent.ExecutorService : 0x0025: INVOKE  (r0v10 java.util.concurrent.ExecutorService) =  type: STATIC call: com.ss.android.ugc.aweme.cv.g.a():java.util.concurrent.ExecutorService)
                 type: STATIC call: b.i.b(java.util.concurrent.Callable, java.util.concurrent.Executor):b.i in method: com.ss.android.ugc.aweme.main.MainActivity.onStop():void, file: classes7.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: CONSTRUCTOR  (r1v3 com.aweme.storage.c$1) = 
                  (wrap: android.content.Context : 0x001c: INVOKE  (r0v9 android.content.Context) = (r3v0 'this' com.ss.android.ugc.aweme.main.MainActivity A[IMMUTABLE_TYPE, THIS]) type: STATIC call: com.aweme.storage.c.a(android.content.Context):android.content.Context)
                 call: com.aweme.storage.c.1.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.main.MainActivity.onStop():void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.aweme.storage.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
                this = this;
                com.bytedance.helios.sdk.utils.C15477a.m28478d(r3)
                super.onStop()
                com.ss.android.ugc.aweme.logger.a r0 = com.p2082ss.android.ugc.aweme.logger.C58945a.C58947b.f134185a
                r1 = 0
                r0.f134176c = r1
                com.p2082ss.android.ugc.aweme.logger.C58949c.f134187a = r1
                com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager r0 = com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.m140055a()
                r0.mo123962b()
                com.ss.android.ugc.aweme.i18n.language.a.g r0 = com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53446g.C53447a.f122670a
                r0.f122664b = r1
                boolean r0 = com.aweme.storage.C2360c.f7177a
                if (r0 != 0) goto L_0x002c
                android.content.Context r0 = com.aweme.storage.C2360c.m7176a(r3)
                com.aweme.storage.c$1 r1 = new com.aweme.storage.c$1
                r1.<init>(r0)
                java.util.concurrent.ExecutorService r0 = com.p2082ss.android.ugc.aweme.p2719cv.C40780g.m82241a()
                p077b.C1731i.m5640b(r1, r0)
            L_0x002c:
                com.bytedance.tiktok.homepage.mainactivity.o r0 = r3.mToolsActivityObserver
                androidx.fragment.app.e r2 = r0.f53750a
                if (r2 == 0) goto L_0x0036
                boolean r0 = com.p2082ss.android.ugc.aweme.legoImp.task.CleanEffectsTask.f132824a
                if (r0 == 0) goto L_0x0043
            L_0x0036:
                com.p2082ss.android.ugc.aweme.requesttask.idle.C67187a.m119053a()
                com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p2082ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.service.c> r0 = com.p2082ss.android.ugc.aweme.service.AbstractC67849c.class
                r1.getService(r0)
                return
            L_0x0043:
                android.app.Activity r0 = com.bytedance.ies.ugc.appcontext.C17873f.m33102j()
                if (r0 != 0) goto L_0x0036
                com.ss.android.ugc.aweme.legoImp.task.c r1 = new com.ss.android.ugc.aweme.legoImp.task.c
                r1.<init>(r2)
                java.util.concurrent.ExecutorService r0 = com.p2082ss.android.ugc.aweme.p2719cv.C40780g.m82246c()
                p077b.C1731i.m5640b(r1, r0)
                goto L_0x0036
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.main.MainActivity.onStop():void");
        }

        public void refreshSlideSwitchCanScrollRight() {
            if (this.mScrollSwitchHelper != null) {
                Fragment b = getTabChangeManager().mo96536b();
                if (b == null || !(b instanceof C59014ae)) {
                    this.stateManager.mo89338a(this.scrollFullChecker);
                    return;
                }
                AbstractC50477z zVar = (AbstractC50477z) this.stateManager.mo89361c();
                if (zVar instanceof AbstractC59102i) {
                    AbstractC59102i iVar = (AbstractC59102i) zVar;
                    if ("FeedFollowFragment".equals(iVar.mo85175u()) || "FeedLearnFragment".equals(iVar.mo85175u()) || "FeedRecommendFragment".equals(iVar.mo85175u())) {
                        setAdScrollRightControl();
                        return;
                    }
                }
                this.stateManager.mo89338a(this.scrollFullChecker);
            }
        }

        public MainActivity() {
            C53303b bVar = new C53303b(this);
            this.scrollBasicChecker = bVar;
            this.scrollFullChecker = new C53304c(this, bVar);
            C22724a aVar = new C22724a(this);
            this.mDialogRefactorContainer = aVar;
            C22753i iVar = new C22753i(this);
            this.mNewUserGuideObserver = iVar;
            this.mUserGrowthActivityObserver = new C22763r(this);
            this.mMiniAppActivityObserver = new C22752h(this);
            this.mLegacyPlayerActivityObserver = new C22743e(this);
            this.mComplianceBusinessActivityObserver = ComplianceBusinessServiceImpl.m80241k().mo68612a(this);
            this.mSocialActivityObserver = ProfileServiceImpl.m114884g().mo101950a((Activity) this);
            this.mCommonFeedActivityObserver = new C22742d(this);
            this.mToolsActivityObserver = new C22759o(this, aVar);
            this.mPerformanceActivityObserver = new PerformanceActivityObserver();
            this.mLocalTestActivityObserver = new C22745f(this);
            this.mCommerceActivityObserver = new C22740c(this, iVar);
            this.mLoginAndConsentObserver = new C22746g(this);
            this.mInvitationReflowHelper = C51648a.f118980a.mo87296a((ActivityC0945e) this);
            this.mActivityResultListener = null;
            this.mViewInflaterOpt = new C35353i();
            this.decorViewLock = new Object();
            this.mUgCommonService = UgCommonServiceImpl.m138290j();
            this.isInited = false;
            this.contextInfo = null;
            this.resource = null;
            this.processedCallback = new IAVPublishService.OnPublishCallback() {
                /* class com.p2082ss.android.ugc.aweme.main.MainActivity.C589801 */

                static {
                    Covode.recordClassIndex(69314);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService.OnPublishCallback
                public final void onStopPublish() {
                }

                @Override // com.p2082ss.android.ugc.aweme.services.video.IAVPublishService.OnPublishCallback
                public final void onStartPublish(AbstractC72630h hVar) {
                    MainActivity mainActivity;
                    C65227b a = C65227b.m116889a();
                    MainActivity mainActivity2 = MainActivity.this;
                    int c = hVar.mo101826c();
                    if (mainActivity2 != null && !mainActivity2.isFinishing() && C31575b.m65865g().isLogin()) {
                        if (C65227b.f147151a != null) {
                            C65227b.f147151a.dismiss();
                            C65227b.f147151a = null;
                        }
                        if (a.f147155c == null || mainActivity2 != a.f147155c.get()) {
                            a.f147155c = new WeakReference<>(mainActivity2);
                        }
                        WeakHandler weakHandler = a.f147154b;
                        if (DateUtils.isToday(C65227b.m116890b().getLong("last_pop_time_".concat(String.valueOf(C31575b.m65865g().getCurUserId())), 0))) {
                            a.mo104388c();
                        } else {
                            PopupSettingManager.C68764a.f153819a.mo109244a(weakHandler, 2, c);
                        }
                    }
                    MainActivity mainActivity3 = MainActivity.this;
                    int c2 = hVar.mo101826c();
                    C89219l.m154721d(mainActivity3, "");
                    if (!mainActivity3.isFinishing()) {
                        C79563a.f178541a = new WeakReference<>(mainActivity3);
                        IAccountUserService g = C31575b.m65865g();
                        C89219l.m154716b(g, "");
                        if (g.isLogin() && C79676b.m138491a()) {
                            PopupSettingManager.C68764a.f153819a.mo109244a(C79563a.f178542b, 3, c2);
                        }
                    }
                    if (!C33918a.m69450a() && (mainActivity = MainActivity.this) != null && !mainActivity.isFinishing() && C31575b.m65865g().isLogin()) {
                        if (C65238g.f147189a != null) {
                            C65238g.f147189a.dismiss();
                            C65238g.f147189a = null;
                        }
                        Boolean c3 = SharePrefCache.inst().getPromoteDialogShouldShow().mo59941c();
                        if (c3 != null && c3.booleanValue()) {
                            String string = C65238g.m116896a().getString("uid", "");
                            String curUserId = C31575b.m65865g().getCurUserId();
                            if (TextUtils.isEmpty(string)) {
                                SharedPreferences.Editor edit = C65238g.m116896a().edit();
                                edit.putString("uid", curUserId);
                                edit.apply();
                                string = curUserId;
                            }
                            if (!string.equals(curUserId)) {
                                SharedPreferences.Editor edit2 = C65238g.m116896a().edit();
                                edit2.putBoolean("joined", false);
                                edit2.putString("uid", curUserId);
                                edit2.putInt("popup_times", 0);
                                edit2.putLong("popup_last_time", 0);
                                edit2.apply();
                            }
                            if (!C65238g.m116896a().getBoolean("joined", false)) {
                                int i = C65238g.m116896a().getInt("popup_times", 0);
                                long j = C65238g.m116896a().getLong("popup_last_time", 0);
                                Integer c4 = SharePrefCache.inst().getPromoteDialogPopupPopupInterval().mo59941c();
                                if (i < SharePrefCache.inst().getPromoteDialogPopupTimesLimit().mo59941c().intValue() && System.currentTimeMillis() - j > ((long) (c4.intValue() * 1000 * 3600 * 24))) {
                                    SharedPreferences.Editor edit3 = C65238g.m116896a().edit();
                                    edit3.putInt("popup_times", i + 1);
                                    edit3.putLong("popup_last_time", System.currentTimeMillis());
                                    edit3.apply();
                                    C13628n.m24520b(C17867d.m33078a(), 52.0f);
                                    DialogC65233e eVar = new DialogC65233e(mainActivity, "");
                                    C65238g.f147189a = eVar;
                                    eVar.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                        /* class com.p2082ss.android.ugc.aweme.promote.C65238g.DialogInterface$OnDismissListenerC652391 */

                                        static {
                                            Covode.recordClassIndex(76715);
                                        }

                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            SharePrefCache.inst().getShowPromoteLicense().mo59940b(0);
                                            C65238g.f147189a = null;
                                        }
                                    });
                                    C39162r.m79460a("creative_permission_show", new C33744d().f79943a);
                                    C65238g.f147189a.show();
                                }
                            }
                        }
                    }
                }
            };
            this.mainLifecycleRegistryWrapper = new C59033as(this);
        }

        private void backRefreshStrategy() {
            C39162r.m79460a("press_back", new C33744d().mo59983a("enter_from", getTabChangeManager().f134312d).f79943a);
            int a = C16048b.m29633a().mo25412a(false, "back_refresh_strategy", 0);
            if (a != 0) {
                if (this.mMainHelper.f134403a) {
                    this.mMainHelper.f134403a = false;
                } else if (!this.mDialogRefactorContainer.f53683b.mo109737a("swipe_up_guide")) {
                    if (!isUnderMainTab()) {
                        this.mDataCenter.mo60191a("performClickTab", "HOME");
                        Fragment b = getTabChangeManager().mo96536b();
                        if (b != null && (b instanceof C59014ae)) {
                            C59014ae aeVar = (C59014ae) b;
                            if (!aeVar.mo96548m()) {
                                aeVar.mo96546d(1);
                            }
                            if (a == 1) {
                                aeVar.mo96559r();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Fragment b2 = getTabChangeManager().mo96536b();
                    if (b2 != null && (b2 instanceof C59014ae)) {
                        C59014ae aeVar2 = (C59014ae) b2;
                        if (!aeVar2.mo96548m()) {
                            aeVar2.mo96546d(1);
                        }
                        if (a == 1) {
                            aeVar2.mo96559r();
                        }
                    }
                }
            }
        }

        private void onStartUp() {
            HomePageDataViewModel homePageDataViewModel;
            MethodCollector.m26663i(5916);
            if (C67269f.m119190a() && (homePageDataViewModel = this.homeViewModel) != null) {
                Message message = homePageDataViewModel.f121739e;
                Bundle data = message.getData();
                if (data.getBoolean("is_from_feed_cache", false) && (message.obj instanceof FeedItemList)) {
                    m108375xb33ce78b("FeedCacheLoader", "cache feed message's bundle on focus change:" + data + ",@" + data.hashCode());
                    Handler target = message.getTarget();
                    if (target != null) {
                        if (C67269f.m119192c() && !data.getBoolean("has_used_feed_cache", false)) {
                            m108375xb33ce78b("FeedCacheLoader", "cache feed message was send on focus change in animation experiment");
                            synchronized (data) {
                                try {
                                    data.putBoolean("has_used_feed_cache", true);
                                } catch (Throwable th) {
                                    MethodCollector.m26664o(5916);
                                    throw th;
                                }
                            }
                            C0792v.m2750a(getWindow().getDecorView(), new RunnableC59132s(target, message));
                        }
                        if (C67269f.m119191b()) {
                            m108375xb33ce78b("FeedCacheLoader", "cache feed message was send on focus change in async message experiment");
                            target.sendMessageAtFrontOfQueue(message);
                        }
                    }
                }
            }
            if (this.homeViewModel != null) {
                m108375xb33ce78b("FeedCacheLoader", "notifyCallback");
                C49299c.m92354c(this.homeViewModel.f121738d);
            }
            MethodCollector.m26664o(5916);
        }

        @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
        public String getEnterFrom() {
            String e;
            C59014ae aeVar;
            AbstractC50477z s;
            AbstractC15501d a = Hox.C15490a.m28529a(this).mo25204a();
            String str = "";
            if (!(a == null || (e = a.mo25233e()) == null)) {
                str = e;
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            if (getTabChangeManager() != null && !TextUtils.isEmpty(getTabChangeManager().f134312d)) {
                String str2 = getTabChangeManager().f134312d;
                if (TextUtils.equals(str2, "HOME")) {
                    Fragment b = getTabChangeManager().mo96536b();
                    if (!(!(b instanceof C59014ae) || (aeVar = (C59014ae) b) == null || (s = aeVar.mo96547l()) == null)) {
                        if (s instanceof C50403p) {
                            return "homepage_follow";
                        }
                        if (s instanceof C50041af) {
                            return "homepage_hot";
                        }
                    }
                } else if (TextUtils.equals(str2, "DISCOVER")) {
                    return "discovery";
                } else {
                    if (TextUtils.equals(str2, "NOTIFICATION")) {
                        return "notification_page";
                    }
                    if (TextUtils.equals(str2, "USER")) {
                        if (getTabChangeManager().mo96536b() instanceof C64250i) {
                            return "others_homepage";
                        }
                        if (getTabChangeManager().mo96536b() instanceof AbstractC59254s) {
                            return ((AbstractC59254s) getTabChangeManager().mo96536b()).mo96829f();
                        }
                        return "personal_homepage";
                    }
                }
            }
            return "homepage_hot";
        }

        /* access modifiers changed from: protected */
        public void lazyDoIt() {
            int i;
            this.mCommonFeedActivityObserver.mo37065a();
            this.mSocialActivityObserver.mo60675b();
            C22759o oVar = this.mToolsActivityObserver;
            C71849n.m126865a().mo113496b();
            AVExternalServiceImpl.m113114a().abnormalExitLogService().logAppAbnormalExit();
            if (!oVar.f53752c) {
                AVExternalServiceImpl.m113114a().publishService().tryRestorePublish(oVar.f53750a, new C22762q(oVar));
            }
            int i2 = 0;
            if (SharePrefCache.inst().getLastPublishFailed() != null && SharePrefCache.inst().getLastPublishFailed().mo59941c().booleanValue()) {
                new C23144b(oVar.f53750a).mo37640e(R.string.ctu).mo37637b();
                SharePrefCache.inst().getLastPublishFailed().mo59940b(false);
            }
            this.mCommonFeedActivityObserver.mo37065a();
            this.mUgCommonService.mo123106d(this);
            C22763r rVar = this.mUserGrowthActivityObserver;
            if (C0792v.m2791y(rVar.f53759a.getWindow().getDecorView()) && C39223a.m79597k().mo68722f()) {
                C33744d dVar = new C33744d();
                ActivityC17312a aVar = rVar.f53759a;
                C89219l.m154721d(aVar, "");
                Window window = aVar.getWindow();
                C89219l.m154716b(window, "");
                View decorView = window.getDecorView();
                C89219l.m154716b(decorView, "");
                if (C80420fc.m139412a(decorView) != C80420fc.m139412a(decorView.findViewById(16908290))) {
                    i = 1;
                } else {
                    i = 0;
                }
                C33744d a = dVar.mo59980a("virtual_bar_status", i);
                ActivityC17312a aVar2 = rVar.f53759a;
                C89219l.m154721d(aVar2, "");
                boolean hasPermanentMenuKey = ViewConfiguration.get(aVar2).hasPermanentMenuKey();
                boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
                boolean deviceHasKey2 = KeyCharacterMap.deviceHasKey(3);
                if (hasPermanentMenuKey || (deviceHasKey && deviceHasKey2)) {
                    i2 = 1;
                }
                C39162r.m79460a("system_navigation_bar_status", a.mo59980a("physical_bar_status", i2).mo59980a("tappable_element_insets", C80420fc.m139417b(rVar.f53759a)).f79943a);
            }
            RuntimeBehaviorServiceImpl.m94812c().mo85864a(rVar.f53759a);
            if (!rVar.f53759a.isDestroyed()) {
                rVar.f53760b = new C85088a();
                C22763r.m42929a(rVar.f53759a, rVar.f53760b, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                rVar.f53762d = true;
            }
            rVar.f53761c = new C33955at();
            if (rVar.f53759a.getApplication() != null) {
                rVar.f53761c.mo60225a(rVar.f53759a.getApplication());
            }
        }

        @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
        public void onDestroy() {
            C15477a.m28479e(this);
            if (C46711at.m90098a()) {
                this.mViewInflaterOpt.mo62225a();
            }
            if (C17873f.f42636l) {
                C58949c.f134187a = true;
                C58949c.f134188b = 0;
            }
            if (C76660b.m134243c() && C77260g.f173332a.mo120163k() == hashCode()) {
                C77260g.f173332a.mo120162j();
                C77697a.f174263a = null;
            }
            C22763r rVar = this.mUserGrowthActivityObserver;
            if (rVar.f53762d) {
                rVar.f53759a.unregisterReceiver(rVar.f53760b);
            }
            if (!(rVar.f53761c == null || rVar.f53759a.getApplication() == null)) {
                rVar.f53761c.mo60227b(rVar.f53759a.getApplication());
            }
            C22758n nVar = this.tikTokToolsObserver;
            if (EventBus.m156962a().mo145393a(nVar.f53748a)) {
                EventBus.m156962a().mo145395b(nVar.f53748a);
            }
            m108375xb33ce78b("winter", "onDestroy start");
            super.onDestroy();
            C89219l.m154721d(this, "");
            m108375xb33ce78b("winter", "onDestroy end");
            if (C46870e.f109214b) {
                X2CAdWebPage x2CAdWebPage = (X2CAdWebPage) C58221f.m105149b(X2CAdWebPage.class);
                C40556v.m81851a().f94896b.clear();
                x2CAdWebPage.f91791d.clear();
                x2CAdWebPage.f91788a = null;
                x2CAdWebPage.f91789b = null;
            }
            C80330da.f179858a.clear();
            C35345c.m72337b();
            C1870c.m6051a("profile_fragment_user_mt");
            C1870c.m6051a("profile_fragment_aweme_list_mus");
            C1870c.m6051a("aweme_comment_fragment_comment_list");
            C1870c.m6051a("detail_feed_activity_video_detail");
            C1870c.m6051a("detail_feed_fragment_detail_page");
            C1870c.m6051a("detail_feed_insights_bottom");
            C1870c.m6051a("detail_feed_video_seek_bar");
            C1870c.m6051a("aweme_comment_fragment_input_detail");
            if (C47033k.f109572b) {
                C1870c.m6048a((Context) null);
            }
            C35435d.f83605c = true;
            C67107d.f150499f = true;
            this.mCommerceActivityObserver.f53719e.onDestroy();
            FeedAdServiceImpl.m67808c().mo58883b().mo59091c();
            ActivityC0945e eVar = this.mLegacyPlayerActivityObserver.f53722a;
            if (C58975a.f134219c) {
                try {
                    eVar.unregisterReceiver(C58975a.f134220d);
                    C58975a.f134220d = null;
                    C58975a.f134219c = false;
                } catch (Exception unused) {
                }
            }
            C62957f.f142901a.mo142944a();
            if (C62957f.f142904d != null) {
                AbstractC88922b<Long> bVar = C62957f.f142904d;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                bVar.dispose();
                C62957f.f142904d = null;
            }
            C81079v.m140776O().mo123909C();
            C86313ai.m148637a();
            C62957f.f142902b = false;
            C81081w.C81082a.f181214a.f181213a.size();
            C22724a aVar = this.mDialogRefactorContainer;
            EventBus.m156962a().mo145395b(aVar);
            aVar.f53682a = null;
            if (aVar.f53684c != null) {
                aVar.f53684c.removeCallbacksAndMessages(null);
            }
            AbstractC48191b.f111621m = 0;
            MLCommonService.instance().runInMainActivityOnDestroy();
            this.mComplianceBusinessActivityObserver.mo68116d();
            C22734a aVar2 = this.mAccountObserver;
            EventBus.m156962a().mo145395b(aVar2);
            C31575b.m65859a();
            C31575b.f75524a.mo57066b(aVar2.f53707b);
            DialogC32194g gVar = DialogC32194g.f76839e;
            if (gVar != null) {
                gVar.dismiss();
            }
            DialogC32194g.f76839e = null;
            C1182af viewModelStore = getViewModelStore();
            if (viewModelStore != null) {
                viewModelStore.mo3997a();
            }
            C49560q.f113987a.clear();
            C49560q.f113988b.clear();
            C49560q.f113989c.clear();
            C35350g.f83388a.clear();
        }

        @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
        public void onResume() {
            DialogC32194g gVar;
            C15477a.m28476b(this);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", true);
            if (C58949c.C58950a.f134192c) {
                C58949c.C58950a.f134192c = false;
                C58949c.C58950a.m108307a(3);
            }
            C58945a.C58947b.f134185a.mo96429b("cold_boot_main_create_to_resume", true);
            C80229aw.m139065b("cold_boot_main_create_to_resume");
            C58945a.C58947b.f134185a.mo96425a("cold_boot_main_resume_duration", true);
            C80229aw.m139064a("cold_boot_main_resume_duration");
            this.isPaused = false;
            super.onResume();
            if (C49710k.f114397e != -1) {
                C49710k.f114398f = SystemClock.elapsedRealtime() - C49710k.f114397e;
                C49710k.f114397e = -1;
                if (C49710k.f114403k != null) {
                    for (Runnable runnable : C49710k.f114403k) {
                        C29339a.m58752a(runnable);
                    }
                    C49710k.f114403k.clear();
                    C49710k.f114403k = null;
                }
            }
            C51423a.m95787a("ProcessPublish tryProcessPublish onResume");
            this.mComplianceBusinessActivityObserver.mo68114b();
            C22740c cVar = this.mCommerceActivityObserver;
            AVExternalServiceImpl.m113114a().publishService().resetNewCreateWay();
            cVar.f53719e.onResume();
            MainLooperOptService.m105334b(MainLooperOptService.EnumC58297a.WATCH_ON_MEASURE);
            if (!isADShowing()) {
                this.mUgCommonService.mo123100b().mo123139a(this, false, "");
            }
            this.firstCreated = false;
            this.mUgCommonService.mo123102b((ActivityC17312a) this);
            DialogC32194g gVar2 = DialogC32194g.f76839e;
            if (gVar2 != null && gVar2.f76842c && C36085cj.f85262b.mo57077m().getTwoStepVerificationStatusFromLocal() == 1 && (gVar = DialogC32194g.f76839e) != null) {
                gVar.dismiss();
            }
            this.mInvitationReflowHelper.mo87044a();
            C22758n nVar = this.tikTokToolsObserver;
            IReplaceMusicService a = ReplaceMusicServiceImpl.m143543a();
            if (a.getClickPost()) {
                if (!EventBus.m156962a().mo145393a(nVar.f53748a)) {
                    EventBus.m156966a(EventBus.m156962a(), nVar.f53748a);
                }
                a.setClickPost(false);
                new C23144b(nVar.f53749b).mo37640e(R.string.faw).mo37637b();
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getApplicationService().mo93764a(nVar.f53749b);
                a.doRequest(a.getCover(), a.getReplaceMusicRequest(), nVar.f53749b);
            }
            C34902e.m71283a();
            C34902e.f82353c = false;
            ServiceManager.get().getService(AbstractC67849c.class);
            ServiceManager.get().getService(AbstractC67849c.class);
            C58945a.C58947b.f134185a.mo96429b("cold_boot_main_resume_duration", true);
            C80229aw.m139065b("cold_boot_main_resume_duration");
            C58945a.C58947b.f134185a.mo96425a("cold_boot_main_resume_to_measure", false);
            C80229aw.m139064a("cold_boot_main_resume_to_measure");
            C58945a.C58947b.f134185a.mo96425a("cold_boot_main_resume_to_focus", true);
            C80229aw.m139064a("cold_boot_main_resume_to_focus");
            C58945a.C58947b.f134185a.mo96425a("cold_boot_resume_to_mainpage_create_view", false);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onResume", false);
        }

        @AbstractC90264r(mo145422a = ThreadMode.MAIN)
        public void onSettingsDoneEvent(C39228b bVar) {
            C50308a.f116164g = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f
        public void setActivityResultListener(AbstractC34467b bVar) {
            this.mActivityResultListener = bVar;
        }

        /* renamed from: com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
        public static Bundle m108373xc32cf566(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ C1731i lambda$callLazyDoIt$9$MainActivity(C1731i iVar) {
            lazyDoIt();
            return null;
        }

        @AbstractC90264r
        public void onMobEnterFromEvent(C49688p pVar) {
            this.homeViewModel.mo89326a(pVar.f114354a);
        }

        @AbstractC90264r
        public void onMobRequestIdEvent(C49689q qVar) {
            this.homeViewModel.f121744j = qVar.f114355a;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
        public void unRegisterActivityOnKeyDownListener(AbstractC34466a aVar) {
            List<AbstractC34466a> list = this.mActivityOnKeyDownListeners;
            if (list != null) {
                list.remove(aVar);
            }
        }

        /* renamed from: com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
        public static Context m108377xaf3587e3(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        public static Intent getMainActivityIntent(Context context) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            return intent;
        }

        private void setupSlideSwitchLayout(String str) {
            if ("DISCOVER".equals(str)) {
                this.stateManager.mo89345a(false);
            }
        }

        public void changeTabAfterPublish(int i) {
            this.mDataCenter.mo60191a("changeTabAfterPublish", Integer.valueOf(i));
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$onCreate$7$MainActivity(Bundle bundle) {
            this.mToolsActivityObserver.mo37075a(bundle, this.mDataCenter, this.mNewUserGuideObserver);
        }

        @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            this.mUgCommonService.mo123104c(this);
        }

        @AbstractC90264r
        public void onScrollToDetailEvent(C49668ac acVar) {
            if (acVar != null && this.mScrollSwitchHelper != null) {
                this.homeViewModel.mo89326a(acVar.f114310a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59103j
        public void setTabBackground(boolean z) {
            this.mDataCenter.mo60191a("setTabBackground", Boolean.valueOf(z));
        }

        @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59104k
        public void setVpEnableDispatchTouchEventCheck(boolean z) {
            ScrollableViewPager scrollableViewPager = this.mActivityProxy.f121719d;
            if (scrollableViewPager != null) {
                scrollableViewPager.setEnableDispatchTouchEventCheck(z);
            }
        }

        private void changeTag(String str) {
            Bundle bundle = new Bundle();
            bundle.putString(C34792be.f82123b, C34792be.f82125d);
            Hox.C15490a.m28529a(this).mo25211b(str, bundle);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
        public void registerActivityOnKeyDownListener(AbstractC34466a aVar) {
            if (this.mActivityOnKeyDownListeners == null) {
                this.mActivityOnKeyDownListeners = new ArrayList();
            }
            if (!this.mActivityOnKeyDownListeners.contains(aVar)) {
                this.mActivityOnKeyDownListeners.add(aVar);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59104k
        public void allowSwipeLeft(boolean z) {
            if (!z) {
                this.stateManager.mo89338a(this.scrollFullChecker);
            } else if (Hox.C15490a.m28529a(this).mo25213b("HOME")) {
                this.stateManager.mo89338a(this.scrollBasicChecker);
            } else {
                this.stateManager.mo89338a(this.scrollFullChecker);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            try {
                return super.dispatchTouchEvent(motionEvent);
            } catch (Throwable th) {
                C51423a.m95790a(th);
                C33830n.m69192a("main_activity_dispatch_error", "", new C33743c().mo59976a("message", th.getMessage()).mo59977a());
                return false;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
            if (r4.f173615e != false) goto L_0x0027;
         */
        @org.greenrobot.eventbus.AbstractC90264r(mo145422a = org.greenrobot.eventbus.ThreadMode.MAIN, mo145423b = true, mo145424c = -1)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPublishMessage(com.p2082ss.android.ugc.aweme.story.model.C77379b r4) {
            /*
                r3 = this;
                int r1 = r4.f173611a
                r0 = -1
                if (r1 == r0) goto L_0x0027
                r0 = 1
                if (r1 == r0) goto L_0x0023
                r0 = 2
                if (r1 == r0) goto L_0x0013
            L_0x000b:
                org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.m156962a()
                r0.mo145399f(r4)
                return
            L_0x0013:
                com.ss.android.ugc.aweme.ug.IUgCommonService r0 = r3.mUgCommonService
                com.ss.android.ugc.aweme.ug.c r1 = r0.mo123092a()
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f173614d
                java.lang.String r0 = r0.getAid()
                r1.mo123116b(r0)
                goto L_0x000b
            L_0x0023:
                boolean r0 = r4.f173615e
                if (r0 == 0) goto L_0x000b
            L_0x0027:
                com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r2 = r3.stateManager
                r1 = 0
                java.lang.String r0 = "page_feed"
                r2.mo89342a(r0, r1)
                com.ss.android.ugc.aweme.ug.IUgCommonService r0 = r3.mUgCommonService
                com.ss.android.ugc.aweme.ug.c r2 = r0.mo123092a()
                r1 = 0
                java.lang.String r0 = "start_upload"
                r2.mo123113a(r0, r1)
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.main.MainActivity.onPublishMessage(com.ss.android.ugc.aweme.story.model.b):void");
        }

        public void onVideoPageChangeEventDelay(C49693u uVar) {
            if (!C37699a.m76314s(uVar.f114359a) || !C37699a.m76202E(uVar.f114359a)) {
                C29339a.m58753a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.main.MainActivity.RunnableC589812 */

                    static {
                        Covode.recordClassIndex(69315);
                    }

                    public final void run() {
                        Aweme aweme;
                        if (!MainActivity.this.isFinishing() && MainActivity.this.homeViewModel != null) {
                            HomePageDataViewModel homePageDataViewModel = MainActivity.this.homeViewModel;
                            Aweme aweme2 = MainActivity.this.homeViewModel.f121745k;
                            homePageDataViewModel.f121741g = aweme2;
                            if (aweme2 != null && (aweme = homePageDataViewModel.f121741g) != null) {
                                aweme.setIsPreloadScroll(false);
                            }
                        }
                    }
                }, 300);
            }
            setAdScrollRightControl();
            C40203j.C40204a.m81323a().mo69407b(getActivity());
        }

        private void suitRouter(Intent intent) {
            Uri data;
            if (intent != null && (data = intent.getData()) != null) {
                String host = data.getHost();
                String path = data.getPath();
                if (("mine".equals(host) || "user/homepage".equals(host + path)) && C31575b.m65865g().isLogin()) {
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                    intent.putExtra("profile_from_scene", data.getQueryParameter("from_scene"));
                }
            }
        }

        @Override // android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.app.Activity
        public Object getSystemService(String str) {
            if (!C46711at.m90098a() || !TextUtils.equals("layout_inflater", str)) {
                return m108372x3e72602f(this, str);
            }
            if (getBaseContext() != null) {
                C35353i iVar = this.mViewInflaterOpt;
                if (iVar.f83395b != null) {
                    String name = Thread.currentThread().getName();
                    LayoutInflater layoutInflater = iVar.f83394a.get(name);
                    if (layoutInflater == null) {
                        layoutInflater = iVar.mo62224a(this);
                        iVar.f83394a.put(name, layoutInflater);
                    }
                    if (layoutInflater != null) {
                        return layoutInflater;
                    }
                }
                return m108372x3e72602f(this, str);
            }
            throw new IllegalStateException("System services not available to Activities before onCreate()");
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void lambda$onCreate$0$MainActivity(AbstractC0220f fVar) {
            MethodCollector.m26663i(6392);
            C13546g.m24338a((int) Thread.currentThread().getId(), -20);
            synchronized (this.decorViewLock) {
                try {
                    C58945a.C58947b.f134185a.mo96425a("method_main_decorview_async_duration", false);
                    try {
                        if (Looper.myLooper() == null) {
                            Looper.prepare();
                        }
                        m108378xfb5bdd58(C21471a.m40334b(fVar.getClass(), "ensureSubDecor", new Class[0]), fVar, new Object[0]);
                    } catch (Exception e) {
                        C80304cm.m139210a(e, "ensureSubDecor", "MainActivity", "onCreate", "");
                        e.printStackTrace();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6392);
                    throw th;
                }
            }
            C58945a.C58947b.f134185a.mo96429b("method_main_decorview_async_duration", false);
            MethodCollector.m26664o(6392);
        }

        @AbstractC90264r
        public void onHideLivePopupWindowEvent(C65692b bVar) {
            C65697d a = C65697d.C65698a.m117593a();
            if (a.mo104851a() != null && a.mo104851a().isShowing()) {
                View$OnClickListenerC65719e a2 = a.mo104851a();
                C65722f.m117657a(a2.f148091m.booleanValue(), a2.f148086h, a2.f148088j, "ad", a2.f148089k, a2.f148090l, a2.f148087i);
                C65722f.m117656a(a2.f148086h, a2.f148088j, a2.f148090l, "Android", a2.f148085g, a2.f148092n, a2.f148093o, new StringBuilder().append(a2.f148079a).toString(), a2.f148094p);
                a2.mo85245d();
            }
        }

        @AbstractC90264r
        public void onVideoPageChangeEvent(C49693u uVar) {
            String str;
            if (uVar.f114359a != null) {
                String authorUid = uVar.f114359a.getAuthorUid();
                this.homeViewModel.f121745k = uVar.f114359a;
                String str2 = "";
                if (this.homeViewModel.f121745k != null) {
                    str = this.homeViewModel.f121745k.getAid();
                } else {
                    str = str2;
                }
                C59213ah.f134853b = str;
                C59226b.f135143b = authorUid;
                if (this.homeViewModel.f121745k != null) {
                    str2 = this.homeViewModel.f121745k.getAid();
                }
                C59226b.f135142a = str2;
                if (!TextUtils.equals(this.homeViewModel.f121740f, authorUid)) {
                    this.homeViewModel.f121740f = authorUid;
                    m108375xb33ce78b("winter", "on video page change id = " + uVar.f114359a.getAid());
                    C22740c cVar = this.mCommerceActivityObserver;
                    cVar.f53719e.onVideoPageChangeEvent(uVar.f114359a, uVar.f114360b);
                    onVideoPageChangeEventDelay(uVar);
                }
            }
        }

        @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
        public void attachBaseContext(Context context) {
            MethodCollector.m26663i(9168);
            C58945a.C58947b.f134185a.mo96425a("main_act_attach_base_context", false);
            Context com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m108377xaf3587e3(context);
            if (Keva.getRepoSync("ab_repo_cold_boot", 1).getInt("prefetcher_cold_start", 0) == 1 && C29843f.m60129a(com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext)) {
                String b = C80333dc.m139277b(C81631k.f182525a.mo125297c(), "prefetcher");
                long j = Keva.getRepoSync("ab_repo_cold_boot", 1).getLong("prefetcher_step_size", 524288);
                long j2 = Keva.getRepoSync("ab_repo_cold_boot", 1).getLong("prefetcher_step_sleep_duration", 15000);
                IoPrefetcher.f47722q = IoPrefetcher.f47721p;
                IoPrefetcher.f47723r = j;
                IoPrefetcher.f47724s = j2;
                HandlerThread handlerThread = new HandlerThread("io_prefetcher");
                handlerThread.start();
                Handler handler = new Handler(handlerThread.getLooper());
                IoPrefetcher.f47707b = handler;
                handler.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0071: INVOKE  
                      (r1v4 'handler' android.os.Handler)
                      (wrap: com.bytedance.io.prefetcher.IoPrefetcher$1 : 0x006e: CONSTRUCTOR  (r0v18 com.bytedance.io.prefetcher.IoPrefetcher$1) = 
                      (r5v0 'com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext' android.content.Context)
                      (r4v0 'b' java.lang.String)
                     call: com.bytedance.io.prefetcher.IoPrefetcher.1.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.ss.android.ugc.aweme.main.MainActivity.attachBaseContext(android.content.Context):void, file: classes7.dex
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006e: CONSTRUCTOR  (r0v18 com.bytedance.io.prefetcher.IoPrefetcher$1) = 
                      (r5v0 'com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext' android.content.Context)
                      (r4v0 'b' java.lang.String)
                     call: com.bytedance.io.prefetcher.IoPrefetcher.1.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.main.MainActivity.attachBaseContext(android.content.Context):void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 19 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.io.prefetcher.IoPrefetcher, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 25 more
                    */
                /*
                // Method dump skipped, instructions count: 160
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.main.MainActivity.attachBaseContext(android.content.Context):void");
            }

            @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
            public void onNewIntent(Intent intent) {
                m108375xb33ce78b("optimizeFirstInstall", "Main onNewIntent:" + System.currentTimeMillis());
                super.onNewIntent(intent);
                if (intent == null || !intent.getBooleanExtra("from_new_user_journey", false)) {
                    intent.putExtra("onNewIntent", true);
                    setIntent(intent);
                    IUgCommonService iUgCommonService = this.mUgCommonService;
                    if (iUgCommonService != null) {
                        iUgCommonService.mo123096a(intent);
                    }
                    AbstractC34895bp bpVar = this.mSocialActivityObserver;
                    if (bpVar != null) {
                        bpVar.mo60674a(intent);
                    }
                    C34685e d = this.stateManager.mo89354d("page_feed");
                    if (d instanceof MainPageFragment) {
                        MainPageFragment mainPageFragment = (MainPageFragment) d;
                        if (mainPageFragment.f134267n != null) {
                            DataCenter dataCenter = mainPageFragment.f134267n;
                            if (dataCenter == null) {
                                C89219l.m154715b();
                            }
                            dataCenter.mo60191a("lastTryShowGuideViewResult", (Object) false);
                        }
                    }
                    this.mDialogRefactorContainer.mo37041a(getIntent());
                    if (!this.mToolsActivityObserver.mo37076a(intent, false)) {
                        this.mDataCenter.mo60191a("onNewIntent", intent);
                        if (!TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) {
                            this.stateManager.mo89342a("page_feed", false);
                        }
                        this.mToolsActivityObserver.mo37077b(intent, intent.getBooleanExtra("enter_record_from_other_platform", false));
                        this.mAccountObserver.mo37055a(m108373xc32cf566(intent));
                        this.mInvitationReflowHelper.mo87046b(intent);
                    }
                }
            }

            @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
            public void onRestoreInstanceState(Bundle bundle) {
                Bundle bundle2;
                C89219l.m154721d(this, "");
                try {
                    if (Build.VERSION.SDK_INT == 28 && bundle != null && (bundle2 = bundle.getBundle("android:viewHierarchyState")) != null && TextUtils.equals(bundle2.getClassLoader().getClass().getName(), "java.lang.BootClassLoader")) {
                        bundle2.setClassLoader(getClassLoader());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                super.onRestoreInstanceState(bundle);
                bundle.getString("previousTag");
                boolean z = bundle.getBoolean("slide_switch_scanScroll");
                TabChangeManager tabChangeManager = getTabChangeManager();
                if (tabChangeManager.f134312d == null) {
                    tabChangeManager.f134312d = bundle.getString("cur_fragment");
                    if (tabChangeManager.f134315g != null) {
                        TabChangeManager.AbstractC59004b bVar = tabChangeManager.f134315g;
                        if (bVar == null) {
                            C89219l.m154715b();
                        }
                        bVar.mo89405a(tabChangeManager.f134312d);
                    }
                }
                if (tabChangeManager.f134310b == null) {
                    tabChangeManager.f134310b = bundle.getString("last_fragment");
                }
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean(C34792be.f82122a, true);
                bundle3.putString(C34792be.f82123b, C34792be.f82125d);
                Hox.C15490a.m28529a(this).mo25211b("HOME", bundle3);
                this.stateManager.mo89345a(z);
            }

            @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
            public void onSaveInstanceState(Bundle bundle) {
                int size;
                boolean z;
                String str;
                C34690j jVar;
                super.onSaveInstanceState(bundle);
                TabChangeManager tabChangeManager = getTabChangeManager();
                C89219l.m154721d(bundle, "");
                bundle.putString("cur_fragment", tabChangeManager.f134312d);
                bundle.putString("last_fragment", tabChangeManager.f134310b);
                bundle.putString("previousTag", getTabChangeManager().f134312d);
                bundle.putBoolean("slide_switch_scanScroll", this.stateManager.mo89346a());
                ScrollSwitchStateManager scrollSwitchStateManager = this.stateManager;
                C89219l.m154721d("page_setting", "");
                if (scrollSwitchStateManager.f121760b.getValue() == null) {
                    size = 0;
                } else {
                    List<C34690j> value = scrollSwitchStateManager.f121760b.getValue();
                    if (value == null) {
                        C89219l.m154715b();
                    }
                    size = value.size();
                }
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = false;
                        break;
                    }
                    List<C34690j> value2 = scrollSwitchStateManager.f121760b.getValue();
                    if (value2 == null || (jVar = value2.get(i)) == null) {
                        str = null;
                    } else {
                        str = jVar.f81948b;
                    }
                    if (TextUtils.equals("page_setting", str)) {
                        z = true;
                        break;
                    }
                    i++;
                }
                bundle.putBoolean("should_show_slide_setting", z);
                if (!C16048b.m29633a().mo25421a(true, "enable_main_use_fragments_cache", false)) {
                    bundle.putParcelable("android:support:fragments", null);
                }
            }

            @AbstractC90264r
            public void onScrollToProfileEvent(C49669ad adVar) {
                Aweme aweme;
                AwemeRawAd awemeRawAd;
                AwemeRawAd awemeRawAd2;
                if (adVar != null && this.mScrollSwitchHelper != null && adVar.f114312a == hashCode()) {
                    C22740c cVar = this.mCommerceActivityObserver;
                    if (!(cVar.f53717c == null || (aweme = cVar.f53717c.f121745k) == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                        if (C37699a.m76313r(aweme)) {
                            C38767w.m78648b(cVar.f53715a, aweme);
                            return;
                        } else if (C37699a.m76202E(aweme) && C37699a.m76321z(aweme)) {
                            C38767w.m78673e(cVar.f53715a, aweme);
                            return;
                        } else if (aweme.isAd() && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && C37699a.m76202E(aweme) && !C37699a.m76203F(aweme) && (((C38701br.m78512a(aweme, 3) && !TextUtils.isEmpty(awemeRawAd2.getWebUrl())) || ((C49912a.m93713a().mo84954a(aweme) && awemeRawAd2.getNonNativeClick() == 0) || C37699a.m76288c(awemeRawAd2.getOpenUrl()))) && !C37699a.m76207J(aweme))) {
                            if (C37699a.m76311p(aweme)) {
                                C38767w.m78628a(cVar.f53715a, aweme, "slide");
                                return;
                            } else if (!AbstractC38757n.m78633a(cVar.f53715a, aweme) && !C59286a.m108996a(cVar.f53715a, aweme)) {
                                AbstractC38757n.m78635a(cVar.f53715a, aweme, (String) null, (String) null);
                                return;
                            } else {
                                return;
                            }
                        } else if (!C37699a.m76291d(awemeRawAd) && TextUtils.isEmpty(awemeRawAd.getWebUrl()) && C37699a.m76202E(aweme)) {
                            C22740c.m42896a(Toast.makeText(cVar.f53715a, (int) R.string.o5, 0));
                            return;
                        } else if (C37699a.m76291d(awemeRawAd) && C37699a.m76202E(aweme) && !C37699a.m76203F(aweme) && !C37699a.m76207J(aweme)) {
                            if (!C37699a.m76291d(awemeRawAd) || !C38767w.m78671d(cVar.f53715a, aweme)) {
                                C22740c.m42896a(Toast.makeText(cVar.f53715a, (int) R.string.o5, 0));
                                return;
                            }
                            return;
                        }
                    }
                    this.mScrollSwitchHelper.mo96581a(this.homeViewModel.f121745k, "");
                }
            }

            @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
            public void onWindowFocusChanged(boolean z) {
                boolean z2;
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onWindowFocusChanged", true);
                if (z) {
                    C58945a.C58947b.f134185a.mo96429b("cold_boot_main_measure_to_focus", false);
                    C58945a.C58947b.f134185a.mo96429b("cold_boot_main_resume_to_focus", true);
                    C80229aw.m139065b("cold_boot_main_resume_to_focus");
                    C58945a.C58947b.f134185a.mo96425a("cold_boot_main_focus_duration", true);
                    C58945a.C58947b.f134185a.mo96429b("feed_get_cache_to_focus", false);
                    C58945a.C58947b.f134185a.mo96429b("feed_load_cache_completed_to_focus", false);
                    C58945a.C58947b.f134185a.mo96429b("feed_render_to_focus", false);
                    C58945a.C58947b.f134185a.mo96429b("player_prerender_to_focus", false);
                }
                super.onWindowFocusChanged(z);
                this.isFirstLaunch = false;
                if (!C46714av.m90100b()) {
                    z2 = false;
                } else if (z) {
                    m108375xb33ce78b("coldboot", "cold boot: " + (System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h));
                    C58945a.C58947b.f134185a.mo96429b("app_start_to_main_focus", true);
                    C58945a.C58947b.f134185a.mo96429b("app_start_to_main_focus_v2", true);
                    C58945a.C58947b.f134185a.mo96429b("cold_boot_main_focus_duration", true);
                    z2 = false;
                    C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_view_created_to_focus", false);
                    C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_recommend_onresume_to_focus", false);
                    C58945a.C58947b.f134185a.mo96425a("cold_boot_focus_end_to_post_cache_message", false);
                    C58945a.C58947b.f134185a.mo96425a("cold_boot_main_focus_to_feed_success", false);
                } else {
                    z2 = false;
                    C58945a.C58947b.f134185a.f134176c = false;
                    C58949c.f134187a = false;
                }
                C22734a aVar = this.mAccountObserver;
                if (z && aVar.f53706a) {
                    aVar.f53706a = z2;
                    C31575b.m65860b().toRecoverDeletedAccount(null);
                }
                this.mComplianceBusinessActivityObserver.mo68112a(z);
                if (z && this.mIsFirstVisible) {
                    if (!((Boolean) C67269f.f150745a.getValue()).booleanValue()) {
                        MainLooperOptService.m105334b(MainLooperOptService.EnumC58297a.WATCH_ON_DRAW);
                    }
                    this.mIsFirstVisible = false;
                    C22759o oVar = this.mToolsActivityObserver;
                    if (oVar.f53750a.getIntent().getBooleanExtra("enter_record_from_other_platform", false) && !oVar.f53752c) {
                        AVExternalServiceImpl.m113114a().publishService().tryRestorePublish(oVar.f53750a, new C22761p(oVar));
                    }
                    this.mUgCommonService.mo123098a(this, z);
                    C22763r rVar = this.mUserGrowthActivityObserver;
                    if (rVar.f53759a.getIntent().getBooleanExtra("app_action_restricted", false)) {
                        new C23144b(rVar.f53759a).mo37640e(R.string.bu1).mo37637b();
                    }
                    C29339a.m58753a(new RunnableC59013ad(this), 300);
                    this.isFirstLaunch = true;
                    onStartUp();
                    if (C46832dk.m90151b()) {
                        m108376xb33ce790("DoFrameBooster", "FirstFrameDoFrameOptAB sucessful open");
                        C21478d.f50922d = true;
                    }
                    if (C56206g.m102126c()) {
                        IMService.createIIMServicebyMonsterPlugin(false).registerLifeCycle(C17879g.m33104a());
                    }
                    C58221f.m105147a(C58420ae.m106850r());
                }
                this.mPerformanceActivityObserver.mo37053a(this, z);
                C58221f.m105144a(EnumC58148ab.ONWINDOWS_FOCUSCHANGE);
                if (C46714av.m90100b()) {
                    C35350g.m72349a();
                } else if (z) {
                    m108375xb33ce78b("coldboot", "cold boot: " + (System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h));
                    C58945a.C58947b.f134185a.mo96429b("app_start_to_main_focus", true);
                    C58945a.C58947b.f134185a.mo96429b("app_start_to_main_focus_v2", true);
                    C58945a.C58947b.f134185a.mo96429b("cold_boot_main_focus_duration", true);
                    C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_view_created_to_focus", false);
                    C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_recommend_onresume_to_focus", false);
                    C58945a.C58947b.f134185a.mo96425a("cold_boot_focus_end_to_post_cache_message", false);
                    C58945a.C58947b.f134185a.mo96425a("cold_boot_main_focus_to_feed_success", false);
                } else {
                    C58945a.C58947b.f134185a.f134176c = false;
                    C58949c.f134187a = false;
                }
            }

            @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.main.AbstractActivityC59100h, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
            public void onCreate(Bundle bundle) {
                boolean z;
                int i;
                String str;
                String str2;
                String str3;
                int i2;
                boolean z2;
                boolean z3;
                boolean z4;
                HomePageDataViewModel homePageDataViewModel;
                File file;
                MethodCollector.m26663i(9328);
                C15477a.m28474a(this, bundle);
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", true);
                C58945a.C58947b.f134185a.mo96429b("cold_boot_application_to_main", true);
                C80229aw.m139065b("cold_boot_application_to_main");
                C58945a.C58947b.f134185a.mo96425a("method_main_create_begin_to_splash_ad", false);
                C58945a.C58947b.f134185a.mo96425a("cold_boot_main_create_duration", true);
                C80229aw.m139064a("cold_boot_main_create_duration");
                C58945a.C58947b.f134185a.mo96425a("main_act_create_to_node_init", false);
                if (bundle != null) {
                    z = true;
                } else {
                    z = false;
                }
                C58949c.f134188b = SystemClock.uptimeMillis();
                C58949c.C58950a.f134192c = false;
                if (z) {
                    if (C58949c.C58950a.f134190a) {
                        i = 5;
                    } else {
                        i = 4;
                    }
                } else if (C58949c.C58950a.f134190a) {
                    i = 1;
                } else {
                    i = 2;
                }
                C58949c.C58950a.m108307a(i);
                C58949c.C58950a.f134190a = false;
                if (C67214a.m119165o()) {
                    C58945a.C58947b.f134185a.mo96425a("method_main_get_delegate", false);
                    AbstractC0220f delegate = getDelegate();
                    C58945a.C58947b.f134185a.mo96429b("method_main_get_delegate", true);
                    C40780g.m82246c().execute(new RunnableC59109p(this, delegate));
                }
                if (C46714av.m90101c()) {
                    doHoxInit();
                    C58221f.m105153e().mo95704a(new PreloadActicityTask()).mo95704a(C52967b.m97879a(this.hoxInstance)).mo95706a();
                }
                if (C46899ep.m90198b()) {
                    AbstractC58191c cVar = C58221f.f132585i;
                    if (cVar == null) {
                        C89219l.m154710a("legoConfig");
                    }
                    if (cVar.mo60046d()) {
                        HandlerC58143e.f132402b.mo95648a();
                    }
                }
                if (C76660b.m134243c() && C77260g.f173332a.mo120163k() != hashCode()) {
                    C77260g.f173332a.mo120140a(hashCode());
                    C77260g.f173332a.mo120162j();
                    C77697a.f174263a = null;
                }
                if (SettingsRequestServiceImpl.m65417i().mo57288f() == 3) {
                    C49301e.m92366b(true);
                }
                C79340b.m138147a().mainOnCreate();
                if (C41333b.f96464a) {
                    C41333b.m83193a(this);
                }
                C22753i iVar = this.mNewUserGuideObserver;
                if (C67214a.m119163m()) {
                    iVar.f53742c = C40780g.m82246c().submit(new RunnableC22754j(iVar));
                }
                if (!C67248d.m119173a()) {
                    C53307c.m98263a(this);
                    C35345c.m72334a((Activity) this);
                }
                if (((Boolean) C58206e.f132549p.getValue()).booleanValue()) {
                    C40780g.m82245b().execute(RunnableC59113q.f134517a);
                }
                if (C47024i.m90289b()) {
                    C12895a.f31387b.f31389a.postDelayed(new RunnableC59137w(this), ((Number) C47024i.f109552a.getValue()).longValue());
                } else {
                    C80608p.m139760a(this);
                }
                if (C46711at.m90098a()) {
                    this.mViewInflaterOpt.mo62226a(new C59138x(this));
                }
                if (TextUtils.equals(C17867d.f42595s, "local_test")) {
                    try {
                        Context a = C17867d.m33078a();
                        if (!TextUtils.isEmpty(null)) {
                            file = a.getExternalFilesDir(null);
                        } else {
                            if (C58016d.f132223d == null || !C58016d.f132224e) {
                                C58016d.f132223d = a.getExternalFilesDir(null);
                            }
                            file = C58016d.f132223d;
                        }
                        File file2 = new File(file, "auto_sleep");
                        if (file2.exists()) {
                            Thread.sleep(Long.parseLong(C89159j.m154648c(file2)));
                        }
                    } catch (Exception e) {
                        Arrays.toString(e.getStackTrace());
                    }
                }
                C58945a.C58947b.f134185a.mo96429b("main_act_create_to_node_init", false);
                m108375xb33ce78b("optimizeFirstInstall", "onCreate:" + System.currentTimeMillis());
                if (!C46714av.m90101c()) {
                    doHoxInit();
                }
                C58945a.C58947b.f134185a.mo96425a("main_act_performance_observe", false);
                this.mPerformanceActivityObserver.mo37052a(this, this.hoxInstance);
                C58945a.C58947b.f134185a.mo96429b("main_act_performance_observe", false);
                if (!C67214a.m119163m()) {
                    C58945a.C58947b.f134185a.mo96425a("main_act_user_guide_observe", false);
                    this.mNewUserGuideObserver.mo37070a();
                    C58945a.C58947b.f134185a.mo96429b("main_act_user_guide_observe", false);
                }
                C58945a.C58947b.f134185a.mo96425a("main_act_user_guide_to_super_create", false);
                C58945a.C58947b.f134185a.mo96425a("main_act_user_guide_to_immersive_config", false);
                this.mUgCommonService.mo123097a((ActivityC17312a) this);
                C52932a aVar = this.mActivityProxy;
                C89219l.m154721d(this, "");
                if (C58140b.f132399a != EnumC58085a.COLD_BOOT_BEGIN) {
                    C58140b.f132399a = EnumC58085a.HOT_BOOT_BEGIN;
                }
                aVar.f121716a = HomePageDataViewModel.C52942a.m97777a(this);
                aVar.f121717b = DataCenter.m69492a(C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null), this);
                aVar.f121718c = ScrollSwitchStateManager.C52950a.m97811a(this);
                Intent intent = getIntent();
                try {
                    str = C52932a.m97764a(intent, "id");
                } catch (Throwable unused) {
                    str = null;
                }
                try {
                    str2 = C52932a.m97764a(intent, "ids");
                } catch (Throwable unused2) {
                    str2 = null;
                }
                try {
                    str3 = C52932a.m97764a(intent, "push_params");
                } catch (Throwable unused3) {
                    str3 = null;
                }
                C52948a aVar2 = HomePageDataViewModel.C52942a.m97777a(this).f121737c;
                if (aVar2 != null) {
                    aVar2.f121755a = str;
                    aVar2.f121756b = str2;
                    aVar2.f121757c = str3;
                }
                String string = C34822d.m71158a(C17867d.m33078a(), "applog_stats", 0).getString("app_track", "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        C36125t.m73596a(C36125t.m73591a(), this, new JSONObject(string).optString("openurl"));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                if (!(bundle == null || (homePageDataViewModel = aVar.f121716a) == null)) {
                    homePageDataViewModel.f121736b = bundle.getBoolean("should_show_slide_setting");
                }
                ActivityC0945e eVar = this.mLegacyPlayerActivityObserver.f53722a;
                if (!C58975a.f134219c) {
                    try {
                        if (!C58975a.m108349d(eVar)) {
                            C58975a.f134220d = new C58975a.C58976a(C58975a.f134217a);
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                            C58975a.m108343a(eVar, C58975a.f134220d, intentFilter);
                            C58975a.f134219c = true;
                        }
                    } catch (Exception unused4) {
                    }
                }
                C80938q.m140455b();
                this.stateManager = ScrollSwitchStateManager.C52950a.m97811a(this);
                this.homeViewModel = this.mActivityProxy.f121716a;
                this.adHomePageDataVM = AdHomePageDataVM.C17902a.m33208a(this);
                this.mSocialRecFriendsConditionVM = SocialRecFriendsConditionViewModel.C66896a.m118645a(this);
                this.mDataCenter = this.mActivityProxy.f121717b;
                this.mRestartFromLogout = getIntent().getBooleanExtra("restart_from_logout", false);
                this.pageType = getIntent().getIntExtra("page_type", -1);
                if (!SplashSettingServiceImpl.m33419g().mo28723a() && (!C58140b.m105075a() || !C46807cw.m90144a())) {
                    new C58221f.C58223b().mo95701b((AbstractC58259r) new C67179a()).mo95706a();
                }
                C58945a.C58947b.f134185a.mo96425a("feed_lego_add_to_request", false);
                if (!C67214a.m119163m()) {
                    AbstractC56869p.C56870a.m103133a().mo70122a(AbstractC56869p.C56870a.m103135a(getIntent()));
                }
                long currentTimeMillis = System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h;
                if (((Boolean) C58206e.f132543j.getValue()).booleanValue()) {
                    C40780g.m82245b().execute(new C52965a.RunnableC52966a(currentTimeMillis));
                } else {
                    C52965a.m97878a(currentTimeMillis);
                }
                suitRouter(getIntent());
                C22734a aVar3 = new C22734a(this, this.mDataCenter, this.mDialogRefactorContainer);
                this.mAccountObserver = aVar3;
                aVar3.mo37055a(m108373xc32cf566(getIntent()));
                C58945a.C58947b.f134185a.mo96429b("main_act_user_guide_to_immersive_config", false);
                C58945a.C58947b.f134185a.mo96425a("main_act_immersive_config", false);
                C33103x xVar = new C33103x((byte) 0);
                xVar.f78675i = true;
                activityConfiguration(new C59139y(xVar));
                C58945a.C58947b.f134185a.mo96429b("main_act_immersive_config", false);
                if (bundle != null) {
                    i2 = R.style.nz;
                } else {
                    i2 = R.style.o3;
                }
                setTheme(i2);
                C58945a.C58947b.f134185a.mo96429b("main_act_user_guide_to_super_create", false);
                C58945a.C58947b.f134185a.mo96425a("method_main_super_duration", false);
                super.onCreate(bundle);
                C58945a.C58947b.f134185a.mo96429b("method_main_super_duration", false);
                C58945a.C58947b.f134185a.mo96425a("main_act_commerce_observe", false);
                C22740c cVar2 = this.mCommerceActivityObserver;
                cVar2.f53717c = HomePageDataViewModel.C52942a.m97777a(cVar2.f53715a);
                cVar2.f53718d = AdHomePageDataVM.C17902a.m33208a(cVar2.f53715a);
                cVar2.f53719e.onCreate();
                if (!C49905a.f115045a) {
                    synchronized (C49905a.f115046b) {
                        try {
                            C49905a.f115045a = true;
                            C49905a.f115046b.notifyAll();
                        } catch (Throwable th) {
                            MethodCollector.m26664o(9328);
                            throw th;
                        }
                    }
                }
                C58945a.C58947b.f134185a.mo96429b("main_act_commerce_observe", false);
                C58945a.C58947b.f134185a.mo96425a("main_act_commerce_observe_to_content_view", false);
                setAllowPrepareVideo();
                C22746g gVar = this.mLoginAndConsentObserver;
                boolean z5 = this.mRestartFromLogout;
                boolean z6 = this.adHomePageDataVM.f42661a;
                Intent intent2 = getIntent();
                if (intent2 == null || !intent2.getBooleanExtra("from_require_login", false)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int i3 = this.pageType;
                C89233z.C89238e eVar2 = new C89233z.C89238e();
                eVar2.element = null;
                eVar2.element = (T) AbstractC88979t.m154314c(new C22746g.CallableC22750c(gVar, z6, z2, z5, i3)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C22746g.C22751d(eVar2));
                if (SplashSettingServiceImpl.m33419g().mo28723a() && (!C58140b.m105075a() || !C46807cw.m90144a())) {
                    new C58221f.C58223b().mo95701b((AbstractC58259r) new C67179a()).mo95706a();
                }
                boolean booleanExtra = getIntent().getBooleanExtra("is_start_by_switch_account", false);
                boolean booleanExtra2 = getIntent().getBooleanExtra("from_new_user_journey", false);
                boolean booleanExtra3 = getIntent().getBooleanExtra("needCheckSocialRecDialog", false);
                m108375xb33ce78b(TAG, "isStartBySwitchAccount == " + booleanExtra + ", isFromNewUserJourney == " + booleanExtra2 + ", isNeedCheckSocialRecDialog == " + booleanExtra3);
                this.mSocialRecFriendsConditionVM.f150179b.postValue(Boolean.valueOf(booleanExtra2));
                C1213t<Boolean> tVar = this.mSocialRecFriendsConditionVM.f150178a;
                if (!booleanExtra || !booleanExtra3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                tVar.postValue(Boolean.valueOf(z3));
                DataCenter dataCenter = this.mDataCenter;
                if (getIntent().getBooleanExtra("restart_from_logout", false) || booleanExtra) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                dataCenter.mo60191a("start_from_logout_or_switch", Boolean.valueOf(z4));
                C58945a.C58947b.f134185a.mo96429b("main_act_commerce_observe_to_content_view", false);
                C58945a.C58947b.f134185a.mo96425a("method_main_after_super_init_view", false);
                if (C67214a.m119165o()) {
                    C58945a.C58947b.f134185a.mo96425a("method_main_wait_decorview_async_lock", false);
                    synchronized (this.decorViewLock) {
                        try {
                            C58945a.C58947b.f134185a.mo96429b("method_main_wait_decorview_async_lock", false);
                            this.mActivityProxy.mo89321a(this, this.hoxInstance);
                        } catch (Throwable th2) {
                            ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
                            MethodCollector.m26664o(9328);
                            throw th2;
                        }
                    }
                } else {
                    this.mActivityProxy.mo89321a(this, this.hoxInstance);
                }
                C58945a.C58947b.f134185a.mo96425a("main_act_set_statusbar", false);
                setStatusBarColor();
                C58945a.C58947b.f134185a.mo96429b("main_act_set_statusbar", false);
                C58945a.C58947b.f134185a.mo96429b("method_main_after_super_init_view", false);
                if (C67214a.m119163m()) {
                    C58945a.C58947b.f134185a.mo96425a("main_act_user_guide_observe", false);
                    this.mNewUserGuideObserver.mo37070a();
                    AbstractC56869p.C56870a.m103133a().mo70122a(AbstractC56869p.C56870a.m103135a(getIntent()));
                    C58945a.C58947b.f134185a.mo96429b("main_act_user_guide_observe", false);
                }
                C58945a.C58947b.f134185a.mo96425a("main_act_content_view_to_create_end", false);
                this.mScrollSwitchHelper = new C59052bb(this, this.mActivityProxy.f121719d, this.mActivityProxy.f121720e);
                if (C46714av.m90100b()) {
                    C59031aq aqVar = new C59031aq(this);
                    this.mMainHelper = aqVar;
                    C35350g.m72350a(new RunnableC59140z(aqVar));
                } else {
                    createMainHelper();
                }
                getWindow().setSoftInputMode(32);
                String handleIntent = handleIntent();
                if (!"NOTIFICATION".equals(handleIntent) || C31575b.m65865g().isLogin()) {
                    this.showToast = true;
                    feedOVVMainActivityCreate();
                    setupSlideSwitchLayout(handleIntent);
                    ensureLazyDoItFinallyCalled();
                    if (bundle == null) {
                        changeTag(handleIntent);
                    }
                    if (this.mNewUserGuideObserver.f53741b || !TextUtils.equals(getIntent().getAction(), "android.intent.action.MAIN") || getIntent().getCategories() == null || getIntent().getCategories().size() <= 0 || !getIntent().getCategories().contains("android.intent.category.LAUNCHER") || isTaskRoot()) {
                        C80456ft.f180033b = getClass();
                        C22724a aVar4 = this.mDialogRefactorContainer;
                        EventBus.m156966a(EventBus.m156962a(), aVar4);
                        aVar4.f53683b = C69488a.C69489a.m122709a(aVar4.f53682a);
                        this.firstCreated = true;
                        C22752h hVar = this.mMiniAppActivityObserver;
                        Intent intent3 = hVar.f53739a.getIntent();
                        if (intent3.getBooleanExtra("jumpToGame", false)) {
                            C59315a.C59316a aVar5 = new C59315a.C59316a();
                            aVar5.f135536b = "schema";
                            C59315a a2 = aVar5.mo96936a();
                            C22752h.m42919a(intent3, "gameId");
                            C59320c.C59324a.f135560a.mo96989a().openMiniApp(hVar.f53739a, "", a2);
                        }
                        this.mDialogRefactorContainer.mo37041a(getIntent());
                        if (!C62957f.f142902b) {
                            C62957f.f142902b = true;
                            if (C16048b.m29633a().mo25412a(true, "player_background_release_codec_res", 0) == 1) {
                                C62957f.f142903c = C16048b.m29633a().mo25413a(true, "player_background_release_codec_res_countdown_duration", 30000L);
                                C62957f.f142901a.mo142945a(C17873f.m33099g().mo143289d(C62957f.C62959b.f142906a));
                            }
                        }
                        if (C46714av.m90100b()) {
                            C35350g.m72350a(C22743e.RunnableC22744a.f53723a);
                        } else {
                            C34902e.m71283a().mo61799b();
                        }
                        this.mComplianceBusinessActivityObserver.mo68111a();
                        this.mSocialActivityObserver.mo60673a();
                        MLCommonService.instance().runInMainActivityOnCreate();
                        C58945a.C58947b.f134185a.mo96425a("main_act_tools_activity_observer_duration", false);
                        if (C46714av.m90100b()) {
                            C35350g.m72350a(new RunnableC59010aa(this, bundle));
                        } else {
                            this.mToolsActivityObserver.mo37075a(bundle, this.mDataCenter, this.mNewUserGuideObserver);
                        }
                        C58945a.C58947b.f134185a.mo96429b("main_act_tools_activity_observer_duration", false);
                        C58945a.C58947b.f134185a.mo96425a("main_act_hpas2svdialog_on_create", false);
                        if (((Boolean) C67214a.f150654h.getValue()).booleanValue()) {
                            C40780g.m82246c().execute(new RunnableC59011ab(this));
                        } else {
                            DialogC32194g.C32195a.m66562a(this);
                        }
                        C58945a.C58947b.f134185a.mo96429b("main_act_hpas2svdialog_on_create", false);
                        if (C46939fp.m90233c() && C67214a.m119154d()) {
                            C58945a.C58947b.f134185a.mo96425a("method_init_push_early_ensure_duration", false);
                            C58221f.m105147a(C58420ae.m106837e());
                            C58945a.C58947b.f134185a.mo96429b("method_init_push_early_ensure_duration", false);
                        }
                        this.mInvitationReflowHelper.mo87045a(getIntent());
                        m108375xb33ce78b("optimizeFirstInstall", "onCreate end:" + System.currentTimeMillis());
                        C58945a.C58947b.f134185a.mo96429b("main_act_content_view_to_create_end", false);
                        C58945a.C58947b.f134185a.mo96429b("method_splash_ad_to_main_create_end", false);
                        C58945a.C58947b.f134185a.mo96429b("cold_boot_main_create_duration", true);
                        C80229aw.m139065b("cold_boot_main_create_duration");
                        C58945a.C58947b.f134185a.mo96425a("cold_boot_main_create_to_resume", true);
                        C80229aw.m139064a("cold_boot_main_create_to_resume");
                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
                        MethodCollector.m26664o(9328);
                        return;
                    }
                    m108375xb33ce78b("StartLaunchActivityLancet", "finishhhhhhh");
                    finish();
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
                    MethodCollector.m26664o(9328);
                    return;
                }
                C58957c.m108318a(this, getEnterFrom(), "click_message");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.MainActivity", "onCreate", false);
                MethodCollector.m26664o(9328);
            }

            /* renamed from: com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
            public static String m108374x3cd6895c(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }

            public void flingBackToFeedChange(Aweme aweme, Context context) {
                IAdSceneService f = AdSceneServiceImpl.m33210f();
                if (f != null) {
                    f.mo28466c().mo28514d(aweme, context);
                }
            }

            public void flingToIndexChange(Aweme aweme, Context context) {
                IAdSceneService f = AdSceneServiceImpl.m33210f();
                if (f != null) {
                    f.mo28466c().mo28513c(aweme, context);
                }
            }

            static final /* synthetic */ C89391z lambda$onCreate$6$MainActivity(C33103x xVar, BaseActivityViewModel baseActivityViewModel) {
                baseActivityViewModel.config(C59134t.f134561a);
                baseActivityViewModel.config(new C59135u(xVar));
                baseActivityViewModel.config(C59136v.f134563a);
                return null;
            }

            @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
            public void onActivityReenter(int i, Intent intent) {
                C59052bb bbVar;
                C41327a.m83190a(this, i);
                if (-1 == i && intent != null) {
                    String com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m108374x3cd6895c(intent, "feed_share_element_aid");
                    if (getTabChangeManager().mo96536b() instanceof AbstractC64149b) {
                        ((AbstractC64149b) getTabChangeManager().mo96536b()).mo103745a(com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                    } else if ((getTabChangeManager().mo96536b() instanceof C59014ae) && (bbVar = this.mScrollSwitchHelper) != null) {
                        bbVar.mo96582a(com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                    }
                }
                super.onActivityReenter(i, intent);
            }

            /* renamed from: com_ss_android_ugc_aweme_main_MainActivity_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
            public static Object m108372x3e72602f(AbstractActivityC59100h hVar, String str) {
                Object obj;
                MethodCollector.m26663i(6226);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!C58027i.f132247b && "connectivity".equals(str)) {
                        try {
                            new C21708b().mo35361a();
                            C58027i.f132247b = true;
                            obj = super.getSystemService((AbstractActivityC59100h) str);
                        } catch (Throwable unused) {
                        }
                    }
                    obj = super.getSystemService((AbstractActivityC59100h) str);
                } else if (C58027i.f132246a) {
                    synchronized (ClipboardManager.class) {
                        try {
                            obj = super.getSystemService((AbstractActivityC59100h) str);
                            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                try {
                                    Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                    declaredField.setAccessible(true);
                                    declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                                } catch (Exception e) {
                                    C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                                }
                            }
                            C58027i.f132246a = false;
                        } finally {
                            MethodCollector.m26664o(6226);
                        }
                    }
                } else {
                    obj = super.getSystemService((AbstractActivityC59100h) str);
                }
                return obj;
            }

            @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                AbstractC41570a g;
                List<AbstractC34466a> list = this.mActivityOnKeyDownListeners;
                if (list != null) {
                    for (AbstractC34466a aVar : list) {
                        if (aVar.onKeyDown(i, keyEvent)) {
                            return true;
                        }
                    }
                }
                if (i == 4) {
                    if (this.stateManager.mo89350b("page_discover")) {
                        ScrollSwitchStateManager scrollSwitchStateManager = this.stateManager;
                        C89219l.m154721d("page_discover", "");
                        scrollSwitchStateManager.mo89354d("page_discover");
                    }
                    Fragment b = getTabChangeManager().mo96536b();
                    if ((b != null && (b instanceof C61515c) && (g = ((C61515c) b).mo99172g()) != null && g.mo70779a()) || this.mScrollSwitchHelper.mo96583b()) {
                        return true;
                    }
                    if (getTabChangeManager().mo96536b() == null || !(getTabChangeManager().mo96536b() instanceof AbstractC64149b)) {
                        refreshWhenBack();
                        return super.onKeyDown(i, keyEvent);
                    }
                    refreshWhenBack();
                    return super.onKeyDown(i, keyEvent);
                } else if (i != 67) {
                    return false;
                } else {
                    return super.onKeyDown(i, keyEvent);
                }
            }

            @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
            public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                C80611a.m139766a(this, i, iArr);
                super.onRequestPermissionsResult(i, strArr, iArr);
            }

            @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
            public void onActivityResult(int i, int i2, Intent intent) {
                ScrollSwitchStateManager scrollSwitchStateManager;
                this.mUgCommonService.mo123095a(this, i, i2, intent);
                AbstractC34467b bVar = this.mActivityResultListener;
                if (bVar != null) {
                    bVar.mo60905a(i, i2, intent);
                }
                HomePageDataViewModel homePageDataViewModel = this.mActivityProxy.f121716a;
                if (homePageDataViewModel != null) {
                    homePageDataViewModel.mo89327b().setValue(new C89386u<>(Integer.valueOf(i), Integer.valueOf(i2), intent));
                }
                if (i == 1 && i2 == 2 && (scrollSwitchStateManager = this.mActivityProxy.f121718c) != null) {
                    scrollSwitchStateManager.mo89342a("page_profile", false);
                }
                if (!this.mComplianceBusinessActivityObserver.mo68113a(i, i2, intent)) {
                    super.onActivityResult(i, i2, intent);
                }
            }

            public void onPublishServiceConnected(AbstractC72630h hVar, Object obj, String str, C72678q qVar) {
                C58945a.C58947b.f134185a.f134176c = false;
                C58949c.f134187a = false;
                AbstractC81915c.m141875b(new C77379b(-1, null));
                IAVPublishService.OnPublishCallback onPublishCallback = this.processedCallback;
                if (onPublishCallback != null) {
                    onPublishCallback.onStartPublish(hVar);
                }
                AbstractC81915c.m141874a(new C71898d(true));
                if (!AVExternalServiceImpl.m113114a().publishService().isParallelPublishEnabled() || qVar.f162939l) {
                    AbstractC0952i supportFragmentManager = getSupportFragmentManager();
                    boolean isShoutoutPostDialog = AVExternalServiceImpl.m113114a().shoutOutsService().isShoutoutPostDialog(obj);
                    C73454ag agVar = new C73454ag();
                    agVar.f156475e = isShoutoutPostDialog;
                    Bundle bundle = new Bundle();
                    if (obj != null) {
                        if (obj instanceof Serializable) {
                            bundle.putSerializable("args", (Serializable) obj);
                        } else if (obj instanceof Parcelable) {
                            bundle.putParcelable("args", (Parcelable) obj);
                        }
                    }
                    agVar.f156473c = hVar;
                    agVar.setArguments(bundle);
                    if (!agVar.f156475e || (AVExternalServiceImpl.m113114a().shoutOutsService().getInMainTab() && AVExternalServiceImpl.m113114a().shoutOutsService().getInFollowingTab())) {
                        supportFragmentManager.mo3552a().mo3454a(R.id.e_w, agVar, "publish").mo3451a(R.anim.ds, R.anim.dt).mo3473c();
                    } else {
                        if (agVar.f156474d != null) {
                            agVar.f156474d.setVisibility(4);
                        }
                        supportFragmentManager.mo3552a().mo3454a(R.id.e_w, agVar, "publish").mo3451a(R.anim.ds, R.anim.dt).mo3473c();
                        agVar.requireFragmentManager().mo3552a().mo3471b(agVar).mo3473c();
                        if (agVar.f156474d != null) {
                            agVar.f156474d.setVisibility(0);
                        }
                    }
                    getSupportFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) new C63297m(this, hVar, this.processedCallback), false);
                    return;
                }
                AbstractC0952i supportFragmentManager2 = getSupportFragmentManager();
                C69908cb cbVar = (C69908cb) supportFragmentManager2.mo3551a("publish");
                if (cbVar == null) {
                    cbVar = new C69908cb();
                    C89219l.m154721d(supportFragmentManager2, "");
                    supportFragmentManager2.mo3552a().mo3454a(R.id.e_w, cbVar, "publish").mo3451a(R.anim.ds, R.anim.dt).mo3473c();
                } else {
                    cbVar.mo110319a();
                }
                hVar.mo101823a(new C63285l(cbVar, hVar, this.processedCallback, str, qVar));
            }
        }
