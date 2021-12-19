package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.measurement.AbstractBinderC26219ow;
import com.google.android.gms.internal.measurement.AbstractC25830b;
import com.google.android.gms.internal.measurement.AbstractC25857c;
import com.google.android.gms.internal.measurement.AbstractC26221oy;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.p1934b.AbstractC25324a;
import com.google.android.gms.p1934b.BinderC25327b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class AppMeasurementDynamiteService extends AbstractBinderC26219ow {

    /* renamed from: a */
    C26381ff f61672a;

    /* renamed from: b */
    private Map<Integer, AbstractC26411gi> f61673b = new C0484a();

    static {
        Covode.recordClassIndex(31659);
    }

    /* renamed from: a */
    private final void m51379a() {
        if (this.f61672a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void initForTests(Map map) {
        m51379a();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setInstanceIdProvider(AbstractC25857c cVar) {
        m51379a();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void generateEventId(AbstractC26221oy oyVar) {
        m51379a();
        this.f61672a.mo43256e().mo43527a(oyVar, this.f61672a.mo43256e().mo43547f());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void getAppInstanceId(AbstractC26221oy oyVar) {
        m51379a();
        this.f61672a.mo43015p().mo43220a(new RunnableC26405gc(this, oyVar));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void getCachedAppInstanceId(AbstractC26221oy oyVar) {
        m51379a();
        m51380a(oyVar, this.f61672a.mo43255d().mo43317x());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void getCurrentScreenClass(AbstractC26221oy oyVar) {
        m51379a();
        m51380a(oyVar, this.f61672a.mo43255d().mo43295A());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void getCurrentScreenName(AbstractC26221oy oyVar) {
        m51379a();
        m51380a(oyVar, this.f61672a.mo43255d().mo43319z());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void getGmpAppId(AbstractC26221oy oyVar) {
        m51379a();
        m51380a(oyVar, this.f61672a.mo43255d().mo43296B());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void isDataCollectionEnabled(AbstractC26221oy oyVar) {
        m51379a();
        this.f61672a.mo43015p().mo43220a(new RunnableC26487jd(this, oyVar));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void resetAnalyticsData(long j) {
        m51379a();
        C26413gk d = this.f61672a.mo43255d();
        d.mo43302a((String) null);
        d.mo43015p().mo43220a(new RunnableC26420gr(d, j));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setDataCollectionEnabled(boolean z) {
        m51379a();
        C26413gk d = this.f61672a.mo43255d();
        d.mo43243D();
        d.mo43015p().mo43220a(new RunnableC26430ha(d, z));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        m51379a();
        C26413gk d = this.f61672a.mo43255d();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        d.mo43015p().mo43220a(new RunnableC26412gj(d, bundle2));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setEventInterceptor(AbstractC25830b bVar) {
        m51379a();
        C26413gk d = this.f61672a.mo43255d();
        C26239b bVar2 = new C26239b(bVar);
        d.mo43243D();
        d.mo43015p().mo43220a(new RunnableC26419gq(d, bVar2));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setMinimumSessionDuration(long j) {
        m51379a();
        C26413gk d = this.f61672a.mo43255d();
        d.mo43015p().mo43220a(new RunnableC26433hd(d, j));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setSessionTimeoutDuration(long j) {
        m51379a();
        C26413gk d = this.f61672a.mo43255d();
        d.mo43015p().mo43220a(new RunnableC26417go(d, j));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void registerOnMeasurementEventListener(AbstractC25830b bVar) {
        m51379a();
        AbstractC26411gi giVar = this.f61673b.get(Integer.valueOf(bVar.mo42184a()));
        if (giVar == null) {
            giVar = new C26238a(bVar);
            this.f61673b.put(Integer.valueOf(bVar.mo42184a()), giVar);
        }
        this.f61672a.mo43255d().mo43301a(giVar);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void unregisterOnMeasurementEventListener(AbstractC25830b bVar) {
        m51379a();
        AbstractC26411gi remove = this.f61673b.remove(Integer.valueOf(bVar.mo42184a()));
        if (remove == null) {
            remove = new C26238a(bVar);
        }
        this.f61672a.mo43255d().mo43313b(remove);
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    class C26238a implements AbstractC26411gi {

        /* renamed from: a */
        private AbstractC25830b f61674a;

        static {
            Covode.recordClassIndex(31660);
        }

        C26238a(AbstractC25830b bVar) {
            this.f61674a = bVar;
        }

        @Override // com.google.android.gms.measurement.internal.AbstractC26411gi
        /* renamed from: a */
        public final void mo42992a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f61674a.mo42185a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f61672a.mo43016q().f61830f.mo43170a("Event listener threw exception", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    class C26239b implements AbstractC26408gf {

        /* renamed from: a */
        private AbstractC25830b f61676a;

        static {
            Covode.recordClassIndex(31661);
        }

        C26239b(AbstractC25830b bVar) {
            this.f61676a = bVar;
        }

        @Override // com.google.android.gms.measurement.internal.AbstractC26408gf
        /* renamed from: a */
        public final void mo42993a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f61676a.mo42185a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f61672a.mo43016q().f61830f.mo43170a("Event interceptor threw exception", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void beginAdUnitExposure(String str, long j) {
        m51379a();
        this.f61672a.mo43263n().mo42997a(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void endAdUnitExposure(String str, long j) {
        m51379a();
        this.f61672a.mo43263n().mo43001b(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setMeasurementEnabled(boolean z, long j) {
        m51379a();
        this.f61672a.mo43255d().mo43311a(z);
    }

    /* renamed from: a */
    private final void m51380a(AbstractC26221oy oyVar, String str) {
        this.f61672a.mo43256e().mo43529a(oyVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void getMaxUserProperties(String str, AbstractC26221oy oyVar) {
        m51379a();
        this.f61672a.mo43255d();
        C25565r.m49316a(str);
        this.f61672a.mo43256e().mo43526a(oyVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void onActivityDestroyed(AbstractC25324a aVar, long j) {
        m51379a();
        C26436hg hgVar = this.f61672a.mo43255d().f62100a;
        if (hgVar != null) {
            this.f61672a.mo43255d().mo43316w();
            hgVar.onActivityDestroyed((Activity) BinderC25327b.m48695a(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void onActivityPaused(AbstractC25324a aVar, long j) {
        m51379a();
        C26436hg hgVar = this.f61672a.mo43255d().f62100a;
        if (hgVar != null) {
            this.f61672a.mo43255d().mo43316w();
            hgVar.onActivityPaused((Activity) BinderC25327b.m48695a(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void onActivityResumed(AbstractC25324a aVar, long j) {
        m51379a();
        C26436hg hgVar = this.f61672a.mo43255d().f62100a;
        if (hgVar != null) {
            this.f61672a.mo43255d().mo43316w();
            hgVar.onActivityResumed((Activity) BinderC25327b.m48695a(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void onActivityStarted(AbstractC25324a aVar, long j) {
        m51379a();
        C26436hg hgVar = this.f61672a.mo43255d().f62100a;
        if (hgVar != null) {
            this.f61672a.mo43255d().mo43316w();
            hgVar.onActivityStarted((Activity) BinderC25327b.m48695a(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void onActivityStopped(AbstractC25324a aVar, long j) {
        m51379a();
        C26436hg hgVar = this.f61672a.mo43255d().f62100a;
        if (hgVar != null) {
            this.f61672a.mo43255d().mo43316w();
            hgVar.onActivityStopped((Activity) BinderC25327b.m48695a(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setConditionalUserProperty(Bundle bundle, long j) {
        m51379a();
        if (bundle == null) {
            this.f61672a.mo43016q().f61827c.mo43169a("Conditional user property must not be null");
        } else {
            this.f61672a.mo43255d().mo43299a(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setUserId(String str, long j) {
        m51379a();
        this.f61672a.mo43255d().mo43309a(null, "_id", str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void getTestFlag(AbstractC26221oy oyVar, int i) {
        m51379a();
        if (i == 0) {
            C26510jz e = this.f61672a.mo43256e();
            C26413gk d = this.f61672a.mo43255d();
            AtomicReference atomicReference = new AtomicReference();
            e.mo43529a(oyVar, (String) d.mo43015p().mo43218a(atomicReference, 15000, "String test flag value", new RunnableC26424gv(d, atomicReference)));
        } else if (i == 1) {
            C26510jz e2 = this.f61672a.mo43256e();
            C26413gk d2 = this.f61672a.mo43255d();
            AtomicReference atomicReference2 = new AtomicReference();
            e2.mo43527a(oyVar, ((Long) d2.mo43015p().mo43218a(atomicReference2, 15000, "long test flag value", new RunnableC26425gw(d2, atomicReference2))).longValue());
        } else if (i == 2) {
            C26510jz e3 = this.f61672a.mo43256e();
            C26413gk d3 = this.f61672a.mo43255d();
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) d3.mo43015p().mo43218a(atomicReference3, 15000, "double test flag value", new RunnableC26427gy(d3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                oyVar.mo42912a(bundle);
            } catch (RemoteException e4) {
                e3.f62077z.mo43016q().f61830f.mo43170a("Error returning double value to wrapper", e4);
            }
        } else if (i == 3) {
            C26510jz e5 = this.f61672a.mo43256e();
            C26413gk d4 = this.f61672a.mo43255d();
            AtomicReference atomicReference4 = new AtomicReference();
            e5.mo43526a(oyVar, ((Integer) d4.mo43015p().mo43218a(atomicReference4, 15000, "int test flag value", new RunnableC26428gz(d4, atomicReference4))).intValue());
        } else if (i == 4) {
            C26510jz e6 = this.f61672a.mo43256e();
            C26413gk d5 = this.f61672a.mo43255d();
            AtomicReference atomicReference5 = new AtomicReference();
            e6.mo43531a(oyVar, ((Boolean) d5.mo43015p().mo43218a(atomicReference5, 15000, "boolean test flag value", new RunnableC26414gl(d5, atomicReference5))).booleanValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void performAction(Bundle bundle, AbstractC26221oy oyVar, long j) {
        m51379a();
        oyVar.mo42912a(null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m51379a();
        this.f61672a.mo43255d().mo43315c(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void getConditionalUserProperties(String str, String str2, AbstractC26221oy oyVar) {
        m51379a();
        this.f61672a.mo43015p().mo43220a(new RunnableC26513kb(this, oyVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void onActivityCreated(AbstractC25324a aVar, Bundle bundle, long j) {
        m51379a();
        C26436hg hgVar = this.f61672a.mo43255d().f62100a;
        if (hgVar != null) {
            this.f61672a.mo43255d().mo43316w();
            hgVar.onActivityCreated((Activity) BinderC25327b.m48695a(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void initialize(AbstractC25324a aVar, zzae zzae, long j) {
        Context context = (Context) BinderC25327b.m48695a(aVar);
        C26381ff ffVar = this.f61672a;
        if (ffVar == null) {
            this.f61672a = C26381ff.m51900a(context, zzae, Long.valueOf(j));
        } else {
            ffVar.mo43016q().f61830f.mo43169a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void onActivitySaveInstanceState(AbstractC25324a aVar, AbstractC26221oy oyVar, long j) {
        m51379a();
        C26436hg hgVar = this.f61672a.mo43255d().f62100a;
        Bundle bundle = new Bundle();
        if (hgVar != null) {
            this.f61672a.mo43255d().mo43316w();
            hgVar.onActivitySaveInstanceState((Activity) BinderC25327b.m48695a(aVar), bundle);
        }
        try {
            oyVar.mo42912a(bundle);
        } catch (RemoteException e) {
            this.f61672a.mo43016q().f61830f.mo43170a("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void getUserProperties(String str, String str2, boolean z, AbstractC26221oy oyVar) {
        m51379a();
        this.f61672a.mo43015p().mo43220a(new RunnableC26432hc(this, oyVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setCurrentScreen(AbstractC25324a aVar, String str, String str2, long j) {
        String str3;
        m51379a();
        C26446hq h = this.f61672a.mo43259h();
        Activity activity = (Activity) BinderC25327b.m48695a(aVar);
        if (!h.mo43018s().mo43647h().booleanValue()) {
            h.mo43016q().f61832h.mo43169a("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (h.f62198a == null) {
            h.mo43016q().f61832h.mo43169a("setCurrentScreen cannot be called while no activity active");
        } else if (h.f62201d.get(activity) == null) {
            h.mo43016q().f61832h.mo43169a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = C26446hq.m52083a(activity.getClass().getCanonicalName());
            }
            boolean c = C26510jz.m52405c(h.f62198a.f62188b, str2);
            boolean c2 = C26510jz.m52405c(h.f62198a.f62187a, str);
            if (c && c2) {
                h.mo43016q().f61832h.mo43169a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                h.mo43016q().f61832h.mo43170a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                C26353ee eeVar = h.mo43016q().f61835k;
                if (str == null) {
                    str3 = "null";
                } else {
                    str3 = str;
                }
                eeVar.mo43171a("Setting current screen to name, class", str3, str2);
                C26443hn hnVar = new C26443hn(str, str2, h.mo43014o().mo43547f());
                h.f62201d.put(activity, hnVar);
                h.mo43373a(activity, hnVar, true);
            } else {
                h.mo43016q().f61832h.mo43170a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void setUserProperty(String str, String str2, AbstractC25324a aVar, boolean z, long j) {
        m51379a();
        this.f61672a.mo43255d().mo43309a(str, str2, BinderC25327b.m48695a(aVar), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void logEventAndBundle(String str, String str2, Bundle bundle, AbstractC26221oy oyVar, long j) {
        Bundle bundle2;
        m51379a();
        C25565r.m49316a(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f61672a.mo43015p().mo43220a(new RunnableC26459ic(this, oyVar, new zzao(str2, new zzan(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void logHealthData(int i, String str, AbstractC25324a aVar, AbstractC25324a aVar2, AbstractC25324a aVar3) {
        Object a;
        Object a2;
        m51379a();
        Object obj = null;
        if (aVar == null) {
            a = null;
        } else {
            a = BinderC25327b.m48695a(aVar);
        }
        if (aVar2 == null) {
            a2 = null;
        } else {
            a2 = BinderC25327b.m48695a(aVar2);
        }
        if (aVar3 != null) {
            obj = BinderC25327b.m48695a(aVar3);
        }
        this.f61672a.mo43016q().mo43116a(i, true, false, str, a, a2, obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26220ox
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m51379a();
        this.f61672a.mo43255d().mo43306a(str, str2, bundle, z, z2, j);
    }
}
