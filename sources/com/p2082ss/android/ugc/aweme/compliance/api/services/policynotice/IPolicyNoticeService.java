package com.p2082ss.android.ugc.aweme.compliance.api.services.policynotice;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService */
public interface IPolicyNoticeService {
    static {
        Covode.recordClassIndex(46951);
    }

    /* renamed from: a */
    SpannableStringBuilder mo68666a(Context context, String str, List<PolicyBodyLinkList> list);

    /* renamed from: a */
    View mo68667a(View view);

    /* renamed from: a */
    void mo68668a();

    /* renamed from: a */
    void mo68669a(int i);

    /* renamed from: a */
    void mo68670a(Activity activity);

    /* renamed from: a */
    void mo68671a(String str, String str2);

    /* renamed from: b */
    void mo68672b();

    /* renamed from: c */
    String mo68673c();

    /* renamed from: d */
    String mo68674d();

    /* renamed from: e */
    List<PolicyBodyLinkList> mo68675e();
}
