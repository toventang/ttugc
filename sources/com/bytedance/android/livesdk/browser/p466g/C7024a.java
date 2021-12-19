package com.bytedance.android.livesdk.browser.p466g;

import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7085ai;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6953a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.p1193a.C17076a;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.g.a */
public final class C7024a {

    /* renamed from: a */
    public static final C7024a f17620a = new C7024a();

    private C7024a() {
    }

    /* renamed from: com.bytedance.android.livesdk.browser.g.a$a */
    static final class C7025a implements AbstractC18334e.AbstractC18336b {

        /* renamed from: a */
        public static final C7025a f17621a = new C7025a();

        static {
            Covode.recordClassIndex(7764);
        }

        C7025a() {
        }

        @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e.AbstractC18336b
        /* renamed from: a */
        public final AbstractC18334e<Object, Object> mo13316a() {
            return new C7085ai();
        }
    }

    static {
        Covode.recordClassIndex(7763);
    }

    /* renamed from: a */
    public static void m14980a(AbstractC6953a aVar) {
        C89219l.m154721d(aVar, "");
        aVar.mo13236a().mo29400a("__prefetch", (AbstractC18334e.AbstractC18336b) C7025a.f17621a);
    }

    /* renamed from: a */
    public static void m14981a(String str) {
        long j;
        String str2;
        String valueOf;
        if (str != null) {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                j = room.getOwnerUserId();
            } else {
                j = 0;
            }
            if (room == null) {
                str2 = String.valueOf(j);
            } else if (room.getOwner() != null) {
                User owner = room.getOwner();
                C89219l.m154716b(owner, "");
                str2 = owner.getSecUid();
            } else {
                str2 = "";
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            if (j == 0) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(j);
            }
            buildUpon.appendQueryParameter("anchor_id", valueOf);
            buildUpon.appendQueryParameter("sec_anchor_id", str2);
            C17076a.C17077a aVar = C17076a.f40647g;
            String builder = buildUpon.toString();
            C89219l.m154716b(builder, "");
            aVar.mo26985a(builder);
        }
    }
}
