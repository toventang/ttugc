package com.p2082ss.ugc.live.barrage.p4467a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.barrage.a.b */
public class C87056b extends AbstractC87048a {

    /* renamed from: a */
    private final Bitmap f196264a;

    static {
        Covode.recordClassIndex(102822);
    }

    @Override // com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a
    /* renamed from: b */
    public final Bitmap mo140675b() {
        return this.f196264a;
    }

    public C87056b(Bitmap bitmap) {
        C89219l.m154719c(bitmap, "");
        this.f196264a = bitmap;
        this.f196257j.right = this.f196257j.left + ((float) bitmap.getWidth());
        this.f196257j.bottom = this.f196257j.top + ((float) bitmap.getHeight());
        this.f196255h = true;
    }
}
