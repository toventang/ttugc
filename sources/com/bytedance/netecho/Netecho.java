package com.bytedance.netecho;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.netecho.result.DnsResolveResult;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.bytedance.netecho.result.IcmpPacketResult;
import com.bytedance.netecho.result.TcpDetectResult;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class Netecho {
    public static final Netecho INSTANCE = new Netecho();
    private static final String LIB_NAME = LIB_NAME;
    private static final int STAGE_ATON = 1;
    private static final int STAGE_FINISH = 6;
    private static final int STAGE_RECV = 5;
    private static final int STAGE_SEND = 4;
    private static final int STAGE_SET_OPT = 3;
    private static final int STAGE_SOCKET = 2;
    private static final String TAG = TAG;

    private static final native IcmpDetectResult nativeDetectIcmp(String str, long j, int i);

    private static final native IcmpDetectResult nativeDetectIcmpV6(String str, int i, long j, int i2);

    private static final native TcpDetectResult nativeDetectTcp(String str, int i, long j);

    private static final native TcpDetectResult nativeDetectTcpV6(String str, int i, long j);

    private Netecho() {
    }

    static {
        Covode.recordClassIndex(25146);
        NetechoConfig.INSTANCE.getLoadLibrary().invoke(LIB_NAME);
    }

    public static final IcmpPacketResult[] createIcmpPacketResultsArray(int i) {
        IcmpPacketResult[] icmpPacketResultArr = new IcmpPacketResult[i];
        for (int i2 = 0; i2 < i; i2++) {
            icmpPacketResultArr[i2] = null;
        }
        return icmpPacketResultArr;
    }

    public final DnsResolveResult resolveDns(String str, long j) {
        C89219l.m154719c(str, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        boolean z = true;
        eVar.element = (T) new CountDownLatch(1);
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = null;
        C89233z.C89238e eVar3 = new C89233z.C89238e();
        eVar3.element = null;
        new Thread(new Netecho$resolveDns$1(eVar2, str, eVar3, eVar)).start();
        eVar.element.await(j, TimeUnit.MILLISECONDS);
        if (eVar2.element == null) {
            z = false;
        }
        return new DnsResolveResult(z, eVar2.element, eVar3.element);
    }

    public static final TcpDetectResult createTcpDetectResult(boolean z, int i, int i2) {
        return new TcpDetectResult(z, i, i2);
    }

    public final IcmpDetectResult detectIcmp(String str, long j, int i) {
        MethodCollector.m26663i(5288);
        C89219l.m154719c(str, "");
        IcmpDetectResult nativeDetectIcmp = nativeDetectIcmp(str, j, i);
        MethodCollector.m26664o(5288);
        return nativeDetectIcmp;
    }

    public final TcpDetectResult detectTcp(String str, int i, long j) {
        MethodCollector.m26663i(5290);
        C89219l.m154719c(str, "");
        TcpDetectResult nativeDetectTcp = nativeDetectTcp(str, i, j);
        MethodCollector.m26664o(5290);
        return nativeDetectTcp;
    }

    public final TcpDetectResult detectTcpV6(String str, int i, long j) {
        MethodCollector.m26663i(5397);
        C89219l.m154719c(str, "");
        TcpDetectResult nativeDetectTcpV6 = nativeDetectTcpV6(str, i, j);
        MethodCollector.m26664o(5397);
        return nativeDetectTcpV6;
    }

    public static final IcmpDetectResult createIcmpDetectResult(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        return new IcmpDetectResult(z, icmpPacketResultArr, i, i2);
    }

    public final IcmpDetectResult detectIcmpV6(String str, int i, long j, int i2) {
        MethodCollector.m26663i(5395);
        C89219l.m154719c(str, "");
        IcmpDetectResult nativeDetectIcmpV6 = nativeDetectIcmpV6(str, i, j, i2);
        MethodCollector.m26664o(5395);
        return nativeDetectIcmpV6;
    }

    public static final void addIcmpPacketResultToArray(IcmpPacketResult[] icmpPacketResultArr, int i, boolean z, int i2, float f, int i3) {
        C89219l.m154719c(icmpPacketResultArr, "");
        icmpPacketResultArr[i] = new IcmpPacketResult(z, i2, f, i3);
    }
}
