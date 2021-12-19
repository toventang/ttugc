package com.bytedance.android.livesdk.rank.impl.p613f;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.rank.api.model.C10347a;
import com.bytedance.android.livesdk.rank.api.model.C10348b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.f.l */
public final class C10424l {

    /* renamed from: a */
    public static int f25137a = -1;

    static {
        Covode.recordClassIndex(11998);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.f.l$a */
    public static final class C10425a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C10425a f25138a = new C10425a();

        static {
            Covode.recordClassIndex(11999);
        }

        C10425a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            long j;
            long j2;
            boolean z;
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                j = room.getOwnerUserId();
            } else {
                j = -1;
            }
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            if (b != null) {
                j2 = b.mo13161c();
            } else {
                j2 = -2;
            }
            if (j == j2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.f.l$c */
    public static final class C10427c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C10427c f25140a = new C10427c();

        static {
            Covode.recordClassIndex(12001);
        }

        C10427c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            long j;
            long j2;
            boolean z;
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room != null) {
                j = room.getOwnerUserId();
            } else {
                j = -1;
            }
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            if (b != null) {
                j2 = b.mo13161c();
            } else {
                j2 = -2;
            }
            if (j == j2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.f.l$b */
    public static final class C10426b extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ DataChannel f25139a;

        static {
            Covode.recordClassIndex(12000);
        }

        public C10426b(DataChannel dataChannel) {
            this.f25139a = dataChannel;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            Object obj;
            String str;
            C89219l.m154721d(recyclerView, "");
            if (i == 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("rank_position", "active_user_rank_detail");
                DataChannel dataChannel = this.f25139a;
                if (dataChannel != null) {
                    obj = dataChannel.mo28318b(C9119ed.class);
                } else {
                    obj = null;
                }
                if (C89219l.m154714a(obj, (Object) true)) {
                    str = "anchor";
                } else {
                    str = "user";
                }
                hashMap.put("user_type", str);
                C6501b.C6502a.m13948a("livesdk_active_user_rank_left_swipe").mo12643a(this.f25139a).mo12652a((Map<String, String>) hashMap).mo12655b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            int i3;
            C89219l.m154721d(recyclerView, "");
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                i3 = ((LinearLayoutManager) layoutManager).mo4374n();
            } else {
                i3 = -1;
            }
            if (i3 <= C10424l.f25137a) {
                i3 = C10424l.f25137a;
            }
            C10424l.f25137a = i3;
        }
    }

    /* renamed from: a */
    public static final Map<String, String> m18942a(C10347a aVar) {
        C89219l.m154721d(aVar, "");
        return m18943a(aVar, (C10348b) null);
    }

    /* renamed from: a */
    public static final Map<String, String> m18944a(C10348b bVar) {
        C89219l.m154721d(bVar, "");
        return m18943a((C10347a) null, bVar);
    }

    /* renamed from: a */
    public static final void m18945a(DataChannel dataChannel, String str) {
        Object obj;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rank_position", str);
        if (dataChannel != null) {
            obj = dataChannel.mo28318b(C9119ed.class);
        } else {
            obj = null;
        }
        if (C89219l.m154714a(obj, (Object) true)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        linkedHashMap.put("user_type", str2);
        AbstractC2953a a = C6193a.m13435a(IGiftService.class);
        C89219l.m154716b(a, "");
        if (((IGiftService) a).getBoostChartInfo().f21772c) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        linkedHashMap.put("boost_card_effective", str3);
        C6501b.C6502a.m13948a("livesdk_active_user_rank_show").mo12643a(dataChannel).mo12652a((Map<String, String>) linkedHashMap).mo12655b();
    }

    /* renamed from: a */
    private static final Map<String, String> m18943a(C10347a aVar, C10348b bVar) {
        boolean z;
        String str;
        String str2;
        String str3;
        String valueOf;
        User user;
        User user2;
        boolean z2 = false;
        if (aVar == null && bVar == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (aVar == null || bVar == null) {
                z2 = true;
            }
            if (z2) {
                C10425a aVar2 = C10425a.f25138a;
                String str4 = null;
                if (aVar == null || (user2 = aVar.f24998a) == null || (str = String.valueOf(user2.getId())) == null) {
                    if (bVar == null || (user = bVar.f25001a) == null) {
                        str = null;
                    } else {
                        str = String.valueOf(user.getId());
                    }
                }
                String str5 = "";
                if (str == null) {
                    str = str5;
                }
                if (aVar != null && (valueOf = String.valueOf(aVar.f25000c)) != null) {
                    str4 = valueOf;
                } else if (bVar != null) {
                    str4 = String.valueOf(bVar.f25002b);
                }
                if (str4 != null) {
                    str5 = str4;
                }
                if (aVar != null) {
                    str2 = "top_right";
                } else {
                    str2 = "active_user_rank_detail";
                }
                if (((Boolean) aVar2.invoke()).booleanValue()) {
                    str3 = "live_anchor_c_audience";
                } else {
                    str3 = "live_audience_c_audience";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("to_user_id", str);
                linkedHashMap.put("to_user_rank", str5);
                linkedHashMap.put("click_user_position", "top_active_user_rank");
                linkedHashMap.put("rank_position", str2);
                linkedHashMap.put("request_page", str3);
                return linkedHashMap;
            }
            try {
                throw new IllegalStateException("Check failed.".toString());
            } catch (IllegalStateException unused) {
                return new HashMap();
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
