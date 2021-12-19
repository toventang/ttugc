package com.p2082ss.android.ugc.asve.recorder;

import android.opengl.EGLContext;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.f */
public final class C31210f implements AbstractC31211g {

    /* renamed from: a */
    public final CopyOnWriteArrayList<AbstractC31211g> f74808a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final AbstractC31191d f74809b;

    static {
        Covode.recordClassIndex(37856);
    }

    public C31210f(AbstractC31191d dVar) {
        C89219l.m154721d(dVar, "");
        this.f74809b = dVar;
    }

    @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85365j
    /* renamed from: a */
    public final void mo56846a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, long j2) {
        Iterator<T> it = this.f74808a.iterator();
        while (it.hasNext()) {
            it.next().mo56846a(eGLContext, i, i2, i3, i4, j, j2);
        }
    }
}
