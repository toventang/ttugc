package com.bytedance.android.livesdk.chatroom.detail;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.detail.AbstractC7430b;
import com.bytedance.android.livesdk.chatroom.detail.C7435f;
import com.bytedance.android.livesdk.chatroom.model.C7685e;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePrefetchRoomInfoEveryTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePrefetchRoomInfoSetting;
import com.bytedance.android.livesdk.watch.AbstractC11322c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.r */
public final class C7454r implements AbstractC11322c {

    /* renamed from: k */
    public static final AbstractC89244h f18529k = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C7456b.f18541a);

    /* renamed from: l */
    public static final C7455a f18530l = new C7455a((byte) 0);

    /* renamed from: a */
    public final int f18531a;

    /* renamed from: b */
    public final int f18532b;

    /* renamed from: c */
    public final int f18533c;

    /* renamed from: d */
    public EnterRoomConfig f18534d;

    /* renamed from: e */
    public C7435f f18535e;

    /* renamed from: f */
    public C7466y f18536f;

    /* renamed from: g */
    public AbstractC7430b.AbstractC7431a f18537g;

    /* renamed from: h */
    public C7435f.AbstractC7436a f18538h;

    /* renamed from: i */
    public int f18539i;

    /* renamed from: j */
    public int f18540j;

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.r$a */
    public static final class C7455a {
        static {
            Covode.recordClassIndex(8225);
        }

        /* renamed from: a */
        public static C7454r m15360a() {
            return (C7454r) C7454r.f18529k.getValue();
        }

        private C7455a() {
        }

        public /* synthetic */ C7455a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.r$b */
    static final class C7456b extends AbstractC89220m implements AbstractC89171a<C7454r> {

        /* renamed from: a */
        public static final C7456b f18541a = new C7456b();

        static {
            Covode.recordClassIndex(8226);
        }

        C7456b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C7454r invoke() {
            return new C7454r((byte) 0);
        }
    }

    private C7454r() {
        this.f18531a = 1;
        this.f18532b = 2;
    }

    static {
        Covode.recordClassIndex(8224);
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11322c
    /* renamed from: a */
    public final void mo13687a() {
        int i = this.f18533c;
        this.f18539i = i;
        this.f18540j = i;
        C7466y yVar = this.f18536f;
        if (yVar != null) {
            yVar.mo13651b();
        }
        C7435f fVar = this.f18535e;
        if (fVar != null) {
            fVar.mo13656b();
        }
        this.f18536f = null;
        this.f18535e = null;
        this.f18538h = null;
        this.f18537g = null;
    }

    public /* synthetic */ C7454r(byte b) {
        this();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.r$c */
    public static final class C7457c implements AbstractC7430b.AbstractC7431a {

        /* renamed from: a */
        final /* synthetic */ C7454r f18542a;

        static {
            Covode.recordClassIndex(8227);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C7457c(C7454r rVar) {
            this.f18542a = rVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.AbstractC7430b.AbstractC7431a
        /* renamed from: a */
        public final void mo13654a(Room room) {
            AbstractC7430b.AbstractC7431a aVar = this.f18542a.f18537g;
            if (aVar != null) {
                aVar.mo13654a(room);
            }
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.AbstractC7430b.AbstractC7431a
        /* renamed from: a */
        public final void mo13653a(int i, String str) {
            AbstractC7430b.AbstractC7431a aVar = this.f18542a.f18537g;
            if (aVar != null) {
                aVar.mo13653a(i, str);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.r$d */
    public static final class C7458d implements C7435f.AbstractC7436a {

        /* renamed from: a */
        final /* synthetic */ C7454r f18543a;

        static {
            Covode.recordClassIndex(8228);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7458d(C7454r rVar) {
            this.f18543a = rVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.C7435f.AbstractC7436a
        /* renamed from: a */
        public final void mo13658a(C7685e eVar) {
            C89219l.m154721d(eVar, "");
            C7435f.AbstractC7436a aVar = this.f18543a.f18538h;
            if (aVar != null) {
                aVar.mo13658a(eVar);
            }
            C7454r rVar = this.f18543a;
            rVar.f18540j = rVar.f18531a;
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.C7435f.AbstractC7436a
        /* renamed from: a */
        public final void mo13657a(int i, String str, String str2) {
            C7435f.AbstractC7436a aVar = this.f18543a.f18538h;
            if (aVar != null) {
                aVar.mo13657a(i, str, str2);
            }
            C7454r rVar = this.f18543a;
            rVar.f18540j = rVar.f18532b;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.r$e */
    public static final class C7459e implements AbstractC7430b.AbstractC7431a {

        /* renamed from: a */
        final /* synthetic */ C7454r f18544a;

        static {
            Covode.recordClassIndex(8229);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7459e(C7454r rVar) {
            this.f18544a = rVar;
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.AbstractC7430b.AbstractC7431a
        /* renamed from: a */
        public final void mo13654a(Room room) {
            AbstractC7430b.AbstractC7431a aVar = this.f18544a.f18537g;
            if (aVar != null) {
                aVar.mo13654a(room);
            }
            C7454r rVar = this.f18544a;
            rVar.f18539i = rVar.f18531a;
        }

        @Override // com.bytedance.android.livesdk.chatroom.detail.AbstractC7430b.AbstractC7431a
        /* renamed from: a */
        public final void mo13653a(int i, String str) {
            AbstractC7430b.AbstractC7431a aVar = this.f18544a.f18537g;
            if (aVar != null) {
                aVar.mo13653a(i, str);
            }
            C7454r rVar = this.f18544a;
            rVar.f18539i = rVar.f18532b;
        }
    }

    /* renamed from: a */
    public final boolean mo13690a(long j) {
        boolean z;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig enterRoomConfig = this.f18534d;
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.f28233c) == null || roomsData.f28301R != j) {
            z = false;
        } else {
            z = true;
        }
        this.f18534d = null;
        return z;
    }

    /* renamed from: a */
    public final void mo13688a(C7435f.AbstractC7436a aVar) {
        C7435f.C7437b bVar;
        String str;
        C7435f.C7437b bVar2;
        C7435f.C7437b bVar3;
        C89219l.m154721d(aVar, "");
        this.f18538h = aVar;
        int i = this.f18540j;
        String str2 = null;
        C7685e eVar = null;
        str2 = null;
        if (i == this.f18531a) {
            if (aVar != null) {
                C7435f fVar = this.f18535e;
                if (fVar != null) {
                    eVar = fVar.f18441f;
                }
                aVar.mo13658a(eVar);
            }
            this.f18540j = this.f18533c;
        } else if (i == this.f18532b) {
            C7435f fVar2 = this.f18535e;
            if (!(fVar2 == null || (bVar = fVar2.f18436a) == null)) {
                int i2 = bVar.f18451a;
                C7435f.AbstractC7436a aVar2 = this.f18538h;
                if (aVar2 != null) {
                    C7435f fVar3 = this.f18535e;
                    if (fVar3 == null || (bVar3 = fVar3.f18436a) == null) {
                        str = null;
                    } else {
                        str = bVar3.f18452b;
                    }
                    C7435f fVar4 = this.f18535e;
                    if (!(fVar4 == null || (bVar2 = fVar4.f18436a) == null)) {
                        str2 = bVar2.f18453c;
                    }
                    aVar2.mo13657a(i2, str, str2);
                }
            }
            this.f18540j = this.f18533c;
        }
    }

    /* renamed from: b */
    public final void mo13691b(EnterRoomConfig enterRoomConfig) {
        String str = "";
        C89219l.m154721d(enterRoomConfig, str);
        this.f18534d = enterRoomConfig;
        if (!TextUtils.isEmpty(enterRoomConfig.f28233c.f28309Z)) {
            str = enterRoomConfig.f28233c.f28309Z;
        } else if (!TextUtils.isEmpty(enterRoomConfig.f28233c.f28293J)) {
            if (TextUtils.isEmpty(enterRoomConfig.f28233c.f28295L)) {
                str = enterRoomConfig.f28233c.f28293J;
            } else {
                str = enterRoomConfig.f28233c.f28293J + "-" + enterRoomConfig.f28233c.f28295L;
            }
        }
        C7435f fVar = new C7435f(new C7458d(this), enterRoomConfig.f28233c.f28301R, enterRoomConfig.f28232b.f28257a, enterRoomConfig.f28233c.f28321ab, enterRoomConfig.f28233c.f28370z, enterRoomConfig.f28233c.f28307X, str, enterRoomConfig.f28232b.f28262f);
        this.f18535e = fVar;
        fVar.mo13655a();
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11322c
    /* renamed from: a */
    public final void mo13689a(EnterRoomConfig enterRoomConfig) {
        C89219l.m154721d(enterRoomConfig, "");
        if (LivePrefetchRoomInfoSetting.INSTANCE.getValue() == 1 && (enterRoomConfig.f28231a.f28386m || (TextUtils.isEmpty(enterRoomConfig.f28231a.f28377d) && TextUtils.isEmpty(enterRoomConfig.f28231a.f28375b)))) {
            mo13687a();
            if (!TextUtils.isEmpty(enterRoomConfig.f28233c.f28287D) && (!C89219l.m154714a((Object) enterRoomConfig.f28233c.f28287D, (Object) "0"))) {
                enterRoomConfig.f28233c.f28347c = true;
                this.f18534d = enterRoomConfig;
                String str = enterRoomConfig.f28233c.f28287D;
                if (str == null) {
                    C89219l.m154715b();
                }
                C7466y yVar = new C7466y(new C7459e(this), Long.parseLong(str), enterRoomConfig.f28233c.f28348d);
                this.f18536f = yVar;
                yVar.mo13649a();
            } else if (enterRoomConfig.f28233c.f28301R > 0) {
                mo13691b(enterRoomConfig);
            }
        } else if (LivePrefetchRoomInfoEveryTimeSetting.INSTANCE.getValue() == 1) {
            mo13687a();
            if (enterRoomConfig.f28233c.f28301R > 0) {
                mo13691b(enterRoomConfig);
            }
        }
    }
}
