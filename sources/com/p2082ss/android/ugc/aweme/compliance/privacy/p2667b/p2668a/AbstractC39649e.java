package com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.e */
interface AbstractC39649e {

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.e$c */
    public interface AbstractC39654c {
        static {
            Covode.recordClassIndex(47373);
        }

        /* renamed from: a */
        int mo69059a(int i);

        /* renamed from: b */
        int mo69060b(int i);
    }

    static {
        Covode.recordClassIndex(47368);
    }

    /* renamed from: a */
    C39638c mo69057a(int i);

    /* renamed from: a */
    AbstractC39654c mo69058a(C39638c cVar);

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.e$a */
    public static class C39650a implements AbstractC39649e {

        /* renamed from: a */
        SparseArray<C39638c> f93444a = new SparseArray<>();

        /* renamed from: b */
        int f93445b = 0;

        static {
            Covode.recordClassIndex(47369);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39649e
        /* renamed from: a */
        public final AbstractC39654c mo69058a(C39638c cVar) {
            return new C39651a(cVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39649e
        /* renamed from: a */
        public final C39638c mo69057a(int i) {
            C39638c cVar = this.f93444a.get(i);
            if (cVar != null) {
                return cVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type ".concat(String.valueOf(i)));
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.e$a$a */
        class C39651a implements AbstractC39654c {

            /* renamed from: a */
            final C39638c f93446a;

            /* renamed from: c */
            private SparseIntArray f93448c = new SparseIntArray(1);

            /* renamed from: d */
            private SparseIntArray f93449d = new SparseIntArray(1);

            static {
                Covode.recordClassIndex(47370);
            }

            @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39649e.AbstractC39654c
            /* renamed from: a */
            public final int mo69059a(int i) {
                int indexOfKey = this.f93448c.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.f93448c.valueAt(indexOfKey);
                }
                C39650a aVar = C39650a.this;
                C39638c cVar = this.f93446a;
                int i2 = aVar.f93445b;
                aVar.f93445b = i2 + 1;
                aVar.f93444a.put(i2, cVar);
                this.f93448c.put(i, i2);
                this.f93449d.put(i2, i);
                return i2;
            }

            @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39649e.AbstractC39654c
            /* renamed from: b */
            public final int mo69060b(int i) {
                int indexOfKey = this.f93449d.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.f93449d.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.f93446a.f93432c);
            }

            C39651a(C39638c cVar) {
                this.f93446a = cVar;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.e$b */
    public static class C39652b implements AbstractC39649e {

        /* renamed from: a */
        SparseArray<List<C39638c>> f93450a = new SparseArray<>();

        static {
            Covode.recordClassIndex(47371);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39649e
        /* renamed from: a */
        public final AbstractC39654c mo69058a(C39638c cVar) {
            return new C39653a(cVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.e$b$a */
        class C39653a implements AbstractC39654c {

            /* renamed from: a */
            final C39638c f93451a;

            static {
                Covode.recordClassIndex(47372);
            }

            @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39649e.AbstractC39654c
            /* renamed from: b */
            public final int mo69060b(int i) {
                return i;
            }

            @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39649e.AbstractC39654c
            /* renamed from: a */
            public final int mo69059a(int i) {
                List<C39638c> list = C39652b.this.f93450a.get(i);
                if (list == null) {
                    list = new ArrayList<>();
                    C39652b.this.f93450a.put(i, list);
                }
                if (!list.contains(this.f93451a)) {
                    list.add(this.f93451a);
                }
                return i;
            }

            C39653a(C39638c cVar) {
                this.f93451a = cVar;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.AbstractC39649e
        /* renamed from: a */
        public final C39638c mo69057a(int i) {
            List<C39638c> list = this.f93450a.get(i);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type ".concat(String.valueOf(i)));
        }
    }
}
