package com.snapchat.kit.sdk;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.snapchat.kit.sdk.core.config.ServerSampleRateCallback;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.DailySessionBucket;
import com.snapchat.kit.sdk.core.metrics.model.LoginRoute;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import com.snapchat.kit.sdk.core.metrics.skate.C29021c;
import com.snapchat.kit.sdk.core.p2067a.C28956d;
import com.snapchat.kit.sdk.core.p2067a.C28957e;
import java.util.Calendar;
import java.util.Date;

public class SnapKitAppLifecycleObserver implements AbstractC33974au {

    /* renamed from: a */
    private C29021c f68365a;

    static {
        Covode.recordClassIndex(35115);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onEnterForeground();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onEnterForeground() {
        C28956d dVar;
        Date date = new Date();
        C29021c cVar = this.f68365a;
        C28956d a = cVar.f68559b.mo50686a();
        Calendar instance = Calendar.getInstance(cVar.f68561d.f68394a);
        instance.setTime(date);
        long j = (long) instance.get(5);
        Calendar instance2 = Calendar.getInstance(cVar.f68561d.f68394a);
        instance2.setTime(date);
        long j2 = (long) (instance2.get(2) + 1);
        Calendar instance3 = Calendar.getInstance(cVar.f68561d.f68394a);
        instance3.setTime(date);
        C28957e eVar = new C28957e(j, j2, (long) instance3.get(1));
        if (a != null) {
            C28957e eVar2 = a.f68419a;
            if (eVar.f68421a == eVar2.f68421a && eVar.mo50313a(eVar2)) {
                a.f68420b++;
                dVar = a;
                cVar.f68559b.f68569a.edit().putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateDay", dVar.f68419a.f68421a).putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateMonth", dVar.f68419a.f68422b).putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateYear", dVar.f68419a.f68423c).putInt("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateCount", dVar.f68420b).apply();
                cVar.f68558a.mo50322a(new ServerSampleRateCallback(a, dVar) {
                    /* class com.snapchat.kit.sdk.core.metrics.skate.C29021c.C290221 */

                    /* renamed from: a */
                    final /* synthetic */ C28956d f68566a;

                    /* renamed from: b */
                    final /* synthetic */ C28956d f68567b;

                    static {
                        Covode.recordClassIndex(35349);
                    }

                    @Override // com.snapchat.kit.sdk.core.config.ServerSampleRateCallback
                    public final void onServerSampleRateFailure() {
                    }

                    @Override // com.snapchat.kit.sdk.core.config.ServerSampleRateCallback
                    public final void onServerSampleRateAvailable(double d) {
                        boolean z;
                        DailySessionBucket dailySessionBucket;
                        if (d > C29021c.this.f68559b.mo50687b()) {
                            MetricQueue<SkateEvent> metricQueue = C29021c.this.f68560c;
                            C29021c cVar = C29021c.this;
                            C28956d dVar = this.f68566a;
                            C28956d dVar2 = this.f68567b;
                            C28957e eVar = dVar2.f68419a;
                            if (dVar == null || !dVar.f68419a.mo50313a(eVar)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            SkateEvent.Builder builder = new SkateEvent.Builder();
                            switch (dVar2.f68420b) {
                                case 1:
                                    dailySessionBucket = DailySessionBucket.ONE_SESSION;
                                    break;
                                case 2:
                                    dailySessionBucket = DailySessionBucket.TWO_SESSION;
                                    break;
                                case 3:
                                    dailySessionBucket = DailySessionBucket.THREE_SESSION;
                                    break;
                                case 4:
                                    dailySessionBucket = DailySessionBucket.FOUR_SESSION;
                                    break;
                                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                    dailySessionBucket = DailySessionBucket.FIVE_SESSION;
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                    dailySessionBucket = DailySessionBucket.SIX_SESSION;
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                    dailySessionBucket = DailySessionBucket.SEVEN_SESSION;
                                    break;
                                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                    dailySessionBucket = DailySessionBucket.EIGHT_SESSION;
                                    break;
                                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                    dailySessionBucket = DailySessionBucket.NINE_SESSION;
                                    break;
                                default:
                                    dailySessionBucket = DailySessionBucket.TEN_OR_MORE_SESSION;
                                    break;
                            }
                            SkateEvent.Builder core_version = builder.daily_session_bucket(dailySessionBucket).day(Long.valueOf(eVar.f68421a)).month(Long.valueOf(eVar.f68422b)).year(Long.valueOf(eVar.f68423c)).is_first_within_month(Boolean.valueOf(z)).sample_rate(Double.valueOf(d)).snap_kit_init_type(cVar.f68563f).kit_plugin_type(cVar.f68564g).is_from_react_native_plugin(Boolean.valueOf(cVar.f68565h)).core_version("1.12.0");
                            String string = cVar.f68559b.f68569a.getString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVariants", null);
                            if (!TextUtils.isEmpty(string)) {
                                core_version.kit_variants_string_list(string);
                            }
                            String string2 = cVar.f68559b.f68569a.getString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVersions", null);
                            if (!TextUtils.isEmpty(string2)) {
                                core_version.kit_version_string_list(string2);
                            }
                            if (cVar.f68562e.isUserLoggedIn()) {
                                core_version.login_route(LoginRoute.LOGIN_ROUTE);
                            }
                            metricQueue.push(core_version.build());
                        }
                    }

                    {
                        this.f68566a = r2;
                        this.f68567b = r3;
                    }
                });
            }
        }
        dVar = new C28956d(eVar, 1);
        cVar.f68559b.f68569a.edit().putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateDay", dVar.f68419a.f68421a).putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateMonth", dVar.f68419a.f68422b).putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateYear", dVar.f68419a.f68423c).putInt("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateCount", dVar.f68420b).apply();
        cVar.f68558a.mo50322a(new ServerSampleRateCallback(a, dVar) {
            /* class com.snapchat.kit.sdk.core.metrics.skate.C29021c.C290221 */

            /* renamed from: a */
            final /* synthetic */ C28956d f68566a;

            /* renamed from: b */
            final /* synthetic */ C28956d f68567b;

            static {
                Covode.recordClassIndex(35349);
            }

            @Override // com.snapchat.kit.sdk.core.config.ServerSampleRateCallback
            public final void onServerSampleRateFailure() {
            }

            @Override // com.snapchat.kit.sdk.core.config.ServerSampleRateCallback
            public final void onServerSampleRateAvailable(double d) {
                boolean z;
                DailySessionBucket dailySessionBucket;
                if (d > C29021c.this.f68559b.mo50687b()) {
                    MetricQueue<SkateEvent> metricQueue = C29021c.this.f68560c;
                    C29021c cVar = C29021c.this;
                    C28956d dVar = this.f68566a;
                    C28956d dVar2 = this.f68567b;
                    C28957e eVar = dVar2.f68419a;
                    if (dVar == null || !dVar.f68419a.mo50313a(eVar)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    SkateEvent.Builder builder = new SkateEvent.Builder();
                    switch (dVar2.f68420b) {
                        case 1:
                            dailySessionBucket = DailySessionBucket.ONE_SESSION;
                            break;
                        case 2:
                            dailySessionBucket = DailySessionBucket.TWO_SESSION;
                            break;
                        case 3:
                            dailySessionBucket = DailySessionBucket.THREE_SESSION;
                            break;
                        case 4:
                            dailySessionBucket = DailySessionBucket.FOUR_SESSION;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            dailySessionBucket = DailySessionBucket.FIVE_SESSION;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            dailySessionBucket = DailySessionBucket.SIX_SESSION;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            dailySessionBucket = DailySessionBucket.SEVEN_SESSION;
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            dailySessionBucket = DailySessionBucket.EIGHT_SESSION;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            dailySessionBucket = DailySessionBucket.NINE_SESSION;
                            break;
                        default:
                            dailySessionBucket = DailySessionBucket.TEN_OR_MORE_SESSION;
                            break;
                    }
                    SkateEvent.Builder core_version = builder.daily_session_bucket(dailySessionBucket).day(Long.valueOf(eVar.f68421a)).month(Long.valueOf(eVar.f68422b)).year(Long.valueOf(eVar.f68423c)).is_first_within_month(Boolean.valueOf(z)).sample_rate(Double.valueOf(d)).snap_kit_init_type(cVar.f68563f).kit_plugin_type(cVar.f68564g).is_from_react_native_plugin(Boolean.valueOf(cVar.f68565h)).core_version("1.12.0");
                    String string = cVar.f68559b.f68569a.getString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVariants", null);
                    if (!TextUtils.isEmpty(string)) {
                        core_version.kit_variants_string_list(string);
                    }
                    String string2 = cVar.f68559b.f68569a.getString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVersions", null);
                    if (!TextUtils.isEmpty(string2)) {
                        core_version.kit_version_string_list(string2);
                    }
                    if (cVar.f68562e.isUserLoggedIn()) {
                        core_version.login_route(LoginRoute.LOGIN_ROUTE);
                    }
                    metricQueue.push(core_version.build());
                }
            }

            {
                this.f68566a = r2;
                this.f68567b = r3;
            }
        });
    }

    SnapKitAppLifecycleObserver(C29021c cVar) {
        this.f68365a = cVar;
    }
}
