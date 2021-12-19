package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAToPublish;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.port.in.ai */
public interface AbstractC63175ai extends AbstractC63261s {

    /* renamed from: com.ss.android.ugc.aweme.port.in.ai$a */
    public interface AbstractC63176a {
        static {
            Covode.recordClassIndex(74449);
        }
    }

    static {
        Covode.recordClassIndex(74448);
    }

    /* renamed from: a */
    int mo93811a(Context context, Activity activity, Boolean bool, Boolean bool2, Boolean bool3, List<AVTextExtraStruct> list);

    /* renamed from: a */
    AbstractC63176a mo93812a();

    /* renamed from: a */
    Mission mo93813a(String str);

    /* renamed from: a */
    Boolean mo93814a(Activity activity, Context context, Boolean bool, List<AVTextExtraStruct> list, CheckBAShowLoading checkBAShowLoading, CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, CheckBADetagBA checkBADetagBA);

    /* renamed from: a */
    String mo93815a(C43223c cVar);

    /* renamed from: a */
    String mo93816a(String str, Mission mission);

    /* renamed from: a */
    String mo93817a(String str, String str2);

    /* renamed from: a */
    String mo93818a(String str, boolean z);

    /* renamed from: a */
    void mo93819a(Activity activity, boolean z);

    /* renamed from: a */
    void mo93820a(ViewStub viewStub, AbstractC63199ax.AbstractC63200a aVar);

    /* renamed from: b */
    Boolean mo93824b();

    /* renamed from: c */
    BcAdModel mo93825c();

    /* renamed from: d */
    String mo93826d();

    /* renamed from: e */
    boolean mo93827e();

    /* renamed from: f */
    void mo93828f();

    /* renamed from: g */
    int mo93829g();

    /* renamed from: h */
    String mo93830h();

    /* renamed from: j */
    boolean mo93832j();
}
