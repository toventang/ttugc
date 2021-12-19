package com.bytedance.common.wschannel.p913c.p915b;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.wschannel.p913c.AbstractC13658a;
import com.bytedance.common.wschannel.p913c.AbstractC13669c;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.C90029ac;

/* renamed from: com.bytedance.common.wschannel.c.b.b */
public final class C13666b extends AbstractC13658a<C13664a> {

    /* renamed from: b */
    public AbstractC13669c f33189b;

    /* renamed from: c */
    public AtomicBoolean f33190c = new AtomicBoolean(false);

    /* renamed from: d */
    private Handler f33191d;

    /* renamed from: e */
    private Runnable f33192e = new Runnable() {
        /* class com.bytedance.common.wschannel.p913c.p915b.C13666b.RunnableC136671 */

        static {
            Covode.recordClassIndex(15699);
        }

        public final void run() {
            if (C13666b.this.f33190c.getAndSet(false)) {
                C13666b.this.mo21959d();
                if (C13666b.this.f33189b != null) {
                    C13666b.this.f33189b.mo21963a();
                }
            }
        }
    };

    /* renamed from: f */
    private Runnable f33193f = new Runnable() {
        /* class com.bytedance.common.wschannel.p913c.p915b.C13666b.RunnableC136682 */

        static {
            Covode.recordClassIndex(15700);
        }

        public final void run() {
            if (C13666b.this.f33189b != null) {
                C13666b.this.mo21960e();
                C13666b.this.f33189b.mo21964b();
            }
        }
    };

    static {
        Covode.recordClassIndex(15698);
    }

    @Override // com.bytedance.common.wschannel.p913c.AbstractC13670d
    /* renamed from: c */
    public final void mo21958c() {
        mo21959d();
    }

    @Override // com.bytedance.common.wschannel.p913c.AbstractC13670d
    /* renamed from: a */
    public final void mo21955a() {
        this.f33190c.set(false);
        this.f33191d.removeCallbacks(this.f33192e);
    }

    @Override // com.bytedance.common.wschannel.p913c.AbstractC13670d
    /* renamed from: b */
    public final void mo21957b() {
        this.f33190c.set(true);
        this.f33191d.removeCallbacks(this.f33192e);
        this.f33191d.postDelayed(this.f33192e, ((C13664a) this.f33178a).f33188b);
    }

    /* renamed from: d */
    public final void mo21959d() {
        this.f33191d.removeCallbacks(this.f33192e);
        this.f33191d.removeCallbacks(this.f33193f);
        this.f33190c.set(false);
    }

    /* renamed from: e */
    public final void mo21960e() {
        long j = ((C13664a) this.f33178a).f33187a;
        this.f33191d.removeCallbacks(this.f33193f);
        this.f33191d.postDelayed(this.f33193f, j);
    }

    public C13666b(C13664a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.p913c.AbstractC13670d
    /* renamed from: a */
    public final void mo21956a(C90029ac acVar) {
        if (((C13664a) this.f33178a).f33187a == -1) {
            if (acVar == null) {
                ((C13664a) this.f33178a).f33187a = 270000;
            } else {
                String a = acVar.mo144718a("Handshake-Options", null);
                if (a != null) {
                    String[] split = a.split(";");
                    int length = split.length;
                    long j = -1;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        String str = split[i];
                        if (!TextUtils.isEmpty(str)) {
                            String[] split2 = str.split("=");
                            if ("ping-interval".equals(split2[0])) {
                                try {
                                    j = Long.parseLong(split2[1]) * 1000;
                                    break;
                                } catch (NumberFormatException unused) {
                                    j = 270000;
                                }
                            } else {
                                continue;
                            }
                        }
                        i++;
                    }
                    if (j != -1) {
                        ((C13664a) this.f33178a).f33187a = j;
                    }
                }
                ((C13664a) this.f33178a).f33187a = 270000;
            }
        }
        mo21960e();
    }

    @Override // com.bytedance.common.wschannel.p913c.AbstractC13658a
    /* renamed from: a */
    public final void mo21952a(AbstractC13669c cVar, Handler handler) {
        this.f33189b = cVar;
        this.f33191d = handler;
    }
}
