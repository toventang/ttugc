package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4034a;

import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.p2082ss.android.ugc.aweme.sticker.C75673r;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.C77092n;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b */
public final class C76856b extends AbstractC2562j<AbstractC76855a> implements AbstractC21566a, AbstractC76855a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172481a = {new C89232y(C76856b.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0)};

    /* renamed from: b */
    final AbstractC89244h f172482b = C89250i.m154774a(EnumC89331m.NONE, new C76857a(this));

    /* renamed from: c */
    final AbstractC89248d f172483c = C21572a.m40504a(getDiContainer(), AbstractC14552j.class);

    /* renamed from: d */
    public final AbstractC76855a f172484d = this;

    /* renamed from: e */
    private final AbstractC89244h f172485e = C89250i.m154773a((AbstractC89171a) new C76859c(this));

    /* renamed from: f */
    private final C21582f f172486f;

    static {
        Covode.recordClassIndex(89852);
    }

    /* renamed from: a */
    private final C76860c m134474a() {
        return (C76860c) this.f172485e.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC76855a getApiComponent() {
        return this.f172484d;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172486f;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b$a */
    public static final class C76857a extends AbstractC89220m implements AbstractC89171a<AbstractC77066d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172487a;

        static {
            Covode.recordClassIndex(89853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76857a(AbstractC21566a aVar) {
            super(0);
            this.f172487a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172487a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> r1 = com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4034a.C76856b.C76857a.invoke():com.bytedance.als.b");
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        m134474a().f172490a = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b$b */
    public static final class C76858b implements C75673r.AbstractC75674a {

        /* renamed from: a */
        final /* synthetic */ C76856b f172488a;

        static {
            Covode.recordClassIndex(89854);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.C75673r.AbstractC75674a
        /* renamed from: a */
        public final void mo119404a() {
            ((AbstractC77066d) this.f172488a.f172482b.getValue()).mo120597a(new C77092n(4, "slide_up"));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76858b(C76856b bVar) {
            this.f172488a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.a.b$c */
    static final class C76859c extends AbstractC89220m implements AbstractC89171a<C76860c> {

        /* renamed from: a */
        final /* synthetic */ C76856b f172489a;

        static {
            Covode.recordClassIndex(89855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76859c(C76856b bVar) {
            super(0);
            this.f172489a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76860c invoke() {
            C76856b bVar = this.f172489a;
            return new C76860c((AbstractC14552j) bVar.f172483c.mo23374a(bVar, C76856b.f172481a[0]));
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        m134474a().f172490a = new C76858b(this);
        C76860c a = m134474a();
        a.f172492c.mo23383a(new C14544f(0, a.mo120469f()));
    }

    @Override // com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4034a.AbstractC76855a
    /* renamed from: a */
    public final void mo120468a(boolean z) {
        C76860c a = m134474a();
        a.f172491b = z;
        a.mo120469f().f172495b = z;
    }

    public C76856b(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172486f = fVar;
    }
}
