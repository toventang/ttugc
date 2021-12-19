package com.p2082ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ttvecamera.p2194c.C30783a;
import com.p2082ss.android.ttvecamera.p2194c.C30788b;
import com.p2082ss.android.ttvecamera.p2200i.C30852a;
import com.p2082ss.android.ttvecamera.p2201j.C30862c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.g */
public abstract class AbstractC30825g {

    /* renamed from: A */
    AtomicBoolean f73841A = new AtomicBoolean(false);

    /* renamed from: B */
    public Map<String, Bundle> f73842B = new HashMap();

    /* renamed from: C */
    protected Map<Integer, Bundle> f73843C = new HashMap();

    /* renamed from: D */
    protected PrivacyCert f73844D = null;

    /* renamed from: E */
    protected C30783a f73845E;

    /* renamed from: n */
    public boolean f73846n;

    /* renamed from: o */
    public C30933l f73847o;

    /* renamed from: p */
    protected boolean f73848p;

    /* renamed from: q */
    public AbstractC30826a f73849q;

    /* renamed from: r */
    public Handler f73850r;

    /* renamed from: s */
    public Context f73851s;

    /* renamed from: t */
    public C30862c f73852t;

    /* renamed from: u */
    public int f73853u;

    /* renamed from: v */
    protected int f73854v;

    /* renamed from: w */
    protected int f73855w = -1;

    /* renamed from: x */
    protected float f73856x;

    /* renamed from: y */
    public int f73857y;

    /* renamed from: z */
    protected AbstractC30828c f73858z;

    /* renamed from: com.ss.android.ttvecamera.g$a */
    public interface AbstractC30826a {
        static {
            Covode.recordClassIndex(37451);
        }

        /* renamed from: a */
        void mo55845a(int i, int i2);

        /* renamed from: a */
        void mo55846a(int i, int i2, String str);

        /* renamed from: a */
        void mo55847a(int i, String str);

        /* renamed from: a */
        void mo55848a(AbstractC30825g gVar);

        /* renamed from: a */
        void mo55849a(String str);

        /* renamed from: b */
        void mo55850b(int i, String str);

        /* renamed from: b */
        void mo55851b(String str);

        /* renamed from: c */
        void mo55852c(int i, String str);

        /* renamed from: d */
        void mo55853d(int i, String str);
    }

    /* renamed from: com.ss.android.ttvecamera.g$b */
    public interface AbstractC30827b {
        static {
            Covode.recordClassIndex(37452);
        }
    }

    /* renamed from: com.ss.android.ttvecamera.g$c */
    public interface AbstractC30828c {
        static {
            Covode.recordClassIndex(37453);
        }

        /* renamed from: a */
        TEFrameSizei mo55854a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* renamed from: com.ss.android.ttvecamera.g$d */
    public interface AbstractC30829d {
        static {
            Covode.recordClassIndex(37454);
        }
    }

    static {
        Covode.recordClassIndex(37450);
    }

    /* renamed from: H */
    public static boolean m63443H() {
        return true;
    }

    /* renamed from: B */
    public int mo55786B() {
        return -1;
    }

    /* renamed from: a */
    public abstract TEFrameSizei mo55660a(float f, TEFrameSizei tEFrameSizei);

    /* renamed from: a */
    public abstract void mo55661a();

    /* renamed from: a */
    public void mo55791a(float f) {
    }

    /* renamed from: a */
    public abstract void mo55662a(float f, C30933l.AbstractC30955p pVar);

    /* renamed from: a */
    public void mo55664a(int i, int i2) {
    }

    /* renamed from: a */
    public abstract void mo55665a(int i, int i2, C30933l.AbstractC30951l lVar);

    /* renamed from: a */
    public void mo55792a(long j) {
    }

    /* renamed from: a */
    public void mo55666a(Bundle bundle) {
    }

    /* renamed from: a */
    public abstract void mo55668a(C30933l.AbstractC30951l lVar);

    /* renamed from: a */
    public abstract void mo55669a(C30933l.AbstractC30953n nVar);

    /* renamed from: a */
    public abstract void mo55670a(C30933l.AbstractC30955p pVar);

    /* renamed from: a */
    public abstract void mo55671a(C30933l.AbstractC30955p pVar, boolean z);

    /* renamed from: a */
    public abstract void mo55672a(C30966n nVar);

    /* renamed from: a */
    public abstract void mo55673a(String str);

    /* renamed from: a */
    public abstract void mo55674a(boolean z);

    /* renamed from: b */
    public abstract void mo55675b();

    /* renamed from: b */
    public void mo55794b(float f) {
    }

    /* renamed from: b */
    public abstract void mo55676b(float f, C30933l.AbstractC30955p pVar);

    /* renamed from: b */
    public abstract void mo55677b(int i);

    /* renamed from: b */
    public void mo55679b(boolean z) {
    }

    /* renamed from: c */
    public void mo55680c() {
    }

    /* renamed from: c */
    public abstract void mo55681c(int i);

    /* renamed from: c */
    public abstract void mo55682c(boolean z);

    /* renamed from: d */
    public void mo55683d() {
    }

    /* renamed from: d */
    public abstract void mo55684d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo55796d(boolean z) {
    }

    /* renamed from: e */
    public abstract int mo55685e();

    /* renamed from: e */
    public void mo55797e(int i) {
    }

    /* renamed from: f */
    public int[] mo55686f() {
        return null;
    }

    /* renamed from: g */
    public void mo55687g() {
    }

    /* renamed from: h */
    public int[] mo55688h() {
        return null;
    }

    /* renamed from: i */
    public abstract int mo55689i();

    /* renamed from: j */
    public int mo55690j() {
        return -1;
    }

    /* renamed from: l */
    public abstract float[] mo55692l();

    /* renamed from: m */
    public abstract void mo55693m();

    /* renamed from: n */
    public abstract void mo55694n();

    /* renamed from: p */
    public abstract boolean mo55696p();

    /* renamed from: q */
    public boolean mo55697q() {
        return false;
    }

    /* renamed from: r */
    public abstract boolean mo55698r();

    /* renamed from: s */
    public abstract boolean mo55699s();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo55701u() {
    }

    /* renamed from: v */
    public int mo55799v() {
        return -1;
    }

    /* renamed from: w */
    public int mo55800w() {
        return -1;
    }

    /* renamed from: y */
    public void mo55802y() {
    }

    /* renamed from: z */
    public float mo55803z() {
        return -1.0f;
    }

    /* renamed from: a */
    public void mo55793a(C30852a aVar, C30933l.AbstractC30942c cVar) {
        new UnsupportedOperationException("unsupport capture burst, camera type:" + mo55685e());
    }

    /* renamed from: a */
    public void mo55667a(PrivacyCert privacyCert) {
        C30969o.m63686a("TECameraBase", "force close camera");
    }

    /* renamed from: A */
    public int[] mo55785A() {
        return new int[]{-1, -1};
    }

    /* renamed from: D */
    public float[] mo55788D() {
        return new float[]{-1.0f, -1.0f};
    }

    /* renamed from: G */
    public final int mo55844G() {
        if (this.f73841A.getAndSet(false)) {
            mo55689i();
        }
        return this.f73855w;
    }

    /* renamed from: C */
    public long[] mo55787C() {
        return new long[]{-1, -1};
    }

    /* renamed from: k */
    public int[] mo55691k() {
        TEFrameSizei tEFrameSizei = this.f73847o.f74193q;
        return new int[]{tEFrameSizei.f73616a, tEFrameSizei.f73617b};
    }

    /* renamed from: o */
    public boolean mo55695o() {
        if (this.f73847o.f74141H == null || !this.f73847o.f74141H.mo56039a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Bundle mo55700t() {
        Bundle bundle;
        if (this.f73842B.containsKey(this.f73847o.f74139F)) {
            bundle = this.f73842B.get(this.f73847o.f74139F);
        } else {
            bundle = new Bundle();
            this.f73842B.put(this.f73847o.f74139F, bundle);
        }
        bundle.putInt("facing", this.f73847o.f74181e);
        return bundle;
    }

    /* renamed from: b */
    public void mo55678b(PrivacyCert privacyCert) {
        C30969o.m63687b("TECameraBase", "close...");
    }

    /* renamed from: a */
    public void mo55663a(int i) {
        C30969o.m63686a("TECameraBase", "scene mode: ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public int mo55659a(C30933l lVar, PrivacyCert privacyCert) {
        this.f73857y = lVar.f74198v;
        C30969o.m63686a("TECameraBase", "set start preview retry count: " + this.f73857y);
        return 0;
    }

    /* renamed from: a */
    public static Exception m63444a(Exception exc, int i) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception message";
        }
        return new Exception(message + ", errorCode=" + i);
    }

    public AbstractC30825g(Context context, AbstractC30826a aVar, Handler handler, AbstractC30828c cVar) {
        C30783a aVar2 = new C30783a();
        this.f73845E = aVar2;
        this.f73851s = context;
        this.f73849q = aVar;
        this.f73850r = handler;
        this.f73858z = cVar;
        C30788b bVar = new C30788b();
        if (!aVar2.f73717c) {
            if (aVar2.f73715a == null) {
                aVar2.f73715a = new ArrayList();
            }
            if (aVar2.f73716b == null) {
                aVar2.f73716b = bVar;
            }
            aVar2.f73717c = true;
        }
    }
}
