package com.bytedance.android.livesdk.chatroom.widget;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.model.C3270n;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p229d.AbstractC4051b;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p379n.AbstractC5778k;
import com.bytedance.android.live.p379n.C5766ab;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p488c.C7380am;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9124f;
import com.bytedance.android.livesdk.p561j.C9125g;
import com.bytedance.android.livesdk.p561j.C9127i;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11663q;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.C89376n;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class SwitchDefinitionTipsWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: e */
    public static long f20246e;

    /* renamed from: f */
    public static final C8164b f20247f = new C8164b((byte) 0);

    /* renamed from: a */
    public Handler f20248a;

    /* renamed from: b */
    public boolean f20249b;

    /* renamed from: c */
    public RunnableC8163a f20250c;

    /* renamed from: d */
    public Runnable f20251d;

    static {
        Covode.recordClassIndex(8985);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgu;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget$b */
    public static final class C8164b {
        static {
            Covode.recordClassIndex(8987);
        }

        private C8164b() {
        }

        public /* synthetic */ C8164b(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget$c */
    static final class RunnableC8165c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SwitchDefinitionTipsWidget f20257a;

        static {
            Covode.recordClassIndex(8988);
        }

        RunnableC8165c(SwitchDefinitionTipsWidget switchDefinitionTipsWidget) {
            this.f20257a = switchDefinitionTipsWidget;
        }

        public final void run() {
            this.f20257a.hide();
        }
    }

    public SwitchDefinitionTipsWidget() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            C89219l.m154715b();
        }
        this.f20248a = new Handler(myLooper);
        this.f20249b = true;
        this.f20251d = new RunnableC8165c(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28315b(C9124f.class, (Object) false);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        RunnableC8163a aVar = this.f20250c;
        if (aVar != null) {
            this.f20248a.removeCallbacks(aVar);
        }
        this.f20248a.removeCallbacks(this.f20251d);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        String str;
        String str2;
        super.show();
        String valueOf = String.valueOf(this.dataChannel.mo28318b(C9096dh.class));
        EnumC11728i iVar = (EnumC11728i) this.dataChannel.mo28318b(C9058bx.class);
        if (iVar != null) {
            str = C11729j.m20684a(iVar);
        } else {
            str = "";
        }
        boolean z = this.f20249b;
        if (z) {
            str2 = "0";
        } else if (!z) {
            str2 = "1";
        } else {
            throw new C89376n();
        }
        AbstractC4051b bVar = (AbstractC4051b) C6193a.m13435a(AbstractC4051b.class);
        if (bVar != null) {
            bVar.reportAudienceDefinitionTipsShow(valueOf, str, str2);
        }
        f20246e = System.currentTimeMillis();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28315b(C9124f.class, (Object) true);
        }
        this.f20248a.postDelayed(this.f20251d, 5000);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget$a */
    public static final class RunnableC8163a implements Runnable {

        /* renamed from: a */
        private final String f20252a;

        /* renamed from: b */
        private final String f20253b;

        /* renamed from: c */
        private final boolean f20254c;

        /* renamed from: d */
        private final DataChannel f20255d;

        /* renamed from: e */
        private final Runnable f20256e;

        static {
            Covode.recordClassIndex(8986);
        }

        public final void run() {
            Object obj;
            String str;
            String str2;
            String str3;
            AbstractC5778k livePlayControllerManager;
            AbstractC5777j b;
            String str4;
            Map map;
            Map map2;
            EnumC11728i iVar;
            C11226ao.m19883a(C3966y.m9669e(), C3966y.m9660a((int) R.string.ejv, this.f20252a), 0);
            String str5 = this.f20253b;
            DataChannel dataChannel = this.f20255d;
            if (dataChannel != null) {
                obj = dataChannel.mo28318b(C9096dh.class);
            } else {
                obj = null;
            }
            String valueOf = String.valueOf(obj);
            String str6 = "";
            if (valueOf == null) {
                valueOf = str6;
            }
            DataChannel dataChannel2 = this.f20255d;
            if (dataChannel2 == null || (iVar = (EnumC11728i) dataChannel2.mo28318b(C9058bx.class)) == null) {
                str = str6;
            } else {
                str = C11729j.m20684a(iVar);
            }
            boolean z = this.f20254c;
            String str7 = "0";
            if (z) {
                str2 = str7;
            } else if (!z) {
                str2 = "1";
            } else {
                throw new C89376n();
            }
            DataChannel dataChannel3 = this.f20255d;
            if (dataChannel3 == null || (map2 = (Map) dataChannel3.mo28318b(C9125g.class)) == null || (str3 = (String) map2.get("sdk_key")) == null) {
                str3 = str6;
            }
            try {
                DataChannel dataChannel4 = this.f20255d;
                if (dataChannel4 == null || (map = (Map) dataChannel4.mo28318b(C9125g.class)) == null || (str4 = (String) map.get("start_time")) == null) {
                    str4 = String.valueOf(System.currentTimeMillis());
                }
                str7 = String.valueOf((System.currentTimeMillis() - Long.parseLong(str4)) / 1000);
            } catch (Exception e) {
                C3854a.m9453a(4, "SwitchDefinitionTipsWidget", "reportSwitchSuccess. catch exception=".concat(String.valueOf(e)));
            }
            AbstractC4051b bVar = (AbstractC4051b) C6193a.m13435a(AbstractC4051b.class);
            if (bVar != null) {
                bVar.reportAudienceDefinitionDialogSelectSuccess(valueOf, str, str2, str3, str7, "pool_connection", str5);
            }
            C6805b<Map<String, String>> bVar2 = AbstractC6804a.f17020cP;
            C89219l.m154716b(bVar2, str6);
            C6806c.m14603a(bVar2, (Object) null);
            C3270n.C3271a aVar = new C3270n.C3271a();
            aVar.f9364a = this.f20252a;
            aVar.f9365b = this.f20253b;
            DataChannel dataChannel5 = this.f20255d;
            if (dataChannel5 != null) {
                dataChannel5.mo28315b(C9127i.class, aVar);
            }
            C11870f fVar = C11870f.C11871a.f28404a;
            C89219l.m154716b(fVar, str6);
            EnterRoomLinkSession a = fVar.mo19010a();
            C89219l.m154716b(a, str6);
            String str8 = a.f28391b.f28233c.f28288E;
            if (str8 != null) {
                str6 = str8;
            }
            AbstractC4357d dVar = (AbstractC4357d) C6193a.m13435a(AbstractC4357d.class);
            if (!(dVar == null || (livePlayControllerManager = dVar.getLivePlayControllerManager()) == null || (b = livePlayControllerManager.mo11553b(str6)) == null)) {
                b.mo11545e(true);
            }
            this.f20256e.run();
        }

        public RunnableC8163a(String str, String str2, boolean z, DataChannel dataChannel, Runnable runnable) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(runnable, "");
            this.f20252a = str;
            this.f20253b = str2;
            this.f20254c = z;
            this.f20255d = dataChannel;
            this.f20256e = runnable;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget$d */
    static final class View$OnClickListenerC8166d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SwitchDefinitionTipsWidget f20258a;

        static {
            Covode.recordClassIndex(8989);
        }

        View$OnClickListenerC8166d(SwitchDefinitionTipsWidget switchDefinitionTipsWidget) {
            this.f20258a = switchDefinitionTipsWidget;
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget$d$a */
        static final class C8167a implements AbstractC11663q {

            /* renamed from: a */
            final /* synthetic */ String f20259a;

            /* renamed from: b */
            final /* synthetic */ String f20260b;

            /* renamed from: c */
            final /* synthetic */ View$OnClickListenerC8166d f20261c;

            static {
                Covode.recordClassIndex(8990);
            }

            C8167a(String str, String str2, View$OnClickListenerC8166d dVar) {
                this.f20259a = str;
                this.f20260b = str2;
                this.f20261c = dVar;
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11663q
            /* renamed from: a */
            public final void mo14394a(final boolean z) {
                this.f20261c.f20258a.f20248a.post(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget.View$OnClickListenerC8166d.C8167a.RunnableC81681 */

                    /* renamed from: a */
                    final /* synthetic */ C8167a f20262a;

                    static {
                        Covode.recordClassIndex(8991);
                    }

                    {
                        this.f20262a = r1;
                    }

                    public final void run() {
                        if (z) {
                            this.f20262a.f20261c.f20258a.f20250c = new RunnableC8163a(this.f20262a.f20259a, this.f20262a.f20260b, this.f20262a.f20261c.f20258a.f20249b, this.f20262a.f20261c.f20258a.dataChannel, this.f20262a.f20261c.f20258a.f20251d);
                            Handler handler = this.f20262a.f20261c.f20258a.f20248a;
                            RunnableC8163a aVar = this.f20262a.f20261c.f20258a.f20250c;
                            if (aVar == null) {
                                C89219l.m154715b();
                            }
                            handler.post(aVar);
                        }
                    }
                });
            }
        }

        public final void onClick(View view) {
            C89378p<String, String> nextLowerLevelDefinition = ((AbstractC4051b) C6193a.m13435a(AbstractC4051b.class)).getNextLowerLevelDefinition();
            C3854a.m9453a(4, "SwitchDefinitionTipsWidget", "onInit. switchBtn click. nextLowerDefinition=".concat(String.valueOf(nextLowerLevelDefinition)));
            if (nextLowerLevelDefinition != null) {
                String first = nextLowerLevelDefinition.getFirst();
                String second = nextLowerLevelDefinition.getSecond();
                C11870f fVar = C11870f.C11871a.f28404a;
                C89219l.m154716b(fVar, "");
                EnterRoomLinkSession a = fVar.mo19010a();
                C89219l.m154716b(a, "");
                String str = a.f28391b.f28233c.f28288E;
                if (str == null) {
                    str = "";
                }
                AbstractC2953a a2 = C6193a.m13435a(AbstractC4357d.class);
                C89219l.m154716b(a2, "");
                AbstractC5777j b = ((AbstractC4357d) a2).getLivePlayControllerManager().mo11553b(str);
                if (b != null) {
                    b.mo12910a(first, new C8167a(second, first, this));
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget$e */
    static final class C8169e extends AbstractC89220m implements AbstractC89172b<C7380am, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SwitchDefinitionTipsWidget f20264a;

        static {
            Covode.recordClassIndex(8992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8169e(SwitchDefinitionTipsWidget switchDefinitionTipsWidget) {
            super(1);
            this.f20264a = switchDefinitionTipsWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7380am amVar) {
            C7380am amVar2 = amVar;
            C89219l.m154721d(amVar2, "");
            if (this.f20264a.f20249b) {
                this.f20264a.mo14390a(amVar2.f18292a);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        ((LiveTextView) findViewById(R.id.z3)).setOnClickListener(new View$OnClickListenerC8166d(this));
    }

    /* renamed from: a */
    public final void mo14390a(int i) {
        ViewGroup.LayoutParams layoutParams;
        C3854a.m9453a(4, "SwitchDefinitionTipsWidget", "updateViewPosition. videoBottom=".concat(String.valueOf(i)));
        if (i > 0) {
            View view = getView();
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C3966y.m9662b() - i;
                View view2 = getView();
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9076co.class)) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        this.f20249b = z;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.mo28314b(C5766ab.class, (AbstractC89172b) new C8169e(this));
        }
    }
}
