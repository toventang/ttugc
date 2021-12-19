package com.bytedance.netecho;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

final class Netecho$resolveDns$1 implements Runnable {
    final /* synthetic */ String $hostName;
    final /* synthetic */ C89233z.C89238e $ip;
    final /* synthetic */ C89233z.C89238e $latch;
    final /* synthetic */ C89233z.C89238e $throwableMsg;

    static {
        Covode.recordClassIndex(25147);
    }

    Netecho$resolveDns$1(C89233z.C89238e eVar, String str, C89233z.C89238e eVar2, C89233z.C89238e eVar3) {
        this.$ip = eVar;
        this.$hostName = str;
        this.$throwableMsg = eVar2;
        this.$latch = eVar3;
    }

    /* renamed from: com_bytedance_netecho_Netecho$resolveDns$1_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m40421x35aab4c2(String str, String str2) {
        return 0;
    }

    public final void run() {
        try {
            C89233z.C89238e eVar = this.$ip;
            InetAddress byName = InetAddress.getByName(this.$hostName);
            C89219l.m154709a((Object) byName, "");
            eVar.element = (T) byName.getHostAddress();
            m40421x35aab4c2(Netecho.access$getTAG$p(Netecho.INSTANCE), "resolve dns " + this.$hostName + " to " + ((String) this.$ip.element));
        } catch (Throwable th) {
            th = th;
            do {
                this.$throwableMsg.element = (T) (th.getClass().getSimpleName() + ":" + th.getMessage());
                th = th.getCause();
            } while (th != null);
        }
        this.$latch.element.countDown();
    }
}
