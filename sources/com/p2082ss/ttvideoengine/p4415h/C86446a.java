package com.p2082ss.ttvideoengine.p4415h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.h.a */
public final class C86446a implements AbstractC86479p {

    /* renamed from: a */
    public Context f193829a;

    static {
        Covode.recordClassIndex(101674);
    }

    private C86446a() {
    }

    /* renamed from: com.ss.ttvideoengine.h.a$a */
    public static class C86448a {

        /* renamed from: a */
        public static final C86446a f193831a = new C86446a((byte) 0);

        static {
            Covode.recordClassIndex(101676);
        }
    }

    /* synthetic */ C86446a(byte b) {
        this();
    }

    /* renamed from: a */
    static void m149183a(final JSONObject jSONObject) {
        C86631b.m150044a(new Runnable() {
            /* class com.p2082ss.ttvideoengine.p4415h.C86446a.RunnableC864471 */

            static {
                Covode.recordClassIndex(101675);
            }

            public final void run() {
                if (jSONObject != null) {
                    C86641i.m150110a("AppLogEngineUploader", "video statistics start");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            String next = keys.next();
                            if (next != null) {
                                C86641i.m150110a("AppLogEngineUploader", "video statistics:" + next + ":" + jSONObject.get(next));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    C86641i.m150110a("AppLogEngineUploader", "video statistics end");
                }
            }
        });
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86479p
    /* renamed from: b */
    public final void mo137483b(String str, JSONObject jSONObject) {
        C86631b.m150044a(new RunnableC86458c(str, jSONObject));
    }

    @Override // com.p2082ss.ttvideoengine.p4415h.AbstractC86479p
    /* renamed from: a */
    public final void mo137482a(String str, JSONObject jSONObject) {
        C86631b.m150044a(new RunnableC86457b(this, str, jSONObject));
    }
}
