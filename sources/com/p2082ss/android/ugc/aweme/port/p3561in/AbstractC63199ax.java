package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.app.Activity;
import android.content.Intent;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.port.in.ax */
public interface AbstractC63199ax {

    /* renamed from: com.ss.android.ugc.aweme.port.in.ax$a */
    public interface AbstractC63200a {
        static {
            Covode.recordClassIndex(74473);
        }

        /* renamed from: a */
        String mo101676a();

        /* renamed from: a */
        void mo101677a(Boolean bool);

        /* renamed from: a */
        void mo101678a(Boolean bool, Boolean bool2);

        /* renamed from: a */
        void mo101679a(String str);

        /* renamed from: b */
        void mo101680b(Boolean bool);

        /* renamed from: b */
        boolean mo101681b();

        /* renamed from: c */
        boolean mo101682c();
    }

    static {
        Covode.recordClassIndex(74472);
    }

    /* renamed from: a */
    AbstractFutureC27655q<? extends C69831ai> mo93930a(LinkedHashMap<String, String> linkedHashMap);

    /* renamed from: a */
    List<C0692e<Class<?>, IAVPublishExtension<?>>> mo93931a(AVPublishContentType aVPublishContentType);

    /* renamed from: a */
    void mo93932a(Activity activity, String str);

    /* renamed from: a */
    void mo93933a(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap);

    /* renamed from: a */
    void mo93934a(BaseResponse baseResponse, int i);

    /* renamed from: a */
    void mo93935a(boolean z);

    /* renamed from: a */
    boolean mo93936a();

    /* renamed from: a */
    boolean mo93937a(ActivityC0945e eVar, Intent intent);

    /* renamed from: b */
    List<AbstractC72627e> mo93938b();

    /* renamed from: c */
    int mo93939c();

    /* renamed from: d */
    int mo93940d();
}
