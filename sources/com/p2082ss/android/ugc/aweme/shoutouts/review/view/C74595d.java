package com.p2082ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.d */
public final class C74595d extends LinearLayout {

    /* renamed from: a */
    private final AbstractC89244h f167737a;

    /* renamed from: b */
    private final AbstractC89244h f167738b;

    /* renamed from: c */
    private final AbstractC89244h f167739c;

    static {
        Covode.recordClassIndex(87409);
    }

    private final ShoutoutsReviewHeaderDescription getHeaderDescription() {
        return (ShoutoutsReviewHeaderDescription) this.f167738b.getValue();
    }

    public final ShoutoutsReviewHeaderSteps getHeaderSteps() {
        return (ShoutoutsReviewHeaderSteps) this.f167739c.getValue();
    }

    public final ShoutoutsReviewHeaderTop getHeaderTop() {
        return (ShoutoutsReviewHeaderTop) this.f167737a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.d$a */
    static final class C74596a extends AbstractC89220m implements AbstractC89171a<ShoutoutsReviewHeaderDescription> {

        /* renamed from: a */
        final /* synthetic */ C74595d f167740a;

        static {
            Covode.recordClassIndex(87410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74596a(C74595d dVar) {
            super(0);
            this.f167740a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ShoutoutsReviewHeaderDescription invoke() {
            return this.f167740a.findViewById(R.id.ajt);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.d$b */
    static final class C74597b extends AbstractC89220m implements AbstractC89171a<ShoutoutsReviewHeaderSteps> {

        /* renamed from: a */
        final /* synthetic */ C74595d f167741a;

        static {
            Covode.recordClassIndex(87411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74597b(C74595d dVar) {
            super(0);
            this.f167741a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ShoutoutsReviewHeaderSteps invoke() {
            return this.f167741a.findViewById(R.id.e81);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.view.d$c */
    static final class C74598c extends AbstractC89220m implements AbstractC89171a<ShoutoutsReviewHeaderTop> {

        /* renamed from: a */
        final /* synthetic */ C74595d f167742a;

        static {
            Covode.recordClassIndex(87412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74598c(C74595d dVar) {
            super(0);
            this.f167742a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ShoutoutsReviewHeaderTop invoke() {
            return this.f167742a.findViewById(R.id.bdx);
        }
    }

    public final void setDescription(String str) {
        C89219l.m154721d(str, "");
        getHeaderDescription().setDescription(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C74595d(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(2679);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.b01, this, true);
        this.f167737a = C89250i.m154773a((AbstractC89171a) new C74598c(this));
        this.f167738b = C89250i.m154773a((AbstractC89171a) new C74596a(this));
        this.f167739c = C89250i.m154773a((AbstractC89171a) new C74597b(this));
        MethodCollector.m26664o(2679);
    }

    public /* synthetic */ C74595d(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    public final void mo117269a(float f, long j) {
        getHeaderTop().mo117261a(f, j);
    }
}
