package com.p2082ss.android.ugc.aweme.discover.helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.discover.api.p2765a.C41855a;
import com.p2082ss.android.ugc.aweme.discover.helper.C42027l;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.widget.C43031b;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67528bi;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67532bk;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.e */
public final class C42006e extends C42027l.AbstractC42029b implements C43031b.AbstractC43033b {

    /* renamed from: e */
    public static final C42008b f97955e = new C42008b((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f97956a = C89250i.m154773a((AbstractC89171a) new C42013f(this));

    /* renamed from: b */
    final AbstractC89244h f97957b = C89250i.m154773a((AbstractC89171a) new C42011e(this));

    /* renamed from: c */
    public TypeWords f97958c;

    /* renamed from: d */
    public final SearchIntermediateViewModel f97959d;

    /* renamed from: j */
    private final AbstractC89244h f97960j;

    /* renamed from: k */
    private final AbstractC89244h f97961k = C89250i.m154773a((AbstractC89171a) new C42009c(this));

    /* renamed from: l */
    private boolean f97962l;

    static {
        Covode.recordClassIndex(49936);
    }

    /* renamed from: i */
    private C43031b m84081i() {
        return (C43031b) this.f97961k.getValue();
    }

    /* renamed from: a */
    public final LinearLayout mo71183a() {
        return (LinearLayout) this.f97960j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.e$b */
    public static final class C42008b {
        static {
            Covode.recordClassIndex(49938);
        }

        private C42008b() {
        }

        public /* synthetic */ C42008b(byte b) {
            this();
        }
    }

    /* renamed from: k */
    private final void m84083k() {
        C43031b i;
        if (this.f97992f && (i = m84081i()) != null) {
            C43031b.m85864a(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: b */
    public final void mo71188b() {
        super.mo71188b();
        C43031b i = m84081i();
        if (i != null) {
            i.mo73229b();
        }
        this.f97962l = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: d */
    public final void mo71192d() {
        super.mo71192d();
        C43031b i = m84081i();
        if (i != null) {
            i.mo73229b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: f */
    public final void mo71194f() {
        super.mo71194f();
        C43031b i = m84081i();
        if (i != null) {
            i.mo73229b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.e$c */
    static final class C42009c extends AbstractC89220m implements AbstractC89171a<C43031b> {

        /* renamed from: a */
        final /* synthetic */ C42006e f97964a;

        static {
            Covode.recordClassIndex(49939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42009c(C42006e eVar) {
            super(0);
            this.f97964a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43031b invoke() {
            TextSwitcher textSwitcher = (TextSwitcher) this.f97964a.f97957b.getValue();
            if (textSwitcher != null) {
                return new C43031b((TextView) this.f97964a.f97956a.getValue(), textSwitcher);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.e$f */
    static final class C42013f extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C42006e f97968a;

        static {
            Covode.recordClassIndex(49943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42013f(C42006e eVar) {
            super(0);
            this.f97968a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            View view;
            LinearLayout a = this.f97968a.mo71183a();
            if (a != null) {
                view = a.findViewById(R.id.f4b);
            } else {
                view = null;
            }
            if (!(view instanceof TextView)) {
                return null;
            }
            return view;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: c */
    public final void mo71190c() {
        C43031b i;
        super.mo71190c();
        LinearLayout a = mo71183a();
        if (a != null && a.getVisibility() == 0 && (i = m84081i()) != null) {
            C43031b.m85864a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.e$e */
    static final class C42011e extends AbstractC89220m implements AbstractC89171a<TextSwitcher> {

        /* renamed from: a */
        final /* synthetic */ C42006e f97966a;

        static {
            Covode.recordClassIndex(49941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42011e(C42006e eVar) {
            super(0);
            this.f97966a = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.helper.e$e$a */
        static final class C42012a implements ViewSwitcher.ViewFactory {

            /* renamed from: a */
            final /* synthetic */ TextSwitcher f97967a;

            static {
                Covode.recordClassIndex(49942);
            }

            C42012a(TextSwitcher textSwitcher) {
                this.f97967a = textSwitcher;
            }

            public final View makeView() {
                View view;
                View a = C1764a.m5927a(LayoutInflater.from(this.f97967a.getContext()), R.layout.atz, this.f97967a, false);
                if (C67446h.f151111a.mo106230s()) {
                    if (!(a instanceof TextView)) {
                        view = null;
                    } else {
                        view = a;
                    }
                    TextView textView = (TextView) view;
                    if (textView != null) {
                        textView.setTextColor(C0643b.m2378c(this.f97967a.getContext(), R.color.bx));
                    }
                }
                return a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextSwitcher invoke() {
            View view;
            LinearLayout a = this.f97966a.mo71183a();
            if (a != null) {
                view = a.findViewById(R.id.eo_);
            } else {
                view = null;
            }
            if (!(view instanceof TextSwitcher)) {
                view = null;
            }
            TextSwitcher textSwitcher = (TextSwitcher) view;
            if (textSwitcher == null) {
                return null;
            }
            textSwitcher.setFactory(new C42012a(textSwitcher));
            return textSwitcher;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.e$d */
    static final class C42010d extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C42027l.C42033e f97965a;

        static {
            Covode.recordClassIndex(49940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42010d(C42027l.C42033e eVar) {
            super(0);
            this.f97965a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            View view;
            MethodCollector.m26663i(12026);
            View findViewById = this.f97965a.f97999a.findViewById(R.id.fhg);
            View view2 = null;
            if (!(findViewById instanceof ViewStub)) {
                findViewById = null;
            }
            ViewStub viewStub = (ViewStub) findViewById;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            if (view instanceof LinearLayout) {
                view2 = view;
            }
            MethodCollector.m26664o(12026);
            return view2;
        }
    }

    /* renamed from: j */
    private final boolean m84082j() {
        C33943c<Integer> intermediateState;
        C33943c<Integer> intermediateState2;
        Integer value;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f97959d;
        if (searchIntermediateViewModel == null || (intermediateState = searchIntermediateViewModel.getIntermediateState()) == null || intermediateState.getValue() == null) {
            return false;
        }
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f97959d;
        if (searchIntermediateViewModel2 == null || (intermediateState2 = searchIntermediateViewModel2.getIntermediateState()) == null || (value = intermediateState2.getValue()) == null || value.intValue() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: e */
    public final void mo71193e() {
        LinearLayout a;
        super.mo71193e();
        if (this.f97962l || (a = mo71183a()) == null || a.getVisibility() != 0) {
            this.f97962l = false;
            return;
        }
        C43031b i = m84081i();
        if (i != null) {
            C43031b.m85864a(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: g */
    public final Word mo71195g() {
        List<Word> list;
        Word word;
        String word2;
        C43031b i = m84081i();
        if (i == null) {
            return null;
        }
        int i2 = i.f100314f;
        TypeWords typeWords = this.f97958c;
        if (typeWords == null || (list = typeWords.words) == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        if (i2 < 0 || size <= i2 || (word = list.get(i2)) == null || (word2 = word.getWord()) == null || word2.length() == 0) {
            return null;
        }
        return word;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.e$a */
    static final class View$OnClickListenerC42007a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42027l.C42033e f97963a;

        static {
            Covode.recordClassIndex(49937);
        }

        View$OnClickListenerC42007a(C42027l.C42033e eVar) {
            this.f97963a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C42027l.AbstractC42028a aVar = this.f97963a.f98000b;
            C89219l.m154716b(view, "");
            aVar.mo71211a(view);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: b */
    public final void mo71189b(boolean z) {
        super.mo71189b(z);
        C43031b i = m84081i();
        if (i != null) {
            i.mo73229b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: a */
    public final void mo71186a(boolean z) {
        LinearLayout a;
        super.mo71186a(z);
        if (!z || (a = mo71183a()) == null || a.getVisibility() != 0) {
            C43031b i = m84081i();
            if (i != null) {
                i.mo73229b();
                return;
            }
            return;
        }
        C43031b i2 = m84081i();
        if (i2 != null) {
            C43031b.m85864a(i2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: c */
    public final void mo71191c(boolean z) {
        List<String> list;
        C43031b i;
        super.mo71191c(z);
        if (z) {
            C43031b i2 = m84081i();
            if (i2 != null) {
                if (i2.f100310b == null) {
                    i2.mo73228a(0, false);
                }
                String str = i2.f100310b;
                i2.f100313e = str;
                TextView textView = i2.f100317i;
                if (textView != null) {
                    textView.setText(str);
                }
            }
            if (!this.f97993g && (i = m84081i()) != null) {
                C43031b.m85864a(i);
            }
            LinearLayout a = mo71183a();
            if (a != null) {
                a.setVisibility(0);
            }
            C43031b i3 = m84081i();
            if (i3 != null && (list = i3.f100312d) != null && list.size() > 0) {
                this.f97995i.f98000b.mo71210a(4);
                return;
            }
            return;
        }
        C43031b i4 = m84081i();
        if (i4 != null) {
            i4.mo73229b();
        }
        LinearLayout a2 = mo71183a();
        if (a2 != null) {
            a2.setVisibility(8);
        }
        this.f97995i.f98000b.mo71210a(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.widget.C43031b.AbstractC43033b
    /* renamed from: a */
    public final void mo71184a(int i) {
        List<Word> list;
        String str;
        TypeWords typeWords = this.f97958c;
        if (typeWords != null && (list = typeWords.words) != null && !list.isEmpty()) {
            String str2 = null;
            if (!false) {
                int size = list.size();
                if (i < 0 || i >= size) {
                    i = 0;
                }
                C42027l.AbstractC42028a aVar = this.f97995i.f98000b;
                String id = list.get(i).getId();
                C43031b i2 = m84081i();
                if (i2 != null) {
                    str = i2.f100310b;
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                aVar.mo71212a(new Word(id, str));
                mo71214h();
                C67540c cVar = (C67540c) new C67532bk().mo106471d(Integer.valueOf(i)).mo106475w(list.get(i).getWord()).mo106453i(list.get(i).getId());
                TypeWords typeWords2 = this.f97958c;
                if (typeWords2 != null) {
                    str2 = typeWords2.logId;
                }
                C67530bj bjVar = (C67530bj) cVar.mo106484d(str2);
                C89219l.m154721d(bjVar, "");
                bjVar.mo106474v("search_bar_outer").mo106477y("discovery").mo96792f();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: a */
    public final void mo71185a(C41855a<TypeWords> aVar) {
        T t;
        List<Word> list = (aVar == null || (t = aVar.f97652b) == null) ? null : t.words;
        if (list == null || list.isEmpty()) {
            this.f97994h = false;
            m84083k();
            return;
        }
        TypeWords typeWords = this.f97958c;
        if (C89219l.m154714a(list, typeWords != null ? typeWords.words : null)) {
            this.f97994h = false;
            this.f97958c = aVar.f97652b;
            m84083k();
            return;
        }
        this.f97994h = true;
        this.f97958c = aVar.f97652b;
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            T t3 = aVar.f97652b;
            t2.setImplId(t3 != null ? t3.logId : null);
            arrayList.add(t2.getShowWord());
        }
        C43031b i = m84081i();
        if (i != null) {
            i.f100312d = arrayList;
            i.f100314f = -1;
            if (!m84082j()) {
                if (this.f97994h && !m84082j()) {
                    this.f97995i.f98000b.mo71210a(8);
                    LinearLayout a = mo71183a();
                    if (a != null) {
                        a.setVisibility(0);
                    }
                }
                if (this.f97992f) {
                    C43031b i2 = m84081i();
                    if (i2 != null) {
                        i2.mo73228a(0, false);
                        C43031b.m85864a(i2);
                        return;
                    }
                    return;
                }
                C43031b i3 = m84081i();
                if (i3 != null && i3.f100310b == null) {
                    i3.mo73228a(0, false);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42029b
    /* renamed from: a */
    public final boolean mo71187a(String str) {
        List<Word> list;
        Word word;
        String word2;
        C89219l.m154721d(str, "");
        C43031b i = m84081i();
        if (i != null) {
            int i2 = i.f100314f;
            TypeWords typeWords = this.f97958c;
            if (!(typeWords == null || (list = typeWords.words) == null || list.isEmpty())) {
                int size = list.size();
                if (i2 >= 0 && size > i2) {
                    String str2 = null;
                    if (!(1 == 0 || (word = list.get(i2)) == null || (word2 = word.getWord()) == null || word2.length() == 0)) {
                        C42027l.AbstractC42028a aVar = this.f97995i.f98000b;
                        String showWord = word.getShowWord();
                        if (showWord == null) {
                            showWord = "";
                        }
                        String word3 = word.getWord();
                        if (word3 == null) {
                            word3 = "";
                        }
                        aVar.mo71213a(showWord, word3);
                        mo71214h();
                        C67528bi biVar = new C67528bi();
                        biVar.mo106471d(Integer.valueOf(i2));
                        biVar.mo106475w(word.getWord());
                        biVar.mo106453i(word.getId());
                        TypeWords typeWords2 = this.f97958c;
                        if (typeWords2 != null) {
                            str2 = typeWords2.logId;
                        }
                        biVar.mo106484d(str2);
                        C89219l.m154721d(biVar, "");
                        biVar.mo106474v("search_bar_outer").mo106477y("discovery").mo96792f();
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42006e(C42027l.C42033e eVar, SearchIntermediateViewModel searchIntermediateViewModel) {
        super(eVar);
        C89219l.m154721d(eVar, "");
        this.f97959d = searchIntermediateViewModel;
        this.f97960j = C89250i.m154773a((AbstractC89171a) new C42010d(eVar));
        LinearLayout a = mo71183a();
        if (a != null) {
            a.setOnClickListener(new View$OnClickListenerC42007a(eVar));
        }
        C43031b i = m84081i();
        if (i != null) {
            i.f100311c = 3000;
            C89219l.m154721d(this, "");
            i.f100316h.add(this);
        }
    }
}
