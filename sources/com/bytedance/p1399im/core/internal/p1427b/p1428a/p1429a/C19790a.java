package com.bytedance.p1399im.core.internal.p1427b.p1428a.p1429a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19595at;
import com.bytedance.p1399im.core.p1408d.C19600ay;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import com.bytedance.p1399im.core.p1408d.p1411c.C19626a;
import com.bytedance.p1399im.core.p1408d.p1411c.C19627b;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.im.core.internal.b.a.a.a */
public final class C19790a implements AbstractC19945z {

    /* renamed from: e */
    private static final Integer f46990e = 1;

    /* renamed from: f */
    private static final Integer f46991f = 10;

    /* renamed from: a */
    private final C19600ay f46992a;

    /* renamed from: b */
    private final C19626a f46993b;

    /* renamed from: c */
    private final boolean f46994c;

    /* renamed from: d */
    private ConcurrentHashMap<Integer, C19627b> f46995d = new ConcurrentHashMap<>();

    /* renamed from: a */
    private static boolean m37257a(long j) {
        return j == 0;
    }

    /* renamed from: e */
    private void m37258e() {
        this.f46993b.f46637m = this.f46995d;
    }

    static {
        Covode.recordClassIndex(22634);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: a */
    public final void mo31730a() {
        if (m37257a(this.f46993b.f46625a)) {
            this.f46993b.f46625a = SystemClock.uptimeMillis();
            C19626a aVar = this.f46993b;
            aVar.f46626b = aVar.f46625a - this.f46992a.f46557k;
            return;
        }
        m37256a("logHandlerSendTime");
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: b */
    public final void mo31734b() {
        if (m37257a(this.f46993b.f46627c)) {
            this.f46993b.f46627c = SystemClock.uptimeMillis();
            C19626a aVar = this.f46993b;
            aVar.f46628d = aVar.f46627c - this.f46993b.f46625a;
            return;
        }
        m37256a("logHandleWhatSendTime");
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: c */
    public final void mo31736c() {
        if (m37257a(this.f46993b.f46633i)) {
            this.f46993b.f46633i = SystemClock.uptimeMillis();
            C19626a aVar = this.f46993b;
            aVar.f46632h = aVar.f46633i - this.f46993b.f46627c;
            ConcurrentHashMap<Integer, C19627b> concurrentHashMap = this.f46995d;
            concurrentHashMap.get(Collections.max(concurrentHashMap.keySet())).f46643f = true;
            return;
        }
        m37256a("logReceiveHttpStart");
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: d */
    public final void mo31738d() {
        if (m37257a(this.f46993b.f46634j)) {
            this.f46993b.f46634j = SystemClock.uptimeMillis();
            C19626a aVar = this.f46993b;
            aVar.f46635k = aVar.f46634j - this.f46993b.f46633i;
            m37258e();
            return;
        }
        m37256a("logReceiveHttpEnd");
    }

    public C19790a(C19600ay ayVar) {
        this.f46992a = ayVar;
        this.f46993b = ayVar.f46569w;
        this.f46994c = C19483d.m36365a().mo31141b().f46260ay.enableCrash;
    }

    /* renamed from: a */
    private void m37256a(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("throwOrLogStateError:".concat(String.valueOf(str)));
        if (!this.f46994c) {
            C19512f.m36457b("imsdk", "SendMsgNetworkIntercept", illegalArgumentException);
            return;
        }
        throw illegalArgumentException;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: b */
    public final void mo31735b(int i) {
        C19627b bVar = this.f46995d.get(Integer.valueOf(i + 1));
        if (bVar == null) {
            m37256a("logSendByWsAfterEncode is null");
        } else {
            bVar.f46645h = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: c */
    public final void mo31737c(int i) {
        C19627b bVar = this.f46995d.get(Integer.valueOf(i + 1));
        if (bVar == null) {
            m37256a("logSendByWsPostRetry is null");
        } else {
            bVar.f46646i = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: d */
    public final void mo31739d(int i) {
        C19627b bVar = this.f46995d.get(Integer.valueOf((i + 1) * 10));
        if (bVar == null) {
            m37256a("logSendByHttpBeforeSend is null");
        } else {
            bVar.f46647j = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: e */
    public final void mo31740e(int i) {
        C19627b bVar = this.f46995d.get(Integer.valueOf((i + 1) * 10));
        if (bVar == null) {
            m37256a("logSendByHttpFailure is null");
        } else {
            bVar.f46648k = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: f */
    public final void mo31741f(int i) {
        C19627b bVar = this.f46995d.get(Integer.valueOf((i + 1) * 10));
        if (bVar == null) {
            m37256a("logSendByHttpFailure is null");
        } else {
            bVar.f46649l = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: a */
    public final void mo31731a(int i) {
        C19627b bVar = this.f46995d.get(Integer.valueOf(i + 1));
        if (bVar == null) {
            m37256a("logSendByWsBeforeEncode is null");
        } else {
            bVar.f46644g = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: a */
    public final void mo31733a(long j, C19608bd bdVar) {
        if (m37257a(this.f46993b.f46630f)) {
            C19626a aVar = this.f46993b;
            aVar.f46632h = j - aVar.f46627c;
            this.f46993b.f46629e = j;
            this.f46993b.f46630f = SystemClock.uptimeMillis();
            C19626a aVar2 = this.f46993b;
            aVar2.f46631g = aVar2.f46630f - this.f46993b.f46629e;
            this.f46993b.f46636l = (bdVar.f46597a.get(Integer.valueOf(C19595at.f46521g)).longValue() - bdVar.f46597a.get(Integer.valueOf(C19595at.f46520f)).longValue()) / 1000000;
            m37258e();
            return;
        }
        m37256a("logReceiveWs");
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z
    /* renamed from: a */
    public final void mo31732a(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (z) {
            i3 = (i2 + 1) * 10;
        } else if (i > 10) {
            m37256a("logBeforeRealSend,wsRetry is broken:".concat(String.valueOf(i)));
            return;
        } else {
            i3 = i + 1;
        }
        this.f46995d.putIfAbsent(Integer.valueOf(i3), new C19627b(i, i2, z, z2, SystemClock.uptimeMillis()));
    }
}
