package com.p2082ss.android.ugc.aweme.commercialize.utils.p2625c;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.abtest.C37589d;
import com.p2082ss.android.ugc.aweme.commercialize.p2605o.AbstractC38265a;
import com.p2082ss.android.ugc.aweme.commercialize.p2605o.C38266b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.b */
public final class C38736b {

    /* renamed from: a */
    List<C38266b> f91475a = new ArrayList();

    /* renamed from: b */
    public int f91476b;

    /* renamed from: c */
    public HandlerC38737a f91477c = new HandlerC38737a(this);

    /* renamed from: d */
    int f91478d;

    /* renamed from: e */
    long f91479e;

    /* renamed from: f */
    private AbstractC38265a f91480f = C38735a.f91474a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.b$a */
    public static final class HandlerC38737a extends Handler {

        /* renamed from: c */
        public static final C38738a f91481c = new C38738a((byte) 0);

        /* renamed from: a */
        public long f91482a = 1000;

        /* renamed from: b */
        public final C38736b f91483b;

        static {
            Covode.recordClassIndex(46278);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.b$a$a */
        public static final class C38738a {
            static {
                Covode.recordClassIndex(46279);
            }

            private C38738a() {
            }

            public /* synthetic */ C38738a(byte b) {
                this();
            }
        }

        /* renamed from: a */
        public final void mo67282a() {
            if (!hasMessages(1)) {
                sendEmptyMessage(1);
            }
        }

        /* renamed from: b */
        public final void mo67283b() {
            if (hasMessages(1)) {
                removeMessages(1);
            }
        }

        public HandlerC38737a(C38736b bVar) {
            C89219l.m154721d(bVar, "");
            this.f91483b = bVar;
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            if (message.what == 1) {
                C38736b bVar = this.f91483b;
                long d = bVar.mo67281d();
                if (!bVar.f91475a.isEmpty()) {
                    if (C37589d.f88839b) {
                        if (bVar.f91476b != bVar.f91478d + 1 || d < bVar.f91479e) {
                            bVar.f91478d = bVar.f91476b;
                            bVar.f91479e = d;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C38266b bVar2 : bVar.f91475a) {
                        if ((bVar.f91476b == bVar2.f90434a && d >= ((long) bVar2.f90435b)) || bVar.f91476b > bVar2.f90434a) {
                            try {
                                Runnable runnable = bVar2.f90438e;
                                if (runnable != null) {
                                    runnable.run();
                                }
                                if (!bVar2.f90439f) {
                                    bVar2.f90438e = null;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if (!bVar2.f90439f) {
                                arrayList.add(bVar2);
                            } else {
                                bVar2.f90434a++;
                            }
                        }
                    }
                    bVar.f91475a.removeAll(arrayList);
                }
                sendEmptyMessageDelayed(1, this.f91482a);
            }
        }
    }

    static {
        Covode.recordClassIndex(46277);
    }

    /* renamed from: d */
    public final long mo67281d() {
        return this.f91480f.mo65856a();
    }

    /* renamed from: a */
    public final void mo67275a() {
        this.f91475a.clear();
        this.f91477c.mo67283b();
        this.f91477c.f91482a = 1000;
    }

    /* renamed from: b */
    public final void mo67279b() {
        this.f91476b = 0;
        this.f91478d = 0;
        this.f91479e = 0;
        if (!this.f91475a.isEmpty()) {
            this.f91477c.mo67282a();
        }
    }

    /* renamed from: c */
    public final void mo67280c() {
        this.f91476b++;
        if (this.f91475a.isEmpty()) {
            this.f91477c.mo67283b();
        }
    }

    /* renamed from: a */
    public final void mo67276a(long j) {
        this.f91477c.f91482a = j;
    }

    /* renamed from: a */
    public final void mo67277a(AbstractC38265a aVar) {
        C89219l.m154721d(aVar, "");
        this.f91480f = aVar;
    }

    /* renamed from: a */
    public final void mo67278a(C38266b bVar) {
        C89219l.m154721d(bVar, "");
        if (!this.f91475a.contains(bVar)) {
            this.f91475a.add(bVar);
        }
    }
}
