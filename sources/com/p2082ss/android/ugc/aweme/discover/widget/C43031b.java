package com.p2082ss.android.ugc.aweme.discover.widget;

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

/* renamed from: com.ss.android.ugc.aweme.discover.widget.b */
public final class C43031b {

    /* renamed from: j */
    public static final C43032a f100308j = new C43032a((byte) 0);

    /* renamed from: a */
    public boolean f100309a = true;

    /* renamed from: b */
    public String f100310b;

    /* renamed from: c */
    public long f100311c;

    /* renamed from: d */
    public List<String> f100312d;

    /* renamed from: e */
    public String f100313e;

    /* renamed from: f */
    public int f100314f;

    /* renamed from: g */
    public AtomicInteger f100315g = new AtomicInteger(-2);

    /* renamed from: h */
    public final List<AbstractC43033b> f100316h = new ArrayList();

    /* renamed from: i */
    public final TextView f100317i;

    /* renamed from: k */
    private final AbstractC89244h f100318k = C89250i.m154773a((AbstractC89171a) C43034c.f100321a);

    /* renamed from: l */
    private final AbstractC89244h f100319l = C89250i.m154773a((AbstractC89171a) new C43035d(this));

    /* renamed from: m */
    private final TextSwitcher f100320m;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.b$b */
    public interface AbstractC43033b {
        static {
            Covode.recordClassIndex(51181);
        }

        /* renamed from: a */
        void mo71184a(int i);
    }

    static {
        Covode.recordClassIndex(51179);
    }

    /* renamed from: c */
    private final Runnable m85865c() {
        return (Runnable) this.f100319l.getValue();
    }

    /* renamed from: a */
    public final Handler mo73227a() {
        return (Handler) this.f100318k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.b$a */
    public static final class C43032a {
        static {
            Covode.recordClassIndex(51180);
        }

        private C43032a() {
        }

        public /* synthetic */ C43032a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.widget.b$d */
    public static final class C43035d extends AbstractC89220m implements AbstractC89171a<RunnableC430361> {

        /* renamed from: a */
        final /* synthetic */ C43031b f100322a;

        static {
            Covode.recordClassIndex(51183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43035d(C43031b bVar) {
            super(0);
            this.f100322a = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RunnableC430361 invoke() {
            return new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.widget.C43031b.C43035d.RunnableC430361 */

                /* renamed from: a */
                final /* synthetic */ C43035d f100323a;

                static {
                    Covode.recordClassIndex(51184);
                }

                public final void run() {
                    int andSet = this.f100323a.f100322a.f100315g.getAndSet(-2);
                    if (andSet != -2) {
                        this.f100323a.f100322a.f100314f = andSet;
                    } else {
                        this.f100323a.f100322a.f100314f++;
                    }
                    List<String> list = this.f100323a.f100322a.f100312d;
                    if (list == null || list.isEmpty()) {
                        this.f100323a.f100322a.mo73227a().removeCallbacks(this);
                        return;
                    }
                    this.f100323a.f100322a.mo73228a(this.f100323a.f100322a.f100314f, true);
                    long j = this.f100323a.f100322a.f100311c;
                    if (j > 0) {
                        this.f100323a.f100322a.mo73227a().postDelayed(this, j);
                    }
                }

                {
                    this.f100323a = r1;
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.widget.b$c */
    public static final class C43034c extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C43034c f100321a = new C43034c();

        static {
            Covode.recordClassIndex(51182);
        }

        C43034c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: b */
    public final void mo73229b() {
        mo73227a().removeCallbacks(m85865c());
        this.f100309a = true;
    }

    /* renamed from: d */
    private final void m85866d() {
        Iterator<T> it = this.f100316h.iterator();
        while (it.hasNext()) {
            it.next().mo71184a(this.f100314f);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m85863a(long j) {
        if (this.f100309a) {
            List<String> list = this.f100312d;
            if (list != null && list.size() > 1) {
                mo73227a().removeCallbacks(m85865c());
                if (j < 0) {
                    j = 0;
                }
                mo73227a().postDelayed(m85865c(), j);
            }
            this.f100309a = false;
        }
    }

    public C43031b(TextView textView, TextSwitcher textSwitcher) {
        C89219l.m154721d(textSwitcher, "");
        this.f100317i = textView;
        this.f100320m = textSwitcher;
    }

    /* renamed from: a */
    public final void mo73228a(int i, boolean z) {
        List<String> list = this.f100312d;
        if (list != null && !list.isEmpty()) {
            this.f100314f = i;
            if (i < 0 || i >= list.size()) {
                this.f100314f = 0;
            }
            String str = list.get(this.f100314f);
            this.f100310b = str;
            if (z) {
                this.f100320m.setText(str);
            } else {
                this.f100320m.setCurrentText(str);
            }
            m85866d();
        }
    }
}
