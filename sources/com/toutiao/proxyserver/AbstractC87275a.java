package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.metrics.p3438b.C59227a;
import com.p2082ss.android.ugc.aweme.metrics.p3438b.C59231e;
import com.toutiao.proxyserver.C87401x;
import com.toutiao.proxyserver.net.C87354a;
import com.toutiao.proxyserver.net.C87360c;
import com.toutiao.proxyserver.net.C87363e;
import com.toutiao.proxyserver.p4490b.C87295a;
import com.toutiao.proxyserver.p4490b.C87296b;
import com.toutiao.proxyserver.p4491c.C87301c;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p077b.C1731i;

/* renamed from: com.toutiao.proxyserver.a */
public abstract class AbstractC87275a implements AbstractRunnableC87288ac {

    /* renamed from: a */
    protected volatile AbstractC87294b f197787a;

    /* renamed from: b */
    protected final C87301c f197788b;

    /* renamed from: c */
    protected final AtomicInteger f197789c = new AtomicInteger();

    /* renamed from: d */
    protected final AtomicLong f197790d = new AtomicLong();

    /* renamed from: e */
    protected volatile List<C87360c> f197791e;

    /* renamed from: f */
    protected volatile C87354a f197792f;

    /* renamed from: g */
    protected volatile String f197793g;

    /* renamed from: h */
    protected volatile String f197794h;

    /* renamed from: i */
    protected volatile C87403y f197795i;

    /* renamed from: j */
    protected volatile C87289ad f197796j;

    /* renamed from: k */
    protected volatile int f197797k;

    /* renamed from: l */
    protected AtomicLong f197798l = new AtomicLong(0);

    /* renamed from: m */
    private AtomicLong f197799m = new AtomicLong(0);

    /* renamed from: n */
    private final AtomicInteger f197800n = new AtomicInteger(0);

    /* renamed from: o */
    private int f197801o = -1;

    static {
        Covode.recordClassIndex(103171);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141300a(final boolean z, final String str, final int i, final int i2, final String str2, final String str3) {
        final AbstractC87366o oVar = C87383u.f198087g;
        if (oVar != null) {
            C87328b.m151562b(new Runnable() {
                /* class com.toutiao.proxyserver.AbstractC87275a.RunnableC872772 */

                static {
                    Covode.recordClassIndex(103173);
                }

                public final void run() {
                    oVar.mo124041a(z, str, i, i2, str3);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        if (r7 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141299a(java.lang.Throwable r25, java.lang.String r26, int r27) {
        /*
        // Method dump skipped, instructions count: 427
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.AbstractC87275a.mo141299a(java.lang.Throwable, java.lang.String, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141297a(final String str, final String str2, final int i, final long j) {
        C87328b.m151562b(new Runnable() {
            /* class com.toutiao.proxyserver.AbstractC87275a.RunnableC872794 */

            static {
                Covode.recordClassIndex(103175);
            }

            public final void run() {
                if (C87383u.f198087g != null) {
                    try {
                        AbstractC87366o oVar = C87383u.f198087g;
                        String str = str;
                        String str2 = str2;
                        int i = i;
                        long j = j;
                        C87296b bVar = new C87296b();
                        bVar.f197862a = str;
                        bVar.f197863b = str2;
                        bVar.f197864c = i;
                        bVar.f197865d = (int) j;
                        oVar.mo124035a(bVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141298a(final String str, final String str2, final long j, final long j2) {
        C87328b.m151562b(new Runnable() {
            /* class com.toutiao.proxyserver.AbstractC87275a.RunnableC872805 */

            static {
                Covode.recordClassIndex(103176);
            }

            public final void run() {
                if (C87383u.f198088h != null) {
                    try {
                        C87295a aVar = new C87295a();
                        aVar.f197860c = j;
                        aVar.f197861d = j2;
                        aVar.f197858a = str;
                        aVar.f197859b = str2;
                        C87383u.f198088h.mo124032a(aVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo141290a() {
        if (this.f197800n.compareAndSet(0, 1)) {
            mo141301b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo141301b() {
        C87354a aVar = this.f197792f;
        this.f197792f = null;
        if (aVar != null) {
            aVar.mo141395b();
        }
    }

    /* renamed from: c */
    public final boolean mo141303c() {
        if (this.f197800n.get() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo141304d() {
        this.f197800n.compareAndSet(0, 2);
        this.f197792f = null;
    }

    /* renamed from: e */
    public final boolean mo141305e() {
        if (this.f197800n.get() == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo141306f() {
        if (mo141303c()) {
            throw new C87309e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo141309i() {
        this.f197799m.set(SystemClock.elapsedRealtime());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo141310j() {
        this.f197798l.set(0);
        this.f197799m.set(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo141307g() {
        if (this.f197795i != null) {
            return this.f197795i.f198167c.f198168a;
        }
        if (this.f197787a instanceof C87325g) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo141308h() {
        this.f197798l.getAndAdd(SystemClock.elapsedRealtime() - this.f197799m.get());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141295a(final String str) {
        final AbstractC87366o oVar = C87383u.f198087g;
        if (oVar != null) {
            C87328b.m151562b(new Runnable() {
                /* class com.toutiao.proxyserver.AbstractC87275a.RunnableC872783 */

                static {
                    Covode.recordClassIndex(103174);
                }

                public final void run() {
                    AbstractC87366o oVar = oVar;
                    AbstractC87275a.this.mo141307g();
                    oVar.mo124034a(AbstractC87275a.this.f197789c.get(), AbstractC87275a.this.f197798l.get(), 0);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141292a(final int i, final String str) {
        C87328b.m151562b(new Runnable() {
            /* class com.toutiao.proxyserver.AbstractC87275a.RunnableC872838 */

            static {
                Covode.recordClassIndex(103179);
            }

            public final void run() {
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo141302b(int i, int i2) {
        C87354a aVar;
        if (i == 1 && (aVar = this.f197792f) != null) {
            String a = aVar.mo141394a(null);
            if (C87383u.f198091k != null) {
                C87383u.f198091k.mo98195a(a, i2);
            }
        }
    }

    public AbstractC87275a(AbstractC87294b bVar, C87301c cVar) {
        this.f197787a = bVar;
        this.f197788b = cVar;
        this.f197797k = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141291a(final int i, final int i2) {
        final AbstractC87366o oVar = C87383u.f198087g;
        if (oVar != null && i > 0 && i2 >= 0) {
            int i3 = C87383u.f198104x;
            final int g = mo141307g();
            if (i3 == 1 || (i3 == 2 && g == 1)) {
                int i4 = (int) ((((float) i2) / ((float) i)) * 100.0f);
                if (i4 > 100) {
                    i4 = 100;
                }
                synchronized (this) {
                    int i5 = this.f197801o + C87383u.f198095o;
                    if (i5 > 100) {
                        i5 = 100;
                    }
                    if ((i4 > i5 || i4 == 100) && this.f197801o != 100) {
                        this.f197801o = i4;
                        C87328b.m151562b(new Runnable() {
                            /* class com.toutiao.proxyserver.AbstractC87275a.RunnableC872761 */

                            static {
                                Covode.recordClassIndex(103172);
                            }

                            public final void run() {
                                oVar.mo124038a(AbstractC87275a.this.f197793g, i, i2);
                            }
                        });
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141293a(Exception exc, int i, int i2) {
        C87354a aVar;
        if (i == 1 && (aVar = this.f197792f) != null) {
            String a = aVar.mo141394a(exc);
            if (C87383u.f198091k != null) {
                C87383u.f198091k.mo98194a(exc, a, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141294a(final Exception exc, final int i, final String str) {
        C87328b.m151562b(new Runnable() {
            /* class com.toutiao.proxyserver.AbstractC87275a.RunnableC872827 */

            static {
                Covode.recordClassIndex(103178);
            }

            public final void run() {
                C87348j jVar;
                if (C87383u.f198087g != null) {
                    AbstractC87366o oVar = C87383u.f198087g;
                    Exception exc = exc;
                    if (exc instanceof C87407z) {
                        jVar = new C87348j(((C87407z) exc).errorCode, "RequestException", exc);
                    } else if (exc instanceof IOException) {
                        jVar = new C87348j(2, "IOException", exc);
                    } else if (exc instanceof C87401x.C87402a) {
                        jVar = new C87348j(4, "RandomAccessFileWrapper.FileException", exc);
                    } else if (exc instanceof C87313f) {
                        jVar = new C87348j(5, "ContentLengthNotMatchException", exc);
                    } else if (exc instanceof C87298c) {
                        jVar = new C87348j(15, "CacheWriteException", exc);
                    } else {
                        jVar = new C87348j(16, "OtherException", exc);
                    }
                    oVar.mo124037a(jVar, i, str);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141296a(final String str, final int i, final String str2) {
        C87328b.m151554a(new Runnable() {
            /* class com.toutiao.proxyserver.AbstractC87275a.RunnableC872816 */

            static {
                Covode.recordClassIndex(103177);
            }

            public final void run() {
                if (C87383u.f198087g != null) {
                    C87383u.f198087g.mo124039a(str, i, str2);
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        if (r9 < 0) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ba  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.toutiao.proxyserver.net.C87363e m151471b(java.lang.String r8, int r9, int r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 464
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.AbstractC87275a.m151471b(java.lang.String, int, int, java.lang.String):com.toutiao.proxyserver.net.e");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C87363e mo141289a(String str, int i, int i2, String str2) {
        boolean z;
        int i3;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        int i4;
        long j;
        String str6;
        String str7;
        String str8;
        int i5;
        String str9 = str;
        if (this.f197795i != null) {
            z = true;
        } else {
            z = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int lastIndexOf = str9.lastIndexOf("&source_id=");
        String str10 = "";
        if (!z || C59227a.m108850a() || TextUtils.isEmpty(str9)) {
            i3 = 0;
            str3 = str10;
            strArr = null;
        } else {
            String str11 = this.f197793g;
            if (lastIndexOf <= 0 || (i5 = lastIndexOf + 11) >= str9.length()) {
                str3 = str10;
            } else {
                str3 = str9.substring(i5);
            }
            if (!TextUtils.isEmpty(str11)) {
                strArr = str11.split("_");
            } else {
                strArr = null;
            }
            long j2 = C49907s.f115051c;
            C49907s.f115051c = 0;
            C39163s sVar = new C39163s();
            if (j2 > 0) {
                j = SystemClock.elapsedRealtime() - j2;
            } else {
                j = 0;
            }
            C39163s a = sVar.mo67941a("duration", Long.toString(j)).mo67941a("is_first", String.valueOf(C59231e.f135160a ? 1 : 0)).mo67941a("group_id", str3);
            if (strArr == null || strArr.length <= 3) {
                str6 = str10;
            } else {
                str6 = strArr[3];
            }
            C39163s a2 = a.mo67941a("bitRate", str6);
            if (strArr == null || strArr.length <= 2) {
                str7 = str10;
            } else {
                str7 = strArr[2];
            }
            C39163s a3 = a2.mo67941a("video_type", str7);
            if (strArr == null || strArr.length <= 1) {
                str8 = str10;
            } else {
                str8 = strArr[1];
            }
            C1731i.m5640b(new C59231e.CallableC59232a("video_api_request", a3.mo67941a("isBytevc1", str8).mo67941a("from_size", String.valueOf(i)).mo67941a("to_size", String.valueOf(i2)).mo67942a()), C1731i.f5562a);
            i3 = 0;
            C59231e.f135160a = false;
        }
        if (lastIndexOf > 0 && z && !TextUtils.isEmpty(str9)) {
            str9 = str9.substring(i3, lastIndexOf);
        }
        C87363e b = m151471b(str9, i, i2, str2);
        if (z && !C59227a.m108850a()) {
            C39163s a4 = new C39163s().mo67941a("feed_tab", C49907s.f115050b.name()).mo67941a("duration", String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)).mo67941a("is_first", String.valueOf(C59231e.f135161b ? 1 : 0)).mo67941a("group_id", str3);
            if (strArr == null || strArr.length <= 3) {
                str4 = str10;
            } else {
                str4 = strArr[3];
            }
            C39163s a5 = a4.mo67941a("bitRate", str4);
            if (strArr == null || strArr.length <= 2) {
                str5 = str10;
            } else {
                str5 = strArr[2];
            }
            C39163s a6 = a5.mo67941a("video_type", str5);
            if (strArr != null) {
                i4 = 1;
                if (strArr.length > 1) {
                    str10 = strArr[1];
                }
            } else {
                i4 = 1;
            }
            C39163s a7 = a6.mo67941a("isBytevc1", str10).mo67941a("from_size", String.valueOf(i)).mo67941a("to_size", String.valueOf(i2));
            if (b == null || !b.mo141404a()) {
                i4 = 0;
            }
            C1731i.m5640b(new C59231e.CallableC59232a("video_api_response", a7.mo67941a("is_success", String.valueOf(i4)).mo67942a()), C1731i.f5562a);
            C59231e.f135161b = false;
            if (C49907s.f115052d < 0) {
                C49907s.f115052d = SystemClock.elapsedRealtime();
            }
        }
        return b;
    }
}
