package com.lynx.tasm.behavior.shadow.text;

import android.text.Layout;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.shadow.text.HandlerThreadC28563m;
import java.lang.ref.WeakReference;

/* renamed from: com.lynx.tasm.behavior.shadow.text.o */
public class C28568o {

    /* renamed from: a */
    private LruCache<C28570p, C28566n> f67222a;

    static {
        Covode.recordClassIndex(34584);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.shadow.text.o$a */
    public static class C28569a {

        /* renamed from: a */
        public static C28568o f67223a = new C28568o((byte) 0);

        static {
            Covode.recordClassIndex(34585);
        }
    }

    private C28568o() {
        this.f67222a = new LruCache<>(500);
    }

    /* synthetic */ C28568o(byte b) {
        this();
    }

    /* renamed from: a */
    public final C28566n mo49185a(AbstractC28520j jVar, C28570p pVar) {
        C28566n nVar = this.f67222a.get(pVar);
        if (nVar != null) {
            return nVar;
        }
        C28566n nVar2 = new C28566n(jVar, pVar);
        this.f67222a.put(pVar, nVar2);
        HandlerThreadC28563m mVar = HandlerThreadC28563m.C28564a.f67211a;
        Layout layout = nVar2.f67214a;
        if (mVar.f67210a != null) {
            mVar.f67210a.obtainMessage(0, new WeakReference(layout)).sendToTarget();
        }
        return nVar2;
    }
}
