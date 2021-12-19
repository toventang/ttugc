package com.p2082ss.android.agilelogger.p2110a.p2117d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.agilelogger.a.d.a */
public final class C29715a implements AbstractC29716b {

    /* renamed from: a */
    private final String f70877a = "Thread: ";

    static {
        Covode.recordClassIndex(36112);
    }

    @Override // com.p2082ss.android.agilelogger.p2110a.AbstractC29704b
    /* renamed from: a */
    public final /* synthetic */ String mo51950a(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Thread: ");
        stringBuffer.append(((Thread) obj).getName());
        return stringBuffer.toString();
    }
}
