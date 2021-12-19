package com.bytedance.apm.block;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.block.c */
final class C12385c {

    /* renamed from: a */
    boolean f29870a = true;

    /* renamed from: b */
    String f29871b;

    /* renamed from: c */
    boolean f29872c;

    /* renamed from: d */
    boolean f29873d;

    /* renamed from: e */
    boolean f29874e;

    /* renamed from: f */
    boolean f29875f;

    /* renamed from: g */
    long f29876g = -1;

    /* renamed from: h */
    long f29877h = -1;

    /* renamed from: i */
    long f29878i;

    /* renamed from: j */
    boolean f29879j;

    /* renamed from: k */
    boolean f29880k;

    /* renamed from: l */
    volatile boolean f29881l;

    /* renamed from: m */
    boolean f29882m;

    /* renamed from: n */
    long f29883n;

    /* renamed from: o */
    long f29884o;

    /* renamed from: p */
    StackTraceElement[] f29885p;

    /* renamed from: q */
    StackTraceElement[] f29886q;

    /* renamed from: r */
    String f29887r;

    /* renamed from: s */
    String f29888s;

    /* renamed from: t */
    String f29889t;

    /* renamed from: u */
    JSONObject f29890u;

    /* renamed from: v */
    JSONObject f29891v;

    /* renamed from: w */
    JSONObject f29892w;

    /* renamed from: x */
    JSONObject f29893x;

    static {
        Covode.recordClassIndex(14191);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20167b() {
        this.f29870a = true;
        this.f29872c = false;
        this.f29873d = false;
        this.f29874e = false;
        this.f29875f = false;
        this.f29878i = 0;
        this.f29879j = false;
        this.f29881l = false;
        this.f29880k = false;
        this.f29882m = false;
        this.f29883n = 0;
        this.f29884o = 0;
        this.f29885p = null;
        this.f29886q = null;
        this.f29887r = null;
        this.f29888s = null;
        this.f29889t = null;
        this.f29890u = null;
        this.f29891v = null;
        this.f29892w = null;
        this.f29893x = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C12385c mo20165a() {
        C12385c cVar = new C12385c(this.f29876g, this.f29871b);
        cVar.f29877h = this.f29877h;
        cVar.f29870a = this.f29870a;
        cVar.f29872c = this.f29872c;
        cVar.f29873d = this.f29873d;
        cVar.f29874e = this.f29874e;
        cVar.f29875f = this.f29875f;
        cVar.f29878i = this.f29878i;
        cVar.f29879j = this.f29879j;
        cVar.f29880k = this.f29880k;
        cVar.f29883n = this.f29883n;
        cVar.f29884o = this.f29884o;
        cVar.f29885p = this.f29885p;
        cVar.f29886q = this.f29886q;
        cVar.f29887r = this.f29887r;
        cVar.f29888s = this.f29888s;
        cVar.f29889t = this.f29889t;
        cVar.f29890u = this.f29890u;
        cVar.f29891v = this.f29891v;
        cVar.f29892w = this.f29892w;
        cVar.f29893x = this.f29893x;
        cVar.f29882m = this.f29882m;
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20166a(long j, String str) {
        this.f29876g = j;
        this.f29871b = str;
        this.f29877h = -1;
        this.f29870a = false;
    }

    C12385c(long j, String str) {
        this.f29876g = j;
        this.f29871b = str;
    }
}
