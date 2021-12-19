package com.bytedance.android.livesdk.chatroom.interaction;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6366h;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.browser.jsbridge.p470a.C7035b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class PackagePurchaseHelper implements AbstractC33974au {

    /* renamed from: a */
    private Dialog f18907a;

    /* renamed from: b */
    private final C10935a f18908b;

    /* renamed from: c */
    private final DataChannel f18909c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.PackagePurchaseHelper$b */
    final /* synthetic */ class C7626b implements AbstractC88433f {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f18910a;

        static {
            Covode.recordClassIndex(8402);
        }

        C7626b(AbstractC89172b bVar) {
            this.f18910a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89219l.m154716b(this.f18910a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(8399);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            dismissDialog();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interaction.PackagePurchaseHelper$a */
    public static final class C7625a implements IWalletService.AbstractC6245a {
        static {
            Covode.recordClassIndex(8401);
        }

        @Override // com.bytedance.android.live.wallet.IWalletService.AbstractC6245a
        /* renamed from: b */
        public final void mo12251b(Dialog dialog, AbstractC6366h hVar) {
            C89219l.m154721d(dialog, "");
            C89219l.m154721d(hVar, "");
        }

        C7625a() {
        }

        @Override // com.bytedance.android.live.wallet.IWalletService.AbstractC6245a
        /* renamed from: a */
        public final void mo12250a(Dialog dialog, AbstractC6366h hVar) {
            Integer valueOf;
            C89219l.m154721d(dialog, "");
            if (hVar != null && (valueOf = Integer.valueOf(hVar.mo12386b())) != null) {
                if (valueOf.intValue() == 10001) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gtp);
                } else if (valueOf.intValue() == 10002) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("status", "success");
                        jSONObject.put("code", "1");
                    } catch (Exception unused) {
                    }
                    ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13254a("H5_payStatus", jSONObject);
                }
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void dismissDialog() {
        C11279p.m20014b(this.f18907a);
    }

    public final void onEvent(C7035b bVar) {
        long j;
        User owner;
        Dialog dialog = this.f18907a;
        if (dialog == null || !dialog.isShowing()) {
            JSONObject jSONObject = bVar.f17637b;
            try {
                Room room = (Room) this.f18909c.mo28318b(C9093de.class);
                if (room == null || (owner = room.getOwner()) == null) {
                    j = 0;
                } else {
                    j = owner.getId();
                }
                jSONObject.put("anchor_id", j);
                Bundle bundle = new Bundle();
                bundle.putString("KEY_REQUEST_PAGE", "live_detail");
                Dialog consumeDialog = ((IWalletService) C6193a.m13435a(IWalletService.class)).getConsumeDialog(this.f18908b.getActivity(), bundle, jSONObject, new C7625a(), bVar.f17636a);
                this.f18907a = consumeDialog;
                C11279p.m19997a(consumeDialog);
            } catch (Exception e) {
                C3854a.m9458a("AbsInteractionFragment", e);
            }
        }
    }

    public PackagePurchaseHelper(C10935a aVar, DataChannel dataChannel, AbstractC1204m mVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(mVar, "");
        this.f18908b = aVar;
        this.f18909c = dataChannel;
        mVar.getLifecycle().mo4012a(this);
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C7035b.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(C11152e.m19789a((Fragment) aVar))).mo17949a(new C7626b(new AbstractC89172b<C7035b, C89391z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.PackagePurchaseHelper.C76241 */

            static {
                Covode.recordClassIndex(8400);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C7035b bVar) {
                C7035b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                ((PackagePurchaseHelper) this.receiver).onEvent(bVar2);
                return C89391z.f203057a;
            }
        }));
    }
}
