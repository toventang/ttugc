package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.bi */
public final class C80245bi {
    static {
        Covode.recordClassIndex(93513);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.bi$a */
    public static final class C80246a implements AbstractC84919c {

        /* renamed from: a */
        final /* synthetic */ AbstractC84919c f179726a;

        /* renamed from: b */
        private final AbstractC84919c f179727b;

        /* renamed from: c */
        private final Map<Object, Object> f179728c = new LinkedHashMap();

        static {
            Covode.recordClassIndex(93514);
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
        /* renamed from: a */
        public final void mo87531a(AbstractC84917a aVar) {
            C89219l.m154721d(aVar, "");
        }

        C80246a(AbstractC84919c cVar) {
            this.f179726a = cVar;
            this.f179727b = cVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
        /* renamed from: b */
        public final void mo87534b(AbstractC84918b bVar) {
            C89219l.m154721d(bVar, "");
            if (this.f179728c.containsKey(bVar)) {
                AbstractC84919c cVar = this.f179727b;
                Object remove = this.f179728c.remove(bVar);
                Objects.requireNonNull(remove, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVActivityResultListener");
                cVar.mo87534b((AbstractC84918b) remove);
            }
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
        /* renamed from: c */
        public final void mo87535c(AbstractC84917a aVar) {
            C89219l.m154721d(aVar, "");
            if (this.f179728c.containsKey(aVar)) {
                AbstractC84919c cVar = this.f179727b;
                Object remove = this.f179728c.remove(aVar);
                Objects.requireNonNull(remove, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVActivityOnKeyDownListener");
                cVar.mo87535c((AbstractC84917a) remove);
            }
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
        /* renamed from: a */
        public final void mo87532a(AbstractC84918b bVar) {
            C89219l.m154721d(bVar, "");
            if (!this.f179728c.containsKey(bVar)) {
                this.f179728c.put(bVar, new C80248b(bVar));
            }
            AbstractC84919c cVar = this.f179727b;
            Object obj = this.f179728c.get(bVar);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVActivityResultListener");
            cVar.mo87532a((AbstractC84918b) obj);
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
        /* renamed from: b */
        public final void mo87533b(AbstractC84917a aVar) {
            C89219l.m154721d(aVar, "");
            if (!this.f179728c.containsKey(aVar)) {
                this.f179728c.put(aVar, new C80247a(aVar));
            }
            AbstractC84919c cVar = this.f179727b;
            Object obj = this.f179728c.get(aVar);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVActivityOnKeyDownListener");
            cVar.mo87533b((AbstractC84917a) obj);
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.bi$a$a */
        static final class C80247a implements AbstractC84917a {

            /* renamed from: a */
            final /* synthetic */ AbstractC84917a f179729a;

            static {
                Covode.recordClassIndex(93515);
            }

            C80247a(AbstractC84917a aVar) {
                this.f179729a = aVar;
            }

            @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return this.f179729a.onKeyDown(i, keyEvent);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.bi$a$b */
        static final class C80248b implements AbstractC84918b {

            /* renamed from: a */
            final /* synthetic */ AbstractC84918b f179730a;

            static {
                Covode.recordClassIndex(93516);
            }

            C80248b(AbstractC84918b bVar) {
                this.f179730a = bVar;
            }

            @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b
            /* renamed from: a */
            public final boolean mo62778a(int i, int i2, Intent intent) {
                return this.f179730a.mo62778a(i, i2, intent);
            }
        }
    }

    /* renamed from: a */
    public static final AbstractC84919c m139087a(AbstractC84919c cVar) {
        C89219l.m154721d(cVar, "");
        return new C80246a(cVar);
    }

    /* renamed from: a */
    public static final AbstractC84919c m139086a(Activity activity) {
        C89219l.m154721d(activity, "");
        if ((activity instanceof AbstractC84919c) && activity != null) {
            return m139087a((AbstractC84919c) activity);
        }
        return null;
    }
}
