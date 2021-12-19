package com.p2082ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.C31364ac;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.component.C34544g;
import com.p2082ss.android.ugc.aweme.commercialize.C37584a;
import com.p2082ss.android.ugc.aweme.commercialize.C37635c;
import com.p2082ss.android.ugc.aweme.commercialize.C38007h;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.mix.C59411c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import com.p2082ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68344b;
import com.p2082ss.android.ugc.aweme.share.C68864ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p2082ss.android.ugc.aweme.shortvideo.model.StarAtlasPublishModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71898d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73452ae;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73820x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72627e;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.CreateAwemeApi;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4076b.C77739a;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4076b.C77741c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.p4314h.C84116g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.initializer.p */
public final class C56787p implements AbstractC63199ax {
    static {
        Covode.recordClassIndex(66652);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: c */
    public final int mo93939c() {
        return C77739a.f174322a;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: a */
    public final boolean mo93937a(ActivityC0945e eVar, Intent intent) {
        C72678q publishModel;
        C51423a.m95791b(4, "Tools-Client", "PublishServiceImpl process publish intent:" + m102960a(intent));
        if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT")) {
            C51423a.m95787a("processPublish. EXTRA_AWEME_DRAFT ");
            return true;
        } else if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_LIGHTENING_PUBLISH")) {
            if (intent.hasExtra("multi_publish_id")) {
                return new MainActivityCallback(eVar, m102961a(intent, "multi_publish_id")).f143629e;
            }
            return true;
        } else if (intent.hasExtra("multi_publish_id")) {
            return new MainActivityCallback(eVar, m102961a(intent, "multi_publish_id")).f143629e;
        } else {
            IAVPublishService publishService = AVExternalServiceImpl.m113114a().publishService();
            if (!publishService.isParallelPublishEnabled() && (publishModel = publishService.getPublishModel(null)) != null && publishModel.f162930c == 0 && publishService.isPublishing()) {
                return new MainActivityCallback(eVar, null).f143629e;
            }
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: d */
    public final int mo93940d() {
        return C84116g.m144637f();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: b */
    public final List<AbstractC72627e> mo93938b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C38007h());
        arrayList.add(new C68864ai());
        arrayList.add(new C37584a());
        arrayList.add(new C37635c());
        arrayList.add(new C59411c());
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: a */
    public final boolean mo93936a() {
        return C68344b.m120623a(PushSettingsApiManager.m120628a().f152957T);
    }

    /* renamed from: a */
    private static Bundle m102960a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: a */
    public final AbstractFutureC27655q<? extends C69831ai> mo93930a(LinkedHashMap<String, String> linkedHashMap) {
        return CreateAwemeApi.f162633a.createAweme(null, linkedHashMap);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: a */
    public final List<C0692e<Class<?>, IAVPublishExtension<?>>> mo93931a(AVPublishContentType aVPublishContentType) {
        C89219l.m154721d(aVPublishContentType, "");
        C89219l.m154721d(aVPublishContentType, "");
        ArrayList arrayList = new ArrayList();
        int i = C31364ac.f75141a[aVPublishContentType.ordinal()];
        if (i == 1 || i == 2) {
            C0692e<Class<?>, IAVPublishExtension<?>> b = C63134c.m114157a().mo101458b();
            if (b != null) {
                arrayList.add(b);
            }
            arrayList.add(C0692e.m2449a(StarAtlasPublishModel.class, new C77741c()));
            arrayList.add(C0692e.m2449a(C73820x.class, new C73820x()));
            return arrayList;
        }
        throw new IllegalArgumentException("unknown type: " + aVPublishContentType.getContentType());
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: a */
    public final void mo93935a(boolean z) {
        AbstractC81915c.m141874a(new C71898d(z));
    }

    /* renamed from: a */
    private static String m102961a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: a */
    public final void mo93932a(Activity activity, String str) {
        if (MainActivityCallback.m114719a(activity)) {
            C73991bj.m130128a("PublishService bindProgressHost direct bind");
            new MainActivityCallback((ActivityC0945e) activity, str);
            return;
        }
        C73991bj.m130128a("PublishService bindProgressHost post retry event");
        AbstractC81915c.m141875b(new C34544g(str));
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: a */
    public final void mo93934a(BaseResponse baseResponse, int i) {
        if (baseResponse instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) baseResponse;
            if (createAwemeResponse.aweme != null) {
                createAwemeResponse.aweme.getVideo().setVideoLength(i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax
    /* renamed from: a */
    public final void mo93933a(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap) {
        new C73452ae(commonItemView, z, hashMap);
    }
}
