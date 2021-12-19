package com.p2082ss.android.ugc.aweme.video.p4212f;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.aweme.video.p4212f.C80729c;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.trill.R;
import com.toutiao.proxyserver.C87383u;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.video.f.b */
public class C80727b implements AbstractC80726a {

    /* renamed from: B */
    private static final String f180468B = C80727b.class.getSimpleName();

    /* renamed from: A */
    int f180469A = -1;

    /* renamed from: C */
    private HandlerC80728a f180470C;

    /* renamed from: D */
    private C80729c f180471D;

    /* renamed from: E */
    private SparseArray<View> f180472E = new SparseArray<>();

    /* renamed from: F */
    private int f180473F = -1;

    /* renamed from: a */
    public volatile boolean f180474a;

    /* renamed from: b */
    long f180475b = 0;

    /* renamed from: c */
    int f180476c = 0;

    /* renamed from: d */
    int f180477d = 0;

    /* renamed from: e */
    long f180478e;

    /* renamed from: f */
    boolean f180479f;

    /* renamed from: g */
    int f180480g;

    /* renamed from: h */
    int f180481h;

    /* renamed from: i */
    int f180482i = -1;

    /* renamed from: j */
    long f180483j = -1;

    /* renamed from: k */
    int f180484k;

    /* renamed from: l */
    float f180485l;

    /* renamed from: m */
    String f180486m;

    /* renamed from: n */
    String f180487n;

    /* renamed from: o */
    String f180488o;

    /* renamed from: p */
    String f180489p;

    /* renamed from: q */
    String f180490q;

    /* renamed from: r */
    boolean f180491r;

    /* renamed from: s */
    String f180492s;

    /* renamed from: t */
    String f180493t;

    /* renamed from: u */
    String f180494u;

    /* renamed from: v */
    double f180495v;

    /* renamed from: w */
    int f180496w = -1;

    /* renamed from: x */
    int f180497x = -1;

    /* renamed from: y */
    String f180498y;

    /* renamed from: z */
    int f180499z;

    static {
        Covode.recordClassIndex(94014);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a
    /* renamed from: a */
    public final void mo123869a() {
        this.f180477d = 0;
        this.f180475b = 0;
        this.f180476c = 0;
        this.f180478e = 0;
        this.f180479f = false;
        this.f180482i = -1;
        this.f180483j = -1;
        this.f180493t = null;
        this.f180492s = null;
        this.f180490q = null;
        this.f180486m = null;
        this.f180491r = false;
        this.f180497x = -1;
        this.f180496w = -1;
        this.f180498y = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a
    /* renamed from: a */
    public final void mo123870a(int i) {
        this.f180477d = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a
    /* renamed from: b */
    public final void mo123873b(int i) {
        this.f180476c = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a
    /* renamed from: a */
    public final void mo123871a(long j) {
        this.f180475b = j;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.f.b$a */
    static class HandlerC80728a extends Handler {

        /* renamed from: a */
        private WeakReference<C80727b> f180500a;

        static {
            Covode.recordClassIndex(94015);
        }

        HandlerC80728a(C80727b bVar) {
            this.f180500a = new WeakReference<>(bVar);
        }

        public final void handleMessage(Message message) {
            C80727b bVar;
            String str;
            WeakReference<C80727b> weakReference = this.f180500a;
            if (weakReference != null && (bVar = weakReference.get()) != null && message.what == 1) {
                AbstractC80747i O = C81079v.m140776O();
                bVar.mo123874a(R.string.fzl, bVar.f180489p);
                if (bVar.f180488o == null || bVar.f180488o.length() <= 25) {
                    bVar.mo123874a(R.string.h4b, bVar.f180488o);
                } else {
                    bVar.mo123874a(R.string.h4b, bVar.f180488o.substring(0, 25) + "\n" + bVar.f180488o.substring(25, bVar.f180488o.length()));
                }
                bVar.mo123874a(R.string.bxj, String.valueOf(bVar.f180478e) + "ms");
                bVar.mo123874a(R.string.a74, String.valueOf(bVar.f180476c));
                bVar.mo123874a(R.string.a75, String.valueOf(bVar.f180475b) + "ms");
                bVar.mo123874a(R.string.czv, String.valueOf(bVar.f180477d));
                bVar.mo123874a(R.string.a8c, String.valueOf(bVar.f180482i));
                bVar.mo123874a(R.string.h89, String.valueOf(bVar.f180483j));
                bVar.mo123874a(R.string.fzz, bVar.f180492s);
                bVar.mo123874a(R.string.cny, String.valueOf(bVar.f180479f));
                bVar.mo123874a(R.string.b3y, String.valueOf(bVar.f180493t));
                bVar.mo123874a(R.string.fyn, String.valueOf(bVar.f180494u));
                bVar.mo123874a(R.string.fyo, String.valueOf(bVar.f180495v));
                bVar.mo123874a(R.string.dpp, String.valueOf(O.mo123877a()));
                bVar.mo123874a(R.string.h4v, String.valueOf(C87383u.f198092l));
                bVar.mo123874a(R.string.dpg, String.valueOf(bVar.f180485l));
                bVar.mo123874a(R.string.a8g, bVar.f180486m);
                bVar.mo123874a(R.string.cn7, String.valueOf(bVar.f180480g) + "KBps");
                bVar.mo123874a(R.string.eqq, String.valueOf(bVar.f180481h) + "KBps");
                bVar.mo123874a(R.string.a5x, String.valueOf(bVar.f180484k));
                if (bVar.f180487n != null) {
                    bVar.mo123874a(R.string.a5y, bVar.f180487n);
                }
                bVar.mo123874a(R.string.g8n, "false");
                bVar.mo123874a(R.string.d50, "false");
                bVar.mo123874a(R.string.h4q, String.valueOf(bVar.f180491r));
                if (bVar.f180490q == null || bVar.f180490q.length() <= 120) {
                    str = bVar.f180490q;
                } else {
                    str = bVar.f180490q.substring(0, 120);
                }
                bVar.mo123874a(R.string.dpu, str);
                bVar.mo123874a(R.string.dpq, O.mo123879b());
                bVar.mo123874a(R.string.eqx, C80695q.m139909b() + C80937s.m140453b().mo124082e().getClass().getSimpleName());
                bVar.mo123874a(R.string.agz, new StringBuilder().append(bVar.f180496w).toString());
                bVar.mo123874a(R.string.agy, new StringBuilder().append(bVar.f180497x).toString());
                bVar.mo123874a(R.string.h_z, String.valueOf(bVar.f180498y));
                bVar.mo123874a(R.string.h4n, String.valueOf(bVar.f180499z));
                bVar.mo123874a(R.string.eqy, String.valueOf(bVar.f180469A));
                removeMessages(1);
                if (!bVar.f180474a) {
                    sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.p4212f.AbstractC80726a
    /* renamed from: a */
    public final void mo123872a(boolean z) {
        this.f180474a = !z;
        if (z) {
            this.f180470C.sendEmptyMessageDelayed(1, 1000);
        } else {
            this.f180470C.removeMessages(1);
        }
    }

    public C80727b(Context context, FrameLayout frameLayout) {
        MethodCollector.m26663i(5024);
        C80729c cVar = new C80729c(context);
        this.f180471D = cVar;
        frameLayout.addView(cVar.f180502b, new FrameLayout.LayoutParams(-1, -1));
        this.f180470C = new HandlerC80728a(this);
        MethodCollector.m26664o(5024);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo123874a(int i, String str) {
        MethodCollector.m26663i(5718);
        View view = this.f180472E.get(i);
        if (view == null) {
            C80729c cVar = this.f180471D;
            String string = cVar.f180501a.getString(i);
            View a = C1764a.m5927a(LayoutInflater.from(cVar.f180501a), R.layout.b2u, cVar.f180503c, false);
            C80729c.C80730a a2 = C80729c.m139968a(a);
            if (a2.f180504a != null) {
                a2.f180504a.setText(string);
            }
            a2.mo123876a(str);
            cVar.f180503c.addView(a);
            this.f180472E.put(i, a);
            MethodCollector.m26664o(5718);
            return;
        }
        C80729c.m139968a(view).mo123876a(str);
        MethodCollector.m26664o(5718);
    }
}
