package com.bytedance.android.livesdk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.AbstractC5804d;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p379n.AbstractC5788t;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.client.C8205b;
import com.bytedance.android.livesdk.client.C8206c;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.p430ab.AbstractC6570b;
import com.bytedance.android.livesdk.p430ab.C6573d;
import com.bytedance.android.livesdk.p430ab.p431a.C6568a;
import com.bytedance.android.livesdk.p430ab.p431a.C6569b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p455ar.C6835b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.p656w.C11301a;
import com.bytedance.android.livesdk.p656w.C11302b;
import com.bytedance.android.livesdk.p656w.C11303c;
import com.bytedance.android.livesdk.p656w.C11304d;
import com.bytedance.android.livesdk.p656w.C11305e;
import com.bytedance.android.livesdk.p656w.C11306f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.message.AbstractC11888a;
import com.bytedance.android.message.AbstractC11890c;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.MessageManagerFactory;
import com.p2082ss.ugc.live.sdk.message.data.Configuration;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.as */
public class C6860as implements IMessageService {
    private final CopyOnWriteArrayList<AbstractC11890c> onMessageParsedListeners = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(7598);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager get() {
        if (C6813aq.f17086d) {
            return C6828ar.f17115b;
        }
        return C6813aq.f17083a.mo2078a(C6813aq.f17085c, null);
    }

    @Override // com.bytedance.android.message.IMessageService
    public void releaseAll() {
        if (C6813aq.f17086d) {
            if (C6828ar.f17114a != null) {
                C6828ar.f17114a.mo18068b();
                C6828ar.f17114a = null;
            }
            if (C6828ar.f17115b != null) {
                C6828ar.f17115b.release();
                C6828ar.f17115b = null;
            }
            C5805e a = C5805e.m12718a();
            AbstractC5804d dVar = C6835b.m14616a().f17128c;
            if (dVar != null) {
                a.f14645b.remove(dVar);
            }
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public void releaseMsgAlog(long j) {
        C6813aq.m14604a(j);
    }

    @Override // com.bytedance.android.message.IMessageService
    public Class<? extends AbstractC6571a> getMessageClass(String str) {
        return EnumC11586x.getMessageClass(str);
    }

    @Override // com.bytedance.android.message.IMessageService
    public void removeOnMessageParsedListener(AbstractC11890c cVar) {
        C89219l.m154721d(cVar, "");
        this.onMessageParsedListeners.remove(cVar);
    }

    @Override // com.bytedance.android.message.IMessageService
    public void addOnMessageParsedListener(AbstractC11890c cVar) {
        C89219l.m154721d(cVar, "");
        if (!this.onMessageParsedListeners.contains(cVar)) {
            this.onMessageParsedListeners.add(cVar);
        }
    }

    public final void notifySelfChatMessageParsed(C9878i iVar) {
        C89219l.m154721d(iVar, "");
        Iterator<T> it = this.onMessageParsedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo13826a(iVar);
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public void release(long j) {
        IMessageManager a;
        if (!C6813aq.f17086d && (a = C6813aq.f17083a.mo2078a(j, null)) != null) {
            a.release();
            C6813aq.m14604a(j);
            C6813aq.f17083a.mo2082b(j);
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public void registerMessageClass(Map<String, ? extends Class<? extends AbstractC6571a>> map) {
        if (map != null) {
            for (Map.Entry<String, ? extends Class<? extends AbstractC6571a>> entry : map.entrySet()) {
                EnumC11586x.registerMessageClass(entry.getKey(), (Class) entry.getValue());
            }
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager messageManagerProvider(long j, Context context, String str) {
        IMessageManager iMessageManager;
        if (C6813aq.f17086d) {
            C8206c cVar = new C8206c(false, C11115u.m19743a().mo17915b().mo13161c());
            C8205b bVar = new C8205b(false, C11115u.m19743a().mo17915b().mo13161c());
            cVar.mo14445a(j, context);
            if (!TextUtils.isEmpty(str)) {
                cVar.f20357c = str;
            }
            iMessageManager = MessageManagerFactory.getV2(C6828ar.m14612a(cVar, bVar, j, false));
            C6835b.m14616a().f17127b = C6828ar.f17115b;
            C5805e.m12718a().mo11573a(C6835b.m14616a().f17128c);
        } else {
            C8205b bVar2 = new C8205b(false, C11115u.m19743a().mo17915b().mo13161c());
            bVar2.mo14438a(j, context);
            if (!TextUtils.isEmpty(str)) {
                bVar2.f20334b = str;
            }
            iMessageManager = MessageManagerFactory.get(new Configuration().setHttpClient(bVar2).setLogger(new C6569b()).setMonitor(new C11603z()).setMessageConverter(new C6568a()).addInterceptor(new C11302b(j)).addInterceptor(new C11301a()).addInterceptor(new C11303c()).addInterceptor(new C11305e()).addInterceptor(new C11304d()).setAnchor(false).setEnablePriority(false).setEnableSmoothlyDispatch(true));
        }
        C89219l.m154716b(iMessageManager, "");
        return iMessageManager;
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager messageManagerProvider(long j, boolean z, Context context) {
        IMessageManager iMessageManager;
        if (C6813aq.f17086d) {
            iMessageManager = C6828ar.m14613a(j, z, context);
        } else if (C6813aq.f17086d) {
            iMessageManager = C6828ar.m14613a(j, z, context);
        } else {
            C6813aq.f17085c = j;
            C8205b bVar = new C8205b(z, C11115u.m19743a().mo17915b().mo13161c());
            bVar.mo14438a(j, context);
            AbstractC6570b giftInterceptor = ((IGiftService) C6193a.m13435a(IGiftService.class)).getGiftInterceptor(j, z);
            C11306f fVar = new C11306f();
            C6813aq.f17084b.mo2083b(j, fVar);
            iMessageManager = MessageManagerFactory.get(new Configuration().setHttpClient(bVar).setLogger(new C6569b()).setMonitor(new C11603z()).setMessageConverter(new C6568a()).addInterceptor(fVar).addInterceptor(new C11302b(j)).addInterceptor(giftInterceptor).addInterceptor(new C11301a()).addInterceptor(new C11303c()).addInterceptor(new C11305e()).addInterceptor(new C11304d()).setAnchor(z).setEnablePriority(false).setEnableSmoothlyDispatch(true));
            C6813aq.f17083a.mo2083b(j, iMessageManager);
            giftInterceptor.mo12725a(iMessageManager);
        }
        C89219l.m154716b(iMessageManager, "");
        return iMessageManager;
    }

    @Override // com.bytedance.android.message.IMessageService
    public AbstractC11888a configInteractionMessageHelper(C10935a aVar, DataChannel dataChannel, AbstractC5788t tVar, View view, AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC89172b<? super C9688bt, C89391z> bVar2, AbstractC89171a<Boolean> aVar2, AbstractC89171a<C89391z> aVar3) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        return new C6573d(aVar, dataChannel, tVar, view, bVar, bVar2, aVar2, aVar3);
    }
}
