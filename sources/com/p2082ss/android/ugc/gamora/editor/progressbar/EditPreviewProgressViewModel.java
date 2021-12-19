package com.p2082ss.android.ugc.gamora.editor.progressbar;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel */
public final class EditPreviewProgressViewModel extends LifecycleAwareViewModel<EditPreviewProgressState> implements AbstractC82503a {

    /* renamed from: c */
    public static final C82497a f184497c = new C82497a((byte) 0);

    /* renamed from: b */
    public final LiveData<C89378p<Integer, Integer>> f184498b;

    /* renamed from: d */
    private final C1213t<Boolean> f184499d;

    /* renamed from: e */
    private final LiveData<Boolean> f184500e;

    /* renamed from: f */
    private final C1213t<C89378p<Integer, Integer>> f184501f;

    static {
        Covode.recordClassIndex(96340);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel$a */
    public static final class C82497a {
        static {
            Covode.recordClassIndex(96341);
        }

        private C82497a() {
        }

        public /* synthetic */ C82497a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a
    /* renamed from: a */
    public final LiveData<Boolean> mo127585a() {
        return this.f184500e;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a
    /* renamed from: b */
    public final void mo127589b() {
        mo33689c(C82502f.f184507a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a
    /* renamed from: c */
    public final void mo127591c() {
        mo33689c(C82500d.f184504a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a
    /* renamed from: e */
    public final void mo127592e() {
        mo33689c(C82499c.f184503a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditPreviewProgressState(null, null, null, null, 15, null);
    }

    public EditPreviewProgressViewModel() {
        C1213t<Boolean> tVar = new C1213t<>();
        this.f184499d = tVar;
        this.f184500e = tVar;
        C1213t<C89378p<Integer, Integer>> tVar2 = new C1213t<>();
        this.f184501f = tVar2;
        this.f184498b = tVar2;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a
    /* renamed from: a */
    public final void mo127586a(int i) {
        mo33689c(new C82498b(i));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel$b */
    static final class C82498b extends AbstractC89220m implements AbstractC89172b<EditPreviewProgressState, EditPreviewProgressState> {

        /* renamed from: a */
        final /* synthetic */ int f184502a;

        static {
            Covode.recordClassIndex(96342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82498b(int i) {
            super(1);
            this.f184502a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPreviewProgressState invoke(EditPreviewProgressState editPreviewProgressState) {
            EditPreviewProgressState editPreviewProgressState2 = editPreviewProgressState;
            C89219l.m154721d(editPreviewProgressState2, "");
            return EditPreviewProgressState.copy$default(editPreviewProgressState2, null, new C20523m(this.f184502a), null, null, 13, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel$c */
    static final class C82499c extends AbstractC89220m implements AbstractC89172b<EditPreviewProgressState, EditPreviewProgressState> {

        /* renamed from: a */
        public static final C82499c f184503a = new C82499c();

        static {
            Covode.recordClassIndex(96343);
        }

        C82499c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPreviewProgressState invoke(EditPreviewProgressState editPreviewProgressState) {
            EditPreviewProgressState editPreviewProgressState2 = editPreviewProgressState;
            C89219l.m154721d(editPreviewProgressState2, "");
            return EditPreviewProgressState.copy$default(editPreviewProgressState2, null, null, new C20526p(), null, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel$d */
    static final class C82500d extends AbstractC89220m implements AbstractC89172b<EditPreviewProgressState, EditPreviewProgressState> {

        /* renamed from: a */
        public static final C82500d f184504a = new C82500d();

        static {
            Covode.recordClassIndex(96344);
        }

        C82500d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPreviewProgressState invoke(EditPreviewProgressState editPreviewProgressState) {
            EditPreviewProgressState editPreviewProgressState2 = editPreviewProgressState;
            C89219l.m154721d(editPreviewProgressState2, "");
            return EditPreviewProgressState.copy$default(editPreviewProgressState2, new AbstractC23517a.C23518a(), null, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel$f */
    static final class C82502f extends AbstractC89220m implements AbstractC89172b<EditPreviewProgressState, EditPreviewProgressState> {

        /* renamed from: a */
        public static final C82502f f184507a = new C82502f();

        static {
            Covode.recordClassIndex(96346);
        }

        C82502f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPreviewProgressState invoke(EditPreviewProgressState editPreviewProgressState) {
            EditPreviewProgressState editPreviewProgressState2 = editPreviewProgressState;
            C89219l.m154721d(editPreviewProgressState2, "");
            return EditPreviewProgressState.copy$default(editPreviewProgressState2, new AbstractC23517a.C23519b(), null, null, null, 14, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.EditPreviewProgressViewModel$e */
    static final class C82501e extends AbstractC89220m implements AbstractC89172b<EditPreviewProgressState, EditPreviewProgressState> {

        /* renamed from: a */
        final /* synthetic */ int f184505a;

        /* renamed from: b */
        final /* synthetic */ int f184506b;

        static {
            Covode.recordClassIndex(96345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82501e(int i, int i2) {
            super(1);
            this.f184505a = i;
            this.f184506b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPreviewProgressState invoke(EditPreviewProgressState editPreviewProgressState) {
            EditPreviewProgressState editPreviewProgressState2 = editPreviewProgressState;
            C89219l.m154721d(editPreviewProgressState2, "");
            return EditPreviewProgressState.copy$default(editPreviewProgressState2, null, null, null, new C20524n(new C89378p(Integer.valueOf(this.f184505a), Integer.valueOf(this.f184506b))), 7, null);
        }
    }

    /* renamed from: a */
    public final void mo127588a(boolean z) {
        this.f184499d.setValue(Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a
    /* renamed from: a */
    public final void mo127587a(int i, int i2) {
        mo33689c(new C82501e(i, i2));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.progressbar.AbstractC82503a
    /* renamed from: b */
    public final void mo127590b(int i, int i2) {
        this.f184501f.setValue(new C89378p<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
