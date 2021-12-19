package com.bytedance.p1399im.core.internal.p1431d;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z;
import com.bytedance.p1399im.core.internal.p1431d.p1433b.EnumC19964c;
import com.bytedance.p1399im.core.internal.utils.HandlerC20049x;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19503q;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19597av;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.Response;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.im.core.internal.d.a */
public abstract class AbstractC19948a implements AbstractC19969e, HandlerC20049x.AbstractC20050a {

    /* renamed from: a */
    protected HandlerC20049x f47441a;

    /* renamed from: b */
    protected HandlerC20049x f47442b;

    /* renamed from: c */
    protected HandlerC20049x f47443c;

    /* renamed from: d */
    protected final ConcurrentLinkedQueue<C19978k> f47444d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private long f47445e = 0;

    /* renamed from: f */
    private int f47446f = 0;

    /* renamed from: g */
    private long f47447g = 0;

    /* renamed from: h */
    private final boolean f47448h;

    static {
        Covode.recordClassIndex(22792);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo31824b(C19978k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo31825c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo31826c(C19978k kVar);

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: d */
    public final EnumC19964c mo31827d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31817a() {
        this.f47444d.clear();
    }

    /* renamed from: f */
    private void m37591f() {
        this.f47446f = 0;
        this.f47445e = 0;
        this.f47447g = 0;
    }

    /* renamed from: g */
    private static C19503q m37592g() {
        return C19483d.m36365a().mo31141b().f46216Y;
    }

    /* renamed from: h */
    private static boolean m37593h() {
        C19503q g = m37592g();
        if (g == null || g.f46293b <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo31823b() {
        return getClass().getSimpleName() + " ";
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: e */
    public final void mo31829e() {
        mo31817a();
        this.f47441a.removeMessages(101);
        this.f47442b.removeMessages(102);
        this.f47441a.removeMessages(103);
        this.f47441a.removeMessages(105);
    }

    AbstractC19948a() {
        HandlerThread handlerThread = new HandlerThread(mo31825c());
        handlerThread.start();
        this.f47441a = new HandlerC20049x(handlerThread.getLooper(), this);
        this.f47442b = new HandlerC20049x(handlerThread.getLooper(), this);
        boolean z = C19483d.m36365a().mo31141b().f46260ay.logCmdUsage;
        this.f47448h = z;
        C19512f.m36450a(mo31823b(), "BaseRequestManager logCmd:" + z, (Throwable) null);
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: a */
    public final void mo31820a(HandlerC20049x xVar) {
        this.f47443c = xVar;
    }

    /* renamed from: j */
    private void m37594j(C19978k kVar) {
        int i = C19483d.m36365a().mo31141b().f46278r;
        if (i > 0) {
            m37589a(105, kVar);
            mo31818a(105, kVar, (long) i);
        }
    }

    /* renamed from: m */
    private void m37597m(C19978k kVar) {
        HandlerC20049x xVar = this.f47443c;
        if (xVar != null) {
            Message obtain = Message.obtain(xVar, kVar.mo31868k());
            obtain.obj = kVar;
            this.f47443c.sendMessage(obtain);
        }
    }

    /* renamed from: f */
    public final void mo31831f(C19978k kVar) {
        if (kVar != null) {
            AbstractC19945z zVar = kVar.f47497u;
            if (zVar != null) {
                zVar.mo31736c();
            }
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = kVar;
            obtain.arg1 = 2;
            this.f47442b.sendMessage(obtain);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo31832g(C19978k kVar) {
        if (this.f47444d.contains(kVar)) {
            m37589a(103, kVar);
            m37589a(105, kVar);
            this.f47444d.remove(kVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo31833h(C19978k kVar) {
        if (this.f47444d.contains(kVar)) {
            m37589a(103, kVar);
            m37589a(105, kVar);
            this.f47444d.remove(kVar);
            m37597m(kVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo31834i(C19978k kVar) {
        C19978k peek;
        if (kVar == null || this.f47444d.isEmpty() || (peek = this.f47444d.peek()) == null || peek.f47477a != kVar.f47477a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C19978k m37588a(Response response) {
        if (response == null) {
            return null;
        }
        Iterator<C19978k> it = this.f47444d.iterator();
        while (it.hasNext()) {
            C19978k next = it.next();
            if (next.f47481e != null && response.sequence_id != null && next.f47477a == response.sequence_id.longValue()) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo31828d(C19978k kVar) {
        C19512f.m36457b("imsdk", getClass().getSimpleName() + " handleTimeOut" + kVar, (Throwable) null);
        m37590a(kVar, -1002, "request time out");
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: e */
    public final void mo31830e(C19978k kVar) {
        if (kVar == null || kVar.f47481e == null || kVar.f47481e.cmd.intValue() <= IMCMD.IMCMD_NOT_USED.getValue()) {
            C19512f.m36457b("imsdk", getClass().getSimpleName() + " send abort, item invalid:" + kVar, (Throwable) null);
            return;
        }
        AbstractC19945z zVar = kVar.f47497u;
        if (zVar != null) {
            zVar.mo31730a();
        }
        Message obtain = Message.obtain();
        obtain.what = 101;
        obtain.obj = kVar;
        this.f47441a.sendMessage(obtain);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.Request$Builder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m37596l(final com.bytedance.p1399im.core.internal.p1431d.C19978k r10) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a.m37596l(com.bytedance.im.core.internal.d.k):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [com.bytedance.im.core.proto.Request$Builder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m37595k(com.bytedance.p1399im.core.internal.p1431d.C19978k r19) {
        /*
        // Method dump skipped, instructions count: 501
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a.m37595k(com.bytedance.im.core.internal.d.k):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0169  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31819a(com.bytedance.p1399im.core.internal.p1431d.C19978k r14) {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a.mo31819a(com.bytedance.im.core.internal.d.k):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (r8 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        if (r8.cmd != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c7, code lost:
        r9 = r8.cmd;
        r4 = new java.lang.StringBuilder("On Get Response By NetType (");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if (r11 == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        r0 = "WS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d4, code lost:
        com.bytedance.p1399im.core.internal.utils.C20040r.m37873a(r9, r4.append(r0).append("): cmd:").append(r8.cmd).append(", sequence_id=").append(r8.sequence_id).toString(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        if (r1 != null) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f9, code lost:
        r1 = m37588a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0105, code lost:
        if (com.bytedance.p1399im.core.internal.utils.C19996e.m37753a(r8.cmd) != false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0107, code lost:
        com.bytedance.p1399im.core.p1407c.C19512f.m36457b("imsdk", "find local waiting request item : ".concat(java.lang.String.valueOf(r1)), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0114, code lost:
        r3 = android.os.SystemClock.uptimeMillis() - r1.f47487k;
        r9 = r1.f47488l - 1;
        r10 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0127, code lost:
        r0 = "HTTP";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
        r9 = com.bytedance.p1399im.core.proto.IMCMD.fromValue(r8.cmd.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0134, code lost:
        if (r9 != null) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0137, code lost:
        r4 = com.bytedance.p1399im.core.internal.p1431d.C19978k.m37686a(com.bytedance.p1399im.core.p1404a.C19489e.AbstractC19491b.f46184a);
        r4.mo31863a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        if (r8.status_code == null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0144, code lost:
        r0 = r8.status_code.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
        r4.f47485i = r0;
        r4 = com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x.m37537a(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0150, code lost:
        if (r4 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0152, code lost:
        com.bytedance.p1399im.core.internal.utils.C20040r.m37873a(r8.cmd, "On Get Notify By WS: " + r8.cmd, r8);
        r4.f47483g = r13;
        m37597m(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016e, code lost:
        r0 = com.bytedance.p1399im.core.p1404a.C19489e.AbstractC19491b.f46190g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r10.put("duration", r3);
        r10.put("retry", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cc, code lost:
        r0.printStackTrace();
     */
    @Override // com.bytedance.p1399im.core.internal.utils.HandlerC20049x.AbstractC20050a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31686a(android.os.Message r17) {
        /*
        // Method dump skipped, instructions count: 858
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1431d.AbstractC19948a.mo31686a(android.os.Message):void");
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: a */
    public final void mo31822a(List<Long> list) {
        if (!(list == null || list.isEmpty() || this.f47444d.isEmpty())) {
            for (Long l : list) {
                Iterator<C19978k> it = this.f47444d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C19978k next = it.next();
                    if (l.longValue() == next.f47477a) {
                        next.f47479c = null;
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m37589a(int i, C19978k kVar) {
        HandlerC20049x xVar = this.f47441a;
        if (xVar != null && kVar != null) {
            xVar.removeMessages(i, kVar);
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19969e
    /* renamed from: a */
    public final void mo31821a(Response response, C19608bd bdVar) {
        if (response != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = new C19597av(response, bdVar, SystemClock.uptimeMillis());
            obtain.arg1 = 1;
            this.f47442b.sendMessage(obtain);
        }
    }

    /* renamed from: a */
    private void m37590a(C19978k kVar, int i, String str) {
        if (kVar != null) {
            kVar.mo31862a(i, str);
            m37597m(kVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31818a(int i, C19978k kVar, long j) {
        HandlerC20049x xVar = this.f47441a;
        if (xVar != null && kVar != null) {
            if (j < 0) {
                j = 0;
            }
            Message obtainMessage = xVar.obtainMessage(i);
            obtainMessage.obj = kVar;
            this.f47441a.sendMessageDelayed(obtainMessage, j);
        }
    }
}
