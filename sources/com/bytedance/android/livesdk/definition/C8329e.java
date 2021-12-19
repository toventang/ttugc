package com.bytedance.android.livesdk.definition;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.model.C3270n;
import com.bytedance.android.live.broadcast.model.C3272o;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9094df;
import com.bytedance.android.livesdk.p561j.C9140v;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.definition.e */
public final class C8329e {
    static {
        Covode.recordClassIndex(9167);
    }

    /* renamed from: a */
    public static final List<C8328d> m16485a() {
        ArrayList<LiveCoreSDKData.Quality> arrayList;
        String str;
        boolean z;
        StreamUrl streamUrl;
        LinkedList<LiveCoreSDKData.Quality> linkedList;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null || (streamUrl = room.getStreamUrl()) == null || (linkedList = streamUrl.qualityList) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (T t : linkedList) {
                T t2 = t;
                String str2 = t2.sdkKey;
                if (str2 != null && !C89361p.m154870a((CharSequence) str2)) {
                    String str3 = t2.sdkKey;
                    C89219l.m154716b(str3, "");
                    if (!C89361p.m154929e((CharSequence) str3, (CharSequence) "auto")) {
                        arrayList2.add(t);
                    }
                }
            }
            arrayList = arrayList2;
        }
        C11870f fVar = C11870f.C11871a.f28404a;
        C89219l.m154716b(fVar, "");
        EnterRoomLinkSession a = fVar.mo19010a();
        C89219l.m154716b(a, "");
        String str4 = a.f28391b.f28233c.f28288E;
        if (str4 == null) {
            str4 = "";
        }
        AbstractC2953a a2 = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a2, "");
        AbstractC5777j b = ((AbstractC4357d) a2).getLivePlayControllerManager().mo11553b(str4);
        if (b == null || (str = b.mo11547g()) == null) {
            str = "";
        }
        C3854a.m9453a(4, "DefinitionList", "genAudienceSupportDefinitionList(). tag=" + str4 + ", currentSdkKey=" + str);
        if (arrayList == null) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
        for (LiveCoreSDKData.Quality quality : arrayList) {
            C89219l.m154716b(quality, "");
            C8328d dVar = new C8328d(quality);
            if (!C11279p.m20013a((CharSequence) str) || !C89219l.m154714a((Object) str, (Object) quality.sdkKey)) {
                z = false;
            } else {
                z = true;
            }
            dVar.f20621c = z;
            arrayList3.add(dVar);
        }
        return arrayList3;
    }

    /* renamed from: a */
    public static final List<C8328d> m16486a(C8317c cVar) {
        C3272o oVar;
        C3270n nVar;
        String str;
        boolean z;
        String str2;
        C89219l.m154721d(cVar, "");
        ArrayList arrayList = new ArrayList();
        DataChannel a = C17846f.m33055a(cVar);
        if (!(a == null || (oVar = (C3272o) a.mo28318b(C9094df.class)) == null)) {
            Map<Long, C3270n> map = oVar.f9382q;
            ArrayList<C3270n.C3271a> arrayList2 = null;
            if (!(map == null || (nVar = map.get(4L)) == null)) {
                List<C3270n.C3271a> list = nVar.f9363b;
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (T t : list) {
                        T t2 = t;
                        String str3 = t2.f9365b;
                        C89219l.m154716b(str3, "");
                        if (!C89361p.m154929e((CharSequence) str3, (CharSequence) "auto") && (str2 = t2.f9365b) != null && !C89361p.m154870a((CharSequence) str2)) {
                            arrayList3.add(t);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                C3270n.C3271a aVar = (C3270n.C3271a) DataChannelGlobal.f42558d.mo28324b(C9140v.class);
                if (aVar == null || (str = aVar.f9365b) == null) {
                    str = "";
                }
                if (arrayList2 != null) {
                    for (C3270n.C3271a aVar2 : arrayList2) {
                        C89219l.m154716b(aVar2, "");
                        C8328d dVar = new C8328d(aVar2);
                        if (!C11279p.m20013a((CharSequence) str) || !C89219l.m154714a((Object) str, (Object) aVar2.f9365b)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        dVar.f20621c = z;
                        arrayList.add(dVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
