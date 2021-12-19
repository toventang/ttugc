package com.bytedance.netecho;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89216i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89278d;

final /* synthetic */ class NetechoConfig$loadLibrary$1 extends C89216i implements AbstractC89172b<String, C89391z> {
    public static final NetechoConfig$loadLibrary$1 INSTANCE = new NetechoConfig$loadLibrary$1();

    static {
        Covode.recordClassIndex(25149);
    }

    NetechoConfig$loadLibrary$1() {
        super(1);
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
    public final String getName() {
        return "loadLibrary";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final String getSignature() {
        return "loadLibrary(Ljava/lang/String;)V";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final AbstractC89278d getOwner() {
        return C89204ab.m154669a(System.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* bridge */ /* synthetic */ C89391z invoke(String str) {
        invoke(str);
        return C89391z.f203057a;
    }

    /* renamed from: com_bytedance_netecho_NetechoConfig$loadLibrary$1_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m40422x73638c2c(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38962a(str);
        C58032m.m104852a(uptimeMillis, str);
    }

    public final void invoke(String str) {
        C89219l.m154719c(str, "");
        m40422x73638c2c(str);
    }
}
