package com.bytedance.android.livesdk.rank.impl.p612e;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.rank.api.model.C10348b;
import com.bytedance.android.livesdk.rank.api.model.C10353g;
import com.bytedance.android.livesdk.rank.api.model.C10354h;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.impl.p609b.C10379b;
import com.bytedance.android.livesdk.rank.impl.p611d.C10387b;
import com.bytedance.android.livesdk.rank.impl.p613f.C10412a;
import com.bytedance.android.livesdk.rank.impl.widget.EnumC10608a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.e.a */
public final class C10389a implements C10379b.AbstractC10381b {

    /* renamed from: a */
    public C10379b.AbstractC10382c f25078a;

    /* renamed from: b */
    public final EnumC10608a f25079b;

    /* renamed from: c */
    private AbstractC88412b f25080c;

    /* renamed from: d */
    private String f25081d = "";

    static {
        Covode.recordClassIndex(11963);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10381b
    /* renamed from: c */
    public final String mo17272c() {
        return this.f25081d;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10381b
    /* renamed from: b */
    public final void mo17271b() {
        AbstractC88412b bVar = this.f25080c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10381b
    /* renamed from: a */
    public final void mo17269a() {
        try {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                long id = room.getId();
                long ownerUserId = room.getOwnerUserId();
                boolean z = true;
                if (!(id == 0 || ownerUserId == 0)) {
                    AbstractC6872f b = C11115u.m19743a().mo17915b();
                    C89219l.m154716b(b, "");
                    if (b.mo13161c() != ownerUserId) {
                        z = false;
                    }
                    this.f25080c = ((RankApi) C5805e.m12718a().mo11572a(RankApi.class)).getOnlineRankList(id, ownerUserId).mo143271a(new C11191f()).mo143254a(new C10390a(this, z), new C10391b(this));
                    return;
                }
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10379b.AbstractC10381b
    /* renamed from: a */
    public final void mo17270a(C10379b.AbstractC10382c cVar) {
        C89219l.m154721d(cVar, "");
        this.f25078a = cVar;
    }

    public C10389a(EnumC10608a aVar) {
        C89219l.m154721d(aVar, "");
        this.f25079b = aVar;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.a$b */
    static final class C10391b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10389a f25084a;

        static {
            Covode.recordClassIndex(11965);
        }

        C10391b(C10389a aVar) {
            this.f25084a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C10379b.AbstractC10382c cVar = this.f25084a.f25078a;
            if (cVar != null) {
                cVar.mo17151g();
            }
            C10379b.AbstractC10382c cVar2 = this.f25084a.f25078a;
            if (cVar2 != null) {
                cVar2.mo17149e();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.a$a */
    static final class C10390a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10389a f25082a;

        /* renamed from: b */
        final /* synthetic */ boolean f25083b;

        static {
            Covode.recordClassIndex(11964);
        }

        C10390a(C10389a aVar, boolean z) {
            this.f25082a = aVar;
            this.f25083b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long j;
            C10379b.AbstractC10382c cVar;
            C10379b.AbstractC10382c cVar2;
            C5832d dVar = (C5832d) obj;
            if (dVar != null) {
                try {
                    C10353g gVar = (C10353g) dVar.data;
                    if (!(gVar == null || gVar.f25009a == null)) {
                        C10379b.AbstractC10382c cVar3 = this.f25082a.f25078a;
                        if (cVar3 != null) {
                            cVar3.mo17151g();
                        }
                        C10387b.m18895a().f25074d = ((C10353g) dVar.data).f25009a;
                        C10387b a = C10387b.m18895a();
                        C10354h hVar = ((C10353g) dVar.data).f25010b;
                        if (hVar != null) {
                            j = hVar.f25016b;
                        } else {
                            j = 0;
                        }
                        a.f25076f = j;
                        List<C10354h> list = ((C10353g) dVar.data).f25009a;
                        String str = "";
                        C89219l.m154716b(list, str);
                        List<T> f = C89070n.m154580f((Iterable) list);
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) f, 10));
                        for (T t : f) {
                            arrayList.add(C10412a.m18927a(t));
                        }
                        List<C10348b> d = C89070n.m154571d((Iterable) arrayList, 99);
                        if (d.isEmpty()) {
                            if (this.f25083b && (cVar2 = this.f25082a.f25078a) != null) {
                                cVar2.mo9929d();
                            }
                        } else if (this.f25082a.f25079b == EnumC10608a.BOTH_REVENUE) {
                            C10379b.AbstractC10382c cVar4 = this.f25082a.f25078a;
                            if (cVar4 != null) {
                                String str2 = ((C10353g) dVar.data).f25011c;
                                C89219l.m154716b(str2, str);
                                cVar4.mo17148a(d, str2);
                            }
                        } else {
                            C10379b.AbstractC10382c cVar5 = this.f25082a.f25078a;
                            if (cVar5 != null) {
                                cVar5.mo17147a(d);
                            }
                        }
                        if (!(this.f25083b || (cVar = this.f25082a.f25078a) == null)) {
                            C10354h hVar2 = ((C10353g) dVar.data).f25010b;
                            C89219l.m154716b(hVar2, str);
                            C10348b a2 = C10412a.m18927a(hVar2);
                            String str3 = ((C10353g) dVar.data).f25011c;
                            if (str3 != null) {
                                str = str3;
                            }
                            cVar.mo17146a(a2, str);
                            return;
                        }
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    C10379b.AbstractC10382c cVar6 = this.f25082a.f25078a;
                    if (cVar6 != null) {
                        cVar6.mo17149e();
                        return;
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
