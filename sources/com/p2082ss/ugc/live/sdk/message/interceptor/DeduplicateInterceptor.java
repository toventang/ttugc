package com.p2082ss.ugc.live.sdk.message.interceptor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.data.LimitedSizeHashMap;
import com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.message.interceptor.DeduplicateInterceptor */
public class DeduplicateInterceptor implements IInterceptor {
    private Map<Long, Object> mBufferMap;
    private Map<Long, Object> mPipBufferMap;

    static {
        Covode.recordClassIndex(102858);
    }

    public void clear() {
        this.mBufferMap.clear();
        this.mPipBufferMap.clear();
    }

    public DeduplicateInterceptor(int i) {
        this.mBufferMap = new LimitedSizeHashMap(i);
        this.mPipBufferMap = new LimitedSizeHashMap(i);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor
    public boolean onMessage(IMessage iMessage) {
        if (iMessage.getGeneralMessageType() == 1) {
            if (this.mPipBufferMap.containsKey(Long.valueOf(iMessage.getMessageId()))) {
                return true;
            }
            this.mPipBufferMap.put(Long.valueOf(iMessage.getMessageId()), null);
            return false;
        } else if (this.mBufferMap.containsKey(Long.valueOf(iMessage.getMessageId()))) {
            return true;
        } else {
            this.mBufferMap.put(Long.valueOf(iMessage.getMessageId()), null);
            return false;
        }
    }
}
