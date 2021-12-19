package com.p2082ss.android.ugc.gamora.editor.music;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20522l;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel */
public final class EditMusicViewModel extends LifecycleAwareViewModel<EditMusicState> implements AbstractC1204m, AbstractC82427a {

    /* renamed from: a */
    private boolean f184351a;

    static {
        Covode.recordClassIndex(96256);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a
    /* renamed from: a */
    public final void mo127535a() {
        mo33689c(C82418b.f184353a);
    }

    /* renamed from: b */
    public final void mo127540b() {
        mo33689c(C82422f.f184357a);
        this.f184351a = false;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditMusicState(null, null, null, null, null, null, null, null, false, null, null, null, null, 8191, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a
    /* renamed from: a */
    public final void mo127536a(float f) {
        mo33689c(new C82417a(f));
    }

    /* renamed from: c */
    public final void mo127543c(boolean z) {
        mo33690d(new C82420d(z));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a
    /* renamed from: a */
    public final void mo127537a(int i) {
        mo33689c(new C82419c(i));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a
    /* renamed from: b */
    public final void mo127541b(C69905c cVar) {
        C89219l.m154721d(cVar, "");
        mo33689c(new C82425i(cVar));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel$a */
    static final class C82417a extends AbstractC89220m implements AbstractC89172b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ float f184352a;

        static {
            Covode.recordClassIndex(96257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82417a(float f) {
            super(1);
            this.f184352a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, null, false, null, new C20522l(this.f184352a), null, null, 7167, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel$b */
    static final class C82418b extends AbstractC89220m implements AbstractC89172b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        public static final C82418b f184353a = new C82418b();

        static {
            Covode.recordClassIndex(96258);
        }

        C82418b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, new C20526p(), false, null, null, null, null, 8063, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel$c */
    static final class C82419c extends AbstractC89220m implements AbstractC89172b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ int f184354a;

        static {
            Covode.recordClassIndex(96259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82419c(int i) {
            super(1);
            this.f184354a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, new C20523m(this.f184354a), null, null, null, null, null, null, false, null, null, null, null, 8189, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel$d */
    static final class C82420d extends AbstractC89220m implements AbstractC89172b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ boolean f184355a;

        static {
            Covode.recordClassIndex(96260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82420d(boolean z) {
            super(1);
            this.f184355a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, null, false, null, null, new C20521k(this.f184355a), null, 6143, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel$e */
    static final class C82421e extends AbstractC89220m implements AbstractC89172b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ boolean f184356a;

        static {
            Covode.recordClassIndex(96261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82421e(boolean z) {
            super(1);
            this.f184356a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, Boolean.valueOf(this.f184356a), null, null, null, null, null, null, null, false, null, null, null, null, 8190, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel$f */
    static final class C82422f extends AbstractC89220m implements AbstractC89172b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        public static final C82422f f184357a = new C82422f();

        static {
            Covode.recordClassIndex(96262);
        }

        C82422f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, null, false, null, null, null, new AbstractC23517a.C23518a(), 4095, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel$g */
    public static final class C82423g extends AbstractC89220m implements AbstractC89172b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        public static final C82423g f184358a = new C82423g();

        static {
            Covode.recordClassIndex(96263);
        }

        C82423g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, null, false, new C20526p(), null, null, null, 7679, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel$h */
    static final class C82424h extends AbstractC89220m implements AbstractC89172b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ C69905c f184359a;

        static {
            Covode.recordClassIndex(96264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82424h(C69905c cVar) {
            super(1);
            this.f184359a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, new C20365ac(this.f184359a), null, null, false, null, null, null, null, 8159, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel$i */
    static final class C82425i extends AbstractC89220m implements AbstractC89172b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ C69905c f184360a;

        static {
            Covode.recordClassIndex(96265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82425i(C69905c cVar) {
            super(1);
            this.f184360a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, this.f184360a, null, null, null, null, null, false, null, null, null, null, 8187, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicViewModel$j */
    static final class C82426j extends AbstractC89220m implements AbstractC89172b<EditMusicState, EditMusicState> {

        /* renamed from: a */
        final /* synthetic */ boolean f184361a;

        static {
            Covode.recordClassIndex(96266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82426j(boolean z) {
            super(1);
            this.f184361a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditMusicState invoke(EditMusicState editMusicState) {
            EditMusicState editMusicState2 = editMusicState;
            C89219l.m154721d(editMusicState2, "");
            return EditMusicState.copy$default(editMusicState2, null, null, null, null, null, null, null, null, this.f184361a, null, null, null, new AbstractC23517a.C23519b(), 3839, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a
    /* renamed from: a */
    public final void mo127538a(C69905c cVar) {
        mo33690d(new C82424h(cVar));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a
    /* renamed from: b */
    public final void mo127542b(boolean z) {
        mo33689c(new C82426j(z));
        this.f184351a = true;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a
    /* renamed from: a */
    public final void mo127539a(boolean z) {
        mo33689c(new C82421e(z));
    }
}
