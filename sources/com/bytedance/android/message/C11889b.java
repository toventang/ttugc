package com.bytedance.android.message;

import android.content.Context;
import android.view.View;
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
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.message.b */
public class C11889b implements IMessageService {
    static {
        Covode.recordClassIndex(13614);
    }

    @Override // com.bytedance.android.message.IMessageService
    public void addOnMessageParsedListener(AbstractC11890c cVar) {
        C89219l.m154721d(cVar, "");
    }

    @Override // com.bytedance.android.message.IMessageService
    public AbstractC11888a configInteractionMessageHelper(C10935a aVar, DataChannel dataChannel, AbstractC5788t tVar, View view, AbstractC89172b<? super Boolean, C89391z> bVar, AbstractC89172b<? super C9688bt, C89391z> bVar2, AbstractC89171a<Boolean> aVar2, AbstractC89171a<C89391z> aVar3) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager get() {
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public Class<? extends AbstractC6571a> getMessageClass(String str) {
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager messageManagerProvider(long j, Context context, String str) {
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public IMessageManager messageManagerProvider(long j, boolean z, Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.message.IMessageService
    public void registerMessageClass(Map<String, ? extends Class<? extends AbstractC6571a>> map) {
    }

    @Override // com.bytedance.android.message.IMessageService
    public void release(long j) {
    }

    @Override // com.bytedance.android.message.IMessageService
    public void releaseAll() {
    }

    @Override // com.bytedance.android.message.IMessageService
    public void releaseMsgAlog(long j) {
    }

    @Override // com.bytedance.android.message.IMessageService
    public void removeOnMessageParsedListener(AbstractC11890c cVar) {
        C89219l.m154721d(cVar, "");
    }
}
