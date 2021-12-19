package com.p2082ss.android.ugc.gamora.editor.filter.indicator;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorViewModel */
public final class EditFilterIndicatorViewModel extends LifecycleAwareViewModel<EditFilterIndicatorState> implements AbstractC82237a {

    /* renamed from: a */
    public boolean f183972a;

    /* renamed from: b */
    public boolean f183973b = true;

    static {
        Covode.recordClassIndex(96066);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a
    /* renamed from: a */
    public final void mo127416a() {
        mo33690d(C82236b.f183977a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditFilterIndicatorState(true, true, null, null, 12, null);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorViewModel$a */
    static final class C82235a extends AbstractC89220m implements AbstractC89172b<EditFilterIndicatorState, EditFilterIndicatorState> {

        /* renamed from: a */
        final /* synthetic */ boolean f183974a;

        /* renamed from: b */
        final /* synthetic */ FilterBean f183975b;

        /* renamed from: c */
        final /* synthetic */ boolean f183976c = true;

        static {
            Covode.recordClassIndex(96067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82235a(boolean z, FilterBean filterBean, boolean z2) {
            super(1);
            this.f183974a = z;
            this.f183975b = filterBean;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditFilterIndicatorState invoke(EditFilterIndicatorState editFilterIndicatorState) {
            EditFilterIndicatorState editFilterIndicatorState2 = editFilterIndicatorState;
            C89219l.m154721d(editFilterIndicatorState2, "");
            return EditFilterIndicatorState.copy$default(editFilterIndicatorState2, this.f183974a, this.f183976c, this.f183975b, null, 8, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorViewModel$b */
    static final class C82236b extends AbstractC89220m implements AbstractC89172b<EditFilterIndicatorState, EditFilterIndicatorState> {

        /* renamed from: a */
        public static final C82236b f183977a = new C82236b();

        static {
            Covode.recordClassIndex(96068);
        }

        C82236b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditFilterIndicatorState invoke(EditFilterIndicatorState editFilterIndicatorState) {
            EditFilterIndicatorState editFilterIndicatorState2 = editFilterIndicatorState;
            C89219l.m154721d(editFilterIndicatorState2, "");
            return EditFilterIndicatorState.copy$default(editFilterIndicatorState2, false, false, null, new AbstractC23517a.C23519b(), 7, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.indicator.AbstractC82237a
    /* renamed from: a */
    public final void mo127417a(boolean z, FilterBean filterBean) {
        this.f183972a = z;
        this.f183973b = true;
        mo33689c(new C82235a(z, filterBean, true));
    }
}
