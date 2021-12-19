package com.bytedance.push.frontier;

import android.content.Context;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p912b.C13654b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.C21798f;
import com.bytedance.push.frontier.p1594a.AbstractC21807b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.frontier.b */
public class C21810b implements AbstractC13651e {

    /* renamed from: a */
    public static int f51680a = 1777;

    /* renamed from: b */
    public static int f51681b = 1777;

    /* renamed from: i */
    private static volatile C21810b f51682i;

    /* renamed from: c */
    public AtomicReference<AbstractC21807b> f51683c = new AtomicReference<>();

    /* renamed from: d */
    final Context f51684d;

    /* renamed from: e */
    int f51685e;

    /* renamed from: f */
    public String f51686f = "";

    /* renamed from: g */
    boolean f51687g = false;

    /* renamed from: h */
    private final AtomicBoolean f51688h = new AtomicBoolean(false);

    @Override // com.bytedance.common.wschannel.app.AbstractC13651e
    /* renamed from: a */
    public final void mo21944a(C13654b bVar, JSONObject jSONObject) {
    }

    static {
        Covode.recordClassIndex(25460);
    }

    private C21810b(Context context) {
        this.f51684d = context;
    }

    /* renamed from: a */
    public static C21810b m40841a(Context context) {
        MethodCollector.m26663i(8445);
        if (f51682i == null) {
            synchronized (C21810b.class) {
                try {
                    if (f51682i == null) {
                        f51682i = new C21810b(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8445);
                    throw th;
                }
            }
        }
        C21810b bVar = f51682i;
        MethodCollector.m26664o(8445);
        return bVar;
    }

    @Override // com.bytedance.common.wschannel.app.AbstractC13651e
    /* renamed from: a */
    public final void mo21945a(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null && this.f51687g) {
            if ((this.f51685e == 1 || wsChannelMsg.f33475m == 10006) && f51680a == wsChannelMsg.f33468f && f51681b == wsChannelMsg.f33469g) {
                try {
                    C21798f.m40815c().mo35434a(new String(wsChannelMsg.mo22159a()), FrontierPushAdapter.getFrontierPush());
                } catch (Throwable unused) {
                }
            }
        }
    }
}
