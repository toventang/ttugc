package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic.p4122b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2432c.AbstractC35338e;
import com.p2082ss.android.ugc.aweme.p2432c.C35335b;
import com.p2082ss.android.ugc.aweme.p2432c.C35336c;
import com.p2082ss.android.ugc.aweme.p2432c.C35337d;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.b.e */
public final class C78723e implements AbstractC63154aa.AbstractC63164i {

    /* renamed from: a */
    public static final C78723e f176911a = new C78723e();

    /* renamed from: b */
    private static AbstractC78708a f176912b;

    private C78723e() {
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63164i
    /* renamed from: c */
    public final void mo101610c() {
        AbstractC78708a aVar = f176912b;
        if (aVar != null) {
            aVar.mo122572e();
        }
    }

    static {
        Covode.recordClassIndex(91866);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63164i
    /* renamed from: a */
    public final AbstractC88979t<String> mo101607a() {
        AbstractC78708a aVar = f176912b;
        if (aVar != null) {
            return aVar.mo122571d();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63164i
    /* renamed from: b */
    public final boolean mo101609b() {
        if (f176912b != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63164i
    /* renamed from: d */
    public final void mo101611d() {
        AbstractC78708a aVar = f176912b;
        if (aVar != null) {
            aVar.mo122573f();
        }
        f176912b = null;
    }

    /* renamed from: b */
    public final AbstractC78708a mo122574b(AbstractC35338e eVar) {
        mo101608a(eVar);
        return f176912b;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63164i
    /* renamed from: a */
    public final void mo101608a(AbstractC35338e eVar) {
        AbstractC78708a aVar;
        if (f176912b == null) {
            if (eVar instanceof C35337d) {
                aVar = new C78722d((C35337d) eVar);
            } else if (eVar instanceof C35335b) {
                aVar = new C78718b((C35335b) eVar);
            } else if (eVar instanceof C35336c) {
                aVar = new C78721c((C35336c) eVar);
            } else {
                aVar = null;
            }
            f176912b = aVar;
        }
    }
}
