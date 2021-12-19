package com.bytedance.ies.ugc.aweme.commercialize.splash.p1259c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29383a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.c.d */
final /* synthetic */ class CallableC17955d implements Callable {

    /* renamed from: a */
    private final List f42774a;

    static {
        Covode.recordClassIndex(20571);
    }

    CallableC17955d(List list) {
        this.f42774a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<AbstractC29383a> list = this.f42774a;
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f == null) {
            return null;
        }
        for (AbstractC29383a aVar : list) {
            f.mo59376a().mo59407a(Integer.valueOf(aVar.mo51377y()), aVar.mo51371l(), aVar.mo51378z(), aVar.mo51372m(), (C38220ag) GsonHolder.m138943c().mo123620b().mo46670a(aVar.mo51369E(), C38220ag.class));
        }
        return null;
    }
}
