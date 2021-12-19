package com.bytedance.android.message;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.p379n.AbstractC5788t;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;

public interface IMessageService extends AbstractC2953a {
    static {
        Covode.recordClassIndex(13612);
    }

    void addOnMessageParsedListener(AbstractC11890c cVar);

    AbstractC11888a configInteractionMessageHelper(C10935a aVar, DataChannel dataChannel, AbstractC5788t tVar, View view, AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC89172b<? super C9688bt, C89391z> bVar2, AbstractC89171a<Boolean> aVar2, AbstractC89171a<C89391z> aVar3);

    IMessageManager get();

    Class<? extends AbstractC6571a> getMessageClass(String str);

    IMessageManager messageManagerProvider(long j, Context context, String str);

    IMessageManager messageManagerProvider(long j, boolean z, Context context);

    void registerMessageClass(Map<String, ? extends Class<? extends AbstractC6571a>> map);

    void release(long j);

    void releaseAll();

    void releaseMsgAlog(long j);

    void removeOnMessageParsedListener(AbstractC11890c cVar);
}
