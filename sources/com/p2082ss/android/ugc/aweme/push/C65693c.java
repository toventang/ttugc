package com.p2082ss.android.ugc.aweme.push;

import android.app.Activity;
import androidx.core.app.C0607l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61550b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61553e;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61554f;
import com.p2082ss.android.ugc.aweme.notice.api.p3508a.AbstractC61534a;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61595q;
import com.p2082ss.android.ugc.aweme.push.C65697d;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.push.c */
public final class C65693c implements AbstractC61534a {

    /* renamed from: b */
    public static C65693c f148021b;

    /* renamed from: c */
    public static final C65694a f148022c = new C65694a((byte) 0);

    /* renamed from: a */
    public final LivePushApi f148023a;

    static {
        Covode.recordClassIndex(77186);
    }

    /* renamed from: com.ss.android.ugc.aweme.push.c$a */
    public static final class C65694a {
        static {
            Covode.recordClassIndex(77187);
        }

        private C65694a() {
        }

        /* renamed from: a */
        public final synchronized C65693c mo104849a() {
            C65693c cVar;
            MethodCollector.m26663i(8797);
            if (C65693c.f148021b == null) {
                C65693c.f148021b = new C65693c();
            }
            cVar = C65693c.f148021b;
            if (cVar == null) {
                C89219l.m154715b();
            }
            MethodCollector.m26664o(8797);
            return cVar;
        }

        public /* synthetic */ C65694a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.push.c$b */
    static final class RunnableC65695b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C61550b f148024a;

        static {
            Covode.recordClassIndex(77188);
        }

        RunnableC65695b(C61550b bVar) {
            this.f148024a = bVar;
        }

        public final void run() {
            C65697d.C65698a.m117593a().mo104852a(true, ((C61553e) this.f148024a).getTitle(), ((C61553e) this.f148024a).getContent(), ((C61553e) this.f148024a).getImageUrl(), ((C61553e) this.f148024a).getOpenUrl(), "", (C61553e) this.f148024a);
        }
    }

    public C65693c() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(LivePushApi.class);
        C89219l.m154716b(create, "");
        this.f148023a = (LivePushApi) create;
        C61595q.f139777f.mo99331a(EnumC61554f.LIVE, this);
    }

    /* renamed from: com.ss.android.ugc.aweme.push.c$c */
    static final class C65696c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C65696c f148025a = new C65696c();

        static {
            Covode.recordClassIndex(77189);
        }

        C65696c() {
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            return 0;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notice.api.p3508a.AbstractC61534a
    /* renamed from: a */
    public final void mo59576a(C61550b bVar) {
        if (bVar instanceof C61553e) {
            C61553e eVar = (C61553e) bVar;
            if (eVar.getPushShowType() == 1 && C0607l.m2289a(C17867d.m33078a()).mo2639a()) {
                JSONObject jSONObject = new JSONObject(eVar.getExtraStr());
                HashMap hashMap = new HashMap();
                try {
                    new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    C89219l.m154716b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C89219l.m154716b(next, "");
                        String optString = jSONObject.optString(next);
                        C89219l.m154716b(optString, "");
                        hashMap.put(next, optString);
                    }
                    C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                Activity j = C17873f.m33102j();
                if (j != null) {
                    j.runOnUiThread(new RunnableC65695b(bVar));
                }
            }
        }
    }
}
