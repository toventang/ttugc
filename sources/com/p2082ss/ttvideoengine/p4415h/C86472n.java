package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.n */
public final class C86472n {

    /* renamed from: a */
    public C86476o f193916a;

    /* renamed from: b */
    ArrayList<C86475b> f193917b = new ArrayList<>();

    static {
        Covode.recordClassIndex(101700);
    }

    /* renamed from: com.ss.ttvideoengine.h.n$a */
    static class RunnableC86473a implements Runnable {

        /* renamed from: a */
        private C86472n f193918a;

        /* renamed from: b */
        private Handler f193919b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private C86476o f193920c;

        /* renamed from: d */
        private Context f193921d;

        /* renamed from: e */
        private C86475b f193922e;

        static {
            Covode.recordClassIndex(101701);
        }

        public final void run() {
            final boolean z;
            if (this.f193918a != null) {
                C86476o oVar = this.f193920c;
                if (oVar == null || !oVar.f193989as) {
                    z = false;
                } else {
                    z = true;
                }
                C86475b bVar = this.f193922e;
                C86476o oVar2 = this.f193920c;
                HashMap hashMap = new HashMap();
                if (oVar2 != null) {
                    C86470l.m149395a(hashMap, "player_sessionid", oVar2.f194003r);
                    C86470l.m149395a(hashMap, "v", oVar2.f193946C);
                    C86470l.m149395a(hashMap, "pc", oVar2.f193994i);
                    C86470l.m149395a(hashMap, "sv", oVar2.f193995j);
                    C86470l.m149395a(hashMap, "sdk_version", oVar2.f193996k);
                    C86470l.m149395a(hashMap, "vtype", oVar2.f193957N);
                }
                C86470l.m149395a(hashMap, "abrv", bVar.f193929d);
                C86470l.m149394a(hashMap, "cost_time", bVar.f193927b);
                C86470l.m149394a(hashMap, "pr_time", bVar.f193926a);
                C86470l.m149395a(hashMap, "end_type", bVar.f193928c);
                C86470l.m149394a(hashMap, "old_br", bVar.f193930e);
                C86470l.m149394a(hashMap, "new_br", bVar.f193931f);
                C86470l.m149394a(hashMap, "max_buf", bVar.f193932g);
                C86470l.m149394a(hashMap, "abuf", bVar.f193933h);
                C86470l.m149394a(hashMap, "vbuf", bVar.f193934i);
                C86470l.m149392a((Map) hashMap, "netspeed", bVar.f193935j);
                C86470l.m149394a(hashMap, "delaytime", bVar.f193936k);
                C86470l.m149393a((Map) hashMap, "tonew", bVar.f193938m);
                C86470l.m149393a((Map) hashMap, "reason", bVar.f193939n);
                C86641i.m150113b("VideoEventAbrEvent", "AbrSwitch:" + hashMap.toString());
                final JSONObject jSONObject = new JSONObject(hashMap);
                Handler handler = this.f193919b;
                if (handler == null || handler.getLooper() == null) {
                    EnumC86487t.instance.addEventV2(z, jSONObject, "videoplayer_abrswitch");
                } else {
                    this.f193919b.post(new Runnable() {
                        /* class com.p2082ss.ttvideoengine.p4415h.C86472n.RunnableC86473a.RunnableC864741 */

                        static {
                            Covode.recordClassIndex(101702);
                        }

                        public final void run() {
                            EnumC86487t.instance.addEventV2(z, jSONObject, "videoplayer_abrswitch");
                        }
                    });
                }
            }
        }

        public RunnableC86473a(Context context, C86472n nVar, C86476o oVar, C86475b bVar) {
            this.f193918a = nVar;
            this.f193920c = oVar;
            this.f193921d = context;
            this.f193922e = bVar;
        }
    }

    C86472n(C86476o oVar) {
        this.f193916a = oVar;
    }

    /* renamed from: com.ss.ttvideoengine.h.n$b */
    class C86475b {

        /* renamed from: a */
        public long f193926a;

        /* renamed from: b */
        public long f193927b;

        /* renamed from: c */
        public String f193928c;

        /* renamed from: d */
        public String f193929d;

        /* renamed from: e */
        public long f193930e;

        /* renamed from: f */
        public long f193931f;

        /* renamed from: g */
        public long f193932g;

        /* renamed from: h */
        public long f193933h;

        /* renamed from: i */
        public long f193934i;

        /* renamed from: j */
        public float f193935j;

        /* renamed from: k */
        public long f193936k;

        /* renamed from: l */
        public long f193937l;

        /* renamed from: m */
        public int f193938m;

        /* renamed from: n */
        public int f193939n;

        static {
            Covode.recordClassIndex(101703);
        }

        private C86475b() {
            this.f193926a = -2147483648L;
            this.f193927b = -2147483648L;
            this.f193928c = "";
            this.f193929d = "";
            this.f193930e = -1;
            this.f193931f = -1;
            this.f193932g = -1;
            this.f193933h = -1;
            this.f193934i = -1;
            this.f193935j = -1.0f;
            this.f193936k = -1;
            this.f193937l = -1;
            this.f193939n = -1;
        }

        /* synthetic */ C86475b(C86472n nVar, byte b) {
            this();
        }
    }
}
