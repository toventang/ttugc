package com.bytedance.platform.godzilla.p1585c;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.EnumC21693b;
import com.bytedance.platform.godzilla.p1574a.AbstractC21692h;
import com.bytedance.platform.godzilla.p1574a.C21689g;

/* renamed from: com.bytedance.platform.godzilla.c.e */
public abstract class AbstractC21721e extends AbstractC21717a implements AbstractC21692h {
    static {
        Covode.recordClassIndex(25362);
    }

    /* renamed from: c */
    public abstract boolean mo35373c();

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: d */
    public final EnumC21720d mo35374d() {
        return EnumC21720d.REGISTER_EXCEPTION;
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: a */
    public void mo35350a() {
        super.mo35350a();
        if (mo35373c()) {
            EnumC21693b.INSTANCE.addUncaughtExceptionConsumer(this);
            mo35351b();
            C21689g.m40635a(C21689g.EnumC21691a.ERROR);
        }
    }
}
