package com.bytedance.android.live.broadcast.preview.p204d;

import android.content.Context;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.broadcast.api.AbstractC3054d;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.api.BroadcastSubscribeApi;
import com.bytedance.android.livesdk.chatroom.api.C7296f;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.d.b */
public final class C3497b implements AbstractC3054d, AbstractC18511d {

    /* renamed from: c */
    public static final C3498a f9787c = new C3498a((byte) 0);

    /* renamed from: a */
    public boolean f9788a;

    /* renamed from: b */
    public Boolean f9789b;

    /* renamed from: d */
    private boolean f9790d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.b$c */
    public static final class C3500c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C3500c f9792a = new C3500c();

        static {
            Covode.recordClassIndex(3984);
        }

        C3500c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(3981);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d.b$a */
    public static final class C3498a {
        static {
            Covode.recordClassIndex(3982);
        }

        private C3498a() {
        }

        public /* synthetic */ C3498a(byte b) {
            this();
        }
    }

    public C3497b() {
        m8907b();
        C18494b.m34417a("anchor_subscribe_finished_guide", this);
        C18494b.m34417a("anchor_subscribe_emotes_status_change", this);
        C18494b.m34417a("anchor_subscribe_badge_status_change", this);
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC3054d
    /* renamed from: a */
    public final void mo8277a() {
        C18494b.m34422b("anchor_subscribe_finished_guide", this);
        C18494b.m34422b("anchor_subscribe_emotes_status_change", this);
        C18494b.m34422b("anchor_subscribe_badge_status_change", this);
    }

    /* renamed from: b */
    private final void m8907b() {
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        AbstractC2994b a = b.mo13147a();
        C89219l.m154716b(a, "");
        String secUid = a.getSecUid();
        C89219l.m154716b(secUid, "");
        ((BroadcastSubscribeApi) C5805e.m12718a().mo11572a(BroadcastSubscribeApi.class)).getSubscribeInfo(true, secUid).mo143271a(new C11191f()).mo143254a(new C3499b(this), C3500c.f9792a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.d.b$b */
    public static final class C3499b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C3497b f9791a;

        static {
            Covode.recordClassIndex(3983);
        }

        C3499b(C3497b bVar) {
            this.f9791a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C5832d dVar = (C5832d) obj;
            this.f9791a.f9789b = Boolean.valueOf(((C7296f) dVar.data).f18133d);
            C3497b bVar = this.f9791a;
            if (((C7296f) dVar.data).f18131b.f18134a != 0) {
                z = true;
            } else {
                z = false;
            }
            bVar.f9788a = z;
        }
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        C89219l.m154721d(cVar, "");
        String str = cVar.f44153a;
        int hashCode = str.hashCode();
        if (hashCode != -1809547272) {
            if (hashCode != 1836714626) {
                if (hashCode == 2137959118 && str.equals("anchor_subscribe_finished_guide")) {
                    C6805b<Boolean> bVar = AbstractC6804a.f16955bD;
                    C89219l.m154716b(bVar, "");
                    C6806c.m14603a((C6800c) bVar, (Object) true);
                }
            } else if (str.equals("anchor_subscribe_badge_status_change")) {
                this.f9788a = true;
            }
        } else if (str.equals("anchor_subscribe_emotes_status_change")) {
            this.f9790d = true;
        }
    }

    /* renamed from: a */
    private static void m8906a(Context context, String str, boolean z) {
        C3501c.m8912a(context, str, "preview_broadcast_page", z);
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC3054d
    /* renamed from: a */
    public final void mo8278a(Context context, boolean z, AbstractC89171a<C89391z> aVar) {
        String anchor_user_guide_page;
        String anchor_emotes_setting_page;
        String anchor_badge_setting_page;
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        Boolean bool = this.f9789b;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (this.f9790d || booleanValue) {
                aVar.invoke();
                return;
            }
            C6805b<Boolean> bVar = AbstractC6804a.f16955bD;
            C89219l.m154716b(bVar, "");
            Boolean a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            if (!a.booleanValue()) {
                if (z) {
                    anchor_user_guide_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_user_guide_popup();
                } else {
                    anchor_user_guide_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_user_guide_page();
                }
                m8906a(context, anchor_user_guide_page, z);
            } else if (!this.f9788a) {
                if (z) {
                    anchor_badge_setting_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_badge_setting_popup_android();
                } else {
                    anchor_badge_setting_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_badge_setting_page();
                }
                m8906a(context, anchor_badge_setting_page, z);
            } else {
                if (z) {
                    anchor_emotes_setting_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_emotes_setting_popup();
                } else {
                    anchor_emotes_setting_page = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_emotes_setting_page();
                }
                m8906a(context, anchor_emotes_setting_page, z);
            }
        }
    }
}
