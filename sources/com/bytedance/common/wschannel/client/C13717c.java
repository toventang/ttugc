package com.bytedance.common.wschannel.client;

import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.model.C13769a;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p912b.C13654b;
import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.client.c */
public final class C13717c extends AbstractC13716b {

    /* renamed from: b */
    private final Map<String, AbstractC13719d> f33355b;

    /* renamed from: com.bytedance.common.wschannel.client.c$a */
    public interface AbstractC13718a {
        static {
            Covode.recordClassIndex(15753);
        }

        /* renamed from: a */
        void mo22067a(int i, EnumC13655c cVar);

        /* renamed from: a */
        void mo22068a(C13654b bVar, JSONObject jSONObject);

        /* renamed from: a */
        void mo22069a(WsChannelMsg wsChannelMsg);

        /* renamed from: b */
        void mo22070b(WsChannelMsg wsChannelMsg);
    }

    static {
        Covode.recordClassIndex(15752);
    }

    public C13717c(AbstractC13718a aVar) {
        super(aVar);
        HashMap hashMap = new HashMap();
        hashMap.put("com.bytedance.article.wschannel.receive.connection", new C13720e(aVar));
        hashMap.put("com.bytedance.article.wschannel.syncconnectstate", new C13725i(aVar));
        hashMap.put("com.bytedance.article.wschannel.receive.progress", new C13723g(aVar));
        hashMap.put("com.bytedance.article.wschannel.receive.payload", new C13722f(aVar));
        hashMap.put("com.bytedance.article.wschannel.send.payload", new C13724h(aVar));
        this.f33355b = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13719d
    /* renamed from: a */
    public final void mo22079a(Intent intent, C13769a aVar) {
        try {
            AbstractC13719d dVar = this.f33355b.get(intent.getAction());
            if (dVar != null) {
                dVar.mo22079a(intent, aVar);
            }
        } catch (Throwable unused) {
        }
        if (Logger.debug()) {
            intent.getIntExtra("msg_count", -1);
        }
    }
}
