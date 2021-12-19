package com.p2082ss.android.ugc.aweme.main;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.video.C80749k;
import com.p2082ss.android.ugc.aweme.video.C81079v;

/* renamed from: com.ss.android.ugc.aweme.main.aq */
public class C59031aq extends TiktokBaseMainHelper {

    /* renamed from: a */
    public boolean f134403a;

    static {
        Covode.recordClassIndex(69376);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59106m, com.p2082ss.android.ugc.aweme.main.TiktokBaseMainHelper
    /* renamed from: a */
    public final void mo89425a() {
        super.mo89425a();
        C81079v.m140776O().mo123909C();
        C80749k.m140049a();
        BusinessComponentServiceUtils.getMainHelperService();
        AwemeService.m70060b().mo60681a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo96563b() {
        boolean a = CommentServiceImpl.m73664e().mo63297a(this.f134329b);
        this.f134403a = a;
        if (!a) {
            return false;
        }
        CommentServiceImpl.m73664e().mo63303b(this.f134329b);
        return true;
    }

    public C59031aq(Activity activity) {
        super(activity);
    }
}
