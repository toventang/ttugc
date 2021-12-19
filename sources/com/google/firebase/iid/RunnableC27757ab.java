package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.firebase.iid.C27809x;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.ab */
public final /* synthetic */ class RunnableC27757ab implements Runnable {

    /* renamed from: a */
    private final C27809x.ServiceConnectionC27810a f65220a;

    static {
        Covode.recordClassIndex(33345);
    }

    RunnableC27757ab(C27809x.ServiceConnectionC27810a aVar) {
        this.f65220a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        java.lang.String.valueOf(java.lang.String.valueOf(r7)).length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        r6 = com.google.firebase.iid.C27809x.this.f65326a;
        r1 = r2.f65331b;
        r5 = android.os.Message.obtain();
        r5.what = r7.f65340c;
        r5.arg1 = r7.f65338a;
        r5.replyTo = r1;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r7.mo46467a());
        r4.putString("pkg", r6.getPackageName());
        r4.putBundle("data", r7.f65341d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r2.f65332c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r1.f65336a == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        r1.f65336a.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        if (r1.f65337b == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r1.f65337b.mo46383a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        r1 = new java.lang.IllegalStateException("Both messengers are null");
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(11904);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        r2.mo46459a(2, r0.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.RunnableC27757ab.run():void");
    }
}
