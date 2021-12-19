package com.p2082ss.android.ugc.aweme.app;

import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.q */
final /* synthetic */ class C33839q implements WeakHandler.IHandler {

    /* renamed from: a */
    private final CommandDispatcher f80096a;

    static {
        Covode.recordClassIndex(40739);
    }

    C33839q(CommandDispatcher commandDispatcher) {
        this.f80096a = commandDispatcher;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        CommandDispatcher commandDispatcher = this.f80096a;
        try {
            if (message.what == 104) {
                try {
                    JSONObject jSONObject = (JSONObject) message.obj;
                    jSONObject.optLong("i");
                    jSONObject.optString("t");
                    List<Object> list = commandDispatcher.f79688d;
                    if (list != null) {
                        Iterator<Object> it = list.iterator();
                        while (it.hasNext()) {
                            it.next();
                            jSONObject.optJSONObject("p");
                        }
                    }
                } catch (Exception unused) {
                    Logger.debug();
                }
            }
        } catch (Exception unused2) {
        }
    }
}
