package com.bytedance.bridge.magpie.impl.lynx;

import com.bytedance.bridge.magpie.C13402a;
import com.bytedance.bridge.magpie.impl.p887a.AbstractC13454a;
import com.bytedance.bridge.magpie.impl.p887a.C13455b;
import com.bytedance.bridge.magpie.p883b.C13428a;
import com.bytedance.bridge.magpie.p883b.C13434c;
import com.bytedance.bridge.magpie.p884c.C13435a;
import com.bytedance.bridge.magpie.p885d.AbstractC13442a;
import com.bytedance.bridge.magpie.p886e.C13450b;
import com.bytedance.covode.number.Covode;
import com.lynx.jsbridge.AbstractC28359d;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.AbstractC28520j;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxBridgeModule extends LynxContextModule {
    public static final C13460a Companion = new C13460a((byte) 0);
    private final AbstractC28520j context;
    private final Object obj;

    static {
        Covode.recordClassIndex(15460);
    }

    /* renamed from: com.bytedance.bridge.magpie.impl.lynx.LynxBridgeModule$a */
    public static final class C13460a {
        static {
            Covode.recordClassIndex(15461);
        }

        private C13460a() {
        }

        public /* synthetic */ C13460a(byte b) {
            this();
        }
    }

    public final AbstractC28520j getContext() {
        return this.context;
    }

    public final Object getObj() {
        return this.obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LynxBridgeModule(AbstractC28520j jVar) {
        this(jVar, null);
        C89219l.m154719c(jVar, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBridgeModule(AbstractC28520j jVar, Object obj2) {
        super(jVar, obj2);
        C89219l.m154719c(jVar, "");
        this.context = jVar;
        this.obj = obj2;
    }

    /* renamed from: com.bytedance.bridge.magpie.impl.lynx.LynxBridgeModule$b */
    public static final class C13461b implements AbstractC13442a {

        /* renamed from: a */
        final /* synthetic */ LynxBridgeModule f32795a;

        /* renamed from: b */
        final /* synthetic */ String f32796b;

        /* renamed from: c */
        final /* synthetic */ Callback f32797c;

        static {
            Covode.recordClassIndex(15462);
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13442a
        /* renamed from: a */
        public final void mo21667a(C13434c cVar, C13428a aVar) {
            String str;
            Long l;
            C89219l.m154719c(cVar, "");
            C13455b bVar = new C13455b();
            bVar.f32778a = this.f32796b;
            bVar.f32779b = Integer.valueOf(cVar.f32753b);
            if (cVar.f32752a != null) {
                str = String.valueOf(cVar.f32752a);
            } else {
                str = cVar.f32754c;
            }
            bVar.f32780c = str;
            bVar.f32781d = "lynx";
            if (aVar != null) {
                l = Long.valueOf(aVar.f32741j);
            } else {
                l = null;
            }
            bVar.f32782e = l;
            if (cVar.f32753b == 1) {
                AbstractC13454a aVar2 = ((C13402a) this.f32795a.getObj()).f32698g;
                if (aVar2 != null) {
                    aVar2.mo21683b(bVar);
                }
            } else {
                AbstractC13454a aVar3 = ((C13402a) this.f32795a.getObj()).f32698g;
                if (aVar3 != null) {
                    aVar3.mo21682a(bVar);
                }
            }
            new JavaOnlyMap();
            JSONObject jSONObject = cVar.f32752a;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                jSONObject.put("code", cVar.f32753b);
                jSONObject.put("detail", cVar.f32754c);
            }
            JavaOnlyMap a = C13450b.f32774a.mo21680a(jSONObject);
            Callback callback = this.f32797c;
            if (callback != null) {
                callback.invoke(a);
            }
        }

        C13461b(LynxBridgeModule lynxBridgeModule, String str, Callback callback) {
            this.f32795a = lynxBridgeModule;
            this.f32796b = str;
            this.f32797c = callback;
        }
    }

    @AbstractC28359d
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        C13435a aVar;
        ReadableMap map;
        C89219l.m154719c(str, "");
        C13428a aVar2 = new C13428a();
        aVar2.mo21649a("1");
        aVar2.mo21650b(str);
        aVar2.mo21648a(C13428a.EnumC13430b.LYNX);
        if (!(readableMap == null || (map = readableMap.getMap("data")) == null || !(map instanceof JavaOnlyMap))) {
            String jSONObject = C13450b.f32774a.mo21681a((JavaOnlyMap) map).toString();
            C89219l.m154709a((Object) jSONObject, "");
            aVar2.mo21651c(jSONObject);
        }
        Object obj2 = this.obj;
        if ((obj2 instanceof C13402a) && (aVar = ((C13402a) obj2).f32692a) != null) {
            aVar.mo21660a(aVar2, new C13461b(this, str, callback), (C13402a) this.obj);
        }
    }

    public static /* synthetic */ void call$default(LynxBridgeModule lynxBridgeModule, String str, ReadableMap readableMap, Callback callback, int i, Object obj2) {
        if ((i & 2) != 0) {
            readableMap = null;
        }
        if ((i & 4) != 0) {
            callback = null;
        }
        lynxBridgeModule.call(str, readableMap, callback);
    }
}
