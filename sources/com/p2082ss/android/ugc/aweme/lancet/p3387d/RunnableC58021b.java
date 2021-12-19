package com.p2082ss.android.ugc.aweme.lancet.p3387d;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.lancet.d.b */
public final /* synthetic */ class RunnableC58021b implements Runnable {

    /* renamed from: a */
    private final C58017a.C58018a f132234a;

    static {
        Covode.recordClassIndex(68056);
    }

    RunnableC58021b(C58017a.C58018a aVar) {
        this.f132234a = aVar;
    }

    public final void run() {
        C58017a.C58018a aVar = this.f132234a;
        try {
            Application a = C17879g.m33104a();
            aVar.f132230c = -1;
            aVar.f132228a = (TelephonyManager) C58017a.C58018a.m104841a(a, "phone");
            aVar.mo95543a(SubscriptionManager.getDefaultDataSubscriptionId());
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            ((ConnectivityManager) C58017a.C58018a.m104841a(a, "connectivity")).registerNetworkCallback(builder.build(), new ConnectivityManager.NetworkCallback() {
                /* class com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a.C58018a.C580191 */

                static {
                    Covode.recordClassIndex(68054);
                }

                public final void onLost(Network network) {
                    super.onLost(network);
                    C58018a.this.f132229b.set(-1);
                }

                public final void onAvailable(Network network) {
                    super.onAvailable(network);
                    int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
                    if (defaultDataSubscriptionId != C58018a.this.f132230c) {
                        int i = C58018a.this.f132230c;
                        C58018a.this.mo95543a(defaultDataSubscriptionId);
                    }
                }
            });
            C58017a.f132227c = true;
        } catch (Exception unused) {
        }
    }
}
