package com.p2082ss.videoarch.strategy.inferenceEngine.p4486a;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.videoarch.strategy.inferenceEngine.a.c */
public final class C87225c {

    /* renamed from: a */
    protected final String f197555a;

    static {
        Covode.recordClassIndex(103028);
    }

    /* renamed from: a */
    public final List<String> mo141099a() {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f197555a);
            ArrayList arrayList = new ArrayList();
            if (allByName != null && allByName.length > 0) {
                for (InetAddress inetAddress : allByName) {
                    arrayList.add(inetAddress.getHostAddress());
                }
            }
            return arrayList;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    C87225c(String str) {
        this.f197555a = str;
    }
}
