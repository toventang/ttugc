package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.C19175b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.EnumC19189i;
import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioSrc;
import com.bytedance.ies.xelement.p1364b.AbstractC18997c;
import com.bytedance.ies.xelement.p1364b.C19004g;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89266e;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.a */
public final class C19207a extends AbstractC19174a implements AbstractC18997c.AbstractC18998a, AbstractC19161f, AbstractC19187g {

    /* renamed from: b */
    public static final C19208a f45375b = new C19208a((byte) 0);

    /* renamed from: c */
    private final AbstractC89171a<C89391z> f45376c = new C19209b(this);

    /* renamed from: d */
    private final AbstractC18997c f45377d;

    static {
        Covode.recordClassIndex(21973);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g
    /* renamed from: a */
    public final AbstractC19188h mo30497a(AbstractC19188h hVar) {
        return hVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: b */
    public final C19169n mo30465b(C19169n nVar) {
        return nVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: b */
    public final boolean mo30466b(C19194c cVar) {
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: d */
    public final boolean mo30468d(C19194c cVar) {
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: f */
    public final boolean mo30469f() {
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.a$a */
    public static final class C19208a {
        static {
            Covode.recordClassIndex(21974);
        }

        private C19208a() {
        }

        public /* synthetic */ C19208a(byte b) {
            this();
        }
    }

    /* renamed from: g */
    private final boolean m35894g() {
        AbstractC18997c cVar = this.f45377d;
        if (cVar == null || !cVar.bq_()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.a$b */
    static final class C19209b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C19207a f45378a;

        static {
            Covode.recordClassIndex(21975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19209b(C19207a aVar) {
            super(0);
            this.f45378a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC19158c cVar;
            C19175b bVar = this.f45378a.f45324a;
            if (!(bVar == null || (cVar = bVar.f45329e) == null)) {
                cVar.mo30401f(new C19194c("STOP_FROM_BACKGROUND_CHANGED"));
            }
            C19004g.f44970a.mo30157c("MusicActionBackgroundPlayableController", "background play fail");
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xelement.p1364b.AbstractC18997c.AbstractC18998a
    /* renamed from: c */
    public final void mo29904c() {
        AbstractC19186f fVar;
        AbstractC19158c cVar;
        EnumC19170o b;
        C19175b bVar;
        AbstractC19158c cVar2;
        AbstractC19181b bVar2;
        C19175b bVar3 = this.f45324a;
        if (bVar3 == null || (bVar2 = bVar3.f45330f) == null) {
            fVar = null;
        } else {
            fVar = bVar2.mo30408m();
        }
        if (m35891b(fVar)) {
            C19175b bVar4 = this.f45324a;
            if (bVar4 == null || (cVar = bVar4.f45329e) == null || (b = cVar.mo30387b()) == null || !b.isPlayingState()) {
                m35889a(this);
            } else if (m35889a(this) && (bVar = this.f45324a) != null && (cVar2 = bVar.f45329e) != null) {
                cVar2.mo30395c(null);
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19176c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30490a() {
        super.mo30490a();
        C19175b bVar = this.f45324a;
        if (bVar != null) {
            bVar.f45327c.mo30392b(this);
            bVar.f45328d.mo30389b(this);
        }
        AbstractC18997c cVar = this.f45377d;
        if (cVar != null) {
            cVar.mo30152b(this);
        }
    }

    /* renamed from: a */
    private static /* synthetic */ boolean m35889a(C19207a aVar) {
        return aVar.m35890a(aVar.f45376c);
    }

    /* renamed from: d */
    private static XAudioSrc m35893d(AbstractC19186f fVar) {
        if (!(fVar instanceof XAudioSrc)) {
            fVar = null;
        }
        return (XAudioSrc) fVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: c */
    public final boolean mo30467c(C19194c cVar) {
        return mo30464a((C19194c) null);
    }

    public C19207a(AbstractC18997c cVar) {
        this.f45377d = cVar;
    }

    /* renamed from: b */
    private static boolean m35891b(AbstractC19186f fVar) {
        if (!m35892c(fVar)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g
    /* renamed from: a */
    public final EnumC19189i mo30498a(EnumC19189i iVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(iVar, "");
        return iVar;
    }

    /* renamed from: c */
    private static boolean m35892c(AbstractC19186f fVar) {
        Boolean mCanBackgroundPlay;
        XAudioSrc d = m35893d(fVar);
        if (d == null || (mCanBackgroundPlay = d.getMCanBackgroundPlay()) == null) {
            return true;
        }
        return mCanBackgroundPlay.booleanValue();
    }

    /* renamed from: a */
    private final boolean m35890a(AbstractC89171a<C89391z> aVar) {
        AbstractC19186f fVar;
        AbstractC19181b bVar;
        AbstractC19181b bVar2;
        C19175b bVar3 = this.f45324a;
        if (bVar3 == null || (bVar2 = bVar3.f45330f) == null) {
            fVar = null;
        } else {
            fVar = bVar2.mo30408m();
        }
        AbstractC19186f a = m35888a(fVar, false);
        if (a == null) {
            aVar.invoke();
            return false;
        }
        C19175b bVar4 = this.f45324a;
        if (bVar4 == null || (bVar = bVar4.f45330f) == null) {
            return true;
        }
        bVar.mo30381a(a, null);
        return true;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19176c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30491a(C19175b bVar) {
        C89219l.m154719c(bVar, "");
        super.mo30491a(bVar);
        C19175b bVar2 = this.f45324a;
        if (bVar2 != null) {
            bVar2.f45327c.mo30382a(this);
            bVar2.f45328d.mo30376a(this);
        }
        AbstractC18997c cVar = this.f45377d;
        if (cVar != null) {
            cVar.mo30151a(this);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f
    /* renamed from: a */
    public final boolean mo30464a(C19194c cVar) {
        AbstractC19186f fVar;
        AbstractC19181b bVar;
        C19175b bVar2 = this.f45324a;
        if (bVar2 == null || (bVar = bVar2.f45330f) == null) {
            fVar = null;
        } else {
            fVar = bVar.mo30408m();
        }
        if (!m35894g() || !m35891b(fVar)) {
            return false;
        }
        new StringBuilder("This song ").append(fVar).append(" not support playing background.");
        return true;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g
    /* renamed from: a */
    public final AbstractC19186f mo30496a(AbstractC19186f fVar, C19194c cVar) {
        String str;
        if (!m35894g() || !m35891b(fVar)) {
            return fVar;
        }
        if (cVar != null) {
            str = cVar.f45337a;
        } else {
            str = null;
        }
        return m35888a(fVar, C89219l.m154714a((Object) str, (Object) "operation_from_media_session_skip_to_prev"));
    }

    /* renamed from: a */
    private final AbstractC19186f m35888a(AbstractC19186f fVar, boolean z) {
        AbstractC19181b bVar;
        AbstractC19188h k;
        String str;
        C19175b bVar2 = this.f45324a;
        if (bVar2 != null && (bVar = bVar2.f45330f) != null && (k = bVar.mo30406k()) != null) {
            List<AbstractC19186f> b = k.mo30539b();
            Iterator<AbstractC19186f> it = b.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                String id = it.next().getId();
                if (fVar != null) {
                    str = fVar.getId();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) id, (Object) str)) {
                    break;
                }
                i++;
            }
            if (z) {
                C89266e a = C89266e.C89267a.m154754a(i - 1, 0, -1);
                int i2 = a.f202927a;
                int i3 = a.f202928b;
                int i4 = a.f202929c;
                if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                    while (true) {
                        AbstractC19186f fVar2 = (AbstractC19186f) C89070n.m154561b((List) b, i2);
                        if (!m35892c(fVar2)) {
                            if (i2 == i3) {
                                break;
                            }
                            i2 += i4;
                        } else {
                            return fVar2;
                        }
                    }
                }
                C89266e a2 = C89266e.C89267a.m154754a(b.size() - 1, i + 1, -1);
                int i5 = a2.f202927a;
                int i6 = a2.f202928b;
                int i7 = a2.f202929c;
                if (i7 < 0 ? i5 >= i6 : i5 <= i6) {
                    while (true) {
                        AbstractC19186f fVar3 = (AbstractC19186f) C89070n.m154561b((List) b, i5);
                        if (!m35892c(fVar3)) {
                            if (i5 == i6) {
                                break;
                            }
                            i5 += i7;
                        } else {
                            return fVar3;
                        }
                    }
                }
            } else {
                C89269g a3 = C89271h.m154766a(i + 1, b.size());
                int i8 = a3.f202927a;
                int i9 = a3.f202928b;
                if (i8 <= i9) {
                    while (true) {
                        AbstractC19186f fVar4 = (AbstractC19186f) C89070n.m154561b((List) b, i8);
                        if (!m35892c(fVar4)) {
                            if (i8 == i9) {
                                break;
                            }
                            i8++;
                        } else {
                            return fVar4;
                        }
                    }
                }
                C89269g a4 = C89271h.m154766a(0, i);
                int i10 = a4.f202927a;
                int i11 = a4.f202928b;
                if (i10 <= i11) {
                    while (true) {
                        AbstractC19186f fVar5 = (AbstractC19186f) C89070n.m154561b((List) b, i10);
                        if (!m35892c(fVar5)) {
                            if (i10 == i11) {
                                break;
                            }
                            i10++;
                        } else {
                            return fVar5;
                        }
                    }
                }
            }
        }
        return null;
    }
}
