package com.p2082ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67558l;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.discover.mob.p */
public final /* synthetic */ class CallableC42468p implements Callable {

    /* renamed from: a */
    private final String f98994a;

    /* renamed from: b */
    private final Aweme f98995b;

    /* renamed from: c */
    private final View f98996c;

    /* renamed from: d */
    private final String f98997d;

    /* renamed from: e */
    private final String f98998e;

    /* renamed from: f */
    private final String f98999f;

    /* renamed from: g */
    private final String f99000g;

    static {
        Covode.recordClassIndex(50417);
    }

    CallableC42468p(String str, Aweme aweme, View view, String str2, String str3, String str4, String str5) {
        this.f98994a = str;
        this.f98995b = aweme;
        this.f98996c = view;
        this.f98997d = str2;
        this.f98998e = str3;
        this.f98999f = str4;
        this.f99000g = str5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String b;
        String str = this.f98994a;
        Aweme aweme = this.f98995b;
        View view = this.f98996c;
        String str2 = this.f98997d;
        String str3 = this.f98998e;
        String str4 = this.f98999f;
        String str5 = this.f99000g;
        if (str.equals("general_search")) {
            b = C42452d.m84857a();
        } else {
            b = C59208ac.m108763b(aweme);
        }
        C39162r.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName(str).setValue(aweme.getAid()).setJsonObject(new C33743c().mo59976a("request_id", C59208ac.m108763b(aweme)).mo59977a()));
        C67542d dVar = (C67542d) ((C67540c) ((C67540c) new C67558l(C42460j.C42461a.m84864a(view)).mo106503f(aweme).mo106459o(str).mo106453i(C59208ac.m108771e(aweme))).mo106482b(str2).mo106487g(C59208ac.m108771e(aweme)).mo106454j(aweme.getAuthorUid())).mo106483c(C48027ac.C48028a.f111257a.mo80055a(b)).mo106480a(b).mo96788a(C80632w.m139800a(aweme, "feed_enter", str));
        if (!TextUtils.isEmpty(str3)) {
            dVar.mo106487g(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            dVar.mo106495v(str4);
        }
        if (!TextUtils.isEmpty(b)) {
            dVar.mo106480a(b);
        }
        if (!TextUtils.isEmpty(str5)) {
            dVar.mo106460p(str5);
        }
        dVar.mo96792f();
        return null;
    }
}
