package com.bytedance.android.livesdk;

import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.client.C8205b;
import com.bytedance.android.livesdk.client.C8206c;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.android.livesdk.p430ab.AbstractC6570b;
import com.bytedance.android.livesdk.p430ab.p431a.C6568a;
import com.bytedance.android.livesdk.p430ab.p431a.C6569b;
import com.bytedance.android.livesdk.p455ar.C6835b;
import com.bytedance.android.livesdk.p455ar.C6838d;
import com.bytedance.android.livesdk.p656w.C11301a;
import com.bytedance.android.livesdk.p656w.C11302b;
import com.bytedance.android.livesdk.p656w.C11303c;
import com.bytedance.android.livesdk.p656w.C11304d;
import com.bytedance.android.livesdk.p656w.C11305e;
import com.bytedance.android.livesdk.p656w.C11306f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.MessageManagerFactory;
import com.p2082ss.ugc.live.sdk.message.data.Configuration;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* renamed from: com.bytedance.android.livesdk.ar */
public final class C6828ar {

    /* renamed from: a */
    static C11306f f17114a;

    /* renamed from: b */
    static IMessageManager f17115b;

    static {
        Covode.recordClassIndex(7566);
    }

    /* renamed from: a */
    public static IMessageManager m14613a(long j, boolean z, Context context) {
        C8206c cVar = new C8206c(z, C11115u.m19743a().mo17915b().mo13161c());
        C8205b bVar = new C8205b(z, C11115u.m19743a().mo17915b().mo13161c());
        cVar.mo14445a(j, context);
        C11306f fVar = f17114a;
        if (fVar != null) {
            fVar.mo18068b();
        }
        f17114a = new C11306f();
        AbstractC6570b giftInterceptor = ((IGiftService) C6193a.m13435a(IGiftService.class)).getGiftInterceptor(j, z);
        Configuration addInterceptor = m14612a(cVar, bVar, j, z).addInterceptor(f17114a).addInterceptor(giftInterceptor);
        IMessageManager iMessageManager = f17115b;
        if (iMessageManager == null) {
            f17115b = MessageManagerFactory.getV2(addInterceptor);
        } else {
            iMessageManager.reset();
            f17115b.refresh(addInterceptor);
        }
        giftInterceptor.mo12725a(f17115b);
        C6835b.m14616a().f17127b = f17115b;
        C5805e.m12718a().mo11573a(C6835b.m14616a().f17128c);
        return f17115b;
    }

    /* renamed from: a */
    static Configuration m14612a(C8206c cVar, IMessageClient iMessageClient, long j, boolean z) {
        return new Configuration().setWsClient(cVar).setMessageConverter(new C6568a()).setHttpClient(iMessageClient).setLogger(new C6569b()).setMonitor(new C11603z()).setUplinkConfig(new C6838d()).setWaitWsConnectDuration(LiveMessageTimeoutSetting.INSTANCE.getWsConnectTimeout()).setDuplicateSize(LiveMessageSetting.INSTANCE.duplicateSize()).setIsEnhanceWS(LiveMessageSetting.INSTANCE.enhanceWebsocket()).addInterceptor(new C11302b(j)).addInterceptor(new C11301a()).addInterceptor(new C11303c()).addInterceptor(new C11305e()).addInterceptor(new C11304d()).setAnchor(z).setEnablePriority(false).setEnableSmoothlyDispatch(true);
    }
}
