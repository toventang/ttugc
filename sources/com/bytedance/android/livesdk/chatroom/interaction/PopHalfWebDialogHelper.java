package com.bytedance.android.livesdk.chatroom.interaction;

import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.core.p212b.C3853a;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.p488c.C7410z;
import com.bytedance.android.livesdk.model.utils.C9913b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

public final class PopHalfWebDialogHelper implements AbstractC33974au {

    /* renamed from: a */
    DialogInterface$OnCancelListenerC0944d f18911a;

    /* renamed from: b */
    final C10935a f18912b;

    /* renamed from: c */
    public final DataChannel f18913c;

    /* renamed from: d */
    final boolean f18914d;

    static {
        Covode.recordClassIndex(8403);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            dismissDialog();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void dismissDialog() {
        DialogInterface$OnCancelListenerC0944d dVar = this.f18911a;
        if (dVar != null) {
            dVar.dismissAllowingStateLoss();
        }
    }

    public PopHalfWebDialogHelper(C10935a aVar, DataChannel dataChannel, boolean z, AbstractC1204m mVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(mVar, "");
        this.f18912b = aVar;
        this.f18913c = dataChannel;
        this.f18914d = z;
        mVar.getLifecycle().mo4012a(this);
        C6779a.m14563a().mo13050a(aVar, C7410z.class, dataChannel).mo17949a(new AbstractC88433f(this) {
            /* class com.bytedance.android.livesdk.chatroom.interaction.PopHalfWebDialogHelper.C76271 */

            /* renamed from: a */
            final /* synthetic */ PopHalfWebDialogHelper f18915a;

            static {
                Covode.recordClassIndex(8404);
            }

            {
                this.f18915a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                String str2;
                C7410z zVar = (C7410z) obj;
                PopHalfWebDialogHelper popHalfWebDialogHelper = this.f18915a;
                DataChannel dataChannel = popHalfWebDialogHelper.f18913c;
                if (zVar != null && (str = zVar.f18362a) != null && str.length() != 0) {
                    int i = zVar.f18365d;
                    if (i <= 0) {
                        if (popHalfWebDialogHelper.f18914d) {
                            i = 300;
                        } else {
                            i = 240;
                        }
                    }
                    int i2 = zVar.f18366e;
                    if (i2 <= 0) {
                        if (popHalfWebDialogHelper.f18914d) {
                            i2 = 400;
                        } else {
                            i2 = 320;
                        }
                    }
                    C9913b bVar = new C9913b(zVar.f18362a);
                    bVar.mo16614a("language", C3853a.m9448a());
                    bVar.mo16614a("enter_from", "");
                    bVar.mo16614a("source_v3", C6544e.m13989c());
                    bVar.mo16613a("anchor_id", C6544e.m13994h());
                    bVar.mo16614a("log_pb", C6544e.m13996j());
                    bVar.mo16614a("request_id", C6544e.m13997k());
                    if (C89219l.m154714a(dataChannel.mo28318b(C9119ed.class), (Object) true)) {
                        str2 = "live_take_detail";
                    } else {
                        str2 = "live_detail";
                    }
                    bVar.mo16614a("event_page", str2);
                    bVar.mo16614a("event_belong", "live_interact");
                    AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
                    AbstractC6956d.C6958b a = AbstractC6963e.m14871a(bVar.mo16611a());
                    a.f17398b = i;
                    a.f17399c = i2;
                    AbstractC6956d.C6958b a2 = a.mo13258a(zVar.f18367f);
                    a2.f17400d = zVar.f18368g;
                    a2.f17406j = zVar.f18364c;
                    a2.f17407k = zVar.f18370i;
                    a2.f17390D = zVar.f18363b;
                    a2.f17413q = zVar.f18371j;
                    a2.f17409m = zVar.f18369h;
                    popHalfWebDialogHelper.f18911a = webViewManager.mo13245a(a2);
                    C4031a.m9839a(popHalfWebDialogHelper.f18912b.getActivity(), popHalfWebDialogHelper.f18911a);
                }
            }
        });
    }
}
