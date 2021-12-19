package com.bytedance.android.livesdk.chatroom.detail;

import android.util.Pair;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.b */
public abstract class AbstractC7430b {

    /* renamed from: a */
    public Pair<Integer, String> f18429a;

    /* renamed from: b */
    final AbstractC7431a f18430b;

    /* renamed from: c */
    public boolean f18431c;

    /* renamed from: d */
    public Room f18432d;

    /* renamed from: e */
    private AbstractC88412b f18433e;

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.b$a */
    public interface AbstractC7431a {
        static {
            Covode.recordClassIndex(8201);
        }

        /* renamed from: a */
        void mo13653a(int i, String str);

        /* renamed from: a */
        void mo13654a(Room room);
    }

    static {
        Covode.recordClassIndex(8200);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract AbstractC88979t<C5832d<Room>> mo13652c();

    /* renamed from: b */
    public final void mo13651b() {
        this.f18431c = false;
        AbstractC88412b bVar = this.f18433e;
        if (bVar != null && !bVar.isDisposed()) {
            this.f18433e.dispose();
        }
    }

    /* renamed from: a */
    public final void mo13649a() {
        if (!this.f18431c) {
            this.f18431c = true;
            this.f18433e = mo13652c().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C7432c(this), new C7433d(this));
        }
    }

    AbstractC7430b(AbstractC7431a aVar) {
        this.f18430b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13650a(int i, String str) {
        this.f18429a = new Pair<>(Integer.valueOf(i), str);
        this.f18431c = false;
        this.f18430b.mo13653a(i, str);
    }
}
