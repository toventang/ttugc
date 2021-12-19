package com.p2082ss.android.ugc.gamora.editor.gesture;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20525o;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel */
public final class EditGestureViewModel extends LifecycleAwareViewModel<EditGestureState> implements AbstractC82254a {

    /* renamed from: a */
    private final AbstractC89244h f184006a = C89250i.m154773a((AbstractC89171a) C82250b.f184009a);

    static {
        Covode.recordClassIndex(96082);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel$b */
    static final class C82250b extends AbstractC89220m implements AbstractC89171a<C1213t<FilterBean>> {

        /* renamed from: a */
        public static final C82250b f184009a = new C82250b();

        static {
            Covode.recordClassIndex(96084);
        }

        C82250b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<FilterBean> invoke() {
            return new C1213t();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.gesture.AbstractC82254a
    /* renamed from: a */
    public final void mo127430a() {
        mo33690d(C82252d.f184011a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditGestureState(null, null, null, null, 15, null);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel$c */
    public static final class C82251c extends AbstractC89220m implements AbstractC89172b<EditGestureState, EditGestureState> {

        /* renamed from: a */
        final /* synthetic */ boolean f184010a;

        static {
            Covode.recordClassIndex(96085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82251c(boolean z) {
            super(1);
            this.f184010a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditGestureState invoke(EditGestureState editGestureState) {
            EditGestureState editGestureState2 = editGestureState;
            C89219l.m154721d(editGestureState2, "");
            return EditGestureState.copy$default(editGestureState2, Boolean.valueOf(this.f184010a), null, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel$d */
    static final class C82252d extends AbstractC89220m implements AbstractC89172b<EditGestureState, EditGestureState> {

        /* renamed from: a */
        public static final C82252d f184011a = new C82252d();

        static {
            Covode.recordClassIndex(96086);
        }

        C82252d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditGestureState invoke(EditGestureState editGestureState) {
            EditGestureState editGestureState2 = editGestureState;
            C89219l.m154721d(editGestureState2, "");
            return EditGestureState.copy$default(editGestureState2, null, null, null, new AbstractC23517a.C23519b(), 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel$a */
    public static final class C82249a extends AbstractC89220m implements AbstractC89172b<EditGestureState, EditGestureState> {

        /* renamed from: a */
        final /* synthetic */ float f184007a;

        /* renamed from: b */
        final /* synthetic */ long f184008b = 300;

        static {
            Covode.recordClassIndex(96083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82249a(float f) {
            super(1);
            this.f184007a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditGestureState invoke(EditGestureState editGestureState) {
            EditGestureState editGestureState2 = editGestureState;
            C89219l.m154721d(editGestureState2, "");
            return EditGestureState.copy$default(editGestureState2, null, new C20524n(new C89378p(Float.valueOf(this.f184007a), Long.valueOf(this.f184008b))), null, null, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.gesture.EditGestureViewModel$e */
    public static final class C82253e extends AbstractC89220m implements AbstractC89172b<EditGestureState, EditGestureState> {

        /* renamed from: a */
        final /* synthetic */ float f184012a;

        /* renamed from: b */
        final /* synthetic */ float f184013b;

        /* renamed from: c */
        final /* synthetic */ float f184014c;

        static {
            Covode.recordClassIndex(96087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82253e(float f, float f2, float f3) {
            super(1);
            this.f184012a = f;
            this.f184013b = f2;
            this.f184014c = f3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditGestureState invoke(EditGestureState editGestureState) {
            EditGestureState editGestureState2 = editGestureState;
            C89219l.m154721d(editGestureState2, "");
            return EditGestureState.copy$default(editGestureState2, null, null, new C20525o(new C89386u(Float.valueOf(this.f184012a), Float.valueOf(this.f184013b), Float.valueOf(this.f184014c))), null, 11, null);
        }
    }
}
