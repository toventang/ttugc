package com.bytedance.android.live.publicscreen.impl.p399e;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.impl.C5893a;
import com.bytedance.android.live.publicscreen.impl.model.C6015e;
import com.bytedance.android.live.publicscreen.impl.model.C6018g;
import com.bytedance.android.live.publicscreen.impl.model.C6020i;
import com.bytedance.android.live.publicscreen.impl.model.C6031q;
import com.bytedance.android.live.publicscreen.impl.model.chat.C5993b;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.g */
public abstract class AbstractC5950g extends C5945c {

    /* renamed from: d */
    private static final C5951a f14884d = new C5951a((byte) 0);

    /* renamed from: b */
    private long f14885b;

    /* renamed from: c */
    private final C5893a f14886c;

    /* renamed from: e */
    final Handler f14887e = new Handler(new C5952b(this));

    /* renamed from: f */
    public int f14888f;

    /* renamed from: g */
    public int f14889g;

    /* renamed from: h */
    public int f14890h;

    /* renamed from: i */
    public int f14891i;

    /* renamed from: j */
    public int f14892j;

    /* renamed from: k */
    public int f14893k;

    /* renamed from: l */
    public int f14894l;

    /* renamed from: m */
    public int f14895m;

    /* renamed from: n */
    public int f14896n;

    /* renamed from: o */
    public int f14897o;

    /* renamed from: p */
    public int f14898p;

    /* renamed from: q */
    public int f14899q;

    /* renamed from: r */
    public int f14900r;

    /* renamed from: s */
    public int f14901s;

    /* renamed from: t */
    public int f14902t;

    /* renamed from: u */
    final long f14903u = 60000;

    /* renamed from: v */
    public long f14904v;

    static {
        Covode.recordClassIndex(6558);
    }

    /* renamed from: a */
    public abstract void mo11789a();

    /* renamed from: com.bytedance.android.live.publicscreen.impl.e.g$a */
    static final class C5951a {
        static {
            Covode.recordClassIndex(6559);
        }

        private C5951a() {
        }

        public /* synthetic */ C5951a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b
    /* renamed from: b */
    public void mo11795b() {
        super.mo11795b();
        this.f14887e.sendEmptyMessageDelayed(1, this.f14903u);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b
    /* renamed from: c */
    public final void mo11798c() {
        super.mo11798c();
        mo11825f();
        this.f14885b = 0;
        this.f14887e.removeCallbacksAndMessages(null);
    }

    public AbstractC5950g() {
        AbstractC2953a a = C6193a.m13435a(AbstractC5880e.class);
        this.f14886c = (C5893a) (!(a instanceof C5893a) ? null : a);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b
    /* renamed from: d */
    public void mo11801d() {
        super.mo11801d();
        if (mo11808e().f14757n.mo11671c()) {
            if (this.f14885b == 0) {
                this.f14885b = SystemClock.uptimeMillis();
            }
        } else if (this.f14885b > 0) {
            this.f14904v += SystemClock.uptimeMillis() - this.f14885b;
            this.f14885b = 0;
        }
    }

    /* renamed from: g */
    public final String mo11826g() {
        C9542az userAttr;
        if (mo11808e().f14752i) {
            return "anchor";
        }
        User a = mo11808e().mo11740a();
        if (a == null || (userAttr = a.getUserAttr()) == null || !userAttr.f23192b) {
            return "viewer";
        }
        return "admin";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo11825f() {
        if (this.f14885b > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f14904v += uptimeMillis - this.f14885b;
            this.f14885b = uptimeMillis;
        }
        mo11789a();
        C5893a aVar = this.f14886c;
        if (aVar != null) {
            aVar.addHotDuration(mo11808e().f14744a, this.f14904v);
        }
        this.f14904v = 0;
        this.f14888f = 0;
        this.f14898p = 0;
        this.f14899q = 0;
        this.f14900r = 0;
        this.f14889g = 0;
        this.f14890h = 0;
        this.f14891i = 0;
        this.f14892j = 0;
        this.f14893k = 0;
        this.f14894l = 0;
        this.f14895m = 0;
        this.f14896n = 0;
        this.f14897o = 0;
        this.f14901s = 0;
        this.f14902t = 0;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.e.g$b */
    static final class C5952b implements Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ AbstractC5950g f14905a;

        static {
            Covode.recordClassIndex(6560);
        }

        C5952b(AbstractC5950g gVar) {
            this.f14905a = gVar;
        }

        public final boolean handleMessage(Message message) {
            C89219l.m154721d(message, "");
            AbstractC5950g gVar = this.f14905a;
            if (message.what != 1) {
                return false;
            }
            gVar.mo11825f();
            gVar.f14887e.sendEmptyMessageDelayed(1, gVar.f14903u);
            return true;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b
    /* renamed from: f */
    public void mo11804f(AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        super.mo11804f(hVar);
        if (hVar instanceof C6018g) {
            this.f14893k++;
        } else if (hVar instanceof C6015e) {
            this.f14894l++;
        } else {
            if (hVar instanceof C6031q) {
                if (((C6031q) hVar).mo11904s()) {
                    this.f14895m++;
                    return;
                } else if (((C6031q) hVar).mo11905t()) {
                    this.f14896n++;
                    return;
                }
            }
            if (hVar instanceof C5993b) {
                this.f14897o++;
            } else if (hVar instanceof C6020i) {
                MESSAGE message = ((AbstractC5877k) hVar).f14737d;
                C89219l.m154716b(message, "");
                if (((C9627ay) message).f23446h == 1) {
                    this.f14902t++;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (com.facebook.imagepipeline.p1880e.C24428k.m46551a().mo40247e().mo40231b(android.net.Uri.parse(r3)) == false) goto L_0x003d;
     */
    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11790a(com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h r5, long r6) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5950g.mo11790a(com.bytedance.android.live.publicscreen.a.d.h, long):void");
    }
}
