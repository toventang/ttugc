package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.C7260a;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.model.C7693m;
import com.bytedance.android.livesdk.chatroom.p488c.C7387f;
import com.bytedance.android.livesdk.chatroom.p490e.C7492n;
import com.bytedance.android.livesdk.livesetting.decoration.DonationH5UrlSetting;
import com.bytedance.android.livesdk.model.C9533aq;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.android.livesdk.model.message.C9887q;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11210ad;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

public final class DonationStickerAnchorWidget extends LiveRecyclableWidget implements C7492n.AbstractC7493a, AbstractC33974au {

    /* renamed from: a */
    public C9537au f19900a;

    /* renamed from: b */
    private final C88411a f19901b = new C88411a();

    /* renamed from: c */
    private C7492n f19902c;

    /* renamed from: d */
    private TextView f19903d;

    /* renamed from: e */
    private TextView f19904e;

    /* renamed from: f */
    private TextView f19905f;

    /* renamed from: g */
    private View f19906g;

    /* renamed from: h */
    private AbstractC88412b f19907h;

    static {
        Covode.recordClassIndex(8790);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bd7;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        this.f19900a = null;
        C7492n nVar = this.f19902c;
        if (nVar != null) {
            nVar.mo8577b();
        }
        this.f19901b.mo142944a();
        AbstractC88412b bVar = this.f19907h;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerAnchorWidget$c */
    static final class C7990c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DonationStickerAnchorWidget f19910a;

        static {
            Covode.recordClassIndex(8793);
        }

        C7990c(DonationStickerAnchorWidget donationStickerAnchorWidget) {
            this.f19910a = donationStickerAnchorWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f19910a.onEvent((C7387f) obj);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7492n.AbstractC7493a
    /* renamed from: a */
    public final void mo13741a(C9887q qVar) {
        C89219l.m154721d(qVar, "");
        mo14286a(qVar.f23898g, qVar.f23896a, qVar.f23897f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerAnchorWidget$b */
    public static final class C7989b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C7989b f19909a = new C7989b();

        static {
            Covode.recordClassIndex(8792);
        }

        C7989b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9453a(3, "DonationInfo", "fetch donation info exception ".concat(String.valueOf(obj)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerAnchorWidget$a */
    public static final class C7988a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DonationStickerAnchorWidget f19908a;

        static {
            Covode.recordClassIndex(8791);
        }

        C7988a(DonationStickerAnchorWidget donationStickerAnchorWidget) {
            this.f19908a = donationStickerAnchorWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C7693m mVar;
            String str;
            C5832d dVar = (C5832d) obj;
            if (dVar != null && (mVar = (C7693m) dVar.data) != null && (str = mVar.f19069a) != null && str.length() != 0 && mVar.f19070b > 0) {
                this.f19908a.mo14286a(mVar.f19071c, mVar.f19069a, mVar.f19070b);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.f19903d = (TextView) findViewById(R.id.dmy);
        this.f19904e = (TextView) findViewById(R.id.dmz);
        this.f19905f = (TextView) findViewById(R.id.dmw);
        this.f19906g = findViewById(R.id.dn0);
    }

    public final void onEvent(C7387f fVar) {
        Room room;
        String str;
        C9533aq aqVar = null;
        if (fVar != null && fVar.f18308a != null) {
            if (fVar.f18309b) {
                show();
                C9537au auVar = this.f19900a;
                if (auVar != null) {
                    long j = auVar.f23166h;
                    C9537au auVar2 = fVar.f18308a;
                    C89219l.m154716b(auVar2, "");
                    if (j == auVar2.f23166h) {
                        return;
                    }
                }
                C9537au auVar3 = fVar.f18308a;
                this.f19900a = auVar3;
                if (auVar3 != null) {
                    aqVar = auVar3.mo16523a();
                }
                TextView textView = this.f19903d;
                if (textView != null) {
                    if (aqVar == null || (str = aqVar.f23145a) == null) {
                        str = "";
                    }
                    textView.setText(str);
                }
                TextView textView2 = this.f19905f;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                TextView textView3 = this.f19904e;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                View view = this.f19906g;
                if (view != null) {
                    view.setVisibility(8);
                }
                AbstractC88412b bVar = this.f19907h;
                if (bVar != null) {
                    bVar.dispose();
                }
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (room = (Room) dataChannel.mo28318b(C9093de.class)) != null) {
                    this.f19907h = ((DecorationApi) C5805e.m12718a().mo11572a(DecorationApi.class)).getRoomDonationInfo(C89041ag.m154421a(C89387v.m154943a("room_id", Long.valueOf(room.getId())), C89387v.m154943a("anchor_id", Long.valueOf(room.getOwnerUserId())), C89387v.m154943a("donation_entrance", 1L))).mo143271a(new C11191f()).mo143254a(new C7988a(this), C7989b.f19909a);
                    return;
                }
                return;
            }
            AbstractC88412b bVar2 = this.f19907h;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            hide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        hide();
        boolean a = C6229a.m13521a(getContext());
        if (a) {
            i = 8388629;
        } else {
            i = 8388627;
        }
        TextView textView = this.f19903d;
        if (textView != null) {
            textView.setGravity(i);
        }
        TextView textView2 = this.f19904e;
        if (textView2 != null) {
            textView2.setGravity(i);
        }
        View view = getView();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            int a2 = (int) C11227ap.m19885a(getContext(), 4.0f);
            if (a) {
                i2 = a2;
            } else {
                i2 = 0;
            }
            marginLayoutParams2.leftMargin = i2;
            if (a) {
                a2 = 0;
            }
            marginLayoutParams2.rightMargin = a2;
            View view2 = getView();
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams2);
            }
        }
        C7492n nVar = new C7492n();
        this.f19902c = nVar;
        nVar.mo10297a((C7492n.AbstractC7493a) this);
        this.f19901b.mo142945a(C6779a.m14563a().mo13052a(C7387f.class).mo143271a(getAutoUnbindTransformer()).mo143289d(new C7990c(this)));
        View view3 = getView();
        if (view3 != null) {
            view3.setOnClickListener(new View$OnClickListenerC7991d(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerAnchorWidget$d */
    static final class View$OnClickListenerC7991d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DonationStickerAnchorWidget f19911a;

        static {
            Covode.recordClassIndex(8794);
        }

        View$OnClickListenerC7991d(DonationStickerAnchorWidget donationStickerAnchorWidget) {
            this.f19911a = donationStickerAnchorWidget;
        }

        public final void onClick(View view) {
            Room room;
            String str;
            C4031a aVar;
            String str2;
            Boolean bool;
            C9533aq a;
            AbstractC6956d webViewManager;
            String value = DonationH5UrlSetting.INSTANCE.getValue();
            DataChannel dataChannel = this.f19911a.dataChannel;
            String str3 = null;
            if (dataChannel != null) {
                room = (Room) dataChannel.mo28318b(C9093de.class);
            } else {
                room = null;
            }
            if (value != null && value.length() != 0 && room != null && this.f19911a.f19900a != null) {
                Uri.Builder appendQueryParameter = Uri.parse(value).buildUpon().appendQueryParameter("anchor_id", String.valueOf(room.getOwnerUserId())).appendQueryParameter("room_id", String.valueOf(room.getId()));
                C9537au auVar = this.f19911a.f19900a;
                String str4 = "";
                if (auVar == null || (str = String.valueOf(auVar.f23166h)) == null) {
                    str = str4;
                }
                AbstractC6956d.C6958b a2 = AbstractC6963e.m14871a(appendQueryParameter.appendQueryParameter("campaignId", str).build().toString()).mo13259a(0, 0, 0, 0);
                a2.f17407k = -1;
                double b = (double) C3966y.m9662b();
                Double.isNaN(b);
                a2.f17399c = (int) C3966y.m9668e((int) (b * 0.7d));
                a2.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
                a2.f17406j = 80;
                AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
                if (fVar == null || (webViewManager = fVar.webViewManager()) == null) {
                    aVar = null;
                } else {
                    aVar = webViewManager.mo13246a(a2, new C7260a(a2.f17397a, null, null));
                }
                ActivityC0945e a3 = C11279p.m20001a(this.f19911a.getContext());
                if (a3 != null) {
                    C4031a.m9839a(a3, aVar);
                }
                C9537au auVar2 = this.f19911a.f19900a;
                if (!(auVar2 == null || (a = auVar2.mo16523a()) == null)) {
                    str3 = a.f23145a;
                }
                if (!TextUtils.isEmpty(str3)) {
                    str4 = String.valueOf(str3);
                }
                C89378p[] pVarArr = new C89378p[3];
                DataChannel dataChannel2 = this.f19911a.dataChannel;
                if (dataChannel2 == null || (bool = (Boolean) dataChannel2.mo28318b(C9119ed.class)) == null || !bool.booleanValue()) {
                    str2 = "0";
                } else {
                    str2 = "1";
                }
                pVarArr[0] = C89387v.m154943a("is_anchor", str2);
                pVarArr[1] = C89387v.m154943a("position", "top_left_icon");
                pVarArr[2] = C89387v.m154943a("NGO_name", str4);
                C6501b.C6502a.m13948a("livesdk_donation_icon_click").mo12652a(C89041ag.m154421a(pVarArr)).mo12643a(this.f19911a.dataChannel).mo12655b();
            }
        }
    }

    /* renamed from: a */
    public final void mo14286a(String str, String str2, long j) {
        if (this.f19900a != null && isShowing()) {
            AbstractC88412b bVar = this.f19907h;
            if (bVar != null) {
                bVar.dispose();
            }
            TextView textView = this.f19905f;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f19904e;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            View view = this.f19906g;
            if (view != null) {
                view.setVisibility(0);
            }
            TextView textView3 = this.f19903d;
            if (textView3 != null) {
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    str = "";
                }
                StringBuilder append = sb.append(str);
                if (str2 == null) {
                    str2 = "";
                }
                textView3.setText(append.append(str2));
            }
            TextView textView4 = this.f19904e;
            if (textView4 != null) {
                textView4.setText(C11210ad.m19867a(j));
            }
        }
    }
}
