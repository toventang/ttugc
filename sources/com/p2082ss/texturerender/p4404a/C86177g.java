package com.p2082ss.texturerender.p4404a;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.C86197g;
import com.p2082ss.texturerender.C86203l;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.ss.texturerender.a.g */
public final class C86177g {

    /* renamed from: a */
    public LinkedList<C86176f> f192206a = new LinkedList<>();

    /* renamed from: b */
    private int f192207b = 4;

    static {
        Covode.recordClassIndex(101320);
    }

    /* renamed from: a */
    public final void mo136489a(C86176f fVar) {
        this.f192206a.offer(fVar);
        while (this.f192206a.size() > this.f192207b) {
            C86176f poll = this.f192206a.poll();
            C86197g.m148105b(poll.f192201a);
            C86203l.m148116a("TR_EffectTextureManager", "onTextureReturn delTex:".concat(String.valueOf(poll)));
        }
    }

    /* renamed from: a */
    public final C86176f mo136488a(int i, int i2) {
        int i3;
        Iterator<C86176f> it = this.f192206a.iterator();
        while (it.hasNext()) {
            C86176f next = it.next();
            if (i == next.f192203c && i2 == next.f192204d) {
                it.remove();
                return next;
            }
        }
        C86176f poll = this.f192206a.poll();
        if (poll == null) {
            i3 = C86197g.m148102a();
        } else {
            i3 = poll.f192201a;
        }
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        C86176f fVar = new C86176f(this, i3, i, i2, 3553);
        C86203l.m148116a("TR_EffectTextureManager", "genTexture:" + fVar.toString());
        return fVar;
    }
}
