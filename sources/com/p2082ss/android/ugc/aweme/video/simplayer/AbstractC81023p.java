package com.p2082ss.android.ugc.aweme.video.simplayer;

import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63031a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63040h;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63052m;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.video.AbstractC80773m;
import com.p2082ss.android.ugc.aweme.video.C80775n;
import com.p2082ss.android.ugc.aweme.video.EnumC81083x;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import com.p2082ss.android.ugc.aweme.video.simplayer.p4227c.C80998a;
import com.p2082ss.android.ugc.aweme.video.simplayer.p4227c.C80999b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.playerkit.exp.C84190a;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84200d;
import com.p2082ss.android.ugc.playerkit.model.C84206j;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.session.Session;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84240h;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.p */
public abstract class AbstractC81023p implements AbstractC81002f {

    /* renamed from: a */
    protected AbstractC63051l f181118a;

    /* renamed from: b */
    protected C84241i f181119b;

    /* renamed from: c */
    C84200d f181120c;

    /* renamed from: d */
    public AbstractC63057c f181121d;

    /* renamed from: e */
    public AbstractC81007g f181122e;

    /* renamed from: f */
    C84217p f181123f;

    /* renamed from: g */
    protected AbstractC81002f.AbstractC81006d f181124g;

    /* renamed from: h */
    protected C81024a f181125h;

    /* renamed from: i */
    protected C81008h f181126i = new C81008h();

    /* renamed from: j */
    private boolean f181127j = true;

    /* renamed from: k */
    private Session f181128k;

    /* renamed from: l */
    private Session f181129l;

    /* renamed from: m */
    private C80997c f181130m;

    /* renamed from: n */
    private AbstractC81002f.AbstractC81005c f181131n;

    /* renamed from: o */
    private boolean f181132o;

    /* renamed from: p */
    private AbstractC63040h f181133p;

    /* renamed from: q */
    private C81009i f181134q;

    /* renamed from: r */
    private C81012j f181135r;

    /* renamed from: s */
    private AbstractC63032b f181136s;

    static {
        Covode.recordClassIndex(94341);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC80773m mo124475a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC81007g mo124476a(C84240h hVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C84217p mo124477a(C81018n nVar);

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: a */
    public void mo124445a(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: a */
    public void mo124449a(AbstractC63052m mVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: k */
    public final void mo124463k() {
        this.f181127j = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: l */
    public void mo124464l() {
    }

    /* renamed from: n */
    public abstract C80993aa mo124478n();

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: h */
    public final AbstractC81002f.AbstractC81006d mo124460h() {
        return this.f181124g;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: i */
    public final AbstractC81002f.AbstractC81003a mo124461i() {
        return this.f181130m;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: j */
    public final AbstractC81002f.AbstractC81005c mo124462j() {
        return this.f181131n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02e5, code lost:
        if (r14 == null) goto L_0x0339;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02e3  */
    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo124450a(com.p2082ss.android.ugc.aweme.video.C80775n r31) {
        /*
        // Method dump skipped, instructions count: 828
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81023p.mo124450a(com.ss.android.ugc.aweme.video.n):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: a */
    public final void mo124447a(OnUIPlayListener onUIPlayListener) {
        C81012j jVar = this.f181135r;
        C81009i iVar = this.f181134q;
        if (onUIPlayListener != null && ((Boolean) iVar.f181082f.getValue()).booleanValue()) {
            if (!C89219l.m154714a(onUIPlayListener, iVar.f181079c)) {
                iVar.f181079c = onUIPlayListener;
                iVar.f181080d = iVar.mo124472a(onUIPlayListener);
            }
            if (iVar.f181080d == null) {
                iVar.f181080d = iVar.mo124472a(onUIPlayListener);
            }
            onUIPlayListener = iVar.f181080d;
        }
        jVar.f181086a = onUIPlayListener;
        this.f181118a.mo100982a(this.f181135r);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: a */
    public final void mo124448a(AbstractC63031a aVar) {
        mo124465m().mo124466a().mo100983a(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simplayer.p$a */
    public class C81024a implements AbstractC81002f.AbstractC81004b {
        static {
            Covode.recordClassIndex(94342);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f.AbstractC81004b
        /* renamed from: a */
        public final AbstractC63051l mo124466a() {
            return AbstractC81023p.this.f181118a;
        }

        @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f.AbstractC81004b
        /* renamed from: b */
        public final C84241i mo124467b() {
            return AbstractC81023p.this.f181119b;
        }

        @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f.AbstractC81004b
        /* renamed from: c */
        public final C84200d mo124468c() {
            return AbstractC81023p.this.f181120c;
        }

        public C81024a() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: b */
    public final void mo124452b() {
        this.f181118a.mo101012f();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: f */
    public final void mo124458f() {
        this.f181118a.mo101013g();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: g */
    public final void mo124459g() {
        this.f181118a.mo101000b(1.0f);
        this.f181126i.f181076a = 1.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: m */
    public final AbstractC81002f.AbstractC81004b mo124465m() {
        if (this.f181125h == null) {
            this.f181125h = new C81024a();
        }
        return this.f181125h;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: a */
    public final void mo124443a() {
        this.f181118a.mo101002b((Surface) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: e */
    public final void mo124457e() {
        this.f181119b = null;
        this.f181120c = null;
        this.f181121d = null;
        this.f181122e = null;
        this.f181126i.f181076a = 1.0f;
        this.f181118a.mo101022p();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: c */
    public final void mo124455c() {
        this.f181134q.f181078b = true;
        if (!((Boolean) ((C84190a) C84191b.f187899c.getValue()).mo128997a()).booleanValue()) {
            C84206j.f188022a = true;
        }
        this.f181118a.mo101019m();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: d */
    public final void mo124456d() {
        String str;
        IALog d = C84231a.m144838d();
        StringBuilder sb = new StringBuilder("resumePlay aid:");
        C84241i iVar = this.f181119b;
        if (iVar != null) {
            str = iVar.getSourceId();
        } else {
            str = "null";
        }
        d.mo124333e("SimPlayer", sb.append(str).toString());
        C84200d dVar = this.f181120c;
        if (dVar != null && !TextUtils.isEmpty(dVar.f187984c)) {
            this.f181118a.mo100995a(this.f181120c.f187984c);
        } else if (this.f181119b != null && !this.f181118a.mo101005b((OnUIPlayListener) null)) {
            this.f181118a.mo100995a(this.f181119b.getSourceId());
        } else if (this.f181123f != null) {
            this.f181118a.mo101014h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: b */
    public final void mo124453b(int i) {
        mo124465m().mo124466a().mo101010d(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: a */
    public final C80998a mo124442a(String str) {
        AbstractC63040h hVar = this.f181133p;
        if (hVar == null) {
            return new C80998a();
        }
        JSONObject a = hVar.mo101172a(str);
        C80998a aVar = new C80998a();
        if (a != null) {
            aVar.f181056a = a.optLong("format_open_input", 0);
            aVar.f181057b = a.optLong("tran_connect", 0);
            aVar.f181058c = a.optLong("http_response", 0);
            aVar.f181059d = a.optLong("receive_first_video_frame", 0);
            aVar.f181060e = a.optLong("decode_first_video_frame", 0);
            aVar.f181061f = a.optLong("render_first_video_frame", 0);
            aVar.f181062g = a.optLong("prepared", 0);
        }
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: b */
    public final C80999b mo124451b(String str) {
        AbstractC63040h hVar = this.f181133p;
        if (hVar == null) {
            return new C80999b();
        }
        HashMap<String, Object> b = hVar.mo101176b(str);
        C80999b bVar = new C80999b();
        if (b != null) {
            if (b.get("out_sync_total_count") instanceof Integer) {
                bVar.f181063a = ((Integer) b.get("out_sync_total_count")).intValue();
            }
            if (b.get("min_out_sync_begin_pos") instanceof Integer) {
                bVar.f181064b = ((Integer) b.get("min_out_sync_begin_pos")).intValue();
            }
            if (b.get("min_out_sync_end_pos") instanceof Integer) {
                bVar.f181065c = ((Integer) b.get("min_out_sync_end_pos")).intValue();
            }
            if (b.get("out_sync_video_origin_fps") instanceof Float) {
                bVar.f181066d = (int) ((Float) b.get("out_sync_video_origin_fps")).floatValue();
            }
            if (b.get("out_sync_video_render_fps") instanceof Float) {
                bVar.f181067e = (int) ((Float) b.get("out_sync_video_render_fps")).floatValue();
            }
            if (b.get("out_sync_video_total_drop_count") instanceof Integer) {
                bVar.f181068f = ((Integer) b.get("out_sync_video_total_drop_count")).intValue();
            }
            if (b.get("out_sync_total_duration") instanceof Long) {
                bVar.f181069g = ((Long) b.get("out_sync_total_duration")).longValue();
            }
            if (b.get("out_sync_max_decode_time") instanceof Long) {
                bVar.f181071i = ((Long) b.get("out_sync_max_decode_time")).longValue();
            }
            if (b.get("out_sync_clock_diff") instanceof Long) {
                bVar.f181070h = ((Long) b.get("out_sync_clock_diff")).longValue();
            }
        }
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: a */
    public void mo124444a(float f) {
        this.f181118a.mo100976a(f);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: b */
    public final void mo124454b(C80775n nVar) {
        EnumC81083x xVar;
        boolean z;
        C80775n nVar2;
        C84217p a;
        boolean z2;
        if (nVar.f180623b != null) {
            if (nVar.f180639r != null) {
                xVar = nVar.f180639r;
            } else {
                xVar = EnumC81083x.Normal;
            }
            xVar.setLoop(nVar.f180634m);
            if (!TextUtils.isEmpty(nVar.f180623b.getVideoModelStr())) {
                C81018n nVar3 = new C81018n();
                nVar3.f181096a = nVar.f180623b;
                nVar3.f181097b = nVar.f180630i;
                nVar3.f181098c = true;
                nVar3.f181099d = nVar.f180631j;
                nVar3.f181100e = nVar.f180635n;
                nVar3.f181101f = nVar.f180636o;
                if (!this.f181127j || nVar.f180611I) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                nVar3.f181102g = z2;
                nVar3.f181103h = xVar;
                nVar3.f181104i = nVar;
                a = mo124477a(nVar3);
                nVar2 = nVar;
            } else {
                C84241i a2 = C81027s.m140679a(nVar.f180623b);
                boolean z3 = nVar.f180630i;
                boolean z4 = nVar.f180640s;
                int i = nVar.f180631j;
                boolean z5 = nVar.f180628g;
                String str = nVar.f180635n;
                String str2 = nVar.f180636o;
                boolean z6 = nVar.f180633l;
                if (!this.f181127j || nVar.f180611I) {
                    z = false;
                } else {
                    z = true;
                }
                nVar2 = nVar;
                a = C81027s.m140678a(a2, z3, true, false, false, z4, i, z5, str, str2, z6, z, nVar.f180642u, xVar, nVar2);
            }
            if (a != null) {
                a.f188155a = nVar2.f180622a;
                a.f188207u = nVar2.f180632k;
                a.f188206t = true;
                Session session = this.f181129l;
                if (session == null || !TextUtils.equals(session.sourceId, a.f188196j)) {
                    Session d = C84229a.f188297a.mo129054d(a.f188210x);
                    this.f181129l = d;
                    if (d != null) {
                        d.sourceId = a.f188196j;
                        this.f181129l.bytevc1 = a.f188200n;
                    }
                }
                m140637a(nVar2, a);
                a.f188201o = nVar2.f180619Q;
                m140638a(false, a);
                this.f181118a.mo100994a(a, this.f181136s);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f
    /* renamed from: a */
    public final void mo124446a(Surface surface) {
        this.f181118a.mo100980a(surface);
    }

    /* renamed from: a */
    private static void m140638a(boolean z, C84217p pVar) {
        AbstractC81964c e;
        boolean z2;
        int m = C84191b.m144786m();
        if (m > 0 && pVar != null && (e = C84229a.f188297a.mo129055e(pVar.f188196j)) != null) {
            boolean z3 = false;
            if (z) {
                if (m == 1 || m == 2) {
                    if (e.isBytevc1() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    pVar.f188200n = z2;
                }
            } else if (m == 1 || m == 3) {
                if (e.isBytevc1() == 1) {
                    z3 = true;
                }
                pVar.f188200n = z3;
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r0v7. Raw type applied. Possible types: java.util.List<? extends android.view.Surface>, java.util.List<android.view.Surface> */
    /* renamed from: a */
    private void m140637a(C80775n nVar, C84217p pVar) {
        if (this.f181132o) {
            if (nVar.f180645x) {
                this.f181126i.f181076a = nVar.f180644w;
            }
            pVar.f188154Z = this.f181126i.f181076a;
        } else {
            pVar.f188154Z = nVar.f180644w;
        }
        pVar.f188169ah = nVar.f180629h;
        pVar.f188171aj = nVar.f180647z;
        pVar.f188172ak = Long.valueOf(nVar.f180603A);
        pVar.f188161aF = nVar.f180604B;
        pVar.f188173al = nVar.f180605C;
        pVar.f188174am = nVar.f180606D;
        pVar.f188175an = nVar.f180607E;
        pVar.f188176ao = nVar.f180608F;
        if (nVar.f180623b != null) {
            pVar.f188147S = nVar.f180623b.getWidth();
            pVar.f188148T = nVar.f180623b.getHeight();
        }
        pVar.f188170ai = nVar.f180621S;
        pVar.f188156aA = nVar.f180616N;
        pVar.f188139K = nVar.f180609G;
        pVar.f188140L = nVar.f180610H;
        pVar.f188142N = nVar.f180612J;
        pVar.f188157aB = nVar.f180617O;
        pVar.f188179ar = nVar.f180613K;
        pVar.f188180as = nVar.f180614L;
        pVar.f188181at = nVar.f180615M;
        pVar.f188159aD = nVar.f180625d;
        C81027s.m140682a(pVar, nVar.f180624c);
        if (nVar.f180623b != null) {
            C81027s.m140681a(pVar, nVar.f180623b.getClaInfo());
        }
    }

    public AbstractC81023p(AbstractC63051l lVar, boolean z, C81014l lVar2) {
        boolean z2 = true;
        this.f181118a = lVar;
        lVar.mo100991a(new C81000d());
        this.f181118a.mo100985a(C81025q.f181138a);
        this.f181118a.mo100987a(mo124475a((lVar2 == null || !lVar2.f181092a) ? false : z2));
        C81001e eVar = new C81001e();
        this.f181133p = eVar;
        this.f181118a.mo100986a(eVar);
        this.f181124g = mo124478n();
        this.f181130m = new C80997c(this.f181118a);
        this.f181131n = new C81013k(this.f181118a);
        this.f181132o = z;
        this.f181134q = new C81009i();
        this.f181135r = new C81012j(this.f181124g, this.f181130m);
        AbstractC63032b bitrateSelectListener = C80716a.C80717a.f180462a.mo123864a().getBitrateSelectListener();
        this.f181136s = bitrateSelectListener;
        this.f181118a.mo100984a(bitrateSelectListener);
    }
}
