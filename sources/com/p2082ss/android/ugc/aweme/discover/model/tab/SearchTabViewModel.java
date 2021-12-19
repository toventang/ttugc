package com.p2082ss.android.ugc.aweme.discover.model.tab;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p2082ss.android.ugc.aweme.app.C33593ai;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel */
public final class SearchTabViewModel extends AbstractC1174ac {
    public static final Companion Companion = new Companion(null);
    public final NextLiveData<C33593ai> tabInfo = new NextLiveData<>();

    static {
        Covode.recordClassIndex(50557);
    }

    public static final void addObserver(View view, AbstractC1204m mVar, AbstractC89172b<? super C33593ai, C89391z> bVar) {
        Companion.addObserver(view, mVar, bVar);
    }

    public static final SearchTabViewModel from(View view) {
        return Companion.from(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(50558);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        /* renamed from: com_ss_android_ugc_aweme_discover_model_tab_SearchTabViewModel$Companion_androidx_lifecycle_VScopeLancet_of */
        public static C1175ad m84895xb3734355(ActivityC0945e eVar) {
            return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
        }

        public final SearchTabViewModel from(View view) {
            C89219l.m154721d(view, "");
            Activity d = C34729o.m70962d(view);
            Objects.requireNonNull(d, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a = m84895xb3734355((ActivityC0945e) d).mo3983a(SearchTabViewModel.class);
            C89219l.m154716b(a, "");
            return (SearchTabViewModel) a;
        }

        public final void addObserver(View view, AbstractC1204m mVar, AbstractC89172b<? super C33593ai, C89391z> bVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(bVar, "");
            from(view).tabInfo.observe(mVar, new SearchObserver().setListener(bVar), true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel$SearchObserver */
    public static final class SearchObserver implements AbstractC1214u<C33593ai> {
        private AbstractC89172b<? super C33593ai, C89391z> listener = SearchTabViewModel$SearchObserver$listener$1.INSTANCE;

        static {
            Covode.recordClassIndex(50559);
        }

        public final SearchObserver setListener(AbstractC89172b<? super C33593ai, C89391z> bVar) {
            C89219l.m154721d(bVar, "");
            this.listener = bVar;
            return this;
        }

        public final void onChanged(C33593ai aiVar) {
            if (aiVar != null) {
                this.listener.invoke(aiVar);
            }
        }
    }
}
