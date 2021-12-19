package com.p2082ss.android.ugc.aweme.kids.discovery.gallery;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.KidsAwemeGridViewModel;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3349b.C57557a;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.C57611a;
import com.p2082ss.android.ugc.aweme.kids.experiment.abmock.p3351a.C57614b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.a */
public final class C57577a extends AbstractC57377c {

    /* renamed from: j */
    public static final C57578a f131435j = new C57578a((byte) 0);

    /* renamed from: k */
    private HashMap f131436k;

    static {
        Covode.recordClassIndex(67533);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: c */
    public final String mo94640c() {
        return "gallery";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: m */
    public final void mo94646m() {
        HashMap hashMap = this.f131436k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.a$a */
    public static final class C57578a {
        static {
            Covode.recordClassIndex(67534);
        }

        private C57578a() {
        }

        public /* synthetic */ C57578a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: b */
    public final boolean mo94639b() {
        Object a = C57611a.m104321a(new C57614b());
        Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) a).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: d */
    public final View mo94641d() {
        if (getContext() != null) {
            return C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.acl, null, false);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: a */
    public final void mo94637a() {
        String str;
        C33743c cVar = new C33743c();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("challenge_id")) == null) {
            str = "";
        }
        C57355f.m103962a("end_feed_category_details_page", cVar.mo59976a("category_id", str).mo59977a());
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        C33743c cVar = new C33743c();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("challenge_id")) == null) {
            str = "";
        }
        C57355f.m103962a("exit_category_details_page", cVar.mo59976a("category_id", str).mo59977a());
        super.onDestroyView();
        mo94646m();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        C33743c a = new C33743c().mo59976a("enter_from", "discovery");
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("mob_enter_from")) == null) {
            str = str2;
        }
        C33743c a2 = a.mo59976a("enter_method", str);
        Bundle arguments2 = getArguments();
        if (!(arguments2 == null || (string = arguments2.getString("challenge_id")) == null)) {
            str2 = string;
        }
        C57355f.m103962a("show_category_details_page", a2.mo59976a("category_id", str2).mo59977a());
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: a */
    public final void mo94638a(View view, Aweme aweme) {
        Context context;
        List<Aweme> list;
        C1213t<List<Aweme>> tVar;
        if (aweme != null && (context = getContext()) != null) {
            KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f130784c;
            if (kidsAwemeGridViewModel == null || (tVar = kidsAwemeGridViewModel.f130763a) == null || (list = tVar.getValue()) == null) {
                list = C89086z.INSTANCE;
            }
            C89219l.m154721d(list, "");
            C57557a.f131393a = new WeakReference<>(list);
            SmartRouter.buildRoute(context, "//kids/discovery/feed").withParam("current_id", aweme.getAid().toString()).withParam("enter_from", "category_details_page").withParam("preload_from_cache", true).withParam(getArguments()).open();
        }
    }
}
