package com.p2082ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.network.INetwork;

/* renamed from: com.ss.android.ugc.aweme.net.j */
public final class C61402j {

    /* renamed from: a */
    public static final C61402j f139398a = new C61402j();

    private C61402j() {
    }

    static {
        Covode.recordClassIndex(72052);
    }

    /* renamed from: a */
    public static final INetwork m111178a() {
        INetwork iNetwork;
        try {
            Object a = C81908b.m141854a(INetwork.class, false);
            if (a != null) {
                iNetwork = (INetwork) a;
            } else {
                iNetwork = new NetworkService();
            }
        } catch (Exception unused) {
            iNetwork = null;
        }
        if (iNetwork != null) {
            return iNetwork;
        }
        throw new IllegalStateException("SPI have not got the INetwork instance");
    }
}
