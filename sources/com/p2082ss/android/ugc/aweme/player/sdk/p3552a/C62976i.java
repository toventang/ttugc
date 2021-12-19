package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63031a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63035e;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63041i;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63052m;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63053n;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.player.sdk.util.C63085c;
import com.p2082ss.android.ugc.aweme.player.sdk.util.C63086d;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.AbstractC84205i;
import com.p2082ss.android.ugc.playerkit.model.C84197a;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84203g;
import com.p2082ss.android.ugc.playerkit.model.C84206j;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import com.p2082ss.android.ugc.playerkit.model.C84222t;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.model.NativeBitrateSelectConfig;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.i */
public class C62976i implements AbstractC63051l {

    /* renamed from: N */
    private static int f142946N;

    /* renamed from: A */
    public boolean f142947A;

    /* renamed from: B */
    public boolean f142948B;

    /* renamed from: C */
    public final C63003a f142949C;

    /* renamed from: D */
    public AbstractC63032b f142950D;

    /* renamed from: E */
    private boolean f142951E;

    /* renamed from: F */
    private boolean f142952F;

    /* renamed from: G */
    private AbstractC84177b f142953G;

    /* renamed from: H */
    private AbstractC63050k f142954H;

    /* renamed from: I */
    private AbstractC63040h f142955I;

    /* renamed from: J */
    private String f142956J;

    /* renamed from: K */
    private SurfaceHolder f142957K;

    /* renamed from: L */
    private boolean f142958L;

    /* renamed from: M */
    private boolean f142959M = false;

    /* renamed from: a */
    public final C63008k f142960a = new C63008k();

    /* renamed from: b */
    public AbstractC63042j f142961b;

    /* renamed from: c */
    public AtomicReference<AbstractC63042j> f142962c;

    /* renamed from: d */
    public C84209m.EnumC84214e f142963d;

    /* renamed from: e */
    public C84217p f142964e;

    /* renamed from: f */
    public volatile Surface f142965f;

    /* renamed from: g */
    public String f142966g = "";

    /* renamed from: h */
    public String f142967h;

    /* renamed from: i */
    public boolean f142968i;

    /* renamed from: j */
    public boolean f142969j;

    /* renamed from: k */
    public boolean f142970k;

    /* renamed from: l */
    public boolean f142971l;

    /* renamed from: m */
    public boolean f142972m;

    /* renamed from: n */
    public int f142973n;

    /* renamed from: o */
    public int f142974o;

    /* renamed from: p */
    public int f142975p;

    /* renamed from: q */
    public long f142976q;

    /* renamed from: r */
    public long f142977r = -1;

    /* renamed from: s */
    public AbstractC63042j.AbstractC63045c f142978s;

    /* renamed from: t */
    public AbstractC63035e f142979t;

    /* renamed from: u */
    public C63085c f142980u = new C63085c(Looper.getMainLooper());

    /* renamed from: v */
    public OnUIPlayListener f142981v;

    /* renamed from: w */
    public OnPreRenderListener f142982w;

    /* renamed from: x */
    public AbstractC63041i f142983x;

    /* renamed from: y */
    AbstractC84205i f142984y;

    /* renamed from: z */
    public long f142985z;

    static {
        Covode.recordClassIndex(73813);
    }

    /* renamed from: f */
    public static boolean m113494f(int i) {
        return i == 0 || i == 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100978a(int i, int i2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100994a(C84217p pVar, AbstractC63032b bVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101001b(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101003b(AbstractC63050k kVar) {
    }

    /* renamed from: b */
    public void mo101041b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: c */
    public final void mo101008c(AbstractC63050k kVar) {
    }

    /* renamed from: e */
    public void mo101042e(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: q */
    public final void mo101023q() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: r */
    public final void mo101024r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.i$a */
    public static class C63003a {

        /* renamed from: a */
        public int f143088a;

        /* renamed from: b */
        public int f143089b;

        static {
            Covode.recordClassIndex(73840);
        }

        private C63003a() {
        }

        /* renamed from: a */
        public final void mo101088a() {
            this.f143088a = 0;
            this.f143089b = 0;
        }

        /* synthetic */ C63003a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final int mo100975a() {
        return this.f142975p;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: o */
    public final int mo101021o() {
        return this.f142973n;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: t */
    public final C84209m.EnumC84214e mo101026t() {
        return this.f142963d;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100993a(C84217p pVar) {
        if (pVar != null) {
            this.f142984y = pVar.f188198l;
            this.f142967h = pVar.f188210x;
            this.f142974o = 0;
            mo101039a(pVar, pVar.f188196j, pVar.f188197k);
        }
    }

    /* renamed from: a */
    public final void mo101039a(C84217p pVar, String str, boolean z) {
        m113490a(pVar, str, z, 0, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r1.f187982a.mo101163b() == null) goto L_0x05ee;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c8 A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101040a(com.p2082ss.android.ugc.playerkit.model.C84217p r20, java.lang.String r21, boolean r22, long r23, boolean r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 1534
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.mo101040a(com.ss.android.ugc.playerkit.model.p, java.lang.String, boolean, long, boolean, boolean):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100980a(Surface surface) {
        boolean z = false;
        if (!this.f142958L || surface == null) {
            if (this.f142965f != surface) {
                z = true;
            }
            this.f142951E = z;
        } else {
            this.f142951E = false;
            this.f142958L = false;
        }
        this.f142965f = surface;
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, setSurface(), surface = " + this.f142965f + ", mPlayer = " + this.f142961b + " mStatus = " + this.f142975p);
        }
        if (this.f142959M && C84191b.m144792s().booleanValue()) {
            mo101009d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100981a(SurfaceHolder surfaceHolder) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo101107a(surfaceHolder);
        } else {
            this.f142957K = surfaceHolder;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100995a(String str) {
        if (!TextUtils.isEmpty(str) && str.equals(this.f142966g)) {
            mo101014h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100982a(OnUIPlayListener onUIPlayListener) {
        this.f142981v = onUIPlayListener;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100989a(AbstractC63050k kVar) {
        this.f142954H = kVar;
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo101110a(kVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100986a(AbstractC63040h hVar) {
        this.f142955I = hVar;
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo101108a(hVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100991a(AbstractC84177b bVar) {
        this.f142953G = bVar;
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo101112a(bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100985a(AbstractC63035e eVar) {
        this.f142979t = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100987a(AbstractC63041i iVar) {
        this.f142983x = iVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final boolean mo100998a(String str, String str2) {
        String str3;
        String str4 = this.f142966g;
        return str4 != null && str4.equals(str) && (str3 = this.f142956J) != null && str3.equals(str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100992a(C84203g gVar) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo100951a(gVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100996a(boolean z) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo100960d(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100990a(AbstractC63052m mVar) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo100949a(mVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100983a(AbstractC63031a aVar) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo100947a(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100988a(AbstractC63042j.EnumC63047e eVar) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo100948a(eVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100997a(boolean z, Bundle bundle) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo100954a(z, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100984a(AbstractC63032b bVar) {
        NativeBitrateSelectConfig f = C84191b.m144779f();
        if (bVar != null && f != null && f.useCallback) {
            this.f142950D = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: A */
    public final void mo100973A() {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo100943A();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: i */
    public final boolean mo101015i() {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            return jVar.mo101128l();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: j */
    public final long mo101016j() {
        AbstractC63042j jVar;
        if (this.f142952F || (jVar = this.f142961b) == null) {
            return -1;
        }
        return jVar.mo101131q();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: k */
    public final long mo101017k() {
        AbstractC63042j jVar;
        if (this.f142952F || (jVar = this.f142961b) == null) {
            return -1;
        }
        return jVar.mo101132r();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: l */
    public final boolean mo101018l() {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            return jVar.mo101129m();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: n */
    public final String mo101020n() {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            return jVar.mo101133s();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.i$b */
    public static class C63004b implements AbstractC63053n {

        /* renamed from: a */
        private final WeakReference<C62976i> f143090a;

        static {
            Covode.recordClassIndex(73841);
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63053n
        /* renamed from: a */
        public final void mo101089a() {
            C62976i iVar = this.f143090a.get();
            if (iVar != null) {
                final String str = iVar.f142966g;
                final OnUIPlayListener onUIPlayListener = iVar.f142981v;
                iVar.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C63004b.RunnableC630051 */

                    static {
                        Covode.recordClassIndex(73842);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onDecoderBuffering(true);
                            onUIPlayListener.onDecoderBuffering(str, true);
                        }
                    }
                });
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63053n
        /* renamed from: b */
        public final void mo101090b() {
            C62976i iVar = this.f143090a.get();
            if (iVar != null) {
                final String str = iVar.f142966g;
                final OnUIPlayListener onUIPlayListener = iVar.f142981v;
                iVar.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C63004b.RunnableC630062 */

                    static {
                        Covode.recordClassIndex(73843);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onDecoderBuffering(false);
                            onUIPlayListener.onDecoderBuffering(str, false);
                        }
                    }
                });
            }
        }

        private C63004b(C62976i iVar) {
            this.f143090a = new WeakReference<>(iVar);
        }

        /* synthetic */ C63004b(C62976i iVar, byte b) {
            this(iVar);
        }
    }

    /* renamed from: C */
    private void m113486C() {
        this.f142968i = false;
        this.f142970k = false;
        this.f142971l = false;
        this.f142972m = false;
        this.f142973n = 0;
        this.f142951E = false;
        this.f142952F = false;
        this.f142948B = false;
        this.f142959M = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo100999b() {
        if (this.f142961b == null) {
            m113487D();
            AbstractC63042j jVar = this.f142961b;
            if (jVar != null) {
                jVar.mo100944a();
            }
            this.f142958L = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: u */
    public final AbstractC63042j.C63049g mo101027u() {
        AbstractC63042j jVar = this.f142962c.get();
        if (jVar != null) {
            return jVar.mo101137v();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: v */
    public final AbstractC63042j.C63048f mo101028v() {
        AbstractC63042j jVar = this.f142962c.get();
        if (jVar != null) {
            return jVar.mo100964w();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: w */
    public final String mo101029w() {
        AbstractC63042j jVar = this.f142962c.get();
        if (jVar != null) {
            return jVar.mo101134t();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: x */
    public final boolean mo101030x() {
        AbstractC63042j jVar = this.f142962c.get();
        if (jVar == null || !jVar.mo101136u()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: y */
    public final boolean mo101031y() {
        AbstractC63042j jVar = this.f142962c.get();
        if (jVar == null || !jVar.mo101130p()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: z */
    public final boolean mo101032z() {
        AbstractC63042j jVar = this.f142962c.get();
        if (jVar == null || !jVar.mo101138x()) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private void m113487D() {
        AbstractC63041i iVar = this.f142983x;
        if (iVar != null) {
            AbstractC63042j a = iVar.mo101178a(this.f142963d);
            this.f142961b = a;
            this.f142962c.set(a);
        }
        this.f142961b.mo101112a(this.f142953G);
        this.f142961b.mo101110a(this.f142954H);
        this.f142961b.mo101108a(this.f142955I);
        this.f142961b.mo101111a(new C63004b(this, (byte) 0));
        C629793 r1 = new AbstractC63042j.AbstractC63045c() {
            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793 */

            static {
                Covode.recordClassIndex(73816);
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: a */
            public final void mo101054a(boolean z) {
                final String str = C62976i.this.f142966g;
                if (!z) {
                    C62976i.this.f142972m = false;
                    final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                    C62976i.this.f142980u.mo101241a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC6298817 */

                        static {
                            Covode.recordClassIndex(73825);
                        }

                        public final void run() {
                            OnUIPlayListener onUIPlayListener = onUIPlayListener;
                            if (onUIPlayListener != null) {
                                onUIPlayListener.onBuffering(false);
                                onUIPlayListener.onBuffering(str, false);
                            }
                        }
                    });
                } else if (C62976i.this.f142981v == null) {
                } else {
                    if ((C62976i.this.f142961b != null && C62976i.this.f142961b.mo101131q() != 0) || C62976i.this.f142972m) {
                        final OnUIPlayListener onUIPlayListener2 = C62976i.this.f142981v;
                        C62976i.this.f142980u.mo101241a(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC6298716 */

                            static {
                                Covode.recordClassIndex(73824);
                            }

                            public final void run() {
                                OnUIPlayListener onUIPlayListener = onUIPlayListener2;
                                if (onUIPlayListener != null) {
                                    onUIPlayListener.onBuffering(true);
                                    onUIPlayListener2.onBuffering(str, true);
                                }
                            }
                        });
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: g */
            public final void mo101061g() {
                final String str = C62976i.this.f142966g;
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC629955 */

                    static {
                        Covode.recordClassIndex(73832);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onCompleteLoaded(str, C62976i.this.f142969j);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: h */
            public final void mo101062h() {
                final String str = C62976i.this.f142966g;
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC629977 */

                    static {
                        Covode.recordClassIndex(73834);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onPlaying(str);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: i */
            public final void mo101063i() {
                final String str = C62976i.this.f142966g;
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC629988 */

                    static {
                        Covode.recordClassIndex(73835);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onPlayPause(str);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: j */
            public final void mo101064j() {
                final String str = C62976i.this.f142966g;
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                final JSONObject B = C62976i.this.mo101038B();
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC629999 */

                    static {
                        Covode.recordClassIndex(73836);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener;
                        if (!C84206j.m144803a(C62976i.this.f142964e) && (onUIPlayListener = onUIPlayListener) != null) {
                            onUIPlayListener.onPlayStop(str);
                            onUIPlayListener.onPlayStop(str, C62976i.this.mo101032z());
                            onUIPlayListener.onPlayStop(str, B);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: d */
            public final void mo101058d() {
                if (C62976i.this.f142981v != null) {
                    final String str = C62976i.this.f142966g;
                    final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                    if (C62976i.this.f142973n == 0) {
                        C62976i.this.f142980u.mo101241a(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC6299220 */

                            static {
                                Covode.recordClassIndex(73829);
                            }

                            public final void run() {
                                OnUIPlayListener onUIPlayListener = onUIPlayListener;
                                if (onUIPlayListener != null) {
                                    onUIPlayListener.onPlayCompletedFirstTime(str);
                                }
                            }
                        });
                    }
                    C62976i.this.f142973n++;
                    C62976i.this.f142980u.mo101241a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC629912 */

                        static {
                            Covode.recordClassIndex(73828);
                        }

                        public final void run() {
                            OnUIPlayListener onUIPlayListener = onUIPlayListener;
                            if (onUIPlayListener != null) {
                                onUIPlayListener.onPlayCompleted(str);
                                onUIPlayListener.onPlayCompleted(str, C62976i.this.f142973n);
                            }
                        }
                    });
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: f */
            public final void mo101060f() {
                if (C62960a.f142907a) {
                    C62960a.m113384a("SimplifyPlayerImpl, onRenderFromResume mUIPlayListener:" + C62976i.this.f142981v);
                }
                if (C62976i.this.f142981v != null) {
                    final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                    C62976i.this.f142980u.mo101241a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC6298514 */

                        static {
                            Covode.recordClassIndex(73822);
                        }

                        public final void run() {
                            OnUIPlayListener onUIPlayListener = onUIPlayListener;
                            if (onUIPlayListener != null) {
                                onUIPlayListener.onRenderFirstFrameFromResume(C62976i.this.f142966g);
                            }
                        }
                    });
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: b */
            public final void mo101055b() {
                C62960a.m113384a("SimplifyPlayerImpl, onReadyForDisplay, sourceId:" + C62976i.this.f142966g);
                if (C62976i.this.f142947A) {
                    C62976i.this.f142948B = true;
                }
                final String str = C62976i.this.f142966g;
                final OnPreRenderListener onPreRenderListener = C62976i.this.f142982w;
                C62976i.this.f142982w = null;
                if (C62976i.this.f142964e != null) {
                    C62976i.this.f142964e.f188155a = null;
                }
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC6298211 */

                    static {
                        Covode.recordClassIndex(73819);
                    }

                    public final void run() {
                        OnPreRenderListener onPreRenderListener = onPreRenderListener;
                        if (onPreRenderListener != null) {
                            onPreRenderListener.onPreRenderReady(str);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: e */
            public final void mo101059e() {
                if (C62976i.this.f142961b != null && C62976i.this.f142964e.f188179ar) {
                    C62976i.this.f142964e.f188181at = C84222t.m144817a(C62976i.this.f142964e.mo129033c());
                    C62976i.this.f142961b.mo100946a(C62976i.this.f142964e.f188180as, C62976i.this.f142964e.f188181at);
                    C62976i.this.f142961b.mo100960d(true);
                }
                final String str = C62976i.this.f142966g;
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC629801 */

                    static {
                        Covode.recordClassIndex(73817);
                    }

                    public final void run() {
                        if (onUIPlayListener != null && !C84206j.m144803a(C62976i.this.f142964e)) {
                            onUIPlayListener.onPlayPrepare(str);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: a */
            public final void mo101047a() {
                if (C62960a.f142907a) {
                    C62960a.m113384a("SimplifyPlayerImpl, onPrepared(), surface = " + C62976i.this.f142965f + ", mPlayer = " + C62976i.this.f142961b + " mStatus = " + C62976i.this.f142975p + ", mPrepareOnly:" + C62976i.this.f142947A);
                }
                C62976i.this.f142970k = false;
                if (C62976i.this.f142975p == 1) {
                    if (!(C62976i.this.f142983x == null || C62976i.this.f142961b == null || !C62976i.this.f142964e.f188179ar)) {
                        C62976i.this.f142964e.f188181at = C84222t.m144817a(C62976i.this.f142964e.mo129033c());
                        C62976i.this.f142961b.mo100946a(C62976i.this.f142964e.f188180as, C62976i.this.f142964e.f188181at);
                        C62976i.this.f142961b.mo100960d(true);
                    }
                    C62976i.this.f142975p = 2;
                    C62976i.this.f142972m = true;
                    if (C62976i.this.f142971l) {
                        C62976i.this.f142977r = System.currentTimeMillis();
                        if (!C62976i.this.f142947A) {
                            C62976i.this.mo101009d();
                        }
                    }
                } else if (C62976i.this.f142975p == 5) {
                    C62976i.this.mo101012f();
                }
            }

            /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo101057c() {
                /*
                // Method dump skipped, instructions count: 382
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.mo101057c():void");
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: b */
            public final void mo101056b(final boolean z) {
                final String str = C62976i.this.f142966g;
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC6298312 */

                    static {
                        Covode.recordClassIndex(73820);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onSeekEnd(str, z);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: a */
            public final void mo101051a(final long j) {
                final String str = C62976i.this.f142966g;
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC629933 */

                    static {
                        Covode.recordClassIndex(73830);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onBufferedTimeMs(str, j);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: a */
            public final void mo101048a(final int i, final float f) {
                final String str = C62976i.this.f142966g;
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC6298110 */

                    static {
                        Covode.recordClassIndex(73818);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onSeekStart(str, i, f);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: a */
            public final void mo101050a(final int i, final JSONObject jSONObject) {
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                final String str = C62976i.this.f142966g;
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC6298413 */

                    static {
                        Covode.recordClassIndex(73821);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onPlayerInternalEvent(str, i, jSONObject);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: a */
            public final void mo101052a(final long j, final int i) {
                final String str = C62976i.this.f142966g;
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC629944 */

                    static {
                        Covode.recordClassIndex(73831);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onBufferedPercent(str, j, i);
                        }
                    }
                });
            }

            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: a */
            public final void mo101053a(final EnumC63056b bVar, final int i) {
                final String str = C62976i.this.f142966g;
                final OnUIPlayListener onUIPlayListener = C62976i.this.f142981v;
                C62976i.this.f142980u.mo101241a(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.RunnableC629966 */

                    static {
                        Covode.recordClassIndex(73833);
                    }

                    public final void run() {
                        OnUIPlayListener onUIPlayListener = onUIPlayListener;
                        if (onUIPlayListener != null) {
                            onUIPlayListener.onVideoBitrateChanged(str, bVar, i);
                        }
                    }
                });
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
                if (r1.f142961b.mo101127k() != false) goto L_0x0033;
             */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x00f4  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0113  */
            /* JADX WARNING: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j.AbstractC63045c
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo101049a(int r18, int r19, java.lang.Object r20) {
                /*
                // Method dump skipped, instructions count: 277
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629793.mo101049a(int, int, java.lang.Object):void");
            }
        };
        this.f142978s = r1;
        this.f142961b.mo101109a(r1);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: p */
    public final void mo101022p() {
        this.f142975p = 0;
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, clearStatus, mStatus:" + this.f142975p + ", prepareOnly:" + this.f142947A);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: s */
    public final void mo101025s() {
        final float f;
        final long j = mo101016j();
        final long k = mo101017k();
        if (k == 0) {
            f = 0.0f;
        } else {
            f = (((float) j) * 100.0f) / ((float) k);
        }
        final String str = this.f142966g;
        final OnUIPlayListener onUIPlayListener = this.f142981v;
        this.f142980u.mo101241a(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.RunnableC630026 */

            static {
                Covode.recordClassIndex(73839);
            }

            public final void run() {
                OnUIPlayListener onUIPlayListener = onUIPlayListener;
                if (onUIPlayListener != null) {
                    onUIPlayListener.onPlayProgressChange(f);
                    onUIPlayListener.onPlayProgressChange(str, j, k);
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: e */
    public final void mo101011e() {
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, stop(), surface = " + this.f142965f + ", mPlayer = " + this.f142961b + " mStatus = " + this.f142975p);
        }
        this.f142959M = false;
        if (this.f142975p != 6 && this.f142961b != null) {
            mo101012f();
            this.f142961b.mo101122e();
            this.f142975p = 6;
            this.f142982w = null;
            C84217p pVar = this.f142964e;
            if (pVar != null) {
                pVar.f188155a = null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: f */
    public final void mo101012f() {
        int i;
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, pause(), surface = " + this.f142965f + ", mPlayer = " + this.f142961b + " mStatus = " + this.f142975p);
        }
        this.f142959M = false;
        if (this.f142961b != null && (i = this.f142975p) <= 5 && i != 0) {
            if (!(this.f142963d == C84209m.EnumC84214e.Ijk || this.f142963d == C84209m.EnumC84214e.IjkHardware) || this.f142961b.mo101129m()) {
                this.f142961b.mo101121d();
                final OnUIPlayListener onUIPlayListener = this.f142981v;
                if (onUIPlayListener != null && this.f142975p <= 5) {
                    final String str = this.f142966g;
                    this.f142980u.mo101241a(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.RunnableC630004 */

                        static {
                            Covode.recordClassIndex(73837);
                        }

                        public final void run() {
                            OnUIPlayListener onUIPlayListener = onUIPlayListener;
                            if (onUIPlayListener != null) {
                                onUIPlayListener.onPausePlay(str);
                            }
                        }
                    });
                }
            }
            if (this.f142975p == 1 && !this.f142958L) {
                this.f142970k = true;
            }
            this.f142975p = 5;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: g */
    public final void mo101013g() {
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, release(), surface = " + this.f142965f + ", mPlayer = " + this.f142961b + " mStatus = " + this.f142975p);
        }
        mo101011e();
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            this.f142952F = true;
            jVar.mo101123f();
            this.f142952F = false;
            this.f142961b = null;
            this.f142962c.set(null);
            this.f142975p = 7;
            this.f142948B = false;
            this.f142982w = null;
            C84217p pVar = this.f142964e;
            if (pVar != null) {
                pVar.f188155a = null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: m */
    public final void mo101019m() {
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, sleep(), surface = " + this.f142965f + ", mPlayer = " + this.f142961b + " mStatus = " + this.f142975p);
        }
        this.f142959M = false;
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            String str = this.f142966g;
            long q = jVar.mo101131q();
            if (str != null) {
                C84206j.f188023b.put(str, Long.valueOf(q));
            }
            mo101012f();
            this.f142961b.mo100963o();
            this.f142975p = 6;
            this.f142982w = null;
            C84217p pVar = this.f142964e;
            if (pVar != null) {
                pVar.f188155a = null;
            }
        }
    }

    /* renamed from: B */
    public final JSONObject mo101038B() {
        AbstractC63042j.C63048f fVar;
        long j;
        String str;
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_super_resolution", mo101032z());
            AbstractC63042j jVar = this.f142961b;
            if (jVar == null) {
                fVar = null;
            } else {
                fVar = jVar.mo100964w();
            }
            if (fVar != null) {
                j = m113488a(this.f142961b, fVar).f143214g;
            } else {
                j = 0;
            }
            jSONObject.put("play_bitrate", j);
            jSONObject.put("sr_fail_reason", (int) mo100974a(11));
            jSONObject.put("sr_algorithm_type", (double) mo100974a(12));
            jSONObject.put("audio_codec_format", (double) mo100974a(13));
            jSONObject.put("audio_bitrate", (double) mo100974a(14));
            if (f142946N < ((Number) C84191b.f187910n.getValue()).intValue()) {
                f142946N++;
                JSONObject jSONObject2 = new JSONObject();
                if (C63086d.f143387b == null) {
                    C63086d.f143387b = C63086d.m114018a("video/avc");
                }
                String str2 = "";
                if (C63086d.f143387b != null) {
                    str = C63086d.f143387b.f143394a;
                } else {
                    str = str2;
                }
                jSONObject2.put("264_decoder_name", str);
                if (C63086d.f143387b == null) {
                    C63086d.f143387b = C63086d.m114018a("video/avc");
                }
                int i2 = -1;
                if (C63086d.f143387b != null) {
                    i = C63086d.f143387b.f143395b;
                } else {
                    i = -1;
                }
                jSONObject2.put("264_width_limit", i);
                jSONObject2.put("264_height_limit", C63086d.m114020b());
                if (C63086d.f143388c == null) {
                    C63086d.f143388c = C63086d.m114018a("video/hevc");
                }
                if (C63086d.f143388c != null) {
                    str2 = C63086d.f143388c.f143394a;
                }
                jSONObject2.put("bytevc1_decoder_name", str2);
                if (C63086d.f143388c == null) {
                    C63086d.f143388c = C63086d.m114018a("video/hevc");
                }
                if (C63086d.f143388c != null) {
                    i2 = C63086d.f143388c.f143395b;
                }
                jSONObject2.put("bytevc1_width_limit", i2);
                jSONObject2.put("bytevc1_height_limit", C63086d.m114021c());
                jSONObject.put("hw_codec_info", jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: c */
    public final void mo101006c() {
        int i;
        boolean z;
        if (C62960a.f142907a) {
            StringBuilder append = new StringBuilder("SimplifyPlayerImpl, render(), surface = ").append(this.f142965f).append(", mPlayer = ").append(this.f142961b).append(" mStatus = ").append(this.f142975p).append(", mPrepareOnly:").append(this.f142947A).append("isRenderPrepareEnabled:");
            AbstractC63042j jVar = this.f142961b;
            if (jVar == null || !jVar.mo100962n()) {
                z = false;
            } else {
                z = true;
            }
            C62960a.m113384a(append.append(z).toString());
        }
        if (!this.f142947A) {
            this.f142971l = true;
            AbstractC63042j jVar2 = this.f142961b;
            if (jVar2 != null && jVar2.mo100962n() && (i = this.f142975p) != 1 && i != 2 && i != 5 && i != 6 && i != 3) {
                mo101039a(this.f142964e, this.f142966g, true);
            } else if (this.f142975p == 2) {
                mo101009d();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: d */
    public final void mo101009d() {
        C84217p pVar;
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, start(), surface = " + this.f142965f + ", mPlayer = " + this.f142961b + " mStatus = " + this.f142975p + ", mPrepareOnly:" + this.f142947A);
        }
        if (this.f142947A || this.f142961b == null || this.f142975p != 2) {
            return;
        }
        if ((this.f142965f == null || !this.f142965f.isValid()) && ((pVar = this.f142964e) == null || pVar.f188202p)) {
            this.f142959M = true;
            return;
        }
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, start surface = " + this.f142965f + ", mSimplifyPlayer = " + this.f142961b);
        }
        this.f142960a.mo101094a(this.f142965f);
        this.f142961b.mo101106a(this.f142965f);
        this.f142961b.mo101120c();
        this.f142975p = 3;
        this.f142959M = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: h */
    public final void mo101014h() {
        AbstractC63042j jVar;
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, resume(), surface = " + this.f142965f + ", mPlayer = " + this.f142961b + " mStatus = " + this.f142975p + ", isPrepare2Pause =" + this.f142970k + " mSurfaceChanged = " + this.f142951E + ", mPrepareOnly:" + this.f142947A);
        }
        if (!this.f142947A) {
            int i = this.f142975p;
            boolean z = false;
            if (i < 2 || i > 5 || this.f142970k) {
                m113489a(this.f142964e, this.f142966g);
                this.f142970k = false;
            } else {
                C84217p pVar = this.f142964e;
                if (pVar != null && pVar.f188142N) {
                    z = true;
                }
                if (!this.f142951E || (jVar = this.f142961b) == null || !jVar.mo101126j() || z) {
                    this.f142975p = 2;
                    mo100992a(C84199c.f187979a.getVideoEffectInfo());
                    mo101009d();
                } else {
                    this.f142964e.f188143O = true;
                    m113490a(this.f142964e, this.f142966g, true, this.f142961b.mo101131q(), true);
                }
            }
            final String str = this.f142966g;
            final OnUIPlayListener onUIPlayListener = this.f142981v;
            this.f142980u.mo101241a(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.RunnableC630015 */

                static {
                    Covode.recordClassIndex(73838);
                }

                public final void run() {
                    OnUIPlayListener onUIPlayListener = onUIPlayListener;
                    if (onUIPlayListener != null) {
                        onUIPlayListener.onResumePlay(str);
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100976a(float f) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo101104a(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: c */
    public final void mo101007c(int i) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo100955b(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: d */
    public final void mo101010d(int i) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo100958c(i);
        }
    }

    /* renamed from: b */
    private static boolean m113492b(C84217p pVar) {
        if (pVar == null || !pVar.f188141M || !C84191b.m144781h()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final float mo100974a(int i) {
        AbstractC63042j jVar = this.f142962c.get();
        if (this.f142952F || jVar == null) {
            return -1.0f;
        }
        return jVar.mo101103a(i);
    }

    public C62976i(C84209m.EnumC84214e eVar) {
        this.f142963d = eVar;
        this.f142962c = new AtomicReference<>(null);
        this.f142949C = new C63003a((byte) 0);
    }

    /* renamed from: c */
    private void m113493c(boolean z) {
        this.f142952F = true;
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo101119b(z);
        }
        this.f142952F = false;
        this.f142975p = 0;
        this.f142948B = false;
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, resetPlayer()");
        }
        if (this.f142964e != null && C84191b.m144784k()) {
            this.f142964e.mo129035e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101000b(float f) {
        AbstractC63042j jVar = this.f142962c.get();
        if (jVar != null) {
            jVar.mo101117b(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101002b(Surface surface) {
        if (C62960a.f142907a) {
            C62960a.m113384a("SimplifyPlayerImpl, setSurfaceDirectly(), surface = " + this.f142965f + ", mPlayer = " + this.f142961b + " mStatus = " + this.f142975p);
        }
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo101106a(surface);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final void mo101004b(String str) {
        AbstractC63042j jVar = this.f142962c.get();
        if (jVar != null) {
            jVar.mo100956b(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: b */
    public final boolean mo101005b(OnUIPlayListener onUIPlayListener) {
        OnUIPlayListener onUIPlayListener2 = this.f142981v;
        if (onUIPlayListener2 == null || !onUIPlayListener2.equals(onUIPlayListener)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static AbstractC63042j.C63048f m113488a(AbstractC63042j jVar, AbstractC63042j.C63048f fVar) {
        if (C84191b.m144790q()) {
            return fVar;
        }
        if (jVar == null) {
            return null;
        }
        return jVar.mo100964w();
    }

    /* renamed from: a */
    private void m113489a(C84217p pVar, String str) {
        if (C84199c.f187979a.isCallbackCompletionFix() && pVar != null && pVar.f188130B && this.f142981v != null) {
            this.f142980u.mo101241a(new RunnableC63007j(this, pVar));
        }
        m113490a(pVar, str, true, 0, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100977a(float f, float f2) {
        if (this.f142961b != null) {
            float adjustedVolume = C84199c.f187979a.getAdjustedVolume();
            if (f == 1.0f && f2 == 1.0f && adjustedVolume > 0.0f) {
                this.f142961b.mo101105a(adjustedVolume, adjustedVolume);
            } else {
                this.f142961b.mo101105a(f, f2);
            }
        }
    }

    /* renamed from: a */
    private void m113491a(C84217p pVar, boolean z) {
        boolean z2;
        this.f142949C.mo101088a();
        this.f142985z = Thread.currentThread().getId();
        m113486C();
        this.f142964e = pVar;
        this.f142976q = System.currentTimeMillis();
        this.f142968i = pVar.f188200n;
        if (pVar.f188146R == null && C84191b.m144787n().mo128997a().booleanValue()) {
            this.f142968i = pVar.mo129031a().f188233d;
            C62960a.m113384a("SimplifyPlayerImpl, adjust bytevc1 : " + pVar.f188200n + " -> " + this.f142968i);
        }
        if (pVar.f188146R != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f142969j = z2;
        if (this.f142961b == null) {
            m113487D();
        } else if (pVar.f188137I) {
            this.f142961b.mo101121d();
            this.f142961b.mo101122e();
            this.f142961b.mo101123f();
            this.f142961b = null;
            this.f142962c.set(null);
            m113487D();
        } else if (!pVar.f188140L) {
            m113493c(pVar.f188143O);
            if (z) {
                this.f142961b.mo101125i();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l
    /* renamed from: a */
    public final void mo100979a(int i, Bundle bundle) {
        AbstractC63042j jVar = this.f142961b;
        if (jVar != null) {
            jVar.mo100945a(i, bundle);
        }
    }

    /* renamed from: a */
    private void m113490a(final C84217p pVar, final String str, final boolean z, final long j, final boolean z2) {
        C84217p pVar2;
        if (pVar != null) {
            if (C62960a.f142907a) {
                C62960a.m113384a("SimplifyPlayerImpl, prepare, mStatus:" + this.f142975p + ", prepareOnly:" + pVar.f188206t);
            }
            SystemClock.elapsedRealtime();
            boolean z3 = false;
            this.f142959M = false;
            this.f142982w = pVar.f188155a;
            int i = this.f142975p;
            if (i <= 0 || i >= 6 || (pVar2 = this.f142964e) == null || !pVar2.f188206t || !TextUtils.equals(pVar.f188196j, this.f142964e.f188196j)) {
                pVar.f188187az = 0;
                this.f142947A = pVar.f188206t;
                if (m113492b(pVar)) {
                    mo101040a(pVar, str, z, j, z2, true);
                    return;
                }
                NativeBitrateSelectConfig f = C84191b.m144779f();
                if (f != null && f.useCallback) {
                    m113491a(pVar, z2);
                }
                if (pVar.f188192f == null) {
                    mo101040a(pVar, str, z, j, z2, true);
                } else if (f == null || !f.useCallback) {
                    mo101040a(pVar, str, z, j, z2, true);
                } else {
                    C63059e eVar = pVar.f188191e;
                    if (!C84191b.m144779f().useNative || !this.f142961b.mo100957b()) {
                        if (this.f142950D != null) {
                            SystemClock.elapsedRealtime();
                            this.f142950D.mo101044a(1, 1, eVar);
                            SystemClock.elapsedRealtime();
                        }
                        if (pVar.f188192f != null) {
                            pVar.f188192f.run();
                        }
                        if (this.f142950D != null) {
                            SystemClock.elapsedRealtime();
                            this.f142950D.mo101045b(1, 1, eVar);
                            SystemClock.elapsedRealtime();
                            this.f142950D.mo101043a(1, 1, eVar.f143244i);
                            SystemClock.elapsedRealtime();
                            C63059e.C63060a aVar = eVar.f143244i;
                            if (aVar != null) {
                                pVar.f188131C = new C84223u();
                                pVar.f188131C.f188234e = new C84197a(aVar.f143252a, aVar.f143253b, aVar.f143254c, aVar.f143255d, aVar.f143256e, aVar.f143257f, aVar.f143258g, aVar.f143259h);
                                pVar.f188131C.f188230a = aVar.f143274w;
                                pVar.f188131C.f188231b = aVar.f143264m;
                                C84223u uVar = pVar.f188131C;
                                if (aVar.f143255d == 1) {
                                    z3 = true;
                                }
                                uVar.f188233d = z3;
                                pVar.f188131C.f188235f = aVar.f143256e;
                                pVar.f188131C.f188236g = aVar.f143258g;
                                pVar.f188131C.f188237h = aVar.f143272u;
                                pVar.f188131C.f188238i = aVar.f143271t;
                                if (pVar.f188146R != null) {
                                    pVar.f188146R.f187989h = aVar.f143273v;
                                }
                                mo101040a(pVar, str, z, j, z2, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.f142961b.mo100950a(pVar.f188191e, new AbstractC63032b() {
                        /* class com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i.C629771 */

                        static {
                            Covode.recordClassIndex(73814);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
                        /* renamed from: a */
                        public final boolean mo101044a(int i, int i2, C63059e eVar) {
                            if (C62976i.this.f142950D == null) {
                                return false;
                            }
                            SystemClock.elapsedRealtime();
                            C62976i.this.f142950D.mo101044a(i, i2, eVar);
                            SystemClock.elapsedRealtime();
                            return false;
                        }

                        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
                        /* renamed from: b */
                        public final boolean mo101045b(int i, int i2, C63059e eVar) {
                            if (C62976i.this.f142950D == null) {
                                return false;
                            }
                            SystemClock.elapsedRealtime();
                            C62976i.this.f142950D.mo101045b(i, i2, eVar);
                            SystemClock.elapsedRealtime();
                            return false;
                        }

                        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63033c
                        /* renamed from: a */
                        public final void mo101043a(int i, int i2, C63059e.C63060a aVar) {
                            if (C62976i.this.f142950D != null) {
                                SystemClock.elapsedRealtime();
                                C62976i.this.f142950D.mo101043a(i, i2, aVar);
                                SystemClock.elapsedRealtime();
                            }
                            if (aVar != null) {
                                boolean z = true;
                                if (i2 == 1) {
                                    pVar.f188131C = new C84223u();
                                    pVar.f188131C.f188234e = new C84197a(aVar.f143252a, aVar.f143253b, aVar.f143254c, aVar.f143255d, aVar.f143256e, aVar.f143257f, aVar.f143258g, aVar.f143259h);
                                    pVar.f188131C.f188230a = aVar.f143274w;
                                    pVar.f188131C.f188231b = aVar.f143264m;
                                    C84223u uVar = pVar.f188131C;
                                    if (aVar.f143255d != 1) {
                                        z = false;
                                    }
                                    uVar.f188233d = z;
                                    pVar.f188131C.f188235f = aVar.f143256e;
                                    pVar.f188131C.f188236g = aVar.f143258g;
                                    pVar.f188131C.f188237h = aVar.f143272u;
                                    pVar.f188131C.f188238i = aVar.f143271t;
                                    if (pVar.f188146R != null) {
                                        pVar.f188146R.f187989h = aVar.f143273v;
                                    }
                                    C62976i.this.mo101040a(pVar, str, z, j, z2, false);
                                }
                            }
                        }
                    });
                }
            } else {
                if (this.f142964e.f188131C != null) {
                    pVar.f188131C = this.f142964e.f188131C;
                }
                pVar.f188142N = this.f142964e.f188142N;
                if (this.f142964e.f188187az != 0) {
                    pVar.f188187az = this.f142964e.f188187az;
                }
                this.f142949C.f143089b = Thread.currentThread().getPriority();
                this.f142964e = pVar;
                this.f142947A = pVar.f188206t;
                if (C84199c.f187979a.isPrerenderSurfaceSlowSetFix() || pVar.f188139K) {
                    C62960a.m113385a("SimplifyPlayerImpl", "fix prerender surface slow : setSurface before start");
                    if (this.f142964e.f188207u != null) {
                        mo100980a(this.f142964e.f188207u);
                    }
                }
                if (this.f142975p > 1 && !this.f142947A) {
                    this.f142975p = 2;
                    mo100992a(C84199c.f187979a.getVideoEffectInfo());
                    mo101009d();
                }
                SystemClock.elapsedRealtime();
            }
        }
    }
}
