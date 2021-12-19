package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p209c.C3808c;
import com.bytedance.android.live.p209c.C3810e;
import com.bytedance.android.live.p379n.C5789u;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.p481b.C7313j;
import com.bytedance.android.livesdk.chatroom.p481b.C7314k;
import com.bytedance.android.livesdk.chatroom.p488c.C7369ab;
import com.bytedance.android.livesdk.chatroom.p488c.C7376ai;
import com.bytedance.android.livesdk.chatroom.p488c.C7377aj;
import com.bytedance.android.livesdk.chatroom.p488c.C7387f;
import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.android.livesdk.chatroom.p490e.C7488l;
import com.bytedance.android.livesdk.chatroom.p499ui.C7917dq;
import com.bytedance.android.livesdk.chatroom.p499ui.View$OnClickListenerC7876cy;
import com.bytedance.android.livesdk.chatroom.p499ui.p501b.C7784c;
import com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a;
import com.bytedance.android.livesdk.chatroom.widget.C8175d;
import com.bytedance.android.livesdk.chatroom.widget.C8178f;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAudienceEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.DecoTextModifyFrequencySetting;
import com.bytedance.android.livesdk.model.C9533aq;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6782a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p561j.C9013ag;
import com.bytedance.android.livesdk.p561j.C9027au;
import com.bytedance.android.livesdk.p561j.C9074cm;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9118ec;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11274k;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class DecorationWrapperWidget extends LiveWidget implements C7488l.AbstractC7490a, AbstractC8170a.AbstractC8172a, AbstractC33974au {

    /* renamed from: i */
    public static boolean f19868i;

    /* renamed from: l */
    public static boolean f19869l;

    /* renamed from: o */
    private static final String f19870o = DecorationWrapperWidget.class.getSimpleName();

    /* renamed from: a */
    boolean f19871a;

    /* renamed from: b */
    boolean f19872b;

    /* renamed from: c */
    int[] f19873c = new int[4];

    /* renamed from: d */
    int[] f19874d = new int[4];

    /* renamed from: e */
    final List<AbstractC8170a> f19875e = new ArrayList();

    /* renamed from: f */
    public C7488l f19876f;

    /* renamed from: g */
    Room f19877g;

    /* renamed from: h */
    public String f19878h = "";

    /* renamed from: j */
    public int f19879j;

    /* renamed from: k */
    C7987a f19880k;

    /* renamed from: m */
    boolean f19881m;

    /* renamed from: n */
    public C7917dq f19882n = null;

    /* renamed from: p */
    private long f19883p;

    /* renamed from: q */
    private boolean f19884q;

    /* renamed from: r */
    private boolean f19885r = false;

    /* renamed from: s */
    private boolean f19886s = false;

    /* renamed from: t */
    private long f19887t = -1;

    /* renamed from: u */
    private AbstractC88412b f19888u;

    /* renamed from: v */
    private AbstractC88412b f19889v;

    /* renamed from: w */
    private final C88411a f19890w = new C88411a();

    /* renamed from: x */
    private C7917dq.AbstractC7918a f19891x = new C7917dq.AbstractC7918a() {
        /* class com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget.C79841 */

        static {
            Covode.recordClassIndex(8786);
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.C7917dq.AbstractC7918a
        /* renamed from: a */
        public final void mo14226a() {
            DecorationWrapperWidget.this.f19882n = null;
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.C7917dq.AbstractC7918a
        /* renamed from: a */
        public final void mo14227a(String str) {
            if (DecorationWrapperWidget.this.f19876f != null) {
                if (!DecorationWrapperWidget.this.f19876f.mo13732a()) {
                    C11226ao.m19883a(DecorationWrapperWidget.this.context, DecorationWrapperWidget.this.context.getString(R.string.gt2, Integer.valueOf(DecoTextModifyFrequencySetting.INSTANCE.getValue())), 0);
                } else if (!DecorationWrapperWidget.this.f19876f.f18606d) {
                    if (TextUtils.isEmpty(str)) {
                        str = DecorationWrapperWidget.this.f19878h;
                    }
                    if (str.length() <= DecorationWrapperWidget.this.f19879j) {
                        C7488l lVar = DecorationWrapperWidget.this.f19876f;
                        if (lVar.mo13732a() && !TextUtils.isEmpty(str) && !lVar.f18606d) {
                            lVar.f18605c = str;
                            lVar.f18606d = true;
                            WeakHandler weakHandler = lVar.f18603a;
                            ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).sendDecorationText(new C11274k().mo18034a("room_id", String.valueOf(lVar.f18604b)).mo18034a("user_id", String.valueOf(C11115u.m19743a().mo17915b().mo13161c())).mo18034a("deco_text", String.valueOf(str)).f26963a).mo143271a(new C11191f()).mo143254a(new C7313j(weakHandler), new C7314k(weakHandler));
                            return;
                        }
                        return;
                    }
                    C11226ao.m19883a(DecorationWrapperWidget.this.context, DecorationWrapperWidget.this.context.getString(R.string.gjm, Integer.valueOf(DecorationWrapperWidget.this.f19879j)), 0);
                }
            }
        }
    };

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bfs;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: h */
    private void m16157h() {
        C7917dq dqVar = this.f19882n;
        if (dqVar != null) {
            dqVar.mo14221a();
        }
    }

    static {
        Covode.recordClassIndex(8785);
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7488l.AbstractC7490a
    /* renamed from: c */
    public final void mo13739c() {
        if (isViewValid() && !this.f19884q) {
            m16156f();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7488l.AbstractC7490a
    /* renamed from: a */
    public final void mo13733a() {
        if (isViewValid()) {
            m16157h();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7488l.AbstractC7490a
    /* renamed from: b */
    public final void mo13737b() {
        if (isViewValid()) {
            for (AbstractC8170a aVar : this.f19875e) {
                if (aVar != null && aVar.getType() == 1) {
                    aVar.mo14401e();
                }
            }
            mo14280d();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        MethodCollector.m26663i(956);
        super.onPause();
        boolean equals = Build.BRAND.equals("HUAWEI");
        if (this.f19884q || !equals) {
            MethodCollector.m26664o(956);
            return;
        }
        if (this.f19886s) {
            this.f19886s = false;
        }
        if (getView() == null) {
            MethodCollector.m26664o(956);
            return;
        }
        ((ViewGroup) getView()).removeAllViews();
        MethodCollector.m26664o(956);
    }

    /* renamed from: e */
    private void m16155e() {
        MethodCollector.m26663i(1212);
        if (!isViewValid() || this.f19875e.isEmpty() || getView() == null) {
            MethodCollector.m26664o(1212);
            return;
        }
        Iterator<AbstractC8170a> it = this.f19875e.iterator();
        while (it.hasNext()) {
            AbstractC8170a next = it.next();
            if (getView() != null && next.getType() == 3) {
                ((ViewGroup) getView()).removeView(next);
                it.remove();
                C6779a.m14563a().mo13053a(new C7387f(next.getRoomDecoration(), false));
            }
        }
        MethodCollector.m26664o(1212);
    }

    /* renamed from: f */
    private void m16156f() {
        MethodCollector.m26663i(1231);
        if (!isViewValid() || this.f19875e.isEmpty() || getView() == null) {
            MethodCollector.m26664o(1231);
            return;
        }
        Iterator<AbstractC8170a> it = this.f19875e.iterator();
        while (it.hasNext()) {
            AbstractC8170a next = it.next();
            if (!(getView() == null || next.getType() == 3)) {
                ((ViewGroup) getView()).removeView(next);
                it.remove();
            }
        }
        MethodCollector.m26664o(1231);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a.AbstractC8172a
    /* renamed from: d */
    public final void mo14280d() {
        if (isViewValid() && this.f19884q && this.f19876f != null) {
            for (AbstractC8170a aVar : this.f19875e) {
                if (aVar != null) {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject decorationInfo = aVar.getDecorationInfo();
                    if (decorationInfo != null) {
                        jSONArray.put(decorationInfo);
                        C7488l lVar = this.f19876f;
                        String jSONArray2 = jSONArray.toString();
                        lVar.mo13731a(new C11274k().mo18034a("deco_list", String.valueOf(jSONArray2)).f26963a, aVar.getType());
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        boolean equals = Build.BRAND.equals("HUAWEI");
        if (!(this.f19884q || !equals || this.f19886s || C13603b.m24435a((Collection) this.f19877g.getDecorationList()))) {
            ArrayList arrayList = new ArrayList();
            for (C9537au auVar : this.f19877g.getDecorationList()) {
                arrayList.add(new C9537au(auVar));
            }
            m16154b(arrayList);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        String str;
        long j;
        super.onDestroy();
        this.f19881m = false;
        this.dataChannel.mo28316b(this);
        m16157h();
        this.f19876f.mo8577b();
        this.f19887t = -1;
        f19868i = false;
        f19869l = false;
        m16152a(this.f19888u);
        m16152a(this.f19889v);
        if (this.f19884q) {
            List<C9537au> stickerList = this.f19877g.getStickerList();
            if (!C13603b.m24435a((Collection) stickerList)) {
                C9537au auVar = stickerList.get(0);
                if (this.f19871a) {
                    str = "use";
                } else {
                    str = "unused";
                }
                Room room = this.f19877g;
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                HashMap hashMap = new HashMap();
                Room room2 = this.f19877g;
                if (!(room2 == null || room2.getOwner() == null)) {
                    hashMap.put("anchor_id", String.valueOf(this.f19877g.getOwner().getId()));
                }
                hashMap.put("room_id", String.valueOf(j));
                hashMap.put("use_status", str);
                C6501b.C6502a.m13948a("live_picture_prop_use").mo12652a((Map<String, String>) hashMap).mo12646a("prop_id", auVar.f23166h).mo12658d("live_take_detail").mo12656c("other").mo12654b("live_take").mo12643a(this.dataChannel).mo12655b();
                C7784c.m15847a(this.dataChannel, stickerList.get(0));
                C7784c.f19306a = 0;
            }
        }
        this.f19890w.dispose();
        this.f19890w.mo142944a();
        EnumC5847l.STICKER_DONATION.unload(this.dataChannel);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        if (isViewValid() && this.context != null) {
            int[] iArr = this.f19873c;
            iArr[0] = 0;
            iArr[1] = ((C13628n.m24521b(this.context) - C3966y.m9667d(R.dimen.yy)) - C3966y.m9667d(R.dimen.x_)) - ((int) C13628n.m24520b(this.context, 10.0f));
            int[] iArr2 = this.f19873c;
            iArr2[2] = 0;
            iArr2[3] = C13628n.m24504a(this.context);
            int[] iArr3 = this.f19873c;
            this.f19874d = Arrays.copyOf(iArr3, iArr3.length);
        }
        this.f19881m = false;
        this.f19884q = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        Room room = (Room) this.dataChannel.mo28318b(C9093de.class);
        this.f19877g = room;
        if (room.getOwner() != null) {
            this.f19883p = this.f19877g.getOwner().getId();
        }
        C7488l lVar = new C7488l(this.f19877g.getId(), this.f19883p, this.f19884q);
        this.f19876f = lVar;
        lVar.mo10297a((C7488l.AbstractC7490a) this);
        this.f19880k = new C7987a(this, (byte) 0);
        EnumC5847l.STICKER_DONATION.load(this.dataChannel, this.f19880k);
        if (!C13603b.m24435a((Collection) this.f19877g.getDecorationList()) || !C13603b.m24435a((Collection) this.f19877g.getStickerList())) {
            ArrayList arrayList = new ArrayList();
            if (!C13603b.m24435a((Collection) this.f19877g.getDecorationList())) {
                for (C9537au auVar : this.f19877g.getDecorationList()) {
                    arrayList.add(new C9537au(auVar));
                }
            }
            if (!C13603b.m24435a((Collection) this.f19877g.getStickerList()) && StickerAudienceEnableSetting.INSTANCE.getValue() == 1) {
                for (C9537au auVar2 : this.f19877g.getStickerList()) {
                    arrayList.add(new C9537au(auVar2));
                }
            }
            m16154b(arrayList);
            this.f19886s = true;
        }
        this.f19890w.mo142945a(C6779a.m14563a().mo13052a(C7369ab.class).mo143271a(getAutoUnbindTransformer()).mo143289d(new C8071au(this)));
        this.f19890w.mo142945a(C6779a.m14563a().mo13052a(C7376ai.class).mo143271a(getAutoUnbindTransformer()).mo143289d(new C8072av(this)));
        this.f19890w.mo142945a(C6779a.m14563a().mo13052a(C7377aj.class).mo143271a(getAutoUnbindTransformer()).mo143289d(new C8080bc(this)));
        this.f19890w.mo142945a(C6779a.m14563a().mo13052a(C7401r.class).mo143271a(getAutoUnbindTransformer()).mo143289d(new C8081bd(this)));
        this.dataChannel.mo28312a((Object) this, C4450t.class, (AbstractC89172b) new C8082be(this)).mo28313b((AbstractC1204m) this, C9118ec.class, (AbstractC89172b) new C8083bf(this)).mo28310a(C9013ag.class, (AbstractC89172b) new C8084bg(this)).mo28310a(C3808c.class, (AbstractC89172b) new C8085bh(this)).mo28310a(C3810e.class, (AbstractC89172b) new C8086bi(this));
        if (this.f19884q && this.dataChannel != null) {
            this.dataChannel.mo28313b((AbstractC1204m) this, C5789u.class, (AbstractC89172b) new C8087bj(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget$a */
    class C7987a implements AbstractView$OnClickListenerC5841f {

        /* renamed from: b */
        private View f19898b;

        /* renamed from: c */
        private boolean f19899c;

        static {
            Covode.recordClassIndex(8789);
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8492a(boolean z) {
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: b */
        public final void mo8493b(View view, DataChannel dataChannel) {
        }

        private C7987a() {
        }

        /* renamed from: b */
        public final void mo14284b(boolean z) {
            int i;
            this.f19899c = z;
            View view = this.f19898b;
            if (view != null) {
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
            }
        }

        public final void onClick(View view) {
            if (DecorationWrapperWidget.f19868i) {
                C11226ao.m19882a(DecorationWrapperWidget.this.getContext(), (int) R.string.ejw);
                return;
            }
            ActivityC0945e a = C11279p.m20001a(DecorationWrapperWidget.this.context);
            if (a != null) {
                C4031a.m9839a(a, new View$OnClickListenerC7876cy());
            }
        }

        /* synthetic */ C7987a(DecorationWrapperWidget decorationWrapperWidget, byte b) {
            this();
        }

        @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
        /* renamed from: a */
        public final void mo8491a(View view, DataChannel dataChannel) {
            this.f19898b = view;
            mo14284b(this.f19899c);
        }
    }

    /* renamed from: a */
    private static void m16152a(AbstractC88412b bVar) {
        if (bVar != null && !bVar.isDisposed()) {
            bVar.dispose();
        }
    }

    /* renamed from: b */
    private void m16154b(List<C9537au> list) {
        getView().post(new RunnableC8074ax(this, list));
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7488l.AbstractC7490a
    /* renamed from: a */
    public final void mo13734a(C9537au auVar) {
        if (isViewValid() && !this.f19884q && auVar != null) {
            if (this.f19877g != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(auVar);
                this.f19877g.setStickerList(arrayList);
            }
            if (this.dataChannel == null || !((Boolean) this.dataChannel.mo28318b(C9074cm.class)).booleanValue()) {
                m16156f();
                mo14278b(auVar);
                mo14279c(auVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14278b(C9537au auVar) {
        String str;
        C6501b a = C6501b.C6502a.m13948a("livesdk_audience_prop_show").mo12646a("anchor_id", this.f19883p).mo12651a("live_type", "live_video").mo12646a("prop_id", auVar.f23166h);
        if (auVar.f23165g == 1) {
            str = "character";
        } else {
            str = "picture";
        }
        a.mo12651a("prop_type", str).mo12651a("words", auVar.f23162d).mo12651a("request_id", C6544e.m13997k()).mo12643a(this.dataChannel).mo12655b();
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7488l.AbstractC7490a
    /* renamed from: a */
    public final void mo13735a(String str) {
        if (isViewValid()) {
            C11226ao.m19883a(this.context, str, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7488l.AbstractC7490a
    /* renamed from: b */
    public final void mo13738b(String str) {
        if (isViewValid()) {
            for (AbstractC8170a aVar : this.f19875e) {
                if (aVar != null && aVar.getType() == 1) {
                    aVar.setText(str);
                }
            }
            mo14280d();
        }
    }

    /* renamed from: c */
    public final void mo14279c(C9537au auVar) {
        AbstractC8170a dVar;
        C7488l lVar;
        MethodCollector.m26663i(1062);
        if (!isViewValid() || auVar == null) {
            MethodCollector.m26664o(1062);
            return;
        }
        if (auVar.f23165g == 3) {
            m16155e();
        } else {
            m16156f();
        }
        if (auVar.f23165g == 3) {
            dVar = new C8178f(this.context, auVar, this.f19884q, this.f19873c, this, this.f19881m);
            C6779a.m14563a().mo13053a(new C7387f(auVar, true));
            long j = this.f19887t;
            if (j == -1 || j != auVar.f23166h) {
                C9533aq a = auVar.mo16523a();
                m16153a("top_left_icon", a);
                m16153a("donation_sticker", a);
            }
            this.f19887t = auVar.f23166h;
        } else {
            dVar = new C8175d(this.context, auVar, this.f19884q, this.f19873c, this, this.f19881m);
        }
        if (auVar.f23165g == 1 && (lVar = this.f19876f) != null) {
            dVar.setText(lVar.mo13729a(auVar));
            this.f19878h = auVar.f23162d;
        }
        this.f19875e.add(dVar);
        if (getView() == null) {
            MethodCollector.m26664o(1062);
            return;
        }
        ((ViewGroup) getView()).addView(dVar, new ViewGroup.LayoutParams(-1, -1));
        if (!this.f19884q) {
            MethodCollector.m26664o(1062);
            return;
        }
        if (3 == auVar.f23165g) {
            f19868i = true;
        }
        MethodCollector.m26664o(1062);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a.AbstractC8172a
    /* renamed from: d */
    public final void mo14281d(C9537au auVar) {
        AbstractC88412b bVar;
        String str;
        String str2;
        long j;
        if (isViewValid() && auVar != null) {
            if (auVar.f23165g == 1) {
                bVar = this.f19888u;
            } else {
                bVar = this.f19889v;
            }
            m16152a(bVar);
            if (auVar.f23165g == 3) {
                m16155e();
            } else {
                if (auVar.f23165g == 1) {
                    str = "character";
                } else {
                    str = "picture";
                }
                if (auVar.f23165g == 1) {
                    str2 = auVar.f23162d;
                } else {
                    str2 = "";
                }
                C6501b a = C6501b.C6502a.m13948a("livesdk_live_prop_delete").mo12646a("anchor_id", this.f19883p);
                Room room = this.f19877g;
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                a.mo12646a("room_id", j).mo12646a("prop_id", auVar.f23166h).mo12651a("prop_type", str).mo12651a("words", str2).mo12643a(this.dataChannel).mo12655b();
                m16156f();
                C7784c.m15847a(this.dataChannel, auVar);
                C7784c.f19306a = 0;
            }
            C7488l lVar = this.f19876f;
            int i = auVar.f23165g;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("deco_list", String.valueOf(new JSONArray()));
            lVar.mo13731a(hashMap, i);
        }
    }

    public void onEvent(C7369ab abVar) {
        boolean z;
        long j;
        String str;
        AbstractC88412b bVar;
        if (isViewValid() && abVar != null && abVar.f18268a != null) {
            if (abVar.f18268a.f23165g == 3) {
                this.f19877g.setDecorationList(new ArrayList<C9537au>(abVar) {
                    /* class com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget.C79852 */

                    /* renamed from: a */
                    final /* synthetic */ C7369ab f19893a;

                    static {
                        Covode.recordClassIndex(8787);
                    }

                    {
                        this.f19893a = r3;
                        add(r3.f18268a);
                    }
                });
            } else {
                this.f19877g.setStickerList(new ArrayList<C9537au>(abVar) {
                    /* class com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget.C79863 */

                    /* renamed from: a */
                    final /* synthetic */ C7369ab f19895a;

                    static {
                        Covode.recordClassIndex(8788);
                    }

                    {
                        this.f19895a = r3;
                        add(r3.f18268a);
                    }
                });
            }
            C9537au auVar = abVar.f18268a;
            mo14279c(auVar);
            if (this.f19884q) {
                boolean z2 = false;
                if (auVar.f23165g == 1) {
                    z = true;
                } else {
                    z = false;
                }
                Room room = this.f19877g;
                if (room != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(j));
                hashMap.put("prop_id", String.valueOf(auVar.f23166h));
                hashMap.put("live_type", "video_live");
                if (z) {
                    hashMap.put("words", auVar.f23162d);
                    str = "livesdk_live_character_prop_show";
                } else {
                    str = "livesdk_live_picture_prop_show";
                }
                C6501b.C6502a.m13948a(str).mo12652a((Map<String, String>) hashMap).mo12643a(this.dataChannel).mo12655b();
                if (auVar.f23165g == 1) {
                    z2 = true;
                    bVar = this.f19888u;
                } else {
                    bVar = this.f19889v;
                }
                m16152a(bVar);
                AbstractC88412b d = AbstractC88979t.m154307b(30, TimeUnit.SECONDS).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C8079bb(this, auVar));
                if (z2) {
                    this.f19888u = d;
                } else {
                    this.f19889v = d;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7488l.AbstractC7490a
    /* renamed from: a */
    public final void mo13736a(List<C9537au> list) {
        if (!(!isViewValid() || this.f19884q || list == null)) {
            if (this.dataChannel == null || !((Boolean) this.dataChannel.mo28318b(C9074cm.class)).booleanValue()) {
                m16155e();
                for (C9537au auVar : list) {
                    if (auVar != null) {
                        mo14279c(auVar);
                    }
                }
                Room room = this.f19877g;
                if (room != null) {
                    room.setDecorationList(list);
                    return;
                }
                return;
            }
            Room room2 = this.f19877g;
            if (room2 != null) {
                room2.setDecorationList(list);
            }
        }
    }

    public void onEvent(C7376ai aiVar) {
        long j;
        if (isViewValid() && aiVar != null && !TextUtils.isEmpty(aiVar.f18287a) && !f19869l) {
            f19869l = true;
            if (!C11115u.m19743a().mo17915b().mo13165e()) {
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                Context context = getContext();
                C6876j.C6877a a = C6876j.m14732a();
                a.f17232a = C6782a.m14569a();
                a.f17233b = C6782a.m14570b();
                a.f17235d = "live";
                a.f17234c = -1;
                b.mo13149a(context, a.mo13173a()).mo143062b(new C6873g());
                f19869l = false;
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("item_type", 2L);
            Room room = this.f19877g;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            hashMap.put("item_id", Long.valueOf(j));
            this.f19890w.mo142945a(((DecorationApi) C5805e.m12718a().mo11572a(DecorationApi.class)).createDonateToken(hashMap).mo143271a(new C11191f()).mo143254a(new C8075ay(this, aiVar), new C8076az(this)));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a.AbstractC8172a
    /* renamed from: a */
    public final void mo14277a(boolean z) {
        if (this.dataChannel != null) {
            this.dataChannel.mo28320c(C9027au.class, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    private void m16153a(String str, C9533aq aqVar) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        if (this.f19884q) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("is_anchor", str2);
        if (aqVar != null) {
            str3 = aqVar.f23145a;
        } else {
            str3 = "";
        }
        hashMap.put("NGO_name", str3);
        hashMap.put("position", str);
        C6501b.C6502a.m13948a("livesdk_donation_icon_show").mo12652a((Map<String, String>) hashMap).mo12643a(this.dataChannel).mo12655b();
    }
}
