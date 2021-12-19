package com.bytedance.bridge.magpie.impl.p888b;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.bytedance.bridge.magpie.C13402a;
import com.bytedance.bridge.magpie.impl.p887a.AbstractC13454a;
import com.bytedance.bridge.magpie.impl.p887a.C13455b;
import com.bytedance.bridge.magpie.p883b.C13428a;
import com.bytedance.bridge.magpie.p883b.C13434c;
import com.bytedance.bridge.magpie.p884c.C13435a;
import com.bytedance.bridge.magpie.p885d.AbstractC13442a;
import com.bytedance.bridge.magpie.p885d.AbstractC13446e;
import com.bytedance.bridge.magpie.p885d.AbstractC13447f;
import com.bytedance.bridge.magpie.p886e.C13453e;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.impl.b.c */
public abstract class AbstractC13459c extends AbstractC13446e implements AbstractC13442a {

    /* renamed from: a */
    public AbstractC13447f f32792a;

    /* renamed from: b */
    public final String f32793b = "ToutiaoJSBridge";

    /* renamed from: d */
    private final String f32794d = "WebJSBridge";

    static {
        Covode.recordClassIndex(15459);
    }

    /* renamed from: a */
    public abstract C13428a mo21686a(String str);

    /* renamed from: a */
    public abstract String mo21687a(C13428a aVar, C13434c cVar);

    /* renamed from: b */
    public abstract String mo21688b();

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13446e
    /* renamed from: a */
    public final void mo21671a() {
        AbstractC13447f fVar = this.f32771c.f32694c;
        if (fVar != null) {
            fVar.mo21674a(this, mo21688b());
        }
    }

    /* renamed from: c */
    private void m24195c(String str) {
        C89219l.m154719c(str, "");
        AbstractC13447f fVar = this.f32792a;
        if (fVar != null) {
            fVar.mo21675a(str, (ValueCallback<String>) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC13459c(C13402a aVar) {
        super(aVar);
        C89219l.m154719c(aVar, "");
        this.f32792a = aVar.f32694c;
    }

    /* renamed from: b */
    public final void mo21690b(String str) {
        JSONObject optJSONObject;
        int optInt;
        Object obj;
        C89391z zVar;
        if (str == null) {
            mo21667a(m24194a(-3, "invoke msg is empty"), (C13428a) null);
            return;
        }
        C13428a a = mo21686a(str);
        a.mo21648a(C13428a.EnumC13430b.WEB);
        if (!TextUtils.isEmpty(str) && (optJSONObject = new JSONObject(str).optJSONObject("params")) != null) {
            optInt = optJSONObject.optInt("thread_model", 0);
        } else {
            optInt = 0;
        }
        a.f32740i = optInt;
        try {
            C13435a aVar = this.f32771c.f32692a;
            if (aVar != null) {
                aVar.mo21660a(a, this, this.f32771c);
                zVar = C89391z.f203057a;
            } else {
                zVar = null;
            }
            obj = C89379q.m157068constructorimpl(zVar);
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        Throwable r2 = C89379q.m157071exceptionOrNullimpl(obj);
        if (r2 != null) {
            mo21667a(m24194a(0, "invoke msg exception," + r2.getMessage()), (C13428a) null);
        }
    }

    /* renamed from: a */
    private static C13434c m24194a(int i, String str) {
        C13434c cVar = new C13434c();
        cVar.f32752a = null;
        cVar.mo21657a(str);
        cVar.f32753b = i;
        return cVar;
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13446e
    /* renamed from: a */
    public final void mo21672a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            jSONObject2.put("__params", jSONObject);
            m24195c("javascript:" + this.f32793b + "._handleMessageFromToutiao(" + jSONObject2 + ')');
        } catch (Throwable th) {
            Throwable r3 = C89379q.m157071exceptionOrNullimpl(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
            if (r3 != null) {
                C13453e.m24177a(this.f32794d, "parse event failed,reason=" + r3.getMessage());
            }
        }
    }

    @Override // com.bytedance.bridge.magpie.p885d.AbstractC13442a
    /* renamed from: a */
    public final void mo21667a(C13434c cVar, C13428a aVar) {
        String str;
        C89219l.m154719c(cVar, "");
        C13453e.m24178b(this.f32794d, "onBridgeResult,result:" + cVar + ",call:" + aVar);
        if (aVar == null) {
            C13453e.m24177a(this.f32794d, "onBridgeResult,result:" + cVar + ",call:" + aVar);
            return;
        }
        C13455b bVar = new C13455b();
        bVar.f32778a = aVar.f32733b;
        bVar.f32779b = Integer.valueOf(cVar.f32753b);
        if (cVar.f32752a != null) {
            str = String.valueOf(cVar.f32752a);
        } else {
            str = cVar.f32754c;
        }
        bVar.f32780c = str;
        bVar.f32781d = aVar.f32734c;
        bVar.f32782e = Long.valueOf(aVar.f32741j);
        if (cVar.f32753b == 1) {
            AbstractC13454a aVar2 = this.f32771c.f32698g;
            if (aVar2 != null) {
                aVar2.mo21683b(bVar);
            }
        } else {
            AbstractC13454a aVar3 = this.f32771c.f32698g;
            if (aVar3 != null) {
                aVar3.mo21682a(bVar);
            }
        }
        m24195c(mo21687a(aVar, cVar));
    }
}
