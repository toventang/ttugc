package com.p2082ss.android.ugc.aweme.discover.viewmodel;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApi;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49955a;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.b */
public final class C43025b implements AbstractC12644a<AbstractC43027c> {

    /* renamed from: a */
    public final AbstractC43027c f100289a = new C43026a();

    /* renamed from: b */
    private final C49955a f100290b = new C49955a();

    static {
        Covode.recordClassIndex(51167);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.b$a */
    public static final class C43026a implements AbstractC43027c {
        static {
            Covode.recordClassIndex(51168);
        }

        C43026a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.viewmodel.AbstractC43027c
        /* renamed from: a */
        public final Object mo73217a(C42174f fVar) {
            return SearchApi.m83824c(fVar);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC43027c mo20458a() {
        return this.f100289a;
    }
}
