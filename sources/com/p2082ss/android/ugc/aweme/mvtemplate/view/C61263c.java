package com.p2082ss.android.ugc.aweme.mvtemplate.view;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MvModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.c */
public final class C61263c extends C35658s {

    /* renamed from: K */
    public static final String f139129K = "detail_aweme_list_type";

    /* renamed from: L */
    public static final String f139130L = "event_label";

    /* renamed from: M */
    public static final String f139131M = "detail_id";

    /* renamed from: N */
    public static final String f139132N = "detail_aweme_from";

    /* renamed from: O */
    public static final C61264a f139133O = new C61264a((byte) 0);

    /* renamed from: I */
    public MvModel f139134I;

    /* renamed from: J */
    public String f139135J;

    /* renamed from: P */
    private SparseArray f139136P;

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35557a
    /* renamed from: c */
    public final void mo62537c() {
        SparseArray sparseArray = this.f139136P;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35557a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo62537c();
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.c$a */
    public static final class C61264a {
        static {
            Covode.recordClassIndex(71881);
        }

        private C61264a() {
        }

        public /* synthetic */ C61264a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(71880);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: a */
    public final SmartRoute mo62661a(Aweme aweme, C35658s.C35664c cVar) {
        SmartRoute a = super.mo62661a(aweme, cVar);
        MvModel mvModel = this.f139134I;
        if (mvModel != null) {
            a.withParam("feed_data_movie_model", mvModel);
        }
        String str = this.f139135J;
        if (str != null) {
            a.withParam("feed_data_movie_group_id", str);
        }
        C89219l.m154716b(a, "");
        return a;
    }
}
