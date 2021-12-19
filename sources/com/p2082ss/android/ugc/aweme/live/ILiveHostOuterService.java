package com.p2082ss.android.ugc.aweme.live;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.model.C11836b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.ILiveHostOuterService */
public interface ILiveHostOuterService {

    /* renamed from: com.ss.android.ugc.aweme.live.ILiveHostOuterService$a */
    public interface AbstractC58469a {
        static {
            Covode.recordClassIndex(68749);
        }

        /* renamed from: a */
        void mo95824a(User user);

        /* renamed from: a */
        void mo95825a(Exception exc);
    }

    static {
        Covode.recordClassIndex(68748);
    }

    /* renamed from: a */
    Dialog mo95796a(Activity activity, C11666c cVar, AbstractC11665b bVar);

    /* renamed from: a */
    Intent mo95797a(Context context);

    /* renamed from: a */
    String mo95798a();

    /* renamed from: a */
    void mo95799a(long j);

    /* renamed from: a */
    void mo95800a(Activity activity);

    /* renamed from: a */
    void mo95801a(Activity activity, boolean z, boolean z2);

    /* renamed from: a */
    void mo95802a(Context context, String str);

    /* renamed from: a */
    void mo95803a(String str, String str2, AbstractC58469a aVar);

    /* renamed from: a */
    void mo95804a(boolean z);

    /* renamed from: b */
    Dialog mo95805b(Activity activity, C11666c cVar, AbstractC11665b bVar);

    /* renamed from: b */
    Intent mo95806b(Context context);

    /* renamed from: b */
    void mo95807b(Context context, String str);

    /* renamed from: b */
    boolean mo95808b();

    /* renamed from: c */
    Locale mo95809c();

    /* renamed from: c */
    void mo95810c(Activity activity, C11666c cVar, AbstractC11665b bVar);

    /* renamed from: c */
    boolean mo95811c(Context context);

    /* renamed from: d */
    List<String> mo95812d();

    /* renamed from: e */
    boolean mo95813e();

    /* renamed from: f */
    String mo95814f();

    /* renamed from: g */
    boolean mo95815g();

    /* renamed from: h */
    long mo95816h();

    /* renamed from: i */
    void mo95817i();

    /* renamed from: j */
    List<C11836b> mo95818j();

    /* renamed from: k */
    String mo95819k();

    /* renamed from: l */
    String mo95820l();

    /* renamed from: m */
    int mo95821m();

    /* renamed from: n */
    double mo95822n();

    /* renamed from: o */
    JSONObject mo95823o();
}
