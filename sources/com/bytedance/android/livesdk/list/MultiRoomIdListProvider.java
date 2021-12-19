package com.bytedance.android.livesdk.list;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.p691g.AbstractC11768h;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;

public class MultiRoomIdListProvider extends AbstractC11768h implements AbstractC33974au {

    /* renamed from: a */
    List<Room> f22667a;

    /* renamed from: b */
    EnterRoomConfig f22668b;

    /* renamed from: c */
    private List<RoomInfo> f22669c = new ArrayList();

    /* renamed from: d */
    private final List<EnterRoomConfig> f22670d = new ArrayList();

    /* renamed from: e */
    private AbstractC88412b f22671e;

    /* renamed from: f */
    private List<Room> f22672f = new ArrayList();

    static {
        Covode.recordClassIndex(10193);
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final void mo14903b(int i) {
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h, com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: c */
    public final Room mo14904c(int i) {
        return null;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: d */
    public final List<Room> mo15379d() {
        return this.f22672f;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14898a() {
        return this.f22669c.size();
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final List<Room> mo14902b() {
        return new ArrayList();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        AbstractC88412b bVar = this.f22671e;
        if (bVar != null) {
            bVar.dispose();
            this.f22671e = null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14899a(EnterRoomConfig enterRoomConfig) {
        return this.f22669c.indexOf(Long.valueOf(enterRoomConfig.f28233c.f28301R));
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: a */
    public final void mo14901a(long j) {
        for (int i = 0; i < this.f22669c.size(); i++) {
            if (this.f22669c.get(i) != null && this.f22669c.get(i).getRoomId() == j) {
                this.f22669c.remove(i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15378a(List<Room> list) {
        this.f22670d.clear();
        if (!C13617h.m24465a(list)) {
            for (Room room : list) {
                this.f22670d.add(C11760a.m20718a(room, false));
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final EnterRoomConfig mo14900a(int i) {
        if (!C13603b.m24435a((Collection) this.f22670d) && this.f22670d.size() > i) {
            return this.f22670d.get(i);
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig enterRoomConfig2 = this.f22668b;
        if (enterRoomConfig2 != null) {
            long j = enterRoomConfig2.f28233c.f28301R;
            if (j > 0 && this.f22669c.get(i) != null && j == this.f22669c.get(i).getRoomId()) {
                enterRoomConfig = this.f22668b;
            }
        }
        if (i >= 0 && i < this.f22669c.size() && this.f22669c.get(i) != null) {
            if (!TextUtils.isEmpty(this.f22668b.f28232b.f28257a)) {
                enterRoomConfig.f28232b.f28257a = this.f22668b.f28232b.f28257a;
            }
            if (!TextUtils.isEmpty(this.f22668b.f28232b.f28263g)) {
                enterRoomConfig.f28232b.f28263g = this.f22668b.f28232b.f28263g;
            }
            enterRoomConfig.f28233c.f28301R = this.f22669c.get(i).getRoomId();
            enterRoomConfig.f28232b.f28258b = this.f22669c.get(i).getAnchorId();
        }
        return enterRoomConfig;
    }

    public MultiRoomIdListProvider(AbstractC1196i iVar, List<RoomInfo> list, EnterRoomConfig enterRoomConfig) {
        this.f22668b = enterRoomConfig;
        this.f22669c.addAll(list);
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                jArr[i] = list.get(i).getRoomId();
            } else {
                jArr[i] = 0;
            }
        }
        iVar.mo4012a(this);
        this.f22671e = C7307f.m15213a(jArr).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9280e(this, list), C9281f.f22681a);
    }
}
