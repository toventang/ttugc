package com.p2082ss.android.ugc.gamora.editor.gesture;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.gesture.b */
public final class C82255b extends AbstractC23520b<EditGestureViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final int f184015a = R.id.fdd;

    /* renamed from: b */
    private final AbstractC89244h f184016b = C89250i.m154774a(EnumC89331m.NONE, new C82256a(this));

    /* renamed from: c */
    private final AbstractC89244h f184017c = C89250i.m154773a((AbstractC89171a) new C82257b(this));

    /* renamed from: d */
    private final AbstractC89171a<EditGestureViewModel> f184018d = C82258c.f184023a;

    /* renamed from: e */
    private final C21582f f184019e;

    /* renamed from: f */
    private final AbstractC22186b f184020f;

    static {
        Covode.recordClassIndex(96089);
    }

    /* renamed from: a */
    private final C82259c m142294a() {
        return (C82259c) this.f184017c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditGestureViewModel> mo23031b() {
        return this.f184018d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f184020f;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184019e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.b$c */
    static final class C82258c extends AbstractC89220m implements AbstractC89171a<EditGestureViewModel> {

        /* renamed from: a */
        public static final C82258c f184023a = new C82258c();

        static {
            Covode.recordClassIndex(96092);
        }

        C82258c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditGestureViewModel invoke() {
            return new EditGestureViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.b$a */
    public static final class C82256a extends AbstractC89220m implements AbstractC89171a<AbstractC82200a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f184021a;

        static {
            Covode.recordClassIndex(96090);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82256a(AbstractC21566a aVar) {
            super(0);
            this.f184021a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.filter.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f184021a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.core.a> r1 = com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.gesture.C82255b.C82256a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.b$b */
    static final class C82257b extends AbstractC89220m implements AbstractC89171a<C82259c> {

        /* renamed from: a */
        final /* synthetic */ C82255b f184022a;

        static {
            Covode.recordClassIndex(96091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82257b(C82255b bVar) {
            super(0);
            this.f184022a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82259c invoke() {
            Object a = this.f184022a.getDiContainer().mo35247a(AbstractC14552j.class);
            C89219l.m154716b(a, "");
            return new C82259c((AbstractC14552j) a, this.f184022a.getDiContainer());
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        if (this.f184020f.mo36421f(m142294a())) {
            this.f184020f.mo36413d(m142294a());
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        if (!this.f184020f.mo36421f(m142294a())) {
            this.f184020f.mo36387a(this.f184015a, m142294a(), "EditGestureScene");
        }
        ((AbstractC82200a) this.f184016b.getValue()).mo127386a(true);
    }

    public C82255b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184019e = fVar;
        this.f184020f = bVar;
    }
}
