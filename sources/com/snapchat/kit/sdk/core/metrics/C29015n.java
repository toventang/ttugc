package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Debug;
import com.bytedance.covode.number.Covode;
import com.snap.kit.common.model.DeviceEnvironmentInfo;
import com.snap.kit.common.model.OsType;
import com.snap.kit.common.model.Types;
import com.snap.kit.sdk.model.SnapKitStorySnapView;
import com.snap.kit.sdk.model.SnapKitStorySnapViews;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.p2069b.C28991a;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import p4640l.AbstractC89716b;
import p4640l.AbstractC89743d;
import p4640l.C89781l;

/* renamed from: com.snapchat.kit.sdk.core.metrics.n */
public final class C29015n implements MetricPublisher<SnapKitStorySnapView> {

    /* renamed from: a */
    private final SharedPreferences f68536a;

    /* renamed from: b */
    private final MetricsClient f68537b;

    /* renamed from: c */
    private final C28991a f68538c;

    /* renamed from: d */
    private final String f68539d;

    static {
        Covode.recordClassIndex(35341);
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final List<C29005d<SnapKitStorySnapView>> getPersistedEvents() {
        return this.f68538c.mo50363a(SnapKitStorySnapView.ADAPTER, this.f68536a.getString("unsent_snap_view_events", null));
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void persistMetrics(List<C29005d<SnapKitStorySnapView>> list) {
        this.f68536a.edit().putString("unsent_snap_view_events", this.f68538c.mo50362a(list)).apply();
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void publishMetrics(List<SnapKitStorySnapView> list, final MetricPublisher.PublishCallback publishCallback) {
        String str;
        Types.Trilean trilean;
        MetricsClient metricsClient = this.f68537b;
        SnapKitStorySnapViews.Builder views = new SnapKitStorySnapViews.Builder().views(list);
        DeviceEnvironmentInfo.Builder os_type = new DeviceEnvironmentInfo.Builder().os_type(OsType.Enum.ANDROID);
        String str2 = "";
        if (Build.VERSION.RELEASE == null) {
            str = str2;
        } else {
            str = Build.VERSION.RELEASE;
        }
        DeviceEnvironmentInfo.Builder target_architecture = os_type.os_version(str).model(Build.MODEL).target_architecture(System.getProperty("os.arch"));
        Locale locale = Locale.getDefault();
        if (locale != null) {
            str2 = locale.toString();
        }
        DeviceEnvironmentInfo.Builder locale2 = target_architecture.locale(str2);
        if (Debug.isDebuggerConnected()) {
            trilean = Types.Trilean.TRUE;
        } else {
            trilean = Types.Trilean.FALSE;
        }
        metricsClient.postViewEvents(views.device_environment_info(locale2.running_with_debugger_attached(trilean).running_in_tests(Types.Trilean.NONE).running_in_simulator(Types.Trilean.NONE).is_app_prerelease(Types.Trilean.NONE).build()).client_id(this.f68539d).build()).mo144268a(new AbstractC89743d<Void>() {
            /* class com.snapchat.kit.sdk.core.metrics.C29015n.C290161 */

            static {
                Covode.recordClassIndex(35342);
            }

            @Override // p4640l.AbstractC89743d
            /* renamed from: a */
            public final void mo34286a(AbstractC89716b<Void> bVar, Throwable th) {
                if (th instanceof IOException) {
                    publishCallback.onNetworkError();
                } else {
                    publishCallback.onServerError(new Error(th));
                }
            }

            @Override // p4640l.AbstractC89743d
            /* renamed from: a */
            public final void mo34287a(AbstractC89716b<Void> bVar, C89781l<Void> lVar) {
                if (lVar.f203560a.mo144720a()) {
                    publishCallback.onSuccess();
                    return;
                }
                try {
                    publishCallback.onServerError(new Error(lVar.f203562c.string()));
                } catch (IOException | NullPointerException unused) {
                    publishCallback.onServerError(new Error("response unsuccessful"));
                }
            }
        });
    }

    C29015n(SharedPreferences sharedPreferences, MetricsClient metricsClient, C28991a aVar, String str) {
        this.f68536a = sharedPreferences;
        this.f68537b = metricsClient;
        this.f68538c = aVar;
        this.f68539d = str;
    }
}
