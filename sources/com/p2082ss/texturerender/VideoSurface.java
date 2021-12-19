package com.p2082ss.texturerender;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.texturerender.VideoSurface */
public class VideoSurface extends Surface implements Handler.Callback {

    /* renamed from: a */
    public C86211p f192166a;

    /* renamed from: b */
    public AbstractC86167a f192167b;

    /* renamed from: c */
    public Handler f192168c;

    /* renamed from: d */
    private ArrayList<AbstractC86168b> f192169d;

    /* renamed from: e */
    private Object f192170e;

    /* renamed from: f */
    private Bundle f192171f;

    /* renamed from: com.ss.texturerender.VideoSurface$a */
    public interface AbstractC86167a {
        static {
            Covode.recordClassIndex(101310);
        }

        /* renamed from: a */
        void mo136463a();
    }

    /* renamed from: com.ss.texturerender.VideoSurface$b */
    public interface AbstractC86168b {
        static {
            Covode.recordClassIndex(101311);
        }

        /* renamed from: a */
        void mo136464a(int i);
    }

    /* renamed from: com.ss.texturerender.VideoSurface$c */
    public interface AbstractC86169c extends Serializable {
        static {
            Covode.recordClassIndex(101312);
        }

        int onFrame(ByteBuffer byteBuffer, int i, int i2);
    }

    static {
        Covode.recordClassIndex(101309);
    }

    /* renamed from: a */
    public final int mo136447a() {
        return mo136459c(10, -1);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.Surface, java.lang.Object
    public void finalize() {
        m147982b();
        super.finalize();
    }

    /* renamed from: b */
    private synchronized void m147982b() {
        MethodCollector.m26663i(3868);
        C86211p pVar = this.f192166a;
        if (pVar != null) {
            pVar.releaseOffScreenSurface(false);
            this.f192166a = null;
        }
        MethodCollector.m26664o(3868);
    }

    public void release() {
        MethodCollector.m26663i(3879);
        C86203l.m148116a("VideoSurface", this + "release");
        super.release();
        m147982b();
        synchronized (this.f192170e) {
            try {
                this.f192167b = null;
                this.f192168c = null;
                ArrayList<AbstractC86168b> arrayList = this.f192169d;
                if (arrayList != null) {
                    arrayList.clear();
                }
            } finally {
                MethodCollector.m26664o(3879);
            }
        }
    }

    /* renamed from: b */
    public final void mo136456b(int i) {
        C86211p pVar = this.f192166a;
        if (pVar != null) {
            pVar.setSuperResolutionMode(i);
        }
    }

    /* renamed from: b */
    public final void mo136458b(boolean z) {
        C86211p pVar = this.f192166a;
        if (pVar != null) {
            pVar.ignoreSRResolutionCheck(z);
        }
    }

    public VideoSurface(C86211p pVar) {
        super(pVar);
        this.f192166a = pVar;
        if (Looper.myLooper() != null) {
            this.f192168c = new Handler(this);
        } else {
            this.f192168c = new Handler(Looper.getMainLooper(), this);
        }
        this.f192170e = new Object();
        this.f192171f = new Bundle();
    }

    /* renamed from: a */
    public final void mo136448a(int i) {
        MethodCollector.m26663i(3830);
        ArrayList<AbstractC86168b> arrayList = this.f192169d;
        if (arrayList == null || arrayList.isEmpty()) {
            MethodCollector.m26664o(3830);
            return;
        }
        synchronized (this.f192170e) {
            try {
                Message obtainMessage = this.f192168c.obtainMessage(4097);
                obtainMessage.arg1 = i;
                obtainMessage.sendToTarget();
            } finally {
                MethodCollector.m26664o(3830);
            }
        }
    }

    public boolean handleMessage(Message message) {
        ArrayList<AbstractC86168b> arrayList;
        int i = message.what;
        if (i != 4096) {
            if (i != 4097 || (arrayList = this.f192169d) == null || arrayList.isEmpty() || this.f192166a == null) {
                return true;
            }
            int i2 = message.arg1;
            Iterator<AbstractC86168b> it = this.f192169d.iterator();
            while (it.hasNext()) {
                it.next().mo136464a(i2);
            }
            return true;
        } else if (this.f192167b == null || this.f192166a == null) {
            return true;
        } else {
            int i3 = message.arg1;
            int serial = this.f192166a.getSerial();
            if (i3 != serial) {
                C86203l.m148116a("VideoSurface", "serial change :" + i3 + ", " + serial);
                return true;
            }
            message.getData().getLong("timeStamp");
            this.f192167b.mo136463a();
            return true;
        }
    }

    /* renamed from: a */
    public final void mo136452a(Bundle bundle) {
        C86211p pVar = this.f192166a;
        if (pVar != null) {
            pVar.setEffect(bundle);
        }
    }

    /* renamed from: a */
    public final void mo136453a(Surface surface) {
        C86211p pVar = this.f192166a;
        if (pVar != null) {
            pVar.updateSurface(surface);
        }
    }

    /* renamed from: a */
    public final void mo136454a(AbstractC86168b bVar) {
        if (this.f192169d == null) {
            this.f192169d = new ArrayList<>();
        }
        if (!this.f192169d.contains(bVar)) {
            this.f192169d.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo136455a(boolean z) {
        C86211p pVar = this.f192166a;
        if (pVar != null) {
            pVar.pause(z, true);
        }
    }

    /* renamed from: a */
    public final void mo136449a(int i, float f) {
        C86211p pVar = this.f192166a;
        if (pVar != null) {
            pVar.setOption(i, f);
        }
    }

    /* renamed from: c */
    public final int mo136459c(int i, int i2) {
        C86211p pVar = this.f192166a;
        if (pVar != null) {
            return pVar.getIntOption(i, i2);
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo136450a(int i, int i2) {
        C86211p pVar = this.f192166a;
        if (pVar != null) {
            pVar.updateTexDimension(i, i2);
        }
    }

    /* renamed from: b */
    public final void mo136457b(int i, int i2) {
        if (i != 1) {
            C86211p pVar = this.f192166a;
            if (pVar != null) {
                pVar.setOption(i, i2);
                return;
            }
            return;
        }
        C86211p pVar2 = this.f192166a;
        if (pVar2 != null) {
            pVar2.updateVideoState(i2);
        }
    }

    /* renamed from: a */
    public final void mo136451a(int i, long j) {
        MethodCollector.m26663i(3836);
        if (this.f192167b == null) {
            MethodCollector.m26664o(3836);
            return;
        }
        synchronized (this.f192170e) {
            try {
                Message obtainMessage = this.f192168c.obtainMessage(4096);
                this.f192171f.putLong("timeStamp", j);
                obtainMessage.arg1 = i;
                obtainMessage.setData(this.f192171f);
                obtainMessage.sendToTarget();
            } finally {
                MethodCollector.m26664o(3836);
            }
        }
    }
}
