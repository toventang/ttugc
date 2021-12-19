package com.bytedance.ies.xelement.defaultimpl.player.impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19179c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19193b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19164i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19168m;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19157b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19167l;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19172q;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19176c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.C19190j;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.EnumC19189i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.C19060a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.p1372a.C19074a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.p1372a.C19090d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1374c.C19112a;
import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioList;
import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioSrc;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.C19207a;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.C19211a;
import com.bytedance.ies.xelement.p1364b.AbstractC18997c;
import com.bytedance.ies.xelement.p1364b.AbstractC19000e;
import com.bytedance.ies.xelement.p1364b.AbstractC19003f;
import com.bytedance.ies.xelement.p1364b.C18993a;
import com.bytedance.ies.xelement.p1364b.C19004g;
import com.bytedance.ies.xelement.p1364b.EnumC19005h;
import com.bytedance.ies.xelement.p1364b.EnumC19010k;
import com.bytedance.ies.xelement.p1364b.EnumC19011l;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.a */
public final class C19196a implements AbstractC19000e {

    /* renamed from: g */
    public static final C19197a f45340g = new C19197a((byte) 0);

    /* renamed from: t */
    private static final String f45341t = C19196a.class.getSimpleName();

    /* renamed from: a */
    public AbstractC19000e.AbstractC19001a f45342a;

    /* renamed from: b */
    public AbstractC19179c f45343b;

    /* renamed from: c */
    public EnumC19011l f45344c = EnumC19011l.DEFAULT;

    /* renamed from: d */
    public final C18993a f45345d;

    /* renamed from: e */
    public AbstractC19186f f45346e;

    /* renamed from: f */
    public boolean f45347f;

    /* renamed from: h */
    private C19211a f45348h;

    /* renamed from: i */
    private C19112a f45349i;

    /* renamed from: j */
    private List<String> f45350j;

    /* renamed from: k */
    private final AbstractC89244h f45351k;

    /* renamed from: l */
    private final AbstractC89244h f45352l;

    /* renamed from: m */
    private final AbstractC89244h f45353m;

    /* renamed from: n */
    private C19204c f45354n;

    /* renamed from: o */
    private AbstractC19188h f45355o;

    /* renamed from: p */
    private EnumC19189i f45356p;

    /* renamed from: q */
    private boolean f45357q;

    /* renamed from: r */
    private boolean f45358r;

    /* renamed from: s */
    private final Context f45359s;

    /* renamed from: l */
    private final C19199c.C192001 m35838l() {
        return (C19199c.C192001) this.f45351k.getValue();
    }

    /* renamed from: m */
    private final ArrayList<AbstractC19176c> m35839m() {
        return (ArrayList) this.f45352l.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.a$a */
    public static final class C19197a {
        static {
            Covode.recordClassIndex(21961);
        }

        private C19197a() {
        }

        public /* synthetic */ C19197a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.a$e */
    public static final class C19202e extends C27895a<List<? extends String>> {
        static {
            Covode.recordClassIndex(21966);
        }

        C19202e() {
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: a */
    public final void mo30164a(String str) {
        C89219l.m154719c(str, "");
        XAudioList xAudioList = (XAudioList) m35837a(str, XAudioList.class);
        this.f45355o = xAudioList != null ? xAudioList.toPlaylist() : null;
        m35841o();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.a$b */
    static final class C19198b extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C19198b f45360a = new C19198b();

        static {
            Covode.recordClassIndex(21962);
        }

        C19198b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27910f();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.a$c */
    static final class C19199c extends AbstractC89220m implements AbstractC89171a<C192001> {

        /* renamed from: a */
        final /* synthetic */ C19196a f45361a;

        static {
            Covode.recordClassIndex(21963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19199c(C19196a aVar) {
            super(0);
            this.f45361a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C192001 invoke() {
            return new Object(this) {
                /* class com.bytedance.ies.xelement.defaultimpl.player.impl.C19196a.C19199c.C192001 */

                /* renamed from: a */
                final /* synthetic */ C19199c f45362a;

                static {
                    Covode.recordClassIndex(21964);
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c
                /* renamed from: a */
                public final void mo30499a(AbstractC19186f fVar) {
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
                /* renamed from: b */
                public final void mo30459b() {
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
                /* renamed from: b */
                public final void mo30460b(long j) {
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
                /* renamed from: d */
                public final void mo30462d() {
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
                /* renamed from: e */
                public final void mo30463e() {
                    AbstractC19000e.AbstractC19001a aVar = this.f45362a.f45361a.f45342a;
                    if (aVar != null) {
                        aVar.mo29899a(EnumC19010k.PLAYBACK_STATE_ENDED);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f45362a = r1;
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
                /* renamed from: a */
                public final void mo30453a(long j) {
                    AbstractC19000e.AbstractC19001a aVar = this.f45362a.f45361a.f45342a;
                    if (aVar != null) {
                        aVar.mo29897a((int) j);
                    }
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c
                /* renamed from: a_ */
                public final void mo30500a_(AbstractC19188h hVar) {
                    AbstractC19000e.AbstractC19001a aVar = this.f45362a.f45361a.f45342a;
                    if (aVar != null) {
                        aVar.mo29896a();
                    }
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
                /* renamed from: a */
                public final void mo30455a(EnumC19167l lVar) {
                    C89219l.m154719c(lVar, "");
                    AbstractC19000e.AbstractC19001a aVar = this.f45362a.f45361a.f45342a;
                    if (aVar != null) {
                        aVar.mo29900a(lVar);
                    }
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c
                /* renamed from: a_ */
                public final void mo30501a_(EnumC19189i iVar) {
                    C89219l.m154719c(iVar, "");
                    C89219l.m154719c(iVar, "");
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
                /* renamed from: a */
                public final void mo30456a(C19169n nVar) {
                    AbstractC19000e.AbstractC19001a aVar = this.f45362a.f45361a.f45342a;
                    if (aVar != null) {
                        aVar.mo29901a(this.f45362a.f45361a.mo30179k());
                    }
                    if (this.f45362a.f45361a.f45347f) {
                        AbstractC19179c cVar = this.f45362a.f45361a.f45343b;
                        if (cVar != null) {
                            cVar.mo30395c(null);
                        }
                        this.f45362a.f45361a.f45347f = false;
                    }
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
                /* renamed from: a */
                public final void mo30454a(EnumC19157b bVar) {
                    String str;
                    C89219l.m154719c(bVar, "");
                    AbstractC19000e.AbstractC19001a aVar = this.f45362a.f45361a.f45342a;
                    if (aVar != null) {
                        aVar.mo29898a(bVar.getCode(), bVar.getMsg());
                    }
                    C18993a aVar2 = this.f45362a.f45361a.f45345d;
                    String desc = this.f45362a.f45361a.f45344c.getDesc();
                    boolean z = this.f45362a.f45361a.f45347f;
                    AbstractC19186f fVar = this.f45362a.f45361a.f45346e;
                    if (fVar != null) {
                        str = fVar.toString();
                    } else {
                        str = null;
                    }
                    aVar2.mo30148a(-1, desc, z, "play error final", str, -1);
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
                /* renamed from: a */
                public final void mo30457a(EnumC19170o oVar) {
                    C89219l.m154719c(oVar, "");
                    AbstractC19000e.AbstractC19001a aVar = this.f45362a.f45361a.f45342a;
                    if (aVar != null) {
                        aVar.mo29899a(C19196a.m35836a(oVar));
                    }
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
                /* renamed from: a */
                public final void mo30458a(EnumC19172q qVar) {
                    AbstractC19000e.AbstractC19001a aVar;
                    C89219l.m154719c(qVar, "");
                    if (qVar == EnumC19172q.SEEK_SUCCESS && (aVar = this.f45362a.f45361a.f45342a) != null) {
                        aVar.mo29903b(this.f45362a.f45361a.mo30175g());
                    }
                }
            };
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.a$d */
    static final class C19201d extends AbstractC89220m implements AbstractC89171a<ArrayList<AbstractC19176c>> {

        /* renamed from: a */
        public static final C19201d f45363a = new C19201d();

        static {
            Covode.recordClassIndex(21965);
        }

        C19201d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArrayList<AbstractC19176c> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: n */
    private final void m35840n() {
        AbstractC19179c cVar;
        EnumC19189i iVar = this.f45356p;
        if (iVar != null && (cVar = this.f45343b) != null) {
            cVar.mo30384a(iVar);
        }
    }

    /* renamed from: o */
    private final void m35841o() {
        AbstractC19179c cVar;
        AbstractC19188h hVar = this.f45355o;
        if (hVar != null && (cVar = this.f45343b) != null) {
            cVar.mo30383a(hVar);
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: d */
    public final void mo30172d() {
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            cVar.mo30397d(null);
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: e */
    public final void mo30173e() {
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            cVar.mo30401f(null);
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: f */
    public final int mo30174f() {
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            return (int) cVar.mo30396d();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: g */
    public final int mo30175g() {
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            return (int) cVar.mo30394c();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: h */
    public final long mo30176h() {
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            return cVar.mo30398e();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: i */
    public final long mo30177i() {
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            return cVar.mo30400f();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: j */
    public final EnumC19010k mo30178j() {
        EnumC19170o oVar;
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            oVar = cVar.mo30387b();
        } else {
            oVar = null;
        }
        return m35836a(oVar);
    }

    static {
        Covode.recordClassIndex(21960);
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: k */
    public final String mo30179k() {
        AbstractC19186f m;
        String id;
        AbstractC19179c cVar = this.f45343b;
        if (cVar == null || (m = cVar.mo30408m()) == null || (id = m.getId()) == null) {
            return "";
        }
        return id;
    }

    /* renamed from: q */
    private final void m35843q() {
        C19204c cVar;
        AbstractC19179c cVar2 = this.f45343b;
        if (cVar2 != null && (cVar = this.f45354n) != null) {
            AbstractC18997c cVar3 = cVar.f45367a;
            if (cVar3 != null) {
                cVar2.mo30379a((AbstractC19176c) new C19207a(cVar3));
            }
            AbstractC19193b<AbstractC19186f, C19169n> bVar = cVar.f45370d;
            if (bVar != null) {
                cVar2.mo30385a(bVar);
            }
            m35844r();
            m35845s();
        }
    }

    /* renamed from: r */
    private final void m35844r() {
        AbstractC19179c cVar;
        C19204c cVar2 = this.f45354n;
        if (cVar2 != null && (cVar = this.f45343b) != null) {
            C19211a aVar = this.f45348h;
            if (aVar == null) {
                aVar = new C19211a(this.f45359s, cVar2.f45368b, cVar2.f45367a, cVar2.f45369c);
                this.f45348h = aVar;
            }
            if (this.f45357q) {
                cVar.mo30379a((AbstractC19176c) aVar);
            } else {
                cVar.mo30390b((AbstractC19176c) aVar);
            }
        }
    }

    /* renamed from: t */
    private final void m35846t() {
        boolean z = this.f45358r;
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            C19112a aVar = this.f45349i;
            if (aVar == null) {
                Context a = m35835a(this.f45359s);
                C89219l.m154709a((Object) a, "");
                aVar = new C19112a(a);
                this.f45349i = aVar;
            }
            if (z) {
                cVar.mo30379a((AbstractC19176c) aVar);
            } else {
                cVar.mo30390b((AbstractC19176c) aVar);
            }
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: b */
    public final void mo30166b() {
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            cVar.mo30401f(new C19194c("STOP_FROM_PAGE_EXIT"));
            cVar.mo30383a((AbstractC19188h) null);
            cVar.mo30373a();
            C19004g gVar = C19004g.f44970a;
            String str = f45341t;
            gVar.mo30155a(str, str + " detached.");
        }
        m35839m().clear();
        this.f45349i = null;
        this.f45343b = null;
        this.f45348h = null;
    }

    /* renamed from: p */
    private final void m35842p() {
        List<AbstractC19186f> b;
        String str;
        AbstractC19186f fVar = this.f45346e;
        AbstractC19188h hVar = this.f45355o;
        if (hVar != null && (b = hVar.mo30539b()) != null) {
            int i = 0;
            Iterator<AbstractC19186f> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String id = it.next().getId();
                if (fVar != null) {
                    str = fVar.getId();
                } else {
                    str = null;
                }
                if (!C89219l.m154714a((Object) id, (Object) str)) {
                    i++;
                } else if (i != -1) {
                    if (fVar != null) {
                        AbstractC19179c cVar = this.f45343b;
                        if (cVar != null) {
                            cVar.mo30381a((AbstractC19181b) fVar, (AbstractC19186f) null);
                        }
                    } else {
                        fVar = null;
                    }
                    this.f45346e = fVar;
                    return;
                }
            }
        }
        this.f45355o = new C19190j(fVar);
        m35841o();
    }

    /* renamed from: s */
    private final void m35845s() {
        AbstractC19179c cVar;
        C19204c cVar2 = this.f45354n;
        if (cVar2 != null && (cVar = this.f45343b) != null) {
            List<String> list = this.f45350j;
            Iterator<T> it = m35839m().iterator();
            while (it.hasNext()) {
                cVar.mo30390b((AbstractC19176c) it.next());
            }
            m35839m().clear();
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC19176c.AbstractC19177a aVar = cVar2.f45371e.get(it2.next());
                    if (aVar != null) {
                        AbstractC19176c a = aVar.mo30527a();
                        m35839m().add(a);
                        cVar.mo30379a(a);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: c */
    public final void mo30169c() {
        AbstractC19179c cVar = this.f45343b;
        String str = null;
        if (cVar != null) {
            cVar.mo30395c(null);
        }
        if (this.f45343b == null) {
            AbstractC19186f fVar = this.f45346e;
            if (fVar != null) {
                str = fVar.getPlayUrl();
            } else {
                AbstractC19188h hVar = this.f45355o;
                if (hVar != null) {
                    str = hVar.mo30537a();
                }
            }
            this.f45345d.mo30148a(-6, this.f45344c.getDesc(), this.f45347f, "player not attach or already be detached", str, -1);
        }
        if (this.f45346e == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "-4");
            jSONObject.put("playerType", this.f45344c.getDesc());
            jSONObject.put("autoPlay", String.valueOf(this.f45347f));
            jSONObject.put("message", "src is empty");
            jSONObject.put("src", "");
            jSONObject.put("playStatus", "-1");
            this.f45345d.mo30150b(jSONObject);
            C19004g.f44970a.mo30155a("AUDIO_MONITOR_TAG", "eventName: x_audio_error, error msg :src is empty");
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: a */
    public final void mo30158a() {
        C19060a aVar = new C19060a(this.f45359s, this.f45345d);
        this.f45343b = aVar;
        aVar.mo30380a((AbstractC19183c) m35838l());
        aVar.mo30375a((AbstractC19159d) m35838l());
        mo30163a(this.f45344c);
        m35843q();
        m35840n();
        m35846t();
        m35841o();
        m35842p();
        C19004g gVar = C19004g.f44970a;
        String str = f45341t;
        gVar.mo30155a(str, str + " attached.");
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: a */
    public final void mo30165a(boolean z) {
        this.f45347f = z;
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: a */
    public final void mo30160a(AbstractC19000e.AbstractC19001a aVar) {
        C89219l.m154719c(aVar, "");
        this.f45342a = aVar;
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: b */
    public final void mo30168b(boolean z) {
        this.f45357q = z;
        m35844r();
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: c */
    public final void mo30171c(boolean z) {
        this.f45358r = z;
        m35846t();
    }

    /* renamed from: a */
    private static Context m35835a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: a */
    public final void mo30159a(int i) {
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            cVar.mo30374a((long) i, (AbstractC19168m) null);
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: b */
    public final void mo30167b(String str) {
        C89219l.m154719c(str, "");
        this.f45346e = (AbstractC19186f) m35837a(str, XAudioSrc.class);
        m35842p();
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: c */
    public final void mo30170c(String str) {
        C89219l.m154719c(str, "");
        Type type = new C19202e().type;
        C89219l.m154709a((Object) type, "");
        this.f45350j = (List) m35837a(str, type);
        m35845s();
    }

    /* renamed from: a */
    public static EnumC19010k m35836a(EnumC19170o oVar) {
        if (oVar != null) {
            int i = C19203b.f45366c[oVar.ordinal()];
            if (i == 1) {
                return EnumC19010k.PLAYBACK_STATE_START;
            }
            if (i == 2) {
                return EnumC19010k.PLAYBACK_STATE_PLAYING;
            }
            if (i == 3) {
                return EnumC19010k.PLAYBACK_STATE_PAUSED;
            }
            if (i == 4) {
                return EnumC19010k.PLAYBACK_STATE_STOPPED;
            }
            if (i == 5) {
                return EnumC19010k.PLAYBACK_STATE_ERROR;
            }
        }
        return EnumC19010k.PLAYBACK_STATE_STOPPED;
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: a */
    public final void mo30161a(AbstractC19003f fVar) {
        C89219l.m154719c(fVar, "");
        if (!(fVar instanceof C19204c)) {
            fVar = null;
        }
        C19204c cVar = (C19204c) fVar;
        if (cVar != null) {
            this.f45354n = cVar;
            m35843q();
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: a */
    public final void mo30162a(EnumC19005h hVar) {
        EnumC19189i iVar;
        C89219l.m154719c(hVar, "");
        int i = C19203b.f45364a[hVar.ordinal()];
        if (i == 1) {
            iVar = EnumC19189i.SINGLE_LOOP;
        } else if (i == 2) {
            iVar = EnumC19189i.SEQUENCE;
        } else if (i == 3) {
            iVar = EnumC19189i.LIST_LOOP;
        } else {
            throw new C89376n();
        }
        this.f45356p = iVar;
        m35840n();
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC19000e
    /* renamed from: a */
    public final void mo30163a(EnumC19011l lVar) {
        AbstractC19164i aVar;
        C89219l.m154719c(lVar, "");
        this.f45344c = lVar;
        AbstractC19179c cVar = this.f45343b;
        if (cVar != null) {
            int i = C19203b.f45365b[lVar.ordinal()];
            if (i == 1 || i == 2) {
                aVar = new C19074a();
            } else {
                aVar = new C19090d();
            }
            cVar.mo30377a(aVar);
        }
    }

    /* renamed from: a */
    private final <T> T m35837a(String str, Type type) {
        try {
            return (T) ((C27910f) this.f45353m.getValue()).mo46671a(str, type);
        } catch (Throwable unused) {
            this.f45345d.mo30148a(-7, this.f45344c.getDesc(), this.f45347f, "json format error", str, -1);
            return null;
        }
    }

    public C19196a(Context context, AbstractC28520j jVar, int i) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(jVar, "");
        this.f45359s = context;
        this.f45345d = new C18993a(jVar, i);
        this.f45351k = C89250i.m154773a((AbstractC89171a) new C19199c(this));
        this.f45352l = C89250i.m154773a((AbstractC89171a) C19201d.f45363a);
        this.f45353m = C89250i.m154773a((AbstractC89171a) C19198b.f45360a);
        this.f45357q = true;
        this.f45358r = true;
    }
}
