package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import com.bytedance.android.live.base.model.C2962b;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56232b;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.p2082ss.android.ugc.aweme.share.improve.C68963a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.ae */
public final class C58656ae implements IHostShare {
    static {
        Covode.recordClassIndex(68958);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final String getBundleKey(int i) {
        if (i == 0) {
            return "shared_users_id_list";
        }
        if (i == 1) {
            return "friends_shared_cnt";
        }
        if (i == 2) {
            return "is_create_group_chat";
        }
        if (i == 3) {
            return "batch_share_type";
        }
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void getUrlModelAndShowAnim(final IHostShare.AbstractC11791a aVar) {
        IMService.createIIMServicebyMonsterPlugin(false).getRelationService().mo92291a(new AbstractC56232b.AbstractC56233a() {
            /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58656ae.C586571 */

            static {
                Covode.recordClassIndex(68959);
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56232b.AbstractC56233a
            /* renamed from: a */
            public final void mo93050a(List<IMContact> list) {
                ArrayList arrayList = new ArrayList();
                for (IMContact iMContact : list) {
                    if (!(iMContact == null || iMContact.getDisplayAvatar() == null)) {
                        C2962b bVar = new C2962b();
                        bVar.f8711a = iMContact.getDisplayAvatar().getUri();
                        bVar.f8712b = iMContact.getDisplayAvatar().getUrlList();
                        arrayList.add(bVar);
                    }
                }
                aVar.mo17691a(arrayList);
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final boolean isImChannel(String str) {
        String c = ShareExtServiceImpl.m121353e().mo109367c();
        if (C13627m.m24499a("chat_merge", str)) {
            return true;
        }
        if (!C13627m.m24498a(str) || !C13627m.m24499a("im_channel", c)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final boolean isShareAvailable(String str, Activity activity) {
        AbstractC69581b a = C68963a.C68964a.m121652a(str, activity);
        if (a == null || !a.mo109557b(activity)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void getShortUrl(String str, IHostShare.AbstractC11792b bVar) {
        String cL_ = C68863ah.f154028b.mo109358a("", "", str).cL_();
        if (bVar != null) {
            bVar.mo17684a(cL_);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void share(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        LiveHostOuterService.m107232p().mo95810c(activity, cVar, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Dialog getLongPressShareDialog(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        return LiveHostOuterService.m107232p().mo95805b(activity, cVar, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Dialog getShareDialog(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        return LiveHostOuterService.m107232p().mo95796a(activity, cVar, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void showReportDialog(Activity activity, C11666c cVar, String str) {
        if (cVar != null) {
            C39223a.m79587a().mo68688a(activity, new Uri.Builder().appendQueryParameter("object_id", String.valueOf(cVar.f27798E)).appendQueryParameter("owner_id", String.valueOf(cVar.f27799F)).appendQueryParameter("report_type", str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 == null) goto L_0x0038;
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<java.lang.String, android.graphics.drawable.Drawable> getBreathShareAnimShareRes(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L_0x0004
            return r2
        L_0x0004:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.p2082ss.android.ugc.aweme.share.ShareExtServiceImpl.m121353e()
            android.app.Activity r4 = (android.app.Activity) r4
            android.graphics.drawable.Drawable r1 = r0.mo109354a(r4, r5)
            if (r1 != 0) goto L_0x0041
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.p2082ss.android.ugc.aweme.share.ShareExtServiceImpl.m121353e()
            android.graphics.drawable.Drawable r1 = r0.mo109353a(r4)
            java.lang.String r5 = com.p2082ss.android.ugc.aweme.feed.C48314ai.m91750c()
            com.ss.android.ugc.aweme.sharer.b r0 = com.p2082ss.android.ugc.aweme.share.improve.C68963a.C68964a.m121652a(r5, r4)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "other"
            boolean r0 = com.bytedance.common.utility.C13627m.m24499a(r5, r0)
            if (r0 != 0) goto L_0x003e
        L_0x002e:
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.p2082ss.android.ugc.aweme.share.ShareExtServiceImpl.m121353e()
            android.graphics.drawable.Drawable r1 = r0.mo109354a(r4, r6)
            if (r1 != 0) goto L_0x0042
        L_0x0038:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x003e:
            if (r1 != 0) goto L_0x0041
            goto L_0x002e
        L_0x0041:
            r6 = r5
        L_0x0042:
            r2 = r6
            goto L_0x0038
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.livehostimpl.C58656ae.getBreathShareAnimShareRes(android.content.Context, java.lang.String, java.lang.String):android.util.Pair");
    }
}
