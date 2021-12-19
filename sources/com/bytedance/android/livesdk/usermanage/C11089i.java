package com.bytedance.android.livesdk.usermanage;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p405s.AbstractC6095a;
import com.bytedance.android.live.p405s.AbstractC6100b;
import com.bytedance.android.live.p405s.AbstractC6101c;
import com.bytedance.android.live.p405s.AbstractC6102d;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p405s.AbstractC6104f;
import com.bytedance.android.live.p405s.AbstractC6105g;
import com.bytedance.android.live.p405s.p406a.C6096a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMuteCommentsListSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReportOptimizeUrlSetting;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.p428c.C6523c;
import com.bytedance.android.livesdk.p425aa.p428c.C6529h;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9070ci;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.usermanage.C11051a;
import com.bytedance.android.livesdk.usermanage.C11062f;
import com.bytedance.android.livesdk.usermanage.C11069g;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88504f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.usermanage.i */
public class C11089i implements AbstractC6103e {
    static {
        Covode.recordClassIndex(12710);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public AbstractC88403ab<C3265j> getMuteDuration() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        C3265j jVar = C11069g.f26639a.get(Long.valueOf(c));
        if (jVar != null) {
            AbstractC88403ab<C3265j> a = AbstractC88403ab.m153602a(jVar);
            C89219l.m154716b(a, "");
            return a;
        }
        AbstractC88403ab<C3265j> a2 = AbstractC88403ab.m153604a((Callable) new C11069g.CallableC11072c(c)).mo142921b(C3265j.f9350b).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public String getReportScene() {
        AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
        C89219l.m154716b(a, "");
        if (((AbstractC4409b) a).isRoomInBattle()) {
            return "manual_pk";
        }
        AbstractC2953a a2 = C6193a.m13435a(AbstractC4409b.class);
        C89219l.m154716b(a2, "");
        if (((AbstractC4409b) a2).isInCoHost()) {
            return "anchor";
        }
        AbstractC2953a a3 = C6193a.m13435a(AbstractC4409b.class);
        C89219l.m154716b(a3, "");
        if (((AbstractC4409b) a3).getLinkedGuestNum() > 0) {
            return "audience";
        }
        return "regular";
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void fetchMuteDurationList(AbstractC89172b<? super List<C3265j>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
        double[] value = LiveMuteCommentsListSetting.INSTANCE.getValue();
        ArrayList arrayList = new ArrayList(value.length);
        for (double d : value) {
            arrayList.add(new C3265j((long) d));
        }
        bVar.invoke(arrayList);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void setMuteDuration(C3265j jVar) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(jVar, "");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        if (!C89219l.m154714a(C11069g.f26639a.get(Long.valueOf(c)), jVar)) {
            C11069g.f26639a.put(Long.valueOf(c), jVar);
            DataChannelGlobal.f42558d.mo28328c(C9070ci.class, jVar);
            C11069g.C11075f fVar = new C11069g.C11075f(jVar);
            C88466b.m153697a((Object) fVar, "run is null");
            C88925a.m154165a(new C88504f(fVar)).mo142941b(C88925a.m154180b(C88946a.f201991c)).mo142939a(C88446a.f200702h).cN_();
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void report(Context context, C11666c cVar) {
        C89219l.m154721d(cVar, "");
        C11838d dVar = new C11838d(cVar.f27813c, cVar.f27814d, cVar.f27814d, cVar.f27833w, "share", C6544e.m13987a(), C6544e.m13990d(), C6544e.m13991e(), "report_anchor", cVar.f27830t);
        dVar.f28220s = cVar.f27807N;
        report(context, dVar);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void fetchAdminList(AbstractC6095a aVar, long j) {
        String str;
        AbstractC2994b a;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        WeakReference weakReference = new WeakReference(aVar);
        AdminApi adminApi = (AdminApi) C5805e.m12718a().mo11572a(AdminApi.class);
        String a2 = C11115u.m19743a().mo17915b().mo13153a(j);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b == null || (a = b.mo13147a()) == null) {
            str = null;
        } else {
            str = a.getSecUid();
        }
        adminApi.fetchAdministrators(j, a2, str).mo143271a(new C11191f()).mo143254a(new C11051a.C11052a(weakReference), new C11051a.C11053b(weakReference));
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void report(Context context, C11838d dVar) {
        int i;
        int d;
        int i2;
        AbstractC6956d webViewManager;
        C4031a a;
        C6523c cVar;
        String str;
        String str2 = "";
        C89219l.m154721d(dVar, str2);
        String value = LiveReportOptimizeUrlSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            C6497a a2 = C3051c.C3052a.m8362d("ttlive_report_user_error").mo12628a("error_code", (Long) -1L).mo12629a("error_msg", "live report url is empty");
            a2.f16147c = true;
            a2.mo12632a();
            return;
        }
        String a3 = dVar.mo18911a(value);
        AbstractC6956d.C6958b a4 = AbstractC6963e.m14871a(a3).mo13259a(8, 8, 0, 0);
        int i3 = -1;
        if (dVar.f28214m) {
            i = -1;
        } else {
            i = -16777216;
        }
        a4.f17407k = i;
        a4.f17415s = true;
        a4.f17416t = true;
        if (dVar.f28206e != 0) {
            i3 = dVar.f28206e;
        } else if (dVar.f28214m) {
            i3 = (int) C3966y.m9668e((int) ((((float) C3966y.m9662b()) * 1.0f) / 2.0f));
        }
        a4.f17399c = i3;
        if (dVar.f28207f != 0) {
            d = dVar.f28207f;
        } else if (dVar.f28214m) {
            d = (int) C3966y.m9668e(C3966y.m9664c());
        } else {
            d = C3966y.m9667d(R.dimen.wl);
        }
        a4.f17398b = d;
        if (dVar.f28214m) {
            i2 = 80;
        } else {
            i2 = 5;
        }
        a4.f17406j = i2;
        AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
        if (fVar != null && (webViewManager = fVar.webViewManager()) != null && (a = webViewManager.mo13245a(a4)) != null && (context instanceof ActivityC0945e)) {
            C4031a.m9839a(C11279p.m20001a(context), a);
            if (!TextUtils.equals(dVar.f28209h, "long_press")) {
                HashMap hashMap = new HashMap();
                String valueOf = String.valueOf(dVar.f28204c);
                C89219l.m154716b(valueOf, str2);
                hashMap.put("anchor_id", valueOf);
                String valueOf2 = String.valueOf(dVar.f28203b);
                C89219l.m154716b(valueOf2, str2);
                hashMap.put("room_id", valueOf2);
                String valueOf3 = String.valueOf(dVar.f28205d);
                C89219l.m154716b(valueOf3, str2);
                hashMap.put("to_user_id", valueOf3);
                String str3 = dVar.f28209h;
                C89219l.m154716b(str3, str2);
                hashMap.put("request_page", str3);
                hashMap.put("event_page", "live_detail");
                String a5 = dVar.mo18910a();
                C89219l.m154716b(a5, str2);
                hashMap.put("admin_type", a5);
                if (C89219l.m154714a((Object) dVar.f28216o, (Object) "3")) {
                    hashMap.put("report_type", "report_question");
                } else if (!TextUtils.isEmpty(dVar.f28215n)) {
                    String str4 = dVar.f28215n;
                    C89219l.m154716b(str4, str2);
                    hashMap.put("report_type", str4);
                }
                C7411d a6 = C7411d.m15284a();
                C89219l.m154716b(a6, str2);
                if (!C13627m.m24498a(a6.mo13614e())) {
                    C7411d a7 = C7411d.m15284a();
                    C89219l.m154716b(a7, str2);
                    String e = a7.mo13614e();
                    C89219l.m154716b(e, str2);
                    hashMap.put("enter_live_method", e);
                }
                hashMap.put("small_picture_order", C6544e.m13998l());
                C6529h n = C6544e.m14000n();
                if (!(n == null || (cVar = n.f16312d) == null || (str = cVar.f16266d) == null)) {
                    str2 = str;
                }
                hashMap.put("live_window_mode", str2);
                if (C3966y.m9670f()) {
                    hashMap.put("room_orientation", "portrait");
                } else {
                    hashMap.put("room_orientation", "landscape");
                }
                hashMap.put("report_click_time", String.valueOf(System.currentTimeMillis()));
                C6501b.C6502a.m13948a("livesdk_live_user_report").mo12652a((Map<String, String>) hashMap).mo12651a("scene", dVar.f28220s).mo12639a().mo12655b();
            }
            C3051c.C3052a.m8359a("ttlive_report_user").mo12629a("report_url", a3).mo12632a();
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public AbstractC6102d configUserHelper(C10935a aVar, DataChannel dataChannel, C88411a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(aVar2, "");
        return new C11078h(aVar, dataChannel, aVar2);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void unmuteUser(User user, long j, AbstractC6105g gVar) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(user, "");
        C89219l.m154721d(gVar, "");
        WeakReference weakReference = new WeakReference(gVar);
        ((MuteApi) C5805e.m12718a().mo11572a(MuteApi.class)).unmute(j, user.getId(), user.getSecUid()).mo143271a(new C11191f()).mo143254a(new C11069g.C11076g(user, weakReference, j), new C11069g.C11077h(weakReference, j, user));
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void fetchKickOutList(AbstractC6100b bVar, long j, int i, int i2) {
        String str;
        AbstractC2994b a;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
        WeakReference weakReference = new WeakReference(bVar);
        bVar.mo11962a();
        KickOutApi kickOutApi = (KickOutApi) C5805e.m12718a().mo11572a(KickOutApi.class);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b == null || (a = b.mo13147a()) == null) {
            str = null;
        } else {
            str = a.getSecUid();
        }
        kickOutApi.getKickedOutList(j, i2, i, str).mo143271a(new C11191f()).mo143254a(new C11062f.C11063a(weakReference), new C11062f.C11064b(weakReference));
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void fetchMuteList(AbstractC6101c cVar, long j, int i, int i2) {
        String str;
        AbstractC2994b a;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(cVar, "");
        WeakReference weakReference = new WeakReference(cVar);
        cVar.mo11762c();
        MuteApi muteApi = (MuteApi) C5805e.m12718a().mo11572a(MuteApi.class);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b == null || (a = b.mo13147a()) == null) {
            str = null;
        } else {
            str = a.getSecUid();
        }
        muteApi.getMuteList(j, i2, i, str).mo143271a(new C11191f()).mo143254a(new C11069g.C11070a(weakReference), new C11069g.C11071b(weakReference));
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void kickOut(AbstractC6100b bVar, boolean z, long j, long j2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
        WeakReference weakReference = new WeakReference(bVar);
        if (z) {
            ((KickOutApi) C5805e.m12718a().mo11572a(KickOutApi.class)).kickOut(j, j2).mo143271a(new C11191f()).mo143254a(new C11062f.C11065c(weakReference, z, j, j2), new C11062f.C11066d(weakReference, z, j, j2));
        } else {
            ((KickOutApi) C5805e.m12718a().mo11572a(KickOutApi.class)).unKickOut(j, j2).mo143271a(new C11191f()).mo143254a(new C11062f.C11067e(weakReference, false, j, j2), new C11062f.C11068f(weakReference, false, j, j2));
        }
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void muteUser(User user, long j, C3265j jVar, AbstractC6105g gVar) {
        long j2;
        C89219l.m154721d(user, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(user, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(gVar, "");
        if (C89219l.m154714a(jVar, C3265j.f9350b)) {
            j2 = 0;
        } else {
            j2 = 1;
        }
        WeakReference weakReference = new WeakReference(gVar);
        ((MuteApi) C5805e.m12718a().mo11572a(MuteApi.class)).mute(j, user.getId(), j2, user.getSecUid(), jVar.f9352a).mo143271a(new C11191f()).mo143254a(new C11069g.C11073d(user, weakReference, j), new C11069g.C11074e(weakReference, j, user));
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public Dialog getEnsureKickOutDialog(Context context, long j, long j2, long j3, AbstractC6104f fVar) {
        return new DialogC11058b(context, j, j2, j3, fVar);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void updateAdmin(AbstractC6095a aVar, boolean z, C6096a aVar2, long j, long j2, String str) {
        C89219l.m154721d(aVar, "");
        C11051a.m19686a(aVar, z, aVar2, j, j2, str);
    }

    @Override // com.bytedance.android.live.p405s.AbstractC6103e
    public void updateAdmin(AbstractC6095a aVar, boolean z, User user, long j, long j2, String str) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
        if (user != null) {
            C11051a.m19686a(aVar, z, C6096a.C6097a.m13307a(user), j, j2, str);
        }
    }
}
