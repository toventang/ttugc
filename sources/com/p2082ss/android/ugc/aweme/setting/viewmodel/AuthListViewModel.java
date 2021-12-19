package com.p2082ss.android.ugc.aweme.setting.viewmodel;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C20462n;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.setting.model.C68172b;
import com.p2082ss.android.ugc.aweme.setting.model.C68173c;
import com.p2082ss.android.ugc.aweme.setting.p3725m.C68169c;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel */
public final class AuthListViewModel extends JediViewModel<AuthInfoState> {

    /* renamed from: e */
    public static final C68712b f153715e = new C68712b((byte) 0);

    /* renamed from: a */
    public final C68169c f153716a = new C68169c();

    /* renamed from: b */
    public final C1213t<C68173c> f153717b = new C1213t<>();

    /* renamed from: c */
    public boolean f153718c = true;

    /* renamed from: d */
    public final ListMiddleware<AuthInfoState, C68173c, C20465o> f153719d = new ListMiddleware<>(new C68710a(this), null, new C68715e(this), C20462n.C20463a.f48404a);

    static {
        Covode.recordClassIndex(80976);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel$b */
    public static final class C68712b {
        static {
            Covode.recordClassIndex(80979);
        }

        private C68712b() {
        }

        public /* synthetic */ C68712b(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AuthInfoState mo23027d() {
        return new AuthInfoState(null, 1, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        ListMiddleware<AuthInfoState, C68173c, C20465o> listMiddleware = this.f153719d;
        listMiddleware.mo33809a(C68717a.f153726a, C68713c.f153722a);
        mo33684a(listMiddleware);
        this.f153719d.refresh();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel$d */
    public static final class C68714d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C68714d f153723a = new C68714d();

        static {
            Covode.recordClassIndex(80981);
        }

        C68714d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C68172b bVar = (C68172b) obj;
            C89219l.m154721d(bVar, "");
            return bVar.f152624a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel$a */
    public static final class C68710a extends AbstractC89220m implements AbstractC89172b<AuthInfoState, AbstractC88979t<C89378p<? extends List<? extends C68173c>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ AuthListViewModel f153720a;

        static {
            Covode.recordClassIndex(80977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68710a(AuthListViewModel authListViewModel) {
            super(1);
            this.f153720a = authListViewModel;
        }

        public final AbstractC88979t<C89378p<List<C68173c>, C20465o>> invoke(AuthInfoState authInfoState) {
            C89219l.m154719c(authInfoState, "");
            this.f153720a.f153718c = true;
            AbstractC88403ab a = AbstractC88403ab.m153601a((AbstractC88984x) this.f153720a.f153716a.f152617b.mo33487c(C89391z.f203057a));
            C89219l.m154716b(a, "");
            AbstractC88403ab c = a.mo142925c(C68714d.f153723a);
            C89219l.m154716b(c, "");
            AbstractC88979t<C89378p<List<C68173c>, C20465o>> d = c.mo142930d().mo143292d(C687111.f153721a);
            C89219l.m154709a((Object) d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel$f */
    public static final class C68716f extends AbstractC89220m implements AbstractC89172b<AuthInfoState, AuthInfoState> {

        /* renamed from: a */
        final /* synthetic */ String f153725a;

        static {
            Covode.recordClassIndex(80983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68716f(String str) {
            super(1);
            this.f153725a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AuthInfoState invoke(AuthInfoState authInfoState) {
            AuthInfoState authInfoState2 = authInfoState;
            C89219l.m154721d(authInfoState2, "");
            ListState<C68173c, C20465o> listState = authInfoState2.getListState();
            List<C68173c> list = authInfoState2.getListState().getList();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!C89219l.m154714a((Object) t.getClientKey(), (Object) this.f153725a)) {
                    arrayList.add(t);
                }
            }
            return authInfoState2.copy(ListState.copy$default(listState, null, arrayList, null, null, null, 29, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel$c */
    static final class C68713c extends AbstractC89220m implements AbstractC89183m<AuthInfoState, ListState<C68173c, C20465o>, AuthInfoState> {

        /* renamed from: a */
        public static final C68713c f153722a = new C68713c();

        static {
            Covode.recordClassIndex(80980);
        }

        C68713c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ AuthInfoState invoke(AuthInfoState authInfoState, ListState<C68173c, C20465o> listState) {
            AuthInfoState authInfoState2 = authInfoState;
            ListState<C68173c, C20465o> listState2 = listState;
            C89219l.m154721d(authInfoState2, "");
            C89219l.m154721d(listState2, "");
            return authInfoState2.copy(listState2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel$e */
    static final class C68715e extends AbstractC89220m implements AbstractC89183m<List<? extends C68173c>, List<? extends C68173c>, List<? extends C68173c>> {

        /* renamed from: a */
        final /* synthetic */ AuthListViewModel f153724a;

        static {
            Covode.recordClassIndex(80982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68715e(AuthListViewModel authListViewModel) {
            super(2);
            this.f153724a = authListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ List<? extends C68173c> invoke(List<? extends C68173c> list, List<? extends C68173c> list2) {
            List<? extends C68173c> list3 = list2;
            C89219l.m154721d(list, "");
            C89219l.m154721d(list3, "");
            if (!(!list3.isEmpty())) {
                return list;
            }
            list3.size();
            this.f153724a.f153718c = false;
            return list3;
        }
    }
}
