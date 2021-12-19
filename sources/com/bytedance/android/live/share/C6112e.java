package com.bytedance.android.live.share;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.p561j.C9065cd;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9099dk;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.share.e */
public final class C6112e {

    /* renamed from: a */
    public static final C6112e f15241a = new C6112e();

    /* renamed from: com.bytedance.android.live.share.e$b */
    public static final class C6114b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C6114b f15244a = new C6114b();

        static {
            Covode.recordClassIndex(6807);
        }

        C6114b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.share.e$c */
    public static final class C6115c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C6115c f15245a = new C6115c();

        static {
            Covode.recordClassIndex(6808);
        }

        C6115c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C6112e() {
    }

    static {
        Covode.recordClassIndex(6805);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.share.e$a */
    public static final class C6113a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Room f15242a;

        /* renamed from: b */
        final /* synthetic */ DataChannel f15243b;

        static {
            Covode.recordClassIndex(6806);
        }

        C6113a(Room room, DataChannel dataChannel) {
            this.f15242a = room;
            this.f15243b = dataChannel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            IMessageManager iMessageManager;
            C5832d dVar = (C5832d) obj;
            C89219l.m154721d(dVar, "");
            Room room = this.f15242a;
            DataChannel dataChannel = this.f15243b;
            ShareReportResult shareReportResult = (ShareReportResult) dVar.data;
            if (shareReportResult != null && shareReportResult.getDeltaIntimacy() > 0 && (iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class)) != null) {
                iMessageManager.insertMessage(C7302b.m15206a(room.getId(), shareReportResult.getDisplayText(), (User) dataChannel.mo28318b(C9101dm.class)), true);
            }
        }
    }

    /* renamed from: a */
    private static String m13329a(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString(((IHostShare) C6193a.m13435a(IHostShare.class)).getBundleKey(3));
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "top_supporters")) {
            return "top_supporters";
        }
        if (TextUtils.equals(str, "recently_shared")) {
            return "recently_shared";
        }
        return "none";
    }

    /* renamed from: a */
    public static final String m13330a(User user) {
        String str;
        if (user == null) {
            return "";
        }
        AbstractC2953a a = C6193a.m13435a(IHostApp.class);
        C89219l.m154716b(a, "");
        if (((IHostApp) a).isInMusicallyRegion()) {
            str = "h5_m";
        } else {
            str = "h5_t";
        }
        return "www.tiktok.com/@" + user.displayId + "/live?source=" + str + "&_r=1";
    }

    /* renamed from: a */
    public static final void m13332a(Room room, DataChannel dataChannel, String str) {
        C89219l.m154721d(room, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(str, "");
        if (C11199a.m19850a(dataChannel) && room.author() != null && !TextUtils.equals(str, "chat_merge")) {
            HashMap hashMap = new HashMap();
            AbstractC2994b author = room.author();
            C89219l.m154716b(author, "");
            hashMap.put("anchor_id", String.valueOf(author.getId()));
            hashMap.put("room_id", String.valueOf(room.getId()));
            C11199a.m19849a("live_ad", "live_share", null, hashMap);
        }
    }

    /* renamed from: a */
    public static final C11666c.C11667a m13328a(Room room, DataChannel dataChannel, String str, String str2, Map<String, String> map) {
        boolean z;
        String userShareText;
        C9542az userAttr;
        C89219l.m154721d(room, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(str2, "");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C11666c.C11667a a = C11666c.m20576a(room);
        if (!TextUtils.isEmpty(str)) {
            a.f27865l = str;
        }
        C89219l.m154716b(b, "");
        a.f27857d = b.mo13161c();
        a.f27875v = room.getId();
        a.f27876w = room.getOwnerUserId();
        a.f27873t = C6544e.m13997k();
        a.f27841E = C6544e.m13987a();
        a.f27842F = C6544e.m13990d();
        a.f27843G = str2;
        User user = (User) dataChannel.mo28318b(C9101dm.class);
        if (user == null || (userAttr = user.getUserAttr()) == null || !userAttr.f23192b) {
            z = false;
        } else {
            z = true;
        }
        boolean a2 = C89219l.m154714a(dataChannel.mo28318b(C9119ed.class), (Object) true);
        if (a2) {
            userShareText = room.getAnchorShareText();
        } else {
            userShareText = room.getUserShareText();
        }
        a.f27867n = userShareText;
        a.f27870q = a2;
        a.f27871r = z;
        a.f27872s = EnumC5847l.SHARE.isRedDotShowing(dataChannel);
        a.f27837A = map;
        a.f27874u = (String) dataChannel.mo28318b(C9065cd.class);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final void m13331a(Room room, DataChannel dataChannel, AbstractC1204m mVar, String str, String str2, Bundle bundle) {
        String string;
        String str3 = "";
        C89219l.m154721d(room, str3);
        C89219l.m154721d(dataChannel, str3);
        C89219l.m154721d(mVar, str3);
        C89219l.m154721d(str, str3);
        if (!(bundle == null || (string = bundle.getString("shareIdList", str3)) == null)) {
            str3 = string;
        }
        ((AbstractC11181z) ((AbstractC6109c) C6193a.m13435a(AbstractC6109c.class)).sendShare(room.getId(), str, 1, str2, str3).mo143274a(C11152e.m19790a(mVar))).mo17950a(new C6113a(room, dataChannel), C11195i.f26823a);
    }

    /* renamed from: a */
    public static final void m13333a(Room room, DataChannel dataChannel, String str, String str2, Bundle bundle, String str3, Map<String, String> map) {
        String str4;
        int i;
        int i2;
        int i3;
        String str5;
        String str6;
        int i4;
        Long l;
        C89219l.m154721d(room, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        String mD5String = MD5Utils.getMD5String("share_success" + System.currentTimeMillis());
        if (bundle != null) {
            str4 = bundle.getString("shareIdList", "");
            i = bundle.getInt(((IHostShare) C6193a.m13435a(IHostShare.class)).getBundleKey(2));
        } else {
            str4 = "";
            i = 0;
        }
        if (bundle != null) {
            i2 = bundle.getInt(((IHostShare) C6193a.m13435a(IHostShare.class)).getBundleKey(1));
        } else {
            i2 = 0;
        }
        String str7 = "portrait";
        if (C89219l.m154714a(dataChannel.mo28318b(C9119ed.class), (Object) true)) {
            Hashtag hashtag = (Hashtag) dataChannel.mo28318b(C9023aq.class);
            if (hashtag == null || (str5 = hashtag.title) == null) {
                str5 = "";
            }
            Hashtag hashtag2 = (Hashtag) dataChannel.mo28318b(C9023aq.class);
            if (hashtag2 == null || (l = hashtag2.f23083id) == null || (str6 = String.valueOf(l.longValue())) == null) {
                str6 = "";
            }
            C6501b a = C6501b.C6502a.m13948a("share").mo12643a(dataChannel).mo12651a("request_page", str3).mo12645a("is_create_group_chat", i).mo12645a("friends_shared_cnt", i2).mo12651a("batch_share_type", m13329a(bundle));
            EnumC11728i streamType = room.getStreamType();
            C89219l.m154716b(streamType, "");
            C6501b a2 = a.mo12651a("live_type", C11729j.m20684a(streamType)).mo12651a("share_platform", str).mo12651a("user_type", "anchor").mo12651a("bind_id", mD5String);
            if (!C3966y.m9670f()) {
                str7 = "landscape";
            }
            C6501b a3 = a2.mo12651a("room_orientation", str7).mo12651a("hashtag_type", str5).mo12651a("hash_id", str6).mo12651a("initiator", "anchor");
            Integer num = (Integer) dataChannel.mo28318b(C9099dk.class);
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = 0;
            }
            a3.mo12645a("share_num", i4).mo12655b();
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("share_platform", str);
            hashMap.put("share_type", str2);
            hashMap.put("user_type", "user");
            hashMap.put("request_page", str3);
            C89219l.m154716b(mD5String, "");
            hashMap.put("bind_id", mD5String);
            C7411d a4 = C7411d.m15284a();
            C89219l.m154716b(a4, "");
            if (!C13627m.m24498a(a4.mo13614e())) {
                C7411d a5 = C7411d.m15284a();
                C89219l.m154716b(a5, "");
                String e = a5.mo13614e();
                C89219l.m154716b(e, "");
                hashMap.put("enter_live_method", e);
            }
            if (TextUtils.equals(C6544e.m13993g(), "click_push_live_cd_user")) {
                hashMap.put("is_subscribe", "1");
            } else {
                hashMap.put("is_subscribe", "0");
            }
            if (C3966y.m9670f()) {
                hashMap.put("room_orientation", str7);
            } else {
                hashMap.put("room_orientation", "landscape");
            }
            C6501b a6 = C6501b.C6502a.m13948a("livesdk_share").mo12643a(dataChannel).mo12645a("is_create_group_chat", i).mo12645a("friends_shared_cnt", i2).mo12651a("batch_share_type", m13329a(bundle)).mo12652a(map).mo12652a((Map<String, String>) hashMap);
            Integer num2 = (Integer) dataChannel.mo28318b(C9099dk.class);
            if (num2 != null) {
                i3 = num2.intValue();
            } else {
                i3 = 0;
            }
            a6.mo12645a("share_num", i3).mo12655b();
        }
        C6501b.C6502a.m13948a("share_info").mo12651a("bind_id", mD5String).mo12651a("to_user_id", str4).mo12655b();
    }
}
