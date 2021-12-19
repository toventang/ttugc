package com.p2082ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import android.app.Dialog;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.C40961de;
import com.p2082ss.android.ugc.aweme.C41463df;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34674d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34675e;
import com.p2082ss.android.ugc.aweme.feed.AbstractC49420e;
import com.p2082ss.android.ugc.aweme.feed.C49563g;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48153am;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48239cf;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49748e;
import com.p2082ss.android.ugc.aweme.landpage.p3389b.C58067a;
import com.p2082ss.android.ugc.aweme.newfollow.p3504a.C61494a;
import com.p2082ss.android.ugc.aweme.recommend.C66641n;
import com.p2082ss.android.ugc.aweme.recommend.View$OnClickListenerC66629k;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.service.FeedComponentServiceImpl */
public class FeedComponentServiceImpl implements IFeedComponentService {

    /* renamed from: a */
    private AbstractC48153am f115057a;

    static {
        Covode.recordClassIndex(59018);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.service.IFeedComponentService
    /* renamed from: a */
    public final AbstractC48153am mo84950a() {
        if (this.f115057a == null) {
            this.f115057a = new C48239cf();
        }
        return this.f115057a;
    }

    /* renamed from: b */
    public static IFeedComponentService m93697b() {
        MethodCollector.m26663i(7908);
        Object a = C81908b.m141854a(IFeedComponentService.class, false);
        if (a != null) {
            IFeedComponentService iFeedComponentService = (IFeedComponentService) a;
            MethodCollector.m26664o(7908);
            return iFeedComponentService;
        }
        if (C81908b.f183235bl == null) {
            synchronized (IFeedComponentService.class) {
                try {
                    if (C81908b.f183235bl == null) {
                        C81908b.f183235bl = new FeedComponentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7908);
                    throw th;
                }
            }
        }
        FeedComponentServiceImpl feedComponentServiceImpl = (FeedComponentServiceImpl) C81908b.f183235bl;
        MethodCollector.m26664o(7908);
        return feedComponentServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.service.IFeedComponentService
    /* renamed from: a */
    public final AbstractC24641d mo84949a(float f) {
        return new C61494a(5, f, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.service.IFeedComponentService
    /* renamed from: a */
    public final <T> T mo84953a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        if (C89219l.m154714a(cls, AbstractC34675e.class)) {
            return (T) new C40961de();
        }
        if (C89219l.m154714a(cls, AbstractC34674d.class)) {
            return (T) new C41463df();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.service.IFeedComponentService
    /* renamed from: a */
    public final Boolean mo84952a(Activity activity) {
        Dialog dialog;
        C89219l.m154721d(activity, "");
        boolean z = false;
        if (C66641n.m118410a()) {
            View$OnClickListenerC66629k kVar = null;
            if (!(activity instanceof ActivityC0945e)) {
                activity = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) activity;
            if (eVar != null) {
                Fragment a = eVar.getSupportFragmentManager().mo3551a("RecommendUserDialogFragment");
                if (a instanceof View$OnClickListenerC66629k) {
                    kVar = a;
                }
                View$OnClickListenerC66629k kVar2 = kVar;
                if (kVar2 != null && (dialog = kVar2.getDialog()) != null && dialog.isShowing() && kVar2.f149780b) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.service.IFeedComponentService
    /* renamed from: b */
    public final List<AnchorCommonStruct> mo84955b(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : anchors) {
            if (t.getType() == EnumC31359ab.DONATION_STICKER.getTYPE()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.service.IFeedComponentService
    /* renamed from: a */
    public final boolean mo84954a(Aweme aweme) {
        return C58067a.f132302a.mo95569a(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.service.IFeedComponentService
    /* renamed from: a */
    public final AbstractC49420e mo84951a(String str, int i, AbstractC49691s<C49672ag> sVar, AbstractC49748e eVar) {
        return new C49563g(str, i, sVar, eVar);
    }
}
