package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a.AbstractC55295b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.AbstractC55903a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.C55907b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b */
public abstract class AbstractC55875b<T> extends AbstractC55295b<AbstractC55903a<T>, T> {

    /* renamed from: c */
    public static final C55876a f127370c = new C55876a((byte) 0);

    /* renamed from: a */
    public int f127371a = ((int) C13628n.m24520b(C17867d.m33078a(), 40.0f));

    /* renamed from: b */
    public View f127372b;

    /* renamed from: d */
    private AbstractC89187q<? super Integer, ? super Integer, ? super View, C89391z> f127373d;

    /* renamed from: e */
    private final AbstractC89187q<Integer, Integer, View, C89391z> f127374e = new C55877b(this);

    /* renamed from: f */
    private boolean f127375f;

    static {
        Covode.recordClassIndex(65665);
    }

    /* renamed from: b */
    public abstract AbstractC55903a<T> mo92735b(ViewGroup viewGroup, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo92736b(T t) {
        return false;
    }

    /* renamed from: p */
    public abstract SharePackage mo92739p();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b$a */
    public static final class C55876a {
        static {
            Covode.recordClassIndex(65666);
        }

        private C55876a() {
        }

        public /* synthetic */ C55876a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.q<? super java.lang.Integer, ? super java.lang.Integer, ? super android.view.View, h.z>, h.f.a.q<java.lang.Integer, java.lang.Integer, android.view.View, h.z> */
    /* access modifiers changed from: protected */
    /* renamed from: o */
    public AbstractC89187q<Integer, Integer, View, C89391z> mo92738o() {
        return this.f127373d;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.p3195a.AbstractC55295b
    /* renamed from: m */
    public final int mo92317m() {
        if (this.f127372b == null || !this.f127375f) {
            return 0;
        }
        return 1;
    }

    /* renamed from: r */
    public final void mo92741r() {
        boolean z = this.f127375f;
        this.f127375f = false;
        if (this.f127372b != null && z) {
            notifyItemRemoved(0);
        }
    }

    /* renamed from: q */
    public final void mo92740q() {
        boolean z = !this.f127375f;
        this.f127375f = true;
        if (this.f127372b != null && z) {
            notifyItemInserted(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public int mo60936c(int i) {
        if (i < mo92317m()) {
            return Integer.MAX_VALUE;
        }
        return super.mo60936c(i);
    }

    /* renamed from: c */
    public final void mo92737c(View view) {
        C89219l.m154721d(view, "");
        View view2 = this.f127372b;
        if (view2 == null) {
            this.f127372b = view;
            this.f127375f = true;
            notifyItemInserted(0);
            return;
        }
        C89219l.m154714a(view2, view);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (i != Integer.MAX_VALUE) {
            return mo92735b(viewGroup, i);
        }
        View view = this.f127372b;
        if (view == null || view.getParent() == null) {
            View view2 = this.f127372b;
            if (view2 == null) {
                C89219l.m154715b();
            }
            return new C55907b(view2);
        }
        C56244a.m102188a(new Exception("BaseSelectListAdapter Still get a un-detached header"));
        return new C55907b(new Space(viewGroup.getContext()));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (i >= mo92317m()) {
            AbstractC55903a aVar = (AbstractC55903a) viewHolder;
            C89219l.m154721d(aVar, "");
            View view = aVar.itemView;
            C89219l.m154716b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.C1367j jVar = (RecyclerView.C1367j) layoutParams;
            if (i == getItemCount() - 1) {
                jVar.setMargins(jVar.leftMargin, jVar.topMargin, jVar.rightMargin, this.f127371a);
            } else {
                jVar.setMargins(jVar.leftMargin, jVar.topMargin, jVar.rightMargin, 0);
            }
            T a = mo92313a(i);
            if (a != null) {
                aVar.mo92761a(a, mo92313a(i - 1), i - mo92317m());
                aVar.mo92762a(mo92736b((Object) a));
                aVar.f127451a = this.f127374e;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.b$b */
    static final class C55877b extends AbstractC89220m implements AbstractC89187q<Integer, Integer, View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC55875b f127376a;

        static {
            Covode.recordClassIndex(65667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55877b(AbstractC55875b bVar) {
            super(3);
            this.f127376a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Integer num, Integer num2, View view) {
            final int intValue = num.intValue();
            final int intValue2 = num2.intValue();
            final View view2 = view;
            C89219l.m154721d(view2, "");
            SharePackage p = this.f127376a.mo92739p();
            if (p != null) {
                Context context = view2.getContext();
                C89219l.m154716b(context, "");
                p.mo109570a(context, (AbstractC69581b) null, new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55875b.C55877b.C558781 */

                    /* renamed from: a */
                    final /* synthetic */ C55877b f127377a;

                    static {
                        Covode.recordClassIndex(65668);
                    }

                    {
                        this.f127377a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        AbstractC89187q<Integer, Integer, View, C89391z> o = this.f127377a.f127376a.mo92738o();
                        if (o != null) {
                            o.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), view2);
                        }
                        return C89391z.f203057a;
                    }
                });
            } else {
                AbstractC89187q<Integer, Integer, View, C89391z> o = this.f127376a.mo92738o();
                if (o != null) {
                    o.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), view2);
                }
            }
            return C89391z.f203057a;
        }
    }
}
