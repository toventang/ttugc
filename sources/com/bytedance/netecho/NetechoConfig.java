package com.bytedance.netecho;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class NetechoConfig {
    public static final NetechoConfig INSTANCE = new NetechoConfig();
    private static AbstractC89172b<? super String, C89391z> loadLibrary = NetechoConfig$loadLibrary$1.INSTANCE;

    private NetechoConfig() {
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.String, h.z>, h.f.a.b<java.lang.String, h.z> */
    public final AbstractC89172b<String, C89391z> getLoadLibrary() {
        return loadLibrary;
    }

    static {
        Covode.recordClassIndex(25148);
    }

    public final void setLoadLibrary(AbstractC89172b<? super String, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        loadLibrary = bVar;
    }
}
