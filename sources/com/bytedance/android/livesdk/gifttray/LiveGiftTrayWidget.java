package com.bytedance.android.livesdk.gifttray;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.gift.C4338n;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.gifttray.p556c.AbstractC8879a;
import com.bytedance.android.livesdk.gifttray.p557d.C8898a;
import com.bytedance.android.livesdk.gifttray.p557d.C8899b;
import com.bytedance.android.livesdk.model.message.C9623av;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9097di;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.service.p625c.p634i.C10755b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveGiftTrayWidget extends AbsNormalGiftAnimWidget implements AbstractC33974au {

    /* renamed from: b */
    final int f21827b = 1;

    /* renamed from: c */
    private LiveGiftTrayQueueView f21828c;

    static {
        Covode.recordClassIndex(9751);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bg3;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget
    /* renamed from: a */
    public final void mo15101a() {
        LiveGiftTrayQueueView liveGiftTrayQueueView = this.f21828c;
        if (liveGiftTrayQueueView != null) {
            C10755b.C10756a.C10757a.f25916a.f25915f += liveGiftTrayQueueView.f21819a.size();
            C10755b bVar = C10755b.C10756a.C10757a.f25916a;
            int notCommonShowAmount = liveGiftTrayQueueView.getNotCommonShowAmount();
            bVar.f25913d += notCommonShowAmount;
            bVar.f25912c += notCommonShowAmount;
            C10755b bVar2 = C10755b.C10756a.C10757a.f25916a;
            int notEffectShowAmount = liveGiftTrayQueueView.getNotEffectShowAmount();
            bVar2.f25914e += notEffectShowAmount;
            bVar2.f25912c += notEffectShowAmount;
            liveGiftTrayQueueView.f21819a.clear();
            liveGiftTrayQueueView.f21820b.clear();
            liveGiftTrayQueueView.f21823e.clear();
            liveGiftTrayQueueView.f21824f.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget
    /* renamed from: b */
    public final void mo15104b() {
        DataChannel dataChannel;
        MethodCollector.m26663i(5548);
        LiveGiftTrayQueueView liveGiftTrayQueueView = this.f21828c;
        if (liveGiftTrayQueueView != null) {
            Iterator<C8873b> it = liveGiftTrayQueueView.f21821c.iterator();
            while (it.hasNext()) {
                C8873b next = it.next();
                ViewGroup viewGroup = next.f21868f;
                if (viewGroup == null) {
                    C89219l.m154710a("mContainerView");
                }
                viewGroup.removeView(next.f21865c);
                if (next.f21870h) {
                    AbstractC8879a aVar = next.f21865c;
                    if (aVar != null) {
                        aVar.mo15141b();
                    }
                } else {
                    AbstractC8879a aVar2 = next.f21865c;
                    if (aVar2 != null) {
                        aVar2.mo15141b();
                    }
                }
                next.f21865c = null;
                ViewGroup viewGroup2 = next.f21868f;
                if (viewGroup2 == null) {
                    C89219l.m154710a("mContainerView");
                }
                if (viewGroup2.getChildCount() == 0 && (dataChannel = next.f21866d) != null) {
                    dataChannel.mo28320c(C4338n.class, true);
                }
                next.f21867e = null;
                next.f21864b = false;
                next.f21863a = true;
                next.f21871i = false;
                next.f21870h = false;
            }
            MethodCollector.m26664o(5548);
            return;
        }
        MethodCollector.m26664o(5548);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        boolean z;
        String str;
        String str2;
        Boolean bool;
        LiveGiftTrayQueueView liveGiftTrayQueueView = this.f21828c;
        if (liveGiftTrayQueueView != null) {
            C10755b bVar = C10755b.C10756a.C10757a.f25916a;
            DataChannel dataChannel = liveGiftTrayQueueView.f21822d;
            if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9119ed.class)) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            int size = liveGiftTrayQueueView.f21819a.size();
            int notEffectShowAmount = liveGiftTrayQueueView.getNotEffectShowAmount();
            int notCommonShowAmount = liveGiftTrayQueueView.getNotCommonShowAmount();
            if (bVar.f25911b) {
                C6501b a = C6501b.C6502a.m13948a("gift_tray");
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                b.mo13161c();
                Map map = (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
                if (map == null || map.get("anchor_id") == null) {
                    Integer.valueOf(0);
                }
                int i = notEffectShowAmount + notCommonShowAmount;
                C6501b a2 = a.mo12645a("is_anchor", 0).mo12639a().mo12645a("gift_tray_show", bVar.f25910a).mo12645a("gift_tray_not_show", i).mo12649a("gift_tray_discard_rate", Float.valueOf(((float) i) / ((float) (i + bVar.f25910a))));
                String str3 = "0";
                if (z) {
                    str = "1";
                } else {
                    str = str3;
                }
                C6501b a3 = a2.mo12651a("is_anchor", str);
                Map map2 = (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
                if (!(map2 == null || (str2 = (String) map2.get("anchor_id")) == null)) {
                    str3 = str2;
                }
                a3.mo12651a("anchor_id", str3).mo12645a("own_send_not_show", size).mo12645a("dropped_common_cnt", bVar.f25913d).mo12645a("dropped_effect_cnt", bVar.f25914e).mo12645a("not_show_common_cnt", notCommonShowAmount).mo12645a("not_show_effect_cnt", notEffectShowAmount).mo12645a("gift_tray_drop", bVar.f25912c).mo12645a("own_send_drop", bVar.f25915f).mo12655b();
                bVar.f25911b = false;
            }
            liveGiftTrayQueueView.f21819a.clear();
            liveGiftTrayQueueView.f21820b.clear();
            Iterator<C8873b> it = liveGiftTrayQueueView.f21821c.iterator();
            while (it.hasNext()) {
                it.next();
            }
            liveGiftTrayQueueView.f21823e.clear();
            liveGiftTrayQueueView.f21824f.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget$a */
    public static final class C8868a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ boolean f21829a;

        /* renamed from: b */
        final /* synthetic */ boolean f21830b;

        /* renamed from: c */
        final /* synthetic */ View f21831c;

        static {
            Covode.recordClassIndex(9752);
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            if (!this.f21829a) {
                this.f21831c.setVisibility(8);
            }
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            if (this.f21829a || !this.f21830b) {
                this.f21831c.setVisibility(0);
            }
        }

        C8868a(boolean z, boolean z2, View view) {
            this.f21829a = z;
            this.f21830b = z2;
            this.f21831c = view;
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget
    /* renamed from: a */
    public final void mo15103a(C9895y yVar) {
        long j;
        Room room;
        if (yVar != null && yVar.f23938m != 1) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
                j = 0;
            } else {
                j = room.getOwnerUserId();
            }
            C8871a a = C8898a.m17239a(yVar, j);
            LiveGiftTrayQueueView liveGiftTrayQueueView = this.f21828c;
            if (liveGiftTrayQueueView != null) {
                liveGiftTrayQueueView.mo15107a(a);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget
    /* renamed from: b */
    public final void mo15105b(C9895y yVar) {
        long j;
        Room room;
        C89219l.m154721d(yVar, "");
        yVar.f23944s = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
            j = 0;
        } else {
            j = room.getOwnerUserId();
        }
        C8871a a = C8898a.m17239a(yVar, j);
        a.mo15121a(C8871a.EnumC8872a.VIDEO_ONLY);
        LiveGiftTrayQueueView liveGiftTrayQueueView = this.f21828c;
        if (liveGiftTrayQueueView != null) {
            liveGiftTrayQueueView.mo15107a(a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget$b */
    static final class C8869b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveGiftTrayWidget f21832a;

        static {
            Covode.recordClassIndex(9753);
        }

        C8869b(LiveGiftTrayWidget liveGiftTrayWidget) {
            this.f21832a = liveGiftTrayWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
            if (r3 != false) goto L_0x002e;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r7) {
            /*
                r6 = this;
                com.bytedance.android.livesdk.event.g r7 = (com.bytedance.android.livesdk.event.C8454g) r7
                if (r7 == 0) goto L_0x0021
                com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget r2 = r6.f21832a
                android.util.SparseBooleanArray r1 = r7.f20901a
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                boolean r5 = r7.f20903c
                int r0 = r2.f21827b
                boolean r1 = r1.get(r0)
                android.content.Context r0 = r2.getContext()
                android.view.ViewGroup r4 = r2.containerView
                r3 = r1 ^ 1
                if (r0 == 0) goto L_0x0021
                if (r4 != 0) goto L_0x0022
            L_0x0021:
                return
            L_0x0022:
                if (r3 != 0) goto L_0x002e
                if (r5 == 0) goto L_0x002b
                r0 = 8
                r4.setVisibility(r0)
            L_0x002b:
                r1 = 0
                if (r3 == 0) goto L_0x0030
            L_0x002e:
                r1 = 1065353216(0x3f800000, float:1.0)
            L_0x0030:
                android.view.ViewPropertyAnimator r0 = r4.animate()
                android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
                r0 = 200(0xc8, double:9.9E-322)
                android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
                com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget$a r0 = new com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget$a
                r0.<init>(r3, r5, r4)
                android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
                r0.start()
                goto L_0x0021
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget.C8869b.accept(java.lang.Object):void");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C10755b bVar = C10755b.C10756a.C10757a.f25916a;
        bVar.f25911b = true;
        bVar.f25910a = 0;
        bVar.f25912c = 0;
        bVar.f25913d = 0;
        bVar.f25914e = 0;
        bVar.f25915f = 0;
        View view = this.contentView;
        if (!(view instanceof LiveGiftTrayQueueView)) {
            view = null;
        }
        LiveGiftTrayQueueView liveGiftTrayQueueView = (LiveGiftTrayQueueView) view;
        this.f21828c = liveGiftTrayQueueView;
        if (liveGiftTrayQueueView != null) {
            liveGiftTrayQueueView.setDataCenter(this.dataChannel);
        }
        LiveGiftTrayQueueView liveGiftTrayQueueView2 = this.f21828c;
        if (liveGiftTrayQueueView2 != null) {
            C8873b bVar2 = new C8873b(0);
            C8873b bVar3 = new C8873b(1);
            bVar2.mo15128a(liveGiftTrayQueueView2);
            bVar3.mo15128a(liveGiftTrayQueueView2);
            bVar2.f21869g = liveGiftTrayQueueView2.f21825g;
            bVar3.f21869g = liveGiftTrayQueueView2.f21825g;
            bVar2.mo15131a(liveGiftTrayQueueView2.f21822d);
            bVar3.mo15131a(liveGiftTrayQueueView2.f21822d);
            liveGiftTrayQueueView2.f21821c.add(bVar2);
            liveGiftTrayQueueView2.f21821c.add(bVar3);
        }
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C8454g.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(C11152e.m19790a(this))).mo17949a(new C8869b(this));
    }

    @Override // com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget
    /* renamed from: a */
    public final void mo15102a(C9623av avVar) {
        C89219l.m154721d(avVar, "");
        C89219l.m154721d(avVar, "");
        C9895y yVar = new C9895y();
        yVar.f23934i = -999;
        yVar.f23939n = avVar.f23427h;
        yVar.f23932g = avVar.f23424a;
        yVar.f23944s = true;
        C8871a aVar = new C8871a(yVar);
        aVar.mo15121a(C8871a.EnumC8872a.TRAY_ONLY);
        aVar.f21857v = C8899b.m17241a(avVar.f23425f);
        aVar.f21858w = avVar.f23429j;
        aVar.f21861z = avVar.f23424a;
        aVar.mo15122a(C8899b.m17241a(avVar.f23426g));
        aVar.f21833A = true;
        aVar.f21839d = avVar.f23427h;
        aVar.f21848m = C11200a.m19851a();
        C8898a.m17240a(aVar);
        LiveGiftTrayQueueView liveGiftTrayQueueView = this.f21828c;
        if (liveGiftTrayQueueView != null) {
            liveGiftTrayQueueView.mo15107a(aVar);
        }
    }
}
