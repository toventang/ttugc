package com.p2082ss.android.ugc.gamora.editor.subtitle;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.property.C65429dl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.AbstractC73198a;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73234m;
import com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73248n;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.subtitle.EditSubtitleViewModel */
public final class EditSubtitleViewModel extends LifecycleAwareViewModel<EditSubtitleState> implements AbstractC83094e {

    /* renamed from: a */
    public final C2560h<List<C75313h>> f185620a;

    /* renamed from: b */
    public final C2559g<C89391z> f185621b;

    /* renamed from: c */
    public AbstractC73198a f185622c;

    /* renamed from: d */
    private final C1213t<Boolean> f185623d = new C1213t<>();

    /* renamed from: e */
    private final C2564l<List<C75313h>> f185624e;

    /* renamed from: f */
    private final C2563k<C89391z> f185625f;

    static {
        Covode.recordClassIndex(96942);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e
    /* renamed from: a */
    public final C2560h<List<C75313h>> mo128162a() {
        return this.f185620a;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e
    /* renamed from: i */
    public final LiveData<Boolean> mo128172i() {
        return this.f185623d;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e
    /* renamed from: b */
    public final void mo128166b() {
        mo33689c(C83069b.f185627a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e
    /* renamed from: c */
    public final void mo128167c() {
        mo33689c(C83068a.f185626a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditSubtitleState(null, null, 3, null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e
    /* renamed from: e */
    public final void mo128168e() {
        this.f185625f.mo6999a((C89391z) null);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e
    /* renamed from: f */
    public final void mo128169f() {
        AbstractC73198a aVar = this.f185622c;
        if (aVar != null) {
            aVar.mo115738c();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e
    /* renamed from: g */
    public final void mo128170g() {
        AbstractC73198a aVar = this.f185622c;
        if (aVar != null) {
            aVar.mo115740d();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e
    /* renamed from: h */
    public final boolean mo128171h() {
        AbstractC73198a aVar = this.f185622c;
        if (aVar == null || !aVar.mo115741e()) {
            return false;
        }
        return true;
    }

    public EditSubtitleViewModel() {
        C2564l<List<C75313h>> lVar = new C2564l<>(null);
        this.f185624e = lVar;
        this.f185620a = lVar;
        C2563k<C89391z> kVar = new C2563k<>();
        this.f185625f = kVar;
        this.f185621b = kVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e
    /* renamed from: a */
    public final void mo128164a(List<C75313h> list) {
        this.f185624e.mo7019b(list);
    }

    /* renamed from: a */
    public final void mo128165a(boolean z) {
        this.f185623d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.EditSubtitleViewModel$a */
    static final class C83068a extends AbstractC89220m implements AbstractC89172b<EditSubtitleState, EditSubtitleState> {

        /* renamed from: a */
        public static final C83068a f185626a = new C83068a();

        static {
            Covode.recordClassIndex(96943);
        }

        C83068a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditSubtitleState invoke(EditSubtitleState editSubtitleState) {
            EditSubtitleState editSubtitleState2 = editSubtitleState;
            C89219l.m154721d(editSubtitleState2, "");
            return EditSubtitleState.copy$default(editSubtitleState2, new AbstractC23517a.C23518a(), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.subtitle.EditSubtitleViewModel$b */
    static final class C83069b extends AbstractC89220m implements AbstractC89172b<EditSubtitleState, EditSubtitleState> {

        /* renamed from: a */
        public static final C83069b f185627a = new C83069b();

        static {
            Covode.recordClassIndex(96944);
        }

        C83069b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditSubtitleState invoke(EditSubtitleState editSubtitleState) {
            EditSubtitleState editSubtitleState2 = editSubtitleState;
            C89219l.m154721d(editSubtitleState2, "");
            return EditSubtitleState.copy$default(editSubtitleState2, new AbstractC23517a.C23519b(), null, 2, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.subtitle.AbstractC83094e
    /* renamed from: a */
    public final void mo128163a(VideoPublishEditModel videoPublishEditModel, int i) {
        AbstractC73198a nVar;
        C89219l.m154721d(videoPublishEditModel, "");
        if (C65429dl.m117146a()) {
            nVar = new C73234m(videoPublishEditModel, i);
        } else {
            nVar = new C73248n(videoPublishEditModel, i);
        }
        this.f185622c = nVar;
    }
}
