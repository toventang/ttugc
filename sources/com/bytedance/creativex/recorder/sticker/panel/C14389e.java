package com.bytedance.creativex.recorder.sticker.panel;

import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.sticker.panel.e */
public class C14389e extends AbstractC23520b<RecordStickerPanelViewModel> implements AbstractC21566a {

    /* renamed from: a */
    public final AbstractC14330a f34826a = ((AbstractC14330a) getDiContainer().mo35248a(AbstractC14330a.class, (String) null));

    /* renamed from: b */
    public final C14390a f34827b;

    /* renamed from: c */
    private final AbstractC14177d f34828c = ((AbstractC14177d) getDiContainer().mo35248a(AbstractC14177d.class, (String) null));

    /* renamed from: d */
    private final AbstractC89244h f34829d;

    /* renamed from: e */
    private final AbstractC89171a<RecordStickerPanelViewModel> f34830e;

    /* renamed from: f */
    private final C21582f f34831f;

    /* renamed from: k */
    private final AbstractC22186b f34832k;

    /* renamed from: l */
    private final int f34833l;

    static {
        Covode.recordClassIndex(16464);
    }

    /* renamed from: a */
    public final AbstractC14379b mo23200a() {
        return (AbstractC14379b) this.f34829d.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<RecordStickerPanelViewModel> mo23031b() {
        return this.f34830e;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f34832k;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f34831f;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        mo23200a().mo23196c();
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.e$a */
    public static final class C14390a {

        /* renamed from: a */
        public AbstractC89172b<? super Boolean, Boolean> f34834a;

        /* renamed from: b */
        public AbstractC89171a<Boolean> f34835b;

        /* renamed from: c */
        public AbstractC14380c f34836c;

        /* renamed from: d */
        public boolean f34837d;

        static {
            Covode.recordClassIndex(16465);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14390a)) {
                return false;
            }
            C14390a aVar = (C14390a) obj;
            return C89219l.m154714a(this.f34834a, aVar.f34834a) && C89219l.m154714a(this.f34835b, aVar.f34835b) && C89219l.m154714a(this.f34836c, aVar.f34836c) && this.f34837d == aVar.f34837d;
        }

        public final int hashCode() {
            AbstractC89172b<? super Boolean, Boolean> bVar = this.f34834a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            AbstractC89171a<Boolean> aVar = this.f34835b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            AbstractC14380c cVar = this.f34836c;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f34837d;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public final String toString() {
            return "Config(onShowHideInterceptor=" + this.f34834a + ", onBackKeyInterceptor=" + this.f34835b + ", stickerPanelSceneFactory=" + this.f34836c + ", ensureSetupOnRecordFirstFrameDone=" + this.f34837d + ")";
        }

        private C14390a() {
            this.f34834a = null;
            this.f34835b = null;
            this.f34836c = null;
            this.f34837d = false;
        }

        public /* synthetic */ C14390a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.e$d */
    static final class C14393d extends AbstractC89220m implements AbstractC89171a<RecordStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ C14389e f34840a;

        static {
            Covode.recordClassIndex(16468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14393d(C14389e eVar) {
            super(0);
            this.f34840a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecordStickerPanelViewModel invoke() {
            return new RecordStickerPanelViewModel(this.f34840a.f34826a, this.f34840a.f34827b);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.e$c */
    static final class C14392c extends AbstractC89220m implements AbstractC89171a<AbstractC14379b> {

        /* renamed from: a */
        final /* synthetic */ C14389e f34839a;

        static {
            Covode.recordClassIndex(16467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14392c(C14389e eVar) {
            super(0);
            this.f34839a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC14379b invoke() {
            AbstractC14380c cVar = this.f34839a.f34827b.f34836c;
            if (cVar == null) {
                cVar = new C14378a(this.f34839a.getDiContainer(), (byte) 0);
            }
            return cVar.mo23192a();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        mo23200a().mo23194a(this.f34826a);
        mo23200a().mo23195b();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        this.f34832k.mo36387a(this.f34833l, mo23200a().mo23193a(), "RecordStickerPanelScene");
        if (this.f34827b.f34837d) {
            this.f34828c.mo22814e().mo7036a(this, new C14391b(this));
        } else {
            mo23200a().mo23194a(this.f34826a);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.e$b */
    static final class C14391b<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C14389e f34838a;

        static {
            Covode.recordClassIndex(16466);
        }

        C14391b(C14389e eVar) {
            this.f34838a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            C89219l.m154716b(bool2, "");
            if (bool2.booleanValue()) {
                this.f34838a.mo23200a().mo23194a(this.f34838a.f34826a);
            }
        }
    }

    public C14389e(C21582f fVar, AbstractC22186b bVar, int i, AbstractC89172b<? super C14390a, C89391z> bVar2) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f34831f = fVar;
        this.f34832k = bVar;
        this.f34833l = i;
        C14390a aVar = new C14390a((byte) 0);
        this.f34827b = aVar;
        if (bVar2 != null) {
            bVar2.invoke(aVar);
        }
        this.f34829d = C89250i.m154773a((AbstractC89171a) new C14392c(this));
        this.f34830e = new C14393d(this);
    }
}
