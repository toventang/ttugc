package com.p2082ss.android.socialbase.downloader.segment;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.p2082ss.android.socialbase.downloader.model.C30592b;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2184g.C30451c;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2188j.AbstractC30522f;
import com.p2082ss.android.socialbase.downloader.p2188j.C30519e;
import com.p2082ss.android.socialbase.downloader.p2189k.C30533f;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.segment.j */
public final class C30609j implements C30451c.AbstractC30454a, AbstractC30604f {

    /* renamed from: A */
    private int f73076A;

    /* renamed from: B */
    private final boolean f73077B;

    /* renamed from: C */
    private final C30519e.AbstractC30521b f73078C;

    /* renamed from: D */
    private final C30519e.AbstractC30521b f73079D;

    /* renamed from: a */
    public volatile boolean f73080a;

    /* renamed from: b */
    public volatile boolean f73081b;

    /* renamed from: c */
    public final List<C30616o> f73082c = new ArrayList();

    /* renamed from: d */
    public C30592b f73083d;

    /* renamed from: e */
    public C30592b f73084e;

    /* renamed from: f */
    public long f73085f;

    /* renamed from: g */
    private final DownloadInfo f73086g;

    /* renamed from: h */
    private final C30614m f73087h;

    /* renamed from: i */
    private final C30600b f73088i;

    /* renamed from: j */
    private final AbstractC30522f f73089j;

    /* renamed from: k */
    private final C30605g f73090k;

    /* renamed from: l */
    private final List<RunnableC30613l> f73091l = new ArrayList();

    /* renamed from: m */
    private volatile boolean f73092m;

    /* renamed from: n */
    private long f73093n;

    /* renamed from: o */
    private final LinkedList<C30607i> f73094o;

    /* renamed from: p */
    private final List<C30607i> f73095p;

    /* renamed from: q */
    private int f73096q;

    /* renamed from: r */
    private BaseException f73097r;

    /* renamed from: s */
    private volatile boolean f73098s;

    /* renamed from: t */
    private final Object f73099t;

    /* renamed from: u */
    private final C30533f f73100u;

    /* renamed from: v */
    private final C30519e f73101v;

    /* renamed from: w */
    private volatile boolean f73102w;

    /* renamed from: x */
    private long f73103x;

    /* renamed from: y */
    private long f73104y;

    /* renamed from: z */
    private float f73105z;

    static {
        Covode.recordClassIndex(37144);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2184g.C30451c.AbstractC30454a
    /* renamed from: a */
    public final void mo54248a(String str, List<InetAddress> list) {
        boolean z;
        MethodCollector.m26663i(10627);
        if (this.f73081b || this.f73080a) {
            MethodCollector.m26664o(10627);
            return;
        }
        ArrayList arrayList = null;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int i = 0;
                    for (InetAddress inetAddress : list) {
                        if (inetAddress != null) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                C30616o oVar = new C30616o(str, hostAddress);
                                LinkedList linkedList = (LinkedList) linkedHashMap.get(oVar.f73154c);
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                    linkedHashMap.put(oVar.f73154c, linkedList);
                                }
                                linkedList.add(oVar);
                                i++;
                            }
                        }
                    }
                    if (i > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            z = false;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                LinkedList linkedList2 = (LinkedList) entry.getValue();
                                if (linkedList2 != null && !linkedList2.isEmpty()) {
                                    arrayList2.add((C30616o) linkedList2.pollFirst());
                                    i--;
                                    z = true;
                                }
                            }
                            if (i <= 0) {
                                break;
                            }
                        } while (z);
                        arrayList = arrayList2;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        synchronized (this) {
            if (arrayList != null) {
                try {
                    m62817b(str, arrayList);
                } catch (Throwable th) {
                    MethodCollector.m26664o(10627);
                    throw th;
                }
            }
            this.f73092m = false;
            this.f73087h.mo54861a(this.f73082c.size());
            m62822e();
        }
        MethodCollector.m26664o(10627);
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30604f
    /* renamed from: a */
    public final void mo54831a(RunnableC30613l lVar, C30607i iVar, C30616o oVar, C30592b bVar) {
        MethodCollector.m26663i(12016);
        synchronized (this) {
            try {
                if (this.f73080a || this.f73081b) {
                    StreamClosedException streamClosedException = new StreamClosedException("connected");
                    MethodCollector.m26664o(12016);
                    throw streamClosedException;
                }
                RunnableC30613l lVar2 = iVar.f73072e;
                if (lVar2 != null) {
                    if (lVar2 != lVar) {
                        SegmentApplyException segmentApplyException = new SegmentApplyException(1, "segment already has an owner");
                        MethodCollector.m26664o(12016);
                        throw segmentApplyException;
                    }
                }
                if (lVar.f73127d == iVar.mo54843d()) {
                    if (!bVar.mo54795b()) {
                        if (iVar.mo54843d() <= 0) {
                            C30434a.m62030e("SegmentDispatcher", "parseHttpResponse: segment.getCurrentOffsetRead = " + iVar.mo54843d());
                            if (!bVar.mo54794a()) {
                                DownloadHttpException downloadHttpException = new DownloadHttpException(1004, bVar.f72996c, "2: response code error : " + bVar.f72996c + " segment=" + iVar);
                                MethodCollector.m26664o(12016);
                                throw downloadHttpException;
                            }
                        } else {
                            DownloadHttpException downloadHttpException2 = new DownloadHttpException(1004, bVar.f72996c, "1: response code error : " + bVar.f72996c + " segment=" + iVar);
                            MethodCollector.m26664o(12016);
                            throw downloadHttpException2;
                        }
                    }
                    if (!oVar.f73155d) {
                        C30592b bVar2 = this.f73083d;
                        if (!(bVar2 == null && (bVar2 = this.f73084e) == null)) {
                            long j = bVar.mo54803j();
                            long j2 = bVar2.mo54803j();
                            if (j != j2) {
                                String str = "total len not equals,len=" + j + ",sLen=" + j2 + ",code=" + bVar.f72996c + ",sCode=" + bVar2.f72996c + ",range=" + bVar.mo54798e() + ",sRange = " + bVar2.mo54798e() + ",url = " + bVar.f72994a + ",sUrl=" + bVar2.f72994a;
                                C30434a.m62030e("SegmentDispatcher", str);
                                if (j > 0 && j2 > 0) {
                                    BaseException baseException = new BaseException(1074, str);
                                    MethodCollector.m26664o(12016);
                                    throw baseException;
                                }
                            }
                            String c = bVar.mo54796c();
                            String c2 = bVar2.mo54796c();
                            if (!TextUtils.equals(c, c2)) {
                                String str2 = "etag not equals with main url, etag = " + c + ", mainEtag = " + c2;
                                C30434a.m62030e("SegmentDispatcher", str2);
                                if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(c2) && !c.equalsIgnoreCase(c2)) {
                                    BaseException baseException2 = new BaseException(1074, str2);
                                    MethodCollector.m26664o(12016);
                                    throw baseException2;
                                }
                            }
                        }
                        if (this.f73084e == null) {
                            this.f73084e = bVar;
                            if (this.f73086g.getTotalBytes() <= 0) {
                                long j3 = bVar.mo54803j();
                                C30434a.m62028c("SegmentDispatcher", "checkSegmentHttpResponse:len=" + j3 + ",url=" + oVar.f73152a);
                                this.f73086g.setTotalBytes(j3);
                            }
                            synchronized (this.f73099t) {
                                try {
                                    this.f73099t.notify();
                                } catch (Throwable th) {
                                    MethodCollector.m26664o(12016);
                                    throw th;
                                }
                            }
                        }
                    } else if (this.f73083d == null) {
                        this.f73083d = bVar;
                        synchronized (this.f73099t) {
                            try {
                                this.f73099t.notify();
                            } catch (Throwable th2) {
                                MethodCollector.m26664o(12016);
                                throw th2;
                            }
                        }
                        AbstractC30522f fVar = this.f73089j;
                        if (fVar != null) {
                            fVar.mo54340a(oVar.f73152a, bVar.f72995b, iVar.mo54843d());
                        }
                        long j4 = bVar.mo54803j();
                        if (j4 > 0) {
                            for (C30607i iVar2 : this.f73095p) {
                                if (iVar2.f73070c <= 0 || iVar2.f73070c > j4 - 1) {
                                    iVar2.mo54840b(j4 - 1);
                                }
                            }
                        }
                    }
                    lVar.f73139p = false;
                    if (this.f73093n <= 0) {
                        long totalBytes = this.f73086g.getTotalBytes();
                        this.f73093n = totalBytes;
                        if (totalBytes <= 0) {
                            this.f73093n = bVar.mo54803j();
                        }
                        m62822e();
                    } else if (this.f73087h.mo54863c()) {
                        m62822e();
                    }
                } else {
                    SegmentApplyException segmentApplyException2 = new SegmentApplyException(5, "applySegment");
                    MethodCollector.m26664o(12016);
                    throw segmentApplyException2;
                }
            } finally {
                MethodCollector.m26664o(12016);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30604f
    /* renamed from: a */
    public final void mo54829a(RunnableC30613l lVar, C30607i iVar) {
        C30607i iVar2;
        C30607i iVar3;
        MethodCollector.m26663i(12152);
        synchronized (this) {
            try {
                C30434a.m62028c("SegmentDispatcher", "applySegment: start ".concat(String.valueOf(iVar)));
                if (iVar.f73072e == lVar) {
                    C30434a.m62028c("SegmentDispatcher", "applySegment: " + lVar + " is already the owner of " + iVar);
                } else if (iVar.f73072e != null) {
                    C30434a.m62030e("SegmentDispatcher", "applySegment: " + iVar + " is already has an owner:" + iVar.f73072e);
                    SegmentApplyException segmentApplyException = new SegmentApplyException(1, "segment already has an owner");
                    MethodCollector.m26664o(12152);
                    throw segmentApplyException;
                } else if (lVar.f73127d == iVar.mo54843d()) {
                    long j = iVar.f73068a;
                    int a = m62813a(j);
                    if (a == -1 || (iVar2 = this.f73095p.get(a)) == null) {
                        C30434a.m62030e("SegmentDispatcher", "applySegment: " + iVar + " not exist! segmentIndex = " + a);
                        SegmentApplyException segmentApplyException2 = new SegmentApplyException(2, "segment not exist");
                        MethodCollector.m26664o(12152);
                        throw segmentApplyException2;
                    }
                    if (iVar2 != iVar) {
                        if (iVar2.f73068a == iVar.f73068a) {
                            long c = m62819c(iVar2);
                            if (c > 0) {
                                RunnableC30613l lVar2 = iVar2.f73072e;
                                if (lVar2 != null) {
                                    if (c < 524288 && lVar.f73143t - lVar2.f73143t > 1000 && iVar2.mo54843d() - iVar.mo54843d() < c / 2) {
                                        lVar2.mo54855a(true);
                                    }
                                }
                                iVar.mo54840b(iVar2.f73070c);
                                iVar.f73073f = iVar2.f73073f;
                                this.f73095p.set(a, iVar);
                            }
                        }
                        C30434a.m62030e("SegmentDispatcher", "applySegment: " + iVar + " not exist! but has another same segment, segmentInList = " + iVar2);
                        SegmentApplyException segmentApplyException3 = new SegmentApplyException(2, "segment not exist, but has another same segment");
                        MethodCollector.m26664o(12152);
                        throw segmentApplyException3;
                    }
                    long a2 = iVar.mo54837a();
                    int i = a - 1;
                    while (true) {
                        if (i < 0) {
                            break;
                        }
                        C30607i iVar4 = this.f73095p.get(i);
                        long j2 = iVar4.f73070c;
                        if (j2 <= 0 || j2 >= j) {
                            if (a2 <= 0 && iVar4.mo54843d() > j) {
                                C30434a.m62030e("SegmentDispatcher", "applySegment:prev's current has over this start, prev = " + iVar4 + ", segment = " + iVar);
                                this.f73095p.remove(iVar);
                                SegmentApplyException segmentApplyException4 = new SegmentApplyException(3, "prev overstep");
                                MethodCollector.m26664o(12152);
                                throw segmentApplyException4;
                            } else if (iVar4.f73072e == null) {
                                iVar4.mo54840b(j - 1);
                                C30434a.m62028c("SegmentDispatcher", "applySegment: prev set end, prev = ".concat(String.valueOf(iVar4)));
                                if (iVar4.mo54837a() > 0) {
                                    break;
                                }
                            } else {
                                RunnableC30613l lVar3 = iVar4.f73072e;
                                long j3 = j - 1;
                                long j4 = lVar3.f73129f;
                                if (j3 > 0 || j4 <= 0) {
                                    if (j3 <= j4 || j4 <= 0) {
                                        lVar3.f73128e = j3;
                                        lVar3.f73134k = true;
                                        iVar4.mo54840b(j3);
                                        C30434a.m62028c("SegmentDispatcher", "applySegment: adjustSegmentEndOffset succeed, prev = ".concat(String.valueOf(iVar4)));
                                    }
                                }
                                C30434a.m62030e("SegmentDispatcher", "applySegment: adjustSegmentEndOffset filed, prev = ".concat(String.valueOf(iVar4)));
                                SegmentApplyException segmentApplyException5 = new SegmentApplyException(4, "prev end adjust fail");
                                MethodCollector.m26664o(12152);
                                throw segmentApplyException5;
                            }
                        }
                        i--;
                    }
                    int i2 = a + 1;
                    int size = this.f73095p.size();
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        iVar3 = this.f73095p.get(i2);
                        if (iVar3.mo54837a() > 0 || iVar3.f73072e != null) {
                            long j5 = iVar.f73070c;
                            long j6 = iVar3.f73068a;
                        } else {
                            i2++;
                        }
                    }
                    long j52 = iVar.f73070c;
                    long j62 = iVar3.f73068a;
                    if (j52 <= 0 || j52 >= j62) {
                        long j7 = j62 - 1;
                        iVar.mo54840b(j7);
                        C30434a.m62028c("SegmentDispatcher", "applySegment: segment set end:" + j7 + ", later = " + iVar3);
                    }
                    long j8 = iVar.f73070c;
                    if (j8 <= 0 || (j <= j8 && iVar.mo54843d() <= j8)) {
                        iVar.f73072e = lVar;
                        C30434a.m62028c("SegmentDispatcher", "applySegment: OK ".concat(String.valueOf(iVar)));
                    } else {
                        SegmentApplyException segmentApplyException6 = new SegmentApplyException(6, "applySegment: ".concat(String.valueOf(iVar)));
                        MethodCollector.m26664o(12152);
                        throw segmentApplyException6;
                    }
                } else {
                    SegmentApplyException segmentApplyException7 = new SegmentApplyException(5, "applySegment");
                    MethodCollector.m26664o(12152);
                    throw segmentApplyException7;
                }
            } finally {
                MethodCollector.m26664o(12152);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30604f
    /* renamed from: b */
    public final void mo54834b(RunnableC30613l lVar, C30607i iVar) {
        MethodCollector.m26663i(12296);
        synchronized (this) {
            try {
                if (iVar.f73072e == lVar) {
                    C30434a.m62028c("SegmentDispatcher", "unApplySegment ".concat(String.valueOf(iVar)));
                    iVar.mo54842c(lVar.f73130g);
                    iVar.f73072e = null;
                    C30616o oVar = lVar.f73126c;
                    try {
                        synchronized (lVar.f73124a) {
                            try {
                                long c = lVar.mo54857c();
                                if (c > 0) {
                                    lVar.f73131h += c;
                                    oVar.f73156e.addAndGet(c);
                                }
                                lVar.f73130g = -1;
                            } catch (Throwable th) {
                                MethodCollector.m26664o(12296);
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            } finally {
                MethodCollector.m26664o(12296);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30604f
    /* renamed from: a */
    public final void mo54828a(RunnableC30613l lVar, BaseException baseException, int i, int i2) {
        boolean b = C30535g.m62582b(baseException);
        int errorCode = baseException.getErrorCode();
        if (errorCode == 1047 || errorCode == 1074 || errorCode == 1055 || b || i >= i2) {
            mo54851d(lVar);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30604f
    /* renamed from: a */
    public final void mo54830a(RunnableC30613l lVar, C30607i iVar, BaseException baseException) {
        MethodCollector.m26663i(8142);
        synchronized (this) {
            try {
                C30434a.m62030e("SegmentDispatcher", "onSegmentFailed: segment = " + iVar + ", e = " + baseException);
                lVar.f73139p = true;
                if (lVar.f73133j == 0) {
                    this.f73097r = baseException;
                }
                if (m62825h()) {
                    if (this.f73097r == null) {
                        this.f73097r = baseException;
                    }
                    this.f73102w = true;
                    m62814a(this.f73097r);
                }
            } finally {
                MethodCollector.m26664o(8142);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo54848a(List<C30607i> list) {
        long j;
        BaseException baseException;
        MethodCollector.m26663i(9989);
        try {
            this.f73082c.add(new C30616o(this.f73086g.getUrl(), true));
            List<String> backUpUrls = this.f73086g.getBackUpUrls();
            if (backUpUrls != null) {
                for (String str : backUpUrls) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f73082c.add(new C30616o(str, false));
                    }
                }
            }
            this.f73087h.mo54861a(this.f73082c.size());
            long totalBytes = this.f73086g.getTotalBytes();
            this.f73093n = totalBytes;
            if (totalBytes <= 0) {
                this.f73093n = this.f73086g.getExpectFileLength();
                C30434a.m62028c("SegmentDispatcher", "initSegments: getExpectFileLength = " + this.f73093n);
            }
            synchronized (this) {
                try {
                    this.f73094o.clear();
                    j = -1;
                    if (list == null || list.isEmpty()) {
                        m62815a((List<C30607i>) this.f73094o, new C30607i(0, -1), false);
                    } else {
                        for (C30607i iVar : list) {
                            m62815a((List<C30607i>) this.f73094o, new C30607i(iVar), false);
                        }
                        m62820c(this.f73094o);
                        m62818b(this.f73094o);
                    }
                    C30434a.m62028c("SegmentDispatcher", "initSegments: totalLength = " + this.f73093n);
                } finally {
                    MethodCollector.m26664o(9989);
                }
            }
            m62822e();
            C30614m mVar = this.f73087h;
            long optInt = (long) mVar.f73150a.optInt("connect_timeout", -1);
            if (optInt >= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                j = optInt;
            }
            this.f73085f = j;
            this.f73103x = mVar.mo54865e();
            this.f73105z = Math.min(Math.max(0.0f, (float) mVar.f73150a.optDouble("poor_speed_ratio", 0.0d)), 1.0f);
            int i = this.f73076A;
            if (i > 0) {
                this.f73101v.mo54358a(this.f73078C, (long) i);
            }
            m62823f();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                synchronized (this.f73099t) {
                    try {
                        if (this.f73083d == null && this.f73084e == null) {
                            this.f73099t.wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f73083d == null && this.f73084e == null && (baseException = this.f73097r) != null) {
                    MethodCollector.m26664o(9989);
                    throw baseException;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                this.f73086g.increaseAllConnectTime(currentTimeMillis2);
                this.f73086g.setFirstSpeedTime(currentTimeMillis2);
                if (this.f73081b || this.f73080a) {
                    if (!this.f73081b && !this.f73080a) {
                        C30434a.m62028c("SegmentDispatcher", "finally pause");
                        mo54849b();
                    }
                    this.f73101v.mo54357a();
                    MethodCollector.m26664o(9989);
                    return true;
                }
                this.f73089j.mo54336a(this.f73093n);
                if (this.f73103x > 0) {
                    this.f73104y = System.currentTimeMillis();
                    this.f73101v.mo54358a(this.f73079D, 0);
                }
                m62821d();
                return true;
            } catch (Throwable th2) {
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                this.f73086g.increaseAllConnectTime(currentTimeMillis3);
                this.f73086g.setFirstSpeedTime(currentTimeMillis3);
                MethodCollector.m26664o(9989);
                throw th2;
            }
        } finally {
            if (!this.f73081b && !this.f73080a) {
                C30434a.m62028c("SegmentDispatcher", "finally pause");
                mo54849b();
            }
            this.f73101v.mo54357a();
            MethodCollector.m26664o(9989);
        }
    }

    /* renamed from: h */
    private boolean m62825h() {
        for (RunnableC30613l lVar : this.f73091l) {
            if (!lVar.f73139p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    private long m62828k() {
        long j = 0;
        for (RunnableC30613l lVar : this.f73091l) {
            j += lVar.mo54856b();
        }
        return j;
    }

    /* renamed from: f */
    private void m62823f() {
        List<String> backUpUrls;
        int f = this.f73087h.mo54866f();
        if (f <= 0) {
            this.f73092m = false;
            m62822e();
            return;
        }
        C30451c cVar = C30451c.C30456c.f72604a;
        cVar.mo54244a(this.f73086g.getUrl(), this);
        if (f > 2 && (backUpUrls = this.f73086g.getBackUpUrls()) != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    cVar.mo54244a(str, this);
                }
            }
        }
    }

    /* renamed from: g */
    private C30616o m62824g() {
        C30616o oVar;
        MethodCollector.m26663i(10768);
        synchronized (this) {
            try {
                int size = this.f73096q % this.f73082c.size();
                if (this.f73087h.mo54862b()) {
                    this.f73096q++;
                }
                oVar = this.f73082c.get(size);
            } finally {
                MethodCollector.m26664o(10768);
            }
        }
        return oVar;
    }

    /* renamed from: j */
    private boolean m62827j() {
        MethodCollector.m26663i(8595);
        long j = this.f73093n;
        long j2 = 0;
        if (j <= 0) {
            this.f73098s = false;
            MethodCollector.m26664o(8595);
            return false;
        }
        synchronized (this) {
            try {
                List<C30607i> list = this.f73095p;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C30607i iVar = list.get(i);
                    if (iVar.f73068a > j2) {
                        break;
                    }
                    if (iVar.mo54843d() > j2) {
                        j2 = iVar.mo54843d();
                    }
                }
                C30434a.m62028c("SegmentDispatcher", "isAllContentDownloaded: firstOffset = ".concat(String.valueOf(j2)));
                if (j2 >= j) {
                    this.f73098s = true;
                    return true;
                }
                this.f73098s = false;
                MethodCollector.m26664o(8595);
                return false;
            } finally {
                MethodCollector.m26664o(8595);
            }
        }
    }

    /* renamed from: d */
    private void m62821d() {
        MethodCollector.m26663i(10138);
        try {
            this.f73090k.mo54836a(this.f73088i);
        } catch (StreamClosedException unused) {
        } catch (BaseException e) {
            C30434a.m62030e("SegmentDispatcher", "dispatchSegments: loopAndWrite e = ".concat(String.valueOf(e)));
            m62814a(e);
            MethodCollector.m26664o(10138);
            throw e;
        }
        if (this.f73081b || this.f73080a) {
            MethodCollector.m26664o(10138);
            return;
        }
        try {
            synchronized (this) {
                while (!this.f73094o.isEmpty()) {
                    try {
                        C30607i poll = this.f73094o.poll();
                        if (poll != null) {
                            m62815a(this.f73095p, poll, true);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(10138);
                        throw th;
                    }
                }
                m62818b(this.f73095p);
            }
        } catch (Throwable unused2) {
        }
        if (!this.f73102w || this.f73097r == null) {
            if (this.f73086g.getCurBytes() != this.f73086g.getTotalBytes()) {
                DownloadInfo downloadInfo = this.f73086g;
                List<C30607i> list = this.f73095p;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("segments", C30607i.m62805a(list));
                    jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                    if (C30399c.m61676D() != null) {
                        downloadInfo.getId();
                    }
                } catch (Throwable unused3) {
                }
            }
            C30434a.m62028c("SegmentDispatcher", "dispatchSegments::download finished");
            MethodCollector.m26664o(10138);
            return;
        }
        C30434a.m62030e("SegmentDispatcher", "dispatchSegments: loopAndWrite  failedException = " + this.f73097r);
        BaseException baseException = this.f73097r;
        MethodCollector.m26664o(10138);
        throw baseException;
    }

    /* renamed from: e */
    private void m62822e() {
        int i;
        MethodCollector.m26663i(10306);
        int i2 = 1;
        if (this.f73093n <= 0 || this.f73092m) {
            i = 1;
        } else {
            i = this.f73087h.f73151b;
            long j = this.f73093n;
            long optInt = ((long) this.f73087h.f73150a.optInt("segment_min_init_mb", 10)) * 1048576;
            if (optInt < 5242880) {
                optInt = 5242880;
            }
            int i3 = (int) (j / optInt);
            if (i > i3) {
                i = i3;
            }
        }
        C30434a.m62028c("SegmentDispatcher", "dispatchReadThread: totalLength = " + this.f73093n + ", threadCount = " + i);
        if (i > 0) {
            i2 = i;
        }
        synchronized (this) {
            do {
                try {
                    if (this.f73091l.size() >= i2) {
                        break;
                    } else if (this.f73081b || this.f73080a) {
                        MethodCollector.m26664o(10306);
                        return;
                    } else {
                        RunnableC30613l lVar = new RunnableC30613l(this.f73086g, this, this.f73088i, m62824g(), this.f73091l.size());
                        this.f73091l.add(lVar);
                        lVar.f73132i = C30399c.m61727k().submit(lVar);
                    }
                } finally {
                    MethodCollector.m26664o(10306);
                }
            } while (!this.f73087h.mo54863c());
        }
    }

    /* renamed from: i */
    private void m62826i() {
        int size;
        if (this.f73093n > 0 && (size = this.f73095p.size()) > 1) {
            ArrayList arrayList = null;
            int i = 0;
            for (int i2 = 1; i2 < size; i2++) {
                C30607i iVar = this.f73095p.get(i);
                C30607i iVar2 = this.f73095p.get(i2);
                if (iVar.mo54843d() > iVar2.f73068a && iVar2.mo54837a() <= 0 && iVar2.f73072e == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(iVar2);
                } else if (iVar2.mo54843d() > iVar.mo54843d()) {
                    i++;
                }
            }
            if (arrayList != null) {
                for (Object obj : arrayList) {
                    this.f73095p.remove(obj);
                    for (RunnableC30613l lVar : this.f73091l) {
                        if (lVar.f73125b == obj) {
                            lVar.mo54855a(true);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: l */
    private C30607i m62829l() {
        C30607i iVar;
        int i;
        int i2;
        int i3;
        int i4 = 8597;
        MethodCollector.m26663i(8597);
        int i5 = 0;
        while (true) {
            int i6 = Integer.MAX_VALUE;
            iVar = null;
            for (C30607i iVar2 : this.f73095p) {
                if (m62819c(iVar2) > 0 && (i3 = iVar2.f73073f) < i6) {
                    iVar = iVar2;
                    i6 = i3;
                }
            }
            if (iVar == null) {
                MethodCollector.m26664o(i4);
                return null;
            }
            RunnableC30613l lVar = iVar.f73072e;
            if (lVar == null) {
                MethodCollector.m26664o(i4);
                return iVar;
            } else if (iVar.f73073f >= 2) {
                MethodCollector.m26664o(i4);
                return null;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                m62816b(currentTimeMillis);
                if (currentTimeMillis - lVar.f73143t > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                    long j = currentTimeMillis - InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                    i = i5;
                    if (lVar.f73143t > 0) {
                        long b = this.f73100u.mo54365b(j, currentTimeMillis);
                        int size = this.f73091l.size();
                        if (size > 0) {
                            b /= (long) size;
                        }
                        long a = lVar.mo54852a(j, currentTimeMillis);
                        if (a < 500) {
                            break;
                        }
                        double d = (double) a;
                        double d2 = (double) b;
                        Double.isNaN(d2);
                        if (d < d2 * 1.0d) {
                            break;
                        }
                    }
                    i4 = 8597;
                } else {
                    i = i5;
                }
                i5 = i + 1;
                if (i > 2) {
                    MethodCollector.m26664o(i4);
                    return iVar;
                }
                try {
                    synchronized (this) {
                        try {
                            wait(500);
                        } catch (InterruptedException unused) {
                            MethodCollector.m26664o(i2);
                            return null;
                        } catch (Throwable th) {
                            i2 = 8597;
                            MethodCollector.m26664o(8597);
                            throw th;
                        }
                    }
                    i4 = 8597;
                } catch (InterruptedException unused2) {
                    i2 = 8597;
                    MethodCollector.m26664o(i2);
                    return null;
                }
            }
        }
        MethodCollector.m26664o(8597);
        return iVar;
    }

    /* renamed from: a */
    public final void mo54847a() {
        MethodCollector.m26663i(8432);
        C30434a.m62028c("SegmentDispatcher", "cancel");
        this.f73080a = true;
        synchronized (this) {
            try {
                for (RunnableC30613l lVar : this.f73091l) {
                    lVar.mo54858d();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(8432);
                throw th;
            }
        }
        C30605g gVar = this.f73090k;
        gVar.f73050d = true;
        gVar.f73048b = true;
        this.f73088i.mo54825c();
        MethodCollector.m26664o(8432);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final long mo54850c() {
        MethodCollector.m26663i(8751);
        if (this.f73080a || this.f73081b) {
            MethodCollector.m26664o(8751);
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            try {
                m62816b(currentTimeMillis);
                long e = this.f73087h.mo54865e();
                if (e > 0) {
                    long j = this.f73104y;
                    if (j > 0 && currentTimeMillis - j > e) {
                        long j2 = currentTimeMillis - e;
                        long b = this.f73100u.mo54365b(j2, currentTimeMillis);
                        int size = this.f73091l.size();
                        if (size > 0) {
                            b /= (long) size;
                        }
                        long max = (long) Math.max(10.0f, ((float) b) * this.f73105z);
                        int i = size / 2;
                        RunnableC30613l lVar = null;
                        int i2 = 0;
                        long j3 = Long.MAX_VALUE;
                        for (RunnableC30613l lVar2 : this.f73091l) {
                            if (lVar2.f73143t > 0) {
                                i2++;
                                if (lVar2.f73143t < j2) {
                                    long a = lVar2.mo54852a(j2, currentTimeMillis);
                                    if (a >= 0 && a < j3) {
                                        lVar = lVar2;
                                        j3 = a;
                                    }
                                }
                            }
                        }
                        if (lVar == null || i2 < i || j3 >= max) {
                            lVar = null;
                        } else {
                            C30434a.m62028c("SegmentDispatcher", "findPoorReadThread: ----------- minSpeed = " + j3 + ", threadIndex = " + lVar.f73133j);
                        }
                        if (lVar != null) {
                            mo54851d(lVar);
                            C30434a.m62029d("SegmentDispatcher", "handlePoorReadThread: reconnect for poor speed, threadIndex = " + lVar.f73133j);
                            lVar.mo54855a(false);
                        } else {
                            RunnableC30613l a2 = mo54846a(true, currentTimeMillis, e);
                            if (a2 != null) {
                                mo54851d(a2);
                                C30434a.m62029d("SegmentDispatcher", "handlePoorReadThread: reconnect for connect timeout, threadIndex = " + a2.f73133j);
                                a2.mo54855a(false);
                            }
                        }
                        this.f73104y = currentTimeMillis;
                        this.f73076A++;
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(8751);
                throw th;
            }
        }
        MethodCollector.m26664o(8751);
        return InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    }

    /* renamed from: b */
    public final void mo54849b() {
        MethodCollector.m26663i(8592);
        C30434a.m62028c("SegmentDispatcher", "pause1");
        this.f73081b = true;
        synchronized (this) {
            try {
                for (RunnableC30613l lVar : this.f73091l) {
                    lVar.mo54858d();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(8592);
                throw th;
            }
        }
        C30605g gVar = this.f73090k;
        gVar.f73049c = true;
        gVar.f73048b = true;
        this.f73088i.mo54825c();
        MethodCollector.m26664o(8592);
    }

    /* renamed from: c */
    private long m62819c(C30607i iVar) {
        long b = iVar.mo54839b();
        if (b != -1) {
            return b;
        }
        long j = this.f73093n;
        if (j > 0) {
            return j - iVar.mo54843d();
        }
        return b;
    }

    /* renamed from: a */
    private int m62813a(long j) {
        int size = this.f73095p.size();
        for (int i = 0; i < size; i++) {
            C30607i iVar = this.f73095p.get(i);
            if (iVar.f73068a == j) {
                return i;
            }
            if (iVar.f73068a > j) {
                return -1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private void m62816b(long j) {
        this.f73100u.mo54364a(this.f73086g.getCurBytes(), j);
        for (RunnableC30613l lVar : this.f73091l) {
            lVar.mo54854a(j);
        }
    }

    /* renamed from: a */
    private void m62814a(BaseException baseException) {
        MethodCollector.m26663i(8282);
        C30434a.m62030e("SegmentDispatcher", "onError, e = ".concat(String.valueOf(baseException)));
        this.f73097r = baseException;
        this.f73088i.mo54825c();
        synchronized (this) {
            try {
                for (RunnableC30613l lVar : this.f73091l) {
                    lVar.mo54858d();
                }
            } finally {
                MethodCollector.m26664o(8282);
            }
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30604f
    /* renamed from: c */
    public final void mo54835c(RunnableC30613l lVar) {
        MethodCollector.m26663i(8144);
        C30434a.m62028c("SegmentDispatcher", "onReaderExit: threadIndex = " + lVar.f73133j);
        synchronized (this) {
            try {
                lVar.f73140q = true;
                this.f73091l.remove(lVar);
                m62826i();
                if (!this.f73091l.isEmpty()) {
                    if (m62827j()) {
                        for (RunnableC30613l lVar2 : this.f73091l) {
                            lVar2.mo54858d();
                        }
                    }
                }
                C30434a.m62028c("SegmentDispatcher", "onComplete");
                this.f73088i.mo54825c();
                synchronized (this.f73099t) {
                    try {
                        this.f73099t.notify();
                    } catch (Throwable th) {
                        MethodCollector.m26664o(8144);
                        throw th;
                    }
                }
            } finally {
                MethodCollector.m26664o(8144);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r6.f73087h.mo54860a() == 1) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54851d(com.p2082ss.android.socialbase.downloader.segment.RunnableC30613l r7) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.segment.C30609j.mo54851d(com.ss.android.socialbase.downloader.segment.l):boolean");
    }

    /* renamed from: b */
    private void m62818b(List<C30607i> list) {
        long a = C30615n.m62870a(list);
        C30434a.m62028c("SegmentDispatcher", "checkDownloadBytes: getCurBytes = " + this.f73086g.getCurBytes() + ", totalBytes = " + this.f73086g.getTotalBytes() + ", downloadedBytes = " + a);
        if (a > this.f73086g.getTotalBytes() && this.f73086g.getTotalBytes() > 0) {
            a = this.f73086g.getTotalBytes();
        }
        if (this.f73086g.getCurBytes() != this.f73086g.getTotalBytes() && this.f73086g.getCurBytes() != a) {
            this.f73086g.setCurBytes(a);
        }
    }

    /* renamed from: c */
    private void m62820c(List<C30607i> list) {
        long j = list.get(0).f73068a;
        if (j > 0) {
            m62815a(list, new C30607i(0, j - 1), true);
        }
        Iterator<C30607i> it = list.iterator();
        if (it.hasNext()) {
            C30607i next = it.next();
            while (it.hasNext()) {
                C30607i next2 = it.next();
                if (next.f73070c < next2.f73068a - 1) {
                    C30434a.m62029d("SegmentDispatcher", "fixSegment: segment = " + next + ", new end = " + (next2.f73068a - 1));
                    next.mo54840b(next2.f73068a - 1);
                }
                next = next2;
            }
        }
        C30607i iVar = list.get(list.size() - 1);
        long totalBytes = this.f73086g.getTotalBytes();
        if (totalBytes <= 0 || (iVar.f73070c != -1 && iVar.f73070c < totalBytes - 1)) {
            C30434a.m62029d("SegmentDispatcher", "fixSegment: last segment = " + iVar + ", new end=-1");
            iVar.mo54840b(-1);
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30604f
    /* renamed from: b */
    public final AbstractC30603e mo54832b(C30607i iVar) {
        AbstractC30603e eVar;
        MethodCollector.m26663i(7996);
        synchronized (this) {
            try {
                C30612k kVar = new C30612k(this.f73086g, this.f73088i, iVar);
                C30605g gVar = this.f73090k;
                synchronized (gVar) {
                    try {
                        gVar.f73047a.add(kVar);
                    } finally {
                        MethodCollector.m26664o(7996);
                    }
                }
                eVar = kVar.f73111c;
            } finally {
                MethodCollector.m26664o(7996);
            }
        }
        return eVar;
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30604f
    /* renamed from: a */
    public final void mo54826a(C30607i iVar) {
        MethodCollector.m26663i(11064);
        synchronized (this) {
            try {
                iVar.f73073f--;
            } finally {
                MethodCollector.m26664o(11064);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d7, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r10.f73073f++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r10.f73073f <= 1) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r1 = new com.p2082ss.android.socialbase.downloader.segment.C30607i(r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0208 A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02c2 A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0166 A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016e A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x017e A[Catch:{ all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0180 A[Catch:{ all -> 0x02e0 }] */
    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30604f
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.socialbase.downloader.segment.C30607i mo54833b(com.p2082ss.android.socialbase.downloader.segment.RunnableC30613l r20) {
        /*
        // Method dump skipped, instructions count: 744
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.segment.C30609j.mo54833b(com.ss.android.socialbase.downloader.segment.l):com.ss.android.socialbase.downloader.segment.i");
    }

    @Override // com.p2082ss.android.socialbase.downloader.segment.AbstractC30604f
    /* renamed from: a */
    public final void mo54827a(RunnableC30613l lVar) {
        if (this.f73077B) {
            C30434a.m62028c("SegmentDispatcher", "onReaderRun, threadIndex = " + lVar.f73133j);
        }
    }

    /* renamed from: b */
    private void m62817b(String str, List<C30616o> list) {
        if (this.f73077B) {
            Iterator<C30616o> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        int f = this.f73087h.mo54866f();
        if (f == 1 || f == 3) {
            int size = this.f73082c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (!TextUtils.equals(this.f73082c.get(i).f73152a, str)) {
                    i++;
                } else if (i >= 0 && i < this.f73082c.size()) {
                    this.f73082c.addAll(i + 1, list);
                    return;
                }
            }
        }
        this.f73082c.addAll(list);
    }

    /* renamed from: a */
    private static void m62815a(List<C30607i> list, C30607i iVar, boolean z) {
        long j = iVar.f73068a;
        int size = list.size();
        int i = 0;
        while (i < size && j >= list.get(i).f73068a) {
            i++;
        }
        list.add(i, iVar);
        if (z) {
            iVar.f73071d = size;
        }
    }

    public C30609j(DownloadInfo downloadInfo, C30614m mVar, AbstractC30522f fVar) {
        boolean z = true;
        this.f73092m = true;
        this.f73094o = new LinkedList<>();
        this.f73095p = new ArrayList();
        this.f73099t = new Object();
        this.f73102w = false;
        this.f73078C = new C30519e.AbstractC30521b() {
            /* class com.p2082ss.android.socialbase.downloader.segment.C30609j.C306101 */

            /* renamed from: b */
            private int f73107b;

            static {
                Covode.recordClassIndex(37145);
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2188j.C30519e.AbstractC30521b
            /* renamed from: a */
            public final long mo54360a() {
                MethodCollector.m26663i(8559);
                if (C30609j.this.f73080a || C30609j.this.f73081b) {
                    MethodCollector.m26664o(8559);
                    return -1;
                }
                synchronized (C30609j.this) {
                    try {
                        if (C30609j.this.f73083d != null || C30609j.this.f73084e != null) {
                            return -1;
                        }
                        long j = C30609j.this.f73085f;
                        if (j <= 0) {
                            MethodCollector.m26664o(8559);
                            return -1;
                        }
                        this.f73107b++;
                        RunnableC30613l a = C30609j.this.mo54846a(false, System.currentTimeMillis(), j);
                        if (a != null) {
                            C30609j.this.mo54851d(a);
                            a.mo54855a(false);
                            long size = ((long) ((this.f73107b / C30609j.this.f73082c.size()) + 1)) * j;
                            MethodCollector.m26664o(8559);
                            return size;
                        }
                        MethodCollector.m26664o(8559);
                        return j;
                    } finally {
                        MethodCollector.m26664o(8559);
                    }
                }
            }
        };
        this.f73079D = new C30519e.AbstractC30521b() {
            /* class com.p2082ss.android.socialbase.downloader.segment.C30609j.C306112 */

            static {
                Covode.recordClassIndex(37146);
            }

            @Override // com.p2082ss.android.socialbase.downloader.p2188j.C30519e.AbstractC30521b
            /* renamed from: a */
            public final long mo54360a() {
                return C30609j.this.mo54850c();
            }
        };
        this.f73086g = downloadInfo;
        this.f73087h = mVar;
        C30600b bVar = new C30600b(mVar.f73150a.optInt("buffer_count", 512), mVar.f73150a.optInt("buffer_size", 8192));
        this.f73088i = bVar;
        this.f73089j = fVar;
        this.f73090k = new C30605g(downloadInfo, fVar, bVar);
        this.f73101v = new C30519e();
        this.f73100u = new C30533f();
        this.f73077B = C30472a.m62087a(downloadInfo.getId(), null).mo54258a("debug", 0) != 1 ? false : z;
    }

    /* renamed from: a */
    public final RunnableC30613l mo54846a(boolean z, long j, long j2) {
        RunnableC30613l lVar = null;
        for (RunnableC30613l lVar2 : this.f73091l) {
            if ((lVar2.f73133j != 0 || z) && lVar2.f73141r > 0 && lVar2.f73142s <= 0 && j - lVar2.f73141r > j2) {
                if (lVar == null || lVar2.f73141r < lVar.f73141r) {
                    lVar = lVar2;
                }
            }
        }
        return lVar;
    }
}
