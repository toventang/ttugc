package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.LiveEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80411ew;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.y */
public final class C69102y implements AbstractC69693h {

    /* renamed from: a */
    public final C18288a f154542a;

    /* renamed from: b */
    public final String f154543b;

    /* renamed from: c */
    private final LiveEvent f154544c;

    static {
        Covode.recordClassIndex(81416);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.bph;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "report_music";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_flag;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return co_();
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        String str;
        String str2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        String eventID = this.f154544c.getEventID();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "report");
        C18288a aVar = this.f154542a;
        if (aVar != null) {
            aVar.mo29252b("live_event_operation", jSONObject);
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "live_event").appendQueryParameter("object_id", eventID);
        User organizer = this.f154544c.getOrganizer();
        if (organizer == null || (str = organizer.getUid()) == null) {
            str = "";
        }
        C39223a.m79587a().mo68688a(C69124b.m122223a(context), appendQueryParameter.appendQueryParameter("owner_id", str));
        C33744d dVar = new C33744d();
        User organizer2 = this.f154544c.getOrganizer();
        if (organizer2 != null) {
            str2 = organizer2.getSecUid();
        } else {
            str2 = null;
        }
        C33744d a = dVar.mo59983a("author_id", str2).mo59983a("object_type", "live_event").mo59983a("object_id", eventID).mo59983a("enter_method", "button");
        String str3 = this.f154543b;
        C89219l.m154716b(a, "");
        C80411ew.m139395a(str3, a);
        C39162r.m79460a("click_report", a.f79943a);
    }

    public C69102y(LiveEvent liveEvent, C18288a aVar, String str) {
        C89219l.m154721d(liveEvent, "");
        this.f154544c = liveEvent;
        this.f154542a = aVar;
        this.f154543b = str;
    }
}
