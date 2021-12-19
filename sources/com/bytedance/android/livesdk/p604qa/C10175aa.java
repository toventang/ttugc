package com.bytedance.android.livesdk.p604qa;

import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.live.p378m.C5763d;
import com.bytedance.android.livesdk.event.C8448b;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9120ee;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.aa */
public final class C10175aa {
    static {
        Covode.recordClassIndex(11741);
    }

    /* renamed from: a */
    public static final boolean m18673a(DataChannel dataChannel) {
        Room c = C5762c.m12634c(dataChannel);
        if (c == null || c.questionVersion != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m18672a(DataChannel dataChannel, boolean z) {
        RoomAuthStatus roomAuthStatus;
        Room c = C5762c.m12634c(dataChannel);
        if (c != null && (roomAuthStatus = c.getRoomAuthStatus()) != null) {
            roomAuthStatus.setEnableQuestion(z);
        }
    }

    /* renamed from: a */
    public static final void m18671a(DataChannel dataChannel, String str) {
        boolean z;
        C9542az userAttr;
        C89219l.m154721d(str, "");
        if (dataChannel != null) {
            Object b = dataChannel.mo28318b(C9119ed.class);
            if (b == null) {
                C89219l.m154715b();
            }
            boolean booleanValue = ((Boolean) b).booleanValue();
            User user = (User) dataChannel.mo28318b(C9101dm.class);
            if (user == null || (userAttr = user.getUserAttr()) == null) {
                z = false;
            } else {
                z = userAttr.f23192b;
            }
            if (C5762c.m12633b(dataChannel) || booleanValue) {
                C8448b bVar = (C8448b) dataChannel.mo28318b(C9120ee.class);
                if (bVar == null) {
                    bVar = new C8448b(false);
                }
                if (!bVar.f20888a || z || booleanValue) {
                    AbstractC0952i iVar = (AbstractC0952i) dataChannel.mo28318b(C9021ao.class);
                    if (iVar != null) {
                        dataChannel.mo28315b(C5763d.class, (Object) true);
                        if (!m18673a(dataChannel) || booleanValue || z) {
                            C10287y yVar = new C10287y();
                            dataChannel.mo28311a(C10225au.class, str);
                            yVar.show(iVar, str);
                            return;
                        }
                        dataChannel.mo28311a(C10240b.class, new C10257d(0, 0, false, str));
                        new C10241c().show(iVar, str);
                    }
                } else if (bVar.f20889b) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.enr);
                } else {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.enq);
                }
            }
        }
    }
}
