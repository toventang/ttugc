package com.p2082ss.android.ugc.aweme.discover.viewmodel;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel */
public final class SearchEnterViewModel extends AbstractC1174ac {

    /* renamed from: b */
    public static final Map<Integer, C67674b> f100246b = new LinkedHashMap();

    /* renamed from: c */
    public static final C42997a f100247c = new C42997a((byte) 0);

    /* renamed from: a */
    public C67674b f100248a;

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel$a */
    public static final class C42997a {
        static {
            Covode.recordClassIndex(51132);
        }

        private C42997a() {
        }

        public /* synthetic */ C42997a(byte b) {
            this();
        }

        /* renamed from: a */
        public static SearchEnterViewModel m85830a(ActivityC0945e eVar) {
            if (eVar == null) {
                return new SearchEnterViewModel();
            }
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SearchEnterViewModel.class);
            C89219l.m154716b(a, "");
            SearchEnterViewModel searchEnterViewModel = (SearchEnterViewModel) a;
            if (searchEnterViewModel.f100248a == null) {
                searchEnterViewModel.f100248a = m85831b(eVar);
            }
            return searchEnterViewModel;
        }

        /* renamed from: b */
        public static C67674b m85831b(ActivityC0945e eVar) {
            if (eVar == null) {
                return null;
            }
            C67674b bVar = SearchEnterViewModel.f100246b.get(Integer.valueOf(eVar.hashCode()));
            if (bVar != null) {
                return bVar;
            }
            return ((SearchEnterViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SearchEnterViewModel.class)).f100248a;
        }
    }

    /* renamed from: a */
    public final boolean mo73184a() {
        C67674b bVar = this.f100248a;
        if (bVar == null || !bVar.isSetHintBySugWord()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final C67674b mo73185b() {
        C67674b bVar = this.f100248a;
        if (bVar == null) {
            return new C67674b();
        }
        return bVar;
    }

    static {
        Covode.recordClassIndex(51131);
    }

    /* renamed from: a */
    public final void mo73183a(ActivityC0945e eVar, C67674b bVar) {
        if (bVar != null && eVar != null) {
            this.f100248a = bVar;
            f100246b.put(Integer.valueOf(eVar.hashCode()), bVar);
        }
    }
}
