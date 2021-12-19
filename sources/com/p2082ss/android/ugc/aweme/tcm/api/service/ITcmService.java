package com.p2082ss.android.ugc.aweme.tcm.api.service;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAToPublish;
import com.p2082ss.android.ugc.aweme.tcm.api.p4073a.AbstractC77727a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tcm.api.service.ITcmService */
public interface ITcmService {
    static {
        Covode.recordClassIndex(90789);
    }

    /* renamed from: a */
    int mo121246a(Context context, Activity activity, boolean z, boolean z2, boolean z3, List<? extends AVTextExtraStruct> list);

    /* renamed from: a */
    AbstractC77734a mo121247a(ViewGroup viewGroup, Context context);

    /* renamed from: a */
    AbstractC77735b mo121248a(ViewStub viewStub);

    /* renamed from: a */
    void mo121249a(Activity activity, boolean z);

    /* renamed from: a */
    void mo121250a(Context context, C18288a aVar, AbstractC16208i iVar);

    /* renamed from: a */
    void mo121251a(Context context, Aweme aweme);

    /* renamed from: a */
    void mo121252a(ViewStub viewStub, AbstractC63199ax.AbstractC63200a aVar);

    /* renamed from: a */
    void mo121253a(AbstractC77727a aVar);

    /* renamed from: a */
    boolean mo121254a();

    /* renamed from: a */
    boolean mo121255a(Activity activity, Context context, boolean z, List<? extends AVTextExtraStruct> list, CheckBAShowLoading checkBAShowLoading, CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, CheckBADetagBA checkBADetagBA);

    /* renamed from: a */
    boolean mo121256a(Aweme aweme, String str);

    /* renamed from: b */
    String mo121257b();

    /* renamed from: b */
    void mo121258b(Context context, Aweme aweme);

    /* renamed from: b */
    boolean mo121259b(Aweme aweme, String str);

    /* renamed from: c */
    String mo121260c();

    /* renamed from: d */
    String mo121261d();

    /* renamed from: e */
    int mo121262e();

    /* renamed from: f */
    BcAdModel mo121263f();

    /* renamed from: g */
    boolean mo121264g();

    /* renamed from: h */
    void mo121265h();

    /* renamed from: i */
    TcmConfig mo121266i();
}
