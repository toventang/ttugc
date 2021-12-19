package com.p2082ss.texturerender;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.texturerender.p4404a.C86174d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.texturerender.m */
public final class C86205m {

    /* renamed from: e */
    private static C86205m f192327e;

    /* renamed from: a */
    public List<AbstractC86206n> f192328a = new ArrayList();

    /* renamed from: b */
    public ReentrantLock f192329b = new ReentrantLock();

    /* renamed from: c */
    public String f192330c = null;

    /* renamed from: d */
    public Context f192331d;

    static {
        Covode.recordClassIndex(101348);
    }

    private C86205m() {
    }

    /* renamed from: a */
    public static synchronized C86205m m148119a() {
        C86205m mVar;
        synchronized (C86205m.class) {
            MethodCollector.m26663i(3969);
            if (f192327e == null) {
                f192327e = new C86205m();
            }
            mVar = f192327e;
            MethodCollector.m26664o(3969);
        }
        return mVar;
    }

    /* renamed from: c */
    public final synchronized boolean mo136520c() {
        MethodCollector.m26663i(4036);
        boolean z = false;
        if (this.f192328a.size() == 0) {
            MethodCollector.m26664o(4036);
            return false;
        }
        this.f192329b.lock();
        Iterator<AbstractC86206n> it = this.f192328a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC86206n next = it.next();
            if (next.f192348q.f192198a && next.f192347p == 0 && (next.f192347p & 4) == 0) {
                z = true;
                break;
            }
        }
        this.f192329b.unlock();
        MethodCollector.m26664o(4036);
        return z;
    }

    /* renamed from: b */
    public final synchronized void mo136519b() {
        MethodCollector.m26663i(3975);
        if (this.f192328a.size() != 0) {
            this.f192329b.lock();
            Iterator<AbstractC86206n> it = this.f192328a.iterator();
            while (it.hasNext()) {
                AbstractC86206n next = it.next();
                C86203l.m148116a("TextureRenderManager", "render = " + next + ", call release");
                next.mo136510g();
                it.remove();
                C86203l.m148116a("TextureRenderManager", "release : remove render =" + next + "size = " + this.f192328a.size());
            }
            this.f192329b.unlock();
        }
        f192327e = null;
        MethodCollector.m26664o(3975);
    }

    /* renamed from: a */
    public final synchronized boolean mo136518a(C86174d dVar) {
        MethodCollector.m26663i(4049);
        boolean z = false;
        if (this.f192328a.size() == 0) {
            MethodCollector.m26664o(4049);
            return false;
        }
        this.f192329b.lock();
        Iterator<AbstractC86206n> it = this.f192328a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC86206n next = it.next();
            if (next.f192348q.mo136484a(dVar) && next.f192347p == 1 && (next.f192347p & 4) == 0) {
                z = true;
                break;
            }
        }
        this.f192329b.unlock();
        MethodCollector.m26664o(4049);
        return z;
    }

    /* renamed from: a */
    public final synchronized VideoSurface mo136517a(boolean z, int i) {
        VideoSurface a;
        MethodCollector.m26663i(4032);
        C86174d dVar = new C86174d();
        dVar.mo136481a(z);
        a = mo136516a(dVar, i);
        MethodCollector.m26664o(4032);
        return a;
    }

    /* renamed from: b */
    private VideoSurface m148120b(C86174d dVar, int i) {
        AbstractC86206n a = C86195e.m148100a(dVar, i);
        C86203l.m148116a("TextureRenderManager", "new TextureRenderer use:".concat(String.valueOf(a)));
        if (a.f192339h != -1) {
            VideoSurface f = a.mo136530f();
            if (f == null) {
                this.f192330c = a.f192340i;
                a.mo136510g();
                return null;
            }
            this.f192329b.lock();
            this.f192328a.add(a);
            C86203l.m148116a("TextureRenderManager", "add render = " + a + ", effectconfig= " + dVar + ", texType =" + i + ",size = " + this.f192328a.size());
            this.f192329b.unlock();
            return f;
        }
        this.f192330c = a.f192340i;
        a.mo136510g();
        return null;
    }

    /* renamed from: a */
    public final synchronized VideoSurface mo136516a(C86174d dVar, int i) {
        MethodCollector.m26663i(4021);
        if (this.f192328a.size() == 0) {
            VideoSurface b = m148120b(dVar, i);
            MethodCollector.m26664o(4021);
            return b;
        }
        this.f192329b.lock();
        Iterator<AbstractC86206n> it = this.f192328a.iterator();
        while (it.hasNext()) {
            AbstractC86206n next = it.next();
            C86174d dVar2 = next.f192348q;
            if (!dVar2.mo136484a(dVar)) {
                C86203l.m148116a("TextureRenderManager", "render type is mis match = " + dVar2 + ", " + dVar);
            } else if ((dVar2.f192198a || dVar2.f192199b) && next.f192347p != i) {
                C86203l.m148116a("TextureRenderManager", "sr/sharpen but tex type is mis match = " + next.f192347p + ", " + i);
            } else if ((i & 4) == (next.f192347p & 4)) {
                C86203l.m148116a("TextureRenderManager", "TextureRenderer use:".concat(String.valueOf(next)));
                VideoSurface f = next.mo136530f();
                if (f != null) {
                    this.f192329b.unlock();
                    MethodCollector.m26664o(4021);
                    return f;
                } else if (next.f192339h <= 0) {
                    C86203l.m148116a("TextureRenderManager", "remove render =" + next + " state = " + next.f192339h);
                    next.mo136510g();
                    it.remove();
                }
            } else {
                continue;
            }
        }
        this.f192329b.unlock();
        VideoSurface b2 = m148120b(dVar, i);
        MethodCollector.m26664o(4021);
        return b2;
    }
}
