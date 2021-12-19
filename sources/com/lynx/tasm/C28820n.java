package com.lynx.tasm;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.jsbridge.C28361f;
import com.lynx.jsbridge.LynxModule;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.behavior.C28477c;
import com.lynx.tasm.component.AbstractC28735a;
import com.lynx.tasm.p2056e.AbstractC28769b;
import com.lynx.tasm.p2056e.C28768a;
import com.lynx.tasm.provider.AbstractC28843b;
import com.lynx.tasm.provider.AbstractC28850h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.n */
public class C28820n {

    /* renamed from: j */
    static Float f68023j;

    /* renamed from: a */
    AbstractC28843b f68024a;

    /* renamed from: b */
    C28477c f68025b;

    /* renamed from: c */
    List<C28361f> f68026c;

    /* renamed from: d */
    C28818l f68027d;

    /* renamed from: e */
    boolean f68028e;

    /* renamed from: f */
    boolean f68029f;

    /* renamed from: g */
    Float f68030g;

    /* renamed from: h */
    AbstractC28735a f68031h;

    /* renamed from: i */
    final Map<String, AbstractC28850h> f68032i = new HashMap();

    /* renamed from: k */
    boolean f68033k = true;

    /* renamed from: l */
    boolean f68034l = LynxEnv.m56706b().f66642i;

    /* renamed from: m */
    boolean f68035m = false;

    /* renamed from: n */
    EnumC28856r f68036n = EnumC28856r.ALL_ON_UI;

    /* renamed from: o */
    int f68037o;

    /* renamed from: p */
    int f68038p;

    /* renamed from: q */
    int f68039q = -1;

    /* renamed from: r */
    int f68040r = -1;

    /* renamed from: s */
    float f68041s = 1.0f;

    static {
        Covode.recordClassIndex(34927);
    }

    public C28820n() {
        LynxEnv.m56706b().mo48562a();
        this.f68025b = new C28477c(LynxEnv.m56706b().mo48569c());
        this.f68024a = LynxEnv.m56706b().f66635b;
        this.f68026c = new ArrayList();
        this.f68030g = null;
        Float f = f68023j;
        if (f != null) {
            this.f68030g = f;
        }
    }

    /* renamed from: a */
    public final C28820n mo49941a(float f) {
        this.f68041s = f;
        return this;
    }

    /* renamed from: b */
    public final C28820n mo49944b(boolean z) {
        this.f68035m = z;
        return this;
    }

    /* renamed from: a */
    public final C28820n mo49942a(AbstractC28735a aVar) {
        this.f68031h = aVar;
        return this;
    }

    /* renamed from: a */
    public C28820n mo49935a(C28818l lVar) {
        this.f68027d = lVar;
        return this;
    }

    /* renamed from: a */
    public final LynxView mo49940a(Context context) {
        boolean z;
        TraceEvent.m56864a(0, "CreateLynxView");
        AbstractC28769b bVar = C28768a.m57580a().f67847a;
        if (bVar == null || !bVar.mo49889b()) {
            z = false;
        } else {
            z = true;
        }
        this.f68029f = z;
        LynxView lynxView = new LynxView(context, this);
        TraceEvent.m56869b(0, "CreateLynxView");
        return lynxView;
    }

    /* renamed from: a */
    public C28820n mo49936a(EnumC28856r rVar) {
        if (rVar != null) {
            this.f68036n = rVar;
        }
        return this;
    }

    /* renamed from: a */
    public C28820n mo49937a(List<C28463a> list) {
        this.f68025b.mo48989a(list);
        return this;
    }

    /* renamed from: a */
    public C28820n mo49938a(boolean z) {
        this.f68028e = z;
        return this;
    }

    /* renamed from: a */
    public C28820n mo49934a(int i, int i2) {
        this.f68038p = i2;
        this.f68037o = i;
        return this;
    }

    /* renamed from: a */
    public final C28820n mo49943a(String str, AbstractC28850h hVar) {
        this.f68032i.put(str, hVar);
        return this;
    }

    /* renamed from: a */
    public void mo49939a(String str, Class<? extends LynxModule> cls, Object obj) {
        C28361f fVar = new C28361f();
        fVar.f66612b = cls;
        fVar.f66613c = obj;
        fVar.f66611a = str;
        this.f68026c.add(fVar);
    }
}
