package com.p2082ss.android.ugc.aweme.duet.p2816ui;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.duet.p2814a.C43254b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.duet.ui.a */
public final class C43266a extends C35658s {

    /* renamed from: I */
    public static final String f101007I = "detail_aweme_list_type";

    /* renamed from: J */
    public static final String f101008J = "event_label";

    /* renamed from: K */
    public static final String f101009K = "detail_id";

    /* renamed from: L */
    public static final String f101010L = "detail_aweme_from";

    /* renamed from: M */
    public static final C43267a f101011M = new C43267a((byte) 0);

    /* renamed from: N */
    private SparseArray f101012N;

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35557a
    /* renamed from: c */
    public final void mo62537c() {
        SparseArray sparseArray = this.f101012N;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35557a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo62537c();
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.a$a */
    public static final class C43267a {
        static {
            Covode.recordClassIndex(51472);
        }

        private C43267a() {
        }

        public /* synthetic */ C43267a(byte b) {
            this();
        }

        /* renamed from: a */
        static String m86373a(String str) {
            return "\"" + str + "\"";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.a$b */
    static final class RunnableC43268b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43266a f101013a;

        static {
            Covode.recordClassIndex(51473);
        }

        RunnableC43268b(C43266a aVar) {
            this.f101013a = aVar;
        }

        public final void run() {
            T t = this.f101013a.f84124d.f92286h;
            if (t instanceof C43254b) {
                ((C43254b) t).mo73781a();
            }
        }
    }

    static {
        Covode.recordClassIndex(51471);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h, com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: j */
    public final void mo62677j() {
        View view = getView();
        if (view != null) {
            view.post(new RunnableC43268b(this));
        }
        super.mo62677j();
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: a */
    public final SmartRoute mo62661a(Aweme aweme, C35658s.C35664c cVar) {
        SmartRoute a = super.mo62661a(aweme, cVar);
        C89219l.m154716b(a, "");
        return a;
    }
}
