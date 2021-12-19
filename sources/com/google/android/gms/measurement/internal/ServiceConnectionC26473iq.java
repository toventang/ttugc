package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC25526c;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.stats.C25588a;

/* renamed from: com.google.android.gms.measurement.internal.iq */
public final class ServiceConnectionC26473iq implements ServiceConnection, AbstractC25526c.AbstractC25527a, AbstractC25526c.AbstractC25528b {

    /* renamed from: a */
    volatile boolean f62298a;

    /* renamed from: b */
    volatile C26346dy f62299b;

    /* renamed from: c */
    final /* synthetic */ C26451hv f62300c;

    static {
        Covode.recordClassIndex(31895);
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25527a
    /* renamed from: a */
    public final void mo41798a() {
        MethodCollector.m26663i(5838);
        C25565r.m49323b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f62300c.mo43015p().mo43220a(new RunnableC26474ir(this, (AbstractC26341dt) this.f62299b.mo41794q()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f62299b = null;
                this.f62298a = false;
            } catch (Throwable th) {
                MethodCollector.m26664o(5838);
                throw th;
            }
        }
        MethodCollector.m26664o(5838);
    }

    protected ServiceConnectionC26473iq(C26451hv hvVar) {
        this.f62300c = hvVar;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C25565r.m49323b("MeasurementServiceConnection.onServiceDisconnected");
        this.f62300c.mo43016q().f61834j.mo43169a("Service disconnected");
        this.f62300c.mo43015p().mo43220a(new RunnableC26475is(this, componentName));
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25527a
    /* renamed from: a */
    public final void mo41799a(int i) {
        C25565r.m49323b("MeasurementServiceConnection.onConnectionSuspended");
        this.f62300c.mo43016q().f61834j.mo43169a("Service connection suspended");
        this.f62300c.mo43015p().mo43220a(new RunnableC26477iu(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25528b
    /* renamed from: a */
    public final void mo41800a(ConnectionResult connectionResult) {
        C26350eb ebVar;
        MethodCollector.m26663i(5983);
        C25565r.m49323b("MeasurementServiceConnection.onConnectionFailed");
        C26381ff ffVar = this.f62300c.f62077z;
        if (!(ffVar.f62002f == null || !ffVar.f62002f.mo43287w() || (ebVar = ffVar.f62002f) == null)) {
            ebVar.f61830f.mo43170a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            try {
                this.f62298a = false;
                this.f62299b = null;
            } catch (Throwable th) {
                MethodCollector.m26664o(5983);
                throw th;
            }
        }
        this.f62300c.mo43015p().mo43220a(new RunnableC26476it(this));
        MethodCollector.m26664o(5983);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC26341dt dvVar;
        MethodCollector.m26663i(5704);
        C25565r.m49323b("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                try {
                    this.f62298a = false;
                    this.f62300c.mo43016q().f61827c.mo43169a("Service connected with null binder");
                } finally {
                    MethodCollector.m26664o(5704);
                }
            } else {
                AbstractC26341dt dtVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (queryLocalInterface instanceof AbstractC26341dt) {
                            dvVar = (AbstractC26341dt) queryLocalInterface;
                        } else {
                            dvVar = new C26343dv(iBinder);
                        }
                        dtVar = dvVar;
                        this.f62300c.mo43016q().f61835k.mo43169a("Bound to IMeasurementService interface");
                        if (dtVar != null) {
                            this.f62300c.mo43015p().mo43220a(new RunnableC26472ip(this, dtVar));
                            MethodCollector.m26664o(5704);
                        }
                        this.f62298a = false;
                        try {
                            C25588a.m49390a();
                            this.f62300c.mo43012m().unbindService(this.f62300c.f62221a);
                        } catch (IllegalArgumentException unused) {
                        }
                        MethodCollector.m26664o(5704);
                    }
                    this.f62300c.mo43016q().f61827c.mo43170a("Got binder with a wrong descriptor", interfaceDescriptor);
                    this.f62298a = false;
                    C25588a.m49390a();
                    this.f62300c.mo43012m().unbindService(this.f62300c.f62221a);
                    MethodCollector.m26664o(5704);
                } catch (RemoteException unused2) {
                    this.f62300c.mo43016q().f61827c.mo43169a("Service connect failed to get IMeasurementService");
                }
            }
        }
    }
}
