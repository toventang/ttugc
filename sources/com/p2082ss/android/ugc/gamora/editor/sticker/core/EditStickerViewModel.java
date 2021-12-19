package com.p2082ss.android.ugc.gamora.editor.sticker.core;

import android.graphics.Rect;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20525o;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel */
public final class EditStickerViewModel extends LifecycleAwareViewModel<EditStickerState> implements AbstractC82610a {

    /* renamed from: a */
    public final AbstractC89244h f184682a = C89250i.m154773a((AbstractC89171a) C82587d.f184698a);

    /* renamed from: b */
    public AbstractC89171a<Rect> f184683b;

    /* renamed from: c */
    private C82617c f184684c;

    /* renamed from: d */
    private final AbstractC89244h f184685d = C89250i.m154773a((AbstractC89171a) C82605v.f184717a);

    /* renamed from: e */
    private final AbstractC89244h f184686e = C89250i.m154773a((AbstractC89171a) C82604u.f184716a);

    /* renamed from: f */
    private final AbstractC89244h f184687f = C89250i.m154773a((AbstractC89171a) C82590g.f184701a);

    /* renamed from: g */
    private final AbstractC89244h f184688g = C89250i.m154773a((AbstractC89171a) C82589f.f184700a);

    /* renamed from: l */
    private final AbstractC89244h f184689l = C89250i.m154773a((AbstractC89171a) C82603t.f184715a);

    static {
        Covode.recordClassIndex(96429);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: g */
    public final C1213t<Boolean> mo127684g() {
        return (C1213t) this.f184689l.getValue();
    }

    /* renamed from: l */
    public final C1213t<Boolean> mo127689l() {
        return (C1213t) this.f184685d.getValue();
    }

    /* renamed from: m */
    public final C1213t<Boolean> mo127690m() {
        return (C1213t) this.f184686e.getValue();
    }

    /* renamed from: n */
    public final C1213t<Boolean> mo127691n() {
        return (C1213t) this.f184687f.getValue();
    }

    /* renamed from: o */
    public final C1213t<Boolean> mo127692o() {
        return (C1213t) this.f184688g.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: h */
    public final AbstractC89171a<Rect> mo127685h() {
        return this.f184683b;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$d */
    static final class C82587d extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C82587d f184698a = new C82587d();

        static {
            Covode.recordClassIndex(96434);
        }

        C82587d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$t */
    static final class C82603t extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C82603t f184715a = new C82603t();

        static {
            Covode.recordClassIndex(96450);
        }

        C82603t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$u */
    static final class C82604u extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C82604u f184716a = new C82604u();

        static {
            Covode.recordClassIndex(96451);
        }

        C82604u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$v */
    static final class C82605v extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C82605v f184717a = new C82605v();

        static {
            Covode.recordClassIndex(96452);
        }

        C82605v() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: a */
    public final void mo127670a() {
        mo33690d(C82601r.f184713a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: b */
    public final void mo127679b() {
        mo33689c(C82602s.f184714a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: c */
    public final void mo127681c() {
        mo33690d(C82594k.f184706a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: e */
    public final void mo127682e() {
        mo33690d(C82593j.f184705a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: j */
    public final void mo127687j() {
        mo33690d(C82595l.f184707a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: k */
    public final void mo127688k() {
        mo33689c(C82596m.f184708a);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$f */
    static final class C82589f extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C82589f f184700a = new C82589f();

        static {
            Covode.recordClassIndex(96436);
        }

        C82589f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(false);
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$g */
    static final class C82590g extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C82590g f184701a = new C82590g();

        static {
            Covode.recordClassIndex(96437);
        }

        C82590g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(false);
            return tVar;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: f */
    public final boolean mo127683f() {
        C82617c cVar = this.f184684c;
        if (cVar != null) {
            return cVar.mo87913N();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: i */
    public final QaStruct mo127686i() {
        InteractStickerStruct h;
        C82617c cVar = this.f184684c;
        if (cVar == null || (h = cVar.mo127701U().mo128050h()) == null) {
            return null;
        }
        return h.getQaStruct();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditStickerState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    /* renamed from: b */
    public final void mo127680b(int i) {
        mo33690d(new C82588e(i));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: a */
    public final void mo127672a(int i) {
        mo33690d(new C82584aa(i));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$c */
    public static final class C82586c extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f184697a = true;

        static {
            Covode.recordClassIndex(96433);
        }

        public C82586c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20521k(this.f184697a), null, null, null, null, null, null, 2080767, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$e */
    static final class C82588e extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ int f184699a;

        static {
            Covode.recordClassIndex(96435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82588e(int i) {
            super(1);
            this.f184699a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, new C20523m(this.f184699a), null, null, null, null, null, null, null, null, null, null, null, null, null, 2097023, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$h */
    public static final class C82591h extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f184702a = true;

        static {
            Covode.recordClassIndex(96438);
        }

        public C82591h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20521k(this.f184702a), null, null, null, null, null, null, null, 2088959, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$i */
    static final class C82592i extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ Effect f184703a;

        /* renamed from: b */
        final /* synthetic */ String f184704b;

        static {
            Covode.recordClassIndex(96439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82592i(Effect effect, String str) {
            super(1);
            this.f184703a = effect;
            this.f184704b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, new C20524n(C89387v.m154943a(this.f184703a, this.f184704b)), null, null, null, null, null, null, null, null, null, null, 2096127, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$j */
    static final class C82593j extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        public static final C82593j f184705a = new C82593j();

        static {
            Covode.recordClassIndex(96440);
        }

        C82593j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, null, null, null, null, null, null, 2093055, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$k */
    static final class C82594k extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        public static final C82594k f184706a = new C82594k();

        static {
            Covode.recordClassIndex(96441);
        }

        C82594k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, null, null, null, null, null, null, null, 2095103, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$l */
    static final class C82595l extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        public static final C82595l f184707a = new C82595l();

        static {
            Covode.recordClassIndex(96442);
        }

        C82595l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, 1835007, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$m */
    static final class C82596m extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        public static final C82596m f184708a = new C82596m();

        static {
            Covode.recordClassIndex(96443);
        }

        C82596m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), 1048575, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$n */
    public static final class C82597n extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ int f184709a = 8;

        static {
            Covode.recordClassIndex(96444);
        }

        public C82597n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, new C20523m(this.f184709a), null, null, null, null, null, null, null, null, null, null, null, null, 2096895, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$o */
    static final class C82598o extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ C89378p f184710a;

        static {
            Covode.recordClassIndex(96445);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82598o(C89378p pVar) {
            super(1);
            this.f184710a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20524n(this.f184710a), null, null, null, 1966079, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$p */
    static final class C82599p extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f184711a;

        static {
            Covode.recordClassIndex(96446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82599p(boolean z) {
            super(1);
            this.f184711a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20521k(this.f184711a), null, null, null, null, 2031615, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$q */
    static final class C82600q extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ Integer f184712a;

        static {
            Covode.recordClassIndex(96447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82600q(Integer num) {
            super(1);
            this.f184712a = num;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, this.f184712a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097149, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$r */
    static final class C82601r extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        public static final C82601r f184713a = new C82601r();

        static {
            Covode.recordClassIndex(96448);
        }

        C82601r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, new AbstractC23517a.C23519b(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097150, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$s */
    static final class C82602s extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        public static final C82602s f184714a = new C82602s();

        static {
            Covode.recordClassIndex(96449);
        }

        C82602s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, null, null, null, null, null, null, null, null, null, 2096639, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$a */
    public static final class C82583a extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f184690a;

        /* renamed from: b */
        final /* synthetic */ long f184691b = 300;

        static {
            Covode.recordClassIndex(96430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82583a(float f) {
            super(1);
            this.f184690a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, new C20524n(new C89378p(Float.valueOf(this.f184690a), Long.valueOf(this.f184691b))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097147, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$aa */
    static final class C82584aa extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ int f184692a;

        /* renamed from: b */
        final /* synthetic */ boolean f184693b = true;

        static {
            Covode.recordClassIndex(96431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82584aa(int i) {
            super(1);
            this.f184692a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20524n(C89387v.m154943a(Integer.valueOf(this.f184692a), Boolean.valueOf(this.f184693b))), null, 1572863, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$b */
    static final class C82585b extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ boolean f184694a;

        /* renamed from: b */
        final /* synthetic */ boolean f184695b = true;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f184696c;

        static {
            Covode.recordClassIndex(96432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82585b(boolean z, AbstractC89171a aVar) {
            super(1);
            this.f184694a = z;
            this.f184696c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C20525o(new C89386u(Boolean.valueOf(this.f184694a), Boolean.valueOf(this.f184695b), this.f184696c)), null, null, null, null, null, 2064383, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$w */
    public static final class C82606w extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f184718a;

        /* renamed from: b */
        final /* synthetic */ float f184719b;

        /* renamed from: c */
        final /* synthetic */ float f184720c;

        static {
            Covode.recordClassIndex(96453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82606w(float f, float f2, float f3) {
            super(1);
            this.f184718a = f;
            this.f184719b = f2;
            this.f184720c = f3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, null, new C20525o(new C89386u(Float.valueOf(this.f184718a), Float.valueOf(this.f184719b), Float.valueOf(this.f184720c))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097087, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$x */
    public static final class C82607x extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f184721a;

        /* renamed from: b */
        final /* synthetic */ float f184722b;

        /* renamed from: c */
        final /* synthetic */ float f184723c;

        static {
            Covode.recordClassIndex(96454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82607x(float f, float f2, float f3) {
            super(1);
            this.f184721a = f;
            this.f184722b = f2;
            this.f184723c = f3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, null, new C20525o(new C89386u(Float.valueOf(this.f184721a), Float.valueOf(this.f184722b), Float.valueOf(this.f184723c))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097119, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$y */
    public static final class C82608y extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f184724a;

        /* renamed from: b */
        final /* synthetic */ float f184725b;

        /* renamed from: c */
        final /* synthetic */ float f184726c;

        static {
            Covode.recordClassIndex(96455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82608y(float f, float f2, float f3) {
            super(1);
            this.f184724a = f;
            this.f184725b = f2;
            this.f184726c = f3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, null, new C20525o(new C89386u(Float.valueOf(this.f184724a), Float.valueOf(this.f184725b), Float.valueOf(this.f184726c))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097135, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel$z */
    static final class C82609z extends AbstractC89220m implements AbstractC89172b<EditStickerState, EditStickerState> {

        /* renamed from: a */
        final /* synthetic */ float f184727a;

        /* renamed from: b */
        final /* synthetic */ float f184728b;

        /* renamed from: c */
        final /* synthetic */ float f184729c;

        static {
            Covode.recordClassIndex(96456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82609z(float f, float f2, float f3) {
            super(1);
            this.f184727a = f;
            this.f184728b = f2;
            this.f184729c = f3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditStickerState invoke(EditStickerState editStickerState) {
            EditStickerState editStickerState2 = editStickerState;
            C89219l.m154721d(editStickerState2, "");
            return EditStickerState.copy$default(editStickerState2, null, null, null, new C20525o(new C89386u(Float.valueOf(this.f184727a), Float.valueOf(this.f184728b), Float.valueOf(this.f184729c))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097143, null);
        }
    }

    /* renamed from: a */
    public final void mo127674a(C82617c cVar) {
        C89219l.m154721d(cVar, "");
        this.f184684c = cVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: a */
    public final void mo127675a(C89378p<Integer, Integer> pVar) {
        C89219l.m154721d(pVar, "");
        mo33690d(new C82598o(pVar));
    }

    /* renamed from: a */
    public final void mo127676a(Integer num) {
        mo33689c(new C82600q(num));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: a */
    public final void mo127677a(boolean z) {
        mo33690d(new C82599p(z));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: a */
    public final void mo127673a(Effect effect, String str) {
        C89219l.m154721d(effect, "");
        mo33690d(new C82592i(effect, str));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.core.AbstractC82610a
    /* renamed from: a */
    public final void mo127678a(boolean z, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        mo33690d(new C82585b(z, aVar));
    }

    /* renamed from: a */
    public final void mo127671a(float f, float f2, float f3) {
        mo33689c(new C82609z(f, f2, f3));
    }
}
