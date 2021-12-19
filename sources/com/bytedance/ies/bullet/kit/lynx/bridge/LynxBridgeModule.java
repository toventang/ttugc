package com.bytedance.ies.bullet.kit.lynx.bridge;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.lynx.C11969b;
import com.bytedance.android.monitor.p706d.C11919c;
import com.bytedance.android.monitor.p706d.C11924g;
import com.bytedance.android.monitor.p706d.C11925h;
import com.bytedance.android.monitor.webview.C12043h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.C16417i;
import com.bytedance.ies.bullet.kit.lynx.p1155d.C16410a;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16188n;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16194r;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16158a;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16167g;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import com.lynx.jsbridge.AbstractC28359d;
import com.lynx.jsbridge.C28355a;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxView;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxBridgeModule extends LynxModule implements AbstractC16576j {
    public static final C16392a Companion = new C16392a((byte) 0);
    private final AbstractC89244h loggerWrapper$delegate;
    public final C16248b providerFactory;

    static {
        Covode.recordClassIndex(18694);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final C16587q getLoggerWrapper() {
        return (C16587q) this.loggerWrapper$delegate.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule$a */
    public static final class C16392a {
        static {
            Covode.recordClassIndex(18695);
        }

        private C16392a() {
        }

        public /* synthetic */ C16392a(byte b) {
            this();
        }
    }

    public final AbstractC16187m getBridgeRegistry() {
        C16248b bVar = this.providerFactory;
        if (bVar != null) {
            return (AbstractC16187m) bVar.mo25832c(AbstractC16187m.class);
        }
        return null;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule$d */
    static final class C16403d extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ LynxBridgeModule f39402a;

        static {
            Covode.recordClassIndex(18706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16403d(LynxBridgeModule lynxBridgeModule) {
            super(0);
            this.f39402a = lynxBridgeModule;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            AbstractC16652m mVar;
            C16248b bVar = this.f39402a.providerFactory;
            if (bVar != null) {
                mVar = (AbstractC16652m) bVar.mo25832c(AbstractC16652m.class);
            } else {
                mVar = null;
            }
            return new C16587q(mVar, "LynxBridgeModule");
        }
    }

    public final C16417i getKitInstanceApi() {
        AbstractC16208i iVar;
        C16248b bVar = this.providerFactory;
        C16417i iVar2 = null;
        if (bVar != null) {
            iVar = (AbstractC16208i) bVar.mo25832c(AbstractC16208i.class);
        } else {
            iVar = null;
        }
        if (iVar instanceof C16417i) {
            iVar2 = iVar;
        }
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule$c */
    public static final class CallableC16402c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ LynxBridgeModule f39400a;

        /* renamed from: b */
        final /* synthetic */ String f39401b;

        static {
            Covode.recordClassIndex(18705);
        }

        CallableC16402c(LynxBridgeModule lynxBridgeModule, String str) {
            this.f39400a = lynxBridgeModule;
            this.f39401b = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            AbstractC16640d dVar;
            String str;
            try {
                C16248b bVar = this.f39400a.providerFactory;
                String str2 = null;
                if (bVar != null) {
                    dVar = (AbstractC16640d) bVar.mo25832c(AbstractC16640d.class);
                } else {
                    dVar = null;
                }
                C11919c.C11920a aVar = new C11919c.C11920a("bdx_monitor_bridge_pv");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_name", this.f39401b);
                if (dVar != null) {
                    str2 = dVar.mo26401b();
                }
                jSONObject.put("_full_url", str2);
                C11919c.C11920a a = aVar.mo19131a(jSONObject).mo19132a(true);
                if (dVar == null || (str = dVar.mo26400a()) == null) {
                    str = "Unknown";
                }
                HybridMonitor.getInstance().customReport(a.mo19130a(str).mo19129a(new C12043h()).mo19133a());
                return C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                return C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule$e */
    public static final class CallableC16404e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ LynxBridgeModule f39403a;

        /* renamed from: b */
        final /* synthetic */ C16167g f39404b;

        /* renamed from: c */
        final /* synthetic */ String f39405c;

        static {
            Covode.recordClassIndex(18707);
        }

        CallableC16404e(LynxBridgeModule lynxBridgeModule, C16167g gVar, String str) {
            this.f39403a = lynxBridgeModule;
            this.f39404b = gVar;
            this.f39405c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AbstractC16654o call() {
            AbstractC16654o oVar;
            C16417i kitInstanceApi = this.f39403a.getKitInstanceApi();
            AbstractC16640d dVar = null;
            if (kitInstanceApi == null || (oVar = (AbstractC16654o) kitInstanceApi.mo25790b_(AbstractC16654o.class)) == null) {
                return null;
            }
            C16607an anVar = new C16607an("bdx_monitor_bridge_duration", null, null, 254);
            C16248b bVar = this.f39403a.providerFactory;
            if (bVar != null) {
                dVar = (AbstractC16640d) bVar.mo25832c(AbstractC16640d.class);
            }
            anVar.f39738c = dVar;
            anVar.f39743h = this.f39404b.mo25727b();
            JSONObject jSONObject = new JSONObject();
            try {
                C89379q.m157068constructorimpl(jSONObject.put("method_name", this.f39405c));
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            anVar.f39742g = jSONObject;
            anVar.f39741f = "lynx";
            anVar.f39744i = true;
            oVar.mo26319a(anVar);
            return oVar;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule$b */
    static final class CallableC16393b<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxBridgeModule f39380a;

        /* renamed from: b */
        final /* synthetic */ C16167g f39381b;

        /* renamed from: c */
        final /* synthetic */ String f39382c;

        /* renamed from: d */
        final /* synthetic */ ReadableMap f39383d;

        /* renamed from: e */
        final /* synthetic */ Callback f39384e;

        static {
            Covode.recordClassIndex(18696);
        }

        CallableC16393b(LynxBridgeModule lynxBridgeModule, C16167g gVar, String str, ReadableMap readableMap, Callback callback) {
            this.f39380a = lynxBridgeModule;
            this.f39381b = gVar;
            this.f39382c = str;
            this.f39383d = readableMap;
            this.f39384e = callback;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89391z call() {
            final LynxView lynxView;
            AbstractC16192q qVar;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            C16248b bVar = this.f39380a.providerFactory;
            if (bVar != null) {
                lynxView = (LynxView) bVar.mo25832c(LynxView.class);
            } else {
                lynxView = null;
            }
            this.f39381b.mo25728b(0);
            AbstractC16187m bridgeRegistry = this.f39380a.getBridgeRegistry();
            if (bridgeRegistry != null) {
                bridgeRegistry.mo25733a(new AbstractC89172b<AbstractC16192q, C89391z>(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.CallableC16393b.C163941 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC16393b f39385a;

                    static {
                        Covode.recordClassIndex(18697);
                    }

                    {
                        this.f39385a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(AbstractC16192q qVar) {
                        C89219l.m154719c(qVar, "");
                        this.f39385a.f39381b.mo25729c(0);
                        return C89391z.f203057a;
                    }
                });
            }
            C16158a.m30010a("LYNX", new AbstractC89172b<Object, JSONObject>() {
                /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.CallableC16393b.C163952 */

                static {
                    Covode.recordClassIndex(18698);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ JSONObject invoke(Object obj) {
                    C89219l.m154719c(obj, "");
                    if (obj instanceof ReadableMap) {
                        return C16410a.f39406a.mo26043a((ReadableMap) obj);
                    }
                    return null;
                }
            });
            AbstractC16187m bridgeRegistry2 = this.f39380a.getBridgeRegistry();
            if (bridgeRegistry2 != null) {
                qVar = bridgeRegistry2.mo25730a(this.f39382c);
            } else {
                qVar = null;
            }
            if (qVar == null || (qVar instanceof AbstractC16183k)) {
                AbstractC16187m bridgeRegistry3 = this.f39380a.getBridgeRegistry();
                if (bridgeRegistry3 == null) {
                    return null;
                }
                String str = this.f39382c;
                JSONObject a = C16410a.f39406a.mo26043a(this.f39383d);
                JSONObject optJSONObject = a.optJSONObject("data");
                if (optJSONObject != null) {
                    a = optJSONObject;
                }
                bridgeRegistry3.mo25735a(str, a, new AbstractC16183k.AbstractC16185b(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.CallableC16393b.C163963 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC16393b f39386a;

                    static {
                        Covode.recordClassIndex(18699);
                    }

                    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
                    /* renamed from: a */
                    public final void mo25704a(JSONObject jSONObject) {
                        C89219l.m154719c(jSONObject, "");
                        this.f39386a.f39381b.f38931e = System.currentTimeMillis();
                        try {
                            this.f39386a.f39384e.invoke(C16410a.f39406a.mo26041a(jSONObject));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C16167g gVar = this.f39386a.f39381b;
                        gVar.f38932f = System.currentTimeMillis();
                        gVar.f38933g = System.currentTimeMillis();
                        this.f39386a.f39380a.onReady(gVar, this.f39386a.f39382c);
                        LynxView lynxView = lynxView;
                        if (lynxView != null) {
                            C11969b bVar = C11969b.f28620f;
                            C11925h hVar = new C11925h();
                            hVar.f28521b = this.f39386a.f39382c;
                            hVar.f28522c = 0;
                            hVar.f28525f = SystemClock.elapsedRealtime() - elapsedRealtime;
                            bVar.mo19179a(lynxView, hVar);
                        }
                    }

                    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
                    /* renamed from: a */
                    public final void mo25702a(int i, String str) {
                        C89219l.m154719c(str, "");
                        this.f39386a.f39381b.f38931e = System.currentTimeMillis();
                        WritableMap b = C28355a.m56665b();
                        b.putInt("code", i);
                        b.putString("message", str);
                        this.f39386a.f39384e.invoke(b);
                        C16167g gVar = this.f39386a.f39381b;
                        gVar.f38932f = System.currentTimeMillis();
                        gVar.f38933g = System.currentTimeMillis();
                        this.f39386a.f39380a.onReady(gVar, this.f39386a.f39382c);
                        LynxView lynxView = lynxView;
                        if (lynxView != null) {
                            C11969b bVar = C11969b.f28620f;
                            C11924g gVar2 = new C11924g();
                            gVar2.f28518e = this.f39386a.f39382c;
                            gVar2.f28516c = 4;
                            gVar2.f28517d = this.f39386a.f39380a.composeErrorMessage(str, i);
                            bVar.mo19178a(lynxView, gVar2);
                        }
                    }

                    {
                        this.f39386a = r1;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.lang.Object */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Object */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
                    /* renamed from: a */
                    public final void mo25703a(int i, String str, JSONObject jSONObject) {
                        String str2;
                        String str3;
                        C89219l.m154719c(str, "");
                        C89219l.m154719c(jSONObject, "");
                        this.f39386a.f39381b.f38931e = System.currentTimeMillis();
                        WritableMap b = C28355a.m56665b();
                        b.putInt("code", i);
                        b.putString("msg", str);
                        b.putString("message", str);
                        try {
                            b.putMap("data", C16410a.f39406a.mo26041a(jSONObject));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        this.f39386a.f39384e.invoke(b);
                        C16167g gVar = this.f39386a.f39381b;
                        gVar.f38932f = System.currentTimeMillis();
                        gVar.f38933g = System.currentTimeMillis();
                        this.f39386a.f39380a.onReady(gVar, this.f39386a.f39382c);
                        LynxView lynxView = lynxView;
                        if (lynxView != null) {
                            try {
                                if (str.length() <= 0 || str == null || (str + " with [" + jSONObject + ']') == null) {
                                    str3 = jSONObject.toString();
                                    C89219l.m154709a((Object) str3, "");
                                }
                                str2 = C89379q.m157068constructorimpl(str3);
                            } catch (Throwable th) {
                                str2 = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                            }
                            if (!C89379q.m157073isFailureimpl(str2)) {
                                str = str2;
                            }
                            C11969b bVar = C11969b.f28620f;
                            C11924g gVar2 = new C11924g();
                            gVar2.f28518e = this.f39386a.f39382c;
                            gVar2.f28516c = 4;
                            gVar2.f28517d = this.f39386a.f39380a.composeErrorMessage(str, i);
                            bVar.mo19178a(lynxView, gVar2);
                        }
                    }
                }, new AbstractC89172b<Throwable, C89391z>(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.CallableC16393b.C163974 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC16393b f39389a;

                    static {
                        Covode.recordClassIndex(18700);
                    }

                    {
                        this.f39389a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Throwable th) {
                        C89219l.m154719c(th, "");
                        AbstractC16576j.C16578b.m30778a(this.f39389a.f39380a, this.f39389a.f39382c + " rejected, reason: " + th, null, null, 6);
                        if (th instanceof AbstractC16188n.C16189a) {
                            WritableMap b = C28355a.m56665b();
                            b.putInt("code", 4);
                            b.putString("message", "bridge method not found");
                            this.f39389a.f39384e.invoke(b);
                            LynxView lynxView = lynxView;
                            if (lynxView != null) {
                                C11969b bVar = C11969b.f28620f;
                                C11924g gVar = new C11924g();
                                gVar.f28518e = this.f39389a.f39382c;
                                gVar.f28516c = 4;
                                gVar.f28517d = "bridge method not found";
                                bVar.mo19178a(lynxView, gVar);
                            }
                        }
                        return C89391z.f203057a;
                    }
                });
                return C89391z.f203057a;
            }
            final AbstractC16194r rVar = (AbstractC16194r) qVar;
            final AbstractC89183m<Object, Class<?>, Object> a2 = C16158a.m30009a(ReadableMap.class, Map.class);
            final AbstractC89183m<Object, Class<?>, Object> a3 = C16158a.m30009a(Map.class, ReadableMap.class);
            new AbstractC89172b<Object, Object>() {
                /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.CallableC16393b.C163985 */

                static {
                    Covode.recordClassIndex(18701);
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final Object invoke(Object obj) {
                    C89219l.m154719c(obj, "");
                    AbstractC89183m mVar = a2;
                    if (mVar != null) {
                        Class<?> e = rVar.mo25753e();
                        if (e == null) {
                            e = Object.class;
                        }
                        Object invoke = mVar.invoke(obj, e);
                        if (invoke != null) {
                            return invoke;
                        }
                    }
                    return C89041ag.m154415a();
                }
            };
            new AbstractC89172b<Object, Object>() {
                /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.CallableC16393b.C163996 */

                static {
                    Covode.recordClassIndex(18702);
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final Object invoke(Object obj) {
                    C89219l.m154719c(obj, "");
                    AbstractC89183m mVar = a3;
                    if (mVar != null) {
                        Class<?> e = rVar.mo25753e();
                        if (e == null) {
                            e = Object.class;
                        }
                        Object invoke = mVar.invoke(obj, e);
                        if (invoke != null) {
                            return invoke;
                        }
                    }
                    WritableMap b = C28355a.m56665b();
                    C89219l.m154709a((Object) b, "");
                    return b;
                }
            };
            try {
                AbstractC16187m bridgeRegistry4 = this.f39380a.getBridgeRegistry();
                if (bridgeRegistry4 == null) {
                    return null;
                }
                bridgeRegistry4.mo25735a(this.f39382c, this.f39383d, new AbstractC16194r.AbstractC16195a<ReadableMap>(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.CallableC16393b.C164007 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC16393b f39395a;

                    static {
                        Covode.recordClassIndex(18703);
                    }

                    {
                        this.f39395a = r1;
                    }
                }, new AbstractC89172b<Throwable, C89391z>(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.CallableC16393b.C164018 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC16393b f39398a;

                    static {
                        Covode.recordClassIndex(18704);
                    }

                    {
                        this.f39398a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Throwable th) {
                        LynxView lynxView;
                        C89219l.m154719c(th, "");
                        AbstractC16576j.C16578b.m30778a(this.f39398a.f39380a, this.f39398a.f39382c + " rejected, reason: " + th, null, null, 6);
                        if ((th instanceof AbstractC16188n.C16189a) && (lynxView = lynxView) != null) {
                            C11969b bVar = C11969b.f28620f;
                            C11924g gVar = new C11924g();
                            gVar.f28518e = this.f39398a.f39382c;
                            gVar.f28516c = 4;
                            gVar.f28517d = "bridge method not found";
                            bVar.mo19178a(lynxView, gVar);
                        }
                        return C89391z.f203057a;
                    }
                });
                return C89391z.f203057a;
            } catch (Throwable th) {
                this.f39381b.f38931e = System.currentTimeMillis();
                WritableMap b = C28355a.m56665b();
                b.putInt("code", 0);
                b.putString("message", th.toString());
                this.f39384e.invoke(b);
                C16167g gVar = this.f39381b;
                gVar.f38932f = System.currentTimeMillis();
                gVar.f38933g = System.currentTimeMillis();
                this.f39380a.onReady(gVar, this.f39382c);
                if (lynxView == null) {
                    return null;
                }
                C11969b bVar2 = C11969b.f28620f;
                C11924g gVar2 = new C11924g();
                gVar2.f28518e = this.f39382c;
                gVar2.f28516c = 4;
                LynxBridgeModule lynxBridgeModule = this.f39380a;
                String th2 = th.toString();
                if (th2 == null) {
                    th2 = "";
                }
                gVar2.f28517d = lynxBridgeModule.composeErrorMessage(th2, 0);
                bVar2.mo19178a(lynxView, gVar2);
                return C89391z.f203057a;
            }
        }
    }

    private final void doMonitorLog(String str, String str2) {
        C1731i.m5635a((Callable) new CallableC16402c(this, str));
    }

    public final void onReady(C16167g gVar, String str) {
        C1731i.m5635a((Callable) new CallableC16404e(this, gVar, str));
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16576j.C16578b.m30780a(this, th, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBridgeModule(Context context, Object obj) {
        super(context, obj);
        C89219l.m154719c(context, "");
        C89219l.m154719c(obj, "");
        this.providerFactory = (C16248b) (!(obj instanceof C16248b) ? null : obj);
        this.loggerWrapper$delegate = C89250i.m154773a((AbstractC89171a) new C16403d(this));
    }

    public final String composeErrorMessage(String str, int i) {
        C89219l.m154719c(str, "");
        try {
            String jSONObject = new JSONObject().putOpt("message", str).putOpt("code", Integer.valueOf(i)).toString();
            C89219l.m154709a((Object) jSONObject, "");
            return jSONObject;
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
            return str;
        }
    }

    public final ReadableMap optMap(ReadableMap readableMap, String str) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(str, "");
        try {
            if (!readableMap.hasKey(str)) {
                return new JavaOnlyMap();
            }
            ReadableMap map = readableMap.getMap(str);
            C89219l.m154709a((Object) map, "");
            return map;
        } catch (Exception unused) {
            return new JavaOnlyMap();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public final void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16576j.C16578b.m30777a(this, str, pVar, str2);
    }

    public final boolean optBoolean(ReadableMap readableMap, String str, boolean z) {
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(str, "");
        try {
            if (readableMap.hasKey(str)) {
                return readableMap.getBoolean(str);
            }
            return z;
        } catch (Exception unused) {
            return z;
        }
    }

    @AbstractC28359d
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        ReadableMap readableMap2;
        Executor executor;
        C89219l.m154719c(str, "");
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        if (!TextUtils.isEmpty(str)) {
            if (getBridgeRegistry() == null) {
                AbstractC16576j.C16578b.m30778a(this, "Bridge Registry is Empty", null, null, 6);
                return;
            }
            AbstractC16187m bridgeRegistry = getBridgeRegistry();
            if (bridgeRegistry == null) {
                C89219l.m154707a();
            }
            if (bridgeRegistry.mo25738d()) {
                AbstractC16576j.C16578b.m30778a(this, "Bridge Registry has released", null, null, 6);
                return;
            }
            C16167g gVar = new C16167g();
            gVar.mo25725a(0);
            if (readableMap.hasKey("data")) {
                readableMap2 = optMap(readableMap, "data");
            } else {
                readableMap2 = readableMap;
            }
            boolean optBoolean = optBoolean(readableMap2, "useUIThread", true);
            AbstractC16576j.C16578b.m30778a(this, "call lynx jsb func: " + str + " on useUIThread=" + optBoolean, null, null, 6);
            CallableC16393b bVar = new CallableC16393b(this, gVar, str, readableMap, callback);
            if (optBoolean) {
                executor = C1731i.f5564c;
            } else {
                executor = C1731i.f5562a;
            }
            C1731i.m5636a(bVar, executor);
            doMonitorLog(str, "unknown");
        }
    }

    static /* synthetic */ void doMonitorLog$default(LynxBridgeModule lynxBridgeModule, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        lynxBridgeModule.doMonitorLog(str, str2);
    }
}
