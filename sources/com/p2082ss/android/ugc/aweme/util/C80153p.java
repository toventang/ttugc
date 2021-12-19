package com.p2082ss.android.ugc.aweme.util;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.p */
public final class C80153p {

    /* renamed from: j */
    public static final C80154a f179581j = new C80154a((byte) 0);

    /* renamed from: a */
    public boolean f179582a = true;

    /* renamed from: b */
    public String f179583b;

    /* renamed from: c */
    public long f179584c;

    /* renamed from: d */
    public List<String> f179585d;

    /* renamed from: e */
    public String f179586e;

    /* renamed from: f */
    public int f179587f;

    /* renamed from: g */
    public AtomicInteger f179588g = new AtomicInteger(-2);

    /* renamed from: h */
    public final TextView f179589h;

    /* renamed from: i */
    public final TextSwitcher f179590i;

    /* renamed from: k */
    private final AbstractC89244h f179591k = C89250i.m154773a((AbstractC89171a) C80155b.f179594a);

    /* renamed from: l */
    private final List<Object> f179592l = new ArrayList();

    /* renamed from: m */
    private final AbstractC89244h f179593m = C89250i.m154773a((AbstractC89171a) new C80156c(this));

    static {
        Covode.recordClassIndex(93397);
    }

    /* renamed from: a */
    public final Handler mo123602a() {
        return (Handler) this.f179591k.getValue();
    }

    /* renamed from: b */
    public final Runnable mo123605b() {
        return (Runnable) this.f179593m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.util.p$a */
    public static final class C80154a {
        static {
            Covode.recordClassIndex(93398);
        }

        private C80154a() {
        }

        public /* synthetic */ C80154a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.util.p$c */
    static final class C80156c extends AbstractC89220m implements AbstractC89171a<RunnableC801571> {

        /* renamed from: a */
        final /* synthetic */ C80153p f179595a;

        static {
            Covode.recordClassIndex(93400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80156c(C80153p pVar) {
            super(0);
            this.f179595a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RunnableC801571 invoke() {
            return new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.util.C80153p.C80156c.RunnableC801571 */

                /* renamed from: a */
                final /* synthetic */ C80156c f179596a;

                static {
                    Covode.recordClassIndex(93401);
                }

                public final void run() {
                    int andSet = this.f179596a.f179595a.f179588g.getAndSet(-2);
                    if (andSet != -2) {
                        this.f179596a.f179595a.f179587f = andSet;
                    } else {
                        this.f179596a.f179595a.f179587f++;
                    }
                    List<String> list = this.f179596a.f179595a.f179585d;
                    if (list == null || list.isEmpty()) {
                        this.f179596a.f179595a.mo123602a().removeCallbacks(this);
                        return;
                    }
                    this.f179596a.f179595a.mo123603a(this.f179596a.f179595a.f179587f, true);
                    long j = this.f179596a.f179595a.f179584c;
                    if (j > 0) {
                        this.f179596a.f179595a.mo123602a().postDelayed(this, j);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f179596a = r1;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.util.p$b */
    static final class C80155b extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C80155b f179594a = new C80155b();

        static {
            Covode.recordClassIndex(93399);
        }

        C80155b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public final void mo123604a(List<String> list) {
        this.f179585d = list;
        this.f179587f = -1;
    }

    /* renamed from: a */
    public static /* synthetic */ void m138909a(C80153p pVar) {
        pVar.mo123603a(0, false);
        long j = pVar.f179584c;
        if (pVar.f179582a) {
            List<String> list = pVar.f179585d;
            if (list != null && list.size() > 1) {
                pVar.mo123602a().removeCallbacks(pVar.mo123605b());
                if (j < 0) {
                    j = 0;
                }
                pVar.mo123602a().postDelayed(pVar.mo123605b(), j);
            }
            pVar.f179582a = false;
        }
    }

    public C80153p(TextView textView, TextSwitcher textSwitcher) {
        C89219l.m154721d(textSwitcher, "");
        this.f179589h = textView;
        this.f179590i = textSwitcher;
    }

    /* renamed from: a */
    public final void mo123603a(int i, boolean z) {
        List<String> list = this.f179585d;
        if (list != null && !list.isEmpty()) {
            this.f179587f = i;
            if (i < 0 || i >= list.size()) {
                this.f179587f = 0;
            }
            String str = list.get(this.f179587f);
            this.f179583b = str;
            if (z) {
                this.f179590i.setText(str);
            } else {
                this.f179590i.setCurrentText(str);
            }
            Iterator<T> it = this.f179592l.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
