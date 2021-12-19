package com.p2082ss.android.ugc.aweme.influencer;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.sdk.webview.C30248e;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.CopyTextToPasteBoardMethod;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.CopyTextToPasteBoardMethodCrossPlatform;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.GetGeckoChannelVersionMethod;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenSchemaSingleTaskMethod;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenSchemaSingleTaskMethodCrossPlatform;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenWhatsAppChatMethod;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.OpenWhatsAppChatMethodCrossPlatform;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.SendEmailMethod;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods.SendEmailMethodCrossPlatform;
import java.lang.ref.WeakReference;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ECommerceLiveBridgeMethodServiceImpl */
public final class ECommerceLiveBridgeMethodServiceImpl implements IECommerceLiveBridgeService {
    static {
        Covode.recordClassIndex(66429);
    }

    /* renamed from: a */
    public static IECommerceLiveBridgeService m102573a() {
        MethodCollector.m26663i(487);
        Object a = C81908b.m141854a(IECommerceLiveBridgeService.class, false);
        if (a != null) {
            IECommerceLiveBridgeService iECommerceLiveBridgeService = (IECommerceLiveBridgeService) a;
            MethodCollector.m26664o(487);
            return iECommerceLiveBridgeService;
        }
        if (C81908b.f183199bB == null) {
            synchronized (IECommerceLiveBridgeService.class) {
                try {
                    if (C81908b.f183199bB == null) {
                        C81908b.f183199bB = new ECommerceLiveBridgeMethodServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(487);
                    throw th;
                }
            }
        }
        ECommerceLiveBridgeMethodServiceImpl eCommerceLiveBridgeMethodServiceImpl = (ECommerceLiveBridgeMethodServiceImpl) C81908b.f183199bB;
        MethodCollector.m26664o(487);
        return eCommerceLiveBridgeMethodServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService
    /* renamed from: a */
    public final List<AbstractC16183k> mo93513a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return C89070n.m154522b(new OpenSchemaSingleTaskMethod(bVar), new GetGeckoChannelVersionMethod(bVar), new OpenWhatsAppChatMethod(bVar), new CopyTextToPasteBoardMethod(bVar), new SendEmailMethod(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService
    /* renamed from: a */
    public final void mo93514a(C30248e eVar, WeakReference<Context> weakReference) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(weakReference, "");
        C18288a aVar = eVar.f72166b;
        eVar.mo53711a("openSingletonSchema", new OpenSchemaSingleTaskMethodCrossPlatform(aVar).attach(weakReference));
        eVar.mo53711a("routeToWhatsapp", new OpenWhatsAppChatMethodCrossPlatform(aVar).attach(weakReference));
        eVar.mo53711a("copyTextToPasteBoard", new CopyTextToPasteBoardMethodCrossPlatform(aVar).attach(weakReference));
        eVar.mo53711a("sendEMailTo", new SendEmailMethodCrossPlatform(aVar).attach(weakReference));
    }
}
