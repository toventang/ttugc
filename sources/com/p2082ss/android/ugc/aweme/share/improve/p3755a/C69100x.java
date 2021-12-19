package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.feed.model.LiveEvent;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.x */
public final class C69100x implements AbstractC69693h {

    /* renamed from: b */
    public static final C69101a f154539b = new C69101a((byte) 0);

    /* renamed from: a */
    public final C18288a f154540a;

    /* renamed from: c */
    private final LiveEvent f154541c;

    static {
        Covode.recordClassIndex(81414);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.gcd;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "refund_live_event";
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

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.x$a */
    public static final class C69101a {
        static {
            Covode.recordClassIndex(81415);
        }

        private C69101a() {
        }

        public /* synthetic */ C69101a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return co_();
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        String startTime = this.f154541c.getStartTime();
        if (startTime == null || Long.parseLong(startTime) - (System.currentTimeMillis() / 1000) < 43200) {
            return R.raw.icon_2pt_refund_grey;
        }
        return R.raw.icon_2pt_refund_black;
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

    public C69100x(LiveEvent liveEvent, C18288a aVar) {
        C89219l.m154721d(liveEvent, "");
        this.f154541c = liveEvent;
        this.f154540a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "refund");
        C18288a aVar = this.f154540a;
        if (aVar != null) {
            aVar.mo29252b("live_event_operation", jSONObject);
        }
    }
}
