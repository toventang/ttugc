package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40565d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.ui.m */
public final class C34693m extends AbstractC34684d implements AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C34694a f81959c = new C34694a((byte) 0);

    /* renamed from: b */
    public final String f81960b;

    /* renamed from: d */
    private String f81961d;

    /* renamed from: e */
    private final String f81962e;

    /* renamed from: f */
    private String f81963f;

    static {
        Covode.recordClassIndex(41680);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(299, new RunnableC90250g(C34693m.class, "onH5Finish", C40565d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.m$a */
    public static final class C34694a {
        static {
            Covode.recordClassIndex(41681);
        }

        private C34694a() {
        }

        public /* synthetic */ C34694a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m70858a(Context context, String str) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                context.getPackageManager().getPackageInfo(str, 0);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    @AbstractC90264r
    public final void onH5Finish(C40565d dVar) {
        String str;
        String str2;
        C89219l.m154721d(dVar, "");
        C33744d dVar2 = new C33744d();
        Aweme aweme = this.f81941a;
        if (aweme == null || (str = aweme.getAuthorUid()) == null) {
            str = "";
        }
        C33744d a = dVar2.mo59983a("author_id", str);
        Aweme aweme2 = this.f81941a;
        if (aweme2 == null || (str2 = aweme2.getAid()) == null) {
            str2 = "";
        }
        C33744d a2 = a.mo59983a("group_id", str2).mo59983a("enter_from", this.f81960b).mo59983a("anchor_type", this.f81963f).mo59983a("anchor_name", this.f81962e).mo59983a("anchor_id", this.f81961d).mo59983a("music_id", C59208ac.m108770d(this.f81941a));
        C89219l.m154716b(a2, "");
        C39162r.m79460a("anchor_stay_time", a2.mo59981a("duration", dVar.f94911a).f79943a);
        EventBus.m156962a().mo145395b(this);
    }
}
