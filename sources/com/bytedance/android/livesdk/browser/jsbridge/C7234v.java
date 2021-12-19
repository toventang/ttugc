package com.bytedance.android.livesdk.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18467c;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18371a;
import com.bytedance.ies.xbridge.C18513f;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1339a.p1340a.C18738d;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.p1290b.AbstractC18405a;
import com.bytedance.ies.xbridge.p1290b.AbstractC18406b;
import com.bytedance.ies.xbridge.p1349o.C18809c;
import java.util.Collection;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.v */
public final class C7234v {

    /* renamed from: a */
    public static final C7234v f18008a = new C7234v();

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.v$e */
    public static final class C7241e implements AbstractC18406b {
        static {
            Covode.recordClassIndex(7987);
        }

        @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18406b
        /* renamed from: a */
        public final String mo13409a() {
            return "DEFAULT";
        }

        C7241e() {
        }
    }

    private C7234v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.v$a */
    public static final class C7235a implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        final /* synthetic */ String f18009a;

        /* renamed from: b */
        final /* synthetic */ Map.Entry f18010b;

        /* renamed from: c */
        final /* synthetic */ C18364w f18011c;

        /* renamed from: d */
        final /* synthetic */ int f18012d;

        static {
            Covode.recordClassIndex(7981);
        }

        C7235a(String str, Map.Entry entry, C18364w wVar, int i) {
            this.f18009a = str;
            this.f18010b = entry;
            this.f18011c = wVar;
            this.f18012d = i;
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final AbstractC18334e<Object, Object> mo13316a() {
            return new AbstractC18334e<JSONObject, JSONObject>(this) {
                /* class com.bytedance.android.livesdk.browser.jsbridge.C7234v.C7235a.C72361 */

                /* renamed from: a */
                final /* synthetic */ C7235a f18013a;

                static {
                    Covode.recordClassIndex(7982);
                }

                @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
                public final void onTerminate() {
                    ((AbstractC18467c) this.f18013a.f18010b.getValue()).mo13408a().mo29431f();
                }

                {
                    this.f18013a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
                @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
                public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
                    EnumC18483e eVar;
                    JSONObject jSONObject2 = jSONObject;
                    C89219l.m154721d(jSONObject2, "");
                    C89219l.m154721d(gVar, "");
                    C3854a.m9453a(3, "XbridgeManager", "xbridge start,fun name:" + this.f18013a.f18009a);
                    jSONObject2.put("func", this.f18013a.f18009a);
                    AbstractC18400b a = ((AbstractC18467c) this.f18013a.f18010b.getValue()).mo13408a();
                    C18738d dVar = new C18738d(jSONObject2);
                    C72371 r2 = new AbstractC18400b.AbstractC18402b(this) {
                        /* class com.bytedance.android.livesdk.browser.jsbridge.C7234v.C7235a.C72361.C72371 */

                        /* renamed from: a */
                        final /* synthetic */ C72361 f18014a;

                        static {
                            Covode.recordClassIndex(7983);
                        }

                        {
                            this.f18014a = r1;
                        }

                        @Override // com.bytedance.ies.xbridge.AbstractC18400b.AbstractC18402b
                        /* renamed from: a */
                        public final void mo13405a(Map<String, Object> map) {
                            C89219l.m154721d(map, "");
                            C3854a.m9453a(3, "XbridgeManager", "xbridge end,fun name:" + this.f18014a.f18013a.f18009a);
                            Object obj = map.get("data");
                            if (obj != null && (obj instanceof Map)) {
                                map.remove("data");
                                map.putAll((Map) obj);
                            }
                            this.f18014a.finishWithRawResult(new JSONObject(map));
                        }
                    };
                    if (this.f18013a.f18012d == 1) {
                        eVar = EnumC18483e.LYNX;
                    } else {
                        eVar = EnumC18483e.WEB;
                    }
                    a.mo7340a(dVar, r2, eVar);
                }
            };
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.v$c */
    public static final class C7239c implements AbstractC18405a {

        /* renamed from: a */
        final /* synthetic */ Activity f18017a;

        /* renamed from: b */
        final /* synthetic */ C18364w f18018b;

        static {
            Covode.recordClassIndex(7985);
        }

        @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18405a
        /* renamed from: a */
        public final String mo13407a() {
            return this.f18018b.toString();
        }

        C7239c(Activity activity, C18364w wVar) {
            this.f18017a = activity;
            this.f18018b = wVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.v$d */
    public static final class C7240d implements AbstractC18467c {

        /* renamed from: a */
        final /* synthetic */ AbstractC18400b f18019a;

        /* renamed from: b */
        final /* synthetic */ C18513f f18020b;

        /* renamed from: c */
        final /* synthetic */ C18742c f18021c;

        static {
            Covode.recordClassIndex(7986);
        }

        @Override // com.bytedance.ies.xbridge.AbstractC18467c
        /* renamed from: a */
        public final AbstractC18400b mo13408a() {
            this.f18019a.mo29430a(this.f18021c);
            AbstractC18400b bVar = this.f18019a;
            C89219l.m154716b(bVar, "");
            return bVar;
        }

        C7240d(AbstractC18400b bVar, C18513f fVar, C18742c cVar) {
            this.f18019a = bVar;
            this.f18020b = fVar;
            this.f18021c = cVar;
        }
    }

    static {
        Covode.recordClassIndex(7980);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.v$b */
    public static final class C7238b implements AbstractC18400b.AbstractC18404d {

        /* renamed from: a */
        final /* synthetic */ Activity f18015a;

        /* renamed from: b */
        final /* synthetic */ C18364w f18016b;

        static {
            Covode.recordClassIndex(7984);
        }

        C7238b(Activity activity, C18364w wVar) {
            this.f18015a = activity;
            this.f18016b = wVar;
        }

        @Override // com.bytedance.ies.xbridge.AbstractC18400b.AbstractC18404d
        /* renamed from: a */
        public final void mo13406a(String str, AbstractC18754n nVar) {
            JSONObject jSONObject;
            C89219l.m154721d(str, "");
            if (nVar != null) {
                jSONObject = C18809c.m34905a(nVar);
            } else {
                jSONObject = new JSONObject();
            }
            if (!this.f18016b.f43935e) {
                this.f18016b.mo29404a(str, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public static void m15144a(Activity activity, C18364w wVar, int i) {
        Collection<Class> values;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(wVar, "");
        C18742c cVar = new C18742c();
        cVar.mo29770a(Context.class, activity);
        cVar.mo29771b(AbstractC18406b.class, new C7241e());
        cVar.mo29771b(AbstractC18400b.AbstractC18404d.class, new C7238b(activity, wVar));
        cVar.mo29771b(AbstractC18405a.class, new C7239c(activity, wVar));
        AbstractC11816k kVar = (AbstractC11816k) C6193a.m13435a(AbstractC11816k.class);
        if (kVar != null) {
            kVar.mo18889c();
        }
        C18513f fVar = new C18513f();
        Map map = C18371a.m34206a(EnumC18483e.ALL, "DEFAULT");
        if (!(map == null || (values = map.values()) == null)) {
            for (Class cls : values) {
                AbstractC18400b bVar = (AbstractC18400b) cls.newInstance();
                fVar.mo29641a(bVar.mo7341b(), new C7240d(bVar, fVar, cVar));
            }
        }
        for (Map.Entry entry : C89041ag.m154429c(fVar.mo29640a().f44171a).entrySet()) {
            String str = (String) entry.getKey();
            wVar.mo29400a(str, (AbstractC18334e.AbstractC18336b) new C7235a(str, entry, wVar, i));
        }
    }
}
