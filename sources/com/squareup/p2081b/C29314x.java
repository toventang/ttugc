package com.squareup.p2081b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.squareup.p2081b.C29299t;
import com.squareup.p2081b.C29312w;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.b.x */
public final class C29314x {

    /* renamed from: c */
    private static final AtomicInteger f69592c = new AtomicInteger();

    /* renamed from: a */
    final C29312w.C29313a f69593a;

    /* renamed from: b */
    boolean f69594b;

    /* renamed from: d */
    private final C29299t f69595d;

    /* renamed from: e */
    private boolean f69596e;

    /* renamed from: f */
    private boolean f69597f;

    /* renamed from: g */
    private int f69598g;

    /* renamed from: h */
    private int f69599h;

    /* renamed from: i */
    private int f69600i;

    /* renamed from: j */
    private int f69601j;

    /* renamed from: k */
    private Drawable f69602k;

    /* renamed from: l */
    private Drawable f69603l;

    /* renamed from: m */
    private Object f69604m;

    static {
        Covode.recordClassIndex(35663);
    }

    C29314x() {
        this.f69597f = true;
        this.f69593a = new C29312w.C29313a(null, null);
    }

    /* renamed from: a */
    private Drawable m58712a() {
        if (this.f69598g != 0) {
            return this.f69595d.f69517d.getResources().getDrawable(this.f69598g);
        }
        return this.f69602k;
    }

    /* renamed from: a */
    private C29312w m58713a(long j) {
        int andIncrement = f69592c.getAndIncrement();
        C29312w c = this.f69593a.mo51133c();
        c.f69559a = andIncrement;
        c.f69560b = j;
        boolean z = this.f69595d.f69526m;
        if (z) {
            C29262ae.m58614a("Main", "created", c.mo51125b(), c.toString());
        }
        C29312w a = this.f69595d.mo51108a(c);
        if (a != c) {
            a.f69559a = andIncrement;
            a.f69560b = j;
            if (z) {
                C29262ae.m58614a("Main", "changed", a.mo51124a(), "into ".concat(String.valueOf(a)));
            }
        }
        return a;
    }

    public C29314x(C29299t tVar, Uri uri) {
        this.f69597f = true;
        if (!tVar.f69527n) {
            this.f69595d = tVar;
            this.f69593a = new C29312w.C29313a(uri, tVar.f69524k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: a */
    public final void mo51134a(ImageView imageView, AbstractC29276e eVar) {
        Bitmap a;
        long nanoTime = System.nanoTime();
        C29262ae.m58610a();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f69593a.mo51131a()) {
            this.f69595d.mo51112a(imageView);
            if (this.f69597f) {
                C29309u.m58701a(imageView, m58712a());
            }
        } else {
            if (this.f69594b) {
                if (!this.f69593a.mo51132b()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f69597f) {
                            C29309u.m58701a(imageView, m58712a());
                        }
                        this.f69595d.mo51110a(imageView, new ViewTreeObserver$OnPreDrawListenerC29279h(this, imageView, eVar));
                        return;
                    }
                    this.f69593a.mo51130a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C29312w a2 = m58713a(nanoTime);
            String a3 = C29262ae.m58608a(a2);
            if (!EnumC29294p.m58683a(this.f69600i) || (a = this.f69595d.mo51107a(a3)) == null) {
                if (this.f69597f) {
                    C29309u.m58701a(imageView, m58712a());
                }
                this.f69595d.mo51111a((AbstractC29253a) new C29289l(this.f69595d, imageView, a2, this.f69600i, this.f69601j, this.f69599h, this.f69603l, a3, this.f69604m, eVar, this.f69596e));
                return;
            }
            this.f69595d.mo51112a(imageView);
            C29309u.m58700a(imageView, this.f69595d.f69517d, a, C29299t.EnumC29305d.MEMORY, this.f69596e, this.f69595d.f69525l);
            if (this.f69595d.f69526m) {
                C29262ae.m58614a("Main", "completed", a2.mo51125b(), "from " + C29299t.EnumC29305d.MEMORY);
            }
            if (eVar != null) {
                eVar.mo27160a();
            }
        }
    }
}
