package com.p2082ss.android.ugc.aweme.search.theme;

import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.CardGradientBgData;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.GradientBgData;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.search.theme.dark.DarkThemeController;
import com.p2082ss.android.ugc.aweme.search.theme.p3706a.C67766a;
import com.p2082ss.android.ugc.aweme.search.theme.p3706a.C67768c;
import com.p2082ss.android.ugc.aweme.search.theme.p3706a.C67769d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.theme.b */
public final class C67778b {

    /* renamed from: d */
    public static final C67779a f151902d = new C67779a((byte) 0);

    /* renamed from: a */
    public final ActivityC0945e f151903a;

    /* renamed from: b */
    public final RecyclerView f151904b;

    /* renamed from: c */
    public final AbstractC51043a f151905c;

    /* renamed from: e */
    private final AbstractC89244h f151906e = C89250i.m154773a((AbstractC89171a) new C67780b(this));

    /* renamed from: f */
    private final AbstractC89244h f151907f = C89250i.m154773a((AbstractC89171a) new C67781c(this));

    static {
        Covode.recordClassIndex(79429);
    }

    /* renamed from: b */
    private final C67769d m119951b() {
        return (C67769d) this.f151907f.getValue();
    }

    /* renamed from: a */
    public final DarkThemeController mo106867a() {
        return (DarkThemeController) this.f151906e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.b$a */
    public static final class C67779a {
        static {
            Covode.recordClassIndex(79430);
        }

        private C67779a() {
        }

        public /* synthetic */ C67779a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.b$c */
    static final class C67781c extends AbstractC89220m implements AbstractC89171a<C67769d> {

        /* renamed from: a */
        final /* synthetic */ C67778b f151909a;

        static {
            Covode.recordClassIndex(79432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67781c(C67778b bVar) {
            super(0);
            this.f151909a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67769d invoke() {
            return new C67769d(this.f151909a.f151903a, this.f151909a.f151904b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.b$b */
    static final class C67780b extends AbstractC89220m implements AbstractC89171a<DarkThemeController> {

        /* renamed from: a */
        final /* synthetic */ C67778b f151908a;

        static {
            Covode.recordClassIndex(79431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67780b(C67778b bVar) {
            super(0);
            this.f151908a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DarkThemeController invoke() {
            return new DarkThemeController(this.f151908a.f151903a, this.f151908a.f151904b, this.f151908a.f151905c);
        }
    }

    /* renamed from: a */
    private final void m119950a(CardGradientBgData cardGradientBgData) {
        mo106867a().mo106880d();
        C67782c a = C67785d.m119956a(cardGradientBgData);
        if (a != null) {
            mo106867a().mo106877a(a);
        }
    }

    /* renamed from: a */
    public final void mo106868a(GlobalDoodleConfig globalDoodleConfig) {
        CardGradientBgData cardGradientBgData;
        GradientBgData gradientBgData;
        GradientBgData gradientBgData2 = null;
        if (globalDoodleConfig != null) {
            cardGradientBgData = globalDoodleConfig.getCardBgData();
            gradientBgData = globalDoodleConfig.getGradientBgData();
        } else {
            cardGradientBgData = null;
            gradientBgData = null;
        }
        m119950a(cardGradientBgData);
        if (gradientBgData != null && cardGradientBgData == null) {
            gradientBgData2 = gradientBgData;
        }
        mo106869a(gradientBgData2);
    }

    /* renamed from: a */
    public final void mo106869a(GradientBgData gradientBgData) {
        C67766a.m119929a();
        m119951b().mo106866e();
        if (gradientBgData != null) {
            m119951b().mo106862a(new C67768c(gradientBgData.getStartColor(), gradientBgData.getCenterColor(), gradientBgData.getScreens()));
        }
    }

    public C67778b(ActivityC0945e eVar, RecyclerView recyclerView, AbstractC51043a aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(aVar, "");
        this.f151903a = eVar;
        this.f151904b = recyclerView;
        this.f151905c = aVar;
    }
}
