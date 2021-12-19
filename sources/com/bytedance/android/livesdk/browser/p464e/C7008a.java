package com.bytedance.android.livesdk.browser.p464e;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveLynxJsbReportEventSetting;
import com.bytedance.android.monitor.lynx.C11969b;
import com.bytedance.android.monitor.p706d.C11924g;
import com.bytedance.android.monitor.p706d.C11925h;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18304a;
import com.bytedance.ies.web.jsbridge2.AbstractC18356p;
import com.bytedance.ies.web.jsbridge2.C18326ak;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.lynx.tasm.LynxView;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.e.a */
public final class C7008a implements AbstractC18356p {

    /* renamed from: a */
    public final AbstractC18304a f17593a;

    static {
        Covode.recordClassIndex(7747);
    }

    /* renamed from: a */
    public static int m14951a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.e.a$a */
    static final class RunnableC7009a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7008a f17594a;

        /* renamed from: b */
        final /* synthetic */ String f17595b;

        /* renamed from: c */
        final /* synthetic */ long f17596c;

        static {
            Covode.recordClassIndex(7748);
        }

        RunnableC7009a(C7008a aVar, String str, long j) {
            this.f17594a = aVar;
            this.f17595b = str;
            this.f17596c = j;
        }

        public final void run() {
            LynxView lynxView = (LynxView) this.f17594a.f17593a.mo29304b();
            if (lynxView != null && !TextUtils.isEmpty(this.f17595b)) {
                C11925h hVar = new C11925h();
                hVar.f28521b = this.f17595b;
                hVar.f28522c = 0;
                hVar.f28526g = 0;
                if (hVar.f28526g != 0) {
                    hVar.f28527h = this.f17596c;
                    hVar.f28525f = hVar.f28527h - hVar.f28526g;
                }
                C11969b.f28620f.mo19179a(lynxView, hVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.browser.e.a$c */
    public static final class RunnableC7011c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7008a f17601a;

        /* renamed from: b */
        final /* synthetic */ String f17602b;

        /* renamed from: c */
        final /* synthetic */ int f17603c;

        /* renamed from: d */
        final /* synthetic */ long f17604d;

        static {
            Covode.recordClassIndex(7750);
        }

        RunnableC7011c(C7008a aVar, String str, int i, long j) {
            this.f17601a = aVar;
            this.f17602b = str;
            this.f17603c = i;
            this.f17604d = j;
        }

        public final void run() {
            LynxView lynxView = (LynxView) this.f17601a.f17593a.mo29304b();
            if (lynxView != null && !TextUtils.isEmpty(this.f17602b)) {
                C11925h hVar = new C11925h();
                hVar.f28521b = this.f17602b;
                hVar.f28522c = C7008a.m14951a(this.f17603c);
                hVar.f28526g = 0;
                if (hVar.f28526g != 0) {
                    hVar.f28527h = this.f17604d;
                    hVar.f28525f = this.f17604d - hVar.f28526g;
                }
                C11969b.f28620f.mo19179a(lynxView, hVar);
                C11924g gVar = new C11924g();
                gVar.f28518e = this.f17602b;
                gVar.f28516c = C7008a.m14951a(this.f17603c);
                C11969b.f28620f.mo19178a(lynxView, gVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.e.a$b */
    static final class RunnableC7010b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7008a f17597a;

        /* renamed from: b */
        final /* synthetic */ String f17598b;

        /* renamed from: c */
        final /* synthetic */ C18326ak f17599c;

        /* renamed from: d */
        final /* synthetic */ long f17600d;

        static {
            Covode.recordClassIndex(7749);
        }

        RunnableC7010b(C7008a aVar, String str, C18326ak akVar, long j) {
            this.f17597a = aVar;
            this.f17598b = str;
            this.f17599c = akVar;
            this.f17600d = j;
        }

        public final void run() {
            long j;
            List<TimeLineEvent> list;
            List<TimeLineEvent> list2;
            List<TimeLineEvent> list3;
            List<TimeLineEvent> list4;
            LynxView lynxView = (LynxView) this.f17597a.f17593a.mo29304b();
            if (!(lynxView == null || TextUtils.isEmpty(this.f17598b))) {
                C18326ak akVar = this.f17599c;
                if (akVar == null || (list4 = akVar.f43834c) == null) {
                    j = 0;
                } else {
                    j = 0;
                    for (T t : list4) {
                        if (t != null && C89219l.m154714a((Object) TimeLineEvent.C18303b.f43744ar, (Object) t.getLabel())) {
                            j = t.getElapsedTimestamp();
                        }
                    }
                }
                C11925h hVar = new C11925h();
                hVar.f28521b = this.f17598b;
                hVar.f28522c = 0;
                hVar.f28526g = j;
                if (hVar.f28526g != 0) {
                    hVar.f28527h = this.f17600d;
                    hVar.f28525f = hVar.f28527h - hVar.f28526g;
                }
                StringBuilder sb = new StringBuilder();
                if (LiveLynxJsbReportEventSetting.INSTANCE.getValue()) {
                    C18326ak akVar2 = this.f17599c;
                    if (!(akVar2 == null || (list3 = akVar2.f43832a) == null)) {
                        for (T t2 : list3) {
                            C89219l.m154716b(t2, "");
                            sb.append(t2.getExtra());
                        }
                    }
                    C18326ak akVar3 = this.f17599c;
                    if (!(akVar3 == null || (list2 = akVar3.f43834c) == null)) {
                        for (T t3 : list2) {
                            C89219l.m154716b(t3, "");
                            sb.append(t3.getExtra());
                        }
                    }
                    C18326ak akVar4 = this.f17599c;
                    if (!(akVar4 == null || (list = akVar4.f43833b) == null)) {
                        for (T t4 : list) {
                            C89219l.m154716b(t4, "");
                            sb.append(t4.getExtra());
                        }
                    }
                }
                hVar.f28523d = sb.toString();
                C11969b.f28620f.mo19179a(lynxView, hVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.e.a$d */
    static final class RunnableC7012d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7008a f17605a;

        /* renamed from: b */
        final /* synthetic */ String f17606b;

        /* renamed from: c */
        final /* synthetic */ C18326ak f17607c;

        /* renamed from: d */
        final /* synthetic */ int f17608d;

        /* renamed from: e */
        final /* synthetic */ String f17609e;

        /* renamed from: f */
        final /* synthetic */ long f17610f;

        static {
            Covode.recordClassIndex(7751);
        }

        RunnableC7012d(C7008a aVar, String str, C18326ak akVar, int i, String str2, long j) {
            this.f17605a = aVar;
            this.f17606b = str;
            this.f17607c = akVar;
            this.f17608d = i;
            this.f17609e = str2;
            this.f17610f = j;
        }

        public final void run() {
            long j;
            List<TimeLineEvent> list;
            List<TimeLineEvent> list2;
            List<TimeLineEvent> list3;
            List<TimeLineEvent> list4;
            LynxView lynxView = (LynxView) this.f17605a.f17593a.mo29304b();
            if (!(lynxView == null || TextUtils.isEmpty(this.f17606b))) {
                C18326ak akVar = this.f17607c;
                if (akVar == null || (list4 = akVar.f43834c) == null) {
                    j = 0;
                } else {
                    j = 0;
                    for (T t : list4) {
                        if (t != null && C89219l.m154714a((Object) TimeLineEvent.C18303b.f43744ar, (Object) t.getLabel())) {
                            j = t.getElapsedTimestamp();
                        }
                    }
                }
                C11925h hVar = new C11925h();
                hVar.f28521b = this.f17606b;
                hVar.f28522c = C7008a.m14951a(this.f17608d);
                hVar.f28523d = this.f17609e;
                hVar.f28526g = j;
                if (hVar.f28526g != 0) {
                    hVar.f28527h = this.f17610f;
                    hVar.f28525f = hVar.f28527h - hVar.f28526g;
                }
                C11969b.f28620f.mo19179a(lynxView, hVar);
                C11924g gVar = new C11924g();
                gVar.f28518e = this.f17606b;
                gVar.f28516c = C7008a.m14951a(this.f17608d);
                String str = this.f17609e;
                if (str == null) {
                    str = "";
                }
                StringBuilder sb = new StringBuilder(str);
                if (LiveLynxJsbReportEventSetting.INSTANCE.getValue()) {
                    C18326ak akVar2 = this.f17607c;
                    if (!(akVar2 == null || (list3 = akVar2.f43832a) == null)) {
                        for (T t2 : list3) {
                            C89219l.m154716b(t2, "");
                            sb.append(t2.getExtra());
                        }
                    }
                    C18326ak akVar3 = this.f17607c;
                    if (!(akVar3 == null || (list2 = akVar3.f43834c) == null)) {
                        for (T t3 : list2) {
                            C89219l.m154716b(t3, "");
                            sb.append(t3.getExtra());
                        }
                    }
                    C18326ak akVar4 = this.f17607c;
                    if (!(akVar4 == null || (list = akVar4.f43833b) == null)) {
                        for (T t4 : list) {
                            C89219l.m154716b(t4, "");
                            sb.append(t4.getExtra());
                        }
                    }
                }
                gVar.f28517d = sb.toString();
                C11969b.f28620f.mo19178a(lynxView, gVar);
            }
        }
    }

    public C7008a(AbstractC18304a aVar) {
        C89219l.m154721d(aVar, "");
        this.f17593a = aVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
    /* renamed from: a */
    public final void mo13317a(String str) {
        C11929a.m21042a(new RunnableC7009a(this, str, SystemClock.elapsedRealtime()));
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
    /* renamed from: a */
    public final void mo13318a(String str, C18326ak akVar) {
        C11929a.m21042a(new RunnableC7010b(this, str, akVar, SystemClock.elapsedRealtime()));
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
    /* renamed from: a */
    public final void mo13319a(String str, String str2, int i) {
        mo13321b(str, str2, i);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
    /* renamed from: b */
    public final void mo13321b(String str, String str2, int i) {
        C11929a.m21042a(new RunnableC7011c(this, str2, i, SystemClock.elapsedRealtime()));
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18356p
    /* renamed from: a */
    public final void mo13320a(String str, String str2, int i, String str3, C18326ak akVar) {
        C11929a.m21042a(new RunnableC7012d(this, str2, akVar, i, str3, SystemClock.elapsedRealtime()));
    }
}
