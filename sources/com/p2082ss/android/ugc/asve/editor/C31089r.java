package com.p2082ss.android.ugc.asve.editor;

import android.os.HandlerThread;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.r */
public final class C31089r {

    /* renamed from: u */
    public static final C31090a f74486u = new C31090a((byte) 0);

    /* renamed from: a */
    HandlerThread f74487a;

    /* renamed from: b */
    public C85581w f74488b;

    /* renamed from: c */
    public final AtomicBoolean f74489c = new AtomicBoolean(false);

    /* renamed from: d */
    public VEListener.AbstractC85253v f74490d;

    /* renamed from: e */
    final VEListener.AbstractC85253v f74491e = new C31091b(this);

    /* renamed from: f */
    volatile VEListener.AbstractC85231aj f74492f;

    /* renamed from: g */
    volatile VEListener.AbstractC85247p f74493g;

    /* renamed from: h */
    volatile AbstractC85541q f74494h;

    /* renamed from: i */
    volatile AbstractC85541q f74495i;

    /* renamed from: j */
    volatile VEListener.AbstractC85222aa f74496j;

    /* renamed from: k */
    boolean f74497k;

    /* renamed from: l */
    int f74498l = -1;

    /* renamed from: m */
    boolean f74499m;

    /* renamed from: n */
    boolean f74500n = true;

    /* renamed from: o */
    int f74501o = -1;

    /* renamed from: p */
    int f74502p;

    /* renamed from: q */
    boolean f74503q = true;

    /* renamed from: r */
    boolean f74504r = true;

    /* renamed from: s */
    final String f74505s;

    /* renamed from: t */
    final SurfaceView f74506t;

    static {
        Covode.recordClassIndex(37728);
    }

    /* renamed from: com.ss.android.ugc.asve.editor.r$a */
    public static final class C31090a {
        static {
            Covode.recordClassIndex(37729);
        }

        private C31090a() {
        }

        public /* synthetic */ C31090a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final C85581w mo56514a() {
        C85581w wVar = this.f74488b;
        if (wVar == null) {
            C89219l.m154710a("veEditor");
        }
        return wVar;
    }

    /* renamed from: com.ss.android.ugc.asve.editor.r$b */
    static final class C31091b implements VEListener.AbstractC85253v {

        /* renamed from: a */
        final /* synthetic */ C31089r f74507a;

        static {
            Covode.recordClassIndex(37730);
        }

        C31091b(C31089r rVar) {
            this.f74507a = rVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85253v
        /* renamed from: a */
        public final void mo56396a() {
            VEListener.AbstractC85253v vVar;
            if (this.f74507a.f74489c.compareAndSet(false, true) && (vVar = this.f74507a.f74490d) != null) {
                vVar.mo56396a();
            }
        }
    }

    public C31089r(String str, SurfaceView surfaceView) {
        C89219l.m154721d(str, "");
        this.f74505s = str;
        this.f74506t = surfaceView;
    }
}
