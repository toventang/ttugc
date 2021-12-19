package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.p1934b.AbstractC25324a;
import com.p2082ss.android.ugc.playerkit.model.C84224v;

/* renamed from: com.google.android.gms.internal.measurement.ow */
public abstract class AbstractBinderC26219ow extends BinderC25793as implements AbstractC26220ox {
    static {
        Covode.recordClassIndex(31634);
    }

    public AbstractBinderC26219ow() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static AbstractC26220ox asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof AbstractC26220ox) {
            return (AbstractC26220ox) queryLocalInterface;
        }
        return new C26222oz(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.BinderC25793as
    /* renamed from: a */
    public final boolean mo42042a(int i, Parcel parcel, Parcel parcel2) {
        AbstractC26221oy oyVar = null;
        AbstractC26221oy paVar = null;
        AbstractC26221oy paVar2 = null;
        AbstractC25830b dVar = null;
        AbstractC25830b dVar2 = null;
        AbstractC25830b dVar3 = null;
        AbstractC26221oy paVar3 = null;
        AbstractC26221oy paVar4 = null;
        AbstractC26221oy paVar5 = null;
        AbstractC26221oy paVar6 = null;
        AbstractC26221oy paVar7 = null;
        AbstractC26221oy paVar8 = null;
        AbstractC25857c eVar = null;
        AbstractC26221oy paVar9 = null;
        AbstractC26221oy paVar10 = null;
        AbstractC26221oy paVar11 = null;
        AbstractC26221oy paVar12 = null;
        AbstractC26221oy paVar13 = null;
        switch (i) {
            case 1:
                initialize(AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), (zzae) C26232w.m51357a(parcel, zzae.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) C26232w.m51357a(parcel, Bundle.CREATOR), C26232w.m51361a(parcel), C26232w.m51361a(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) C26232w.m51357a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof AbstractC26221oy) {
                        oyVar = (AbstractC26221oy) queryLocalInterface;
                    } else {
                        oyVar = new C26224pa(readStrongBinder);
                    }
                }
                logEventAndBundle(readString, readString2, bundle, oyVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), C26232w.m51361a(parcel), parcel.readLong());
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean a = C26232w.m51361a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof AbstractC26221oy) {
                        paVar13 = (AbstractC26221oy) queryLocalInterface2;
                    } else {
                        paVar13 = new C26224pa(readStrongBinder2);
                    }
                }
                getUserProperties(readString3, readString4, a, paVar13);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof AbstractC26221oy) {
                        paVar12 = (AbstractC26221oy) queryLocalInterface3;
                    } else {
                        paVar12 = new C26224pa(readStrongBinder3);
                    }
                }
                getMaxUserProperties(readString5, paVar12);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                setConditionalUserProperty((Bundle) C26232w.m51357a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) C26232w.m51357a(parcel, Bundle.CREATOR));
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof AbstractC26221oy) {
                        paVar11 = (AbstractC26221oy) queryLocalInterface4;
                    } else {
                        paVar11 = new C26224pa(readStrongBinder4);
                    }
                }
                getConditionalUserProperties(readString6, readString7, paVar11);
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                setMeasurementEnabled(C26232w.m51361a(parcel), parcel.readLong());
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                resetAnalyticsData(parcel.readLong());
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case ABRConfig.ABR_SELECT_SCENE:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof AbstractC26221oy) {
                        paVar10 = (AbstractC26221oy) queryLocalInterface5;
                    } else {
                        paVar10 = new C26224pa(readStrongBinder5);
                    }
                }
                getCurrentScreenName(paVar10);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof AbstractC26221oy) {
                        paVar9 = (AbstractC26221oy) queryLocalInterface6;
                    } else {
                        paVar9 = new C26224pa(readStrongBinder6);
                    }
                }
                getCurrentScreenClass(paVar9);
                break;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof AbstractC25857c) {
                        eVar = (AbstractC25857c) queryLocalInterface7;
                    } else {
                        eVar = new C25911e(readStrongBinder7);
                    }
                }
                setInstanceIdProvider(eVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof AbstractC26221oy) {
                        paVar8 = (AbstractC26221oy) queryLocalInterface8;
                    } else {
                        paVar8 = new C26224pa(readStrongBinder8);
                    }
                }
                getCachedAppInstanceId(paVar8);
                break;
            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof AbstractC26221oy) {
                        paVar7 = (AbstractC26221oy) queryLocalInterface9;
                    } else {
                        paVar7 = new C26224pa(readStrongBinder9);
                    }
                }
                getAppInstanceId(paVar7);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof AbstractC26221oy) {
                        paVar6 = (AbstractC26221oy) queryLocalInterface10;
                    } else {
                        paVar6 = new C26224pa(readStrongBinder10);
                    }
                }
                getGmpAppId(paVar6);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof AbstractC26221oy) {
                        paVar5 = (AbstractC26221oy) queryLocalInterface11;
                    } else {
                        paVar5 = new C26224pa(readStrongBinder11);
                    }
                }
                generateEventId(paVar5);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), (Bundle) C26232w.m51357a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                AbstractC25324a a2 = AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof AbstractC26221oy) {
                        paVar4 = (AbstractC26221oy) queryLocalInterface12;
                    } else {
                        paVar4 = new C26224pa(readStrongBinder12);
                    }
                }
                onActivitySaveInstanceState(a2, paVar4, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) C26232w.m51357a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof AbstractC26221oy) {
                        paVar3 = (AbstractC26221oy) queryLocalInterface13;
                    } else {
                        paVar3 = new C26224pa(readStrongBinder13);
                    }
                }
                performAction(bundle2, paVar3, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()), AbstractC25324a.AbstractBinderC25325a.m48693a(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof AbstractC25830b) {
                        dVar3 = (AbstractC25830b) queryLocalInterface14;
                    } else {
                        dVar3 = new C25884d(readStrongBinder14);
                    }
                }
                setEventInterceptor(dVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof AbstractC25830b) {
                        dVar2 = (AbstractC25830b) queryLocalInterface15;
                    } else {
                        dVar2 = new C25884d(readStrongBinder15);
                    }
                }
                registerOnMeasurementEventListener(dVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof AbstractC25830b) {
                        dVar = (AbstractC25830b) queryLocalInterface16;
                    } else {
                        dVar = new C25884d(readStrongBinder16);
                    }
                }
                unregisterOnMeasurementEventListener(dVar);
                break;
            case 37:
                initForTests(parcel.readHashMap(C26232w.f61642a));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof AbstractC26221oy) {
                        paVar2 = (AbstractC26221oy) queryLocalInterface17;
                    } else {
                        paVar2 = new C26224pa(readStrongBinder17);
                    }
                }
                getTestFlag(paVar2, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(C26232w.m51361a(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof AbstractC26221oy) {
                        paVar = (AbstractC26221oy) queryLocalInterface18;
                    } else {
                        paVar = new C26224pa(readStrongBinder18);
                    }
                }
                isDataCollectionEnabled(paVar);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) C26232w.m51357a(parcel, Bundle.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
