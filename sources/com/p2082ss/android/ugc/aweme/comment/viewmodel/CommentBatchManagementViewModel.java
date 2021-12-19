package com.p2082ss.android.ugc.aweme.comment.viewmodel;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36317c;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import java.util.HashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel */
public final class CommentBatchManagementViewModel extends AbstractC1174ac implements AbstractC33974au {

    /* renamed from: e */
    public static final C37228a f87765e = new C37228a((byte) 0);

    /* renamed from: a */
    public int f87766a;

    /* renamed from: b */
    public final Map<String, Comment> f87767b = new HashMap();

    /* renamed from: c */
    public final Map<String, Comment> f87768c = new HashMap();

    /* renamed from: d */
    public final Map<String, C36317c> f87769d = new HashMap();

    /* renamed from: f */
    private final AbstractC89244h f87770f = C89250i.m154773a((AbstractC89171a) C37230c.f87773a);

    /* renamed from: g */
    private final AbstractC89244h f87771g = C89250i.m154773a((AbstractC89171a) C37229b.f87772a);

    static {
        Covode.recordClassIndex(44583);
    }

    /* renamed from: a */
    public final C1213t<Boolean> mo64780a() {
        return (C1213t) this.f87770f.getValue();
    }

    /* renamed from: b */
    public final C1213t<Integer> mo64781b() {
        return (C1213t) this.f87771g.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel$a */
    public static final class C37228a {
        static {
            Covode.recordClassIndex(44584);
        }

        private C37228a() {
        }

        public /* synthetic */ C37228a(byte b) {
            this();
        }

        /* renamed from: a */
        public static CommentBatchManagementViewModel m75235a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = m75234a(C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null), "CommentBatchManagementViewModel", CommentBatchManagementViewModel.class);
            C89219l.m154716b(a, "");
            return (CommentBatchManagementViewModel) a;
        }

        /* renamed from: a */
        private static AbstractC1174ac m75234a(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel$b */
    static final class C37229b extends AbstractC89220m implements AbstractC89171a<C1213t<Integer>> {

        /* renamed from: a */
        public static final C37229b f87772a = new C37229b();

        static {
            Covode.recordClassIndex(44585);
        }

        C37229b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Integer> invoke() {
            C1213t tVar = new C1213t();
            tVar.setValue(0);
            return tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel$c */
    static final class C37230c extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C37230c f87773a = new C37230c();

        static {
            Covode.recordClassIndex(44586);
        }

        C37230c() {
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

    /* renamed from: c */
    public final void mo64782c() {
        this.f87766a = 0;
        this.f87767b.clear();
        this.f87768c.clear();
    }
}
