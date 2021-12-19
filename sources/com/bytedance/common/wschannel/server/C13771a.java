package com.bytedance.common.wschannel.server;

import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.common.wschannel.server.a */
public final class C13771a {

    /* renamed from: a */
    Map<Integer, IWsApp> f33494a = new ConcurrentHashMap();

    /* renamed from: b */
    Map<Integer, IWsChannelClient> f33495b = new ConcurrentHashMap();

    /* renamed from: c */
    Map<Integer, SocketState> f33496c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(15819);
    }

    C13771a() {
    }
}
