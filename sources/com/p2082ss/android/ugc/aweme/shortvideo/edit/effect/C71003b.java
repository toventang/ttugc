package com.p2082ss.android.ugc.aweme.shortvideo.edit.effect;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.effect.C46267ac;
import com.p2082ss.android.ugc.aweme.effect.C46358h;
import com.p2082ss.android.ugc.aweme.effect.C46392y;
import com.p2082ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.b */
public final class C71003b extends AbstractC23520b<EditEffectViewModel> implements AbstractC21566a {

    /* renamed from: a */
    final AbstractC22186b f158933a;

    /* renamed from: b */
    public final int f158934b = R.id.c7m;

    /* renamed from: c */
    private final AbstractC89244h f158935c = C89250i.m154773a((AbstractC89171a) new C71004a(this));

    /* renamed from: d */
    private final AbstractC89171a<EditEffectViewModel> f158936d = C71005b.f158939a;

    /* renamed from: e */
    private final C21582f f158937e;

    static {
        Covode.recordClassIndex(83499);
    }

    /* renamed from: a */
    private final C71006c m125366a() {
        return (C71006c) this.f158935c.getValue();
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<EditEffectViewModel> mo23031b() {
        return this.f158936d;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f158933a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f158937e;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.b$b */
    static final class C71005b extends AbstractC89220m implements AbstractC89171a<EditEffectViewModel> {

        /* renamed from: a */
        public static final C71005b f158939a = new C71005b();

        static {
            Covode.recordClassIndex(83501);
        }

        C71005b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditEffectViewModel invoke() {
            return new EditEffectViewModel();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        m125366a().mo112161b().f107862W.mo78626c().setValue(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.effect.b$a */
    static final class C71004a extends AbstractC89220m implements AbstractC89171a<C71006c> {

        /* renamed from: a */
        final /* synthetic */ C71003b f158938a;

        static {
            Covode.recordClassIndex(83500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71004a(C71003b bVar) {
            super(0);
            this.f158938a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71006c invoke() {
            C71006c cVar = new C71006c();
            Activity activity = this.f158938a.f158933a.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C46358h hVar = new C46358h((ActivityC0945e) activity);
            C89219l.m154721d(hVar, "");
            C46267ac b = cVar.mo112161b();
            b.f107863X = hVar;
            b.f107862W = (EditEffectVideoModel) C1181ae.m3881a(hVar.mo78849a(), (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            b.f107862W.mo78624a(b.f107863X);
            this.f158938a.f158933a.mo36387a(this.f158938a.f158934b, cVar, "EditEffectScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        C71006c a = m125366a();
        C46267ac b = a.mo112161b();
        boolean z = !a.mo112160a().mo77641p();
        b.f107862W.mo78626c().setValue(true);
        b.f107862W.f107781b = z;
        if (b.f107849J.f108067a != null && (b.f107849J.f108067a instanceof C46392y)) {
            if (b.f107874b.captionStruct == null) {
                ((C46392y) b.f107849J.f108067a).mo78879a(z, true);
            } else {
                b.f107893u.setCurrentItem(0);
            }
        }
        if (b.f107874b.isMultiVideoEdit() && (b.f107849J.f108067a instanceof C46392y)) {
            b.mo78762f();
        }
    }

    public C71003b(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f158937e = fVar;
        this.f158933a = bVar;
    }
}
