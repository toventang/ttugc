package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.chatroom.p488c.C7387f;
import com.bytedance.android.livesdk.model.C9518ae;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.p561j.C9024ar;
import com.bytedance.android.livesdk.p561j.C9025as;
import com.bytedance.android.livesdk.p561j.C9087cz;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public abstract class BaseHashTagWidget extends RoomRecycleWidget implements AbstractC33974au {

    /* renamed from: a */
    protected TextView f21989a;

    /* renamed from: b */
    public boolean f21990b;

    /* renamed from: c */
    public long f21991c;

    static {
        Covode.recordClassIndex(9806);
    }

    /* renamed from: a */
    public abstract void mo15184a();

    /* renamed from: a */
    public abstract void mo15185a(AbstractC0952i iVar);

    /* renamed from: a */
    public abstract void mo15186a(Hashtag hashtag);

    /* renamed from: b */
    public abstract void mo15187b();

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.b99;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28316b(this);
        }
    }

    /* renamed from: d */
    private final void m17263d() {
        Hashtag hashtag;
        Room room = (Room) this.dataChannel.mo28318b(C9093de.class);
        if (room == null || (hashtag = room.hashtag) == null) {
            hide();
            return;
        }
        this.dataChannel.mo28315b(C9023aq.class, hashtag);
        DataChannelGlobal.f42558d.mo28321a(C9024ar.class, hashtag);
        mo15186a(hashtag);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo15189c() {
        Hashtag hashtag = (Hashtag) this.dataChannel.mo28318b(C9023aq.class);
        if (hashtag == null) {
            return;
        }
        if (!C9518ae.m17826a(hashtag) || !C89219l.m154714a(this.dataChannel.mo28318b(C9025as.class), (Object) true) || this.f21990b) {
            if (isShowing()) {
                hide();
            }
        } else if (!isShowing()) {
            show();
            mo15187b();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        m17263d();
    }

    /* renamed from: b */
    public final void mo15188b(Hashtag hashtag) {
        if (C9518ae.m17826a(hashtag)) {
            TextView textView = this.f21989a;
            if (textView == null) {
                C89219l.m154710a("tagName");
            }
            textView.setText(hashtag.title);
            return;
        }
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.eet);
        C89219l.m154716b(findViewById, "");
        this.f21989a = (TextView) findViewById;
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC8920a(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.BaseHashTagWidget$a */
    static final class View$OnClickListenerC8920a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseHashTagWidget f21992a;

        static {
            Covode.recordClassIndex(9807);
        }

        View$OnClickListenerC8920a(BaseHashTagWidget baseHashTagWidget) {
            this.f21992a = baseHashTagWidget;
        }

        public final void onClick(View view) {
            if (System.currentTimeMillis() - this.f21992a.f21991c > 500) {
                this.f21992a.f21991c = System.currentTimeMillis();
                AbstractC0952i iVar = (AbstractC0952i) this.f21992a.dataChannel.mo28318b(C9021ao.class);
                if (iVar != null) {
                    this.f21992a.mo15185a(iVar);
                }
                this.f21992a.mo15184a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.BaseHashTagWidget$b */
    static final class C8921b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ BaseHashTagWidget f21993a;

        static {
            Covode.recordClassIndex(9808);
        }

        C8921b(BaseHashTagWidget baseHashTagWidget) {
            this.f21993a = baseHashTagWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C7387f fVar = (C7387f) obj;
            C89219l.m154716b(fVar, "");
            if (fVar.f18309b) {
                this.f21993a.f21990b = true;
                this.f21993a.hide();
                return;
            }
            this.f21993a.f21990b = false;
            this.f21993a.mo15189c();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.BaseHashTagWidget$c */
    static final class C8922c extends AbstractC89220m implements AbstractC89172b<Hashtag, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseHashTagWidget f21994a;

        static {
            Covode.recordClassIndex(9809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8922c(BaseHashTagWidget baseHashTagWidget) {
            super(1);
            this.f21994a = baseHashTagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Hashtag hashtag) {
            Hashtag hashtag2;
            Hashtag hashtag3 = hashtag;
            C89219l.m154721d(hashtag3, "");
            Room room = (Room) this.f21994a.dataChannel.mo28318b(C9093de.class);
            if (!(room == null || (hashtag2 = room.hashtag) == null)) {
                hashtag2.f23083id = hashtag3.f23083id;
                hashtag2.title = hashtag3.title;
            }
            this.f21994a.mo15188b(hashtag3);
            this.f21994a.mo15189c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.BaseHashTagWidget$d */
    static final class C8923d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseHashTagWidget f21995a;

        static {
            Covode.recordClassIndex(9810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8923d(BaseHashTagWidget baseHashTagWidget) {
            super(1);
            this.f21995a = baseHashTagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            ViewParent viewParent;
            boolean booleanValue = bool.booleanValue();
            View view = this.f21995a.getView();
            ConstraintLayout constraintLayout = null;
            if (view != null) {
                viewParent = view.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ConstraintLayout) {
                constraintLayout = viewParent;
            }
            ConstraintLayout constraintLayout2 = constraintLayout;
            if (booleanValue) {
                C11279p.m20009a(constraintLayout2, this.f21995a.getViewId(), C3966y.m9653a(131.0f));
            } else {
                C11279p.m20009a(constraintLayout2, this.f21995a.getViewId(), 0);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        hide();
        C6779a.m14563a().mo13050a(this, C7387f.class, this.dataChannel).mo17949a(new C8921b(this));
        this.dataChannel.mo28312a((Object) this, C9023aq.class, (AbstractC89172b) new C8922c(this)).mo28312a((Object) this, C9087cz.class, (AbstractC89172b) new C8923d(this));
        m17263d();
    }
}
