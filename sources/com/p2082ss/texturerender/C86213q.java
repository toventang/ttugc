package com.p2082ss.texturerender;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Message;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.texturerender.VideoSurface;
import com.p2082ss.texturerender.p4404a.AbstractC86171a;
import com.p2082ss.texturerender.p4404a.C86174d;
import com.p2082ss.texturerender.p4404a.C86175e;
import com.p2082ss.texturerender.p4404a.C86176f;
import com.p2082ss.texturerender.p4404a.C86177g;
import com.p2082ss.texturerender.p4404a.C86178h;
import com.p2082ss.texturerender.p4404a.C86179i;
import com.p2082ss.texturerender.p4404a.C86180j;
import com.p2082ss.texturerender.p4404a.C86185o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.texturerender.q */
public final class C86213q extends AbstractC86206n {

    /* renamed from: D */
    private static C86213q f192408D;

    /* renamed from: A */
    private int f192409A = 0;

    /* renamed from: B */
    private int f192410B = 0;

    /* renamed from: C */
    private int f192411C = 0;

    /* renamed from: s */
    private AbstractC86171a f192412s = new C86178h();

    /* renamed from: t */
    private C86179i f192413t;

    /* renamed from: u */
    private Queue<Integer> f192414u = new LinkedList();

    /* renamed from: v */
    private C86185o f192415v;

    /* renamed from: w */
    private C86180j f192416w;

    /* renamed from: x */
    private ByteBuffer f192417x = null;

    /* renamed from: y */
    private int f192418y = 1;

    /* renamed from: z */
    private float f192419z = 0.5f;

    static {
        Covode.recordClassIndex(101356);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: e */
    public final void mo136507e() {
        for (AbstractC86171a a = this.f192412s.mo136470a(); a != null; a = a.mo136470a()) {
        }
    }

    /* renamed from: i */
    private void m148166i() {
        if (this.f192413t == null) {
            this.f192413t = new C86179i();
        }
        if (this.f192344m == null) {
            this.f192344m = new C86177g();
        }
    }

    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: g */
    public final synchronized void mo136510g() {
        MethodCollector.m26663i(5255);
        super.mo136510g();
        f192408D = null;
        MethodCollector.m26664o(5255);
    }

    /* renamed from: h */
    private void m148165h() {
        try {
            C86180j jVar = this.f192416w;
            if (jVar != null) {
                jVar.mo136470a();
            }
            C86180j jVar2 = (C86180j) C86175e.m148024a(7);
            this.f192416w = jVar2;
            jVar2.mo136469a((Bundle) null);
            this.f192416w.f192177f = this;
        } catch (Exception e) {
            mo136525a(e.toString());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: c */
    public final void mo136504c() {
        if (this.f192339h != -1) {
            try {
                C86185o oVar = this.f192415v;
                if (oVar != null) {
                    oVar.mo136470a();
                }
                C86185o oVar2 = (C86185o) C86175e.m148024a(3);
                this.f192415v = oVar2;
                oVar2.mo136469a((Bundle) null);
                this.f192415v.f192177f = this;
            } catch (Exception e) {
                mo136525a(e.toString());
            }
            if (this.f192348q.f192198a) {
                m148165h();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: d */
    public final void mo136505d() {
        C86203l.m148116a(f192332a, "delete program");
        C86185o oVar = this.f192415v;
        if (oVar != null) {
            oVar.mo136470a();
            this.f192415v = null;
        }
        C86180j jVar = this.f192416w;
        if (jVar != null) {
            jVar.mo136470a();
            this.f192416w = null;
        }
        C86179i iVar = this.f192413t;
        if (iVar != null) {
            C86197g.m148103a(iVar.f192208a);
            this.f192413t = null;
        }
        if (this.f192344m != null) {
            C86177g gVar = this.f192344m;
            while (!gVar.f192206a.isEmpty()) {
                C86176f poll = gVar.f192206a.poll();
                C86197g.m148105b(poll.f192201a);
                C86203l.m148116a("TR_EffectTextureManager", "release delTex:".concat(String.valueOf(poll)));
            }
            this.f192344m = null;
        }
    }

    /* renamed from: a */
    private AbstractC86171a m148158a(int i) {
        for (AbstractC86171a aVar = this.f192412s.f192179h; aVar != null; aVar = aVar.f192179h) {
            if (aVar.mo136468a(10005) == i) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private int m148163b(int i) {
        AbstractC86171a a = m148158a(i);
        if (a == null || a.mo136468a(10004) == 3553) {
            return 0;
        }
        Bundle bundle = a.f192176e;
        if (bundle != null) {
            bundle.putInt("texture_type", 3553);
        }
        int a2 = a.mo136469a(bundle);
        C86203l.m148116a(f192332a, "reInit, effectType:" + i + ",texTarget:texture_2d");
        if (a2 == 0) {
            return 0;
        }
        a.mo136470a();
        return a2;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: e */
    public final void mo136508e(Message message) {
        MethodCollector.m26663i(5600);
        Bundle data = message.getData();
        if (data != null) {
            C86211p pVar = (C86211p) data.getSerializable("texture");
            if (pVar != null) {
                boolean z = true;
                if (this.f192346o != 0 && !pVar.isCurrentObject(this.f192346o)) {
                    z = false;
                }
                if (pVar.handleSurfaceChange(z, this.f192336e)) {
                    this.f192346o = pVar.getOjbectId();
                    C86203l.m148116a(f192332a, "texture switch surface & playing " + this.f192346o);
                }
                Object obj = message.obj;
                if (obj != null) {
                    synchronized (obj) {
                        try {
                            obj.notify();
                        } catch (Throwable th) {
                            MethodCollector.m26664o(5600);
                            throw th;
                        }
                    }
                }
                C86203l.m148116a(f192332a, "set surface done");
                MethodCollector.m26664o(5600);
                return;
            }
            RuntimeException runtimeException = new RuntimeException("update surface but missing texture");
            MethodCollector.m26664o(5600);
            throw runtimeException;
        }
        RuntimeException runtimeException2 = new RuntimeException("update surface but missing bundle?");
        MethodCollector.m26664o(5600);
        throw runtimeException2;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: d */
    public final void mo136506d(Message message) {
        int i = message.what;
        if (i != 12) {
            if (i == 25) {
                Bundle data = message.getData();
                Surface surface = (Surface) data.getParcelable("surface");
                C86211p pVar = (C86211p) data.getSerializable("texture");
                if (message.arg1 == 1) {
                    pVar.initExtraSurface(surface);
                    return;
                } else if (message.arg1 == 2) {
                    pVar.releaseExtraSurface(surface);
                    return;
                } else if (message.arg1 == 3) {
                    pVar.releaseAllExtraSurface();
                    return;
                } else {
                    return;
                }
            } else if (i != 26) {
                switch (i) {
                    case 34:
                        m148159a(message.arg1, message.arg2);
                        return;
                    case 35:
                        Bundle data2 = message.getData();
                        if (data2 != null) {
                            int i2 = message.arg1;
                            float f = data2.getFloat("float_value");
                            switch (i2) {
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                    this.f192412s.mo136472a(i2, f);
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            return;
                        }
                    case 36:
                        break;
                    default:
                        return;
                }
            } else {
                C86211p pVar2 = (C86211p) message.obj;
                if (pVar2 != null) {
                    pVar2.handleUpdateVideoState(message.arg1);
                    return;
                }
                return;
            }
        }
        C86203l.m148116a(f192332a, "setEffect bundle:" + message.getData() + " surfacetexture:" + message.obj);
        m148160a(message.getData(), (C86211p) message.obj);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.texturerender.AbstractC86206n
    /* renamed from: f */
    public final void mo136509f(Message message) {
        int i;
        int i2;
        int i3;
        int i4;
        ByteBuffer allocateDirect;
        C86211p pVar = (C86211p) message.obj;
        if (m148162a(pVar, message.arg1)) {
            C86211p pVar2 = (C86211p) message.obj;
            Bundle data = message.getData();
            VideoSurface.AbstractC86169c cVar = (VideoSurface.AbstractC86169c) data.getSerializable("callback");
            if (cVar != null) {
                try {
                    int viewportWidth = pVar2.getViewportWidth();
                    int viewportHeight = pVar2.getViewportHeight();
                    float f = data.getFloat("width", -1.0f);
                    if (f > 0.0f) {
                        float f2 = (float) viewportWidth;
                        i2 = Math.round(f * f2);
                        float f3 = (float) viewportHeight;
                        i = Math.round(data.getFloat("height") * f3);
                        i3 = Math.round(data.getFloat("x") * f2);
                        i4 = Math.round(data.getFloat("y") * f3);
                    } else {
                        i = viewportHeight;
                        i2 = viewportWidth;
                        i3 = 0;
                        i4 = 0;
                    }
                    C86203l.m148116a(f192332a, "async saveframe = " + i2 + ", " + i + " viewW:" + viewportWidth + " viewH:" + viewportHeight);
                    int i5 = i2 * i * 4;
                    if (data.getBoolean("reuse_buffer")) {
                        ByteBuffer byteBuffer = this.f192417x;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.f192417x = ByteBuffer.allocateDirect(i5);
                        }
                        allocateDirect = this.f192417x;
                    } else {
                        allocateDirect = ByteBuffer.allocateDirect(i5);
                    }
                    allocateDirect.rewind();
                    allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                    GLES20.glFinish();
                    GLES20.glReadPixels(i3, i4, i2, i, 6408, 5121, allocateDirect);
                    C86197g.m148104a("handleSaveFrame");
                    allocateDirect.rewind();
                    int i6 = i2 * 4;
                    byte[] bArr = new byte[i6];
                    for (int i7 = 0; i7 < i / 2; i7++) {
                        allocateDirect.get(bArr);
                        System.arraycopy(allocateDirect.array(), allocateDirect.limit() - allocateDirect.position(), allocateDirect.array(), allocateDirect.position() - i6, i6);
                        System.arraycopy(bArr, 0, allocateDirect.array(), allocateDirect.limit() - allocateDirect.position(), i6);
                    }
                    allocateDirect.rewind();
                    cVar.onFrame(allocateDirect, i2, i);
                } catch (Exception e) {
                    C86203l.m148116a(f192332a, "save frame failed " + e.getMessage());
                }
            }
            pVar.render();
        }
    }

    public C86213q(C86174d dVar, int i) {
        super(dVar, i);
    }

    /* renamed from: a */
    private void m148159a(int i, int i2) {
        if (i == 8) {
            this.f192412s.mo136473a(i, i2);
        } else if (i == 14 || i == 17) {
            this.f192412s.mo136473a(i, i2);
        } else if (i != 26) {
            switch (i) {
                case 29:
                    this.f192409A = i2;
                    return;
                case 30:
                    this.f192410B = i2;
                    return;
                case 31:
                    this.f192411C = i2;
                    return;
                default:
                    return;
            }
        } else {
            this.f192418y = i2;
        }
    }

    /* renamed from: a */
    private void m148160a(Bundle bundle, C86211p pVar) {
        if (bundle == null) {
            C86203l.m148116a(f192332a, "set effect but missing bundle?");
            return;
        }
        int i = bundle.getInt("action");
        switch (i) {
            case C84224v.f188239U:
                AbstractC86171a a = m148158a(bundle.getInt("effect_type"));
                if (a != null) {
                    a.mo136472a(i, bundle.getFloat("float_value"));
                    return;
                }
                return;
            case 21:
                m148164b(bundle, pVar);
                return;
            case 22:
                AbstractC86171a a2 = m148158a(bundle.getInt("effect_type"));
                if (a2 != null) {
                    a2.mo136477b(bundle);
                    return;
                }
                return;
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            default:
                return;
            case 27:
                this.f192419z = bundle.getFloat("float_value", 0.5f);
                return;
            case 29:
                m148159a(29, bundle.getInt("int_value", 0));
                return;
            case 30:
                m148159a(30, bundle.getInt("int_value", 0));
                return;
            case 31:
                m148159a(31, bundle.getInt("int_value", 0));
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m148164b(android.os.Bundle r10, com.p2082ss.texturerender.C86211p r11) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.texturerender.C86213q.m148164b(android.os.Bundle, com.ss.texturerender.p):int");
    }

    /* renamed from: a */
    private boolean m148162a(C86211p pVar, int i) {
        boolean z;
        if (pVar == null) {
            C86203l.m148116a(f192332a, "surface texture is null not draw");
            return false;
        }
        try {
            pVar.lock();
            if (pVar.isRelease()) {
                C86203l.m148116a(f192332a, "surface texture is released not draw");
                pVar.unlock();
                return false;
            }
            pVar.updateTexImage();
            pVar.unlock();
            while (!this.f192414u.isEmpty()) {
                pVar.notifyError(this.f192414u.poll().intValue());
            }
            if (!pVar.needDrop() && i != 0) {
                if (!pVar.isMakeCurrent()) {
                    if (pVar.getRenderSurface() == null) {
                        C86203l.m148116a(f192332a, "texture : " + pVar + " not set surface");
                        return false;
                    } else if (!this.f192337f.hasMessages(4)) {
                        C86203l.m148116a(f192332a, "texture : " + pVar + ", retry create");
                        if (!pVar.createEGLWindowSurface(false, false, EGL14.EGL_NO_SURFACE)) {
                            C86203l.m148116a(f192332a, "texture : " + pVar + ", retry failed");
                            return false;
                        }
                    }
                }
                CopyOnWriteArrayList<Bundle> paramList = pVar.getParamList();
                if (paramList != null) {
                    Iterator<Bundle> it = paramList.iterator();
                    while (it.hasNext()) {
                        m148160a(it.next(), pVar);
                    }
                }
                AbstractC86187b texId = pVar.getTexId();
                int c = texId.mo136493c();
                HashMap<Integer, Integer> hashMap = this.f192348q.f192200c;
                C86174d effectConfig = pVar.getEffectConfig();
                Iterator<Map.Entry<Integer, Integer>> it2 = hashMap.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    Map.Entry<Integer, Integer> next = it2.next();
                    if (next.getValue().intValue() == 1 && effectConfig.mo136483a(next.getKey().intValue())) {
                        z = true;
                        break;
                    }
                }
                C86176f fVar = new C86176f(null, c, pVar.getTexWidth(), pVar.getTexHeight(), 36197);
                if (z) {
                    for (AbstractC86171a aVar = this.f192412s.f192179h; aVar != null; aVar = aVar.f192179h) {
                        int a = aVar.mo136468a(10005);
                        if (effectConfig.mo136483a(a)) {
                            if (fVar.f192205e == 36197 && aVar.mo136468a(10004) == 3553) {
                                this.f192415v.f192175d = pVar;
                                fVar = this.f192415v.mo136471a(fVar, this.f192413t);
                            }
                            aVar.f192175d = pVar;
                            fVar = aVar.mo136471a(fVar, this.f192413t);
                        } else {
                            pVar.setOption(19, a, 0);
                        }
                    }
                } else {
                    pVar.resetFlag();
                }
                boolean z2 = false;
                for (Map.Entry<Surface, EGLSurface> entry : pVar.getExtraRealSurfaces().entrySet()) {
                    EGLSurface value = entry.getValue();
                    pVar.makeCurrent(value);
                    m148161a(fVar, pVar, pVar.getConsumerHeight(value), pVar.getConsumerWidth(value));
                    pVar.eglSwapBuffer(value);
                    z2 = true;
                }
                if (!pVar.isCurrentObject(this.f192346o)) {
                    if (pVar.isMakeCurrent()) {
                        C86203l.m148116a(f192332a, "not active texture but already make current : ".concat(String.valueOf(pVar)));
                        pVar.makeCurrent();
                        this.f192346o = pVar.getOjbectId();
                        C86203l.m148116a(f192332a, "texture switch surface & playing " + this.f192346o);
                    } else {
                        C86203l.m148116a(f192332a, "tex: " + pVar + " not current object id " + this.f192346o + ", " + pVar.getOjbectId());
                        texId.mo136494d();
                        return false;
                    }
                } else if (z2) {
                    pVar.makeCurrent();
                }
                m148161a(fVar, pVar, pVar.getViewportHeight(), pVar.getViewportWidth());
                texId.mo136494d();
                if (GLES20.glGetError() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            pVar.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    private void m148161a(C86176f fVar, C86211p pVar, int i, int i2) {
        AbstractC86171a aVar;
        if (fVar.f192205e == 3553) {
            aVar = this.f192416w;
        } else {
            aVar = this.f192415v;
        }
        if (aVar != null) {
            aVar.f192175d = pVar;
            aVar.mo136473a(26, this.f192418y);
            aVar.mo136472a(27, this.f192419z);
            aVar.mo136473a(29, this.f192409A);
            aVar.mo136473a(30, this.f192410B);
            aVar.mo136473a(31, this.f192411C);
            aVar.mo136473a(10006, i2);
            aVar.mo136473a(10007, i);
            aVar.mo136471a(fVar, (C86179i) null);
        }
    }
}
