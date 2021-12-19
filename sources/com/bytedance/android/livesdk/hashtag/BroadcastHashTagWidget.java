package com.bytedance.android.livesdk.hashtag;

import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.p379n.C5789u;
import com.bytedance.android.livesdk.hashtag.C8937f;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9025as;
import com.bytedance.android.livesdk.p561j.C9091dc;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class BroadcastHashTagWidget extends BaseHashTagWidget implements AbstractC33974au {
    static {
        Covode.recordClassIndex(9811);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    /* renamed from: a */
    public final void mo15184a() {
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    /* renamed from: b */
    public final void mo15187b() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    /* renamed from: a */
    public final void mo15185a(AbstractC0952i iVar) {
        C89219l.m154721d(iVar, "");
        C8937f.C8938a.m17286a(iVar, "Broadcast", null);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        this.dataChannel.mo28317b((Object) this, C5789u.class, (AbstractC89172b) new C8924a(this));
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    /* renamed from: a */
    public final void mo15186a(Hashtag hashtag) {
        C89219l.m154721d(hashtag, "");
        C6805b<Long> bVar = AbstractC6804a.f17049cw;
        C89219l.m154716b(bVar, "");
        C6806c.m14603a(bVar, hashtag.f23083id);
        C6805b<String> bVar2 = AbstractC6804a.f17050cx;
        C89219l.m154716b(bVar2, "");
        C6806c.m14603a(bVar2, hashtag.title);
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget$a */
    static final class C8924a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BroadcastHashTagWidget f21996a;

        static {
            Covode.recordClassIndex(9812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8924a(BroadcastHashTagWidget broadcastHashTagWidget) {
            super(1);
            this.f21996a = broadcastHashTagWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f21996a.dataChannel.mo28311a(C9025as.class, (Object) false);
                this.f21996a.hide();
            } else {
                this.f21996a.dataChannel.mo28311a(C9025as.class, (Object) true);
                this.f21996a.mo15189c();
            }
            this.f21996a.dataChannel.mo28319c(C9091dc.class);
            return C89391z.f203057a;
        }
    }
}
