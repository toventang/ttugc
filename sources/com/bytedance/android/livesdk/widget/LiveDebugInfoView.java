package com.bytedance.android.livesdk.widget;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.C8423e;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.p481b.C7322s;
import com.bytedance.android.livesdk.chatroom.p481b.C7323t;
import com.bytedance.android.livesdk.p425aa.p429d.AbstractC6540b;
import com.bytedance.android.livesdk.p561j.C9084cw;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.depend.model.live.DebugRoomItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.p873a.p874a.C13386a;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveDebugInfoView extends LiveRecyclableWidget implements View.OnClickListener, View.OnLongClickListener, HandlerC11626a.AbstractC11627a, AbstractC33974au {

    /* renamed from: a */
    private final int f27189a = 18;

    /* renamed from: b */
    private final long f27190b = 5000;

    /* renamed from: c */
    private final String f27191c = "LiveDebugInfoView";

    /* renamed from: d */
    private List<DebugRoomItem> f27192d = new ArrayList();

    /* renamed from: e */
    private List<DebugRoomItem> f27193e = new ArrayList();

    /* renamed from: f */
    private final AbstractC89244h f27194f = C11831d.m20835a(new C11349a(this));

    /* renamed from: g */
    private TextView f27195g;

    /* renamed from: h */
    private TextView f27196h;

    /* renamed from: i */
    private TextView f27197i;

    /* renamed from: j */
    private TextView f27198j;

    /* renamed from: k */
    private View f27199k;

    /* renamed from: l */
    private View f27200l;

    /* renamed from: m */
    private View f27201m;

    /* renamed from: n */
    private LiveSwitch f27202n;

    /* renamed from: o */
    private LinearLayout f27203o;

    /* renamed from: p */
    private LinearLayout f27204p;

    /* renamed from: q */
    private LinearLayout f27205q;

    /* renamed from: r */
    private LinearLayout f27206r;

    /* renamed from: s */
    private Room f27207s;

    /* renamed from: t */
    private int f27208t;

    /* renamed from: u */
    private int f27209u;

    static {
        Covode.recordClassIndex(12998);
    }

    /* renamed from: a */
    private final HandlerC11626a m20121a() {
        return (HandlerC11626a) this.f27194f.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bbg;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LiveDebugInfoView$a */
    static final class C11349a extends AbstractC89220m implements AbstractC89171a<HandlerC11626a> {

        /* renamed from: a */
        final /* synthetic */ LiveDebugInfoView f27210a;

        static {
            Covode.recordClassIndex(12999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11349a(LiveDebugInfoView liveDebugInfoView) {
            super(0);
            this.f27210a = liveDebugInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC11626a invoke() {
            return new HandlerC11626a(this.f27210a);
        }
    }

    /* renamed from: j */
    private final void m20131j() {
        if (this.f27193e.isEmpty()) {
            hide();
        } else {
            show();
        }
    }

    /* renamed from: c */
    private final void m20124c() {
        int i = this.f27208t;
        if (i == 1) {
            m20126e();
        } else if (i != 2) {
            m20125d();
        } else {
            m20127f();
        }
    }

    /* renamed from: k */
    private final void m20132k() {
        DebugRoomItem debugRoomItem = new DebugRoomItem(null, null, 3, null);
        String a = C3966y.m9657a((int) R.string.dy_);
        if (a == null) {
            a = "";
        }
        debugRoomItem.setTabTitle(a);
        debugRoomItem.setTabContent("");
        this.f27193e.add(debugRoomItem);
    }

    /* renamed from: b */
    private final void m20123b() {
        LiveSwitch liveSwitch = this.f27202n;
        if (liveSwitch == null) {
            C89219l.m154710a("mSwitchView");
        }
        liveSwitch.setChecked(C11725f.f28050b);
        if (C11725f.f28050b) {
            LinearLayout linearLayout = this.f27203o;
            if (linearLayout == null) {
                C89219l.m154710a("mLinearContainer");
            }
            linearLayout.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = this.f27203o;
        if (linearLayout2 == null) {
            C89219l.m154710a("mLinearContainer");
        }
        linearLayout2.setVisibility(4);
    }

    /* renamed from: i */
    private final void m20130i() {
        this.f27193e.clear();
        if (this.f27192d.isEmpty()) {
            m20132k();
        } else {
            this.f27193e.add(this.f27192d.get(0));
        }
        m20133l();
        m20134m();
        m20131j();
    }

    /* renamed from: l */
    private final void m20133l() {
        DebugRoomItem debugRoomItem = new DebugRoomItem(null, null, 3, null);
        String a = C3966y.m9657a((int) R.string.dya);
        if (a == null) {
            a = "";
        }
        debugRoomItem.setTabTitle(a);
        debugRoomItem.setTabContent(m20128g());
        this.f27193e.add(debugRoomItem);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (m20121a() != null) {
            m20121a().removeCallbacksAndMessages(null);
        }
        if (this.f27202n == null) {
            C89219l.m154710a("mSwitchView");
            return;
        }
        LiveSwitch liveSwitch = this.f27202n;
        if (liveSwitch == null) {
            C89219l.m154710a("mSwitchView");
        }
        liveSwitch.clearAnimation();
    }

    /* renamed from: d */
    private final void m20125d() {
        TextView textView = this.f27195g;
        if (textView == null) {
            C89219l.m154710a("mTextViewBasic");
        }
        textView.setText(C3966y.m9657a((int) R.string.dy_));
        TextView textView2 = this.f27198j;
        if (textView2 == null) {
            C89219l.m154710a("mTextViewContent");
        }
        textView2.setText("");
        if (!this.f27193e.isEmpty()) {
            DebugRoomItem debugRoomItem = this.f27193e.get(0);
            TextView textView3 = this.f27198j;
            if (textView3 == null) {
                C89219l.m154710a("mTextViewContent");
            }
            textView3.setText(debugRoomItem.getTabContent());
            TextView textView4 = this.f27195g;
            if (textView4 == null) {
                C89219l.m154710a("mTextViewBasic");
            }
            textView4.setText(debugRoomItem.getTabTitle());
        }
    }

    /* renamed from: e */
    private final void m20126e() {
        TextView textView = this.f27196h;
        if (textView == null) {
            C89219l.m154710a("mTextViewPerformance");
        }
        textView.setText(C3966y.m9657a((int) R.string.dya));
        TextView textView2 = this.f27198j;
        if (textView2 == null) {
            C89219l.m154710a("mTextViewContent");
        }
        textView2.setText("");
        if (!(!this.f27193e.isEmpty()) || this.f27193e.size() <= 1) {
            String g = m20128g();
            if (!TextUtils.isEmpty(g)) {
                TextView textView3 = this.f27198j;
                if (textView3 == null) {
                    C89219l.m154710a("mTextViewContent");
                }
                textView3.setText(g);
                return;
            }
            return;
        }
        DebugRoomItem debugRoomItem = this.f27193e.get(1);
        TextView textView4 = this.f27198j;
        if (textView4 == null) {
            C89219l.m154710a("mTextViewContent");
        }
        textView4.setText(debugRoomItem.getTabContent());
        TextView textView5 = this.f27196h;
        if (textView5 == null) {
            C89219l.m154710a("mTextViewPerformance");
        }
        textView5.setText(debugRoomItem.getTabTitle());
    }

    /* renamed from: f */
    private final void m20127f() {
        TextView textView = this.f27197i;
        if (textView == null) {
            C89219l.m154710a("mTextViewRecommend");
        }
        textView.setText(C3966y.m9657a((int) R.string.dyb));
        TextView textView2 = this.f27198j;
        if (textView2 == null) {
            C89219l.m154710a("mTextViewContent");
        }
        textView2.setText("");
        if ((!this.f27193e.isEmpty()) && this.f27193e.size() > 2) {
            DebugRoomItem debugRoomItem = this.f27193e.get(2);
            TextView textView3 = this.f27198j;
            if (textView3 == null) {
                C89219l.m154710a("mTextViewContent");
            }
            textView3.setText(debugRoomItem.getTabContent());
            TextView textView4 = this.f27197i;
            if (textView4 == null) {
                C89219l.m154710a("mTextViewRecommend");
            }
            textView4.setText(debugRoomItem.getTabTitle());
        }
    }

    /* renamed from: m */
    private final void m20134m() {
        String str;
        DataChannel provideDataChannel = provideDataChannel();
        String str2 = "";
        if (provideDataChannel == null || (str = (String) provideDataChannel.mo28318b(C8423e.class)) == null) {
            str = str2;
        }
        DebugRoomItem debugRoomItem = new DebugRoomItem(null, null, 3, null);
        String a = C3966y.m9657a((int) R.string.dyb);
        if (a != null) {
            str2 = a;
        }
        debugRoomItem.setTabTitle(str2);
        debugRoomItem.setTabContent(str);
        this.f27193e.add(debugRoomItem);
        if (TextUtils.isEmpty(str)) {
            TextView textView = this.f27197i;
            if (textView == null) {
                C89219l.m154710a("mTextViewRecommend");
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView2 = this.f27197i;
        if (textView2 == null) {
            C89219l.m154710a("mTextViewRecommend");
        }
        textView2.setVisibility(0);
    }

    /* renamed from: g */
    private static String m20128g() {
        JSONObject e;
        AbstractC6540b bVar = (AbstractC6540b) DataChannelGlobal.f42558d.mo28324b(C9084cw.class);
        if (bVar == null || (e = bVar.mo12680e()) == null) {
            return "";
        }
        return "Resolution：" + Integer.valueOf(e.optInt("width:", -1)) + " * " + Integer.valueOf(e.optInt("height:", -1)) + "\r\nCodec：" + e.optString("Codec_Type:", "") + "\r\nStream protocol：" + e.optString("play_protocol:", "") + "\r\nFrame rate：" + Integer.valueOf(e.optInt("render_fps:", -1)) + "\r\nBitrate：" + Integer.valueOf(e.optInt("download_Speed:", -1)) + "\r\nPush client：" + e.optString("sei_source:", "") + "\r\nConnection speed：" + Long.valueOf(e.optLong("download_Speed:", -1)) + "\r\nBuffer health：" + Long.valueOf(e.optLong("video_Buffer_Time:", -1)) + "\r\nLive latency：" + Long.valueOf(e.optLong("delay:", -1));
    }

    /* renamed from: h */
    private final void m20129h() {
        TextView textView = this.f27195g;
        if (textView == null) {
            C89219l.m154710a("mTextViewBasic");
        }
        textView.setSelected(false);
        TextView textView2 = this.f27196h;
        if (textView2 == null) {
            C89219l.m154710a("mTextViewPerformance");
        }
        textView2.setSelected(false);
        TextView textView3 = this.f27197i;
        if (textView3 == null) {
            C89219l.m154710a("mTextViewRecommend");
        }
        textView3.setSelected(false);
        View view = this.f27199k;
        if (view == null) {
            C89219l.m154710a("mLineBasic");
        }
        view.setVisibility(8);
        View view2 = this.f27200l;
        if (view2 == null) {
            C89219l.m154710a("mLinePerformance");
        }
        view2.setVisibility(8);
        View view3 = this.f27201m;
        if (view3 == null) {
            C89219l.m154710a("mLineRecommend");
        }
        view3.setVisibility(8);
        int i = this.f27208t;
        if (i == 1) {
            TextView textView4 = this.f27196h;
            if (textView4 == null) {
                C89219l.m154710a("mTextViewPerformance");
            }
            textView4.setSelected(true);
            View view4 = this.f27200l;
            if (view4 == null) {
                C89219l.m154710a("mLinePerformance");
            }
            view4.setVisibility(0);
        } else if (i != 2) {
            TextView textView5 = this.f27195g;
            if (textView5 == null) {
                C89219l.m154710a("mTextViewBasic");
            }
            textView5.setSelected(true);
            View view5 = this.f27199k;
            if (view5 == null) {
                C89219l.m154710a("mLineBasic");
            }
            view5.setVisibility(0);
        } else {
            TextView textView6 = this.f27197i;
            if (textView6 == null) {
                C89219l.m154710a("mTextViewRecommend");
            }
            textView6.setSelected(true);
            View view6 = this.f27201m;
            if (view6 == null) {
                C89219l.m154710a("mLineRecommend");
            }
            view6.setVisibility(0);
        }
    }

    public final void onClick(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.edw) {
                this.f27208t = 0;
                m20129h();
                m20124c();
            } else if (valueOf != null) {
                if (valueOf.intValue() == R.id.ee9) {
                    this.f27208t = 1;
                    m20129h();
                    m20124c();
                } else if (valueOf.intValue() == R.id.ee_) {
                    this.f27208t = 2;
                    m20129h();
                    m20124c();
                } else if (valueOf.intValue() == R.id.ahu) {
                    C11725f.f28050b = !C11725f.f28050b;
                    m20123b();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a.AbstractC11627a
    public final void handleMsg(Message message) {
        Integer num;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        int i = this.f27189a;
        if (num != null) {
            if (num.intValue() == i) {
                if (this.f27192d.isEmpty() && this.f27209u < 2) {
                    HandlerC11626a a = m20121a();
                    Room room = this.f27207s;
                    if (room == null) {
                        C89219l.m154710a("mRoom");
                    }
                    ((RoomRetrofitApi) C5805e.m12718a().mo11572a(RoomRetrofitApi.class)).getRoomDebugInfo(room.getId()).mo143271a(new C11191f()).mo143254a(new C7322s(a), new C7323t(a));
                    this.f27209u++;
                }
                m20130i();
                m20124c();
                m20121a().sendEmptyMessageDelayed(this.f27189a, this.f27190b);
            } else if (num.intValue() == 39 && message.obj != null && (message.obj instanceof ArrayList)) {
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.bytedance.android.livesdkapi.depend.model.live.DebugRoomItem> /* = java.util.ArrayList<com.bytedance.android.livesdkapi.depend.model.live.DebugRoomItem> */");
                this.f27192d = (ArrayList) obj;
                m20130i();
                m20124c();
            }
        }
    }

    public final boolean onLongClick(View view) {
        if (!this.f27193e.isEmpty()) {
            m20121a().removeMessages(this.f27189a);
            try {
                String tabContent = this.f27193e.get(0).getTabContent();
                for (int i = 1; i < this.f27193e.size(); i++) {
                    tabContent = tabContent + "\r\n" + this.f27193e.get(i).getTabContent();
                }
                Object a = m20122a(getContext(), "clipboard");
                if (a != null) {
                    ClipData newPlainText = ClipData.newPlainText(tabContent, tabContent);
                    C89219l.m154716b(newPlainText, "");
                    C13386a.C13387a.m24072a((ClipboardManager) a, newPlainText, PrivacyCert.Builder.Companion.with("bpea-1055").usage("").tag("").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                    C11226ao.m19884a("copided");
                    m20121a().sendEmptyMessageDelayed(this.f27189a, this.f27190b);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
                }
            } catch (Exception e) {
                C3854a.m9458a(this.f27191c, e);
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View findViewById = findViewById(R.id.f59);
        C89219l.m154716b(findViewById, "");
        this.f27195g = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.f5e);
        C89219l.m154716b(findViewById2, "");
        this.f27196h = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.f5f);
        C89219l.m154716b(findViewById3, "");
        this.f27197i = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.euv);
        C89219l.m154716b(findViewById4, "");
        this.f27198j = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.c9k);
        C89219l.m154716b(findViewById5, "");
        this.f27203o = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(R.id.ahu);
        C89219l.m154716b(findViewById6, "");
        this.f27202n = (LiveSwitch) findViewById6;
        View findViewById7 = findViewById(R.id.edw);
        C89219l.m154716b(findViewById7, "");
        this.f27204p = (LinearLayout) findViewById7;
        View findViewById8 = findViewById(R.id.ee9);
        C89219l.m154716b(findViewById8, "");
        this.f27205q = (LinearLayout) findViewById8;
        View findViewById9 = findViewById(R.id.ee_);
        C89219l.m154716b(findViewById9, "");
        this.f27206r = (LinearLayout) findViewById9;
        View findViewById10 = findViewById(R.id.c99);
        C89219l.m154716b(findViewById10, "");
        this.f27199k = findViewById10;
        View findViewById11 = findViewById(R.id.c9c);
        C89219l.m154716b(findViewById11, "");
        this.f27200l = findViewById11;
        View findViewById12 = findViewById(R.id.c9e);
        C89219l.m154716b(findViewById12, "");
        this.f27201m = findViewById12;
        LinearLayout linearLayout = this.f27204p;
        if (linearLayout == null) {
            C89219l.m154710a("mTabBasic");
        }
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = this.f27205q;
        if (linearLayout2 == null) {
            C89219l.m154710a("mTabPerformance");
        }
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = this.f27206r;
        if (linearLayout3 == null) {
            C89219l.m154710a("mTabRecommend");
        }
        linearLayout3.setOnClickListener(this);
        LiveSwitch liveSwitch = this.f27202n;
        if (liveSwitch == null) {
            C89219l.m154710a("mSwitchView");
        }
        liveSwitch.setOnClickListener(this);
        TextView textView = this.f27198j;
        if (textView == null) {
            C89219l.m154710a("mTextViewContent");
        }
        textView.setOnLongClickListener(this);
        if (!(objArr == null || objArr.length == 0 || !(objArr[0] instanceof Room))) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
            if (Room.isValid((Room) obj)) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                this.f27207s = (Room) obj2;
            }
        }
        this.f27209u = 0;
        m20129h();
        m20123b();
        m20121a().sendEmptyMessage(this.f27189a);
    }

    /* renamed from: a */
    private static Object m20122a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4358);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(4358);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
