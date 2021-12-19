package com.p2082ss.texturerender;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.texturerender.C86198h;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.texturerender.i */
public final class C86200i implements C86198h.AbstractC86199a {

    /* renamed from: a */
    private ArrayList<AbstractC86187b> f192324a = new ArrayList<>();

    static {
        Covode.recordClassIndex(101343);
    }

    /* renamed from: a */
    public final void mo136514a() {
        MethodCollector.m26663i(3960);
        synchronized (this.f192324a) {
            try {
                Iterator<AbstractC86187b> it = this.f192324a.iterator();
                while (it.hasNext()) {
                    C86198h hVar = (C86198h) it.next();
                    C86203l.m148116a("ITexture", hVar + "release = " + hVar.f192319a);
                    hVar.mo136493c();
                    GLES20.glDeleteTextures(1, new int[hVar.f192319a], 0);
                    hVar.f192320b.unlock();
                    C86203l.m148116a("ITexture", hVar + "release end = " + hVar.f192319a);
                    it.remove();
                }
            } finally {
                MethodCollector.m26664o(3960);
            }
        }
    }

    @Override // com.p2082ss.texturerender.C86198h.AbstractC86199a
    /* renamed from: a */
    public final void mo136512a(AbstractC86187b bVar) {
        MethodCollector.m26663i(3939);
        synchronized (this.f192324a) {
            try {
                this.f192324a.add(bVar);
                this.f192324a.size();
            } finally {
                MethodCollector.m26664o(3939);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC86187b mo136513a(int i) {
        AbstractC86187b hVar;
        MethodCollector.m26663i(3949);
        synchronized (this.f192324a) {
            try {
                if (this.f192324a.size() > 0) {
                    Iterator<AbstractC86187b> it = this.f192324a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        hVar = it.next();
                        if (hVar.mo136495e() == i) {
                            it.remove();
                            new StringBuilder("reuse texture:").append(hVar).append(" texTarget:").append(hVar.mo136495e());
                            break;
                        }
                    }
                }
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                if (iArr[0] != 0) {
                    if (iArr[0] != 0) {
                        GLES20.glBindTexture(i, iArr[0]);
                        GLES20.glTexParameteri(i, 10242, 33071);
                        GLES20.glTexParameteri(i, 10243, 33071);
                        GLES20.glTexParameteri(i, 10241, 9729);
                        GLES20.glTexParameteri(i, 10240, 9729);
                    }
                    hVar = new C86198h(iArr[0], i, this);
                } else {
                    RuntimeException runtimeException = new RuntimeException("Error gen texture.");
                    MethodCollector.m26664o(3949);
                    throw runtimeException;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(3949);
                throw th;
            }
        }
        hVar.mo136466a();
        MethodCollector.m26664o(3949);
        return hVar;
    }
}
