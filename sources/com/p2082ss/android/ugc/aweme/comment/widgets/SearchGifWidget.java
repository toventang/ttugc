package com.p2082ss.android.ugc.aweme.comment.widgets;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.comment.adapter.AbstractC36212ae;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36209ab;
import com.p2082ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37078bw;
import com.p2082ss.android.ugc.aweme.comment.util.C37208m;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel;
import com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentJediWidget;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget */
public final class SearchGifWidget extends BaseSearchGifWidget implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener, AbstractC20380ar<C37330a>, AbstractC33974au {

    /* renamed from: g */
    static final /* synthetic */ AbstractC89286i[] f88023g = {new C89232y(SearchGifWidget.class, "mResultLayout", "getMResultLayout()Landroid/view/View;", 0), new C89232y(SearchGifWidget.class, "mRecyclerView", "getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new C89232y(SearchGifWidget.class, "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", 0), new C89232y(SearchGifWidget.class, "mEditText", "getMEditText()Landroid/widget/EditText;", 0), new C89232y(SearchGifWidget.class, "mClear", "getMClear()Landroid/view/View;", 0)};

    /* renamed from: u */
    private static final C37313d f88024u = new C37313d((byte) 0);

    /* renamed from: h */
    public boolean f88025h;

    /* renamed from: i */
    public final AbstractC36212ae f88026i;

    /* renamed from: j */
    private final BaseCommentJediWidget.C37301a f88027j = m75294a((int) R.id.c5u);

    /* renamed from: k */
    private final BaseCommentJediWidget.C37301a f88028k = m75294a((int) R.id.dgp);

    /* renamed from: l */
    private final BaseCommentJediWidget.C37301a f88029l = m75294a((int) R.id.e7i);

    /* renamed from: m */
    private final AbstractC89244h f88030m = C89250i.m154774a(EnumC89331m.NONE, new C37327o(this));

    /* renamed from: n */
    private final BaseCommentJediWidget.C37301a f88031n = m75294a((int) R.id.drq);

    /* renamed from: o */
    private final BaseCommentJediWidget.C37301a f88032o = m75294a((int) R.id.drp);

    /* renamed from: p */
    private final WidgetLifecycleAwareLazy f88033p;

    /* renamed from: q */
    private final int f88034q;

    /* renamed from: r */
    private final AbstractC89171a<C89391z> f88035r;

    /* renamed from: s */
    private final AbstractC89171a<C89391z> f88036s;

    /* renamed from: t */
    private final String f88037t;

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$b */
    public static final class C37311b extends AbstractC89220m implements AbstractC89172b<GifEmojiListState, GifEmojiListState> {
        public static final C37311b INSTANCE = new C37311b();

        static {
            Covode.recordClassIndex(44687);
        }

        public C37311b() {
            super(1);
        }

        public final GifEmojiListState invoke(GifEmojiListState gifEmojiListState) {
            C89219l.m154719c(gifEmojiListState, "");
            return gifEmojiListState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$g */
    public static final class C37316g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends GifEmoji>, C89391z> {
        public static final C37316g INSTANCE = new C37316g();

        static {
            Covode.recordClassIndex(44692);
        }

        public C37316g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends GifEmoji> list) {
            invoke(iVar, list);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20477i iVar, List<? extends GifEmoji> list) {
            C89219l.m154719c(list, "");
        }
    }

    static {
        Covode.recordClassIndex(44685);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseCommentJediWidget, com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget, com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: q */
    public final View mo64917q() {
        return this.f88027j.mo64895a(this, f88023g[0]);
    }

    /* renamed from: r */
    public final DmtStatusView mo64918r() {
        return (DmtStatusView) this.f88029l.mo64895a(this, f88023g[2]);
    }

    /* renamed from: s */
    public final C36209ab mo64919s() {
        return (C36209ab) this.f88030m.getValue();
    }

    /* renamed from: t */
    public final EditText mo64920t() {
        return (EditText) this.f88031n.mo64895a(this, f88023g[3]);
    }

    /* renamed from: u */
    public final GifEmojiListViewModel mo64921u() {
        return (GifEmojiListViewModel) this.f88033p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$d */
    static final class C37313d {
        static {
            Covode.recordClassIndex(44689);
        }

        private C37313d() {
        }

        public /* synthetic */ C37313d(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$f */
    public static final class C37315f implements AbstractC20443c<GifEmoji, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f88045a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f88046b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f88047c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f88048d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f88049e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends GifEmoji>, C89391z> f88050f;

        static {
            Covode.recordClassIndex(44691);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f88048d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f88049e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends GifEmoji>, C89391z> mo33775c() {
            return this.f88050f;
        }

        public C37315f(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f88045a = bVar;
            this.f88046b = mVar;
            this.f88047c = mVar2;
            this.f88048d = bVar;
            this.f88049e = mVar;
            this.f88050f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$h */
    public static final class C37317h implements AbstractC20443c<GifEmoji, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f88051a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f88052b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f88053c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f88054d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f88055e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends GifEmoji>, C89391z> f88056f;

        static {
            Covode.recordClassIndex(44693);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f88054d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f88055e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends GifEmoji>, C89391z> mo33775c() {
            return this.f88056f;
        }

        public C37317h(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f88051a = bVar;
            this.f88052b = mVar;
            this.f88053c = mVar2;
            this.f88054d = bVar;
            this.f88055e = mVar;
            this.f88056f = mVar2;
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: b */
    public final int mo39079b() {
        return this.f88034q;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    /* renamed from: p */
    public final boolean mo64909p() {
        return this.f88025h;
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* synthetic */ C37330a mo33721d() {
        return new C37330a();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    /* renamed from: n */
    public final void mo64907n() {
        KeyboardUtils.m70897c(mo64920t());
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$o */
    static final class C37327o extends AbstractC89220m implements AbstractC89171a<C36209ab> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f88066a;

        /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$o$b */
        public final /* synthetic */ class C37329b implements AbstractC39063h.AbstractC39067a {

            /* renamed from: a */
            private final /* synthetic */ AbstractC89171a f88067a;

            static {
                Covode.recordClassIndex(44705);
            }

            public C37329b(AbstractC89171a aVar) {
                this.f88067a = aVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
            /* renamed from: l */
            public final /* synthetic */ void mo62679l() {
                C89219l.m154716b(this.f88067a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(44703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37327o(SearchGifWidget searchGifWidget) {
            super(0);
            this.f88066a = searchGifWidget;
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$o$a */
        static final /* synthetic */ class C37328a extends C89217j implements AbstractC89171a<C89391z> {
            static {
                Covode.recordClassIndex(44704);
            }

            C37328a(SearchGifWidget searchGifWidget) {
                super(0, searchGifWidget, SearchGifWidget.class, "loadMore", "loadMore()V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                ((SearchGifWidget) this.receiver).mo64922v();
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C36209ab invoke() {
            SearchGifWidget searchGifWidget = this.f88066a;
            C36209ab abVar = new C36209ab(searchGifWidget, searchGifWidget.f88026i, (byte) 0);
            abVar.mo67813a(new C37329b(new C37328a(this.f88066a)));
            return abVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$e */
    static final class RunnableC37314e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f88044a;

        static {
            Covode.recordClassIndex(44690);
        }

        RunnableC37314e(SearchGifWidget searchGifWidget) {
            this.f88044a = searchGifWidget;
        }

        public final void run() {
            KeyboardUtils.m70896b(this.f88044a.mo64920t());
            this.f88044a.f88025h = true;
        }
    }

    /* renamed from: x */
    private static boolean m75347x() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    /* renamed from: o */
    public final CharSequence mo64908o() {
        return mo64920t().getText();
    }

    /* renamed from: v */
    public final void mo64922v() {
        mo64921u().f87787d.loadMore();
    }

    /* renamed from: w */
    public final void mo64923w() {
        mo64918r().mo27385g();
        mo64921u().mo64794a();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    /* renamed from: l */
    public final void mo64905l() {
        mo64920t().requestFocus();
        mo64920t().postDelayed(new RunnableC37314e(this), 300);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$a */
    public static final class C37310a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ Widget f88038a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f88039b;

        static {
            Covode.recordClassIndex(44686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37310a(Widget widget, AbstractC89277c cVar) {
            super(0);
            this.f88038a = widget;
            this.f88039b = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return this.f88038a.getClass().getName() + '_' + C89170a.m154665a(this.f88039b).getName();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.widgets.BaseSearchGifWidget
    /* renamed from: m */
    public final void mo64906m() {
        Editable text = mo64920t().getText();
        if (text != null) {
            text.clear();
        }
        m75295a(mo64917q());
        mo64920t().clearFocus();
        this.f88025h = false;
        mo64907n();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$c */
    public static final class C37312c extends AbstractC89220m implements AbstractC89171a<GifEmojiListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f88040a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f88041b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f88042c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f88043d;

        static {
            Covode.recordClassIndex(44688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37312c(Widget widget, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89172b bVar) {
            super(0);
            this.f88040a = widget;
            this.f88041b = aVar;
            this.f88042c = cVar;
            this.f88043d = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.widget.Widget r0 = r3.f88040a
                com.bytedance.widget.b r0 = r0.mo39088j()
                java.lang.Object r1 = r0.mo39098b()
                boolean r0 = r1 instanceof androidx.fragment.app.Fragment
                if (r0 == 0) goto L_0x0048
                androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
                com.bytedance.widget.Widget r0 = r3.f88040a
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
            L_0x001c:
                h.f.a.a r0 = r3.f88041b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f88042c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m75363x9ade48b4(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel> r0 = com.p2082ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0042
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0042:
                h.f.a.b r0 = r3.f88043d
                r2.mo33686a_(r0)
                return r2
            L_0x0048:
                boolean r0 = r1 instanceof androidx.fragment.app.ActivityC0945e
                if (r0 == 0) goto L_0x005b
                androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
                com.bytedance.widget.Widget r0 = r3.f88040a
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                goto L_0x001c
            L_0x005b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.widgets.SearchGifWidget.C37312c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_comment_widgets_SearchGifWidget$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m75363x9ade48b4(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: c */
    public final void mo39080c() {
        super.mo39080c();
        mo64920t().addTextChangedListener(this);
        mo64920t().setOnEditorActionListener(this);
        BaseCommentJediWidget.C37301a aVar = this.f88032o;
        AbstractC89286i<?>[] iVarArr = f88023g;
        aVar.mo64895a(this, iVarArr[4]).setOnClickListener(this);
        RecyclerView recyclerView = (RecyclerView) this.f88028k.mo64895a(this, iVarArr[1]);
        recyclerView.mo4402a(new C37078bw());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(0));
        recyclerView.setAdapter(mo64919s());
        TuxTextView a = C37208m.m75197a(mo60928k());
        a.setTextColorRes(R.attr.bg);
        a.setText(R.string.bmg);
        TuxTextView a2 = C37208m.m75197a(mo60928k());
        a2.setTextColorRes(R.attr.bg);
        a2.setText(R.string.bmk);
        mo64918r().setBuilder(DmtStatusView.C17269a.m31905a(mo60928k()).mo27406b(a2).mo27408c(a));
        GifEmojiListViewModel u = mo64921u();
        String str = this.f88037t;
        C89219l.m154721d(str, "");
        u.mo33689c(new GifEmojiListViewModel.C37241f(str));
        ListMiddleware.m38615a(mo64921u().f87787d, this, mo64919s(), false, new C37315f(new C37318i(this), new C37321k(this), new C37319j(this)), new C37317h(new C37322l(this), new C37323m(this), C37316g.INSTANCE), new C37324n(this), null, 908);
    }

    public final void afterTextChanged(Editable editable) {
        m75346a(editable);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$l */
    static final class C37322l extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f88062a;

        static {
            Covode.recordClassIndex(44698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37322l(SearchGifWidget searchGifWidget) {
            super(1);
            this.f88062a = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            this.f88062a.mo64919s().ao_();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$i */
    static final class C37318i extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f88057a;

        static {
            Covode.recordClassIndex(44694);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37318i(SearchGifWidget searchGifWidget) {
            super(1);
            this.f88057a = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            this.f88057a.mo64918r().mo27384f();
            if (this.f88057a.mo64917q().getVisibility() != 0) {
                this.f88057a.mo64917q().setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        Editable editableText = mo64920t().getEditableText();
        if (editableText != null) {
            editableText.clear();
        }
        m75295a(mo64917q());
        this.f88035r.invoke();
    }

    /* renamed from: a */
    private final void m75346a(Editable editable) {
        mo60928k();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m75347x();
        }
        if (!C58029j.f132256h) {
            mo64921u().mo64794a();
            mo64918r().mo27387h();
        } else if (editable == null || editable.length() == 0) {
            mo64923w();
            m75295a(mo64917q());
        } else if (editable.length() > 8) {
            mo64923w();
        } else {
            mo64918r().mo27384f();
            GifEmojiListViewModel u = mo64921u();
            u.mo33687b_(new GifEmojiListViewModel.C37242g(u, editable));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$j */
    static final class C37319j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends GifEmoji>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f88058a;

        static {
            Covode.recordClassIndex(44695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37319j(SearchGifWidget searchGifWidget) {
            super(2);
            this.f88058a = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends GifEmoji> list) {
            AbstractC20477i iVar2 = iVar;
            final List<? extends GifEmoji> list2 = list;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list2, "");
            iVar2.withState(this.f88058a.mo64921u(), new AbstractC89172b<GifEmojiListState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.comment.widgets.SearchGifWidget.C37319j.C373201 */

                /* renamed from: a */
                final /* synthetic */ C37319j f88059a;

                static {
                    Covode.recordClassIndex(44696);
                }

                {
                    this.f88059a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(GifEmojiListState gifEmojiListState) {
                    C89219l.m154721d(gifEmojiListState, "");
                    if (list2.isEmpty()) {
                        this.f88059a.f88058a.mo64923w();
                    } else {
                        this.f88059a.f88058a.mo64918r().mo27382d();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$k */
    static final class C37321k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f88061a;

        static {
            Covode.recordClassIndex(44697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37321k(SearchGifWidget searchGifWidget) {
            super(2);
            this.f88061a = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            this.f88061a.mo64921u().mo64794a();
            this.f88061a.mo64918r().mo27387h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$m */
    static final class C37323m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f88063a;

        static {
            Covode.recordClassIndex(44699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37323m(SearchGifWidget searchGifWidget) {
            super(2);
            this.f88063a = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            this.f88063a.mo64919s().mo67824j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$n */
    static final class C37324n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f88064a;

        /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$n$a */
        final /* synthetic */ class C37326a implements AbstractC39063h.AbstractC39067a {

            /* renamed from: a */
            private final /* synthetic */ AbstractC89171a f88065a;

            static {
                Covode.recordClassIndex(44702);
            }

            C37326a(AbstractC89171a aVar) {
                this.f88065a = aVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
            /* renamed from: l */
            public final /* synthetic */ void mo62679l() {
                C89219l.m154716b(this.f88065a.invoke(), "");
            }
        }

        static {
            Covode.recordClassIndex(44700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37324n(SearchGifWidget searchGifWidget) {
            super(2);
            this.f88064a = searchGifWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f88064a.mo64919s().aq_();
                this.f88064a.mo64919s().mo67813a(new C37326a(new AbstractC89171a<C89391z>(this.f88064a) {
                    /* class com.p2082ss.android.ugc.aweme.comment.widgets.SearchGifWidget.C37324n.C373251 */

                    static {
                        Covode.recordClassIndex(44701);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        ((SearchGifWidget) this.receiver).mo64922v();
                        return C89391z.f203057a;
                    }
                }));
            } else {
                this.f88064a.mo64919s().ap_();
                this.f88064a.mo64919s().mo67813a((AbstractC39063h.AbstractC39067a) null);
            }
            return C89391z.f203057a;
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Editable editable;
        if (i != 3) {
            return false;
        }
        if (!mo64918r().mo27391l() && !mo64918r().mo27392m() && !mo64918r().mo27393n()) {
            return false;
        }
        if (textView != null) {
            editable = textView.getEditableText();
        } else {
            editable = null;
        }
        m75346a(editable);
        return true;
    }

    public SearchGifWidget(AbstractC89171a<C89391z> aVar, AbstractC36212ae aeVar, AbstractC89171a<C89391z> aVar2, String str) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aeVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(str, "");
        this.f88035r = aVar;
        this.f88026i = aeVar;
        this.f88036s = aVar2;
        this.f88037t = str;
        AbstractC89277c a = C89204ab.m154669a(GifEmojiListViewModel.class);
        C37310a aVar3 = new C37310a(this, a);
        this.f88033p = new WidgetLifecycleAwareLazy(this, aVar3, new C37312c(this, aVar3, a, C37311b.INSTANCE));
        this.f88034q = R.layout.j_;
    }
}
