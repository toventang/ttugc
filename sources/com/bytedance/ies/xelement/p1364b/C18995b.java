package com.bytedance.ies.xelement.p1364b;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.p2054c.C28725c;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.b.b */
public class C18995b {

    /* renamed from: b */
    public static final C18996a f44965b = new C18996a((byte) 0);

    /* renamed from: a */
    private String f44966a;

    /* renamed from: c */
    private WeakReference<AbstractC28520j> f44967c;

    /* renamed from: d */
    private final String f44968d;

    /* renamed from: e */
    private final int f44969e;

    static {
        Covode.recordClassIndex(21744);
    }

    /* renamed from: com.bytedance.ies.xelement.b.b$a */
    public static final class C18996a {
        static {
            Covode.recordClassIndex(21745);
        }

        private C18996a() {
        }

        public /* synthetic */ C18996a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo30150b(JSONObject jSONObject) {
        C28719c cVar;
        C89219l.m154719c(jSONObject, "");
        AbstractC28520j jVar = this.f44967c.get();
        if (jVar != null && (cVar = jVar.f67064e) != null) {
            C28725c cVar2 = new C28725c(this.f44969e, "errorReport");
            cVar2.mo49838a("category", jSONObject.toString());
            cVar.mo49834a(cVar2);
        }
    }

    /* renamed from: a */
    public final void mo30149a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        JSONObject jSONObject2 = null;
        try {
            String str = this.f44966a;
            if (str != null) {
                if (str.length() != 0) {
                    jSONObject2 = new JSONObject();
                    C11950d.m21101a(jSONObject2, "virtual_aid", this.f44966a);
                }
            }
            if (jSONObject2 != null) {
                jSONObject2.toString(4);
            }
            jSONObject.toString(4);
            HybridMonitor.getInstance().customReport("", "", this.f44968d, jSONObject, null, null, jSONObject2, true);
        } catch (Exception e) {
            C19004g.f44970a.mo30157c("AUDIO_MONITOR_TAG", e.getMessage());
        }
    }

    /* renamed from: a */
    protected static void m35269a(JSONObject jSONObject, String str, String str2) {
        C89219l.m154719c(jSONObject, "");
        C89219l.m154719c(str, "");
        C11950d.m21101a(jSONObject, str, str2);
    }

    public C18995b(String str, int i, AbstractC28520j jVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(jVar, "");
        this.f44968d = str;
        this.f44969e = i;
        this.f44967c = new WeakReference<>(jVar);
    }
}
