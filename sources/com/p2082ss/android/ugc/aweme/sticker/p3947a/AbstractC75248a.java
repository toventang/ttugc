package com.p2082ss.android.ugc.aweme.sticker.p3947a;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.a */
public abstract class AbstractC75248a {

    /* renamed from: a */
    public final AbstractC14177d f169189a;

    static {
        Covode.recordClassIndex(88150);
    }

    /* renamed from: a */
    public abstract String mo118587a();

    /* renamed from: a */
    public abstract void mo118588a(int i, String str);

    /* renamed from: b */
    public abstract boolean mo118590b();

    public AbstractC75248a(AbstractC14177d dVar) {
        C89219l.m154721d(dVar, "");
        this.f169189a = dVar;
    }

    /* renamed from: a */
    public final void mo118589a(long j, String str) {
        C89219l.m154721d(str, "");
        C73991bj.m130133d("Effect interface: " + mo118587a() + " send effect Msg: arg2: " + j + " msg: " + str);
        this.f169189a.mo22747A().mo56903a(41, 41, j, str);
    }
}
