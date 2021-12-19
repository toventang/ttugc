package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.measurement.internal.AbstractC26438hi;
import com.google.android.gms.measurement.internal.C26381ff;
import com.google.android.gms.measurement.internal.C26403ga;
import com.google.android.gms.measurement.internal.C26409gg;
import com.google.android.gms.measurement.internal.C26413gk;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AppMeasurement {

    /* renamed from: a */
    private static volatile AppMeasurement f61664a;

    /* renamed from: b */
    private final C26381ff f61665b;

    /* renamed from: c */
    private final AbstractC26438hi f61666c;

    /* renamed from: d */
    private final boolean f61667d;

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public static final class C26236a extends C26409gg {
        static {
            Covode.recordClassIndex(31654);
        }
    }

    static {
        Covode.recordClassIndex(31652);
    }

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        static {
            Covode.recordClassIndex(31653);
        }

        public ConditionalUserProperty() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Bundle mo42973a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString(StringSet.name, str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C26403ga.m51975a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        ConditionalUserProperty(Bundle bundle) {
            C25565r.m49314a(bundle);
            this.mAppId = (String) C26403ga.m51974a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C26403ga.m51974a(bundle, "origin", String.class, null);
            this.mName = (String) C26403ga.m51974a(bundle, StringSet.name, String.class, null);
            this.mValue = C26403ga.m51974a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C26403ga.m51974a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C26403ga.m51974a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C26403ga.m51974a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C26403ga.m51974a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C26403ga.m51974a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C26403ga.m51974a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C26403ga.m51974a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C26403ga.m51974a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C26403ga.m51974a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C26403ga.m51974a(bundle, "active", Boolean.class, false)).booleanValue();
            this.mCreationTimestamp = ((Long) C26403ga.m51974a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C26403ga.m51974a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public long generateEventId() {
        if (this.f61667d) {
            return this.f61666c.mo43365e();
        }
        return this.f61665b.mo43256e().mo43547f();
    }

    public String getAppInstanceId() {
        if (this.f61667d) {
            return this.f61666c.mo43363c();
        }
        return this.f61665b.mo43255d().mo43317x();
    }

    public String getCurrentScreenClass() {
        if (this.f61667d) {
            return this.f61666c.mo43359b();
        }
        return this.f61665b.mo43255d().mo43295A();
    }

    public String getCurrentScreenName() {
        if (this.f61667d) {
            return this.f61666c.mo43353a();
        }
        return this.f61665b.mo43255d().mo43319z();
    }

    public String getGmpAppId() {
        if (this.f61667d) {
            return this.f61666c.mo43364d();
        }
        return this.f61665b.mo43255d().mo43296B();
    }

    public static AppMeasurement getInstance(Context context) {
        return m51367a(context);
    }

    private AppMeasurement(C26381ff ffVar) {
        C25565r.m49314a(ffVar);
        this.f61665b = ffVar;
        this.f61666c = null;
        this.f61667d = false;
    }

    private AppMeasurement(AbstractC26438hi hiVar) {
        C25565r.m49314a(hiVar);
        this.f61666c = hiVar;
        this.f61665b = null;
        this.f61667d = true;
    }

    public void beginAdUnitExposure(String str) {
        if (this.f61667d) {
            this.f61666c.mo43357a(str);
        } else {
            this.f61665b.mo43263n().mo42997a(str, this.f61665b.mo43011l().mo41858b());
        }
    }

    public void endAdUnitExposure(String str) {
        if (this.f61667d) {
            this.f61666c.mo43360b(str);
        } else {
            this.f61665b.mo43263n().mo43001b(str, this.f61665b.mo43011l().mo41858b());
        }
    }

    public int getMaxUserProperties(String str) {
        if (this.f61667d) {
            return this.f61666c.mo43362c(str);
        }
        this.f61665b.mo43255d();
        C25565r.m49316a(str);
        return 25;
    }

    /* renamed from: b */
    private static AbstractC26438hi m51368b(Context context) {
        try {
            return (AbstractC26438hi) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C25565r.m49314a(conditionalUserProperty);
        if (this.f61667d) {
            this.f61666c.mo43356a(conditionalUserProperty.mo42973a());
            return;
        }
        C26413gk d = this.f61665b.mo43255d();
        d.mo43299a(conditionalUserProperty.mo42973a(), d.mo43011l().mo41857a());
    }

    /* access modifiers changed from: protected */
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        C25565r.m49314a(conditionalUserProperty);
        if (!this.f61667d) {
            C26413gk d = this.f61665b.mo43255d();
            Bundle a = conditionalUserProperty.mo42973a();
            C25565r.m49314a(a);
            C25565r.m49316a(a.getString("app_id"));
            d.mo42994a();
            d.mo43312b(new Bundle(a), d.mo43011l().mo41857a());
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: a */
    private static AppMeasurement m51367a(Context context) {
        MethodCollector.m26663i(4165);
        if (f61664a == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f61664a == null) {
                        AbstractC26438hi b = m51368b(context);
                        if (b != null) {
                            f61664a = new AppMeasurement(b);
                        } else {
                            f61664a = new AppMeasurement(C26381ff.m51900a(context, new zzae(0, 0, true, null, null, null, null), null));
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4165);
                    throw th;
                }
            }
        }
        AppMeasurement appMeasurement = f61664a;
        MethodCollector.m26664o(4165);
        return appMeasurement;
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> a;
        int size;
        if (this.f61667d) {
            a = this.f61666c.mo43354a(str, str2);
        } else {
            a = this.f61665b.mo43255d().mo43297a((String) null, str, str2);
        }
        if (a == null) {
            size = 0;
        } else {
            size = a.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : a) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f61667d) {
            this.f61666c.mo43361b(str, str2, bundle);
        } else {
            this.f61665b.mo43255d().mo43315c(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.f61667d) {
            return this.f61666c.mo43355a(str, str2, z);
        }
        return this.f61665b.mo43255d().mo43298a((String) null, str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f61667d) {
            this.f61666c.mo43358a(str, str2, bundle);
        } else {
            this.f61665b.mo43255d().mo43305a(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        int size;
        if (!this.f61667d) {
            C26413gk d = this.f61665b.mo43255d();
            C25565r.m49316a(str);
            d.mo42994a();
            ArrayList<Bundle> a = d.mo43297a(str, str2, str3);
            int i = 0;
            if (a == null) {
                size = 0;
            } else {
                size = a.size();
            }
            ArrayList arrayList = new ArrayList(size);
            int size2 = a.size();
            while (i < size2) {
                Bundle bundle = a.get(i);
                i++;
                arrayList.add(new ConditionalUserProperty(bundle));
            }
            return arrayList;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: protected */
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (!this.f61667d) {
            C26413gk d = this.f61665b.mo43255d();
            C25565r.m49316a(str);
            d.mo42994a();
            d.mo43310a(str, str2, str3, bundle);
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (!this.f61667d) {
            C26413gk d = this.f61665b.mo43255d();
            C25565r.m49316a(str);
            d.mo42994a();
            return d.mo43298a(str, str2, str3, z);
        }
        throw new IllegalStateException("Unexpected call on client side");
    }
}
