package com.p2082ss.android.ugc.gamora.editor.toolbar;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.gamora.editor.C82248g;
import com.p2082ss.android.ugc.gamora.editor.C83395y;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel */
public final class EditToolbarViewModel extends LifecycleAwareViewModel<EditToolbarState> implements AbstractC83233s {

    /* renamed from: c */
    public static final C83099a f185701c = new C83099a((byte) 0);

    /* renamed from: a */
    public final C82248g f185702a = new C82248g();

    /* renamed from: b */
    public boolean f185703b;

    /* renamed from: d */
    private final C1213t<Integer> f185704d = new C1213t<>();

    /* renamed from: e */
    private final AbstractC89244h f185705e = C89250i.m154773a((AbstractC89171a) C83101c.f185712a);

    /* renamed from: f */
    private final AbstractC89244h f185706f = C89250i.m154773a((AbstractC89171a) C83119u.f185730a);

    /* renamed from: g */
    private final AbstractC89244h f185707g = C89250i.m154773a((AbstractC89171a) C83116r.f185727a);

    /* renamed from: l */
    private final AbstractC89244h f185708l = C89250i.m154773a((AbstractC89171a) C83118t.f185729a);

    /* renamed from: m */
    private final AbstractC89244h f185709m = C89250i.m154773a((AbstractC89171a) C83117s.f185728a);

    /* renamed from: n */
    private final AbstractC89244h f185710n = C89250i.m154773a((AbstractC89171a) C83115q.f185726a);

    static {
        Covode.recordClassIndex(96976);
    }

    /* renamed from: k */
    private final Map<Integer, C1213t<Boolean>> m143515k() {
        return (Map) this.f185706f.getValue();
    }

    /* renamed from: l */
    private final Map<Integer, C1213t<Boolean>> m143516l() {
        return (Map) this.f185708l.getValue();
    }

    /* renamed from: g */
    public final C1213t<Boolean> mo128257g() {
        return (C1213t) this.f185705e.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Map<Integer, C1213t<Boolean>> mo128258h() {
        return (Map) this.f185707g.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Map<Integer, C1213t<Boolean>> mo128259i() {
        return (Map) this.f185709m.getValue();
    }

    /* renamed from: j */
    public final C1213t<Boolean> mo128260j() {
        return (C1213t) this.f185710n.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$a */
    public static final class C83099a {
        static {
            Covode.recordClassIndex(96977);
        }

        private C83099a() {
        }

        public /* synthetic */ C83099a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s
    /* renamed from: c */
    public final LiveData<Integer> mo128249c() {
        return this.f185704d;
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s
    /* renamed from: e */
    public final boolean mo128255e() {
        return this.f185703b;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$c */
    static final class C83101c extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C83101c f185712a = new C83101c();

        static {
            Covode.recordClassIndex(96979);
        }

        C83101c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$q */
    static final class C83115q extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C83115q f185726a = new C83115q();

        static {
            Covode.recordClassIndex(96993);
        }

        C83115q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s
    /* renamed from: a */
    public final void mo128236a() {
        mo33689c(C83102d.f185713a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s
    /* renamed from: b */
    public final void mo128244b() {
        mo33689c(C83100b.f185711a);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s
    /* renamed from: f */
    public final void mo128256f() {
        mo33689c(C83103e.f185714a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditToolbarState(new AbstractC23517a.C23519b(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$r */
    static final class C83116r extends AbstractC89220m implements AbstractC89171a<Map<Integer, ? extends C1213t<Boolean>>> {

        /* renamed from: a */
        public static final C83116r f185727a = new C83116r();

        static {
            Covode.recordClassIndex(96994);
        }

        C83116r() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, ? extends C1213t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : C83395y.f186260d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new C1213t());
            }
            return C89041ag.m154429c(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$s */
    static final class C83117s extends AbstractC89220m implements AbstractC89171a<Map<Integer, ? extends C1213t<Boolean>>> {

        /* renamed from: a */
        public static final C83117s f185728a = new C83117s();

        static {
            Covode.recordClassIndex(96995);
        }

        C83117s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, ? extends C1213t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : C83395y.f186260d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new C1213t());
            }
            return C89041ag.m154429c(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$t */
    static final class C83118t extends AbstractC89220m implements AbstractC89171a<Map<Integer, ? extends C1213t<Boolean>>> {

        /* renamed from: a */
        public static final C83118t f185729a = new C83118t();

        static {
            Covode.recordClassIndex(96996);
        }

        C83118t() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, ? extends C1213t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : C83395y.f186260d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new C1213t());
            }
            return C89041ag.m154429c(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$u */
    static final class C83119u extends AbstractC89220m implements AbstractC89171a<Map<Integer, ? extends C1213t<Boolean>>> {

        /* renamed from: a */
        public static final C83119u f185730a = new C83119u();

        static {
            Covode.recordClassIndex(96997);
        }

        C83119u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, ? extends C1213t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : C83395y.f186260d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new C1213t());
            }
            return C89041ag.m154429c(linkedHashMap);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s
    /* renamed from: a */
    public final void mo128237a(int i) {
        this.f185704d.setValue(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo128247b(List<C83395y> list) {
        C89219l.m154721d(list, "");
        mo33689c(new C83107i(list));
    }

    /* renamed from: c */
    public final LiveData<Boolean> mo128250c(int i) {
        return m143516l().get(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final LiveData<Boolean> mo128253d(int i) {
        return m143515k().get(Integer.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s
    /* renamed from: b */
    public final void mo128245b(int i) {
        C20523m mVar = new C20523m(i);
        C89219l.m154721d(mVar, "");
        mo33689c(new C83112n(mVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$b */
    public static final class C83100b extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        public static final C83100b f185711a = new C83100b();

        static {
            Covode.recordClassIndex(96978);
        }

        C83100b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, new C20526p(), null, null, null, null, null, null, null, null, null, 65471, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$d */
    public static final class C83102d extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        public static final C83102d f185713a = new C83102d();

        static {
            Covode.recordClassIndex(96980);
        }

        C83102d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, null, null, 63487, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$e */
    static final class C83103e extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        public static final C83103e f185714a = new C83103e();

        static {
            Covode.recordClassIndex(96981);
        }

        C83103e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, null, new C20526p(), null, null, null, 61439, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$f */
    static final class C83104f extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ String f185715a;

        static {
            Covode.recordClassIndex(96982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83104f(String str) {
            super(1);
            this.f185715a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, this.f185715a, null, null, null, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$g */
    public static final class C83105g extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f185716a;

        static {
            Covode.recordClassIndex(96983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83105g(boolean z) {
            super(1);
            this.f185716a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, Boolean.valueOf(this.f185716a), null, null, null, null, null, null, null, null, null, null, null, null, null, 65531, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$h */
    static final class C83106h extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f185717a;

        static {
            Covode.recordClassIndex(96984);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83106h(boolean z) {
            super(1);
            this.f185717a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, Boolean.valueOf(this.f185717a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$i */
    static final class C83107i extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ List f185718a;

        static {
            Covode.recordClassIndex(96985);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83107i(List list) {
            super(1);
            this.f185718a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, this.f185718a, null, null, null, null, null, null, null, null, null, null, 65503, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$j */
    public static final class C83108j extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f185719a;

        static {
            Covode.recordClassIndex(96986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83108j(int i) {
            super(1);
            this.f185719a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.f185719a), null, null, null, null, null, 64511, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$k */
    public static final class C83109k extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f185720a;

        static {
            Covode.recordClassIndex(96987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83109k(boolean z) {
            super(1);
            this.f185720a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f185720a), 32767, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$l */
    public static final class C83110l extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ Drawable f185721a;

        static {
            Covode.recordClassIndex(96988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83110l(Drawable drawable) {
            super(1);
            this.f185721a = drawable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, this.f185721a, null, null, null, null, null, null, null, 65279, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$m */
    static final class C83111m extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ String f185722a;

        static {
            Covode.recordClassIndex(96989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83111m(String str) {
            super(1);
            this.f185722a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, this.f185722a, null, null, null, null, null, null, null, null, 65407, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$n */
    static final class C83112n extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ C20523m f185723a;

        static {
            Covode.recordClassIndex(96990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83112n(C20523m mVar) {
            super(1);
            this.f185723a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f185723a, null, null, 57343, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$o */
    static final class C83113o extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ List f185724a;

        static {
            Covode.recordClassIndex(96991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83113o(List list) {
            super(1);
            this.f185724a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, this.f185724a, null, null, null, null, null, null, null, null, null, null, null, 65519, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$p */
    public static final class C83114p extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f185725a;

        static {
            Covode.recordClassIndex(96992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83114p(int i) {
            super(1);
            this.f185725a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.f185725a), null, null, null, null, null, null, 65023, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel$v */
    static final class C83120v extends AbstractC89220m implements AbstractC89172b<EditToolbarState, EditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ C83131a f185731a;

        static {
            Covode.recordClassIndex(96998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83120v(C83131a aVar) {
            super(1);
            this.f185731a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditToolbarState invoke(EditToolbarState editToolbarState) {
            EditToolbarState editToolbarState2 = editToolbarState;
            C89219l.m154721d(editToolbarState2, "");
            return EditToolbarState.copy$default(editToolbarState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f185731a, null, 49151, null);
        }
    }

    /* renamed from: a */
    public final void mo128239a(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        mo33689c(new C83110l(drawable));
    }

    /* renamed from: c */
    public final void mo128252c(boolean z) {
        mo33689c(new C83109k(z));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s
    /* renamed from: a */
    public final void mo128240a(C83131a aVar) {
        C89219l.m154721d(aVar, "");
        mo33689c(new C83120v(aVar));
    }

    /* renamed from: b */
    public final void mo128248b(boolean z) {
        mo33689c(new C83105g(z));
    }

    /* renamed from: a */
    public final void mo128241a(String str) {
        C89219l.m154721d(str, "");
        mo33689c(new C83104f(str));
    }

    /* renamed from: a */
    public final void mo128242a(List<C83395y> list) {
        C89219l.m154721d(list, "");
        mo33689c(new C83113o(list));
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s
    /* renamed from: a */
    public final void mo128243a(boolean z) {
        C1213t<Boolean> tVar = mo128259i().get(1);
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s
    /* renamed from: a */
    public final void mo128238a(int i, boolean z) {
        C1213t<Boolean> tVar = m143515k().get(Integer.valueOf(i));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: c */
    public final void mo128251c(int i, boolean z) {
        C1213t<Boolean> tVar = mo128259i().get(Integer.valueOf(i));
        if (tVar != null) {
            tVar.postValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    public final void mo128246b(int i, boolean z) {
        C1213t<Boolean> tVar = mo128258h().get(Integer.valueOf(i));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: d */
    public final void mo128254d(int i, boolean z) {
        C1213t<Boolean> tVar = m143516l().get(Integer.valueOf(i));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }
}
