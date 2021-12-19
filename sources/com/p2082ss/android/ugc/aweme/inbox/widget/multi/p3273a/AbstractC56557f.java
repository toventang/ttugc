package com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a;

import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.AbstractC56585k;
import com.p2082ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.f */
public abstract class AbstractC56557f<T extends AbstractC56585k> extends RecyclerView.ViewHolder implements AbstractC56519a {

    /* renamed from: e */
    final AbstractC89244h f128954e = C89250i.m154773a((AbstractC89171a) new C56558a(this));

    /* renamed from: f */
    public AbstractC89171a<C89391z> f128955f;

    /* renamed from: g */
    public T f128956g;

    /* renamed from: h */
    public MultiViewModel f128957h;

    /* renamed from: i */
    public Fragment f128958i;

    /* renamed from: j */
    public C56520b f128959j;

    static {
        Covode.recordClassIndex(66380);
    }

    /* renamed from: a */
    public abstract void mo93479a(T t);

    /* renamed from: b */
    public void mo93483b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo93480b(C56520b bVar) {
        C89219l.m154721d(bVar, "");
    }

    public void bP_() {
    }

    /* renamed from: c */
    public final T mo93488c() {
        T t = this.f128956g;
        if (t == null) {
            C89219l.m154710a("data");
        }
        return t;
    }

    /* renamed from: d */
    public final MultiViewModel mo93489d() {
        MultiViewModel multiViewModel = this.f128957h;
        if (multiViewModel == null) {
            C89219l.m154710a("multiViewModel");
        }
        return multiViewModel;
    }

    /* renamed from: e */
    public final Fragment mo93490e() {
        Fragment fragment = this.f128958i;
        if (fragment == null) {
            C89219l.m154710a("fragment");
        }
        return fragment;
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.f$a */
    static final class C56558a extends AbstractC89220m implements AbstractC89171a<C23208a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC56557f f128960a;

        static {
            Covode.recordClassIndex(66381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56558a(AbstractC56557f fVar) {
            super(0);
            this.f128960a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23208a invoke() {
            return new C23208a.C23211b().mo37797a(new C23208a.C23214e().mo37785a(R.string.b4w).mo37789b(1).mo37787a(new AbstractC89172b<View, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.inbox.widget.multi.p3273a.AbstractC56557f.C56558a.C565591 */

                /* renamed from: a */
                final /* synthetic */ C56558a f128961a;

                static {
                    Covode.recordClassIndex(66382);
                }

                {
                    this.f128961a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(View view) {
                    C89219l.m154721d(view, "");
                    AbstractC89171a<C89391z> aVar = this.f128961a.f128960a.f128955f;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    this.f128961a.f128960a.mo93489d().mo93471a(this.f128961a.f128960a.mo93488c());
                    return C89391z.f203057a;
                }
            })).mo37800b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.a.f$b */
    static final class View$OnLongClickListenerC56560b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC56557f f128962a;

        static {
            Covode.recordClassIndex(66383);
        }

        View$OnLongClickListenerC56560b(AbstractC56557f fVar) {
            this.f128962a = fVar;
        }

        public final boolean onLongClick(View view) {
            ((DialogInterface$OnCancelListenerC0944d) this.f128962a.f128954e.getValue()).show(this.f128962a.mo93490e().requireFragmentManager(), "MultiBaseVH");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC56557f(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a
    /* renamed from: a */
    public final void mo87499a(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        if (!C89219l.m154714a(this.f128959j, bVar)) {
            this.f128959j = bVar;
            mo93480b(bVar);
        }
    }

    /* renamed from: a */
    public final void mo93487a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f128955f = aVar;
        this.itemView.setOnLongClickListener(new View$OnLongClickListenerC56560b(this));
    }
}
