package com.p2082ss.android.ugc.asve.recorder.reaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.C30008h;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.ugc.asve.C31016b;
import com.p2082ss.android.ugc.asve.context.AbstractC31039g;
import com.p2082ss.android.ugc.asve.p2217f.C31096d;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31191d;
import com.p2082ss.android.ugc.asve.recorder.reaction.model.AbstractC31232d;
import com.p2082ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p2082ss.android.ugc.asve.recorder.reaction.p2225a.C31225c;
import com.p2082ss.android.vesdk.C85328at;
import com.p2082ss.android.vesdk.C85346av;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.b */
public final class C31226b implements AbstractC31218a {

    /* renamed from: a */
    final String f74840a = "ReactionController";

    /* renamed from: b */
    int f74841b;

    /* renamed from: c */
    int f74842c;

    /* renamed from: d */
    float f74843d;

    /* renamed from: e */
    int f74844e;

    /* renamed from: f */
    int f74845f;

    /* renamed from: g */
    int f74846g;

    /* renamed from: h */
    int f74847h;

    /* renamed from: i */
    final C85346av f74848i;

    /* renamed from: j */
    final Context f74849j;

    /* renamed from: k */
    private final int f74850k = 360;

    /* renamed from: l */
    private C31225c f74851l;

    /* renamed from: m */
    private AbstractC31232d f74852m;

    /* renamed from: n */
    private int f74853n;

    /* renamed from: o */
    private int f74854o;

    /* renamed from: p */
    private int f74855p;

    /* renamed from: q */
    private final C31227a f74856q;

    /* renamed from: r */
    private final AbstractC31191d f74857r;

    /* renamed from: s */
    private final C89378p<Integer, Integer> f74858s;

    /* renamed from: t */
    private final AbstractC31039g f74859t;

    static {
        Covode.recordClassIndex(37872);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a
    /* renamed from: a */
    public final AbstractC31039g mo56850a() {
        return this.f74859t;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a
    /* renamed from: c */
    public final int[] mo56855c() {
        return this.f74848i.mo130791c();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a
    /* renamed from: b */
    public final int[] mo56854b() {
        return this.f74848i.mo130783b();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a
    /* renamed from: d */
    public final void mo56856d() {
        this.f74848i.mo130743a(new C85328at(this.f74859t.mo56213b(), this.f74859t.mo56212a(), new float[]{0.096f, 0.1f, 0.09f, 0.09f}));
        this.f74848i.mo130719a();
        C85346av avVar = this.f74848i;
        int i = this.f74845f;
        int i2 = this.f74855p;
        int i3 = this.f74844e;
        avVar.mo130726a(i, i2, i3, i3);
        this.f74848i.mo130725a((int) (this.f74858s.getFirst().floatValue() * 0.0053333333f));
        C30008h.m60555a().mo52834a(this.f74859t.mo56214c());
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a
    /* renamed from: e */
    public final ReactionWindowInfo mo56857e() {
        float d = this.f74848i.mo130793d();
        this.f74843d = d;
        double degrees = Math.toDegrees((double) d);
        double d2 = (double) this.f74850k;
        Double.isNaN(d2);
        float f = (float) (degrees % d2);
        AbstractC31232d dVar = this.f74852m;
        if (dVar == null) {
            C89219l.m154710a("curWindowShape");
        }
        int convertWidthToDp = dVar.convertWidthToDp(this.f74846g);
        AbstractC31232d dVar2 = this.f74852m;
        if (dVar2 == null) {
            C89219l.m154710a("curWindowShape");
        }
        int convertHeightToDp = dVar2.convertHeightToDp(this.f74847h);
        AbstractC31232d dVar3 = this.f74852m;
        if (dVar3 == null) {
            C89219l.m154710a("curWindowShape");
        }
        return new ReactionWindowInfo(convertWidthToDp, convertHeightToDp, f, dVar3.getMIsCircle() ? 1 : 0);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.b$a */
    public static final class C31227a implements AbstractC30012b {

        /* renamed from: a */
        final /* synthetic */ C31226b f74860a;

        static {
            Covode.recordClassIndex(37873);
        }

        @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
        /* renamed from: a */
        public final void mo52866a(int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31227a(C31226b bVar) {
            this.f74860a = bVar;
        }

        @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
        /* renamed from: a */
        public final void mo52865a(int i) {
            int[] a;
            int i2;
            if (i < 0) {
                C31016b.f74339a.mo56121b("onNativeInitCallBack error: ".concat(String.valueOf(i)));
                return;
            }
            C31226b bVar = this.f74860a;
            C31016b.f74339a.mo56122c(bVar.f74840a + " onSurfaceViewInitDone");
            if (bVar.f74841b > 0 || bVar.f74842c > 0) {
                a = bVar.mo56868a(bVar.f74841b, bVar.f74842c, bVar.f74846g, bVar.f74847h, bVar.f74843d);
            } else if (C31096d.m64298a(bVar.f74849j)) {
                int[] b = bVar.f74848i.mo130783b();
                if (b == null) {
                    i2 = 0;
                } else {
                    i2 = b[0];
                }
                a = bVar.mo56868a(C31096d.m64299b(bVar.f74849j) - i2, bVar.f74845f, bVar.f74846g, bVar.f74847h, bVar.f74843d);
            } else {
                a = bVar.mo56868a(bVar.f74844e, bVar.f74845f, bVar.f74846g, bVar.f74847h, bVar.f74843d);
            }
            if (a != null) {
                C31016b.f74339a.mo56122c(bVar.f74840a + " => update pos: " + bVar.f74841b + ' ' + bVar.f74842c + " curWindowSurfaceWidth and curWindowSurfaceHeight :" + bVar.f74846g + ' ' + bVar.f74847h);
                bVar.f74841b = a[0];
                bVar.f74842c = a[1];
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a
    /* renamed from: a */
    public final void mo56851a(float f) {
        C30008h.m60555a().mo52834a(f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a
    /* renamed from: b */
    public final boolean mo56853b(int i, int i2) {
        return this.f74848i.mo130765a(i, i2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a
    /* renamed from: a */
    public final void mo56852a(int i, int i2) {
        int i3 = this.f74841b + i;
        this.f74841b = i3;
        int i4 = this.f74842c + i2;
        this.f74842c = i4;
        int[] a = this.f74848i.mo130767a(i3, i4, -1, -1, 0.0f);
        if (a != null) {
            this.f74841b = a[0];
            this.f74842c = a[1];
            this.f74853n = a[2];
            this.f74854o = a[3];
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int[] mo56868a(int i, int i2, int i3, int i4, float f) {
        return this.f74848i.mo130767a(i, i2, i3, i4, f);
    }

    public C31226b(C85346av avVar, Context context, AbstractC31191d dVar, C89378p<Integer, Integer> pVar, AbstractC31039g gVar) {
        C89219l.m154721d(avVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(gVar, "");
        this.f74848i = avVar;
        this.f74849j = context;
        this.f74857r = dVar;
        this.f74858s = pVar;
        this.f74859t = gVar;
        C31227a aVar = new C31227a(this);
        this.f74856q = aVar;
        int intValue = pVar.getFirst().intValue();
        int intValue2 = pVar.getSecond().intValue();
        boolean d = gVar.mo56215d();
        double d2 = (double) intValue;
        Double.isNaN(d2);
        this.f74844e = (int) (0.09d * d2);
        double d3 = (double) intValue2;
        Double.isNaN(d3);
        this.f74845f = (int) (0.096d * d3);
        Double.isNaN(d3);
        this.f74855p = (int) (0.1d * d3);
        Double.isNaN(d2);
        int i = (int) (d2 * 0.82d);
        Double.isNaN(d3);
        int i2 = (int) (d3 * 0.804d);
        if (d) {
            double d4 = (double) i;
            Double.isNaN(d4);
            this.f74841b = (((int) (((AbstractC89255c.Default.nextDouble() * 1.0d) / 4.0d) * d4)) * C31096d.m64299b(context)) / intValue;
            double d5 = (double) i2;
            Double.isNaN(d5);
            this.f74842c = (((int) (((AbstractC89255c.Default.nextDouble() * 1.0d) / 4.0d) * d5)) * C31096d.m64300c(context)) / intValue2;
        }
        C31225c cVar = new C31225c(context, pVar.getFirst().intValue(), pVar.getSecond().intValue(), gVar.mo56216e(), gVar.mo56217f());
        this.f74851l = cVar;
        AbstractC31232d dVar2 = cVar.f74835a.get(cVar.f74836b);
        C89219l.m154716b(dVar2, "");
        AbstractC31232d dVar3 = dVar2;
        this.f74852m = dVar3;
        if (dVar3 == null) {
            C89219l.m154710a("curWindowShape");
        }
        this.f74846g = dVar3.getDefaultWidth();
        AbstractC31232d dVar4 = this.f74852m;
        if (dVar4 == null) {
            C89219l.m154710a("curWindowShape");
        }
        this.f74847h = dVar4.getDefaultHeight();
        dVar.mo56537a(aVar);
    }
}
