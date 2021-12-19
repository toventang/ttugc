package com.p2082ss.android.ugc.aweme.userservice.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20129c;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.BlockStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.userservice.api.IUserService */
public interface IUserService {
    static {
        Covode.recordClassIndex(93342);
    }

    /* renamed from: a */
    AbstractC20129c<String, User> mo123560a();

    /* renamed from: a */
    FollowStatus mo123561a(String str, int i, String str2);

    /* renamed from: a */
    FollowStatus mo123562a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4, Map<String, String> map);

    /* renamed from: a */
    AbstractC88403ab<FollowStatus> mo123563a(String str, String str2, int i, int i2, int i3, String str3, int i4);

    /* renamed from: a */
    AbstractC88979t<C20169f<User>> mo123564a(String str);

    /* renamed from: a */
    AbstractC88979t<BaseResponse> mo123565a(String str, String str2);

    /* renamed from: b */
    C33943c<FollowStatus> mo123566b();

    /* renamed from: c */
    C33943c<BlockStatus> mo123567c();
}
