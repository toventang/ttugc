package androidx.work.impl.p070a.p072b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.AbstractC1600g;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;

/* renamed from: androidx.work.impl.a.b.b */
public final class C1620b extends AbstractC1621c<Boolean> {

    /* renamed from: b */
    private static final String f5254b = AbstractC1600g.m5318a("BatteryNotLowTracker");

    static {
        Covode.recordClassIndex(1776);
    }

    @Override // androidx.work.impl.p070a.p072b.AbstractC1621c
    /* renamed from: a */
    public final IntentFilter mo5387a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.p070a.p072b.AbstractC1623d
    /* renamed from: b */
    public final /* synthetic */ Object mo5389b() {
        Intent b = m5366b(this.f5259a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (b == null) {
            AbstractC1600g.m5317a();
            return null;
        }
        boolean z = false;
        int intExtra = b.getIntExtra("plugged", 0);
        int intExtra2 = b.getIntExtra("status", -1);
        float intExtra3 = ((float) b.getIntExtra("level", -1)) / ((float) b.getIntExtra("scale", -1));
        if (intExtra != 0 || intExtra2 == 1 || intExtra3 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public C1620b(Context context) {
        super(context);
    }

    @Override // androidx.work.impl.p070a.p072b.AbstractC1621c
    /* renamed from: a */
    public final void mo5388a(Intent intent) {
        if (intent.getAction() != null) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("Received %s", new Object[]{intent.getAction()});
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                mo5394a((Object) true);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                mo5394a((Object) false);
            }
        }
    }

    /* renamed from: a */
    private static Intent m5365a(Context context, IntentFilter intentFilter) {
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
    private static Intent m5366b(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m5365a(context, intentFilter);
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
