package com.bytedance.creativex.recorder.filter.panel;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.bytedance.creativex.recorder.filter.panel.C14283c;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50701i;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50828d;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50829e;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.NoSuchElementException;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.creativex.recorder.filter.panel.a */
public class C14277a extends AbstractC23520b<FilterPanelViewModel> implements AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f34594a = {new C89232y(C14277a.class, "context", "getContext()Landroid/app/Activity;", 0)};

    /* renamed from: b */
    public final AbstractC14210a f34595b;

    /* renamed from: c */
    final C14278a f34596c;

    /* renamed from: d */
    public final String f34597d;

    /* renamed from: e */
    public final AbstractC50828d f34598e;

    /* renamed from: f */
    public final AbstractC50701i f34599f;

    /* renamed from: k */
    private final AbstractC89248d f34600k;

    /* renamed from: l */
    private final AbstractC89244h f34601l;

    /* renamed from: m */
    private final AbstractC89244h f34602m;

    /* renamed from: n */
    private final AbstractC89171a<FilterPanelViewModel> f34603n;

    /* renamed from: o */
    private final AbstractC22186b f34604o;

    /* renamed from: p */
    private final C21582f f34605p;

    /* renamed from: q */
    private final int f34606q;

    static {
        Covode.recordClassIndex(16348);
    }

    /* renamed from: f */
    private final C14283c m26008f() {
        return (C14283c) this.f34602m.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C14215e mo23030a() {
        return (C14215e) this.f34601l.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<FilterPanelViewModel> mo23031b() {
        return this.f34603n;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f34604o;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f34605p;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        C14283c f = m26008f();
        f.mo23036a(new C14283c.C14305s(f));
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.a$b */
    static final class C14279b extends AbstractC89220m implements AbstractC89171a<C14283c> {

        /* renamed from: a */
        final /* synthetic */ C14277a f34610a;

        static {
            Covode.recordClassIndex(16350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14279b(C14277a aVar) {
            super(0);
            this.f34610a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14283c invoke() {
            C14277a aVar = this.f34610a;
            return new C14283c(aVar.getDiContainer(), aVar.mo23030a().f34499c, aVar.mo23030a().f34498b, aVar.f34599f, aVar.f34598e, aVar.f34596c.f34608b);
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        C14283c f = m26008f();
        if (f.f34618d) {
            AbstractC50829e eVar = f.f34617c;
            if (eVar == null) {
                C89219l.m154710a("combiner");
            }
            eVar.mo86216c();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        this.f34604o.mo36387a(this.f34606q, m26008f(), "RecordFilterPanelScene");
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.a$c */
    static final class C14280c extends AbstractC89220m implements AbstractC89171a<C14215e> {

        /* renamed from: a */
        final /* synthetic */ C14277a f34611a;

        static {
            Covode.recordClassIndex(16351);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14280c(C14277a aVar) {
            super(0);
            this.f34611a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C14215e invoke() {
            List<C14215e> value = this.f34611a.f34595b.getFilterSources().getValue();
            if (value != null) {
                for (T t : value) {
                    if (C89219l.m154714a((Object) t.f34497a, (Object) this.f34611a.f34597d)) {
                        return t;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            C89219l.m154715b();
            return null;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.a$d */
    static final class C14281d extends AbstractC89220m implements AbstractC89171a<FilterPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ C14277a f34612a;

        static {
            Covode.recordClassIndex(16352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14281d(C14277a aVar) {
            super(0);
            this.f34612a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FilterPanelViewModel invoke() {
            C14277a aVar = this.f34612a;
            return new FilterPanelViewModel((C21582f) aVar.getDiContainer().mo35248a(C21582f.class, (String) null), aVar.mo23030a().f34498b, aVar.mo23030a().f34500d.mo22980a(), aVar.f34596c.f34607a);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.a$a */
    public class C14278a {

        /* renamed from: a */
        public AbstractC89172b<? super Activity, Boolean> f34607a;

        /* renamed from: b */
        public AbstractC89172b<? super C14283c.C14286c, C89391z> f34608b;

        static {
            Covode.recordClassIndex(16349);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        private C14278a() {
            this.f34607a = null;
            this.f34608b = null;
        }

        public /* synthetic */ C14278a(C14277a aVar, byte b) {
            this();
        }
    }

    public /* synthetic */ C14277a(AbstractC22186b bVar, C21582f fVar, AbstractC50828d dVar, AbstractC50701i iVar, AbstractC89172b bVar2) {
        this(bVar, fVar, R.id.dg9, "build_in", dVar, iVar, bVar2);
    }

    private C14277a(AbstractC22186b bVar, C21582f fVar, int i, String str, AbstractC50828d dVar, AbstractC50701i iVar, AbstractC89172b<? super C14278a, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str, "");
        this.f34604o = bVar;
        this.f34605p = fVar;
        this.f34606q = R.id.dg9;
        this.f34597d = str;
        this.f34598e = dVar;
        this.f34599f = iVar;
        this.f34600k = C21572a.m40504a(getDiContainer(), Activity.class);
        this.f34595b = (AbstractC14210a) getDiContainer().mo35248a(AbstractC14210a.class, (String) null);
        this.f34601l = C89250i.m154774a(EnumC89331m.NONE, new C14280c(this));
        this.f34602m = C89250i.m154774a(EnumC89331m.NONE, new C14279b(this));
        this.f34603n = new C14281d(this);
        C14278a aVar = new C14278a(this, (byte) 0);
        this.f34596c = aVar;
        if (bVar2 != null) {
            bVar2.invoke(aVar);
        }
    }
}
