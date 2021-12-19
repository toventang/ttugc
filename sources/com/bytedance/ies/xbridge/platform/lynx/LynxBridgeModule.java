package com.bytedance.ies.xbridge.platform.lynx;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.C18371a;
import com.bytedance.ies.xbridge.C18513f;
import com.bytedance.ies.xbridge.platform.lynx.p1355a.C18840g;
import com.lynx.jsbridge.AbstractC28359d;
import com.lynx.jsbridge.C28355a;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxBridgeModule extends LynxModule {
    public static final C18830a Companion = new C18830a((byte) 0);

    static {
        Covode.recordClassIndex(21526);
    }

    /* renamed from: com.bytedance.ies.xbridge.platform.lynx.LynxBridgeModule$a */
    public static final class C18830a {
        static {
            Covode.recordClassIndex(21527);
        }

        private C18830a() {
        }

        public /* synthetic */ C18830a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.platform.lynx.LynxBridgeModule$b */
    static final class RunnableC18831b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f44636a;

        /* renamed from: b */
        final /* synthetic */ ReadableMap f44637b;

        /* renamed from: c */
        final /* synthetic */ Callback f44638c;

        /* renamed from: d */
        final /* synthetic */ C18513f f44639d;

        static {
            Covode.recordClassIndex(21528);
        }

        RunnableC18831b(String str, ReadableMap readableMap, Callback callback, C18513f fVar) {
            this.f44636a = str;
            this.f44637b = readableMap;
            this.f44638c = callback;
            this.f44639d = fVar;
        }

        public final void run() {
            try {
                C18833a aVar = (C18833a) C18371a.m34204a(C18833a.class);
                if (aVar != null) {
                    String str = this.f44636a;
                    C18840g gVar = new C18840g(this.f44637b);
                    C188321 r1 = new AbstractC18400b.AbstractC18402b(this) {
                        /* class com.bytedance.ies.xbridge.platform.lynx.LynxBridgeModule.RunnableC18831b.C188321 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC18831b f44640a;

                        static {
                            Covode.recordClassIndex(21529);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f44640a = r1;
                        }

                        @Override // com.bytedance.ies.xbridge.AbstractC18400b.AbstractC18402b
                        /* renamed from: a */
                        public final void mo13405a(Map<String, Object> map) {
                            C89219l.m154719c(map, "");
                            this.f44640a.f44638c.invoke(C28355a.m56660a(map));
                        }
                    };
                    C18513f fVar = this.f44639d;
                    C89219l.m154719c(str, "");
                    C89219l.m154719c(gVar, "");
                    C89219l.m154719c(r1, "");
                    C89219l.m154719c(fVar, "");
                    aVar.mo29618a(str, gVar, r1, fVar);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBridgeModule(Context context) {
        super(context);
        C89219l.m154719c(context, "");
    }

    @AbstractC28359d
    public final void call(String str, ReadableMap readableMap, Callback callback, C18513f fVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(readableMap, "");
        C89219l.m154719c(callback, "");
        C89219l.m154719c(fVar, "");
        if (!TextUtils.isEmpty(str)) {
            new Handler().post(new RunnableC18831b(str, readableMap, callback, fVar));
        }
    }
}
