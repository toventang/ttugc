package com.p2082ss.android.p2092ad.splash.core.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ad.splash.core.video.SSRenderSurfaceView */
public class SSRenderSurfaceView extends C29576d implements SurfaceHolder.Callback {

    /* renamed from: c */
    private static ArrayList<SurfaceHolder$CallbackC29588h> f70437c = new ArrayList<>();

    /* renamed from: a */
    private AbstractC29557a f70438a;

    /* renamed from: b */
    private SurfaceHolder$CallbackC29588h f70439b;

    public View getView() {
        return this;
    }

    static {
        Covode.recordClassIndex(35951);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        AbstractC29557a aVar = this.f70438a;
        if (aVar != null) {
            aVar.mo51773a(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC29557a aVar = this.f70438a;
        if (aVar != null) {
            aVar.mo51775b(surfaceHolder);
        }
    }

    /* renamed from: a */
    public final void mo51768a(AbstractC29557a aVar) {
        this.f70438a = aVar;
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<SurfaceHolder$CallbackC29588h> it = f70437c.iterator();
        while (it.hasNext()) {
            SurfaceHolder$CallbackC29588h next = it.next();
            if (next.f70560a.get() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f70439b);
    }

    public SSRenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SurfaceHolder$CallbackC29588h hVar = new SurfaceHolder$CallbackC29588h(this);
        this.f70439b = hVar;
        f70437c.add(hVar);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AbstractC29557a aVar = this.f70438a;
        if (aVar != null) {
            aVar.mo51774a(surfaceHolder, i, i2, i3);
        }
    }
}
