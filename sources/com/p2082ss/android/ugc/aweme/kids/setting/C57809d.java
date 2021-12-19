package com.p2082ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o;
import com.p2082ss.android.ugc.aweme.kids.setting.base.p3368a.C57805a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.d */
public final class C57809d implements AbstractC57982o {

    /* renamed from: a */
    public static final C57810a f131848a = new C57810a((byte) 0);

    /* renamed from: b */
    private final Activity f131849b;

    static {
        Covode.recordClassIndex(67813);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final String mo95127a() {
        return "community_guidelines";
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.d$a */
    public static final class C57810a {
        static {
            Covode.recordClassIndex(67814);
        }

        private C57810a() {
        }

        public /* synthetic */ C57810a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: b */
    public final Activity mo95130b() {
        return this.f131849b;
    }

    /* renamed from: c */
    private static boolean m104543c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public C57809d(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f131849b = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final CommonItemView mo95126a(View view) {
        C89219l.m154721d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.abn);
        C89219l.m154716b(commonItemView, "");
        return commonItemView;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final void mo95128a(CommonItemView commonItemView) {
        C89219l.m154721d(commonItemView, "");
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m104543c();
        }
        if (!C58029j.f132256h) {
            new C79459a(this.f131849b).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        C29844g gVar = new C29844g("https://www.tiktok.com/community-guidelines");
        gVar.mo52130a("lang", C57805a.m104529a(this.f131849b));
        String a = gVar.mo52126a();
        C89219l.m154716b(a, "");
        AbstractC57982o.C57983a.m104791a(this, a, this.f131849b.getString(R.string.arm), (Boolean) null, 12);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.AbstractC57982o
    /* renamed from: a */
    public final void mo95129a(String str, String str2, Boolean bool) {
        C89219l.m154721d(str, "");
        AbstractC57982o.C57983a.m104792a(this, str, str2, bool, (Boolean) null);
    }
}
