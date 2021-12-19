package com.bytedance.push.p1598i;

import android.util.Pair;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21798f;
import com.bytedance.push.PushBody;
import com.bytedance.push.p1590c.AbstractC21771b;
import com.bytedance.push.p1593f.C21804c;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.pushmanager.C30205a;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.push.i.h */
public final class RunnableC21846h implements Runnable {

    /* renamed from: a */
    private final PushBody f51756a;

    /* renamed from: b */
    private final int f51757b;

    static {
        Covode.recordClassIndex(25498);
    }

    public final void run() {
        String str;
        String a;
        AbstractC21771b bVar = C21798f.f51646a.mo35451h().f51604x;
        String str2 = this.f51756a.f51546e;
        C21804c a2 = C21842e.m40914a(C30061a.f71748a, this.f51757b);
        String str3 = "";
        if (a2 != null) {
            str = a2.f51678d;
        } else {
            str = str3;
        }
        if (!(bVar == null || (a = bVar.mo35412a()) == null)) {
            str3 = a;
        }
        String a3 = C30205a.m61093a("/cloudpush/user_push_replace/");
        C30062a.m60802a(a3, C21798f.f51646a.mo35448e());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("ttpush_sec_target_uid", str2));
        arrayList.add(new Pair("local_sec_uid", str3));
        arrayList.add(new Pair("send_sdk", String.valueOf(this.f51757b)));
        arrayList.add(new Pair("token", str));
        arrayList.add(new Pair("rid64", String.valueOf(this.f51756a.f51543b)));
        try {
            AbstractC13621j.f33100a.mo21869a(a3, arrayList, (Map<String, String>) null);
        } catch (Throwable unused) {
        }
    }

    public RunnableC21846h(int i, PushBody pushBody) {
        this.f51757b = i;
        this.f51756a = pushBody;
    }
}
