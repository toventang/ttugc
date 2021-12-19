package com.p2082ss.android.ugc.aweme.feed;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.C50483w;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.p3438b.C59227a;
import com.p2082ss.android.ugc.aweme.utils.C80444fq;
import com.p2082ss.android.ugc.aweme.utils.EnumC80443fp;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.x */
public final class C50520x {

    /* renamed from: b */
    public static final int f116766b = 200;

    /* renamed from: c */
    public static final C50521a f116767c = new C50521a((byte) 0);

    /* renamed from: f */
    private static final String f116768f = "FeedReqAppLogUtil";

    /* renamed from: a */
    public volatile boolean f116769a = C80444fq.C80445a.f180026a.mo123743a(EnumC80443fp.FEED_REQ);

    /* renamed from: d */
    private long f116770d;

    /* renamed from: e */
    private final Fragment f116771e;

    /* renamed from: com.ss.android.ugc.aweme.feed.x$a */
    public static final class C50521a {
        static {
            Covode.recordClassIndex(59668);
        }

        private C50521a() {
        }

        public /* synthetic */ C50521a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.x$b */
    public static final class CallableC50522b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C50520x f116772a;

        /* renamed from: b */
        final /* synthetic */ int f116773b;

        /* renamed from: c */
        final /* synthetic */ FeedAppLogParams f116774c;

        /* renamed from: d */
        final /* synthetic */ Exception f116775d;

        /* renamed from: e */
        final /* synthetic */ long f116776e;

        /* renamed from: f */
        final /* synthetic */ String f116777f;

        /* renamed from: g */
        final /* synthetic */ String f116778g;

        /* renamed from: h */
        final /* synthetic */ String f116779h;

        /* renamed from: i */
        final /* synthetic */ String f116780i;

        /* renamed from: j */
        final /* synthetic */ boolean f116781j;

        /* renamed from: k */
        final /* synthetic */ long f116782k;

        static {
            Covode.recordClassIndex(59669);
        }

        CallableC50522b(C50520x xVar, int i, FeedAppLogParams feedAppLogParams, Exception exc, long j, String str, String str2, String str3, String str4, boolean z, long j2) {
            this.f116772a = xVar;
            this.f116773b = i;
            this.f116774c = feedAppLogParams;
            this.f116775d = exc;
            this.f116776e = j;
            this.f116777f = str;
            this.f116778g = str2;
            this.f116779h = str3;
            this.f116780i = str4;
            this.f116781j = z;
            this.f116782k = j2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return C50520x.m94700a(this.f116773b, this.f116774c, this.f116775d, this.f116776e, this.f116777f, this.f116778g, this.f116779h, this.f116780i, this.f116781j, this.f116782k);
        }
    }

    static {
        Covode.recordClassIndex(59667);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.x$c */
    public static final class CallableC50523c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C50520x f116783a;

        /* renamed from: b */
        final /* synthetic */ String f116784b;

        /* renamed from: c */
        final /* synthetic */ String f116785c;

        /* renamed from: d */
        final /* synthetic */ String f116786d;

        /* renamed from: e */
        final /* synthetic */ String f116787e;

        static {
            Covode.recordClassIndex(59670);
        }

        CallableC50523c(C50520x xVar, String str, String str2, String str3, String str4) {
            this.f116783a = xVar;
            this.f116784b = str;
            this.f116785c = str2;
            this.f116786d = str3;
            this.f116787e = str4;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C39163s a = new C39163s().mo67941a("is_first", String.valueOf(this.f116783a.f116769a ? 1 : 0)).mo67941a("feed_tab", this.f116784b).mo67941a("top_activity", this.f116785c).mo67941a("request_method", this.f116786d).mo67941a("duration", this.f116787e);
            Context a2 = C17867d.m33078a();
            if (TextUtils.isEmpty(C58029j.f132250b) || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132250b = C13624l.m24489e(a2);
            }
            JSONObject a3 = a.mo67941a("access", C58029j.f132250b).mo67942a();
            C39162r.onEvent(MobClick.obtain().setEventName("feed_request").setLabelName("perf_monitor").setJsonObject(a3));
            C39162r.m79463b("feed_request", a3);
            C59227a.m108848a("feed_request", a3);
            return null;
        }
    }

    public C50520x(Fragment fragment) {
        this.f116771e = fragment;
    }

    /* renamed from: a */
    public final void mo85843a(String str) {
        C89219l.m154721d(str, "");
        this.f116770d = SystemClock.elapsedRealtime();
        long j = C48017a.f111236a;
        long j2 = 0;
        C48017a.f111236a = 0;
        if (j > 0) {
            j2 = SystemClock.elapsedRealtime() - j;
        }
        String l = Long.toString(j2);
        C1731i.m5640b(new CallableC50523c(this, C49907s.f115050b.name(), C49907s.m93688b(), str, l), C39162r.m79452a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.android.ugc.aweme.feed.C48033ad m94699a(org.json.JSONObject r23, com.p2082ss.android.ugc.aweme.feed.model.FeedAppLogParams r24) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.C50520x.m94699a(org.json.JSONObject, com.ss.android.ugc.aweme.feed.model.FeedAppLogParams):com.ss.android.ugc.aweme.feed.ad");
    }

    /* renamed from: a */
    public final void mo85841a(int i, String str, FeedAppLogParams feedAppLogParams) {
        boolean z;
        C89219l.m154721d(str, "");
        long j = this.f116770d;
        boolean z2 = this.f116769a;
        Fragment fragment = this.f116771e;
        if (fragment == null || fragment.getUserVisibleHint()) {
            z = false;
        } else {
            z = true;
        }
        C89219l.m154721d(str, "");
        C1731i.m5640b(new C50483w.CallableC50485b(C80444fq.C80445a.f180026a.mo123743a(EnumC80443fp.FEED_FIRST_REQUEST_RESPONSE), i, SystemClock.elapsedRealtime() - C48017a.f111237b, feedAppLogParams, str, SystemClock.elapsedRealtime() - j), C39162r.m79452a());
        if (!(feedAppLogParams == null || feedAppLogParams.mData == null)) {
            FeedItemList feedItemList = feedAppLogParams.mData;
            C89219l.m154716b(feedItemList, "");
            if (feedItemList.isFromLocalCache) {
                return;
            }
        }
        C1731i.m5640b(new C50483w.CallableC50484a(i, feedAppLogParams, z, SystemClock.elapsedRealtime() - j, z2, str, C49907s.f115050b.name()), C39162r.m79452a());
    }

    /* renamed from: a */
    public final void mo85842a(int i, String str, FeedAppLogParams feedAppLogParams, Exception exc) {
        int i2;
        C89219l.m154721d(str, "");
        boolean z = C49301e.f113323k;
        C49301e.f113323k = false;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f116770d;
        long currentTimeMillis = System.currentTimeMillis();
        String name = C49907s.f115050b.name();
        String b = C49907s.m93688b();
        if (z) {
            i2 = -1;
        } else if (this.f116769a) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C1731i.m5640b(new CallableC50522b(this, i, feedAppLogParams, exc, elapsedRealtime, String.valueOf(i2), str, name, b, z, currentTimeMillis), C39162r.m79452a());
        if (C49710k.f114394b < 0) {
            C49710k.f114394b = SystemClock.elapsedRealtime();
        }
        if (!z) {
            this.f116769a = false;
        }
        if (i == 1) {
            C48318am.m91762a(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Void m94700a(int r20, com.p2082ss.android.ugc.aweme.feed.model.FeedAppLogParams r21, java.lang.Exception r22, long r23, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, long r30) {
        /*
        // Method dump skipped, instructions count: 887
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.C50520x.m94700a(int, com.ss.android.ugc.aweme.feed.model.FeedAppLogParams, java.lang.Exception, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, long):java.lang.Void");
    }
}
