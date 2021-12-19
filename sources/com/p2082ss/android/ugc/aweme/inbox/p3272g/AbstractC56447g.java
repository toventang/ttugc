package com.p2082ss.android.ugc.aweme.inbox.p3272g;

import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.inbox.AbstractC56310ad;
import com.p2082ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.g.g */
public abstract class AbstractC56447g<T extends AbstractC56310ad> extends RecyclerView.ViewHolder implements AbstractC56519a {

    /* renamed from: a */
    public C56520b f128719a;

    /* renamed from: b */
    final AbstractC89244h f128720b = C89250i.m154773a((AbstractC89171a) new C56448a(this));

    /* renamed from: c */
    public AbstractC89171a<C89391z> f128721c;

    /* renamed from: d */
    public T f128722d;

    /* renamed from: e */
    public Fragment f128723e;

    /* renamed from: f */
    public RecommendUserVM f128724f;

    static {
        Covode.recordClassIndex(66267);
    }

    /* renamed from: a */
    public void mo93405a() {
    }

    /* renamed from: a */
    public abstract void mo93406a(T t);

    /* renamed from: b */
    public void mo93407b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo93408b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: c */
    public final T mo93413c() {
        T t = this.f128722d;
        if (t == null) {
            C89219l.m154710a("data");
        }
        return t;
    }

    /* renamed from: d */
    public final Fragment mo93414d() {
        Fragment fragment = this.f128723e;
        if (fragment == null) {
            C89219l.m154710a("fragment");
        }
        return fragment;
    }

    /* renamed from: e */
    public final RecommendUserVM mo93415e() {
        RecommendUserVM recommendUserVM = this.f128724f;
        if (recommendUserVM == null) {
            C89219l.m154710a("recommendUserVM");
        }
        return recommendUserVM;
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.g$a */
    static final class C56448a extends AbstractC89220m implements AbstractC89171a<C23208a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC56447g f128725a;

        static {
            Covode.recordClassIndex(66268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56448a(AbstractC56447g gVar) {
            super(0);
            this.f128725a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23208a invoke() {
            return new C23208a.C23211b().mo37797a(new C23208a.C23214e().mo37785a(R.string.b4w).mo37789b(1).mo37787a(new AbstractC89172b<View, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g.C56448a.C564491 */

                /* renamed from: a */
                final /* synthetic */ C56448a f128726a;

                static {
                    Covode.recordClassIndex(66269);
                }

                {
                    this.f128726a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(View view) {
                    C89219l.m154721d(view, "");
                    AbstractC89171a<C89391z> aVar = this.f128726a.f128725a.f128721c;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    this.f128726a.f128725a.mo93415e().mo93322a(this.f128726a.f128725a.mo93413c());
                    return C89391z.f203057a;
                }
            })).mo37800b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.g.g$b */
    static final class View$OnLongClickListenerC56450b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC56447g f128727a;

        static {
            Covode.recordClassIndex(66270);
        }

        View$OnLongClickListenerC56450b(AbstractC56447g gVar) {
            this.f128727a = gVar;
        }

        public final boolean onLongClick(View view) {
            ((DialogInterface$OnCancelListenerC0944d) this.f128727a.f128720b.getValue()).show(this.f128727a.mo93414d().requireFragmentManager(), "MultiBaseVH");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC56447g(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a
    /* renamed from: a */
    public final void mo87499a(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        if (!C89219l.m154714a(this.f128719a, bVar)) {
            this.f128719a = bVar;
            mo93408b(bVar);
        }
    }

    /* renamed from: a */
    public final void mo93412a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f128721c = aVar;
        this.itemView.setOnLongClickListener(new View$OnLongClickListenerC56450b(this));
    }
}
