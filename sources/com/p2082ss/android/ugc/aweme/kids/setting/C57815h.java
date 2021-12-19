package com.p2082ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.h */
public final class C57815h implements AbstractC57982o {

    /* renamed from: a */
    public static final C57816a f131854a = new C57816a((byte) 0);

    /* renamed from: b */
    private final Activity f131855b;

    static {
        Covode.recordClassIndex(67819);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final String mo95127a() {
        return "report_problem";
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.h$a */
    public static final class C57816a {
        static {
            Covode.recordClassIndex(67820);
        }

        private C57816a() {
        }

        public /* synthetic */ C57816a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: b */
    public final Activity mo95130b() {
        return this.f131855b;
    }

    public C57815h(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f131855b = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final CommonItemView mo95126a(View view) {
        C89219l.m154721d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.b1a);
        C89219l.m154716b(commonItemView, "");
        return commonItemView;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final void mo95128a(CommonItemView commonItemView) {
        C89219l.m154721d(commonItemView, "");
        String a = new C29844g("https://www.tiktok.com/aweme/inapp/v2/c_feedback").mo52126a();
        C89219l.m154716b(a, "");
        AbstractC57982o.C57983a.m104791a((AbstractC57982o) this, a, (String) null, (Boolean) true, 10);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final void mo95129a(String str, String str2, Boolean bool) {
        C89219l.m154721d(str, "");
        AbstractC57982o.C57983a.m104792a(this, str, str2, bool, (Boolean) null);
    }
}
