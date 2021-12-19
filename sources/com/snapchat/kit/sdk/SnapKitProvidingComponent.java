package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.snap.kit.sdk.model.SnapKitStorySnapView;
import com.snapchat.kit.sdk.core.controller.FirebaseStateController;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.p2070c.C28995a;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.C29025a;
import com.snapchat.kit.sdk.core.networking.FirebaseTokenManager;

public interface SnapKitProvidingComponent {
    static {
        Covode.recordClassIndex(35118);
    }

    MetricQueue<ServerEvent> analyticsEventQueue();

    C29025a apiFactory();

    AuthTokenManager authTokenManager();

    String clientId();

    Context context();

    FirebaseStateController firebaseStateController();

    FirebaseTokenManager firebaseTokenManager();

    C27910f gson();

    C28995a kitEventBaseFactory();

    KitPluginType kitPluginType();

    LoginStateController loginStateController();

    MetricQueue<OpMetric> operationalMetricsQueue();

    String redirectUrl();

    boolean sdkIsFromReactNativePlugin();

    SharedPreferences sharedPreferences();

    SnapKitAppLifecycleObserver snapKitAppLifecycleObserver();

    MetricQueue<SnapKitStorySnapView> snapViewEventQueue();
}
