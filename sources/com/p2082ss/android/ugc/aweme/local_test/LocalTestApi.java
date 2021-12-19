package com.p2082ss.android.ugc.aweme.local_test;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16498g;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.local_test.p3422b.AbstractC58943b;
import com.p2082ss.android.ugc.aweme.local_test.p3422b.AbstractC58944c;
import com.p2082ss.android.ugc.aweme.service.AbstractC67850d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.local_test.LocalTestApi */
public interface LocalTestApi {
    static {
        Covode.recordClassIndex(69258);
    }

    String appendDeviceId(String str);

    boolean enableBoe();

    boolean enableBoeJsbBypass();

    boolean enableDeeplinkIntercept();

    boolean enableLynxSec();

    boolean enablePpe();

    boolean enableWebHttps();

    AbstractC58943b getAccountDebugService();

    List<String> getBoeBypassHostList();

    List<String> getBoeBypassPathList();

    String getBoeLane();

    void getDebugUrlMessage(Context context, String str, String str2);

    AbstractC58264w getInitBoeTask();

    List<String> getJsbSafeHost();

    String getPPELane();

    AbstractC58944c getResFakerService();

    AbstractC67850d getSpecActDebugService();

    Resources getTranslationProxyResource(Resources resources);

    AbstractC16498g getWebViewLoadUrlInterceptorDelegate();

    void initTranslationHotSwap(Context context);

    boolean isPPEEnable();

    void jumpToMessageDebugActivity(Context context, String str, String str2);

    boolean lynxDevToolDebugEnable();

    boolean shouldBulletShowDebugTagView();

    void showDeeplinkInterceptorRemind(String str, String str2);
}
