package com.bytedance.creativex.recorder.sticker.panel;

import androidx.lifecycle.C1213t;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c;
import com.bytedance.creativex.recorder.sticker.panel.C14389e;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class RecordStickerPanelViewModel extends LifecycleAwareViewModel<StickerPanelState> implements AbstractC14333c {

    /* renamed from: a */
    public final C1213t<Boolean> f34797a = new C1213t<>();

    /* renamed from: b */
    final AbstractC14330a f34798b;

    /* renamed from: c */
    final C14389e.C14390a f34799c;

    /* renamed from: d */
    private final AbstractC89244h f34800d = C89250i.m154773a((AbstractC89171a) C14377c.f34804a);

    static {
        Covode.recordClassIndex(16448);
    }

    /* renamed from: a */
    private final HashSet<AbstractC14394f> m26232a() {
        return (HashSet) this.f34800d.getValue();
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel$c */
    static final class C14377c extends AbstractC89220m implements AbstractC89171a<HashSet<AbstractC14394f>> {

        /* renamed from: a */
        public static final C14377c f34804a = new C14377c();

        static {
            Covode.recordClassIndex(16451);
        }

        C14377c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<AbstractC14394f> invoke() {
            return new HashSet();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new StickerPanelState(null, 1, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        this.f34798b.mo23116a().mo6997a(this, new C14375a(this));
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel$a */
    static final class C14375a<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ RecordStickerPanelViewModel f34801a;

        static {
            Covode.recordClassIndex(16449);
        }

        C14375a(RecordStickerPanelViewModel recordStickerPanelViewModel) {
            this.f34801a = recordStickerPanelViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            RecordStickerPanelViewModel recordStickerPanelViewModel = this.f34801a;
            C89219l.m154716b(bool2, "");
            recordStickerPanelViewModel.mo23139a(bool2.booleanValue());
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c
    /* renamed from: a */
    public final void mo23138a(AbstractC14394f fVar) {
        C89219l.m154721d(fVar, "");
        m26232a().add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel$b */
    public static final class C14376b extends AbstractC89220m implements AbstractC89172b<StickerPanelState, StickerPanelState> {

        /* renamed from: a */
        final /* synthetic */ RecordStickerPanelViewModel f34802a;

        /* renamed from: b */
        final /* synthetic */ boolean f34803b;

        static {
            Covode.recordClassIndex(16450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14376b(RecordStickerPanelViewModel recordStickerPanelViewModel, boolean z) {
            super(1);
            this.f34802a = recordStickerPanelViewModel;
            this.f34803b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ StickerPanelState invoke(StickerPanelState stickerPanelState) {
            AbstractC23517a aVar;
            StickerPanelState stickerPanelState2 = stickerPanelState;
            C89219l.m154721d(stickerPanelState2, "");
            if (this.f34803b) {
                aVar = new AbstractC23517a.C23519b();
                this.f34802a.f34797a.setValue(true);
            } else {
                aVar = new AbstractC23517a.C23518a();
                this.f34802a.f34797a.setValue(false);
            }
            return stickerPanelState2.copy(aVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c
    /* renamed from: a */
    public final void mo23139a(boolean z) {
        AbstractC89172b<? super Boolean, Boolean> bVar = this.f34799c.f34834a;
        if (bVar == null || !bVar.invoke(Boolean.valueOf(z)).booleanValue()) {
            if (z) {
                HashSet<AbstractC14394f> a = m26232a();
                if (!(a instanceof Collection) || !a.isEmpty()) {
                    Iterator<T> it = a.iterator();
                    while (it.hasNext()) {
                        if (it.next().mo23204a()) {
                            return;
                        }
                    }
                }
            }
            mo33690d(new C14376b(this, z));
        }
    }

    public RecordStickerPanelViewModel(AbstractC14330a aVar, C14389e.C14390a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f34798b = aVar;
        this.f34799c = aVar2;
    }
}
