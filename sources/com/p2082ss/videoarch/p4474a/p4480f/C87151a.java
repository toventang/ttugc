package com.p2082ss.videoarch.p4474a.p4480f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.videoarch.p4474a.p4475a.C87118a;
import com.p2082ss.videoarch.p4474a.p4475a.C87119b;
import com.p2082ss.videoarch.p4474a.p4478d.C87141b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.videoarch.a.f.a */
public final class C87151a {

    /* renamed from: i */
    private static final SparseIntArray f196955i;

    /* renamed from: j */
    private static final SparseArray<String> f196956j;

    /* renamed from: k */
    private static final SparseArray<String> f196957k;

    /* renamed from: l */
    private static final SparseArray<String> f196958l;

    /* renamed from: a */
    public final AbstractC87153a f196959a;

    /* renamed from: b */
    public final long f196960b;

    /* renamed from: c */
    public long f196961c;

    /* renamed from: d */
    public long f196962d = 10000;

    /* renamed from: e */
    public AtomicInteger f196963e = new AtomicInteger(0);

    /* renamed from: f */
    public String f196964f = null;

    /* renamed from: g */
    public boolean f196965g = false;

    /* renamed from: h */
    public final Handler f196966h = new Handler(Looper.myLooper()) {
        /* class com.p2082ss.videoarch.p4474a.p4480f.C87151a.HandlerC871521 */

        static {
            Covode.recordClassIndex(102953);
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 10001:
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - C87151a.this.f196961c < C87151a.this.f196960b) {
                        C87151a.this.mo140957a(-100015);
                        C87151a.this.f196959a.mo140962a();
                        C87151a.this.f196966h.sendEmptyMessageDelayed(10001, C87151a.this.f196962d);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("stallTime", Long.valueOf(currentTimeMillis - C87151a.this.f196961c));
                    C87151a.this.mo140958a(-1, new C87118a(-100007, "Stall retry timeout", hashMap));
                    return;
                case 10002:
                case 10003:
                    C87151a.this.mo140958a(2, (C87118a) null);
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: m */
    private int f196967m = 7;

    /* renamed from: n */
    private boolean f196968n = false;

    /* renamed from: o */
    private long f196969o = 0;

    /* renamed from: p */
    private boolean f196970p = false;

    /* renamed from: q */
    private C87119b f196971q;

    /* renamed from: com.ss.videoarch.a.f.a$a */
    public interface AbstractC87153a {
        static {
            Covode.recordClassIndex(102954);
        }

        /* renamed from: a */
        void mo140962a();

        /* renamed from: a */
        void mo140963a(C87118a aVar);

        /* renamed from: b */
        void mo140964b();

        /* renamed from: c */
        void mo140965c();
    }

    /* renamed from: b */
    private boolean m151085b() {
        C87119b bVar = this.f196971q;
        if (bVar != null) {
            return bVar.mo140880k();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo140956a() {
        this.f196963e.set(0);
        this.f196961c = 0;
        this.f196967m = 7;
        this.f196968n = false;
        this.f196969o = 0;
        this.f196970p = false;
        this.f196966h.removeCallbacksAndMessages(null);
    }

    static {
        Covode.recordClassIndex(102952);
        SparseIntArray sparseIntArray = new SparseIntArray();
        f196955i = sparseIntArray;
        SparseArray<String> sparseArray = new SparseArray<>();
        f196956j = sparseArray;
        SparseArray<String> sparseArray2 = new SparseArray<>();
        f196957k = sparseArray2;
        SparseArray<String> sparseArray3 = new SparseArray<>();
        f196958l = sparseArray3;
        sparseIntArray.put(-100002, 3);
        sparseIntArray.put(-100006, 3);
        sparseIntArray.put(-100007, 3);
        sparseIntArray.put(-100008, 3);
        sparseIntArray.put(-100009, 3);
        sparseIntArray.put(-100013, 3);
        sparseIntArray.put(-100014, 3);
        sparseArray.put(-499988, "media player: setting uri is null error");
        sparseArray.put(-499987, "media player: setting uri is error");
        sparseArray.put(-499986, "media player: url is not mp4 error");
        sparseArray.put(-499985, "media player: invalid data error");
        sparseArray.put(-499899, "media player: http bad request error");
        sparseArray.put(-499898, "media player: http unauthorized error");
        sparseArray.put(-499897, "media player: http forbidden error");
        sparseArray.put(-499896, "media player: http not found error");
        sparseArray.put(-499894, "media player: http other 4xx error");
        sparseArray.put(-499893, "media player: http server error");
        sparseArray.put(-499891, "media player: http content type invalid");
        sparseArray.put(251658241, "media info http redirect");
        sparseArray.put(-499799, "media player: tcp failed to resolve hostname");
        sparseArray.put(-499795, "media player: tcp send data failed");
        sparseArray.put(-499794, "media player: tcp receive data failed");
        sparseArray.put(-499793, "media player: tcp read network timeout");
        sparseArray.put(-499792, "media player: tcp write network timeout");
        sparseArray2.put(-499999, "media player setting is null");
        sparseArray2.put(-499997, "media player start decoder error");
        sparseArray2.put(-499996, "media player open decoder error");
        sparseArray2.put(-499992, "media player open outlet error");
        sparseArray2.put(-499991, "media player start outputer error");
        sparseArray2.put(-499990, "media player start outlet error");
        sparseArray2.put(-499989, "media player open device error");
        sparseArray2.put(1, "android media player unknown");
        sparseArray3.put(-1, "not retry, report to application");
        sparseArray3.put(1, "try next url from live info");
        sparseArray3.put(2, "reset player");
    }

    /* renamed from: a */
    private void m151084a(C87118a aVar) {
        int i = this.f196967m - 1;
        this.f196967m = i;
        if (i >= 0) {
            this.f196971q.mo140845a(aVar.code, aVar.getInfoJSON());
        }
    }

    /* renamed from: a */
    public final void mo140957a(int i) {
        if (!this.f196968n || System.currentTimeMillis() - this.f196969o >= 1000) {
            this.f196971q.mo140866c(i);
            this.f196971q.mo140842a(i);
            this.f196968n = true;
            this.f196969o = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo140958a(int i, C87118a aVar) {
        long j;
        if (i == -1) {
            this.f196959a.mo140963a(aVar);
        } else if (i == 1) {
            this.f196959a.mo140964b();
        } else if (i == 2) {
            this.f196959a.mo140962a();
        } else if (i != 3) {
            if (i == 4) {
                this.f196959a.mo140965c();
            } else if (i == 5) {
                this.f196966h.sendEmptyMessageDelayed(10003, (long) (this.f196971q.f196560cl / this.f196971q.f196559ck));
            }
        } else if (!this.f196966h.hasMessages(10002)) {
            Handler handler = this.f196966h;
            if (this.f196963e.get() > 3) {
                j = this.f196962d;
            } else {
                j = (long) (this.f196963e.get() * this.f196963e.get() * 1000);
            }
            handler.sendEmptyMessageDelayed(10002, j);
        }
    }

    /* renamed from: a */
    public final void mo140959a(C87118a aVar, boolean z) {
        int i;
        if (this.f196965g) {
            if (!this.f196970p || aVar.code != -100016) {
                this.f196963e.incrementAndGet();
                this.f196963e.get();
                if (aVar.code != -100016) {
                    this.f196970p = true;
                }
                Map map = aVar.info;
                if (this.f196963e.get() > 700) {
                    i = -1;
                } else if (aVar.code == -100003) {
                    int i2 = 0;
                    try {
                        i2 = ((Integer) map.get("internalCode")).intValue();
                        aVar.code = i2;
                    } catch (NumberFormatException unused) {
                        map.put("retryError", "error while get player internal error code");
                    }
                    SparseArray<String> sparseArray = f196956j;
                    if (sparseArray.indexOfKey(i2) >= 0) {
                        map.put("playErrorReason", sparseArray.get(i2));
                        i = 1;
                    } else {
                        i = 3;
                    }
                    if (m151085b()) {
                        if (this.f196963e.get() > this.f196971q.f196559ck) {
                            i = 4;
                        } else {
                            i = 5;
                        }
                    }
                } else {
                    i = 3;
                }
                if (this.f196963e.get() > 3 && this.f196964f != null) {
                    C87141b.m151020a().mo140952b(this.f196964f);
                }
                this.f196971q.mo140878i();
                if (this.f196963e.get() == 1) {
                    this.f196971q.mo140846a(aVar.code, z);
                }
                mo140958a(i, aVar);
                m151084a(aVar);
                mo140957a(aVar.code);
            }
        }
    }

    /* renamed from: a */
    public final void mo140960a(boolean z, boolean z2) {
        if (z) {
            this.f196961c = System.currentTimeMillis();
            if (z2) {
                this.f196959a.mo140962a();
                mo140957a(-100018);
            }
            if (!this.f196966h.hasMessages(10001)) {
                this.f196966h.sendEmptyMessageDelayed(10001, this.f196962d);
                return;
            }
            return;
        }
        mo140956a();
    }

    public C87151a(AbstractC87153a aVar, int i, long j, C87119b bVar) {
        this.f196959a = aVar;
        this.f196960b = (long) (i * 1000);
        this.f196962d = j;
        this.f196963e.set(0);
        this.f196971q = bVar;
    }
}
