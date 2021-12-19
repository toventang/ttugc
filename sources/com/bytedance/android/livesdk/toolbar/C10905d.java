package com.bytedance.android.livesdk.toolbar;

import com.bytedance.android.livesdk.chatroom.p488c.C7390i;
import com.bytedance.android.livesdk.gift.model.C8843h;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.toolbar.d */
public final class C10905d {

    /* renamed from: a */
    public DataChannel f26204a;

    /* renamed from: b */
    public AbstractC10906a f26205b;

    /* renamed from: c */
    public C88411a f26206c;

    /* renamed from: com.bytedance.android.livesdk.toolbar.d$a */
    public interface AbstractC10906a {
        static {
            Covode.recordClassIndex(12514);
        }

        /* renamed from: a */
        void mo17772a(C8843h hVar);
    }

    static {
        Covode.recordClassIndex(12513);
    }

    /* renamed from: com.bytedance.android.livesdk.toolbar.d$b */
    static final class C10907b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10905d f26207a;

        static {
            Covode.recordClassIndex(12515);
        }

        C10907b(C10905d dVar) {
            this.f26207a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel;
            Room room;
            AbstractC10906a aVar;
            C7390i iVar = (C7390i) obj;
            if (iVar != null && (dataChannel = this.f26207a.f26204a) != null && (room = (Room) dataChannel.mo28318b(C9093de.class)) != null && room.getId() == iVar.f18315a && (aVar = this.f26207a.f26205b) != null) {
                aVar.mo17772a(iVar.f18316b);
            }
        }
    }

    public C10905d(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f26204a = dataChannel;
        C88411a aVar = new C88411a();
        this.f26206c = aVar;
        aVar.mo142945a(C6779a.m14563a().mo13052a(C7390i.class).mo143289d(new C10907b(this)));
    }
}
