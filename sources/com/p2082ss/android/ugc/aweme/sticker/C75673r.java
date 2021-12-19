package com.p2082ss.android.ugc.aweme.sticker;

import android.graphics.Rect;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71027i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.r */
public final class C75673r extends AbstractC71027i {

    /* renamed from: a */
    public C75864s f170093a;

    /* renamed from: b */
    public AbstractC75674a f170094b;

    /* renamed from: c */
    private AbstractC14552j f170095c;

    /* renamed from: com.ss.android.ugc.aweme.sticker.r$a */
    public interface AbstractC75674a {
        static {
            Covode.recordClassIndex(88605);
        }

        /* renamed from: a */
        void mo119404a();
    }

    static {
        Covode.recordClassIndex(88604);
    }

    @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
    /* renamed from: a */
    public final boolean mo23109a(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
    /* renamed from: b */
    public final boolean mo23111b(float f) {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
    /* renamed from: c */
    public final boolean mo23112c() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71027i
    /* renamed from: e */
    public final void mo112162e() {
        AbstractC75674a aVar = this.f170094b;
        if (aVar != null) {
            aVar.mo119404a();
        }
    }

    public C75673r(AbstractC14552j jVar, AbstractC89171a<Rect> aVar) {
        C89219l.m154721d(jVar, "");
        this.f170095c = jVar;
        this.f170093a = new C75864s(this, this.f170095c.mo23382a(), aVar);
        this.f170095c.mo23383a(new C14544f(0, this.f170093a));
    }
}
