package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2347c.C34106a;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67525bg;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3704r.C67704b;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4616h.AbstractC89247c;
import p4600h.p4616h.AbstractC89249e;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b */
public abstract class AbstractView$OnAttachStateChangeListenerC41671b extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener, AbstractC67566p {

    /* renamed from: j */
    static final /* synthetic */ AbstractC89286i[] f97198j = {new C89225r(AbstractView$OnAttachStateChangeListenerC41671b.class, "_itemMobParam", "get_itemMobParam()Lcom/ss/android/ugc/aweme/search/mob/ItemMobParam;", 0)};

    /* renamed from: a */
    private final AbstractC89249e f97199a = new C41672a(this);

    /* renamed from: b */
    private final AbstractC89244h f97200b;

    /* renamed from: k */
    public boolean f97201k = true;

    /* renamed from: l */
    public boolean f97202l;

    static {
        Covode.recordClassIndex(49584);
    }

    /* renamed from: a */
    private final C67568r mo60336a() {
        return (C67568r) this.f97199a.mo23374a(this, f97198j[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo70854E() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b$b */
    static final class C41673b extends AbstractC89220m implements AbstractC89171a<C34106a> {

        /* renamed from: a */
        final /* synthetic */ View f97205a;

        static {
            Covode.recordClassIndex(49586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41673b(View view) {
            super(0);
            this.f97205a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34106a invoke() {
            return new C34106a(this.f97205a);
        }
    }

    /* renamed from: I */
    public View mo70834I() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        return view;
    }

    /* renamed from: G */
    public final Context mo70878G() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        return context;
    }

    /* renamed from: H */
    public final ActivityC0945e mo70879H() {
        Activity d = C34729o.m70962d(mo70834I());
        Objects.requireNonNull(d, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC0945e) d;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p
    /* renamed from: F */
    public final C67568r mo70877F() {
        C67568r a = mo60336a();
        if (a != null) {
            return a;
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        return C42460j.C42461a.m84864a(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b$a */
    public static final class C41672a extends AbstractC89247c<C67568r> {

        /* renamed from: a */
        final /* synthetic */ Object f97203a = null;

        /* renamed from: b */
        final /* synthetic */ AbstractView$OnAttachStateChangeListenerC41671b f97204b;

        static {
            Covode.recordClassIndex(49585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41672a(AbstractView$OnAttachStateChangeListenerC41671b bVar) {
            super(null);
            this.f97204b = bVar;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, C67568r rVar, C67568r rVar2) {
            String str;
            LogPbBean logPbBean;
            LogPbBean logPbBean2;
            C89219l.m154721d(iVar, "");
            C67568r rVar3 = rVar2;
            C67568r rVar4 = rVar;
            String str2 = null;
            if (rVar4 == null || (logPbBean2 = rVar4.f151316k) == null) {
                str = null;
            } else {
                str = logPbBean2.getImprId();
            }
            if (!(rVar3 == null || (logPbBean = rVar3.f151316k) == null)) {
                str2 = logPbBean.getImprId();
            }
            if (!C89361p.m154872a(str, str2, false)) {
                this.f97204b.f97201k = true;
                this.f97204b.mo70854E();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67566p
    /* renamed from: a */
    public final void mo70880a(C67568r rVar) {
        C89219l.m154721d(rVar, "");
        this.f97199a.mo143655a(f97198j[0], rVar);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C42460j.C42461a.m84865a(view, mo70877F());
    }

    public void onViewAttachedToWindow(View view) {
        C89219l.m154721d(view, "");
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        C42460j.C42461a.m84865a(view2, mo70877F());
        this.f97202l = true;
    }

    public void onViewDetachedFromWindow(View view) {
        C89219l.m154721d(view, "");
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        C42460j.C42461a.m84866b(view2);
        C67704b.m119869a(null);
        this.f97202l = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractView$OnAttachStateChangeListenerC41671b(View view) {
        super(view);
        C89219l.m154721d(view, "");
        view.addOnAttachStateChangeListener(this);
        this.f97200b = C89250i.m154773a((AbstractC89171a) new C41673b(view));
    }

    /* renamed from: a */
    public final void mo70881a(String str) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        C67525bg bgVar = new C67525bg(str, mo70877F());
        String str3 = mo70877F().f151326u;
        if (str3 == null) {
            str3 = "else";
        }
        bgVar.mo96786a("use_scenario", str3);
        String str4 = mo70877F().f151315j;
        if (str4 != null) {
            str2 = str4;
        }
        bgVar.mo96786a("search_id", str2);
        String str5 = mo70877F().f151312g;
        if (str5 == null) {
            str5 = "general";
        }
        bgVar.mo96786a("search_type", str5);
        bgVar.mo96792f();
    }
}
