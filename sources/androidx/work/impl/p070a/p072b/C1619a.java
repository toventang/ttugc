package androidx.work.impl.p070a.p072b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.AbstractC1600g;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;

/* renamed from: androidx.work.impl.a.b.a */
public final class C1619a extends AbstractC1621c<Boolean> {

    /* renamed from: b */
    private static final String f5253b = AbstractC1600g.m5318a("BatteryChrgTracker");

    static {
        Covode.recordClassIndex(1775);
    }

    @Override // androidx.work.impl.p070a.p072b.AbstractC1621c
    /* renamed from: a */
    public final IntentFilter mo5387a() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    @Override // androidx.work.impl.p070a.p072b.AbstractC1623d
    /* renamed from: b */
    public final /* synthetic */ Object mo5389b() {
        int intExtra;
        Intent b = m5361b(this.f5259a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (b == null) {
            AbstractC1600g.m5317a();
            return null;
        }
        boolean z = true;
        if (Build.VERSION.SDK_INT < 23 ? b.getIntExtra("plugged", 0) == 0 : !((intExtra = b.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public C1619a(Context context) {
        super(context);
    }

    @Override // androidx.work.impl.p070a.p072b.AbstractC1621c
    /* renamed from: a */
    public final void mo5388a(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("Received %s", new Object[]{action});
            action.hashCode();
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        mo5394a((Object) false);
                        return;
                    }
                    return;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        mo5394a((Object) false);
                        return;
                    }
                    return;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        mo5394a((Object) true);
                        return;
                    }
                    return;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        mo5394a((Object) true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private static Intent m5360a(Context context, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(null, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static Intent m5361b(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m5360a(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e) {
                securityException = e;
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e2) {
                String message = e2.getMessage();
                securityException = e2;
                if (message != null) {
                    boolean contains = e2.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e2;
                    if (contains) {
                        throw e2;
                    }
                }
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }
}
