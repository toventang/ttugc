package com.p2082ss.android.ugc.gamora.editor.filter.core;

import android.content.Context;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.p2983c.C50649a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel */
public class EditFilterViewModel extends LifecycleAwareViewModel<EditFilterState> implements AbstractC21566a, AbstractC82200a, AbstractC82208b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f183880a = {new C89232y(EditFilterViewModel.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};

    /* renamed from: b */
    final LiveData<Boolean> f183881b;

    /* renamed from: c */
    public final AbstractC50707o f183882c;

    /* renamed from: d */
    public final AbstractC82208b f183883d;

    /* renamed from: e */
    private final AbstractC89248d f183884e = C21572a.m40504a(getDiContainer(), AbstractC72510a.class);

    /* renamed from: f */
    private final AbstractC89244h f183885f = C89250i.m154773a((AbstractC89171a) new C82193b(this));

    /* renamed from: g */
    private final AbstractC89244h f183886g = C89250i.m154773a((AbstractC89171a) new C82194c(this));

    /* renamed from: l */
    private final C1213t<Boolean> f183887l;

    /* renamed from: m */
    private final C21582f f183888m;

    static {
        Covode.recordClassIndex(96021);
    }

    /* renamed from: h */
    private final AbstractC50706n m142212h() {
        return (AbstractC50706n) this.f183885f.getValue();
    }

    /* renamed from: i */
    private final AbstractC50703k m142213i() {
        return (AbstractC50703k) this.f183886g.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final AbstractC72510a mo127391g() {
        return (AbstractC72510a) this.f183884e.mo23374a(this, f183880a[0]);
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f183888m;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a
    /* renamed from: a */
    public final void mo127384a() {
        mo33689c(C82199g.f183896a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a
    /* renamed from: f */
    public final void mo127390f() {
        mo127391g().mo114826o();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a
    /* renamed from: b */
    public final void mo127387b() {
        mo33689c(new C82198f());
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditFilterState(null, null, null, null, null, 31, null);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel$b */
    static final class C82193b extends AbstractC89220m implements AbstractC89171a<AbstractC50706n> {

        /* renamed from: a */
        final /* synthetic */ EditFilterViewModel f183890a;

        static {
            Covode.recordClassIndex(96023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82193b(EditFilterViewModel editFilterViewModel) {
            super(0);
            this.f183890a = editFilterViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC50706n invoke() {
            AbstractC50706n value = this.f183890a.mo127391g().mo114822k().getValue();
            if (value == null) {
                C89219l.m154715b();
            }
            return value;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel$c */
    static final class C82194c extends AbstractC89220m implements AbstractC89171a<AbstractC50703k> {

        /* renamed from: a */
        final /* synthetic */ EditFilterViewModel f183891a;

        static {
            Covode.recordClassIndex(96024);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82194c(EditFilterViewModel editFilterViewModel) {
            super(0);
            this.f183891a = editFilterViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC50703k invoke() {
            AbstractC50703k value = this.f183891a.mo127391g().mo114823l().getValue();
            if (value == null) {
                C89219l.m154715b();
            }
            return value;
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        this.f183882c.mo86071f().mo86076c().observe(this, new C82195d(this));
        this.f183882c.mo86064a();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a
    /* renamed from: e */
    public final void mo127389e() {
        mo127391g().mo114809b(false);
        mo33689c(C82192a.f183889a);
        this.f183883d.mo88316a(null, false, null);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel$d */
    static final class C82195d<T> implements AbstractC1214u<List<? extends C89378p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>>> {

        /* renamed from: a */
        final /* synthetic */ EditFilterViewModel f183892a;

        static {
            Covode.recordClassIndex(96025);
        }

        C82195d(EditFilterViewModel editFilterViewModel) {
            this.f183892a = editFilterViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends C89378p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list) {
            final List<? extends C89378p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list2 = list;
            this.f183892a.mo33690d(new AbstractC89172b<EditFilterState, EditFilterState>() {
                /* class com.p2082ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel.C82195d.C821961 */

                static {
                    Covode.recordClassIndex(96026);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ EditFilterState invoke(EditFilterState editFilterState) {
                    EditFilterState editFilterState2 = editFilterState;
                    C89219l.m154721d(editFilterState2, "");
                    return EditFilterState.copy$default(editFilterState2, null, null, null, C50687a.m94982b(list2), null, 23, null);
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
    /* renamed from: a */
    public final void mo88315a(float f) {
        this.f183883d.mo88315a(f);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel$a */
    static final class C82192a extends AbstractC89220m implements AbstractC89172b<EditFilterState, EditFilterState> {

        /* renamed from: a */
        public static final C82192a f183889a = new C82192a();

        static {
            Covode.recordClassIndex(96022);
        }

        C82192a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditFilterState invoke(EditFilterState editFilterState) {
            EditFilterState editFilterState2 = editFilterState;
            C89219l.m154721d(editFilterState2, "");
            return EditFilterState.copy$default(editFilterState2, null, new C20391d(null), new C20526p(), null, null, 25, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel$e */
    static final class C82197e extends AbstractC89220m implements AbstractC89172b<EditFilterState, EditFilterState> {

        /* renamed from: a */
        final /* synthetic */ FilterBean f183894a;

        static {
            Covode.recordClassIndex(96027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82197e(FilterBean filterBean) {
            super(1);
            this.f183894a = filterBean;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditFilterState invoke(EditFilterState editFilterState) {
            EditFilterState editFilterState2 = editFilterState;
            C89219l.m154721d(editFilterState2, "");
            return EditFilterState.copy$default(editFilterState2, null, new C20391d(this.f183894a), null, null, null, 29, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel$f */
    static final class C82198f extends AbstractC89220m implements AbstractC89172b<EditFilterState, EditFilterState> {

        /* renamed from: a */
        final /* synthetic */ boolean f183895a = true;

        static {
            Covode.recordClassIndex(96028);
        }

        C82198f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditFilterState invoke(EditFilterState editFilterState) {
            EditFilterState editFilterState2 = editFilterState;
            C89219l.m154721d(editFilterState2, "");
            return EditFilterState.copy$default(editFilterState2, new C20521k(this.f183895a), null, null, null, null, 30, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel$g */
    static final class C82199g extends AbstractC89220m implements AbstractC89172b<EditFilterState, EditFilterState> {

        /* renamed from: a */
        public static final C82199g f183896a = new C82199g();

        static {
            Covode.recordClassIndex(96029);
        }

        C82199g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditFilterState invoke(EditFilterState editFilterState) {
            EditFilterState editFilterState2 = editFilterState;
            C89219l.m154721d(editFilterState2, "");
            return EditFilterState.copy$default(editFilterState2, null, null, null, null, new AbstractC23517a.C23519b(), 15, null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
    /* renamed from: a */
    public final void mo88317a(String str) {
        C89219l.m154721d(str, "");
        this.f183883d.mo88317a(str);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82200a
    /* renamed from: a */
    public final void mo127386a(boolean z) {
        this.f183887l.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo127385a(FilterBean filterBean, int i) {
        C89219l.m154721d(filterBean, "");
        m142212h().mo86060a(filterBean, i);
        mo127391g().mo114799a(new C50649a(false, filterBean));
        AbstractC82208b bVar = this.f183883d;
        AbstractC50703k i2 = m142213i();
        C89219l.m154716b(i2, "");
        bVar.mo88315a(C50648c.m94907a(filterBean, i, i2));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
    /* renamed from: a */
    public final void mo88318a(boolean z, FilterBean filterBean) {
        this.f183883d.mo88318a(z, filterBean);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.filter.core.AbstractC82208b
    /* renamed from: a */
    public final void mo88316a(FilterBean filterBean, boolean z, Context context) {
        this.f183883d.mo88316a(filterBean, z, context);
    }

    public EditFilterViewModel(C21582f fVar, AbstractC50707o oVar, AbstractC82208b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(bVar, "");
        this.f183888m = fVar;
        this.f183882c = oVar;
        this.f183883d = bVar;
        C1213t<Boolean> tVar = new C1213t<>();
        this.f183887l = tVar;
        this.f183881b = tVar;
    }

    /* renamed from: b */
    public final void mo127388b(FilterBean filterBean, boolean z, Context context) {
        if (filterBean != null) {
            mo127391g().mo114799a(new C50649a(false, filterBean, false, this.f183882c.mo86072g().mo86054c(filterBean.getId())));
            this.f183883d.mo88316a(filterBean, z, context);
            AbstractC82208b bVar = this.f183883d;
            AbstractC50706n h = m142212h();
            C89219l.m154716b(h, "");
            AbstractC50703k i = m142213i();
            C89219l.m154716b(i, "");
            bVar.mo88315a(C50648c.m94909a(filterBean, h, i));
        } else {
            this.f183883d.mo88316a(null, z, context);
        }
        mo33689c(new C82197e(filterBean));
    }
}
