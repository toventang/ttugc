package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.gif.AbstractC68942h;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.ArrayList;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ShareDependService */
public interface ShareDependService {

    /* renamed from: a */
    public static final C68822a f153919a = C68822a.f153920a;

    static {
        Covode.recordClassIndex(81110);
    }

    /* renamed from: a */
    AbstractFutureC27655q<PromoteEntryCheck> mo109322a(String str, String str2);

    /* renamed from: a */
    AbstractC32846a mo109323a(User user);

    /* renamed from: a */
    AbstractC68942h mo109324a();

    /* renamed from: a */
    AbstractC69581b mo109325a(SharePackage sharePackage, String str);

    /* renamed from: a */
    DialogC69695i mo109326a(Activity activity, C69684e eVar, int i);

    /* renamed from: a */
    String mo109327a(Aweme aweme, int i);

    /* renamed from: a */
    void mo109328a(Activity activity);

    /* renamed from: a */
    void mo109329a(Activity activity, Aweme aweme);

    /* renamed from: a */
    void mo109330a(Context context, Aweme aweme);

    /* renamed from: a */
    void mo109331a(Context context, Aweme aweme, String str);

    /* renamed from: a */
    void mo109332a(Context context, Aweme aweme, String str, String str2, String str3);

    /* renamed from: a */
    void mo109333a(Context context, Aweme aweme, boolean z, ArrayList<String> arrayList, String str, int i, boolean z2);

    /* renamed from: a */
    void mo109334a(Context context, String str);

    /* renamed from: a */
    void mo109335a(Context context, String str, int i);

    /* renamed from: a */
    void mo109336a(Context context, boolean z);

    /* renamed from: a */
    void mo109337a(Aweme aweme, Activity activity, String str);

    /* renamed from: a */
    void mo109338a(Aweme aweme, String str);

    /* renamed from: a */
    void mo109339a(Aweme aweme, String str, Context context, String str2, String str3);

    /* renamed from: a */
    void mo109340a(AbstractC69581b bVar);

    /* renamed from: a */
    void mo109341a(String str, Context context);

    /* renamed from: a */
    void mo109342a(String str, C33744d dVar);

    /* renamed from: a */
    void mo109343a(String str, Aweme aweme, Activity activity, String str2, Map<String, String> map, boolean z, boolean z2);

    /* renamed from: a */
    void mo109344a(boolean z);

    /* renamed from: a */
    boolean mo109345a(Aweme aweme);

    /* renamed from: b */
    int mo109346b(Aweme aweme);

    /* renamed from: b */
    void mo109347b(Context context, Aweme aweme);

    /* renamed from: b */
    boolean mo109348b();

    /* renamed from: c */
    void mo109349c(Context context, Aweme aweme);

    /* renamed from: c */
    boolean mo109350c();

    /* renamed from: c */
    boolean mo109351c(Aweme aweme);

    /* renamed from: d */
    void mo109352d(Context context, Aweme aweme);

    /* renamed from: com.ss.android.ugc.aweme.share.ShareDependService$a */
    public static final class C68822a {

        /* renamed from: a */
        static final /* synthetic */ C68822a f153920a = new C68822a();

        private C68822a() {
        }

        static {
            Covode.recordClassIndex(81111);
        }

        /* renamed from: a */
        public static ShareDependService m121324a() {
            ShareDependService d = ShareDependServiceImpl.m121327d();
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ShareDependService$b */
    public static final class C68823b {
        static {
            Covode.recordClassIndex(81112);
        }

        /* renamed from: a */
        public static /* synthetic */ AbstractC69581b m121325a(ShareDependService shareDependService, SharePackage sharePackage, String str, int i) {
            if ((i & 2) != 0) {
                str = "";
            }
            return shareDependService.mo109325a(sharePackage, str);
        }
    }
}
