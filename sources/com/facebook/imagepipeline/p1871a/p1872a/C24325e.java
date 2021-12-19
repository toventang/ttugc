package com.facebook.imagepipeline.p1871a.p1872a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1836h.C24117a;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.a.a.e */
public final class C24325e {

    /* renamed from: a */
    public final AbstractC24323c f57681a;

    /* renamed from: b */
    public final int f57682b;

    /* renamed from: c */
    private C24117a<Bitmap> f57683c;

    /* renamed from: d */
    private List<C24117a<Bitmap>> f57684d;

    static {
        Covode.recordClassIndex(28467);
    }

    /* renamed from: a */
    public final synchronized C24117a<Bitmap> mo40124a() {
        C24117a<Bitmap> b;
        MethodCollector.m26663i(3129);
        b = C24117a.m45711b(this.f57683c);
        MethodCollector.m26664o(3129);
        return b;
    }

    /* renamed from: b */
    public final synchronized void mo40126b() {
        MethodCollector.m26663i(3206);
        C24117a.m45712c(this.f57683c);
        this.f57683c = null;
        C24117a.m45709a((Iterable<? extends C24117a<?>>) this.f57684d);
        this.f57684d = null;
        MethodCollector.m26664o(3206);
    }

    /* renamed from: c */
    public final synchronized int mo40128c() {
        MethodCollector.m26663i(4327);
        List<C24117a<Bitmap>> list = this.f57684d;
        if (list != null) {
            int size = list.size();
            MethodCollector.m26664o(4327);
            return size;
        }
        MethodCollector.m26664o(4327);
        return 0;
    }

    /* renamed from: a */
    public static C24325e m46291a(AbstractC24323c cVar) {
        return new C24325e(cVar);
    }

    private C24325e(AbstractC24323c cVar) {
        this.f57681a = (AbstractC24323c) C24091i.m45617a(cVar);
        this.f57682b = 0;
    }

    C24325e(C24326f fVar) {
        this.f57681a = (AbstractC24323c) C24091i.m45617a(fVar.f57685a);
        this.f57682b = fVar.f57688d;
        this.f57683c = C24117a.m45711b(fVar.f57686b);
        this.f57684d = C24117a.m45708a((Collection) fVar.f57687c);
    }

    /* renamed from: a */
    public final synchronized C24117a<Bitmap> mo40125a(int i) {
        MethodCollector.m26663i(2943);
        List<C24117a<Bitmap>> list = this.f57684d;
        if (list != null) {
            C24117a<Bitmap> b = C24117a.m45711b(list.get(i));
            MethodCollector.m26664o(2943);
            return b;
        }
        MethodCollector.m26664o(2943);
        return null;
    }

    /* renamed from: b */
    public final synchronized boolean mo40127b(int i) {
        MethodCollector.m26663i(2983);
        List<C24117a<Bitmap>> list = this.f57684d;
        if (list == null || list.get(i) == null) {
            MethodCollector.m26664o(2983);
            return false;
        }
        MethodCollector.m26664o(2983);
        return true;
    }
}
