package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.VisitedAccount;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.search.C67590l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.al */
public interface AbstractC42664al {

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.al$a */
    public interface AbstractC42665a {
        static {
            Covode.recordClassIndex(50769);
        }

        /* renamed from: a */
        void mo72860a(int i, Word word);

        /* renamed from: b */
        void mo72861b(int i, Word word);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.al$b */
    public interface AbstractC42666b {
        static {
            Covode.recordClassIndex(50770);
        }

        /* renamed from: a */
        void mo72862a(SearchHistory searchHistory, int i);

        /* renamed from: b */
        void mo72863b();

        /* renamed from: b */
        void mo72864b(SearchHistory searchHistory, int i);

        /* renamed from: c */
        void mo72865c();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.al$c */
    public interface AbstractC42667c {
        static {
            Covode.recordClassIndex(50771);
        }

        /* renamed from: a */
        void mo72866a(VisitedAccount visitedAccount, int i);

        /* renamed from: a */
        void mo72867a(VisitedAccount visitedAccount, String str, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.al$d */
    public interface AbstractC42668d {
        static {
            Covode.recordClassIndex(50772);
        }

        /* renamed from: a */
        void mo72868a(Word word, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.al$e */
    public interface AbstractC42669e {
        static {
            Covode.recordClassIndex(50773);
        }

        /* renamed from: a */
        void mo72869a(RecyclerView.AbstractC1371n nVar);

        /* renamed from: a */
        void mo72870a(C67590l lVar, int i, int i2);

        /* renamed from: b */
        void mo72871b(C67590l lVar, int i, int i2);
    }

    static {
        Covode.recordClassIndex(50768);
    }
}
