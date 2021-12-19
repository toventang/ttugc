package com.p2082ss.android.ugc.aweme.feed.p2944e;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.p051h.p052a.C0998a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.C12290b;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.monitor.collector.C21478d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.p1902j.p1903a.C24801b;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.BuildConfigAllServiceImpl;
import com.p2082ss.android.ugc.aweme.IUgAllService;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.UgAllServiceImpl;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36179e;
import com.p2082ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.IAdCardService;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37889c;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38150a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2604n.C38264b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38684bk;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38692bm;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42066d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42470r;
import com.p2082ss.android.ugc.aweme.experiment.C46704ao;
import com.p2082ss.android.ugc.aweme.experiment.C46748bt;
import com.p2082ss.android.ugc.aweme.experiment.C46799cp;
import com.p2082ss.android.ugc.aweme.experiment.C46825dd;
import com.p2082ss.android.ugc.aweme.experiment.C46832dk;
import com.p2082ss.android.ugc.aweme.experiment.C46923fb;
import com.p2082ss.android.ugc.aweme.experiment.C46965gb;
import com.p2082ss.android.ugc.aweme.feed.C48311ag;
import com.p2082ss.android.ugc.aweme.feed.C48318am;
import com.p2082ss.android.ugc.aweme.feed.C49291c;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48144ad;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import com.p2082ss.android.ugc.aweme.feed.background.C49286c;
import com.p2082ss.android.ugc.aweme.feed.background.ServiceConnectionC49285b;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.cache.C49319g;
import com.p2082ss.android.ugc.aweme.feed.cache.C49324h;
import com.p2082ss.android.ugc.aweme.feed.experiment.AbstractC49496ab;
import com.p2082ss.android.ugc.aweme.feed.experiment.AbstractC49506ah;
import com.p2082ss.android.ugc.aweme.feed.experiment.AbstractC49507ai;
import com.p2082ss.android.ugc.aweme.feed.experiment.AbstractC49508aj;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49493a;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49502ae;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49509b;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49510c;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49521m;
import com.p2082ss.android.ugc.aweme.feed.helper.C49615a;
import com.p2082ss.android.ugc.aweme.feed.helper.C49618d;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Audio;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.BitRate;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.TtsInfos;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.C48021a;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49418a;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49694v;
import com.p2082ss.android.ugc.aweme.feed.p2952k.C49717a;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import com.p2082ss.android.ugc.aweme.feed.p2963q.C49864az;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50458e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50459f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50461g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50525aa;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50542j;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.feed.param.MobParamProvider;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.C59092g;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59218am;
import com.p2082ss.android.ugc.aweme.metrics.C59220ao;
import com.p2082ss.android.ugc.aweme.metrics.C59224as;
import com.p2082ss.android.ugc.aweme.metrics.C59245j;
import com.p2082ss.android.ugc.aweme.metrics.p3438b.C59227a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.C33265g;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33205b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33206c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2294c.C33216b;
import com.p2082ss.android.ugc.aweme.p2340at.C33956a;
import com.p2082ss.android.ugc.aweme.p2397bm.C34888b;
import com.p2082ss.android.ugc.aweme.p2433ca.C35340a;
import com.p2082ss.android.ugc.aweme.p2433ca.C35345c;
import com.p2082ss.android.ugc.aweme.p2433ca.C35346d;
import com.p2082ss.android.ugc.aweme.p2433ca.C35355j;
import com.p2082ss.android.ugc.aweme.p2715cs.C40750c;
import com.p2082ss.android.ugc.aweme.p2715cs.C40755d;
import com.p2082ss.android.ugc.aweme.p2715cs.C40758f;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47965o;
import com.p2082ss.android.ugc.aweme.p3426m.C58975a;
import com.p2082ss.android.ugc.aweme.p3452ml.api.IMLCommonService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLCommonService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedAdUIService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedPreloadService;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadExperiment;
import com.p2082ss.android.ugc.aweme.player.C62890a;
import com.p2082ss.android.ugc.aweme.player.C62933c;
import com.p2082ss.android.ugc.aweme.player.C62956e;
import com.p2082ss.android.ugc.aweme.player.p3548a.C62893b;
import com.p2082ss.android.ugc.aweme.player.p3548a.C62900d;
import com.p2082ss.android.ugc.aweme.player.p3548a.C62904e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63031a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63052m;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import com.p2082ss.android.ugc.aweme.preinstall.C63307b;
import com.p2082ss.android.ugc.aweme.preinstall.brand.ITranssonicService;
import com.p2082ss.android.ugc.aweme.preload.p3564b.C63332a;
import com.p2082ss.android.ugc.aweme.profile.model.HotListStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.report.C67107d;
import com.p2082ss.android.ugc.aweme.report.EnumC67106c;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.C68124l;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71947n;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76599i;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80230ax;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.aweme.utils.C80444fq;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import com.p2082ss.android.ugc.aweme.utils.C80631v;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.aweme.utils.EnumC80443fp;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.C80665ad;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.C80775n;
import com.p2082ss.android.ugc.aweme.video.C80938q;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p2082ss.android.ugc.aweme.video.local.C80771f;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.aweme.video.p4209c.C80710a;
import com.p2082ss.android.ugc.aweme.video.p4209c.C80712b;
import com.p2082ss.android.ugc.aweme.video.p4209c.C80713c;
import com.p2082ss.android.ugc.aweme.video.p4210d.EnumC80719a;
import com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a;
import com.p2082ss.android.ugc.aweme.video.preload.C80923m;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.aweme.video.simplayer.p4227c.C80998a;
import com.p2082ss.android.ugc.aweme.video.simplayer.p4227c.C80999b;
import com.p2082ss.android.ugc.aweme.video.simpreloader.C81067m;
import com.p2082ss.android.ugc.aweme.video.util.C81077c;
import com.p2082ss.android.ugc.aweme.video.util.C81078d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.playerkit.model.C84227x;
import com.p2082ss.android.ugc.playerkit.p4323c.C84184b;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.session.C84230b;
import com.p2082ss.android.ugc.playerkit.session.Session;
import com.p2082ss.android.ugc.playerkit.videoview.p4328c.C84262a;
import com.p2082ss.android.ugc.trill.R;
import com.toutiao.proxyserver.C87383u;
import com.toutiao.proxyserver.p4495g.C87327a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4586g.AbstractC88922b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.e.o */
public class C49445o extends C49431d implements OnUIPlayListener {

    /* renamed from: Q */
    private static boolean f113626Q;

    /* renamed from: R */
    private static Pair<String, Boolean> f113627R;

    /* renamed from: A */
    protected boolean f113628A = true;

    /* renamed from: B */
    public int f113629B;

    /* renamed from: C */
    public File f113630C;

    /* renamed from: D */
    protected int f113631D;

    /* renamed from: E */
    protected String f113632E;

    /* renamed from: F */
    protected C49440m f113633F = new C49440m();

    /* renamed from: G */
    protected Map<String, C49478b> f113634G = new LinkedHashMap<String, C49478b>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C494747 */

        static {
            Covode.recordClassIndex(58287);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C49478b> entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: H */
    public C33206c f113635H;

    /* renamed from: I */
    public AbstractC49477a f113636I;

    /* renamed from: J */
    int f113637J = 0;

    /* renamed from: K */
    public String f113638K = "";

    /* renamed from: L */
    protected int f113639L = 0;

    /* renamed from: M */
    double f113640M = -0.5d;

    /* renamed from: N */
    int f113641N;

    /* renamed from: O */
    public AbstractC80747i f113642O;

    /* renamed from: P */
    public String f113643P = "";

    /* renamed from: S */
    private final WeakReference<AbstractC49849am> f113644S;

    /* renamed from: T */
    private KeyguardManager f113645T;

    /* renamed from: U */
    private boolean f113646U;

    /* renamed from: V */
    private long f113647V = -1;

    /* renamed from: W */
    private final Map<String, Long> f113648W;

    /* renamed from: X */
    private long f113649X = -1;

    /* renamed from: Y */
    private long f113650Y = -1;

    /* renamed from: Z */
    private long f113651Z = -1;

    /* renamed from: a */
    protected boolean f113652a;

    /* renamed from: aA */
    private final int f113653aA = 1024;

    /* renamed from: aB */
    private final double f113654aB = -0.5d;

    /* renamed from: aC */
    private boolean f113655aC = true;

    /* renamed from: aD */
    private boolean f113656aD = true;

    /* renamed from: aE */
    private double f113657aE;

    /* renamed from: aF */
    private boolean f113658aF = false;

    /* renamed from: aG */
    private String f113659aG;

    /* renamed from: aH */
    private long f113660aH = -1;

    /* renamed from: aI */
    private final LinkedHashMap<String, Double> f113661aI = new LinkedHashMap<String, Double>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4947031 */

        static {
            Covode.recordClassIndex(58283);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Double> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: aJ */
    private final LinkedHashMap<String, String> f113662aJ = new LinkedHashMap<String, String>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C494572 */

        static {
            Covode.recordClassIndex(58270);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            if (size() > 100) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: aK */
    private final LinkedHashMap<String, Long> f113663aK = new LinkedHashMap<String, Long>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C494683 */

        static {
            Covode.recordClassIndex(58281);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: aL */
    private final LinkedHashMap<String, Integer> f113664aL = new LinkedHashMap<String, Integer>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C494714 */

        static {
            Covode.recordClassIndex(58284);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: aM */
    private final LinkedHashMap<String, Long> f113665aM = new LinkedHashMap<String, Long>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C494725 */

        static {
            Covode.recordClassIndex(58285);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: aN */
    private long f113666aN;

    /* renamed from: aO */
    private int f113667aO;

    /* renamed from: aP */
    private int f113668aP;

    /* renamed from: aQ */
    private boolean f113669aQ;

    /* renamed from: aR */
    private final Map<String, String> f113670aR = new LinkedHashMap<String, String>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C494736 */

        static {
            Covode.recordClassIndex(58286);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            if (size() > 5) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: aS */
    private C37889c f113671aS;

    /* renamed from: aT */
    private final LinkedHashMap<String, List<Long>> f113672aT = new LinkedHashMap<String, List<Long>>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C494769 */

        static {
            Covode.recordClassIndex(58289);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<Long>> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: aU */
    private final ServiceConnectionC49285b f113673aU = new ServiceConnectionC49285b(this);

    /* renamed from: aV */
    private boolean f113674aV = false;

    /* renamed from: aW */
    private RunnableC49479c f113675aW;

    /* renamed from: aX */
    private String f113676aX;

    /* renamed from: aY */
    private boolean f113677aY;

    /* renamed from: aZ */
    private Set<String> f113678aZ;

    /* renamed from: aa */
    private boolean f113679aa;

    /* renamed from: ab */
    private LinkedHashMap<String, Boolean> f113680ab = new LinkedHashMap<String, Boolean>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C494461 */

        static {
            Covode.recordClassIndex(58259);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: ac */
    private LinkedHashMap<String, Boolean> f113681ac = new LinkedHashMap<String, Boolean>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4944912 */

        static {
            Covode.recordClassIndex(58262);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: ad */
    private LinkedHashMap<String, Boolean> f113682ad = new LinkedHashMap<String, Boolean>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4946123 */

        static {
            Covode.recordClassIndex(58274);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: ae */
    private LinkedHashMap<String, Long> f113683ae = new LinkedHashMap<String, Long>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4946426 */

        static {
            Covode.recordClassIndex(58277);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: af */
    private LinkedHashMap<String, Long> f113684af = new LinkedHashMap<String, Long>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4946527 */

        static {
            Covode.recordClassIndex(58278);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: ag */
    private LinkedHashMap<String, Long> f113685ag = new LinkedHashMap<String, Long>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4946628 */

        static {
            Covode.recordClassIndex(58279);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: ah */
    private long f113686ah = 0;

    /* renamed from: ai */
    private long f113687ai = 0;

    /* renamed from: aj */
    private long f113688aj = -1;

    /* renamed from: ak */
    private long f113689ak = -1;

    /* renamed from: al */
    private int f113690al = 0;

    /* renamed from: am */
    private int f113691am = 0;

    /* renamed from: an */
    private long f113692an = -1;

    /* renamed from: ao */
    private long f113693ao = 0;

    /* renamed from: ap */
    private boolean f113694ap;

    /* renamed from: aq */
    private boolean f113695aq;

    /* renamed from: ar */
    private long f113696ar = 0;

    /* renamed from: as */
    private long f113697as = 0;

    /* renamed from: at */
    private long f113698at = -1;

    /* renamed from: au */
    private int f113699au = 0;

    /* renamed from: av */
    private int f113700av = -10;

    /* renamed from: aw */
    private boolean f113701aw = false;

    /* renamed from: ax */
    private String f113702ax;

    /* renamed from: ay */
    private BroadcastReceiver f113703ay;

    /* renamed from: az */
    private AbstractC88922b f113704az;

    /* renamed from: ba */
    private boolean f113705ba = false;

    /* renamed from: bb */
    private boolean f113706bb = true;

    /* renamed from: bc */
    private volatile boolean f113707bc = false;

    /* renamed from: bd */
    private int f113708bd = -1;

    /* renamed from: be */
    private boolean f113709be;

    /* renamed from: bf */
    private int f113710bf = -1;

    /* renamed from: bg */
    private boolean f113711bg;

    /* renamed from: bh */
    private Aweme f113712bh = null;

    /* renamed from: bi */
    private String f113713bi = null;

    /* renamed from: bj */
    private Aweme f113714bj;

    /* renamed from: bk */
    private VideoUrlModel f113715bk;

    /* renamed from: bl */
    private C48311ag f113716bl;

    /* renamed from: bm */
    private Surface f113717bm;

    /* renamed from: k */
    public boolean f113718k;

    /* renamed from: l */
    protected boolean f113719l;

    /* renamed from: m */
    public LinkedHashMap<String, Boolean> f113720m = new LinkedHashMap<String, Boolean>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4946729 */

        static {
            Covode.recordClassIndex(58280);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: n */
    public LinkedHashMap<String, Boolean> f113721n = new LinkedHashMap<String, Boolean>() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4946930 */

        static {
            Covode.recordClassIndex(58282);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: o */
    public C49418a f113722o;

    /* renamed from: p */
    public int f113723p = 0;

    /* renamed from: q */
    protected String f113724q;

    /* renamed from: r */
    protected volatile boolean f113725r = false;

    /* renamed from: s */
    protected volatile boolean f113726s = false;

    /* renamed from: t */
    protected Aweme f113727t;

    /* renamed from: u */
    protected long f113728u;

    /* renamed from: v */
    public boolean f113729v;

    /* renamed from: w */
    public Aweme f113730w;

    /* renamed from: x */
    public boolean f113731x;

    /* renamed from: y */
    public String f113732y;

    /* renamed from: z */
    protected boolean f113733z = false;

    /* renamed from: com.ss.android.ugc.aweme.feed.e.o$a */
    public interface AbstractC49477a {
        static {
            Covode.recordClassIndex(58290);
        }
    }

    static {
        Covode.recordClassIndex(58258);
    }

    /* renamed from: D */
    public final void mo81165D() {
        this.f113652a = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81067a(Aweme aweme) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81068a(C84208l lVar, AbstractC48149ai aiVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81069a(C84215n nVar, AbstractC48149ai aiVar, String str, AbstractC49849am amVar, Aweme aweme, JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81070a(String str, AbstractC49849am amVar, Aweme aweme) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo81071a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo81072a(boolean z) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo81073g() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo81074k() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo81075l() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo81076m() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo81077n() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo81078o() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreParePlay(String str, C84215n nVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreRenderSessionMissed(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, C84216o oVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i, float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoSizeChanged(String str, int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo81079p() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: j */
    public final String mo81064j() {
        return this.f113601d;
    }

    /* renamed from: a */
    protected static boolean m92618a(AbstractC48147ag agVar) {
        return agVar.mo80228s() == 2;
    }

    /* renamed from: a */
    public final AbstractC48149ai mo81176a(String str) {
        AbstractC49849am s = mo81207s();
        if (s == null) {
            return null;
        }
        return s.mo81114k(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo81182a(Video video, AbstractC48149ai aiVar, C84215n nVar) {
        String str;
        JSONObject jSONObject;
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("netWorkQuality", C24801b.C24802a.f58850a.mo40614a().toString());
            jSONObject2.put("netWorkSpeed", (int) C24801b.C24802a.f58850a.mo40616b());
            jSONObject2.put("playUrl", C80361dw.m139334a(video.getProperPlayAddr()));
            jSONObject2.put("video_duration", video.getDuration());
            C81077c.m140769a(jSONObject2);
            if (this.f113630C == null) {
                this.f113630C = C80720e.m139915a(C80720e.m139914a(), "cache");
            }
            File file = this.f113630C;
            if (file == null) {
                str2 = "";
            } else {
                str2 = new C71947n("file", file.getPath() + "/" + C87327a.m151540a(video.getPlayAddr().getBitRatedRatioUri())).toString();
            }
            jSONObject2.put("file", str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C33830n.m69192a("type_log_play_succuss", "play_success", jSONObject2);
        C12290b.m22060a("aweme_media_error_rate", 0, jSONObject2);
        if (VideoBitRateABManager.f180314a.mo123829d()) {
            str = "aweme_media_bitrated_error_rate";
        } else {
            str = "aweme_media_original_error_rate";
        }
        C12290b.m22060a(str, 0, jSONObject2);
        if (C50539g.m94748c(aiVar)) {
            try {
                jSONObject = new JSONObject(jSONObject2.toString());
                jSONObject.put("aweme_id", aiVar.mo80206b().getAid());
                jSONObject.put("creative_id", aiVar.mo80206b().getAwemeRawAd().getCreativeId());
                if (C37699a.m76199B(aiVar.mo80206b())) {
                    jSONObject.put("is_topview", true);
                }
            } catch (Exception e2) {
                jSONObject = new JSONObject();
                e2.printStackTrace();
            }
            C12290b.m22060a("aweme_ad_media_play_error_rate", 0, jSONObject);
            if (C50539g.m94749d(aiVar)) {
                C38150a.m77331a(aiVar.mo80206b(), 1, 0);
            }
        }
        if (!C50539g.m94749d(aiVar) || nVar == null) {
            return null;
        }
        if (nVar.f188113c / 1000 > 60 || nVar.f188113c / 1000 < 7) {
            C38150a.m77331a(aiVar.mo80206b(), 4, 1);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("alarm_reason", "duration_alarm");
                if (aiVar.mo80206b() != null) {
                    jSONObject3.put("group_id", aiVar.mo80206b().getAid());
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            C39162r.onEvent(MobClick.obtain().setEventName("ad_alarm").setLabelName("homepage_hot").setJsonObject(jSONObject3));
            return null;
        }
        C38150a.m77331a(aiVar.mo80206b(), 4, 0);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b0, code lost:
        if (r3 != null) goto L_0x0033;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m92612a(com.p2082ss.android.ugc.playerkit.model.C84215n r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.m92612a(com.ss.android.ugc.playerkit.model.n, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo81188a(final Video video, final boolean z) {
        if (video != null) {
            C29339a.m58752a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.RunnableC4945013 */

                static {
                    Covode.recordClassIndex(58263);
                }

                public final void run() {
                    String str;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playUrl", C80361dw.m139334a(video.getPlayAddrBytevc1()));
                        C81077c.m140769a(jSONObject);
                        if (C49445o.this.f113630C == null) {
                            C49445o.this.f113630C = C80720e.m139915a(C80720e.m139914a(), "cache");
                        }
                        File file = C49445o.this.f113630C;
                        if (file == null) {
                            str = "";
                        } else {
                            str = new C71947n("file", file.getPath() + "/" + C87327a.m151540a(video.getProperPlayAddr().getUri())).toString();
                        }
                        jSONObject.put("file", str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    C12290b.m22060a("aweme_media_bytevc1_error_rate", !z ? 1 : 0, jSONObject);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81194a(String str, int i, Aweme aweme) {
        System.currentTimeMillis();
        C49291c.m92330a(this.f113601d, this.f113602e, str, i, aweme, aweme == null ? mo81210v() : aweme.getRequestId());
        if (TextUtils.equals("from_follow_often_watch", mo81061f())) {
            C49291c.m92329a(this.f113602e, str, i);
        }
        System.currentTimeMillis();
    }

    /* renamed from: a */
    protected static boolean m92620a(AbstractC48149ai aiVar, String str) {
        return m92648h(aiVar) && C13627m.m24499a(aiVar.mo80206b().getAid(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81201b(C84208l lVar, AbstractC48149ai aiVar) {
        if (lVar != null && aiVar != null && aiVar.mo80206b() != null && aiVar.mo80206b().getVideo() != null) {
            Aweme b = aiVar.mo80206b();
            Video video = aiVar.mo80206b().getVideo();
            String c = mo81204c(this.f113632E);
            JSONObject jSONObject = new JSONObject();
            boolean c2 = C49301e.m92370c(aiVar.mo80206b().getAid());
            try {
                jSONObject.put("error_code", String.valueOf(lVar.f188035d));
                jSONObject.put("error_internal_code", String.valueOf(lVar.f188036e));
                jSONObject.put("error_info", String.valueOf(lVar.f188037f));
                jSONObject.put("group_id", aiVar.mo80206b().getAid());
                jSONObject.put("video_id", C84184b.f187863b);
                int i = 1;
                jSONObject.put("is_bytevc1", String.valueOf(lVar.f188033b ? 1 : 0));
                jSONObject.put("is_dash", String.valueOf(lVar.f188034c ? 1 : 0));
                jSONObject.put("is_ad", String.valueOf(C37699a.m76314s(b) ? 1 : 0));
                jSONObject.put("is_splash", String.valueOf(C37699a.m76204G(b) ? 1 : 0));
                jSONObject.put("internet_speed", String.valueOf(C84116g.m144637f()));
                jSONObject.put("cache_size", String.valueOf(C80662ac.m139893c(video.getPlayAddr())));
                jSONObject.put("video_size", String.valueOf(C80662ac.m139896d(video.getPlayAddr())));
                jSONObject.put("play_url", video.getPlayAddr() == null ? "null" : video.getPlayAddr().toString());
                jSONObject.put("player_type", mo81174M().mo123877a().toString());
                jSONObject.put("is_from_feed_cache", String.valueOf(c2 ? 1 : 0));
                if (!C49286c.m92321a()) {
                    i = 0;
                }
                jSONObject.put("is_audio_mode", String.valueOf(i));
                jSONObject.put("has_tts", C50532ah.m94733i(b));
                jSONObject.put("has_cla", C50532ah.m94732h(b));
                jSONObject.put("play_sess", c);
                jSONObject.put("eco", String.valueOf(C68124l.m120414d()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f113633F.f113624b.remove(this.f113632E);
            C34888b.m71266b("video_play_failed", jSONObject);
            C39162r.m79461a("video_play_failed", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", String.valueOf(lVar.f188035d));
                jSONObject2.put("error_internal_code", String.valueOf(lVar.f188036e));
                jSONObject2.put("internet_speed", String.valueOf(C84116g.m144637f()));
                C49444n.m92595a("error", jSONObject2.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81190a(C71904j jVar) {
        AbstractC49849am s = mo81207s();
        jVar.f161108e = (s == null || !s.mo70440F()) ? 1 : 2;
        AbstractC81915c.m141874a(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo81179a(long j, long j2, boolean z, AbstractC48149ai aiVar, int i, String str, String str2, AbstractC49849am amVar, String str3) {
        int i2;
        C39163s a = new C39163s().mo67941a("request_id", mo81209u().optString("request_id"));
        long j3 = 0;
        if (j > 0) {
            j3 = j2 - j;
        }
        C39163s a2 = a.mo67941a("duration", Long.toString(j3));
        if (z) {
            i2 = -1;
        } else {
            i2 = C59227a.f135144a ? 1 : 0;
        }
        C39163s a3 = a2.mo67941a("is_first", String.valueOf(i2)).mo67941a("group_id", aiVar.mo80206b().getAid()).mo67941a("vduration", String.valueOf(i)).mo67941a("is_from_feed_cache", String.valueOf(z ? 1 : 0));
        Context a4 = C17867d.m33078a();
        if (TextUtils.isEmpty(C58029j.f132250b) || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132250b = C13624l.m24489e(a4);
        }
        JSONObject a5 = a3.mo67941a("access", C58029j.f132250b).mo67941a("top_activity", str).mo67941a("feed_tab", str2).mo67941a("is_ad", String.valueOf(C37699a.m76314s(aiVar.mo80206b()) ? 1 : 0)).mo67941a("is_splash", String.valueOf(C37699a.m76204G(aiVar.mo80206b()) ? 1 : 0)).mo67941a("is_audio_mode", String.valueOf(C49286c.m92321a() ? 1 : 0)).mo67941a("enter_from", amVar != null ? amVar.mo81096g(true) : "").mo67942a();
        try {
            a5.put("has_tts", C50532ah.m94733i(aiVar.mo80206b())).put("has_cla", C50532ah.m94732h(aiVar.mo80206b())).put("preloader_type", C80695q.m139909b());
            a5.put("play_sess", str3);
        } catch (Exception e) {
            C13468b.m24210a(e);
        }
        C39162r.onEvent(MobClick.obtain().setEventName("video_request").setLabelName("perf_monitor").setValue(aiVar.mo80206b().getAid()).setJsonObject(a5));
        C39162r.m79461a("video_request", a5);
        C59227a.m108848a("video_request", a5);
        C34888b.m71266b("video_request", a5);
        return null;
    }

    /* renamed from: a */
    private boolean m92621a(User user) {
        if (this.f113678aZ == null) {
            this.f113678aZ = new HashSet();
        }
        if (this.f113678aZ.contains(user.getUid())) {
            return true;
        }
        this.f113678aZ.add(user.getUid());
        return false;
    }

    /* renamed from: a */
    private void m92617a(boolean z, boolean z2) {
        if (this.f113719l) {
            AbstractC48149ai w = mo81211w();
            if (C50539g.m94752e(w)) {
                this.f113695aq = z;
                if (z) {
                    this.f113691am++;
                    if (this.f113692an == -1) {
                        this.f113692an = SystemClock.elapsedRealtime();
                    }
                } else if (this.f113692an != -1) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.f113692an;
                    this.f113693ao += elapsedRealtime;
                    this.f113692an = -1;
                    if (!z2 && elapsedRealtime >= ((long) C16048b.m29633a().mo25412a(true, "video_buffering_threshold", 0))) {
                        m92613a(m92630c(w), w, elapsedRealtime, "resume", false);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m92616a(String str, boolean z, boolean z2) {
        if (z) {
            if (!m92651j(str)) {
                m92636d(str, true);
            } else {
                m92636d(str, false);
            }
        }
        m92651j(str);
        m92650i(str);
        if (!z) {
            Long.valueOf(m92638e(str));
        }
        if (m92651j(str)) {
            if (!z && m92650i(str) && C62933c.m113355h()) {
                m92645g(str);
                m92631c(str, m92645g(str));
            }
            final AbstractC49849am s = mo81207s();
            AbstractC48149ai w = mo81211w();
            if (C50539g.m94752e(w)) {
                int i = AbstractC49507ai.f113870a;
                int i2 = C62933c.m113355h() ? AbstractC49506ah.f113869a : 0;
                if (z) {
                    m92635d(str, SystemClock.elapsedRealtime());
                    this.f113690al++;
                    if (m92638e(str) == -1) {
                        SystemClock.elapsedRealtime();
                        m92631c(str, SystemClock.elapsedRealtime());
                    }
                    m92597P();
                    this.f113704az = (AbstractC88922b) AbstractC88979t.m154307b((long) i2, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143288c(new AbstractC88922b<Long>() {
                        /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4945215 */

                        static {
                            Covode.recordClassIndex(58265);
                        }

                        @Override // p4560f.p4561a.AbstractC88986z
                        public final void onError(Throwable th) {
                        }

                        @Override // p4560f.p4561a.AbstractC88986z
                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                        }

                        @Override // p4560f.p4561a.AbstractC88986z
                        public final void onComplete() {
                            AbstractC49849am amVar = s;
                            if (amVar != null) {
                                amVar.mo81103av();
                            }
                        }
                    });
                    if (w.mo80225p().mo80100N() != null) {
                        w.mo80225p().mo80100N().mo123873b(this.f113690al);
                    }
                } else {
                    if (m92638e(str) != -1) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - m92638e(str);
                        this.f113686ah += elapsedRealtime;
                        if (!z2 && elapsedRealtime >= ((long) i)) {
                            m92614a(str, w, elapsedRealtime, "resume", true, m92650i(str));
                            m92631c(str, -1);
                        }
                        if (w.mo80225p().mo80100N() != null) {
                            w.mo80225p().mo80100N().mo123871a(this.f113686ah);
                        }
                    }
                    if (!z2) {
                        m92635d(str, 0);
                        m92632c(str, false);
                        m92636d(str, false);
                    }
                    m92597P();
                    if (s != null) {
                        s.mo81101at();
                    }
                }
                mo81190a(new C71904j(z));
                C81067m.C81070a.m140763a().mo124530c(str);
            }
        }
    }

    /* renamed from: a */
    private void m92613a(String str, AbstractC48149ai aiVar, long j, String str2, boolean z) {
        m92614a(str, aiVar, j, str2, z, m92650i(str));
    }

    /* renamed from: a */
    private void m92614a(String str, AbstractC48149ai aiVar, long j, String str2, boolean z, boolean z2) {
        C1731i.m5640b(new CallableC49425aa(this, aiVar, str, j, str2, z, z2), C39162r.m79452a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo81180a(AbstractC48149ai aiVar, String str, long j, String str2, boolean z, boolean z2) {
        String str3;
        VideoUrlModel playAddr;
        C80923m j2;
        Aweme b = aiVar.mo80206b();
        JSONObject b2 = m92625b(str, aiVar, j, str2, z, z2);
        b2.put("has_tts", C50532ah.m94733i(b));
        b2.put("has_cla", C50532ah.m94732h(b));
        String str4 = "video_block";
        C34888b.m71266b(z ? str4 : "video_decoder_block", b2);
        if (z) {
            if (!(aiVar.mo80206b() == null || aiVar.mo80206b().getVideo() == null || (playAddr = aiVar.mo80206b().getVideo().getPlayAddr()) == null || (j2 = C80937s.m140453b().mo124090j(C80942a.m140478a(playAddr))) == null)) {
                try {
                    b2.put("video_cache_read_time", (double) ((((float) j2.f180919a) * 1.0f) / ((float) j2.f180921c)));
                    b2.put("video_cache_read_size", (double) ((((float) j2.f180920b) * 1.0f) / ((float) j2.f180921c)));
                    b2.put("video_cache_read_cnt", j2.f180921c);
                    b2.put("video_cache_use_ttnet", C87383u.f198092l);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            b2.put("eco", C68124l.m120414d());
            str3 = "aweme_block_bitrate_netspeed_log";
        } else {
            str3 = "aweme_block_decoder_log";
        }
        C33830n.m70668a(str3, b2);
        if (!z) {
            str4 = "video_decoder_block";
        }
        C39162r.m79461a(str4, b2);
        if (z) {
            ((ITranssonicService) C63307b.f143691a.getValue()).onVideoPlayBlock();
        }
        C89219l.m154721d("block", "");
        IRuntimeBehaviorService c = RuntimeBehaviorServiceImpl.m94812c();
        if (c == null) {
            return null;
        }
        c.mo85865a("block");
        return null;
    }

    /* renamed from: a */
    private void m92615a(String str, AbstractC48149ai aiVar, Aweme aweme, VideoUrlModel videoUrlModel, C84216o oVar, Long l, long j, int i) {
        boolean z;
        AbstractC48149ai bg;
        AbstractC49849am s = mo81207s();
        if (aiVar != null && aweme != null) {
            C49478b bVar = this.f113634G.get(str);
            int i2 = bVar != null ? bVar.f113786b : -1;
            PreloadSessionManager.PreloadSession b = PreloadSessionManager.f180657a.mo124004b(str);
            int f = (b == null || this.f113667aO <= 0) ? C84116g.m144637f() : b.speed;
            C62900d.C62902a aVar = new C62900d.C62902a();
            C49618d R = aiVar.mo80103R();
            if (R != null) {
                aVar.mo100884a(R);
            }
            String c = mo81204c(str);
            Pair<String, Boolean> pair = f113627R;
            int i3 = 0;
            if (pair == null || !TextUtils.equals(str, (CharSequence) pair.first) || ((Boolean) f113627R.second).booleanValue()) {
                z = false;
            } else {
                f113627R = new Pair<>(str, true);
                z = true;
            }
            if (C76706a.m134278d(aweme) && (bg = s.mo84754bg()) != null) {
                C49864az.m93575a(aVar, bg.mo80206b(), aweme);
            }
            long j2 = this.f113660aH;
            boolean z2 = (j2 == -1 || j2 == oVar.getTid()) ? false : true;
            this.f113660aH = oVar.getTid();
            AbstractC80747i M = mo81174M();
            int N = M.mo123920N();
            int M2 = M.mo123919M();
            C62900d.C62902a a = aVar.mo100885a(aweme).mo100886a(videoUrlModel).mo100889a(oVar).mo100882a(mo81059d()).mo100887a(s).mo100883a((AbstractC49436i) s).mo100888a(m92646g(aiVar)).mo100903g(this.f113602e).mo100890a(String.valueOf(l)).mo100881a(j).mo100893b(this.f113667aO).mo100896c(this.f113668aP).mo100879a().mo100901e(f).mo100902f(i).mo100904h(oVar.getAccertSessionPrepareType()).mo100892a(z);
            if (!aiVar.mo80104S() && C62933c.m113350c()) {
                i3 = 1;
            }
            a.mo100899d(i3).mo100880a(i2).mo100891a("play_sess", c).mo100895b(oVar.getRenderDisplayed()).mo100898c(z2).mo100908l(M2).mo100909m(N).mo100900d(C49286c.m92321a()).f142773a.mo100876a();
        }
    }

    /* renamed from: a */
    public final void mo81189a(VideoUrlModel videoUrlModel) {
        float i = mo81174M().mo123886i();
        Integer a = C50542j.m94756a(videoUrlModel);
        if (a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("play_bitrate", (double) i);
                jSONObject.put("bitrate", a);
                jSONObject.put("bitrate_delta", (double) (((float) a.intValue()) - i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C33830n.m69192a("http_hijack_info_v2", "http_hijack_info_v2", jSONObject);
        }
        if (AbstractC49496ab.f113855a && a != null && a.intValue() > 0 && ((float) a.intValue()) - i > ((float) AbstractC49508aj.f113871a)) {
            C80938q.m140454a();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("play_bitrate", (double) i);
                jSONObject2.put("hit_bitrate", a);
                jSONObject2.put("is_hijack", 1);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            C33830n.m70668a("http_hijack_info", jSONObject2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo81183a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r13, int r14) {
        /*
        // Method dump skipped, instructions count: 600
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.mo81183a(com.ss.android.ugc.aweme.feed.model.Aweme, int):java.lang.String");
    }

    /* renamed from: a */
    private static boolean m92619a(AbstractC48149ai aiVar, Aweme aweme) {
        return m92648h(aiVar) && aiVar.mo80206b() == aweme;
    }

    /* renamed from: a */
    public final String mo81184a(Aweme aweme, boolean z, AbstractC48149ai aiVar) {
        Video video;
        boolean z2;
        int i;
        AbstractC49849am s = mo81207s();
        if (s != null) {
            s.mo81090ao();
        }
        AbstractC48149ai w = aiVar == null ? mo81211w() : aiVar;
        if (C37699a.m76251aW(aweme)) {
            if (w == null) {
                return "27";
            }
            m92610a(aweme, w.mo80229t());
            return "27";
        } else if (C76706a.m134279e(aweme)) {
            mo81167F();
            w.mo80107V();
            return "";
        } else if (w == null) {
            return "12";
        } else {
            if (!C80771f.f180597a) {
                C34729o.m70955a(w.mo80225p().mo80234y(), 0);
            }
            if ((!m92619a(w, aweme) || (!w.mo80225p().mo80232w() && !C80771f.f180597a)) && !C49286c.m92321a()) {
                return "22";
            }
            C1731i.m5640b(CallableC49485s.f113796a, C40780g.m82246c());
            Audio audio = null;
            if (C37699a.m76277aw(aweme)) {
                video = mo81206r().mo65995a();
            } else {
                video = w.mo80206b().getVideo();
                audio = w.mo80206b().getAudio();
            }
            if (m92618a(w.mo80225p()) && mo81077n()) {
                m92626b(w, aweme);
                mo81196a(m92630c(w), false);
                return "14";
            } else if (C58956a.m108315a(aweme)) {
                new C79459a(mo81059d()).mo123052a(C58956a.m108314a(aweme, R.string.h8k)).mo123053a();
                return "15";
            } else if (m92629b(aweme)) {
                new C79459a(mo81059d()).mo123050a(R.string.h6z).mo123053a();
                return "16";
            } else if (video == null) {
                return "17";
            } else {
                if (video.getProperPlayAddr() == null) {
                    return "18";
                }
                if (!aweme.isLive() && !aweme.isCanPlay()) {
                    return "19";
                }
                mo81174M();
                AbstractC80747i M = mo81174M();
                M.mo123934a(w.mo80225p().mo80233x());
                aweme.getDesc();
                w.mo80225p().mo80233x();
                if (C37699a.m76277aw(aweme)) {
                    video.setRationAndSourceId(mo81206r().mo65996b());
                } else {
                    video.setRationAndSourceId(m92630c(w));
                }
                if (w.mo80229t() != null) {
                    w.mo80229t().mo65933F();
                }
                if (!m92633c(aweme) || !mo81077n()) {
                    return "21";
                }
                M.mo123937a(mo81172K());
                if (aiVar == null || aiVar.mo70617e() == null || !aiVar.mo70617e().f111961a) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C80710a aVar = new C80710a();
                aVar.f180445f = z2;
                aVar.f180442c = z;
                AbstractC37879bc t = w.mo80229t();
                AbstractC33200b S = m92600S();
                if (S == null || !S.mo59128a(aweme, 0)) {
                    i = 0;
                } else {
                    int a = (int) S.mo59124a();
                    if (a >= 0) {
                        m92610a(aweme, t);
                        S.mo59126a(true);
                        AbstractC33200b.f78894b = false;
                        C38264b.f90432b.mo66030a();
                        i = a;
                    } else {
                        i = 0;
                    }
                    C89219l.m154721d("getContinuousPlayTime, pausePositon:".concat(String.valueOf(a)), "");
                }
                C50525aa.m94712c("tryPlay", M.mo123930a(new C80712b(video, audio, EnumC80719a.SuperHigh, i, aVar, C81078d.m140772a(video, w.mo80108W()), w.mo80108W())));
                if (mo81075l()) {
                    mo81186a(aweme, M, true);
                }
                mo81196a(m92630c(w), false);
                return "20";
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81186a(Aweme aweme, AbstractC80747i iVar, boolean z) {
        if (m92644f(aweme)) {
            iVar.mo123912F();
        } else if (aweme == null || aweme.getStatus() == null || aweme.getStatus().getVideoMuteInfo() == null) {
            iVar.mo123913G();
        } else {
            if (aweme.getStatus().getVideoMuteInfo().isMute()) {
                iVar.mo123912F();
            } else {
                iVar.mo123913G();
            }
            if (z && !TextUtils.isEmpty(aweme.getStatus().getVideoMuteInfo().getMuteDesc())) {
                new C79459a(mo81059d()).mo123052a(aweme.getStatus().getVideoMuteInfo().getMuteDesc()).mo123053a();
            }
        }
    }

    /* renamed from: a */
    public final void mo81197a(String str, boolean z, AbstractC48149ai aiVar) {
        m92601T();
        long H = mo81169H();
        if (aiVar == null) {
            aiVar = mo81211w();
        }
        if (C50539g.m94752e(aiVar)) {
            IAdSceneService f = AdSceneServiceImpl.m33210f();
            if (f != null && !this.f113658aF) {
                if (!z || this.f113727t == null) {
                    f.mo28466c().mo28507a(m92605a(mo81211w()), mo81059d(), this.f113727t, str, H, this.f113723p + 1, C33265g.m68195a());
                } else {
                    AbstractC17897a c = f.mo28466c();
                    Aweme a = m92605a(mo81211w());
                    Context d = mo81059d();
                    Aweme aweme = this.f113727t;
                    c.mo28507a(a, d, aweme, aweme.getAid(), H, this.f113723p + 1, C33265g.m68195a());
                }
            }
            Aweme aweme2 = this.f113727t;
            if (aweme2 != null && aweme2.isAd()) {
                this.f113727t.getAwemeRawAd().setReshowAd(true);
            }
            this.f113727t = m92605a(aiVar);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81195a(java.lang.String r44, long r45) {
        /*
        // Method dump skipped, instructions count: 691
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.mo81195a(java.lang.String, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo81181a(Aweme aweme, String str, String str2, AbstractC49849am amVar, AbstractC48149ai aiVar, long j, String str3, String str4, String str5, double d, String str6, AbstractC80747i iVar, String str7, String str8, String str9, String str10, String str11, String str12) {
        String str13;
        String str14;
        if (C49286c.m92321a()) {
            return null;
        }
        JSONObject u = mo81209u();
        try {
            u.put("author_id", C59208ac.m108758a(aweme));
            u.put("detail", m92603V() ? 1 : 0);
            u.put("content_source", str);
            if (!TextUtils.isEmpty(str2)) {
                u.put("enter_method", str2);
            }
            C49812b as = amVar.mo81094as();
            if (!TextUtils.isEmpty(as.getCarrierType())) {
                u.put("carrier_type", amVar.mo81094as().getCarrierType());
            }
            if (!TextUtils.isEmpty(as.getFromGroupId())) {
                u.put("from_group_id", amVar.mo81094as().getFromGroupId());
            }
            if (!TextUtils.isEmpty(as.getReferCommodityId())) {
                u.put("refer_commodity_id", amVar.mo81094as().getReferCommodityId());
            }
            if (!TextUtils.isEmpty(as.getDataType())) {
                u.put("data_type", amVar.mo81094as().getDataType());
            }
            if (!TextUtils.isEmpty(as.getSpecialTopicRegion())) {
                u.put("region", amVar.mo81094as().getSpecialTopicRegion());
            }
            u.put("is_highlighted", aweme.isHighlighted());
            u.put("rank_index", aweme.getOriginalPos());
            u.put("has_tts", C50532ah.m94733i(aweme));
            u.put("has_cla", C50532ah.m94732h(aweme));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (C50539g.m94748c(aiVar)) {
            C39162r.onEvent(MobClick.obtain().setEventName("ad_play_time").setValue(String.valueOf(j)).setExtValueString(C59208ac.m108771e(aweme)).setJsonObject(new C33743c().mo59976a("request_id", mo81209u().optString("request_id")).mo59976a("is_photo", C59208ac.m108772f(aweme)).mo59977a()));
        }
        C49291c.f113297a = String.valueOf(j);
        HotListStruct hotListStruct = aweme.getHotListStruct();
        if (hotListStruct == null || hotListStruct.getTitile() == null || hotListStruct.getType() != 2) {
            C49291c.f113298b = "";
        } else {
            C49291c.f113298b = hotListStruct.getTitile();
        }
        mo81059d();
        C39162r.m79456a("play_time", this.f113601d, str3, j, u);
        boolean z = aweme.getBottomBarModel() != null;
        if (aweme.getMusic() != null) {
            str13 = String.valueOf(aweme.getMusic().getId());
        } else {
            str13 = "";
        }
        C49812b as2 = amVar.mo81094as();
        C59224as a = new C59224as().mo96778a(this.f113601d);
        a.f135103ah = this.f113603f;
        a.f135139u = str4;
        a.f135140v = str5;
        a.f135066X = z;
        C59224as f = ((C59224as) a.mo96799a(Boolean.valueOf(C50545m.m94765b(aweme)))).mo96749g(aweme);
        f.f135069a = j;
        f.f135138t = d;
        C59224as asVar = (C59224as) f.mo96801c(str6);
        asVar.f135102ag = amVar.mo81084ai();
        asVar.f135131c = iVar.mo123877a().toString();
        asVar.f135132d = C59208ac.m108759a(aweme, this.f113602e);
        C59224as a2 = asVar.mo96777a(iVar.mo123885h());
        a2.f135136r = str7;
        a2.f135137s = str8;
        a2.f135135q = str9;
        C59224as asVar2 = (C59224as) a2.mo96802d(C59208ac.m108764b(aweme, this.f113602e));
        asVar2.f135134p = str;
        asVar2.f135105aj = str10;
        asVar2.f135106ak = str11;
        asVar2.f135068Z = aweme.isHighlighted();
        asVar2.f135067Y = aweme.getOriginalPos();
        asVar2.f135110ao = str12;
        asVar2.f135111ap = str13;
        asVar2.f135114as = as2.getPlaylistSearchId();
        asVar2.f135113ar = as2.getIsFromVideo();
        asVar2.f135112aq = as2.getCategoryName();
        asVar2.f135115at = this.f113601d;
        asVar2.f135116au = as2.getLastGroupId();
        asVar2.f135117av = as2.getPlaylistPreviousPage();
        asVar2.f135118aw = as2.getEnterPlaylistGroupId();
        String str15 = "1";
        asVar2.f135119ax = C50532ah.m94735k(aweme) ? str15 : "0";
        if (C50532ah.m94734j(aweme)) {
            str14 = str15;
        } else {
            str14 = "0";
        }
        asVar2.f135120ay = str14;
        asVar2.f135071aB = as2.getIsFromPlaylist();
        asVar2.f135070aA = aweme.getCaptionReturnCount();
        asVar2.f135121az = aweme.getCaptionLength();
        if (as2.extra != null) {
            HashMap<String, String> hashMap = as2.extra;
            if (hashMap.containsKey("token_type")) {
                asVar2.mo96786a("token_type", hashMap.get("token_type"));
            }
        }
        if (!TextUtils.isEmpty(as2.getNewsId())) {
            asVar2.mo96754m(as2.getNewsId());
        }
        if (m92622a(this.f113601d, str6)) {
            if (!aweme.isTop()) {
                str15 = "0";
            }
            asVar2.mo96803e(str15);
        }
        if (C76706a.m134278d(aweme)) {
            AbstractC59233c unused = C76598h.m134180a(asVar2, C77260g.f173332a.mo120157e().mo120171a(aweme.getAuthorUid()), aweme, C76599i.m134188a(as2), null, null);
        }
        if (this.f113604g != null) {
            asVar2.f135133e = this.f113604g;
        }
        asVar2.mo96788a(C50560y.m94792b(str4, as2.getFromGroupId()));
        String.valueOf(j);
        if (this.f113636I != null) {
            aweme.getAid();
        }
        String O = amVar.mo70448O();
        if (!TextUtils.isEmpty(O)) {
            try {
                JSONObject jSONObject = new JSONObject(O);
                if (jSONObject.has("supplier_id")) {
                    asVar2.mo96786a("supplier_id", jSONObject.getString("supplier_id"));
                }
                if (jSONObject.has("product_id")) {
                    asVar2.mo96786a("product_id", jSONObject.getString("product_id"));
                }
                if (jSONObject.has("previous_page")) {
                    asVar2.mo96786a("previous_page", jSONObject.getString("previous_page"));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        asVar2.f135096aa = as2.getCarrierType();
        asVar2.f135097ab = as2.getReferSeedId();
        asVar2.f135098ac = as2.getReferSeedName();
        asVar2.f135099ad = as2.getFromGroupId();
        asVar2.f135101af = as2.getReferCommodityId();
        asVar2.f135100ae = as2.getDataType();
        asVar2.mo96780o(as2.getCreationId());
        asVar2.mo96807i(as2.getListItemId());
        asVar2.mo96805g(as2.getListResultType());
        asVar2.mo96809j(as2.getSearchThirdItemId());
        asVar2.f135107al = as2.getmImprId();
        asVar2.mo96810l(as2.getSearchId());
        asVar2.f135104ai = as2.getSpecialTopicRegion();
        Context d2 = mo81059d();
        C89219l.m154721d(d2, "");
        new C59245j(MobParamProvider.C49810a.m93272a(d2).f114584a).installToMetrics(asVar2);
        asVar2.f135108am = as2.getFeedGroupIdForMixVideo();
        String e3 = TextUtils.isEmpty(as2.getVsResultId()) ? C59208ac.m108771e(aweme) : as2.getVsResultId();
        asVar2.mo96810l(as2.getSearchId());
        asVar2.f135216P = as2.getVsEnterFrom();
        asVar2.f135217Q = as2.getVsEntranceType();
        asVar2.f135218R = as2.getVsSessionId();
        asVar2.f135219S = e3;
        asVar2.f135220T = as2.getVsGroupId();
        String searchResultId = as2.getSearchResultId();
        if (!TextUtils.isEmpty(as2.getCidFromSearch())) {
            searchResultId = as2.getCidFromSearch();
        } else if (asVar2.mo96808i()) {
            searchResultId = C59208ac.m108771e(aweme);
        } else if (TextUtils.equals(this.f113601d, "general_search") && TextUtils.isEmpty(searchResultId)) {
            searchResultId = C59208ac.m108771e(aweme);
        }
        asVar2.mo96804f(searchResultId);
        asVar2.f135109an = as2.getSearchType();
        if (!TextUtils.isEmpty(str2)) {
            asVar2.f135133e = str2;
        }
        asVar2.mo96788a(C80632w.m139800a(aweme, "play_time", this.f113601d));
        if (!(C63134c.f143478d == null || C63134c.m114157a() == null)) {
            asVar2.mo96788a(C63134c.m114157a().mo101451a(as2.getPagePoiId(), aweme));
        }
        C79900c.m138667a(asVar2, aweme, this.f113601d);
        asVar2.mo96792f();
        String ah = amVar.mo81083ah();
        if (this.f113601d.equals("playlist")) {
            ah = as2.getPlaylistPreviousPage();
        }
        if (!TextUtils.equals(ah, "search_result") && !TextUtils.equals(ah, "general_search")) {
            return null;
        }
        SearchResultStatisticsImpl.m104992a().mo71657a(new C42470r("search_play_time", aweme, this.f113601d, j, TextUtils.equals(ah, "search_result"), ah, str5, as2.getPlaylistOffset() + ((long) amVar.mo81113g(aweme))));
        return null;
    }

    /* renamed from: a */
    public final void mo81187a(Aweme aweme, boolean z, boolean z2) {
        AbstractC49849am s = mo81207s();
        AbstractC48149ai w = mo81211w();
        if (C58956a.m108315a(aweme)) {
            new C79459a(mo81059d()).mo123052a(C58956a.m108314a(aweme, R.string.h8k)).mo123053a();
            return;
        }
        boolean z3 = false;
        if (w instanceof AbstractC48144ad) {
            if (((AbstractC48144ad) w).mo80074o()) {
                if (s != null) {
                    s.mo81102au();
                } else {
                    C51423a.m95786a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                }
            } else if (!z) {
            } else {
                if (s != null) {
                    s.mo81104aw();
                } else {
                    C51423a.m95786a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                }
            }
        } else if (w != null && w.mo80206b() == aweme && !m92629b(aweme)) {
            UgAllServiceImpl.m65444c();
            if (aweme == null) {
                return;
            }
            if (aweme.getVideo() != null || aweme.isLive()) {
                int i = this.f113722o.f113577a;
                C51423a.m95791b(3, "PlayerController", "current play status:".concat(String.valueOf(i)));
                if (i == 2 || (C49286c.m92321a() && i == 1)) {
                    if (!aweme.isLive()) {
                        mo81059d();
                        C39162r.m79455a("click", "video_pause", aweme.getAid(), 0);
                        C59220ao aoVar = new C59220ao();
                        int i2 = this.f113602e;
                        aoVar.f134917d = aweme;
                        aoVar.f134916c = RequestIdService.m70076a().mo60693a(aweme, i2);
                        aoVar.f134915b = C59208ac.m108771e(aweme);
                        if (!TextUtils.isEmpty(aweme.partN)) {
                            aoVar.f134918e = 2;
                        } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                            aoVar.f134918e = 1;
                        }
                        aoVar.mo96762a(this.f113601d).mo96792f();
                        mo81174M().mo123908B();
                        if (z) {
                            if (s != null) {
                                s.mo81104aw();
                            } else {
                                C51423a.m95786a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                            }
                        }
                        if (z2) {
                            this.f113669aQ = true;
                        }
                        C80749k.m140049a().mo123954c();
                        AbstractC81915c.m141874a(new C50459f(m92605a(mo81211w()), this.f113601d, this.f113602e, 1, s));
                        return;
                    }
                    C51423a.m95791b(6, "PlayerController", "aweme is live aweme,maybe is bug?");
                } else if (i == 3) {
                    mo81059d();
                    C39162r.m79455a("click", "video_play", aweme.getAid(), 0);
                    if (aweme.isLive()) {
                        if (mo81076m()) {
                            C80749k.m140049a();
                            w.mo80225p().mo80233x();
                            C80749k.m140049a();
                            aweme.getAid();
                            aweme.getStreamUrlModel();
                        } else {
                            AbstractC48147ag p = w.mo80225p();
                            if (p.mo80228s() == 2) {
                                p.mo80209b(aweme);
                            }
                        }
                        mo81174M().mo123908B();
                    } else if (aweme.getVideo().getProperPlayAddr() == null) {
                        C51423a.m95786a((Exception) new IllegalStateException("try resume play,but model is null"));
                        return;
                    } else {
                        mo81183a(aweme, 0);
                    }
                    if (s != null) {
                        s.mo81102au();
                    } else {
                        C51423a.m95786a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                    }
                } else if (i != 0 || s == null || !s.mo81105ax()) {
                    C51423a.m95791b(6, "PlayerController", "status:" + i + ",don't know how to do in this situation");
                } else {
                    mo81184a(s.mo81109aD(), true, (AbstractC48149ai) null);
                    s.mo81102au();
                }
            }
        } else if (mo81059d() == null || !m92629b(aweme)) {
            StringBuilder append = new StringBuilder("try to handlePlay, but can't meet the conditions, holder:").append(w == null).append(", player:");
            if (w == null) {
                z3 = true;
            }
            C51423a.m95790a((Throwable) new IllegalStateException(append.append(z3).toString()));
        } else {
            new C79459a(mo81059d()).mo123050a(R.string.h6z).mo123053a();
        }
    }

    /* renamed from: a */
    public final void mo81185a(int i, boolean z) {
        if (C62933c.m113350c()) {
            boolean z2 = false;
            if (!C62890a.f142627a ? C16048b.m29633a().mo25412a(true, "player_scroll_prerender_enable", 1) == 1 : ((Boolean) C62933c.f142845c.getValue()).booleanValue()) {
                if (!(this.f113708bd == i && this.f113709be == z)) {
                    this.f113708bd = i;
                    this.f113709be = z;
                    boolean z3 = !z;
                    if (C62890a.f142627a) {
                        z2 = ((Boolean) C62933c.f142847e.getValue()).booleanValue();
                    } else if (C16048b.m29633a().mo25412a(true, "player_prerender_need_scroll_check_cache", 0) == 1) {
                        z2 = true;
                    }
                    m92607a(1, z3, z2);
                    if (C49493a.m92732a()) {
                        boolean z4 = !z;
                        Aweme a = m92605a(mo81211w());
                        AbstractC49849am s = mo81207s();
                        if (!(s == null || a == null)) {
                            Aweme r = !z4 ? s.mo84854r(a) : s.mo84778i(a);
                            AbstractC48149ai a2 = mo81176a(r.getAid());
                            if (C50539g.m94743a(a2) && m92643f(a2) != null) {
                                this.f113712bh = r;
                                C38000g.m77054e().mo65133a(a2.mo80206b(), mo81059d(), m92643f(a2), s.mo84775h(a));
                            }
                        }
                    }
                }
            }
        }
        if (!(this.f113710bf == i && this.f113711bg == z)) {
            Aweme a3 = m92605a(mo81211w());
            AbstractC49849am s2 = mo81207s();
            if (!(s2 == null || a3 == null)) {
                Aweme r2 = z ? s2.mo84854r(a3) : s2.mo84778i(a3);
                if (r2 != null && r2.isAd() && C48021a.f111245b) {
                    C38000g.m77050a().mo65910v(mo81059d(), r2);
                }
            }
        }
        this.f113710bf = i;
        this.f113711bg = z;
    }

    /* renamed from: b */
    public final void mo81199b(AbstractC48149ai aiVar) {
        AwemeRawAd awemeRawAd;
        String aid;
        if (aiVar == null) {
            aiVar = mo81211w();
        }
        this.f113676aX = "";
        int i = 0;
        if (this.f113646U) {
            Aweme aweme = this.f113727t;
            if (aweme == null) {
                aid = "";
            } else {
                aid = aweme.getAid();
            }
            mo81197a(aid, false, aiVar);
        } else if (TextUtils.equals(this.f113601d, "general_search") && this.f113727t == null && C37699a.m76314s(m92605a(mo81211w()))) {
            this.f113727t = m92605a(mo81211w());
        }
        this.f113723p = 0;
        if (C50539g.m94752e(aiVar)) {
            aiVar.mo80229t().mo65945a(this.f113723p);
        }
        this.f113646U = false;
        Aweme a = m92605a(aiVar);
        if (C37699a.m76277aw(a)) {
            C37889c r = mo81206r();
            r.f89391a = a;
            C37889c.C37890a.m76707a(r);
            r.f89393c = 0;
            r.f89394d = 0;
            r.f89392b.clear();
            if (!(a == null || (awemeRawAd = a.getAwemeRawAd()) == null)) {
                C89219l.m154716b(awemeRawAd, "");
                Video video = a.getVideo();
                if (video != null) {
                    video.setRationAndSourceId(a.getAid());
                    r.f89392b.add(video);
                }
                List<Video> videoList = awemeRawAd.getVideoList();
                if (videoList != null) {
                    for (T t : videoList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C89070n.m154520a();
                        }
                        T t2 = t;
                        if (t2 != null) {
                            t2.setRationAndSourceId(a.getAid() + i2);
                            r.f89392b.add(t2);
                        }
                        i = i2;
                    }
                }
            }
        } else {
            C37889c.C37890a.m76707a(null);
        }
        AbstractC33200b S = m92600S();
        if (S != null) {
            S.mo59129b();
        }
        if (m92605a(mo81211w()) != null) {
            this.f113673aU.mo80889a(m92605a(mo81211w()));
            this.f113673aU.mo80888a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: a */
    public final void mo65520a(Activity activity, Fragment fragment) {
        super.mo65520a(activity, fragment);
        if (activity == null) {
            C36179e.m73733b("ATTACH ACTIVITY == NULL");
        }
        this.f113703ay = new BroadcastReceiver() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4946224 */

            static {
                Covode.recordClassIndex(58275);
            }

            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && C49445o.this.f113730w != null && C49445o.this.f113731x) {
                    C49445o oVar = C49445o.this;
                    oVar.mo81183a(oVar.f113730w, 0);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0998a.m3454a(activity).mo3693a(this.f113703ay, intentFilter);
        if (C49509b.m92743a()) {
            this.f113599b.bindService(new Intent(this.f113599b, BackgroundAudioBrowserService.class), this.f113673aU, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81198a(boolean r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.mo81198a(boolean, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo81202b(String str, long j) {
        this.f113647V = j;
        int l = C62933c.m113359l();
        if ((1 != l && 2 != l) || TextUtils.isEmpty(str)) {
            return;
        }
        if (j >= 0) {
            this.f113648W.put(str, Long.valueOf(j));
        } else {
            this.f113648W.remove(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81196a(String str, boolean z) {
        this.f113719l = z;
        if (1 == C62933c.m113364q() && !TextUtils.isEmpty(str)) {
            this.f113682ad.put(str, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    protected static boolean m92622a(String str, String str2) {
        if (TextUtils.equals(str, "personal_homepage") || TextUtils.equals(str, "others_homepage")) {
            return TextUtils.equals(str2, "output");
        }
        return false;
    }

    /* renamed from: a */
    public final void mo81191a(C84215n nVar) {
        boolean z;
        int i;
        C67107d.C67108a.f150503a.mo105935a(EnumC67106c.PLAYER_RENDER_READY);
        Aweme a = m92605a(mo81211w());
        Aweme b = AwemeService.m70060b().mo60684b(nVar.f188111a);
        Aweme aweme = (b == null || (a != null && TextUtils.equals(b.getAid(), a.getAid()))) ? a : b;
        AbstractC48149ai a2 = mo81176a(nVar.f188111a);
        AbstractC33200b S = m92600S();
        if (S == null || !S.mo59127a(aweme)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || a2 == null) {
            this.f113631D = C62956e.m113374a();
            this.f113639L = 0;
            this.f113658aF = false;
            C38000g.m77056g().mo28750a(mo81059d(), aweme);
            C33956a.m69539a(this.f113631D, aweme);
            C33956a.m69538a();
            C58945a.C58947b.f134185a.mo96429b("feed_ui_to_video", true);
            C58945a.C58947b.f134185a.mo96425a("feed_video_duration", true);
            if (mo81071a()) {
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("video_view", nVar.f188111a);
            }
            AbstractC49849am s = mo81207s();
            if (a2 == null) {
                C49717a.m93132a("1", "view holder is null", nVar.f188111a, mo81209u(), aweme);
                return;
            }
            if (mo81062h()) {
                a2.mo80206b();
                if (mo81077n()) {
                    if (aweme != null) {
                        if (!TextUtils.isEmpty(this.f113732y)) {
                            AbstractC81915c.m141874a(new C47965o(this.f113732y, 0, mo81174M().mo123891n(), aweme.getAid()));
                        }
                        if (mo81207s() != null && mo81207s().mo70440F()) {
                            aweme.getAuthorUid();
                        }
                    }
                    mo81196a(nVar.f188111a, true);
                    this.f113646U = true;
                    if (!mo81062h()) {
                        C49717a.m93132a("3", "view invalid", nVar.f188111a, mo81209u(), aweme);
                        return;
                    }
                    a2.mo80225p().onRenderReady(nVar);
                    if (m92618a(a2.mo80225p())) {
                        this.f113702ax = a2.mo80206b().getAid();
                        m92596O();
                    }
                    if (!C50539g.m94752e(a2)) {
                        C49717a.m93132a("4", "not video viewholder", nVar.f188111a, mo81209u(), aweme);
                        return;
                    }
                    if (a2.mo80206b() != null && a2.mo80206b().isVr() && C80665ad.f180352a) {
                        C80665ad.f180352a = false;
                        new C79459a(mo81058c()).mo123052a(C34722h.m70923b(R.string.d4u)).mo123053a();
                    }
                    if (C50539g.m94743a(a2) && m92643f(a2) != null) {
                        C38000g.m77054e().mo65143d(a2.mo80206b(), mo81059d(), m92643f(a2), this.f113723p);
                    }
                    if (!C46923fb.m90225a() || nVar.f188114d <= 0) {
                        mo81202b(nVar.f188111a, System.currentTimeMillis());
                    } else {
                        mo81202b(nVar.f188111a, nVar.f188114d);
                    }
                    this.f113657aE = C58975a.m108341a(2);
                    IAdSceneService f = AdSceneServiceImpl.m33210f();
                    if (f != null) {
                        f.mo28466c().mo28504a(aweme, mo81059d(), 1, this.f113723p + 1);
                        AbstractC81915c.m141874a(new C33216b());
                    }
                    if (this.f113650Y == -1) {
                        this.f113649X = System.currentTimeMillis();
                    } else {
                        this.f113650Y = -1;
                        this.f113649X = System.currentTimeMillis();
                    }
                    this.f113651Z = -1;
                    m92639e(a2);
                    if (aweme != null && aweme.isAd()) {
                        this.f113700av = aweme.getAwemeRawAd().getShowMaskTimes();
                    }
                    this.f113699au = 0;
                    C49625h.m93072a().f114194f = false;
                    C49625h.m93072a().f114193e = 0;
                    m92608a(a2, true, 0);
                    C49625h.m93072a();
                    C49625h.m93072a().f114195g = false;
                    C49625h.m93072a();
                    if (a2.mo80206b() != null) {
                        i = a2.mo80206b().getAwemeType();
                    } else {
                        i = 0;
                    }
                    if (C46965gb.f109453a) {
                        AbstractC88979t.m154294a(new C49489w(this, nVar, i, aweme)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143300g();
                    } else {
                        mo81194a(nVar.f188111a, i, aweme);
                    }
                    if (C50539g.m94748c(a2)) {
                        C39162r.onEvent(MobClick.obtain().setEventName("ad_play").setExtValueString(a2.mo80206b().getAid()).setJsonObject(new C33743c().mo59976a("request_id", mo81209u().optString("request_id")).mo59977a()));
                    }
                    if (!C49286c.m92321a()) {
                        m92612a(nVar, nVar.f188111a);
                    }
                    this.f113724q = m92624b(a2, nVar.f188111a);
                    if (s != null) {
                        s.mo81101at();
                    }
                    if (!a2.mo80206b().isLive() && s != null && s.mo84708aP()) {
                        a2.mo80225p().mo80149A();
                    }
                    Video video = a2.mo80206b().getVideo();
                    if (video != null) {
                        C1731i.m5640b(new CallableC49490x(this, video, a2, nVar), C39162r.m79452a());
                        if (nVar.f188112b) {
                            mo81188a(video, true);
                        }
                    }
                    this.f113722o.f113577a = 2;
                    mo81190a(new C71904j(0, nVar.f188113c));
                    if (this.f113729v) {
                        C38692bm.m78502a(nVar.f188111a);
                    }
                    if (s != null) {
                        s.mo81099aA();
                    }
                    C58945a.C58947b.f134185a.mo96429b("feed_video_duration", true);
                    C58945a.C58947b.f134185a.mo96425a("feed_video_to_total", true);
                    this.f113701aw = false;
                    C59092g.m108569a("video_play");
                    C39162r.m79460a("compare_event_and_video", new C49694v(nVar, a, b).mo81455a());
                    C67107d.C67108a.f150503a.mo105937b(EnumC67106c.PLAYER_RENDER_READY);
                    return;
                }
            }
            mo81174M().mo123908B();
            C80749k.m140049a().mo123953b();
            C49717a.m93132a("2", "view invalid or activity onpause", nVar.f188111a, mo81209u(), aweme);
            return;
        }
        m92608a(a2, false, 0);
        onResumePlay(nVar.f188111a);
        S.mo59126a(false);
        C89219l.m154721d("onRenderReady", "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x025c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81192a(final com.p2082ss.android.ugc.playerkit.model.C84216o r22) {
        /*
        // Method dump skipped, instructions count: 620
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.mo81192a(com.ss.android.ugc.playerkit.model.o):void");
    }

    /* renamed from: a */
    public final void mo81193a(C84216o oVar, AbstractC48149ai aiVar, long j, long j2) {
        C67107d.C67108a.f150503a.mo105935a(EnumC67106c.PLAYER_RENDER_FIRST_DELAY);
        final String id = oVar.getId();
        long j3 = j - this.f113728u;
        BuildConfigAllServiceImpl.m65220b();
        if (!this.f113705ba) {
            C58945a.C58947b.f134185a.mo96428b("feed_video_to_total", j2, true);
            C58945a.C58947b.f134185a.mo96428b("feed_total", j2, true);
            C58945a.C58947b.f134185a.mo96428b("feed_texture_available_to_first_frame", j2, false);
            C58945a.C58947b.f134185a.mo96422a();
            this.f113705ba = true;
        }
        m92598Q();
        if (C46704ao.m90096c()) {
            C35346d.m72339a();
        }
        String c = mo81204c(id);
        if (!(aiVar == null || aiVar.mo80206b() == null || aiVar.mo80206b().getVideo() == null)) {
            new C62904e.C62905a().mo100916a(String.valueOf(j3)).mo100913a(mo81060e()).mo100915a(aiVar.mo80206b().getVideo()).mo100914a(aiVar).mo100919c(c).mo100912a(1).mo100918b(mo81210v()).mo100917a(C49286c.m92321a()).f142785a.mo100911a();
        }
        C58221f.m105152d();
        C58254p.f132679a.post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.RunnableC4945820 */

            static {
                Covode.recordClassIndex(58271);
            }

            public final void run() {
                String d;
                String b;
                String str = id;
                if (!TextUtils.isEmpty(str)) {
                    C49319g.f113354a = true;
                    if (C49301e.f113318f) {
                        d = C49324h.m92409e();
                    } else {
                        d = C49324h.m92407d();
                    }
                    if (!TextUtils.isEmpty(d)) {
                        if (d == null) {
                            C89219l.m154715b();
                        }
                        if (str == null) {
                            C89219l.m154715b();
                        }
                        if (C89361p.m154908a((CharSequence) d, (CharSequence) str, false)) {
                            if (C89361p.m154874b(d, str + ',', false)) {
                                b = C89361p.m154873b(d, str + ',', "", false);
                            } else if (C89361p.m154874b(d, str, false)) {
                                b = C89361p.m154873b(d, str, "", false);
                            } else {
                                b = C89361p.m154873b(d, ",".concat(String.valueOf(str)), "", false);
                            }
                            if (C49301e.f113318f) {
                                C49324h.m92404b(b);
                            } else {
                                C49324h.m92401a(b);
                            }
                        }
                    }
                }
            }
        });
        if (C35340a.m72328a()) {
            Jato.getInnerExecutorService().execute(RunnableC49484r.f113795a);
        }
        if (C46748bt.m90120g()) {
            C35355j.m72359b();
        }
        if (mo81207s() != null) {
            mo81207s().mo70495g(id);
        }
        m92599R();
        C67107d.C67108a.f150503a.mo105937b(EnumC67106c.PLAYER_RENDER_FIRST_DELAY);
    }

    /* renamed from: b */
    public final void mo81200b(Aweme aweme, int i) {
        Throwable th;
        String str;
        C58945a.C58947b.f134185a.mo96429b("feed_ui_to_texture_available", false);
        C58945a.C58947b.f134185a.mo96425a("feed_texture_available_to_first_frame", false);
        System.currentTimeMillis();
        String str2 = "0";
        try {
            if (!f113626Q && aweme != null && TextUtils.equals(aweme.getAid(), mo81174M().mo123883f()) && this.f113728u == 0) {
                this.f113728u = SystemClock.elapsedRealtime();
                f113626Q = true;
            }
            AbstractC49849am s = mo81207s();
            if (s == null || !s.mo84884bX() || ((Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 22 && (s.aH_() == null || !s.aH_().isResumed())) || (!mo81078o() && !mo81077n()))) {
                str = "3";
            } else {
                AbstractC48149ai w = mo81211w();
                if (w == null) {
                    str = "4";
                } else if (C80771f.f180597a) {
                    mo81174M().mo123934a(w.mo80225p().mo80233x());
                    C48318am.m91761a("7", this.f113632E);
                    C48318am.m91762a(false);
                    return;
                } else if (w.mo80206b() != aweme) {
                    str = "5";
                } else if (aweme.isLive()) {
                    m92626b(w, aweme);
                    str = "6";
                } else if (!mo81174M().mo123945b(mo81172K())) {
                    mo81174M().mo123937a(mo81172K());
                    if (mo81174M().mo123893p()) {
                        mo81174M().mo123934a(w.mo80225p().mo80233x());
                        mo81174M().mo123949x();
                        str = "8";
                    } else if (C50539g.m94752e(w)) {
                        IAdSceneService f = AdSceneServiceImpl.m33210f();
                        if (f != null) {
                            f.mo28466c().mo28516f(aweme, mo81059d());
                        }
                        C50525aa.m94708a(aweme.getAid(), "onTextureAvailable2");
                        str = mo81184a(aweme, true, (AbstractC48149ai) null);
                        C50525aa.m94710b("tryPlay", str);
                    } else {
                        str = "9";
                    }
                } else {
                    C50525aa.m94708a(aweme.getAid(), "onTextureAvailable");
                    String a = mo81183a(aweme, i);
                    AbstractC49849am s2 = mo81207s();
                    if (s2 != null) {
                        s2.mo81090ao();
                    }
                    try {
                        if (!this.f113707bc && (C46832dk.m90151b() || C46832dk.m90152c())) {
                            C21478d.f50922d = false;
                            this.f113707bc = true;
                        }
                        if (C46704ao.m90094a() == 1) {
                            C35346d.m72339a();
                        }
                        C50525aa.m94710b("tryResumePlay", a);
                        mo81067a(aweme);
                        str = a;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = a;
                        C48318am.m91761a(str2, this.f113632E);
                        C48318am.m91762a(false);
                        throw th;
                    }
                }
            }
            if (mo81079p() && mo81072a(false) && !mo81174M().mo123945b(mo81172K())) {
                mo81174M().mo123937a(mo81172K());
            }
            C48318am.m91761a(str, this.f113632E);
            C48318am.m91762a(false);
            System.currentTimeMillis();
        } catch (Throwable th3) {
            th = th3;
            C48318am.m91761a(str2, this.f113632E);
            C48318am.m91762a(false);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo81178a(int i, long j, long j2, Video video) {
        C33743c a = C81077c.m140768a(new C33743c().mo59973a("count_rate", Float.valueOf((((float) i) * 1000.0f) / ((float) j))).mo59975a("duration_rate", Long.valueOf(j2 / j)).mo59974a("block_count", Integer.valueOf(i)).mo59975a("block_duration", Long.valueOf(j2))).mo59975a("duration", Long.valueOf(j)).mo59974a("video_duration", Integer.valueOf(video != null ? video.getDuration() : 0));
        Context d = mo81059d();
        if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132254f = NetworkUtils.getNetworkAccessType(d);
        }
        C33830n.m69192a("aweme_media_block_log1", "video_block", a.mo59976a("netType", C58029j.f132254f).mo59977a());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        if (r3.getFollowStatus() != 2) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d7, code lost:
        if (r8 == false) goto L_0x007c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo81177a(int r18, int r19, int r20, java.lang.String r21, org.json.JSONObject r22, com.p2082ss.android.ugc.aweme.feed.model.Aweme r23, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 519
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.mo81177a(int, int, int, java.lang.String, org.json.JSONObject, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.q.am, java.lang.String):java.lang.Object");
    }

    /* renamed from: F */
    public final void mo81167F() {
        mo81174M().mo123908B();
    }

    /* renamed from: N */
    public final void mo81175N() {
        onPlayStop(this.f113632E);
    }

    /* renamed from: x */
    public final long mo81212x() {
        return m92634d((Aweme) null);
    }

    /* renamed from: O */
    private void m92596O() {
        AbstractC49849am s = mo81207s();
        if (s != null) {
            s.mo84786l(this.f113702ax);
        }
    }

    /* renamed from: P */
    private void m92597P() {
        AbstractC88922b bVar = this.f113704az;
        if (bVar != null) {
            bVar.dispose();
            this.f113704az = null;
        }
    }

    /* renamed from: U */
    private boolean m92602U() {
        return TextUtils.equals(this.f113601d, "homepage_hot");
    }

    /* renamed from: V */
    private boolean m92603V() {
        AbstractC49849am s = mo81207s();
        if (s == null) {
            return false;
        }
        return s.mo70440F();
    }

    /* renamed from: q */
    private void m92652q() {
        WeakReference<AbstractC49849am> weakReference = this.f113644S;
        if (weakReference != null && weakReference.get() != null) {
            this.f113644S.get();
        }
    }

    /* renamed from: C */
    public final void mo81164C() {
        AbstractC49849am s = mo81207s();
        if (s != null) {
            s.mo84748ba();
        }
    }

    /* renamed from: E */
    public final void mo81166E() {
        this.f113652a = false;
        this.f113688aj = SystemClock.elapsedRealtime();
        this.f113651Z = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final Aweme mo81170I() {
        return m92605a(mo81211w());
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final AbstractC80747i mo81174M() {
        if (this.f113642O == null) {
            this.f113642O = C81079v.m140776O();
        }
        return this.f113642O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final AbstractC49849am mo81207s() {
        return this.f113644S.get();
    }

    /* renamed from: u */
    public final JSONObject mo81209u() {
        AbstractC49849am s = mo81207s();
        if (s != null) {
            return s.mo81089an();
        }
        return null;
    }

    /* renamed from: v */
    public final String mo81210v() {
        JSONObject u = mo81209u();
        if (u != null) {
            return u.optString("request_id");
        }
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.o$25 */
    static /* synthetic */ class C4946325 {

        /* renamed from: a */
        static final /* synthetic */ int[] f113771a;

        static {
            Covode.recordClassIndex(58276);
            int[] iArr = new int[C84209m.EnumC84214e.values().length];
            f113771a = iArr;
            try {
                iArr[C84209m.EnumC84214e.Ijk.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: R */
    private void m92599R() {
        if (!C1870c.m6052b(mo81059d(), "common_feed_item_feed")) {
            C35345c.m72336a(mo81059d(), 1);
        }
    }

    /* renamed from: S */
    private AbstractC33200b m92600S() {
        AbstractC48149ai w = mo81211w();
        if (w == null || w.mo80229t() == null) {
            return null;
        }
        return w.mo80229t().mo65937N();
    }

    /* renamed from: A */
    public final Aweme mo81162A() {
        AbstractC49849am s = mo81207s();
        if (s == null) {
            return null;
        }
        return s.mo84854r(m92605a(mo81211w()));
    }

    /* renamed from: K */
    public final OnUIPlayListener mo81172K() {
        if (C37699a.m76277aw(m92605a(mo81211w()))) {
            return mo81206r();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C37889c mo81206r() {
        if (this.f113671aS == null) {
            this.f113671aS = new C37889c(this, new C37889c.AbstractC37891b() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C494758 */

                static {
                    Covode.recordClassIndex(58288);
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.C37889c.AbstractC37891b
                /* renamed from: a */
                public final long mo65997a() {
                    return C49445o.this.mo81174M().mo123891n();
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.C37889c.AbstractC37891b
                /* renamed from: b */
                public final long mo66001b() {
                    return C49445o.this.mo81174M().mo123887j();
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.C37889c.AbstractC37891b
                /* renamed from: a */
                public final void mo65998a(int i) {
                    if (i == 0) {
                        C49445o.this.f113722o.f113577a = 1;
                    } else if (i == 1) {
                        C49445o.this.f113722o.f113577a = 2;
                    } else if (i == 2) {
                        C49445o.this.f113722o.f113577a = 3;
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.C37889c.AbstractC37891b
                /* renamed from: a */
                public final void mo65999a(Video video) {
                    AbstractC48149ai w = C49445o.this.mo81211w();
                    if (w != null) {
                        C49445o.this.mo81174M().mo123934a(w.mo80225p().mo80233x());
                        C49445o.this.mo81174M().mo123923a(video, null, false, true);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.C37889c.AbstractC37891b
                /* renamed from: a */
                public final void mo66000a(VideoUrlModel videoUrlModel) {
                    C80937s.m140453b().mo124084f(C80942a.m140478a(videoUrlModel));
                }
            });
        }
        return this.f113671aS;
    }

    /* renamed from: z */
    public final Aweme mo81214z() {
        AbstractC49849am s = mo81207s();
        if (s == null) {
            return null;
        }
        return s.mo84778i(m92605a(mo81211w()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.e.o$c */
    public class RunnableC49479c implements Runnable {

        /* renamed from: a */
        public String f113788a;

        static {
            Covode.recordClassIndex(58292);
        }

        public final void run() {
            String str;
            Aweme I = C49445o.this.mo81170I();
            if (I != null && (str = this.f113788a) != null && str.equals(I.getAid())) {
                if (C49445o.this.mo81174M().mo123892o()) {
                    C49445o.this.onResumePlay(this.f113788a);
                } else {
                    C12895a.f31387b.f31389a.post(this);
                }
            }
        }

        private RunnableC49479c() {
        }

        /* synthetic */ RunnableC49479c(C49445o oVar, byte b) {
            this();
        }
    }

    /* renamed from: Q */
    private static void m92598Q() {
        boolean z = C58945a.C58947b.f134185a.f134177d;
        if (SettingsRequestServiceImpl.m65417i().mo57289g() && !C49301e.f113322j) {
            C49301e.f113322j = true;
            if (z) {
                C40780g.m82241a().execute(new C49301e.RunnableC49306d(z));
            }
        }
    }

    /* renamed from: T */
    private void m92601T() {
        if (this.f113651Z != -1) {
            long j = this.f113650Y;
            if (j == -1) {
                this.f113650Y = System.currentTimeMillis() - this.f113651Z;
            } else {
                this.f113650Y = j + (System.currentTimeMillis() - this.f113651Z);
            }
            this.f113651Z = -1;
        }
    }

    /* renamed from: B */
    public final void mo81163B() {
        AbstractC49849am s = mo81207s();
        if (s != null) {
            if (C49286c.m92321a()) {
                C49615a.m93038a(m92605a(mo81211w()), s.mo81096g(true));
            }
            s.mo84784j(C17873f.f42636l);
        }
    }

    /* renamed from: J */
    public final void mo81171J() {
        long currentTimeMillis = System.currentTimeMillis() - this.f113647V;
        C39162r.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName(this.f113601d).setExtValueLong(currentTimeMillis));
        C59218am amVar = new C59218am();
        amVar.f134899a = String.valueOf(currentTimeMillis);
        amVar.mo96758a(this.f113601d).mo96760o(this.f113604g).mo96792f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo81208t() {
        Activity c = mo81058c();
        if ((!(c instanceof AbstractC59103j) || !((AbstractC59103j) c).isDuoDualMode()) && c != null && !ScrollSwitchStateManager.C52950a.m97811a((ActivityC0945e) c).mo89350b("page_feed")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final AbstractC48149ai mo81211w() {
        AbstractC48149ai aC;
        AbstractC48149ai T;
        AbstractC49849am s = mo81207s();
        if (s == null || (aC = s.mo81108aC()) == null) {
            return null;
        }
        if (aC.mo80155a() != 40 || aC.mo80206b().getUserStory() == null || (T = aC.mo80105T()) == null) {
            return aC;
        }
        return T;
    }

    /* renamed from: y */
    public final void mo81213y() {
        AbstractC48149ai w;
        Aweme b;
        User author;
        if (mo81074k() && TextUtils.equals(this.f113601d, "toplist_friend") && (w = mo81211w()) != null && (b = w.mo80206b()) != null && (author = b.getAuthor()) != null) {
            m92621a(author);
        }
    }

    /* renamed from: G */
    public final void mo81168G() {
        this.f113714bj = null;
        this.f113715bk = null;
        this.f113717bm = null;
        this.f113716bl = null;
        if (this.f113706bb) {
            this.f113706bb = false;
            AbstractC48149ai w = mo81211w();
            if (C50539g.m94752e(w) && !TextUtils.equals(this.f113601d, "general_search")) {
                Aweme b = w.mo80206b();
                IAdSceneService f = AdSceneServiceImpl.m33210f();
                if (b != null && f != null && !this.f113658aF && b.getAid() != null) {
                    m92601T();
                    f.mo28466c().mo28508a(b, mo81059d(), b.getAid(), mo81169H(), this.f113723p + 1);
                }
            }
        }
    }

    /* renamed from: H */
    public final long mo81169H() {
        long currentTimeMillis;
        long j;
        long n;
        if (C49521m.f113899a == 1) {
            AbstractC33208e a = C33205b.m68071a();
            if (C37699a.m76251aW(m92605a(mo81211w())) && a != null) {
                n = a.mo59102f();
            } else if (C37699a.m76277aw(m92605a(mo81211w()))) {
                n = mo81206r().mo65913d();
            } else {
                n = mo81174M().mo123891n();
            }
            if (n > 0) {
                return n;
            }
        }
        if (this.f113650Y == -1) {
            currentTimeMillis = System.currentTimeMillis();
            j = this.f113649X;
        } else {
            currentTimeMillis = System.currentTimeMillis() - this.f113649X;
            j = this.f113650Y;
        }
        return currentTimeMillis - j;
    }

    /* renamed from: L */
    public final void mo81173L() {
        if (C49493a.m92732a()) {
            Aweme a = m92605a(mo81211w());
            Aweme aweme = this.f113712bh;
            if (!(aweme == null || a == null || TextUtils.equals(aweme.getAid(), a.getAid()))) {
                AbstractC48149ai a2 = mo81176a(this.f113712bh.getAid());
                if (C50539g.m94743a(a2) && m92643f(a2) != null) {
                    C38000g.m77054e().mo65128a(mo81059d(), a2.mo80206b(), m92643f(a2), false);
                }
            }
        }
        this.f113710bf = -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: d */
    public final Context mo81059d() {
        AbstractC49849am s = mo81207s();
        if (s == null || s.aG_() == null) {
            return super.mo81059d();
        }
        return s.aG_();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: b */
    public final void mo81056b() {
        super.mo81056b();
        Context d = mo81059d();
        C0998a.m3454a(d).mo3692a(this.f113703ay);
        m92597P();
        if (C49509b.m92743a() && d != null) {
            d.unbindService(this.f113673aU);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
        m92617a(z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.e.o$e */
    public static class C49481e implements AbstractC63052m {

        /* renamed from: a */
        private final WeakReference<C49445o> f113792a;

        static {
            Covode.recordClassIndex(58294);
        }

        public C49481e(C49445o oVar) {
            this.f113792a = new WeakReference<>(oVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63052m
        /* renamed from: a */
        public final void mo81245a(String str, int i, int i2, int i3, String str2, boolean z, boolean z2, long j, long j2, long j3) {
            AbstractC48149ai a;
            int i4;
            List<CaptionItemModel> captionList;
            long j4 = j2;
            C49445o oVar = this.f113792a.get();
            if (oVar != null && (a = oVar.mo81176a(str)) != null) {
                Aweme a2 = C49445o.m92605a(a);
                a.mo80117a(str, i, i3, str2);
                if (z || z2) {
                    long n = oVar.mo81174M().mo123891n();
                    if (n > j3) {
                        i4 = 0;
                    } else if (n == j3) {
                        i4 = 1;
                    } else if (!str.equals(a2.getAid())) {
                        i4 = 2;
                    } else {
                        i4 = 3;
                    }
                    long j5 = n - j3;
                    if (i == -1) {
                        j4 = -1;
                    }
                    if (z) {
                        a.mo80112a(i, oVar.mo81204c(str), j, j4, i4, n, j3, j5, oVar.f113629B);
                    } else if (z2) {
                        if (!(a.mo80206b().getVideo().getCaptionModel() == null || a.mo80206b().getVideo().getCaptionModel().getCaptionList() == null || a.mo80206b().getVideo().getCaptionModel().getCaptionList().isEmpty() || (captionList = a.mo80206b().getVideo().getCaptionModel().getCaptionList()) == null || captionList.isEmpty())) {
                            for (CaptionItemModel captionItemModel : captionList) {
                                if (i2 == ((int) captionItemModel.getLanguageId())) {
                                    VideoUrlModel a3 = C80942a.m140468a(captionItemModel);
                                    oVar.f113629B = C49445o.m92604a(a3.getSourceId(), a3);
                                    if (oVar.f113629B < 0) {
                                        oVar.f113629B = 0;
                                    }
                                }
                            }
                        }
                        a.mo80110a(i, j, j4, i4, n, j3, j5, oVar.f113629B);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static Aweme m92605a(AbstractC48149ai aiVar) {
        if (aiVar != null) {
            return aiVar.mo80206b();
        }
        return null;
    }

    /* renamed from: c */
    protected static String m92630c(AbstractC48149ai aiVar) {
        return aiVar.mo80089O().getAid();
    }

    /* renamed from: d */
    private static boolean m92637d(AbstractC48149ai aiVar) {
        if (aiVar.mo80225p().mo80228s() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static AbstractC80726a m92646g(AbstractC48149ai aiVar) {
        return aiVar.mo80225p().mo80100N();
    }

    /* renamed from: h */
    private static boolean m92648h(AbstractC48149ai aiVar) {
        if (aiVar == null || aiVar.mo80206b() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo81203b(boolean z) {
        mo81174M().mo123940a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
        if (C62933c.m113364q() == 0) {
            m92628b("", z);
        }
    }

    /* renamed from: f */
    private static View m92643f(AbstractC48149ai aiVar) {
        if (aiVar == null || aiVar.mo80231v() == null || aiVar.mo80231v().mo80119ad() == null) {
            return null;
        }
        return aiVar.mo80231v().mo80119ad();
    }

    /* renamed from: g */
    private void m92647g(final Aweme aweme) {
        aweme.getAid();
        if (aweme.getPreload() != null) {
            C1731i.m5640b(new Callable<Object>() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.CallableC4946022 */

                static {
                    Covode.recordClassIndex(58273);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Aweme aweme = aweme;
                    String str = C49445o.this.f113601d;
                    if (aweme.getPreload().commentPreload >= 0) {
                        C40755d.m82216a().mo69987a(new C40758f(aweme, aweme.getPreload().commentPreload * 1000, str, C40750c.EnumC40751a.COMMENT));
                    }
                    Aweme aweme2 = aweme;
                    if (aweme2.getPreload().profilePreload < 0) {
                        return null;
                    }
                    C40755d.m82216a().mo69987a(new C40758f(aweme2, aweme2.getPreload().profilePreload, "", C40750c.EnumC40751a.PROFILE));
                    C40755d.m82216a().mo69987a(new C40758f(aweme2, aweme2.getPreload().profilePreload, "", C40750c.EnumC40751a.POST));
                    return null;
                }
            }, C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
        if (this.f113633F.mo81119a(str)) {
            mo81204c(str);
            this.f113673aU.mo80888a();
        }
    }

    /* renamed from: e */
    private long m92638e(String str) {
        if (C62933c.m113364q() == 0) {
            return this.f113689ak;
        }
        if (1 != C62933c.m113364q() || TextUtils.isEmpty(str)) {
            return -1;
        }
        if (!this.f113683ae.containsKey(str)) {
            return this.f113689ak;
        }
        return this.f113683ae.get(str).longValue();
    }

    /* renamed from: f */
    private long m92642f(String str) {
        if (C62933c.m113364q() == 0) {
            return this.f113696ar;
        }
        if (1 != C62933c.m113364q() || TextUtils.isEmpty(str)) {
            return -1;
        }
        if (!this.f113685ag.containsKey(str)) {
            return this.f113696ar;
        }
        return this.f113685ag.get(str).longValue();
    }

    /* renamed from: g */
    private long m92645g(String str) {
        if (C62933c.m113364q() == 0) {
            return this.f113698at;
        }
        if (1 != C62933c.m113364q() || TextUtils.isEmpty(str)) {
            return -1;
        }
        if (!this.f113684af.containsKey(str)) {
            return this.f113698at;
        }
        return this.f113684af.get(str).longValue();
    }

    /* renamed from: h */
    private boolean m92649h(String str) {
        if (C62933c.m113364q() == 0) {
            return this.f113694ap;
        }
        if (1 != C62933c.m113364q() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.f113680ab.containsKey(str)) {
            return this.f113694ap;
        }
        return this.f113680ab.get(str).booleanValue();
    }

    /* renamed from: i */
    private boolean m92650i(String str) {
        if (C62933c.m113364q() == 0) {
            return this.f113679aa;
        }
        if (1 != C62933c.m113364q() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.f113681ac.containsKey(str)) {
            return this.f113679aa;
        }
        return this.f113681ac.get(str).booleanValue();
    }

    /* renamed from: j */
    private boolean m92651j(String str) {
        if (C62933c.m113364q() == 0) {
            return this.f113719l;
        }
        if (1 != C62933c.m113364q() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.f113682ad.containsKey(str)) {
            return this.f113719l;
        }
        return this.f113682ad.get(str).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(final C84216o oVar) {
        C49710k.f114401i = false;
        long j = C46799cp.f109026a;
        if (j > 0) {
            C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.RunnableC4945316 */

                static {
                    Covode.recordClassIndex(58266);
                }

                public final void run() {
                    C49445o.this.mo81192a(oVar);
                }
            }, j);
        } else if (!C46825dd.f109092e || !C80446fr.f180030d) {
            mo81192a(oVar);
        } else {
            C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.RunnableC4945417 */

                static {
                    Covode.recordClassIndex(58267);
                }

                public final void run() {
                    C49445o.this.mo81192a(oVar);
                }
            }, 16);
        }
    }

    /* renamed from: c */
    private static boolean m92633c(Aweme aweme) {
        if (aweme == null || !aweme.isCanPlay()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private long m92634d(Aweme aweme) {
        Video video;
        int duration;
        AbstractC33208e a = C33205b.m68071a();
        if (C37699a.m76251aW(m92605a(mo81211w())) && a != null) {
            return a.mo59103g();
        }
        if (C37699a.m76277aw(aweme)) {
            return mo81206r().mo65912c();
        }
        if ((aweme != null || (aweme = m92605a(mo81211w())) != null) && (video = aweme.getVideo()) != null && (duration = video.getDuration()) > 0) {
            return (long) duration;
        }
        long j = mo81174M().mo123887j();
        if (j > 0) {
            return j;
        }
        if (this.f113649X <= 0) {
            return -1;
        }
        if (this.f113650Y != -1) {
            return (System.currentTimeMillis() - this.f113649X) - this.f113650Y;
        }
        return System.currentTimeMillis() - this.f113649X;
    }

    /* renamed from: e */
    private void m92639e(AbstractC48149ai aiVar) {
        if (C37699a.m76243aO(m92605a(mo81211w())) || C37699a.m76319x(m92605a(mo81211w()))) {
            aiVar.mo80229t().mo65986s();
        }
    }

    /* renamed from: f */
    private static boolean m92644f(Aweme aweme) {
        if (aweme == null || aweme.getMusic() == null || aweme.getMusic().getId() == 0 || aweme.getMusic().getMusicStatus() != 0 || C38000g.m77057h().mo67249a(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(C84208l lVar) {
        C84230b c;
        Session c2 = C84229a.f188297a.mo129052c(lVar.f188032a);
        if (!TextUtils.isEmpty(lVar.f188032a)) {
            this.f113664aL.put(lVar.f188032a, Integer.valueOf(lVar.f188035d));
        }
        if (!(c2 == null || (c = C84262a.f188441a.mo129284c(c2.key)) == null)) {
            c.f188308e = true;
        }
        AbstractC48149ai a = mo81176a(lVar.f188032a);
        mo81068a(lVar, a);
        if (a != null) {
            mo81174M().mo123916J();
        }
        if (this.f113729v) {
            String str = lVar.f188032a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("source_id", str);
            } catch (JSONException unused) {
            }
            C12290b.m22060a("aweme_screen_ad_open_media_error_rate", 1, jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlaying(String str) {
        String aid;
        Handler handler;
        Message obtainMessage;
        this.f113633F.mo81118a(mo81204c(str), str);
        this.f113673aU.mo80888a();
        C81067m a = C81067m.C81070a.m140763a();
        Aweme a2 = m92605a(mo81211w());
        if (C81067m.f181187d.f180767a && C81067m.f181187d.f180768b && a2 != null && (aid = a2.getAid()) != null && aid.length() != 0 && (handler = a.f181190b) != null && (obtainMessage = handler.obtainMessage(5, a2)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(final C84215n nVar) {
        int a;
        MethodCollector.m26663i(5554);
        if (C80444fq.C80445a.f180026a.mo123743a(EnumC80443fp.ON_RENDER_READY) && (a = C16048b.m29633a().mo25412a(true, "downgrade_feed_total_duration", 0)) > 0) {
            try {
                Thread.sleep((long) a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = C46799cp.f109026a;
        if (j > 0) {
            AbstractC80747i iVar = this.f113642O;
            if (iVar != null) {
                iVar.mo123908B();
            }
            C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.RunnableC4944710 */

                static {
                    Covode.recordClassIndex(58260);
                }

                public final void run() {
                    if (C49445o.this.f113642O != null) {
                        C49445o.this.f113642O.mo123950y();
                    }
                    C49445o.this.mo81191a(nVar);
                }
            }, j);
            MethodCollector.m26664o(5554);
        } else if (!C46825dd.f109091d || !C80446fr.f180030d) {
            mo81191a(nVar);
            MethodCollector.m26664o(5554);
        } else {
            C12895a.f31387b.f31389a.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.RunnableC4944811 */

                static {
                    Covode.recordClassIndex(58261);
                }

                public final void run() {
                    C49445o.this.mo81191a(nVar);
                }
            });
            MethodCollector.m26664o(5554);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r1 = r2.mo80206b().getVideo();
     */
    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRetryOnError(final com.p2082ss.android.ugc.playerkit.model.C84208l r4) {
        /*
            r3 = this;
            boolean r0 = r3.mo81062h()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = r4.f188032a
            com.ss.android.ugc.aweme.feed.adapter.ai r2 = r3.mo81176a(r0)
            if (r2 != 0) goto L_0x0010
            return
        L_0x0010:
            com.ss.android.ugc.aweme.feed.adapter.ag r0 = r2.mo80225p()
            r0.onRetryOnError(r4)
            int[] r1 = com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.C4946325.f113771a
            com.ss.android.ugc.aweme.video.i r0 = r3.mo81174M()
            com.ss.android.ugc.playerkit.model.m$e r0 = r0.mo123877a()
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x002b
        L_0x002a:
            return
        L_0x002b:
            java.lang.Object r0 = r4.f188037f
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r4.f188037f
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x002a
        L_0x0035:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.mo80206b()
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.mo80206b()
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            if (r1 != 0) goto L_0x0046
            return
        L_0x0046:
            com.ss.android.ugc.aweme.feed.e.o$21 r0 = new com.ss.android.ugc.aweme.feed.e.o$21
            r0.<init>(r4, r1)
            com.p2082ss.android.p2085a.p2086a.p2087a.C29339a.m58752a(r0)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.onRetryOnError(com.ss.android.ugc.playerkit.model.l):void");
    }

    /* renamed from: e */
    private void m92640e(Aweme aweme) {
        if (!C37699a.m76251aW(aweme)) {
            int i = this.f113641N;
            if (i >= 100 && i <= 1000 && m92634d(aweme) > 29000) {
                long d = m92634d(aweme) / ((long) this.f113641N);
                if (d > 50) {
                    mo81174M().mo123933a((int) d);
                    return;
                }
            }
            mo81174M().mo123915I();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo81204c(String str) {
        String str2;
        if (str != null) {
            str2 = this.f113670aR.get(str);
        } else {
            str2 = "";
        }
        return String.valueOf(str2);
    }

    /* renamed from: d */
    public final long mo81205d(String str) {
        int l = C62933c.m113359l();
        if (l == 0) {
            return this.f113647V;
        }
        if (1 != l) {
            if (2 != l) {
                return -1;
            }
            if (!TextUtils.isEmpty(str) && !this.f113648W.containsKey(str) && this.f113647V > 0) {
                C13468b.m24211a(new Exception(), "getPlayStartTime exception which may lead to playtime metric over actually value!");
            }
        }
        if (TextUtils.isEmpty(str) || !this.f113648W.containsKey(str)) {
            return -1;
        }
        return this.f113648W.get(str).longValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        Aweme aweme;
        C67107d.C67108a.f150503a.mo105935a(EnumC67106c.PLAYER_PAUSE);
        C33956a.m69540a("true");
        C33956a.m69542b("true");
        long currentTimeMillis = System.currentTimeMillis();
        if (mo81059d() != null) {
            UgAllServiceImpl.m65444c();
            AbstractC48149ai w = mo81211w();
            AbstractC48149ai a = mo81176a(str);
            Aweme aweme2 = null;
            if (w != null) {
                aweme = w.mo80206b();
            } else {
                aweme = null;
            }
            if (a != null) {
                aweme2 = a.mo80206b();
            }
            mo81195a(str, currentTimeMillis);
            this.f113722o.f113577a = 3;
            if (w != null) {
                w.mo80225p().onPausePlay(str);
                mo81174M().mo123916J();
            }
            if (aweme != null && !TextUtils.isEmpty(this.f113732y)) {
                AbstractC81915c.m141874a(new C47965o(this.f113732y, 1, mo81174M().mo123891n(), str));
            }
            C71904j jVar = new C71904j(4);
            jVar.f161109f = str;
            mo81190a(jVar);
            this.f113651Z = currentTimeMillis;
            boolean z = false;
            this.f113655aC = false;
            SpecActServiceImpl.m131497i().mo118034f();
            SpecActServiceImpl.m131497i().mo118019a().mo60239b();
            this.f113673aU.mo80888a();
            IMLCommonService instance = MLCommonService.instance();
            String str2 = this.f113601d;
            if (mo81207s() != null && !mo81207s().mo84708aP()) {
                z = true;
            }
            instance.onPlayPause(aweme2, str2, z);
            C67107d.C67108a.f150503a.mo105937b(EnumC67106c.PLAYER_PAUSE);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompletedFirstTime(String str) {
        Aweme aweme;
        if (mo81062h()) {
            C33956a.m69540a("true");
            C33956a.m69542b("true");
            AbstractC49849am s = mo81207s();
            AbstractC48149ai a = mo81176a(str);
            if (a != null) {
                a.mo80225p().onPlayCompletedFirstTime(str);
            }
            mo81190a(new C71904j(6));
            if (a != null) {
                aweme = a.mo80206b();
                if (aweme != null && !TextUtils.isEmpty(this.f113732y)) {
                    AbstractC81915c.m141874a(new C47965o(this.f113732y, 3, mo81174M().mo123891n(), aweme.getAid()));
                }
            } else {
                aweme = null;
            }
            C42066d.f98067b.mo71244a(aweme, 1);
            mo81070a(str, s, aweme);
            IUgAllService c = UgAllServiceImpl.m65444c();
            m92602U();
            c.mo57251a();
            MLCommonService.instance().onPlayFinishFirst(aweme, this.f113601d);
            if (m92605a(mo81211w()) != null && m92602U()) {
                C63332a.C63333a.m114832a().f143747d = true;
                C63332a.C63333a.m114832a().mo101920a();
                C63332a.C63333a.m114832a().mo101921a(2);
            }
        }
    }

    /* renamed from: b */
    private static boolean m92629b(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null) {
            return false;
        }
        return aweme.getStatus().isDelete();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b3, code lost:
        if (r4 != null) goto L_0x01d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0216  */
    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPlayCompleted(java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 668
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.onPlayCompleted(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0278, code lost:
        if (r9 != null) goto L_0x0174;
     */
    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPreparePlay(java.lang.String r26) {
        /*
        // Method dump skipped, instructions count: 795
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.onPreparePlay(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020d, code lost:
        if (r9 != null) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x021c, code lost:
        if (r4 == null) goto L_0x0179;
     */
    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResumePlay(java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 550
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o.onResumePlay(java.lang.String):void");
    }

    /* renamed from: b */
    public static C80713c m92623b(Video video, boolean z) {
        return C81078d.m140772a(video, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.e.o$d */
    public class C49480d implements AbstractC63031a {

        /* renamed from: b */
        private final WeakReference<C49445o> f113791b;

        static {
            Covode.recordClassIndex(58293);
        }

        public C49480d(C49445o oVar) {
            this.f113791b = new WeakReference<>(oVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63031a
        /* renamed from: a */
        public final void mo81244a(String str, long j, int i, String str2) {
            List<TtsInfos> ttsInfos;
            C49445o oVar = this.f113791b.get();
            if (oVar != null) {
                oVar.f113720m.put(str, true);
                AbstractC48149ai a = oVar.mo81176a(str);
                if (a != null) {
                    boolean a2 = C81078d.m140774a(a.mo80206b());
                    boolean containsKey = C49445o.this.f113721n.containsKey(str);
                    int i2 = 0;
                    if (!a2 || a.mo80206b() == null || a.mo80206b().getAudio() == null || a.mo80206b().getAudio().getTtsInfos() == null || a.mo80206b().getAudio().getTtsInfos().isEmpty() || (ttsInfos = a.mo80206b().getAudio().getTtsInfos()) == null || ttsInfos.isEmpty()) {
                        i2 = 0;
                    } else {
                        for (TtsInfos ttsInfos2 : ttsInfos) {
                            if (ttsInfos2.getPlayAddress().getUrlKey() != null && !TextUtils.isEmpty(str2) && str2.equals(ttsInfos2.getPlayAddress().getUrlKey())) {
                                VideoUrlModel a3 = C80942a.m140469a(ttsInfos2);
                                i2 = C49445o.m92604a(a3.getSourceId(), a3);
                            }
                        }
                    }
                    a.mo80116a(str, containsKey ? 1 : 0, i2, i, j);
                }
            }
        }
    }

    /* renamed from: a */
    public static int m92604a(String str, VideoUrlModel videoUrlModel) {
        if (C80662ac.m139889a(videoUrlModel)) {
            return C80662ac.m139890b(videoUrlModel);
        }
        if (PreloadSessionManager.f180657a.mo124004b(str) == null) {
            return -2;
        }
        return -1;
    }

    /* renamed from: b */
    private static String m92624b(AbstractC48149ai aiVar, String str) {
        if (aiVar == null || !TextUtils.equals(C59208ac.m108771e(aiVar.mo80206b()), str)) {
            return "";
        }
        return C59208ac.m108758a(aiVar.mo80206b());
    }

    /* renamed from: c */
    private void m92631c(String str, long j) {
        this.f113689ak = j;
        if (1 == C62933c.m113364q() && !TextUtils.isEmpty(str)) {
            this.f113683ae.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: d */
    private void m92635d(String str, long j) {
        this.f113696ar = j;
        if (1 == C62933c.m113364q() && !TextUtils.isEmpty(str)) {
            this.f113685ag.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: e */
    private void m92641e(String str, long j) {
        this.f113698at = j;
        if (1 == C62933c.m113364q() && !TextUtils.isEmpty(str)) {
            this.f113684af.put(str, Long.valueOf(j));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z) {
        if (1 == C62933c.m113364q() && TextUtils.equals(this.f113632E, str)) {
            m92628b(str, z);
        }
    }

    /* renamed from: a */
    private void m92610a(Aweme aweme, AbstractC37879bc bcVar) {
        if (bcVar != null && bcVar.mo65973e()) {
            bcVar.mo65974g();
            IAdSceneService f = AdSceneServiceImpl.m33210f();
            if (f != null) {
                f.mo28466c().mo28504a(aweme, mo81059d(), 1, this.f113723p + 1);
            }
        }
    }

    /* renamed from: b */
    private void m92626b(AbstractC48149ai aiVar, Aweme aweme) {
        if (aiVar != null && aweme != null) {
            if (!C49502ae.m92739a(this.f113601d)) {
                mo81167F();
            }
            AbstractC48147ag p = aiVar.mo80225p();
            if (p.mo80228s() == 2) {
                p.mo80209b(aweme);
            }
        }
    }

    /* renamed from: c */
    private void m92632c(String str, boolean z) {
        this.f113694ap = z;
        if (1 == C62933c.m113364q() && !TextUtils.isEmpty(str)) {
            this.f113680ab.put(str, Boolean.valueOf(z));
        }
    }

    /* renamed from: d */
    private void m92636d(String str, boolean z) {
        this.f113679aa = z;
        if (1 == C62933c.m113364q() && !TextUtils.isEmpty(str)) {
            this.f113681ac.put(str, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    private static Object m92606a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4780);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
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
                    MethodCollector.m26664o(4780);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: b */
    private static void m92627b(Aweme aweme, AbstractC49849am amVar) {
        if (aweme != null && SmartFeedPreloadService.instance().enable() && SmartPreloadExperiment.C59984a.f136618i == 0) {
            boolean z = false;
            if (SmartPreloadExperiment.C59984a.f136615f && amVar != null && !amVar.mo84708aP()) {
                z = true;
            }
            if (SmartFeedPreloadService.getDebug()) {
                if (amVar != null && (amVar instanceof AbstractC49815a)) {
                    amVar.mo81097i();
                }
                aweme.getAid();
            }
            if (!z) {
                SmartFeedPreloadService.instance().startSmartPreloadV2Judge(aweme);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z) {
        Handler handler;
        Message obtainMessage;
        if (m92602U()) {
            C63332a.C63333a.m114832a().mo101920a();
            C63332a.C63333a.m114832a().mo101921a(1);
        }
        AbstractC49849am s = mo81207s();
        if (s != null) {
            s.mo84724b(str, z);
        }
        C81067m a = C81067m.C81070a.m140763a();
        if (C81067m.f181187d.f180767a && C81067m.f181187d.f180768b && str != null && str.length() != 0 && (handler = a.f181190b) != null && (obtainMessage = handler.obtainMessage(3, str)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    /* renamed from: b */
    private void m92628b(String str, boolean z) {
        AbstractC48149ai w = mo81211w();
        if (w != null) {
            w.mo80225p().onBuffering(z);
        }
        m92632c(str, z);
        m92616a(str, z, false);
        if (w != null && m92643f(w) != null && m92651j(str) && C50539g.m94743a(w)) {
            if (z) {
                C38000g.m77054e().mo65139b(w.mo80206b(), mo81059d(), m92643f(w), this.f113723p);
            } else {
                C38000g.m77054e().mo65141c(w.mo80206b(), mo81059d(), m92643f(w), this.f113723p);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, JSONObject jSONObject) {
        Aweme b;
        AbstractC48149ai a;
        Aweme b2;
        long j;
        long j2;
        int i;
        long j3;
        boolean z;
        VideoUrlModel playAddr;
        List<Long> list;
        C67107d.C67108a.f150503a.mo105935a(EnumC67106c.PLAYER_STOP);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String c = mo81204c(str);
        if (!TextUtils.isEmpty(c)) {
            if (this.f113633F.mo81119a(str) || TextUtils.equals(str, this.f113643P)) {
                if (!TextUtils.equals(this.f113659aG, str)) {
                    this.f113633F.f113624b.remove(str);
                    this.f113673aU.mo80888a();
                    AbstractC48149ai w = mo81211w();
                    if (w != null && (b = w.mo80206b()) != null && !TextUtils.isEmpty(b.getAid()) && (a = mo81176a(str)) != null && (b2 = a.mo80206b()) != null) {
                        if (this.f113662aJ.containsKey(str)) {
                            if (this.f113665aM.containsKey(str)) {
                                j = this.f113665aM.get(str).longValue();
                            } else {
                                j = this.f113666aN;
                            }
                        } else if (this.f113663aK.containsKey(str)) {
                            j = elapsedRealtime - this.f113663aK.get(str).longValue();
                        } else {
                            j = 0;
                        }
                        Video video = b2.getVideo();
                        float j4 = (float) mo81174M().mo123887j();
                        ArrayList<Aweme> arrayList = new ArrayList<>();
                        AbstractC49849am s = mo81207s();
                        if (s != null) {
                            int aE = s.mo81110aE() + 1;
                            while (aE > 0 && aE < s.mo81111aF() && arrayList.size() <= C62893b.f142640Y) {
                                Aweme f = s.mo81112f(aE);
                                if (f == null || f.getVideo() == null || f.getVideo().getPlayAddr() == null) {
                                    break;
                                }
                                arrayList.add(f);
                                aE++;
                            }
                        }
                        JSONObject jSONObject2 = null;
                        if (!this.f113672aT.containsKey(str) || (list = this.f113672aT.get(str)) == null || list.size() <= 0) {
                            j2 = 0;
                        } else {
                            j2 = 0;
                            for (Long l : list) {
                                j2 += l.longValue();
                            }
                        }
                        boolean containsKey = this.f113720m.containsKey(str);
                        C49812b a2 = FeedParamProvider.C49809a.m93270a(mo81059d());
                        if (jSONObject != null) {
                            z = jSONObject.optBoolean("is_super_resolution");
                            jSONObject2 = jSONObject.optJSONObject("hw_codec_info");
                            j3 = jSONObject.optLong("audio_bitrate");
                            i = jSONObject.optInt("audio_codec_format");
                        } else {
                            i = 0;
                            j3 = 0;
                            z = false;
                        }
                        Context a3 = C17867d.m33078a();
                        double d = 0.0d;
                        Double d2 = this.f113661aI.get(b2.getAid());
                        if (!(b2.getAid() == null || d2 == null)) {
                            d = C58975a.m108341a(2) - d2.doubleValue();
                        }
                        C62893b.C62894a aVar = new C62893b.C62894a();
                        aVar.f142686a.f142660a = b2;
                        aVar.f142686a.f142661b = Integer.valueOf(this.f113602e);
                        aVar.f142686a.f142663d = m92649h(str);
                        aVar.f142686a.f142672m = this.f113631D;
                        aVar.f142686a.f142678s = this.f113690al;
                        aVar.f142686a.f142679t = this.f113686ah;
                        aVar.f142686a.f142677r = j;
                        aVar.f142686a.f142674o = arrayList;
                        aVar.f142686a.f142681v = c;
                        aVar.f142686a.f142665f = z;
                        aVar.f142686a.f142652G = containsKey ? 1 : 0;
                        aVar.f142686a.f142654I = jSONObject2;
                        aVar.f142686a.f142655J = i;
                        aVar.f142686a.f142656K = (int) j3;
                        aVar.f142686a.f142659N = C58975a.m108348c(a3);
                        aVar.f142686a.f142657L = (float) C58975a.m108341a(2);
                        aVar.f142686a.f142658M = (float) d;
                        aVar.f142686a.f142651F = C49286c.m92321a();
                        aVar.f142686a.f142664e = C80937s.m140453b().mo124083f();
                        if (!(a2 == null || a2.getNewsId() == null)) {
                            String newsId = a2.getNewsId();
                            C89219l.m154721d(newsId, "");
                            aVar.f142686a.f142653H = newsId;
                        }
                        if (video != null) {
                            this.f113659aG = str;
                            aVar.f142686a.f142676q = this.f113662aJ.containsKey(str) ? 1 : 0;
                            VideoUrlModel playAddr2 = video.getPlayAddr();
                            if (playAddr2 != null) {
                                if (j4 <= 0.0f) {
                                    j4 = (float) playAddr2.getDuration();
                                }
                                List<C84224v> l2 = C80937s.m140453b().mo124092l(C80942a.m140478a(playAddr2));
                                List<C84227x> k = C80937s.m140453b().mo124091k(C80942a.m140478a(playAddr2));
                                aVar.f142686a.f142662c = playAddr2.isBytevc1();
                                aVar.f142686a.f142667h = k;
                                aVar.f142686a.f142669j = j4;
                                aVar.f142686a.f142670k = j2;
                                if (l2 != null) {
                                    aVar.f142686a.f142666g = l2;
                                } else {
                                    aVar.mo100872a(C62893b.f142630O);
                                }
                            } else {
                                aVar.mo100872a(C62893b.f142631P);
                            }
                        } else {
                            aVar.mo100872a(C62893b.f142632Q);
                        }
                        if (s != null) {
                            String g = s.mo81096g(true);
                            C89219l.m154721d(g, "");
                            aVar.f142686a.f142682w = g;
                        }
                        if (!(video == null || (playAddr = video.getPlayAddr()) == null)) {
                            aVar.f142686a.f142671l = (long) C80662ac.m139890b(playAddr);
                        }
                        C80998a aVar2 = new C80998a();
                        if (mo81174M().mo123918L() != null) {
                            mo81174M().mo123918L().mo124442a(str);
                            aVar2 = mo81174M().mo123918L().mo124442a(str);
                        }
                        C80999b bVar = new C80999b();
                        if (mo81174M().mo123918L() != null) {
                            mo81174M().mo123918L().mo124451b(str);
                            bVar = mo81174M().mo123918L().mo124451b(str);
                        }
                        aVar.f142686a.f142683x = aVar2.f181056a;
                        aVar.f142686a.f142684y = aVar2.f181057b;
                        aVar.f142686a.f142685z = aVar2.f181058c;
                        aVar.f142686a.f142646A = aVar2.f181059d;
                        aVar.f142686a.f142647B = aVar2.f181060e;
                        aVar.f142686a.f142648C = aVar2.f181061f;
                        aVar.f142686a.f142649D = aVar2.f181062g;
                        aVar.f142686a.f142650E = bVar;
                        C62893b bVar2 = aVar.f142686a;
                        if (bVar2.f142668i == 0 && (this.f113664aL.get(str) instanceof Integer)) {
                            bVar2.f142668i = this.f113664aL.get(str).intValue();
                        }
                        if (!C49286c.m92321a()) {
                            C89233z.C89238e eVar = new C89233z.C89238e();
                            eVar.element = (T) SmartFeedPreloadService.C60007b.f136663a.getPredictLabelResult();
                            C1731i.m5640b(new C62893b.CallableC62898e(bVar2, eVar), C39162r.m79452a());
                        }
                        MLCommonService.instance().onPlayStop(str, m92605a(mo81211w()), this.f113601d);
                    } else {
                        return;
                    }
                }
                this.f113643P = "";
                C67107d.C67108a.f150503a.mo105937b(EnumC67106c.PLAYER_STOP);
            }
        }
    }

    /* renamed from: a */
    private static void m92611a(Aweme aweme, AbstractC49849am amVar) {
        if (aweme != null && SmartFeedAdUIService.instance().enable()) {
            boolean z = false;
            if (amVar != null && !amVar.mo84708aP()) {
                z = true;
            }
            if (SmartFeedAdUIService.getDebug()) {
                if (amVar != null && (amVar instanceof AbstractC49815a)) {
                    amVar.mo81097i();
                }
                aweme.getAid();
            }
            if (!z) {
                SmartFeedAdUIService.instance().startSmartAdUIJudge(aweme);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.e.o$b */
    public class C49478b {

        /* renamed from: a */
        String f113785a;

        /* renamed from: b */
        int f113786b;

        static {
            Covode.recordClassIndex(58291);
        }

        C49478b(String str, int i) {
            this.f113785a = str;
            this.f113786b = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j, int i) {
        int a;
        Aweme a2 = m92605a(mo81211w());
        if (m92602U() && i == 100 && a2 != null && TextUtils.equals(str, a2.getAid())) {
            C63332a.C63333a.m114832a().mo101920a();
            C63332a.C63333a.m114832a().mo101921a(1);
        }
        AbstractC49849am s = mo81207s();
        if (C62933c.m113350c()) {
            if (C62890a.f142627a) {
                a = ((Number) C62933c.f142848f.getValue()).intValue();
            } else {
                a = C16048b.m29633a().mo25412a(true, "player_prerender_buffered_percent", 90);
            }
            if (i >= a && s != null && !s.mo84750bc()) {
                this.f113708bd = -1;
                m92607a(0, false, C62933c.m113352e());
            }
        }
    }

    public C49445o(String str, int i, AbstractC49849am amVar) {
        super(str, i);
        this.f113644S = new WeakReference<>(amVar);
        this.f113647V = -1;
        this.f113648W = new HashMap();
        this.f113649X = -1;
        this.f113650Y = -1;
        this.f113651Z = -1;
        this.f113657aE = 0.0d;
        try {
            this.f113641N = C52912c.f121688a.f121689b.getVideoPlayProgressCount().intValue();
        } catch (C16041a e) {
            e.printStackTrace();
        }
        this.f113637J = C16048b.m29633a().mo25412a(true, "player_ab_block_type", 0);
    }

    /* renamed from: a */
    private void m92607a(int i, boolean z, boolean z2) {
        Aweme i2;
        boolean z3;
        AbstractC49849am s = mo81207s();
        Aweme a = m92605a(mo81211w());
        if (s != null && a != null) {
            if (!z) {
                i2 = s.mo84854r(a);
            } else {
                i2 = s.mo84778i(a);
            }
            if (i2 != null && !TextUtils.equals(i2.getAid(), this.f113713bi)) {
                AbstractC48149ai a2 = mo81176a(i2.getAid());
                Video video = i2.getVideo();
                if (video != null && C62933c.m113360m()) {
                    video.setRationAndSourceId(i2.getAid());
                }
                if (a2 != null && a2.mo80225p().mo80233x() != null && a2.mo80225p().mo80233x().isValid() && video != null) {
                    if (C62933c.m113357j() && a.getVideo() != null && a.getVideo().getDuration() > C62933c.m113358k()) {
                        return;
                    }
                    if (!C62933c.m113356i() || video.getDuration() <= C62933c.m113358k()) {
                        int b = C80662ac.m139890b(video.getPlayAddr());
                        boolean z4 = true;
                        boolean z5 = false;
                        if (!C62933c.m113361n() || !C80662ac.m139888a(i2) || b < C62933c.m113362o() || b >= C62933c.m113353f()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z2 || b >= C62933c.m113353f() || z3) {
                            this.f113713bi = i2.getAid();
                            i2.getDesc();
                            this.f113634G.put(this.f113713bi, new C49478b(this.f113713bi, i));
                            if (i == 1 && !C62933c.m113354g()) {
                                i2.getDesc();
                                z4 = false;
                            }
                            if (!z3 || !C62933c.m113363p()) {
                                z5 = z4;
                            }
                            m92609a(i2, a2.mo80225p().mo80233x(), z5, a2.mo70617e());
                            this.f113714bj = null;
                            this.f113717bm = null;
                            this.f113715bk = null;
                            this.f113716bl = null;
                            return;
                        }
                        this.f113714bj = i2;
                        this.f113715bk = video.getPlayAddr();
                        this.f113716bl = a2.mo70617e();
                        this.f113717bm = a2.mo80225p().mo80233x();
                        i2.getAid();
                        this.f113714bj.getDesc();
                        VideoUrlModel videoUrlModel = this.f113715bk;
                        if (videoUrlModel != null) {
                            videoUrlModel.getBitRatedRatioUri();
                        }
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j, long j2) {
        float f;
        int i;
        String str2;
        if (j2 == 0) {
            f = 0.0f;
        } else {
            f = (((float) j) * 100.0f) / ((float) j2);
        }
        Aweme a = m92605a(mo81211w());
        AbstractC49849am s = mo81207s();
        if (a != null) {
            AbstractC48149ai w = mo81211w();
            if (w != null) {
                w.mo80225p().onPlayProgressChange(f);
                w.mo80225p().onPlayProgressChange(str, j, j2);
            }
            if (a.getVideoControl() != null && a.getVideoControl().showProgressBar == 1) {
                AbstractC81915c.m141874a(new C50458e(a, this.f113601d, this.f113602e, f, s));
            }
            if (C50539g.m94750d(a)) {
                AbstractC81915c.m141874a(new C50461g(a, Long.valueOf(j), Long.valueOf(j2)));
            }
            Video video = a.getVideo();
            if (video != null) {
                i = video.getDuration();
                if (i <= 0) {
                    return;
                }
            } else {
                i = 0;
            }
            double d = (double) ((((float) i) * (f / 100.0f)) / 1000.0f);
            if (this.f113640M < Math.floor(d) && s != null) {
                a.getAid();
                Math.floor(d);
            }
            this.f113640M = d;
            if (C49286c.m92321a() && s != null) {
                if (C49510c.m92748b()) {
                    str2 = "enter_background";
                } else {
                    str2 = "click_play";
                }
                String g = s.mo81096g(true);
                C89219l.m154721d(str2, "");
                if (g != null && C49615a.m93041a(a) && (!C89219l.m154714a((Object) str2, (Object) "click_play") || C49615a.f114164a)) {
                    C49615a.f114164a = false;
                    C49615a.m93039a(a, g, str2);
                }
            }
            this.f113673aU.mo80888a();
            if (m92602U()) {
                if (0 == j) {
                    this.f113656aD = true;
                }
                if (Math.abs(j2 - j) <= InteractFirstFrameTimeOutDurationSetting.DEFAULT && this.f113656aD) {
                    this.f113656aD = false;
                    C63332a.C63333a.m114832a().mo101921a(3);
                }
            }
        }
    }

    /* renamed from: a */
    private void m92608a(AbstractC48149ai aiVar, boolean z, int i) {
        IAdCardService c = AdCardServiceImpl.m75807c();
        if (c != null) {
            c.mo65444b().mo67546b(aiVar.mo80206b());
        }
        if (!C49625h.m93072a().f114194f) {
            Aweme b = aiVar.mo80206b();
            C38684bk.m78498a().f91392b = b;
            int i2 = 300;
            if (C80631v.m139799b(b) && !C80631v.m139798a(b)) {
                int c2 = C33265g.m68197c();
                if (C37699a.m76208K(b)) {
                    if (z) {
                        aiVar.mo80229t().mo65984q();
                    }
                    int showSeconds = C37699a.m76292e(b).getShowSeconds();
                    aiVar.mo80229t().mo65958a(Integer.valueOf(showSeconds));
                    if (c2 >= 0 || (c2 = showSeconds) >= 0) {
                        C38684bk a = C38684bk.m78498a();
                        if (c2 != 0) {
                            i2 = (c2 * 1000) + i;
                        }
                        a.mo67265a(i2, new RunnableC49482p(aiVar));
                        b.getAid();
                        m92652q();
                    }
                } else {
                    if (z) {
                        aiVar.mo80229t().mo65964b(mo81063i());
                    }
                    int i3 = 0;
                    if (C37699a.m76290d(b)) {
                        i3 = C37699a.m76292e(b).getShowSeconds();
                    } else if (C37699a.m76269ao(b)) {
                        i3 = b.getAwemeRawAd().getShowButtonSeconds();
                    }
                    aiVar.mo80229t().mo65958a(Integer.valueOf(i3));
                    if (c2 < 0) {
                        c2 = i3;
                    }
                    if (c2 > 0) {
                        C38684bk.m78498a().mo67265a((c2 * 1000) + i, new RunnableC49483q(aiVar));
                        b.getAid();
                        m92652q();
                    }
                }
            } else if (C37699a.m76210M(b)) {
                if (!C37699a.m76212O(b)) {
                    if (z) {
                        aiVar.mo80229t().mo65984q();
                    }
                    C38684bk.m78498a().mo67265a(300, new RunnableC49488v(aiVar));
                    b.getAid();
                    m92652q();
                } else {
                    return;
                }
            }
            if (C37699a.m76236aH(b) && z) {
                aiVar.mo80229t().mo65985r();
            }
            if (b != null && b.getFloatingCardInfo() != null && aiVar.mo80231v() != null) {
                b.getAid();
                m92652q();
            }
        }
    }

    /* renamed from: a */
    private void m92609a(Aweme aweme, Surface surface, boolean z, C48311ag agVar) {
        Audio.InfoIdType infoIdType;
        aweme.getDesc();
        if (!C37699a.m76251aW(aweme) && surface != null && surface.isValid() && !aweme.isLive()) {
            Video video = aweme.getVideo();
            Audio audio = aweme.getAudio();
            if (video != null && aweme.getVideo().getProperPlayAddr() != null) {
                video.setRationAndSourceId(aweme.getAid());
                C80775n.C80777b bVar = new C80775n.C80777b();
                bVar.mo123983a(C80942a.m140477a(video));
                bVar.f180650a.f180632k = surface;
                bVar.mo123994f(video.isNeedSetCookie());
                bVar.mo123995g(z);
                boolean a = C81078d.m140774a(aweme);
                bVar.mo123985a(Audio.convertToSimAudio(video, audio));
                if (a) {
                    infoIdType = Audio.InfoIdType.TRANSLATED;
                } else {
                    infoIdType = Audio.InfoIdType.ORIGINAL;
                }
                bVar.mo123990c(infoIdType.getInfoId());
                bVar.mo123984a(video.getVideoAdTag());
                bVar.mo124001m(false);
                C80713c a2 = C81078d.m140772a(video, true);
                if (a2 != null) {
                    bVar.mo123987b(a2.f180457b);
                    bVar.mo124000l(a2.f180456a);
                    bVar.mo123988b(a2.f180458c);
                }
                if (agVar != null) {
                    bVar.mo123989b(agVar.f111961a);
                }
                mo81174M().mo123938a(bVar.f180650a);
            }
        }
    }

    /* renamed from: b */
    private JSONObject m92625b(String str, AbstractC48149ai aiVar, long j, String str2, boolean z, boolean z2) {
        Aweme b;
        Video video;
        VideoUrlModel playAddr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List<BitRate> bitRate;
        int i7;
        if (aiVar == null || aiVar.mo80206b() == null || (video = (b = aiVar.mo80206b()).getVideo()) == null || (playAddr = video.getPlayAddr()) == null) {
            return null;
        }
        AbstractC49849am s = mo81207s();
        try {
            JSONObject b2 = RequestIdService.m70076a().mo60695b(aiVar.mo80206b(), this.f113602e);
            int i8 = 1;
            if (s != null) {
                b2.put("enter_from", s.mo81096g(true));
            }
            b2.put("duration", j);
            b2.put("position", mo81174M().mo123891n());
            b2.put("end_type", str2);
            b2.put("player_type", mo81174M().mo123877a().toString());
            b2.put("play_order", this.f113631D);
            b2.put("play_sess", mo81204c(this.f113632E));
            if (C80230ax.m139066a(C17867d.m33078a())) {
                i = 1;
            } else {
                i = 2;
            }
            b2.put("is_new_user", i);
            if (C37699a.m76314s(b)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            b2.put("is_ad", i2);
            if (C37699a.m76204G(b)) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            b2.put("is_splash", i3);
            if (C80662ac.m139889a(playAddr)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            b2.put("is_cache", i4);
            if (this.f113655aC) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            b2.put("is_first", i5);
            b2.put("video_duration", playAddr.getDuration());
            b2.put("start_t", m92638e(str) - m92645g(str));
            int i9 = -1;
            if (C80662ac.m139889a(playAddr)) {
                b2.put("cache_size", C80662ac.m139890b(playAddr) / 1024);
            } else {
                b2.put("cache_size", -1);
            }
            if (C62933c.m113355h()) {
                if (z2) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                b2.put("block_type", i7);
            }
            if (VideoBitRateABManager.f180314a.mo123829d()) {
                Integer a = C50542j.m94756a(playAddr);
                int b3 = C50542j.m94757b(playAddr);
                if (a == null && (bitRate = video.getBitRate()) != null) {
                    Iterator<BitRate> it = bitRate.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BitRate next = it.next();
                        if (!(next == null || next.getPlayAddr() == null || TextUtils.isEmpty(next.getPlayAddr().getUri()) || playAddr.getUri() == null || !playAddr.getUri().startsWith(next.getPlayAddr().getUri()))) {
                            a = Integer.valueOf(next.getBitRate());
                            b3 = next.getQualityType();
                            break;
                        }
                    }
                }
                if (a != null) {
                    i9 = a.intValue();
                }
                b2.put("video_bitrate", i9);
                b2.put("video_quality", b3);
                List<BitRate> bitRate2 = playAddr.getBitRate();
                if (bitRate2 != null && !bitRate2.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (BitRate bitRate3 : bitRate2) {
                        jSONArray.put(bitRate3.getGearName());
                    }
                    b2.put("bitrate_set", jSONArray);
                }
            }
            Session a2 = C84229a.f188297a.mo129046a();
            if (a2 != null) {
                if (a2.bytevc1) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                b2.put("is_bytevc1", i6);
            }
            b2.put("internet_speed", C84116g.m144637f());
            b2.put("group_id", C59208ac.m108771e(aiVar.mo80206b()));
            if (!z) {
                b2.put("drop_cnt", mo81174M().mo123888k());
            } else {
                C84224v m = C80937s.m140453b().mo124093m(C80942a.m140478a(playAddr));
                if (m != null) {
                    b2.put("request_info", m.toString());
                }
            }
            b2.put("video_size", String.valueOf(C80662ac.m139896d(playAddr)));
            if (!C49286c.m92321a()) {
                i8 = 0;
            }
            b2.put("is_audio_mode", String.valueOf(i8));
            return b2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
