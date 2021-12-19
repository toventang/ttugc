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

/* renamed from: androidx.work.impl.a.b.f */
public final class C1627f extends AbstractC1621c<Boolean> {

    /* renamed from: b */
    private static final String f5269b = AbstractC1600g.m5318a("StorageNotLowTracker");

    static {
        Covode.recordClassIndex(1783);
    }

    @Override // androidx.work.impl.p070a.p072b.AbstractC1621c
    /* renamed from: a */
    public final IntentFilter mo5387a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.p070a.p072b.AbstractC1623d
    /* renamed from: b */
    public final /* synthetic */ Object mo5389b() {
        Intent b = m5392b(this.f5259a, mo5387a());
        if (b == null || b.getAction() == null) {
            return true;
        }
        String action = b.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return false;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return true;
    }

    public C1627f(Context context) {
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
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                mo5394a((Object) false);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                mo5394a((Object) true);
            }
        }
    }

    /* renamed from: a */
    private static Intent m5391a(Context context, IntentFilter intentFilter) {
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
    private static Intent m5392b(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m5391a(context, intentFilter);
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
