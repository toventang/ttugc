package com.bytedance.android.livesdk.list;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.AbstractC11768h;
import com.bytedance.android.livesdkapi.p691g.AbstractC11769i;
import com.bytedance.android.livesdkapi.p691g.AbstractC11774m;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.list.g */
public final class C9282g extends AbstractC11768h implements AbstractC11774m {

    /* renamed from: a */
    public boolean f22682a;

    /* renamed from: b */
    public final List<EnterRoomConfig> f22683b = new ArrayList();

    /* renamed from: c */
    public AbstractC11769i f22684c;

    /* renamed from: d */
    public final EnterRoomConfig f22685d;

    /* renamed from: e */
    private final C9283a f22686e = new C9283a(this);

    static {
        Covode.recordClassIndex(10200);
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h, com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: c */
    public final Room mo14904c(int i) {
        return null;
    }

    /* renamed from: com.bytedance.android.livesdk.list.g$a */
    public static final class C9283a implements AbstractC11769i.AbstractC11770a {

        /* renamed from: a */
        final /* synthetic */ C9282g f22687a;

        static {
            Covode.recordClassIndex(10201);
        }

        @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i.AbstractC11770a
        /* renamed from: a */
        public final void mo15381a() {
            this.f22687a.f22682a = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9283a(C9282g gVar) {
            this.f22687a = gVar;
        }

        @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11769i.AbstractC11770a
        /* renamed from: a */
        public final void mo15382a(List<EnterRoomConfig> list) {
            C89219l.m154721d(list, "");
            this.f22687a.f22682a = false;
            this.f22687a.f22683b.addAll(list);
            this.f22687a.mo18715f();
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14898a() {
        return this.f22683b.size();
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final List<Room> mo14902b() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: c */
    public final void mo14905c() {
        super.mo14905c();
        AbstractC11769i iVar = this.f22684c;
        if (iVar != null) {
            iVar.mo18720b();
        }
        this.f22683b.clear();
    }

    /* renamed from: e */
    private final void m17532e() {
        List<EnterRoomConfig> a;
        this.f22683b.clear();
        AbstractC11769i iVar = this.f22684c;
        if (!(iVar == null || (a = iVar.mo18716a()) == null)) {
            for (EnterRoomConfig enterRoomConfig : a) {
                if (enterRoomConfig.f28233c.f28301R == this.f22685d.f28233c.f28301R) {
                    this.f22683b.add(this.f22685d);
                } else {
                    this.f22683b.add(enterRoomConfig);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final EnterRoomConfig mo14900a(int i) {
        return this.f22683b.get(i);
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: b */
    public final void mo14903b(int i) {
        if (!this.f22682a) {
            this.f22682a = true;
            AbstractC11769i iVar = this.f22684c;
            if (iVar != null) {
                iVar.mo18717a(this.f22683b.size() + i, this.f22686e);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11765f
    /* renamed from: a */
    public final int mo14899a(EnterRoomConfig enterRoomConfig) {
        C89219l.m154721d(enterRoomConfig, "");
        long j = enterRoomConfig.f28233c.f28301R;
        int size = this.f22683b.size();
        for (int i = 0; i < size; i++) {
            if (this.f22683b.get(i).f28233c.f28301R == j) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdkapi.p691g.AbstractC11768h
    /* renamed from: a */
    public final void mo14901a(long j) {
        AbstractC11769i iVar = this.f22684c;
        if (iVar != null) {
            iVar.mo18718a(j);
        }
        for (T t : this.f22683b) {
            if (t.f28233c.f28301R == j) {
                this.f22683b.remove(t);
                return;
            }
        }
    }

    public C9282g(EnterRoomConfig enterRoomConfig, AbstractC11769i iVar) {
        C89219l.m154721d(enterRoomConfig, "");
        C89219l.m154721d(iVar, "");
        this.f22685d = enterRoomConfig;
        this.f22684c = iVar;
        m17532e();
    }
}
