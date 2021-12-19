package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.broadcast.api.C3018a;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.C4173g;
import com.bytedance.android.live.effect.api.C4174h;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.C5844i;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAnchorEnableSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.e */
public final class C8020e implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    public C5844i f19989a;

    /* renamed from: b */
    private final ArrayList<EnumC5847l> f19990b = new ArrayList<>();

    /* renamed from: c */
    private DataChannel f19991c;

    /* renamed from: d */
    private final Context f19992d;

    static {
        Covode.recordClassIndex(8827);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    /* renamed from: a */
    public final void mo14307a() {
        EnumC5847l lVar = EnumC5847l.EFFECT;
        DataChannel dataChannel = this.f19991c;
        if (dataChannel == null) {
            C89219l.m154710a("dataChannel");
        }
        lVar.setRedDotVisible(dataChannel, m16211b());
    }

    /* renamed from: b */
    private static boolean m16211b() {
        if (!C4217d.m10317a().mo9899c()) {
            C6805b<Boolean> bVar = AbstractC6804a.f17052cz;
            C89219l.m154716b(bVar, "");
            Boolean a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            if (!a.booleanValue() || StickerAnchorEnableSetting.INSTANCE.getValue() != 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.e$b */
    static final class C8022b extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8020e f19994a;

        static {
            Covode.recordClassIndex(8829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8022b(C8020e eVar) {
            super(1);
            this.f19994a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            this.f19994a.mo14307a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.e$c */
    static final class C8023c extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8020e f19995a;

        static {
            Covode.recordClassIndex(8830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8023c(C8020e eVar) {
            super(1);
            this.f19995a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f19995a.mo14307a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.e$a */
    static final class C8021a extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8020e f19993a;

        static {
            Covode.recordClassIndex(8828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8021a(C8020e eVar) {
            super(1);
            this.f19993a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            C5844i iVar = this.f19993a.f19989a;
            if (iVar != null) {
                iVar.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    public C8020e(Context context) {
        C89219l.m154721d(context, "");
        this.f19992d = context;
    }

    public final void onClick(View view) {
        String str;
        if (!this.f19990b.isEmpty()) {
            Context context = this.f19992d;
            ArrayList<EnumC5847l> arrayList = this.f19990b;
            DataChannel dataChannel = this.f19991c;
            if (dataChannel == null) {
                C89219l.m154710a("dataChannel");
            }
            C5844i iVar = new C5844i(context, arrayList, dataChannel);
            this.f19989a = iVar;
            iVar.showAtLocation(view, 80, 0, 0);
        }
        HashMap hashMap = new HashMap();
        DataChannel dataChannel2 = this.f19991c;
        if (dataChannel2 == null) {
            C89219l.m154710a("dataChannel");
        }
        Object b = dataChannel2.mo28318b(C9058bx.class);
        if (b == null) {
            b = EnumC11728i.VIDEO;
        }
        if (EnumC11728i.THIRD_PARTY == b) {
            str = "third_party";
        } else {
            str = "video_live";
        }
        hashMap.put("live_type", str);
        C6501b b2 = C6501b.C6502a.m13948a("live_take_decoration_click").mo12652a((Map<String, String>) hashMap).mo12658d("live_take_detail").mo12654b("live_take");
        DataChannel dataChannel3 = this.f19991c;
        if (dataChannel3 == null) {
            C89219l.m154710a("dataChannel");
        }
        b2.mo12643a(dataChannel3).mo12655b();
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        C5844i iVar = this.f19989a;
        if (iVar != null) {
            iVar.dismiss();
        }
        dataChannel.mo28316b(this);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        ArrayList d;
        C89219l.m154721d(view, "");
        C89219l.m154721d(dataChannel, "");
        this.f19991c = dataChannel;
        if (dataChannel == null) {
            C89219l.m154710a("dataChannel");
        }
        dataChannel.mo28312a(this, C3018a.class, new C8021a(this)).mo28312a(this, C4173g.class, new C8022b(this)).mo28312a(this, C4174h.class, new C8023c(this));
        this.f19990b.clear();
        ArrayList<EnumC5847l> arrayList = this.f19990b;
        if (StickerAnchorEnableSetting.INSTANCE.getValue() == 1) {
            d = C89070n.m154525d(EnumC5847l.BEAUTY, EnumC5847l.STICKER, EnumC5847l.PROPS);
        } else {
            d = C89070n.m154525d(EnumC5847l.BEAUTY, EnumC5847l.STICKER);
        }
        arrayList.addAll(d);
        mo14307a();
    }
}
