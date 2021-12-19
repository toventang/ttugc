package com.p2082ss.android.ttvecamera.p2201j;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.AbstractC30825g;
import com.p2082ss.android.ttvecamera.C30844i;
import com.p2082ss.android.ttvecamera.TEFrameSizei;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.j.b */
public abstract class AbstractC30857b {

    /* renamed from: a */
    private AbstractC30860a f73918a = new AbstractC30860a() {
        /* class com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.C308581 */

        static {
            Covode.recordClassIndex(37483);
        }

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
        public final void onFrameCaptured(C30844i iVar) {
        }

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
        public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    };

    /* renamed from: b */
    private AbstractC30860a f73919b = new AbstractC30861b() {
        /* class com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.C308592 */

        static {
            Covode.recordClassIndex(37484);
        }

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30861b
        /* renamed from: a */
        public final void mo55889a(SurfaceTexture surfaceTexture) {
        }

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30861b
        /* renamed from: a */
        public final void mo55890a(Object obj) {
        }

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
        public final void onFrameCaptured(C30844i iVar) {
        }

        @Override // com.p2082ss.android.ttvecamera.p2201j.AbstractC30857b.AbstractC30860a
        public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    };

    /* renamed from: f */
    AbstractC30860a f73920f;

    /* renamed from: g */
    public C30844i.EnumC30847b f73921g;

    /* renamed from: h */
    public TEFrameSizei f73922h = new TEFrameSizei();

    /* renamed from: i */
    AbstractC30825g f73923i;

    /* renamed from: j */
    public boolean f73924j = true;

    /* renamed from: k */
    public int f73925k = 1;

    /* renamed from: l */
    public C30844i.C30848c f73926l;

    /* renamed from: com.ss.android.ttvecamera.j.b$a */
    public interface AbstractC30860a {
        static {
            Covode.recordClassIndex(37485);
        }

        void onFrameCaptured(C30844i iVar);

        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* renamed from: com.ss.android.ttvecamera.j.b$b */
    public interface AbstractC30861b extends AbstractC30860a {
        static {
            Covode.recordClassIndex(37486);
        }

        /* renamed from: a */
        void mo55889a(SurfaceTexture surfaceTexture);

        /* renamed from: a */
        void mo55890a(Object obj);
    }

    static {
        Covode.recordClassIndex(37482);
    }

    /* renamed from: a */
    public int mo55879a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    /* renamed from: a */
    public abstract int mo55872a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei);

    /* renamed from: a */
    public abstract Surface mo55873a();

    /* renamed from: a */
    public abstract void mo55874a(SurfaceTexture surfaceTexture);

    /* renamed from: b */
    public abstract SurfaceTexture mo55875b();

    /* renamed from: c */
    public abstract int mo55876c();

    /* renamed from: d */
    public abstract void mo55877d();

    /* renamed from: f */
    public Surface mo55883f() {
        return null;
    }

    /* renamed from: g */
    public Surface[] mo55884g() {
        return null;
    }

    /* renamed from: h */
    public void mo55885h() {
    }

    /* renamed from: i */
    public int mo55886i() {
        return -1;
    }

    /* renamed from: e */
    public void mo55882e() {
        if (this.f73920f instanceof AbstractC30861b) {
            this.f73920f = this.f73919b;
        } else {
            this.f73920f = this.f73918a;
        }
    }

    /* renamed from: a */
    public static List<TEFrameSizei> m63568a(Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo55880a(C30844i iVar) {
        AbstractC30860a aVar = this.f73920f;
        if (aVar != null) {
            aVar.onFrameCaptured(iVar);
        }
    }

    /* renamed from: a */
    public final void mo55881a(Object obj) {
        AbstractC30860a aVar = this.f73920f;
        if (aVar != null && (aVar instanceof AbstractC30861b)) {
            ((AbstractC30861b) aVar).mo55890a(obj);
        }
    }

    public AbstractC30857b(C30862c.C30863a aVar, AbstractC30825g gVar) {
        this.f73921g = aVar.f73938h;
        this.f73920f = aVar.f73933c;
        this.f73922h = aVar.f73932b;
        this.f73923i = gVar;
        this.f73924j = aVar.f73931a;
        this.f73925k = aVar.f73936f;
    }
}
