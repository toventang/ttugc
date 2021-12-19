package com.bytedance.android.livesdk.rank.impl.ranks;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import androidx.core.p036g.C0691d;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.api.C3018a;
import com.bytedance.android.livesdk.C6912bl;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8095br;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.p610c.C10384a;
import com.bytedance.android.livesdk.rank.impl.p619ui.MarqueeSwitcher;
import com.bytedance.android.livesdk.rank.impl.ranks.C10473a;
import com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10475a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public class RankEntranceWidget extends LiveRecyclableWidget implements C10473a.AbstractC10474a, AbstractC33974au {

    /* renamed from: a */
    public MarqueeSwitcher f25209a;

    /* renamed from: b */
    C10546f f25210b;

    /* renamed from: c */
    public final List<C10497b> f25211c = new ArrayList();

    /* renamed from: d */
    public int f25212d;

    /* renamed from: e */
    C10475a f25213e;

    /* renamed from: f */
    private C10497b f25214f;

    /* renamed from: g */
    private Boolean f25215g = false;

    /* renamed from: h */
    private final Handler f25216h = new Handler(new Handler.Callback() {
        /* class com.bytedance.android.livesdk.rank.impl.ranks.RankEntranceWidget.C104721 */

        static {
            Covode.recordClassIndex(12047);
        }

        public final boolean handleMessage(Message message) {
            boolean z = false;
            if (message.what != 1) {
                return false;
            }
            if (RankEntranceWidget.this.f25211c.isEmpty()) {
                return true;
            }
            int size = (RankEntranceWidget.this.f25212d + 1) % RankEntranceWidget.this.f25211c.size();
            C10497b bVar = RankEntranceWidget.this.f25211c.get(size);
            TextView textView = (TextView) RankEntranceWidget.this.f25209a.getNextView();
            RankEntranceWidget rankEntranceWidget = RankEntranceWidget.this;
            if (size != 0) {
                z = true;
            }
            rankEntranceWidget.mo17309a(textView, bVar, z, "loop");
            RankEntranceWidget.this.f25209a.showNext();
            RankEntranceWidget.this.f25212d++;
            return true;
        }
    });

    /* renamed from: i */
    private AbstractC89172b<C89391z, C89391z> f25217i = new C10543c(this);

    static {
        Covode.recordClassIndex(12046);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bat;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.C10473a.AbstractC10474a
    /* renamed from: b */
    public final C10497b mo17313b() {
        return this.f25214f;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    /* renamed from: c */
    private void m18979c() {
        this.f25209a.reset();
        this.f25211c.clear();
        this.f25216h.removeMessages(1);
        C10475a aVar = this.f25213e;
        if (aVar != null) {
            aVar.dismiss();
            if (C6912bl.f17297a) {
                this.f25213e = null;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.C10473a.AbstractC10474a
    /* renamed from: a */
    public final void mo17308a() {
        show();
        if (this.dataChannel != null) {
            this.dataChannel.mo28309a((AbstractC1204m) this, C3018a.class, (AbstractC89172b) this.f25217i);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        getView().setAlpha(1.0f);
        hide();
        this.f25210b.mo8577b();
        m18979c();
        C10384a.m18891a(-1);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.C10473a.AbstractC10474a
    /* renamed from: a */
    public final void mo17312a(boolean z) {
        hide();
        if (z) {
            m18979c();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        this.f25210b = new C10546f();
        getView().setOnClickListener(new View$OnClickListenerC10544d(this));
        this.f25209a = (MarqueeSwitcher) findViewById(R.id.eor);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        hide();
        this.f25211c.clear();
        this.f25210b.mo10297a((C10473a.AbstractC10474a) this);
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C8454g.class).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C10545e(this));
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.C10473a.AbstractC10474a
    /* renamed from: a */
    public final void mo17310a(ArrayList<Integer> arrayList) {
        Room room;
        C10475a aVar = this.f25213e;
        if (aVar != null) {
            aVar.dismiss();
        }
        if (this.dataChannel != null && (room = (Room) this.dataChannel.mo28318b(C9093de.class)) != null && room.getOwner() != null && this.f25214f != null) {
            long id = room.getOwner().getId();
            long id2 = room.getId();
            int i = this.f25214f.f25269a;
            C89219l.m154721d(arrayList, "");
            C10475a aVar2 = new C10475a();
            Bundle bundle = new Bundle();
            bundle.putLong("arg_anchor_id", id);
            bundle.putLong("arg_room_id", id2);
            bundle.putInt("first_show_rank_type", i);
            bundle.putIntegerArrayList("rank_types", arrayList);
            aVar2.setArguments(bundle);
            this.f25213e = aVar2;
            AbstractC0952i iVar = (AbstractC0952i) this.dataChannel.mo28318b(C9021ao.class);
            if (iVar != null) {
                this.f25213e.show(iVar, C10475a.class.getSimpleName());
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.C10473a.AbstractC10474a
    /* renamed from: a */
    public final void mo17311a(List<C10497b> list) {
        if (!C0691d.m2448a(this.f25211c, list)) {
            this.f25211c.clear();
            this.f25211c.addAll(list);
            boolean z = true;
            this.f25216h.removeMessages(1);
            this.f25212d = 0;
            TextView textView = (TextView) this.f25209a.getNextView();
            this.f25209a.showNext();
            if (this.f25214f != null) {
                this.f25215g = true;
            }
            C10497b bVar = list.get(0);
            if (list.size() <= 1) {
                z = false;
            }
            mo17309a(textView, bVar, z, "live_play");
        }
    }

    /* renamed from: a */
    public final void mo17309a(TextView textView, C10497b bVar, boolean z, String str) {
        String str2;
        this.f25214f = bVar;
        textView.setText(bVar.f25270b);
        GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
        gradientDrawable.mutate();
        gradientDrawable.setColor(bVar.f25271c);
        if (z) {
            this.f25216h.sendEmptyMessageDelayed(1, bVar.f25272d);
        }
        String rankName = EnumC10345i.HOURLY_RANK.getRankName();
        if (bVar.f25269a == EnumC10345i.WEEKLY_RANK.getType()) {
            rankName = EnumC10345i.WEEKLY_RANK.getRankName();
        }
        if (!this.f25215g.booleanValue()) {
            C6501b a = C6501b.C6502a.m13948a("livesdk_hourly_rank_entrance_show").mo12643a(this.dataChannel);
            if (((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue()) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            a.mo12651a("user_type", str2).mo12651a("show_reason", str).mo12651a("rank_type", rankName).mo12655b();
        }
    }
}
