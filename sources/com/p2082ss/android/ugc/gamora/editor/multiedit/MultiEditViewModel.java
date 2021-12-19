package com.p2082ss.android.ugc.gamora.editor.multiedit;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.View$OnClickListenerC71465f;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel */
public final class MultiEditViewModel extends LifecycleAwareViewModel<MultiEditState> implements AbstractC82403a {

    /* renamed from: a */
    private final C1213t<Boolean> f184316a = new C1213t<>();

    /* renamed from: b */
    private final C1213t<Boolean> f184317b = new C1213t<>();

    /* renamed from: c */
    private final View$OnClickListenerC71465f f184318c;

    static {
        Covode.recordClassIndex(96238);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a
    /* renamed from: c */
    public final LiveData<Boolean> mo127498c() {
        return this.f184316a;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a
    /* renamed from: e */
    public final LiveData<Boolean> mo127499e() {
        return this.f184317b;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a
    /* renamed from: a */
    public final void mo127493a() {
        mo33690d(C82401a.f184319a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a
    /* renamed from: b */
    public final boolean mo127497b() {
        return this.f184318c.f160145t.f160068f;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new MultiEditState(null, null, null, 7, null);
    }

    /* renamed from: a */
    public final void mo127494a(boolean z) {
        this.f184316a.setValue(Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final void mo127496b(boolean z) {
        this.f184317b.setValue(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel$a */
    static final class C82401a extends AbstractC89220m implements AbstractC89172b<MultiEditState, MultiEditState> {

        /* renamed from: a */
        public static final C82401a f184319a = new C82401a();

        static {
            Covode.recordClassIndex(96239);
        }

        C82401a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ MultiEditState invoke(MultiEditState multiEditState) {
            MultiEditState multiEditState2 = multiEditState;
            C89219l.m154721d(multiEditState2, "");
            return MultiEditState.copy$default(multiEditState2, null, null, new AbstractC23517a.C23519b(), 3, null);
        }
    }

    public MultiEditViewModel(View$OnClickListenerC71465f fVar) {
        C89219l.m154721d(fVar, "");
        this.f184318c = fVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel$b */
    static final class C82402b extends AbstractC89220m implements AbstractC89172b<MultiEditState, MultiEditState> {

        /* renamed from: a */
        final /* synthetic */ boolean f184320a;

        /* renamed from: b */
        final /* synthetic */ boolean f184321b;

        static {
            Covode.recordClassIndex(96240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82402b(boolean z, boolean z2) {
            super(1);
            this.f184320a = z;
            this.f184321b = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ MultiEditState invoke(MultiEditState multiEditState) {
            MultiEditState multiEditState2 = multiEditState;
            C89219l.m154721d(multiEditState2, "");
            return MultiEditState.copy$default(multiEditState2, new C89378p(Boolean.valueOf(this.f184320a), Boolean.valueOf(this.f184321b)), null, null, 6, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.multiedit.AbstractC82403a
    /* renamed from: a */
    public final void mo127495a(boolean z, boolean z2) {
        mo33690d(new C82402b(z, z2));
    }
}
