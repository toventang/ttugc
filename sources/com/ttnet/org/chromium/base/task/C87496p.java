package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.ttnet.org.chromium.base.task.p */
public class C87496p {

    /* renamed from: a */
    public static final C87496p f198453a;

    /* renamed from: b */
    public static final C87496p f198454b;

    /* renamed from: c */
    public static final C87496p f198455c;

    /* renamed from: d */
    public static final C87496p f198456d;

    /* renamed from: e */
    public static final C87496p f198457e;

    /* renamed from: f */
    public static final C87496p f198458f;

    /* renamed from: g */
    public static final C87496p f198459g;

    /* renamed from: h */
    public static final C87496p f198460h;

    /* renamed from: i */
    public static final C87496p f198461i;

    /* renamed from: j */
    public static final C87496p f198462j;

    /* renamed from: k */
    public static final C87496p f198463k;

    /* renamed from: s */
    static final /* synthetic */ boolean f198464s = true;

    /* renamed from: l */
    boolean f198465l;

    /* renamed from: m */
    int f198466m;

    /* renamed from: n */
    boolean f198467n;

    /* renamed from: o */
    boolean f198468o;

    /* renamed from: p */
    byte f198469p;

    /* renamed from: q */
    byte[] f198470q;

    /* renamed from: r */
    boolean f198471r;

    private C87496p() {
        this.f198466m = 1;
    }

    /* renamed from: a */
    private C87496p m151846a() {
        C87496p pVar = new C87496p(this);
        pVar.f198467n = true;
        return pVar;
    }

    public int hashCode() {
        return (((((((((((((!this.f198465l ? 1 : 0) + 1147) * 37) + this.f198466m) * 37) + (!this.f198467n ? 1 : 0)) * 37) + (!this.f198468o ? 1 : 0)) * 37) + this.f198469p) * 37) + Arrays.hashCode(this.f198470q)) * 37) + (!this.f198471r ? 1 : 0);
    }

    static {
        Covode.recordClassIndex(103442);
        C87496p a = new C87496p().m151847a(0);
        f198453a = a;
        f198454b = a.m151846a();
        C87496p a2 = new C87496p().m151847a(1);
        f198455c = a2;
        f198456d = a2.m151846a();
        C87496p a3 = new C87496p().m151847a(2);
        f198457e = a3;
        f198458f = a3.m151846a();
        C87496p pVar = new C87496p();
        f198459g = pVar;
        pVar.f198471r = true;
        C87496p pVar2 = new C87496p(new C87496p());
        pVar2.f198468o = true;
        f198460h = pVar2;
        f198461i = pVar2.m151847a(2);
        f198462j = pVar2.m151847a(1);
        f198463k = pVar2.m151847a(0);
    }

    private C87496p(C87496p pVar) {
        this.f198465l = pVar.f198465l;
        this.f198466m = pVar.f198466m;
        this.f198467n = pVar.f198467n;
        this.f198468o = pVar.f198468o;
        this.f198469p = pVar.f198469p;
        this.f198470q = pVar.f198470q;
    }

    /* renamed from: a */
    private C87496p m151847a(int i) {
        C87496p pVar = new C87496p(this);
        pVar.f198465l = true;
        pVar.f198466m = i;
        return pVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C87496p) {
            C87496p pVar = (C87496p) obj;
            if (this.f198465l == pVar.f198465l && this.f198466m == pVar.f198466m && this.f198469p == pVar.f198469p && Arrays.equals(this.f198470q, pVar.f198470q)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
