package com.bytedance.creativex.recorder.p938a;

import androidx.lifecycle.C1213t;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.C14316c;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14103e;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.p1617a.p1618a.C22118b;
import com.bytedance.scene.p1621c.C22154f;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.creativex.recorder.a.k */
public class C14151k extends AbstractC2562j<AbstractC14103e> implements AbstractC14103e, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f34409a = {new C89232y(C14151k.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0)};

    /* renamed from: b */
    public final AbstractC14103e f34410b = this;

    /* renamed from: c */
    public final C1213t<Boolean> f34411c = new C1213t<>();

    /* renamed from: d */
    public final AbstractC22186b f34412d;

    /* renamed from: e */
    private final AbstractC89248d f34413e = C21572a.m40505b(getDiContainer(), AbstractC14315b.class);

    /* renamed from: f */
    private final AbstractC89244h f34414f = C89250i.m154773a((AbstractC89171a) new C14153b(this));

    /* renamed from: g */
    private final C21582f f34415g;

    static {
        Covode.recordClassIndex(16220);
    }

    /* renamed from: b */
    private final C14155m m25770b() {
        return (C14155m) this.f34414f.getValue();
    }

    /* renamed from: com.bytedance.creativex.recorder.a.k$a */
    public static final class C14152a extends C22118b {
        static {
            Covode.recordClassIndex(16221);
        }

        C14152a() {
        }
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public /* bridge */ /* synthetic */ AbstractC14103e getApiComponent() {
        return this.f34410b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f34415g;
    }

    /* renamed from: com.bytedance.creativex.recorder.a.k$b */
    static final class C14153b extends AbstractC89220m implements AbstractC89171a<C14155m> {

        /* renamed from: a */
        final /* synthetic */ C14151k f34416a;

        static {
            Covode.recordClassIndex(16222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14153b(C14151k kVar) {
            super(0);
            this.f34416a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14155m invoke() {
            C14151k kVar = this.f34416a;
            return kVar.mo22701a(kVar.getDiContainer());
        }
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14103e
    /* renamed from: a */
    public final boolean mo22662a() {
        C22239d a = C22227b.m41825a(this.f34412d);
        if (a == null) {
            C89219l.m154715b();
        }
        return C67279a.m119196a(a, m25770b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C14155m mo22701a(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        return new C14155m(fVar);
    }

    @Override // com.bytedance.creativex.recorder.p938a.p939a.AbstractC14103e
    /* renamed from: a */
    public final void mo22661a(boolean z) {
        C22239d a = C22227b.m41825a(this.f34412d);
        if (a == null) {
            C89219l.m154715b();
        }
        if (z && !C67279a.m119196a(a, m25770b())) {
            this.f34411c.setValue(true);
            AbstractC14315b bVar = (AbstractC14315b) this.f34413e.mo23374a(this, f34409a[0]);
            if (bVar != null) {
                C14316c.m26118a(bVar, true);
            }
            a.mo36531a(m25770b(), new C22154f.C22155a().mo36336a().mo36337a(new C14152a()).mo36338b());
        } else if (C67279a.m119196a(a, m25770b())) {
            this.f34411c.setValue(false);
            a.mo36524E();
        }
    }

    public C14151k(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f34412d = bVar;
        this.f34415g = fVar;
    }
}
